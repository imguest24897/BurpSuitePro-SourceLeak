package burp;

import java.util.concurrent.atomic.AtomicBoolean;
import net.portswigger.Zfc;
import net.portswigger.Zup;

public class Zray extends Zrat {
  private static final AtomicBoolean ZH = new AtomicBoolean();
  
  private final Zxei ZS;
  
  private final Zz9q ZE;
  
  public Zray(Zxei paramZxei, Zz9q paramZz9q) {
    this.ZS = paramZxei;
    this.ZE = paramZz9q;
  }
  
  public void ZJ(Zg1c paramZg1c, Zup paramZup) {
    // Byte code:
    //   0: invokestatic ZG : ()Z
    //   3: ifne -> 21
    //   6: aload_0
    //   7: getfield ZS : Lburp/Zxei;
    //   10: invokeinterface ZF : ()Lburp/Zl04;
    //   15: invokestatic ZE : (Ljava/awt/Window;)Z
    //   18: ifeq -> 22
    //   21: return
    //   22: getstatic burp/Zray.ZH : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   25: iconst_1
    //   26: invokevirtual getAndSet : (Z)Z
    //   29: ifne -> 95
    //   32: aload_2
    //   33: getfield ZU : Ljava/util/List;
    //   36: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   41: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   46: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   51: aload_0
    //   52: getfield ZE : Lburp/Zz9q;
    //   55: dup
    //   56: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   59: pop
    //   60: <illegal opcode> test : (Lburp/Zz9q;)Ljava/util/function/Predicate;
    //   65: invokestatic not : (Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
    //   68: invokeinterface anyMatch : (Ljava/util/function/Predicate;)Z
    //   73: istore_3
    //   74: iload_3
    //   75: ifeq -> 95
    //   78: aload_0
    //   79: getfield ZS : Lburp/Zxei;
    //   82: aload_0
    //   83: aload_1
    //   84: aload_2
    //   85: <illegal opcode> run : (Lburp/Zray;Lburp/Zg1c;Lnet/portswigger/Zup;)Ljava/lang/Runnable;
    //   90: invokeinterface ZY : (Ljava/lang/Runnable;)V
    //   95: return
  }
  
  private void lambda$processUpdateAvailable$1(Zg1c paramZg1c, Zup paramZup) {
    new Ztq5(paramZg1c, paramZup, new Zeyi(Zzty.BACKGROUND_CHECK_FOR_UPDATES, true), this.ZS, this.ZE);
  }
  
  private static String lambda$processUpdateAvailable$0(Zfc paramZfc) {
    return paramZfc.Zu;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zray.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */