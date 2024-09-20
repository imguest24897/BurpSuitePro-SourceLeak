package burp;

public final class Zsff {
  private final Zgb6 Zc;
  
  private final Zb0h ZW;
  
  private final Ztwv Zv;
  
  private Runnable Zx;
  
  private Zsff(Zgb6 paramZgb6, Zb0h paramZb0h, Ztwv paramZtwv) {
    this.Zc = paramZgb6;
    this.ZW = paramZb0h;
    this.Zv = paramZtwv;
    this.Zx = Zsff::lambda$new$0;
  }
  
  public Zsff ZJ(Runnable paramRunnable) {
    this.Zx = paramRunnable;
    return this;
  }
  
  public Zx4v Zn() {
    return new Zx4v(this);
  }
  
  private static void lambda$new$0() {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsff.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */