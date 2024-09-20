package com.fasterxml.Zj;

import java.io.Serializable;

public class Zw implements Serializable {
  private static final long serialVersionUID = 1L;
  
  private static final int ZO = (Zq.values()).length;
  
  protected Boolean Ze = null;
  
  protected final Zx[] Zb = new Zx[ZO];
  
  public Zx Zd(Zq paramZq) {
    return this.Zb[paramZq.ordinal()];
  }
  
  public Boolean Zw() {
    return this.Ze;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zj\Zw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */