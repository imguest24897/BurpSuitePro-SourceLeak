package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import org.bouncycastle.asn1.ASN1OctetString;

public class HashedId8 extends HashedId {
  public HashedId8(byte[] paramArrayOfbyte) {
    super(paramArrayOfbyte);
    if (paramArrayOfbyte.length != 8)
      throw new IllegalArgumentException("hash id not 8 bytes"); 
  }
  
  public static HashedId8 getInstance(Object paramObject) {
    if (paramObject instanceof HashedId8)
      return (HashedId8)paramObject; 
    if (paramObject != null) {
      byte[] arrayOfByte = ASN1OctetString.getInstance(paramObject).getOctets();
      return new HashedId8(arrayOfByte);
    } 
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\HashedId8.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */