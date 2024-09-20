package burp;

import java.util.Objects;

public class Zkb8 implements Zxnt {
  private final Ztj1 ZS;
  
  private final Zbob ZH;
  
  private final Zrfd ZV;
  
  public Zkb8(Ztj1 paramZtj1, Zbob paramZbob, Zrfd paramZrfd) {
    this.ZS = paramZtj1;
    this.ZH = paramZbob;
    this.ZV = paramZrfd;
  }
  
  public void Zk(Zleo paramZleo, Zbj9 paramZbj9) {
    Zzkm zzkm = new Zzkm();
    Zx_7.Zh(this.ZH.Zdm()).Zl(zzkm);
    Zb8e zb8e = new Zb8e(zzkm, new Zmln[] { Zmln.AUDITING });
    paramZbj9.Zx(zb8e);
    paramZbj9.Zw(this.ZH.ZPm());
    paramZleo.Zi(Zzbb.SCAN_CONFIGURATION_PANEL.editorIndex);
    paramZleo.Zi(Zzbb.RESOURCE_POOL_PANEL.editorIndex);
    paramZleo.ZY(Ze1y.CANCEL_SAVE);
  }
  
  public Zzbb Zy() {
    return Zzbb.SCAN_CONFIGURATION_PANEL;
  }
  
  public int ZV(Zzbb paramZzbb) {
    return paramZzbb.editorIndex;
  }
  
  public void Zb(Zgyw paramZgyw, Zb2y paramZb2y) {
    if (paramZgyw != null)
      Zu(paramZgyw); 
    Zz(paramZb2y);
    this.ZS.Zw();
  }
  
  private void Zu(Zgyw paramZgyw) {
    Zx_7 zx_7 = Zx_7.Zh(this.ZH.Zdm());
    Objects.requireNonNull(zx_7);
    paramZgyw.ZU.stream().map(Zkbn::ZR).forEach(zx_7::Zd);
    this.ZH.Zod(Zkiv.ZT(paramZgyw.ZU));
  }
  
  private void Zz(Zb2y paramZb2y) {
    this.ZS.Zz(this.ZV.Zb(paramZb2y));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkb8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */