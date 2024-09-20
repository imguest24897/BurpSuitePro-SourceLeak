package net.portswigger.devtools.protocol.types.layertree;

import burp.Zbqc;
import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.layertree.Layer")
public class Layer {
  @Zvd(Zp = "layerId")
  public final String layerId;
  
  @Zvd(Zp = "parentLayerId")
  @Zj
  public final String parentLayerId;
  
  @Zvd(Zp = "backendNodeId")
  @Zj
  public final Integer backendNodeId;
  
  @Zvd(Zp = "offsetX")
  public final Double offsetX;
  
  @Zvd(Zp = "offsetY")
  public final Double offsetY;
  
  @Zvd(Zp = "width")
  public final Double width;
  
  @Zvd(Zp = "height")
  public final Double height;
  
  @Zvd(Zp = "transform")
  @Zj
  public final List<Double> transform;
  
  @Zvd(Zp = "anchorX")
  @Zj
  public final Double anchorX;
  
  @Zvd(Zp = "anchorY")
  @Zj
  public final Double anchorY;
  
  @Zvd(Zp = "anchorZ")
  @Zj
  public final Double anchorZ;
  
  @Zvd(Zp = "paintCount")
  public final Integer paintCount;
  
  @Zvd(Zp = "drawsContent")
  public final Boolean drawsContent;
  
  @Zvd(Zp = "invisible")
  @Zj
  public final Boolean invisible;
  
  @Zvd(Zp = "scrollRects")
  @Zj
  public final List<ScrollRect> scrollRects;
  
  @Zvd(Zp = "stickyPositionConstraint")
  @Zj
  public final StickyPositionConstraint stickyPositionConstraint;
  
  @Zox
  public Layer(@Zc5(Ze = "layerId") String paramString1, @Zc5(Ze = "parentLayerId", ZS = "null") String paramString2, @Zc5(Ze = "backendNodeId", ZS = "null") Integer paramInteger1, @Zc5(Ze = "offsetX") Double paramDouble1, @Zc5(Ze = "offsetY") Double paramDouble2, @Zc5(Ze = "width") Double paramDouble3, @Zc5(Ze = "height") Double paramDouble4, @Zc5(Ze = "transform", ZS = "null") List<Double> paramList, @Zc5(Ze = "anchorX", ZS = "null") Double paramDouble5, @Zc5(Ze = "anchorY", ZS = "null") Double paramDouble6, @Zc5(Ze = "anchorZ", ZS = "null") Double paramDouble7, @Zc5(Ze = "paintCount") Integer paramInteger2, @Zc5(Ze = "drawsContent") Boolean paramBoolean1, @Zc5(Ze = "invisible", ZS = "null") Boolean paramBoolean2, @Zc5(Ze = "scrollRects", ZS = "null") List<ScrollRect> paramList1, @Zc5(Ze = "stickyPositionConstraint", ZS = "null") StickyPositionConstraint paramStickyPositionConstraint) {
    this.layerId = paramString1;
    this.parentLayerId = paramString2;
    this.backendNodeId = paramInteger1;
    this.offsetX = paramDouble1;
    this.offsetY = paramDouble2;
    this.width = paramDouble3;
    this.height = paramDouble4;
    this.transform = paramList;
    this.anchorX = paramDouble5;
    this.anchorY = paramDouble6;
    this.anchorZ = paramDouble7;
    this.paintCount = paramInteger2;
    this.drawsContent = paramBoolean1;
    this.invisible = paramBoolean2;
    this.scrollRects = paramList1;
    this.stickyPositionConstraint = paramStickyPositionConstraint;
    boolean bool = StickyPositionConstraint.Ze();
    if (!bool)
      Zbqc.Zr(new Zbqc[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\layertree\Layer.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */