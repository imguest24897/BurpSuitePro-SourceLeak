package burp;

import java.awt.Window;
import java.util.List;

public class Zr49 {
  private final Zz0n Zs;
  
  private final Zz28 ZI;
  
  private final Ztyg ZH;
  
  private final Zgq7 Zj;
  
  private final Zmjm Zl;
  
  private final Zr_4 ZX;
  
  private final Zkl6 Zu;
  
  public Zr49(Zz0n paramZz0n, Zz28 paramZz28, Ztyg paramZtyg, Zgq7 paramZgq7, Zmjm paramZmjm, Zr_4 paramZr_4, Zkl6 paramZkl6) {
    this.Zs = paramZz0n;
    this.ZI = paramZz28;
    this.ZH = paramZtyg;
    this.Zj = paramZgq7;
    this.Zl = paramZmjm;
    this.ZX = paramZr_4;
    this.Zu = paramZkl6;
  }
  
  public Zkk9 ZD(Zk5i paramZk5i, Zgo_ paramZgo_, Ze5a paramZe5a, String paramString) {
    return Zkk9.ZU(this.Zs, this.Zl, paramZe5a, paramZk5i, new Zrf7(paramZgo_), paramString, Zk97.DESKTOP_SCANNING_SCAN_LAUNCHER_SCOPE, this.Zu.Zq(), this.Zu.ZB(), this.ZX);
  }
  
  public void Zj(Window paramWindow, Zzr6 paramZzr6, List<? extends Zll9> paramList) {
    new Zrm3(paramWindow, paramZzr6, paramList, this.ZI, this.Zu.ZB(), this.ZH, this.Zj, this.Zu);
  }
  
  public void Z_(Window paramWindow, String paramString1, String paramString2, String paramString3) {
    new Zrhm(paramWindow, paramString1, paramString2, paramString3);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr49.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */