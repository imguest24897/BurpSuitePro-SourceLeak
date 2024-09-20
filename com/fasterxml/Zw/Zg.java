package com.fasterxml.Zw;

import burp.Zbqc;

public class Zg {
  public final String Zm;
  
  public final String ZN;
  
  private static int ZF;
  
  public Zg(Zy paramZy) {
    this(paramZy.ZF(), paramZy.Zq());
    int i = Zp();
    if (Zbqc.Zwu() == null)
      Zc(++i); 
  }
  
  public Zg(String paramString1, String paramString2) {
    this.Zm = paramString1;
    this.ZN = paramString2;
    int i = Zy();
    if (i != 0)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  public static void Zc(int paramInt) {
    ZF = paramInt;
  }
  
  public static int Zp() {
    return ZF;
  }
  
  public static int Zy() {
    int i = Zp();
    return (i == 0) ? 18 : 0;
  }
  
  static {
    if (Zy() != 0)
      Zc(54); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zw\Zg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */