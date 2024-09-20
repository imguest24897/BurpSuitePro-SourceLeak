package net.portswigger.devtools.protocol.events.page;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.runtime.StackTrace;

@Zsi("net.portswigger.devtools.protocol.events.page.FrameAttached")
public class FrameAttached implements Zl {
  @Zvd(Zp = "frameId")
  public final String frameId;
  
  @Zvd(Zp = "parentFrameId")
  public final String parentFrameId;
  
  @Zvd(Zp = "stack")
  @Zj
  public final StackTrace stack;
  
  @Zox
  public FrameAttached(@Zc5(Ze = "frameId") String paramString1, @Zc5(Ze = "parentFrameId") String paramString2, @Zc5(Ze = "stack", ZS = "null") StackTrace paramStackTrace) {
    this.frameId = paramString1;
    this.parentFrameId = paramString2;
    this.stack = paramStackTrace;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\page\FrameAttached.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */