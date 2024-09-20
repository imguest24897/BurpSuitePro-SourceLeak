package org.bouncycastle.pqc.crypto.falcon;

class FalconFFT {
  FPREngine fpr = new FPREngine();
  
  ComplexNumberWrapper FPC_ADD(FalconFPR paramFalconFPR1, FalconFPR paramFalconFPR2, FalconFPR paramFalconFPR3, FalconFPR paramFalconFPR4) {
    FalconFPR falconFPR1 = this.fpr.fpr_add(paramFalconFPR1, paramFalconFPR3);
    FalconFPR falconFPR2 = this.fpr.fpr_add(paramFalconFPR2, paramFalconFPR4);
    return new ComplexNumberWrapper(falconFPR1, falconFPR2);
  }
  
  ComplexNumberWrapper FPC_SUB(FalconFPR paramFalconFPR1, FalconFPR paramFalconFPR2, FalconFPR paramFalconFPR3, FalconFPR paramFalconFPR4) {
    FalconFPR falconFPR1 = this.fpr.fpr_sub(paramFalconFPR1, paramFalconFPR3);
    FalconFPR falconFPR2 = this.fpr.fpr_sub(paramFalconFPR2, paramFalconFPR4);
    return new ComplexNumberWrapper(falconFPR1, falconFPR2);
  }
  
  ComplexNumberWrapper FPC_MUL(FalconFPR paramFalconFPR1, FalconFPR paramFalconFPR2, FalconFPR paramFalconFPR3, FalconFPR paramFalconFPR4) {
    FalconFPR falconFPR1 = paramFalconFPR1;
    FalconFPR falconFPR2 = paramFalconFPR2;
    FalconFPR falconFPR3 = paramFalconFPR3;
    FalconFPR falconFPR4 = paramFalconFPR4;
    FalconFPR falconFPR5 = this.fpr.fpr_sub(this.fpr.fpr_mul(falconFPR1, falconFPR3), this.fpr.fpr_mul(falconFPR2, falconFPR4));
    FalconFPR falconFPR6 = this.fpr.fpr_add(this.fpr.fpr_mul(falconFPR1, falconFPR4), this.fpr.fpr_mul(falconFPR2, falconFPR3));
    return new ComplexNumberWrapper(falconFPR5, falconFPR6);
  }
  
  ComplexNumberWrapper FPC_SQR(FalconFPR paramFalconFPR1, FalconFPR paramFalconFPR2) {
    FalconFPR falconFPR1 = paramFalconFPR1;
    FalconFPR falconFPR2 = paramFalconFPR2;
    FalconFPR falconFPR3 = this.fpr.fpr_sub(this.fpr.fpr_sqr(falconFPR1), this.fpr.fpr_sqr(falconFPR2));
    FalconFPR falconFPR4 = this.fpr.fpr_double(this.fpr.fpr_mul(falconFPR1, falconFPR2));
    return new ComplexNumberWrapper(falconFPR3, falconFPR4);
  }
  
  ComplexNumberWrapper FPC_INV(FalconFPR paramFalconFPR1, FalconFPR paramFalconFPR2) {
    FalconFPR falconFPR1 = paramFalconFPR1;
    FalconFPR falconFPR2 = paramFalconFPR2;
    FalconFPR falconFPR5 = this.fpr.fpr_add(this.fpr.fpr_sqr(falconFPR1), this.fpr.fpr_sqr(falconFPR2));
    falconFPR5 = this.fpr.fpr_inv(falconFPR5);
    FalconFPR falconFPR3 = this.fpr.fpr_mul(falconFPR1, falconFPR5);
    FalconFPR falconFPR4 = this.fpr.fpr_mul(this.fpr.fpr_neg(falconFPR2), falconFPR5);
    return new ComplexNumberWrapper(falconFPR3, falconFPR4);
  }
  
  ComplexNumberWrapper FPC_DIV(FalconFPR paramFalconFPR1, FalconFPR paramFalconFPR2, FalconFPR paramFalconFPR3, FalconFPR paramFalconFPR4) {
    FalconFPR falconFPR1 = paramFalconFPR1;
    FalconFPR falconFPR2 = paramFalconFPR2;
    FalconFPR falconFPR3 = paramFalconFPR3;
    FalconFPR falconFPR4 = paramFalconFPR4;
    FalconFPR falconFPR7 = this.fpr.fpr_add(this.fpr.fpr_sqr(falconFPR3), this.fpr.fpr_sqr(falconFPR4));
    falconFPR7 = this.fpr.fpr_inv(falconFPR7);
    falconFPR3 = this.fpr.fpr_mul(falconFPR3, falconFPR7);
    falconFPR4 = this.fpr.fpr_mul(this.fpr.fpr_neg(falconFPR4), falconFPR7);
    FalconFPR falconFPR5 = this.fpr.fpr_sub(this.fpr.fpr_mul(falconFPR1, falconFPR3), this.fpr.fpr_mul(falconFPR2, falconFPR4));
    FalconFPR falconFPR6 = this.fpr.fpr_add(this.fpr.fpr_mul(falconFPR1, falconFPR4), this.fpr.fpr_mul(falconFPR2, falconFPR3));
    return new ComplexNumberWrapper(falconFPR5, falconFPR6);
  }
  
  void FFT(FalconFPR[] paramArrayOfFalconFPR, int paramInt1, int paramInt2) {
    int j = 1 << paramInt2;
    int k = j >> 1;
    int i = k;
    byte b = 1;
    int m;
    for (m = 2; b < paramInt2; m <<= 1) {
      int n = i >> 1;
      int i1 = m >> 1;
      byte b1 = 0;
      int i2;
      for (i2 = 0; b1 < i1; i2 += i) {
        int i4 = i2 + n;
        FalconFPR falconFPR1 = this.fpr.fpr_gm_tab[(m + b1 << 1) + 0];
        FalconFPR falconFPR2 = this.fpr.fpr_gm_tab[(m + b1 << 1) + 1];
        for (int i3 = i2; i3 < i4; i3++) {
          FalconFPR falconFPR3 = paramArrayOfFalconFPR[paramInt1 + i3];
          FalconFPR falconFPR4 = paramArrayOfFalconFPR[paramInt1 + i3 + k];
          FalconFPR falconFPR5 = paramArrayOfFalconFPR[paramInt1 + i3 + n];
          FalconFPR falconFPR6 = paramArrayOfFalconFPR[paramInt1 + i3 + n + k];
          ComplexNumberWrapper complexNumberWrapper = FPC_MUL(falconFPR5, falconFPR6, falconFPR1, falconFPR2);
          falconFPR5 = complexNumberWrapper.re;
          falconFPR6 = complexNumberWrapper.im;
          complexNumberWrapper = FPC_ADD(falconFPR3, falconFPR4, falconFPR5, falconFPR6);
          paramArrayOfFalconFPR[paramInt1 + i3] = complexNumberWrapper.re;
          paramArrayOfFalconFPR[paramInt1 + i3 + k] = complexNumberWrapper.im;
          complexNumberWrapper = FPC_SUB(falconFPR3, falconFPR4, falconFPR5, falconFPR6);
          paramArrayOfFalconFPR[paramInt1 + i3 + n] = complexNumberWrapper.re;
          paramArrayOfFalconFPR[paramInt1 + i3 + n + k] = complexNumberWrapper.im;
        } 
        b1++;
      } 
      i = n;
      b++;
    } 
  }
  
  void iFFT(FalconFPR[] paramArrayOfFalconFPR, int paramInt1, int paramInt2) {
    int j = 1 << paramInt2;
    int m = 1;
    int n = j;
    int k = j >> 1;
    int i;
    for (i = paramInt2; i > 1; i--) {
      int i1 = n >> 1;
      int i2 = m << 1;
      byte b = 0;
      int i3;
      for (i3 = 0; i3 < k; i3 += i2) {
        int i5 = i3 + m;
        FalconFPR falconFPR1 = this.fpr.fpr_gm_tab[(i1 + b << 1) + 0];
        FalconFPR falconFPR2 = this.fpr.fpr_neg(this.fpr.fpr_gm_tab[(i1 + b << 1) + 1]);
        for (int i4 = i3; i4 < i5; i4++) {
          FalconFPR falconFPR3 = paramArrayOfFalconFPR[paramInt1 + i4];
          FalconFPR falconFPR4 = paramArrayOfFalconFPR[paramInt1 + i4 + k];
          FalconFPR falconFPR5 = paramArrayOfFalconFPR[paramInt1 + i4 + m];
          FalconFPR falconFPR6 = paramArrayOfFalconFPR[paramInt1 + i4 + m + k];
          ComplexNumberWrapper complexNumberWrapper = FPC_ADD(falconFPR3, falconFPR4, falconFPR5, falconFPR6);
          paramArrayOfFalconFPR[paramInt1 + i4] = complexNumberWrapper.re;
          paramArrayOfFalconFPR[paramInt1 + i4 + k] = complexNumberWrapper.im;
          complexNumberWrapper = FPC_SUB(falconFPR3, falconFPR4, falconFPR5, falconFPR6);
          falconFPR3 = complexNumberWrapper.re;
          falconFPR4 = complexNumberWrapper.im;
          complexNumberWrapper = FPC_MUL(falconFPR3, falconFPR4, falconFPR1, falconFPR2);
          paramArrayOfFalconFPR[paramInt1 + i4 + m] = complexNumberWrapper.re;
          paramArrayOfFalconFPR[paramInt1 + i4 + m + k] = complexNumberWrapper.im;
        } 
        b++;
      } 
      m = i2;
      n = i1;
    } 
    if (paramInt2 > 0) {
      FalconFPR falconFPR = this.fpr.fpr_p2_tab[paramInt2];
      for (i = 0; i < j; i++)
        paramArrayOfFalconFPR[paramInt1 + i] = this.fpr.fpr_mul(paramArrayOfFalconFPR[paramInt1 + i], falconFPR); 
    } 
  }
  
  void poly_add(FalconFPR[] paramArrayOfFalconFPR1, int paramInt1, FalconFPR[] paramArrayOfFalconFPR2, int paramInt2, int paramInt3) {
    int i = 1 << paramInt3;
    for (byte b = 0; b < i; b++)
      paramArrayOfFalconFPR1[paramInt1 + b] = this.fpr.fpr_add(paramArrayOfFalconFPR1[paramInt1 + b], paramArrayOfFalconFPR2[paramInt2 + b]); 
  }
  
  void poly_sub(FalconFPR[] paramArrayOfFalconFPR1, int paramInt1, FalconFPR[] paramArrayOfFalconFPR2, int paramInt2, int paramInt3) {
    int i = 1 << paramInt3;
    for (byte b = 0; b < i; b++)
      paramArrayOfFalconFPR1[paramInt1 + b] = this.fpr.fpr_sub(paramArrayOfFalconFPR1[paramInt1 + b], paramArrayOfFalconFPR2[paramInt2 + b]); 
  }
  
  void poly_neg(FalconFPR[] paramArrayOfFalconFPR, int paramInt1, int paramInt2) {
    int i = 1 << paramInt2;
    for (byte b = 0; b < i; b++)
      paramArrayOfFalconFPR[paramInt1 + b] = this.fpr.fpr_neg(paramArrayOfFalconFPR[paramInt1 + b]); 
  }
  
  void poly_adj_fft(FalconFPR[] paramArrayOfFalconFPR, int paramInt1, int paramInt2) {
    int i = 1 << paramInt2;
    for (int j = i >> 1; j < i; j++)
      paramArrayOfFalconFPR[paramInt1 + j] = this.fpr.fpr_neg(paramArrayOfFalconFPR[paramInt1 + j]); 
  }
  
  void poly_mul_fft(FalconFPR[] paramArrayOfFalconFPR1, int paramInt1, FalconFPR[] paramArrayOfFalconFPR2, int paramInt2, int paramInt3) {
    int i = 1 << paramInt3;
    int j = i >> 1;
    for (byte b = 0; b < j; b++) {
      FalconFPR falconFPR1 = paramArrayOfFalconFPR1[paramInt1 + b];
      FalconFPR falconFPR2 = paramArrayOfFalconFPR1[paramInt1 + b + j];
      FalconFPR falconFPR3 = paramArrayOfFalconFPR2[paramInt2 + b];
      FalconFPR falconFPR4 = paramArrayOfFalconFPR2[paramInt2 + b + j];
      ComplexNumberWrapper complexNumberWrapper = FPC_MUL(falconFPR1, falconFPR2, falconFPR3, falconFPR4);
      paramArrayOfFalconFPR1[paramInt1 + b] = complexNumberWrapper.re;
      paramArrayOfFalconFPR1[paramInt1 + b + j] = complexNumberWrapper.im;
    } 
  }
  
  void poly_muladj_fft(FalconFPR[] paramArrayOfFalconFPR1, int paramInt1, FalconFPR[] paramArrayOfFalconFPR2, int paramInt2, int paramInt3) {
    int i = 1 << paramInt3;
    int j = i >> 1;
    for (byte b = 0; b < j; b++) {
      FalconFPR falconFPR1 = paramArrayOfFalconFPR1[paramInt1 + b];
      FalconFPR falconFPR2 = paramArrayOfFalconFPR1[paramInt1 + b + j];
      FalconFPR falconFPR3 = paramArrayOfFalconFPR2[paramInt2 + b];
      FalconFPR falconFPR4 = this.fpr.fpr_neg(paramArrayOfFalconFPR2[paramInt2 + b + j]);
      ComplexNumberWrapper complexNumberWrapper = FPC_MUL(falconFPR1, falconFPR2, falconFPR3, falconFPR4);
      paramArrayOfFalconFPR1[paramInt1 + b] = complexNumberWrapper.re;
      paramArrayOfFalconFPR1[paramInt1 + b + j] = complexNumberWrapper.im;
    } 
  }
  
  void poly_mulselfadj_fft(FalconFPR[] paramArrayOfFalconFPR, int paramInt1, int paramInt2) {
    int i = 1 << paramInt2;
    int j = i >> 1;
    for (byte b = 0; b < j; b++) {
      FalconFPR falconFPR1 = paramArrayOfFalconFPR[paramInt1 + b];
      FalconFPR falconFPR2 = paramArrayOfFalconFPR[paramInt1 + b + j];
      paramArrayOfFalconFPR[paramInt1 + b] = this.fpr.fpr_add(this.fpr.fpr_sqr(falconFPR1), this.fpr.fpr_sqr(falconFPR2));
      paramArrayOfFalconFPR[paramInt1 + b + j] = this.fpr.fpr_zero;
    } 
  }
  
  void poly_mulconst(FalconFPR[] paramArrayOfFalconFPR, int paramInt1, FalconFPR paramFalconFPR, int paramInt2) {
    int i = 1 << paramInt2;
    for (byte b = 0; b < i; b++)
      paramArrayOfFalconFPR[paramInt1 + b] = this.fpr.fpr_mul(paramArrayOfFalconFPR[paramInt1 + b], paramFalconFPR); 
  }
  
  void poly_div_fft(FalconFPR[] paramArrayOfFalconFPR1, int paramInt1, FalconFPR[] paramArrayOfFalconFPR2, int paramInt2, int paramInt3) {
    int i = 1 << paramInt3;
    int j = i >> 1;
    for (byte b = 0; b < j; b++) {
      FalconFPR falconFPR1 = paramArrayOfFalconFPR1[paramInt1 + b];
      FalconFPR falconFPR2 = paramArrayOfFalconFPR1[paramInt1 + b + j];
      FalconFPR falconFPR3 = paramArrayOfFalconFPR2[paramInt2 + b];
      FalconFPR falconFPR4 = paramArrayOfFalconFPR2[paramInt2 + b + j];
      ComplexNumberWrapper complexNumberWrapper = FPC_DIV(falconFPR1, falconFPR2, falconFPR3, falconFPR4);
      paramArrayOfFalconFPR1[paramInt1 + b] = complexNumberWrapper.re;
      paramArrayOfFalconFPR1[paramInt1 + b + j] = complexNumberWrapper.im;
    } 
  }
  
  void poly_invnorm2_fft(FalconFPR[] paramArrayOfFalconFPR1, int paramInt1, FalconFPR[] paramArrayOfFalconFPR2, int paramInt2, FalconFPR[] paramArrayOfFalconFPR3, int paramInt3, int paramInt4) {
    int i = 1 << paramInt4;
    int j = i >> 1;
    for (byte b = 0; b < j; b++) {
      FalconFPR falconFPR1 = paramArrayOfFalconFPR2[paramInt2 + b];
      FalconFPR falconFPR2 = paramArrayOfFalconFPR2[paramInt2 + b + j];
      FalconFPR falconFPR3 = paramArrayOfFalconFPR3[paramInt3 + b];
      FalconFPR falconFPR4 = paramArrayOfFalconFPR3[paramInt3 + b + j];
      paramArrayOfFalconFPR1[paramInt1 + b] = this.fpr.fpr_inv(this.fpr.fpr_add(this.fpr.fpr_add(this.fpr.fpr_sqr(falconFPR1), this.fpr.fpr_sqr(falconFPR2)), this.fpr.fpr_add(this.fpr.fpr_sqr(falconFPR3), this.fpr.fpr_sqr(falconFPR4))));
    } 
  }
  
  void poly_add_muladj_fft(FalconFPR[] paramArrayOfFalconFPR1, int paramInt1, FalconFPR[] paramArrayOfFalconFPR2, int paramInt2, FalconFPR[] paramArrayOfFalconFPR3, int paramInt3, FalconFPR[] paramArrayOfFalconFPR4, int paramInt4, FalconFPR[] paramArrayOfFalconFPR5, int paramInt5, int paramInt6) {
    int i = 1 << paramInt6;
    int j = i >> 1;
    for (byte b = 0; b < j; b++) {
      FalconFPR falconFPR1 = paramArrayOfFalconFPR2[paramInt2 + b];
      FalconFPR falconFPR2 = paramArrayOfFalconFPR2[paramInt2 + b + j];
      FalconFPR falconFPR3 = paramArrayOfFalconFPR3[paramInt3 + b];
      FalconFPR falconFPR4 = paramArrayOfFalconFPR3[paramInt3 + b + j];
      FalconFPR falconFPR5 = paramArrayOfFalconFPR4[paramInt4 + b];
      FalconFPR falconFPR6 = paramArrayOfFalconFPR4[paramInt4 + b + j];
      FalconFPR falconFPR7 = paramArrayOfFalconFPR5[paramInt5 + b];
      FalconFPR falconFPR8 = paramArrayOfFalconFPR5[paramInt5 + b + j];
      ComplexNumberWrapper complexNumberWrapper = FPC_MUL(falconFPR1, falconFPR2, falconFPR5, this.fpr.fpr_neg(falconFPR6));
      FalconFPR falconFPR9 = complexNumberWrapper.re;
      FalconFPR falconFPR10 = complexNumberWrapper.im;
      complexNumberWrapper = FPC_MUL(falconFPR3, falconFPR4, falconFPR7, this.fpr.fpr_neg(falconFPR8));
      FalconFPR falconFPR11 = complexNumberWrapper.re;
      FalconFPR falconFPR12 = complexNumberWrapper.im;
      paramArrayOfFalconFPR1[paramInt1 + b] = this.fpr.fpr_add(falconFPR9, falconFPR11);
      paramArrayOfFalconFPR1[paramInt1 + b + j] = this.fpr.fpr_add(falconFPR10, falconFPR12);
    } 
  }
  
  void poly_mul_autoadj_fft(FalconFPR[] paramArrayOfFalconFPR1, int paramInt1, FalconFPR[] paramArrayOfFalconFPR2, int paramInt2, int paramInt3) {
    int i = 1 << paramInt3;
    int j = i >> 1;
    for (byte b = 0; b < j; b++) {
      paramArrayOfFalconFPR1[paramInt1 + b] = this.fpr.fpr_mul(paramArrayOfFalconFPR1[paramInt1 + b], paramArrayOfFalconFPR2[paramInt2 + b]);
      paramArrayOfFalconFPR1[paramInt1 + b + j] = this.fpr.fpr_mul(paramArrayOfFalconFPR1[paramInt1 + b + j], paramArrayOfFalconFPR2[paramInt2 + b]);
    } 
  }
  
  void poly_div_autoadj_fft(FalconFPR[] paramArrayOfFalconFPR1, int paramInt1, FalconFPR[] paramArrayOfFalconFPR2, int paramInt2, int paramInt3) {
    int i = 1 << paramInt3;
    int j = i >> 1;
    for (byte b = 0; b < j; b++) {
      FalconFPR falconFPR = this.fpr.fpr_inv(paramArrayOfFalconFPR2[paramInt2 + b]);
      paramArrayOfFalconFPR1[paramInt1 + b] = this.fpr.fpr_mul(paramArrayOfFalconFPR1[paramInt1 + b], falconFPR);
      paramArrayOfFalconFPR1[paramInt1 + b + j] = this.fpr.fpr_mul(paramArrayOfFalconFPR1[paramInt1 + b + j], falconFPR);
    } 
  }
  
  void poly_LDL_fft(FalconFPR[] paramArrayOfFalconFPR1, int paramInt1, FalconFPR[] paramArrayOfFalconFPR2, int paramInt2, FalconFPR[] paramArrayOfFalconFPR3, int paramInt3, int paramInt4) {
    int i = 1 << paramInt4;
    int j = i >> 1;
    for (byte b = 0; b < j; b++) {
      FalconFPR falconFPR1 = paramArrayOfFalconFPR1[paramInt1 + b];
      FalconFPR falconFPR2 = paramArrayOfFalconFPR1[paramInt1 + b + j];
      FalconFPR falconFPR3 = paramArrayOfFalconFPR2[paramInt2 + b];
      FalconFPR falconFPR4 = paramArrayOfFalconFPR2[paramInt2 + b + j];
      FalconFPR falconFPR5 = paramArrayOfFalconFPR3[paramInt3 + b];
      FalconFPR falconFPR6 = paramArrayOfFalconFPR3[paramInt3 + b + j];
      ComplexNumberWrapper complexNumberWrapper = FPC_DIV(falconFPR3, falconFPR4, falconFPR1, falconFPR2);
      FalconFPR falconFPR7 = complexNumberWrapper.re;
      FalconFPR falconFPR8 = complexNumberWrapper.im;
      complexNumberWrapper = FPC_MUL(falconFPR7, falconFPR8, falconFPR3, this.fpr.fpr_neg(falconFPR4));
      falconFPR3 = complexNumberWrapper.re;
      falconFPR4 = complexNumberWrapper.im;
      complexNumberWrapper = FPC_SUB(falconFPR5, falconFPR6, falconFPR3, falconFPR4);
      paramArrayOfFalconFPR3[paramInt3 + b] = complexNumberWrapper.re;
      paramArrayOfFalconFPR3[paramInt3 + b + j] = complexNumberWrapper.im;
      paramArrayOfFalconFPR2[paramInt2 + b] = falconFPR7;
      paramArrayOfFalconFPR2[paramInt2 + b + j] = this.fpr.fpr_neg(falconFPR8);
    } 
  }
  
  void poly_LDLmv_fft(FalconFPR[] paramArrayOfFalconFPR1, int paramInt1, FalconFPR[] paramArrayOfFalconFPR2, int paramInt2, FalconFPR[] paramArrayOfFalconFPR3, int paramInt3, FalconFPR[] paramArrayOfFalconFPR4, int paramInt4, FalconFPR[] paramArrayOfFalconFPR5, int paramInt5, int paramInt6) {
    int i = 1 << paramInt6;
    int j = i >> 1;
    for (byte b = 0; b < j; b++) {
      FalconFPR falconFPR1 = paramArrayOfFalconFPR3[paramInt3 + b];
      FalconFPR falconFPR2 = paramArrayOfFalconFPR3[paramInt3 + b + j];
      FalconFPR falconFPR3 = paramArrayOfFalconFPR4[paramInt4 + b];
      FalconFPR falconFPR4 = paramArrayOfFalconFPR4[paramInt4 + b + j];
      FalconFPR falconFPR5 = paramArrayOfFalconFPR5[paramInt5 + b];
      FalconFPR falconFPR6 = paramArrayOfFalconFPR5[paramInt5 + b + j];
      ComplexNumberWrapper complexNumberWrapper = FPC_DIV(falconFPR3, falconFPR4, falconFPR1, falconFPR2);
      FalconFPR falconFPR7 = complexNumberWrapper.re;
      FalconFPR falconFPR8 = complexNumberWrapper.im;
      complexNumberWrapper = FPC_MUL(falconFPR7, falconFPR8, falconFPR3, this.fpr.fpr_neg(falconFPR4));
      falconFPR3 = complexNumberWrapper.re;
      falconFPR4 = complexNumberWrapper.im;
      complexNumberWrapper = FPC_SUB(falconFPR5, falconFPR6, falconFPR3, falconFPR4);
      paramArrayOfFalconFPR1[paramInt1 + b] = complexNumberWrapper.re;
      paramArrayOfFalconFPR1[paramInt1 + b + j] = complexNumberWrapper.im;
      paramArrayOfFalconFPR2[paramInt2 + b] = falconFPR7;
      paramArrayOfFalconFPR2[paramInt2 + b + j] = this.fpr.fpr_neg(falconFPR8);
    } 
  }
  
  void poly_split_fft(FalconFPR[] paramArrayOfFalconFPR1, int paramInt1, FalconFPR[] paramArrayOfFalconFPR2, int paramInt2, FalconFPR[] paramArrayOfFalconFPR3, int paramInt3, int paramInt4) {
    int i = 1 << paramInt4;
    int j = i >> 1;
    int k = j >> 1;
    paramArrayOfFalconFPR1[paramInt1 + 0] = paramArrayOfFalconFPR3[paramInt3 + 0];
    paramArrayOfFalconFPR2[paramInt2 + 0] = paramArrayOfFalconFPR3[paramInt3 + j];
    for (byte b = 0; b < k; b++) {
      FalconFPR falconFPR1 = paramArrayOfFalconFPR3[paramInt3 + (b << 1) + 0];
      FalconFPR falconFPR2 = paramArrayOfFalconFPR3[paramInt3 + (b << 1) + 0 + j];
      FalconFPR falconFPR3 = paramArrayOfFalconFPR3[paramInt3 + (b << 1) + 1];
      FalconFPR falconFPR4 = paramArrayOfFalconFPR3[paramInt3 + (b << 1) + 1 + j];
      ComplexNumberWrapper complexNumberWrapper = FPC_ADD(falconFPR1, falconFPR2, falconFPR3, falconFPR4);
      FalconFPR falconFPR5 = complexNumberWrapper.re;
      FalconFPR falconFPR6 = complexNumberWrapper.im;
      paramArrayOfFalconFPR1[paramInt1 + b] = this.fpr.fpr_half(falconFPR5);
      paramArrayOfFalconFPR1[paramInt1 + b + k] = this.fpr.fpr_half(falconFPR6);
      complexNumberWrapper = FPC_SUB(falconFPR1, falconFPR2, falconFPR3, falconFPR4);
      falconFPR5 = complexNumberWrapper.re;
      falconFPR6 = complexNumberWrapper.im;
      complexNumberWrapper = FPC_MUL(falconFPR5, falconFPR6, this.fpr.fpr_gm_tab[(b + j << 1) + 0], this.fpr.fpr_neg(this.fpr.fpr_gm_tab[(b + j << 1) + 1]));
      falconFPR5 = complexNumberWrapper.re;
      falconFPR6 = complexNumberWrapper.im;
      paramArrayOfFalconFPR2[paramInt2 + b] = this.fpr.fpr_half(falconFPR5);
      paramArrayOfFalconFPR2[paramInt2 + b + k] = this.fpr.fpr_half(falconFPR6);
    } 
  }
  
  void poly_merge_fft(FalconFPR[] paramArrayOfFalconFPR1, int paramInt1, FalconFPR[] paramArrayOfFalconFPR2, int paramInt2, FalconFPR[] paramArrayOfFalconFPR3, int paramInt3, int paramInt4) {
    int i = 1 << paramInt4;
    int j = i >> 1;
    int k = j >> 1;
    paramArrayOfFalconFPR1[paramInt1 + 0] = paramArrayOfFalconFPR2[paramInt2 + 0];
    paramArrayOfFalconFPR1[paramInt1 + j] = paramArrayOfFalconFPR3[paramInt3 + 0];
    for (byte b = 0; b < k; b++) {
      FalconFPR falconFPR1 = paramArrayOfFalconFPR2[paramInt2 + b];
      FalconFPR falconFPR2 = paramArrayOfFalconFPR2[paramInt2 + b + k];
      ComplexNumberWrapper complexNumberWrapper = FPC_MUL(paramArrayOfFalconFPR3[paramInt3 + b], paramArrayOfFalconFPR3[paramInt3 + b + k], this.fpr.fpr_gm_tab[(b + j << 1) + 0], this.fpr.fpr_gm_tab[(b + j << 1) + 1]);
      FalconFPR falconFPR3 = complexNumberWrapper.re;
      FalconFPR falconFPR4 = complexNumberWrapper.im;
      complexNumberWrapper = FPC_ADD(falconFPR1, falconFPR2, falconFPR3, falconFPR4);
      FalconFPR falconFPR5 = complexNumberWrapper.re;
      FalconFPR falconFPR6 = complexNumberWrapper.im;
      paramArrayOfFalconFPR1[paramInt1 + (b << 1) + 0] = falconFPR5;
      paramArrayOfFalconFPR1[paramInt1 + (b << 1) + 0 + j] = falconFPR6;
      complexNumberWrapper = FPC_SUB(falconFPR1, falconFPR2, falconFPR3, falconFPR4);
      falconFPR5 = complexNumberWrapper.re;
      falconFPR6 = complexNumberWrapper.im;
      paramArrayOfFalconFPR1[paramInt1 + (b << 1) + 1] = falconFPR5;
      paramArrayOfFalconFPR1[paramInt1 + (b << 1) + 1 + j] = falconFPR6;
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\falcon\FalconFFT.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */