package org.bouncycastle.jcajce;

import javax.crypto.SecretKey;
import org.bouncycastle.util.Arrays;

public final class SecretKeyWithEncapsulation implements SecretKey {
  private final SecretKey secretKey;
  
  private final byte[] encapsulation;
  
  public SecretKeyWithEncapsulation(SecretKey paramSecretKey, byte[] paramArrayOfbyte) {
    this.secretKey = paramSecretKey;
    this.encapsulation = Arrays.clone(paramArrayOfbyte);
  }
  
  public String getAlgorithm() {
    return this.secretKey.getAlgorithm();
  }
  
  public String getFormat() {
    return this.secretKey.getFormat();
  }
  
  public byte[] getEncoded() {
    return this.secretKey.getEncoded();
  }
  
  public byte[] getEncapsulation() {
    return Arrays.clone(this.encapsulation);
  }
  
  public boolean equals(Object paramObject) {
    return this.secretKey.equals(paramObject);
  }
  
  public int hashCode() {
    return this.secretKey.hashCode();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\SecretKeyWithEncapsulation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */