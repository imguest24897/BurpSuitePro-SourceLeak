package net.portswigger.devtools.protocol.types.overlay;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.types.dom.RGBA;

@Zsi("net.portswigger.devtools.protocol.types.overlay.HighlightConfig")
public class HighlightConfig {
  @Zvd(Zp = "showInfo")
  @Zj
  public final Boolean showInfo;
  
  @Zvd(Zp = "showStyles")
  @Zj
  public final Boolean showStyles;
  
  @Zvd(Zp = "showRulers")
  @Zj
  public final Boolean showRulers;
  
  @Zvd(Zp = "showAccessibilityInfo")
  @Zj
  public final Boolean showAccessibilityInfo;
  
  @Zvd(Zp = "showExtensionLines")
  @Zj
  public final Boolean showExtensionLines;
  
  @Zvd(Zp = "contentColor")
  @Zj
  public final RGBA contentColor;
  
  @Zvd(Zp = "paddingColor")
  @Zj
  public final RGBA paddingColor;
  
  @Zvd(Zp = "borderColor")
  @Zj
  public final RGBA borderColor;
  
  @Zvd(Zp = "marginColor")
  @Zj
  public final RGBA marginColor;
  
  @Zvd(Zp = "eventTargetColor")
  @Zj
  public final RGBA eventTargetColor;
  
  @Zvd(Zp = "shapeColor")
  @Zj
  public final RGBA shapeColor;
  
  @Zvd(Zp = "shapeMarginColor")
  @Zj
  public final RGBA shapeMarginColor;
  
  @Zvd(Zp = "cssGridColor")
  @Zj
  public final RGBA cssGridColor;
  
  @Zvd(Zp = "colorFormat")
  @Zj
  public final ColorFormat colorFormat;
  
  @Zvd(Zp = "gridHighlightConfig")
  @Zj
  public final GridHighlightConfig gridHighlightConfig;
  
  @Zvd(Zp = "flexContainerHighlightConfig")
  @Zj
  public final FlexContainerHighlightConfig flexContainerHighlightConfig;
  
  @Zvd(Zp = "flexItemHighlightConfig")
  @Zj
  public final FlexItemHighlightConfig flexItemHighlightConfig;
  
  @Zvd(Zp = "contrastAlgorithm")
  @Zj
  public final ContrastAlgorithm contrastAlgorithm;
  
  @Zvd(Zp = "containerQueryContainerHighlightConfig")
  @Zj
  public final ContainerQueryContainerHighlightConfig containerQueryContainerHighlightConfig;
  
  private static Zbqc[] Zv;
  
  @Zox
  public HighlightConfig(@Zc5(Ze = "showInfo", ZS = "null") Boolean paramBoolean1, @Zc5(Ze = "showStyles", ZS = "null") Boolean paramBoolean2, @Zc5(Ze = "showRulers", ZS = "null") Boolean paramBoolean3, @Zc5(Ze = "showAccessibilityInfo", ZS = "null") Boolean paramBoolean4, @Zc5(Ze = "showExtensionLines", ZS = "null") Boolean paramBoolean5, @Zc5(Ze = "contentColor", ZS = "null") RGBA paramRGBA1, @Zc5(Ze = "paddingColor", ZS = "null") RGBA paramRGBA2, @Zc5(Ze = "borderColor", ZS = "null") RGBA paramRGBA3, @Zc5(Ze = "marginColor", ZS = "null") RGBA paramRGBA4, @Zc5(Ze = "eventTargetColor", ZS = "null") RGBA paramRGBA5, @Zc5(Ze = "shapeColor", ZS = "null") RGBA paramRGBA6, @Zc5(Ze = "shapeMarginColor", ZS = "null") RGBA paramRGBA7, @Zc5(Ze = "cssGridColor", ZS = "null") RGBA paramRGBA8, @Zc5(Ze = "colorFormat", ZS = "null") ColorFormat paramColorFormat, @Zc5(Ze = "gridHighlightConfig", ZS = "null") GridHighlightConfig paramGridHighlightConfig, @Zc5(Ze = "flexContainerHighlightConfig", ZS = "null") FlexContainerHighlightConfig paramFlexContainerHighlightConfig, @Zc5(Ze = "flexItemHighlightConfig", ZS = "null") FlexItemHighlightConfig paramFlexItemHighlightConfig, @Zc5(Ze = "contrastAlgorithm", ZS = "null") ContrastAlgorithm paramContrastAlgorithm, @Zc5(Ze = "containerQueryContainerHighlightConfig", ZS = "null") ContainerQueryContainerHighlightConfig paramContainerQueryContainerHighlightConfig) {
    this.showInfo = paramBoolean1;
    this.showStyles = paramBoolean2;
    this.showRulers = paramBoolean3;
    this.showAccessibilityInfo = paramBoolean4;
    this.showExtensionLines = paramBoolean5;
    this.contentColor = paramRGBA1;
    this.paddingColor = paramRGBA2;
    this.borderColor = paramRGBA3;
    this.marginColor = paramRGBA4;
    this.eventTargetColor = paramRGBA5;
    this.shapeColor = paramRGBA6;
    this.shapeMarginColor = paramRGBA7;
    this.cssGridColor = paramRGBA8;
    this.colorFormat = paramColorFormat;
    this.gridHighlightConfig = paramGridHighlightConfig;
    this.flexContainerHighlightConfig = paramFlexContainerHighlightConfig;
    this.flexItemHighlightConfig = paramFlexItemHighlightConfig;
    this.contrastAlgorithm = paramContrastAlgorithm;
    this.containerQueryContainerHighlightConfig = paramContainerQueryContainerHighlightConfig;
  }
  
  public static void Zw(Zbqc[] paramArrayOfZbqc) {
    Zv = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zl() {
    return Zv;
  }
  
  static {
    if (Zl() == null)
      Zw(new Zbqc[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\overlay\HighlightConfig.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */