package burp;

import java.util.List;
import java.util.function.Predicate;

public class Zhd extends Zni implements Zsiv {
  @Zzvo(1)
  private final Zxlv<Zrp0> ZD;
  
  @Zzvo(2)
  private final Zzwo<Zrp0, Zboh> ZR;
  
  @Zzvo(3)
  private final Ztx ZQ;
  
  private final Zr_4 ZY;
  
  Zhd(Zxlv<Zrp0> paramZxlv, Zzwo<Zrp0, Zboh> paramZzwo, Ztx paramZtx, Zr_4 paramZr_4) {
    this.ZD = paramZxlv;
    this.ZR = paramZzwo;
    this.ZQ = paramZtx;
    this.ZY = paramZr_4;
  }
  
  public boolean ZL(Zrp0 paramZrp0, Zszw paramZszw) {
    return Zsgb.Zm(this.ZD, paramZrp0, paramZszw);
  }
  
  public Zlru ZH(Zrp0 paramZrp0) {
    return Zsgb.Zn(paramZrp0, this.ZR, this.ZQ);
  }
  
  public boolean ZZk() {
    return Zsgb.ZS(this.ZD);
  }
  
  public int ZZo() {
    return this.ZD.Zqw();
  }
  
  public void ZZR() {
    Zsgb.Zl(this.ZD, this.ZR);
  }
  
  public void Zx(Zs_g paramZs_g, Zr69 paramZr69, Zz1m<Zt35> paramZz1m) {
    Zsgb.ZR(paramZs_g, this.ZD, this.ZR, this.ZY, paramZr69, paramZz1m);
  }
  
  public void ZA(Zrp0 paramZrp0, Zszw paramZszw, boolean paramBoolean, Zz1m<Zt35> paramZz1m, Zmv7 paramZmv7) {
    Zsgb.ZI(paramZrp0, paramZszw, paramBoolean, this.ZD, this.ZR, paramZz1m, paramZmv7);
  }
  
  public void ZF(Zl_ paramZl_, Zz1m<Zt35> paramZz1m, Zmv7 paramZmv7) {
    Zsgb.Z_(paramZl_, this.ZD, paramZz1m, paramZmv7);
  }
  
  public List<Zrp0> ZS(Predicate<Zrp0> paramPredicate, Zz1m<Zt35> paramZz1m) {
    return Zsgb.Zh(paramPredicate, this.ZD, paramZz1m);
  }
  
  public String toString() {
    return Zsgb.Zt(this.ZD);
  }
  
  public Zeu4<? extends Zsiv> ZF() {
    return ZU;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zhd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */