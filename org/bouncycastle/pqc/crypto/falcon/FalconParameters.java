package org.bouncycastle.pqc.crypto.falcon;

import org.bouncycastle.crypto.CipherParameters;

public class FalconParameters implements CipherParameters {
  public static final FalconParameters falcon_512 = new FalconParameters("falcon-512", 9, 40);
  
  public static final FalconParameters falcon_1024 = new FalconParameters("falcon-1024", 10, 40);
  
  private final String name;
  
  private final int logn;
  
  private final int nonce_length;
  
  private FalconParameters(String paramString, int paramInt1, int paramInt2) {
    if (paramInt1 < 1 || paramInt1 > 10)
      throw new IllegalArgumentException("Log N degree should be between 1 and 10"); 
    this.name = paramString;
    this.logn = paramInt1;
    this.nonce_length = paramInt2;
  }
  
  public int getLogN() {
    return this.logn;
  }
  
  int getNonceLength() {
    return this.nonce_length;
  }
  
  public String getName() {
    return this.name;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\falcon\FalconParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */