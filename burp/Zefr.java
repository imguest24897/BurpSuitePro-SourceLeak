package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zefr {
  private final Ztyg ZH;
  
  private final Zgq7 Zj;
  
  private final Zbnt ZL;
  
  private final Zey9 Zx;
  
  Zefr(Ztyg paramZtyg, Zgq7 paramZgq7, Zbnt paramZbnt, Zey9 paramZey9) {
    this.ZH = paramZtyg;
    this.Zj = paramZgq7;
    this.ZL = paramZbnt;
    this.Zx = paramZey9;
  }
  
  Zsic Zi(Zb04 paramZb04) {
    return new Zbr7(paramZb04, this.ZH, this.Zj, this.Zx);
  }
  
  Zsic Zc(Zb04 paramZb04, Zmo7 paramZmo7) {
    return new Zbr7(paramZb04, this.ZH, this.Zj, paramZmo7, this.Zx);
  }
  
  Zsic ZZ(Zb04 paramZb04, Zk75 paramZk75, Zma9 paramZma9) {
    return new Zbr7(paramZb04, this.ZH, this.Zj, paramZk75, paramZma9, this.Zx);
  }
  
  Zsic ZD(Zb04 paramZb04, Zk75 paramZk75) {
    try {
      Zmzk zmzk = this.ZL.ZY(paramZk75.Zi, paramZk75.ZU, paramZk75.Zo);
      Zz1p zz1p = Zekx.Zu(zmzk, paramZk75.ZI, (byte)1, this.ZL);
      return new Zbr7(paramZb04, this.ZH, this.Zj, zz1p.Zo, paramZk75, this.Zx);
    } catch (Zxgy|Zxg5 zxgy) {
      Zah.Zl(zxgy, Zk_.IMPOSSIBLE);
      return null;
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zefr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */