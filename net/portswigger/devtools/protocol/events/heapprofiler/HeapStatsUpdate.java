package net.portswigger.devtools.protocol.events.heapprofiler;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;

@Zsi("net.portswigger.devtools.protocol.events.heapprofiler.HeapStatsUpdate")
public class HeapStatsUpdate implements Zl {
  @Zvd(Zp = "statsUpdate")
  public final List<Integer> statsUpdate;
  
  @Zox
  public HeapStatsUpdate(@Zc5(Ze = "statsUpdate") List<Integer> paramList) {
    this.statsUpdate = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\heapprofiler\HeapStatsUpdate.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */