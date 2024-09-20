package burp;

import java.time.Instant;

final class Zef9 extends Record {
  private final Instant ZS;
  
  private final int ZB;
  
  private Zef9(Instant paramInstant, int paramInt) {
    this.ZS = paramInstant;
    this.ZB = paramInt;
  }
  
  private boolean ZI(Instant paramInstant) {
    return paramInstant.isAfter(this.ZS);
  }
  
  private static Zef9 Zu(Instant paramInstant, int paramInt) {
    return new Zef9(paramInstant.plus(Zmp7.Zx[paramInt]), Math.min(paramInt + 1, Zmp7.Zx.length - 1));
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zef9;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zef9;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zef9;Ljava/lang/Object;)Z
    //   7: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zef9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */