package net.portswigger;

import java.time.Instant;
import java.util.concurrent.TimeUnit;

public final class Zhi {
  public static Instant ZW(double paramDouble) {
    return Instant.ofEpochMilli((long)(TimeUnit.SECONDS.toMillis(1L) * paramDouble));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zhi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */