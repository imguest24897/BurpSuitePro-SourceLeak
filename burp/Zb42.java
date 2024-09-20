package burp;

import java.util.Iterator;
import java.util.List;
import net.portswigger.Zen;

public class Zb42 {
  private final Zzod Zg;
  
  private final int ZR;
  
  private final int Zs;
  
  private final Zro0 ZK;
  
  private final List<Zlp9> Zn;
  
  public Zb42(Zzod paramZzod, int paramInt1, int paramInt2, Zro0 paramZro0, List<Zlp9> paramList) {
    this.Zg = paramZzod;
    this.ZR = paramInt1;
    this.Zs = paramInt2;
    this.ZK = paramZro0;
    this.Zn = paramList;
  }
  
  public Zen ZB(Zlp9 paramZlp9) {
    Ztt6 ztt6 = new Ztt6(this.ZR, this.Zs, paramZlp9, this.ZK);
    return this.Zg.ZK(1, ztt6.toString());
  }
  
  public Zzow Zu(Zlp9 paramZlp9) {
    Zen zen = ZB(paramZlp9);
    return ZT(zen);
  }
  
  public Zzow Zc(Zlp9 paramZlp9, Zen paramZen) {
    Zen zen = Zen.ZR(paramZen, paramZlp9.Zz(), paramZen.ZO);
    return ZT(zen);
  }
  
  private Zzow ZT(Zen paramZen) {
    Zzow zzow = new Zzow();
    Iterator<Zlp9> iterator = this.Zn.iterator();
    int i = Zlp9.Zr();
    while (iterator.hasNext()) {
      Zlp9 zlp9 = iterator.next();
      Ztt6 ztt6 = new Ztt6(this.ZR, this.Zs, zlp9, this.ZK);
      zzow.Zv(zlp9, Zen.Zj(paramZen, zlp9.Zz(), ztt6.toString()));
      if (i != 0)
        break; 
    } 
    return zzow;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb42.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */