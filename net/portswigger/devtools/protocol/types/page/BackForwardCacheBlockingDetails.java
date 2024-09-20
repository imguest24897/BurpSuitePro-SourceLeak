package net.portswigger.devtools.protocol.types.page;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.page.BackForwardCacheBlockingDetails")
public class BackForwardCacheBlockingDetails {
  @Zvd(Zp = "url")
  @Zj
  public final String url;
  
  @Zvd(Zp = "function")
  @Zj
  public final String function;
  
  @Zvd(Zp = "lineNumber")
  public final Integer lineNumber;
  
  @Zvd(Zp = "columnNumber")
  public final Integer columnNumber;
  
  @Zox
  public BackForwardCacheBlockingDetails(@Zc5(Ze = "url", ZS = "null") String paramString1, @Zc5(Ze = "function", ZS = "null") String paramString2, @Zc5(Ze = "lineNumber") Integer paramInteger1, @Zc5(Ze = "columnNumber") Integer paramInteger2) {
    this.url = paramString1;
    this.function = paramString2;
    this.lineNumber = paramInteger1;
    this.columnNumber = paramInteger2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\page\BackForwardCacheBlockingDetails.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */