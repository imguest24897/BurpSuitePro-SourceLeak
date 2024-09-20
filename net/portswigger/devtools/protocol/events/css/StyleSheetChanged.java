package net.portswigger.devtools.protocol.events.css;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;

@Zsi("net.portswigger.devtools.protocol.events.css.StyleSheetChanged")
public class StyleSheetChanged implements Zl {
  @Zvd(Zp = "styleSheetId")
  public final String styleSheetId;
  
  @Zox
  public StyleSheetChanged(@Zc5(Ze = "styleSheetId") String paramString) {
    this.styleSheetId = paramString;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\css\StyleSheetChanged.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */