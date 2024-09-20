package net.portswigger.devtools.protocol.types.audits;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.audits.InspectorIssueDetails")
public class InspectorIssueDetails {
  @Zvd(Zp = "cookieIssueDetails")
  @Zj
  public final CookieIssueDetails cookieIssueDetails;
  
  @Zvd(Zp = "mixedContentIssueDetails")
  @Zj
  public final MixedContentIssueDetails mixedContentIssueDetails;
  
  @Zvd(Zp = "blockedByResponseIssueDetails")
  @Zj
  public final BlockedByResponseIssueDetails blockedByResponseIssueDetails;
  
  @Zvd(Zp = "heavyAdIssueDetails")
  @Zj
  public final HeavyAdIssueDetails heavyAdIssueDetails;
  
  @Zvd(Zp = "contentSecurityPolicyIssueDetails")
  @Zj
  public final ContentSecurityPolicyIssueDetails contentSecurityPolicyIssueDetails;
  
  @Zvd(Zp = "sharedArrayBufferIssueDetails")
  @Zj
  public final SharedArrayBufferIssueDetails sharedArrayBufferIssueDetails;
  
  @Zvd(Zp = "lowTextContrastIssueDetails")
  @Zj
  public final LowTextContrastIssueDetails lowTextContrastIssueDetails;
  
  @Zvd(Zp = "corsIssueDetails")
  @Zj
  public final CorsIssueDetails corsIssueDetails;
  
  @Zvd(Zp = "attributionReportingIssueDetails")
  @Zj
  public final AttributionReportingIssueDetails attributionReportingIssueDetails;
  
  @Zvd(Zp = "quirksModeIssueDetails")
  @Zj
  public final QuirksModeIssueDetails quirksModeIssueDetails;
  
  @Zvd(Zp = "navigatorUserAgentIssueDetails")
  @Deprecated
  @Zj
  public final NavigatorUserAgentIssueDetails navigatorUserAgentIssueDetails;
  
  @Zvd(Zp = "genericIssueDetails")
  @Zj
  public final GenericIssueDetails genericIssueDetails;
  
  @Zvd(Zp = "deprecationIssueDetails")
  @Zj
  public final DeprecationIssueDetails deprecationIssueDetails;
  
  @Zvd(Zp = "clientHintIssueDetails")
  @Zj
  public final ClientHintIssueDetails clientHintIssueDetails;
  
  @Zvd(Zp = "federatedAuthRequestIssueDetails")
  @Zj
  public final FederatedAuthRequestIssueDetails federatedAuthRequestIssueDetails;
  
  @Zvd(Zp = "bounceTrackingIssueDetails")
  @Zj
  public final BounceTrackingIssueDetails bounceTrackingIssueDetails;
  
  @Zvd(Zp = "cookieDeprecationMetadataIssueDetails")
  @Zj
  public final CookieDeprecationMetadataIssueDetails cookieDeprecationMetadataIssueDetails;
  
  @Zvd(Zp = "stylesheetLoadingIssueDetails")
  @Zj
  public final StylesheetLoadingIssueDetails stylesheetLoadingIssueDetails;
  
  @Zvd(Zp = "propertyRuleIssueDetails")
  @Zj
  public final PropertyRuleIssueDetails propertyRuleIssueDetails;
  
  @Zvd(Zp = "federatedAuthUserInfoRequestIssueDetails")
  @Zj
  public final FederatedAuthUserInfoRequestIssueDetails federatedAuthUserInfoRequestIssueDetails;
  
  @Zvd(Zp = "sharedDictionaryIssueDetails")
  @Zj
  public final SharedDictionaryIssueDetails sharedDictionaryIssueDetails;
  
  @Zox
  public InspectorIssueDetails(@Zc5(Ze = "cookieIssueDetails", ZS = "null") CookieIssueDetails paramCookieIssueDetails, @Zc5(Ze = "mixedContentIssueDetails", ZS = "null") MixedContentIssueDetails paramMixedContentIssueDetails, @Zc5(Ze = "blockedByResponseIssueDetails", ZS = "null") BlockedByResponseIssueDetails paramBlockedByResponseIssueDetails, @Zc5(Ze = "heavyAdIssueDetails", ZS = "null") HeavyAdIssueDetails paramHeavyAdIssueDetails, @Zc5(Ze = "contentSecurityPolicyIssueDetails", ZS = "null") ContentSecurityPolicyIssueDetails paramContentSecurityPolicyIssueDetails, @Zc5(Ze = "sharedArrayBufferIssueDetails", ZS = "null") SharedArrayBufferIssueDetails paramSharedArrayBufferIssueDetails, @Zc5(Ze = "lowTextContrastIssueDetails", ZS = "null") LowTextContrastIssueDetails paramLowTextContrastIssueDetails, @Zc5(Ze = "corsIssueDetails", ZS = "null") CorsIssueDetails paramCorsIssueDetails, @Zc5(Ze = "attributionReportingIssueDetails", ZS = "null") AttributionReportingIssueDetails paramAttributionReportingIssueDetails, @Zc5(Ze = "quirksModeIssueDetails", ZS = "null") QuirksModeIssueDetails paramQuirksModeIssueDetails, @Zc5(Ze = "navigatorUserAgentIssueDetails", ZS = "null") NavigatorUserAgentIssueDetails paramNavigatorUserAgentIssueDetails, @Zc5(Ze = "genericIssueDetails", ZS = "null") GenericIssueDetails paramGenericIssueDetails, @Zc5(Ze = "deprecationIssueDetails", ZS = "null") DeprecationIssueDetails paramDeprecationIssueDetails, @Zc5(Ze = "clientHintIssueDetails", ZS = "null") ClientHintIssueDetails paramClientHintIssueDetails, @Zc5(Ze = "federatedAuthRequestIssueDetails", ZS = "null") FederatedAuthRequestIssueDetails paramFederatedAuthRequestIssueDetails, @Zc5(Ze = "bounceTrackingIssueDetails", ZS = "null") BounceTrackingIssueDetails paramBounceTrackingIssueDetails, @Zc5(Ze = "cookieDeprecationMetadataIssueDetails", ZS = "null") CookieDeprecationMetadataIssueDetails paramCookieDeprecationMetadataIssueDetails, @Zc5(Ze = "stylesheetLoadingIssueDetails", ZS = "null") StylesheetLoadingIssueDetails paramStylesheetLoadingIssueDetails, @Zc5(Ze = "propertyRuleIssueDetails", ZS = "null") PropertyRuleIssueDetails paramPropertyRuleIssueDetails, @Zc5(Ze = "federatedAuthUserInfoRequestIssueDetails", ZS = "null") FederatedAuthUserInfoRequestIssueDetails paramFederatedAuthUserInfoRequestIssueDetails, @Zc5(Ze = "sharedDictionaryIssueDetails", ZS = "null") SharedDictionaryIssueDetails paramSharedDictionaryIssueDetails) {
    this.cookieIssueDetails = paramCookieIssueDetails;
    this.mixedContentIssueDetails = paramMixedContentIssueDetails;
    this.blockedByResponseIssueDetails = paramBlockedByResponseIssueDetails;
    this.heavyAdIssueDetails = paramHeavyAdIssueDetails;
    this.contentSecurityPolicyIssueDetails = paramContentSecurityPolicyIssueDetails;
    this.sharedArrayBufferIssueDetails = paramSharedArrayBufferIssueDetails;
    this.lowTextContrastIssueDetails = paramLowTextContrastIssueDetails;
    this.corsIssueDetails = paramCorsIssueDetails;
    this.attributionReportingIssueDetails = paramAttributionReportingIssueDetails;
    this.quirksModeIssueDetails = paramQuirksModeIssueDetails;
    this.navigatorUserAgentIssueDetails = paramNavigatorUserAgentIssueDetails;
    this.genericIssueDetails = paramGenericIssueDetails;
    this.deprecationIssueDetails = paramDeprecationIssueDetails;
    String str = StylesheetLoadingIssueDetails.Zk();
    this.clientHintIssueDetails = paramClientHintIssueDetails;
    this.federatedAuthRequestIssueDetails = paramFederatedAuthRequestIssueDetails;
    this.bounceTrackingIssueDetails = paramBounceTrackingIssueDetails;
    this.cookieDeprecationMetadataIssueDetails = paramCookieDeprecationMetadataIssueDetails;
    this.stylesheetLoadingIssueDetails = paramStylesheetLoadingIssueDetails;
    this.propertyRuleIssueDetails = paramPropertyRuleIssueDetails;
    this.federatedAuthUserInfoRequestIssueDetails = paramFederatedAuthUserInfoRequestIssueDetails;
    this.sharedDictionaryIssueDetails = paramSharedDictionaryIssueDetails;
    if (str != null)
      Zbqc.Zr(new Zbqc[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\audits\InspectorIssueDetails.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */