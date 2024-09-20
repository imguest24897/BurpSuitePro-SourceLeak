package com.fasterxml.Zb;

import java.io.Serializable;

public class Zv implements Serializable {
  private static final long serialVersionUID = 1L;
  
  protected final int ZM;
  
  protected final int ZU;
  
  private static Zv Zi = new Zv(256, 500);
  
  protected Zv(int paramInt1, int paramInt2) {
    this.ZM = paramInt1;
    this.ZU = paramInt2;
  }
  
  public static Zv ZU() {
    return Zi;
  }
  
  public int Zc() {
    return this.ZM;
  }
  
  public int ZV() {
    return this.ZU;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zb\Zv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */