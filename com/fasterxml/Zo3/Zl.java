package com.fasterxml.Zo3;

import com.fasterxml.Zor.Zo;
import com.fasterxml.Zp.Za;
import com.fasterxml.Zp.Zz;
import com.fasterxml.Zyc;

public class Zl extends Zo {
  protected final String Zs;
  
  public Zl(Zz paramZz, Zo paramZo, String paramString) {
    super(paramZz, paramZo);
    this.Zs = paramString;
  }
  
  public Zl ZY(Zo paramZo) {
    return (this.ZT == paramZo) ? this : new Zl(this.Zw, paramZo, this.Zs);
  }
  
  public String Zw() {
    return this.Zs;
  }
  
  public Zyc ZU() {
    return Zyc.EXTERNAL_PROPERTY;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zo3\Zl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */