package net.portswigger.devtools.protocol.types.css;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.css.StyleDeclarationEdit")
public class StyleDeclarationEdit {
  @Zvd(Zp = "styleSheetId")
  public final String styleSheetId;
  
  @Zvd(Zp = "range")
  public final SourceRange range;
  
  @Zvd(Zp = "text")
  public final String text;
  
  @Zox
  public StyleDeclarationEdit(@Zc5(Ze = "styleSheetId") String paramString1, @Zc5(Ze = "range") SourceRange paramSourceRange, @Zc5(Ze = "text") String paramString2) {
    this.styleSheetId = paramString1;
    this.range = paramSourceRange;
    this.text = paramString2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\css\StyleDeclarationEdit.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */