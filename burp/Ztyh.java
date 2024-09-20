package burp;

import net.portswigger.Zah;
import net.portswigger.Zie;
import net.portswigger.Zk_;

public class Ztyh {
  private static final long ZG = Math.max(50000000L, (long)(0.1F * (float)Runtime.getRuntime().maxMemory()));
  
  public static void Zc() {
    Runtime runtime = Runtime.getRuntime();
    if (runtime.maxMemory() - runtime.totalMemory() < ZG && runtime.freeMemory() < ZG)
      System.gc(); 
  }
  
  public static void ZR(Zskh paramZskh) {
    try {
      System.gc();
      System.out.println(Zmgc.LOW_MEMORY.ZB(new Object[0]));
      Zmgc.LOW_MEMORY.Zl(paramZskh, Zkqn.ERROR, Zie.OUT_OF_MEMORY, "", new Object[0]);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.COMMON_RUNTIME_FAILURE);
    } 
  }
  
  public static long ZK() {
    return Runtime.getRuntime().maxMemory();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztyh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */