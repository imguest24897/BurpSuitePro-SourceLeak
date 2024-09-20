package burp;

public class Zk9g implements Zrzd {
  private final Zbf1 Zd;
  
  private static String[] Zx;
  
  public Zk9g(Zbf1 paramZbf1) {
    this.Zd = paramZbf1;
  }
  
  public int Zo(Zstu paramZstu, int paramInt) {
    String[] arrayOfString = Zd();
    if (paramInt < paramZstu.Zpu() && paramZstu.Zp(paramInt) == 47 && paramZstu.Zp(paramInt + 1) == 47) {
      this.Zd.ZT();
      int i = paramInt + 2;
      while (i < paramZstu.Zpu() && paramZstu.Zp(i) != 10) {
        i++;
        if (arrayOfString != null)
          break; 
      } 
      return i - paramInt;
    } 
    return 0;
  }
  
  public static void ZR(String[] paramArrayOfString) {
    Zx = paramArrayOfString;
  }
  
  public static String[] Zd() {
    return Zx;
  }
  
  static {
    if (Zd() != null)
      ZR(new String[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk9g.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */