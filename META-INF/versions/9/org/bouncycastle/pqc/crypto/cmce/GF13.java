package META-INF.versions.9.org.bouncycastle.pqc.crypto.cmce;

import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.pqc.crypto.cmce.GF;

final class GF13 extends GF {
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
      for (byte b = 0; b < paramArrayOfint1.length; b++)
        paramArrayOfint2[i - paramInt + paramArrayOfint1[b]] = paramArrayOfint2[i - paramInt + paramArrayOfint1[b]] ^ j; 
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
      for (byte b = 0; b < paramArrayOfint1.length; b++)
        paramArrayOfint2[i - paramInt + paramArrayOfint1[b]] = paramArrayOfint2[i - paramInt + paramArrayOfint1[b]] ^ j; 
    } 
    for (i = 0; i < paramInt; i++)
      paramArrayOfshort1[i] = gf_reduce(paramArrayOfint2[i]); 
  }
  
  protected short gf_frac(short paramShort1, short paramShort2) {
    short s1 = gf_sqmul(paramShort1, paramShort1);
    short s2 = gf_sq2mul(s1, s1);
    short s3 = gf_sq2(s2);
    s3 = gf_sq2mul(s3, s2);
    s3 = gf_sq2(s3);
    s3 = gf_sq2mul(s3, s2);
    return gf_sqmul(s3, paramShort2);
  }
  
  protected short gf_inv(short paramShort) {
    return gf_frac(paramShort, (short)1);
  }
  
  protected short gf_mul(short paramShort1, short paramShort2) {
    short s1 = paramShort1;
    short s2 = paramShort2;
    int i = s1 * (s2 & 0x1);
    for (byte b = 1; b < 13; b++)
      i ^= s1 * (s2 & 1 << b); 
    return gf_reduce(i);
  }
  
  protected int gf_mul_ext(short paramShort1, short paramShort2) {
    short s1 = paramShort1;
    short s2 = paramShort2;
    int i = s1 * (s2 & 0x1);
    for (byte b = 1; b < 13; b++)
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
    for (byte b = 1; b < 13; b++) {
      i ^= s1 * (s2 & 1 << b);
      j ^= s3 * (s4 & 1 << b);
    } 
    return i ^ j;
  }
  
  protected short gf_reduce(int paramInt) {
    int i = paramInt & 0x1FFF;
    int j = paramInt >>> 13;
    int k = j << 4 ^ j << 3 ^ j << 1;
    int m = k >>> 13;
    int n = k & 0x1FFF;
    int i1 = m << 4 ^ m << 3 ^ m << 1;
    return (short)(i ^ j ^ m ^ n ^ i1);
  }
  
  protected short gf_sq(short paramShort) {
    int i = Interleave.expand16to32(paramShort);
    return gf_reduce(i);
  }
  
  protected int gf_sq_ext(short paramShort) {
    return Interleave.expand16to32(paramShort);
  }
  
  private short gf_sq2(short paramShort) {
    int i = Interleave.expand16to32(paramShort);
    paramShort = gf_reduce(i);
    int j = Interleave.expand16to32(paramShort);
    return gf_reduce(j);
  }
  
  private short gf_sqmul(short paramShort1, short paramShort2) {
    long l1 = paramShort1;
    long l2 = paramShort2;
    long l3 = (l2 << 6L) * (l1 & 0x40L);
    l1 ^= l1 << 7L;
    l3 ^= (l2 << 0L) * (l1 & 0x4001L);
    l3 ^= (l2 << 1L) * (l1 & 0x8002L);
    l3 ^= (l2 << 2L) * (l1 & 0x10004L);
    l3 ^= (l2 << 3L) * (l1 & 0x20008L);
    l3 ^= (l2 << 4L) * (l1 & 0x40010L);
    l3 ^= (l2 << 5L) * (l1 & 0x80020L);
    long l4 = l3 & 0x1FFC000000L;
    l3 ^= l4 >>> 18L ^ l4 >>> 20L ^ l4 >>> 24L ^ l4 >>> 26L;
    return gf_reduce((int)l3 & 0x3FFFFFF);
  }
  
  private short gf_sq2mul(short paramShort1, short paramShort2) {
    long l1 = paramShort1;
    long l2 = paramShort2;
    long l3 = (l2 << 18L) * (l1 & 0x40L);
    l1 ^= l1 << 21L;
    l3 ^= (l2 << 0L) * (l1 & 0x10000001L);
    l3 ^= (l2 << 3L) * (l1 & 0x20000002L);
    l3 ^= (l2 << 6L) * (l1 & 0x40000004L);
    l3 ^= (l2 << 9L) * (l1 & 0x80000008L);
    l3 ^= (l2 << 12L) * (l1 & 0x100000010L);
    l3 ^= (l2 << 15L) * (l1 & 0x200000020L);
    long l4 = l3 & 0x1FFFF80000000000L;
    l3 ^= l4 >>> 18L ^ l4 >>> 20L ^ l4 >>> 24L ^ l4 >>> 26L;
    l4 = l3 & 0x7FFFC000000L;
    l3 ^= l4 >>> 18L ^ l4 >>> 20L ^ l4 >>> 24L ^ l4 >>> 26L;
    return gf_reduce((int)l3 & 0x3FFFFFF);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\cmce\GF13.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */