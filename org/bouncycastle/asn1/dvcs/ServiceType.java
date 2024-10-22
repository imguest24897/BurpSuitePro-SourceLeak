package org.bouncycastle.asn1.dvcs;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;

public class ServiceType extends ASN1Object {
  public static final ServiceType CPD = new ServiceType(1);
  
  public static final ServiceType VSD = new ServiceType(2);
  
  public static final ServiceType VPKC = new ServiceType(3);
  
  public static final ServiceType CCPD = new ServiceType(4);
  
  private ASN1Enumerated value;
  
  public ServiceType(int paramInt) {
    this.value = new ASN1Enumerated(paramInt);
  }
  
  private ServiceType(ASN1Enumerated paramASN1Enumerated) {
    this.value = paramASN1Enumerated;
  }
  
  public static ServiceType getInstance(Object paramObject) {
    return (paramObject instanceof ServiceType) ? (ServiceType)paramObject : ((paramObject != null) ? new ServiceType(ASN1Enumerated.getInstance(paramObject)) : null);
  }
  
  public static ServiceType getInstance(ASN1TaggedObject paramASN1TaggedObject, boolean paramBoolean) {
    return getInstance(ASN1Enumerated.getInstance(paramASN1TaggedObject, paramBoolean));
  }
  
  public BigInteger getValue() {
    return this.value.getValue();
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)this.value;
  }
  
  public String toString() {
    int i = this.value.intValueExact();
    return "" + i + ((i == CPD.value.intValueExact()) ? "(CPD)" : ((i == VSD.value.intValueExact()) ? "(VSD)" : ((i == VPKC.value.intValueExact()) ? "(VPKC)" : ((i == CCPD.value.intValueExact()) ? "(CCPD)" : "?"))));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\dvcs\ServiceType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */