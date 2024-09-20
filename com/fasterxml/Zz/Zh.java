package com.fasterxml.Zz;

import burp.Zbqc;
import burp.Zmuc;

final class Zh {
  private final double[] Zw;
  
  private final int ZY;
  
  private final int Zl;
  
  Zh(int paramInt) {
    this.Zw = new double[paramInt << 1];
    this.ZY = paramInt;
    this.Zl = 0;
  }
  
  Zh(Zh paramZh, int paramInt1, int paramInt2) {
    this.ZY = paramInt2 - paramInt1;
    this.Zw = paramZh.Zw;
    this.Zl = paramInt1 << 1;
  }
  
  void ZY(int paramInt, Zbt paramZbt) {
    this.Zw[ZL(paramInt)] = this.Zw[ZL(paramInt)] + paramZbt.ZV;
    this.Zw[Zo(paramInt)] = this.Zw[Zo(paramInt)] + paramZbt.Zd;
  }
  
  void ZY(int paramInt1, Zh paramZh, int paramInt2, Zbt paramZbt) {
    paramZbt.ZV = this.Zw[ZL(paramInt1)] + paramZh.Zl(paramInt2);
    paramZbt.Zd = this.Zw[Zo(paramInt1)] + paramZh.ZF(paramInt2);
  }
  
  void Zk(int paramInt1, Zh paramZh, int paramInt2, Zbt paramZbt) {
    paramZbt.ZV = this.Zw[ZL(paramInt1)] - paramZh.ZF(paramInt2);
    paramZbt.Zd = this.Zw[Zo(paramInt1)] + paramZh.Zl(paramInt2);
  }
  
  void ZG(Zh paramZh) {
    int i = paramZh.Zl;
    double[] arrayOfDouble = paramZh.Zw;
    int j = this.Zl + this.ZY << 1;
    Zbqc[] arrayOfZbqc = Zmuc.ZA();
    int k = this.Zl;
    while (k < j) {
      double d1 = this.Zw[k + 0];
      double d2 = this.Zw[k + 1];
      this.Zw[k] = Zb.Ze(d1, arrayOfDouble[i + 0], d2 * arrayOfDouble[i + 1]);
      this.Zw[k + 1] = Zb.Ze(-d1, arrayOfDouble[i + 1], d2 * arrayOfDouble[i + 0]);
      i += 2;
      k += 2;
      if (arrayOfZbqc != null)
        break; 
    } 
  }
  
  void Zs(Zh paramZh) {
    int i = paramZh.Zl;
    double[] arrayOfDouble = paramZh.Zw;
    int j = this.Zl + this.ZY << 1;
    Zbqc[] arrayOfZbqc = Zmuc.ZA();
    int k = this.Zl;
    while (k < j) {
      double d = this.Zw[k + 0];
      this.Zw[k + 0] = d * arrayOfDouble[i + 0];
      this.Zw[k + 1] = d * arrayOfDouble[i + 1];
      i += 2;
      k += 2;
      if (arrayOfZbqc != null)
        break; 
    } 
  }
  
  void Zo(int paramInt, Zbt paramZbt) {
    paramZbt.ZV = this.Zw[ZL(paramInt)];
    paramZbt.Zd = this.Zw[Zo(paramInt)];
  }
  
  double ZF(int paramInt) {
    return this.Zw[(paramInt << 1) + this.Zl + 1];
  }
  
  void ZS(int paramInt, double paramDouble) {
    this.Zw[(paramInt << 1) + this.Zl + 1] = paramDouble;
  }
  
  private int Zo(int paramInt) {
    return (paramInt << 1) + this.Zl + 1;
  }
  
  void ZX(int paramInt, Zbt paramZbt) {
    int i = ZL(paramInt);
    int j = Zo(paramInt);
    double d1 = this.Zw[i];
    double d2 = this.Zw[j];
    this.Zw[i] = Zb.Ze(d1, paramZbt.ZV, -d2 * paramZbt.Zd);
    this.Zw[j] = Zb.Ze(d1, paramZbt.Zd, d2 * paramZbt.ZV);
  }
  
  void ZS(int paramInt, Zbt paramZbt) {
    int i = ZL(paramInt);
    int j = Zo(paramInt);
    double d1 = this.Zw[i];
    double d2 = this.Zw[j];
    this.Zw[i] = Zb.Ze(-d1, paramZbt.Zd, -d2 * paramZbt.ZV);
    this.Zw[j] = Zb.Ze(d1, paramZbt.ZV, -d2 * paramZbt.Zd);
  }
  
  void Zg(int paramInt, Zbt paramZbt) {
    int i = ZL(paramInt);
    int j = Zo(paramInt);
    double d1 = this.Zw[i];
    double d2 = this.Zw[j];
    this.Zw[i] = Zb.Ze(d1, paramZbt.ZV, d2 * paramZbt.Zd);
    this.Zw[j] = Zb.Ze(-d1, paramZbt.Zd, d2 * paramZbt.ZV);
  }
  
  void Zo(int paramInt, Zbt paramZbt1, Zbt paramZbt2) {
    double d1 = this.Zw[ZL(paramInt)];
    double d2 = this.Zw[Zo(paramInt)];
    paramZbt2.ZV = Zb.Ze(d1, paramZbt1.ZV, d2 * paramZbt1.Zd);
    paramZbt2.Zd = Zb.Ze(-d1, paramZbt1.Zd, d2 * paramZbt1.ZV);
  }
  
  void Zy(int paramInt, Zbt paramZbt) {
    int i = ZL(paramInt);
    int j = Zo(paramInt);
    double d1 = this.Zw[i];
    double d2 = this.Zw[j];
    this.Zw[i] = Zb.Ze(-d1, paramZbt.Zd, d2 * paramZbt.ZV);
    this.Zw[j] = Zb.Ze(-d1, paramZbt.ZV, -d2 * paramZbt.Zd);
  }
  
  void Zx(int paramInt, Zbt paramZbt1, Zbt paramZbt2) {
    double d1 = this.Zw[ZL(paramInt)];
    double d2 = this.Zw[Zo(paramInt)];
    paramZbt2.ZV = Zb.Ze(d1, paramZbt1.ZV, -d2 * paramZbt1.Zd);
    paramZbt2.Zd = Zb.Ze(d1, paramZbt1.Zd, d2 * paramZbt1.ZV);
  }
  
  void ZE(Zh paramZh) {
    int i = paramZh.Zl;
    double[] arrayOfDouble = paramZh.Zw;
    Zbqc[] arrayOfZbqc = Zmuc.ZA();
    int j = this.Zl + this.ZY << 1;
    int k = this.Zl;
    while (k < j) {
      double d1 = this.Zw[k + 0];
      double d2 = this.Zw[k + 1];
      double d3 = arrayOfDouble[i + 0];
      double d4 = arrayOfDouble[i + 1];
      this.Zw[k + 0] = Zb.Ze(d1, d3, -d2 * d4);
      this.Zw[k + 1] = Zb.Ze(d1, d4, d2 * d3);
      i += 2;
      k += 2;
      if (arrayOfZbqc != null)
        break; 
    } 
  }
  
  double Zy(int paramInt1, int paramInt2) {
    return this.Zw[(paramInt1 << 1) + paramInt2];
  }
  
  double Zl(int paramInt) {
    return this.Zw[(paramInt << 1) + this.Zl];
  }
  
  void ZI(int paramInt, double paramDouble) {
    this.Zw[(paramInt << 1) + this.Zl] = paramDouble;
  }
  
  private int ZL(int paramInt) {
    return (paramInt << 1) + this.Zl;
  }
  
  void Zt(int paramInt, double paramDouble1, double paramDouble2) {
    int i = ZL(paramInt);
    this.Zw[i] = paramDouble1;
    this.Zw[i + 1] = paramDouble2;
  }
  
  void Zl() {
    int i = this.Zl + this.ZY << 1;
    int j = this.Zl;
    Zbqc[] arrayOfZbqc = Zmuc.ZA();
    while (j < i) {
      double d1 = this.Zw[j + 0];
      double d2 = this.Zw[j + 1];
      this.Zw[j + 0] = Zb.Ze(d1, d1, -d2 * d2);
      this.Zw[j + 1] = 2.0D * d1 * d2;
      j += 2;
      if (arrayOfZbqc != null)
        break; 
    } 
  }
  
  void ZE(int paramInt1, Zh paramZh, int paramInt2, Zbt paramZbt) {
    paramZbt.ZV = this.Zw[ZL(paramInt1)] - paramZh.Zl(paramInt2);
    paramZbt.Zd = this.Zw[Zo(paramInt1)] - paramZh.ZF(paramInt2);
  }
  
  void Zh(int paramInt1, Zh paramZh, int paramInt2, Zbt paramZbt) {
    paramZbt.ZV = this.Zw[ZL(paramInt1)] + paramZh.ZF(paramInt2);
    paramZbt.Zd = this.Zw[Zo(paramInt1)] - paramZh.Zl(paramInt2);
  }
  
  void ZT(int paramInt1, int paramInt2) {
    int i = ZL(paramInt1);
    int j = Zo(paramInt1);
    double d1 = this.Zw[i];
    double d2 = this.Zw[j];
    this.Zw[i] = Zq.Zy(d1, paramInt2);
    this.Zw[j] = Zq.Zy(d2, paramInt2);
  }
  
  static int ZI(Zh paramZh) {
    return paramZh.ZY;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zz\Zh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */