package burp;

import javax.swing.JProgressBar;

public class Zexh extends JProgressBar {
  private Zlkk Zp;
  
  private Zlkk Zz;
  
  public Zexh() {
    setFocusable(false);
  }
  
  public void ZX(Zlkk paramZlkk) {
    this.Zp = paramZlkk;
    setForeground(paramZlkk.ZS());
  }
  
  public void Zx(Zlkk paramZlkk) {
    this.Zz = paramZlkk;
    setBackground(paramZlkk.ZS());
  }
  
  public void updateUI() {
    super.updateUI();
    if (this.Zp != null)
      setForeground(this.Zp.ZS()); 
    if (this.Zz != null)
      setBackground(this.Zz.ZS()); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zexh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */