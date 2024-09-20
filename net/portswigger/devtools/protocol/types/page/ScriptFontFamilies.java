package net.portswigger.devtools.protocol.types.page;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.page.ScriptFontFamilies")
public class ScriptFontFamilies {
  @Zvd(Zp = "script")
  public final String script;
  
  @Zvd(Zp = "fontFamilies")
  public final FontFamilies fontFamilies;
  
  @Zox
  public ScriptFontFamilies(@Zc5(Ze = "script") String paramString, @Zc5(Ze = "fontFamilies") FontFamilies paramFontFamilies) {
    this.script = paramString;
    this.fontFamilies = paramFontFamilies;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\page\ScriptFontFamilies.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */