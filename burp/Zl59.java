package burp;

import java.awt.Component;
import java.awt.Point;
import javax.swing.JSeparator;

public class Zl59 extends Zl5i {
  private final boolean Zq;
  
  public Zl59(Zvo6 paramZvo6, Zgb6 paramZgb6, Zzyl paramZzyl, Zejf paramZejf, boolean paramBoolean) {
    super(paramZvo6, paramZgb6, paramZzyl, paramZejf);
    this.Zq = paramBoolean;
    ZA(new Zrfc(this));
  }
  
  public void Ze(Component paramComponent, Point paramPoint) {
    int[] arrayOfInt = Zif();
    boolean bool = (arrayOfInt[0] != arrayOfInt[1]) ? true : false;
    Zkj9 zkj9 = new Zkj9();
    zkj9.add(Ztsr.ZY(this, 141648, this.Zq));
    zkj9.add(new JSeparator());
    zkj9.add(Ztsr.ZY(this, 393472, (this.Zq && bool)));
    zkj9.add(Ztsr.ZY(this, 393728, bool));
    zkj9.add(Ztsr.ZY(this, 393984, this.Zq));
    zkj9.show(paramComponent, paramPoint.x, paramPoint.y);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl59.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */