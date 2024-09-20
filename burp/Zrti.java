package burp;

public class Zrti {
  public final String Zt;
  
  public final int ZX;
  
  private static String[] ZM;
  
  public Zrti(String paramString1, String paramString2, int paramInt) {
    this.Zt = paramString1 + paramString1;
    this.ZX = paramInt;
  }
  
  public static void Zd(String[] paramArrayOfString) {
    ZM = paramArrayOfString;
  }
  
  public static String[] Zl() {
    return ZM;
  }
  
  static {
    if (Zl() == null)
      Zd(new String[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrti.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */