package burp;

import java.util.Collections;
import java.util.List;

public final class Ztil extends Record {
  private final Zb6q zp_;
  
  private final Zkc9 ZN;
  
  private final List<String> zpy;
  
  public Ztil(Zb6q paramZb6q, Zkc9 paramZkc9, List<String> paramList) {
    this.zp_ = paramZb6q;
    this.ZN = paramZkc9;
    this.zpy = paramList;
  }
  
  static Ztil Zd(Zb6q paramZb6q, List<String> paramList) {
    return new Ztil(paramZb6q, Zkc9.CACHABLE, paramList);
  }
  
  static Ztil Zp() {
    return new Ztil(null, Zkc9.UNSURE, Collections.emptyList());
  }
  
  static Ztil Zt(Zb6q paramZb6q, List<String> paramList) {
    return new Ztil(paramZb6q, Zkc9.NOT_CACHABLE, paramList);
  }
  
  boolean Zm() {
    return (this.ZN == Zkc9.CACHABLE);
  }
  
  boolean ZV() {
    return (this.ZN == Zkc9.NOT_CACHABLE);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Ztil;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Ztil;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Ztil;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public Zb6q Zp_() {
    return this.zp_;
  }
  
  public List<String> Zpy() {
    return this.zpy;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztil.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */