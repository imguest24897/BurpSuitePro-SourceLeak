package net.portswigger.devtools.protocol.types.overlay;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.overlay.ContainerQueryContainerHighlightConfig")
public class ContainerQueryContainerHighlightConfig {
  @Zvd(Zp = "containerBorder")
  @Zj
  public final LineStyle containerBorder;
  
  @Zvd(Zp = "descendantBorder")
  @Zj
  public final LineStyle descendantBorder;
  
  @Zox
  public ContainerQueryContainerHighlightConfig(@Zc5(Ze = "containerBorder", ZS = "null") LineStyle paramLineStyle1, @Zc5(Ze = "descendantBorder", ZS = "null") LineStyle paramLineStyle2) {
    this.containerBorder = paramLineStyle1;
    this.descendantBorder = paramLineStyle2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\overlay\ContainerQueryContainerHighlightConfig.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */