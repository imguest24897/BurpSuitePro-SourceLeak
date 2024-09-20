package net.portswigger;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class Zma implements Runnable {
  private volatile boolean ZS = true;
  
  private final List<Zvv> ZK = new CopyOnWriteArrayList<>();
  
  private CountDownLatch ZL = new CountDownLatch(1);
  
  public Zvv Zv(Zaa paramZaa) {
    Zvv zvv = new Zvv(this, this, paramZaa);
    this.ZK.add(zvv);
    return zvv;
  }
  
  public void run() {
    byte b = 25;
    int i = 0;
    int[] arrayOfInt = Zus.Zk();
    while (this.ZS) {
      try {
        boolean bool = this.ZL.await(1000L, TimeUnit.MILLISECONDS);
        if (!bool) {
          i = (i + 1) % b;
          for (Zvv zvv : this.ZK) {
            try {
              zvv.ZL();
              if (i == 0)
                zvv.Zd(); 
            } catch (InterruptedException interruptedException) {
              throw a(null);
            } 
            if (arrayOfInt != null)
              break; 
          } 
        } 
      } catch (InterruptedException|Zrmv interruptedException) {
        Zah.Zl(interruptedException, Zk_.IGNORED);
        break;
      } 
    } 
  }
  
  private void Zk(Zvv paramZvv) {
    this.ZK.remove(paramZvv);
  }
  
  public void ZD() {
    this.ZS = false;
    this.ZL.countDown();
  }
  
  private static InterruptedException a(InterruptedException paramInterruptedException) {
    return paramInterruptedException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zma.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */