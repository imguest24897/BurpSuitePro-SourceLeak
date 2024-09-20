package net.portswigger.devtools.protocol.types.network;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.network.SecurityIsolationStatus")
public class SecurityIsolationStatus {
  @Zvd(Zp = "coop")
  @Zj
  public final CrossOriginOpenerPolicyStatus coop;
  
  @Zvd(Zp = "coep")
  @Zj
  public final CrossOriginEmbedderPolicyStatus coep;
  
  @Zvd(Zp = "csp")
  @Zj
  public final List<ContentSecurityPolicyStatus> csp;
  
  @Zox
  public SecurityIsolationStatus(@Zc5(Ze = "coop", ZS = "null") CrossOriginOpenerPolicyStatus paramCrossOriginOpenerPolicyStatus, @Zc5(Ze = "coep", ZS = "null") CrossOriginEmbedderPolicyStatus paramCrossOriginEmbedderPolicyStatus, @Zc5(Ze = "csp", ZS = "null") List<ContentSecurityPolicyStatus> paramList) {
    this.coop = paramCrossOriginOpenerPolicyStatus;
    this.coep = paramCrossOriginEmbedderPolicyStatus;
    this.csp = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\network\SecurityIsolationStatus.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */