package burp;

import java.time.Duration;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

class Zg_g {
  private Timer Zw;
  
  private TimerTask Zn;
  
  final Zzo_ ZC;
  
  private Zg_g(Zzo_ paramZzo_) {}
  
  private void Zs(Duration paramDuration) {
    ZZ();
    ZH(paramDuration);
  }
  
  private void ZZ() {
    if (this.Zn != null) {
      this.Zn.cancel();
      this.Zw.cancel();
      this.Zn = null;
      this.Zw = null;
    } 
  }
  
  private void ZH(Duration paramDuration) {
    if (this.ZC.Z_ == Zzlv.STOPPED)
      return; 
    ZR();
    this.Zw = new Timer();
    this.Zn = new Zk93(this);
    this.Zw.schedule(this.Zn, paramDuration.toMillis());
  }
  
  private void ZR() {
    ZM(1L);
  }
  
  private void Zi() {
    ZM(10L);
  }
  
  private void ZM(long paramLong) {
    if (this.ZC.Zp != null && !this.ZC.Zp.isCancelled())
      this.ZC.Zp.cancel(false); 
    if (this.ZC.Z_ == Zzlv.STOPPED)
      return; 
    this.ZC.Zp = this.ZC.Zk.scheduleWithFixedDelay(this.ZC, 0L, paramLong, TimeUnit.MINUTES);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg_g.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */