package burp;

import java.util.List;

public class Zemt {
  private final Zg03 Zn;
  
  private final Ztou ZG;
  
  private final Zttp ZN;
  
  private final Zb_x ZW;
  
  private final Runnable Zp;
  
  public Zemt(Zg03 paramZg03, Ztou paramZtou, Zb_x paramZb_x, Runnable paramRunnable) {
    this.Zn = paramZg03;
    this.ZG = paramZtou;
    this.ZW = paramZb_x;
    this.Zp = paramRunnable;
    this.ZN = Zttp.Zo();
  }
  
  public void Zq(Zgxp paramZgxp) {
    this.Zn.ZP(paramZgxp);
  }
  
  public void ZE(Zgxp paramZgxp) {
    boolean bool = !paramZgxp.Zew() ? true : false;
    if (bool && !Zsim.ZR(paramZgxp)) {
      this.ZW.Zo();
      this.Zp.run();
    } 
    this.ZG.ZD(new Zxr8<>(Zt1l.Zd, paramZgxp));
    this.ZN.ZV();
  }
  
  public List<Zgxp> ZC() {
    return this.Zn.Zn();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zemt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */