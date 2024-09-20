package net.portswigger.devtools.protocol.types.overlay;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.overlay.GridNodeHighlightConfig")
public class GridNodeHighlightConfig {
  @Zvd(Zp = "gridHighlightConfig")
  public final GridHighlightConfig gridHighlightConfig;
  
  @Zvd(Zp = "nodeId")
  public final Integer nodeId;
  
  @Zox
  public GridNodeHighlightConfig(@Zc5(Ze = "gridHighlightConfig") GridHighlightConfig paramGridHighlightConfig, @Zc5(Ze = "nodeId") Integer paramInteger) {
    this.gridHighlightConfig = paramGridHighlightConfig;
    this.nodeId = paramInteger;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\overlay\GridNodeHighlightConfig.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */