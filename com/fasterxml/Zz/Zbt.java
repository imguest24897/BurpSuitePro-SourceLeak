package com.fasterxml.Zz;

final class Zbt {
  double ZV;
  
  double Zd;
  
  void Zy(Zbt paramZbt) {
    this.ZV += paramZbt.ZV;
    this.Zd += paramZbt.Zd;
  }
  
  void ZT(Zh paramZh, int paramInt) {
    this.ZV += paramZh.Zl(paramInt);
    this.Zd += paramZh.ZF(paramInt);
  }
  
  void ZX(Zbt paramZbt1, Zbt paramZbt2) {
    this.ZV += paramZbt1.ZV;
    this.Zd += paramZbt1.Zd;
  }
  
  void Zw(Zbt paramZbt) {
    this.ZV -= paramZbt.Zd;
    this.Zd += paramZbt.ZV;
  }
  
  void ZB(Zh paramZh, int paramInt) {
    this.ZV -= paramZh.ZF(paramInt);
    this.Zd += paramZh.Zl(paramInt);
  }
  
  void ZC(Zbt paramZbt1, Zbt paramZbt2) {
    this.ZV -= paramZbt1.Zd;
    this.Zd += paramZbt1.ZV;
  }
  
  void ZY(Zh paramZh, int paramInt) {
    paramZh.ZI(paramInt, this.ZV);
    paramZh.ZS(paramInt, this.Zd);
  }
  
  void ZS(Zbt paramZbt) {
    double d = this.ZV;
    this.ZV = Zb.Ze(d, paramZbt.ZV, -this.Zd * paramZbt.Zd);
    this.Zd = Zb.Ze(d, paramZbt.Zd, this.Zd * paramZbt.ZV);
  }
  
  void ZN(Zbt paramZbt) {
    double d = this.ZV;
    this.ZV = Zb.Ze(d, paramZbt.ZV, this.Zd * paramZbt.Zd);
    this.Zd = Zb.Ze(-d, paramZbt.Zd, this.Zd * paramZbt.ZV);
  }
  
  void Zg(Zh paramZh, int paramInt) {
    this.ZV = paramZh.Zl(paramInt);
    this.Zd = paramZh.ZF(paramInt);
  }
  
  void Zh(Zbt paramZbt) {
    paramZbt.ZV = Zb.Ze(this.ZV, this.ZV, -this.Zd * this.Zd);
    paramZbt.Zd = 2.0D * this.ZV * this.Zd;
  }
  
  void Zs(Zbt paramZbt) {
    this.ZV -= paramZbt.ZV;
    this.Zd -= paramZbt.Zd;
  }
  
  void Zp(Zh paramZh, int paramInt) {
    this.ZV -= paramZh.Zl(paramInt);
    this.Zd -= paramZh.ZF(paramInt);
  }
  
  void Zx(Zbt paramZbt1, Zbt paramZbt2) {
    this.ZV -= paramZbt1.ZV;
    this.Zd -= paramZbt1.Zd;
  }
  
  void Za(Zbt paramZbt, Zh paramZh, int paramInt) {
    paramZh.ZI(paramInt, this.ZV - paramZbt.ZV);
    paramZh.ZS(paramInt, this.Zd - paramZbt.Zd);
  }
  
  void ZK(Zbt paramZbt) {
    this.ZV += paramZbt.Zd;
    this.Zd -= paramZbt.ZV;
  }
  
  void Zl(Zh paramZh, int paramInt) {
    this.ZV += paramZh.ZF(paramInt);
    this.Zd -= paramZh.Zl(paramInt);
  }
  
  void Zo(Zbt paramZbt1, Zbt paramZbt2) {
    this.ZV += paramZbt1.Zd;
    this.Zd -= paramZbt1.ZV;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zz\Zbt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */