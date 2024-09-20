package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

public class AsymmetricKeyParameter implements CipherParameters {
  boolean privateKey;
  
  public AsymmetricKeyParameter(boolean paramBoolean) {
    this.privateKey = paramBoolean;
  }
  
  public boolean isPrivate() {
    return this.privateKey;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\params\AsymmetricKeyParameter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */