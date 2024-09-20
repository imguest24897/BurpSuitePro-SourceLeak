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
@Zsi("net.portswigger.devtools.protocol.types.storage.AttributionReportingTriggerRegistration")
public class AttributionReportingTriggerRegistration {
  @Zvd(Zp = "filters")
  public final AttributionReportingFilterPair filters;
  
  @Zvd(Zp = "debugKey")
  @Zj
  public final String debugKey;
  
  @Zvd(Zp = "aggregatableDedupKeys")
  public final List<AttributionReportingAggregatableDedupKey> aggregatableDedupKeys;
  
  @Zvd(Zp = "eventTriggerData")
  public final List<AttributionReportingEventTriggerData> eventTriggerData;
  
  @Zvd(Zp = "aggregatableTriggerData")
  public final List<AttributionReportingAggregatableTriggerData> aggregatableTriggerData;
  
  @Zvd(Zp = "aggregatableValues")
  public final List<AttributionReportingAggregatableValueEntry> aggregatableValues;
  
  @Zvd(Zp = "aggregatableFilteringIdMaxBytes")
  public final Integer aggregatableFilteringIdMaxBytes;
  
  @Zvd(Zp = "debugReporting")
  public final Boolean debugReporting;
  
  @Zvd(Zp = "aggregationCoordinatorOrigin")
  @Zj
  public final String aggregationCoordinatorOrigin;
  
  @Zvd(Zp = "sourceRegistrationTimeConfig")
  public final AttributionReportingSourceRegistrationTimeConfig sourceRegistrationTimeConfig;
  
  @Zvd(Zp = "triggerContextId")
  @Zj
  public final String triggerContextId;
  
  @Zvd(Zp = "aggregatableDebugReportingConfig")
  public final AttributionReportingAggregatableDebugReportingConfig aggregatableDebugReportingConfig;
  
  @Zox
  public AttributionReportingTriggerRegistration(@Zc5(Ze = "filters") AttributionReportingFilterPair paramAttributionReportingFilterPair, @Zc5(Ze = "debugKey", ZS = "null") String paramString1, @Zc5(Ze = "aggregatableDedupKeys") List<AttributionReportingAggregatableDedupKey> paramList, @Zc5(Ze = "eventTriggerData") List<AttributionReportingEventTriggerData> paramList1, @Zc5(Ze = "aggregatableTriggerData") List<AttributionReportingAggregatableTriggerData> paramList2, @Zc5(Ze = "aggregatableValues") List<AttributionReportingAggregatableValueEntry> paramList3, @Zc5(Ze = "aggregatableFilteringIdMaxBytes") Integer paramInteger, @Zc5(Ze = "debugReporting") Boolean paramBoolean, @Zc5(Ze = "aggregationCoordinatorOrigin", ZS = "null") String paramString2, @Zc5(Ze = "sourceRegistrationTimeConfig") AttributionReportingSourceRegistrationTimeConfig paramAttributionReportingSourceRegistrationTimeConfig, @Zc5(Ze = "triggerContextId", ZS = "null") String paramString3, @Zc5(Ze = "aggregatableDebugReportingConfig") AttributionReportingAggregatableDebugReportingConfig paramAttributionReportingAggregatableDebugReportingConfig) {
    this.filters = paramAttributionReportingFilterPair;
    this.debugKey = paramString1;
    this.aggregatableDedupKeys = paramList;
    Zbqc[] arrayOfZbqc = UsageForType.ZE();
    this.eventTriggerData = paramList1;
    this.aggregatableTriggerData = paramList2;
    this.aggregatableValues = paramList3;
    this.aggregatableFilteringIdMaxBytes = paramInteger;
    this.debugReporting = paramBoolean;
    this.aggregationCoordinatorOrigin = paramString2;
    this.sourceRegistrationTimeConfig = paramAttributionReportingSourceRegistrationTimeConfig;
    this.triggerContextId = paramString3;
    this.aggregatableDebugReportingConfig = paramAttributionReportingAggregatableDebugReportingConfig;
    if (Zbqc.Zwu() == null)
      UsageForType.ZM(new Zbqc[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\storage\AttributionReportingTriggerRegistration.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */