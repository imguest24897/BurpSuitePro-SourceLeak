package net.portswigger.devtools.protocol.types.heapprofiler;

import burp.Zbqc;
import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.types.runtime.CallFrame;

@Zsi("net.portswigger.devtools.protocol.types.heapprofiler.SamplingHeapProfileNode")
public class SamplingHeapProfileNode {
  @Zvd(Zp = "callFrame")
  public final CallFrame callFrame;
  
  @Zvd(Zp = "selfSize")
  public final Double selfSize;
  
  @Zvd(Zp = "id")
  public final Integer id;
  
  @Zvd(Zp = "children")
  public final List<SamplingHeapProfileNode> children;
  
  @Zox
  public SamplingHeapProfileNode(@Zc5(Ze = "callFrame") CallFrame paramCallFrame, @Zc5(Ze = "selfSize") Double paramDouble, @Zc5(Ze = "id") Integer paramInteger, @Zc5(Ze = "children") List<SamplingHeapProfileNode> paramList) {
    this.callFrame = paramCallFrame;
    Zbqc[] arrayOfZbqc = SamplingHeapProfileSample.Ze();
    this.selfSize = paramDouble;
    this.id = paramInteger;
    this.children = paramList;
    if (arrayOfZbqc != null)
      Zbqc.Zr(new Zbqc[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\heapprofiler\SamplingHeapProfileNode.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */