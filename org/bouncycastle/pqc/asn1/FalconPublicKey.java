package org.bouncycastle.pqc.asn1;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Arrays;

public class FalconPublicKey extends ASN1Object {
  private byte[] h;
  
  public FalconPublicKey(byte[] paramArrayOfbyte) {
    this.h = paramArrayOfbyte;
  }
  
  public byte[] getH() {
    return this.h;
  }
  
  public FalconPublicKey(ASN1Sequence paramASN1Sequence) {
    this.h = Arrays.clone(ASN1OctetString.getInstance(paramASN1Sequence.getObjectAt(0)).getOctets());
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
    aSN1EncodableVector.add((ASN1Encodable)new DEROctetString(this.h));
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
  
  public static FalconPublicKey getInstance(Object paramObject) {
    return (paramObject instanceof FalconPublicKey) ? (FalconPublicKey)paramObject : ((paramObject != null) ? new FalconPublicKey(ASN1Sequence.getInstance(paramObject)) : null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\asn1\FalconPublicKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */