package net.portswigger.devtools.protocol.types.preload;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.preload.RuleSet")
public class RuleSet {
  @Zvd(Zp = "id")
  public final String id;
  
  @Zvd(Zp = "loaderId")
  public final String loaderId;
  
  @Zvd(Zp = "sourceText")
  public final String sourceText;
  
  @Zvd(Zp = "backendNodeId")
  @Zj
  public final Integer backendNodeId;
  
  @Zvd(Zp = "url")
  @Zj
  public final String url;
  
  @Zvd(Zp = "requestId")
  @Zj
  public final String requestId;
  
  @Zvd(Zp = "errorType")
  @Zj
  public final RuleSetErrorType errorType;
  
  @Zvd(Zp = "errorMessage")
  @Deprecated
  @Zj
  public final String errorMessage;
  
  @Zox
  public RuleSet(@Zc5(Ze = "id") String paramString1, @Zc5(Ze = "loaderId") String paramString2, @Zc5(Ze = "sourceText") String paramString3, @Zc5(Ze = "backendNodeId", ZS = "null") Integer paramInteger, @Zc5(Ze = "url", ZS = "null") String paramString4, @Zc5(Ze = "requestId", ZS = "null") String paramString5, @Zc5(Ze = "errorType", ZS = "null") RuleSetErrorType paramRuleSetErrorType, @Zc5(Ze = "errorMessage", ZS = "null") String paramString6) {
    this.id = paramString1;
    this.loaderId = paramString2;
    this.sourceText = paramString3;
    this.backendNodeId = paramInteger;
    this.url = paramString4;
    Zbqc[] arrayOfZbqc = SpeculationTargetHint.ZM();
    this.requestId = paramString5;
    this.errorType = paramRuleSetErrorType;
    this.errorMessage = paramString6;
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\preload\RuleSet.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */