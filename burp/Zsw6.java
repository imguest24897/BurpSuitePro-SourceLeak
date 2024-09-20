package burp;

public class Zsw6 extends Zswl {
  private final Zvs ZR;
  
  private static boolean Zr;
  
  public Zsw6(Zvs paramZvs, String paramString) {
    this(paramZvs, paramString, Zk5v.NONE, 0);
  }
  
  public Zsw6(Zvs paramZvs, String paramString, Zk5v paramZk5v) {
    this(paramZvs, paramString, paramZk5v, 0);
  }
  
  Zsw6(Zvs paramZvs, String paramString, Zk5v paramZk5v, int paramInt) {
    super(paramInt, paramString, paramZk5v);
    this.ZR = paramZvs;
  }
  
  public Zvs Zn() {
    return this.ZR;
  }
  
  public static void ZA(boolean paramBoolean) {
    Zr = paramBoolean;
  }
  
  public static boolean Zf() {
    return Zr;
  }
  
  public static boolean ZV() {
    boolean bool = Zf();
    return !bool;
  }
  
  static {
    if (ZV())
      ZA(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsw6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */