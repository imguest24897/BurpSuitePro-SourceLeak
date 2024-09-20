package net.portswigger.devtools.protocol.events.css;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.css.CSSStyleSheetHeader;

@Zsi("net.portswigger.devtools.protocol.events.css.StyleSheetAdded")
public class StyleSheetAdded implements Zl {
  @Zvd(Zp = "header")
  public final CSSStyleSheetHeader header;
  
  @Zox
  public StyleSheetAdded(@Zc5(Ze = "header") CSSStyleSheetHeader paramCSSStyleSheetHeader) {
    this.header = paramCSSStyleSheetHeader;
    int[] arrayOfInt = StyleSheetRemoved.Zd();
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\css\StyleSheetAdded.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */