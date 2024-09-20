package burp;

import java.util.function.BooleanSupplier;
import javax.swing.Icon;

public class Zgbp {
  public static Zbcm Zq(String paramString, Runnable paramRunnable) {
    Zm2w zm2w = new Zm2w(paramString);
    return new Zbcm(zm2w, paramRunnable::lambda$button$0, paramRunnable, null, false);
  }
  
  public static Zbcm Zu(Icon paramIcon1, Icon paramIcon2, Icon paramIcon3, Icon paramIcon4, Runnable paramRunnable, boolean paramBoolean) {
    Zm2n zm2n = new Zm2n(paramIcon1, paramIcon2, paramIcon3, paramIcon4);
    return new Zbcm(zm2n, paramRunnable::lambda$button$0, paramRunnable, null, paramBoolean);
  }
  
  public static Zbcm ZM(Ze9n paramZe9n, Runnable paramRunnable, String paramString) {
    Zm2_ zm2_ = new Zm2_(paramZe9n);
    return new Zbcm(zm2_, paramRunnable::lambda$button$0, paramRunnable, paramString, false);
  }
  
  public static Zbcm ZW(String paramString, Runnable paramRunnable, BooleanSupplier paramBooleanSupplier) {
    Zm2w zm2w = new Zm2w(paramString);
    return new Zbcm(zm2w, paramBooleanSupplier, paramRunnable, null, false);
  }
  
  private static boolean lambda$disabledButton$6() {
    return false;
  }
  
  private static boolean lambda$button$0(Runnable paramRunnable) {
    return (paramRunnable != null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgbp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */