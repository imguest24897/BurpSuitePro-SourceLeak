package net.portswigger.devtools.protocol.types.dom;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.dom.Rect")
public class Rect {
  @Zvd(Zp = "x")
  public final Double x;
  
  @Zvd(Zp = "y")
  public final Double y;
  
  @Zvd(Zp = "width")
  public final Double width;
  
  @Zvd(Zp = "height")
  public final Double height;
  
  @Zox
  public Rect(@Zc5(Ze = "x") Double paramDouble1, @Zc5(Ze = "y") Double paramDouble2, @Zc5(Ze = "width") Double paramDouble3, @Zc5(Ze = "height") Double paramDouble4) {
    this.x = paramDouble1;
    this.y = paramDouble2;
    this.width = paramDouble3;
    this.height = paramDouble4;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\dom\Rect.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */