package META-INF.versions.9.org.bouncycastle.pqc.crypto.rainbow;

import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.pqc.crypto.rainbow.RainbowUtil;
import org.bouncycastle.util.Arrays;

class RainbowDRBG extends SecureRandom {
  private byte[] seed;
  
  private byte[] key;
  
  private byte[] v;
  
  private Digest hashAlgo;
  
  public RainbowDRBG(byte[] paramArrayOfbyte, Digest paramDigest) {
    this.seed = paramArrayOfbyte;
    this.hashAlgo = paramDigest;
    init(256);
  }
  
  private void init(int paramInt) {
    if (this.seed.length >= 48) {
      randombytes_init(this.seed, paramInt);
    } else {
      byte[] arrayOfByte = RainbowUtil.hash(this.hashAlgo, this.seed, 48 - this.seed.length);
      randombytes_init(Arrays.concatenate(this.seed, arrayOfByte), paramInt);
    } 
  }
  
  public void nextBytes(byte[] paramArrayOfbyte) {
    byte[] arrayOfByte = new byte[16];
    boolean bool = false;
    int i;
    for (i = paramArrayOfbyte.length; i > 0; i = 0) {
      for (byte b = 15; b >= 0; b--) {
        if ((this.v[b] & 0xFF) == 255) {
          this.v[b] = 0;
        } else {
          this.v[b] = (byte)(this.v[b] + 1);
          break;
        } 
      } 
      AES256_ECB(this.key, this.v, arrayOfByte, 0);
      if (i > 15) {
        System.arraycopy(arrayOfByte, 0, paramArrayOfbyte, bool, arrayOfByte.length);
        bool += true;
        i -= 16;
        continue;
      } 
      System.arraycopy(arrayOfByte, 0, paramArrayOfbyte, bool, i);
    } 
    AES256_CTR_DRBG_Update(null, this.key, this.v);
  }
  
  private void AES256_ECB(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, int paramInt) {
    try {
      AESEngine aESEngine = new AESEngine();
      aESEngine.init(true, (CipherParameters)new KeyParameter(paramArrayOfbyte1));
      for (byte b = 0; b != paramArrayOfbyte2.length; b += 16)
        aESEngine.processBlock(paramArrayOfbyte2, b, paramArrayOfbyte3, paramInt + b); 
    } catch (Throwable throwable) {
      throw new IllegalStateException("drbg failure: " + throwable.getMessage(), throwable);
    } 
  }
  
  private void AES256_CTR_DRBG_Update(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    byte[] arrayOfByte = new byte[48];
    byte b;
    for (b = 0; b < 3; b++) {
      for (byte b1 = 15; b1 >= 0; b1--) {
        if ((paramArrayOfbyte3[b1] & 0xFF) == 255) {
          paramArrayOfbyte3[b1] = 0;
        } else {
          paramArrayOfbyte3[b1] = (byte)(paramArrayOfbyte3[b1] + 1);
          break;
        } 
      } 
      AES256_ECB(paramArrayOfbyte2, paramArrayOfbyte3, arrayOfByte, 16 * b);
    } 
    if (paramArrayOfbyte1 != null)
      for (b = 0; b < 48; b++)
        arrayOfByte[b] = (byte)(arrayOfByte[b] ^ paramArrayOfbyte1[b]);  
    System.arraycopy(arrayOfByte, 0, paramArrayOfbyte2, 0, paramArrayOfbyte2.length);
    System.arraycopy(arrayOfByte, 32, paramArrayOfbyte3, 0, paramArrayOfbyte3.length);
  }
  
  private void randombytes_init(byte[] paramArrayOfbyte, int paramInt) {
    byte[] arrayOfByte = new byte[48];
    System.arraycopy(paramArrayOfbyte, 0, arrayOfByte, 0, arrayOfByte.length);
    this.key = new byte[32];
    this.v = new byte[16];
    AES256_CTR_DRBG_Update(arrayOfByte, this.key, this.v);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\rainbow\RainbowDRBG.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */