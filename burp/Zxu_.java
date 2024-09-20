package burp;

import java.util.Collection;
import java.util.Map;
import net.portswigger.browser.Zjq;

public abstract class Zxu_ extends Zxsr implements Zl_ {
  private static Zbqc[] ZG;
  
  protected Zxu_(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public Zm6i Zr(Iterable<Zm6i> paramIterable) {
    return Zmlk.Zi(paramIterable, Znq().ZHN(), Zf2().ZaG());
  }
  
  public Zt8i Z_(Zeu9 paramZeu9, Zszw paramZszw1, Zszw paramZszw2, Zlru paramZlru, Zzxz paramZzxz, Zt1i paramZt1i, Ztk0 paramZtk0, Zr_4 paramZr_4, Zz1m<Zt35> paramZz1m, Zl7h paramZl7h, Zr69 paramZr69, Zjq paramZjq) {
    Zbqc[] arrayOfZbqc = ZWu();
    if (Zbqc.Zwu() == null)
      ZF(new Zbqc[1]); 
    return Zzo7.ZI(paramZeu9, paramZszw1, paramZszw2, paramZlru, paramZzxz, ZfD(), this, paramZt1i, paramZtk0, paramZr_4, paramZz1m, paramZl7h, paramZr69, paramZjq);
  }
  
  public Zzwo<Zszw, Zx0c> ZfD() {
    return this.Za.<Zzwo<Zszw, Zx0c>>ZJ(this, Zkzg.Zi);
  }
  
  public Map<Zszw, Collection<Zt8i>> Znr() {
    return Zzo7.Zg(ZfD());
  }
  
  public Collection<Zt8i> Zng() {
    return Zzo7.Zl(ZfD());
  }
  
  public boolean Zny() {
    return Zzo7.Zn(ZfD());
  }
  
  public void Zj(Zszw paramZszw, Zt8i paramZt8i) {
    Zzo7.ZY(paramZszw, paramZt8i, ZfD());
  }
  
  public Zzwo<Zszw, Zg8m> Zfd() {
    Zzwo<Zszw, Zg8m> zzwo = this.Za.<Zzwo>ZJ(this, (Zekb)Zkzg.Zl);
    if (zzwo == null) {
      zzwo = (Zzwo)this.Za.ZH(Zkzg.Zu);
      this.Za.Zq(this, Zkzg.Zl, zzwo);
    } 
    return zzwo;
  }
  
  public void Zr(Zg8m paramZg8m) {
    ((Zzwo<Zszw, Zg8m>)this.Za.<Zzwo<Zszw, Zg8m>>ZJ(this, Zkzg.Zl)).Zu(paramZg8m.Z_x(), paramZg8m);
  }
  
  public Zeu9 Znq() {
    return this.Za.<Zeu9>ZJ(this, Zkzg.ZU);
  }
  
  public Zxw8 Zf2() {
    return this.Za.<Zxw8>ZJ(this, Zkzg.ZB);
  }
  
  public static void ZF(Zbqc[] paramArrayOfZbqc) {
    ZG = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZWu() {
    return ZG;
  }
  
  static {
    if (ZWu() == null)
      ZF(new Zbqc[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxu_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */