package burp;

import java.util.Objects;

public class Zsmm implements Zgt2 {
  private final Ztj1 Zs;
  
  private final Ztr3 ZM;
  
  private final Zrfd Zn;
  
  public Zsmm(Ztj1 paramZtj1, Ztr3 paramZtr3, Zrfd paramZrfd) {
    this.Zs = paramZtj1;
    this.ZM = paramZtr3;
    this.Zn = paramZrfd;
  }
  
  public void ZK(Zt43 paramZt43) {
    Zzkm zzkm = new Zzkm();
    Zx_7.Zh(this.ZM.Zdm()).Zl(zzkm);
    String str = Zt43.Zc();
    paramZt43.Zx(new Zb8e(zzkm, new Zmln[] { Zmln.AUDITING }));
    paramZt43.Zw(this.ZM.ZPm());
    if (Zbqc.Zwu() == null)
      Zt43.Zk("paO2f"); 
  }
  
  public void ZO(Zru5 paramZru5) {
    if (paramZru5.Zf != null)
      Za(paramZru5.Zf); 
    Zr(paramZru5.ZM);
    this.Zs.Zw();
  }
  
  private void Za(Zgyw paramZgyw) {
    Zx_7 zx_7 = Zx_7.Zh(this.ZM.Zdm());
    Objects.requireNonNull(zx_7);
    paramZgyw.ZU.stream().map(Zkbn::ZR).forEach(zx_7::Zd);
  }
  
  private void Zr(Zb2y paramZb2y) {
    this.Zs.Zz(this.Zn.Zb(paramZb2y));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsmm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */