package org.bouncycastle.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.util.Arrays;

public class UserKeyingMaterialSpec implements AlgorithmParameterSpec {
  private final byte[] userKeyingMaterial;
  
  private final byte[] salt;
  
  public UserKeyingMaterialSpec(byte[] paramArrayOfbyte) {
    this(paramArrayOfbyte, null);
  }
  
  public UserKeyingMaterialSpec(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    this.userKeyingMaterial = Arrays.clone(paramArrayOfbyte1);
    this.salt = Arrays.clone(paramArrayOfbyte2);
  }
  
  public byte[] getUserKeyingMaterial() {
    return Arrays.clone(this.userKeyingMaterial);
  }
  
  public byte[] getSalt() {
    return Arrays.clone(this.salt);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\spec\UserKeyingMaterialSpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */