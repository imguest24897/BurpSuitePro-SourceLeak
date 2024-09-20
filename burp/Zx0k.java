package burp;

import java.time.Duration;
import java.time.Instant;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Optional;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zx0k {
  private final Zrgd ZY;
  
  private final int Zn;
  
  private final int ZH;
  
  private final Deque<Integer> Zy;
  
  private int ZO;
  
  private Ztyv Zd;
  
  public Zx0k(Zrgd paramZrgd, int paramInt1, int paramInt2) {
    this.ZY = paramZrgd;
    this.Zn = paramInt2;
    this.ZH = paramInt1;
    this.Zy = new LinkedList<>();
  }
  
  public static Zx0k ZJ(Zrgd paramZrgd, Duration paramDuration1, Duration paramDuration2) {
    Zuh.Zb(!paramDuration2.isZero(), Zqf.Zk);
    Zuh.Zb((paramDuration1.compareTo(paramDuration2) > 0), Zqf.Zk);
    Zuh.Zb((paramDuration1.toMillisPart() == 0), Zqf.Zk);
    Zuh.Zb((paramDuration2.toMillisPart() == 0), Zqf.Zk);
    return new Zx0k(paramZrgd, (int)paramDuration1.toSeconds(), (int)paramDuration2.toSeconds());
  }
  
  public synchronized void Zz(int paramInt) {
    int[] arrayOfInt = Zsyh.ZR();
    Instant instant = this.ZY.Zn();
    if (this.Zd == null)
      this.Zd = new Ztyv(instant); 
    while (!this.Zd.Zk(instant)) {
      int i = this.Zd.Zx();
      this.Zy.add(Integer.valueOf(i));
      this.ZO += i;
      this.Zd = this.Zd.ZZ();
      if (arrayOfInt == null)
        break; 
    } 
    this.Zd.Zf(paramInt);
    while (this.Zy.size() > this.ZH) {
      Integer integer = this.Zy.poll();
      this.ZO -= integer.intValue();
      if (arrayOfInt == null)
        break; 
    } 
  }
  
  public synchronized Optional<Double> Z_() {
    Zz(0);
    return (this.Zy.size() < this.Zn) ? Optional.empty() : Optional.of(Double.valueOf(this.ZO / this.Zy.size()));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx0k.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */