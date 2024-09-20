package burp;

import java.util.List;
import java.util.function.Predicate;

public class Zx1d extends Zxsr implements Zsiv {
  Zx1d(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public boolean ZL(Zrp0 paramZrp0, Zszw paramZszw) {
    return Zsgb.Zm(Zk_(), paramZrp0, paramZszw);
  }
  
  public Zlru ZH(Zrp0 paramZrp0) {
    return Zsgb.Zn(paramZrp0, ZkD(), ZkP());
  }
  
  public boolean ZZk() {
    return Zsgb.ZS(Zk_());
  }
  
  public int ZZo() {
    return Zk_().Zqw();
  }
  
  public void ZZR() {
    Zsgb.Zl(Zk_(), ZkD());
  }
  
  public void Zx(Zs_g paramZs_g, Zr69 paramZr69, Zz1m<Zt35> paramZz1m) {
    Zsgb.ZR(paramZs_g, Zk_(), ZkD(), this.Za, paramZr69, paramZz1m);
  }
  
  public void ZA(Zrp0 paramZrp0, Zszw paramZszw, boolean paramBoolean, Zz1m<Zt35> paramZz1m, Zmv7 paramZmv7) {
    Zsgb.ZI(paramZrp0, paramZszw, paramBoolean, Zk_(), ZkD(), paramZz1m, paramZmv7);
  }
  
  public void ZF(Zl_ paramZl_, Zz1m<Zt35> paramZz1m, Zmv7 paramZmv7) {
    Zsgb.Z_(paramZl_, Zk_(), paramZz1m, paramZmv7);
  }
  
  public List<Zrp0> ZS(Predicate<Zrp0> paramPredicate, Zz1m<Zt35> paramZz1m) {
    return Zsgb.Zh(paramPredicate, Zk_(), paramZz1m);
  }
  
  public String toString() {
    return Zsgb.Zt(Zk_());
  }
  
  private Zxlv<Zrp0> Zk_() {
    return this.Za.<Zxlv<Zrp0>>ZJ(this, Zkz1.ZM);
  }
  
  private Ztx ZkP() {
    Ztx ztx = this.Za.<Ztx>ZJ(this, Zkz1.ZG);
    if (ztx == null) {
      ztx = this.Za.<Ztx>ZH(Ztx.Zd7());
      this.Za.Zq(this, Zkz1.ZG, ztx);
    } 
    return ztx;
  }
  
  private Zzwo<Zrp0, Zboh> ZkD() {
    Zzwo<Zrp0, Zboh> zzwo = this.Za.<Zzwo>ZJ(this, (Zekb)Zkz1.Za);
    if (zzwo == null) {
      zzwo = (Zzwo)this.Za.ZH(Zkz1.Zq);
      this.Za.Zq(this, Zkz1.Za, zzwo);
    } 
    return zzwo;
  }
  
  public Zeu4<? extends Zsiv> ZF() {
    return Zsiv.ZU;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx1d.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */