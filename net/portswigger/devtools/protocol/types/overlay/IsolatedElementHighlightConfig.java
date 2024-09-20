package net.portswigger.devtools.protocol.types.overlay;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.overlay.IsolatedElementHighlightConfig")
public class IsolatedElementHighlightConfig {
  @Zvd(Zp = "isolationModeHighlightConfig")
  public final IsolationModeHighlightConfig isolationModeHighlightConfig;
  
  @Zvd(Zp = "nodeId")
  public final Integer nodeId;
  
  @Zox
  public IsolatedElementHighlightConfig(@Zc5(Ze = "isolationModeHighlightConfig") IsolationModeHighlightConfig paramIsolationModeHighlightConfig, @Zc5(Ze = "nodeId") Integer paramInteger) {
    this.isolationModeHighlightConfig = paramIsolationModeHighlightConfig;
    this.nodeId = paramInteger;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\overlay\IsolatedElementHighlightConfig.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */