package net.portswigger.devtools.protocol.types.security;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zy
@Zsi("net.portswigger.devtools.protocol.types.security.VisibleSecurityState")
public class VisibleSecurityState {
  @Zvd(Zp = "securityState")
  public final SecurityState securityState;
  
  @Zvd(Zp = "certificateSecurityState")
  @Zj
  public final CertificateSecurityState certificateSecurityState;
  
  @Zvd(Zp = "safetyTipInfo")
  @Zj
  public final SafetyTipInfo safetyTipInfo;
  
  @Zvd(Zp = "securityStateIssueIds")
  public final List<String> securityStateIssueIds;
  
  private static int ZX;
  
  @Zox
  public VisibleSecurityState(@Zc5(Ze = "securityState") SecurityState paramSecurityState, @Zc5(Ze = "certificateSecurityState", ZS = "null") CertificateSecurityState paramCertificateSecurityState, @Zc5(Ze = "safetyTipInfo", ZS = "null") SafetyTipInfo paramSafetyTipInfo, @Zc5(Ze = "securityStateIssueIds") List<String> paramList) {
    this.securityState = paramSecurityState;
    this.certificateSecurityState = paramCertificateSecurityState;
    this.safetyTipInfo = paramSafetyTipInfo;
    this.securityStateIssueIds = paramList;
  }
  
  public static void Zy(int paramInt) {
    ZX = paramInt;
  }
  
  public static int Ze() {
    return ZX;
  }
  
  public static int Zn() {
    int i = Ze();
    return (i == 0) ? 116 : 0;
  }
  
  static {
    if (Zn() != 0)
      Zy(55); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\security\VisibleSecurityState.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */