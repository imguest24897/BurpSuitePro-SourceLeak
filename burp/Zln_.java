package burp;

import java.util.Objects;
import java.util.function.Supplier;

public class Zln_ {
  private final Zr_4 ZY;
  
  private final Zz_r ZT;
  
  private final Zgb6 ZK;
  
  private final Zbnt ZS;
  
  private final Zgmh Zk;
  
  private final Ztwv ZB;
  
  private final Zkn ZM;
  
  private final Zzaf ZV;
  
  private final Zkvh ZI;
  
  private final Supplier<Zskh> Zx;
  
  private final Zz0n ZJ;
  
  private final Ze47 Zq;
  
  private final Zs5l ZO;
  
  private final Zbj4 ZF;
  
  private final Zmer Zm;
  
  private final Zey9 Zu;
  
  private final Zrxb Ze;
  
  private final Zenk ZW;
  
  public Zln_(Zr_4 paramZr_4, Zz_r paramZz_r, Zgb6 paramZgb6, Zbnt paramZbnt, Zgmh paramZgmh, Ztwv paramZtwv, Zkn paramZkn, Zzaf paramZzaf, Zkvh paramZkvh, Supplier<Zskh> paramSupplier, Zz0n paramZz0n, Ze47 paramZe47, Zs5l paramZs5l, Zbj4 paramZbj4, Zmer paramZmer, Zey9 paramZey9, Zrxb paramZrxb) {
    this.ZY = paramZr_4;
    this.ZT = paramZz_r;
    this.ZK = paramZgb6;
    this.ZS = paramZbnt;
    this.Zk = paramZgmh;
    this.ZB = paramZtwv;
    this.ZM = paramZkn;
    this.ZV = paramZzaf;
    this.ZI = paramZkvh;
    this.Zx = paramSupplier;
    this.ZJ = paramZz0n;
    this.Zq = paramZe47;
    this.ZO = paramZs5l;
    this.ZF = paramZbj4;
    this.Zm = paramZmer;
    this.Zu = paramZey9;
    this.Ze = paramZrxb;
    Objects.requireNonNull(paramZrxb);
    this.ZW = new Zlvg(paramZrxb::ZHY);
  }
  
  public Ztpl Zx(String paramString) {
    return ZJ(this.ZY.<Zs0m>ZH(new Zkic(paramString, this.ZI.ZYt())), true);
  }
  
  public Ztpl ZI(Zs0m paramZs0m) {
    return ZJ(paramZs0m, false);
  }
  
  public Ztpl ZP(Ztpl paramZtpl, String paramString) {
    Zs0m zs0m = this.ZY.<Zs0m>ZH(new Zkic(paramString, this.ZY.<Zeix>ZH(new Zm6l(paramZtpl.Zf().Zqs())), paramZtpl.Zf().Zgn()));
    Ztpl ztpl = ZJ(zs0m, false);
    Zmzk zmzk = paramZtpl.Zl();
    ztpl.Zt(zmzk, Zbr.ZF(paramZtpl.ZX(), Zw(paramZtpl.ZB())));
    ztpl.Ze(paramZtpl.Zf().ZAs());
    return ztpl;
  }
  
  private Ztpl ZJ(Zs0m paramZs0m, boolean paramBoolean) {
    Zr(paramZs0m);
    Objects.requireNonNull(paramZs0m);
    Zmjz zmjz = new Zmjz(paramZs0m::Zgn, this.ZI, paramZs0m.Zqs(), this.ZW);
    Zbqc[] arrayOfZbqc = Ztpl.ZC();
    Ztpl ztpl = new Ztpl(paramZs0m, this.ZT, this.ZK, this.ZS, this.Zk, this.ZB, this.ZY, this.ZM, this.ZV, this.ZJ, this.Zx, new Zsn8(this.Zq), paramBoolean, this.ZO, this.ZF, this.Zm, zmjz, this.Zu, this.Ze);
    if (paramZs0m.ZGS() == -1 || paramZs0m.Zqd().isEmpty()) {
      ztpl.Zt(paramZs0m.ZqZ(), paramZs0m.Zq9());
      if (arrayOfZbqc == null) {
        ztpl.ZO();
        return ztpl;
      } 
      return ztpl;
    } 
    ztpl.ZO();
    return ztpl;
  }
  
  private void Zr(Zs0m paramZs0m) {
    if (paramZs0m.Zqs() == null)
      paramZs0m.ZH(this.ZI.ZYt()); 
  }
  
  private static Zkyt Zw(Zgsq paramZgsq) {
    switch (Zshg.Zb[paramZgsq.ordinal()]) {
      case 1:
      
      case 2:
      
    } 
    return Zkyt.AUTO;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zln_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */