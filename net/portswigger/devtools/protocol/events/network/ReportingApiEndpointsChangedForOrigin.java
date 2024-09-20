package net.portswigger.devtools.protocol.events.network;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.types.network.ReportingApiEndpoint;

@Zy
@Zsi("net.portswigger.devtools.protocol.events.network.ReportingApiEndpointsChangedForOrigin")
public class ReportingApiEndpointsChangedForOrigin implements Zl {
  @Zvd(Zp = "origin")
  public final String origin;
  
  @Zvd(Zp = "endpoints")
  public final List<ReportingApiEndpoint> endpoints;
  
  @Zox
  public ReportingApiEndpointsChangedForOrigin(@Zc5(Ze = "origin") String paramString, @Zc5(Ze = "endpoints") List<ReportingApiEndpoint> paramList) {
    this.origin = paramString;
    this.endpoints = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\network\ReportingApiEndpointsChangedForOrigin.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */