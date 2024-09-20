package net.portswigger.devtools.protocol.types.audits;

import burp.Zbqc;
import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.audits.CookieIssueDetails")
public class CookieIssueDetails {
  @Zvd(Zp = "cookie")
  @Zj
  public final AffectedCookie cookie;
  
  @Zvd(Zp = "rawCookieLine")
  @Zj
  public final String rawCookieLine;
  
  @Zvd(Zp = "cookieWarningReasons")
  public final List<CookieWarningReason> cookieWarningReasons;
  
  @Zvd(Zp = "cookieExclusionReasons")
  public final List<CookieExclusionReason> cookieExclusionReasons;
  
  @Zvd(Zp = "operation")
  public final CookieOperation operation;
  
  @Zvd(Zp = "siteForCookies")
  @Zj
  public final String siteForCookies;
  
  @Zvd(Zp = "cookieUrl")
  @Zj
  public final String cookieUrl;
  
  @Zvd(Zp = "request")
  @Zj
  public final AffectedRequest request;
  
  @Zox
  public CookieIssueDetails(@Zc5(Ze = "cookie", ZS = "null") AffectedCookie paramAffectedCookie, @Zc5(Ze = "rawCookieLine", ZS = "null") String paramString1, @Zc5(Ze = "cookieWarningReasons") List<CookieWarningReason> paramList, @Zc5(Ze = "cookieExclusionReasons") List<CookieExclusionReason> paramList1, @Zc5(Ze = "operation") CookieOperation paramCookieOperation, @Zc5(Ze = "siteForCookies", ZS = "null") String paramString2, @Zc5(Ze = "cookieUrl", ZS = "null") String paramString3, @Zc5(Ze = "request", ZS = "null") AffectedRequest paramAffectedRequest) {
    this.cookie = paramAffectedCookie;
    String str = StylesheetLoadingIssueDetails.Zk();
    this.rawCookieLine = paramString1;
    this.cookieWarningReasons = paramList;
    this.cookieExclusionReasons = paramList1;
    this.operation = paramCookieOperation;
    this.siteForCookies = paramString2;
    this.cookieUrl = paramString3;
    this.request = paramAffectedRequest;
    if (Zbqc.Zwu() == null)
      StylesheetLoadingIssueDetails.ZX("SZO7Qc"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\audits\CookieIssueDetails.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */