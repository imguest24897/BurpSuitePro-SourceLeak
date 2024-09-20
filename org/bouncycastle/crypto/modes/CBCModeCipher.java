package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.MultiBlockCipher;

public interface CBCModeCipher extends MultiBlockCipher {
  BlockCipher getUnderlyingCipher();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\modes\CBCModeCipher.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */