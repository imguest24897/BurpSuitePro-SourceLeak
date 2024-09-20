package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.oer.its.ItsUtils;

public class SequenceOfPsid extends ASN1Object {
  private final List<Psid> psids;
  
  public SequenceOfPsid(List<Psid> paramList) {
    this.psids = Collections.unmodifiableList(paramList);
  }
  
  private SequenceOfPsid(ASN1Sequence paramASN1Sequence) {
    ArrayList<Psid> arrayList = new ArrayList();
    Iterator iterator = paramASN1Sequence.iterator();
    while (iterator.hasNext())
      arrayList.add(Psid.getInstance(iterator.next())); 
    this.psids = Collections.unmodifiableList(arrayList);
  }
  
  public static SequenceOfPsid getInstance(Object paramObject) {
    return (paramObject instanceof SequenceOfPsid) ? (SequenceOfPsid)paramObject : ((paramObject != null) ? new SequenceOfPsid(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public List<Psid> getPsids() {
    return this.psids;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)ItsUtils.toSequence(this.psids);
  }
  
  public static class Builder {
    private List<Psid> items = new ArrayList<>();
    
    public Builder setItems(List<Psid> param1List) {
      this.items = param1List;
      return this;
    }
    
    public Builder setItem(Psid... param1VarArgs) {
      for (byte b = 0; b != param1VarArgs.length; b++) {
        Psid psid = param1VarArgs[b];
        this.items.add(psid);
      } 
      return this;
    }
    
    public SequenceOfPsid createSequenceOfPsidSsp() {
      return new SequenceOfPsid(this.items);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\SequenceOfPsid.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */