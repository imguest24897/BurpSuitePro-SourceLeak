package burp;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class Zmq5 extends Zm99 {
  private final AtomicBoolean Za;
  
  private final List<Runnable> ZT = new LinkedList<>();
  
  public Zmq5(String paramString, boolean paramBoolean) {
    super(paramString);
    this.Za = new AtomicBoolean(paramBoolean);
    setIcon(paramBoolean ? Zgzq.LARGE_SWITCH_ON.ZD() : Zgzq.LARGE_SWITCH_OFF.ZD());
    addMouseListener(new Zevo(this));
  }
  
  public boolean ZT() {
    return this.Za.get();
  }
  
  public void Zc(Runnable paramRunnable) {
    this.ZT.add(paramRunnable);
  }
  
  public void Zl() {
    this.ZT.clear();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmq5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */