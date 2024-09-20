package org.bouncycastle.pqc.jcajce.interfaces;

import java.security.PrivateKey;

public interface SPHINCSPlusPrivateKey extends PrivateKey, SPHINCSPlusKey {
  SPHINCSPlusPublicKey getPublicKey();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\interfaces\SPHINCSPlusPrivateKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */