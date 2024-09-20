package net.portswigger.devtools.protocol.events.storage;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.types.storage.AttributionReportingSourceRegistration;
import net.portswigger.devtools.protocol.types.storage.AttributionReportingSourceRegistrationResult;

@Zy
@Zsi("net.portswigger.devtools.protocol.events.storage.AttributionReportingSourceRegistered")
public class AttributionReportingSourceRegistered implements Zl {
  @Zvd(Zp = "registration")
  public final AttributionReportingSourceRegistration registration;
  
  @Zvd(Zp = "result")
  public final AttributionReportingSourceRegistrationResult result;
  
  @Zox
  public AttributionReportingSourceRegistered(@Zc5(Ze = "registration") AttributionReportingSourceRegistration paramAttributionReportingSourceRegistration, @Zc5(Ze = "result") AttributionReportingSourceRegistrationResult paramAttributionReportingSourceRegistrationResult) {
    this.registration = paramAttributionReportingSourceRegistration;
    this.result = paramAttributionReportingSourceRegistrationResult;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\storage\AttributionReportingSourceRegistered.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */