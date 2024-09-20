package org.bouncycastle.oer.its.ieee1609dot2;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.oer.OEROptional;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.GroupLinkageValue;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.IValue;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.LinkageValue;

public class LinkageData extends ASN1Object {
  private final IValue iCert;
  
  private final LinkageValue linkageValue;
  
  private final GroupLinkageValue groupLinkageValue;
  
  public LinkageData(IValue paramIValue, LinkageValue paramLinkageValue, GroupLinkageValue paramGroupLinkageValue) {
    this.iCert = paramIValue;
    this.linkageValue = paramLinkageValue;
    this.groupLinkageValue = paramGroupLinkageValue;
  }
  
  private LinkageData(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 3)
      throw new IllegalArgumentException("expected sequence size of 3"); 
    this.iCert = IValue.getInstance(paramASN1Sequence.getObjectAt(0));
    this.linkageValue = LinkageValue.getInstance(paramASN1Sequence.getObjectAt(1));
    this.groupLinkageValue = (GroupLinkageValue)OEROptional.getValue(GroupLinkageValue.class, paramASN1Sequence.getObjectAt(2));
  }
  
  public static LinkageData getInstance(Object paramObject) {
    return (paramObject instanceof LinkageData) ? (LinkageData)paramObject : ((paramObject != null) ? new LinkageData(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public IValue getICert() {
    return this.iCert;
  }
  
  public LinkageValue getLinkageValue() {
    return this.linkageValue;
  }
  
  public GroupLinkageValue getGroupLinkageValue() {
    return this.groupLinkageValue;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERSequence(new ASN1Encodable[] { (ASN1Encodable)this.iCert, (ASN1Encodable)this.linkageValue, (ASN1Encodable)OEROptional.getInstance(this.groupLinkageValue) });
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public static class Builder {
    private IValue iCert;
    
    private LinkageValue linkageValue;
    
    private GroupLinkageValue groupLinkageValue;
    
    public Builder setICert(IValue param1IValue) {
      this.iCert = param1IValue;
      return this;
    }
    
    public Builder setLinkageValue(LinkageValue param1LinkageValue) {
      this.linkageValue = param1LinkageValue;
      return this;
    }
    
    public Builder setGroupLinkageValue(GroupLinkageValue param1GroupLinkageValue) {
      this.groupLinkageValue = param1GroupLinkageValue;
      return this;
    }
    
    public LinkageData createLinkageData() {
      return new LinkageData(this.iCert, this.linkageValue, this.groupLinkageValue);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\LinkageData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */