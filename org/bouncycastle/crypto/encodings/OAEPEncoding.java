package org.bouncycastle.crypto.encodings;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.util.DigestFactory;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Bytes;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

public class OAEPEncoding implements AsymmetricBlockCipher {
  private final AsymmetricBlockCipher engine;
  
  private final Digest mgf1Hash;
  
  private final int mgf1NoMemoLimit;
  
  private final byte[] defHash;
  
  private SecureRandom random;
  
  private boolean forEncryption;
  
  private static int getMGF1NoMemoLimit(Digest paramDigest) {
    return (paramDigest instanceof Memoable && paramDigest instanceof ExtendedDigest) ? (((ExtendedDigest)paramDigest).getByteLength() - 1) : Integer.MAX_VALUE;
  }
  
  public OAEPEncoding(AsymmetricBlockCipher paramAsymmetricBlockCipher) {
    this(paramAsymmetricBlockCipher, DigestFactory.createSHA1(), null);
  }
  
  public OAEPEncoding(AsymmetricBlockCipher paramAsymmetricBlockCipher, Digest paramDigest) {
    this(paramAsymmetricBlockCipher, paramDigest, null);
  }
  
  public OAEPEncoding(AsymmetricBlockCipher paramAsymmetricBlockCipher, Digest paramDigest, byte[] paramArrayOfbyte) {
    this(paramAsymmetricBlockCipher, paramDigest, paramDigest, paramArrayOfbyte);
  }
  
  public OAEPEncoding(AsymmetricBlockCipher paramAsymmetricBlockCipher, Digest paramDigest1, Digest paramDigest2, byte[] paramArrayOfbyte) {
    this.engine = paramAsymmetricBlockCipher;
    this.mgf1Hash = paramDigest2;
    this.mgf1NoMemoLimit = getMGF1NoMemoLimit(paramDigest2);
    this.defHash = new byte[paramDigest1.getDigestSize()];
    paramDigest1.reset();
    if (paramArrayOfbyte != null)
      paramDigest1.update(paramArrayOfbyte, 0, paramArrayOfbyte.length); 
    paramDigest1.doFinal(this.defHash, 0);
  }
  
  public AsymmetricBlockCipher getUnderlyingCipher() {
    return this.engine;
  }
  
  public void init(boolean paramBoolean, CipherParameters paramCipherParameters) {
    SecureRandom secureRandom = null;
    if (paramCipherParameters instanceof ParametersWithRandom) {
      ParametersWithRandom parametersWithRandom = (ParametersWithRandom)paramCipherParameters;
      secureRandom = parametersWithRandom.getRandom();
    } 
    this.random = paramBoolean ? CryptoServicesRegistrar.getSecureRandom(secureRandom) : null;
    this.forEncryption = paramBoolean;
    this.engine.init(paramBoolean, paramCipherParameters);
  }
  
  public int getInputBlockSize() {
    int i = this.engine.getInputBlockSize();
    return this.forEncryption ? (i - 1 - 2 * this.defHash.length) : i;
  }
  
  public int getOutputBlockSize() {
    int i = this.engine.getOutputBlockSize();
    return this.forEncryption ? i : (i - 1 - 2 * this.defHash.length);
  }
  
  public byte[] processBlock(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws InvalidCipherTextException {
    return this.forEncryption ? encodeBlock(paramArrayOfbyte, paramInt1, paramInt2) : decodeBlock(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public byte[] encodeBlock(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws InvalidCipherTextException {
    int i = getInputBlockSize();
    if (paramInt2 > i)
      throw new DataLengthException("input data too long"); 
    byte[] arrayOfByte1 = new byte[i + 1 + 2 * this.defHash.length];
    System.arraycopy(paramArrayOfbyte, paramInt1, arrayOfByte1, arrayOfByte1.length - paramInt2, paramInt2);
    arrayOfByte1[arrayOfByte1.length - paramInt2 - 1] = 1;
    System.arraycopy(this.defHash, 0, arrayOfByte1, this.defHash.length, this.defHash.length);
    byte[] arrayOfByte2 = new byte[this.defHash.length];
    this.random.nextBytes(arrayOfByte2);
    System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, this.defHash.length);
    this.mgf1Hash.reset();
    maskGeneratorFunction1(arrayOfByte2, 0, arrayOfByte2.length, arrayOfByte1, this.defHash.length, arrayOfByte1.length - this.defHash.length);
    maskGeneratorFunction1(arrayOfByte1, this.defHash.length, arrayOfByte1.length - this.defHash.length, arrayOfByte1, 0, this.defHash.length);
    return this.engine.processBlock(arrayOfByte1, 0, arrayOfByte1.length);
  }
  
  public byte[] decodeBlock(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws InvalidCipherTextException {
    int i = getOutputBlockSize() >> 31;
    byte[] arrayOfByte1 = new byte[this.engine.getOutputBlockSize()];
    byte[] arrayOfByte2 = this.engine.processBlock(paramArrayOfbyte, paramInt1, paramInt2);
    i |= arrayOfByte1.length - arrayOfByte2.length >> 31;
    int k = Math.min(arrayOfByte1.length, arrayOfByte2.length);
    System.arraycopy(arrayOfByte2, 0, arrayOfByte1, arrayOfByte1.length - k, k);
    Arrays.fill(arrayOfByte2, (byte)0);
    this.mgf1Hash.reset();
    maskGeneratorFunction1(arrayOfByte1, this.defHash.length, arrayOfByte1.length - this.defHash.length, arrayOfByte1, 0, this.defHash.length);
    maskGeneratorFunction1(arrayOfByte1, 0, this.defHash.length, arrayOfByte1, this.defHash.length, arrayOfByte1.length - this.defHash.length);
    int j;
    for (j = 0; j != this.defHash.length; j++)
      i |= this.defHash[j] ^ arrayOfByte1[this.defHash.length + j]; 
    j = -1;
    for (k = 2 * this.defHash.length; k != arrayOfByte1.length; k++) {
      int m = arrayOfByte1[k] & 0xFF;
      int n = (-m & j) >> 31;
      j += k & n;
    } 
    i |= j >> 31;
    i |= arrayOfByte1[++j] ^ 0x1;
    if (i != 0) {
      Arrays.fill(arrayOfByte1, (byte)0);
      throw new InvalidCipherTextException("data wrong");
    } 
    byte[] arrayOfByte3 = new byte[arrayOfByte1.length - ++j];
    System.arraycopy(arrayOfByte1, j, arrayOfByte3, 0, arrayOfByte3.length);
    Arrays.fill(arrayOfByte1, (byte)0);
    return arrayOfByte3;
  }
  
  private void maskGeneratorFunction1(byte[] paramArrayOfbyte1, int paramInt1, int paramInt2, byte[] paramArrayOfbyte2, int paramInt3, int paramInt4) {
    int i = this.mgf1Hash.getDigestSize();
    byte[] arrayOfByte1 = new byte[i];
    byte[] arrayOfByte2 = new byte[4];
    byte b = 0;
    int j = paramInt3 + paramInt4;
    int k = j - i;
    int m = paramInt3;
    this.mgf1Hash.update(paramArrayOfbyte1, paramInt1, paramInt2);
    if (paramInt2 > this.mgf1NoMemoLimit) {
      Memoable memoable1 = (Memoable)this.mgf1Hash;
      Memoable memoable2 = memoable1.copy();
      while (m < k) {
        Pack.intToBigEndian(b++, arrayOfByte2, 0);
        this.mgf1Hash.update(arrayOfByte2, 0, arrayOfByte2.length);
        this.mgf1Hash.doFinal(arrayOfByte1, 0);
        memoable1.reset(memoable2);
        Bytes.xorTo(i, arrayOfByte1, 0, paramArrayOfbyte2, m);
        m += i;
      } 
    } else {
      while (m < k) {
        Pack.intToBigEndian(b++, arrayOfByte2, 0);
        this.mgf1Hash.update(arrayOfByte2, 0, arrayOfByte2.length);
        this.mgf1Hash.doFinal(arrayOfByte1, 0);
        this.mgf1Hash.update(paramArrayOfbyte1, paramInt1, paramInt2);
        Bytes.xorTo(i, arrayOfByte1, 0, paramArrayOfbyte2, m);
        m += i;
      } 
    } 
    Pack.intToBigEndian(b, arrayOfByte2, 0);
    this.mgf1Hash.update(arrayOfByte2, 0, arrayOfByte2.length);
    this.mgf1Hash.doFinal(arrayOfByte1, 0);
    Bytes.xorTo(j - m, arrayOfByte1, 0, paramArrayOfbyte2, m);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\encodings\OAEPEncoding.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */