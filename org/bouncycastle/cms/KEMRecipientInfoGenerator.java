package org.bouncycastle.cms;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;
import org.bouncycastle.asn1.cms.IssuerAndSerialNumber;
import org.bouncycastle.asn1.cms.KEMRecipientInfo;
import org.bouncycastle.asn1.cms.OtherRecipientInfo;
import org.bouncycastle.asn1.cms.RecipientIdentifier;
import org.bouncycastle.asn1.cms.RecipientInfo;
import org.bouncycastle.operator.GenericKey;
import org.bouncycastle.operator.OperatorException;

public abstract class KEMRecipientInfoGenerator implements RecipientInfoGenerator {
  protected final KEMKeyWrapper wrapper;
  
  private IssuerAndSerialNumber issuerAndSerial;
  
  private byte[] subjectKeyIdentifier;
  
  protected KEMRecipientInfoGenerator(IssuerAndSerialNumber paramIssuerAndSerialNumber, KEMKeyWrapper paramKEMKeyWrapper) {
    this.issuerAndSerial = paramIssuerAndSerialNumber;
    this.wrapper = paramKEMKeyWrapper;
  }
  
  protected KEMRecipientInfoGenerator(byte[] paramArrayOfbyte, KEMKeyWrapper paramKEMKeyWrapper) {
    this.subjectKeyIdentifier = paramArrayOfbyte;
    this.wrapper = paramKEMKeyWrapper;
  }
  
  public final RecipientInfo generate(GenericKey paramGenericKey) throws CMSException {
    byte[] arrayOfByte;
    RecipientIdentifier recipientIdentifier;
    try {
      arrayOfByte = this.wrapper.generateWrappedKey(paramGenericKey);
    } catch (OperatorException operatorException) {
      throw new CMSException("exception wrapping content key: " + operatorException.getMessage(), operatorException);
    } 
    if (this.issuerAndSerial != null) {
      recipientIdentifier = new RecipientIdentifier(this.issuerAndSerial);
    } else {
      recipientIdentifier = new RecipientIdentifier((ASN1OctetString)new DEROctetString(this.subjectKeyIdentifier));
    } 
    return new RecipientInfo(new OtherRecipientInfo(CMSObjectIdentifiers.id_ori_kem, (ASN1Encodable)new KEMRecipientInfo(recipientIdentifier, this.wrapper.getAlgorithmIdentifier(), (ASN1OctetString)new DEROctetString(this.wrapper.getEncapsulation()), this.wrapper.getKdfAlgorithmIdentifier(), new ASN1Integer(this.wrapper.getKekLength()), null, this.wrapper.getWrapAlgorithmIdentifier(), (ASN1OctetString)new DEROctetString(arrayOfByte))));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cms\KEMRecipientInfoGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */