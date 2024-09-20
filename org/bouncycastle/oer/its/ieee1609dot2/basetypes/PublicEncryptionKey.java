package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.oer.its.ItsUtils;

public class PublicEncryptionKey extends ASN1Object {
  private final SymmAlgorithm supportedSymmAlg;
  
  private final BasePublicEncryptionKey publicKey;
  
  public PublicEncryptionKey(SymmAlgorithm paramSymmAlgorithm, BasePublicEncryptionKey paramBasePublicEncryptionKey) {
    this.supportedSymmAlg = paramSymmAlgorithm;
    this.publicKey = paramBasePublicEncryptionKey;
  }
  
  private PublicEncryptionKey(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 2)
      throw new IllegalArgumentException("expected sequence size of 2"); 
    this.supportedSymmAlg = SymmAlgorithm.getInstance(paramASN1Sequence.getObjectAt(0));
    this.publicKey = BasePublicEncryptionKey.getInstance(paramASN1Sequence.getObjectAt(1));
  }
  
  public static PublicEncryptionKey getInstance(Object paramObject) {
    return (paramObject instanceof PublicEncryptionKey) ? (PublicEncryptionKey)paramObject : ((paramObject != null) ? new PublicEncryptionKey(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public SymmAlgorithm getSupportedSymmAlg() {
    return this.supportedSymmAlg;
  }
  
  public BasePublicEncryptionKey getPublicKey() {
    return this.publicKey;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)ItsUtils.toSequence(new ASN1Encodable[] { (ASN1Encodable)this.supportedSymmAlg, (ASN1Encodable)this.publicKey });
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public static class Builder {
    private SymmAlgorithm supportedSymmAlg;
    
    private BasePublicEncryptionKey publicKey;
    
    public Builder setSupportedSymmAlg(SymmAlgorithm param1SymmAlgorithm) {
      this.supportedSymmAlg = param1SymmAlgorithm;
      return this;
    }
    
    public Builder setPublicKey(BasePublicEncryptionKey param1BasePublicEncryptionKey) {
      this.publicKey = param1BasePublicEncryptionKey;
      return this;
    }
    
    public PublicEncryptionKey createPublicEncryptionKey() {
      return new PublicEncryptionKey(this.supportedSymmAlg, this.publicKey);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\PublicEncryptionKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */