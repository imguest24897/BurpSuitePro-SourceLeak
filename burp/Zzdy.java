package burp;

import javax.swing.JCheckBox;

public class Zzdy extends JCheckBox {
  private Zlkk Zy;
  
  private Zlkk Z_;
  
  private Zt00 ZQ;
  
  private static int[] ZG;
  
  public Zzdy() {
    setFocusable(false);
    setIcon(Zgzq.CHECK_BOX.ZD());
    setRolloverIcon(Zgzq.CHECK_BOX_ROLLOVER.ZD());
    setDisabledIcon(Zgzq.CHECK_BOX_DISABLED.ZD());
    setSelectedIcon(Zgzq.CHECK_BOX_SELECTED.ZD());
    setRolloverSelectedIcon(Zgzq.CHECK_BOX_ROLLOVER_SELECTED.ZD());
    setDisabledSelectedIcon(Zgzq.CHECK_BOX_DISABLED_SELECTED.ZD());
  }
  
  public Zzdy(String paramString) {
    this();
    setText(paramString);
  }
  
  public void Zq(Zlkk paramZlkk) {
    setForeground(paramZlkk.ZS());
    this.Zy = paramZlkk;
  }
  
  public void ZZ(Zlkk paramZlkk) {
    setBackground(paramZlkk.ZS());
    this.Z_ = paramZlkk;
  }
  
  public void ZO(Zt00 paramZt00) {
    setFont(paramZt00.ZV());
    this.ZQ = paramZt00;
  }
  
  public void updateUI() {
    super.updateUI();
    Zbp2.Zq(this);
    if (this.Zy != null)
      setForeground(this.Zy.ZS()); 
    if (this.Z_ != null)
      setBackground(this.Z_.ZS()); 
    if (this.ZQ != null)
      setFont(this.ZQ.ZV()); 
  }
  
  public static void ZR(int[] paramArrayOfint) {
    ZG = paramArrayOfint;
  }
  
  public static int[] Zb() {
    return ZG;
  }
  
  static {
    if (Zb() == null)
      ZR(new int[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzdy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */