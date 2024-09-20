package net.portswigger.devtools.protocol.types.audits;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.types.network.ClientSecurityState;
import net.portswigger.devtools.protocol.types.network.CorsErrorStatus;
import net.portswigger.devtools.protocol.types.network.IPAddressSpace;

@Zsi("net.portswigger.devtools.protocol.types.audits.CorsIssueDetails")
public class CorsIssueDetails {
  @Zvd(Zp = "corsErrorStatus")
  public final CorsErrorStatus corsErrorStatus;
  
  @Zvd(Zp = "isWarning")
  public final Boolean isWarning;
  
  @Zvd(Zp = "request")
  public final AffectedRequest request;
  
  @Zvd(Zp = "location")
  @Zj
  public final SourceCodeLocation location;
  
  @Zvd(Zp = "initiatorOrigin")
  @Zj
  public final String initiatorOrigin;
  
  @Zvd(Zp = "resourceIPAddressSpace")
  @Zj
  public final IPAddressSpace resourceIPAddressSpace;
  
  @Zvd(Zp = "clientSecurityState")
  @Zj
  public final ClientSecurityState clientSecurityState;
  
  @Zox
  public CorsIssueDetails(@Zc5(Ze = "corsErrorStatus") CorsErrorStatus paramCorsErrorStatus, @Zc5(Ze = "isWarning") Boolean paramBoolean, @Zc5(Ze = "request") AffectedRequest paramAffectedRequest, @Zc5(Ze = "location", ZS = "null") SourceCodeLocation paramSourceCodeLocation, @Zc5(Ze = "initiatorOrigin", ZS = "null") String paramString, @Zc5(Ze = "resourceIPAddressSpace", ZS = "null") IPAddressSpace paramIPAddressSpace, @Zc5(Ze = "clientSecurityState", ZS = "null") ClientSecurityState paramClientSecurityState) {
    this.corsErrorStatus = paramCorsErrorStatus;
    this.isWarning = paramBoolean;
    this.request = paramAffectedRequest;
    this.location = paramSourceCodeLocation;
    this.initiatorOrigin = paramString;
    this.resourceIPAddressSpace = paramIPAddressSpace;
    this.clientSecurityState = paramClientSecurityState;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\audits\CorsIssueDetails.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */