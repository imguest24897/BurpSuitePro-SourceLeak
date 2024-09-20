package burp;

import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

public final class Zz5 extends Record {
  private final Set<Zzgy> Ze;
  
  private final Zt58 Zy;
  
  public static final Zz5 ZO = new Zz5(Collections.emptySet(), Zt58.CONTINUE_SCAN_WITHOUT_AI);
  
  public Zz5(Set<Zzgy> paramSet, Zt58 paramZt58) {
    this.Ze = paramSet;
    this.Zy = paramZt58;
  }
  
  private Set<Zzgy> ZL(Zerl paramZerl) {
    return (Set<Zzgy>)this.Ze.stream().filter(paramZerl::lambda$filterEnhancementsByType$0).collect(Collectors.toSet());
  }
  
  public Ztmd Zf() {
    Set<Zzgy> set = ZL(Zerl.AUDIT);
    return new Ztmd(set, this.Zy);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zz5;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zz5;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zz5;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  private static boolean lambda$filterEnhancementsByType$0(Zerl paramZerl, Zzgy paramZzgy) {
    return (paramZzgy.ZN() == paramZerl);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */