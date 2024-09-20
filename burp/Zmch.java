package burp;

import java.time.Instant;

public final class Zmch extends Record {
  private final Integer ZKB;
  
  private final Instant ZKW;
  
  private final String ZKF;
  
  Zmch() {
    this(null, null, null);
  }
  
  public Zmch(Integer paramInteger, Instant paramInstant, String paramString) {
    this.ZKB = paramInteger;
    this.ZKW = paramInstant;
    this.ZKF = paramString;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zmch;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zmch;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zmch;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public Integer ZKB() {
    return this.ZKB;
  }
  
  public Instant ZKW() {
    return this.ZKW;
  }
  
  public String ZKF() {
    return this.ZKF;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmch.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */