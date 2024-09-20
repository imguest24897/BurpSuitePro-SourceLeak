package net.portswigger.devtools.protocol.types.overlay;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.overlay.FlexContainerHighlightConfig")
public class FlexContainerHighlightConfig {
  @Zvd(Zp = "containerBorder")
  @Zj
  public final LineStyle containerBorder;
  
  @Zvd(Zp = "lineSeparator")
  @Zj
  public final LineStyle lineSeparator;
  
  @Zvd(Zp = "itemSeparator")
  @Zj
  public final LineStyle itemSeparator;
  
  @Zvd(Zp = "mainDistributedSpace")
  @Zj
  public final BoxStyle mainDistributedSpace;
  
  @Zvd(Zp = "crossDistributedSpace")
  @Zj
  public final BoxStyle crossDistributedSpace;
  
  @Zvd(Zp = "rowGapSpace")
  @Zj
  public final BoxStyle rowGapSpace;
  
  @Zvd(Zp = "columnGapSpace")
  @Zj
  public final BoxStyle columnGapSpace;
  
  @Zvd(Zp = "crossAlignment")
  @Zj
  public final LineStyle crossAlignment;
  
  @Zox
  public FlexContainerHighlightConfig(@Zc5(Ze = "containerBorder", ZS = "null") LineStyle paramLineStyle1, @Zc5(Ze = "lineSeparator", ZS = "null") LineStyle paramLineStyle2, @Zc5(Ze = "itemSeparator", ZS = "null") LineStyle paramLineStyle3, @Zc5(Ze = "mainDistributedSpace", ZS = "null") BoxStyle paramBoxStyle1, @Zc5(Ze = "crossDistributedSpace", ZS = "null") BoxStyle paramBoxStyle2, @Zc5(Ze = "rowGapSpace", ZS = "null") BoxStyle paramBoxStyle3, @Zc5(Ze = "columnGapSpace", ZS = "null") BoxStyle paramBoxStyle4, @Zc5(Ze = "crossAlignment", ZS = "null") LineStyle paramLineStyle4) {
    this.containerBorder = paramLineStyle1;
    this.lineSeparator = paramLineStyle2;
    this.itemSeparator = paramLineStyle3;
    this.mainDistributedSpace = paramBoxStyle1;
    this.crossDistributedSpace = paramBoxStyle2;
    this.rowGapSpace = paramBoxStyle3;
    Zbqc[] arrayOfZbqc = HighlightConfig.Zl();
    this.columnGapSpace = paramBoxStyle4;
    this.crossAlignment = paramLineStyle4;
    if (Zbqc.Zwu() == null)
      HighlightConfig.Zw(new Zbqc[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\overlay\FlexContainerHighlightConfig.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */