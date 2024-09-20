package net.portswigger.devtools.protocol.types.serviceworker;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.serviceworker.ServiceWorkerErrorMessage")
public class ServiceWorkerErrorMessage {
  @Zvd(Zp = "errorMessage")
  public final String errorMessage;
  
  @Zvd(Zp = "registrationId")
  public final String registrationId;
  
  @Zvd(Zp = "versionId")
  public final String versionId;
  
  @Zvd(Zp = "sourceURL")
  public final String sourceURL;
  
  @Zvd(Zp = "lineNumber")
  public final Integer lineNumber;
  
  @Zvd(Zp = "columnNumber")
  public final Integer columnNumber;
  
  @Zox
  public ServiceWorkerErrorMessage(@Zc5(Ze = "errorMessage") String paramString1, @Zc5(Ze = "registrationId") String paramString2, @Zc5(Ze = "versionId") String paramString3, @Zc5(Ze = "sourceURL") String paramString4, @Zc5(Ze = "lineNumber") Integer paramInteger1, @Zc5(Ze = "columnNumber") Integer paramInteger2) {
    this.errorMessage = paramString1;
    this.registrationId = paramString2;
    this.versionId = paramString3;
    String str = ServiceWorkerVersionStatus.Zp();
    this.sourceURL = paramString4;
    this.lineNumber = paramInteger1;
    this.columnNumber = paramInteger2;
    if (Zbqc.Zwu() == null)
      ServiceWorkerVersionStatus.ZQ("Nx1GY"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\serviceworker\ServiceWorkerErrorMessage.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */