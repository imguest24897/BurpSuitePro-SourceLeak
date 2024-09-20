package net.portswigger.devtools.client.impl;

import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.browser.Zn;
import net.portswigger.browser.Zti;
import net.portswigger.browser.Ztj;
import net.portswigger.browser.Ztk;
import net.portswigger.browser.Ztq;
import net.portswigger.devtools.client.Z_;
import net.portswigger.devtools.client.Zi;
import net.portswigger.devtools.client.Zk;
import net.portswigger.devtools.client.Zn;
import net.portswigger.devtools.client.Zp;
import net.portswigger.devtools.protocol.ChromeDevTools;

public class Zxr implements Zn {
  private final Zn ZQ;
  
  private String ZT;
  
  public Zxr(Zn paramZn) {
    this.ZQ = Objects.<Zn>requireNonNull(paramZn);
  }
  
  public void Zm(String paramString) throws Ztk {
    Objects.requireNonNull(paramString);
    try {
      this.ZQ.Zz(Zk.ZA(paramString::lambda$set$0));
    } catch (Zp zp) {
      Zah.Zl((Throwable)zp, Zk_.RETHROWN);
      throw new Zti(zp);
    } catch (Z_ z_) {
      Zah.Zl((Throwable)z_, Zk_.RETHROWN);
      throw new Ztj(z_);
    } catch (Zi zi) {
      Zah.Zl((Throwable)zi, Zk_.RETHROWN);
      throw new Ztq(zi);
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.UNEXPECTED);
      Thread.currentThread().interrupt();
    } 
    this.ZT = paramString;
  }
  
  private static CompletableFuture lambda$set$0(String paramString, ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getEmulation().setUserAgentOverride(paramString);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zxr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */