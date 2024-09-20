package burp;

import java.time.Duration;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zm2;

public class Zrlh {
  public static Zbue Zg(Pattern paramPattern, String paramString1, Duration paramDuration, Ztwv paramZtwv, String paramString2) {
    Zeiq zeiq = new Zeiq(paramString1);
    Matcher matcher = paramPattern.matcher(zeiq);
    boolean bool = false;
    CountDownLatch countDownLatch = new CountDownLatch(1);
    Zbfo zbfo = new Zbfo(matcher, countDownLatch);
    Future<?> future = paramZtwv.Zx(zbfo);
    int[] arrayOfInt = Zbue.ZI();
    try {
      boolean bool1 = countDownLatch.await(paramDuration.toMillis(), TimeUnit.MILLISECONDS);
      try {
        if (!bool1) {
          future.cancel(true);
          Zm2.ZB(Zec3.VULN_JS_REGEX_TIMEOUT, paramString2);
          if (arrayOfInt != null)
            bool = zbfo.ZF(); 
          return new Zbue(matcher, bool);
        } 
      } catch (CancellationException cancellationException) {
        throw a(null);
      } 
      bool = zbfo.ZF();
    } catch (CancellationException|InterruptedException cancellationException) {
      Zah.Zl(cancellationException, Zk_.IGNORED);
    } 
    return new Zbue(matcher, bool);
  }
  
  private static CancellationException a(CancellationException paramCancellationException) {
    return paramCancellationException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrlh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */