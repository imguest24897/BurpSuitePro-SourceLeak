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

public class KyberPublicKey extends ASN1Object {
  private byte[] t;
  
  private byte[] rho;
  
  public KyberPublicKey(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    this.t = paramArrayOfbyte1;
    this.rho = paramArrayOfbyte2;
  }
  
  public KyberPublicKey(ASN1Sequence paramASN1Sequence) {
    this.t = Arrays.clone(ASN1OctetString.getInstance(paramASN1Sequence.getObjectAt(0)).getOctets());
    this.rho = Arrays.clone(ASN1OctetString.getInstance(paramASN1Sequence.getObjectAt(1)).getOctets());
  }
  
  public byte[] getT() {
    return Arrays.clone(this.t);
  }
  
  public byte[] getRho() {
    return Arrays.clone(this.rho);
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
    aSN1EncodableVector.add((ASN1Encodable)new DEROctetString(this.t));
    aSN1EncodableVector.add((ASN1Encodable)new DEROctetString(this.rho));
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
  
  public static KyberPublicKey getInstance(Object paramObject) {
    return (paramObject instanceof KyberPublicKey) ? (KyberPublicKey)paramObject : ((paramObject != null) ? new KyberPublicKey(ASN1Sequence.getInstance(paramObject)) : null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\asn1\KyberPublicKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */