package net.portswigger.devtools.protocol.events.page;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.page.ClientNavigationReason;

@Deprecated
@Zsi("net.portswigger.devtools.protocol.events.page.FrameScheduledNavigation")
public class FrameScheduledNavigation implements Zl {
  @Zvd(Zp = "frameId")
  public final String frameId;
  
  @Zvd(Zp = "delay")
  public final Double delay;
  
  @Zvd(Zp = "reason")
  public final ClientNavigationReason reason;
  
  @Zvd(Zp = "url")
  public final String url;
  
  @Zox
  public FrameScheduledNavigation(@Zc5(Ze = "frameId") String paramString1, @Zc5(Ze = "delay") Double paramDouble, @Zc5(Ze = "reason") ClientNavigationReason paramClientNavigationReason, @Zc5(Ze = "url") String paramString2) {
    this.frameId = paramString1;
    this.delay = paramDouble;
    this.reason = paramClientNavigationReason;
    this.url = paramString2;
    Zbqc[] arrayOfZbqc = ScreencastFrame.Zu();
    if (Zbqc.Zwu() == null)
      ScreencastFrame.Z_(new Zbqc[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\page\FrameScheduledNavigation.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */