package org.bouncycastle.jcajce.spec;

import java.security.PrivateKey;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.util.Arrays;

public class KEMExtractSpec implements AlgorithmParameterSpec {
  private final PrivateKey privateKey;
  
  private final byte[] encapsulation;
  
  private final String keyAlgorithmName;
  
  private final int keySizeInBits;
  
  public KEMExtractSpec(PrivateKey paramPrivateKey, byte[] paramArrayOfbyte, String paramString) {
    this(paramPrivateKey, paramArrayOfbyte, paramString, 256);
  }
  
  public KEMExtractSpec(PrivateKey paramPrivateKey, byte[] paramArrayOfbyte, String paramString, int paramInt) {
    this.privateKey = paramPrivateKey;
    this.encapsulation = Arrays.clone(paramArrayOfbyte);
    this.keyAlgorithmName = paramString;
    this.keySizeInBits = paramInt;
  }
  
  public byte[] getEncapsulation() {
    return Arrays.clone(this.encapsulation);
  }
  
  public PrivateKey getPrivateKey() {
    return this.privateKey;
  }
  
  public String getKeyAlgorithmName() {
    return this.keyAlgorithmName;
  }
  
  public int getKeySize() {
    return this.keySizeInBits;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\spec\KEMExtractSpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */