package org.bouncycastle.pqc.crypto.crystals.dilithium;

import java.security.SecureRandom;

public class DilithiumParameters {
  public static final DilithiumParameters dilithium2 = new DilithiumParameters("dilithium2", 2, false);
  
  public static final DilithiumParameters dilithium3 = new DilithiumParameters("dilithium3", 3, false);
  
  public static final DilithiumParameters dilithium5 = new DilithiumParameters("dilithium5", 5, false);
  
  private final int k;
  
  private final String name;
  
  private final boolean usingAES;
  
  private DilithiumParameters(String paramString, int paramInt, boolean paramBoolean) {
    this.name = paramString;
    this.k = paramInt;
    this.usingAES = paramBoolean;
  }
  
  DilithiumEngine getEngine(SecureRandom paramSecureRandom) {
    return new DilithiumEngine(this.k, paramSecureRandom, this.usingAES);
  }
  
  public String getName() {
    return this.name;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\crystals\dilithium\DilithiumParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */