package org.bouncycastle.asn1;

class DLFactory {
  static final DLSequence EMPTY_SEQUENCE = new DLSequence();
  
  static final DLSet EMPTY_SET = new DLSet();
  
  static DLSequence createSequence(ASN1EncodableVector paramASN1EncodableVector) {
    return (paramASN1EncodableVector.size() < 1) ? EMPTY_SEQUENCE : new DLSequence(paramASN1EncodableVector);
  }
  
  static DLSet createSet(ASN1EncodableVector paramASN1EncodableVector) {
    return (paramASN1EncodableVector.size() < 1) ? EMPTY_SET : new DLSet(paramASN1EncodableVector);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\DLFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */