package burp;

public class Zeij extends Exception {
  private static String[] Zx;
  
  public Zeij() {}
  
  public Zeij(Throwable paramThrowable) {
    super(paramThrowable);
  }
  
  public static void Zx(String[] paramArrayOfString) {
    Zx = paramArrayOfString;
  }
  
  public static String[] ZQ() {
    return Zx;
  }
  
  static {
    if (ZQ() != null)
      Zx(new String[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeij.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */