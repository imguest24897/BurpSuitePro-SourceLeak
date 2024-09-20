package net.portswigger.devtools.protocol.types.audits;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.audits.LowTextContrastIssueDetails")
public class LowTextContrastIssueDetails {
  @Zvd(Zp = "violatingNodeId")
  public final Integer violatingNodeId;
  
  @Zvd(Zp = "violatingNodeSelector")
  public final String violatingNodeSelector;
  
  @Zvd(Zp = "contrastRatio")
  public final Double contrastRatio;
  
  @Zvd(Zp = "thresholdAA")
  public final Double thresholdAA;
  
  @Zvd(Zp = "thresholdAAA")
  public final Double thresholdAAA;
  
  @Zvd(Zp = "fontSize")
  public final String fontSize;
  
  @Zvd(Zp = "fontWeight")
  public final String fontWeight;
  
  @Zox
  public LowTextContrastIssueDetails(@Zc5(Ze = "violatingNodeId") Integer paramInteger, @Zc5(Ze = "violatingNodeSelector") String paramString1, @Zc5(Ze = "contrastRatio") Double paramDouble1, @Zc5(Ze = "thresholdAA") Double paramDouble2, @Zc5(Ze = "thresholdAAA") Double paramDouble3, @Zc5(Ze = "fontSize") String paramString2, @Zc5(Ze = "fontWeight") String paramString3) {
    this.violatingNodeId = paramInteger;
    this.violatingNodeSelector = paramString1;
    this.contrastRatio = paramDouble1;
    this.thresholdAA = paramDouble2;
    this.thresholdAAA = paramDouble3;
    this.fontSize = paramString2;
    this.fontWeight = paramString3;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\audits\LowTextContrastIssueDetails.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */