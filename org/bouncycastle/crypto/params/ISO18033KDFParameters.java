package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.DerivationParameters;

public class ISO18033KDFParameters implements DerivationParameters {
  byte[] seed;
  
  public ISO18033KDFParameters(byte[] paramArrayOfbyte) {
    this.seed = paramArrayOfbyte;
  }
  
  public byte[] getSeed() {
    return this.seed;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\params\ISO18033KDFParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */