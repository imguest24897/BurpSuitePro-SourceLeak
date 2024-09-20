package net.portswigger.devtools.protocol.types.page;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.page.FontSizes")
public class FontSizes {
  @Zvd(Zp = "standard")
  @Zj
  public final Integer standard;
  
  @Zvd(Zp = "fixed")
  @Zj
  public final Integer fixed;
  
  @Zox
  public FontSizes(@Zc5(Ze = "standard", ZS = "null") Integer paramInteger1, @Zc5(Ze = "fixed", ZS = "null") Integer paramInteger2) {
    this.standard = paramInteger1;
    this.fixed = paramInteger2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\page\FontSizes.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */