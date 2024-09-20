package burp;

import java.util.Optional;

public class Zsoq {
  private final Zbnt ZS;
  
  private final Zefx Zh;
  
  private final Zefg<Zrrc> ZT;
  
  private final Zmfj Za;
  
  private final Zerg ZN;
  
  public Zsoq(Zefx paramZefx, Zmfj paramZmfj, Zefg<Zrrc> paramZefg, Zbnt paramZbnt, Zerg paramZerg) {
    this.ZS = paramZbnt;
    this.Zh = paramZefx;
    this.ZT = paramZefg;
    this.Za = paramZmfj;
    this.ZN = paramZerg;
  }
  
  public Zxs7 ZB(Zro0 paramZro0) {
    if (!paramZro0.ZES())
      return null; 
    Optional<Zxs7> optional = (new Zzp6(this.Zh, this.ZT, this.ZS)).Zd().Z_(this.ZS).ZU(this.Za, this.ZN).Zh(paramZro0);
    return optional.orElse(null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsoq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */