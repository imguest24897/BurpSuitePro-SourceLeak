package META-INF.versions.9.org.bouncycastle.pqc.math.ntru;

import org.bouncycastle.pqc.math.ntru.Polynomial;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHPSParameterSet;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUParameterSet;

public class HPSPolynomial extends Polynomial {
  public HPSPolynomial(NTRUHPSParameterSet paramNTRUHPSParameterSet) {
    super((NTRUParameterSet)paramNTRUHPSParameterSet);
  }
  
  public byte[] sqToBytes(int paramInt) {
    byte[] arrayOfByte = new byte[paramInt];
    short[] arrayOfShort = new short[8];
    byte b1;
    for (b1 = 0; b1 < this.params.packDegree() / 8; b1++) {
      for (byte b = 0; b < 8; b++)
        arrayOfShort[b] = (short)modQ(this.coeffs[8 * b1 + b] & 0xFFFF, this.params.q()); 
      arrayOfByte[11 * b1 + 0] = (byte)(arrayOfShort[0] & 0xFF);
      arrayOfByte[11 * b1 + 1] = (byte)(arrayOfShort[0] >>> 8 | (arrayOfShort[1] & 0x1F) << 3);
      arrayOfByte[11 * b1 + 2] = (byte)(arrayOfShort[1] >>> 5 | (arrayOfShort[2] & 0x3) << 6);
      arrayOfByte[11 * b1 + 3] = (byte)(arrayOfShort[2] >>> 2 & 0xFF);
      arrayOfByte[11 * b1 + 4] = (byte)(arrayOfShort[2] >>> 10 | (arrayOfShort[3] & 0x7F) << 1);
      arrayOfByte[11 * b1 + 5] = (byte)(arrayOfShort[3] >>> 7 | (arrayOfShort[4] & 0xF) << 4);
      arrayOfByte[11 * b1 + 6] = (byte)(arrayOfShort[4] >>> 4 | (arrayOfShort[5] & 0x1) << 7);
      arrayOfByte[11 * b1 + 7] = (byte)(arrayOfShort[5] >>> 1 & 0xFF);
      arrayOfByte[11 * b1 + 8] = (byte)(arrayOfShort[5] >>> 9 | (arrayOfShort[6] & 0x3F) << 2);
      arrayOfByte[11 * b1 + 9] = (byte)(arrayOfShort[6] >>> 6 | (arrayOfShort[7] & 0x7) << 5);
      arrayOfByte[11 * b1 + 10] = (byte)(arrayOfShort[7] >>> 3);
    } 
    byte b2;
    for (b2 = 0; b2 < this.params.packDegree() - 8 * b1; b2++)
      arrayOfShort[b2] = (short)modQ(this.coeffs[8 * b1 + b2] & 0xFFFF, this.params.q()); 
    while (b2 < 8) {
      arrayOfShort[b2] = 0;
      b2++;
    } 
    switch (this.params.packDegree() & 0x7) {
      case 4:
        arrayOfByte[11 * b1 + 0] = (byte)(arrayOfShort[0] & 0xFF);
        arrayOfByte[11 * b1 + 1] = (byte)(arrayOfShort[0] >>> 8 | (arrayOfShort[1] & 0x1F) << 3);
        arrayOfByte[11 * b1 + 2] = (byte)(arrayOfShort[1] >>> 5 | (arrayOfShort[2] & 0x3) << 6);
        arrayOfByte[11 * b1 + 3] = (byte)(arrayOfShort[2] >>> 2 & 0xFF);
        arrayOfByte[11 * b1 + 4] = (byte)(arrayOfShort[2] >>> 10 | (arrayOfShort[3] & 0x7F) << 1);
        arrayOfByte[11 * b1 + 5] = (byte)(arrayOfShort[3] >>> 7 | (arrayOfShort[4] & 0xF) << 4);
        break;
      case 2:
        arrayOfByte[11 * b1 + 0] = (byte)(arrayOfShort[0] & 0xFF);
        arrayOfByte[11 * b1 + 1] = (byte)(arrayOfShort[0] >>> 8 | (arrayOfShort[1] & 0x1F) << 3);
        arrayOfByte[11 * b1 + 2] = (byte)(arrayOfShort[1] >>> 5 | (arrayOfShort[2] & 0x3) << 6);
        break;
    } 
    return arrayOfByte;
  }
  
  public void sqFromBytes(byte[] paramArrayOfbyte) {
    int i = this.coeffs.length;
    byte b;
    for (b = 0; b < this.params.packDegree() / 8; b++) {
      this.coeffs[8 * b + 0] = (short)((paramArrayOfbyte[11 * b + 0] & 0xFF) >>> 0 | ((short)(paramArrayOfbyte[11 * b + 1] & 0xFF) & 0x7) << 8);
      this.coeffs[8 * b + 1] = (short)((paramArrayOfbyte[11 * b + 1] & 0xFF) >>> 3 | ((short)(paramArrayOfbyte[11 * b + 2] & 0xFF) & 0x3F) << 5);
      this.coeffs[8 * b + 2] = (short)((paramArrayOfbyte[11 * b + 2] & 0xFF) >>> 6 | ((short)(paramArrayOfbyte[11 * b + 3] & 0xFF) & 0xFF) << 2 | ((short)(paramArrayOfbyte[11 * b + 4] & 0xFF) & 0x1) << 10);
      this.coeffs[8 * b + 3] = (short)((paramArrayOfbyte[11 * b + 4] & 0xFF) >>> 1 | ((short)(paramArrayOfbyte[11 * b + 5] & 0xFF) & 0xF) << 7);
      this.coeffs[8 * b + 4] = (short)((paramArrayOfbyte[11 * b + 5] & 0xFF) >>> 4 | ((short)(paramArrayOfbyte[11 * b + 6] & 0xFF) & 0x7F) << 4);
      this.coeffs[8 * b + 5] = (short)((paramArrayOfbyte[11 * b + 6] & 0xFF) >>> 7 | ((short)(paramArrayOfbyte[11 * b + 7] & 0xFF) & 0xFF) << 1 | ((short)(paramArrayOfbyte[11 * b + 8] & 0xFF) & 0x3) << 9);
      this.coeffs[8 * b + 6] = (short)((paramArrayOfbyte[11 * b + 8] & 0xFF) >>> 2 | ((short)(paramArrayOfbyte[11 * b + 9] & 0xFF) & 0x1F) << 6);
      this.coeffs[8 * b + 7] = (short)((paramArrayOfbyte[11 * b + 9] & 0xFF) >>> 5 | ((short)(paramArrayOfbyte[11 * b + 10] & 0xFF) & 0xFF) << 3);
    } 
    switch (this.params.packDegree() & 0x7) {
      case 4:
        this.coeffs[8 * b + 0] = (short)((paramArrayOfbyte[11 * b + 0] & 0xFF) >>> 0 | ((short)(paramArrayOfbyte[11 * b + 1] & 0xFF) & 0x7) << 8);
        this.coeffs[8 * b + 1] = (short)((paramArrayOfbyte[11 * b + 1] & 0xFF) >>> 3 | ((short)(paramArrayOfbyte[11 * b + 2] & 0xFF) & 0x3F) << 5);
        this.coeffs[8 * b + 2] = (short)((paramArrayOfbyte[11 * b + 2] & 0xFF) >>> 6 | ((short)(paramArrayOfbyte[11 * b + 3] & 0xFF) & 0xFF) << 2 | ((short)(paramArrayOfbyte[11 * b + 4] & 0xFF) & 0x1) << 10);
        this.coeffs[8 * b + 3] = (short)((paramArrayOfbyte[11 * b + 4] & 0xFF) >>> 1 | ((short)(paramArrayOfbyte[11 * b + 5] & 0xFF) & 0xF) << 7);
        break;
      case 2:
        this.coeffs[8 * b + 0] = (short)((paramArrayOfbyte[11 * b + 0] & 0xFF) >>> 0 | ((short)(paramArrayOfbyte[11 * b + 1] & 0xFF) & 0x7) << 8);
        this.coeffs[8 * b + 1] = (short)((paramArrayOfbyte[11 * b + 1] & 0xFF) >>> 3 | ((short)(paramArrayOfbyte[11 * b + 2] & 0xFF) & 0x3F) << 5);
        break;
    } 
    this.coeffs[i - 1] = 0;
  }
  
  public void lift(Polynomial paramPolynomial) {
    int i = this.coeffs.length;
    System.arraycopy(paramPolynomial.coeffs, 0, this.coeffs, 0, i);
    z3ToZq();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\math\ntru\HPSPolynomial.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */