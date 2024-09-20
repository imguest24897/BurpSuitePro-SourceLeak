package burp;

import java.awt.EventQueue;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public abstract class Ztki implements Zxj2 {
  private final List<Zsm4> Zg;
  
  private static Zbqc[] ZZ;
  
  protected Ztki() {
    Zuh.Zb(EventQueue.isDispatchThread(), Zqf.ZF);
    this.Zg = new CopyOnWriteArrayList<>();
  }
  
  public void Zt(Zsm4 paramZsm4) {
    Zuh.Zb(EventQueue.isDispatchThread(), Zqf.ZF);
    this.Zg.add(paramZsm4);
  }
  
  public void Zl(int paramInt) {
    if (paramInt > -1)
      ZV(new Zrna(paramInt, Zxxk.PANEL_UPDATED)); 
  }
  
  protected void ZC(int paramInt) {
    if (paramInt > -1)
      ZV(new Zrna(paramInt, Zxxk.PANEL_ADDED)); 
  }
  
  protected void ZS(int paramInt) {
    if (paramInt > -1)
      ZV(new Zrna(paramInt, Zxxk.PANEL_REMOVED)); 
  }
  
  private void ZV(Zrna paramZrna) {
    Zuh.Zb(EventQueue.isDispatchThread(), Zqf.ZF);
    Iterator<Zsm4> iterator = this.Zg.iterator();
    Zbqc[] arrayOfZbqc = ZE();
    while (iterator.hasNext()) {
      Zsm4 zsm4 = iterator.next();
      zsm4.ZB(paramZrna);
      if (arrayOfZbqc == null)
        break; 
    } 
  }
  
  public static void Zy(Zbqc[] paramArrayOfZbqc) {
    ZZ = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZE() {
    return ZZ;
  }
  
  static {
    if (ZE() == null)
      Zy(new Zbqc[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztki.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */