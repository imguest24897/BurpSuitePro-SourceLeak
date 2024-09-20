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
import org.bouncycastle.pqc.asn1.SPHINCSPLUSPublicKey;
import org.bouncycastle.util.Arrays;

public class SPHINCSPLUSPrivateKey extends ASN1Object {
  private int version;
  
  private byte[] skseed;
  
  private byte[] skprf;
  
  private SPHINCSPLUSPublicKey PublicKey;
  
  public int getVersion() {
    return this.version;
  }
  
  public byte[] getSkseed() {
    return Arrays.clone(this.skseed);
  }
  
  public byte[] getSkprf() {
    return Arrays.clone(this.skprf);
  }
  
  public SPHINCSPLUSPublicKey getPublicKey() {
    return this.PublicKey;
  }
  
  public SPHINCSPLUSPrivateKey(int paramInt, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    this(paramInt, paramArrayOfbyte1, paramArrayOfbyte2, null);
  }
  
  public SPHINCSPLUSPrivateKey(int paramInt, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, SPHINCSPLUSPublicKey paramSPHINCSPLUSPublicKey) {
    this.version = paramInt;
    this.skseed = paramArrayOfbyte1;
    this.skprf = paramArrayOfbyte2;
    this.PublicKey = paramSPHINCSPLUSPublicKey;
  }
  
  public SPHINCSPLUSPrivateKey(ASN1Sequence paramASN1Sequence) {
    this.version = ASN1Integer.getInstance(paramASN1Sequence.getObjectAt(0)).intValueExact();
    if (this.version != 0)
      throw new IllegalArgumentException("unrecognized version"); 
    this.skseed = Arrays.clone(ASN1OctetString.getInstance(paramASN1Sequence.getObjectAt(1)).getOctets());
    this.skprf = Arrays.clone(ASN1OctetString.getInstance(paramASN1Sequence.getObjectAt(2)).getOctets());
    if (paramASN1Sequence.size() == 4)
      this.PublicKey = SPHINCSPLUSPublicKey.getInstance(paramASN1Sequence.getObjectAt(3)); 
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
    aSN1EncodableVector.add((ASN1Encodable)new ASN1Integer(this.version));
    aSN1EncodableVector.add((ASN1Encodable)new DEROctetString(this.skseed));
    aSN1EncodableVector.add((ASN1Encodable)new DEROctetString(this.skprf));
    if (this.PublicKey != null)
      aSN1EncodableVector.add((ASN1Encodable)new SPHINCSPLUSPublicKey(this.PublicKey.getPkseed(), this.PublicKey.getPkroot())); 
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
  
  public static org.bouncycastle.pqc.asn1.SPHINCSPLUSPrivateKey getInstance(Object paramObject) {
    return (paramObject instanceof org.bouncycastle.pqc.asn1.SPHINCSPLUSPrivateKey) ? (org.bouncycastle.pqc.asn1.SPHINCSPLUSPrivateKey)paramObject : ((paramObject != null) ? new org.bouncycastle.pqc.asn1.SPHINCSPLUSPrivateKey(ASN1Sequence.getInstance(paramObject)) : null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\asn1\SPHINCSPLUSPrivateKey.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */