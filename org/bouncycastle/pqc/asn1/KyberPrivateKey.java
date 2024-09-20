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

public class KyberPrivateKey extends ASN1Object {
  private int version;
  
  private byte[] s;
  
  private KyberPublicKey publicKey;
  
  private byte[] hpk;
  
  private byte[] nonce;
  
  public KyberPrivateKey(int paramInt, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, KyberPublicKey paramKyberPublicKey) {
    this.version = paramInt;
    this.s = paramArrayOfbyte1;
    this.publicKey = paramKyberPublicKey;
    this.hpk = paramArrayOfbyte2;
    this.nonce = paramArrayOfbyte3;
  }
  
  public KyberPrivateKey(int paramInt, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    this(paramInt, paramArrayOfbyte1, paramArrayOfbyte2, paramArrayOfbyte3, null);
  }
  
  public int getVersion() {
    return this.version;
  }
  
  public byte[] getS() {
    return Arrays.clone(this.s);
  }
  
  public KyberPublicKey getPublicKey() {
    return this.publicKey;
  }
  
  public byte[] getHpk() {
    return Arrays.clone(this.hpk);
  }
  
  public byte[] getNonce() {
    return Arrays.clone(this.nonce);
  }
  
  private KyberPrivateKey(ASN1Sequence paramASN1Sequence) {
    this.version = ASN1Integer.getInstance(paramASN1Sequence.getObjectAt(0)).intValueExact();
    if (this.version != 0)
      throw new IllegalArgumentException("unrecognized version"); 
    this.s = Arrays.clone(ASN1OctetString.getInstance(paramASN1Sequence.getObjectAt(1)).getOctets());
    byte b = 1;
    if (paramASN1Sequence.size() == 5) {
      b = 0;
      this.publicKey = KyberPublicKey.getInstance(paramASN1Sequence.getObjectAt(2));
    } 
    this.hpk = Arrays.clone(ASN1OctetString.getInstance(paramASN1Sequence.getObjectAt(3 - b)).getOctets());
    this.nonce = Arrays.clone(ASN1OctetString.getInstance(paramASN1Sequence.getObjectAt(4 - b)).getOctets());
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
    aSN1EncodableVector.add((ASN1Encodable)new ASN1Integer(this.version));
    aSN1EncodableVector.add((ASN1Encodable)new DEROctetString(this.s));
    if (this.publicKey != null)
      aSN1EncodableVector.add((ASN1Encodable)new KyberPublicKey(this.publicKey.getT(), this.publicKey.getRho())); 
    aSN1EncodableVector.add((ASN1Encodable)new DEROctetString(this.hpk));
    aSN1EncodableVector.add((ASN1Encodable)new DEROctetString(this.nonce));
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
  
  public static KyberPrivateKey getInstance(Object paramObject) {
    return (paramObject instanceof KyberPrivateKey) ? (KyberPrivateKey)paramObject : ((paramObject != null) ? new KyberPrivateKey(ASN1Sequence.getInstance(paramObject)) : null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\asn1\KyberPrivateKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */