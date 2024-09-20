package net.portswigger.devtools.protocol.types.layertree;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.types.dom.Rect;

@Zsi("net.portswigger.devtools.protocol.types.layertree.StickyPositionConstraint")
public class StickyPositionConstraint {
  @Zvd(Zp = "stickyBoxRect")
  public final Rect stickyBoxRect;
  
  @Zvd(Zp = "containingBlockRect")
  public final Rect containingBlockRect;
  
  @Zvd(Zp = "nearestLayerShiftingStickyBox")
  @Zj
  public final String nearestLayerShiftingStickyBox;
  
  @Zvd(Zp = "nearestLayerShiftingContainingBlock")
  @Zj
  public final String nearestLayerShiftingContainingBlock;
  
  private static boolean Zp;
  
  @Zox
  public StickyPositionConstraint(@Zc5(Ze = "stickyBoxRect") Rect paramRect1, @Zc5(Ze = "containingBlockRect") Rect paramRect2, @Zc5(Ze = "nearestLayerShiftingStickyBox", ZS = "null") String paramString1, @Zc5(Ze = "nearestLayerShiftingContainingBlock", ZS = "null") String paramString2) {
    this.stickyBoxRect = paramRect1;
    this.containingBlockRect = paramRect2;
    this.nearestLayerShiftingStickyBox = paramString1;
    this.nearestLayerShiftingContainingBlock = paramString2;
    boolean bool = ZY();
    if (Zbqc.Zwu() == null)
      Zm(!bool); 
  }
  
  public static void Zm(boolean paramBoolean) {
    Zp = paramBoolean;
  }
  
  public static boolean Ze() {
    return Zp;
  }
  
  public static boolean ZY() {
    boolean bool = Ze();
    return !bool;
  }
  
  static {
    if (!Ze())
      Zm(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\layertree\StickyPositionConstraint.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */