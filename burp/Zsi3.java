package burp;

import net.portswigger.Zen;
import net.portswigger.Zsy;

public class Zsi3 implements Zrsu {
  private final Zkl6 ZO;
  
  private final Zbjl Zx;
  
  private final Zkq4 Zo;
  
  private final Zsy Zg;
  
  private final Zlba Zw;
  
  private final Zkc Zc;
  
  private final Zmsw Zu;
  
  private final int ZQ;
  
  private final Zz1i ZE;
  
  Zsi3(Zkl6 paramZkl6, Zbjl paramZbjl, Zkq4 paramZkq4, Zsy paramZsy, Zlba paramZlba, Zkc paramZkc, Zmsw paramZmsw, int paramInt, Zz1i paramZz1i) {
    this.ZO = paramZkl6;
    this.Zx = paramZbjl;
    this.Zo = paramZkq4;
    this.Zg = paramZsy;
    this.Zw = paramZlba;
    this.Zc = paramZkc;
    this.Zu = paramZmsw;
    this.ZQ = paramInt;
    this.ZE = paramZz1i;
  }
  
  public void ZL(Ze3n paramZe3n, Zlkb paramZlkb, Zb6q paramZb6q, Zz4_ paramZz4_) {
    if (this.Zo.Zr(Zzu2.INPUT_RETRIEVAL_STORED)) {
      int i = paramZlkb.ZM.Zgv();
      String str = paramZlkb.Zw.Zl().toString();
      if (this.Zu.ZL(Integer.valueOf(i), str, paramZb6q.Ze())) {
        this.Zu.Zu(Integer.valueOf(i), str, paramZb6q.Ze());
        Zbza zbza = this.Zw.ZW(i);
        Ze3n ze3n = this.Zc.ZI(zbza);
        Zxs7 zxs7 = paramZlkb.Zw;
        Zlp9 zlp9 = paramZlkb.ZO.ZN();
        Zb9e zb9e = new Zb9e(ze3n, this.ZO, this.ZQ, this.Zx, this.Zo, this.Zg, this.ZE, this.ZO.ZH());
        Zen zen = paramZlkb.Zf;
        Zewx zewx = zb9e.Zl(zxs7, zlp9).ZK(zlp9, zen);
        paramZz4_.Zz(Zecz.ZY(zen, paramZlkb.Zh, zxs7, zewx, ze3n, paramZe3n, this.ZO.ZB(), this.Zg, paramZb6q));
      } 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsi3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */