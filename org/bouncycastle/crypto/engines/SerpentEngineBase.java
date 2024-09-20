package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;

public abstract class SerpentEngineBase implements BlockCipher {
  protected static final int BLOCK_SIZE = 16;
  
  static final int ROUNDS = 32;
  
  static final int PHI = -1640531527;
  
  protected boolean encrypting;
  
  protected int[] wKey;
  
  protected int keyBits;
  
  SerpentEngineBase() {
    CryptoServicesRegistrar.checkConstraints((CryptoServiceProperties)new DefaultServiceProperties(getAlgorithmName(), 256));
  }
  
  public void init(boolean paramBoolean, CipherParameters paramCipherParameters) {
    if (paramCipherParameters instanceof KeyParameter) {
      this.encrypting = paramBoolean;
      byte[] arrayOfByte = ((KeyParameter)paramCipherParameters).getKey();
      this.wKey = makeWorkingKey(arrayOfByte);
      CryptoServicesRegistrar.checkConstraints((CryptoServiceProperties)new DefaultServiceProperties(getAlgorithmName(), arrayOfByte.length * 8, paramCipherParameters, getPurpose()));
      return;
    } 
    throw new IllegalArgumentException("invalid parameter passed to " + getAlgorithmName() + " init - " + paramCipherParameters.getClass().getName());
  }
  
  public String getAlgorithmName() {
    return "Serpent";
  }
  
  public int getBlockSize() {
    return 16;
  }
  
  public final int processBlock(byte[] paramArrayOfbyte1, int paramInt1, byte[] paramArrayOfbyte2, int paramInt2) {
    if (this.wKey == null)
      throw new IllegalStateException(getAlgorithmName() + " not initialised"); 
    if (paramInt1 + 16 > paramArrayOfbyte1.length)
      throw new DataLengthException("input buffer too short"); 
    if (paramInt2 + 16 > paramArrayOfbyte2.length)
      throw new OutputLengthException("output buffer too short"); 
    if (this.encrypting) {
      encryptBlock(paramArrayOfbyte1, paramInt1, paramArrayOfbyte2, paramInt2);
    } else {
      decryptBlock(paramArrayOfbyte1, paramInt1, paramArrayOfbyte2, paramInt2);
    } 
    return 16;
  }
  
  public void reset() {}
  
  protected static int rotateLeft(int paramInt1, int paramInt2) {
    return paramInt1 << paramInt2 | paramInt1 >>> -paramInt2;
  }
  
  protected static int rotateRight(int paramInt1, int paramInt2) {
    return paramInt1 >>> paramInt2 | paramInt1 << -paramInt2;
  }
  
  protected final void sb0(int[] paramArrayOfint, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramInt1 ^ paramInt4;
    int j = paramInt3 ^ i;
    int k = paramInt2 ^ j;
    paramArrayOfint[3] = paramInt1 & paramInt4 ^ k;
    int m = paramInt1 ^ paramInt2 & i;
    paramArrayOfint[2] = k ^ (paramInt3 | m);
    int n = paramArrayOfint[3] & (j ^ m);
    paramArrayOfint[1] = j ^ 0xFFFFFFFF ^ n;
    paramArrayOfint[0] = n ^ m ^ 0xFFFFFFFF;
  }
  
  protected final void ib0(int[] paramArrayOfint, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramInt1 ^ 0xFFFFFFFF;
    int j = paramInt1 ^ paramInt2;
    int k = paramInt4 ^ (i | j);
    int m = paramInt3 ^ k;
    paramArrayOfint[2] = j ^ m;
    int n = i ^ paramInt4 & j;
    paramArrayOfint[1] = k ^ paramArrayOfint[2] & n;
    paramArrayOfint[3] = paramInt1 & k ^ (m | paramArrayOfint[1]);
    paramArrayOfint[0] = paramArrayOfint[3] ^ m ^ n;
  }
  
  protected final void sb1(int[] paramArrayOfint, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramInt2 ^ paramInt1 ^ 0xFFFFFFFF;
    int j = paramInt3 ^ (paramInt1 | i);
    paramArrayOfint[2] = paramInt4 ^ j;
    int k = paramInt2 ^ (paramInt4 | i);
    int m = i ^ paramArrayOfint[2];
    paramArrayOfint[3] = m ^ j & k;
    int n = j ^ k;
    paramArrayOfint[1] = paramArrayOfint[3] ^ n;
    paramArrayOfint[0] = j ^ m & n;
  }
  
  protected final void ib1(int[] paramArrayOfint, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramInt2 ^ paramInt4;
    int j = paramInt1 ^ paramInt2 & i;
    int k = i ^ j;
    paramArrayOfint[3] = paramInt3 ^ k;
    int m = paramInt2 ^ i & j;
    int n = paramArrayOfint[3] | m;
    paramArrayOfint[1] = j ^ n;
    int i1 = paramArrayOfint[1] ^ 0xFFFFFFFF;
    int i2 = paramArrayOfint[3] ^ m;
    paramArrayOfint[0] = i1 ^ i2;
    paramArrayOfint[2] = k ^ (i1 | i2);
  }
  
  protected final void sb2(int[] paramArrayOfint, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramInt1 ^ 0xFFFFFFFF;
    int j = paramInt2 ^ paramInt4;
    int k = paramInt3 & i;
    paramArrayOfint[0] = j ^ k;
    int m = paramInt3 ^ i;
    int n = paramInt3 ^ paramArrayOfint[0];
    int i1 = paramInt2 & n;
    paramArrayOfint[3] = m ^ i1;
    paramArrayOfint[2] = paramInt1 ^ (paramInt4 | i1) & (paramArrayOfint[0] | m);
    paramArrayOfint[1] = j ^ paramArrayOfint[3] ^ paramArrayOfint[2] ^ (paramInt4 | i);
  }
  
  protected final void ib2(int[] paramArrayOfint, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramInt2 ^ paramInt4;
    int j = i ^ 0xFFFFFFFF;
    int k = paramInt1 ^ paramInt3;
    int m = paramInt3 ^ i;
    int n = paramInt2 & m;
    paramArrayOfint[0] = k ^ n;
    int i1 = paramInt1 | j;
    int i2 = paramInt4 ^ i1;
    int i3 = k | i2;
    paramArrayOfint[3] = i ^ i3;
    int i4 = m ^ 0xFFFFFFFF;
    int i5 = paramArrayOfint[0] | paramArrayOfint[3];
    paramArrayOfint[1] = i4 ^ i5;
    paramArrayOfint[2] = paramInt4 & i4 ^ k ^ i5;
  }
  
  protected final void sb3(int[] paramArrayOfint, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramInt1 ^ paramInt2;
    int j = paramInt1 & paramInt3;
    int k = paramInt1 | paramInt4;
    int m = paramInt3 ^ paramInt4;
    int n = i & k;
    int i1 = j | n;
    paramArrayOfint[2] = m ^ i1;
    int i2 = paramInt2 ^ k;
    int i3 = i1 ^ i2;
    int i4 = m & i3;
    paramArrayOfint[0] = i ^ i4;
    int i5 = paramArrayOfint[2] & paramArrayOfint[0];
    paramArrayOfint[1] = i3 ^ i5;
    paramArrayOfint[3] = (paramInt2 | paramInt4) ^ m ^ i5;
  }
  
  protected final void ib3(int[] paramArrayOfint, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramInt1 | paramInt2;
    int j = paramInt2 ^ paramInt3;
    int k = paramInt2 & j;
    int m = paramInt1 ^ k;
    int n = paramInt3 ^ m;
    int i1 = paramInt4 | m;
    paramArrayOfint[0] = j ^ i1;
    int i2 = j | i1;
    int i3 = paramInt4 ^ i2;
    paramArrayOfint[2] = n ^ i3;
    int i4 = i ^ i3;
    int i5 = paramArrayOfint[0] & i4;
    paramArrayOfint[3] = m ^ i5;
    paramArrayOfint[1] = paramArrayOfint[3] ^ paramArrayOfint[0] ^ i4;
  }
  
  protected final void sb4(int[] paramArrayOfint, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramInt1 ^ paramInt4;
    int j = paramInt4 & i;
    int k = paramInt3 ^ j;
    int m = paramInt2 | k;
    paramArrayOfint[3] = i ^ m;
    int n = paramInt2 ^ 0xFFFFFFFF;
    int i1 = i | n;
    paramArrayOfint[0] = k ^ i1;
    int i2 = paramInt1 & paramArrayOfint[0];
    int i3 = i ^ n;
    int i4 = m & i3;
    paramArrayOfint[2] = i2 ^ i4;
    paramArrayOfint[1] = paramInt1 ^ k ^ i3 & paramArrayOfint[2];
  }
  
  protected final void ib4(int[] paramArrayOfint, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramInt3 | paramInt4;
    int j = paramInt1 & i;
    int k = paramInt2 ^ j;
    int m = paramInt1 & k;
    int n = paramInt3 ^ m;
    paramArrayOfint[1] = paramInt4 ^ n;
    int i1 = paramInt1 ^ 0xFFFFFFFF;
    int i2 = n & paramArrayOfint[1];
    paramArrayOfint[3] = k ^ i2;
    int i3 = paramArrayOfint[1] | i1;
    int i4 = paramInt4 ^ i3;
    paramArrayOfint[0] = paramArrayOfint[3] ^ i4;
    paramArrayOfint[2] = k & i4 ^ paramArrayOfint[1] ^ i1;
  }
  
  protected final void sb5(int[] paramArrayOfint, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramInt1 ^ 0xFFFFFFFF;
    int j = paramInt1 ^ paramInt2;
    int k = paramInt1 ^ paramInt4;
    int m = paramInt3 ^ i;
    int n = j | k;
    paramArrayOfint[0] = m ^ n;
    int i1 = paramInt4 & paramArrayOfint[0];
    int i2 = j ^ paramArrayOfint[0];
    paramArrayOfint[1] = i1 ^ i2;
    int i3 = i | paramArrayOfint[0];
    int i4 = j | i1;
    int i5 = k ^ i3;
    paramArrayOfint[2] = i4 ^ i5;
    paramArrayOfint[3] = paramInt2 ^ i1 ^ paramArrayOfint[1] & i5;
  }
  
  protected final void ib5(int[] paramArrayOfint, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramInt3 ^ 0xFFFFFFFF;
    int j = paramInt2 & i;
    int k = paramInt4 ^ j;
    int m = paramInt1 & k;
    int n = paramInt2 ^ i;
    paramArrayOfint[3] = m ^ n;
    int i1 = paramInt2 | paramArrayOfint[3];
    int i2 = paramInt1 & i1;
    paramArrayOfint[1] = k ^ i2;
    int i3 = paramInt1 | paramInt4;
    int i4 = i ^ i1;
    paramArrayOfint[0] = i3 ^ i4;
    paramArrayOfint[2] = paramInt2 & i3 ^ (m | paramInt1 ^ paramInt3);
  }
  
  protected final void sb6(int[] paramArrayOfint, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramInt1 ^ 0xFFFFFFFF;
    int j = paramInt1 ^ paramInt4;
    int k = paramInt2 ^ j;
    int m = i | j;
    int n = paramInt3 ^ m;
    paramArrayOfint[1] = paramInt2 ^ n;
    int i1 = j | paramArrayOfint[1];
    int i2 = paramInt4 ^ i1;
    int i3 = n & i2;
    paramArrayOfint[2] = k ^ i3;
    int i4 = n ^ i2;
    paramArrayOfint[0] = paramArrayOfint[2] ^ i4;
    paramArrayOfint[3] = n ^ 0xFFFFFFFF ^ k & i4;
  }
  
  protected final void ib6(int[] paramArrayOfint, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramInt1 ^ 0xFFFFFFFF;
    int j = paramInt1 ^ paramInt2;
    int k = paramInt3 ^ j;
    int m = paramInt3 | i;
    int n = paramInt4 ^ m;
    paramArrayOfint[1] = k ^ n;
    int i1 = k & n;
    int i2 = j ^ i1;
    int i3 = paramInt2 | i2;
    paramArrayOfint[3] = n ^ i3;
    int i4 = paramInt2 | paramArrayOfint[3];
    paramArrayOfint[0] = i2 ^ i4;
    paramArrayOfint[2] = paramInt4 & i ^ k ^ i4;
  }
  
  protected final void sb7(int[] paramArrayOfint, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramInt2 ^ paramInt3;
    int j = paramInt3 & i;
    int k = paramInt4 ^ j;
    int m = paramInt1 ^ k;
    int n = paramInt4 | i;
    int i1 = m & n;
    paramArrayOfint[1] = paramInt2 ^ i1;
    int i2 = k | paramArrayOfint[1];
    int i3 = paramInt1 & m;
    paramArrayOfint[3] = i ^ i3;
    int i4 = m ^ i2;
    int i5 = paramArrayOfint[3] & i4;
    paramArrayOfint[2] = k ^ i5;
    paramArrayOfint[0] = i4 ^ 0xFFFFFFFF ^ paramArrayOfint[3] & paramArrayOfint[2];
  }
  
  protected final void ib7(int[] paramArrayOfint, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramInt3 | paramInt1 & paramInt2;
    int j = paramInt4 & (paramInt1 | paramInt2);
    paramArrayOfint[3] = i ^ j;
    int k = paramInt4 ^ 0xFFFFFFFF;
    int m = paramInt2 ^ j;
    int n = m | paramArrayOfint[3] ^ k;
    paramArrayOfint[1] = paramInt1 ^ n;
    paramArrayOfint[0] = paramInt3 ^ m ^ (paramInt4 | paramArrayOfint[1]);
    paramArrayOfint[2] = i ^ paramArrayOfint[1] ^ paramArrayOfint[0] ^ paramInt1 & paramArrayOfint[3];
  }
  
  protected final void LT(int[] paramArrayOfint) {
    int i = rotateLeft(paramArrayOfint[0], 13);
    int j = rotateLeft(paramArrayOfint[2], 3);
    int k = paramArrayOfint[1] ^ i ^ j;
    int m = paramArrayOfint[3] ^ j ^ i << 3;
    paramArrayOfint[1] = rotateLeft(k, 1);
    paramArrayOfint[3] = rotateLeft(m, 7);
    paramArrayOfint[0] = rotateLeft(i ^ paramArrayOfint[1] ^ paramArrayOfint[3], 5);
    paramArrayOfint[2] = rotateLeft(j ^ paramArrayOfint[3] ^ paramArrayOfint[1] << 7, 22);
  }
  
  protected final void inverseLT(int[] paramArrayOfint) {
    int i = rotateRight(paramArrayOfint[2], 22) ^ paramArrayOfint[3] ^ paramArrayOfint[1] << 7;
    int j = rotateRight(paramArrayOfint[0], 5) ^ paramArrayOfint[1] ^ paramArrayOfint[3];
    int k = rotateRight(paramArrayOfint[3], 7);
    int m = rotateRight(paramArrayOfint[1], 1);
    paramArrayOfint[3] = k ^ i ^ j << 3;
    paramArrayOfint[1] = m ^ j ^ i;
    paramArrayOfint[2] = rotateRight(i, 3);
    paramArrayOfint[0] = rotateRight(j, 13);
  }
  
  protected abstract int[] makeWorkingKey(byte[] paramArrayOfbyte);
  
  protected abstract void encryptBlock(byte[] paramArrayOfbyte1, int paramInt1, byte[] paramArrayOfbyte2, int paramInt2);
  
  protected abstract void decryptBlock(byte[] paramArrayOfbyte1, int paramInt1, byte[] paramArrayOfbyte2, int paramInt2);
  
  private CryptoServicePurpose getPurpose() {
    return (this.wKey == null) ? CryptoServicePurpose.ANY : (this.encrypting ? CryptoServicePurpose.ENCRYPTION : CryptoServicePurpose.DECRYPTION);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\engines\SerpentEngineBase.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */