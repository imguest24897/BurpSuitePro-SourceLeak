package net.portswigger.devtools.protocol.events.serviceworker;

import burp.Zbqc;
import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.serviceworker.ServiceWorkerVersion;

@Zsi("net.portswigger.devtools.protocol.events.serviceworker.WorkerVersionUpdated")
public class WorkerVersionUpdated implements Zl {
  @Zvd(Zp = "versions")
  public final List<ServiceWorkerVersion> versions;
  
  private static Zbqc[] ZL;
  
  @Zox
  public WorkerVersionUpdated(@Zc5(Ze = "versions") List<ServiceWorkerVersion> paramList) {
    Zbqc[] arrayOfZbqc = ZV();
    this.versions = paramList;
    if (Zbqc.Zwu() == null)
      Zr(new Zbqc[4]); 
  }
  
  public static void Zr(Zbqc[] paramArrayOfZbqc) {
    ZL = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZV() {
    return ZL;
  }
  
  static {
    if (ZV() == null)
      Zr(new Zbqc[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\serviceworker\WorkerVersionUpdated.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */