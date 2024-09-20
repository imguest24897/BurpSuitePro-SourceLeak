package net.portswigger.devtools.protocol.types.storage;

import burp.Zbqc;
import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.storage.AttributionReportingSourceRegistration")
public class AttributionReportingSourceRegistration {
  @Zvd(Zp = "time")
  public final Double time;
  
  @Zvd(Zp = "expiry")
  public final Integer expiry;
  
  @Zvd(Zp = "triggerSpecs")
  public final List<AttributionReportingTriggerSpec> triggerSpecs;
  
  @Zvd(Zp = "aggregatableReportWindow")
  public final Integer aggregatableReportWindow;
  
  @Zvd(Zp = "type")
  public final AttributionReportingSourceType type;
  
  @Zvd(Zp = "sourceOrigin")
  public final String sourceOrigin;
  
  @Zvd(Zp = "reportingOrigin")
  public final String reportingOrigin;
  
  @Zvd(Zp = "destinationSites")
  public final List<String> destinationSites;
  
  @Zvd(Zp = "eventId")
  public final String eventId;
  
  @Zvd(Zp = "priority")
  public final String priority;
  
  @Zvd(Zp = "filterData")
  public final List<AttributionReportingFilterDataEntry> filterData;
  
  @Zvd(Zp = "aggregationKeys")
  public final List<AttributionReportingAggregationKeysEntry> aggregationKeys;
  
  @Zvd(Zp = "debugKey")
  @Zj
  public final String debugKey;
  
  @Zvd(Zp = "triggerDataMatching")
  public final AttributionReportingTriggerDataMatching triggerDataMatching;
  
  @Zvd(Zp = "destinationLimitPriority")
  public final String destinationLimitPriority;
  
  @Zvd(Zp = "aggregatableDebugReportingConfig")
  public final AttributionReportingAggregatableDebugReportingConfig aggregatableDebugReportingConfig;
  
  @Zox
  public AttributionReportingSourceRegistration(@Zc5(Ze = "time") Double paramDouble, @Zc5(Ze = "expiry") Integer paramInteger1, @Zc5(Ze = "triggerSpecs") List<AttributionReportingTriggerSpec> paramList, @Zc5(Ze = "aggregatableReportWindow") Integer paramInteger2, @Zc5(Ze = "type") AttributionReportingSourceType paramAttributionReportingSourceType, @Zc5(Ze = "sourceOrigin") String paramString1, @Zc5(Ze = "reportingOrigin") String paramString2, @Zc5(Ze = "destinationSites") List<String> paramList1, @Zc5(Ze = "eventId") String paramString3, @Zc5(Ze = "priority") String paramString4, @Zc5(Ze = "filterData") List<AttributionReportingFilterDataEntry> paramList2, @Zc5(Ze = "aggregationKeys") List<AttributionReportingAggregationKeysEntry> paramList3, @Zc5(Ze = "debugKey", ZS = "null") String paramString5, @Zc5(Ze = "triggerDataMatching") AttributionReportingTriggerDataMatching paramAttributionReportingTriggerDataMatching, @Zc5(Ze = "destinationLimitPriority") String paramString6, @Zc5(Ze = "aggregatableDebugReportingConfig") AttributionReportingAggregatableDebugReportingConfig paramAttributionReportingAggregatableDebugReportingConfig) {
    this.time = paramDouble;
    this.expiry = paramInteger1;
    this.triggerSpecs = paramList;
    this.aggregatableReportWindow = paramInteger2;
    this.type = paramAttributionReportingSourceType;
    this.sourceOrigin = paramString1;
    this.reportingOrigin = paramString2;
    this.destinationSites = paramList1;
    this.eventId = paramString3;
    Zbqc[] arrayOfZbqc = UsageForType.ZE();
    this.priority = paramString4;
    this.filterData = paramList2;
    this.aggregationKeys = paramList3;
    this.debugKey = paramString5;
    this.triggerDataMatching = paramAttributionReportingTriggerDataMatching;
    this.destinationLimitPriority = paramString6;
    this.aggregatableDebugReportingConfig = paramAttributionReportingAggregatableDebugReportingConfig;
    if (arrayOfZbqc != null)
      Zbqc.Zr(new Zbqc[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\storage\AttributionReportingSourceRegistration.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */