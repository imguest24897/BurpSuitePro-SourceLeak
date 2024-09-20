package burp;

import java.awt.Window;
import java.util.Map;
import java.util.Objects;
import javax.swing.tree.TreePath;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zm2;

public class Zm3z {
  private final Zgxf ZG;
  
  private final Zz0n ZE;
  
  private final Zt4u ZP;
  
  private final Ztdi Zf;
  
  private final Zmrj ZI;
  
  private final Zzi Zw;
  
  private final Zmiw Zo;
  
  private final Zor ZK;
  
  private final Map<TreePath, Boolean> ZF;
  
  private final Zskh Zm;
  
  private final Ze8b Za;
  
  private final Ztwv ZT;
  
  private final Zr_4 Zh;
  
  private final Zbiv ZR;
  
  private final Zgx0 ZZ;
  
  private final Zkrj ZW;
  
  private final Zgbj Zu;
  
  private final Zgb6 Zq;
  
  private final Zxgc ZY;
  
  private final Zgzy ZV;
  
  private final Zslu Zj;
  
  private final Zkl6 ZC;
  
  private final Zbnt ZL;
  
  private final Zerg Z_;
  
  private final Zskh Zb;
  
  private final Zmlq ZO;
  
  private final Zm6x Zn;
  
  private final Zbws Zc;
  
  public Zm3z(Zz0n paramZz0n, Zt4u paramZt4u, Ztdi paramZtdi, Zmrj paramZmrj, Zzi paramZzi, Zmiw paramZmiw, Zbws paramZbws, Zor paramZor, Map<TreePath, Boolean> paramMap, Zg_q paramZg_q, Zgbj paramZgbj, Zgb6 paramZgb6, Zxgc paramZxgc, Zskh paramZskh1, Zgzy paramZgzy, Zslu paramZslu, Zkl6 paramZkl6, Ze8b paramZe8b, Ztwv paramZtwv, Zr_4 paramZr_4, Zbiv paramZbiv, Zgx0 paramZgx0, Zerg paramZerg, Zskh paramZskh2, Zmlq paramZmlq, Zm6x paramZm6x) {
    this.ZE = paramZz0n;
    this.ZP = paramZt4u;
    int[] arrayOfInt = Zl9l.ZF();
    this.Zf = paramZtdi;
    this.ZI = paramZmrj;
    this.Zw = paramZzi;
    this.Zo = paramZmiw;
    this.Zc = paramZbws;
    this.ZK = paramZor;
    this.ZF = paramMap;
    this.Zu = paramZgbj;
    this.ZY = paramZxgc;
    this.ZV = paramZgzy;
    this.Zj = paramZslu;
    this.ZC = paramZkl6;
    this.Zq = paramZgb6;
    this.Zm = paramZskh1;
    this.Za = paramZe8b;
    this.ZT = paramZtwv;
    this.Zh = paramZr_4;
    this.ZR = paramZbiv;
    this.ZZ = paramZgx0;
    this.ZL = paramZkl6.ZB();
    this.Z_ = paramZerg;
    this.Zb = paramZskh2;
    this.ZW = paramZerg.Zk();
    this.ZO = paramZmlq;
    this.Zn = paramZm6x;
    Objects.requireNonNull(paramZgb6);
    this.ZG = new Zgxf(paramZtdi, paramZor, paramZg_q, paramZtwv, paramZkl6, new Ze47(paramZkl6.ZM(), paramZgb6::ZcC));
    if (arrayOfInt != null)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  public boolean ZU(int paramInt, Ze3h paramZe3h, boolean paramBoolean) {
    try {
      Window window = Zt2m.ZF(this.ZK);
      switch (paramInt) {
        case 133408:
          return (new Ztr6(window, this.Zj, this.Za)).Zt(paramZe3h);
        case 133440:
          return (new Ztrz(this.Zj)).Zt(paramZe3h);
        case 136448:
          return (new Zgqg(window, this.ZR, paramBoolean)).Zm(paramZe3h);
        case 136704:
          return (new Ztz6(this.ZR, paramBoolean)).Ze(paramZe3h);
        case 136960:
          return (new Zxnz(this.ZR, paramBoolean)).ZU(paramZe3h);
        case 131584:
          return (new Zrq7(this.ZG, this.Z_.Zg())).ZX(paramZe3h);
        case 131328:
          return (new Ztbd(this.ZG, this.Z_.Zm())).ZR(paramZe3h);
        case 133120:
          return (new Ztxf(this.ZG, this.Z_.ZK())).ZU(paramZe3h);
        case 132992:
          return (new Zswm(this.ZG, this.Z_.Ze())).ZU(paramZe3h);
        case 133008:
          return (new Ze3v(this.ZG, this.Z_.ZM())).ZE(paramZe3h);
        case 132608:
          return (new Zxgf(this.ZG, this.Z_.ZH())).ZN(paramZe3h);
        case 132672:
          return (new Ze52(this.ZG, this.Z_.ZH())).Zv(paramZe3h);
        case 132736:
          return (new Zvor(this.Z_.ZH())).ZE(paramZe3h);
        case 134912:
          return (new Zldb(this.ZK, this.Z_.ZJ())).ZT(paramZe3h);
        case 135168:
          return (new Zz7d(false, this.ZG, this.ZK, this.Z_.ZJ(), this.Zh)).ZL(paramZe3h);
        case 135424:
          return (new Zz7d(true, this.ZG, this.ZK, this.Z_.ZJ(), this.Zh)).ZL(paramZe3h);
        case 135680:
          return (new Zt6p(window, this.ZO, this.ZI, this.Zn)).Zg(paramZe3h);
        case 135936:
          return (new Ze8w(this.ZG)).Zn(paramZe3h);
        case 524544:
          return (new Zxs3(this.ZG, this.Zo, this.Zc, 0)).Zi(paramZe3h);
        case 524545:
          return (new Zxs3(this.ZG, this.Zo, this.Zc, 1)).Zi(paramZe3h);
        case 524546:
          return (new Zxs3(this.ZG, this.Zo, this.Zc, 2)).Zi(paramZe3h);
        case 524547:
          return (new Zxs3(this.ZG, this.Zo, this.Zc, 3)).Zi(paramZe3h);
        case 524548:
          return (new Zxs3(this.ZG, this.Zo, this.Zc, 4)).Zi(paramZe3h);
        case 524549:
          return (new Zxs3(this.ZG, this.Zo, this.Zc, 5)).Zi(paramZe3h);
        case 524550:
          return (new Zxs3(this.ZG, this.Zo, this.Zc, 6)).Zi(paramZe3h);
        case 524551:
          return (new Zxs3(this.ZG, this.Zo, this.Zc, 7)).Zi(paramZe3h);
        case 524552:
          return (new Zxs3(this.ZG, this.Zo, this.Zc, 8)).Zi(paramZe3h);
        case 524553:
          return (new Zxs3(this.ZG, this.Zo, this.Zc, 9)).Zi(paramZe3h);
        case 525312:
          return (new Zm7z(this.ZG, this.ZK, this.ZF, false)).ZG(paramZe3h);
        case 525568:
          return (new Zm7z(this.ZG, this.ZK, this.ZF, true)).ZG(paramZe3h);
        case 525376:
          return (new Zmai(this.ZG, this.ZK, this.ZF)).Zi(paramZe3h);
        case 134656:
          return (new Ztp1(this.ZG, this.ZK, this.Zf)).ZC(paramZe3h);
        case 134400:
          return (new Ztfp(this.ZE.ZD())).ZZ(paramZe3h);
        case 134416:
          return (new Zltv(window, this.ZG, this.ZE.ZD(), this.Zm, this.ZL)).ZR(paramZe3h);
        case 134432:
          return (new Zg6a(this.ZG, this.Zf, this.ZE.ZD(), this.ZL, this.Zq)).Zl(paramZe3h);
        case 134784:
          return (new Zlbh(this.ZP, window, this.ZE.ZM(), this.Zb, this.ZL)).ZT(paramZe3h);
        case 525824:
          return (new Zir(window, this.ZZ)).Zx(paramZe3h);
        case 526080:
          return (new Zl_i(window, this.ZZ)).ZD(paramZe3h);
        case 526336:
          return (new Ztms(window, this.ZZ)).ZC(paramZe3h);
        case 526592:
          return (new Zez1(window, this.ZZ)).Za(paramZe3h);
        case 133376:
          return !paramZe3h.ZF() ? (new Zmap(window, this.ZZ)).Zz(paramZe3h) : true;
        case 526848:
          return (new Zr8y(window, this.Zf, this.ZI, this.ZY, this.ZV, this.ZC, this.ZZ)).ZC();
        case 133888:
          return !paramZe3h.ZF() ? (new Zefh(window, this.Zu)).Zq(paramZe3h) : true;
        case 133632:
          return !paramZe3h.ZF() ? (new Zsgn(window, this.Zu)).Zw(paramZe3h) : true;
        case 134144:
          return !paramZe3h.ZF() ? (new Zrw5(window, this.ZG, this.Zu)).ZH(paramZe3h) : true;
        case 527104:
          return (new Ze9g(window, this.Zu)).Zr(paramZe3h);
        case 530688:
          return (new Zs3s(this.ZW.ZFR())).Zq(paramZe3h);
        case 530944:
          Zm2.ZC(Zrrh.SCANNER_ISSUES_DELETE);
          return (new Zld_(window, this.ZG, this.Zf)).ZK(paramZe3h);
        case 530176:
          return (new Ztpw(this.Zw)).Zn(Zzpl.TABBED);
        case 530432:
          return (new Ztpw(this.Zw)).Zn(Zzpl.SIDE_BY_SIDE);
        case 527168:
          return (new Zevh(window, this.ZG, this.ZZ, this.Zf, this.ZI, this.ZT)).Zh();
      } 
      return false;
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      return true;
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm3z.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */