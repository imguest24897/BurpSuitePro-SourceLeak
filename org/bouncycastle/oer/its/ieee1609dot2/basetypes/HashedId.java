package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.util.Arrays;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.util.Arrays;

public class HashedId extends ASN1Object {
  private final byte[] id;
  
  protected HashedId(byte[] paramArrayOfbyte) {
    this.id = Arrays.clone(paramArrayOfbyte);
  }
  
  public byte[] getHashBytes() {
    return Arrays.clone(this.id);
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DEROctetString(this.id);
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    if (!super.equals(paramObject))
      return false; 
    HashedId hashedId = (HashedId)paramObject;
    return Arrays.equals(this.id, hashedId.id);
  }
  
  public int hashCode() {
    null = super.hashCode();
    return 31 * null + Arrays.hashCode(this.id);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\HashedId.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */