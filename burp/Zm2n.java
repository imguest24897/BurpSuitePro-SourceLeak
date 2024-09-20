package burp;

import java.awt.Component;
import java.util.Map;
import javax.swing.Icon;
import javax.swing.border.EmptyBorder;

public class Zm2n extends Zm99 implements Zgmj {
  private final Map<Zlt5, Icon> ZF;
  
  public Zm2n(Icon paramIcon1, Icon paramIcon2, Icon paramIcon3, Icon paramIcon4) {
    this.ZF = Map.of(Zlt5.DISABLED, paramIcon4, Zlt5.ACTIVE, paramIcon3, Zlt5.ACTIVE_PRIMARY, paramIcon3, Zlt5.ACTIVE_PRIMARY_HOVER, paramIcon3, Zlt5.INACTIVE, paramIcon1, Zlt5.INACTIVE_HOVER, paramIcon2);
    setBorder(new EmptyBorder(0, 5, 0, 5));
  }
  
  public Component Zn() {
    return this;
  }
  
  public void ZZ(Zlt5 paramZlt5) {
    setIcon(this.ZF.get(paramZlt5));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm2n.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */