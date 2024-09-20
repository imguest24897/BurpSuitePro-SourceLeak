package burp;

public class Zgum extends Exception {
  private static int ZX;
  
  public static void Zh(int paramInt) {
    ZX = paramInt;
  }
  
  public static int ZA() {
    return ZX;
  }
  
  public static int Zj() {
    int i = ZA();
    return (i == 0) ? 124 : 0;
  }
  
  static {
    if (Zj() != 0)
      Zh(26); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgum.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */