package burp;

import java.util.Map;
import net.portswigger.Zcw;
import net.portswigger.Zl9;
import net.portswigger.Zml;
import net.portswigger.Zn8;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zlkc implements Zk19 {
  private final Zml Zx;
  
  private final Zgb6 Zl;
  
  private final Zro8 ZG;
  
  private boolean Ze = false;
  
  public Zlkc(Zml paramZml, Zgb6 paramZgb6, Zro8 paramZro8) {
    Zuh.Zb((null != paramZml), Zqf.Zv);
    Zuh.Zb((null != paramZgb6), Zqf.Zv);
    Zuh.Zb((null != paramZro8), Zqf.Zv);
    this.Zx = paramZml;
    this.Zl = paramZgb6;
    this.ZG = paramZro8;
  }
  
  public void Zy() {
    if (this.Ze || !this.Zl.Zqj())
      return; 
    Map<String, String> map = this.ZG.ZR();
    Zn8 zn8 = (new Zcw(Zl9.DIAGNOSTICS, 0)).ZS(map).ZV();
    this.Zx.Z_(zn8);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlkc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */