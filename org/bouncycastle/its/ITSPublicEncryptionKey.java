package org.bouncycastle.its;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.PublicEncryptionKey;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.SymmAlgorithm;

public class ITSPublicEncryptionKey {
  protected final PublicEncryptionKey encryptionKey;
  
  public ITSPublicEncryptionKey(PublicEncryptionKey paramPublicEncryptionKey) {
    this.encryptionKey = paramPublicEncryptionKey;
  }
  
  public PublicEncryptionKey toASN1Structure() {
    return this.encryptionKey;
  }
  
  public enum symmAlgorithm {
    aes128Ccm(SymmAlgorithm.aes128Ccm.intValueExact());
    
    private final int tagValue;
    
    symmAlgorithm(int param1Int1) {
      this.tagValue = param1Int1;
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\its\ITSPublicEncryptionKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */