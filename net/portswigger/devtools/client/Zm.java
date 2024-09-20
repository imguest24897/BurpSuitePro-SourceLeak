package net.portswigger.devtools.client;

import java.time.Duration;
import java.util.Objects;
import net.portswigger.browser.Zd;
import net.portswigger.devtools.client.impl.connection.Zl;

public class Zm {
  private static final Duration Zc = Duration.ofSeconds(20L);
  
  private Duration ZK = Zc;
  
  private Zl Zb;
  
  private Zd ZR;
  
  public Zm ZZ(Zl paramZl) {
    this.Zb = Objects.<Zl>requireNonNull(paramZl);
    return this;
  }
  
  public Zm Zj(Zd paramZd) {
    this.ZR = Objects.<Zd>requireNonNull(paramZd);
    return this;
  }
  
  public Zn Zb() {
    return new Zn(this.Zb, this.ZR, this.ZK);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\Zm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */