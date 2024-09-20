package burp;

import javax.swing.text.Highlighter;

final class Zbuk extends Record implements Zkv5 {
  private final int startOffset;
  
  private final int endOffset;
  
  private final Highlighter.HighlightPainter ZOJ;
  
  private Zbuk(int paramInt1, int paramInt2, Highlighter.HighlightPainter paramHighlightPainter) {
    this.startOffset = paramInt1;
    this.endOffset = paramInt2;
    this.ZOJ = paramHighlightPainter;
  }
  
  public Zlkk ZOU() {
    return Zlkk.TRANSPARENT;
  }
  
  public Zkv5 Zg(int paramInt1, int paramInt2) {
    return new Zbuk(paramInt1, paramInt2, this.ZOJ);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zbuk;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zbuk;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zbuk;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public int startOffset() {
    return this.startOffset;
  }
  
  public int endOffset() {
    return this.endOffset;
  }
  
  public Highlighter.HighlightPainter ZOJ() {
    return this.ZOJ;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbuk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */