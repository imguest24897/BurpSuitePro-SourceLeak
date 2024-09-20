package net.portswigger.devtools.protocol.types.css;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.css.CSSSupports")
public class CSSSupports {
  @Zvd(Zp = "text")
  public final String text;
  
  @Zvd(Zp = "active")
  public final Boolean active;
  
  @Zvd(Zp = "range")
  @Zj
  public final SourceRange range;
  
  @Zvd(Zp = "styleSheetId")
  @Zj
  public final String styleSheetId;
  
  @Zox
  public CSSSupports(@Zc5(Ze = "text") String paramString1, @Zc5(Ze = "active") Boolean paramBoolean, @Zc5(Ze = "range", ZS = "null") SourceRange paramSourceRange, @Zc5(Ze = "styleSheetId", ZS = "null") String paramString2) {
    this.text = paramString1;
    this.active = paramBoolean;
    this.range = paramSourceRange;
    this.styleSheetId = paramString2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\css\CSSSupports.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */