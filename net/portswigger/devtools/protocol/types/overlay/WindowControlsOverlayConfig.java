package net.portswigger.devtools.protocol.types.overlay;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.overlay.WindowControlsOverlayConfig")
public class WindowControlsOverlayConfig {
  @Zvd(Zp = "showCSS")
  public final Boolean showCSS;
  
  @Zvd(Zp = "selectedPlatform")
  public final String selectedPlatform;
  
  @Zvd(Zp = "themeColor")
  public final String themeColor;
  
  @Zox
  public WindowControlsOverlayConfig(@Zc5(Ze = "showCSS") Boolean paramBoolean, @Zc5(Ze = "selectedPlatform") String paramString1, @Zc5(Ze = "themeColor") String paramString2) {
    this.showCSS = paramBoolean;
    this.selectedPlatform = paramString1;
    this.themeColor = paramString2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\overlay\WindowControlsOverlayConfig.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */