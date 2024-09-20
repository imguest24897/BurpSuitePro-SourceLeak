package net.portswigger.devtools.protocol.types.debugger;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.debugger.SearchMatch")
public class SearchMatch {
  @Zvd(Zp = "lineNumber")
  public final Double lineNumber;
  
  @Zvd(Zp = "lineContent")
  public final String lineContent;
  
  @Zox
  public SearchMatch(@Zc5(Ze = "lineNumber") Double paramDouble, @Zc5(Ze = "lineContent") String paramString) {
    this.lineNumber = paramDouble;
    this.lineContent = paramString;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\debugger\SearchMatch.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */