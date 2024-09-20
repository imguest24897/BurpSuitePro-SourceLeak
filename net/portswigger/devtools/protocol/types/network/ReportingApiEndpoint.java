package net.portswigger.devtools.protocol.types.network;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.network.ReportingApiEndpoint")
public class ReportingApiEndpoint {
  @Zvd(Zp = "url")
  public final String url;
  
  @Zvd(Zp = "groupName")
  public final String groupName;
  
  @Zox
  public ReportingApiEndpoint(@Zc5(Ze = "url") String paramString1, @Zc5(Ze = "groupName") String paramString2) {
    this.url = paramString1;
    this.groupName = paramString2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\network\ReportingApiEndpoint.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */