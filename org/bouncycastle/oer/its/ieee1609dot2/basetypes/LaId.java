package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.util.Arrays;

public class LaId extends ASN1Object {
  private final byte[] laId;
  
  public LaId(byte[] paramArrayOfbyte) {
    this.laId = paramArrayOfbyte;
    assertLength();
  }
  
  private LaId(ASN1OctetString paramASN1OctetString) {
    this(paramASN1OctetString.getOctets());
  }
  
  public static LaId getInstance(Object paramObject) {
    return (paramObject instanceof LaId) ? (LaId)paramObject : ((paramObject != null) ? new LaId(DEROctetString.getInstance(paramObject)) : null);
  }
  
  private void assertLength() {
    if (this.laId.length != 2)
      throw new IllegalArgumentException("laId must be 2 octets"); 
  }
  
  public byte[] getLaId() {
    return Arrays.clone(this.laId);
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DEROctetString(this.laId);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\LaId.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */