package META-INF.versions.9.org.bouncycastle.asn1;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERSet;

class DERFactory {
  static final DERSequence EMPTY_SEQUENCE = new DERSequence();
  
  static final DERSet EMPTY_SET = new DERSet();
  
  static DERSequence createSequence(ASN1EncodableVector paramASN1EncodableVector) {
    return (paramASN1EncodableVector.size() < 1) ? EMPTY_SEQUENCE : new DERSequence(paramASN1EncodableVector);
  }
  
  static DERSet createSet(ASN1EncodableVector paramASN1EncodableVector) {
    return (paramASN1EncodableVector.size() < 1) ? EMPTY_SET : new DERSet(paramASN1EncodableVector);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\asn1\DERFactory.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */