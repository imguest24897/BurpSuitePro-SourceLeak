package burp;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import net.portswigger.Zto;

public class Zrmp implements Zmf7 {
  private final Function<Zxs7, String> ZN;
  
  Zrmp(Function<Zxs7, String> paramFunction) {
    this.ZN = paramFunction;
  }
  
  public boolean ZC(Zxs7 paramZxs7) {
    return paramZxs7 instanceof Zlh;
  }
  
  public Optional<Zxs7> Ze(Zto<String, Zro0> paramZto, Zxs7 paramZxs7, Map<Zto<String, Zro0>, Zxs7> paramMap) {
    // Byte code:
    //   0: aload_3
    //   1: invokeinterface values : ()Ljava/util/Collection;
    //   6: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   11: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   16: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   21: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   26: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   31: aload_2
    //   32: <illegal opcode> test : (Lburp/Zxs7;)Ljava/util/function/Predicate;
    //   37: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   42: aload_0
    //   43: aload_1
    //   44: <illegal opcode> test : (Lburp/Zrmp;Lnet/portswigger/Zto;)Ljava/util/function/Predicate;
    //   49: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   54: invokestatic toList : ()Ljava/util/stream/Collector;
    //   57: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   62: checkcast java/util/List
    //   65: astore #4
    //   67: aload #4
    //   69: invokeinterface isEmpty : ()Z
    //   74: ifne -> 92
    //   77: aload #4
    //   79: iconst_0
    //   80: invokeinterface get : (I)Ljava/lang/Object;
    //   85: checkcast burp/Zxs7
    //   88: invokestatic of : (Ljava/lang/Object;)Ljava/util/Optional;
    //   91: areturn
    //   92: invokestatic empty : ()Ljava/util/Optional;
    //   95: areturn
  }
  
  private boolean lambda$matches$3(Zto paramZto, Zlh paramZlh) {
    return ((String)this.ZN.apply(paramZlh)).equals(paramZto.Zq);
  }
  
  private static boolean lambda$matches$2(Zxs7 paramZxs7, Zlh paramZlh) {
    return (paramZlh.ZP() == paramZxs7.ZP());
  }
  
  private static Zlh lambda$matches$1(Zxs7 paramZxs7) {
    return (Zlh)paramZxs7;
  }
  
  private static boolean lambda$matches$0(Zxs7 paramZxs7) {
    return paramZxs7 instanceof Zlh;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrmp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */