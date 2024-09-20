package org.bouncycastle.pqc.asn1;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Arrays;

public class SABERPrivateKey extends ASN1Object {
  private int version;
  
  private byte[] z;
  
  private byte[] s;
  
  private byte[] hpk;
  
  private SABERPublicKey PublicKey;
  
  public SABERPrivateKey(int paramInt, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    this.version = paramInt;
    if (paramInt != 0)
      throw new IllegalArgumentException("unrecognized version"); 
    this.z = paramArrayOfbyte1;
    this.s = paramArrayOfbyte2;
    this.hpk = paramArrayOfbyte3;
  }
  
  public SABERPrivateKey(int paramInt, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, SABERPublicKey paramSABERPublicKey) {
    this.version = paramInt;
    if (paramInt != 0)
      throw new IllegalArgumentException("unrecognized version"); 
    this.z = paramArrayOfbyte1;
    this.s = paramArrayOfbyte2;
    this.hpk = paramArrayOfbyte3;
    this.PublicKey = paramSABERPublicKey;
  }
  
  private SABERPrivateKey(ASN1Sequence paramASN1Sequence) {
    this.version = ASN1Integer.getInstance(paramASN1Sequence.getObjectAt(0)).intValueExact();
    if (this.version != 0)
      throw new IllegalArgumentException("unrecognized version"); 
    this.z = Arrays.clone(ASN1OctetString.getInstance(paramASN1Sequence.getObjectAt(1)).getOctets());
    this.s = Arrays.clone(ASN1OctetString.getInstance(paramASN1Sequence.getObjectAt(2)).getOctets());
    this.PublicKey = SABERPublicKey.getInstance(paramASN1Sequence.getObjectAt(3));
    this.hpk = Arrays.clone(ASN1OctetString.getInstance(paramASN1Sequence.getObjectAt(4)).getOctets());
  }
  
  public int getVersion() {
    return this.version;
  }
  
  public byte[] getZ() {
    return this.z;
  }
  
  public byte[] getS() {
    return this.s;
  }
  
  public byte[] getHpk() {
    return this.hpk;
  }
  
  public SABERPublicKey getPublicKey() {
    return this.PublicKey;
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
    aSN1EncodableVector.add((ASN1Encodable)new ASN1Integer(this.version));
    aSN1EncodableVector.add((ASN1Encodable)new DEROctetString(this.z));
    aSN1EncodableVector.add((ASN1Encodable)new DEROctetString(this.s));
    aSN1EncodableVector.add((ASN1Encodable)new DEROctetString(this.hpk));
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
  
  public static SABERPrivateKey getInstance(Object paramObject) {
    return (paramObject instanceof SABERPrivateKey) ? (SABERPrivateKey)paramObject : ((paramObject != null) ? new SABERPrivateKey(ASN1Sequence.getInstance(paramObject)) : null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\asn1\SABERPrivateKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */