package burp;

public abstract class Zx6f extends Zx68 {
  protected final Zzcs ZL;
  
  private static boolean Zh;
  
  Zx6f(Zb0_ paramZb0_, Zzcs paramZzcs) {
    super(paramZb0_);
    this.ZL = paramZzcs;
  }
  
  public Zzcs Zg() {
    return this.ZL;
  }
  
  public static void Za(boolean paramBoolean) {
    Zh = paramBoolean;
  }
  
  public static boolean ZH() {
    return Zh;
  }
  
  public static boolean ZW() {
    boolean bool = ZH();
    return !bool;
  }
  
  static {
    if (!ZH())
      Za(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx6f.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */