package burp;

import java.lang.reflect.Proxy;
import java.util.Objects;
import java.util.function.BiConsumer;

public class Ze2 {
  private final Zskh Zr;
  
  private final BiConsumer<Throwable, Zskh> ZS;
  
  private static boolean ZM;
  
  public Ze2(Zskh paramZskh, BiConsumer<Throwable, Zskh> paramBiConsumer) {
    this.Zr = paramZskh;
    this.ZS = paramBiConsumer;
  }
  
  public <T> T Zk(Object paramObject, Class<T> paramClass) {
    Objects.requireNonNull(paramObject);
    return (T)Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[] { paramClass }, new Zg_c(paramObject, this.Zr, this.ZS, true));
  }
  
  public <T> T Zv(Object paramObject, Class<T> paramClass) {
    boolean bool = Zj();
    Objects.requireNonNull(paramObject);
    if (Zbqc.Zwu() == null)
      ZN(!bool); 
    return (T)Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[] { paramClass }, new Zg_c(paramObject, this.Zr, this.ZS, false));
  }
  
  public static void ZN(boolean paramBoolean) {
    ZM = paramBoolean;
  }
  
  public static boolean Zj() {
    return ZM;
  }
  
  public static boolean Zk() {
    boolean bool = Zj();
    return !bool;
  }
  
  static {
    if (Zj())
      ZN(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */