package net.portswigger.devtools.client.impl;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.browser.Ztv;

class Zoh {
  private final CompletableFuture<Ztv> Zc = new CompletableFuture<>();
  
  private Ztv Zd() {
    try {
      return this.Zc.get(30L, TimeUnit.SECONDS);
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.IGNORED);
      Thread.currentThread().interrupt();
    } catch (ExecutionException executionException) {
      Zah.Zl(executionException, Zk_.IMPOSSIBLE);
    } catch (CancellationException cancellationException) {
      Zah.Zl(cancellationException, Zk_.IGNORED);
    } catch (TimeoutException timeoutException) {
      Zah.Zl(timeoutException, Zk_.COMMON_RUNTIME_FAILURE);
    } 
    return Ztv.ZD();
  }
  
  private void Ze(Ztv paramZtv) {
    this.Zc.complete(paramZtv);
  }
  
  private void Zp() {
    this.Zc.cancel(true);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zoh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */