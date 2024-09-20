package net.portswigger.browser;

import java.util.concurrent.CompletableFuture;

public class Zg implements Zv {
  private final Zzq Zx = new Zzq();
  
  public Zg(CompletableFuture<?> paramCompletableFuture) {
    paramCompletableFuture.whenComplete(this::lambda$new$0);
  }
  
  public void ZW() throws InterruptedException {
    this.Zx.ZG();
  }
  
  public void Zf() {
    this.Zx.ZJ();
  }
  
  private void lambda$new$0(Object paramObject, Throwable paramThrowable) {
    this.Zx.ZJ();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */