package com.fasterxml.Zor;

public class Zz {
  private final Zyn Zb;
  
  private final String Zt;
  
  public Zz(Zyn paramZyn, String paramString) {
    this.Zb = paramZyn;
    this.Zt = paramString;
  }
  
  public static Zz Zg(String paramString) {
    return new Zz(Zyn.MANAGED_REFERENCE, paramString);
  }
  
  public static Zz ZJ(String paramString) {
    return new Zz(Zyn.BACK_REFERENCE, paramString);
  }
  
  public String Zs() {
    return this.Zt;
  }
  
  public boolean ZN() {
    return (this.Zb == Zyn.MANAGED_REFERENCE);
  }
  
  public boolean ZV() {
    return (this.Zb == Zyn.BACK_REFERENCE);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zor\Zz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */