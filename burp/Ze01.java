package burp;

import java.awt.Dimension;
import java.beans.Beans;
import javax.swing.Icon;
import javax.swing.JButton;

public class Ze01 extends JButton {
  private Zlkk ZM;
  
  private Zlkk ZP;
  
  private Zt00 Zx;
  
  private static boolean Zy;
  
  public Ze01() {
    setFocusable(false);
  }
  
  public Ze01(String paramString) {
    this();
    setText(paramString);
  }
  
  public Ze01(Icon paramIcon) {
    this();
    setIcon(paramIcon);
  }
  
  public Ze01(Icon paramIcon, String paramString) {
    this(paramIcon);
    setText(paramString);
    setHorizontalTextPosition(4);
  }
  
  public Ze01(String paramString, Icon paramIcon) {
    this(paramString);
    setIcon(paramIcon);
    setHorizontalTextPosition(2);
  }
  
  public void Zv(Zlkk paramZlkk) {
    setForeground(paramZlkk.ZS());
    this.ZM = paramZlkk;
  }
  
  public void Zj(Zlkk paramZlkk) {
    setBackground(paramZlkk.ZS());
    this.ZP = paramZlkk;
  }
  
  public void ZX(Zt00 paramZt00) {
    setFont(paramZt00.ZV());
    this.Zx = paramZt00;
  }
  
  public void updateUI() {
    super.updateUI();
    if (this.ZM != null)
      setForeground(this.ZM.ZS()); 
    if (this.ZP != null)
      setBackground(this.ZP.ZS()); 
    if (this.Zx != null)
      setFont(this.Zx.ZV()); 
  }
  
  public String getToolTipText() {
    return (isEnabled() || Beans.isDesignTime()) ? super.getToolTipText() : null;
  }
  
  public Dimension getMinimumSize() {
    return getPreferredSize();
  }
  
  public static void Zs(boolean paramBoolean) {
    Zy = paramBoolean;
  }
  
  public static boolean Zy() {
    return Zy;
  }
  
  public static boolean ZD() {
    boolean bool = Zy();
    return !bool;
  }
  
  static {
    if (ZD())
      Zs(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze01.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */