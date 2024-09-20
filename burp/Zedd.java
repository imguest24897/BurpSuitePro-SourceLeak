package burp;

import javax.swing.JComboBox;

public class Zedd<E> extends JComboBox<E> {
  private Zt00 Zm;
  
  private boolean Za;
  
  public Zedd() {
    setFocusable(false);
    setRenderer(new Zedw());
    this.Za = true;
  }
  
  public void ZA(Zt00 paramZt00) {
    this.Zm = paramZt00;
    if (this.Za)
      setFont(paramZt00.ZV()); 
  }
  
  public void updateUI() {
    super.updateUI();
    if (this.Za && this.Zm != null)
      ZA(this.Zm); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zedd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */