package burp;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import net.portswigger.Zsy;

public class Zzsc implements Zlaz {
  private final Zsoh ZB;
  
  private final Ze3n ZI;
  
  private final Zbjl ZT;
  
  private final Zr_4 ZA;
  
  private final Zg75 Zg;
  
  private final Zkq4 Zh;
  
  private final Zsy Ze;
  
  private final Zkl6 Zu;
  
  private final Zesv ZC;
  
  private final Zz1i ZX;
  
  Zzsc(Zkq4 paramZkq4, Zsy paramZsy, Zsoh paramZsoh, Zkl6 paramZkl6, Ze3n paramZe3n, Zbjl paramZbjl, Zr_4 paramZr_4, Zesv paramZesv, Zg75 paramZg75, Zz1i paramZz1i) {
    this.ZB = paramZsoh;
    this.ZI = paramZe3n;
    this.ZT = paramZbjl;
    this.ZA = paramZr_4;
    this.Zg = paramZg75;
    this.Zh = paramZkq4;
    this.Ze = paramZsy;
    this.Zu = paramZkl6;
    this.ZC = paramZesv;
    this.ZX = paramZz1i;
  }
  
  public void Zf(Zrj paramZrj, Zlsy paramZlsy, Ztpx paramZtpx, Zz4_ paramZz4_) {
    int i = paramZrj.Zg();
    Zb9e zb9e = new Zb9e(this.ZI, this.Zu, i, this.ZT, this.Zh, this.Ze, this.ZX, this.Zu.ZH());
    List<Zp> list = (new Zrgx(this.Zh, this.ZC, this.Zu, i, this.ZI, zb9e, this.ZT, this.ZA, this.Ze, this.ZX)).ZL();
    List<Zer0> list1 = this.ZT.ZV(i, this.ZI);
    Function<Zx_5, Optional<Zxs7>> function = this::lambda$execute$0;
    Zmw0 zmw0 = new Zmw0(paramZz4_, this.Zg, function);
    boolean bool = Zg75.Zt();
    ZA(zmw0, list1, list);
    Zxeu zxeu = new Zxeu(paramZtpx, paramZz4_, this.ZI, this.ZB, this.ZT, this.ZA, this.Zg, this.Zu);
    (new Zgk3(this.Zh, this.ZI, zb9e, zxeu)).ZZ(list1);
    if (!bool)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  private void ZA(Zz4_ paramZz4_, List<Zer0> paramList, List<Zp> paramList1) {
    boolean bool = Zg75.Zt();
    for (Zmaj zmaj : (new Zsfq(paramList)).ZN()) {
      for (Zp zp : paramList1) {
        if (zp.ZD(zmaj))
          zp.ZF(zmaj); 
        if (!bool)
          break; 
      } 
      if (!bool)
        break; 
    } 
    for (Zp zp : paramList1) {
      zp.Zg(paramZz4_);
      if (!bool)
        break; 
    } 
  }
  
  private Optional lambda$execute$0(Zx_5 paramZx_5) {
    String str = paramZx_5.Zm();
    return (str != null) ? Optional.ofNullable(this.ZI.ZS().Zt(Zro0.Zgd(str))) : Optional.empty();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzsc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */