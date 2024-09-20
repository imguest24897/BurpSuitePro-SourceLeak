package net.portswigger.devtools.protocol.types.audits;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.audits.SourceCodeLocation")
public class SourceCodeLocation {
  @Zvd(Zp = "scriptId")
  @Zj
  public final String scriptId;
  
  @Zvd(Zp = "url")
  public final String url;
  
  @Zvd(Zp = "lineNumber")
  public final Integer lineNumber;
  
  @Zvd(Zp = "columnNumber")
  public final Integer columnNumber;
  
  @Zox
  public SourceCodeLocation(@Zc5(Ze = "scriptId", ZS = "null") String paramString1, @Zc5(Ze = "url") String paramString2, @Zc5(Ze = "lineNumber") Integer paramInteger1, @Zc5(Ze = "columnNumber") Integer paramInteger2) {
    this.scriptId = paramString1;
    this.url = paramString2;
    this.lineNumber = paramInteger1;
    this.columnNumber = paramInteger2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\audits\SourceCodeLocation.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */