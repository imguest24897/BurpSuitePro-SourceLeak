package net.portswigger.devtools.protocol.types.debugger;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.debugger.DebugSymbols")
public class DebugSymbols {
  @Zvd(Zp = "type")
  public final DebugSymbolsType type;
  
  @Zvd(Zp = "externalURL")
  @Zj
  public final String externalURL;
  
  @Zox
  public DebugSymbols(@Zc5(Ze = "type") DebugSymbolsType paramDebugSymbolsType, @Zc5(Ze = "externalURL", ZS = "null") String paramString) {
    this.type = paramDebugSymbolsType;
    this.externalURL = paramString;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\debugger\DebugSymbols.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */