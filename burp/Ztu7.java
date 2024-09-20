package burp;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ztu7 {
  private static int[] Zf;
  
  static Collection<Zeu9> Zw(Zbj5 paramZbj5, Zefg<Zrim> paramZefg) {
    synchronized (paramZefg.Zz6()) {
      return (Collection<Zeu9>)paramZefg.stream().flatMap(paramZbj5::lambda$getCandidateRoomsForMatching$0).collect(Collectors.toSet());
    } 
  }
  
  static void ZM(Zeu9 paramZeu9, Zbj5 paramZbj5, Zefg<Zrim> paramZefg) {
    // Byte code:
    //   0: aload_2
    //   1: invokeinterface Zz6 : ()Ljava/lang/Object;
    //   6: dup
    //   7: astore_3
    //   8: monitorenter
    //   9: aload_2
    //   10: aload_0
    //   11: aload_1
    //   12: <illegal opcode> accept : (Lburp/Zeu9;Lburp/Zbj5;)Ljava/util/function/Consumer;
    //   17: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   22: aload_3
    //   23: monitorexit
    //   24: goto -> 34
    //   27: astore #4
    //   29: aload_3
    //   30: monitorexit
    //   31: aload #4
    //   33: athrow
    //   34: return
    // Exception table:
    //   from	to	target	type
    //   9	24	27	finally
    //   27	31	27	finally
  }
  
  static void ZV(Zeu9 paramZeu9, Zefg<Zrim> paramZefg, Zrfx<Zeu9> paramZrfx) {
    int[] arrayOfInt = Zz();
    synchronized (paramZefg.Zz6()) {
      paramZrfx.add(paramZeu9);
      paramZefg.forEach(paramZeu9::lambda$addRoom$2);
    } 
    if (Zbqc.Zwu() == null)
      Zs(new int[1]); 
  }
  
  private static void lambda$addRoom$2(Zeu9 paramZeu9, Zrim paramZrim) {
    paramZrim.ZC(paramZeu9);
  }
  
  private static void lambda$matchingCriteriaChanged$1(Zeu9 paramZeu9, Zbj5 paramZbj5, Zrim paramZrim) {
    paramZrim.Zn(paramZeu9, paramZbj5);
  }
  
  private static Stream lambda$getCandidateRoomsForMatching$0(Zbj5 paramZbj5, Zrim paramZrim) {
    return paramZrim.Zh(paramZbj5).stream();
  }
  
  public static void Zs(int[] paramArrayOfint) {
    Zf = paramArrayOfint;
  }
  
  public static int[] Zz() {
    return Zf;
  }
  
  static {
    if (Zz() == null)
      Zs(new int[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztu7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */