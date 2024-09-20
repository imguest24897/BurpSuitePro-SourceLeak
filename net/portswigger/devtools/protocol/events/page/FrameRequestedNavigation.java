package net.portswigger.devtools.protocol.events.page;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.types.page.ClientNavigationDisposition;
import net.portswigger.devtools.protocol.types.page.ClientNavigationReason;

@Zy
@Zsi("net.portswigger.devtools.protocol.events.page.FrameRequestedNavigation")
public class FrameRequestedNavigation implements Zl {
  @Zvd(Zp = "frameId")
  public final String frameId;
  
  @Zvd(Zp = "reason")
  public final ClientNavigationReason reason;
  
  @Zvd(Zp = "url")
  public final String url;
  
  @Zvd(Zp = "disposition")
  public final ClientNavigationDisposition disposition;
  
  @Zox
  public FrameRequestedNavigation(@Zc5(Ze = "frameId") String paramString1, @Zc5(Ze = "reason") ClientNavigationReason paramClientNavigationReason, @Zc5(Ze = "url") String paramString2, @Zc5(Ze = "disposition") ClientNavigationDisposition paramClientNavigationDisposition) {
    this.frameId = paramString1;
    this.reason = paramClientNavigationReason;
    this.url = paramString2;
    this.disposition = paramClientNavigationDisposition;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\page\FrameRequestedNavigation.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */