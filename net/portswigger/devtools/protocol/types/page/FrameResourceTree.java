package net.portswigger.devtools.protocol.types.page;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.page.FrameResourceTree")
public class FrameResourceTree {
  @Zvd(Zp = "frame")
  public final Frame frame;
  
  @Zvd(Zp = "childFrames")
  @Zj
  public final List<FrameResourceTree> childFrames;
  
  @Zvd(Zp = "resources")
  public final List<FrameResource> resources;
  
  @Zox
  public FrameResourceTree(@Zc5(Ze = "frame") Frame paramFrame, @Zc5(Ze = "childFrames", ZS = "null") List<FrameResourceTree> paramList, @Zc5(Ze = "resources") List<FrameResource> paramList1) {
    this.frame = paramFrame;
    this.childFrames = paramList;
    this.resources = paramList1;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\page\FrameResourceTree.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */