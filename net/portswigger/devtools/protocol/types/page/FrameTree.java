package net.portswigger.devtools.protocol.types.page;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.page.FrameTree")
public class FrameTree {
  @Zvd(Zp = "frame")
  public final Frame frame;
  
  @Zvd(Zp = "childFrames")
  @Zj
  public final List<FrameTree> childFrames;
  
  @Zox
  public FrameTree(@Zc5(Ze = "frame") Frame paramFrame, @Zc5(Ze = "childFrames", ZS = "null") List<FrameTree> paramList) {
    this.frame = paramFrame;
    this.childFrames = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\page\FrameTree.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */