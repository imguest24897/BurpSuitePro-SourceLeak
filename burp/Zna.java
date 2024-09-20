package burp;

public abstract class Zna extends Zni implements Zs3n {
  @Zzvo(1)
  private final String ZH;
  
  private static String ZS;
  
  public Zna(String paramString) {
    this.ZH = paramString;
  }
  
  public String ZP() {
    return this.ZH;
  }
  
  public static void Zw(String paramString) {
    ZS = paramString;
  }
  
  public static String ZnG() {
    return ZS;
  }
  
  static {
    if (ZnG() == null)
      Zw("Hil4sc"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zna.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */