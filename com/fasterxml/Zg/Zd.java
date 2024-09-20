package com.fasterxml.Zg;

import com.fasterxml.Zb.Ze;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zor.Zb;

abstract class Zd extends Ze {
  protected final Zd Zt;
  
  protected String Zg;
  
  protected Object Zf;
  
  public Zd(int paramInt, Zd paramZd) {
    this.Zz = paramInt;
    this.Zb = -1;
    this.Zt = paramZd;
  }
  
  public final Zd ZG() {
    return this.Zt;
  }
  
  public final String Z_() {
    return this.Zg;
  }
  
  public Object Zb() {
    return this.Zf;
  }
  
  public void Z_(Object paramObject) {
    this.Zf = paramObject;
  }
  
  public abstract Zl Zt();
  
  public abstract Zb ZX();
  
  public abstract Zd Zw();
  
  public abstract Zd ZP();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zg\Zd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */