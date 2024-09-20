package org.bouncycastle.oer.its.ieee1609dot2;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.oer.its.ItsUtils;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.HashAlgorithm;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Signature;

public class SignedData extends ASN1Object {
  private final HashAlgorithm hashId;
  
  private final ToBeSignedData tbsData;
  
  private final SignerIdentifier signer;
  
  private final Signature signature;
  
  public SignedData(HashAlgorithm paramHashAlgorithm, ToBeSignedData paramToBeSignedData, SignerIdentifier paramSignerIdentifier, Signature paramSignature) {
    this.hashId = paramHashAlgorithm;
    this.tbsData = paramToBeSignedData;
    this.signer = paramSignerIdentifier;
    this.signature = paramSignature;
  }
  
  private SignedData(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 4)
      throw new IllegalArgumentException("expected sequence size of 4"); 
    this.hashId = HashAlgorithm.getInstance(paramASN1Sequence.getObjectAt(0));
    this.tbsData = ToBeSignedData.getInstance(paramASN1Sequence.getObjectAt(1));
    this.signer = SignerIdentifier.getInstance(paramASN1Sequence.getObjectAt(2));
    this.signature = Signature.getInstance(paramASN1Sequence.getObjectAt(3));
  }
  
  public static SignedData getInstance(Object paramObject) {
    return (paramObject instanceof SignedData) ? (SignedData)paramObject : ((paramObject != null) ? new SignedData(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)ItsUtils.toSequence(new ASN1Encodable[] { (ASN1Encodable)this.hashId, (ASN1Encodable)this.tbsData, (ASN1Encodable)this.signer, (ASN1Encodable)this.signature });
  }
  
  public HashAlgorithm getHashId() {
    return this.hashId;
  }
  
  public ToBeSignedData getTbsData() {
    return this.tbsData;
  }
  
  public SignerIdentifier getSigner() {
    return this.signer;
  }
  
  public Signature getSignature() {
    return this.signature;
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public static class Builder {
    private HashAlgorithm hashId;
    
    private ToBeSignedData tbsData;
    
    private SignerIdentifier signer;
    
    private Signature signature;
    
    public Builder setHashId(HashAlgorithm param1HashAlgorithm) {
      this.hashId = param1HashAlgorithm;
      return this;
    }
    
    public Builder setTbsData(ToBeSignedData param1ToBeSignedData) {
      this.tbsData = param1ToBeSignedData;
      return this;
    }
    
    public Builder setSigner(SignerIdentifier param1SignerIdentifier) {
      this.signer = param1SignerIdentifier;
      return this;
    }
    
    public Builder setSignature(Signature param1Signature) {
      this.signature = param1Signature;
      return this;
    }
    
    public SignedData createSignedData() {
      return new SignedData(this.hashId, this.tbsData, this.signer, this.signature);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\SignedData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */