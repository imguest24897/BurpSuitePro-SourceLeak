package burp;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import net.portswigger.Zkb;

class Zs_0 implements Zrbc, Zmgr {
  private final Ze3n ZW;
  
  private final Zvs ZP;
  
  private final Zxs7 Z_;
  
  private final byte[] Zv;
  
  private final byte ZV;
  
  private final Zs4_ Zn;
  
  private final Zgwp Zz;
  
  private final Zkoz ZR;
  
  private final Zmz6 ZO;
  
  private final Zmdu Zg;
  
  private final Ztl ZH;
  
  private final Zz_q ZS;
  
  Zs_0(Ze3n paramZe3n, Zvs paramZvs, Zxs7 paramZxs7, byte[] paramArrayOfbyte, byte paramByte, Zs4_ paramZs4_, Zgwp paramZgwp, Zkoz paramZkoz, Zmz6 paramZmz6, Zmdu paramZmdu, Ztl paramZtl, Zz_q paramZz_q) {
    this.ZW = paramZe3n;
    this.ZP = paramZvs;
    this.Z_ = paramZxs7;
    this.Zv = paramArrayOfbyte;
    this.ZV = paramByte;
    this.Zn = paramZs4_;
    this.Zz = paramZgwp;
    this.ZR = paramZkoz;
    this.ZO = paramZmz6;
    this.Zg = paramZmdu;
    this.ZH = paramZtl;
    this.ZS = paramZz_q;
  }
  
  public void Za(Zrj paramZrj, Zlsy paramZlsy) {
    Zzwk zzwk = this.Zz.ZU(this.Zg, Zkb.ZG(this.Zv), this.ZV, this.Z_);
    Objects.requireNonNull(this.ZP);
    Zgq<Zrdb> zgq = this.ZR.Zv(this.ZW, this.ZH.ZV(), this.ZH.Zf(), this.ZH.ZL(), (new Zg22()).Zn(this.ZS, this.ZH.Zf(), this.ZH.ZL(), this.ZH.ZG()), zzwk, this.Zn, this.ZP::equals);
    this.ZO.ZQ(zgq, this.ZW.ZM());
  }
  
  public Set<? extends Zmgr> Zc() {
    return this.ZH.ZJ() ? Collections.<Zmgr>emptySet() : Collections.<Zmgr>singleton(this);
  }
  
  public Set<? extends Zz09> Zs() {
    return Collections.emptySet();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs_0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */