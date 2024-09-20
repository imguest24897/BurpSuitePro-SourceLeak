package net.portswigger.devtools.protocol.events.page;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;

@Zsi("net.portswigger.devtools.protocol.events.page.LifecycleEvent")
public class LifecycleEvent implements Zl {
  @Zvd(Zp = "frameId")
  public final String frameId;
  
  @Zvd(Zp = "loaderId")
  public final String loaderId;
  
  @Zvd(Zp = "name")
  public final String name;
  
  @Zvd(Zp = "timestamp")
  public final Double timestamp;
  
  @Zox
  public LifecycleEvent(@Zc5(Ze = "frameId") String paramString1, @Zc5(Ze = "loaderId") String paramString2, @Zc5(Ze = "name") String paramString3, @Zc5(Ze = "timestamp") Double paramDouble) {
    this.frameId = paramString1;
    this.loaderId = paramString2;
    this.name = paramString3;
    this.timestamp = paramDouble;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\page\LifecycleEvent.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */