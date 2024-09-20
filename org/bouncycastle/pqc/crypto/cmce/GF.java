package org.bouncycastle.pqc.crypto.cmce;

abstract class GF {
  final short gf_iszero(short paramShort) {
    return (short)(paramShort - 1 >> 31);
  }
  
  protected abstract void gf_mul_poly(int paramInt, int[] paramArrayOfint1, short[] paramArrayOfshort1, short[] paramArrayOfshort2, short[] paramArrayOfshort3, int[] paramArrayOfint2);
  
  protected abstract void gf_sqr_poly(int paramInt, int[] paramArrayOfint1, short[] paramArrayOfshort1, short[] paramArrayOfshort2, int[] paramArrayOfint2);
  
  protected abstract short gf_frac(short paramShort1, short paramShort2);
  
  protected abstract short gf_inv(short paramShort);
  
  protected abstract short gf_mul(short paramShort1, short paramShort2);
  
  protected abstract int gf_mul_ext(short paramShort1, short paramShort2);
  
  protected abstract short gf_reduce(int paramInt);
  
  protected abstract short gf_sq(short paramShort);
  
  protected abstract int gf_sq_ext(short paramShort);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\cmce\GF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */