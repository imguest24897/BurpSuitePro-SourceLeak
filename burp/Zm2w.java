package burp;

import java.awt.Component;
import java.util.Map;
import javax.swing.border.EmptyBorder;

public class Zm2w extends Zm99 implements Zgmj {
  private static final Map<Zlt5, Zlkk> Zl = Zd();
  
  public Zm2w(String paramString) {
    super(paramString);
    setBorder(new EmptyBorder(0, 5, 0, 5));
  }
  
  public Component Zn() {
    return this;
  }
  
  public void ZZ(Zlt5 paramZlt5) {
    Ze(Zl.get(paramZlt5));
  }
  
  private static Map<Zlt5, Zlkk> Zd() {
    return Map.of(Zlt5.DISABLED, Zlkk.RADIO_BAR_DISABLED_FOREGROUND, Zlt5.ACTIVE, Zlkk.RADIO_BAR_ACTIVE_FOREGROUND, Zlt5.INACTIVE, Zlkk.RADIO_BAR_INACTIVE_FOREGROUND, Zlt5.INACTIVE_HOVER, Zlkk.RADIO_BAR_INACTIVE_HOVER_FOREGROUND);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm2w.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */