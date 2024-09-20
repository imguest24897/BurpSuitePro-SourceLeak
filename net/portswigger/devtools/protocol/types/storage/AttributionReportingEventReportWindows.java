package net.portswigger.devtools.protocol.types.storage;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.storage.AttributionReportingEventReportWindows")
public class AttributionReportingEventReportWindows {
  @Zvd(Zp = "start")
  public final Integer start;
  
  @Zvd(Zp = "ends")
  public final List<Integer> ends;
  
  @Zox
  public AttributionReportingEventReportWindows(@Zc5(Ze = "start") Integer paramInteger, @Zc5(Ze = "ends") List<Integer> paramList) {
    this.start = paramInteger;
    this.ends = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\storage\AttributionReportingEventReportWindows.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */