package com.fasterxml.Zj;

import com.fasterxml.Zc.Zs;
import java.io.Serializable;

public class Zp implements Serializable {
  private static final long serialVersionUID = 1L;
  
  private final int Zl;
  
  private final int Ze;
  
  private final int ZU;
  
  private final int ZL;
  
  protected Zp(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.Zl = paramInt1;
    this.ZU = paramInt2;
    this.Ze = paramInt3;
    this.ZL = paramInt4;
  }
  
  public static Zp ZA() {
    return Zm.Zk();
  }
  
  public boolean Zc(Zz paramZz) {
    switch (paramZz.Zt()) {
      case 0:
        return paramZz.ZR(this.Zl);
      case 1:
        return paramZz.ZR(this.Ze);
    } 
    Zs.ZP();
    return false;
  }
  
  public boolean ZV(Zz paramZz) {
    switch (paramZz.Zt()) {
      case 0:
        return paramZz.ZR(this.ZU);
      case 1:
        return paramZz.ZR(this.ZL);
    } 
    Zs.ZP();
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zj\Zp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */