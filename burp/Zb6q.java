package burp;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public interface Zb6q {
  List<String> Zm();
  
  short Ze();
  
  int Zs();
  
  int ZF();
  
  Zstu Za();
  
  Zstu Zt();
  
  List<String> Zg();
  
  Zl6b Zp();
  
  default Optional<String> ZY(String paramString) {
    return ZD(paramString, false);
  }
  
  default Optional<String> ZD(String paramString, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: iload_2
    //   2: aload_1
    //   3: <illegal opcode> test : (ZLjava/lang/String;)Ljava/util/function/Predicate;
    //   8: invokeinterface ZK : (Ljava/util/function/Predicate;)Ljava/util/List;
    //   13: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   18: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   23: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   28: invokeinterface findFirst : ()Ljava/util/Optional;
    //   33: areturn
  }
  
  default List<String> ZK(Predicate<String> paramPredicate) {
    return (List<String>)Zm().stream().filter(paramPredicate).collect(Collectors.toList());
  }
  
  private static String lambda$getHeaderValue$1(String paramString) {
    return Zsw8.ZU(paramString, ":").trim();
  }
  
  private static boolean lambda$getHeaderValue$0(boolean paramBoolean, String paramString1, String paramString2) {
    return paramBoolean ? paramString2.startsWith(paramString1 + ":") : Zsw8.Zh(paramString2, paramString1 + ":");
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb6q.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */