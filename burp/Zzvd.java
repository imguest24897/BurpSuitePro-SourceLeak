package burp;

import java.util.Optional;

public class Zzvd {
  private static final Zrgd Zl = new Zrgd();
  
  private static Zzvd Zf = new Zzvd();
  
  private final Zmrb Zj = new Zmrb(Zl);
  
  private final Zma ZI = new Zma(Zl);
  
  public void ZW(Zg3d paramZg3d) {
    int i = Zgum.ZA();
    Zb6q zb6q = paramZg3d.Ze();
    if (zb6q == null || zb6q.Ze() < 200 || zb6q.Ze() > 299)
      return; 
    Zk5m zk5m = this.ZI.Zf(zb6q);
    if (zk5m.ZE5() == null || (zk5m.ZEk() == -1 && zk5m.ZEN() == null))
      return; 
    if (zk5m.ZEN() != null) {
      this.Zj.ZX(paramZg3d.ZL().ZF(), zk5m.ZE5().longValue(), paramZg3d.ZQ(), zk5m.ZEk(), zk5m.ZEN().intValue());
      if (i == 0) {
        this.Zj.ZF(paramZg3d.ZL().ZF(), zk5m.ZE5().longValue(), paramZg3d.ZQ(), zk5m.ZEk());
        return;
      } 
      return;
    } 
    this.Zj.ZF(paramZg3d.ZL().ZF(), zk5m.ZE5().longValue(), paramZg3d.ZQ(), zk5m.ZEk());
  }
  
  public void Zw(Zlit paramZlit, Zsm1 paramZsm1) {
    Optional<Zeir> optional = this.Zj.Zy(paramZlit);
    if (optional.isPresent()) {
      long l;
      boolean bool = false;
      synchronized ((Zeir)optional.get()) {
        l = ((Zeir)optional.get()).ZW();
        if (((Zeir)optional.get()).ZX() < -2 && l > 0L) {
          paramZsm1.Zi(Math.min(l, 60000L));
          bool = true;
        } 
      } 
      if (!bool)
        Zsk5.ZJ(l); 
    } 
  }
  
  public static Zzvd ZS() {
    return Zf;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzvd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */