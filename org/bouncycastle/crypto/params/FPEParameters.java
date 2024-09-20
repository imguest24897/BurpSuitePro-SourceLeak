package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.util.RadixConverter;
import org.bouncycastle.util.Arrays;

public final class FPEParameters implements CipherParameters {
  private final KeyParameter key;
  
  private final RadixConverter radixConverter;
  
  private final byte[] tweak;
  
  private final boolean useInverse;
  
  public FPEParameters(KeyParameter paramKeyParameter, int paramInt, byte[] paramArrayOfbyte) {
    this(paramKeyParameter, paramInt, paramArrayOfbyte, false);
  }
  
  public FPEParameters(KeyParameter paramKeyParameter, int paramInt, byte[] paramArrayOfbyte, boolean paramBoolean) {
    this(paramKeyParameter, new RadixConverter(paramInt), paramArrayOfbyte, paramBoolean);
  }
  
  public FPEParameters(KeyParameter paramKeyParameter, RadixConverter paramRadixConverter, byte[] paramArrayOfbyte, boolean paramBoolean) {
    this.key = paramKeyParameter;
    this.radixConverter = paramRadixConverter;
    this.tweak = Arrays.clone(paramArrayOfbyte);
    this.useInverse = paramBoolean;
  }
  
  public KeyParameter getKey() {
    return this.key;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\params\FPEParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */