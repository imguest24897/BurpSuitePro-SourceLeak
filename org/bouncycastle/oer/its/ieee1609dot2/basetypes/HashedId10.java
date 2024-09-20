package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import org.bouncycastle.asn1.ASN1OctetString;

public class HashedId10 extends HashedId {
  public HashedId10(byte[] paramArrayOfbyte) {
    super(paramArrayOfbyte);
    if (paramArrayOfbyte.length != 10)
      throw new IllegalArgumentException("hash id not 10 bytes"); 
  }
  
  public static HashedId10 getInstance(Object paramObject) {
    if (paramObject instanceof HashedId10)
      return (HashedId10)paramObject; 
    if (paramObject != null) {
      byte[] arrayOfByte = ASN1OctetString.getInstance(paramObject).getOctets();
      return new HashedId10(arrayOfByte);
    } 
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\HashedId10.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */