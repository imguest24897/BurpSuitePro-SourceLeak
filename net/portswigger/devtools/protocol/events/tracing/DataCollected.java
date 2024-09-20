package net.portswigger.devtools.protocol.events.tracing;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zi7;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.events.tracing.DataCollected")
public class DataCollected implements Zl {
  @Zvd(Zp = "value")
  public final List<Zi7> value;
  
  @Zox
  public DataCollected(@Zc5(Ze = "value") List<Zi7> paramList) {
    this.value = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\tracing\DataCollected.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */