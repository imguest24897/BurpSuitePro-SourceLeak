package burp;

import java.util.List;
import java.util.Objects;

public class Zxgw implements Zm7j {
  private final Ztj1 Zb;
  
  private final Zlog ZS;
  
  private final Zrfd ZC;
  
  private Zl_v ZH;
  
  public Zxgw(Ztj1 paramZtj1, Zlog paramZlog, Zrfd paramZrfd) {
    this.Zb = paramZtj1;
    this.ZS = paramZlog;
    this.ZC = paramZrfd;
  }
  
  public void Zz(Zl_v paramZl_v) {
    this.ZH = paramZl_v;
  }
  
  public void Zm(Ze0 paramZe0) {
    Zl7h zl7h = this.ZS.ZnH();
    paramZe0.ZN(Zkcl.SCAN_CRAWL);
    List<String> list = zl7h.ZVe().ZBZ().stream().map(Object::toString).toList();
    paramZe0.ZX(list, zl7h.ZVY(), zl7h.ZVE());
    paramZe0.Zv(zl7h.ZVV());
    Zzkm zzkm = new Zzkm();
    Zkkg.Zv(zl7h).Zl(zzkm);
    Zb8e zb8e = new Zb8e(zzkm, new Zmln[] { Zmln.CRAWLING });
    paramZe0.Zx(zb8e);
    Objects.requireNonNull(paramZe0);
    zl7h.ZVM().forEach(paramZe0::Zy);
    Objects.requireNonNull(paramZe0);
    zl7h.ZVs().forEach(paramZe0::Zy);
    paramZe0.Zw(this.ZS.ZPm());
  }
  
  public void ZR() {
    this.ZH.ZU();
    this.ZH.ZQ();
    this.ZH.Zg();
    this.ZH.Zi();
    this.ZH.Zm();
    this.ZH.ZV();
    this.ZH.Zi(1);
    this.ZH.Zi(2);
    this.ZH.Zi(3);
  }
  
  public void Z_(Zgyw paramZgyw, Zb2y paramZb2y) {
    if (paramZgyw != null)
      Ze(paramZgyw); 
    ZR(paramZb2y);
    this.Zb.Zw();
  }
  
  private void Ze(Zgyw paramZgyw) {
    Zkkg zkkg = Zkkg.Zv(this.ZS.ZnH());
    Objects.requireNonNull(zkkg);
    paramZgyw.ZU.stream().map(Zkbn::ZR).forEach(zkkg::Zd);
    this.ZS.Zod(Zkiv.ZT(paramZgyw.ZU));
  }
  
  private void ZR(Zb2y paramZb2y) {
    this.Zb.Zz(this.ZC.Zb(paramZb2y));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxgw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */