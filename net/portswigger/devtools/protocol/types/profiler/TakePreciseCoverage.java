package net.portswigger.devtools.protocol.types.profiler;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.profiler.TakePreciseCoverage")
public class TakePreciseCoverage {
  @Zvd(Zp = "result")
  public final List<ScriptCoverage> result;
  
  @Zvd(Zp = "timestamp")
  public final Double timestamp;
  
  private static int Zn;
  
  @Zox
  public TakePreciseCoverage(@Zc5(Ze = "result") List<ScriptCoverage> paramList, @Zc5(Ze = "timestamp") Double paramDouble) {
    this.result = paramList;
    this.timestamp = paramDouble;
  }
  
  public static void ZN(int paramInt) {
    Zn = paramInt;
  }
  
  public static int ZO() {
    return Zn;
  }
  
  public static int ZK() {
    int i = ZO();
    return (i == 0) ? 122 : 0;
  }
  
  static {
    if (ZK() == 0)
      ZN(68); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\profiler\TakePreciseCoverage.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */