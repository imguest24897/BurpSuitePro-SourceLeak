package net.portswigger.devtools.protocol.events.serviceworker;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.serviceworker.ServiceWorkerRegistration;

@Zsi("net.portswigger.devtools.protocol.events.serviceworker.WorkerRegistrationUpdated")
public class WorkerRegistrationUpdated implements Zl {
  @Zvd(Zp = "registrations")
  public final List<ServiceWorkerRegistration> registrations;
  
  @Zox
  public WorkerRegistrationUpdated(@Zc5(Ze = "registrations") List<ServiceWorkerRegistration> paramList) {
    this.registrations = paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\serviceworker\WorkerRegistrationUpdated.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */