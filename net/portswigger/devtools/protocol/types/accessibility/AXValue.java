package net.portswigger.devtools.protocol.types.accessibility;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zi7;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.accessibility.AXValue")
public class AXValue {
  @Zvd(Zp = "type")
  public final AXValueType type;
  
  @Zvd(Zp = "value")
  @Zj
  public final Zi7 value;
  
  @Zvd(Zp = "relatedNodes")
  @Zj
  public final List<AXRelatedNode> relatedNodes;
  
  @Zvd(Zp = "sources")
  @Zj
  public final List<AXValueSource> sources;
  
  @Zox
  public AXValue(@Zc5(Ze = "type") AXValueType paramAXValueType, @Zc5(Ze = "value", ZS = "null") Zi7 paramZi7, @Zc5(Ze = "relatedNodes", ZS = "null") List<AXRelatedNode> paramList, @Zc5(Ze = "sources", ZS = "null") List<AXValueSource> paramList1) {
    this.type = paramAXValueType;
    this.value = paramZi7;
    this.relatedNodes = paramList;
    this.sources = paramList1;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\accessibility\AXValue.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */