package org.bouncycastle.oer;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Sequence;

public abstract class SwitchIndexer {
  public abstract ASN1Encodable get(int paramInt);
  
  public static class Asn1EncodableVectorIndexer extends SwitchIndexer {
    private final ASN1EncodableVector asn1EncodableVector;
    
    public Asn1EncodableVectorIndexer(ASN1EncodableVector param1ASN1EncodableVector) {
      this.asn1EncodableVector = param1ASN1EncodableVector;
    }
    
    public ASN1Encodable get(int param1Int) {
      return this.asn1EncodableVector.get(param1Int);
    }
  }
  
  public static class Asn1SequenceIndexer extends SwitchIndexer {
    private final ASN1Sequence sequence;
    
    public Asn1SequenceIndexer(ASN1Sequence param1ASN1Sequence) {
      this.sequence = param1ASN1Sequence;
    }
    
    public ASN1Encodable get(int param1Int) {
      return this.sequence.getObjectAt(param1Int);
    }
  }
  
  public static class FixedValueIndexer extends SwitchIndexer {
    private final ASN1Encodable returnValue;
    
    public FixedValueIndexer(ASN1Encodable param1ASN1Encodable) {
      this.returnValue = param1ASN1Encodable;
    }
    
    public ASN1Encodable get(int param1Int) {
      return this.returnValue;
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\SwitchIndexer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */