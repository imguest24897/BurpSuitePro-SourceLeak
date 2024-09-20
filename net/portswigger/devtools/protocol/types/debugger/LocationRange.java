package net.portswigger.devtools.protocol.types.debugger;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.debugger.LocationRange")
public class LocationRange {
  @Zvd(Zp = "scriptId")
  public final String scriptId;
  
  @Zvd(Zp = "start")
  public final ScriptPosition start;
  
  @Zvd(Zp = "end")
  public final ScriptPosition end;
  
  @Zox
  public LocationRange(@Zc5(Ze = "scriptId") String paramString, @Zc5(Ze = "start") ScriptPosition paramScriptPosition1, @Zc5(Ze = "end") ScriptPosition paramScriptPosition2) {
    this.scriptId = paramString;
    this.start = paramScriptPosition1;
    this.end = paramScriptPosition2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\debugger\LocationRange.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */