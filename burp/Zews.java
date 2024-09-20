package burp;

import java.util.EnumSet;
import java.util.Optional;
import net.portswigger.Zen;

public class Zews extends Zewx {
  private final Zlp9 Zf;
  
  private final String Zb;
  
  private final Zefx Zw;
  
  private final Zzi5 ZS;
  
  private final Zey9 ZW;
  
  private Zefx Zq;
  
  private Zstu Zr;
  
  private Zefx Zg;
  
  private Zstu Zk;
  
  Zews(Zen paramZen, Zlp9 paramZlp9, Zmhr paramZmhr, byte paramByte, EnumSet<Zb25> paramEnumSet, Zefx paramZefx, Zzi5 paramZzi5, Zey9 paramZey9) {
    super(paramZen, paramZefx.ZD(), paramZlp9, paramZmhr, paramByte, paramEnumSet);
    this.Zf = paramZlp9;
    this.Zb = paramZen.toString();
    this.Zw = paramZefx;
    this.ZS = paramZzi5;
    this.ZW = paramZey9;
  }
  
  public Optional<Zlvf> Zs(Zmhe paramZmhe) {
    Zk9m zk9m = Zeay.ZI(this.Zf);
    Zsv5 zsv5 = Zty9.Zb(zk9m, Zeay.ZX).Ze(this.ZW);
    Zxgd zxgd1 = zsv5.ZI();
    Zzud zzud = paramZmhe.ZZ(Zlp5.Zc().Zd(true)).ZM();
    zsv5.Zk(zzud.Z_(), zzud.ZT());
    Zxgd zxgd2 = zsv5.ZE(this.ZS, this.Zb);
    Zlvf zlvf = paramZmhe.ZZ(Zlp5.Zc().Zw(zxgd2.Zz().ZN()).Zd(true));
    this.Zq = zlvf.ZM().ZL();
    this.Zr = zlvf.ZM().Zl();
    byte b = 0;
    Zbqc[] arrayOfZbqc = Zroa.Zp();
    while (b < 8) {
      Zzud zzud1 = paramZmhe.ZZ(Zlp5.Zc().Zw(zxgd1).Zd(false)).ZM();
      this.Zg = zzud1.ZL();
      this.Zk = zzud1.Zl();
      b++;
      if (arrayOfZbqc == null) {
        Zbqc.Zr(new Zbqc[2]);
        break;
      } 
    } 
    return Optional.of(zlvf);
  }
  
  public Zs2i Zu(Zxs7 paramZxs7) {
    return Zs2i.Zl(this.Zw);
  }
  
  Zefx Zv() {
    return this.Zg;
  }
  
  Zstu Zy() {
    return this.Zk;
  }
  
  Zefx ZH() {
    return this.Zq;
  }
  
  Zstu ZM() {
    return this.Zr;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zews.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */