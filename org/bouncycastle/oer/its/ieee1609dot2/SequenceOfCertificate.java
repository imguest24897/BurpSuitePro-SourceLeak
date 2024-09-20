package org.bouncycastle.oer.its.ieee1609dot2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.oer.its.ItsUtils;

public class SequenceOfCertificate extends ASN1Object {
  private final List<Certificate> certificates;
  
  public SequenceOfCertificate(List<Certificate> paramList) {
    this.certificates = Collections.unmodifiableList(paramList);
  }
  
  private SequenceOfCertificate(ASN1Sequence paramASN1Sequence) {
    Iterator iterator = paramASN1Sequence.iterator();
    ArrayList<Certificate> arrayList = new ArrayList();
    while (iterator.hasNext())
      arrayList.add(Certificate.getInstance(iterator.next())); 
    this.certificates = Collections.unmodifiableList(arrayList);
  }
  
  public static SequenceOfCertificate getInstance(Object paramObject) {
    return (paramObject instanceof SequenceOfCertificate) ? (SequenceOfCertificate)paramObject : ((paramObject != null) ? new SequenceOfCertificate(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)ItsUtils.toSequence(this.certificates);
  }
  
  public List<Certificate> getCertificates() {
    return this.certificates;
  }
  
  public static class Builder {
    List<Certificate> certificates = new ArrayList<>();
    
    public Builder add(Certificate... param1VarArgs) {
      this.certificates.addAll(Arrays.asList(param1VarArgs));
      return this;
    }
    
    public SequenceOfCertificate build() {
      return new SequenceOfCertificate(this.certificates);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\SequenceOfCertificate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */