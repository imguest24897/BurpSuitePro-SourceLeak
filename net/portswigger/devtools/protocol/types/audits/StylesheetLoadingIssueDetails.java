package net.portswigger.devtools.protocol.types.audits;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.audits.StylesheetLoadingIssueDetails")
public class StylesheetLoadingIssueDetails {
  @Zvd(Zp = "sourceCodeLocation")
  public final SourceCodeLocation sourceCodeLocation;
  
  @Zvd(Zp = "styleSheetLoadingIssueReason")
  public final StyleSheetLoadingIssueReason styleSheetLoadingIssueReason;
  
  @Zvd(Zp = "failedRequestInfo")
  @Zj
  public final FailedRequestInfo failedRequestInfo;
  
  private static String Zf;
  
  @Zox
  public StylesheetLoadingIssueDetails(@Zc5(Ze = "sourceCodeLocation") SourceCodeLocation paramSourceCodeLocation, @Zc5(Ze = "styleSheetLoadingIssueReason") StyleSheetLoadingIssueReason paramStyleSheetLoadingIssueReason, @Zc5(Ze = "failedRequestInfo", ZS = "null") FailedRequestInfo paramFailedRequestInfo) {
    this.sourceCodeLocation = paramSourceCodeLocation;
    this.styleSheetLoadingIssueReason = paramStyleSheetLoadingIssueReason;
    this.failedRequestInfo = paramFailedRequestInfo;
  }
  
  public static void ZX(String paramString) {
    Zf = paramString;
  }
  
  public static String Zk() {
    return Zf;
  }
  
  static {
    if (Zk() != null)
      ZX("j0PuJ"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\audits\StylesheetLoadingIssueDetails.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */