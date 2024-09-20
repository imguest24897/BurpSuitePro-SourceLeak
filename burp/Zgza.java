package burp;

import java.util.List;
import java.util.Objects;

public class Zgza implements Ztvr {
  private final Ztj1 Zs;
  
  private final Zzep ZL;
  
  private final Zrfd Zd;
  
  public Zgza(Ztj1 paramZtj1, Zzep paramZzep, Zrfd paramZrfd) {
    this.Zs = paramZtj1;
    this.ZL = paramZzep;
    this.Zd = paramZrfd;
  }
  
  public void Zi(Zxgl paramZxgl, Zebs paramZebs) {
    List<String> list = this.ZL.ZnH().ZVe().ZBZ().stream().map(Object::toString).toList();
    paramZebs.Zx(list);
    Zzkm zzkm = new Zzkm();
    Zx_7.Zh(this.ZL.Zdm()).Zl(zzkm);
    Zb8e zb8e = new Zb8e(zzkm, new Zmln[] { Zmln.AUDITING });
    paramZebs.Zx(zb8e);
    paramZebs.Zw(this.ZL.ZPm());
    paramZxgl.ZG();
    paramZxgl.Zi(Zlze.WSDL_URLS_CONFIG_PANEL.index);
    int[] arrayOfInt = Zg7g.Zf();
    paramZxgl.Zi(Zlze.SCAN_CONFIGURATION_PANEL.index);
    paramZxgl.Zi(Zlze.RESOURCE_POOL_PANEL.index);
    paramZxgl.ZX(Zmpu.CANCEL_SAVE);
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  public Zlze Zw() {
    return Zlze.SCAN_CONFIGURATION_PANEL;
  }
  
  public int Zn(Zlze paramZlze) {
    return paramZlze.index;
  }
  
  public void ZF(Zgyw paramZgyw, Zb2y paramZb2y) {
    if (paramZgyw != null)
      Zx(paramZgyw); 
    Zf(paramZb2y);
    this.Zs.Zw();
  }
  
  private void Zx(Zgyw paramZgyw) {
    Zx_7 zx_7 = Zx_7.Zh(this.ZL.Zdm());
    Objects.requireNonNull(zx_7);
    paramZgyw.ZU.stream().map(Zkbn::ZR).forEach(zx_7::Zd);
    this.ZL.Zod(Zkiv.ZT(paramZgyw.ZU));
  }
  
  private void Zf(Zb2y paramZb2y) {
    this.Zs.Zz(this.Zd.Zb(paramZb2y));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgza.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */