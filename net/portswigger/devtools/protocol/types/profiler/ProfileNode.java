package net.portswigger.devtools.protocol.types.profiler;

import burp.Zbqc;
import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.types.runtime.CallFrame;

@Zsi("net.portswigger.devtools.protocol.types.profiler.ProfileNode")
public class ProfileNode {
  @Zvd(Zp = "id")
  public final Integer id;
  
  @Zvd(Zp = "callFrame")
  public final CallFrame callFrame;
  
  @Zvd(Zp = "hitCount")
  @Zj
  public final Integer hitCount;
  
  @Zvd(Zp = "children")
  @Zj
  public final List<Integer> children;
  
  @Zvd(Zp = "deoptReason")
  @Zj
  public final String deoptReason;
  
  @Zvd(Zp = "positionTicks")
  @Zj
  public final List<PositionTickInfo> positionTicks;
  
  @Zox
  public ProfileNode(@Zc5(Ze = "id") Integer paramInteger1, @Zc5(Ze = "callFrame") CallFrame paramCallFrame, @Zc5(Ze = "hitCount", ZS = "null") Integer paramInteger2, @Zc5(Ze = "children", ZS = "null") List<Integer> paramList, @Zc5(Ze = "deoptReason", ZS = "null") String paramString, @Zc5(Ze = "positionTicks", ZS = "null") List<PositionTickInfo> paramList1) {
    int i = TakePreciseCoverage.ZK();
    this.id = paramInteger1;
    this.callFrame = paramCallFrame;
    this.hitCount = paramInteger2;
    this.children = paramList;
    this.deoptReason = paramString;
    this.positionTicks = paramList1;
    if (i == 0)
      Zbqc.Zr(new Zbqc[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\profiler\ProfileNode.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */