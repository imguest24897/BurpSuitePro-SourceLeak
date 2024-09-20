package com.fasterxml.Zo3;

import com.fasterxml.Zor.Zo;
import com.fasterxml.Zp.Za;
import com.fasterxml.Zp.Zz;
import com.fasterxml.Zyc;

public class Zr extends Zs {
  protected final String ZL;
  
  public Zr(Zz paramZz, Zo paramZo, String paramString) {
    super(paramZz, paramZo);
    this.ZL = paramString;
  }
  
  public Zr ZJ(Zo paramZo) {
    return (this.ZT == paramZo) ? this : new Zr(this.Zw, paramZo, this.ZL);
  }
  
  public String Zw() {
    return this.ZL;
  }
  
  public Zyc ZU() {
    return Zyc.PROPERTY;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zo3\Zr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */