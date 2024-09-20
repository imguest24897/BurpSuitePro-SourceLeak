package org.bouncycastle.oer.its.ieee1609dot2;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.oer.its.ItsUtils;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.HashedId;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.HashedId8;

public class SymmRecipientInfo extends ASN1Object {
  private final HashedId8 recipientId;
  
  private final SymmetricCiphertext encKey;
  
  public SymmRecipientInfo(HashedId8 paramHashedId8, SymmetricCiphertext paramSymmetricCiphertext) {
    this.recipientId = paramHashedId8;
    this.encKey = paramSymmetricCiphertext;
  }
  
  private SymmRecipientInfo(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 2)
      throw new IllegalArgumentException("expected sequence size of 2"); 
    this.recipientId = HashedId8.getInstance(paramASN1Sequence.getObjectAt(0));
    this.encKey = SymmetricCiphertext.getInstance(paramASN1Sequence.getObjectAt(1));
  }
  
  public static SymmRecipientInfo getInstance(Object paramObject) {
    return (paramObject instanceof SymmRecipientInfo) ? (SymmRecipientInfo)paramObject : ((paramObject != null) ? new SymmRecipientInfo(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public HashedId getRecipientId() {
    return (HashedId)this.recipientId;
  }
  
  public SymmetricCiphertext getEncKey() {
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
    
    private SymmetricCiphertext encKey;
    
    public Builder setRecipientId(HashedId8 param1HashedId8) {
      this.recipientId = param1HashedId8;
      return this;
    }
    
    public Builder setEncKey(SymmetricCiphertext param1SymmetricCiphertext) {
      this.encKey = param1SymmetricCiphertext;
      return this;
    }
    
    public SymmRecipientInfo createSymmRecipientInfo() {
      return new SymmRecipientInfo(this.recipientId, this.encKey);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\SymmRecipientInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */