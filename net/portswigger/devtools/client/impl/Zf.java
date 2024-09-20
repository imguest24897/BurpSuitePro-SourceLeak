package net.portswigger.devtools.client.impl;

import java.util.concurrent.CompletableFuture;
import net.portswigger.browser.Ze3;
import net.portswigger.browser.Zjc;
import net.portswigger.devtools.client.Zi;
import net.portswigger.devtools.client.Zk;
import net.portswigger.devtools.client.Zy;
import net.portswigger.devtools.protocol.ChromeDevTools;

public interface Zf extends Zjc, Zm3, Zm7 {
  default void ZW() throws Zi {
    Zv().Zg(Zk.ZA(Zf::lambda$initialise$0), Zy.ZX());
  }
  
  void Zo(Ze3 paramZe3);
  
  private static CompletableFuture lambda$initialise$0(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getRuntime().runIfWaitingForDebugger();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */