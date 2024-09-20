package net.portswigger.devtools.protocol.types.headlessexperimental;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.headlessexperimental.BeginFrame")
public class BeginFrame {
  @Zvd(Zp = "hasDamage")
  public final Boolean hasDamage;
  
  @Zvd(Zp = "screenshotData")
  @Zj
  public final String screenshotData;
  
  @Zox
  public BeginFrame(@Zc5(Ze = "hasDamage") Boolean paramBoolean, @Zc5(Ze = "screenshotData", ZS = "null") String paramString) {
    this.hasDamage = paramBoolean;
    this.screenshotData = paramString;
    int[] arrayOfInt = ScreenshotParamsFormat.ZX();
    if (Zbqc.Zwu() == null)
      ScreenshotParamsFormat.Zg(new int[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\headlessexperimental\BeginFrame.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */