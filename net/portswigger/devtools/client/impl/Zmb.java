package net.portswigger.devtools.client.impl;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

public class Zmb {
  public static Supplier<Integer> ZJ() {
    AtomicInteger atomicInteger = new AtomicInteger();
    Objects.requireNonNull(atomicInteger);
    return atomicInteger::incrementAndGet;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zmb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */