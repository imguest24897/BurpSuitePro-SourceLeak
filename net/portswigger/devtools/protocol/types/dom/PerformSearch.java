package net.portswigger.devtools.protocol.types.dom;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.dom.PerformSearch")
public class PerformSearch {
  @Zvd(Zp = "searchId")
  public final String searchId;
  
  @Zvd(Zp = "resultCount")
  public final Integer resultCount;
  
  @Zox
  public PerformSearch(@Zc5(Ze = "searchId") String paramString, @Zc5(Ze = "resultCount") Integer paramInteger) {
    this.searchId = paramString;
    this.resultCount = paramInteger;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\dom\PerformSearch.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */