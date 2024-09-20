package org.bouncycastle.asn1.tsp;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

public class ArchiveTimeStampSequence extends ASN1Object {
  private ASN1Sequence archiveTimeStampChains;
  
  public static ArchiveTimeStampSequence getInstance(Object paramObject) {
    return (paramObject instanceof ArchiveTimeStampSequence) ? (ArchiveTimeStampSequence)paramObject : ((paramObject != null) ? new ArchiveTimeStampSequence(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  private ArchiveTimeStampSequence(ASN1Sequence paramASN1Sequence) {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(paramASN1Sequence.size());
    Enumeration enumeration = paramASN1Sequence.getObjects();
    while (enumeration.hasMoreElements())
      aSN1EncodableVector.add((ASN1Encodable)ArchiveTimeStampChain.getInstance(enumeration.nextElement())); 
    this.archiveTimeStampChains = (ASN1Sequence)new DERSequence(aSN1EncodableVector);
  }
  
  public ArchiveTimeStampSequence(ArchiveTimeStampChain paramArchiveTimeStampChain) {
    this.archiveTimeStampChains = (ASN1Sequence)new DERSequence((ASN1Encodable)paramArchiveTimeStampChain);
  }
  
  public ArchiveTimeStampSequence(ArchiveTimeStampChain[] paramArrayOfArchiveTimeStampChain) {
    this.archiveTimeStampChains = (ASN1Sequence)new DERSequence((ASN1Encodable[])paramArrayOfArchiveTimeStampChain);
  }
  
  public ArchiveTimeStampChain[] getArchiveTimeStampChains() {
    ArchiveTimeStampChain[] arrayOfArchiveTimeStampChain = new ArchiveTimeStampChain[this.archiveTimeStampChains.size()];
    for (byte b = 0; b != arrayOfArchiveTimeStampChain.length; b++)
      arrayOfArchiveTimeStampChain[b] = ArchiveTimeStampChain.getInstance(this.archiveTimeStampChains.getObjectAt(b)); 
    return arrayOfArchiveTimeStampChain;
  }
  
  public int size() {
    return this.archiveTimeStampChains.size();
  }
  
  public ArchiveTimeStampSequence append(ArchiveTimeStampChain paramArchiveTimeStampChain) {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(this.archiveTimeStampChains.size() + 1);
    for (byte b = 0; b != this.archiveTimeStampChains.size(); b++)
      aSN1EncodableVector.add(this.archiveTimeStampChains.getObjectAt(b)); 
    aSN1EncodableVector.add((ASN1Encodable)paramArchiveTimeStampChain);
    return new ArchiveTimeStampSequence((ASN1Sequence)new DERSequence(aSN1EncodableVector));
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)this.archiveTimeStampChains;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\tsp\ArchiveTimeStampSequence.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */