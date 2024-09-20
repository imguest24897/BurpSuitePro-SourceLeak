package net.portswigger.devtools.client;

import java.time.Duration;
import java.util.Objects;

public class Zx<T> {
  private final Zs<T> ZA;
  
  private Duration ZV;
  
  public Zx(Zs<T> paramZs) {
    this.ZA = Objects.<Zs<T>>requireNonNull(paramZs);
  }
  
  public Zx<T> Zc(Duration paramDuration) {
    this.ZV = Objects.<Duration>requireNonNull(paramDuration);
    return this;
  }
  
  public Zk<T> Zj() {
    return new Zk<>(this.ZA, this.ZV);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\Zx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */