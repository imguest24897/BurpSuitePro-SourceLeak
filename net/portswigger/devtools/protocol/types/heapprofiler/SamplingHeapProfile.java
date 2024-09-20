package net.portswigger.devtools.protocol.types.heapprofiler;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.heapprofiler.SamplingHeapProfile")
public class SamplingHeapProfile {
  @Zvd(Zp = "head")
  public final SamplingHeapProfileNode head;
  
  @Zvd(Zp = "samples")
  public final List<SamplingHeapProfileSample> samples;
  
  @Zox
  public SamplingHeapProfile(@Zc5(Ze = "head") SamplingHeapProfileNode paramSamplingHeapProfileNode, @Zc5(Ze = "samples") List<SamplingHeapProfileSample> paramList) {
    this.head = paramSamplingHeapProfileNode;
    this.samples = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\heapprofiler\SamplingHeapProfile.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */