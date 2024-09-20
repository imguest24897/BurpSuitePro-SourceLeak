package net.portswigger.devtools.protocol.events.profiler;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.debugger.Location;

@Zsi("net.portswigger.devtools.protocol.events.profiler.ConsoleProfileStarted")
public class ConsoleProfileStarted implements Zl {
  @Zvd(Zp = "id")
  public final String id;
  
  @Zvd(Zp = "location")
  public final Location location;
  
  @Zvd(Zp = "title")
  @Zj
  public final String title;
  
  @Zox
  public ConsoleProfileStarted(@Zc5(Ze = "id") String paramString1, @Zc5(Ze = "location") Location paramLocation, @Zc5(Ze = "title", ZS = "null") String paramString2) {
    boolean bool = PreciseCoverageDeltaUpdate.Zx();
    this.id = paramString1;
    this.location = paramLocation;
    this.title = paramString2;
    if (Zbqc.Zwu() == null)
      PreciseCoverageDeltaUpdate.Zn(!bool); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\profiler\ConsoleProfileStarted.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */