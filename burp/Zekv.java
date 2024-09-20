package burp;

public class Zekv extends Zeku {
  private final int Zh;
  
  private static String ZD;
  
  public Zekv(int paramInt) {
    this(paramInt, 0);
  }
  
  public Zekv(int paramInt1, int paramInt2) {
    super(paramInt1, 4);
    this.Zh = paramInt2;
  }
  
  public int ZF() {
    return this.Zh;
  }
  
  public void ZB(Zkit paramZkit, Zgpi paramZgpi1, Zgpi paramZgpi2) {
    int i = paramZkit.Zx(paramZgpi1, this);
    paramZkit.ZM(paramZgpi2, this, i);
  }
  
  public void ZK(Zs7v paramZs7v) {
    paramZs7v.ZZ(this);
  }
  
  public static void ZO(String paramString) {
    ZD = paramString;
  }
  
  public static String Z_() {
    return ZD;
  }
  
  static {
    if (Z_() == null)
      ZO("I7WEB"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zekv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */