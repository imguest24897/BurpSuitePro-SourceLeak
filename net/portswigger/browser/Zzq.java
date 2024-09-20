package net.portswigger.browser;

import java.time.Duration;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class Zzq {
  private final CountDownLatch ZV = new CountDownLatch(1);
  
  public void ZG() throws InterruptedException {
    this.ZV.await();
  }
  
  public boolean ZI(Duration paramDuration) throws InterruptedException {
    return this.ZV.await(paramDuration.toMillis(), TimeUnit.MILLISECONDS);
  }
  
  public void ZJ() {
    this.ZV.countDown();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zzq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */