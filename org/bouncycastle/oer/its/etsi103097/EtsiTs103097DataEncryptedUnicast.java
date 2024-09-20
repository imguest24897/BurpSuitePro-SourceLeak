package org.bouncycastle.oer.its.etsi103097;

import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.oer.its.ieee1609dot2.Ieee1609Dot2Content;

public class EtsiTs103097DataEncryptedUnicast extends EtsiTs103097Data {
  public EtsiTs103097DataEncryptedUnicast(Ieee1609Dot2Content paramIeee1609Dot2Content) {
    super(paramIeee1609Dot2Content);
  }
  
  protected EtsiTs103097DataEncryptedUnicast(ASN1Sequence paramASN1Sequence) {
    super(paramASN1Sequence);
  }
  
  public static EtsiTs103097DataEncryptedUnicast getInstance(Object paramObject) {
    return (paramObject instanceof EtsiTs103097DataEncrypted) ? (EtsiTs103097DataEncryptedUnicast)paramObject : ((paramObject != null) ? new EtsiTs103097DataEncryptedUnicast(ASN1Sequence.getInstance(paramObject)) : null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\etsi103097\EtsiTs103097DataEncryptedUnicast.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */