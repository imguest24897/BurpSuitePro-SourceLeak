package org.bouncycastle.oer.its.ieee1609dot2;

import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.HashedId;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.HashedId8;

public class PreSharedKeyRecipientInfo extends HashedId8 {
  public PreSharedKeyRecipientInfo(byte[] paramArrayOfbyte) {
    super(paramArrayOfbyte);
  }
  
  public static PreSharedKeyRecipientInfo getInstance(Object paramObject) {
    return (paramObject instanceof PreSharedKeyRecipientInfo) ? (PreSharedKeyRecipientInfo)paramObject : ((paramObject != null) ? ((paramObject instanceof HashedId) ? new PreSharedKeyRecipientInfo(((HashedId)paramObject).getHashBytes()) : new PreSharedKeyRecipientInfo(ASN1OctetString.getInstance(paramObject).getOctets())) : null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\PreSharedKeyRecipientInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */