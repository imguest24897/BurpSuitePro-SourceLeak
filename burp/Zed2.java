package burp;

import java.util.LinkedList;
import java.util.List;
import net.portswigger.Zdc;

class Zed2 {
  private final Zz1i Zc;
  
  private final Zra1 Zk;
  
  Zed2(Zz1i paramZz1i, Zra1 paramZra1) {
    this.Zc = paramZz1i;
    this.Zk = paramZra1;
  }
  
  List<Integer> ZZ(Zdc paramZdc) {
    int[] arrayOfInt = Zx61.ZS();
    if (!ZX(paramZdc))
      return null; 
    Zkq4 zkq4 = Zkq4.Zk(this.Zc, false);
    LinkedList<Integer> linkedList = new LinkedList();
    Zzu2[] arrayOfZzu2 = Zzu2.values();
    int i = arrayOfZzu2.length;
    byte b = 0;
    while (b < i) {
      Zzu2 zzu2 = arrayOfZzu2[b];
      if (zkq4.Zr(zzu2) && (Zepo.ZN(zzu2.Zg()) || Zh(zkq4, zzu2)))
        linkedList.add(Integer.valueOf(zzu2.ZS())); 
      b++;
      if (arrayOfInt == null)
        break; 
    } 
    return linkedList;
  }
  
  private boolean ZX(Zdc paramZdc) {
    return (this.Zc != null && this.Zk == Zra1.EXECUTION_MODE_ENTERPRISE_AGENT && paramZdc == Zdc.SUCCEEDED);
  }
  
  private static boolean Zh(Ztai paramZtai, Zzu2 paramZzu2) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual Zg : ()Ljava/util/Set;
    //   4: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   9: aload_0
    //   10: aload_1
    //   11: <illegal opcode> test : (Lburp/Ztai;Lburp/Zzu2;)Ljava/util/function/Predicate;
    //   16: invokeinterface anyMatch : (Ljava/util/function/Predicate;)Z
    //   21: ireturn
  }
  
  private static boolean lambda$issueTypeHasAnyEnabledDetectionMethod$0(Ztai paramZtai, Zzu2 paramZzu2, Zr3z paramZr3z) {
    return paramZtai.ZS(paramZzu2, paramZr3z);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zed2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */