package burp;

import java.time.Duration;
import javax.net.ssl.SSLSession;

public class Zzhi {
  private final Ztpx ZQ;
  
  private final Zbza ZL;
  
  private final Zmzk Zg;
  
  private final byte[] ZO;
  
  private boolean Zq = false;
  
  private Duration Zj = null;
  
  private Duration Zf = null;
  
  private byte[] Zb = Zsoh.ZG;
  
  private Zxgd Z_ = Zxgd.ZZ();
  
  private Zlig Zz = Zzhi::lambda$new$0;
  
  private Zzhi(Ztpx paramZtpx, Zbza paramZbza, Zmzk paramZmzk, byte[] paramArrayOfbyte) {
    this.ZQ = paramZtpx;
    this.ZL = paramZbza;
    this.Zg = paramZmzk;
    this.ZO = paramArrayOfbyte;
  }
  
  public Zzhi Zx(Zxgd paramZxgd) {
    this.Z_ = paramZxgd;
    return this;
  }
  
  public Zzhi Zz(boolean paramBoolean) {
    this.Zq = paramBoolean;
    return this;
  }
  
  public Zzhi Zj(Duration paramDuration) {
    this.Zj = paramDuration;
    return this;
  }
  
  public Zzhi Zf(Duration paramDuration) {
    this.Zf = paramDuration;
    return this;
  }
  
  public Zzhi ZU(byte[] paramArrayOfbyte) {
    this.Zb = paramArrayOfbyte;
    return this;
  }
  
  public Zzhi Ze(Zlig paramZlig) {
    this.Zz = paramZlig;
    return this;
  }
  
  public Ztao ZA() {
    return new Ztao(this);
  }
  
  private static void lambda$new$0(SSLSession paramSSLSession) {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzhi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */