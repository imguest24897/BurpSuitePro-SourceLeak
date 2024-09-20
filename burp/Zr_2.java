package burp;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Zr_2 implements Zlfd {
  private final Map<String, Zspe> Zx = new ConcurrentHashMap<>();
  
  public Zspe Z_(Zl7q paramZl7q, int paramInt) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface Za : ()Z
    //   6: ifeq -> 47
    //   9: iload_2
    //   10: ifne -> 18
    //   13: ldc 2147483647
    //   15: goto -> 19
    //   18: iload_2
    //   19: istore_3
    //   20: aload_0
    //   21: getfield Zx : Ljava/util/Map;
    //   24: aload_1
    //   25: invokeinterface ZW : ()Ljava/lang/String;
    //   30: aload_0
    //   31: aload_1
    //   32: iload_3
    //   33: <illegal opcode> apply : (Lburp/Zr_2;Lburp/Zl7q;I)Ljava/util/function/Function;
    //   38: invokeinterface computeIfAbsent : (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
    //   43: checkcast burp/Zspe
    //   46: areturn
    //   47: getstatic burp/Zspe.Zk : Lburp/Zspe;
    //   50: areturn
  }
  
  public Zspe ZV(Zl7q paramZl7q) {
    return this.Zx.getOrDefault(paramZl7q.ZW(), Zspe.Zk);
  }
  
  private Zspe lambda$createOrRetrieveBarrierFor$1(Zl7q paramZl7q, int paramInt, String paramString) {
    // Byte code:
    //   0: new burp/Zz15
    //   3: dup
    //   4: aload_1
    //   5: invokeinterface Zs : ()I
    //   10: iload_2
    //   11: aload_0
    //   12: aload_3
    //   13: <illegal opcode> run : (Lburp/Zr_2;Ljava/lang/String;)Ljava/lang/Runnable;
    //   18: invokespecial <init> : (IILjava/lang/Runnable;)V
    //   21: areturn
  }
  
  private void lambda$createOrRetrieveBarrierFor$0(String paramString) {
    this.Zx.remove(paramString);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr_2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */