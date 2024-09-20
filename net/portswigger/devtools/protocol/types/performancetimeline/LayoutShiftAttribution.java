package net.portswigger.devtools.protocol.types.performancetimeline;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.types.dom.Rect;

@Zsi("net.portswigger.devtools.protocol.types.performancetimeline.LayoutShiftAttribution")
public class LayoutShiftAttribution {
  @Zvd(Zp = "previousRect")
  public final Rect previousRect;
  
  @Zvd(Zp = "currentRect")
  public final Rect currentRect;
  
  @Zvd(Zp = "nodeId")
  @Zj
  public final Integer nodeId;
  
  @Zox
  public LayoutShiftAttribution(@Zc5(Ze = "previousRect") Rect paramRect1, @Zc5(Ze = "currentRect") Rect paramRect2, @Zc5(Ze = "nodeId", ZS = "null") Integer paramInteger) {
    this.previousRect = paramRect1;
    this.currentRect = paramRect2;
    this.nodeId = paramInteger;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\performancetimeline\LayoutShiftAttribution.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */