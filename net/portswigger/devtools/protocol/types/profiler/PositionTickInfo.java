package net.portswigger.devtools.protocol.types.profiler;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.profiler.PositionTickInfo")
public class PositionTickInfo {
  @Zvd(Zp = "line")
  public final Integer line;
  
  @Zvd(Zp = "ticks")
  public final Integer ticks;
  
  @Zox
  public PositionTickInfo(@Zc5(Ze = "line") Integer paramInteger1, @Zc5(Ze = "ticks") Integer paramInteger2) {
    this.line = paramInteger1;
    this.ticks = paramInteger2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\profiler\PositionTickInfo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */