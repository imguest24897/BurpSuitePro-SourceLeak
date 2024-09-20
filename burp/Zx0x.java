package burp;

import javax.swing.JTextPane;

public class Zx0x extends JTextPane {
  private Zlkk ZV;
  
  private Zlkk ZA;
  
  private Zt00 Zx;
  
  public Zx0x() {}
  
  public Zx0x(String paramString) {
    setText(paramString);
  }
  
  public void Ze(Zlkk paramZlkk) {
    setForeground(paramZlkk.ZS());
    this.ZV = paramZlkk;
  }
  
  public void Zx(Zlkk paramZlkk) {
    setBackground(paramZlkk.ZS());
    this.ZA = paramZlkk;
  }
  
  public void ZN(Zt00 paramZt00) {
    setFont(paramZt00.ZV());
    this.Zx = paramZt00;
  }
  
  public void updateUI() {
    super.updateUI();
    if (this.ZV != null)
      setForeground(this.ZV.ZS()); 
    if (this.ZA != null)
      setBackground(this.ZA.ZS()); 
    if (this.Zx != null)
      setFont(this.Zx.ZV()); 
  }
  
  public void Zf() {
    setEditorKit(new Zzu9());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx0x.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */