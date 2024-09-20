package org.bouncycastle.jcajce.spec;

import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;

public class KEMGenerateSpec implements AlgorithmParameterSpec {
  private final PublicKey publicKey;
  
  private final String keyAlgorithmName;
  
  private final int keySizeInBits;
  
  public KEMGenerateSpec(PublicKey paramPublicKey, String paramString) {
    this(paramPublicKey, paramString, 256);
  }
  
  public KEMGenerateSpec(PublicKey paramPublicKey, String paramString, int paramInt) {
    this.publicKey = paramPublicKey;
    this.keyAlgorithmName = paramString;
    this.keySizeInBits = paramInt;
  }
  
  public PublicKey getPublicKey() {
    return this.publicKey;
  }
  
  public String getKeyAlgorithmName() {
    return this.keyAlgorithmName;
  }
  
  public int getKeySize() {
    return this.keySizeInBits;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\spec\KEMGenerateSpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */