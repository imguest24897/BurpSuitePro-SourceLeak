package burp;

import java.time.Duration;
import java.util.TimerTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zzo_ extends TimerTask implements Ztsg, Ztu3 {
  private static final Duration Zq = Duration.ofSeconds(30L);
  
  private final Zrgd ZV;
  
  private final Zbj1 ZL;
  
  private final Zeao Zr;
  
  private final Zgb6 ZQ;
  
  private final ScheduledExecutorService Zk;
  
  private final Zg_g ZH;
  
  private boolean Zo;
  
  private Zzlv Z_;
  
  private ScheduledFuture<?> Zp;
  
  public Zzo_(Zrgd paramZrgd, Zbj1 paramZbj1, Zeao paramZeao, Zgb6 paramZgb6, ScheduledExecutorService paramScheduledExecutorService) {
    this.ZV = paramZrgd;
    this.ZL = paramZbj1;
    this.Zr = paramZeao;
    this.ZQ = paramZgb6;
    this.Zk = paramScheduledExecutorService;
    this.Z_ = Zzlv.DISABLED;
    this.ZH = new Zg_g(this);
    paramZgb6.Z_(this);
  }
  
  public void run() {
    if (this.Z_ == Zzlv.STOPPED)
      Zuh.Zb(false, Zqf.Zr); 
    if (Zk())
      this.ZL.Zn(this.Zr.ZX(this.ZQ.ZU0())); 
  }
  
  private boolean Zk() {
    return this.Zr.ZI().isBefore(this.ZV.Zn().minus(Zq));
  }
  
  public synchronized void ZC() {
    // Byte code:
    //   0: invokestatic ZT : ()I
    //   3: istore_1
    //   4: aload_0
    //   5: invokevirtual Zo : ()Z
    //   8: ifeq -> 45
    //   11: aload_0
    //   12: getfield Zp : Ljava/util/concurrent/ScheduledFuture;
    //   15: invokeinterface isCancelled : ()Z
    //   20: ifne -> 34
    //   23: aload_0
    //   24: getfield Zp : Ljava/util/concurrent/ScheduledFuture;
    //   27: iconst_0
    //   28: invokeinterface cancel : (Z)Z
    //   33: pop
    //   34: aload_0
    //   35: getstatic burp/Zzlv.DISABLED : Lburp/Zzlv;
    //   38: putfield Z_ : Lburp/Zzlv;
    //   41: iload_1
    //   42: ifne -> 110
    //   45: aload_0
    //   46: invokevirtual Zs : ()Z
    //   49: ifeq -> 110
    //   52: aload_0
    //   53: getfield Zp : Ljava/util/concurrent/ScheduledFuture;
    //   56: ifnull -> 82
    //   59: aload_0
    //   60: getfield Zp : Ljava/util/concurrent/ScheduledFuture;
    //   63: invokeinterface isCancelled : ()Z
    //   68: ifne -> 82
    //   71: aload_0
    //   72: getfield Zp : Ljava/util/concurrent/ScheduledFuture;
    //   75: iconst_0
    //   76: invokeinterface cancel : (Z)Z
    //   81: pop
    //   82: aload_0
    //   83: aload_0
    //   84: getfield Zk : Ljava/util/concurrent/ScheduledExecutorService;
    //   87: aload_0
    //   88: lconst_0
    //   89: ldc2_w 10
    //   92: getstatic java/util/concurrent/TimeUnit.MINUTES : Ljava/util/concurrent/TimeUnit;
    //   95: invokeinterface scheduleWithFixedDelay : (Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    //   100: putfield Zp : Ljava/util/concurrent/ScheduledFuture;
    //   103: aload_0
    //   104: getstatic burp/Zzlv.ENABLED : Lburp/Zzlv;
    //   107: putfield Z_ : Lburp/Zzlv;
    //   110: return
  }
  
  public synchronized void ZN(Duration paramDuration) {
    if (this.Z_ != Zzlv.ENABLED)
      return; 
    this.ZH.Zs(paramDuration);
  }
  
  private boolean Zo() {
    return (this.Z_ == Zzlv.ENABLED && !(this.ZQ.ZU0()).ZT);
  }
  
  private boolean Zs() {
    return (this.Z_ == Zzlv.DISABLED && (this.ZQ.ZU0()).ZT && this.Zo);
  }
  
  public void ZJ() {
    this.Zo = true;
  }
  
  public synchronized void ZY() {
    this.ZH.ZZ();
    if (this.Zp != null)
      this.Zp.cancel(true); 
    this.Z_ = Zzlv.STOPPED;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzo_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */