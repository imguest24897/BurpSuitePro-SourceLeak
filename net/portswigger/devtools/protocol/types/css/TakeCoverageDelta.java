package net.portswigger.devtools.protocol.types.css;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.css.TakeCoverageDelta")
public class TakeCoverageDelta {
  @Zvd(Zp = "coverage")
  public final List<RuleUsage> coverage;
  
  @Zvd(Zp = "timestamp")
  public final Double timestamp;
  
  @Zox
  public TakeCoverageDelta(@Zc5(Ze = "coverage") List<RuleUsage> paramList, @Zc5(Ze = "timestamp") Double paramDouble) {
    this.coverage = paramList;
    this.timestamp = paramDouble;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\css\TakeCoverageDelta.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */