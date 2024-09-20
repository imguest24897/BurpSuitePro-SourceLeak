package burp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import net.portswigger.Zen;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zeay implements Zzwz {
  private final int ZA;
  
  private final Zbjl Zf;
  
  private final Ze3n ZH;
  
  private final Zbom ZF;
  
  private final Zey9 ZW;
  
  private static final Zgsh ZX = Zgsh.TE_CL;
  
  public Zeay(int paramInt, Zbjl paramZbjl, Ze3n paramZe3n, Zbom paramZbom, Zey9 paramZey9) {
    this.ZA = paramInt;
    this.Zf = paramZbjl;
    this.ZH = paramZe3n;
    this.ZF = paramZbom;
    this.ZW = paramZey9;
  }
  
  public Zewx Zt(Zlp9 paramZlp9) {
    return ZK(paramZlp9, ZL(paramZlp9));
  }
  
  public List<? extends Zewx> ZK() {
    Zuh.Zb(false, Zqf.ZC);
    return Collections.emptyList();
  }
  
  public Zewx ZK(Zlp9 paramZlp9, Zen paramZen) {
    Zzi5 zzi5 = this.Zf.ZB();
    return new Zews(paramZen, paramZlp9, new Zmhr(zzi5.ZU(paramZen), 80, false), (byte)0, Zewx.ZP, ZF(zzi5, this.ZH, paramZlp9, paramZen.toString(), this.ZW), zzi5, this.ZW);
  }
  
  public Zkfj ZZ(Zewx paramZewx) {
    return this::lambda$makeIssueBuilderFactory$2;
  }
  
  private Zen ZL(Zlp9 paramZlp9) {
    Ztt6 ztt6 = new Ztt6(this.ZA, this.ZH.ZM().Zgv(), paramZlp9, Zt7m.ZS);
    return this.Zf.ZK(1, ztt6.toString());
  }
  
  private static Zefx ZF(Zzi5 paramZzi5, Ze3n paramZe3n, Zlp9 paramZlp9, String paramString, Zey9 paramZey9) {
    Zk9m zk9m = ZI(paramZlp9);
    Zsv5 zsv5 = Zty9.Zb(zk9m, ZX).Ze(paramZey9);
    zsv5.Zk(paramZe3n.ZA(), paramZe3n.ZL());
    return zsv5.ZE(paramZzi5, paramString).Zo(paramZe3n.ZA());
  }
  
  private static Zk9m ZI(Zlp9 paramZlp9) {
    List<Zk9m> list = Arrays.<Zk9m>stream(Zk9m.values()).filter(paramZlp9::lambda$getPermutation$3).toList();
    Zuh.Zv((list.size() == 1), Zqf.Zk, list.size());
    return list.get(0);
  }
  
  private static boolean lambda$getPermutation$3(Zlp9 paramZlp9, Zk9m paramZk9m) {
    return (paramZk9m.Zx() == paramZlp9);
  }
  
  private Zsqx lambda$makeIssueBuilderFactory$2(Ze3n paramZe3n, Zxs7 paramZxs7, Zer0 paramZer0, Zbll paramZbll, List paramList) {
    Zuh.Zb(paramZbll.Zk instanceof Zews, Zqf.Zk);
    Zews zews = (Zews)paramZbll.Zk;
    this.ZF.Zgg().ZF7();
    Zk9m zk9m = ZI(zews.Zf);
    Zerr zerr = Zerr.Zw(Zroa.TRIGGERS_INTERACTION, new Zvow[] { this.ZH.Zt().ZC(zews.Zv()).ZK(Zex2.ZT(zews.Zv(), zk9m::lambda$makeIssueBuilderFactory$0)).Zu(zews.Zy()), this.ZH.Zt().ZC(zews.ZH()).ZK(Zex2.ZT(zews.ZH(), zk9m::lambda$makeIssueBuilderFactory$0)).Zu(zews.ZM()) });
    return Ztvl.ZC(this.ZH.Za(), this.ZH.ZN(), zk9m.Zh(), ZX.Zo(), zerr);
  }
  
  private static List lambda$makeIssueBuilderFactory$0(Zk9m paramZk9m, Zr6q paramZr6q) {
    return paramZk9m.Zw(Zyf.Zy(paramZr6q.ZD()), ZX);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeay.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */