package org.bouncycastle.tls.crypto;

public class TlsDHConfig {
  protected final DHGroup explicitGroup;
  
  protected final int namedGroup;
  
  protected final boolean padded;
  
  public TlsDHConfig(DHGroup paramDHGroup) {
    this.explicitGroup = paramDHGroup;
    this.namedGroup = -1;
    this.padded = false;
  }
  
  public TlsDHConfig(int paramInt, boolean paramBoolean) {
    this.explicitGroup = null;
    this.namedGroup = paramInt;
    this.padded = paramBoolean;
  }
  
  public DHGroup getExplicitGroup() {
    return this.explicitGroup;
  }
  
  public int getNamedGroup() {
    return this.namedGroup;
  }
  
  public boolean isPadded() {
    return this.padded;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\TlsDHConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */