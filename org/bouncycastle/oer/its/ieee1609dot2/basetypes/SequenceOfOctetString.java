package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;

public class SequenceOfOctetString extends ASN1Object {
  private final List<ASN1OctetString> octetStrings;
  
  public SequenceOfOctetString(List<ASN1OctetString> paramList) {
    this.octetStrings = Collections.unmodifiableList(paramList);
  }
  
  private SequenceOfOctetString(ASN1Sequence paramASN1Sequence) {
    ArrayList<ASN1OctetString> arrayList = new ArrayList();
    Iterator iterator = paramASN1Sequence.iterator();
    while (iterator.hasNext())
      arrayList.add(DEROctetString.getInstance(iterator.next())); 
    this.octetStrings = Collections.unmodifiableList(arrayList);
  }
  
  public static SequenceOfOctetString getInstance(Object paramObject) {
    return (paramObject instanceof SequenceOfOctetString) ? (SequenceOfOctetString)paramObject : ((paramObject != null) ? new SequenceOfOctetString(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public List<ASN1OctetString> getOctetStrings() {
    return this.octetStrings;
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
    for (byte b = 0; b != this.octetStrings.size(); b++)
      aSN1EncodableVector.add((ASN1Encodable)this.octetStrings.get(b)); 
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\SequenceOfOctetString.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */