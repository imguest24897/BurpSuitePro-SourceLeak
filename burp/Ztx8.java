package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;

public interface Ztx8 {
  public static final Ztx8 ZC = new Zxyh();
  
  RuntimeException Zf(Throwable paramThrowable);
  
  default void ZO(Zl6v paramZl6v) {
    try {
      paramZl6v.Zk();
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.EXTENSION_GENERATED);
      throw Zf(throwable);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztx8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */