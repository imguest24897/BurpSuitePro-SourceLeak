package net.portswigger.devtools.protocol.types.backgroundservice;

import burp.Zbqc;
import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("net.portswigger.devtools.protocol.types.backgroundservice.BackgroundServiceEvent")
public class BackgroundServiceEvent {
  @Zvd(Zp = "timestamp")
  public final Double timestamp;
  
  @Zvd(Zp = "origin")
  public final String origin;
  
  @Zvd(Zp = "serviceWorkerRegistrationId")
  public final String serviceWorkerRegistrationId;
  
  @Zvd(Zp = "service")
  public final ServiceName service;
  
  @Zvd(Zp = "eventName")
  public final String eventName;
  
  @Zvd(Zp = "instanceId")
  public final String instanceId;
  
  @Zvd(Zp = "eventMetadata")
  public final List<EventMetadata> eventMetadata;
  
  @Zvd(Zp = "storageKey")
  public final String storageKey;
  
  @Zox
  public BackgroundServiceEvent(@Zc5(Ze = "timestamp") Double paramDouble, @Zc5(Ze = "origin") String paramString1, @Zc5(Ze = "serviceWorkerRegistrationId") String paramString2, @Zc5(Ze = "service") ServiceName paramServiceName, @Zc5(Ze = "eventName") String paramString3, @Zc5(Ze = "instanceId") String paramString4, @Zc5(Ze = "eventMetadata") List<EventMetadata> paramList, @Zc5(Ze = "storageKey") String paramString5) {
    this.timestamp = paramDouble;
    int i = ServiceName.Zz();
    this.origin = paramString1;
    this.serviceWorkerRegistrationId = paramString2;
    this.service = paramServiceName;
    this.eventName = paramString3;
    this.instanceId = paramString4;
    this.eventMetadata = paramList;
    this.storageKey = paramString5;
    if (i != 0)
      Zbqc.Zr(new Zbqc[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\backgroundservice\BackgroundServiceEvent.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */