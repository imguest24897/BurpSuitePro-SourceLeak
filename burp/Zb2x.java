package burp;

import java.awt.Window;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

class Zb2x extends Zb2z {
  private final AtomicBoolean ZC = new AtomicBoolean();
  
  final CountDownLatch Zc;
  
  Zb2x(Zza2 paramZza2, Zg5n paramZg5n, Zkl6 paramZkl6, Ztwv paramZtwv, Zlb7 paramZlb7, Zskh paramZskh, Ztpu paramZtpu, Zxzw paramZxzw, Window paramWindow, CountDownLatch paramCountDownLatch) {
    super(paramZg5n, paramZkl6, paramZtwv, paramZlb7, paramZskh, paramZtpu, paramZxzw, paramWindow);
  }
  
  public boolean Zy(Window paramWindow) {
    if (this.ZC.get())
      return super.Zy(paramWindow); 
    this.ZC.set(true);
    this.Zc.countDown();
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb2x.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */