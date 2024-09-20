package META-INF.versions.9.org.bouncycastle.pqc.math.ntru;

import org.bouncycastle.pqc.math.ntru.Polynomial;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHRSSParameterSet;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUParameterSet;

public class HRSSPolynomial extends Polynomial {
  public HRSSPolynomial(NTRUHRSSParameterSet paramNTRUHRSSParameterSet) {
    super((NTRUParameterSet)paramNTRUHRSSParameterSet);
  }
  
  public byte[] sqToBytes(int paramInt) {
    byte[] arrayOfByte = new byte[paramInt];
    short[] arrayOfShort = new short[8];
    byte b1;
    for (b1 = 0; b1 < this.params.packDegree() / 8; b1++) {
      for (byte b = 0; b < 8; b++)
        arrayOfShort[b] = (short)modQ(this.coeffs[8 * b1 + b] & 0xFFFF, this.params.q()); 
      arrayOfByte[13 * b1 + 0] = (byte)(arrayOfShort[0] & 0xFF);
      arrayOfByte[13 * b1 + 1] = (byte)(arrayOfShort[0] >>> 8 | (arrayOfShort[1] & 0x7) << 5);
      arrayOfByte[13 * b1 + 2] = (byte)(arrayOfShort[1] >>> 3 & 0xFF);
      arrayOfByte[13 * b1 + 3] = (byte)(arrayOfShort[1] >>> 11 | (arrayOfShort[2] & 0x3F) << 2);
      arrayOfByte[13 * b1 + 4] = (byte)(arrayOfShort[2] >>> 6 | (arrayOfShort[3] & 0x1) << 7);
      arrayOfByte[13 * b1 + 5] = (byte)(arrayOfShort[3] >>> 1 & 0xFF);
      arrayOfByte[13 * b1 + 6] = (byte)(arrayOfShort[3] >>> 9 | (arrayOfShort[4] & 0xF) << 4);
      arrayOfByte[13 * b1 + 7] = (byte)(arrayOfShort[4] >>> 4 & 0xFF);
      arrayOfByte[13 * b1 + 8] = (byte)(arrayOfShort[4] >>> 12 | (arrayOfShort[5] & 0x7F) << 1);
      arrayOfByte[13 * b1 + 9] = (byte)(arrayOfShort[5] >>> 7 | (arrayOfShort[6] & 0x3) << 6);
      arrayOfByte[13 * b1 + 10] = (byte)(arrayOfShort[6] >>> 2 & 0xFF);
      arrayOfByte[13 * b1 + 11] = (byte)(arrayOfShort[6] >>> 10 | (arrayOfShort[7] & 0x1F) << 3);
      arrayOfByte[13 * b1 + 12] = (byte)(arrayOfShort[7] >>> 5);
    } 
    byte b2;
    for (b2 = 0; b2 < this.params.packDegree() - 8 * b1; b2++)
      arrayOfShort[b2] = (short)modQ(this.coeffs[8 * b1 + b2] & 0xFFFF, this.params.q()); 
    while (b2 < 8) {
      arrayOfShort[b2] = 0;
      b2++;
    } 
    switch (this.params.packDegree() - 8 * this.params.packDegree() / 8) {
      case 4:
        arrayOfByte[13 * b1 + 0] = (byte)(arrayOfShort[0] & 0xFF);
        arrayOfByte[13 * b1 + 1] = (byte)(arrayOfShort[0] >>> 8 | (arrayOfShort[1] & 0x7) << 5);
        arrayOfByte[13 * b1 + 2] = (byte)(arrayOfShort[1] >>> 3 & 0xFF);
        arrayOfByte[13 * b1 + 3] = (byte)(arrayOfShort[1] >>> 11 | (arrayOfShort[2] & 0x3F) << 2);
        arrayOfByte[13 * b1 + 4] = (byte)(arrayOfShort[2] >>> 6 | (arrayOfShort[3] & 0x1) << 7);
        arrayOfByte[13 * b1 + 5] = (byte)(arrayOfShort[3] >>> 1 & 0xFF);
        arrayOfByte[13 * b1 + 6] = (byte)(arrayOfShort[3] >>> 9 | (arrayOfShort[4] & 0xF) << 4);
      case 2:
        arrayOfByte[13 * b1 + 0] = (byte)(arrayOfShort[0] & 0xFF);
        arrayOfByte[13 * b1 + 1] = (byte)(arrayOfShort[0] >>> 8 | (arrayOfShort[1] & 0x7) << 5);
        arrayOfByte[13 * b1 + 2] = (byte)(arrayOfShort[1] >>> 3 & 0xFF);
        arrayOfByte[13 * b1 + 3] = (byte)(arrayOfShort[1] >>> 11 | (arrayOfShort[2] & 0x3F) << 2);
        break;
    } 
    return arrayOfByte;
  }
  
  public void sqFromBytes(byte[] paramArrayOfbyte) {
    byte b;
    for (b = 0; b < this.params.packDegree() / 8; b++) {
      this.coeffs[8 * b + 0] = (short)(paramArrayOfbyte[13 * b + 0] & 0xFF | ((short)(paramArrayOfbyte[13 * b + 1] & 0xFF) & 0x1F) << 8);
      this.coeffs[8 * b + 1] = (short)((paramArrayOfbyte[13 * b + 1] & 0xFF) >>> 5 | (short)(paramArrayOfbyte[13 * b + 2] & 0xFF) << 3 | ((short)(paramArrayOfbyte[13 * b + 3] & 0xFF) & 0x3) << 11);
      this.coeffs[8 * b + 2] = (short)((paramArrayOfbyte[13 * b + 3] & 0xFF) >>> 2 | ((short)(paramArrayOfbyte[13 * b + 4] & 0xFF) & 0x7F) << 6);
      this.coeffs[8 * b + 3] = (short)((paramArrayOfbyte[13 * b + 4] & 0xFF) >>> 7 | (short)(paramArrayOfbyte[13 * b + 5] & 0xFF) << 1 | ((short)(paramArrayOfbyte[13 * b + 6] & 0xFF) & 0xF) << 9);
      this.coeffs[8 * b + 4] = (short)((paramArrayOfbyte[13 * b + 6] & 0xFF) >>> 4 | (short)(paramArrayOfbyte[13 * b + 7] & 0xFF) << 4 | ((short)(paramArrayOfbyte[13 * b + 8] & 0xFF) & 0x1) << 12);
      this.coeffs[8 * b + 5] = (short)((paramArrayOfbyte[13 * b + 8] & 0xFF) >>> 1 | ((short)(paramArrayOfbyte[13 * b + 9] & 0xFF) & 0x3F) << 7);
      this.coeffs[8 * b + 6] = (short)((paramArrayOfbyte[13 * b + 9] & 0xFF) >>> 6 | (short)(paramArrayOfbyte[13 * b + 10] & 0xFF) << 2 | ((short)(paramArrayOfbyte[13 * b + 11] & 0xFF) & 0x7) << 10);
      this.coeffs[8 * b + 7] = (short)((paramArrayOfbyte[13 * b + 11] & 0xFF) >>> 3 | (short)(paramArrayOfbyte[13 * b + 12] & 0xFF) << 5);
    } 
    switch (this.params.packDegree() & 0x7) {
      case 4:
        this.coeffs[8 * b + 0] = (short)(paramArrayOfbyte[13 * b + 0] & 0xFF | ((short)(paramArrayOfbyte[13 * b + 1] & 0xFF) & 0x1F) << 8);
        this.coeffs[8 * b + 1] = (short)((paramArrayOfbyte[13 * b + 1] & 0xFF) >>> 5 | (short)(paramArrayOfbyte[13 * b + 2] & 0xFF) << 3 | ((short)(paramArrayOfbyte[13 * b + 3] & 0xFF) & 0x3) << 11);
        this.coeffs[8 * b + 2] = (short)((paramArrayOfbyte[13 * b + 3] & 0xFF) >>> 2 | ((short)(paramArrayOfbyte[13 * b + 4] & 0xFF) & 0x7F) << 6);
        this.coeffs[8 * b + 3] = (short)((paramArrayOfbyte[13 * b + 4] & 0xFF) >>> 7 | (short)(paramArrayOfbyte[13 * b + 5] & 0xFF) << 1 | ((short)(paramArrayOfbyte[13 * b + 6] & 0xFF) & 0xF) << 9);
        break;
      case 2:
        this.coeffs[8 * b + 0] = (short)(paramArrayOfbyte[13 * b + 0] & 0xFF | ((short)(paramArrayOfbyte[13 * b + 1] & 0xFF) & 0x1F) << 8);
        this.coeffs[8 * b + 1] = (short)((paramArrayOfbyte[13 * b + 1] & 0xFF) >>> 5 | (short)(paramArrayOfbyte[13 * b + 2] & 0xFF) << 3 | ((short)(paramArrayOfbyte[13 * b + 3] & 0xFF) & 0x3) << 11);
        break;
    } 
    this.coeffs[this.params.n() - 1] = 0;
  }
  
  public void lift(Polynomial paramPolynomial) {
    int i = this.coeffs.length;
    Polynomial polynomial = this.params.createPolynomial();
    short s = (short)(3 - i % 3);
    polynomial.coeffs[0] = (short)(paramPolynomial.coeffs[0] * (2 - s) + paramPolynomial.coeffs[1] * 0 + paramPolynomial.coeffs[2] * s);
    polynomial.coeffs[1] = (short)(paramPolynomial.coeffs[1] * (2 - s) + paramPolynomial.coeffs[2] * 0);
    polynomial.coeffs[2] = (short)(paramPolynomial.coeffs[2] * (2 - s));
    short s1 = 0;
    byte b;
    for (b = 3; b < i; b++) {
      polynomial.coeffs[0] = (short)(polynomial.coeffs[0] + paramPolynomial.coeffs[b] * (s1 + 2 * s));
      polynomial.coeffs[1] = (short)(polynomial.coeffs[1] + paramPolynomial.coeffs[b] * (s1 + s));
      polynomial.coeffs[2] = (short)(polynomial.coeffs[2] + paramPolynomial.coeffs[b] * s1);
      s1 = (short)((s1 + s) % 3);
    } 
    polynomial.coeffs[1] = (short)(polynomial.coeffs[1] + paramPolynomial.coeffs[0] * (s1 + s));
    polynomial.coeffs[2] = (short)(polynomial.coeffs[2] + paramPolynomial.coeffs[0] * s1);
    polynomial.coeffs[2] = (short)(polynomial.coeffs[2] + paramPolynomial.coeffs[1] * (s1 + s));
    for (b = 3; b < i; b++)
      polynomial.coeffs[b] = (short)(polynomial.coeffs[b - 3] + 2 * (paramPolynomial.coeffs[b] + paramPolynomial.coeffs[b - 1] + paramPolynomial.coeffs[b - 2])); 
    polynomial.mod3PhiN();
    polynomial.z3ToZq();
    this.coeffs[0] = (short)-polynomial.coeffs[0];
    for (b = 0; b < i - 1; b++)
      this.coeffs[b + 1] = (short)(polynomial.coeffs[b] - polynomial.coeffs[b + 1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\math\ntru\HRSSPolynomial.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */