package burp;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zmkx implements Ztu3 {
  private final List<Ztu3> ZP = new CopyOnWriteArrayList<>();
  
  private final AtomicBoolean ZJ = new AtomicBoolean();
  
  public void ZZ(Ztu3 paramZtu3) {
    this.ZP.add(paramZtu3);
  }
  
  public void ZY() {
    if (this.ZJ.compareAndSet(false, true))
      this.ZP.forEach(Zmkx::lambda$stop$0); 
  }
  
  private static void lambda$stop$0(Ztu3 paramZtu3) {
    try {
      paramZtu3.ZY();
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.UNEXPECTED);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmkx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */