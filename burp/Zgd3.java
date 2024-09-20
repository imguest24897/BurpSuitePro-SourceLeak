package burp;

import java.awt.event.MouseEvent;
import java.util.function.Predicate;

public class Zgd3 implements Zky2 {
  private final Predicate<Integer> ZK;
  
  private final Zmo5 ZZ;
  
  private final Runnable ZD;
  
  public Zgd3(Predicate<Integer> paramPredicate, Zmo5 paramZmo5, Runnable paramRunnable) {
    this.ZK = paramPredicate;
    this.ZZ = paramZmo5;
    this.ZD = paramRunnable;
  }
  
  public void Zv(MouseEvent paramMouseEvent, int paramInt1, int paramInt2) {
    if (this.ZK.test(Integer.valueOf(paramInt2))) {
      this.ZZ.repaint();
      this.ZD.run();
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgd3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */