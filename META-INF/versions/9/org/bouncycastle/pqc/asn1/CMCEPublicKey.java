package META-INF.versions.9.org.bouncycastle.pqc.asn1;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Arrays;

public class CMCEPublicKey extends ASN1Object {
  private byte[] T;
  
  public CMCEPublicKey(byte[] paramArrayOfbyte) {
    this.T = paramArrayOfbyte;
  }
  
  public CMCEPublicKey(ASN1Sequence paramASN1Sequence) {
    this.T = Arrays.clone(ASN1OctetString.getInstance(paramASN1Sequence.getObjectAt(0)).getOctets());
  }
  
  public byte[] getT() {
    return Arrays.clone(this.T);
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
    aSN1EncodableVector.add((ASN1Encodable)new DEROctetString(this.T));
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
  
  public static org.bouncycastle.pqc.asn1.CMCEPublicKey getInstance(Object paramObject) {
    return (paramObject instanceof org.bouncycastle.pqc.asn1.CMCEPublicKey) ? (org.bouncycastle.pqc.asn1.CMCEPublicKey)paramObject : ((paramObject != null) ? new org.bouncycastle.pqc.asn1.CMCEPublicKey(ASN1Sequence.getInstance(paramObject)) : null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\asn1\CMCEPublicKey.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */