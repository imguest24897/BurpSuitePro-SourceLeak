package com.fasterxml.Zn;

import com.fasterxml.Zor.Zyd;

final class Zw extends Zj {
  private final Class<?> Zp;
  
  private final Class<?> Zq;
  
  private final Zyd<Object> Zr;
  
  private final Zyd<Object> ZS;
  
  public Zw(Zj paramZj, Class<?> paramClass1, Zyd<Object> paramZyd1, Class<?> paramClass2, Zyd<Object> paramZyd2) {
    super(paramZj);
    this.Zp = paramClass1;
    this.Zr = paramZyd1;
    this.Zq = paramClass2;
    this.ZS = paramZyd2;
  }
  
  public Zyd<Object> ZO(Class<?> paramClass) {
    return (paramClass == this.Zp) ? this.Zr : ((paramClass == this.Zq) ? this.ZS : null);
  }
  
  public Zj Zr(Class<?> paramClass, Zyd<Object> paramZyd) {
    Zv[] arrayOfZv = new Zv[3];
    arrayOfZv[0] = new Zv(this.Zp, this.Zr);
    arrayOfZv[1] = new Zv(this.Zq, this.ZS);
    arrayOfZv[2] = new Zv(paramClass, paramZyd);
    return new Zz(this, arrayOfZv);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zn\Zw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */