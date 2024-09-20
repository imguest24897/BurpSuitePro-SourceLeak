package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public class CMSORIforKEMOtherInfo extends ASN1Object {
  private final AlgorithmIdentifier wrap;
  
  private final int kekLength;
  
  private final byte[] ukm;
  
  public CMSORIforKEMOtherInfo(AlgorithmIdentifier paramAlgorithmIdentifier, int paramInt) {
    this(paramAlgorithmIdentifier, paramInt, null);
  }
  
  public CMSORIforKEMOtherInfo(AlgorithmIdentifier paramAlgorithmIdentifier, int paramInt, byte[] paramArrayOfbyte) {
    this.wrap = paramAlgorithmIdentifier;
    this.kekLength = paramInt;
    this.ukm = paramArrayOfbyte;
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
    aSN1EncodableVector.add((ASN1Encodable)this.wrap);
    aSN1EncodableVector.add((ASN1Encodable)new ASN1Integer(this.kekLength));
    if (this.ukm != null)
      aSN1EncodableVector.add((ASN1Encodable)new DERTaggedObject(true, 0, (ASN1Encodable)new DEROctetString(this.ukm))); 
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\cms\CMSORIforKEMOtherInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */