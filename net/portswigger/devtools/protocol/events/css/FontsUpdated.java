package net.portswigger.devtools.protocol.events.css;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.css.FontFace;

@Zsi("net.portswigger.devtools.protocol.events.css.FontsUpdated")
public class FontsUpdated implements Zl {
  @Zvd(Zp = "font")
  @Zj
  public final FontFace font;
  
  @Zox
  public FontsUpdated(@Zc5(Ze = "font", ZS = "null") FontFace paramFontFace) {
    this.font = paramFontFace;
    int[] arrayOfInt = StyleSheetRemoved.Zd();
    if (Zbqc.Zwu() == null)
      StyleSheetRemoved.ZG(new int[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\css\FontsUpdated.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */