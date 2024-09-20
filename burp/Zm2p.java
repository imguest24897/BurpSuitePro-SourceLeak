package burp;

import java.awt.Component;
import java.awt.event.MouseEvent;

public class Zm2p extends Zm99 implements Zewb {
  private Zt00 ZU;
  
  public Zm2p(String paramString) {
    super(paramString);
  }
  
  public void ZA(MouseEvent paramMouseEvent, int paramInt) {}
  
  public boolean Zp() {
    return false;
  }
  
  public Component ZD() {
    return this;
  }
  
  public Zm99 Zv() {
    return this;
  }
  
  public Zr6e ZR() {
    return null;
  }
  
  public void updateUI() {
    super.updateUI();
    if (this.ZU != null)
      setFont(this.ZU.ZV()); 
  }
  
  public void ZE(Zt00 paramZt00) {
    setFont(paramZt00.ZV());
    this.ZU = paramZt00;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm2p.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */