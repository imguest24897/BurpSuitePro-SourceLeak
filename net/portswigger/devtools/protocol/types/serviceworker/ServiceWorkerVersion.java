package net.portswigger.devtools.protocol.types.serviceworker;

import burp.Zbqc;
import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;

@Zsi("net.portswigger.devtools.protocol.types.serviceworker.ServiceWorkerVersion")
public class ServiceWorkerVersion {
  @Zvd(Zp = "versionId")
  public final String versionId;
  
  @Zvd(Zp = "registrationId")
  public final String registrationId;
  
  @Zvd(Zp = "scriptURL")
  public final String scriptURL;
  
  @Zvd(Zp = "runningStatus")
  public final ServiceWorkerVersionRunningStatus runningStatus;
  
  @Zvd(Zp = "status")
  public final ServiceWorkerVersionStatus status;
  
  @Zvd(Zp = "scriptLastModified")
  @Zj
  public final Double scriptLastModified;
  
  @Zvd(Zp = "scriptResponseTime")
  @Zj
  public final Double scriptResponseTime;
  
  @Zvd(Zp = "controlledClients")
  @Zj
  public final List<String> controlledClients;
  
  @Zvd(Zp = "targetId")
  @Zj
  public final String targetId;
  
  @Zvd(Zp = "routerRules")
  @Zj
  public final String routerRules;
  
  @Zox
  public ServiceWorkerVersion(@Zc5(Ze = "versionId") String paramString1, @Zc5(Ze = "registrationId") String paramString2, @Zc5(Ze = "scriptURL") String paramString3, @Zc5(Ze = "runningStatus") ServiceWorkerVersionRunningStatus paramServiceWorkerVersionRunningStatus, @Zc5(Ze = "status") ServiceWorkerVersionStatus paramServiceWorkerVersionStatus, @Zc5(Ze = "scriptLastModified", ZS = "null") Double paramDouble1, @Zc5(Ze = "scriptResponseTime", ZS = "null") Double paramDouble2, @Zc5(Ze = "controlledClients", ZS = "null") List<String> paramList, @Zc5(Ze = "targetId", ZS = "null") String paramString4, @Zc5(Ze = "routerRules", ZS = "null") String paramString5) {
    this.versionId = paramString1;
    this.registrationId = paramString2;
    this.scriptURL = paramString3;
    this.runningStatus = paramServiceWorkerVersionRunningStatus;
    this.status = paramServiceWorkerVersionStatus;
    this.scriptLastModified = paramDouble1;
    String str = ServiceWorkerVersionStatus.Zp();
    this.scriptResponseTime = paramDouble2;
    this.controlledClients = paramList;
    this.targetId = paramString4;
    this.routerRules = paramString5;
    if (str != null)
      Zbqc.Zr(new Zbqc[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\serviceworker\ServiceWorkerVersion.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */