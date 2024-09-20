package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import org.bouncycastle.asn1.ASN1OctetString;

public class HashedId3 extends HashedId {
  public HashedId3(byte[] paramArrayOfbyte) {
    super(paramArrayOfbyte);
    if (paramArrayOfbyte.length != 3)
      throw new IllegalArgumentException("hash id not 3 bytes"); 
  }
  
  public static HashedId3 getInstance(Object paramObject) {
    if (paramObject instanceof HashedId3)
      return (HashedId3)paramObject; 
    if (paramObject != null) {
      byte[] arrayOfByte = ASN1OctetString.getInstance(paramObject).getOctets();
      return new HashedId3(arrayOfByte);
    } 
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\HashedId3.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */