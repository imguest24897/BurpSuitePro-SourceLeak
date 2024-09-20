package META-INF.versions.9.org.bouncycastle.pqc.asn1;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.pqc.asn1.CMCEPublicKey;
import org.bouncycastle.util.Arrays;

public class CMCEPrivateKey extends ASN1Object {
  private int version;
  
  private byte[] delta;
  
  private byte[] C;
  
  private byte[] g;
  
  private byte[] alpha;
  
  private byte[] s;
  
  private CMCEPublicKey PublicKey;
  
  public CMCEPrivateKey(int paramInt, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, byte[] paramArrayOfbyte4, byte[] paramArrayOfbyte5) {
    this(paramInt, paramArrayOfbyte1, paramArrayOfbyte2, paramArrayOfbyte3, paramArrayOfbyte4, paramArrayOfbyte5, null);
  }
  
  public CMCEPrivateKey(int paramInt, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, byte[] paramArrayOfbyte4, byte[] paramArrayOfbyte5, CMCEPublicKey paramCMCEPublicKey) {
    this.version = paramInt;
    if (paramInt != 0)
      throw new IllegalArgumentException("unrecognized version"); 
    this.delta = Arrays.clone(paramArrayOfbyte1);
    this.C = Arrays.clone(paramArrayOfbyte2);
    this.g = Arrays.clone(paramArrayOfbyte3);
    this.alpha = Arrays.clone(paramArrayOfbyte4);
    this.s = Arrays.clone(paramArrayOfbyte5);
    this.PublicKey = paramCMCEPublicKey;
  }
  
  private CMCEPrivateKey(ASN1Sequence paramASN1Sequence) {
    this.version = ASN1Integer.getInstance(paramASN1Sequence.getObjectAt(0)).intValueExact();
    if (this.version != 0)
      throw new IllegalArgumentException("unrecognized version"); 
    this.delta = Arrays.clone(ASN1OctetString.getInstance(paramASN1Sequence.getObjectAt(1)).getOctets());
    this.C = Arrays.clone(ASN1OctetString.getInstance(paramASN1Sequence.getObjectAt(2)).getOctets());
    this.g = Arrays.clone(ASN1OctetString.getInstance(paramASN1Sequence.getObjectAt(3)).getOctets());
    this.alpha = Arrays.clone(ASN1OctetString.getInstance(paramASN1Sequence.getObjectAt(4)).getOctets());
    this.s = Arrays.clone(ASN1OctetString.getInstance(paramASN1Sequence.getObjectAt(5)).getOctets());
    if (paramASN1Sequence.size() == 7)
      this.PublicKey = CMCEPublicKey.getInstance(paramASN1Sequence.getObjectAt(6)); 
  }
  
  public int getVersion() {
    return this.version;
  }
  
  public byte[] getDelta() {
    return Arrays.clone(this.delta);
  }
  
  public byte[] getC() {
    return Arrays.clone(this.C);
  }
  
  public byte[] getG() {
    return Arrays.clone(this.g);
  }
  
  public byte[] getAlpha() {
    return Arrays.clone(this.alpha);
  }
  
  public byte[] getS() {
    return Arrays.clone(this.s);
  }
  
  public CMCEPublicKey getPublicKey() {
    return this.PublicKey;
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
    aSN1EncodableVector.add((ASN1Encodable)new ASN1Integer(this.version));
    aSN1EncodableVector.add((ASN1Encodable)new DEROctetString(this.delta));
    aSN1EncodableVector.add((ASN1Encodable)new DEROctetString(this.C));
    aSN1EncodableVector.add((ASN1Encodable)new DEROctetString(this.g));
    aSN1EncodableVector.add((ASN1Encodable)new DEROctetString(this.alpha));
    aSN1EncodableVector.add((ASN1Encodable)new DEROctetString(this.s));
    if (this.PublicKey != null)
      aSN1EncodableVector.add((ASN1Encodable)new CMCEPublicKey(this.PublicKey.getT())); 
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
  
  public static org.bouncycastle.pqc.asn1.CMCEPrivateKey getInstance(Object paramObject) {
    return (paramObject instanceof org.bouncycastle.pqc.asn1.CMCEPrivateKey) ? (org.bouncycastle.pqc.asn1.CMCEPrivateKey)paramObject : ((paramObject != null) ? new org.bouncycastle.pqc.asn1.CMCEPrivateKey(ASN1Sequence.getInstance(paramObject)) : null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\asn1\CMCEPrivateKey.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */