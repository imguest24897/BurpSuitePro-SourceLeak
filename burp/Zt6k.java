package burp;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Zt6k implements Zl3v {
  private final List<Zrwi> Zs;
  
  private final Lock ZV = new ReentrantLock();
  
  private volatile boolean Zf = false;
  
  public Zt6k(Zz49 paramZz49, Zee7 paramZee7, Zmwt paramZmwt, Zxwi paramZxwi) {
    this.Zs = Arrays.asList(new Zrwi[] { new Zv1(new Zgpf(paramZz49, paramZee7, paramZmwt, paramZxwi), paramZee7), new Zv1(new Zz_t(paramZz49, paramZee7, paramZmwt), paramZee7), new Zv1(new Zrr1(paramZz49, paramZee7), paramZee7), new Zv1(new Zvp(paramZz49, paramZee7), paramZee7) });
    int[] arrayOfInt = Zee7.Zb();
    if (arrayOfInt != null)
      Zbqc.Zr(new Zbqc[4]); 
  }
  
  public void ZT() {
    if (this.Zf && ((Zrwi)this.Zs.get(0)).ZS() && this.ZV.tryLock())
      try {
        ZY();
        this.Zf = false;
      } finally {
        this.ZV.unlock();
      }  
  }
  
  private void ZY() {
    Iterator<Zrwi> iterator = this.Zs.iterator();
    int[] arrayOfInt = Zee7.Zb();
    while (iterator.hasNext()) {
      Zrwi zrwi = iterator.next();
      if (zrwi.ZS()) {
        zrwi.Zt();
        if (arrayOfInt != null)
          break; 
      } 
    } 
  }
  
  public void Za() {
    this.Zf = true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt6k.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */