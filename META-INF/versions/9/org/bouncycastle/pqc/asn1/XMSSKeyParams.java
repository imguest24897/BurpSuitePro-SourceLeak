package META-INF.versions.9.org.bouncycastle.pqc.asn1;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public class XMSSKeyParams extends ASN1Object {
  private final ASN1Integer version = new ASN1Integer(0L);
  
  private final int height;
  
  private final AlgorithmIdentifier treeDigest;
  
  public XMSSKeyParams(int paramInt, AlgorithmIdentifier paramAlgorithmIdentifier) {
    this.height = paramInt;
    this.treeDigest = paramAlgorithmIdentifier;
  }
  
  private XMSSKeyParams(ASN1Sequence paramASN1Sequence) {
    this.height = ASN1Integer.getInstance(paramASN1Sequence.getObjectAt(1)).intValueExact();
    this.treeDigest = AlgorithmIdentifier.getInstance(paramASN1Sequence.getObjectAt(2));
  }
  
  public static org.bouncycastle.pqc.asn1.XMSSKeyParams getInstance(Object paramObject) {
    return (paramObject instanceof org.bouncycastle.pqc.asn1.XMSSKeyParams) ? (org.bouncycastle.pqc.asn1.XMSSKeyParams)paramObject : ((paramObject != null) ? new org.bouncycastle.pqc.asn1.XMSSKeyParams(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public int getHeight() {
    return this.height;
  }
  
  public AlgorithmIdentifier getTreeDigest() {
    return this.treeDigest;
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
    aSN1EncodableVector.add((ASN1Encodable)this.version);
    aSN1EncodableVector.add((ASN1Encodable)new ASN1Integer(this.height));
    aSN1EncodableVector.add((ASN1Encodable)this.treeDigest);
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\asn1\XMSSKeyParams.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */