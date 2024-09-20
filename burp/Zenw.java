package burp;

import java.util.Collections;
import java.util.List;
import net.portswigger.Zkb;

class Zenw implements Zmgr {
  private final Zm7h ZY;
  
  private final Zrry ZU;
  
  private final Zlb4 Zb;
  
  private final Zkoz ZT;
  
  private final Zb9t Ze;
  
  private final Zgwp Zh;
  
  private final Zmz6 Zt;
  
  private final Zmdu ZQ;
  
  Zenw(Zmdu paramZmdu, Zm7h paramZm7h, Zrry paramZrry, Zlb4 paramZlb4, Zkoz paramZkoz, Zb9t paramZb9t, Zgwp paramZgwp, Zmz6 paramZmz6) {
    this.ZQ = paramZmdu;
    this.ZY = paramZm7h;
    this.ZU = paramZrry;
    this.Zb = paramZlb4;
    this.ZT = paramZkoz;
    this.Ze = paramZb9t;
    this.Zh = paramZgwp;
    this.Zt = paramZmz6;
  }
  
  public void Za(Zrj paramZrj, Zlsy paramZlsy) {
    int i = Zz45.ZU();
    Ze3n ze3n = this.Ze.ZG();
    List list = (List)((ze3n == null) ? Collections.emptyList() : ze3n.Zo());
    for (Zxs7 zxs7 : list) {
      for (Ztbx ztbx : this.ZY.Zz(zxs7)) {
        Zrcw zrcw = this.ZU.Za(ztbx);
        Zgy4 zgy4 = new Zgy4(ztbx);
        Zroi zroi = new Zroi(new Zkox(zgy4));
        Zkci zkci = new Zkci(zroi);
        Zgq<Zrdb> zgq = ZY(zrcw, ztbx, ztbx.Zn.Z_(), zkci);
        if (zgq != null)
          this.Zt.ZQ(zgq, ztbx.ZW.ZM()); 
        this.Zb.Zt(ztbx, new Zlc0(zkci, zroi, zgy4));
        if (i != 0)
          break; 
      } 
      if (i != 0)
        break; 
    } 
  }
  
  private Zgq<Zrdb> ZY(Zrcw paramZrcw, Ztbx paramZtbx, byte paramByte, Zs4_ paramZs4_) {
    String str = Zkb.ZG(paramZtbx.ZL().ZY());
    Zzwk zzwk = this.Zh.ZU(this.ZQ, str, paramByte, paramZtbx.Zz);
    return this.ZT.Zv(paramZtbx.ZW, paramZtbx.ZW.ZA().ZF(), paramZtbx.Zf, paramZtbx.ZP, paramZrcw, zzwk, paramZs4_, Zkoz.Zc);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zenw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */