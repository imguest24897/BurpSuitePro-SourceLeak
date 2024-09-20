package burp;

import javax.swing.Action;

final class Zm9 extends Record {
  private final Object ZZO;
  
  private final Action ZZm;
  
  private Zm9(Object paramObject, Action paramAction) {
    this.ZZO = paramObject;
    this.ZZm = paramAction;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zm9;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zm9;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zm9;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public Object ZZO() {
    return this.ZZO;
  }
  
  public Action ZZm() {
    return this.ZZm;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */