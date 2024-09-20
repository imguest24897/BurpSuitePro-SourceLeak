package burp;

import java.util.Collections;
import java.util.Objects;

public class Zlnj implements Zm7j {
  private final Ztj1 Zt;
  
  private final Zr5h ZE;
  
  private final Zrfd ZN;
  
  private Zl_v Za;
  
  public Zlnj(Ztj1 paramZtj1, Zr5h paramZr5h, Zrfd paramZrfd) {
    this.Zt = paramZtj1;
    this.ZE = paramZr5h;
    this.ZN = paramZrfd;
  }
  
  public void Zz(Zl_v paramZl_v) {
    this.Za = paramZl_v;
  }
  
  public void Zm(Ze0 paramZe0) {
    paramZe0.ZN(Zkcl.SCAN_AUDIT);
    Zzkm zzkm = new Zzkm();
    Zx_7.Zh(this.ZE.Zdm()).Zl(zzkm);
    Zb8e zb8e = new Zb8e(zzkm, new Zmln[] { Zmln.AUDITING });
    paramZe0.Zx(zb8e);
    paramZe0.Zw(this.ZE.ZPm());
  }
  
  public void ZR() {
    this.Za.Zc();
    this.Za.ZS();
    this.Za.Zz();
    this.Za.ZL(Collections.emptyList());
    this.Za.ZB();
    this.Za.Zm();
    this.Za.Zi(1);
    this.Za.Zi(2);
    this.Za.Zi(3);
  }
  
  public void Z_(Zgyw paramZgyw, Zb2y paramZb2y) {
    if (paramZgyw != null)
      Zr(paramZgyw); 
    Zr(paramZb2y);
    this.Zt.Zw();
  }
  
  private void Zr(Zgyw paramZgyw) {
    Zx_7 zx_7 = Zx_7.Zh(this.ZE.Zdm());
    Objects.requireNonNull(zx_7);
    paramZgyw.ZU.stream().map(Zkbn::ZR).forEach(zx_7::Zd);
    Zrfd.ZQ(zx_7.Zk());
    this.ZE.Zod(Zkiv.ZT(paramZgyw.ZU));
  }
  
  private void Zr(Zb2y paramZb2y) {
    this.Zt.Zz(this.ZN.Zb(paramZb2y));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlnj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */