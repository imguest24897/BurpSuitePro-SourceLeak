package burp;

import java.util.concurrent.atomic.AtomicReference;

class Zu2 extends Zu3 implements Zzys {
  private final AtomicReference<Zmz1> Ze;
  
  private final AtomicReference<Zz1y> Zg;
  
  private int Zo;
  
  Zu2(int paramInt, String paramString1, String paramString2, String paramString3, Zl5o paramZl5o, Zmz1 paramZmz1, Zz1y paramZz1y) {
    super(paramInt, paramString1, paramString2, paramString3, paramZl5o);
    this.Ze = new AtomicReference<>(paramZmz1);
    this.Zg = new AtomicReference<>(paramZz1y);
    this.Zo = paramInt;
  }
  
  public void ZHG() {}
  
  protected boolean ZP(Zm31 paramZm31, Zs7v paramZs7v) {
    return Zlua.Zd(paramZm31, paramZs7v, Zkpv.ZJ, 951248736);
  }
  
  public boolean equals(Object paramObject) {
    return Zzqv.ZR(this, paramObject);
  }
  
  @Zzvo(30)
  public Zmz1 ZNH() {
    return this.Ze.get();
  }
  
  @Zzvo(31)
  public Zz1y ZNJ() {
    return this.Zg.get();
  }
  
  @Zzvo(32)
  public int ZNT() {
    return this.Zo;
  }
  
  public void ZqG(int paramInt) {
    this.Zo = paramInt;
  }
  
  public void Zzv(int paramInt) {
    this.Zo = ZPo();
    super.Zzv(paramInt);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zu2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */