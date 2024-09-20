package net.portswigger.devtools.protocol.types.profiler;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.profiler.CoverageRange")
public class CoverageRange {
  @Zvd(Zp = "startOffset")
  public final Integer startOffset;
  
  @Zvd(Zp = "endOffset")
  public final Integer endOffset;
  
  @Zvd(Zp = "count")
  public final Integer count;
  
  @Zox
  public CoverageRange(@Zc5(Ze = "startOffset") Integer paramInteger1, @Zc5(Ze = "endOffset") Integer paramInteger2, @Zc5(Ze = "count") Integer paramInteger3) {
    this.startOffset = paramInteger1;
    this.endOffset = paramInteger2;
    this.count = paramInteger3;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\profiler\CoverageRange.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */