package net.portswigger.devtools.protocol.types.headlessexperimental;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.headlessexperimental.ScreenshotParams")
public class ScreenshotParams {
  @Zvd(Zp = "format")
  @Zj
  public final ScreenshotParamsFormat format;
  
  @Zvd(Zp = "quality")
  @Zj
  public final Integer quality;
  
  @Zvd(Zp = "optimizeForSpeed")
  @Zj
  public final Boolean optimizeForSpeed;
  
  @Zox
  public ScreenshotParams(@Zc5(Ze = "format", ZS = "null") ScreenshotParamsFormat paramScreenshotParamsFormat, @Zc5(Ze = "quality", ZS = "null") Integer paramInteger, @Zc5(Ze = "optimizeForSpeed", ZS = "null") Boolean paramBoolean) {
    this.format = paramScreenshotParamsFormat;
    this.quality = paramInteger;
    int[] arrayOfInt = ScreenshotParamsFormat.ZX();
    this.optimizeForSpeed = paramBoolean;
    if (arrayOfInt != null)
      Zbqc.Zr(new Zbqc[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\headlessexperimental\ScreenshotParams.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */