package net.portswigger.devtools.protocol.types.overlay;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.types.dom.RGBA;

@Zsi("net.portswigger.devtools.protocol.types.overlay.GridHighlightConfig")
public class GridHighlightConfig {
  @Zvd(Zp = "showGridExtensionLines")
  @Zj
  public final Boolean showGridExtensionLines;
  
  @Zvd(Zp = "showPositiveLineNumbers")
  @Zj
  public final Boolean showPositiveLineNumbers;
  
  @Zvd(Zp = "showNegativeLineNumbers")
  @Zj
  public final Boolean showNegativeLineNumbers;
  
  @Zvd(Zp = "showAreaNames")
  @Zj
  public final Boolean showAreaNames;
  
  @Zvd(Zp = "showLineNames")
  @Zj
  public final Boolean showLineNames;
  
  @Zvd(Zp = "showTrackSizes")
  @Zj
  public final Boolean showTrackSizes;
  
  @Zvd(Zp = "gridBorderColor")
  @Zj
  public final RGBA gridBorderColor;
  
  @Zvd(Zp = "cellBorderColor")
  @Deprecated
  @Zj
  public final RGBA cellBorderColor;
  
  @Zvd(Zp = "rowLineColor")
  @Zj
  public final RGBA rowLineColor;
  
  @Zvd(Zp = "columnLineColor")
  @Zj
  public final RGBA columnLineColor;
  
  @Zvd(Zp = "gridBorderDash")
  @Zj
  public final Boolean gridBorderDash;
  
  @Zvd(Zp = "cellBorderDash")
  @Deprecated
  @Zj
  public final Boolean cellBorderDash;
  
  @Zvd(Zp = "rowLineDash")
  @Zj
  public final Boolean rowLineDash;
  
  @Zvd(Zp = "columnLineDash")
  @Zj
  public final Boolean columnLineDash;
  
  @Zvd(Zp = "rowGapColor")
  @Zj
  public final RGBA rowGapColor;
  
  @Zvd(Zp = "rowHatchColor")
  @Zj
  public final RGBA rowHatchColor;
  
  @Zvd(Zp = "columnGapColor")
  @Zj
  public final RGBA columnGapColor;
  
  @Zvd(Zp = "columnHatchColor")
  @Zj
  public final RGBA columnHatchColor;
  
  @Zvd(Zp = "areaBorderColor")
  @Zj
  public final RGBA areaBorderColor;
  
  @Zvd(Zp = "gridBackgroundColor")
  @Zj
  public final RGBA gridBackgroundColor;
  
  @Zox
  public GridHighlightConfig(@Zc5(Ze = "showGridExtensionLines", ZS = "null") Boolean paramBoolean1, @Zc5(Ze = "showPositiveLineNumbers", ZS = "null") Boolean paramBoolean2, @Zc5(Ze = "showNegativeLineNumbers", ZS = "null") Boolean paramBoolean3, @Zc5(Ze = "showAreaNames", ZS = "null") Boolean paramBoolean4, @Zc5(Ze = "showLineNames", ZS = "null") Boolean paramBoolean5, @Zc5(Ze = "showTrackSizes", ZS = "null") Boolean paramBoolean6, @Zc5(Ze = "gridBorderColor", ZS = "null") RGBA paramRGBA1, @Zc5(Ze = "cellBorderColor", ZS = "null") RGBA paramRGBA2, @Zc5(Ze = "rowLineColor", ZS = "null") RGBA paramRGBA3, @Zc5(Ze = "columnLineColor", ZS = "null") RGBA paramRGBA4, @Zc5(Ze = "gridBorderDash", ZS = "null") Boolean paramBoolean7, @Zc5(Ze = "cellBorderDash", ZS = "null") Boolean paramBoolean8, @Zc5(Ze = "rowLineDash", ZS = "null") Boolean paramBoolean9, @Zc5(Ze = "columnLineDash", ZS = "null") Boolean paramBoolean10, @Zc5(Ze = "rowGapColor", ZS = "null") RGBA paramRGBA5, @Zc5(Ze = "rowHatchColor", ZS = "null") RGBA paramRGBA6, @Zc5(Ze = "columnGapColor", ZS = "null") RGBA paramRGBA7, @Zc5(Ze = "columnHatchColor", ZS = "null") RGBA paramRGBA8, @Zc5(Ze = "areaBorderColor", ZS = "null") RGBA paramRGBA9, @Zc5(Ze = "gridBackgroundColor", ZS = "null") RGBA paramRGBA10) {
    this.showGridExtensionLines = paramBoolean1;
    Zbqc[] arrayOfZbqc = HighlightConfig.Zl();
    this.showPositiveLineNumbers = paramBoolean2;
    this.showNegativeLineNumbers = paramBoolean3;
    this.showAreaNames = paramBoolean4;
    this.showLineNames = paramBoolean5;
    this.showTrackSizes = paramBoolean6;
    this.gridBorderColor = paramRGBA1;
    this.cellBorderColor = paramRGBA2;
    this.rowLineColor = paramRGBA3;
    this.columnLineColor = paramRGBA4;
    this.gridBorderDash = paramBoolean7;
    this.cellBorderDash = paramBoolean8;
    this.rowLineDash = paramBoolean9;
    this.columnLineDash = paramBoolean10;
    this.rowGapColor = paramRGBA5;
    this.rowHatchColor = paramRGBA6;
    this.columnGapColor = paramRGBA7;
    this.columnHatchColor = paramRGBA8;
    this.areaBorderColor = paramRGBA9;
    this.gridBackgroundColor = paramRGBA10;
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\overlay\GridHighlightConfig.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */