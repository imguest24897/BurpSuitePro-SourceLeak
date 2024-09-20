package net.portswigger.devtools.protocol.types.overlay;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.overlay.ContainerQueryHighlightConfig")
public class ContainerQueryHighlightConfig {
  @Zvd(Zp = "containerQueryContainerHighlightConfig")
  public final ContainerQueryContainerHighlightConfig containerQueryContainerHighlightConfig;
  
  @Zvd(Zp = "nodeId")
  public final Integer nodeId;
  
  @Zox
  public ContainerQueryHighlightConfig(@Zc5(Ze = "containerQueryContainerHighlightConfig") ContainerQueryContainerHighlightConfig paramContainerQueryContainerHighlightConfig, @Zc5(Ze = "nodeId") Integer paramInteger) {
    this.containerQueryContainerHighlightConfig = paramContainerQueryContainerHighlightConfig;
    this.nodeId = paramInteger;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\overlay\ContainerQueryHighlightConfig.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */