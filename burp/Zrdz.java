package burp;

import java.util.HashMap;
import java.util.Map;

public class Zrdz implements Zr_m {
  private final Map<Integer, Zbq5> Ze = new HashMap<>();
  
  private final Object Zs = new Object();
  
  public void ZR(Zbq5 paramZbq5) {
    synchronized (this.Zs) {
      this.Ze.put(Integer.valueOf(paramZbq5.ZL()), paramZbq5);
    } 
  }
  
  public void ZC(Zbq5 paramZbq5) {
    synchronized (this.Zs) {
      this.Ze.remove(Integer.valueOf(paramZbq5.ZL()));
    } 
  }
  
  Zbq5 ZE(int paramInt) {
    synchronized (this.Zs) {
      return this.Ze.get(Integer.valueOf(paramInt));
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrdz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */