package burp;

final class Ztpv extends Record {
  private final short ZI;
  
  private final short ZP;
  
  Ztpv(short paramShort1, short paramShort2) {
    this.ZI = paramShort1;
    this.ZP = paramShort2;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Ztpv;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Ztpv;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Ztpv;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public short ZI() {
    return this.ZI;
  }
  
  public short ZP() {
    return this.ZP;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztpv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */