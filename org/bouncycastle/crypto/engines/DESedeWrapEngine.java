package org.bouncycastle.crypto.engines;

import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.util.DigestFactory;
import org.bouncycastle.util.Arrays;

public class DESedeWrapEngine implements Wrapper {
  private CBCBlockCipher engine;
  
  private KeyParameter param;
  
  private ParametersWithIV paramPlusIV;
  
  private byte[] iv;
  
  private boolean forWrapping;
  
  private static final byte[] IV2 = new byte[] { 74, -35, -94, 44, 121, -24, 33, 5 };
  
  Digest sha1 = DigestFactory.createSHA1();
  
  byte[] digest = new byte[20];
  
  public void init(boolean paramBoolean, CipherParameters paramCipherParameters) {
    SecureRandom secureRandom;
    this.forWrapping = paramBoolean;
    this.engine = new CBCBlockCipher(new DESedeEngine());
    if (paramCipherParameters instanceof ParametersWithRandom) {
      ParametersWithRandom parametersWithRandom = (ParametersWithRandom)paramCipherParameters;
      paramCipherParameters = parametersWithRandom.getParameters();
      secureRandom = parametersWithRandom.getRandom();
    } else {
      secureRandom = CryptoServicesRegistrar.getSecureRandom();
    } 
    if (paramCipherParameters instanceof KeyParameter) {
      this.param = (KeyParameter)paramCipherParameters;
      if (this.forWrapping) {
        this.iv = new byte[8];
        secureRandom.nextBytes(this.iv);
        this.paramPlusIV = new ParametersWithIV((CipherParameters)this.param, this.iv);
      } 
    } else if (paramCipherParameters instanceof ParametersWithIV) {
      this.paramPlusIV = (ParametersWithIV)paramCipherParameters;
      this.iv = this.paramPlusIV.getIV();
      this.param = (KeyParameter)this.paramPlusIV.getParameters();
      if (this.forWrapping) {
        if (this.iv == null || this.iv.length != 8)
          throw new IllegalArgumentException("IV is not 8 octets"); 
      } else {
        throw new IllegalArgumentException("You should not supply an IV for unwrapping");
      } 
    } 
  }
  
  public String getAlgorithmName() {
    return "DESede";
  }
  
  public byte[] wrap(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (!this.forWrapping)
      throw new IllegalStateException("Not initialized for wrapping"); 
    byte[] arrayOfByte1 = new byte[paramInt2];
    System.arraycopy(paramArrayOfbyte, paramInt1, arrayOfByte1, 0, paramInt2);
    byte[] arrayOfByte2 = calculateCMSKeyChecksum(arrayOfByte1);
    byte[] arrayOfByte3 = new byte[arrayOfByte1.length + arrayOfByte2.length];
    System.arraycopy(arrayOfByte1, 0, arrayOfByte3, 0, arrayOfByte1.length);
    System.arraycopy(arrayOfByte2, 0, arrayOfByte3, arrayOfByte1.length, arrayOfByte2.length);
    int i = this.engine.getBlockSize();
    if (arrayOfByte3.length % i != 0)
      throw new IllegalStateException("Not multiple of block length"); 
    this.engine.init(true, (CipherParameters)this.paramPlusIV);
    byte[] arrayOfByte4 = new byte[arrayOfByte3.length];
    int j;
    for (j = 0; j != arrayOfByte3.length; j += i)
      this.engine.processBlock(arrayOfByte3, j, arrayOfByte4, j); 
    byte[] arrayOfByte5 = new byte[this.iv.length + arrayOfByte4.length];
    System.arraycopy(this.iv, 0, arrayOfByte5, 0, this.iv.length);
    System.arraycopy(arrayOfByte4, 0, arrayOfByte5, this.iv.length, arrayOfByte4.length);
    Arrays.reverseInPlace(arrayOfByte5);
    ParametersWithIV parametersWithIV = new ParametersWithIV((CipherParameters)this.param, IV2);
    this.engine.init(true, (CipherParameters)parametersWithIV);
    int k;
    for (k = 0; k != arrayOfByte5.length; k += i)
      this.engine.processBlock(arrayOfByte5, k, arrayOfByte5, k); 
    return arrayOfByte5;
  }
  
  public byte[] unwrap(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws InvalidCipherTextException {
    if (this.forWrapping)
      throw new IllegalStateException("Not set for unwrapping"); 
    if (paramArrayOfbyte == null)
      throw new InvalidCipherTextException("Null pointer as ciphertext"); 
    int i = this.engine.getBlockSize();
    if (paramInt2 % i != 0)
      throw new InvalidCipherTextException("Ciphertext not multiple of " + i); 
    ParametersWithIV parametersWithIV = new ParametersWithIV((CipherParameters)this.param, IV2);
    this.engine.init(false, (CipherParameters)parametersWithIV);
    byte[] arrayOfByte1 = new byte[paramInt2];
    int j;
    for (j = 0; j != paramInt2; j += i)
      this.engine.processBlock(paramArrayOfbyte, paramInt1 + j, arrayOfByte1, j); 
    Arrays.reverseInPlace(arrayOfByte1);
    this.iv = new byte[8];
    byte[] arrayOfByte2 = new byte[arrayOfByte1.length - 8];
    System.arraycopy(arrayOfByte1, 0, this.iv, 0, 8);
    System.arraycopy(arrayOfByte1, 8, arrayOfByte2, 0, arrayOfByte1.length - 8);
    this.paramPlusIV = new ParametersWithIV((CipherParameters)this.param, this.iv);
    this.engine.init(false, (CipherParameters)this.paramPlusIV);
    byte[] arrayOfByte3 = new byte[arrayOfByte2.length];
    int k;
    for (k = 0; k != arrayOfByte3.length; k += i)
      this.engine.processBlock(arrayOfByte2, k, arrayOfByte3, k); 
    byte[] arrayOfByte4 = new byte[arrayOfByte3.length - 8];
    byte[] arrayOfByte5 = new byte[8];
    System.arraycopy(arrayOfByte3, 0, arrayOfByte4, 0, arrayOfByte3.length - 8);
    System.arraycopy(arrayOfByte3, arrayOfByte3.length - 8, arrayOfByte5, 0, 8);
    if (!checkCMSKeyChecksum(arrayOfByte4, arrayOfByte5))
      throw new InvalidCipherTextException("Checksum inside ciphertext is corrupted"); 
    return arrayOfByte4;
  }
  
  private byte[] calculateCMSKeyChecksum(byte[] paramArrayOfbyte) {
    byte[] arrayOfByte = new byte[8];
    this.sha1.update(paramArrayOfbyte, 0, paramArrayOfbyte.length);
    this.sha1.doFinal(this.digest, 0);
    System.arraycopy(this.digest, 0, arrayOfByte, 0, 8);
    return arrayOfByte;
  }
  
  private boolean checkCMSKeyChecksum(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    return Arrays.constantTimeAreEqual(calculateCMSKeyChecksum(paramArrayOfbyte1), paramArrayOfbyte2);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\engines\DESedeWrapEngine.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */