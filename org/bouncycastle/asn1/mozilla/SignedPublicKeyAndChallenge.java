package org.bouncycastle.asn1.mozilla;

import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public class SignedPublicKeyAndChallenge extends ASN1Object {
  private final PublicKeyAndChallenge pubKeyAndChal;
  
  private final ASN1Sequence pkacSeq;
  
  public static SignedPublicKeyAndChallenge getInstance(Object paramObject) {
    return (paramObject instanceof SignedPublicKeyAndChallenge) ? (SignedPublicKeyAndChallenge)paramObject : ((paramObject != null) ? new SignedPublicKeyAndChallenge(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  private SignedPublicKeyAndChallenge(ASN1Sequence paramASN1Sequence) {
    this.pkacSeq = paramASN1Sequence;
    this.pubKeyAndChal = PublicKeyAndChallenge.getInstance(paramASN1Sequence.getObjectAt(0));
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)this.pkacSeq;
  }
  
  public PublicKeyAndChallenge getPublicKeyAndChallenge() {
    return this.pubKeyAndChal;
  }
  
  public AlgorithmIdentifier getSignatureAlgorithm() {
    return AlgorithmIdentifier.getInstance(this.pkacSeq.getObjectAt(1));
  }
  
  public ASN1BitString getSignature() {
    return ASN1BitString.getInstance(this.pkacSeq.getObjectAt(2));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\mozilla\SignedPublicKeyAndChallenge.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */