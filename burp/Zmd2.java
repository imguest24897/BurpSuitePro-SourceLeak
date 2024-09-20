package burp;

import net.portswigger.Zdo;

public class Zmd2 implements Zs18 {
  private final Zbnt Zp;
  
  private Zsmh ZG;
  
  private Zs68 Zl;
  
  public Zmd2(Zbnt paramZbnt) {
    this.Zp = paramZbnt;
  }
  
  public Zs68 Zq(Zsmh paramZsmh) {
    if (this.Zl != null && this.ZG == paramZsmh)
      return this.Zl; 
    this.ZG = paramZsmh;
    this.Zl = Zmre.ZK(null, (paramZsmh == null || paramZsmh.Zh()) ? Zdo.ZQ : Zt6s.Zu(paramZsmh), Zt0k.HTML_HEAD_ANALYSIS, this.Zp);
    return this.Zl;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmd2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */