package org.bouncycastle.oer.its.ieee1609dot2dot1;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.PublicEncryptionKey;

public class ButterflyParamsOriginal extends ASN1Object {
  private final ButterflyExpansion signingExpansion;
  
  private final PublicEncryptionKey encryptionKey;
  
  private final ButterflyExpansion encryptionExpansion;
  
  public ButterflyParamsOriginal(ButterflyExpansion paramButterflyExpansion1, PublicEncryptionKey paramPublicEncryptionKey, ButterflyExpansion paramButterflyExpansion2) {
    this.signingExpansion = paramButterflyExpansion1;
    this.encryptionKey = paramPublicEncryptionKey;
    this.encryptionExpansion = paramButterflyExpansion2;
  }
  
  private ButterflyParamsOriginal(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 3)
      throw new IllegalArgumentException("expected sequence size of 3"); 
    this.signingExpansion = ButterflyExpansion.getInstance(paramASN1Sequence.getObjectAt(0));
    this.encryptionKey = PublicEncryptionKey.getInstance(paramASN1Sequence.getObjectAt(1));
    this.encryptionExpansion = ButterflyExpansion.getInstance(paramASN1Sequence.getObjectAt(2));
  }
  
  public static ButterflyParamsOriginal getInstance(Object paramObject) {
    return (paramObject instanceof ButterflyParamsOriginal) ? (ButterflyParamsOriginal)paramObject : ((paramObject != null) ? new ButterflyParamsOriginal(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERSequence(new ASN1Encodable[] { (ASN1Encodable)this.signingExpansion, (ASN1Encodable)this.encryptionKey, (ASN1Encodable)this.encryptionExpansion });
  }
  
  public ButterflyExpansion getSigningExpansion() {
    return this.signingExpansion;
  }
  
  public PublicEncryptionKey getEncryptionKey() {
    return this.encryptionKey;
  }
  
  public ButterflyExpansion getEncryptionExpansion() {
    return this.encryptionExpansion;
  }
  
  public static class Builder {
    private ButterflyExpansion signingExpansion;
    
    private PublicEncryptionKey encryptionKey;
    
    private ButterflyExpansion encryptionExpansion;
    
    public Builder setSigningExpansion(ButterflyExpansion param1ButterflyExpansion) {
      this.signingExpansion = param1ButterflyExpansion;
      return this;
    }
    
    public Builder setEncryptionKey(PublicEncryptionKey param1PublicEncryptionKey) {
      this.encryptionKey = param1PublicEncryptionKey;
      return this;
    }
    
    public Builder setEncryptionExpansion(ButterflyExpansion param1ButterflyExpansion) {
      this.encryptionExpansion = param1ButterflyExpansion;
      return this;
    }
    
    public ButterflyParamsOriginal createButterflyParamsOriginal() {
      return new ButterflyParamsOriginal(this.signingExpansion, this.encryptionKey, this.encryptionExpansion);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2dot1\ButterflyParamsOriginal.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */