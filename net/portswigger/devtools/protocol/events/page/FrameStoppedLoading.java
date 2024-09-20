package net.portswigger.devtools.protocol.events.page;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.events.page.FrameStoppedLoading")
public class FrameStoppedLoading implements Zl {
  @Zvd(Zp = "frameId")
  public final String frameId;
  
  @Zox
  public FrameStoppedLoading(@Zc5(Ze = "frameId") String paramString) {
    this.frameId = paramString;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\page\FrameStoppedLoading.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */