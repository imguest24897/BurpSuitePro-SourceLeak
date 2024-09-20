package net.portswigger.devtools.protocol.types.storage;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.storage.AttributionReportingTriggerSpec")
public class AttributionReportingTriggerSpec {
  @Zvd(Zp = "triggerData")
  public final List<Double> triggerData;
  
  @Zvd(Zp = "eventReportWindows")
  public final AttributionReportingEventReportWindows eventReportWindows;
  
  @Zox
  public AttributionReportingTriggerSpec(@Zc5(Ze = "triggerData") List<Double> paramList, @Zc5(Ze = "eventReportWindows") AttributionReportingEventReportWindows paramAttributionReportingEventReportWindows) {
    this.triggerData = paramList;
    this.eventReportWindows = paramAttributionReportingEventReportWindows;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\storage\AttributionReportingTriggerSpec.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */