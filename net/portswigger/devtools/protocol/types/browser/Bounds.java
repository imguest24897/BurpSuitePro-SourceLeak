package net.portswigger.devtools.protocol.types.browser;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.browser.Bounds")
public class Bounds {
  @Zvd(Zp = "left")
  @Zj
  public final Integer left;
  
  @Zvd(Zp = "top")
  @Zj
  public final Integer top;
  
  @Zvd(Zp = "width")
  @Zj
  public final Integer width;
  
  @Zvd(Zp = "height")
  @Zj
  public final Integer height;
  
  @Zvd(Zp = "windowState")
  @Zj
  public final WindowState windowState;
  
  @Zox
  public Bounds(@Zc5(Ze = "left", ZS = "null") Integer paramInteger1, @Zc5(Ze = "top", ZS = "null") Integer paramInteger2, @Zc5(Ze = "width", ZS = "null") Integer paramInteger3, @Zc5(Ze = "height", ZS = "null") Integer paramInteger4, @Zc5(Ze = "windowState", ZS = "null") WindowState paramWindowState) {
    this.left = paramInteger1;
    this.top = paramInteger2;
    int[] arrayOfInt = WindowForTarget.Zw();
    this.width = paramInteger3;
    this.height = paramInteger4;
    this.windowState = paramWindowState;
    if (Zbqc.Zwu() == null)
      WindowForTarget.Zt(new int[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\browser\Bounds.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */