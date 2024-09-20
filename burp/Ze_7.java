package burp;

import java.time.Duration;
import java.util.Objects;

public class Ze_7 {
  private final Zz0n ZF;
  
  private final Zkl6 Zd;
  
  private final Zsxe Zx;
  
  private final Zts5 Za;
  
  private final Ztb7 Zk;
  
  private final Zesd Zp;
  
  private final Zln Zo;
  
  private static int[] Zq;
  
  public Ze_7(Zz0n paramZz0n, Zkl6 paramZkl6, Zgb6 paramZgb6, Ztwv paramZtwv) {
    this.ZF = paramZz0n;
    this.Zd = paramZkl6;
    this.Zx = new Zsxe(Zskh.Zo);
    int[] arrayOfInt = ZH();
    this.Za = Zs38.ZG(paramZgb6).ZQ().Zq(Duration.ofMillis(7000L)).ZI(Duration.ofMillis(20000L)).Zy();
    this.Zk = new Zmpt(this.Za.Zk(), paramZkl6.Zt());
    this.Zp = new Zssp(paramZz0n.ZP(), paramZgb6, paramZkl6);
    this.Zo = new Zrev(Zzxn.ZK, this.Zx, paramZtwv, Zlhd.ZZ, paramZz0n.ZP(), this.Za.Zk(), this.Za.Zv(), this.Za.Zz());
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  public Zg3d Zq(Zefx paramZefx) {
    return ZC(paramZefx, false);
  }
  
  public Zg3d ZX(Zefx paramZefx) {
    return ZC(paramZefx, true);
  }
  
  private Zg3d ZC(Zefx paramZefx, boolean paramBoolean) {
    Zxfj zxfj = paramBoolean ? new Zxfw() : Zxfj.ZI;
    Objects.requireNonNull(this.ZF);
    Zg3g zg3g = new Zg3g(this.Zd, Zslu.ZY, this.Zk, this.ZF.ZP(), Zgs4.Zc, Zzxn.ZK, this.Za, zxfj, Zlbz.Zx, Zgg0.ZC, this.Zp, new Zlc6(this.Zo, new Ztam(this.ZF.ZP(), this.ZF.ZU(), this.Zk, Zrxn.ZT), zxfj, Zlbz.Zx, Zlhd.ZZ, Zzxn.ZK, this.Zx, this.ZF.ZP(), Zxy1.Zk, this.Za.Zk(), this.Za.Zv(), Zlfd.Zo), new Zkdj(this.ZF.ZP(), this.ZF.ZU(), this.Zd, this.Zk, this.Zx, new Zbia(paramBoolean), Zlbz.Zx.ZE(), zxfj.ZC(), this.Zd.ZU(), this.ZF::ZZ), Zeak.Zn, Zk86.Ze, Zkoq.ZD, Zg6h.Zm);
    return zg3g.Zd(paramZefx).ZG();
  }
  
  public static void ZL(int[] paramArrayOfint) {
    Zq = paramArrayOfint;
  }
  
  public static int[] ZH() {
    return Zq;
  }
  
  static {
    if (ZH() == null)
      ZL(new int[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze_7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */