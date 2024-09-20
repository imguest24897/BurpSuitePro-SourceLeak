package META-INF.versions.9.org.bouncycastle.asn1.cryptopro;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.internal.asn1.rosstandart.RosstandartObjectIdentifiers;

public class GOST3410PublicKeyAlgParameters extends ASN1Object {
  private ASN1ObjectIdentifier publicKeyParamSet;
  
  private ASN1ObjectIdentifier digestParamSet;
  
  private ASN1ObjectIdentifier encryptionParamSet;
  
  public static org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters getInstance(ASN1TaggedObject paramASN1TaggedObject, boolean paramBoolean) {
    return getInstance(ASN1Sequence.getInstance(paramASN1TaggedObject, paramBoolean));
  }
  
  public static org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters getInstance(Object paramObject) {
    return (paramObject instanceof org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters) ? (org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters)paramObject : ((paramObject != null) ? new org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public GOST3410PublicKeyAlgParameters(ASN1ObjectIdentifier paramASN1ObjectIdentifier1, ASN1ObjectIdentifier paramASN1ObjectIdentifier2) {
    this.publicKeyParamSet = paramASN1ObjectIdentifier1;
    this.digestParamSet = paramASN1ObjectIdentifier2;
    this.encryptionParamSet = null;
  }
  
  public GOST3410PublicKeyAlgParameters(ASN1ObjectIdentifier paramASN1ObjectIdentifier1, ASN1ObjectIdentifier paramASN1ObjectIdentifier2, ASN1ObjectIdentifier paramASN1ObjectIdentifier3) {
    this.publicKeyParamSet = paramASN1ObjectIdentifier1;
    this.digestParamSet = paramASN1ObjectIdentifier2;
    this.encryptionParamSet = paramASN1ObjectIdentifier3;
  }
  
  private GOST3410PublicKeyAlgParameters(ASN1Sequence paramASN1Sequence) {
    this.publicKeyParamSet = ASN1ObjectIdentifier.getInstance(paramASN1Sequence.getObjectAt(0));
    if (this.publicKeyParamSet.equals((ASN1Primitive)RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256_paramSetA)) {
      if (paramASN1Sequence.size() > 1)
        this.digestParamSet = ASN1ObjectIdentifier.getInstance(paramASN1Sequence.getObjectAt(1)); 
    } else if (this.publicKeyParamSet.equals((ASN1Primitive)RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256_paramSetB) || this.publicKeyParamSet.equals((ASN1Primitive)RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256_paramSetC) || this.publicKeyParamSet.equals((ASN1Primitive)RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256_paramSetD)) {
      if (paramASN1Sequence.size() > 1)
        throw new IllegalArgumentException("digestParamSet expected to be absent"); 
    } else if (paramASN1Sequence.size() > 1) {
      this.digestParamSet = ASN1ObjectIdentifier.getInstance(paramASN1Sequence.getObjectAt(1));
    } 
    if (paramASN1Sequence.size() > 2)
      this.encryptionParamSet = (ASN1ObjectIdentifier)paramASN1Sequence.getObjectAt(2); 
  }
  
  public ASN1ObjectIdentifier getPublicKeyParamSet() {
    return this.publicKeyParamSet;
  }
  
  public ASN1ObjectIdentifier getDigestParamSet() {
    return this.digestParamSet;
  }
  
  public ASN1ObjectIdentifier getEncryptionParamSet() {
    return this.encryptionParamSet;
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
    aSN1EncodableVector.add((ASN1Encodable)this.publicKeyParamSet);
    if (this.digestParamSet != null)
      aSN1EncodableVector.add((ASN1Encodable)this.digestParamSet); 
    if (this.encryptionParamSet != null)
      aSN1EncodableVector.add((ASN1Encodable)this.encryptionParamSet); 
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\asn1\cryptopro\GOST3410PublicKeyAlgParameters.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */