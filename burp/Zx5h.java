package burp;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

class Zx5h implements Zr_m, Zb2v {
  private final Zb2v ZL;
  
  private final Map<Integer, Zgnu> Zp;
  
  private final Object Zh;
  
  Zx5h(Zb2v paramZb2v) {
    this.ZL = paramZb2v;
    this.Zp = new HashMap<>();
    this.Zh = new Object();
  }
  
  public Zgnu Zv(int paramInt, Supplier<Integer> paramSupplier) {
    synchronized (this.Zh) {
      Zgnu zgnu = this.ZL.Zv(paramInt, paramSupplier);
      this.Zp.put(Integer.valueOf(paramInt), zgnu);
      return zgnu;
    } 
  }
  
  Zgnu Zu(int paramInt) {
    synchronized (this.Zh) {
      return this.Zp.get(Integer.valueOf(paramInt));
    } 
  }
  
  public void ZR(Zbq5 paramZbq5) {}
  
  public void ZC(Zbq5 paramZbq5) {
    synchronized (this.Zh) {
      this.Zp.remove(Integer.valueOf(paramZbq5.ZL()));
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx5h.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */