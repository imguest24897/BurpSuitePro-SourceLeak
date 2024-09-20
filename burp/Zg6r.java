package burp;

import java.time.Duration;
import java.time.Instant;
import java.util.Collections;
import java.util.List;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zg6r {
  private final Zbnt ZN;
  
  private final Zey9 Zq;
  
  private final Zbph Za;
  
  private final Zz1m<Zt1o> ZI;
  
  private final List<Zg_8> ZG;
  
  private final boolean ZC;
  
  Zg6r(Zbnt paramZbnt, Zey9 paramZey9, Zbph paramZbph, List<Zg_8> paramList, boolean paramBoolean, Zz1m<Zt1o> paramZz1m) {
    this.ZN = paramZbnt;
    this.Zq = paramZey9;
    this.Za = paramZbph;
    this.ZG = paramList;
    this.ZC = paramBoolean;
    this.ZI = paramZz1m;
  }
  
  Zbza ZI(Integer paramInteger, List<Zbza> paramList) {
    int i = Zlp9.ZT();
    for (Zbza zbza : paramList) {
      if (zbza.Zgv() == paramInteger.intValue())
        return zbza; 
      if (i == 0)
        break; 
    } 
    return null;
  }
  
  Ze3n ZV(Zbza paramZbza) {
    Zmzk zmzk = paramZbza.Zg0();
    byte[] arrayOfByte = paramZbza.ZgC();
    Zefx zefx = this.Zq.ZY(zmzk, arrayOfByte);
    int i = Zlp9.Zr();
    Zl6y zl6y = new Zl6y(this.ZN, Instant.ofEpochMilli(paramZbza.Zgw()), zefx, Collections.singletonList(Duration.ofMillis(paramZbza.Zgd())), (paramZbza.Zgz() == null) ? Collections.<Zb6q>emptyList() : Collections.<Zb6q>singletonList(Zrsn.Zq(paramZbza.Zgz(), this.ZN)));
    Zxdk zxdk = ZT(paramZbza, zefx);
    Ze3n ze3n = paramZbza.Zv(this.ZN, zl6y, zxdk, null, this.ZI);
    Zuh.Zb(((ze3n.ZA().ZD()).length == paramZbza.Zgy().Zpu()), Zqf.Zr);
    Zuh.Zb(ze3n.ZL().Za().ZF(paramZbza.Zgz()), Zqf.Zr);
    if (Zbqc.Zwu() == null)
      Zlp9.Zq(++i); 
    return ze3n;
  }
  
  private Zxdk ZT(Zbza paramZbza, Zefx paramZefx) {
    return (new Zzp6(paramZefx, paramZbza.Zgf(), this.ZN)).Zd().ZQ(this.Za, this.ZN).Zm();
  }
  
  boolean ZU(byte paramByte) {
    return (paramByte == 2 || paramByte == 4);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg6r.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */