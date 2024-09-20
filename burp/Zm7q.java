package burp;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import net.portswigger.Zto;

public class Zm7q implements Zmf7 {
  private final Function<Zxs7, String> Zw;
  
  Zm7q(Function<Zxs7, String> paramFunction) {
    this.Zw = paramFunction;
  }
  
  public boolean ZC(Zxs7 paramZxs7) {
    return true;
  }
  
  public Optional<Zxs7> Ze(Zto<String, Zro0> paramZto, Zxs7 paramZxs7, Map<Zto<String, Zro0>, Zxs7> paramMap) {
    // Byte code:
    //   0: aload_3
    //   1: invokeinterface values : ()Ljava/util/Collection;
    //   6: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   11: aload_0
    //   12: aload_1
    //   13: <illegal opcode> test : (Lburp/Zm7q;Lnet/portswigger/Zto;)Ljava/util/function/Predicate;
    //   18: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   23: invokestatic toList : ()Ljava/util/stream/Collector;
    //   26: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   31: checkcast java/util/List
    //   34: astore #4
    //   36: aload #4
    //   38: invokeinterface isEmpty : ()Z
    //   43: ifne -> 90
    //   46: aload #4
    //   48: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   53: aload_2
    //   54: <illegal opcode> test : (Lburp/Zxs7;)Ljava/util/function/Predicate;
    //   59: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   64: invokeinterface findFirst : ()Ljava/util/Optional;
    //   69: aload #4
    //   71: iconst_0
    //   72: invokeinterface get : (I)Ljava/lang/Object;
    //   77: checkcast burp/Zxs7
    //   80: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   83: checkcast burp/Zxs7
    //   86: invokestatic of : (Ljava/lang/Object;)Ljava/util/Optional;
    //   89: areturn
    //   90: invokestatic empty : ()Ljava/util/Optional;
    //   93: areturn
  }
  
  private static boolean lambda$matches$1(Zxs7 paramZxs71, Zxs7 paramZxs72) {
    return paramZxs72.ZI().equals(paramZxs71.ZI());
  }
  
  private boolean lambda$matches$0(Zto paramZto, Zxs7 paramZxs7) {
    return ((String)this.Zw.apply(paramZxs7)).equals(paramZto.Zq);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm7q.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */