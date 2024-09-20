package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;

public class AESWrapEngine extends RFC3394WrapEngine {
  public AESWrapEngine() {
    super((BlockCipher)AESEngine.newInstance());
  }
  
  public AESWrapEngine(boolean paramBoolean) {
    super((BlockCipher)AESEngine.newInstance(), paramBoolean);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\engines\AESWrapEngine.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */