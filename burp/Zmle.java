package burp;

import java.io.Closeable;
import java.io.IOException;
import java.time.Duration;
import java.util.function.Consumer;
import net.portswigger.browser.Zc1;
import net.portswigger.browser.Zct;
import net.portswigger.browser.Zd_;
import net.portswigger.browser.Zda;
import net.portswigger.browser.Zdr;
import net.portswigger.browser.Ztk;
import net.portswigger.browser.Ztz;
import net.portswigger.browser.Zzr;

public class Zmle extends Zmlb implements Closeable {
  Zmle(Zeys paramZeys, Zr_4 paramZr_4, Zkl6 paramZkl6, Zgb6 paramZgb6, Zzs1 paramZzs1, Zzmb paramZzmb, Zz1m<Zt35> paramZz1m, Zzzx paramZzzx, Zg10 paramZg10, Zzgs paramZzgs, Ztwv paramZtwv) throws Ztz {
    super(new Zm94(), paramZeys, paramZzmb, new Ztos<>(Zt18.Zq()), paramZz1m, paramZr_4, paramZkl6, paramZgb6, paramZzs1, Ze2m.REPLAYER_BROWSER, null, new Zl3a(), paramZzzx, null, paramZg10, paramZzgs, Zzr.ZU().ZP(Duration.ofSeconds(2L)).ZO(paramZzmb.Zd()).Zp(), paramZtwv, Zmle::lambda$new$0);
    this.ZE.set(Ztaw::Zv);
    this.ZG.set(true);
  }
  
  public Zgrn Ze(Consumer<Zct> paramConsumer) {
    return this.ZL.ZE(Zt18.ZT, paramConsumer::lambda$addScreencastFrameSubscription$1);
  }
  
  public void Zc(Zd_ paramZd_, Zdr paramZdr) throws Ztk, InterruptedException, Zda {
    this.ZN.ZE(this.ZW.Zi(), paramZd_, paramZdr);
  }
  
  public Zc1 Zb() {
    return this.ZW.Zi();
  }
  
  public void close() throws IOException {
    ZA();
  }
  
  private static void lambda$addScreencastFrameSubscription$1(Consumer paramConsumer, Zxr8 paramZxr8) {
    paramZxr8.ZP(paramConsumer);
  }
  
  private static void lambda$new$0(String paramString1, String paramString2) {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmle.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */