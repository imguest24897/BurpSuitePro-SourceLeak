package burp;

import java.io.IOException;

public class Zttk implements Zlvr {
  private final Zgke Zu;
  
  private final boolean Zz;
  
  public Zttk(Zgke paramZgke) {
    this(paramZgke, true);
  }
  
  public Zttk(Zgke paramZgke, boolean paramBoolean) {
    this.Zu = paramZgke;
    this.Zz = paramBoolean;
  }
  
  public Zgke ZY() {
    return this.Zu;
  }
  
  public long ZH() {
    return this.Zu.Zg();
  }
  
  public void Zo(Zmko paramZmko) {
    paramZmko.Ze(this);
  }
  
  public void Zo() {
    if (!this.Zz)
      this.Zu.ZG(); 
  }
  
  public Zzvv Zr(Zefx paramZefx, boolean paramBoolean, Ztuf paramZtuf, int paramInt) throws IOException {
    return this.Zu.Zm(paramZefx, paramBoolean, paramZtuf, paramInt);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zttk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */