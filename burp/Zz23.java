package burp;

import javax.swing.text.Highlighter;
import net.portswigger.javatooling.api.Range;

final class Zz23 extends Record implements Zkv5 {
  private final int startOffset;
  
  private final int endOffset;
  
  public Zz23(Range paramRange) {
    this(paramRange.startIndex(), paramRange.endIndex() + 1);
  }
  
  private Zz23(int paramInt1, int paramInt2) {
    this.startOffset = paramInt1;
    this.endOffset = paramInt2;
  }
  
  public Zlkk ZOU() {
    return Zlkk.JAVA_EDITOR_ERROR;
  }
  
  public Highlighter.HighlightPainter ZOJ() {
    return new Zz6c(ZOU());
  }
  
  public boolean ZO7() {
    return true;
  }
  
  public Zkv5 Zg(int paramInt1, int paramInt2) {
    return new Zz23(paramInt1, paramInt2);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zz23;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zz23;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zz23;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public int startOffset() {
    return this.startOffset;
  }
  
  public int endOffset() {
    return this.endOffset;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz23.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */