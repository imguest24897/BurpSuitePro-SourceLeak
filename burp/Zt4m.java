package burp;

import java.util.Objects;
import java.util.Queue;

public class Zt4m extends Zt4q {
  Zt4m(Zl7h paramZl7h, Zr69 paramZr69, Zr_4 paramZr_4, Zkl6 paramZkl6, Zz1m<Zt18> paramZz1m, Ztos<Zt35> paramZtos) {
    super(paramZl7h, paramZr69, paramZz1m, paramZr_4, paramZkl6, paramZtos);
  }
  
  public Queue<Zez7> Zf() {
    // Byte code:
    //   0: new java/util/LinkedList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_1
    //   8: aload_1
    //   9: new burp/Zezt
    //   12: dup
    //   13: aload_0
    //   14: invokevirtual Zj : ()B
    //   17: aload_0
    //   18: getfield Zv : Lburp/Zr69;
    //   21: aload_0
    //   22: getfield Zd : Lburp/Ztos;
    //   25: aload_0
    //   26: getfield Zn : Lburp/Zkl6;
    //   29: aload_0
    //   30: getfield ZR : Lburp/Zl7h;
    //   33: aload_0
    //   34: getfield ZR : Lburp/Zl7h;
    //   37: invokeinterface ZVf : ()Lburp/Ztfk;
    //   42: invokeinterface ZA : ()Ljava/util/Optional;
    //   47: aconst_null
    //   48: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   51: checkcast burp/Zg_f
    //   54: invokespecial <init> : (BLburp/Zr69;Lburp/Ztos;Lburp/Zkl6;Lburp/Zl7h;Lburp/Zg_f;)V
    //   57: invokeinterface add : (Ljava/lang/Object;)Z
    //   62: pop
    //   63: aload_0
    //   64: getfield ZR : Lburp/Zl7h;
    //   67: invokeinterface ZVf : ()Lburp/Ztfk;
    //   72: invokeinterface ZV : ()Ljava/util/Optional;
    //   77: aload_0
    //   78: aload_1
    //   79: <illegal opcode> accept : (Lburp/Zt4m;Ljava/util/Queue;)Ljava/util/function/Consumer;
    //   84: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   87: aload_1
    //   88: areturn
  }
  
  private void lambda$buildScenes$1(Queue paramQueue, Ztfa paramZtfa) {
    Objects.requireNonNull(paramQueue);
    paramZtfa.Zdv().stream().map(this::lambda$buildScenes$0).forEach(paramQueue::add);
  }
  
  private Zeze lambda$buildScenes$0(Zko4 paramZko4) {
    return new Zeze(Zj(), this.Zv, this.ZR, this.Zd, paramZko4);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt4m.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */