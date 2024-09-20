package burp;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

class Zk5n {
  private final Map<Byte, AtomicInteger> Zp = new HashMap<>();
  
  void Zs(byte paramByte) {
    ((AtomicInteger)this.Zp.computeIfAbsent(Byte.valueOf(paramByte), Zk5n::lambda$increment$0)).incrementAndGet();
  }
  
  void Zg(byte paramByte) {
    ((AtomicInteger)this.Zp.computeIfAbsent(Byte.valueOf(paramByte), Zk5n::lambda$increment$0)).decrementAndGet();
  }
  
  Zky4 ZB() {
    return new Zky4(this.Zp);
  }
  
  private static AtomicInteger lambda$increment$0(Byte paramByte) {
    return new AtomicInteger();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk5n.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */