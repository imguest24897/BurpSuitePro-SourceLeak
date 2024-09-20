package burp;

final class Zgsn extends Record {
  private final Zey ZV0;
  
  private final byte ZVh;
  
  private Zgsn(Zey paramZey, byte paramByte) {
    this.ZV0 = paramZey;
    this.ZVh = paramByte;
  }
  
  public String Ze(Zd paramZd) {
    return ZV0().ZH(paramZd);
  }
  
  public Zvs ZVk() {
    return ZV0().ZC();
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zgsn;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zgsn;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zgsn;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public Zey ZV0() {
    return this.ZV0;
  }
  
  public byte ZVh() {
    return this.ZVh;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgsn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */