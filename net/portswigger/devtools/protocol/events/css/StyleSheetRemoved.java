package net.portswigger.devtools.protocol.events.css;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;

@Zsi("net.portswigger.devtools.protocol.events.css.StyleSheetRemoved")
public class StyleSheetRemoved implements Zl {
  @Zvd(Zp = "styleSheetId")
  public final String styleSheetId;
  
  private static int[] ZP;
  
  @Zox
  public StyleSheetRemoved(@Zc5(Ze = "styleSheetId") String paramString) {
    this.styleSheetId = paramString;
  }
  
  public static void ZG(int[] paramArrayOfint) {
    ZP = paramArrayOfint;
  }
  
  public static int[] Zd() {
    return ZP;
  }
  
  static {
    if (Zd() == null)
      ZG(new int[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\css\StyleSheetRemoved.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */