package net.portswigger.devtools.client.impl;

import java.util.concurrent.CompletableFuture;
import net.portswigger.browser.Zea;
import net.portswigger.browser.Ztk;
import net.portswigger.devtools.client.Zk;
import net.portswigger.devtools.client.Zn;
import net.portswigger.devtools.protocol.ChromeDevTools;

public class Zm8 implements Zea {
  private final Zn ZY;
  
  public Zm8(Zn paramZn) {
    this.ZY = paramZn;
  }
  
  public void Zt() throws Ztk {
    this.ZY.ZL(Zk.ZA(Zm8::lambda$ignoreCertificateErrors$0));
  }
  
  public void ZC() throws Ztk {
    this.ZY.ZL(Zk.ZA(Zm8::lambda$setBypassCsp$1));
  }
  
  private static CompletableFuture lambda$setBypassCsp$1(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getPage().setBypassCSP(Boolean.valueOf(true));
  }
  
  private static CompletableFuture lambda$ignoreCertificateErrors$0(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getSecurity().setIgnoreCertificateErrors(Boolean.valueOf(true));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zm8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */