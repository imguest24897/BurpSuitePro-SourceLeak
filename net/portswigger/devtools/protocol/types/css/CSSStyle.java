package net.portswigger.devtools.protocol.types.css;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.css.CSSStyle")
public class CSSStyle {
  @Zvd(Zp = "styleSheetId")
  @Zj
  public final String styleSheetId;
  
  @Zvd(Zp = "cssProperties")
  public final List<CSSProperty> cssProperties;
  
  @Zvd(Zp = "shorthandEntries")
  public final List<ShorthandEntry> shorthandEntries;
  
  @Zvd(Zp = "cssText")
  @Zj
  public final String cssText;
  
  @Zvd(Zp = "range")
  @Zj
  public final SourceRange range;
  
  @Zox
  public CSSStyle(@Zc5(Ze = "styleSheetId", ZS = "null") String paramString1, @Zc5(Ze = "cssProperties") List<CSSProperty> paramList, @Zc5(Ze = "shorthandEntries") List<ShorthandEntry> paramList1, @Zc5(Ze = "cssText", ZS = "null") String paramString2, @Zc5(Ze = "range", ZS = "null") SourceRange paramSourceRange) {
    this.styleSheetId = paramString1;
    this.cssProperties = paramList;
    this.shorthandEntries = paramList1;
    this.cssText = paramString2;
    this.range = paramSourceRange;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\css\CSSStyle.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */