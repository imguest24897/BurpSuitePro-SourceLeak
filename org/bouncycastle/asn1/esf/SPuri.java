package org.bouncycastle.asn1.esf;

import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.ASN1Primitive;

public class SPuri {
  private ASN1IA5String uri;
  
  public static SPuri getInstance(Object paramObject) {
    return (paramObject instanceof SPuri) ? (SPuri)paramObject : ((paramObject instanceof ASN1IA5String) ? new SPuri(ASN1IA5String.getInstance(paramObject)) : null);
  }
  
  public SPuri(ASN1IA5String paramASN1IA5String) {
    this.uri = paramASN1IA5String;
  }
  
  public ASN1IA5String getUriIA5() {
    return this.uri;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return this.uri.toASN1Primitive();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\esf\SPuri.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */