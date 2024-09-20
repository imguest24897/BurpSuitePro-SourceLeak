package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.oer.its.ItsUtils;
import org.bouncycastle.util.Arrays;

public class GroupLinkageValue extends ASN1Object {
  private final ASN1OctetString jValue;
  
  private final ASN1OctetString value;
  
  private GroupLinkageValue(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 2)
      throw new IllegalArgumentException("expected sequence size of 2"); 
    this.jValue = ASN1OctetString.getInstance(paramASN1Sequence.getObjectAt(0));
    this.value = ASN1OctetString.getInstance(paramASN1Sequence.getObjectAt(1));
    assertValues();
  }
  
  public GroupLinkageValue(ASN1OctetString paramASN1OctetString1, ASN1OctetString paramASN1OctetString2) {
    this.jValue = paramASN1OctetString1;
    this.value = paramASN1OctetString2;
    assertValues();
  }
  
  private void assertValues() {
    if (this.jValue == null || (this.jValue.getOctets()).length != 4)
      throw new IllegalArgumentException("jValue is null or not four bytes long"); 
    if (this.value == null || (this.value.getOctets()).length != 9)
      throw new IllegalArgumentException("value is null or not nine bytes long"); 
  }
  
  public static GroupLinkageValue getInstance(Object paramObject) {
    return (paramObject instanceof GroupLinkageValue) ? (GroupLinkageValue)paramObject : ((paramObject != null) ? new GroupLinkageValue(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public ASN1OctetString getJValue() {
    return this.jValue;
  }
  
  public ASN1OctetString getValue() {
    return this.value;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)ItsUtils.toSequence(new ASN1Encodable[] { (ASN1Encodable)this.jValue, (ASN1Encodable)this.value });
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public static class Builder {
    private ASN1OctetString jValue;
    
    private ASN1OctetString value;
    
    public Builder setJValue(ASN1OctetString param1ASN1OctetString) {
      this.jValue = param1ASN1OctetString;
      return this;
    }
    
    public Builder setJValue(byte[] param1ArrayOfbyte) {
      return setJValue((ASN1OctetString)new DEROctetString(Arrays.clone(param1ArrayOfbyte)));
    }
    
    public Builder setValue(ASN1OctetString param1ASN1OctetString) {
      this.value = param1ASN1OctetString;
      return this;
    }
    
    public Builder setValue(byte[] param1ArrayOfbyte) {
      return setValue((ASN1OctetString)new DEROctetString(Arrays.clone(param1ArrayOfbyte)));
    }
    
    public GroupLinkageValue createGroupLinkageValue() {
      return new GroupLinkageValue(this.jValue, this.value);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\GroupLinkageValue.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */