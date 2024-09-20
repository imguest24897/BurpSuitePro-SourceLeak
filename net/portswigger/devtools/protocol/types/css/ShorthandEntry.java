package net.portswigger.devtools.protocol.types.css;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.css.ShorthandEntry")
public class ShorthandEntry {
  @Zvd(Zp = "name")
  public final String name;
  
  @Zvd(Zp = "value")
  public final String value;
  
  @Zvd(Zp = "important")
  @Zj
  public final Boolean important;
  
  @Zox
  public ShorthandEntry(@Zc5(Ze = "name") String paramString1, @Zc5(Ze = "value") String paramString2, @Zc5(Ze = "important", ZS = "null") Boolean paramBoolean) {
    this.name = paramString1;
    this.value = paramString2;
    this.important = paramBoolean;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\css\ShorthandEntry.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */