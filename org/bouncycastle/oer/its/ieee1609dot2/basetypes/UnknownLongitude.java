package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import org.bouncycastle.asn1.ASN1Integer;

public class UnknownLongitude extends Longitude {
  public static final UnknownLongitude INSTANCE = new UnknownLongitude();
  
  public UnknownLongitude() {
    super(1800000001L);
  }
  
  public static UnknownLongitude getInstance(Object paramObject) {
    if (paramObject instanceof UnknownLongitude)
      return (UnknownLongitude)paramObject; 
    if (paramObject != null) {
      ASN1Integer aSN1Integer = ASN1Integer.getInstance(paramObject);
      if (aSN1Integer.getValue().intValue() != 1800000001)
        throw new IllegalArgumentException("value " + aSN1Integer.getValue() + " is not 1800000001"); 
      return INSTANCE;
    } 
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\UnknownLongitude.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */