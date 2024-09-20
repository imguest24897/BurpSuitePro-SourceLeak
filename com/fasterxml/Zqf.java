package com.fasterxml;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zo2.Zn;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zp.Za;
import java.io.IOException;

class Zqf extends Za {
  protected final Za ZS;
  
  protected final Object ZR;
  
  public Zqf(Za paramZa, Object paramObject) {
    this.ZS = paramZa;
    this.ZR = paramObject;
  }
  
  public Za ZS(Zo paramZo) {
    throw new UnsupportedOperationException();
  }
  
  public Zyc ZU() {
    return this.ZS.ZU();
  }
  
  public String Zw() {
    return this.ZS.Zw();
  }
  
  public Zn ZA(Zf paramZf, Zn paramZn) throws IOException {
    paramZn.ZB = this.ZR;
    return this.ZS.ZA(paramZf, paramZn);
  }
  
  public Zn ZP(Zf paramZf, Zn paramZn) throws IOException {
    return this.ZS.ZP(paramZf, paramZn);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zqf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */