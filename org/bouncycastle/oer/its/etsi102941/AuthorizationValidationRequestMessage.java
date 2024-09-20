package org.bouncycastle.oer.its.etsi102941;

import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.oer.its.etsi103097.EtsiTs103097DataSignedAndEncryptedUnicast;
import org.bouncycastle.oer.its.ieee1609dot2.Ieee1609Dot2Content;

public class AuthorizationValidationRequestMessage extends EtsiTs103097DataSignedAndEncryptedUnicast {
  public AuthorizationValidationRequestMessage(Ieee1609Dot2Content paramIeee1609Dot2Content) {
    super(paramIeee1609Dot2Content);
  }
  
  protected AuthorizationValidationRequestMessage(ASN1Sequence paramASN1Sequence) {
    super(paramASN1Sequence);
  }
  
  public static AuthorizationValidationRequestMessage getInstance(Object paramObject) {
    return (paramObject instanceof AuthorizationValidationRequestMessage) ? (AuthorizationValidationRequestMessage)paramObject : ((paramObject != null) ? new AuthorizationValidationRequestMessage(ASN1Sequence.getInstance(paramObject)) : null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\etsi102941\AuthorizationValidationRequestMessage.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */