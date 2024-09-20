package net.portswigger.devtools.protocol.types.overlay;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.overlay.ScrollSnapHighlightConfig")
public class ScrollSnapHighlightConfig {
  @Zvd(Zp = "scrollSnapContainerHighlightConfig")
  public final ScrollSnapContainerHighlightConfig scrollSnapContainerHighlightConfig;
  
  @Zvd(Zp = "nodeId")
  public final Integer nodeId;
  
  @Zox
  public ScrollSnapHighlightConfig(@Zc5(Ze = "scrollSnapContainerHighlightConfig") ScrollSnapContainerHighlightConfig paramScrollSnapContainerHighlightConfig, @Zc5(Ze = "nodeId") Integer paramInteger) {
    this.scrollSnapContainerHighlightConfig = paramScrollSnapContainerHighlightConfig;
    this.nodeId = paramInteger;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\overlay\ScrollSnapHighlightConfig.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */