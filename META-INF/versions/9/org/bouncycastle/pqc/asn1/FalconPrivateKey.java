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
import org.bouncycastle.pqc.asn1.FalconPublicKey;
import org.bouncycastle.util.Arrays;

public class FalconPrivateKey extends ASN1Object {
  private int version;
  
  private byte[] f;
  
  private byte[] g;
  
  private byte[] F;
  
  private FalconPublicKey publicKey;
  
  public FalconPrivateKey(int paramInt, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, FalconPublicKey paramFalconPublicKey) {
    this.version = paramInt;
    this.f = paramArrayOfbyte1;
    this.g = paramArrayOfbyte2;
    this.F = paramArrayOfbyte3;
    this.publicKey = paramFalconPublicKey;
  }
  
  public FalconPrivateKey(int paramInt, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    this(paramInt, paramArrayOfbyte1, paramArrayOfbyte2, paramArrayOfbyte3, null);
  }
  
  public int getVersion() {
    return this.version;
  }
  
  public byte[] getf() {
    return Arrays.clone(this.f);
  }
  
  public byte[] getF() {
    return Arrays.clone(this.F);
  }
  
  public FalconPublicKey getPublicKey() {
    return this.publicKey;
  }
  
  public byte[] getG() {
    return Arrays.clone(this.g);
  }
  
  private FalconPrivateKey(ASN1Sequence paramASN1Sequence) {
    this.version = ASN1Integer.getInstance(paramASN1Sequence.getObjectAt(0)).intValueExact();
    if (this.version != 0)
      throw new IllegalArgumentException("unrecognized version"); 
    this.f = Arrays.clone(ASN1OctetString.getInstance(paramASN1Sequence.getObjectAt(1)).getOctets());
    this.g = Arrays.clone(ASN1OctetString.getInstance(paramASN1Sequence.getObjectAt(2)).getOctets());
    this.F = Arrays.clone(ASN1OctetString.getInstance(paramASN1Sequence.getObjectAt(3)).getOctets());
    if (paramASN1Sequence.size() == 5)
      this.publicKey = FalconPublicKey.getInstance(paramASN1Sequence.getObjectAt(4)); 
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
    aSN1EncodableVector.add((ASN1Encodable)new ASN1Integer(this.version));
    aSN1EncodableVector.add((ASN1Encodable)new DEROctetString(this.f));
    aSN1EncodableVector.add((ASN1Encodable)new DEROctetString(this.g));
    aSN1EncodableVector.add((ASN1Encodable)new DEROctetString(this.F));
    if (this.publicKey != null)
      aSN1EncodableVector.add((ASN1Encodable)new FalconPublicKey(this.publicKey.getH())); 
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
  
  public static org.bouncycastle.pqc.asn1.FalconPrivateKey getInstance(Object paramObject) {
    return (paramObject instanceof org.bouncycastle.pqc.asn1.FalconPrivateKey) ? (org.bouncycastle.pqc.asn1.FalconPrivateKey)paramObject : ((paramObject != null) ? new org.bouncycastle.pqc.asn1.FalconPrivateKey(ASN1Sequence.getInstance(paramObject)) : null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\asn1\FalconPrivateKey.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */