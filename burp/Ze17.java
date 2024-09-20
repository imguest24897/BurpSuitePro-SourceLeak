package burp;

import java.time.Instant;

final class Ze17 extends Record {
  private final int ZGF;
  
  private final Instant ZZ;
  
  private Ze17(int paramInt, Instant paramInstant) {
    this.ZGF = paramInt;
    this.ZZ = paramInstant;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Ze17;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Ze17;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Ze17;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public int ZGF() {
    return this.ZGF;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze17.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */