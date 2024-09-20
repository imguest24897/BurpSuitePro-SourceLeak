package net.portswigger;

public class Zki extends RuntimeException {
  private static String[] ZE;
  
  Zki() {}
  
  Zki(String paramString) {
    super(paramString);
  }
  
  Zki(String paramString, Throwable paramThrowable) {
    super(paramString, paramThrowable);
  }
  
  public static void Zl(String[] paramArrayOfString) {
    ZE = paramArrayOfString;
  }
  
  public static String[] Zl() {
    return ZE;
  }
  
  static {
    if (Zl() == null)
      Zl(new String[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zki.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */