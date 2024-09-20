package org.bouncycastle.oer.its.ieee1609dot2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

public class SequenceOfPsidGroupPermissions extends ASN1Object {
  private final List<PsidGroupPermissions> psidGroupPermissions;
  
  public SequenceOfPsidGroupPermissions(List<PsidGroupPermissions> paramList) {
    this.psidGroupPermissions = Collections.unmodifiableList(paramList);
  }
  
  private SequenceOfPsidGroupPermissions(ASN1Sequence paramASN1Sequence) {
    ArrayList<PsidGroupPermissions> arrayList = new ArrayList();
    Iterator iterator = paramASN1Sequence.iterator();
    while (iterator.hasNext())
      arrayList.add(PsidGroupPermissions.getInstance(iterator.next())); 
    this.psidGroupPermissions = Collections.unmodifiableList(arrayList);
  }
  
  public static SequenceOfPsidGroupPermissions getInstance(Object paramObject) {
    return (paramObject instanceof SequenceOfPsidGroupPermissions) ? (SequenceOfPsidGroupPermissions)paramObject : ((paramObject != null) ? new SequenceOfPsidGroupPermissions(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public List<PsidGroupPermissions> getPsidGroupPermissions() {
    return this.psidGroupPermissions;
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERSequence((ASN1Encodable[])this.psidGroupPermissions.toArray((Object[])new PsidGroupPermissions[0]));
  }
  
  public static class Builder {
    private final List<PsidGroupPermissions> groupPermissions = new ArrayList<>();
    
    public Builder setGroupPermissions(List<PsidGroupPermissions> param1List) {
      this.groupPermissions.addAll(param1List);
      return this;
    }
    
    public Builder addGroupPermission(PsidGroupPermissions... param1VarArgs) {
      this.groupPermissions.addAll(Arrays.asList(param1VarArgs));
      return this;
    }
    
    public SequenceOfPsidGroupPermissions createSequenceOfPsidGroupPermissions() {
      return new SequenceOfPsidGroupPermissions(this.groupPermissions);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\SequenceOfPsidGroupPermissions.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */