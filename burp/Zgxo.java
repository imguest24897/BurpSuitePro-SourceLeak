package burp;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zgxo<T extends Zkrr> {
  private final T ZZ;
  
  private final Collection<Ze46> Zg;
  
  private Zgxo(T paramT, Collection<Ze46> paramCollection) {
    this.ZZ = paramT;
    this.Zg = paramCollection;
  }
  
  protected static <T extends Zkrr> Zgxo<T> Zk(T paramT) {
    return new Zgxo<>(paramT, Collections.emptySet());
  }
  
  protected static <T extends Zkrr> Zgxo<T> ZI(T paramT, Zvs... paramVarArgs) {
    return new Zgxo<>(paramT, (Collection<Ze46>)Arrays.<Zvs>stream(paramVarArgs).map(Ze46::ZT).collect(Collectors.toSet()));
  }
  
  protected static <T extends Zkrr> Zgxo<T> ZB(T paramT, Ze46... paramVarArgs) {
    return new Zgxo<>(paramT, Arrays.asList(paramVarArgs));
  }
  
  private T Zz() {
    return this.ZZ;
  }
  
  private boolean ZI(Zkq4 paramZkq4) {
    try {
      if (this.Zg.stream().anyMatch(Zgxo::lambda$isEnabled$0))
        return false; 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    try {
      if (!this.Zg.isEmpty()) {
        try {
          if (this.Zg.stream().anyMatch(paramZkq4::lambda$isEnabled$1));
        } catch (MatchException matchException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
  }
  
  private boolean Zl(Zz1i paramZz1i, Zl5x paramZl5x, Zxs7 paramZxs7, Collection<Zb09> paramCollection) {
    try {
      if (paramZz1i.Zd(paramZl5x) < 1L)
        return true; 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    Zbsl zbsl = this.ZZ.Zp();
    try {
      switch (Zl0n.Zu[zbsl.ZL().ordinal()]) {
        default:
          throw new MatchException(null, null);
        case 1:
        case 2:
        case 3:
        case 4:
        
        case 5:
          break;
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    try {
    
    } catch (MatchException matchException) {
      throw a(null);
    } 
    Zuh.Zb((paramZxs7 != null), Zqf.Zr);
    return Zf(paramCollection, paramZl5x).or(ZY(paramCollection, paramZl5x, paramZxs7)).or(ZT(paramCollection, paramZl5x, paramZxs7)).test(zbsl);
  }
  
  private static Predicate<Zbsl> Zf(Collection<Zb09> paramCollection, Zl5x paramZl5x) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> test : (Ljava/util/Collection;Lburp/Zl5x;)Ljava/util/function/Predicate;
    //   7: areturn
  }
  
  private static Predicate<Zbsl> ZS(Collection<Zb09> paramCollection, Zl5x paramZl5x) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> test : (Ljava/util/Collection;Lburp/Zl5x;)Ljava/util/function/Predicate;
    //   7: areturn
  }
  
  private static Predicate<Zbsl> ZY(Collection<Zb09> paramCollection, Zl5x paramZl5x, Zxs7 paramZxs7) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: <illegal opcode> test : (Ljava/util/Collection;Lburp/Zl5x;Lburp/Zxs7;)Ljava/util/function/Predicate;
    //   8: areturn
  }
  
  private static Predicate<Zbsl> ZT(Collection<Zb09> paramCollection, Zl5x paramZl5x, Zxs7 paramZxs7) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: <illegal opcode> test : (Ljava/util/Collection;Lburp/Zl5x;Lburp/Zxs7;)Ljava/util/function/Predicate;
    //   8: areturn
  }
  
  private static boolean lambda$failedForCheckAndInsertionPointInThisPhase$9(Collection paramCollection, Zl5x paramZl5x, Zxs7 paramZxs7, Zbsl paramZbsl) {
    // Byte code:
    //   0: aload_0
    //   1: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   6: aload_1
    //   7: aload_2
    //   8: aload_3
    //   9: <illegal opcode> test : (Lburp/Zl5x;Lburp/Zxs7;Lburp/Zbsl;)Ljava/util/function/Predicate;
    //   14: invokeinterface anyMatch : (Ljava/util/function/Predicate;)Z
    //   19: ireturn
  }
  
  private static boolean lambda$failedForCheckAndInsertionPointInThisPhase$8(Zl5x paramZl5x, Zxs7 paramZxs7, Zbsl paramZbsl, Zb09 paramZb09) {
    return paramZb09.Zk(paramZl5x, paramZxs7.Zl(), paramZbsl);
  }
  
  private static boolean lambda$failedForEntireInsertionPoint$7(Collection paramCollection, Zl5x paramZl5x, Zxs7 paramZxs7, Zbsl paramZbsl) {
    // Byte code:
    //   0: aload_0
    //   1: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   6: aload_1
    //   7: aload_2
    //   8: <illegal opcode> test : (Lburp/Zl5x;Lburp/Zxs7;)Ljava/util/function/Predicate;
    //   13: invokeinterface anyMatch : (Ljava/util/function/Predicate;)Z
    //   18: ireturn
  }
  
  private static boolean lambda$failedForEntireInsertionPoint$6(Zl5x paramZl5x, Zxs7 paramZxs7, Zb09 paramZb09) {
    return paramZb09.Zk(paramZl5x, paramZxs7.Zl());
  }
  
  private static boolean lambda$failedForCheckInThisPhase$5(Collection paramCollection, Zl5x paramZl5x, Zbsl paramZbsl) {
    // Byte code:
    //   0: aload_0
    //   1: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   6: aload_1
    //   7: aload_2
    //   8: <illegal opcode> test : (Lburp/Zl5x;Lburp/Zbsl;)Ljava/util/function/Predicate;
    //   13: invokeinterface anyMatch : (Ljava/util/function/Predicate;)Z
    //   18: ireturn
  }
  
  private static boolean lambda$failedForCheckInThisPhase$4(Zl5x paramZl5x, Zbsl paramZbsl, Zb09 paramZb09) {
    return paramZb09.Zn(paramZl5x, paramZbsl);
  }
  
  private static boolean lambda$failedForEntirePhase$3(Collection paramCollection, Zl5x paramZl5x, Zbsl paramZbsl) {
    return paramCollection.stream().anyMatch(paramZl5x::lambda$failedForEntirePhase$2);
  }
  
  private static boolean lambda$failedForEntirePhase$2(Zl5x paramZl5x, Zb09 paramZb09) {
    return paramZb09.ZY(paramZl5x);
  }
  
  private static boolean lambda$isEnabled$1(Zkq4 paramZkq4, Ze46 paramZe46) {
    return paramZkq4.ZS(paramZe46.ZU, paramZe46.ZN);
  }
  
  private static boolean lambda$isEnabled$0(Ze46 paramZe46) {
    try {
    
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return !paramZe46.ZU.ZG();
  }
  
  private static MatchException a(MatchException paramMatchException) {
    return paramMatchException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgxo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */