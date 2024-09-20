package net.portswigger.devtools.protocol.types.page;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.page.LayoutViewport")
public class LayoutViewport {
  @Zvd(Zp = "pageX")
  public final Integer pageX;
  
  @Zvd(Zp = "pageY")
  public final Integer pageY;
  
  @Zvd(Zp = "clientWidth")
  public final Integer clientWidth;
  
  @Zvd(Zp = "clientHeight")
  public final Integer clientHeight;
  
  @Zox
  public LayoutViewport(@Zc5(Ze = "pageX") Integer paramInteger1, @Zc5(Ze = "pageY") Integer paramInteger2, @Zc5(Ze = "clientWidth") Integer paramInteger3, @Zc5(Ze = "clientHeight") Integer paramInteger4) {
    this.pageX = paramInteger1;
    this.pageY = paramInteger2;
    this.clientWidth = paramInteger3;
    this.clientHeight = paramInteger4;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\page\LayoutViewport.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */