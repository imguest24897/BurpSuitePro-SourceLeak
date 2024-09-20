package burp;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;
import net.portswigger.Zm2;

public class Zkoz {
  public static Zkek Zc = Zkoz::lambda$static$0;
  
  private static final Zz8q Zo = new Zz8q();
  
  private final Zkq4 Zf;
  
  private final Zmdu Zb;
  
  private final Zrgd Zx;
  
  private final Zskh Zk;
  
  public Zkoz(Zkq4 paramZkq4, Zmdu paramZmdu, Zrgd paramZrgd, Zskh paramZskh) {
    this.Zf = paramZkq4;
    this.Zb = paramZmdu;
    this.Zx = paramZrgd;
    this.Zk = paramZskh;
  }
  
  public Zgq<Zrdb> ZL(Ze3n paramZe3n, Zrcw paramZrcw, Zzwk paramZzwk, Zs4_ paramZs4_, Zkek paramZkek) {
    return ZJ(paramZe3n, paramZe3n.ZA().ZF(), paramZe3n.ZA(), paramZe3n.ZL(), paramZrcw, paramZzwk, paramZs4_, paramZkek);
  }
  
  public Zgq<Zrdb> Zx(Ze3n paramZe3n, Zrcw paramZrcw, Zs4_ paramZs4_) {
    return ZL(paramZe3n, paramZrcw, Zebv.ZD(new Zsub(this.Zf, this.Zb)), paramZs4_, Zc);
  }
  
  public Zgq<Zrdb> Zv(Ze3n paramZe3n, Zlit paramZlit, Zefx paramZefx, Zb6q paramZb6q, Zrcw paramZrcw, Zzwk paramZzwk, Zs4_ paramZs4_, Zkek paramZkek) {
    return ZJ(paramZe3n, paramZlit, paramZefx, paramZb6q, paramZrcw, paramZzwk, paramZs4_, paramZkek);
  }
  
  private Zgq<Zrdb> ZJ(Ze3n paramZe3n, Zlit paramZlit, Zefx paramZefx, Zb6q paramZb6q, Zrcw paramZrcw, Zzwk paramZzwk, Zs4_ paramZs4_, Zkek paramZkek) {
    Zxpd zxpd = new Zxpd(this.Zf, this.Zx, paramZe3n.Zs(), 600);
    Zlup zlup = new Zlup(Zld3.ZH, paramZzwk, zxpd);
    Zbi2 zbi2 = zlup.Zh(paramZrcw);
    boolean bool = Zz_q.ZB();
    Zgq<Zgpi> zgq = new Zgq<>();
    Instant instant = this.Zx.Zn();
    try {
      Zsdd zsdd = zbi2.Zq();
      while (zsdd != null) {
        List<Zgbi> list = zsdd.Zr();
        Zswz zswz = ((Zgbi)list.get(0)).ZX().<Zswz>ZO(Zxc6.TaintSource);
        Zsw6 zsw6 = ((Zgbi)list.get(list.size() - 1)).ZX().<Zsw6>ZO(Zxc6.TaintSink);
        try {
          if (Zo.ZI(zswz, zsw6, list))
            try {
              if (paramZkek.Zo(zsw6.Zn()))
                paramZs4_.Z_(paramZe3n, paramZlit, paramZe3n.ZoB(), paramZefx, paramZb6q, zswz, zsw6, zsdd, (Zgq)zgq); 
            } catch (Zxn6 zxn6) {
              throw a(null);
            }  
        } catch (Zxn6 zxn6) {
          throw a(null);
        } 
        zsdd = zbi2.Zq();
        if (bool)
          break; 
      } 
      Zm2.Zi(Zv8r.SCANNER_STATIC_ANALYSIS_COMPLETED_DURATION, Duration.between(instant, this.Zx.Zn()).toMillis());
    } catch (Zxn6 zxn6) {
      Zah.Zl(zxn6, Zk_.COMMON_RUNTIME_FAILURE);
      Zmgc.STATIC_CODE_ANALYSIS_TIMEOUT.Zh(this.Zk, new Object[] { Zkb.ZG(paramZefx.ZF().Zd4()) });
      Zm2.Zi(Zv8r.SCANNER_STATIC_ANALYSIS_TIMEOUT_DURATION, Duration.between(instant, this.Zx.Zn()).toMillis());
    } 
    return (Zgq)zgq;
  }
  
  private static boolean lambda$static$0(Zvs paramZvs) {
    return true;
  }
  
  private static Zxn6 a(Zxn6 paramZxn6) {
    return paramZxn6;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkoz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */