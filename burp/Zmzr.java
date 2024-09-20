package burp;

final class Zmzr extends Record {
  private final int zwD;
  
  private final Zbza zwX;
  
  Zmzr(int paramInt, Zbza paramZbza) {
    this.zwD = paramInt;
    this.zwX = paramZbza;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zmzr;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zmzr;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zmzr;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public int ZwD() {
    return this.zwD;
  }
  
  public Zbza ZwX() {
    return this.zwX;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmzr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */