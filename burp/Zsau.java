package burp;

import java.util.function.Supplier;

public interface Zsau {
  static Zsau ZZ(Zra1 paramZra1, boolean paramBoolean1, boolean paramBoolean2, Supplier<Boolean> paramSupplier, Zz9q paramZz9q, Zrgd paramZrgd) {
    return paramBoolean1 ? Zsau::lambda$updateCheckLogicFor$0 : (paramBoolean2 ? Zsau::lambda$updateCheckLogicFor$1 : ((paramZra1 == Zra1.EXECUTION_MODE_DESKTOP) ? new Zve(paramZz9q, paramSupplier, paramZrgd) : Zsau::lambda$updateCheckLogicFor$0));
  }
  
  boolean ZB();
  
  private static boolean lambda$updateCheckLogicFor$1() {
    return true;
  }
  
  private static boolean lambda$updateCheckLogicFor$0() {
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsau.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */