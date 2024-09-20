package net.portswigger.devtools.protocol.events.overlay;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.page.Viewport;

@Zsi("net.portswigger.devtools.protocol.events.overlay.ScreenshotRequested")
public class ScreenshotRequested implements Zl {
  @Zvd(Zp = "viewport")
  public final Viewport viewport;
  
  private static boolean ZT;
  
  @Zox
  public ScreenshotRequested(@Zc5(Ze = "viewport") Viewport paramViewport) {
    boolean bool = ZL();
    this.viewport = paramViewport;
    if (Zbqc.Zwu() == null)
      Zz(!bool); 
  }
  
  public static void Zz(boolean paramBoolean) {
    ZT = paramBoolean;
  }
  
  public static boolean ZZ() {
    return ZT;
  }
  
  public static boolean ZL() {
    boolean bool = ZZ();
    return !bool;
  }
  
  static {
    if (ZZ())
      Zz(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\overlay\ScreenshotRequested.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */