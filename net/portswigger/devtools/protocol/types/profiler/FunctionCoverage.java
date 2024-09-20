package net.portswigger.devtools.protocol.types.profiler;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.profiler.FunctionCoverage")
public class FunctionCoverage {
  @Zvd(Zp = "functionName")
  public final String functionName;
  
  @Zvd(Zp = "ranges")
  public final List<CoverageRange> ranges;
  
  @Zvd(Zp = "isBlockCoverage")
  public final Boolean isBlockCoverage;
  
  @Zox
  public FunctionCoverage(@Zc5(Ze = "functionName") String paramString, @Zc5(Ze = "ranges") List<CoverageRange> paramList, @Zc5(Ze = "isBlockCoverage") Boolean paramBoolean) {
    this.functionName = paramString;
    this.ranges = paramList;
    this.isBlockCoverage = paramBoolean;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\profiler\FunctionCoverage.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */