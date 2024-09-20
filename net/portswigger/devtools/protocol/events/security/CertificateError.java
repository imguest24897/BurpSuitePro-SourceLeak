package net.portswigger.devtools.protocol.events.security;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;

@Deprecated
@Zsi("net.portswigger.devtools.protocol.events.security.CertificateError")
public class CertificateError implements Zl {
  @Zvd(Zp = "eventId")
  public final Integer eventId;
  
  @Zvd(Zp = "errorType")
  public final String errorType;
  
  @Zvd(Zp = "requestURL")
  public final String requestURL;
  
  @Zox
  public CertificateError(@Zc5(Ze = "eventId") Integer paramInteger, @Zc5(Ze = "errorType") String paramString1, @Zc5(Ze = "requestURL") String paramString2) {
    String str = VisibleSecurityStateChanged.Zr();
    this.eventId = paramInteger;
    this.errorType = paramString1;
    this.requestURL = paramString2;
    if (Zbqc.Zwu() == null)
      VisibleSecurityStateChanged.ZX("aHRow"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\security\CertificateError.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */