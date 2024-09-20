package org.bouncycastle.pqc.crypto.ntru;

import java.util.Arrays;
import org.bouncycastle.pqc.math.ntru.HPSPolynomial;
import org.bouncycastle.pqc.math.ntru.HRSSPolynomial;
import org.bouncycastle.pqc.math.ntru.Polynomial;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHPSParameterSet;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUParameterSet;
import org.bouncycastle.util.Arrays;

class NTRUSampling {
  private final NTRUParameterSet params;
  
  public NTRUSampling(NTRUParameterSet paramNTRUParameterSet) {
    this.params = paramNTRUParameterSet;
  }
  
  public PolynomialPair sampleFg(byte[] paramArrayOfbyte) {
    if (this.params instanceof org.bouncycastle.pqc.math.ntru.parameters.NTRUHRSSParameterSet) {
      HRSSPolynomial hRSSPolynomial1 = sampleIidPlus(Arrays.copyOfRange(paramArrayOfbyte, 0, this.params.sampleIidBytes()));
      HRSSPolynomial hRSSPolynomial2 = sampleIidPlus(Arrays.copyOfRange(paramArrayOfbyte, this.params.sampleIidBytes(), paramArrayOfbyte.length));
      return new PolynomialPair((Polynomial)hRSSPolynomial1, (Polynomial)hRSSPolynomial2);
    } 
    if (this.params instanceof NTRUHPSParameterSet) {
      HPSPolynomial hPSPolynomial1 = (HPSPolynomial)sampleIid(Arrays.copyOfRange(paramArrayOfbyte, 0, this.params.sampleIidBytes()));
      HPSPolynomial hPSPolynomial2 = sampleFixedType(Arrays.copyOfRange(paramArrayOfbyte, this.params.sampleIidBytes(), paramArrayOfbyte.length));
      return new PolynomialPair((Polynomial)hPSPolynomial1, (Polynomial)hPSPolynomial2);
    } 
    throw new IllegalArgumentException("Invalid polynomial type");
  }
  
  public PolynomialPair sampleRm(byte[] paramArrayOfbyte) {
    if (this.params instanceof org.bouncycastle.pqc.math.ntru.parameters.NTRUHRSSParameterSet) {
      HRSSPolynomial hRSSPolynomial1 = (HRSSPolynomial)sampleIid(Arrays.copyOfRange(paramArrayOfbyte, 0, this.params.sampleIidBytes()));
      HRSSPolynomial hRSSPolynomial2 = (HRSSPolynomial)sampleIid(Arrays.copyOfRange(paramArrayOfbyte, this.params.sampleIidBytes(), paramArrayOfbyte.length));
      return new PolynomialPair((Polynomial)hRSSPolynomial1, (Polynomial)hRSSPolynomial2);
    } 
    if (this.params instanceof NTRUHPSParameterSet) {
      HPSPolynomial hPSPolynomial1 = (HPSPolynomial)sampleIid(Arrays.copyOfRange(paramArrayOfbyte, 0, this.params.sampleIidBytes()));
      HPSPolynomial hPSPolynomial2 = sampleFixedType(Arrays.copyOfRange(paramArrayOfbyte, this.params.sampleIidBytes(), paramArrayOfbyte.length));
      return new PolynomialPair((Polynomial)hPSPolynomial1, (Polynomial)hPSPolynomial2);
    } 
    throw new IllegalArgumentException("Invalid polynomial type");
  }
  
  public Polynomial sampleIid(byte[] paramArrayOfbyte) {
    Polynomial polynomial = this.params.createPolynomial();
    for (byte b = 0; b < this.params.n() - 1; b++)
      polynomial.coeffs[b] = (short)mod3(paramArrayOfbyte[b] & 0xFF); 
    polynomial.coeffs[this.params.n() - 1] = 0;
    return polynomial;
  }
  
  public HPSPolynomial sampleFixedType(byte[] paramArrayOfbyte) {
    int i = this.params.n();
    int j = ((NTRUHPSParameterSet)this.params).weight();
    HPSPolynomial hPSPolynomial = new HPSPolynomial((NTRUHPSParameterSet)this.params);
    int[] arrayOfInt = new int[i - 1];
    int k;
    for (k = 0; k < (i - 1) / 4; k++) {
      arrayOfInt[4 * k + 0] = ((paramArrayOfbyte[15 * k + 0] & 0xFF) << 2) + ((paramArrayOfbyte[15 * k + 1] & 0xFF) << 10) + ((paramArrayOfbyte[15 * k + 2] & 0xFF) << 18) + ((paramArrayOfbyte[15 * k + 3] & 0xFF) << 26);
      arrayOfInt[4 * k + 1] = ((paramArrayOfbyte[15 + k * 3] & 0xFF & 0xC0) >> 4) + ((paramArrayOfbyte[15 * k + 4] & 0xFF) << 4) + ((paramArrayOfbyte[15 * k + 5] & 0xFF) << 12) + ((paramArrayOfbyte[15 * k + 6] & 0xFF) << 20) + ((paramArrayOfbyte[15 * k + 7] & 0xFF) << 28);
      arrayOfInt[4 * k + 2] = ((paramArrayOfbyte[15 + k * 7] & 0xFF & 0xF0) >> 2) + ((paramArrayOfbyte[15 * k + 8] & 0xFF) << 6) + ((paramArrayOfbyte[15 * k + 9] & 0xFF) << 14) + ((paramArrayOfbyte[15 * k + 10] & 0xFF) << 22) + ((paramArrayOfbyte[15 * k + 11] & 0xFF) << 30);
      arrayOfInt[4 * k + 3] = (paramArrayOfbyte[15 * k + 11] & 0xFF & 0xFC) + ((paramArrayOfbyte[15 * k + 12] & 0xFF) << 8) + ((paramArrayOfbyte[15 * k + 13] & 0xFF) << 16) + ((paramArrayOfbyte[15 * k + 14] & 0xFF) << 24);
    } 
    if (i - 1 > (i - 1) / 4 * 4) {
      k = (i - 1) / 4;
      arrayOfInt[4 * k + 0] = ((paramArrayOfbyte[15 * k + 0] & 0xFF) << 2) + ((paramArrayOfbyte[15 * k + 1] & 0xFF) << 10) + ((paramArrayOfbyte[15 * k + 2] & 0xFF) << 18) + ((paramArrayOfbyte[15 * k + 3] & 0xFF) << 26);
      arrayOfInt[4 * k + 1] = ((paramArrayOfbyte[15 + k * 3] & 0xFF & 0xC0) >> 4) + ((paramArrayOfbyte[15 * k + 4] & 0xFF) << 4) + ((paramArrayOfbyte[15 * k + 5] & 0xFF) << 12) + ((paramArrayOfbyte[15 * k + 6] & 0xFF) << 20) + ((paramArrayOfbyte[15 * k + 7] & 0xFF) << 28);
    } 
    for (k = 0; k < j / 2; k++)
      arrayOfInt[k] = arrayOfInt[k] | 0x1; 
    for (k = j / 2; k < j; k++)
      arrayOfInt[k] = arrayOfInt[k] | 0x2; 
    Arrays.sort(arrayOfInt);
    for (k = 0; k < i - 1; k++)
      hPSPolynomial.coeffs[k] = (short)(arrayOfInt[k] & 0x3); 
    hPSPolynomial.coeffs[i - 1] = 0;
    return hPSPolynomial;
  }
  
  public HRSSPolynomial sampleIidPlus(byte[] paramArrayOfbyte) {
    int i = this.params.n();
    short s = 0;
    HRSSPolynomial hRSSPolynomial = (HRSSPolynomial)sampleIid(paramArrayOfbyte);
    byte b;
    for (b = 0; b < i - 1; b++)
      hRSSPolynomial.coeffs[b] = (short)(hRSSPolynomial.coeffs[b] | -(hRSSPolynomial.coeffs[b] >>> 1)); 
    for (b = 0; b < i - 1; b++)
      s = (short)(s + (short)(hRSSPolynomial.coeffs[b + 1] * hRSSPolynomial.coeffs[b])); 
    s = (short)(0x1 | -((s & 0xFFFF) >>> 15));
    for (b = 0; b < i - 1; b += 2)
      hRSSPolynomial.coeffs[b] = (short)(s * hRSSPolynomial.coeffs[b]); 
    for (b = 0; b < i - 1; b++)
      hRSSPolynomial.coeffs[b] = (short)(0x3 & (hRSSPolynomial.coeffs[b] & 0xFFFF ^ (hRSSPolynomial.coeffs[b] & 0xFFFF) >>> 15)); 
    return hRSSPolynomial;
  }
  
  private static int mod3(int paramInt) {
    return paramInt % 3;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\ntru\NTRUSampling.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */