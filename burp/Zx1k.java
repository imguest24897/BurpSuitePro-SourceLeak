package burp;

import java.util.Objects;
import net.portswigger.Zkb;

public class Zx1k extends Zxsr implements Zzg0 {
  Zx1k(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public boolean Zll() {
    return this.Za.Zi(this, Zkzs.ZD);
  }
  
  public Zstu Zlf() {
    return this.Za.<Zstu>ZA(this, Zkzs.ZI);
  }
  
  public Zmzk Zl_() {
    Zmzk zmzk = this.Za.<Zmzk>ZJ(this, Zkzs.ZV);
    if (zmzk == null) {
      Zski zski = Zlc().<Zski>Zv(new Zg_x());
      if (zski != null)
        this.Za.Zq(this, Zkzs.ZV, zski.ZyR().Zdz()); 
    } 
    return zmzk;
  }
  
  public String Zlu() {
    String str = this.Za.Zf(this, Zkzs.ZX);
    if (str == null) {
      Zski zski = Zlc().<Zski>Zv(new Zg_x());
      if (zski != null)
        this.Za.Zi(this, Zkzs.ZX, Zkb.ZG(zski.ZyR().Zd4())); 
    } 
    return str;
  }
  
  public Zstu ZlY() {
    return this.Za.<Zstu>ZA(this, Zkzs.Zq);
  }
  
  public int Zlk() {
    return this.Za.Zx(this, Zkzs.ZA);
  }
  
  public int ZlQ() {
    return this.Za.Zx(this, Zkzs.ZN);
  }
  
  public Zrp0 Zlc() {
    return this.Za.<Zrp0>ZJ(this, Zkzs.ZM);
  }
  
  public Zszw ZlF() {
    return this.Za.<Zszw>ZJ(this, Zkzs.ZY);
  }
  
  public Zszw ZlC() {
    return Objects.<Zszw>requireNonNullElse(this.Za.<Zszw>ZJ(this, Zkzs.ZK), this.Za.<Zszw>ZH(Zszw.Zj()));
  }
  
  public Zrfx<Zszw> Zlt() {
    return Objects.<Zrfx<Zszw>>requireNonNullElse(this.Za.<Zrfx<Zszw>>ZJ(this, Zkzs.ZR), this.Za.<Zrfx<Zszw>>ZH(new Zl0w<>(Zszw.Zi, 0)));
  }
  
  public long ZlI() {
    return this.Za.ZL(this, Zkzs.Zh);
  }
  
  public Zlru Zl1() {
    return this.Za.<Zlru>ZJ(this, Zkzs.Zn);
  }
  
  public Zeu9 ZlA() {
    return this.Za.<Zeu9>ZJ(this, Zkzs.ZB);
  }
  
  public Zeu4<? extends Zzg0> ZF() {
    return Zm;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx1k.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */