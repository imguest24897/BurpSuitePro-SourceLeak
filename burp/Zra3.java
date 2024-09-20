package burp;

final class Zra3 extends Record {
  private final Zm6i zz;
  
  private final int ZO;
  
  private Zra3(Zm6i paramZm6i, int paramInt) {
    this.zz = paramZm6i;
    this.ZO = paramInt;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zra3;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zra3;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zra3;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public Zm6i Zz() {
    return this.zz;
  }
  
  public int ZO() {
    return this.ZO;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zra3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */