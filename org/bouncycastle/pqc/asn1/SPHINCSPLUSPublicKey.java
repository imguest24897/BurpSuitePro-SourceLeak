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

public class SPHINCSPLUSPublicKey extends ASN1Object {
  private byte[] pkseed;
  
  private byte[] pkroot;
  
  public SPHINCSPLUSPublicKey(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    this.pkseed = paramArrayOfbyte1;
    this.pkroot = paramArrayOfbyte2;
  }
  
  public SPHINCSPLUSPublicKey(ASN1Sequence paramASN1Sequence) {
    this.pkseed = Arrays.clone(ASN1OctetString.getInstance(paramASN1Sequence.getObjectAt(0)).getOctets());
    this.pkroot = Arrays.clone(ASN1OctetString.getInstance(paramASN1Sequence.getObjectAt(1)).getOctets());
  }
  
  public byte[] getPkseed() {
    return Arrays.clone(this.pkseed);
  }
  
  public byte[] getPkroot() {
    return Arrays.clone(this.pkroot);
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
    aSN1EncodableVector.add((ASN1Encodable)new DEROctetString(this.pkseed));
    aSN1EncodableVector.add((ASN1Encodable)new DEROctetString(this.pkroot));
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
  
  public static SPHINCSPLUSPublicKey getInstance(Object paramObject) {
    return (paramObject instanceof SPHINCSPLUSPublicKey) ? (SPHINCSPLUSPublicKey)paramObject : ((paramObject != null) ? new SPHINCSPLUSPublicKey(ASN1Sequence.getInstance(paramObject)) : null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\asn1\SPHINCSPLUSPublicKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */