package burp;

import java.util.Objects;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zzw2 {
  private final Zz0n Zb;
  
  private final Zkl6 ZR;
  
  private final Zsxe Za;
  
  private final Zts5 ZJ;
  
  private final Ztb7 ZU;
  
  private final Zesd Zi;
  
  private final Zln ZZ;
  
  public Zzw2(Zz0n paramZz0n, Zkl6 paramZkl6, Zgb6 paramZgb6, Ztwv paramZtwv) {
    this.Zb = paramZz0n;
    this.ZR = paramZkl6;
    this.Za = new Zsxe();
    this.ZJ = Zs38.ZG(paramZgb6).ZQ().Zy();
    this.ZU = new Zmpt(this.ZJ.Zk(), paramZkl6.Zt());
    this.Zi = new Zssp(paramZz0n.ZP(), paramZgb6, paramZkl6);
    Zbqc[] arrayOfZbqc = Zb_l.Zk();
    this.ZZ = new Zrev(Zzxn.ZK, this.Za, paramZtwv, Zlhd.ZZ, paramZz0n.ZP(), this.ZJ.Zk(), this.ZJ.Zv(), this.ZJ.Zz());
    if (Zbqc.Zwu() == null)
      Zb_l.Za(new Zbqc[4]); 
  }
  
  public Zg3d Zj(Zefx paramZefx) {
    Zuh.Zb(paramZefx.ZT().ZJZ(), Zqf.Zr);
    Zxfw zxfw = new Zxfw();
    Objects.requireNonNull(this.Zb);
    Zg3g zg3g = new Zg3g(this.ZR, Zslu.ZY, this.ZU, this.Zb.ZP(), Zgs4.Zc, Zzxn.ZK, this.ZJ, zxfw, Zlbz.Zx, Zgg0.ZC, this.Zi, new Zlc6(this.ZZ, new Ztam(this.Zb.ZP(), this.Zb.ZU(), this.ZU, Zrxn.ZT), zxfw, Zlbz.Zx, Zlhd.ZZ, Zzxn.ZK, this.Za, this.Zb.ZP(), Zxy1.Zk, this.ZJ.Zk(), this.ZJ.Zv(), Zlfd.Zo), new Zkdj(this.Zb.ZP(), this.Zb.ZU(), this.ZR, this.ZU, this.Za, new Zbie(), Zlbz.Zx.ZE(), zxfw.ZC(), this.ZR.ZU(), this.Zb::ZZ), Zeak.Zn, Zk86.Ze, Zkoq.ZD, Zg6h.Zm);
    Zbqc[] arrayOfZbqc = Zb_l.Zk();
    if (arrayOfZbqc != null)
      Zbqc.Zr(new Zbqc[5]); 
    return zg3g.Zd(paramZefx).ZG();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzw2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */