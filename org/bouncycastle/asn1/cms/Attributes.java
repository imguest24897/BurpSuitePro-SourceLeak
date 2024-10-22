package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DLSet;

public class Attributes extends ASN1Object {
  private ASN1Set attributes;
  
  private Attributes(ASN1Set paramASN1Set) {
    this.attributes = paramASN1Set;
  }
  
  public Attributes(ASN1EncodableVector paramASN1EncodableVector) {
    this.attributes = (ASN1Set)new DLSet(paramASN1EncodableVector);
  }
  
  public static Attributes getInstance(Object paramObject) {
    return (paramObject instanceof Attributes) ? (Attributes)paramObject : ((paramObject != null) ? new Attributes(ASN1Set.getInstance(paramObject)) : null);
  }
  
  public static Attributes getInstance(ASN1TaggedObject paramASN1TaggedObject, boolean paramBoolean) {
    return getInstance(ASN1Set.getInstance(paramASN1TaggedObject, paramBoolean));
  }
  
  public Attribute[] getAttributes() {
    Attribute[] arrayOfAttribute = new Attribute[this.attributes.size()];
    for (byte b = 0; b != arrayOfAttribute.length; b++)
      arrayOfAttribute[b] = Attribute.getInstance(this.attributes.getObjectAt(b)); 
    return arrayOfAttribute;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)this.attributes;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\cms\Attributes.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */