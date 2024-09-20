package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import org.bouncycastle.asn1.ASN1OctetString;

public class HashedId32 extends HashedId {
  public HashedId32(byte[] paramArrayOfbyte) {
    super(paramArrayOfbyte);
    if (paramArrayOfbyte.length != 32)
      throw new IllegalArgumentException("hash id not 32 bytes"); 
  }
  
  public static HashedId32 getInstance(Object paramObject) {
    if (paramObject instanceof HashedId32)
      return (HashedId32)paramObject; 
    if (paramObject != null) {
      byte[] arrayOfByte = ASN1OctetString.getInstance(paramObject).getOctets();
      return new HashedId32(arrayOfByte);
    } 
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\HashedId32.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */