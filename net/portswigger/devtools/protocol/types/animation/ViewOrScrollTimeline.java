package net.portswigger.devtools.protocol.types.animation;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.types.dom.ScrollOrientation;

@Zsi("net.portswigger.devtools.protocol.types.animation.ViewOrScrollTimeline")
public class ViewOrScrollTimeline {
  @Zvd(Zp = "sourceNodeId")
  @Zj
  public final Integer sourceNodeId;
  
  @Zvd(Zp = "startOffset")
  @Zj
  public final Double startOffset;
  
  @Zvd(Zp = "endOffset")
  @Zj
  public final Double endOffset;
  
  @Zvd(Zp = "subjectNodeId")
  @Zj
  public final Integer subjectNodeId;
  
  @Zvd(Zp = "axis")
  public final ScrollOrientation axis;
  
  private static String[] Zx;
  
  @Zox
  public ViewOrScrollTimeline(@Zc5(Ze = "sourceNodeId", ZS = "null") Integer paramInteger1, @Zc5(Ze = "startOffset", ZS = "null") Double paramDouble1, @Zc5(Ze = "endOffset", ZS = "null") Double paramDouble2, @Zc5(Ze = "subjectNodeId", ZS = "null") Integer paramInteger2, @Zc5(Ze = "axis") ScrollOrientation paramScrollOrientation) {
    this.sourceNodeId = paramInteger1;
    this.startOffset = paramDouble1;
    this.endOffset = paramDouble2;
    this.subjectNodeId = paramInteger2;
    this.axis = paramScrollOrientation;
  }
  
  public static void Zk(String[] paramArrayOfString) {
    Zx = paramArrayOfString;
  }
  
  public static String[] ZP() {
    return Zx;
  }
  
  static {
    if (ZP() != null)
      Zk(new String[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\animation\ViewOrScrollTimeline.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */