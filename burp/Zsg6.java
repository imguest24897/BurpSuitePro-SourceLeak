package burp;

import java.util.Objects;
import java.util.function.Supplier;

public class Zsg6 {
  private final Zz0n ZF;
  
  private final Zkl6 ZS;
  
  private final Zsxe ZZ;
  
  private final Supplier<Zts5> ZL;
  
  private final Zesd ZU;
  
  public Zsg6(Zz0n paramZz0n, Zkl6 paramZkl6, Zgb6 paramZgb6) {
    this.ZF = paramZz0n;
    this.ZS = paramZkl6;
    this.ZZ = new Zsxe();
    this.ZL = paramZgb6::lambda$new$0;
    int[] arrayOfInt = Zebm.Zm();
    this.ZU = new Zssp(paramZz0n.ZP(), paramZgb6, paramZkl6);
    if (Zbqc.Zwu() == null)
      Zebm.Zb(new int[4]); 
  }
  
  public Zg3d Za(Zefx paramZefx) {
    Zts5 zts5 = this.ZL.get();
    Zrev zrev = new Zrev(Zzxn.ZK, this.ZZ, this.ZF.Zj(), Zlhd.ZZ, this.ZF.ZP(), zts5.Zk(), zts5.Zv(), zts5.Zz());
    int[] arrayOfInt = Zebm.Zm();
    if (arrayOfInt != null)
      Zbqc.Zr(new Zbqc[5]); 
    return Zm(paramZefx, zrev, zts5);
  }
  
  private Zg3d Zm(Zefx paramZefx, Zln paramZln, Zts5 paramZts5) {
    Ztaz ztaz = new Ztaz(this.ZS.Zt());
    Zxfj zxfj = new Zxfj();
    Objects.requireNonNull(this.ZF);
    Zg3g zg3g = new Zg3g(this.ZS, Zslu.ZY, ztaz, this.ZF.ZP(), Zgs4.Zc, Zzxn.ZK, paramZts5, zxfj, Zlbz.Zx, Zgg0.ZC, this.ZU, new Zlc6(paramZln, new Ztam(this.ZF.ZP(), this.ZF.ZU(), ztaz, Zrxn.ZT), zxfj, Zlbz.Zx, Zlhd.ZZ, Zzxn.ZK, this.ZZ, this.ZF.ZP(), Zxy1.Zk, paramZts5.Zk(), paramZts5.Zv(), Zlfd.Zo), new Zkdj(this.ZF.ZP(), this.ZF.ZU(), this.ZS, ztaz, this.ZZ, new Zbik(this), Zlbz.Zx.ZE(), zxfj.ZC(), this.ZS.ZU(), this.ZF::ZZ), Zeak.Zn, Zk86.Ze, Zkoq.ZD, Zg6h.Zm);
    return zg3g.Zd(paramZefx).ZG();
  }
  
  private static Zts5 lambda$new$0(Zgb6 paramZgb6) {
    return Zs38.ZG(paramZgb6).ZQ().Zy();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsg6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */