package org.bouncycastle.crypto.encodings;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Properties;

public class PKCS1Encoding implements AsymmetricBlockCipher {
  public static final String STRICT_LENGTH_ENABLED_PROPERTY = "org.bouncycastle.pkcs1.strict";
  
  public static final String NOT_STRICT_LENGTH_ENABLED_PROPERTY = "org.bouncycastle.pkcs1.not_strict";
  
  private static final int HEADER_LENGTH = 10;
  
  private SecureRandom random;
  
  private AsymmetricBlockCipher engine;
  
  private boolean forEncryption;
  
  private boolean forPrivateKey;
  
  private boolean useStrictLength;
  
  private int pLen = -1;
  
  private byte[] fallback = null;
  
  private byte[] blockBuffer;
  
  public PKCS1Encoding(AsymmetricBlockCipher paramAsymmetricBlockCipher) {
    this.engine = paramAsymmetricBlockCipher;
    this.useStrictLength = useStrict();
  }
  
  public PKCS1Encoding(AsymmetricBlockCipher paramAsymmetricBlockCipher, int paramInt) {
    this.engine = paramAsymmetricBlockCipher;
    this.useStrictLength = useStrict();
    this.pLen = paramInt;
  }
  
  public PKCS1Encoding(AsymmetricBlockCipher paramAsymmetricBlockCipher, byte[] paramArrayOfbyte) {
    this.engine = paramAsymmetricBlockCipher;
    this.useStrictLength = useStrict();
    this.fallback = paramArrayOfbyte;
    this.pLen = paramArrayOfbyte.length;
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
    if (this.pLen > 0 && this.fallback == null && this.random == null)
      throw new IllegalArgumentException("encoder requires random"); 
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
  
  private static int checkPkcs1Encoding2(byte[] paramArrayOfbyte, int paramInt) {
    int i = -(paramArrayOfbyte[0] & 0xFF ^ 0x2);
    int j = paramArrayOfbyte.length - 1 - paramInt;
    i |= j - 9;
    for (byte b = 1; b < j; b++)
      i |= (paramArrayOfbyte[b] & 0xFF) - 1; 
    i |= -(paramArrayOfbyte[j] & 0xFF);
    return i >> 31;
  }
  
  private byte[] decodeBlockOrRandom(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws InvalidCipherTextException {
    if (!this.forPrivateKey)
      throw new InvalidCipherTextException("sorry, this method is only for decryption, not for signing"); 
    int i = this.pLen;
    byte[] arrayOfByte1 = this.fallback;
    if (this.fallback == null) {
      arrayOfByte1 = new byte[i];
      this.random.nextBytes(arrayOfByte1);
    } 
    int j = 0;
    int k = this.engine.getOutputBlockSize();
    byte[] arrayOfByte2 = this.engine.processBlock(paramArrayOfbyte, paramInt1, paramInt2);
    byte[] arrayOfByte3 = arrayOfByte2;
    if (arrayOfByte2.length != k && (this.useStrictLength || arrayOfByte2.length < k))
      arrayOfByte3 = this.blockBuffer; 
    j |= checkPkcs1Encoding2(arrayOfByte3, i);
    int m = arrayOfByte3.length - i;
    byte[] arrayOfByte4 = new byte[i];
    for (byte b = 0; b < i; b++)
      arrayOfByte4[b] = (byte)(arrayOfByte3[m + b] & (j ^ 0xFFFFFFFF) | arrayOfByte1[b] & j); 
    Arrays.fill(arrayOfByte2, (byte)0);
    Arrays.fill(this.blockBuffer, 0, Math.max(0, this.blockBuffer.length - arrayOfByte2.length), (byte)0);
    return arrayOfByte4;
  }
  
  private byte[] decodeBlock(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws InvalidCipherTextException {
    if (this.forPrivateKey && this.pLen != -1)
      return decodeBlockOrRandom(paramArrayOfbyte, paramInt1, paramInt2); 
    int i = this.engine.getOutputBlockSize();
    byte[] arrayOfByte1 = this.engine.processBlock(paramArrayOfbyte, paramInt1, paramInt2);
    int j = this.useStrictLength & ((arrayOfByte1.length != i) ? 1 : 0);
    byte[] arrayOfByte2 = arrayOfByte1;
    if (arrayOfByte1.length < i)
      arrayOfByte2 = this.blockBuffer; 
    int k = this.forPrivateKey ? checkPkcs1Encoding2(arrayOfByte2) : checkPkcs1Encoding1(arrayOfByte2);
    try {
      if (k < 0)
        throw new InvalidCipherTextException("block incorrect"); 
      if (j != 0)
        throw new InvalidCipherTextException("block incorrect size"); 
      byte[] arrayOfByte = new byte[k];
      System.arraycopy(arrayOfByte2, arrayOfByte2.length - k, arrayOfByte, 0, k);
      return arrayOfByte;
    } finally {
      Arrays.fill(arrayOfByte1, (byte)0);
      Arrays.fill(this.blockBuffer, 0, Math.max(0, this.blockBuffer.length - arrayOfByte1.length), (byte)0);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\encodings\PKCS1Encoding.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */