package burp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.Timer;
import org.jetbrains.annotations.TestOnly;

public class Zrb9 implements ActionListener {
  private final List<Zt7f> Zh = new ArrayList<>();
  
  private final Zrgd ZG;
  
  private final Ztwv ZP;
  
  public Zrb9(Zrgd paramZrgd, Ztwv paramZtwv) {
    this.ZG = paramZrgd;
    this.ZP = paramZtwv;
    Calendar calendar = Calendar.getInstance();
    int i = Math.max(0, 1000 * (60 - calendar.get(13)) - calendar.get(14));
    Timer timer = new Timer(i, this);
    timer.setDelay(60000);
    timer.start();
  }
  
  public void Zp(long paramLong1, long paramLong2, Runnable paramRunnable) {
    ZF(new Zt7f(paramLong1, paramLong2, paramRunnable, this.ZP));
  }
  
  public void Zz(Duration paramDuration1, Duration paramDuration2, Runnable paramRunnable) {
    Zp(paramDuration1.toMillis(), paramDuration2.toMillis(), paramRunnable);
  }
  
  @TestOnly
  void ZF(Zt7f paramZt7f) {
    synchronized (this.Zh) {
      this.Zh.add(paramZt7f);
    } 
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    int[] arrayOfInt = Zte.Zj();
    synchronized (this.Zh) {
      long l = this.ZG.ZX() + 30000L;
      for (Zt7f zt7f : this.Zh) {
        if (zt7f.ZU > l)
          continue; 
        zt7f.ZF();
        zt7f.ZU = l - 30000L + zt7f.ZL;
        if (arrayOfInt == null)
          break; 
      } 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrb9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */