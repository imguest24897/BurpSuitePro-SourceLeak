package net.portswigger.devtools.protocol.types.css;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.css.PlatformFontUsage")
public class PlatformFontUsage {
  @Zvd(Zp = "familyName")
  public final String familyName;
  
  @Zvd(Zp = "postScriptName")
  public final String postScriptName;
  
  @Zvd(Zp = "isCustomFont")
  public final Boolean isCustomFont;
  
  @Zvd(Zp = "glyphCount")
  public final Double glyphCount;
  
  @Zox
  public PlatformFontUsage(@Zc5(Ze = "familyName") String paramString1, @Zc5(Ze = "postScriptName") String paramString2, @Zc5(Ze = "isCustomFont") Boolean paramBoolean, @Zc5(Ze = "glyphCount") Double paramDouble) {
    this.familyName = paramString1;
    this.postScriptName = paramString2;
    this.isCustomFont = paramBoolean;
    this.glyphCount = paramDouble;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\css\PlatformFontUsage.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */