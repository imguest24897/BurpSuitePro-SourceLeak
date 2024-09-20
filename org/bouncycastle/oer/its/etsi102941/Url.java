package org.bouncycastle.oer.its.etsi102941;

import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERIA5String;

public class Url extends ASN1Object {
  private final String url;
  
  public Url(String paramString) {
    this.url = paramString;
  }
  
  private Url(ASN1IA5String paramASN1IA5String) {
    this.url = paramASN1IA5String.getString();
  }
  
  public static Url getInstance(Object paramObject) {
    return (paramObject instanceof Url) ? (Url)paramObject : ((paramObject != null) ? new Url(ASN1IA5String.getInstance(paramObject)) : null);
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERIA5String(this.url);
  }
  
  public String getUrl() {
    return this.url;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\etsi102941\Url.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */