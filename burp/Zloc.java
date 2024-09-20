package burp;

final class Zloc extends Record {
  private final Object Zz;
  
  private final Zmzk Zb;
  
  private Zloc(Object paramObject, Zmzk paramZmzk) {
    this.Zz = paramObject;
    this.Zb = paramZmzk;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zloc;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zloc;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zloc;Ljava/lang/Object;)Z
    //   7: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zloc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */