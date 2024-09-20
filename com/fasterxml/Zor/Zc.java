package com.fasterxml.Zor;

public abstract class Zc implements Zh {
  private static int Zh;
  
  public boolean Zq(Zyi paramZyi) {
    return false;
  }
  
  public static void ZV(int paramInt) {
    Zh = paramInt;
  }
  
  public static int Zi() {
    return Zh;
  }
  
  public static int ZR() {
    int i = Zi();
    return (i == 0) ? 109 : 0;
  }
  
  static {
    if (Zi() != 0)
      ZV(40); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zor\Zc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */