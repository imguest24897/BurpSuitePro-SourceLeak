package com.fasterxml.Zg;

import com.fasterxml.Zb.Ze;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zor.Zb;

public final class Zq extends Zd {
  protected Zb ZN;
  
  protected boolean Zq = false;
  
  public Zq(Zb paramZb, Zd paramZd) {
    super(0, paramZd);
    this.ZN = paramZb;
  }
  
  public Zl Zt() {
    if (!this.Zq) {
      this.Zb++;
      this.Zq = true;
      return this.ZN.ZV();
    } 
    this.ZN = null;
    return null;
  }
  
  public Zb ZX() {
    return this.Zq ? this.ZN : null;
  }
  
  public Zd ZP() {
    return new Ze(this.ZN, this);
  }
  
  public Zd Zw() {
    return new Zx(this.ZN, this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zg\Zq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */