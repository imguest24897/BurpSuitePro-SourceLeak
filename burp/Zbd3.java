package burp;

import java.awt.AWTKeyStroke;
import java.util.Set;

public class Zbd3 extends Zbds {
  private final Runnable Zq;
  
  private final Ztz Zc;
  
  public Zbd3(Zb0h paramZb0h, Runnable paramRunnable1, Runnable paramRunnable2) {
    super(paramZb0h, paramRunnable1);
    this.Zq = paramRunnable2;
    this.Zc = new Zk2g();
  }
  
  Ztz Zn() {
    return this.Zc;
  }
  
  boolean Zg() {
    return false;
  }
  
  void ZR(Zmgn paramZmgn, Runnable paramRunnable) {
    paramZmgn.setLineWrap(true);
    paramZmgn.Zs(true);
    paramZmgn.Zq(Zmsq.CRLF);
    paramZmgn.Zm(false);
    paramZmgn.setFocusTraversalKeys(0, (Set<? extends AWTKeyStroke>)null);
    paramZmgn.setFocusTraversalKeys(1, (Set<? extends AWTKeyStroke>)null);
    paramZmgn.Zn(Zlkk.INSPECTOR_TABLE_EDITABLE_FIELD_BACKGROUND);
    paramZmgn.addKeyListener(new Zgeu(paramRunnable));
    ZL(new Zgs0(this));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbd3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */