package META-INF.versions.9.org.bouncycastle.pqc.math.ntru;

import org.bouncycastle.pqc.math.ntru.HPSPolynomial;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHPSParameterSet;

public class HPS4096Polynomial extends HPSPolynomial {
  public HPS4096Polynomial(NTRUHPSParameterSet paramNTRUHPSParameterSet) {
    super(paramNTRUHPSParameterSet);
  }
  
  public byte[] sqToBytes(int paramInt) {
    byte[] arrayOfByte = new byte[paramInt];
    int i = this.params.q();
    for (byte b = 0; b < this.params.packDegree() / 2; b++) {
      arrayOfByte[3 * b + 0] = (byte)(modQ(this.coeffs[2 * b + 0] & 0xFFFF, i) & 0xFF);
      arrayOfByte[3 * b + 1] = (byte)(modQ(this.coeffs[2 * b + 0] & 0xFFFF, i) >>> 8 | (modQ(this.coeffs[2 * b + 1] & 0xFFFF, i) & 0xF) << 4);
      arrayOfByte[3 * b + 2] = (byte)(modQ(this.coeffs[2 * b + 1] & 0xFFFF, i) >>> 4);
    } 
    return arrayOfByte;
  }
  
  public void sqFromBytes(byte[] paramArrayOfbyte) {
    for (byte b = 0; b < this.params.packDegree() / 2; b++) {
      this.coeffs[2 * b + 0] = (short)((paramArrayOfbyte[3 * b + 0] & 0xFF) >>> 0 | ((short)(paramArrayOfbyte[3 * b + 1] & 0xFF) & 0xF) << 8);
      this.coeffs[2 * b + 1] = (short)((paramArrayOfbyte[3 * b + 1] & 0xFF) >>> 4 | ((short)(paramArrayOfbyte[3 * b + 2] & 0xFF) & 0xFF) << 4);
    } 
    this.coeffs[this.params.n() - 1] = 0;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\math\ntru\HPS4096Polynomial.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */