package net.portswigger.devtools.protocol.events.page;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;

@Deprecated
@Zsi("net.portswigger.devtools.protocol.events.page.FrameClearedScheduledNavigation")
public class FrameClearedScheduledNavigation implements Zl {
  @Zvd(Zp = "frameId")
  public final String frameId;
  
  @Zox
  public FrameClearedScheduledNavigation(@Zc5(Ze = "frameId") String paramString) {
    this.frameId = paramString;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\page\FrameClearedScheduledNavigation.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */