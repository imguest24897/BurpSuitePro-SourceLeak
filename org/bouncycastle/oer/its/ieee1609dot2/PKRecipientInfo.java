package org.bouncycastle.oer.its.ieee1609dot2;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.oer.its.ItsUtils;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.HashedId;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.HashedId8;

public class PKRecipientInfo extends ASN1Object {
  private final HashedId8 recipientId;
  
  private final EncryptedDataEncryptionKey encKey;
  
  public PKRecipientInfo(HashedId8 paramHashedId8, EncryptedDataEncryptionKey paramEncryptedDataEncryptionKey) {
    this.recipientId = paramHashedId8;
    this.encKey = paramEncryptedDataEncryptionKey;
  }
  
  private PKRecipientInfo(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 2)
      throw new IllegalArgumentException("expected sequence size of 2"); 
    this.recipientId = HashedId8.getInstance(paramASN1Sequence.getObjectAt(0));
    this.encKey = EncryptedDataEncryptionKey.getInstance(paramASN1Sequence.getObjectAt(1));
  }
  
  public static PKRecipientInfo getInstance(Object paramObject) {
    return (paramObject instanceof PKRecipientInfo) ? (PKRecipientInfo)paramObject : ((paramObject != null) ? new PKRecipientInfo(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public HashedId getRecipientId() {
    return (HashedId)this.recipientId;
  }
  
  public EncryptedDataEncryptionKey getEncKey() {
    return this.encKey;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)ItsUtils.toSequence(new ASN1Encodable[] { (ASN1Encodable)this.recipientId, (ASN1Encodable)this.encKey });
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public static class Builder {
    private HashedId8 recipientId;
    
    private EncryptedDataEncryptionKey encKey;
    
    public Builder setRecipientId(HashedId8 param1HashedId8) {
      this.recipientId = param1HashedId8;
      return this;
    }
    
    public Builder setEncKey(EncryptedDataEncryptionKey param1EncryptedDataEncryptionKey) {
      this.encKey = param1EncryptedDataEncryptionKey;
      return this;
    }
    
    public PKRecipientInfo createPKRecipientInfo() {
      return new PKRecipientInfo(this.recipientId, this.encKey);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\PKRecipientInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */