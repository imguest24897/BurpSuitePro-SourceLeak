package net.portswigger.devtools.protocol.events.debugger;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.debugger.Location;

@Zsi("net.portswigger.devtools.protocol.events.debugger.BreakpointResolved")
public class BreakpointResolved implements Zl {
  @Zvd(Zp = "breakpointId")
  public final String breakpointId;
  
  @Zvd(Zp = "location")
  public final Location location;
  
  @Zox
  public BreakpointResolved(@Zc5(Ze = "breakpointId") String paramString, @Zc5(Ze = "location") Location paramLocation) {
    this.breakpointId = paramString;
    this.location = paramLocation;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\debugger\BreakpointResolved.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */