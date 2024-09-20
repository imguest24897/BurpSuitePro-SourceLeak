package net.portswigger.browser;

public abstract class Ztz extends Exception {
  private static String[] ZX;
  
  public Ztz() {}
  
  public Ztz(String paramString) {
    super(paramString);
  }
  
  public Ztz(String paramString, Throwable paramThrowable) {
    super(paramString, paramThrowable);
  }
  
  public Ztz(Throwable paramThrowable) {
    super(paramThrowable);
  }
  
  public static void ZU(String[] paramArrayOfString) {
    ZX = paramArrayOfString;
  }
  
  public static String[] Zq() {
    return ZX;
  }
  
  static {
    if (Zq() == null)
      ZU(new String[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Ztz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */