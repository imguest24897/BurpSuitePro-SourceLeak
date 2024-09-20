package burp;

import java.awt.Color;

public class Zzwj implements Zbzs {
  private final Zkr0 Zt;
  
  private Zbzs Zg;
  
  public Zzwj(Zkr0 paramZkr0) {
    this.Zt = paramZkr0;
  }
  
  public void ZL(Zbzs paramZbzs) {
    this.Zg = paramZbzs;
  }
  
  public void Zw(Zez3 paramZez3, Color paramColor) {
    this.Zt.Zm(0, paramColor, false, true, true);
    if (this.Zg != null)
      this.Zg.Zw(paramZez3, paramColor); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzwj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */