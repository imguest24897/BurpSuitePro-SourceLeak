package net.portswigger.devtools.protocol.events.page;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;

@Zsi("net.portswigger.devtools.protocol.events.page.FrameDetached")
public class FrameDetached implements Zl {
  @Zvd(Zp = "frameId")
  public final String frameId;
  
  @Zvd(Zp = "reason")
  @Zy
  public final FrameDetachedReason reason;
  
  @Zox
  public FrameDetached(@Zc5(Ze = "frameId") String paramString, @Zc5(Ze = "reason") FrameDetachedReason paramFrameDetachedReason) {
    this.frameId = paramString;
    this.reason = paramFrameDetachedReason;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\page\FrameDetached.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */