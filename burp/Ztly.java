package burp;

import javax.swing.text.Highlighter;

final class Ztly extends Record implements Zkv5 {
  private final int startOffset;
  
  private final int endOffset;
  
  private Ztly(int paramInt1, int paramInt2) {
    this.startOffset = paramInt1;
    this.endOffset = paramInt2;
  }
  
  public int ZOl() {
    return 2;
  }
  
  public Zlkk ZOU() {
    return Zlkk.SEARCH_HIGHLIGHT_COLOUR;
  }
  
  public Highlighter.HighlightPainter ZOJ() {
    return new Zz6k(ZOU(), true);
  }
  
  public Zkv5 Zg(int paramInt1, int paramInt2) {
    return new Ztly(paramInt1, paramInt2);
  }
  
  public boolean ZO7() {
    return true;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Ztly;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Ztly;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Ztly;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public int startOffset() {
    return this.startOffset;
  }
  
  public int endOffset() {
    return this.endOffset;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztly.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */