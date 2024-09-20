package com.fasterxml.Ze;

import com.fasterxml.Zo.Zv;
import com.fasterxml.Zp.Zt;

final class Zi {
  private final Zv ZD;
  
  private final Zt Zl;
  
  private final String Zi;
  
  private Zv ZN;
  
  public Zi(Zv paramZv, Zt paramZt) {
    this.ZD = paramZv;
    this.Zl = paramZt;
    this.Zi = paramZt.ZF();
  }
  
  public void Zg(Zv paramZv) {
    this.ZN = paramZv;
  }
  
  public boolean ZR(String paramString) {
    return paramString.equals(this.Zi);
  }
  
  public boolean Zw() {
    return this.Zl.Ze();
  }
  
  public String ZA() {
    Class clazz = this.Zl.Zx();
    return (clazz == null) ? null : this.Zl.ZC().Zn(null, clazz);
  }
  
  public String ZP() {
    return this.Zi;
  }
  
  public Zv Zg() {
    return this.ZD;
  }
  
  public Zv Zv() {
    return this.ZN;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Ze\Zi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */