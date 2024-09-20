package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.Arrays;

public class RFC3394WrapEngine implements Wrapper {
  private static final byte[] DEFAULT_IV = new byte[] { -90, -90, -90, -90, -90, -90, -90, -90 };
  
  private final BlockCipher engine;
  
  private final boolean wrapCipherMode;
  
  private final byte[] iv = new byte[8];
  
  private KeyParameter param = null;
  
  private boolean forWrapping = true;
  
  public RFC3394WrapEngine(BlockCipher paramBlockCipher) {
    this(paramBlockCipher, false);
  }
  
  public RFC3394WrapEngine(BlockCipher paramBlockCipher, boolean paramBoolean) {
    this.engine = paramBlockCipher;
    this.wrapCipherMode = !paramBoolean;
  }
  
  public void init(boolean paramBoolean, CipherParameters paramCipherParameters) {
    this.forWrapping = paramBoolean;
    if (paramCipherParameters instanceof ParametersWithRandom)
      paramCipherParameters = ((ParametersWithRandom)paramCipherParameters).getParameters(); 
    if (paramCipherParameters instanceof KeyParameter) {
      this.param = (KeyParameter)paramCipherParameters;
      System.arraycopy(DEFAULT_IV, 0, this.iv, 0, 8);
    } else if (paramCipherParameters instanceof ParametersWithIV) {
      ParametersWithIV parametersWithIV = (ParametersWithIV)paramCipherParameters;
      byte[] arrayOfByte = parametersWithIV.getIV();
      if (arrayOfByte.length != 8)
        throw new IllegalArgumentException("IV not equal to 8"); 
      this.param = (KeyParameter)parametersWithIV.getParameters();
      System.arraycopy(arrayOfByte, 0, this.iv, 0, 8);
    } 
  }
  
  public String getAlgorithmName() {
    return this.engine.getAlgorithmName();
  }
  
  public byte[] wrap(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (!this.forWrapping)
      throw new IllegalStateException("not set for wrapping"); 
    if (paramInt2 < 8)
      throw new DataLengthException("wrap data must be at least 8 bytes"); 
    int i = paramInt2 / 8;
    if (i * 8 != paramInt2)
      throw new DataLengthException("wrap data must be a multiple of 8 bytes"); 
    this.engine.init(this.wrapCipherMode, (CipherParameters)this.param);
    byte[] arrayOfByte = new byte[paramInt2 + this.iv.length];
    System.arraycopy(this.iv, 0, arrayOfByte, 0, this.iv.length);
    System.arraycopy(paramArrayOfbyte, paramInt1, arrayOfByte, this.iv.length, paramInt2);
    if (i == 1) {
      this.engine.processBlock(arrayOfByte, 0, arrayOfByte, 0);
    } else {
      byte[] arrayOfByte1 = new byte[8 + this.iv.length];
      for (byte b = 0; b != 6; b++) {
        for (byte b1 = 1; b1 <= i; b1++) {
          System.arraycopy(arrayOfByte, 0, arrayOfByte1, 0, this.iv.length);
          System.arraycopy(arrayOfByte, 8 * b1, arrayOfByte1, this.iv.length, 8);
          this.engine.processBlock(arrayOfByte1, 0, arrayOfByte1, 0);
          int j = i * b + b1;
          for (byte b2 = 1; j != 0; b2++) {
            byte b3 = (byte)j;
            arrayOfByte1[this.iv.length - b2] = (byte)(arrayOfByte1[this.iv.length - b2] ^ b3);
            j >>>= 8;
          } 
          System.arraycopy(arrayOfByte1, 0, arrayOfByte, 0, 8);
          System.arraycopy(arrayOfByte1, 8, arrayOfByte, 8 * b1, 8);
        } 
      } 
    } 
    return arrayOfByte;
  }
  
  public byte[] unwrap(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws InvalidCipherTextException {
    if (this.forWrapping)
      throw new IllegalStateException("not set for unwrapping"); 
    if (paramInt2 < 16)
      throw new InvalidCipherTextException("unwrap data too short"); 
    int i = paramInt2 / 8;
    if (i * 8 != paramInt2)
      throw new InvalidCipherTextException("unwrap data must be a multiple of 8 bytes"); 
    this.engine.init(!this.wrapCipherMode, (CipherParameters)this.param);
    byte[] arrayOfByte1 = new byte[paramInt2 - this.iv.length];
    byte[] arrayOfByte2 = new byte[this.iv.length];
    byte[] arrayOfByte3 = new byte[8 + this.iv.length];
    if (--i == 1) {
      this.engine.processBlock(paramArrayOfbyte, paramInt1, arrayOfByte3, 0);
      System.arraycopy(arrayOfByte3, 0, arrayOfByte2, 0, this.iv.length);
      System.arraycopy(arrayOfByte3, this.iv.length, arrayOfByte1, 0, 8);
    } else {
      System.arraycopy(paramArrayOfbyte, paramInt1, arrayOfByte2, 0, this.iv.length);
      System.arraycopy(paramArrayOfbyte, paramInt1 + this.iv.length, arrayOfByte1, 0, paramInt2 - this.iv.length);
      for (byte b = 5; b >= 0; b--) {
        for (int j = i; j >= 1; j--) {
          System.arraycopy(arrayOfByte2, 0, arrayOfByte3, 0, this.iv.length);
          System.arraycopy(arrayOfByte1, 8 * (j - 1), arrayOfByte3, this.iv.length, 8);
          int k = i * b + j;
          for (byte b1 = 1; k != 0; b1++) {
            byte b2 = (byte)k;
            arrayOfByte3[this.iv.length - b1] = (byte)(arrayOfByte3[this.iv.length - b1] ^ b2);
            k >>>= 8;
          } 
          this.engine.processBlock(arrayOfByte3, 0, arrayOfByte3, 0);
          System.arraycopy(arrayOfByte3, 0, arrayOfByte2, 0, 8);
          System.arraycopy(arrayOfByte3, 8, arrayOfByte1, 8 * (j - 1), 8);
        } 
      } 
    } 
    if (i != 1) {
      if (!Arrays.constantTimeAreEqual(arrayOfByte2, this.iv))
        throw new InvalidCipherTextException("checksum failed"); 
    } else if (!Arrays.constantTimeAreEqual(arrayOfByte2, this.iv)) {
      System.arraycopy(paramArrayOfbyte, paramInt1, arrayOfByte2, 0, this.iv.length);
      System.arraycopy(paramArrayOfbyte, paramInt1 + this.iv.length, arrayOfByte1, 0, paramInt2 - this.iv.length);
      for (byte b = 5; b >= 0; b--) {
        System.arraycopy(arrayOfByte2, 0, arrayOfByte3, 0, this.iv.length);
        System.arraycopy(arrayOfByte1, 0, arrayOfByte3, this.iv.length, 8);
        int j = i * b + 1;
        for (byte b1 = 1; j != 0; b1++) {
          byte b2 = (byte)j;
          arrayOfByte3[this.iv.length - b1] = (byte)(arrayOfByte3[this.iv.length - b1] ^ b2);
          j >>>= 8;
        } 
        this.engine.processBlock(arrayOfByte3, 0, arrayOfByte3, 0);
        System.arraycopy(arrayOfByte3, 0, arrayOfByte2, 0, 8);
        System.arraycopy(arrayOfByte3, 8, arrayOfByte1, 0, 8);
      } 
      if (!Arrays.constantTimeAreEqual(arrayOfByte2, this.iv))
        throw new InvalidCipherTextException("checksum failed"); 
    } 
    return arrayOfByte1;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\engines\RFC3394WrapEngine.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */