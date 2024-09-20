package burp;

import java.time.Duration;
import java.time.Instant;
import java.util.Collections;

public class Zkc {
  private final Zbnt ZX;
  
  private final Zey9 ZZ;
  
  private final Zlba ZE;
  
  private final Zbjl ZA;
  
  private final Zerg Zi;
  
  private final Zz1m<Zt1o> Zz;
  
  public Zkc(Zbnt paramZbnt, Zey9 paramZey9, Zlba paramZlba, Zbjl paramZbjl, Zerg paramZerg, Zz1m<Zt1o> paramZz1m) {
    this.ZX = paramZbnt;
    this.ZZ = paramZey9;
    this.ZE = paramZlba;
    this.ZA = paramZbjl;
    this.Zi = paramZerg;
    this.Zz = paramZz1m;
  }
  
  public Ze3n ZI(Zbza paramZbza) {
    Zefx zefx = Zrjd.Zo(this.ZZ, paramZbza);
    Zrsn zrsn = Zrsn.Zq(paramZbza.Zgz(), this.ZX);
    Zl6y zl6y = new Zl6y(this.ZX, Instant.ofEpochMilli(paramZbza.Zgw()), zefx, Collections.singletonList(Duration.ofMillis(paramZbza.Zgd())), (zrsn == null) ? Collections.<Zb6q>emptyList() : Collections.<Zb6q>singletonList(zrsn));
    Zlox zlox = Zlox.ZH(this.ZA, this.ZE, this.ZX, this.ZZ, this.Zi);
    Ze3n ze3n = paramZbza.Zv(this.ZX, zl6y, Zxdk.Zm, zlox, this.Zz);
    return !this.ZE.Zw(ze3n.ZM()) ? null : ze3n;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */