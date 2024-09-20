package burp;

public abstract class Zllr {
  public final Ze46 ZM;
  
  public final String ZW;
  
  public final Zxsx ZR;
  
  private static String Zr;
  
  protected Zllr(Ze46 paramZe46, String paramString, Zxsx paramZxsx) {
    this.ZM = paramZe46;
    this.ZW = paramString;
    this.ZR = paramZxsx;
  }
  
  public abstract byte ZK();
  
  public abstract boolean ZT(Zxs7 paramZxs7);
  
  public static void Zq(String paramString) {
    Zr = paramString;
  }
  
  public static String ZX() {
    return Zr;
  }
  
  static {
    if (ZX() != null)
      Zq("IrfRU"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zllr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */