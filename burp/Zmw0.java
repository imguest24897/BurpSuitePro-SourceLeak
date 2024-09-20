package burp;

import java.util.Optional;
import java.util.function.Function;

public class Zmw0 implements Zz4_ {
  private final Zz4_ Zt;
  
  private final Zg75 ZA;
  
  private final Function<Zx_5, Optional<Zxs7>> ZY;
  
  public Zmw0(Zz4_ paramZz4_, Zg75 paramZg75, Zxs7 paramZxs7) {
    this(paramZz4_, paramZg75, paramZxs7::lambda$new$1);
  }
  
  public Zmw0(Zz4_ paramZz4_, Zg75 paramZg75, Function<Zx_5, Optional<Zxs7>> paramFunction) {
    this.Zt = paramZz4_;
    this.ZA = paramZg75;
    this.ZY = paramFunction;
  }
  
  public void Zz(Zsqx<Zrdb> paramZsqx) {
    // Byte code:
    //   0: aload_1
    //   1: checkcast burp/Zx_5
    //   4: astore_2
    //   5: aload_0
    //   6: getfield Zt : Lburp/Zz4_;
    //   9: aload_2
    //   10: invokeinterface Zz : (Lburp/Zsqx;)V
    //   15: aload_0
    //   16: getfield ZY : Ljava/util/function/Function;
    //   19: aload_2
    //   20: invokeinterface apply : (Ljava/lang/Object;)Ljava/lang/Object;
    //   25: checkcast java/util/Optional
    //   28: aload_0
    //   29: aload_2
    //   30: <illegal opcode> accept : (Lburp/Zmw0;Lburp/Zx_5;)Ljava/util/function/Consumer;
    //   35: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   38: return
  }
  
  public void ZL(Runnable paramRunnable) {
    this.Zt.ZL(paramRunnable);
  }
  
  public void Zy(Runnable paramRunnable) {
    this.Zt.Zy(paramRunnable);
  }
  
  public boolean ZP() {
    return this.Zt.ZP();
  }
  
  public void Zh() {
    this.Zt.Zh();
  }
  
  public void ZC() {
    this.Zt.ZC();
  }
  
  public String toString() {
    return this.Zt.toString();
  }
  
  private void lambda$add$3(Zx_5 paramZx_5, Zxs7 paramZxs7) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: aload_2
    //   3: aload_1
    //   4: <illegal opcode> run : (Lburp/Zmw0;Lburp/Zxs7;Lburp/Zx_5;)Ljava/lang/Runnable;
    //   9: invokevirtual ZL : (Ljava/lang/Runnable;)V
    //   12: return
  }
  
  private void lambda$add$2(Zxs7 paramZxs7, Zx_5 paramZx_5) {
    this.ZA.Zb(paramZxs7, paramZx_5.ZN());
  }
  
  private static Optional lambda$new$1(Zxs7 paramZxs7, Zx_5 paramZx_5) {
    return Optional.<Zx_5>ofNullable(paramZx_5).map(paramZxs7::lambda$new$0);
  }
  
  private static Zxs7 lambda$new$0(Zxs7 paramZxs7, Zx_5 paramZx_5) {
    return paramZxs7;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmw0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */