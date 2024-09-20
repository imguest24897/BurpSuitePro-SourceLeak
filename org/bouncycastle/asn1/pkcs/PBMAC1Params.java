package org.bouncycastle.asn1.pkcs;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public class PBMAC1Params extends ASN1Object implements PKCSObjectIdentifiers {
  private AlgorithmIdentifier func;
  
  private AlgorithmIdentifier scheme;
  
  public static PBMAC1Params getInstance(Object paramObject) {
    return (paramObject instanceof PBMAC1Params) ? (PBMAC1Params)paramObject : ((paramObject != null) ? new PBMAC1Params(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public PBMAC1Params(AlgorithmIdentifier paramAlgorithmIdentifier1, AlgorithmIdentifier paramAlgorithmIdentifier2) {
    this.func = paramAlgorithmIdentifier1;
    this.scheme = paramAlgorithmIdentifier2;
  }
  
  private PBMAC1Params(ASN1Sequence paramASN1Sequence) {
    Enumeration<ASN1Encodable> enumeration = paramASN1Sequence.getObjects();
    ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(((ASN1Encodable)enumeration.nextElement()).toASN1Primitive());
    if (aSN1Sequence.getObjectAt(0).equals(id_PBKDF2)) {
      this.func = new AlgorithmIdentifier(id_PBKDF2, (ASN1Encodable)PBKDF2Params.getInstance(aSN1Sequence.getObjectAt(1)));
    } else {
      this.func = AlgorithmIdentifier.getInstance(aSN1Sequence);
    } 
    this.scheme = AlgorithmIdentifier.getInstance(enumeration.nextElement());
  }
  
  public AlgorithmIdentifier getKeyDerivationFunc() {
    return this.func;
  }
  
  public AlgorithmIdentifier getMessageAuthScheme() {
    return this.scheme;
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
    aSN1EncodableVector.add((ASN1Encodable)this.func);
    aSN1EncodableVector.add((ASN1Encodable)this.scheme);
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\pkcs\PBMAC1Params.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */