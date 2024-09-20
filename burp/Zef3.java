package burp;

final class Zef3 extends Record {
  private final boolean ZRQ;
  
  private final int ZRG;
  
  private final int ZR6;
  
  private final int ZRq;
  
  Zef3(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3) {
    this.ZRQ = paramBoolean;
    this.ZRG = paramInt1;
    this.ZR6 = paramInt2;
    this.ZRq = paramInt3;
  }
  
  Zef3 ZRj() {
    return new Zef3(false, this.ZRG, this.ZR6, this.ZRq);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zef3;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zef3;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zef3;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public boolean ZRQ() {
    return this.ZRQ;
  }
  
  public int ZRG() {
    return this.ZRG;
  }
  
  public int ZR6() {
    return this.ZR6;
  }
  
  public int ZRq() {
    return this.ZRq;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zef3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */