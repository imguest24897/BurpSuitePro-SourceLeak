package net.portswigger.devtools.protocol.types.css;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.css.RuleUsage")
public class RuleUsage {
  @Zvd(Zp = "styleSheetId")
  public final String styleSheetId;
  
  @Zvd(Zp = "startOffset")
  public final Double startOffset;
  
  @Zvd(Zp = "endOffset")
  public final Double endOffset;
  
  @Zvd(Zp = "used")
  public final Boolean used;
  
  @Zox
  public RuleUsage(@Zc5(Ze = "styleSheetId") String paramString, @Zc5(Ze = "startOffset") Double paramDouble1, @Zc5(Ze = "endOffset") Double paramDouble2, @Zc5(Ze = "used") Boolean paramBoolean) {
    this.styleSheetId = paramString;
    this.startOffset = paramDouble1;
    this.endOffset = paramDouble2;
    this.used = paramBoolean;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\css\RuleUsage.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */