package net.portswigger;

public class Zrzy extends RuntimeException {
  private static String[] ZD;
  
  public Zrzy(String paramString) {
    super(paramString);
  }
  
  public Zrzy() {}
  
  public static void Zn(String[] paramArrayOfString) {
    ZD = paramArrayOfString;
  }
  
  public static String[] Zp() {
    return ZD;
  }
  
  static {
    if (Zp() != null)
      Zn(new String[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zrzy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */