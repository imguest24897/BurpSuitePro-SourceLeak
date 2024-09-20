package net.portswigger.devtools.protocol.events.page;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.events.page.ScreencastVisibilityChanged")
public class ScreencastVisibilityChanged implements Zl {
  @Zvd(Zp = "visible")
  public final Boolean visible;
  
  @Zox
  public ScreencastVisibilityChanged(@Zc5(Ze = "visible") Boolean paramBoolean) {
    this.visible = paramBoolean;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\page\ScreencastVisibilityChanged.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */