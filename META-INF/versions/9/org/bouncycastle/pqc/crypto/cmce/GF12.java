package META-INF.versions.9.org.bouncycastle.pqc.crypto.cmce;

import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.pqc.crypto.cmce.GF;

final class GF12 extends GF {
  protected void gf_mul_poly(int paramInt, int[] paramArrayOfint1, short[] paramArrayOfshort1, short[] paramArrayOfshort2, short[] paramArrayOfshort3, int[] paramArrayOfint2) {
    paramArrayOfint2[0] = gf_mul_ext(paramArrayOfshort2[0], paramArrayOfshort3[0]);
    int i;
    for (i = 1; i < paramInt; i++) {
      paramArrayOfint2[i + i - 1] = 0;
      short s1 = paramArrayOfshort2[i];
      short s2 = paramArrayOfshort3[i];
      for (byte b = 0; b < i; b++)
        paramArrayOfint2[i + b] = paramArrayOfint2[i + b] ^ gf_mul_ext_par(s1, paramArrayOfshort3[b], paramArrayOfshort2[b], s2); 
      paramArrayOfint2[i + i] = gf_mul_ext(s1, s2);
    } 
    for (i = (paramInt - 1) * 2; i >= paramInt; i--) {
      int j = paramArrayOfint2[i];
      for (byte b = 0; b < paramArrayOfint1.length - 1; b++)
        paramArrayOfint2[i - paramInt + paramArrayOfint1[b]] = paramArrayOfint2[i - paramInt + paramArrayOfint1[b]] ^ j; 
      paramArrayOfint2[i - paramInt] = paramArrayOfint2[i - paramInt] ^ j << 1;
    } 
    for (i = 0; i < paramInt; i++)
      paramArrayOfshort1[i] = gf_reduce(paramArrayOfint2[i]); 
  }
  
  protected void gf_sqr_poly(int paramInt, int[] paramArrayOfint1, short[] paramArrayOfshort1, short[] paramArrayOfshort2, int[] paramArrayOfint2) {
    paramArrayOfint2[0] = gf_sq_ext(paramArrayOfshort2[0]);
    int i;
    for (i = 1; i < paramInt; i++) {
      paramArrayOfint2[i + i - 1] = 0;
      paramArrayOfint2[i + i] = gf_sq_ext(paramArrayOfshort2[i]);
    } 
    for (i = (paramInt - 1) * 2; i >= paramInt; i--) {
      int j = paramArrayOfint2[i];
      for (byte b = 0; b < paramArrayOfint1.length - 1; b++)
        paramArrayOfint2[i - paramInt + paramArrayOfint1[b]] = paramArrayOfint2[i - paramInt + paramArrayOfint1[b]] ^ j; 
      paramArrayOfint2[i - paramInt] = paramArrayOfint2[i - paramInt] ^ j << 1;
    } 
    for (i = 0; i < paramInt; i++)
      paramArrayOfshort1[i] = gf_reduce(paramArrayOfint2[i]); 
  }
  
  protected short gf_frac(short paramShort1, short paramShort2) {
    return gf_mul(gf_inv(paramShort1), paramShort2);
  }
  
  protected short gf_inv(short paramShort) {
    short s = paramShort;
    s = gf_sq(s);
    short s1 = gf_mul(s, paramShort);
    s = gf_sq(s1);
    s = gf_sq(s);
    short s2 = gf_mul(s, s1);
    s = gf_sq(s2);
    s = gf_sq(s);
    s = gf_sq(s);
    s = gf_sq(s);
    s = gf_mul(s, s2);
    s = gf_sq(s);
    s = gf_sq(s);
    s = gf_mul(s, s1);
    s = gf_sq(s);
    s = gf_mul(s, paramShort);
    return gf_sq(s);
  }
  
  protected short gf_mul(short paramShort1, short paramShort2) {
    short s1 = paramShort1;
    short s2 = paramShort2;
    int i = s1 * (s2 & 0x1);
    for (byte b = 1; b < 12; b++)
      i ^= s1 * (s2 & 1 << b); 
    return gf_reduce(i);
  }
  
  protected int gf_mul_ext(short paramShort1, short paramShort2) {
    short s1 = paramShort1;
    short s2 = paramShort2;
    int i = s1 * (s2 & 0x1);
    for (byte b = 1; b < 12; b++)
      i ^= s1 * (s2 & 1 << b); 
    return i;
  }
  
  private int gf_mul_ext_par(short paramShort1, short paramShort2, short paramShort3, short paramShort4) {
    short s1 = paramShort1;
    short s2 = paramShort2;
    short s3 = paramShort3;
    short s4 = paramShort4;
    int i = s1 * (s2 & 0x1);
    int j = s3 * (s4 & 0x1);
    for (byte b = 1; b < 12; b++) {
      i ^= s1 * (s2 & 1 << b);
      j ^= s3 * (s4 & 1 << b);
    } 
    return i ^ j;
  }
  
  protected short gf_reduce(int paramInt) {
    int i = paramInt & 0xFFF;
    int j = paramInt >>> 12;
    int k = (paramInt & 0x1FF000) >>> 9;
    int m = (paramInt & 0xE00000) >>> 18;
    int n = paramInt >>> 21;
    return (short)(i ^ j ^ k ^ m ^ n);
  }
  
  protected short gf_sq(short paramShort) {
    int i = Interleave.expand16to32(paramShort);
    return gf_reduce(i);
  }
  
  protected int gf_sq_ext(short paramShort) {
    return Interleave.expand16to32(paramShort);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\cmce\GF12.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */