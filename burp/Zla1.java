package burp;

import java.time.Instant;

final class Zla1 extends Record {
  private final int Zt;
  
  private final Instant zw2;
  
  private Zla1(int paramInt, Instant paramInstant) {
    this.Zt = paramInt;
    this.zw2 = paramInstant;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zla1;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zla1;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zla1;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public Instant Zw2() {
    return this.zw2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zla1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */