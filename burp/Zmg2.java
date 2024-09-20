package burp;

import javax.swing.JRadioButton;

public class Zmg2 extends JRadioButton {
  private Zlkk Zh;
  
  private Zlkk ZE;
  
  private Zt00 Zq;
  
  private static String[] ZJ;
  
  public Zmg2() {
    setFocusable(false);
    setIcon(Zgzq.RADIO_BUTTON.ZD());
    setRolloverIcon(Zgzq.RADIO_BUTTON_HOVER.ZD());
    setDisabledIcon(Zgzq.RADIO_BUTTON_DISABLED.ZD());
    setSelectedIcon(Zgzq.RADIO_BUTTON_SELECTED.ZD());
    setRolloverSelectedIcon(Zgzq.RADIO_BUTTON_SELECTED_HOVER.ZD());
    setDisabledSelectedIcon(Zgzq.RADIO_BUTTON_SELECTED_DISABLED.ZD());
  }
  
  public Zmg2(String paramString) {
    this();
    setText(paramString);
  }
  
  public void Zs(Zt00 paramZt00) {
    setFont(paramZt00.ZV());
    this.Zq = paramZt00;
  }
  
  public void updateUI() {
    super.updateUI();
    Zbp2.Zq(this);
    if (this.Zh != null)
      setForeground(this.Zh.ZS()); 
    if (this.ZE != null)
      setBackground(this.ZE.ZS()); 
    if (this.Zq != null)
      setFont(this.Zq.ZV()); 
  }
  
  public static void Zs(String[] paramArrayOfString) {
    ZJ = paramArrayOfString;
  }
  
  public static String[] ZY() {
    return ZJ;
  }
  
  static {
    if (ZY() != null)
      Zs(new String[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmg2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */