package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.ASN1UTF8String;
import org.bouncycastle.asn1.DERUTF8String;

public class Hostname extends ASN1Object {
  private final String hostName;
  
  public Hostname(String paramString) {
    this.hostName = paramString;
  }
  
  private Hostname(ASN1String paramASN1String) {
    this.hostName = paramASN1String.getString();
  }
  
  public static Hostname getInstance(Object paramObject) {
    return (paramObject instanceof Hostname) ? (Hostname)paramObject : ((paramObject != null) ? new Hostname((ASN1String)ASN1UTF8String.getInstance(paramObject)) : null);
  }
  
  public String getHostName() {
    return this.hostName;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERUTF8String(this.hostName);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\Hostname.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */