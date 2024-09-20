package net.portswigger.devtools.protocol.events.storage;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.types.storage.AttributionReportingAggregatableResult;
import net.portswigger.devtools.protocol.types.storage.AttributionReportingEventLevelResult;
import net.portswigger.devtools.protocol.types.storage.AttributionReportingTriggerRegistration;

@Zy
@Zsi("net.portswigger.devtools.protocol.events.storage.AttributionReportingTriggerRegistered")
public class AttributionReportingTriggerRegistered implements Zl {
  @Zvd(Zp = "registration")
  public final AttributionReportingTriggerRegistration registration;
  
  @Zvd(Zp = "eventLevel")
  public final AttributionReportingEventLevelResult eventLevel;
  
  @Zvd(Zp = "aggregatable")
  public final AttributionReportingAggregatableResult aggregatable;
  
  @Zox
  public AttributionReportingTriggerRegistered(@Zc5(Ze = "registration") AttributionReportingTriggerRegistration paramAttributionReportingTriggerRegistration, @Zc5(Ze = "eventLevel") AttributionReportingEventLevelResult paramAttributionReportingEventLevelResult, @Zc5(Ze = "aggregatable") AttributionReportingAggregatableResult paramAttributionReportingAggregatableResult) {
    this.registration = paramAttributionReportingTriggerRegistration;
    this.eventLevel = paramAttributionReportingEventLevelResult;
    this.aggregatable = paramAttributionReportingAggregatableResult;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\storage\AttributionReportingTriggerRegistered.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */