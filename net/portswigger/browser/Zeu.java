package net.portswigger.browser;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public interface Zeu {
  Ze5 ZR();
  
  Zo Zq();
  
  Zj9 ZM();
  
  boolean Zo();
  
  boolean ZK(long paramLong, TimeUnit paramTimeUnit) throws InterruptedException;
  
  default boolean Zr(Duration paramDuration) throws InterruptedException {
    return ZK(paramDuration.toMillis(), TimeUnit.MILLISECONDS);
  }
  
  void ZP();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zeu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */