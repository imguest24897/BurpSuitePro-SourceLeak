package org.bouncycastle.asn1.mozilla;

import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

public class PublicKeyAndChallenge extends ASN1Object {
  private ASN1Sequence pkacSeq;
  
  private SubjectPublicKeyInfo spki;
  
  private ASN1IA5String challenge;
  
  public static PublicKeyAndChallenge getInstance(Object paramObject) {
    return (paramObject instanceof PublicKeyAndChallenge) ? (PublicKeyAndChallenge)paramObject : ((paramObject != null) ? new PublicKeyAndChallenge(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  private PublicKeyAndChallenge(ASN1Sequence paramASN1Sequence) {
    this.pkacSeq = paramASN1Sequence;
    this.spki = SubjectPublicKeyInfo.getInstance(paramASN1Sequence.getObjectAt(0));
    this.challenge = ASN1IA5String.getInstance(paramASN1Sequence.getObjectAt(1));
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)this.pkacSeq;
  }
  
  public SubjectPublicKeyInfo getSubjectPublicKeyInfo() {
    return this.spki;
  }
  
  public DERIA5String getChallenge() {
    return (null == this.challenge || this.challenge instanceof DERIA5String) ? (DERIA5String)this.challenge : new DERIA5String(this.challenge.getString(), false);
  }
  
  public ASN1IA5String getChallengeIA5() {
    return this.challenge;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\mozilla\PublicKeyAndChallenge.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */