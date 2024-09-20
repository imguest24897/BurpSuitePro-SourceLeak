package net.portswigger.devtools.protocol.types.dom;

import burp.Zbqc;
import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.dom.BoxModel")
public class BoxModel {
  @Zvd(Zp = "content")
  public final List<Double> content;
  
  @Zvd(Zp = "padding")
  public final List<Double> padding;
  
  @Zvd(Zp = "border")
  public final List<Double> border;
  
  @Zvd(Zp = "margin")
  public final List<Double> margin;
  
  @Zvd(Zp = "width")
  public final Integer width;
  
  @Zvd(Zp = "height")
  public final Integer height;
  
  @Zvd(Zp = "shapeOutside")
  @Zj
  public final ShapeOutsideInfo shapeOutside;
  
  @Zox
  public BoxModel(@Zc5(Ze = "content") List<Double> paramList1, @Zc5(Ze = "padding") List<Double> paramList2, @Zc5(Ze = "border") List<Double> paramList3, @Zc5(Ze = "margin") List<Double> paramList4, @Zc5(Ze = "width") Integer paramInteger1, @Zc5(Ze = "height") Integer paramInteger2, @Zc5(Ze = "shapeOutside", ZS = "null") ShapeOutsideInfo paramShapeOutsideInfo) {
    this.content = paramList1;
    int i = Node.ZF();
    this.padding = paramList2;
    this.border = paramList3;
    this.margin = paramList4;
    this.width = paramInteger1;
    this.height = paramInteger2;
    this.shapeOutside = paramShapeOutsideInfo;
    if (Zbqc.Zwu() == null)
      Node.Zf(++i); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\dom\BoxModel.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */