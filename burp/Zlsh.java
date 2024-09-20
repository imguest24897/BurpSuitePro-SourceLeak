package burp;

public final class Zlsh extends Record implements Zkv5 {
  private final int startOffset;
  
  private final int endOffset;
  
  private final Zlkk ZOU;
  
  public Zlsh(int paramInt1, int paramInt2) {
    this(paramInt1, paramInt2, Zlkk.DEFAULT_FIXED_HIGHLIGHT_COLOUR);
  }
  
  public Zlsh(int paramInt1, int paramInt2, Zlkk paramZlkk) {
    this.startOffset = paramInt1;
    this.endOffset = paramInt2;
    this.ZOU = paramZlkk;
  }
  
  public Zkv5 Zg(int paramInt1, int paramInt2) {
    return new Zlsh(paramInt1, paramInt2, this.ZOU);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zlsh;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zlsh;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zlsh;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public int startOffset() {
    return this.startOffset;
  }
  
  public int endOffset() {
    return this.endOffset;
  }
  
  public Zlkk ZOU() {
    return this.ZOU;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlsh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */