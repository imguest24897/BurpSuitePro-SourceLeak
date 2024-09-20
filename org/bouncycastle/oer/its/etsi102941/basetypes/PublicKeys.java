package org.bouncycastle.oer.its.etsi102941.basetypes;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.oer.OEROptional;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.PublicEncryptionKey;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.PublicVerificationKey;

public class PublicKeys extends ASN1Object {
  private final PublicVerificationKey verificationKey;
  
  private final PublicEncryptionKey encryptionKey;
  
  public PublicKeys(PublicVerificationKey paramPublicVerificationKey, PublicEncryptionKey paramPublicEncryptionKey) {
    this.verificationKey = paramPublicVerificationKey;
    this.encryptionKey = paramPublicEncryptionKey;
  }
  
  public static PublicKeys getInstance(Object paramObject) {
    return (paramObject instanceof PublicKeys) ? (PublicKeys)paramObject : ((paramObject != null) ? new PublicKeys(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  private PublicKeys(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 2)
      throw new IllegalArgumentException("expected sequence size of 2"); 
    this.verificationKey = PublicVerificationKey.getInstance(paramASN1Sequence.getObjectAt(0));
    this.encryptionKey = (PublicEncryptionKey)OEROptional.getValue(PublicEncryptionKey.class, paramASN1Sequence.getObjectAt(1));
  }
  
  public PublicVerificationKey getVerificationKey() {
    return this.verificationKey;
  }
  
  public PublicEncryptionKey getEncryptionKey() {
    return this.encryptionKey;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERSequence(new ASN1Encodable[] { (ASN1Encodable)this.verificationKey, (ASN1Encodable)OEROptional.getInstance(this.encryptionKey) });
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\etsi102941\basetypes\PublicKeys.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */