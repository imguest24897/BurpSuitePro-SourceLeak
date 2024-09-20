package net.portswigger;

public final class Zah {
  public static Zgv Zi = new Zgv();
  
  private static int Zt;
  
  public static void Zq() {
    Zi.ZW();
  }
  
  public static void Zl(Throwable paramThrowable, Zk_ paramZk_) {
    Zi.Zb(new Zuz(paramThrowable, "", paramZk_, false));
  }
  
  public static void ZU(Throwable paramThrowable, String paramString, Zk_ paramZk_) {
    Zi.Zb(new Zuz(paramThrowable, paramString, paramZk_, false));
  }
  
  public static void ZA(Throwable paramThrowable, String paramString, Zk_ paramZk_, boolean paramBoolean) {
    Zi.Zb(new Zuz(paramThrowable, paramString, paramZk_, paramBoolean));
  }
  
  static {
    Zb(0);
  }
  
  public static void Zb(int paramInt) {
    Zt = paramInt;
  }
  
  public static int ZJ() {
    return Zt;
  }
  
  public static int Zh() {
    int i = ZJ();
    return (i == 0) ? 117 : 0;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zah.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */