package burp;

import java.awt.Component;
import java.util.Map;
import javax.swing.border.EmptyBorder;

public class Zm20 extends Zm99 implements Zgmj {
  private static final Map<Zlt5, Zlkk> ZT = ZR();
  
  public Zm20(String paramString) {
    super(paramString);
    ZE(Zt00.BOLD_FONT);
    setBorder(new EmptyBorder(0, 15, 0, 15));
  }
  
  public Component Zn() {
    return this;
  }
  
  public void ZZ(Zlt5 paramZlt5) {
    Ze(ZT.get(paramZlt5));
  }
  
  private static Map<Zlt5, Zlkk> ZR() {
    return Map.of(Zlt5.DISABLED, Zlkk.RADIO_BAR_DISABLED_FOREGROUND, Zlt5.ACTIVE, Zlkk.RADIO_BAR_ACTIVE_FOREGROUND, Zlt5.ACTIVE_PRIMARY, Zlkk.RADIO_BAR_ACTIVE_FOREGROUND, Zlt5.ACTIVE_PRIMARY_HOVER, Zlkk.RADIO_BAR_ACTIVE_HOVER_FOREGROUND, Zlt5.INACTIVE, Zlkk.RADIO_BAR_INACTIVE_FOREGROUND, Zlt5.INACTIVE_HOVER, Zlkk.RADIO_BAR_INACTIVE_HOVER_FOREGROUND);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm20.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */