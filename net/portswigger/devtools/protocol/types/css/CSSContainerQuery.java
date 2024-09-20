package net.portswigger.devtools.protocol.types.css;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.types.dom.LogicalAxes;
import net.portswigger.devtools.protocol.types.dom.PhysicalAxes;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.css.CSSContainerQuery")
public class CSSContainerQuery {
  @Zvd(Zp = "text")
  public final String text;
  
  @Zvd(Zp = "range")
  @Zj
  public final SourceRange range;
  
  @Zvd(Zp = "styleSheetId")
  @Zj
  public final String styleSheetId;
  
  @Zvd(Zp = "name")
  @Zj
  public final String name;
  
  @Zvd(Zp = "physicalAxes")
  @Zj
  public final PhysicalAxes physicalAxes;
  
  @Zvd(Zp = "logicalAxes")
  @Zj
  public final LogicalAxes logicalAxes;
  
  @Zox
  public CSSContainerQuery(@Zc5(Ze = "text") String paramString1, @Zc5(Ze = "range", ZS = "null") SourceRange paramSourceRange, @Zc5(Ze = "styleSheetId", ZS = "null") String paramString2, @Zc5(Ze = "name", ZS = "null") String paramString3, @Zc5(Ze = "physicalAxes", ZS = "null") PhysicalAxes paramPhysicalAxes, @Zc5(Ze = "logicalAxes", ZS = "null") LogicalAxes paramLogicalAxes) {
    this.text = paramString1;
    this.range = paramSourceRange;
    this.styleSheetId = paramString2;
    this.name = paramString3;
    this.physicalAxes = paramPhysicalAxes;
    this.logicalAxes = paramLogicalAxes;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\css\CSSContainerQuery.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */