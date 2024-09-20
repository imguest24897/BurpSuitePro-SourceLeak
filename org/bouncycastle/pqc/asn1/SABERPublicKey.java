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

public class SABERPublicKey extends ASN1Object {
  private byte[] seed_A;
  
  private byte[] b;
  
  public SABERPublicKey(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    this.seed_A = paramArrayOfbyte1;
    this.b = paramArrayOfbyte2;
  }
  
  private SABERPublicKey(ASN1Sequence paramASN1Sequence) {
    this.seed_A = Arrays.clone(ASN1OctetString.getInstance(paramASN1Sequence.getObjectAt(0)).getOctets());
    this.b = Arrays.clone(ASN1OctetString.getInstance(paramASN1Sequence.getObjectAt(1)).getOctets());
  }
  
  public byte[] getSeed_A() {
    return this.seed_A;
  }
  
  public byte[] getB() {
    return this.b;
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
    aSN1EncodableVector.add((ASN1Encodable)new DEROctetString(this.seed_A));
    aSN1EncodableVector.add((ASN1Encodable)new DEROctetString(this.b));
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
  
  public static SABERPublicKey getInstance(Object paramObject) {
    return (paramObject instanceof SABERPublicKey) ? (SABERPublicKey)paramObject : ((paramObject != null) ? new SABERPublicKey(ASN1Sequence.getInstance(paramObject)) : null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\asn1\SABERPublicKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */