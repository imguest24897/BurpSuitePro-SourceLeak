package burp;

import java.awt.Component;
import java.awt.Rectangle;
import java.util.Optional;

public final class Zs3f extends Record {
  private final Component ZZx;
  
  private final Rectangle ZZA;
  
  public Zs3f(Component paramComponent) {
    this(paramComponent, null);
  }
  
  public Zs3f(Component paramComponent, Rectangle paramRectangle) {
    this.ZZx = paramComponent;
    this.ZZA = paramRectangle;
  }
  
  int ZZy() {
    return (this.ZZA == null) ? ((Integer)Optional.<Component>ofNullable(this.ZZx).map(Component::getWidth).orElse(Integer.valueOf(0))).intValue() : this.ZZA.width;
  }
  
  int ZZ0() {
    return (this.ZZA == null) ? ((Integer)Optional.<Component>ofNullable(this.ZZx).map(Component::getHeight).orElse(Integer.valueOf(0))).intValue() : this.ZZA.height;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zs3f;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zs3f;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zs3f;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public Component ZZx() {
    return this.ZZx;
  }
  
  public Rectangle ZZA() {
    return this.ZZA;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs3f.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */