package burp;

import java.util.Collection;
import java.util.Map;
import net.portswigger.browser.Zjq;

public abstract class Zjl extends Zni implements Zl_ {
  @Zzvo(1)
  private final Zxw8 ZQ;
  
  @Zzvo(2)
  private final Zeu9 Z_;
  
  @Zzvo(5)
  protected final Zzwo<Zszw, Zx0c> Zd;
  
  @Zzvo(11)
  private final Zzwo<Zszw, Zg8m> ZF;
  
  protected Zjl(Zxw8 paramZxw8, Zeu9 paramZeu9, Zzwo<Zszw, Zx0c> paramZzwo, Zzwo<Zszw, Zg8m> paramZzwo1) {
    this.ZQ = paramZxw8;
    this.Z_ = paramZeu9;
    this.Zd = paramZzwo;
    this.ZF = paramZzwo1;
  }
  
  public Zm6i Zr(Iterable<Zm6i> paramIterable) {
    return Zmlk.Zi(paramIterable, this.Z_.ZHN(), this.ZQ.ZaG());
  }
  
  public Zt8i Z_(Zeu9 paramZeu9, Zszw paramZszw1, Zszw paramZszw2, Zlru paramZlru, Zzxz paramZzxz, Zt1i paramZt1i, Ztk0 paramZtk0, Zr_4 paramZr_4, Zz1m<Zt35> paramZz1m, Zl7h paramZl7h, Zr69 paramZr69, Zjq paramZjq) {
    return Zzo7.ZI(paramZeu9, paramZszw1, paramZszw2, paramZlru, paramZzxz, this.Zd, this, paramZt1i, paramZtk0, paramZr_4, paramZz1m, paramZl7h, paramZr69, paramZjq);
  }
  
  public Collection<Zt8i> Zng() {
    return Zzo7.Zl(this.Zd);
  }
  
  public boolean Zny() {
    return Zzo7.Zn(this.Zd);
  }
  
  public Zzwo<Zszw, Zx0c> ZfD() {
    return this.Zd;
  }
  
  public Map<Zszw, Collection<Zt8i>> Znr() {
    return Zzo7.Zg(this.Zd);
  }
  
  public void Zj(Zszw paramZszw, Zt8i paramZt8i) {
    Zzo7.ZY(paramZszw, paramZt8i, this.Zd);
  }
  
  public Zzwo<Zszw, Zg8m> Zfd() {
    return this.ZF;
  }
  
  public void Zr(Zg8m paramZg8m) {
    this.ZF.Zu(paramZg8m.Z_x(), paramZg8m);
  }
  
  public Zeu9 Znq() {
    return this.Z_;
  }
  
  public Zxw8 Zf2() {
    return this.ZQ;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zjl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */