package burp;

public class Zl8b {
  private static int Zz;
  
  public static long Zt(int paramInt) {
    return paramInt * 1048576L;
  }
  
  public static int Zh() {
    return (Ztyh.ZK() > 1073741824L) ? 100 : 50;
  }
  
  public static int ZP() {
    return (Ztyh.ZK() > 1073741824L) ? 20 : 10;
  }
  
  public static void ZW(int paramInt) {
    Zz = paramInt;
  }
  
  public static int Zl() {
    return Zz;
  }
  
  public static int Zp() {
    int i = Zl();
    return (i == 0) ? 79 : 0;
  }
  
  static {
    if (Zl() == 0)
      ZW(35); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl8b.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */