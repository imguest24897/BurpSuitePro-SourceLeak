package net.portswigger.devtools.protocol.types.css;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.css.FontFace")
public class FontFace {
  @Zvd(Zp = "fontFamily")
  public final String fontFamily;
  
  @Zvd(Zp = "fontStyle")
  public final String fontStyle;
  
  @Zvd(Zp = "fontVariant")
  public final String fontVariant;
  
  @Zvd(Zp = "fontWeight")
  public final String fontWeight;
  
  @Zvd(Zp = "fontStretch")
  public final String fontStretch;
  
  @Zvd(Zp = "fontDisplay")
  public final String fontDisplay;
  
  @Zvd(Zp = "unicodeRange")
  public final String unicodeRange;
  
  @Zvd(Zp = "src")
  public final String src;
  
  @Zvd(Zp = "platformFontFamily")
  public final String platformFontFamily;
  
  @Zvd(Zp = "fontVariationAxes")
  @Zj
  public final List<FontVariationAxis> fontVariationAxes;
  
  @Zox
  public FontFace(@Zc5(Ze = "fontFamily") String paramString1, @Zc5(Ze = "fontStyle") String paramString2, @Zc5(Ze = "fontVariant") String paramString3, @Zc5(Ze = "fontWeight") String paramString4, @Zc5(Ze = "fontStretch") String paramString5, @Zc5(Ze = "fontDisplay") String paramString6, @Zc5(Ze = "unicodeRange") String paramString7, @Zc5(Ze = "src") String paramString8, @Zc5(Ze = "platformFontFamily") String paramString9, @Zc5(Ze = "fontVariationAxes", ZS = "null") List<FontVariationAxis> paramList) {
    this.fontFamily = paramString1;
    this.fontStyle = paramString2;
    this.fontVariant = paramString3;
    this.fontWeight = paramString4;
    this.fontStretch = paramString5;
    this.fontDisplay = paramString6;
    this.unicodeRange = paramString7;
    this.src = paramString8;
    this.platformFontFamily = paramString9;
    this.fontVariationAxes = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\css\FontFace.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */