package net.portswigger.devtools.protocol.types.debugger;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.debugger.SetBreakpoint")
public class SetBreakpoint {
  @Zvd(Zp = "breakpointId")
  public final String breakpointId;
  
  @Zvd(Zp = "actualLocation")
  public final Location actualLocation;
  
  @Zox
  public SetBreakpoint(@Zc5(Ze = "breakpointId") String paramString, @Zc5(Ze = "actualLocation") Location paramLocation) {
    this.breakpointId = paramString;
    this.actualLocation = paramLocation;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\debugger\SetBreakpoint.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */