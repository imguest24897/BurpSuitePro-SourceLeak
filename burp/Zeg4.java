package burp;

import java.util.concurrent.Future;

public interface Zeg4 {
  public static final Runnable Zp = Zeg4::lambda$static$0;
  
  public static final Zeg4 Zf = new Zm1v();
  
  Future<?> ZF(Runnable paramRunnable1, Runnable paramRunnable2, Zssw paramZssw);
  
  default Future<?> ZM(Runnable paramRunnable, Zssw paramZssw) {
    return ZF(paramRunnable, Zp, paramZssw);
  }
  
  private static void lambda$static$0() {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeg4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */