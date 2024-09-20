package burp;

import burp.api.montoya.utilities.Utilities;

public class Ze4n implements Zetm {
  private final Zzss Zc;
  
  private static String[] ZG;
  
  public Ze4n(Zzss paramZzss) {
    this.Zc = paramZzss;
  }
  
  public Utilities Zt() {
    return this.Zc.ZN();
  }
  
  public static void ZT(String[] paramArrayOfString) {
    ZG = paramArrayOfString;
  }
  
  public static String[] Zo() {
    return ZG;
  }
  
  static {
    if (Zo() == null)
      ZT(new String[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze4n.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */