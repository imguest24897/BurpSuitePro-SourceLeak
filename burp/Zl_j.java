package burp;

public class Zl_j {
  private final String Zj;
  
  private final String[] ZG;
  
  private static boolean Zw;
  
  public Zl_j(String paramString, String... paramVarArgs) {
    this.Zj = paramString;
    this.ZG = paramVarArgs;
  }
  
  public boolean ZV(Zmf_ paramZmf_) {
    boolean bool = Zl();
    if (bool)
      Zbqc.Zr(new Zbqc[2]); 
    return (paramZmf_.ZV(this.ZG).ZH() != null);
  }
  
  public String Zb() {
    return this.Zj;
  }
  
  public static void Zf(boolean paramBoolean) {
    Zw = paramBoolean;
  }
  
  public static boolean Zl() {
    return Zw;
  }
  
  public static boolean ZZ() {
    boolean bool = Zl();
    return !bool;
  }
  
  static {
    if (Zl())
      Zf(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl_j.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */