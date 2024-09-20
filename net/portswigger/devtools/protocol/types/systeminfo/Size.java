package net.portswigger.devtools.protocol.types.systeminfo;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.systeminfo.Size")
public class Size {
  @Zvd(Zp = "width")
  public final Integer width;
  
  @Zvd(Zp = "height")
  public final Integer height;
  
  @Zox
  public Size(@Zc5(Ze = "width") Integer paramInteger1, @Zc5(Ze = "height") Integer paramInteger2) {
    this.width = paramInteger1;
    this.height = paramInteger2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\systeminfo\Size.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */