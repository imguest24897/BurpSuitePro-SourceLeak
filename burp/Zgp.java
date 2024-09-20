package burp;

import java.awt.Graphics;
import java.awt.Shape;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;
import javax.swing.text.LayeredHighlighter;
import javax.swing.text.Position;
import javax.swing.text.View;

final class Zgp extends Record {
  private final Position Zl;
  
  private final Position Zd;
  
  private final Highlighter.HighlightPainter zlZ;
  
  private Zgp(Position paramPosition1, Position paramPosition2, Highlighter.HighlightPainter paramHighlightPainter) {
    this.Zl = paramPosition1;
    this.Zd = paramPosition2;
    this.zlZ = paramHighlightPainter;
  }
  
  private int Zp() {
    return this.Zl.getOffset();
  }
  
  private int Zl() {
    return this.Zd.getOffset();
  }
  
  private void Ze(Graphics paramGraphics, int paramInt1, int paramInt2, Shape paramShape, JTextComponent paramJTextComponent, View paramView) {
    int i = Zp();
    int j = Zl();
    paramInt1 = Math.max(i, paramInt1);
    paramInt2 = Math.min(j, paramInt2);
    ((LayeredHighlighter.LayerPainter)ZlZ()).paintLayer(paramGraphics, paramInt1, paramInt2, paramShape, paramJTextComponent, paramView);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zgp;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zgp;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zgp;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public Highlighter.HighlightPainter ZlZ() {
    return this.zlZ;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */