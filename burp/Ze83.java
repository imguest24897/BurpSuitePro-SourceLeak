package burp;

import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

final class Ze83 extends Record {
  private final String zkd;
  
  private final Function<Zttx, String> ZO;
  
  private final BiFunction<Zttx, String, Zttx> zks;
  
  private final String zkK;
  
  static final Set<Ze83> Ze = new Zm7n();
  
  Ze83(String paramString1, Function<Zttx, String> paramFunction, BiFunction<Zttx, String, Zttx> paramBiFunction, String paramString2) {
    this.zkd = paramString1;
    this.ZO = paramFunction;
    this.zks = paramBiFunction;
    this.zkK = paramString2;
  }
  
  String Zx(Zttx paramZttx) {
    return (paramZttx == null) ? null : this.ZO.apply(paramZttx);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Ze83;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Ze83;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Ze83;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public String Zkd() {
    return this.zkd;
  }
  
  public BiFunction<Zttx, String, Zttx> Zks() {
    return this.zks;
  }
  
  public String ZkK() {
    return this.zkK;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze83.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */