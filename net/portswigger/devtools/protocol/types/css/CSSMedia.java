package net.portswigger.devtools.protocol.types.css;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.css.CSSMedia")
public class CSSMedia {
  @Zvd(Zp = "text")
  public final String text;
  
  @Zvd(Zp = "source")
  public final CSSMediaSource source;
  
  @Zvd(Zp = "sourceURL")
  @Zj
  public final String sourceURL;
  
  @Zvd(Zp = "range")
  @Zj
  public final SourceRange range;
  
  @Zvd(Zp = "styleSheetId")
  @Zj
  public final String styleSheetId;
  
  @Zvd(Zp = "mediaList")
  @Zj
  public final List<MediaQuery> mediaList;
  
  @Zox
  public CSSMedia(@Zc5(Ze = "text") String paramString1, @Zc5(Ze = "source") CSSMediaSource paramCSSMediaSource, @Zc5(Ze = "sourceURL", ZS = "null") String paramString2, @Zc5(Ze = "range", ZS = "null") SourceRange paramSourceRange, @Zc5(Ze = "styleSheetId", ZS = "null") String paramString3, @Zc5(Ze = "mediaList", ZS = "null") List<MediaQuery> paramList) {
    this.text = paramString1;
    this.source = paramCSSMediaSource;
    this.sourceURL = paramString2;
    this.range = paramSourceRange;
    this.styleSheetId = paramString3;
    this.mediaList = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\css\CSSMedia.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */