package burp;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class Zzw0 {
  private final Map<Zmzk, Ztb5> Zn;
  
  private final Zrgd Zs;
  
  public Zzw0(Ztwv paramZtwv, Zrgd paramZrgd) {
    this.Zs = paramZrgd;
    this.Zn = new ConcurrentHashMap<>();
    paramZtwv.Ze().scheduleAtFixedRate(new Zlq4(this.Zn), 2500L, 2500L, TimeUnit.MILLISECONDS);
  }
  
  Zrj8 ZQ(Zmzk paramZmzk) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zn : Ljava/util/Map;
    //   4: aload_1
    //   5: aload_0
    //   6: aload_1
    //   7: <illegal opcode> apply : (Lburp/Zzw0;Lburp/Zmzk;)Ljava/util/function/Function;
    //   12: invokeinterface computeIfAbsent : (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
    //   17: checkcast burp/Ztb5
    //   20: astore_2
    //   21: aload_2
    //   22: invokevirtual Zt : ()Lburp/Zrj8;
    //   25: areturn
  }
  
  private Ztb5 lambda$lease$0(Zmzk paramZmzk1, Zmzk paramZmzk2) {
    return new Ztb5(this.Zs, paramZmzk1);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzw0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */