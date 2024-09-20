package net.portswigger.devtools.protocol.types.dom;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zi7;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.dom.ShapeOutsideInfo")
public class ShapeOutsideInfo {
  @Zvd(Zp = "bounds")
  public final List<Double> bounds;
  
  @Zvd(Zp = "shape")
  public final List<Zi7> shape;
  
  @Zvd(Zp = "marginShape")
  public final List<Zi7> marginShape;
  
  @Zox
  public ShapeOutsideInfo(@Zc5(Ze = "bounds") List<Double> paramList, @Zc5(Ze = "shape") List<Zi7> paramList1, @Zc5(Ze = "marginShape") List<Zi7> paramList2) {
    this.bounds = paramList;
    this.shape = paramList1;
    this.marginShape = paramList2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\dom\ShapeOutsideInfo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */