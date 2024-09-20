package org.bouncycastle.pqc.math.ntru;

import org.bouncycastle.pqc.math.ntru.parameters.NTRUHRSSParameterSet;

public class HRSS1373Polynomial extends HRSSPolynomial {
  private static final int L = 1376;
  
  private static final int M = 344;
  
  private static final int K = 86;
  
  public HRSS1373Polynomial(NTRUHRSSParameterSet paramNTRUHRSSParameterSet) {
    super(paramNTRUHRSSParameterSet);
  }
  
  public byte[] sqToBytes(int paramInt) {
    byte[] arrayOfByte = new byte[paramInt];
    short[] arrayOfShort = new short[4];
    byte b;
    for (b = 0; b < this.params.packDegree() / 4; b++) {
      for (byte b1 = 0; b1 < 4; b1++)
        arrayOfShort[b1] = (short)modQ(this.coeffs[4 * b + b1] & 0xFFFF, this.params.q()); 
      arrayOfByte[7 * b + 0] = (byte)(arrayOfShort[0] & 0xFF);
      arrayOfByte[7 * b + 1] = (byte)(arrayOfShort[0] >>> 8 | (arrayOfShort[1] & 0x3) << 6);
      arrayOfByte[7 * b + 2] = (byte)(arrayOfShort[1] >>> 2 & 0xFF);
      arrayOfByte[7 * b + 3] = (byte)(arrayOfShort[1] >>> 10 | (arrayOfShort[2] & 0xF) << 4);
      arrayOfByte[7 * b + 4] = (byte)(arrayOfShort[2] >>> 4 & 0xFF);
      arrayOfByte[7 * b + 5] = (byte)(arrayOfShort[2] >>> 12 | (arrayOfShort[3] & 0x3F) << 2);
      arrayOfByte[7 * b + 6] = (byte)(arrayOfShort[3] >>> 6);
    } 
    if (this.params.packDegree() % 4 == 2) {
      arrayOfShort[0] = (short)modQ(this.coeffs[this.params.packDegree() - 2] & 0xFFFF, this.params.q());
      arrayOfShort[1] = (short)modQ(this.coeffs[this.params.packDegree() - 1] & 0xFFFF, this.params.q());
      arrayOfByte[7 * b + 0] = (byte)(arrayOfShort[0] & 0xFF);
      arrayOfByte[7 * b + 1] = (byte)(arrayOfShort[0] >>> 8 | (arrayOfShort[1] & 0x3) << 6);
      arrayOfByte[7 * b + 2] = (byte)(arrayOfShort[1] >>> 2 & 0xFF);
      arrayOfByte[7 * b + 3] = (byte)(arrayOfShort[1] >>> 10);
    } 
    return arrayOfByte;
  }
  
  public void sqFromBytes(byte[] paramArrayOfbyte) {
    byte b;
    for (b = 0; b < this.params.packDegree() / 4; b++) {
      this.coeffs[4 * b + 0] = (short)(paramArrayOfbyte[7 * b + 0] & 0xFF | ((short)(paramArrayOfbyte[7 * b + 1] & 0xFF) & 0x3F) << 8);
      this.coeffs[4 * b + 1] = (short)((paramArrayOfbyte[7 * b + 1] & 0xFF) >>> 6 | (short)(paramArrayOfbyte[7 * b + 2] & 0xFF) << 2 | (short)(paramArrayOfbyte[7 * b + 3] & 0xF) << 10);
      this.coeffs[4 * b + 2] = (short)((paramArrayOfbyte[7 * b + 3] & 0xFF) >>> 4 | ((short)(paramArrayOfbyte[7 * b + 4] & 0xFF) & 0xFF) << 4 | (short)(paramArrayOfbyte[7 * b + 5] & 0x3) << 12);
      this.coeffs[4 * b + 3] = (short)((paramArrayOfbyte[7 * b + 5] & 0xFF) >>> 2 | (short)(paramArrayOfbyte[7 * b + 6] & 0xFF) << 6);
    } 
    if (this.params.packDegree() % 4 == 2) {
      this.coeffs[4 * b + 0] = (short)(paramArrayOfbyte[7 * b + 0] | (paramArrayOfbyte[7 * b + 1] & 0x3F) << 8);
      this.coeffs[4 * b + 1] = (short)(paramArrayOfbyte[7 * b + 1] >>> 6 | (short)paramArrayOfbyte[7 * b + 2] << 2 | ((short)paramArrayOfbyte[7 * b + 3] & 0xF) << 10);
    } 
    this.coeffs[this.params.n() - 1] = 0;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\math\ntru\HRSS1373Polynomial.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */