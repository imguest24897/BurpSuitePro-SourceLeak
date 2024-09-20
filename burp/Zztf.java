package burp;

public class Zztf {
  public final String ZY;
  
  public final String Ze;
  
  private static int ZC;
  
  Zztf(String paramString1, String paramString2) {
    this.ZY = (paramString1 == null) ? "" : paramString1;
    this.Ze = (paramString2 == null) ? "" : paramString2;
  }
  
  public static void Zk(int paramInt) {
    ZC = paramInt;
  }
  
  public static int ZJ() {
    return ZC;
  }
  
  public static int Zg() {
    int i = ZJ();
    return (i == 0) ? 92 : 0;
  }
  
  static {
    if (Zg() == 0)
      Zk(89); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zztf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */