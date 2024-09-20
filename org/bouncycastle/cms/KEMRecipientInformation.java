package org.bouncycastle.cms;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.cms.IssuerAndSerialNumber;
import org.bouncycastle.asn1.cms.KEMRecipientInfo;
import org.bouncycastle.asn1.cms.RecipientIdentifier;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public class KEMRecipientInformation extends RecipientInformation {
  private KEMRecipientInfo info;
  
  KEMRecipientInformation(KEMRecipientInfo paramKEMRecipientInfo, AlgorithmIdentifier paramAlgorithmIdentifier, CMSSecureReadable paramCMSSecureReadable) {
    super(paramKEMRecipientInfo.getKem(), paramAlgorithmIdentifier, paramCMSSecureReadable);
    this.info = paramKEMRecipientInfo;
    RecipientIdentifier recipientIdentifier = paramKEMRecipientInfo.getRecipientIdentifier();
    if (recipientIdentifier.isTagged()) {
      ASN1OctetString aSN1OctetString = ASN1OctetString.getInstance(recipientIdentifier.getId());
      this.rid = new KeyTransRecipientId(aSN1OctetString.getOctets());
    } else {
      IssuerAndSerialNumber issuerAndSerialNumber = IssuerAndSerialNumber.getInstance(recipientIdentifier.getId());
      this.rid = new KeyTransRecipientId(issuerAndSerialNumber.getName(), issuerAndSerialNumber.getSerialNumber().getValue());
    } 
  }
  
  protected RecipientOperator getRecipientOperator(Recipient paramRecipient) throws CMSException {
    return ((KEMRecipient)paramRecipient).getRecipientOperator(new AlgorithmIdentifier(this.keyEncAlg.getAlgorithm(), (ASN1Encodable)this.info), this.messageAlgorithm, this.info.getEncryptedKey().getOctets());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cms\KEMRecipientInformation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */