package burp;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Zky4 {
  public final int ZJ;
  
  public final int Zv;
  
  public final int ZB;
  
  public final int Zk;
  
  public Zky4(Map<Byte, AtomicInteger> paramMap) {
    this.ZJ = ((AtomicInteger)paramMap.getOrDefault(Byte.valueOf((byte)4), new AtomicInteger())).get();
    this.Zv = ((AtomicInteger)paramMap.getOrDefault(Byte.valueOf((byte)3), new AtomicInteger())).get();
    this.ZB = ((AtomicInteger)paramMap.getOrDefault(Byte.valueOf((byte)2), new AtomicInteger())).get();
    this.Zk = ((AtomicInteger)paramMap.getOrDefault(Byte.valueOf((byte)1), new AtomicInteger())).get();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zky4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */