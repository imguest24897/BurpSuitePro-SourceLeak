package burp;

import burp.api.montoya.ui.menu.BasicMenuItem;

class Zmys implements BasicMenuItem {
  private static final Runnable Zi = Zmys::lambda$static$0;
  
  private final String ZL;
  
  private final Runnable Zl;
  
  Zmys(String paramString, Runnable paramRunnable) {
    this.ZL = paramString;
    this.Zl = paramRunnable;
  }
  
  public void action() {
    if (this.Zl != null)
      this.Zl.run(); 
  }
  
  public String caption() {
    return this.ZL;
  }
  
  public BasicMenuItem withCaption(String paramString) {
    return new Zmys(paramString, this.Zl);
  }
  
  public BasicMenuItem withAction(Runnable paramRunnable) {
    return new Zmys(this.ZL, paramRunnable);
  }
  
  static Zmys Zb(String paramString) {
    return new Zmys(paramString, Zi);
  }
  
  private static void lambda$static$0() {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmys.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */