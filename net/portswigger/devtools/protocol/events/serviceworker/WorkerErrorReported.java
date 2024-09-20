package net.portswigger.devtools.protocol.events.serviceworker;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.serviceworker.ServiceWorkerErrorMessage;

@Zsi("net.portswigger.devtools.protocol.events.serviceworker.WorkerErrorReported")
public class WorkerErrorReported implements Zl {
  @Zvd(Zp = "errorMessage")
  public final ServiceWorkerErrorMessage errorMessage;
  
  @Zox
  public WorkerErrorReported(@Zc5(Ze = "errorMessage") ServiceWorkerErrorMessage paramServiceWorkerErrorMessage) {
    this.errorMessage = paramServiceWorkerErrorMessage;
    Zbqc[] arrayOfZbqc = WorkerVersionUpdated.ZV();
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\serviceworker\WorkerErrorReported.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */