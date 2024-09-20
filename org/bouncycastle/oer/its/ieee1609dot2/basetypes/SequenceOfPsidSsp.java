package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.oer.its.ItsUtils;

public class SequenceOfPsidSsp extends ASN1Object {
  private final List<PsidSsp> psidSsps;
  
  public SequenceOfPsidSsp(List<PsidSsp> paramList) {
    this.psidSsps = Collections.unmodifiableList(paramList);
  }
  
  private SequenceOfPsidSsp(ASN1Sequence paramASN1Sequence) {
    ArrayList<PsidSsp> arrayList = new ArrayList();
    Iterator iterator = paramASN1Sequence.iterator();
    while (iterator.hasNext())
      arrayList.add(PsidSsp.getInstance(iterator.next())); 
    this.psidSsps = Collections.unmodifiableList(arrayList);
  }
  
  public static SequenceOfPsidSsp getInstance(Object paramObject) {
    return (paramObject instanceof SequenceOfPsidSsp) ? (SequenceOfPsidSsp)paramObject : ((paramObject != null) ? new SequenceOfPsidSsp(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public List<PsidSsp> getPsidSsps() {
    return this.psidSsps;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)ItsUtils.toSequence(this.psidSsps);
  }
  
  public static class Builder {
    private List<PsidSsp> items = new ArrayList<>();
    
    public Builder setItems(List<PsidSsp> param1List) {
      this.items = param1List;
      return this;
    }
    
    public Builder setItem(PsidSsp... param1VarArgs) {
      for (byte b = 0; b != param1VarArgs.length; b++) {
        PsidSsp psidSsp = param1VarArgs[b];
        this.items.add(psidSsp);
      } 
      return this;
    }
    
    public SequenceOfPsidSsp createSequenceOfPsidSsp() {
      return new SequenceOfPsidSsp(this.items);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\SequenceOfPsidSsp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */