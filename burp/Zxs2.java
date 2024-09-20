package burp;

import java.awt.Component;
import java.util.Set;

class Zxs2 implements Zgmk {
  private static final Set<Integer> Zx = Zb99.Zn(new Integer[] { Integer.valueOf(136704), Integer.valueOf(136960), Integer.valueOf(134784) });
  
  private final Zxgg Zp;
  
  private final Zerg ZP;
  
  private final Zlfj ZU;
  
  private final Zgli Zu;
  
  private final boolean Zk;
  
  private final Zr_4 ZB;
  
  Zxs2(Zz0n paramZz0n, Zt4u paramZt4u, Zerg paramZerg, Zeew paramZeew, Zbnt paramZbnt, Component paramComponent, Zbiv paramZbiv, Ztdq paramZtdq, Zskh paramZskh, Zgbj paramZgbj, Ztwv paramZtwv, Zlfj paramZlfj, Zgli paramZgli, boolean paramBoolean, Zey9 paramZey9, Zr_4 paramZr_4, Zb9b paramZb9b) {
    this.ZP = paramZerg;
    this.ZU = paramZlfj;
    this.Zu = paramZgli;
    this.Zk = paramBoolean;
    this.ZB = paramZr_4;
    this.Zp = new Zxgg(paramZz0n, paramZt4u, paramZerg, paramZeew::lambda$new$0, paramZbnt, paramComponent, paramZbiv, paramZtdq, paramZskh, paramZgbj, paramZtwv, paramZlfj, paramBoolean, paramZey9, paramZb9b);
  }
  
  public Zzzd ZM(boolean paramBoolean, Zgu3 paramZgu3, Zge7 paramZge7, Zmgv paramZmgv, Zgsq paramZgsq, Ztbl paramZtbl, int paramInt, Object paramObject, Zmd9 paramZmd9) {
    if (paramZgu3 == Zgu3.WS_MESSAGE) {
      if (Zx.contains(Integer.valueOf(paramInt)))
        return new Zzzd(paramBoolean, false); 
      if (paramInt == 131328) {
        if (this.Zk) {
          Zyf zyf = Zyf.Zy(this.ZU.Zr());
          this.ZP.Zm().Zv(new Zkmj(this.Zu.Zs(), this.Zu.Zv(), this.Zu.Zu(), ZX(zyf, this.ZB), this.Zu.Zt()), paramZmd9.Zv());
          return new Zzzd(paramBoolean, true);
        } 
        return new Zzzd(paramBoolean, false);
      } 
    } 
    return this.Zp.ZM(paramBoolean, paramZgu3, paramZge7, paramZmgv, paramZgsq, paramZtbl, paramInt, paramObject, paramZmd9);
  }
  
  private Zstu ZX(Zstu paramZstu, Zr_4 paramZr_4) {
    return (paramZstu == null) ? null : paramZstu.Zp(paramZr_4);
  }
  
  private static Zeew lambda$new$0(Zeew paramZeew) {
    return paramZeew;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxs2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */