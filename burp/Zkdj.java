package burp;

import java.time.Duration;
import java.util.function.Consumer;
import net.portswigger.Zsy;

public class Zkdj implements Zz95 {
  private final Zz95 ZC;
  
  private final Zz95 ZD;
  
  public Zkdj(Zrgd paramZrgd, Zsy paramZsy, Zkl6 paramZkl6, Ztb7 paramZtb7, Zsxe paramZsxe, Zsfe paramZsfe, Zmu_ paramZmu_, Zeu6 paramZeu6, Ztno paramZtno, Consumer<Duration> paramConsumer) {
    this.ZC = new Zz7e(paramZrgd, paramZsy, paramZkl6, paramZtb7, paramZsxe, paramZsfe, paramZmu_, paramZeu6, paramZtno, paramConsumer);
    this.ZD = new Zecp(paramZkl6, paramZtb7, paramConsumer);
  }
  
  public Zenv ZM(Zmzk paramZmzk, Zrps paramZrps, Zxtv paramZxtv, Zl1v paramZl1v) {
    return paramZmzk.ZJZ() ? this.ZC.ZM(paramZmzk, paramZrps, paramZxtv, paramZl1v) : this.ZD.ZM(paramZmzk, paramZrps, paramZxtv, paramZl1v);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkdj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */