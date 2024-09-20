package burp;

import java.time.Duration;
import java.util.Optional;

class Zui extends Zu3 implements Zzep {
  private final Zr_4 Zl;
  
  private final Zkcl ZM;
  
  @Zzvo(16)
  private final Zl7h ZV;
  
  @Zzvo(17)
  private final Zz1i ZB;
  
  @Zzvo(18)
  private Zb4g ZT;
  
  @Zzvo(9)
  private volatile long Zu;
  
  @Zzvo(19)
  private long ZE;
  
  Zui(Zr_4 paramZr_4, int paramInt, Zkcl paramZkcl, String paramString1, String paramString2, String paramString3, Zl7h paramZl7h, Zz1i paramZz1i, Zb4g paramZb4g, Zl5o paramZl5o) {
    super(paramInt, paramString1, paramString2, paramString3, paramZl5o);
    this.Zl = paramZr_4;
    this.ZM = paramZkcl;
    this.ZV = paramZl7h;
    this.ZB = paramZz1i;
    this.ZT = paramZb4g;
  }
  
  public Zkcl ZNs() {
    return this.ZM;
  }
  
  public Zl7h ZnH() {
    return this.ZV;
  }
  
  public Zz1i Zdm() {
    return this.ZB;
  }
  
  public Zb4g Zd5() {
    if (this.ZT == null) {
      this.ZT = Zbit.Zw(this.Zl, ZPo());
      Zrpc.ZF(this.ZT);
    } 
    return this.ZT;
  }
  
  public Optional<Duration> ZPf() {
    return (this.Zu <= 0L) ? Optional.empty() : Optional.of(Duration.ofMillis(this.Zu));
  }
  
  public void Zr(Duration paramDuration) {
    this.Zu = (paramDuration == null) ? 0L : paramDuration.toMillis();
  }
  
  public Duration Zd2() {
    return Duration.ofMillis(this.ZE);
  }
  
  public void Zl(Duration paramDuration) {
    this.ZE = (paramDuration == null) ? 0L : paramDuration.toMillis();
  }
  
  public void ZV(Zx6t paramZx6t, Zrbm paramZrbm) {
    Zkr5.Zy(paramZx6t, this.ZV, this.ZB, ((Zxn8)paramZrbm).ZH());
  }
  
  public void ZHG() {}
  
  protected boolean ZP(Zm31 paramZm31, Zs7v paramZs7v) {
    return Zlua.Zd(paramZm31, paramZs7v, Zkph.ZO, 53344700);
  }
  
  @Zzvo(20)
  public int Zzn() {
    return this.ZM.ZU();
  }
  
  public Zeu4<? extends Zgna> ZF() {
    return (Zeu4)Zzep.Zs;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zui.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */