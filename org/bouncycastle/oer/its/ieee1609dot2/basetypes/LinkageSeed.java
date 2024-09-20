package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.util.Arrays;

public class LinkageSeed extends ASN1Object {
  private final byte[] linkageSeed;
  
  public LinkageSeed(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte.length != 16)
      throw new IllegalArgumentException("linkage seed not 16 bytes"); 
    this.linkageSeed = Arrays.clone(paramArrayOfbyte);
  }
  
  private LinkageSeed(ASN1OctetString paramASN1OctetString) {
    this(paramASN1OctetString.getOctets());
  }
  
  public static LinkageSeed getInstance(Object paramObject) {
    return (paramObject instanceof LinkageSeed) ? (LinkageSeed)paramObject : ((paramObject != null) ? new LinkageSeed(DEROctetString.getInstance(paramObject)) : null);
  }
  
  public byte[] getLinkageSeed() {
    return this.linkageSeed;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DEROctetString(this.linkageSeed);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\LinkageSeed.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */