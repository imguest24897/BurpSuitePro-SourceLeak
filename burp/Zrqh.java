package burp;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import net.portswigger.Zsy;

class Zrqh {
  private final List<Runnable> ZF;
  
  private final List<Runnable> ZJ;
  
  private final int ZU;
  
  private final Duration Zt;
  
  private final Zx86 ZL;
  
  private final Ztjd Zr;
  
  private final Zsy ZE;
  
  private Zrqh(int paramInt, Duration paramDuration, Zx86 paramZx86, Ztjd paramZtjd, Zsy paramZsy) {
    this.ZU = paramInt;
    this.Zt = paramDuration;
    this.ZL = paramZx86;
    this.Zr = paramZtjd;
    this.ZE = paramZsy;
    this.ZF = new ArrayList<>(paramInt);
    this.ZJ = new ArrayList<>(paramInt);
  }
  
  void ZG(Runnable paramRunnable1, Runnable paramRunnable2) {
    synchronized (this.ZL) {
      this.ZF.add(paramRunnable1);
      this.ZJ.add(paramRunnable2);
      if (this.ZF.size() < this.ZU)
        return; 
      this.ZF.forEach(Runnable::run);
      Zsk5.Ze(this.Zt);
      this.Zr.ZE(new Zsi(this.ZE.ZU().Zz(8)));
      this.ZJ.forEach(Runnable::run);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrqh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */