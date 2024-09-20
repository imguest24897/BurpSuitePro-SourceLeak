package org.bouncycastle.crypto.signers;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;

public class HMacDSAKCalculator implements DSAKCalculator {
  private final HMac hMac;
  
  private final byte[] K;
  
  private final byte[] V;
  
  private BigInteger n;
  
  public HMacDSAKCalculator(Digest paramDigest) {
    this.hMac = new HMac(paramDigest);
    int i = this.hMac.getMacSize();
    this.V = new byte[i];
    this.K = new byte[i];
  }
  
  public boolean isDeterministic() {
    return true;
  }
  
  public void init(BigInteger paramBigInteger, SecureRandom paramSecureRandom) {
    throw new IllegalStateException("Operation not supported");
  }
  
  public void init(BigInteger paramBigInteger1, BigInteger paramBigInteger2, byte[] paramArrayOfbyte) {
    this.n = paramBigInteger1;
    BigInteger bigInteger = bitsToInt(paramArrayOfbyte);
    if (bigInteger.compareTo(paramBigInteger1) >= 0)
      bigInteger = bigInteger.subtract(paramBigInteger1); 
    int i = BigIntegers.getUnsignedByteLength(paramBigInteger1);
    byte[] arrayOfByte1 = BigIntegers.asUnsignedByteArray(i, paramBigInteger2);
    byte[] arrayOfByte2 = BigIntegers.asUnsignedByteArray(i, bigInteger);
    Arrays.fill(this.K, (byte)0);
    Arrays.fill(this.V, (byte)1);
    this.hMac.init((CipherParameters)new KeyParameter(this.K));
    this.hMac.update(this.V, 0, this.V.length);
    this.hMac.update((byte)0);
    this.hMac.update(arrayOfByte1, 0, arrayOfByte1.length);
    this.hMac.update(arrayOfByte2, 0, arrayOfByte2.length);
    initAdditionalInput0(this.hMac);
    this.hMac.doFinal(this.K, 0);
    this.hMac.init((CipherParameters)new KeyParameter(this.K));
    this.hMac.update(this.V, 0, this.V.length);
    this.hMac.doFinal(this.V, 0);
    this.hMac.update(this.V, 0, this.V.length);
    this.hMac.update((byte)1);
    this.hMac.update(arrayOfByte1, 0, arrayOfByte1.length);
    this.hMac.update(arrayOfByte2, 0, arrayOfByte2.length);
    initAdditionalInput1(this.hMac);
    this.hMac.doFinal(this.K, 0);
    this.hMac.init((CipherParameters)new KeyParameter(this.K));
    this.hMac.update(this.V, 0, this.V.length);
    this.hMac.doFinal(this.V, 0);
  }
  
  public BigInteger nextK() {
    byte[] arrayOfByte = new byte[BigIntegers.getUnsignedByteLength(this.n)];
    while (true) {
      for (int i = 0; i < arrayOfByte.length; i += j) {
        this.hMac.update(this.V, 0, this.V.length);
        this.hMac.doFinal(this.V, 0);
        int j = Math.min(arrayOfByte.length - i, this.V.length);
        System.arraycopy(this.V, 0, arrayOfByte, i, j);
      } 
      BigInteger bigInteger = bitsToInt(arrayOfByte);
      if (bigInteger.signum() > 0 && bigInteger.compareTo(this.n) < 0)
        return bigInteger; 
      this.hMac.update(this.V, 0, this.V.length);
      this.hMac.update((byte)0);
      this.hMac.doFinal(this.K, 0);
      this.hMac.init((CipherParameters)new KeyParameter(this.K));
      this.hMac.update(this.V, 0, this.V.length);
      this.hMac.doFinal(this.V, 0);
    } 
  }
  
  protected void initAdditionalInput0(HMac paramHMac) {}
  
  protected void initAdditionalInput1(HMac paramHMac) {}
  
  private BigInteger bitsToInt(byte[] paramArrayOfbyte) {
    int i = paramArrayOfbyte.length * 8;
    int j = this.n.bitLength();
    BigInteger bigInteger = BigIntegers.fromUnsignedByteArray(paramArrayOfbyte);
    if (i > j)
      bigInteger = bigInteger.shiftRight(i - j); 
    return bigInteger;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\signers\HMacDSAKCalculator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */