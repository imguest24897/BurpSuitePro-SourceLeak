package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.DEROctetString;

public class LinkageValue extends DEROctetString {
  public LinkageValue(byte[] paramArrayOfbyte) {
    super(paramArrayOfbyte);
  }
  
  public LinkageValue(ASN1Encodable paramASN1Encodable) throws IOException {
    super(paramASN1Encodable);
  }
  
  public static LinkageValue getInstance(Object paramObject) {
    return (paramObject instanceof LinkageValue) ? (LinkageValue)paramObject : ((paramObject != null) ? new LinkageValue(ASN1OctetString.getInstance(paramObject).getOctets()) : null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\LinkageValue.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */