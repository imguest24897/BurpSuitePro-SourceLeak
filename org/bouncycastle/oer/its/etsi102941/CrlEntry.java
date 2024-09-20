package org.bouncycastle.oer.its.etsi102941;

import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.HashedId;

public class CrlEntry extends HashedId {
  public CrlEntry(byte[] paramArrayOfbyte) {
    super(paramArrayOfbyte);
    if (paramArrayOfbyte.length != 8)
      throw new IllegalArgumentException("expected 8 bytes"); 
  }
  
  private CrlEntry(ASN1OctetString paramASN1OctetString) {
    super(paramASN1OctetString.getOctets());
  }
  
  public static CrlEntry getInstance(Object paramObject) {
    return (paramObject instanceof CrlEntry) ? (CrlEntry)paramObject : ((paramObject != null) ? new CrlEntry(ASN1OctetString.getInstance(paramObject)) : null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\etsi102941\CrlEntry.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */