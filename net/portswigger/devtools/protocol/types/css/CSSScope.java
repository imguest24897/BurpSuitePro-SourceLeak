package net.portswigger.devtools.protocol.types.css;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.css.CSSScope")
public class CSSScope {
  @Zvd(Zp = "text")
  public final String text;
  
  @Zvd(Zp = "range")
  @Zj
  public final SourceRange range;
  
  @Zvd(Zp = "styleSheetId")
  @Zj
  public final String styleSheetId;
  
  @Zox
  public CSSScope(@Zc5(Ze = "text") String paramString1, @Zc5(Ze = "range", ZS = "null") SourceRange paramSourceRange, @Zc5(Ze = "styleSheetId", ZS = "null") String paramString2) {
    this.text = paramString1;
    this.range = paramSourceRange;
    this.styleSheetId = paramString2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\css\CSSScope.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */