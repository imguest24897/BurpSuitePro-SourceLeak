package burp;

public final class Zz6n extends Record {
  private final Runtime ZN;
  
  public Zz6n(Runtime paramRuntime) {
    this.ZN = paramRuntime;
  }
  
  public int ZY() {
    return this.ZN.availableProcessors();
  }
  
  public long Zj() {
    return this.ZN.maxMemory();
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zz6n;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zz6n;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zz6n;Ljava/lang/Object;)Z
    //   7: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz6n.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */