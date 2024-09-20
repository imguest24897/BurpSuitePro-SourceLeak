package net.portswigger.devtools.protocol.types.page;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.page.VisualViewport")
public class VisualViewport {
  @Zvd(Zp = "offsetX")
  public final Double offsetX;
  
  @Zvd(Zp = "offsetY")
  public final Double offsetY;
  
  @Zvd(Zp = "pageX")
  public final Double pageX;
  
  @Zvd(Zp = "pageY")
  public final Double pageY;
  
  @Zvd(Zp = "clientWidth")
  public final Double clientWidth;
  
  @Zvd(Zp = "clientHeight")
  public final Double clientHeight;
  
  @Zvd(Zp = "scale")
  public final Double scale;
  
  @Zvd(Zp = "zoom")
  @Zj
  public final Double zoom;
  
  @Zox
  public VisualViewport(@Zc5(Ze = "offsetX") Double paramDouble1, @Zc5(Ze = "offsetY") Double paramDouble2, @Zc5(Ze = "pageX") Double paramDouble3, @Zc5(Ze = "pageY") Double paramDouble4, @Zc5(Ze = "clientWidth") Double paramDouble5, @Zc5(Ze = "clientHeight") Double paramDouble6, @Zc5(Ze = "scale") Double paramDouble7, @Zc5(Ze = "zoom", ZS = "null") Double paramDouble8) {
    this.offsetX = paramDouble1;
    this.offsetY = paramDouble2;
    this.pageX = paramDouble3;
    this.pageY = paramDouble4;
    this.clientWidth = paramDouble5;
    this.clientHeight = paramDouble6;
    this.scale = paramDouble7;
    this.zoom = paramDouble8;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\page\VisualViewport.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */