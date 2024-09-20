package burp;

final class Zzta extends Record implements Zkv5 {
  private final int startOffset;
  
  private final int endOffset;
  
  private Zzta(int paramInt1, int paramInt2) {
    this.startOffset = paramInt1;
    this.endOffset = paramInt2;
  }
  
  public Zlkk ZOU() {
    return Zlkk.TEXT_EDITOR_SELECTION_BACKGROUND;
  }
  
  public boolean ZO7() {
    return true;
  }
  
  public Zkv5 Zg(int paramInt1, int paramInt2) {
    return new Zzta(paramInt1, paramInt2);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zzta;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zzta;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zzta;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public int startOffset() {
    return this.startOffset;
  }
  
  public int endOffset() {
    return this.endOffset;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzta.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */