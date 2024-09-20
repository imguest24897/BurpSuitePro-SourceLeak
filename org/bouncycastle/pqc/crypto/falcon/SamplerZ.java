package org.bouncycastle.pqc.crypto.falcon;

class SamplerZ {
  FPREngine fpr = new FPREngine();
  
  int sample(SamplerCtx paramSamplerCtx, FalconFPR paramFalconFPR1, FalconFPR paramFalconFPR2) {
    return sampler(paramSamplerCtx, paramFalconFPR1, paramFalconFPR2);
  }
  
  int gaussian0_sampler(FalconRNG paramFalconRNG) {
    int[] arrayOfInt = { 
        10745844, 3068844, 3741698, 5559083, 1580863, 8248194, 2260429, 13669192, 2736639, 708981, 
        4421575, 10046180, 169348, 7122675, 4136815, 30538, 13063405, 7650655, 4132, 14505003, 
        7826148, 417, 16768101, 11363290, 31, 8444042, 8086568, 1, 12844466, 265321, 
        0, 1232676, 13644283, 0, 38047, 9111839, 0, 870, 6138264, 0, 
        14, 12545723, 0, 0, 3104126, 0, 0, 28824, 0, 0, 
        198, 0, 0, 1 };
    long l = paramFalconRNG.prng_get_u64();
    int m = paramFalconRNG.prng_get_u8() & 0xFF;
    int i = (int)l & 0xFFFFFF;
    int j = (int)(l >>> 24L) & 0xFFFFFF;
    int k = (int)(l >>> 48L) | m << 16;
    int n = 0;
    for (byte b = 0; b < arrayOfInt.length; b += 3) {
      int i1 = arrayOfInt[b + 2];
      int i2 = arrayOfInt[b + 1];
      int i3 = arrayOfInt[b + 0];
      int i4 = i - i1 >>> 31;
      i4 = j - i2 - i4 >>> 31;
      i4 = k - i3 - i4 >>> 31;
      n += i4;
    } 
    return n;
  }
  
  int BerExp(FalconRNG paramFalconRNG, FalconFPR paramFalconFPR1, FalconFPR paramFalconFPR2) {
    int k;
    int i = (int)this.fpr.fpr_trunc(this.fpr.fpr_mul(paramFalconFPR1, this.fpr.fpr_inv_log2));
    FalconFPR falconFPR = this.fpr.fpr_sub(paramFalconFPR1, this.fpr.fpr_mul(this.fpr.fpr_of(i), this.fpr.fpr_log2));
    int j = i;
    j ^= (j ^ 0x3F) & -(63 - j >>> 31);
    i = j;
    long l = (this.fpr.fpr_expm_p63(falconFPR, paramFalconFPR2) << 1L) - 1L >>> i;
    byte b = 64;
    do {
      b -= 8;
      k = (paramFalconRNG.prng_get_u8() & 0xFF) - ((int)(l >>> b) & 0xFF);
    } while (k == 0 && b > 0);
    return k >>> 31;
  }
  
  int sampler(SamplerCtx paramSamplerCtx, FalconFPR paramFalconFPR1, FalconFPR paramFalconFPR2) {
    SamplerCtx samplerCtx = paramSamplerCtx;
    int i = (int)this.fpr.fpr_floor(paramFalconFPR1);
    FalconFPR falconFPR1 = this.fpr.fpr_sub(paramFalconFPR1, this.fpr.fpr_of(i));
    FalconFPR falconFPR2 = this.fpr.fpr_half(this.fpr.fpr_sqr(paramFalconFPR2));
    FalconFPR falconFPR3 = this.fpr.fpr_mul(paramFalconFPR2, samplerCtx.sigma_min);
    while (true) {
      int j = gaussian0_sampler(samplerCtx.p);
      int m = samplerCtx.p.prng_get_u8() & 0xFF & 0x1;
      int k = m + ((m << 1) - 1) * j;
      FalconFPR falconFPR = this.fpr.fpr_mul(this.fpr.fpr_sqr(this.fpr.fpr_sub(this.fpr.fpr_of(k), falconFPR1)), falconFPR2);
      falconFPR = this.fpr.fpr_sub(falconFPR, this.fpr.fpr_mul(this.fpr.fpr_of((j * j)), this.fpr.fpr_inv_2sqrsigma0));
      if (BerExp(samplerCtx.p, falconFPR, falconFPR3) != 0)
        return i + k; 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\falcon\SamplerZ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */