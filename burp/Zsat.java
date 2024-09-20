package burp;

final class Zsat extends Record {
  private final int ZLZ;
  
  private final int ZLr;
  
  private final int ZLt;
  
  private final int ZLc;
  
  private Zsat(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.ZLZ = paramInt1;
    this.ZLr = paramInt2;
    this.ZLt = paramInt3;
    this.ZLc = paramInt4;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zsat;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zsat;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zsat;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public int ZLZ() {
    return this.ZLZ;
  }
  
  public int ZLr() {
    return this.ZLr;
  }
  
  public int ZLt() {
    return this.ZLt;
  }
  
  public int ZLc() {
    return this.ZLc;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsat.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */