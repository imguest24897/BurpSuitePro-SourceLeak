package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.util.Arrays;

public class BitmapSsp extends ASN1Object {
  private final DEROctetString string;
  
  public BitmapSsp(byte[] paramArrayOfbyte) {
    this.string = new DEROctetString(Arrays.clone(paramArrayOfbyte));
  }
  
  public BitmapSsp(DEROctetString paramDEROctetString) {
    this.string = paramDEROctetString;
  }
  
  public static BitmapSsp getInstance(Object paramObject) {
    return (paramObject instanceof BitmapSsp) ? (BitmapSsp)paramObject : ((paramObject != null) ? new BitmapSsp(DEROctetString.getInstance(paramObject).getOctets()) : null);
  }
  
  public DEROctetString getString() {
    return this.string;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)this.string;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\BitmapSsp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */