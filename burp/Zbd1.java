package burp;

import javax.swing.border.Border;

public class Zbd1 extends Zbds {
  private final Zltg Zl = new Zltg();
  
  public Zbd1(Zb0h paramZb0h) {
    super(paramZb0h, Zbd1::lambda$new$0);
  }
  
  void ZR(Zmgn paramZmgn, Runnable paramRunnable) {
    paramZmgn.setEditable(false);
    paramZmgn.setOpaque(false);
    paramZmgn.setLineWrap(true);
    paramZmgn.setFocusable(true);
    paramZmgn.setBorder((Border)null);
    paramZmgn.Zn(Zlkk.INSPECTOR_TABLE_BACKGROUND);
    paramZmgn.Zm(false);
    paramZmgn.Zs(true);
  }
  
  Ztz Zn() {
    return this.Zl;
  }
  
  boolean Zg() {
    return true;
  }
  
  private static void lambda$new$0() {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbd1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */