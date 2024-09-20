package net.portswigger.devtools.protocol.types.debugger;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.debugger.BreakLocation")
public class BreakLocation {
  @Zvd(Zp = "scriptId")
  public final String scriptId;
  
  @Zvd(Zp = "lineNumber")
  public final Integer lineNumber;
  
  @Zvd(Zp = "columnNumber")
  @Zj
  public final Integer columnNumber;
  
  @Zvd(Zp = "type")
  @Zj
  public final BreakLocationType type;
  
  @Zox
  public BreakLocation(@Zc5(Ze = "scriptId") String paramString, @Zc5(Ze = "lineNumber") Integer paramInteger1, @Zc5(Ze = "columnNumber", ZS = "null") Integer paramInteger2, @Zc5(Ze = "type", ZS = "null") BreakLocationType paramBreakLocationType) {
    this.scriptId = paramString;
    this.lineNumber = paramInteger1;
    this.columnNumber = paramInteger2;
    this.type = paramBreakLocationType;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\debugger\BreakLocation.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */