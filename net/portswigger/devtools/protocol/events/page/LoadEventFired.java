package net.portswigger.devtools.protocol.events.page;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;

@Zsi("net.portswigger.devtools.protocol.events.page.LoadEventFired")
public class LoadEventFired implements Zl {
  @Zvd(Zp = "timestamp")
  public final Double timestamp;
  
  @Zox
  public LoadEventFired(@Zc5(Ze = "timestamp") Double paramDouble) {
    this.timestamp = paramDouble;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\page\LoadEventFired.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */