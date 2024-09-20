package net.portswigger.devtools.protocol.types.serviceworker;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.serviceworker.ServiceWorkerRegistration")
public class ServiceWorkerRegistration {
  @Zvd(Zp = "registrationId")
  public final String registrationId;
  
  @Zvd(Zp = "scopeURL")
  public final String scopeURL;
  
  @Zvd(Zp = "isDeleted")
  public final Boolean isDeleted;
  
  @Zox
  public ServiceWorkerRegistration(@Zc5(Ze = "registrationId") String paramString1, @Zc5(Ze = "scopeURL") String paramString2, @Zc5(Ze = "isDeleted") Boolean paramBoolean) {
    this.registrationId = paramString1;
    this.scopeURL = paramString2;
    this.isDeleted = paramBoolean;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\serviceworker\ServiceWorkerRegistration.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */