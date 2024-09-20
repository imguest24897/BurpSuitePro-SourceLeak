package net.portswigger;

public class Zza extends RuntimeException {
  private static String[] ZS;
  
  public static void Z_(String[] paramArrayOfString) {
    ZS = paramArrayOfString;
  }
  
  public static String[] ZX() {
    return ZS;
  }
  
  static {
    if (ZX() != null)
      Z_(new String[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zza.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */