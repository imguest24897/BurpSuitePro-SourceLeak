package org.yaml;

public class Zj3 extends RuntimeException {
  private static final long serialVersionUID = -4738336175050337570L;
  
  private static int ZX;
  
  public Zj3(String paramString) {
    super(paramString);
  }
  
  public Zj3(Throwable paramThrowable) {
    super(paramThrowable);
  }
  
  public Zj3(String paramString, Throwable paramThrowable) {
    super(paramString, paramThrowable);
  }
  
  public static void ZA(int paramInt) {
    ZX = paramInt;
  }
  
  public static int ZX() {
    return ZX;
  }
  
  public static int Zb() {
    int i = ZX();
    try {
      if (i == 0)
        return 58; 
    } catch (Zj3 zj3) {
      throw a(null);
    } 
    return 0;
  }
  
  private static Zj3 a(Zj3 paramZj3) {
    return paramZj3;
  }
  
  static {
    if (ZX() == 0)
      ZA(6); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\yaml\Zj3.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */