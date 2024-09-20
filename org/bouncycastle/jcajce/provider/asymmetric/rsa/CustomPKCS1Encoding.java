package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Properties;

class CustomPKCS1Encoding implements AsymmetricBlockCipher {
  private static final int HEADER_LENGTH = 10;
  
  private SecureRandom random;
  
  private AsymmetricBlockCipher engine;
  
  private boolean forEncryption;
  
  private boolean forPrivateKey;
  
  private boolean useStrictLength;
  
  private byte[] blockBuffer;
  
  CustomPKCS1Encoding(AsymmetricBlockCipher paramAsymmetricBlockCipher) {
    this.engine = paramAsymmetricBlockCipher;
    this.useStrictLength = useStrict();
  }
  
  private boolean useStrict() {
    return Properties.isOverrideSetTo("org.bouncycastle.pkcs1.not_strict", true) ? false : (!Properties.isOverrideSetTo("org.bouncycastle.pkcs1.strict", false));
  }
  
  public AsymmetricBlockCipher getUnderlyingCipher() {
    return this.engine;
  }
  
  public void init(boolean paramBoolean, CipherParameters paramCipherParameters) {
    AsymmetricKeyParameter asymmetricKeyParameter;
    if (paramCipherParameters instanceof ParametersWithRandom) {
      ParametersWithRandom parametersWithRandom = (ParametersWithRandom)paramCipherParameters;
      this.random = parametersWithRandom.getRandom();
      asymmetricKeyParameter = (AsymmetricKeyParameter)parametersWithRandom.getParameters();
    } else {
      asymmetricKeyParameter = (AsymmetricKeyParameter)paramCipherParameters;
      if (!asymmetricKeyParameter.isPrivate() && paramBoolean)
        this.random = CryptoServicesRegistrar.getSecureRandom(); 
    } 
    this.engine.init(paramBoolean, paramCipherParameters);
    this.forPrivateKey = asymmetricKeyParameter.isPrivate();
    this.forEncryption = paramBoolean;
    this.blockBuffer = new byte[this.engine.getOutputBlockSize()];
  }
  
  public int getInputBlockSize() {
    int i = this.engine.getInputBlockSize();
    return this.forEncryption ? (i - 10) : i;
  }
  
  public int getOutputBlockSize() {
    int i = this.engine.getOutputBlockSize();
    return this.forEncryption ? i : (i - 10);
  }
  
  public byte[] processBlock(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws InvalidCipherTextException {
    return this.forEncryption ? encodeBlock(paramArrayOfbyte, paramInt1, paramInt2) : decodeBlock(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  private byte[] encodeBlock(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws InvalidCipherTextException {
    if (paramInt2 > getInputBlockSize())
      throw new IllegalArgumentException("input data too large"); 
    byte[] arrayOfByte = new byte[this.engine.getInputBlockSize()];
    if (this.forPrivateKey) {
      arrayOfByte[0] = 1;
      for (byte b = 1; b != arrayOfByte.length - paramInt2 - 1; b++)
        arrayOfByte[b] = -1; 
    } else {
      this.random.nextBytes(arrayOfByte);
      arrayOfByte[0] = 2;
      for (byte b = 1; b != arrayOfByte.length - paramInt2 - 1; b++) {
        while (arrayOfByte[b] == 0)
          arrayOfByte[b] = (byte)this.random.nextInt(); 
      } 
    } 
    arrayOfByte[arrayOfByte.length - paramInt2 - 1] = 0;
    System.arraycopy(paramArrayOfbyte, paramInt1, arrayOfByte, arrayOfByte.length - paramInt2, paramInt2);
    return this.engine.processBlock(arrayOfByte, 0, arrayOfByte.length);
  }
  
  private static int checkPkcs1Encoding1(byte[] paramArrayOfbyte) {
    int i = 0;
    int j = 0;
    int k = -(paramArrayOfbyte[0] & 0xFF ^ 0x1);
    int m;
    for (m = 1; m < paramArrayOfbyte.length; m++) {
      int n = paramArrayOfbyte[m] & 0xFF;
      int i1 = (n ^ 0x0) - 1 >> 31;
      int i2 = (n ^ 0xFF) - 1 >> 31;
      j ^= m & (i ^ 0xFFFFFFFF) & i1;
      i |= i1;
      k |= (i | i2) ^ 0xFFFFFFFF;
    } 
    k |= j - 9;
    m = paramArrayOfbyte.length - 1 - j;
    return m | k >> 31;
  }
  
  private static int checkPkcs1Encoding2(byte[] paramArrayOfbyte) {
    int i = 0;
    int j = 0;
    int k = -(paramArrayOfbyte[0] & 0xFF ^ 0x2);
    int m;
    for (m = 1; m < paramArrayOfbyte.length; m++) {
      int n = paramArrayOfbyte[m] & 0xFF;
      int i1 = (n ^ 0x0) - 1 >> 31;
      j ^= m & (i ^ 0xFFFFFFFF) & i1;
      i |= i1;
    } 
    k |= j - 9;
    m = paramArrayOfbyte.length - 1 - j;
    return m | k >> 31;
  }
  
  private byte[] decodeBlock(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws InvalidCipherTextException {
    int i = this.engine.getOutputBlockSize();
    byte[] arrayOfByte1 = this.engine.processBlock(paramArrayOfbyte, paramInt1, paramInt2);
    int j = this.useStrictLength & ((arrayOfByte1.length != i) ? 1 : 0);
    byte[] arrayOfByte2 = arrayOfByte1;
    if (arrayOfByte1.length < i)
      arrayOfByte2 = this.blockBuffer; 
    int k = this.forPrivateKey ? checkPkcs1Encoding2(arrayOfByte2) : checkPkcs1Encoding1(arrayOfByte2);
    try {
      if ((((k < 0) ? 1 : 0) | j) != 0)
        return null; 
      byte[] arrayOfByte = new byte[k];
      System.arraycopy(arrayOfByte2, arrayOfByte2.length - k, arrayOfByte, 0, k);
      return arrayOfByte;
    } finally {
      Arrays.fill(arrayOfByte1, (byte)0);
      Arrays.fill(this.blockBuffer, 0, Math.max(0, this.blockBuffer.length - arrayOfByte1.length), (byte)0);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\provider\asymmetric\rsa\CustomPKCS1Encoding.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */