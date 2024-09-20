package org.bouncycastle.asn1.x500;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSet;

public class RDN extends ASN1Object {
  private ASN1Set values;
  
  private RDN(ASN1Set paramASN1Set) {
    this.values = paramASN1Set;
  }
  
  public static RDN getInstance(Object paramObject) {
    return (paramObject instanceof RDN) ? (RDN)paramObject : ((paramObject != null) ? new RDN(ASN1Set.getInstance(paramObject)) : null);
  }
  
  public static RDN getInstance(ASN1TaggedObject paramASN1TaggedObject, boolean paramBoolean) {
    return new RDN(ASN1Set.getInstance(paramASN1TaggedObject, paramBoolean));
  }
  
  public RDN(ASN1ObjectIdentifier paramASN1ObjectIdentifier, ASN1Encodable paramASN1Encodable) {
    this(new AttributeTypeAndValue(paramASN1ObjectIdentifier, paramASN1Encodable));
  }
  
  public RDN(AttributeTypeAndValue paramAttributeTypeAndValue) {
    this.values = (ASN1Set)new DERSet((ASN1Encodable)paramAttributeTypeAndValue);
  }
  
  public RDN(AttributeTypeAndValue[] paramArrayOfAttributeTypeAndValue) {
    this.values = (ASN1Set)new DERSet((ASN1Encodable[])paramArrayOfAttributeTypeAndValue);
  }
  
  public boolean isMultiValued() {
    return (this.values.size() > 1);
  }
  
  public int size() {
    return this.values.size();
  }
  
  public AttributeTypeAndValue getFirst() {
    return (this.values.size() == 0) ? null : AttributeTypeAndValue.getInstance(this.values.getObjectAt(0));
  }
  
  public AttributeTypeAndValue[] getTypesAndValues() {
    AttributeTypeAndValue[] arrayOfAttributeTypeAndValue = new AttributeTypeAndValue[this.values.size()];
    for (byte b = 0; b != arrayOfAttributeTypeAndValue.length; b++)
      arrayOfAttributeTypeAndValue[b] = AttributeTypeAndValue.getInstance(this.values.getObjectAt(b)); 
    return arrayOfAttributeTypeAndValue;
  }
  
  int collectAttributeTypes(ASN1ObjectIdentifier[] paramArrayOfASN1ObjectIdentifier, int paramInt) {
    int i = this.values.size();
    for (byte b = 0; b < i; b++) {
      AttributeTypeAndValue attributeTypeAndValue = AttributeTypeAndValue.getInstance(this.values.getObjectAt(b));
      paramArrayOfASN1ObjectIdentifier[paramInt + b] = attributeTypeAndValue.getType();
    } 
    return i;
  }
  
  boolean containsAttributeType(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    int i = this.values.size();
    for (byte b = 0; b < i; b++) {
      AttributeTypeAndValue attributeTypeAndValue = AttributeTypeAndValue.getInstance(this.values.getObjectAt(b));
      if (attributeTypeAndValue.getType().equals((ASN1Primitive)paramASN1ObjectIdentifier))
        return true; 
    } 
    return false;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)this.values;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\x500\RDN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */