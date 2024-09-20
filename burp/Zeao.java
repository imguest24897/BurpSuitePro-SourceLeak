package burp;

import java.time.Duration;
import java.time.Instant;
import java.util.Collections;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zeao {
  static final Duration Zz = Duration.ofMinutes(1L);
  
  private final Ztz_ Zu;
  
  private final Zrgd ZK;
  
  private final Zskh Zx;
  
  private final Zxpt Zd;
  
  private Zghp Zg;
  
  private Instant Zs;
  
  private int ZM;
  
  private boolean Ze;
  
  private Instant Zm;
  
  public Zeao(Ztz_ paramZtz_, Zrgd paramZrgd, Zskh paramZskh, Zxpt paramZxpt) {
    this.Zu = paramZtz_;
    this.ZK = paramZrgd;
    this.Zx = paramZskh;
    this.Zd = paramZxpt;
    this.Zg = Zghp.NOT_INITIALIZED;
    this.Zs = Instant.EPOCH;
    this.ZM = 0;
    this.Ze = false;
    this.Zm = Instant.EPOCH;
  }
  
  Instant ZI() {
    return this.Zs;
  }
  
  public List<Zer0> ZX(Zes1 paramZes1) {
    synchronized (this) {
      if (this.Zg == Zghp.NOT_INITIALIZED)
        Zm(this.Zu, this.Zd, paramZes1); 
      try {
        if (this.Zg == Zghp.DISABLED) {
          if (!ZA())
            return Collections.emptyList(); 
          this.Zg = Zghp.RETRYING;
        } 
      } catch (Zxro zxro) {
        throw a(null);
      } 
    } 
    try {
      List<Zer0> list = this.Zu.ZY(paramZes1);
      try {
        if (this.Zd.Zz() == Zx5o.FAILED)
          Zmgc.COLLABORATOR_OUT_OF_DATE.ZK(this.Zx, new Object[0]); 
      } catch (Zxro zxro) {
        throw a(null);
      } 
      this.Zs = this.ZK.Zn();
      ZB();
      return list;
    } catch (Zxro|Zxg5|Zxgy|java.net.UnknownHostException zxro) {
      Zah.Zl(zxro, Zk_.COMMON_RUNTIME_FAILURE);
      Zs(paramZes1);
      return Collections.emptyList();
    } 
  }
  
  private void Zm(Ztz_ paramZtz_, Zxpt paramZxpt, Zes1 paramZes1) {
    try {
      paramZtz_.Zl(paramZes1);
      this.Zg = Zghp.ENABLED;
      if (paramZxpt.Zz() == Zx5o.FAILED)
        Zmgc.COLLABORATOR_OUT_OF_DATE.ZK(this.Zx, new Object[0]); 
    } catch (Zxro|Zxg5|Zxgy|java.net.UnknownHostException zxro) {
      Zah.Zl(zxro, Zk_.COMMON_RUNTIME_FAILURE);
      ZW(paramZes1);
    } 
  }
  
  private void ZW(Zes1 paramZes1) {
    this.ZM = 5;
    this.Zg = Zghp.DISABLED;
    this.Zm = this.ZK.Zn();
    if (!this.Ze) {
      Zmgc.COLLABORATOR_CONNECTION_FAILED.ZV(this.Zx, new Object[] { paramZes1.Zx });
      this.Ze = true;
    } 
  }
  
  private boolean ZA() {
    return !this.ZK.Zn().isBefore(this.Zm.plus(Zz));
  }
  
  private synchronized void Zs(Zes1 paramZes1) {
    this.ZM++;
    if (this.ZM >= 5)
      ZW(paramZes1); 
  }
  
  private synchronized void ZB() {
    this.ZM = 0;
    this.Zg = Zghp.ENABLED;
    if (this.Ze) {
      Zmgc.COLLABORATOR_CONNECTION_SUCCESS.ZK(this.Zx, new Object[0]);
      this.Ze = false;
    } 
  }
  
  private static Zxro a(Zxro paramZxro) {
    return paramZxro;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeao.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */