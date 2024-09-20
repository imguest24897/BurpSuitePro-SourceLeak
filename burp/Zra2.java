package burp;

import java.awt.Color;

public final class Zra2 extends Record {
  private final Color ZA3;
  
  private final Color ZAc;
  
  public Zra2(Color paramColor1, Color paramColor2) {
    this.ZA3 = paramColor1;
    this.ZAc = paramColor2;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zra2;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zra2;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zra2;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public Color ZA3() {
    return this.ZA3;
  }
  
  public Color ZAc() {
    return this.ZAc;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zra2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */