package net.portswigger.browser;

import burp.Zbqc;
import burp.Zxr8;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Consumer;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zez {
  private final Zev Za;
  
  private final Zd ZS;
  
  private final CompletableFuture<Zjw> ZW;
  
  private Zez(Zev paramZev, Zd paramZd, CompletableFuture<Zjw> paramCompletableFuture) {
    this.Za = Objects.<Zev>requireNonNull(paramZev);
    this.ZS = Objects.<Zd>requireNonNull(paramZd);
    this.ZW = Objects.<CompletableFuture<Zjw>>requireNonNull(paramCompletableFuture);
  }
  
  public static Zxr8<Zez> ZL(Zev paramZev, Zd paramZd, CompletableFuture<Zjw> paramCompletableFuture) {
    String str = Zcx.ZL();
    if (Zbqc.Zwu() == null)
      Zcx.ZR("ZaZslc"); 
    return new Zxr8(Zck.ZD, new Zez(paramZev, paramZd, paramCompletableFuture));
  }
  
  public Zev ZN() {
    return this.Za;
  }
  
  public Zd Zo() {
    return this.ZS;
  }
  
  public void Zx(Consumer<Zjw> paramConsumer) {
    this.ZW.thenAccept(paramConsumer);
  }
  
  public Zjw Zt() throws InterruptedException, Ztg {
    try {
      return this.ZW.get();
    } catch (ExecutionException executionException) {
      Zah.Zl(executionException, Zk_.RETHROWN);
      throw new Ztg(executionException.getCause());
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zez.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */