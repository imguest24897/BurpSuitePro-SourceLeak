package burp;

import javax.swing.KeyStroke;

public class Zl52 extends Zl5i {
  private final Zxy8 ZA;
  
  public Zl52(Zvo6 paramZvo6, Zgb6 paramZgb6, Zzyl paramZzyl, Zejf paramZejf, Zxy8 paramZxy8) {
    super(paramZvo6, paramZgb6, paramZzyl, paramZejf);
    this.ZA = paramZxy8;
    this.ZI.Zq(Zmsq.LF);
    this.ZI.setTabSize(4);
    Zrnr zrnr = new Zrnr(this);
    Zsyt zsyt = new Zsyt(this);
    this.ZI.getActionMap().put(zrnr, zrnr);
    this.ZI.getActionMap().put(zsyt, zsyt);
    this.ZI.getInputMap().put(KeyStroke.getKeyStroke(10, 0), zrnr);
    this.ZI.getInputMap().put(KeyStroke.getKeyStroke('}'), zsyt);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl52.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */