package com.fasterxml.Zn;

import com.fasterxml.Zor.Zyd;

final class Za extends Zj {
  private final Class<?> ZC;
  
  private final Zyd<Object> ZM;
  
  public Za(Zj paramZj, Class<?> paramClass, Zyd<Object> paramZyd) {
    super(paramZj);
    this.ZC = paramClass;
    this.ZM = paramZyd;
  }
  
  public Zyd<Object> ZO(Class<?> paramClass) {
    return (paramClass == this.ZC) ? this.ZM : null;
  }
  
  public Zj Zr(Class<?> paramClass, Zyd<Object> paramZyd) {
    return new Zw(this, this.ZC, this.ZM, paramClass, paramZyd);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zn\Za.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */