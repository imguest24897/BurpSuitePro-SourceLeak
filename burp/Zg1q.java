package burp;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public abstract class Zg1q implements Zb95 {
  private static String[] Zl;
  
  <T extends Zk28> List<Zlxy<T>> Zi(List<Ze7n> paramList, Zlxy<T> paramZlxy) {
    return paramList.stream().filter(Zg1q::lambda$permuteEnumerableInputs$0).filter(Zg1q::lambda$permuteEnumerableInputs$1).flatMap(paramZlxy::lambda$permuteEnumerableInputs$4).toList();
  }
  
  protected <T extends Zk28> Optional<Zlxy<T>> ZD(List<Ze7n> paramList, Zlxy<T> paramZlxy) {
    try {
      if (ZU(paramList))
        return Optional.of(paramZlxy.Zs()); 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return Optional.empty();
  }
  
  protected boolean ZU(List<Ze7n> paramList) {
    return paramList.stream().anyMatch(this::Zj);
  }
  
  protected abstract boolean Zj(Ze7n paramZe7n);
  
  protected static boolean Zn(Ze7n paramZe7n) {
    try {
      switch (Zm17.Zt[paramZe7n.ZY().ordinal()]) {
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
    return false;
  }
  
  private static Stream lambda$permuteEnumerableInputs$4(Zlxy paramZlxy, Ze7n paramZe7n) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface ZX : ()Ljava/util/List;
    //   6: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   11: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   16: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   21: invokeinterface distinct : ()Ljava/util/stream/Stream;
    //   26: aload_1
    //   27: <illegal opcode> test : (Lburp/Ze7n;)Ljava/util/function/Predicate;
    //   32: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   37: aload_0
    //   38: aload_1
    //   39: <illegal opcode> apply : (Lburp/Zlxy;Lburp/Ze7n;)Ljava/util/function/Function;
    //   44: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   49: areturn
  }
  
  private static Zlxy lambda$permuteEnumerableInputs$3(Zlxy paramZlxy, Ze7n paramZe7n, String paramString) {
    return paramZlxy.Zg(Zs2c.Zc(paramZe7n), paramString);
  }
  
  private static boolean lambda$permuteEnumerableInputs$2(Ze7n paramZe7n, String paramString) {
    try {
    
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return !Zsw8.Zn(paramZe7n.Ze(), paramString);
  }
  
  private static boolean lambda$permuteEnumerableInputs$1(Ze7n paramZe7n) {
    try {
    
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return (paramZe7n.ZY() == Zmtz.ENUMERATION);
  }
  
  private static boolean lambda$permuteEnumerableInputs$0(Ze7n paramZe7n) {
    try {
    
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return !paramZe7n.ZH().Zu();
  }
  
  public static void ZQ(String[] paramArrayOfString) {
    Zl = paramArrayOfString;
  }
  
  public static String[] Zp() {
    return Zl;
  }
  
  private static MatchException a(MatchException paramMatchException) {
    return paramMatchException;
  }
  
  static {
    if (Zp() != null)
      ZQ(new String[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg1q.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */