package burp;

import java.util.List;
import net.portswigger.Zkb;

public class Zgmx {
  private final Zsoh ZM;
  
  private final Ztpx Zb;
  
  private final Zkl6 Zx;
  
  private final Zbza ZJ;
  
  public Zgmx(Zsoh paramZsoh, Ztpx paramZtpx, Zkl6 paramZkl6, Zbza paramZbza) {
    this.ZM = paramZsoh;
    this.Zb = paramZtpx;
    this.Zx = paramZkl6;
    Zbqc[] arrayOfZbqc = Zsiw.ZB();
    this.ZJ = paramZbza;
    if (Zbqc.Zwu() == null)
      Zsiw.ZC(new Zbqc[5]); 
  }
  
  public boolean Zq(Zes5 paramZes5, Zsiw paramZsiw, List<Zlou> paramList) {
    if (paramZes5.Zo == null)
      return true; 
    Zs68 zs68 = ZV(paramZes5.Zo);
    if (zs68.ZQ == null || zs68.ZQ.size() == 0)
      return false; 
    Zlqf zlqf = new Zlqf(zs68.ZQ);
    Zx8_ zx8_ = zlqf.ZJ(paramZes5.ZK);
    if (zx8_ == null)
      zx8_ = zlqf.Zk(paramList); 
    if (zx8_ != null) {
      paramZsiw.ZK(zx8_);
      return true;
    } 
    return false;
  }
  
  private Zs68 ZV(String paramString) {
    Zax zax = new Zax(this.ZJ.Zg0(), Zkb.Zy(paramString));
    byte[] arrayOfByte = this.Zx.Zs().ZO().Zf(zax).Zr().ZiD();
    Zsxd zsxd = this.ZM.ZD(Ztao.Zc(this.Zb, this.ZJ, arrayOfByte).Zx(Zxgd.ZZ().Zp(Zgmx::lambda$doRequest$0)).Zz(true).ZA());
    Zstu zstu = zsxd.ZG().Ze().Za();
    return Zbwc.Zt(zax, zstu, Zt0k.HTML_ANALYSIS, this.Zx.ZB());
  }
  
  private static Ztcd lambda$doRequest$0(Ztcd paramZtcd) {
    return paramZtcd.ZM(new Zguv());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgmx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */