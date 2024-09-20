package net.portswigger.devtools.protocol.events.profiler;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.types.profiler.ScriptCoverage;

@Zy
@Zsi("net.portswigger.devtools.protocol.events.profiler.PreciseCoverageDeltaUpdate")
public class PreciseCoverageDeltaUpdate implements Zl {
  @Zvd(Zp = "timestamp")
  public final Double timestamp;
  
  @Zvd(Zp = "occasion")
  public final String occasion;
  
  @Zvd(Zp = "result")
  public final List<ScriptCoverage> result;
  
  private static boolean Zs;
  
  @Zox
  public PreciseCoverageDeltaUpdate(@Zc5(Ze = "timestamp") Double paramDouble, @Zc5(Ze = "occasion") String paramString, @Zc5(Ze = "result") List<ScriptCoverage> paramList) {
    this.timestamp = paramDouble;
    this.occasion = paramString;
    this.result = paramList;
  }
  
  public static void Zn(boolean paramBoolean) {
    Zs = paramBoolean;
  }
  
  public static boolean Zx() {
    return Zs;
  }
  
  public static boolean ZU() {
    boolean bool = Zx();
    return !bool;
  }
  
  static {
    if (ZU())
      Zn(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\profiler\PreciseCoverageDeltaUpdate.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */