package net.portswigger.devtools.protocol.types.audits;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.audits.QuirksModeIssueDetails")
public class QuirksModeIssueDetails {
  @Zvd(Zp = "isLimitedQuirksMode")
  public final Boolean isLimitedQuirksMode;
  
  @Zvd(Zp = "documentNodeId")
  public final Integer documentNodeId;
  
  @Zvd(Zp = "url")
  public final String url;
  
  @Zvd(Zp = "frameId")
  public final String frameId;
  
  @Zvd(Zp = "loaderId")
  public final String loaderId;
  
  @Zox
  public QuirksModeIssueDetails(@Zc5(Ze = "isLimitedQuirksMode") Boolean paramBoolean, @Zc5(Ze = "documentNodeId") Integer paramInteger, @Zc5(Ze = "url") String paramString1, @Zc5(Ze = "frameId") String paramString2, @Zc5(Ze = "loaderId") String paramString3) {
    this.isLimitedQuirksMode = paramBoolean;
    this.documentNodeId = paramInteger;
    this.url = paramString1;
    this.frameId = paramString2;
    this.loaderId = paramString3;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\audits\QuirksModeIssueDetails.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */