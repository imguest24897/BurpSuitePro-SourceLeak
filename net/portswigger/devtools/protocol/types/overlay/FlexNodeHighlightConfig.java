package net.portswigger.devtools.protocol.types.overlay;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.overlay.FlexNodeHighlightConfig")
public class FlexNodeHighlightConfig {
  @Zvd(Zp = "flexContainerHighlightConfig")
  public final FlexContainerHighlightConfig flexContainerHighlightConfig;
  
  @Zvd(Zp = "nodeId")
  public final Integer nodeId;
  
  @Zox
  public FlexNodeHighlightConfig(@Zc5(Ze = "flexContainerHighlightConfig") FlexContainerHighlightConfig paramFlexContainerHighlightConfig, @Zc5(Ze = "nodeId") Integer paramInteger) {
    this.flexContainerHighlightConfig = paramFlexContainerHighlightConfig;
    this.nodeId = paramInteger;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\overlay\FlexNodeHighlightConfig.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */