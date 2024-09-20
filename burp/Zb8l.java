package burp;

import java.util.List;
import java.util.Objects;

public class Zb8l implements Zm7j {
  private final Ztj1 Zz;
  
  private final Zzep ZT;
  
  private final Zrfd ZP;
  
  private Zl_v Zu;
  
  public Zb8l(Ztj1 paramZtj1, Zzep paramZzep, Zrfd paramZrfd) {
    this.Zz = paramZtj1;
    this.ZT = paramZzep;
    this.ZP = paramZrfd;
  }
  
  public void Zz(Zl_v paramZl_v) {
    this.Zu = paramZl_v;
  }
  
  public void Zm(Ze0 paramZe0) {
    Zl7h zl7h = this.ZT.ZnH();
    paramZe0.ZN(Zkcl.SCAN_CRAWL_AND_AUDIT);
    List<String> list = zl7h.ZVe().ZBZ().stream().map(Object::toString).toList();
    paramZe0.ZX(list, zl7h.ZVY(), zl7h.ZVE());
    paramZe0.Zv(zl7h.ZVV());
    Zzkm zzkm1 = new Zzkm();
    int[] arrayOfInt = Zz7i.Zk();
    Zkkg.Zv(zl7h).Zl(zzkm1);
    paramZe0.Zx(new Zb8e(zzkm1, new Zmln[] { Zmln.CRAWLING }));
    Zzkm zzkm2 = new Zzkm();
    Zx_7.Zh(this.ZT.Zdm()).Zl(zzkm2);
    paramZe0.Zx(new Zb8e(zzkm2, new Zmln[] { Zmln.AUDITING }));
    Objects.requireNonNull(paramZe0);
    zl7h.ZVM().forEach(paramZe0::Zy);
    Objects.requireNonNull(paramZe0);
    zl7h.ZVs().forEach(paramZe0::Zy);
    paramZe0.Zw(this.ZT.ZPm());
    if (Zbqc.Zwu() == null)
      Zz7i.Zv(new int[3]); 
  }
  
  public void ZR() {
    this.Zu.ZI();
    this.Zu.ZQ();
    this.Zu.Zg();
    this.Zu.Zi();
    this.Zu.Zm();
    this.Zu.ZV();
    this.Zu.Zi(1);
    this.Zu.Zi(2);
    this.Zu.Zi(3);
  }
  
  public void Z_(Zgyw paramZgyw, Zb2y paramZb2y) {
    if (paramZgyw != null)
      Zp(paramZgyw); 
    Zy(paramZb2y);
    this.Zz.Zw();
  }
  
  private void Zp(Zgyw paramZgyw) {
    Zkkg zkkg = Zkkg.Zv(this.ZT.ZnH());
    Objects.requireNonNull(zkkg);
    paramZgyw.ZU.stream().map(Zkbn::ZR).forEach(zkkg::Zd);
    Zx_7 zx_7 = Zx_7.Zh(this.ZT.Zdm());
    Objects.requireNonNull(zx_7);
    paramZgyw.ZU.stream().map(Zkbn::ZR).forEach(zx_7::Zd);
    Zrfd.ZQ(zx_7.Zk());
    this.ZT.Zod(Zkiv.ZT(paramZgyw.ZU));
  }
  
  private void Zy(Zb2y paramZb2y) {
    this.Zz.Zz(this.ZP.Zb(paramZb2y));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb8l.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */