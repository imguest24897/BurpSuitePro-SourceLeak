package burp;

import java.awt.Insets;
import javax.swing.JToolTip;

class Zmg_ extends Zmgn {
  final Zbqd Zn;
  
  Zmg_(Zbqd paramZbqd, Ze9f paramZe9f, Zg4o paramZg4o) {
    super(paramZe9f, paramZg4o);
  }
  
  public JToolTip createToolTip() {
    JToolTip jToolTip = super.createToolTip();
    jToolTip.setBackground(Zlkk.JAVA_EDITOR_TOOLTIP_BACKGROUND.ZS());
    jToolTip.setForeground(Zlkk.JAVA_EDITOR_TOOLTIP_FOREGROUND.ZS());
    Zr43 zr43 = new Zr43(Zlkk.JAVA_EDITOR_TOOLTIP_BORDER, 1, new Insets(5, 10, 5, 10));
    jToolTip.setBorder(zr43);
    jToolTip.setFont(getFont());
    return jToolTip;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmg_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */