package META-INF.versions.9.org.bouncycastle.asn1;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1External;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.DLFactory;
import org.bouncycastle.asn1.DLSequence;
import org.bouncycastle.asn1.DLTaggedObject;

public class DLExternal extends ASN1External {
  public DLExternal(ASN1EncodableVector paramASN1EncodableVector) {
    this(DLFactory.createSequence(paramASN1EncodableVector));
  }
  
  public DLExternal(DLSequence paramDLSequence) {
    super((ASN1Sequence)paramDLSequence);
  }
  
  public DLExternal(ASN1ObjectIdentifier paramASN1ObjectIdentifier, ASN1Integer paramASN1Integer, ASN1Primitive paramASN1Primitive, DERTaggedObject paramDERTaggedObject) {
    super(paramASN1ObjectIdentifier, paramASN1Integer, paramASN1Primitive, paramDERTaggedObject);
  }
  
  public DLExternal(ASN1ObjectIdentifier paramASN1ObjectIdentifier, ASN1Integer paramASN1Integer, ASN1Primitive paramASN1Primitive1, int paramInt, ASN1Primitive paramASN1Primitive2) {
    super(paramASN1ObjectIdentifier, paramASN1Integer, paramASN1Primitive1, paramInt, paramASN1Primitive2);
  }
  
  ASN1Sequence buildSequence() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(4);
    if (this.directReference != null)
      aSN1EncodableVector.add((ASN1Encodable)this.directReference); 
    if (this.indirectReference != null)
      aSN1EncodableVector.add((ASN1Encodable)this.indirectReference); 
    if (this.dataValueDescriptor != null)
      aSN1EncodableVector.add((ASN1Encodable)this.dataValueDescriptor.toDLObject()); 
    aSN1EncodableVector.add((ASN1Encodable)new DLTaggedObject((0 == this.encoding), this.encoding, (ASN1Encodable)this.externalContent));
    return (ASN1Sequence)new DLSequence(aSN1EncodableVector);
  }
  
  ASN1Primitive toDLObject() {
    return (ASN1Primitive)this;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\asn1\DLExternal.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */