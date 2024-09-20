package burp;

import java.util.List;

public class Zmzp {
  private final Zzih ZN;
  
  private final List<Zb8d> ZC;
  
  public Zmzp(Zgfi paramZgfi, Zls2 paramZls2) {
    this.ZN = new Zzih(paramZgfi, paramZls2.Zj());
    this.ZC = paramZls2.Zu();
  }
  
  public List<Zsvc> ZC() {
    ZQ();
    return this.ZN.ZV;
  }
  
  private void ZQ() {
    int i = Zsvc.Zd();
    while (this.ZN.ZD < this.ZN.Zp) {
      Zo();
      if (i == 0)
        break; 
    } 
  }
  
  private void Zo() {
    int i = Zsvc.ZX();
    for (Zb8d zb8d : this.ZC) {
      Zg_ zg_ = zb8d.Zo();
      if (zg_.ZS(this.ZN))
        return; 
      if (i != 0)
        break; 
    } 
    Zc();
  }
  
  protected void Zc() {
    this.ZN.ZD = this.ZN.Zp;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmzp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */