package burp;

import java.time.Duration;
import java.util.Optional;
import net.portswigger.Zgl;
import net.portswigger.Zm2;

public class Zruu {
  private final Zrgd Zi;
  
  private final Ztwv Zw;
  
  private final Zgb6 ZK;
  
  private final Zgzy Zt;
  
  private final Zkl6 Zl;
  
  private final Zr_4 Za;
  
  private final Zlaa Zf;
  
  private final Ztks Ze;
  
  private final Zlcb Zj;
  
  private final Zz3j Zs;
  
  public Zruu(Zrgd paramZrgd, Ztwv paramZtwv, Zgb6 paramZgb6, Zgzy paramZgzy, Zkl6 paramZkl6, Zr_4 paramZr_4, Ztks paramZtks, Zlaa paramZlaa, Zlcb paramZlcb, Zz3j paramZz3j) {
    this.Zi = paramZrgd;
    this.Zw = paramZtwv;
    this.ZK = paramZgb6;
    this.Zt = paramZgzy;
    this.Zl = paramZkl6;
    this.Za = paramZr_4;
    this.Zf = paramZlaa;
    this.Ze = paramZtks;
    this.Zj = paramZlcb;
    this.Zs = paramZz3j;
  }
  
  public Zezo ZO(Zlog paramZlog, Zr69 paramZr69, Zlz4 paramZlz4, Zkcl paramZkcl, Ztos<Zt13> paramZtos, Ztos<Zt18> paramZtos1, Zskh paramZskh, Ztdi paramZtdi, Zzs1 paramZzs1, Zkf3 paramZkf3) {
    Zgg0 zgg0 = this.Zj.Za(Zeew.SCANNER, paramZlog.ZPo());
    Ztos<Zt3y> ztos = new Ztos<>(Zt35.ZP());
    Zs32 zs32 = new Zs32(this.Zf, this.ZK, this.Zt, this.Zl.ZB(), this.Zl.ZH(), this.Zi, paramZskh, paramZr69, zgg0, new Ztos<>(Zt16.Zs()), this.Zs);
    (new Zlxq(this.Ze, paramZlog.ZPo())).ZA(paramZtos, paramZtos1);
    (new Zg91(paramZkcl, paramZskh, paramZr69.ZD())).Zg(paramZtos1);
    Zeiy zeiy = Zeiy.Zs(paramZlog.ZnH(), paramZr69, this.Za, this.Zl, paramZtos1, (Ztos)ztos);
    Optional<Duration> optional = paramZr69.ZG();
    Zbqc[] arrayOfZbqc = Zt1g.ZY();
    optional.ifPresent(paramZlog::lambda$build$0);
    if (arrayOfZbqc != null)
      Zbqc.Zr(new Zbqc[4]); 
    return new Zezo(this.Zl, this.Zi, paramZtdi, this.Za, paramZkf3, this.Zw.Ze(), paramZskh, paramZtos, paramZlog, paramZtos1, (Ztos)ztos, paramZr69, paramZlz4, zeiy, new Zt9j(paramZlog, paramZr69, this.Zl, zs32, paramZtos1, this.Za, paramZskh, paramZtdi, this.Ze, paramZzs1, this.ZK, paramZtos));
  }
  
  private static void lambda$build$0(Zlog paramZlog, Duration paramDuration) {
    Zm2.Ze(new Zgl(paramZlog.ZPy()), Zv8r.CRAWL_MAX_TIME_MINS, paramDuration.toMinutes());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zruu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */