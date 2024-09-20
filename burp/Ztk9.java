package burp;

import java.awt.EventQueue;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Ztk9 extends Ztki {
  protected final List<Ze2_> Zl = new CopyOnWriteArrayList<>();
  
  protected void Zk(int paramInt, Ze2_ paramZe2_) {
    Zuh.Zb(EventQueue.isDispatchThread(), Zqf.ZF);
    this.Zl.add(paramInt, paramZe2_);
    ZC(paramInt);
  }
  
  public void ZV(int paramInt) {
    Zuh.Zb(EventQueue.isDispatchThread(), Zqf.ZF);
    this.Zl.remove(paramInt);
    ZS(paramInt);
    Zbqc[] arrayOfZbqc = Ztki.ZE();
    if (Zbqc.Zwu() == null)
      Ztki.Zy(new Zbqc[5]); 
  }
  
  public void Zb() {
    Zuh.Zb(EventQueue.isDispatchThread(), Zqf.ZF);
    Zbqc[] arrayOfZbqc = Ztki.ZE();
    int i = ZA();
    byte b = 0;
    while (b < i) {
      ZV(0);
      b++;
      if (arrayOfZbqc == null) {
        Zbqc.Zr(new Zbqc[1]);
        break;
      } 
    } 
  }
  
  public int ZA() {
    Zuh.Zb(EventQueue.isDispatchThread(), Zqf.ZF);
    return this.Zl.size();
  }
  
  public Ze2_ ZE(int paramInt) {
    Zuh.Zb(EventQueue.isDispatchThread(), Zqf.ZF);
    return this.Zl.get(paramInt);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztk9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */