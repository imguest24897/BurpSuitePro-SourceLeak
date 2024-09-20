package net.portswigger.devtools.protocol.events.page;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.types.page.Frame;
import net.portswigger.devtools.protocol.types.page.NavigationType;

@Zsi("net.portswigger.devtools.protocol.events.page.FrameNavigated")
public class FrameNavigated implements Zl {
  @Zvd(Zp = "frame")
  public final Frame frame;
  
  @Zvd(Zp = "type")
  @Zy
  public final NavigationType type;
  
  @Zox
  public FrameNavigated(@Zc5(Ze = "frame") Frame paramFrame, @Zc5(Ze = "type") NavigationType paramNavigationType) {
    this.frame = paramFrame;
    this.type = paramNavigationType;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\page\FrameNavigated.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */