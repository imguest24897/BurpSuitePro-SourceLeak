package burp;

final class Zlxb extends Record {
  private final boolean zv;
  
  private final int ZY;
  
  private final int ZU;
  
  Zlxb(boolean paramBoolean, int paramInt1, int paramInt2) {
    this.zv = paramBoolean;
    this.ZY = paramInt1;
    this.ZU = paramInt2;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zlxb;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zlxb;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zlxb;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public boolean Zv() {
    return this.zv;
  }
  
  public int ZY() {
    return this.ZY;
  }
  
  public int ZU() {
    return this.ZU;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlxb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */