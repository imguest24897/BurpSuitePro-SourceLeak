package burp;

public class Zl2b {
  private final Zlfb Zy;
  
  private final Ztj1 Zz;
  
  private static String ZA;
  
  public Zl2b(Zlfb paramZlfb, Ztj1 paramZtj1) {
    this.Zy = paramZlfb;
    this.Zz = paramZtj1;
  }
  
  public Zbvn ZZ(Zt0s paramZt0s) {
    return new Zbvn(this.Zy, paramZt0s, this.Zz);
  }
  
  public static void Zn(String paramString) {
    ZA = paramString;
  }
  
  public static String ZS() {
    return ZA;
  }
  
  static {
    if (ZS() == null)
      Zn("IX4jkc"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl2b.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */