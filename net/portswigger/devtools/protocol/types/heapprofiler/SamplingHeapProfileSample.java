package net.portswigger.devtools.protocol.types.heapprofiler;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.heapprofiler.SamplingHeapProfileSample")
public class SamplingHeapProfileSample {
  @Zvd(Zp = "size")
  public final Double size;
  
  @Zvd(Zp = "nodeId")
  public final Integer nodeId;
  
  @Zvd(Zp = "ordinal")
  public final Double ordinal;
  
  private static Zbqc[] Zn;
  
  @Zox
  public SamplingHeapProfileSample(@Zc5(Ze = "size") Double paramDouble1, @Zc5(Ze = "nodeId") Integer paramInteger, @Zc5(Ze = "ordinal") Double paramDouble2) {
    this.size = paramDouble1;
    Zbqc[] arrayOfZbqc = Ze();
    this.nodeId = paramInteger;
    this.ordinal = paramDouble2;
    if (Zbqc.Zwu() == null)
      Z_(new Zbqc[2]); 
  }
  
  public static void Z_(Zbqc[] paramArrayOfZbqc) {
    Zn = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Ze() {
    return Zn;
  }
  
  static {
    if (Ze() != null)
      Z_(new Zbqc[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\heapprofiler\SamplingHeapProfileSample.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */