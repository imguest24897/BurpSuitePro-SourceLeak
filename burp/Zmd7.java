package burp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

class Zmd7 implements Zg0a<T> {
  private final List<Zg0a<T>> ZI = new ArrayList<>();
  
  private Zmd7(Ztua paramZtua) {}
  
  public void Zo(Zsii<T> paramZsii, BooleanSupplier paramBooleanSupplier, Runnable paramRunnable) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZI : Ljava/util/List;
    //   4: aload_1
    //   5: aload_2
    //   6: aload_3
    //   7: <illegal opcode> accept : (Lburp/Zsii;Ljava/util/function/BooleanSupplier;Ljava/lang/Runnable;)Ljava/util/function/Consumer;
    //   12: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   17: return
  }
  
  public void ZS(Zg0a<T> paramZg0a) {
    this.ZI.add(paramZg0a);
  }
  
  private static void lambda$filterModified$0(Zsii paramZsii, BooleanSupplier paramBooleanSupplier, Runnable paramRunnable, Zg0a paramZg0a) {
    paramZg0a.Zo(paramZsii, paramBooleanSupplier, paramRunnable);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmd7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */