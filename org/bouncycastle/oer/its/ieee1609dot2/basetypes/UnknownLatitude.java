package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import org.bouncycastle.asn1.ASN1Integer;

public class UnknownLatitude extends Latitude {
  public static UnknownLatitude INSTANCE = new UnknownLatitude();
  
  private UnknownLatitude() {
    super(900000001L);
  }
  
  public static UnknownLatitude getInstance(Object paramObject) {
    if (paramObject instanceof UnknownLatitude)
      return (UnknownLatitude)paramObject; 
    if (paramObject != null) {
      ASN1Integer aSN1Integer = ASN1Integer.getInstance(paramObject);
      if (aSN1Integer.getValue().intValue() != 900000001)
        throw new IllegalArgumentException("value " + aSN1Integer.getValue() + " is not unknown value of 900000001"); 
      return INSTANCE;
    } 
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\UnknownLatitude.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */