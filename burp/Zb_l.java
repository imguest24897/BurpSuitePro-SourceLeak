package burp;

import java.io.OutputStream;
import java.util.Objects;
import java.util.function.Function;

public class Zb_l {
  private final Zz0n ZJ;
  
  private final Zkl6 Zm;
  
  private final Zsxe ZS;
  
  private final Function<Boolean, Zts5> ZO;
  
  private final Zesd ZH;
  
  private static Zbqc[] ZV;
  
  public Zb_l(Zz0n paramZz0n, Zkl6 paramZkl6, Zgb6 paramZgb6) {
    this.ZJ = paramZz0n;
    this.Zm = paramZkl6;
    this.ZS = new Zsxe();
    this.ZO = paramZgb6::lambda$new$0;
    this.ZH = new Zssp(paramZz0n.ZP(), paramZgb6, paramZkl6);
  }
  
  public Zg3d Zu(Zefx paramZefx, boolean paramBoolean) {
    Zts5 zts5 = this.ZO.apply(Boolean.valueOf(paramBoolean));
    Zrev zrev = new Zrev(Zzxn.ZK, this.ZS, this.ZJ.Zj(), Zlhd.ZZ, this.ZJ.ZP(), zts5.Zk(), zts5.Zv(), zts5.Zz());
    return ZB(paramZefx, paramBoolean, zrev, zts5);
  }
  
  public Zg3d Zv(Zefx paramZefx, boolean paramBoolean, OutputStream paramOutputStream, Zlc8 paramZlc8) {
    Zts5 zts5 = this.ZO.apply(Boolean.valueOf(paramBoolean));
    Ztn6 ztn6 = new Ztn6(zts5, this.ZS, this.ZJ.ZP(), paramZlc8, paramOutputStream);
    return ZB(paramZefx, paramBoolean, ztn6, zts5);
  }
  
  public Zg3d ZF(Zefx paramZefx, boolean paramBoolean) {
    Zts5 zts5 = this.ZO.apply(Boolean.valueOf(paramBoolean));
    Ztn6 ztn6 = new Ztn6(zts5, this.ZS, this.ZJ.ZP(), new Ztui(), null);
    return ZB(paramZefx, paramBoolean, ztn6, zts5);
  }
  
  private Zg3d ZB(Zefx paramZefx, boolean paramBoolean, Zln paramZln, Zts5 paramZts5) {
    Zgn2 zgn2 = new Zgn2(paramBoolean, this.Zm.Zt());
    Zxfw zxfw = new Zxfw();
    Objects.requireNonNull(this.ZJ);
    Zg3g zg3g = new Zg3g(this.Zm, Zslu.ZY, zgn2, this.ZJ.ZP(), Zgs4.Zc, Zzxn.ZK, paramZts5, zxfw, Zlbz.Zx, Zgg0.ZC, this.ZH, new Zlc6(paramZln, new Ztam(this.ZJ.ZP(), this.ZJ.ZU(), zgn2, Zrxn.ZT), zxfw, Zlbz.Zx, Zlhd.ZZ, Zzxn.ZK, this.ZS, this.ZJ.ZP(), Zxy1.Zk, paramZts5.Zk(), paramZts5.Zv(), Zlfd.Zo), new Zkdj(this.ZJ.ZP(), this.ZJ.ZU(), this.Zm, zgn2, this.ZS, new Zbie(), Zlbz.Zx.ZE(), zxfw.ZC(), this.Zm.ZU(), this.ZJ::ZZ), Zeak.Zn, Zk86.Ze, Zkoq.ZD, Zg6h.Zm);
    return zg3g.Zd(paramZefx).ZG();
  }
  
  private static Zts5 lambda$new$0(Zgb6 paramZgb6, Boolean paramBoolean) {
    return Zs38.ZG(paramZgb6).ZQ().ZC(paramBoolean.booleanValue()).Zy();
  }
  
  public static void Za(Zbqc[] paramArrayOfZbqc) {
    ZV = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zk() {
    return ZV;
  }
  
  static {
    if (Zk() != null)
      Za(new Zbqc[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb_l.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */