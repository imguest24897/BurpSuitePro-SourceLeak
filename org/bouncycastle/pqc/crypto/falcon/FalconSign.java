package org.bouncycastle.pqc.crypto.falcon;

class FalconSign {
  FPREngine fpr = new FPREngine();
  
  FalconFFT fft = new FalconFFT();
  
  FalconCommon common = new FalconCommon();
  
  private static int MKN(int paramInt) {
    return 1 << paramInt;
  }
  
  int ffLDL_treesize(int paramInt) {
    return paramInt + 1 << paramInt;
  }
  
  void ffLDL_fft_inner(FalconFPR[] paramArrayOfFalconFPR1, int paramInt1, FalconFPR[] paramArrayOfFalconFPR2, int paramInt2, FalconFPR[] paramArrayOfFalconFPR3, int paramInt3, int paramInt4, FalconFPR[] paramArrayOfFalconFPR4, int paramInt5) {
    int i = MKN(paramInt4);
    if (i == 1) {
      paramArrayOfFalconFPR1[paramInt1 + 0] = paramArrayOfFalconFPR2[paramInt2 + 0];
      return;
    } 
    int j = i >> 1;
    this.fft.poly_LDLmv_fft(paramArrayOfFalconFPR4, paramInt5, paramArrayOfFalconFPR1, paramInt1, paramArrayOfFalconFPR2, paramInt2, paramArrayOfFalconFPR3, paramInt3, paramArrayOfFalconFPR2, paramInt2, paramInt4);
    this.fft.poly_split_fft(paramArrayOfFalconFPR3, paramInt3, paramArrayOfFalconFPR3, paramInt3 + j, paramArrayOfFalconFPR2, paramInt2, paramInt4);
    this.fft.poly_split_fft(paramArrayOfFalconFPR2, paramInt2, paramArrayOfFalconFPR2, paramInt2 + j, paramArrayOfFalconFPR4, paramInt5, paramInt4);
    ffLDL_fft_inner(paramArrayOfFalconFPR1, paramInt1 + i, paramArrayOfFalconFPR3, paramInt3, paramArrayOfFalconFPR3, paramInt3 + j, paramInt4 - 1, paramArrayOfFalconFPR4, paramInt5);
    ffLDL_fft_inner(paramArrayOfFalconFPR1, paramInt1 + i + ffLDL_treesize(paramInt4 - 1), paramArrayOfFalconFPR2, paramInt2, paramArrayOfFalconFPR2, paramInt2 + j, paramInt4 - 1, paramArrayOfFalconFPR4, paramInt5);
  }
  
  void ffLDL_fft(FalconFPR[] paramArrayOfFalconFPR1, int paramInt1, FalconFPR[] paramArrayOfFalconFPR2, int paramInt2, FalconFPR[] paramArrayOfFalconFPR3, int paramInt3, FalconFPR[] paramArrayOfFalconFPR4, int paramInt4, int paramInt5, FalconFPR[] paramArrayOfFalconFPR5, int paramInt6) {
    int i = MKN(paramInt5);
    if (i == 1) {
      paramArrayOfFalconFPR1[paramInt1 + 0] = paramArrayOfFalconFPR2[paramInt2 + 0];
      return;
    } 
    int j = i >> 1;
    int k = paramInt6;
    int m = paramInt6 + i;
    paramInt6 += i << 1;
    System.arraycopy(paramArrayOfFalconFPR2, paramInt2, paramArrayOfFalconFPR5, k, i);
    this.fft.poly_LDLmv_fft(paramArrayOfFalconFPR5, m, paramArrayOfFalconFPR1, paramInt1, paramArrayOfFalconFPR2, paramInt2, paramArrayOfFalconFPR3, paramInt3, paramArrayOfFalconFPR4, paramInt4, paramInt5);
    this.fft.poly_split_fft(paramArrayOfFalconFPR5, paramInt6, paramArrayOfFalconFPR5, paramInt6 + j, paramArrayOfFalconFPR5, k, paramInt5);
    this.fft.poly_split_fft(paramArrayOfFalconFPR5, k, paramArrayOfFalconFPR5, k + j, paramArrayOfFalconFPR5, m, paramInt5);
    System.arraycopy(paramArrayOfFalconFPR5, paramInt6, paramArrayOfFalconFPR5, m, i);
    ffLDL_fft_inner(paramArrayOfFalconFPR1, paramInt1 + i, paramArrayOfFalconFPR5, m, paramArrayOfFalconFPR5, m + j, paramInt5 - 1, paramArrayOfFalconFPR5, paramInt6);
    ffLDL_fft_inner(paramArrayOfFalconFPR1, paramInt1 + i + ffLDL_treesize(paramInt5 - 1), paramArrayOfFalconFPR5, k, paramArrayOfFalconFPR5, k + j, paramInt5 - 1, paramArrayOfFalconFPR5, paramInt6);
  }
  
  void ffLDL_binary_normalize(FalconFPR[] paramArrayOfFalconFPR, int paramInt1, int paramInt2, int paramInt3) {
    int i = MKN(paramInt3);
    if (i == 1) {
      paramArrayOfFalconFPR[paramInt1 + 0] = this.fpr.fpr_mul(this.fpr.fpr_sqrt(paramArrayOfFalconFPR[paramInt1 + 0]), this.fpr.fpr_inv_sigma[paramInt2]);
    } else {
      ffLDL_binary_normalize(paramArrayOfFalconFPR, paramInt1 + i, paramInt2, paramInt3 - 1);
      ffLDL_binary_normalize(paramArrayOfFalconFPR, paramInt1 + i + ffLDL_treesize(paramInt3 - 1), paramInt2, paramInt3 - 1);
    } 
  }
  
  void smallints_to_fpr(FalconFPR[] paramArrayOfFalconFPR, int paramInt1, byte[] paramArrayOfbyte, int paramInt2, int paramInt3) {
    int i = MKN(paramInt3);
    for (byte b = 0; b < i; b++)
      paramArrayOfFalconFPR[paramInt1 + b] = this.fpr.fpr_of(paramArrayOfbyte[paramInt2 + b]); 
  }
  
  int skoff_b00(int paramInt) {
    return 0;
  }
  
  int skoff_b01(int paramInt) {
    return MKN(paramInt);
  }
  
  int skoff_b10(int paramInt) {
    return 2 * MKN(paramInt);
  }
  
  int skoff_b11(int paramInt) {
    return 3 * MKN(paramInt);
  }
  
  int skoff_tree(int paramInt) {
    return 4 * MKN(paramInt);
  }
  
  void expand_privkey(FalconFPR[] paramArrayOfFalconFPR1, int paramInt1, byte[] paramArrayOfbyte1, int paramInt2, byte[] paramArrayOfbyte2, int paramInt3, byte[] paramArrayOfbyte3, int paramInt4, byte[] paramArrayOfbyte4, int paramInt5, int paramInt6, FalconFPR[] paramArrayOfFalconFPR2, int paramInt7) {
    int i = MKN(paramInt6);
    int i1 = paramInt1 + skoff_b00(paramInt6);
    int i2 = paramInt1 + skoff_b01(paramInt6);
    int i3 = paramInt1 + skoff_b10(paramInt6);
    int i4 = paramInt1 + skoff_b11(paramInt6);
    int i9 = paramInt1 + skoff_tree(paramInt6);
    int j = i2;
    int k = i1;
    int m = i4;
    int n = i3;
    smallints_to_fpr(paramArrayOfFalconFPR1, j, paramArrayOfbyte1, paramInt2, paramInt6);
    smallints_to_fpr(paramArrayOfFalconFPR1, k, paramArrayOfbyte2, paramInt3, paramInt6);
    smallints_to_fpr(paramArrayOfFalconFPR1, m, paramArrayOfbyte3, paramInt4, paramInt6);
    smallints_to_fpr(paramArrayOfFalconFPR1, n, paramArrayOfbyte4, paramInt5, paramInt6);
    this.fft.FFT(paramArrayOfFalconFPR1, j, paramInt6);
    this.fft.FFT(paramArrayOfFalconFPR1, k, paramInt6);
    this.fft.FFT(paramArrayOfFalconFPR1, m, paramInt6);
    this.fft.FFT(paramArrayOfFalconFPR1, n, paramInt6);
    this.fft.poly_neg(paramArrayOfFalconFPR1, j, paramInt6);
    this.fft.poly_neg(paramArrayOfFalconFPR1, m, paramInt6);
    int i5 = paramInt7;
    int i6 = i5 + i;
    int i7 = i6 + i;
    int i8 = i7 + i;
    System.arraycopy(paramArrayOfFalconFPR1, i1, paramArrayOfFalconFPR2, i5, i);
    this.fft.poly_mulselfadj_fft(paramArrayOfFalconFPR2, i5, paramInt6);
    System.arraycopy(paramArrayOfFalconFPR1, i2, paramArrayOfFalconFPR2, i8, i);
    this.fft.poly_mulselfadj_fft(paramArrayOfFalconFPR2, i8, paramInt6);
    this.fft.poly_add(paramArrayOfFalconFPR2, i5, paramArrayOfFalconFPR2, i8, paramInt6);
    System.arraycopy(paramArrayOfFalconFPR1, i1, paramArrayOfFalconFPR2, i6, i);
    this.fft.poly_muladj_fft(paramArrayOfFalconFPR2, i6, paramArrayOfFalconFPR1, i3, paramInt6);
    System.arraycopy(paramArrayOfFalconFPR1, i2, paramArrayOfFalconFPR2, i8, i);
    this.fft.poly_muladj_fft(paramArrayOfFalconFPR2, i8, paramArrayOfFalconFPR1, i4, paramInt6);
    this.fft.poly_add(paramArrayOfFalconFPR2, i6, paramArrayOfFalconFPR2, i8, paramInt6);
    System.arraycopy(paramArrayOfFalconFPR1, i3, paramArrayOfFalconFPR2, i7, i);
    this.fft.poly_mulselfadj_fft(paramArrayOfFalconFPR2, i7, paramInt6);
    System.arraycopy(paramArrayOfFalconFPR1, i4, paramArrayOfFalconFPR2, i8, i);
    this.fft.poly_mulselfadj_fft(paramArrayOfFalconFPR2, i8, paramInt6);
    this.fft.poly_add(paramArrayOfFalconFPR2, i7, paramArrayOfFalconFPR2, i8, paramInt6);
    ffLDL_fft(paramArrayOfFalconFPR1, i9, paramArrayOfFalconFPR2, i5, paramArrayOfFalconFPR2, i6, paramArrayOfFalconFPR2, i7, paramInt6, paramArrayOfFalconFPR2, i8);
    ffLDL_binary_normalize(paramArrayOfFalconFPR1, i9, paramInt6, paramInt6);
  }
  
  void ffSampling_fft_dyntree(SamplerZ paramSamplerZ, SamplerCtx paramSamplerCtx, FalconFPR[] paramArrayOfFalconFPR1, int paramInt1, FalconFPR[] paramArrayOfFalconFPR2, int paramInt2, FalconFPR[] paramArrayOfFalconFPR3, int paramInt3, FalconFPR[] paramArrayOfFalconFPR4, int paramInt4, FalconFPR[] paramArrayOfFalconFPR5, int paramInt5, int paramInt6, int paramInt7, FalconFPR[] paramArrayOfFalconFPR6, int paramInt8) {
    if (paramInt7 == 0) {
      FalconFPR falconFPR = paramArrayOfFalconFPR3[paramInt3 + 0];
      falconFPR = this.fpr.fpr_mul(this.fpr.fpr_sqrt(falconFPR), this.fpr.fpr_inv_sigma[paramInt6]);
      paramArrayOfFalconFPR1[paramInt1 + 0] = this.fpr.fpr_of(paramSamplerZ.sample(paramSamplerCtx, paramArrayOfFalconFPR1[paramInt1 + 0], falconFPR));
      paramArrayOfFalconFPR2[paramInt2 + 0] = this.fpr.fpr_of(paramSamplerZ.sample(paramSamplerCtx, paramArrayOfFalconFPR2[paramInt2 + 0], falconFPR));
      return;
    } 
    int i = 1 << paramInt7;
    int j = i >> 1;
    this.fft.poly_LDL_fft(paramArrayOfFalconFPR3, paramInt3, paramArrayOfFalconFPR4, paramInt4, paramArrayOfFalconFPR5, paramInt5, paramInt7);
    this.fft.poly_split_fft(paramArrayOfFalconFPR6, paramInt8, paramArrayOfFalconFPR6, paramInt8 + j, paramArrayOfFalconFPR3, paramInt3, paramInt7);
    System.arraycopy(paramArrayOfFalconFPR6, paramInt8, paramArrayOfFalconFPR3, paramInt3, i);
    this.fft.poly_split_fft(paramArrayOfFalconFPR6, paramInt8, paramArrayOfFalconFPR6, paramInt8 + j, paramArrayOfFalconFPR5, paramInt5, paramInt7);
    System.arraycopy(paramArrayOfFalconFPR6, paramInt8, paramArrayOfFalconFPR5, paramInt5, i);
    System.arraycopy(paramArrayOfFalconFPR4, paramInt4, paramArrayOfFalconFPR6, paramInt8, i);
    System.arraycopy(paramArrayOfFalconFPR3, paramInt3, paramArrayOfFalconFPR4, paramInt4, j);
    System.arraycopy(paramArrayOfFalconFPR5, paramInt5, paramArrayOfFalconFPR4, paramInt4 + j, j);
    int m = paramInt8 + i;
    this.fft.poly_split_fft(paramArrayOfFalconFPR6, m, paramArrayOfFalconFPR6, m + j, paramArrayOfFalconFPR2, paramInt2, paramInt7);
    ffSampling_fft_dyntree(paramSamplerZ, paramSamplerCtx, paramArrayOfFalconFPR6, m, paramArrayOfFalconFPR6, m + j, paramArrayOfFalconFPR5, paramInt5, paramArrayOfFalconFPR5, paramInt5 + j, paramArrayOfFalconFPR4, paramInt4 + j, paramInt6, paramInt7 - 1, paramArrayOfFalconFPR6, m + i);
    this.fft.poly_merge_fft(paramArrayOfFalconFPR6, paramInt8 + (i << 1), paramArrayOfFalconFPR6, m, paramArrayOfFalconFPR6, m + j, paramInt7);
    System.arraycopy(paramArrayOfFalconFPR2, paramInt2, paramArrayOfFalconFPR6, m, i);
    this.fft.poly_sub(paramArrayOfFalconFPR6, m, paramArrayOfFalconFPR6, paramInt8 + (i << 1), paramInt7);
    System.arraycopy(paramArrayOfFalconFPR6, paramInt8 + (i << 1), paramArrayOfFalconFPR2, paramInt2, i);
    this.fft.poly_mul_fft(paramArrayOfFalconFPR6, paramInt8, paramArrayOfFalconFPR6, m, paramInt7);
    this.fft.poly_add(paramArrayOfFalconFPR1, paramInt1, paramArrayOfFalconFPR6, paramInt8, paramInt7);
    int k = paramInt8;
    this.fft.poly_split_fft(paramArrayOfFalconFPR6, k, paramArrayOfFalconFPR6, k + j, paramArrayOfFalconFPR1, paramInt1, paramInt7);
    ffSampling_fft_dyntree(paramSamplerZ, paramSamplerCtx, paramArrayOfFalconFPR6, k, paramArrayOfFalconFPR6, k + j, paramArrayOfFalconFPR3, paramInt3, paramArrayOfFalconFPR3, paramInt3 + j, paramArrayOfFalconFPR4, paramInt4, paramInt6, paramInt7 - 1, paramArrayOfFalconFPR6, k + i);
    this.fft.poly_merge_fft(paramArrayOfFalconFPR1, paramInt1, paramArrayOfFalconFPR6, k, paramArrayOfFalconFPR6, k + j, paramInt7);
  }
  
  void ffSampling_fft(SamplerZ paramSamplerZ, SamplerCtx paramSamplerCtx, FalconFPR[] paramArrayOfFalconFPR1, int paramInt1, FalconFPR[] paramArrayOfFalconFPR2, int paramInt2, FalconFPR[] paramArrayOfFalconFPR3, int paramInt3, FalconFPR[] paramArrayOfFalconFPR4, int paramInt4, FalconFPR[] paramArrayOfFalconFPR5, int paramInt5, int paramInt6, FalconFPR[] paramArrayOfFalconFPR6, int paramInt7) {
    if (paramInt6 == 2) {
      int n = paramInt3 + 4;
      int i1 = paramInt3 + 8;
      FalconFPR falconFPR10 = paramArrayOfFalconFPR5[paramInt5 + 0];
      FalconFPR falconFPR11 = paramArrayOfFalconFPR5[paramInt5 + 2];
      FalconFPR falconFPR12 = paramArrayOfFalconFPR5[paramInt5 + 1];
      FalconFPR falconFPR13 = paramArrayOfFalconFPR5[paramInt5 + 3];
      FalconFPR falconFPR14 = this.fpr.fpr_add(falconFPR10, falconFPR12);
      FalconFPR falconFPR15 = this.fpr.fpr_add(falconFPR11, falconFPR13);
      FalconFPR falconFPR5 = this.fpr.fpr_half(falconFPR14);
      FalconFPR falconFPR6 = this.fpr.fpr_half(falconFPR15);
      falconFPR14 = this.fpr.fpr_sub(falconFPR10, falconFPR12);
      falconFPR15 = this.fpr.fpr_sub(falconFPR11, falconFPR13);
      FalconFPR falconFPR7 = this.fpr.fpr_mul(this.fpr.fpr_add(falconFPR14, falconFPR15), this.fpr.fpr_invsqrt8);
      FalconFPR falconFPR8 = this.fpr.fpr_mul(this.fpr.fpr_sub(falconFPR15, falconFPR14), this.fpr.fpr_invsqrt8);
      FalconFPR falconFPR1 = falconFPR7;
      FalconFPR falconFPR2 = falconFPR8;
      FalconFPR falconFPR9 = paramArrayOfFalconFPR3[i1 + 3];
      falconFPR7 = this.fpr.fpr_of(paramSamplerZ.sample(paramSamplerCtx, falconFPR1, falconFPR9));
      falconFPR8 = this.fpr.fpr_of(paramSamplerZ.sample(paramSamplerCtx, falconFPR2, falconFPR9));
      falconFPR10 = this.fpr.fpr_sub(falconFPR1, falconFPR7);
      falconFPR11 = this.fpr.fpr_sub(falconFPR2, falconFPR8);
      falconFPR12 = paramArrayOfFalconFPR3[i1 + 0];
      falconFPR13 = paramArrayOfFalconFPR3[i1 + 1];
      falconFPR14 = this.fpr.fpr_sub(this.fpr.fpr_mul(falconFPR10, falconFPR12), this.fpr.fpr_mul(falconFPR11, falconFPR13));
      falconFPR15 = this.fpr.fpr_add(this.fpr.fpr_mul(falconFPR10, falconFPR13), this.fpr.fpr_mul(falconFPR11, falconFPR12));
      falconFPR1 = this.fpr.fpr_add(falconFPR14, falconFPR5);
      falconFPR2 = this.fpr.fpr_add(falconFPR15, falconFPR6);
      falconFPR9 = paramArrayOfFalconFPR3[i1 + 2];
      falconFPR5 = this.fpr.fpr_of(paramSamplerZ.sample(paramSamplerCtx, falconFPR1, falconFPR9));
      falconFPR6 = this.fpr.fpr_of(paramSamplerZ.sample(paramSamplerCtx, falconFPR2, falconFPR9));
      falconFPR10 = falconFPR5;
      falconFPR11 = falconFPR6;
      falconFPR12 = falconFPR7;
      falconFPR13 = falconFPR8;
      falconFPR14 = this.fpr.fpr_mul(this.fpr.fpr_sub(falconFPR12, falconFPR13), this.fpr.fpr_invsqrt2);
      falconFPR15 = this.fpr.fpr_mul(this.fpr.fpr_add(falconFPR12, falconFPR13), this.fpr.fpr_invsqrt2);
      paramArrayOfFalconFPR2[paramInt2 + 0] = falconFPR5 = this.fpr.fpr_add(falconFPR10, falconFPR14);
      paramArrayOfFalconFPR2[paramInt2 + 2] = falconFPR7 = this.fpr.fpr_add(falconFPR11, falconFPR15);
      paramArrayOfFalconFPR2[paramInt2 + 1] = falconFPR6 = this.fpr.fpr_sub(falconFPR10, falconFPR14);
      paramArrayOfFalconFPR2[paramInt2 + 3] = falconFPR8 = this.fpr.fpr_sub(falconFPR11, falconFPR15);
      falconFPR5 = this.fpr.fpr_sub(paramArrayOfFalconFPR5[paramInt5 + 0], falconFPR5);
      falconFPR6 = this.fpr.fpr_sub(paramArrayOfFalconFPR5[paramInt5 + 1], falconFPR6);
      falconFPR7 = this.fpr.fpr_sub(paramArrayOfFalconFPR5[paramInt5 + 2], falconFPR7);
      falconFPR8 = this.fpr.fpr_sub(paramArrayOfFalconFPR5[paramInt5 + 3], falconFPR8);
      falconFPR10 = falconFPR5;
      falconFPR11 = falconFPR7;
      falconFPR12 = paramArrayOfFalconFPR3[paramInt3 + 0];
      falconFPR13 = paramArrayOfFalconFPR3[paramInt3 + 2];
      falconFPR5 = this.fpr.fpr_sub(this.fpr.fpr_mul(falconFPR10, falconFPR12), this.fpr.fpr_mul(falconFPR11, falconFPR13));
      falconFPR7 = this.fpr.fpr_add(this.fpr.fpr_mul(falconFPR10, falconFPR13), this.fpr.fpr_mul(falconFPR11, falconFPR12));
      falconFPR10 = falconFPR6;
      falconFPR11 = falconFPR8;
      falconFPR12 = paramArrayOfFalconFPR3[paramInt3 + 1];
      falconFPR13 = paramArrayOfFalconFPR3[paramInt3 + 3];
      falconFPR6 = this.fpr.fpr_sub(this.fpr.fpr_mul(falconFPR10, falconFPR12), this.fpr.fpr_mul(falconFPR11, falconFPR13));
      falconFPR8 = this.fpr.fpr_add(this.fpr.fpr_mul(falconFPR10, falconFPR13), this.fpr.fpr_mul(falconFPR11, falconFPR12));
      falconFPR5 = this.fpr.fpr_add(falconFPR5, paramArrayOfFalconFPR4[paramInt4 + 0]);
      falconFPR6 = this.fpr.fpr_add(falconFPR6, paramArrayOfFalconFPR4[paramInt4 + 1]);
      falconFPR7 = this.fpr.fpr_add(falconFPR7, paramArrayOfFalconFPR4[paramInt4 + 2]);
      falconFPR8 = this.fpr.fpr_add(falconFPR8, paramArrayOfFalconFPR4[paramInt4 + 3]);
      falconFPR10 = falconFPR5;
      falconFPR11 = falconFPR7;
      falconFPR12 = falconFPR6;
      falconFPR13 = falconFPR8;
      falconFPR14 = this.fpr.fpr_add(falconFPR10, falconFPR12);
      falconFPR15 = this.fpr.fpr_add(falconFPR11, falconFPR13);
      falconFPR5 = this.fpr.fpr_half(falconFPR14);
      falconFPR6 = this.fpr.fpr_half(falconFPR15);
      falconFPR14 = this.fpr.fpr_sub(falconFPR10, falconFPR12);
      falconFPR15 = this.fpr.fpr_sub(falconFPR11, falconFPR13);
      falconFPR7 = this.fpr.fpr_mul(this.fpr.fpr_add(falconFPR14, falconFPR15), this.fpr.fpr_invsqrt8);
      falconFPR8 = this.fpr.fpr_mul(this.fpr.fpr_sub(falconFPR15, falconFPR14), this.fpr.fpr_invsqrt8);
      falconFPR1 = falconFPR7;
      falconFPR2 = falconFPR8;
      falconFPR9 = paramArrayOfFalconFPR3[n + 3];
      FalconFPR falconFPR3 = this.fpr.fpr_of(paramSamplerZ.sample(paramSamplerCtx, falconFPR1, falconFPR9));
      FalconFPR falconFPR4 = this.fpr.fpr_of(paramSamplerZ.sample(paramSamplerCtx, falconFPR2, falconFPR9));
      falconFPR10 = this.fpr.fpr_sub(falconFPR1, falconFPR3);
      falconFPR11 = this.fpr.fpr_sub(falconFPR2, falconFPR4);
      falconFPR12 = paramArrayOfFalconFPR3[n + 0];
      falconFPR13 = paramArrayOfFalconFPR3[n + 1];
      falconFPR14 = this.fpr.fpr_sub(this.fpr.fpr_mul(falconFPR10, falconFPR12), this.fpr.fpr_mul(falconFPR11, falconFPR13));
      falconFPR15 = this.fpr.fpr_add(this.fpr.fpr_mul(falconFPR10, falconFPR13), this.fpr.fpr_mul(falconFPR11, falconFPR12));
      falconFPR1 = this.fpr.fpr_add(falconFPR14, falconFPR5);
      falconFPR2 = this.fpr.fpr_add(falconFPR15, falconFPR6);
      falconFPR9 = paramArrayOfFalconFPR3[n + 2];
      falconFPR5 = this.fpr.fpr_of(paramSamplerZ.sample(paramSamplerCtx, falconFPR1, falconFPR9));
      falconFPR6 = this.fpr.fpr_of(paramSamplerZ.sample(paramSamplerCtx, falconFPR2, falconFPR9));
      falconFPR10 = falconFPR5;
      falconFPR11 = falconFPR6;
      falconFPR12 = falconFPR7;
      falconFPR13 = falconFPR8;
      falconFPR14 = this.fpr.fpr_mul(this.fpr.fpr_sub(falconFPR12, falconFPR13), this.fpr.fpr_invsqrt2);
      falconFPR15 = this.fpr.fpr_mul(this.fpr.fpr_add(falconFPR12, falconFPR13), this.fpr.fpr_invsqrt2);
      paramArrayOfFalconFPR1[paramInt1 + 0] = this.fpr.fpr_add(falconFPR10, falconFPR14);
      paramArrayOfFalconFPR1[paramInt1 + 2] = this.fpr.fpr_add(falconFPR11, falconFPR15);
      paramArrayOfFalconFPR1[paramInt1 + 1] = this.fpr.fpr_sub(falconFPR10, falconFPR14);
      paramArrayOfFalconFPR1[paramInt1 + 3] = this.fpr.fpr_sub(falconFPR11, falconFPR15);
      return;
    } 
    if (paramInt6 == 1) {
      FalconFPR falconFPR1 = paramArrayOfFalconFPR5[paramInt5 + 0];
      FalconFPR falconFPR2 = paramArrayOfFalconFPR5[paramInt5 + 1];
      FalconFPR falconFPR5 = paramArrayOfFalconFPR3[paramInt3 + 3];
      FalconFPR falconFPR3 = this.fpr.fpr_of(paramSamplerZ.sample(paramSamplerCtx, falconFPR1, falconFPR5));
      FalconFPR falconFPR4 = this.fpr.fpr_of(paramSamplerZ.sample(paramSamplerCtx, falconFPR2, falconFPR5));
      FalconFPR falconFPR6 = this.fpr.fpr_sub(falconFPR1, falconFPR3);
      FalconFPR falconFPR7 = this.fpr.fpr_sub(falconFPR2, falconFPR4);
      FalconFPR falconFPR8 = paramArrayOfFalconFPR3[paramInt3 + 0];
      FalconFPR falconFPR9 = paramArrayOfFalconFPR3[paramInt3 + 1];
      FalconFPR falconFPR10 = this.fpr.fpr_sub(this.fpr.fpr_mul(falconFPR6, falconFPR8), this.fpr.fpr_mul(falconFPR7, falconFPR9));
      FalconFPR falconFPR11 = this.fpr.fpr_add(this.fpr.fpr_mul(falconFPR6, falconFPR9), this.fpr.fpr_mul(falconFPR7, falconFPR8));
      falconFPR1 = this.fpr.fpr_add(falconFPR10, paramArrayOfFalconFPR4[paramInt4 + 0]);
      falconFPR2 = this.fpr.fpr_add(falconFPR11, paramArrayOfFalconFPR4[paramInt4 + 1]);
      falconFPR5 = paramArrayOfFalconFPR3[paramInt3 + 2];
      paramArrayOfFalconFPR1[paramInt1 + 0] = this.fpr.fpr_of(paramSamplerZ.sample(paramSamplerCtx, falconFPR1, falconFPR5));
      paramArrayOfFalconFPR1[paramInt1 + 1] = this.fpr.fpr_of(paramSamplerZ.sample(paramSamplerCtx, falconFPR2, falconFPR5));
      return;
    } 
    int i = 1 << paramInt6;
    int j = i >> 1;
    int k = paramInt3 + i;
    int m = paramInt3 + i + ffLDL_treesize(paramInt6 - 1);
    this.fft.poly_split_fft(paramArrayOfFalconFPR2, paramInt2, paramArrayOfFalconFPR2, paramInt2 + j, paramArrayOfFalconFPR5, paramInt5, paramInt6);
    ffSampling_fft(paramSamplerZ, paramSamplerCtx, paramArrayOfFalconFPR6, paramInt7, paramArrayOfFalconFPR6, paramInt7 + j, paramArrayOfFalconFPR3, m, paramArrayOfFalconFPR2, paramInt2, paramArrayOfFalconFPR2, paramInt2 + j, paramInt6 - 1, paramArrayOfFalconFPR6, paramInt7 + i);
    this.fft.poly_merge_fft(paramArrayOfFalconFPR2, paramInt2, paramArrayOfFalconFPR6, paramInt7, paramArrayOfFalconFPR6, paramInt7 + j, paramInt6);
    System.arraycopy(paramArrayOfFalconFPR5, paramInt5, paramArrayOfFalconFPR6, paramInt7, i);
    this.fft.poly_sub(paramArrayOfFalconFPR6, paramInt7, paramArrayOfFalconFPR2, paramInt2, paramInt6);
    this.fft.poly_mul_fft(paramArrayOfFalconFPR6, paramInt7, paramArrayOfFalconFPR3, paramInt3, paramInt6);
    this.fft.poly_add(paramArrayOfFalconFPR6, paramInt7, paramArrayOfFalconFPR4, paramInt4, paramInt6);
    this.fft.poly_split_fft(paramArrayOfFalconFPR1, paramInt1, paramArrayOfFalconFPR1, paramInt1 + j, paramArrayOfFalconFPR6, paramInt7, paramInt6);
    ffSampling_fft(paramSamplerZ, paramSamplerCtx, paramArrayOfFalconFPR6, paramInt7, paramArrayOfFalconFPR6, paramInt7 + j, paramArrayOfFalconFPR3, k, paramArrayOfFalconFPR1, paramInt1, paramArrayOfFalconFPR1, paramInt1 + j, paramInt6 - 1, paramArrayOfFalconFPR6, paramInt7 + i);
    this.fft.poly_merge_fft(paramArrayOfFalconFPR1, paramInt1, paramArrayOfFalconFPR6, paramInt7, paramArrayOfFalconFPR6, paramInt7 + j, paramInt6);
  }
  
  int do_sign_tree(SamplerZ paramSamplerZ, SamplerCtx paramSamplerCtx, short[] paramArrayOfshort1, int paramInt1, FalconFPR[] paramArrayOfFalconFPR1, int paramInt2, short[] paramArrayOfshort2, int paramInt3, int paramInt4, FalconFPR[] paramArrayOfFalconFPR2, int paramInt5) {
    int i = MKN(paramInt4);
    int j = paramInt5;
    int k = j + i;
    int i1 = paramInt2 + skoff_b00(paramInt4);
    int i2 = paramInt2 + skoff_b01(paramInt4);
    int i3 = paramInt2 + skoff_b10(paramInt4);
    int i4 = paramInt2 + skoff_b11(paramInt4);
    int i5 = paramInt2 + skoff_tree(paramInt4);
    byte b;
    for (b = 0; b < i; b++)
      paramArrayOfFalconFPR2[j + b] = this.fpr.fpr_of(paramArrayOfshort2[paramInt3 + b]); 
    this.fft.FFT(paramArrayOfFalconFPR2, j, paramInt4);
    FalconFPR falconFPR = this.fpr.fpr_inverse_of_q;
    System.arraycopy(paramArrayOfFalconFPR2, j, paramArrayOfFalconFPR2, k, i);
    this.fft.poly_mul_fft(paramArrayOfFalconFPR2, k, paramArrayOfFalconFPR1, i2, paramInt4);
    this.fft.poly_mulconst(paramArrayOfFalconFPR2, k, this.fpr.fpr_neg(falconFPR), paramInt4);
    this.fft.poly_mul_fft(paramArrayOfFalconFPR2, j, paramArrayOfFalconFPR1, i4, paramInt4);
    this.fft.poly_mulconst(paramArrayOfFalconFPR2, j, falconFPR, paramInt4);
    int m = k + i;
    int n = m + i;
    ffSampling_fft(paramSamplerZ, paramSamplerCtx, paramArrayOfFalconFPR2, m, paramArrayOfFalconFPR2, n, paramArrayOfFalconFPR1, i5, paramArrayOfFalconFPR2, j, paramArrayOfFalconFPR2, k, paramInt4, paramArrayOfFalconFPR2, n + i);
    System.arraycopy(paramArrayOfFalconFPR2, m, paramArrayOfFalconFPR2, j, i);
    System.arraycopy(paramArrayOfFalconFPR2, n, paramArrayOfFalconFPR2, k, i);
    this.fft.poly_mul_fft(paramArrayOfFalconFPR2, m, paramArrayOfFalconFPR1, i1, paramInt4);
    this.fft.poly_mul_fft(paramArrayOfFalconFPR2, n, paramArrayOfFalconFPR1, i3, paramInt4);
    this.fft.poly_add(paramArrayOfFalconFPR2, m, paramArrayOfFalconFPR2, n, paramInt4);
    System.arraycopy(paramArrayOfFalconFPR2, j, paramArrayOfFalconFPR2, n, i);
    this.fft.poly_mul_fft(paramArrayOfFalconFPR2, n, paramArrayOfFalconFPR1, i2, paramInt4);
    System.arraycopy(paramArrayOfFalconFPR2, m, paramArrayOfFalconFPR2, j, i);
    this.fft.poly_mul_fft(paramArrayOfFalconFPR2, k, paramArrayOfFalconFPR1, i4, paramInt4);
    this.fft.poly_add(paramArrayOfFalconFPR2, k, paramArrayOfFalconFPR2, n, paramInt4);
    this.fft.iFFT(paramArrayOfFalconFPR2, j, paramInt4);
    this.fft.iFFT(paramArrayOfFalconFPR2, k, paramInt4);
    short[] arrayOfShort1 = new short[i];
    int i6 = 0;
    int i7 = 0;
    for (b = 0; b < i; b++) {
      int i8 = (paramArrayOfshort2[paramInt3 + b] & 0xFFFF) - (int)this.fpr.fpr_rint(paramArrayOfFalconFPR2[j + b]);
      i6 += i8 * i8;
      i7 |= i6;
      arrayOfShort1[b] = (short)i8;
    } 
    i6 |= -(i7 >>> 31);
    short[] arrayOfShort2 = new short[i];
    for (b = 0; b < i; b++)
      arrayOfShort2[b] = (short)(int)-this.fpr.fpr_rint(paramArrayOfFalconFPR2[k + b]); 
    if (this.common.is_short_half(i6, arrayOfShort2, 0, paramInt4) != 0) {
      System.arraycopy(arrayOfShort2, 0, paramArrayOfshort1, paramInt1, i);
      System.arraycopy(arrayOfShort1, 0, paramArrayOfFalconFPR2, paramInt5, i);
      return 1;
    } 
    return 0;
  }
  
  int do_sign_dyn(SamplerZ paramSamplerZ, SamplerCtx paramSamplerCtx, short[] paramArrayOfshort1, int paramInt1, byte[] paramArrayOfbyte1, int paramInt2, byte[] paramArrayOfbyte2, int paramInt3, byte[] paramArrayOfbyte3, int paramInt4, byte[] paramArrayOfbyte4, int paramInt5, short[] paramArrayOfshort2, int paramInt6, int paramInt7, FalconFPR[] paramArrayOfFalconFPR, int paramInt8) {
    int i = MKN(paramInt7);
    int i1 = paramInt8;
    int i2 = i1 + i;
    int i3 = i2 + i;
    int i4 = i3 + i;
    smallints_to_fpr(paramArrayOfFalconFPR, i2, paramArrayOfbyte1, paramInt2, paramInt7);
    smallints_to_fpr(paramArrayOfFalconFPR, i1, paramArrayOfbyte2, paramInt3, paramInt7);
    smallints_to_fpr(paramArrayOfFalconFPR, i4, paramArrayOfbyte3, paramInt4, paramInt7);
    smallints_to_fpr(paramArrayOfFalconFPR, i3, paramArrayOfbyte4, paramInt5, paramInt7);
    this.fft.FFT(paramArrayOfFalconFPR, i2, paramInt7);
    this.fft.FFT(paramArrayOfFalconFPR, i1, paramInt7);
    this.fft.FFT(paramArrayOfFalconFPR, i4, paramInt7);
    this.fft.FFT(paramArrayOfFalconFPR, i3, paramInt7);
    this.fft.poly_neg(paramArrayOfFalconFPR, i2, paramInt7);
    this.fft.poly_neg(paramArrayOfFalconFPR, i4, paramInt7);
    int j = i4 + i;
    int k = j + i;
    System.arraycopy(paramArrayOfFalconFPR, i2, paramArrayOfFalconFPR, j, i);
    this.fft.poly_mulselfadj_fft(paramArrayOfFalconFPR, j, paramInt7);
    System.arraycopy(paramArrayOfFalconFPR, i1, paramArrayOfFalconFPR, k, i);
    this.fft.poly_muladj_fft(paramArrayOfFalconFPR, k, paramArrayOfFalconFPR, i3, paramInt7);
    this.fft.poly_mulselfadj_fft(paramArrayOfFalconFPR, i1, paramInt7);
    this.fft.poly_add(paramArrayOfFalconFPR, i1, paramArrayOfFalconFPR, j, paramInt7);
    System.arraycopy(paramArrayOfFalconFPR, i2, paramArrayOfFalconFPR, j, i);
    this.fft.poly_muladj_fft(paramArrayOfFalconFPR, i2, paramArrayOfFalconFPR, i4, paramInt7);
    this.fft.poly_add(paramArrayOfFalconFPR, i2, paramArrayOfFalconFPR, k, paramInt7);
    this.fft.poly_mulselfadj_fft(paramArrayOfFalconFPR, i3, paramInt7);
    System.arraycopy(paramArrayOfFalconFPR, i4, paramArrayOfFalconFPR, k, i);
    this.fft.poly_mulselfadj_fft(paramArrayOfFalconFPR, k, paramInt7);
    this.fft.poly_add(paramArrayOfFalconFPR, i3, paramArrayOfFalconFPR, k, paramInt7);
    int i5 = i1;
    int i6 = i2;
    int i7 = i3;
    i2 = j;
    j = i2 + i;
    k = j + i;
    byte b;
    for (b = 0; b < i; b++)
      paramArrayOfFalconFPR[j + b] = this.fpr.fpr_of(paramArrayOfshort2[paramInt6 + b]); 
    this.fft.FFT(paramArrayOfFalconFPR, j, paramInt7);
    FalconFPR falconFPR = this.fpr.fpr_inverse_of_q;
    System.arraycopy(paramArrayOfFalconFPR, j, paramArrayOfFalconFPR, k, i);
    this.fft.poly_mul_fft(paramArrayOfFalconFPR, k, paramArrayOfFalconFPR, i2, paramInt7);
    this.fft.poly_mulconst(paramArrayOfFalconFPR, k, this.fpr.fpr_neg(falconFPR), paramInt7);
    this.fft.poly_mul_fft(paramArrayOfFalconFPR, j, paramArrayOfFalconFPR, i4, paramInt7);
    this.fft.poly_mulconst(paramArrayOfFalconFPR, j, falconFPR, paramInt7);
    System.arraycopy(paramArrayOfFalconFPR, j, paramArrayOfFalconFPR, i4, 2 * i);
    j = i7 + i;
    k = j + i;
    ffSampling_fft_dyntree(paramSamplerZ, paramSamplerCtx, paramArrayOfFalconFPR, j, paramArrayOfFalconFPR, k, paramArrayOfFalconFPR, i5, paramArrayOfFalconFPR, i6, paramArrayOfFalconFPR, i7, paramInt7, paramInt7, paramArrayOfFalconFPR, k + i);
    i1 = paramInt8;
    i2 = i1 + i;
    i3 = i2 + i;
    i4 = i3 + i;
    System.arraycopy(paramArrayOfFalconFPR, j, paramArrayOfFalconFPR, i4 + i, i * 2);
    j = i4 + i;
    k = j + i;
    smallints_to_fpr(paramArrayOfFalconFPR, i2, paramArrayOfbyte1, paramInt2, paramInt7);
    smallints_to_fpr(paramArrayOfFalconFPR, i1, paramArrayOfbyte2, paramInt3, paramInt7);
    smallints_to_fpr(paramArrayOfFalconFPR, i4, paramArrayOfbyte3, paramInt4, paramInt7);
    smallints_to_fpr(paramArrayOfFalconFPR, i3, paramArrayOfbyte4, paramInt5, paramInt7);
    this.fft.FFT(paramArrayOfFalconFPR, i2, paramInt7);
    this.fft.FFT(paramArrayOfFalconFPR, i1, paramInt7);
    this.fft.FFT(paramArrayOfFalconFPR, i4, paramInt7);
    this.fft.FFT(paramArrayOfFalconFPR, i3, paramInt7);
    this.fft.poly_neg(paramArrayOfFalconFPR, i2, paramInt7);
    this.fft.poly_neg(paramArrayOfFalconFPR, i4, paramInt7);
    int m = k + i;
    int n = m + i;
    System.arraycopy(paramArrayOfFalconFPR, j, paramArrayOfFalconFPR, m, i);
    System.arraycopy(paramArrayOfFalconFPR, k, paramArrayOfFalconFPR, n, i);
    this.fft.poly_mul_fft(paramArrayOfFalconFPR, m, paramArrayOfFalconFPR, i1, paramInt7);
    this.fft.poly_mul_fft(paramArrayOfFalconFPR, n, paramArrayOfFalconFPR, i3, paramInt7);
    this.fft.poly_add(paramArrayOfFalconFPR, m, paramArrayOfFalconFPR, n, paramInt7);
    System.arraycopy(paramArrayOfFalconFPR, j, paramArrayOfFalconFPR, n, i);
    this.fft.poly_mul_fft(paramArrayOfFalconFPR, n, paramArrayOfFalconFPR, i2, paramInt7);
    System.arraycopy(paramArrayOfFalconFPR, m, paramArrayOfFalconFPR, j, i);
    this.fft.poly_mul_fft(paramArrayOfFalconFPR, k, paramArrayOfFalconFPR, i4, paramInt7);
    this.fft.poly_add(paramArrayOfFalconFPR, k, paramArrayOfFalconFPR, n, paramInt7);
    this.fft.iFFT(paramArrayOfFalconFPR, j, paramInt7);
    this.fft.iFFT(paramArrayOfFalconFPR, k, paramInt7);
    short[] arrayOfShort1 = new short[i];
    int i8 = 0;
    int i9 = 0;
    for (b = 0; b < i; b++) {
      int i10 = (paramArrayOfshort2[paramInt6 + b] & 0xFFFF) - (int)this.fpr.fpr_rint(paramArrayOfFalconFPR[j + b]);
      i8 += i10 * i10;
      i9 |= i8;
      arrayOfShort1[b] = (short)i10;
    } 
    i8 |= -(i9 >>> 31);
    short[] arrayOfShort2 = new short[i];
    for (b = 0; b < i; b++)
      arrayOfShort2[b] = (short)(int)-this.fpr.fpr_rint(paramArrayOfFalconFPR[k + b]); 
    if (this.common.is_short_half(i8, arrayOfShort2, 0, paramInt7) != 0) {
      System.arraycopy(arrayOfShort2, 0, paramArrayOfshort1, paramInt1, i);
      return 1;
    } 
    return 0;
  }
  
  void sign_tree(short[] paramArrayOfshort1, int paramInt1, SHAKE256 paramSHAKE256, FalconFPR[] paramArrayOfFalconFPR1, int paramInt2, short[] paramArrayOfshort2, int paramInt3, int paramInt4, FalconFPR[] paramArrayOfFalconFPR2, int paramInt5) {
    SamplerZ samplerZ;
    SamplerCtx samplerCtx;
    int i = paramInt5;
    do {
      SamplerCtx samplerCtx1 = new SamplerCtx();
      samplerZ = new SamplerZ();
      samplerCtx1.sigma_min = this.fpr.fpr_sigma_min[paramInt4];
      samplerCtx1.p.prng_init(paramSHAKE256);
      samplerCtx = samplerCtx1;
    } while (do_sign_tree(samplerZ, samplerCtx, paramArrayOfshort1, paramInt1, paramArrayOfFalconFPR1, paramInt2, paramArrayOfshort2, paramInt3, paramInt4, paramArrayOfFalconFPR2, i) == 0);
  }
  
  void sign_dyn(short[] paramArrayOfshort1, int paramInt1, SHAKE256 paramSHAKE256, byte[] paramArrayOfbyte1, int paramInt2, byte[] paramArrayOfbyte2, int paramInt3, byte[] paramArrayOfbyte3, int paramInt4, byte[] paramArrayOfbyte4, int paramInt5, short[] paramArrayOfshort2, int paramInt6, int paramInt7, FalconFPR[] paramArrayOfFalconFPR, int paramInt8) {
    SamplerZ samplerZ;
    SamplerCtx samplerCtx;
    int i = paramInt8;
    do {
      SamplerCtx samplerCtx1 = new SamplerCtx();
      samplerZ = new SamplerZ();
      samplerCtx1.sigma_min = this.fpr.fpr_sigma_min[paramInt7];
      samplerCtx1.p.prng_init(paramSHAKE256);
      samplerCtx = samplerCtx1;
    } while (do_sign_dyn(samplerZ, samplerCtx, paramArrayOfshort1, paramInt1, paramArrayOfbyte1, paramInt2, paramArrayOfbyte2, paramInt3, paramArrayOfbyte3, paramInt4, paramArrayOfbyte4, paramInt5, paramArrayOfshort2, paramInt6, paramInt7, paramArrayOfFalconFPR, i) == 0);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\falcon\FalconSign.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */