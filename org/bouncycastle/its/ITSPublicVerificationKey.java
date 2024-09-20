package org.bouncycastle.its;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.PublicVerificationKey;

public class ITSPublicVerificationKey {
  protected final PublicVerificationKey verificationKey;
  
  public ITSPublicVerificationKey(PublicVerificationKey paramPublicVerificationKey) {
    this.verificationKey = paramPublicVerificationKey;
  }
  
  public PublicVerificationKey toASN1Structure() {
    return this.verificationKey;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\its\ITSPublicVerificationKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */