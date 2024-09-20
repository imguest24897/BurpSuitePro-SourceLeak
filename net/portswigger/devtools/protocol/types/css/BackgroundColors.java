package net.portswigger.devtools.protocol.types.css;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.css.BackgroundColors")
public class BackgroundColors {
  @Zvd(Zp = "backgroundColors")
  @Zj
  public final List<String> backgroundColors;
  
  @Zvd(Zp = "computedFontSize")
  @Zj
  public final String computedFontSize;
  
  @Zvd(Zp = "computedFontWeight")
  @Zj
  public final String computedFontWeight;
  
  @Zox
  public BackgroundColors(@Zc5(Ze = "backgroundColors", ZS = "null") List<String> paramList, @Zc5(Ze = "computedFontSize", ZS = "null") String paramString1, @Zc5(Ze = "computedFontWeight", ZS = "null") String paramString2) {
    this.backgroundColors = paramList;
    this.computedFontSize = paramString1;
    this.computedFontWeight = paramString2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\css\BackgroundColors.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */