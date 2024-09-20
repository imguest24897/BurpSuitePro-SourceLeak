package burp;

import java.util.ArrayList;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zgvh {
  private final List<Runnable> Ze = new ArrayList<>();
  
  public void ZA(Runnable paramRunnable) {
    synchronized (this.Ze) {
      this.Ze.add(paramRunnable);
    } 
  }
  
  public void ZX() {
    String[] arrayOfString = Ztom.ZG();
    synchronized (this.Ze) {
      for (Runnable runnable : this.Ze) {
        try {
          runnable.run();
        } catch (Exception exception) {
          Zah.Zl(exception, Zk_.UNEXPECTED);
        } 
        if (arrayOfString != null)
          break; 
      } 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgvh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */