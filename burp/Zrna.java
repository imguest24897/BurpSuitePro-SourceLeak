package burp;

public final class Zrna extends Record {
  private final int ZC6;
  
  private final Zxxk ZCL;
  
  public Zrna(int paramInt, Zxxk paramZxxk) {
    this.ZC6 = paramInt;
    this.ZCL = paramZxxk;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zrna;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zrna;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zrna;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public int ZC6() {
    return this.ZC6;
  }
  
  public Zxxk ZCL() {
    return this.ZCL;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrna.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */