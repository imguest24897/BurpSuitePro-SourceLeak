package net.portswigger.devtools.protocol.types.layertree;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.types.dom.Rect;

@Zsi("net.portswigger.devtools.protocol.types.layertree.ScrollRect")
public class ScrollRect {
  @Zvd(Zp = "rect")
  public final Rect rect;
  
  @Zvd(Zp = "type")
  public final ScrollRectType type;
  
  @Zox
  public ScrollRect(@Zc5(Ze = "rect") Rect paramRect, @Zc5(Ze = "type") ScrollRectType paramScrollRectType) {
    this.rect = paramRect;
    this.type = paramScrollRectType;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\layertree\ScrollRect.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */