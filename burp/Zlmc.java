package burp;

import java.awt.AWTEvent;
import java.awt.event.ActionEvent;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import javax.swing.Timer;

public class Zlmc {
  private static final Duration ZV = Duration.ofMinutes(5L);
  
  private final ScheduledExecutorService ZS = Executors.newSingleThreadScheduledExecutor();
  
  private final Zbp9 ZQ;
  
  private int Zp;
  
  private Zeg Zq;
  
  private Timer Zg;
  
  private Instant ZU;
  
  public Zlmc(Zbp9 paramZbp9) {
    this.ZQ = paramZbp9;
    this.ZU = Instant.EPOCH;
  }
  
  boolean Zr(AWTEvent paramAWTEvent, long paramLong) {
    this.Zp++;
    if (this.Zq != null)
      this.Zq.Zx(); 
    if (this.Zg != null) {
      this.Zg.stop();
      this.Zg = null;
    } 
    this.Zq = new Zeg(this, paramAWTEvent, paramLong);
    return true;
  }
  
  void ZB() {
    this.Zp--;
    this.Zq.Zx();
    String str = Zbk_.Zb();
    if (this.Zg != null) {
      this.Zg.stop();
      this.Zg = null;
    } 
    if (this.Zp > 0) {
      this.Zq = new Zeg(this, null, System.currentTimeMillis());
      this.Zg = new Timer(950, Zlmc::lambda$EDTEventFinished$0);
      this.Zg.setRepeats(false);
      this.Zg.start();
      if (str == null) {
        this.Zq = null;
        return;
      } 
      return;
    } 
    this.Zq = null;
  }
  
  private static String ZJ(StackTraceElement[] paramArrayOfStackTraceElement) {
    StringWriter stringWriter = new StringWriter();
    PrintWriter printWriter = new PrintWriter(stringWriter);
    try {
      (new Zzwt(paramArrayOfStackTraceElement)).printStackTrace(printWriter);
      printWriter.close();
    } catch (Throwable throwable) {
      try {
        printWriter.close();
      } catch (Throwable throwable1) {
        throwable.addSuppressed(throwable1);
      } 
      throw throwable;
    } 
    return stringWriter.toString();
  }
  
  private static void lambda$EDTEventFinished$0(ActionEvent paramActionEvent) {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlmc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */