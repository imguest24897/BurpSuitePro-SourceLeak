package org.bouncycastle.tls.crypto;

public class TlsECConfig {
  protected final int namedGroup;
  
  public TlsECConfig(int paramInt) {
    this.namedGroup = paramInt;
  }
  
  public int getNamedGroup() {
    return this.namedGroup;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\TlsECConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */