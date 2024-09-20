package net.portswigger.devtools.protocol.types.debugger;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.debugger.SetBreakpointByUrl")
public class SetBreakpointByUrl {
  @Zvd(Zp = "breakpointId")
  public final String breakpointId;
  
  @Zvd(Zp = "locations")
  public final List<Location> locations;
  
  @Zox
  public SetBreakpointByUrl(@Zc5(Ze = "breakpointId") String paramString, @Zc5(Ze = "locations") List<Location> paramList) {
    this.breakpointId = paramString;
    this.locations = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\debugger\SetBreakpointByUrl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */