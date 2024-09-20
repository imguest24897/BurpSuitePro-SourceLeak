package org.bouncycastle.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.crypto.util.RadixConverter;
import org.bouncycastle.util.Arrays;

public class FPEParameterSpec implements AlgorithmParameterSpec {
  private final RadixConverter radixConverter;
  
  private final byte[] tweak;
  
  private final boolean useInverse;
  
  public FPEParameterSpec(int paramInt, byte[] paramArrayOfbyte) {
    this(paramInt, paramArrayOfbyte, false);
  }
  
  public FPEParameterSpec(int paramInt, byte[] paramArrayOfbyte, boolean paramBoolean) {
    this(new RadixConverter(paramInt), paramArrayOfbyte, paramBoolean);
  }
  
  public FPEParameterSpec(RadixConverter paramRadixConverter, byte[] paramArrayOfbyte, boolean paramBoolean) {
    this.radixConverter = paramRadixConverter;
    this.tweak = Arrays.clone(paramArrayOfbyte);
    this.useInverse = paramBoolean;
  }
  
  public int getRadix() {
    return this.radixConverter.getRadix();
  }
  
  public RadixConverter getRadixConverter() {
    return this.radixConverter;
  }
  
  public byte[] getTweak() {
    return Arrays.clone(this.tweak);
  }
  
  public boolean isUsingInverseFunction() {
    return this.useInverse;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\spec\FPEParameterSpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */