package net.portswigger.devtools.client.impl;

import burp.Ztos;
import burp.Zxr8;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import net.portswigger.Zah;
import net.portswigger.Zi7;
import net.portswigger.Zk_;
import net.portswigger.browser.Zc7;
import net.portswigger.browser.Zcq;
import net.portswigger.browser.Zdn;
import net.portswigger.browser.Zdo;
import net.portswigger.browser.Zev;
import net.portswigger.browser.Zjt;
import net.portswigger.browser.Zti;
import net.portswigger.browser.Ztj;
import net.portswigger.browser.Ztk;
import net.portswigger.browser.Ztq;
import net.portswigger.browser.Ztw;
import net.portswigger.browser.Zz8;
import net.portswigger.devtools.client.Z_;
import net.portswigger.devtools.client.Zi;
import net.portswigger.devtools.client.Zk;
import net.portswigger.devtools.client.Zn;
import net.portswigger.devtools.client.Zp;
import net.portswigger.devtools.protocol.ChromeDevTools;
import net.portswigger.devtools.protocol.Zs;
import net.portswigger.devtools.protocol.events.network.LoadingFailed;
import net.portswigger.devtools.protocol.events.network.LoadingFinished;
import net.portswigger.devtools.protocol.events.network.RequestWillBeSent;
import net.portswigger.devtools.protocol.types.network.PostDataEntry;

public class Zxs implements Zow {
  private final Zev ZM;
  
  private final Ztos<Zcq> ZZ;
  
  private final Zn Zl;
  
  private final Map<String, CompletableFuture<?>> Z_;
  
  public Zxs(Zev paramZev, Ztos<Zcq> paramZtos, Zn paramZn) {
    this.ZM = Objects.<Zev>requireNonNull(paramZev);
    this.ZZ = Objects.<Ztos<Zcq>>requireNonNull(paramZtos);
    this.Zl = Objects.<Zn>requireNonNull(paramZn);
    this.Z_ = new ConcurrentHashMap<>();
  }
  
  public CompletableFuture<?> Zy() throws Zi {
    this.Zl.Zn(this::lambda$initialise$2);
    this.Zl.Zn(this::lambda$initialise$4);
    this.Zl.Zn(this::lambda$initialise$6);
    return this.Zl.ZL(Zk.ZA(Zxs::lambda$initialise$7));
  }
  
  private void ZA(String paramString) {
    synchronized (this.Z_) {
      CompletableFuture completableFuture = this.Z_.computeIfAbsent(paramString, Zxs::lambda$requestCompleted$8);
      try {
        if (!completableFuture.isDone()) {
          completableFuture.complete(null);
          this.Z_.remove(paramString, completableFuture);
        } 
      } catch (UnsupportedOperationException unsupportedOperationException) {
        throw a(null);
      } 
    } 
  }
  
  public static Zdn Zp(RequestWillBeSent paramRequestWillBeSent) {
    List list1 = (List)paramRequestWillBeSent.request.headers.entrySet().stream().map(Zxs::lambda$getRequestDetails$9).collect(Collectors.toList());
    List list2 = paramRequestWillBeSent.request.postDataEntries;
    try {
      if (list2 != null) {
        try {
          if (list2.stream().map(Zxs::lambda$getRequestDetails$10).anyMatch(Objects::isNull));
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        } 
        String str = paramRequestWillBeSent.request.postData;
        return new Zdn(paramRequestWillBeSent.request.method, paramRequestWillBeSent.request.url, paramRequestWillBeSent.request.urlFragment, list1, str);
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
  }
  
  public void Zi(String paramString, Zdn paramZdn) {
    throw new UnsupportedOperationException();
  }
  
  public void Zd() {
    this.Z_.values().forEach(Zxs::lambda$onTargetClose$11);
  }
  
  public void ZL() throws Ztk {
    try {
      this.Zl.Zz(Zk.ZA(Zxs::lambda$disableCache$12));
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
      Zah.Zl(interruptedException, Zk_.IGNORED);
      Thread.currentThread().interrupt();
    } 
  }
  
  public void ZU() {}
  
  private static CompletableFuture lambda$disableCache$12(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getNetwork().setCacheDisabled(Boolean.valueOf(true));
  }
  
  private static void lambda$onTargetClose$11(CompletableFuture paramCompletableFuture) {
    paramCompletableFuture.complete(null);
  }
  
  private static String lambda$getRequestDetails$10(PostDataEntry paramPostDataEntry) {
    return paramPostDataEntry.bytes;
  }
  
  private static Zc7 lambda$getRequestDetails$9(Map.Entry paramEntry) {
    return new Zc7((String)paramEntry.getKey(), ((Zi7)paramEntry.getValue()).ZP().ZW());
  }
  
  private static CompletableFuture lambda$requestCompleted$8(String paramString) {
    return CompletableFuture.completedFuture(null);
  }
  
  private static CompletableFuture lambda$initialise$7(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getNetwork().enable();
  }
  
  private Zs lambda$initialise$6(ChromeDevTools paramChromeDevTools) throws Z_, Zp {
    return paramChromeDevTools.getNetwork().onLoadingFailed(this::lambda$initialise$5);
  }
  
  private void lambda$initialise$5(LoadingFailed paramLoadingFailed) {
    ZA(paramLoadingFailed.requestId);
    this.ZZ.ZD(new Zxr8(Zcq.ZO, Zx1.Zn(paramLoadingFailed)));
  }
  
  private Zs lambda$initialise$4(ChromeDevTools paramChromeDevTools) throws Z_, Zp {
    return paramChromeDevTools.getNetwork().onLoadingFinished(this::lambda$initialise$3);
  }
  
  private void lambda$initialise$3(LoadingFinished paramLoadingFinished) {
    ZA(paramLoadingFinished.requestId);
  }
  
  private Zs lambda$initialise$2(ChromeDevTools paramChromeDevTools) throws Z_, Zp {
    return paramChromeDevTools.getNetwork().onRequestWillBeSent(this::lambda$initialise$1);
  }
  
  private void lambda$initialise$1(RequestWillBeSent paramRequestWillBeSent) {
    CompletableFuture completableFuture;
    Zjt zjt = new Zjt(new Zz8(paramRequestWillBeSent.requestId), this.ZM, new Ztw(paramRequestWillBeSent.frameId), null, Zou.Zi().Zk(paramRequestWillBeSent.type), Zp(paramRequestWillBeSent));
    synchronized (this.Z_) {
      completableFuture = this.Z_.computeIfAbsent(paramRequestWillBeSent.requestId, Zxs::lambda$initialise$0);
      try {
        if (completableFuture.isDone())
          this.Z_.remove(paramRequestWillBeSent.requestId, completableFuture); 
      } catch (UnsupportedOperationException unsupportedOperationException) {
        throw a(null);
      } 
    } 
    this.ZZ.ZD(Zdo.ZQ(zjt, completableFuture));
  }
  
  private static CompletableFuture lambda$initialise$0(String paramString) {
    return new CompletableFuture();
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zxs.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */