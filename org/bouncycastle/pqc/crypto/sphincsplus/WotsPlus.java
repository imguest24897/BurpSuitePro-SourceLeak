package org.bouncycastle.pqc.crypto.sphincsplus;

import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

class WotsPlus {
  private final SPHINCSPlusEngine engine;
  
  private final int w;
  
  WotsPlus(SPHINCSPlusEngine paramSPHINCSPlusEngine) {
    this.engine = paramSPHINCSPlusEngine;
    this.w = this.engine.WOTS_W;
  }
  
  byte[] pkGen(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, ADRS paramADRS) {
    ADRS aDRS = new ADRS(paramADRS);
    byte[][] arrayOfByte = new byte[this.engine.WOTS_LEN][];
    for (byte b = 0; b < this.engine.WOTS_LEN; b++) {
      ADRS aDRS1 = new ADRS(paramADRS);
      aDRS1.setType(5);
      aDRS1.setKeyPairAddress(paramADRS.getKeyPairAddress());
      aDRS1.setChainAddress(b);
      aDRS1.setHashAddress(0);
      byte[] arrayOfByte1 = this.engine.PRF(paramArrayOfbyte2, paramArrayOfbyte1, aDRS1);
      aDRS1.setType(0);
      aDRS1.setKeyPairAddress(paramADRS.getKeyPairAddress());
      aDRS1.setChainAddress(b);
      aDRS1.setHashAddress(0);
      arrayOfByte[b] = chain(arrayOfByte1, 0, this.w - 1, paramArrayOfbyte2, aDRS1);
    } 
    aDRS.setType(1);
    aDRS.setKeyPairAddress(paramADRS.getKeyPairAddress());
    return this.engine.T_l(paramArrayOfbyte2, aDRS, Arrays.concatenate(arrayOfByte));
  }
  
  byte[] chain(byte[] paramArrayOfbyte1, int paramInt1, int paramInt2, byte[] paramArrayOfbyte2, ADRS paramADRS) {
    if (paramInt2 == 0)
      return Arrays.clone(paramArrayOfbyte1); 
    if (paramInt1 + paramInt2 > this.w - 1)
      return null; 
    byte[] arrayOfByte = paramArrayOfbyte1;
    for (byte b = 0; b < paramInt2; b++) {
      paramADRS.setHashAddress(paramInt1 + b);
      arrayOfByte = this.engine.F(paramArrayOfbyte2, paramADRS, arrayOfByte);
    } 
    return arrayOfByte;
  }
  
  public byte[] sign(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, ADRS paramADRS) {
    ADRS aDRS = new ADRS(paramADRS);
    int[] arrayOfInt = new int[this.engine.WOTS_LEN];
    base_w(paramArrayOfbyte1, 0, this.w, arrayOfInt, 0, this.engine.WOTS_LEN1);
    int i = 0;
    int j;
    for (j = 0; j < this.engine.WOTS_LEN1; j++)
      i += this.w - 1 - arrayOfInt[j]; 
    if (this.engine.WOTS_LOGW % 8 != 0)
      i <<= 8 - this.engine.WOTS_LEN2 * this.engine.WOTS_LOGW % 8; 
    j = (this.engine.WOTS_LEN2 * this.engine.WOTS_LOGW + 7) / 8;
    byte[] arrayOfByte = Pack.intToBigEndian(i);
    base_w(arrayOfByte, 4 - j, this.w, arrayOfInt, this.engine.WOTS_LEN1, this.engine.WOTS_LEN2);
    byte[][] arrayOfByte1 = new byte[this.engine.WOTS_LEN][];
    for (byte b = 0; b < this.engine.WOTS_LEN; b++) {
      aDRS.setType(5);
      aDRS.setKeyPairAddress(paramADRS.getKeyPairAddress());
      aDRS.setChainAddress(b);
      aDRS.setHashAddress(0);
      byte[] arrayOfByte2 = this.engine.PRF(paramArrayOfbyte3, paramArrayOfbyte2, aDRS);
      aDRS.setType(0);
      aDRS.setKeyPairAddress(paramADRS.getKeyPairAddress());
      aDRS.setChainAddress(b);
      aDRS.setHashAddress(0);
      arrayOfByte1[b] = chain(arrayOfByte2, 0, arrayOfInt[b], paramArrayOfbyte3, aDRS);
    } 
    return Arrays.concatenate(arrayOfByte1);
  }
  
  void base_w(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int[] paramArrayOfint, int paramInt3, int paramInt4) {
    byte b = 0;
    int i = 0;
    for (byte b1 = 0; b1 < paramInt4; b1++) {
      if (!i) {
        b = paramArrayOfbyte[paramInt1++];
        i += true;
      } 
      i -= this.engine.WOTS_LOGW;
      paramArrayOfint[paramInt3++] = b >>> i & paramInt2 - 1;
    } 
  }
  
  public byte[] pkFromSig(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, ADRS paramADRS) {
    ADRS aDRS = new ADRS(paramADRS);
    int[] arrayOfInt = new int[this.engine.WOTS_LEN];
    base_w(paramArrayOfbyte2, 0, this.w, arrayOfInt, 0, this.engine.WOTS_LEN1);
    int i = 0;
    int j;
    for (j = 0; j < this.engine.WOTS_LEN1; j++)
      i += this.w - 1 - arrayOfInt[j]; 
    i <<= 8 - this.engine.WOTS_LEN2 * this.engine.WOTS_LOGW % 8;
    j = (this.engine.WOTS_LEN2 * this.engine.WOTS_LOGW + 7) / 8;
    byte[] arrayOfByte1 = Pack.intToBigEndian(i);
    base_w(arrayOfByte1, 4 - j, this.w, arrayOfInt, this.engine.WOTS_LEN1, this.engine.WOTS_LEN2);
    byte[] arrayOfByte2 = new byte[this.engine.N];
    byte[][] arrayOfByte = new byte[this.engine.WOTS_LEN][];
    for (byte b = 0; b < this.engine.WOTS_LEN; b++) {
      paramADRS.setChainAddress(b);
      System.arraycopy(paramArrayOfbyte1, b * this.engine.N, arrayOfByte2, 0, this.engine.N);
      arrayOfByte[b] = chain(arrayOfByte2, arrayOfInt[b], this.w - 1 - arrayOfInt[b], paramArrayOfbyte3, paramADRS);
    } 
    aDRS.setType(1);
    aDRS.setKeyPairAddress(paramADRS.getKeyPairAddress());
    return this.engine.T_l(paramArrayOfbyte3, aDRS, Arrays.concatenate(arrayOfByte));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\sphincsplus\WotsPlus.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */