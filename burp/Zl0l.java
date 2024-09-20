package burp;

import net.portswigger.browser.Zci;

public final class Zl0l extends Record {
  private final Zci ZIV;
  
  public Zl0l(Zci paramZci) {
    this.ZIV = paramZci;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zl0l;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zl0l;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zl0l;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public Zci ZIV() {
    return this.ZIV;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl0l.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */