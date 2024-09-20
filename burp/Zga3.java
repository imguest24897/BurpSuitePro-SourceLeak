package burp;

import java.awt.Component;
import java.awt.Point;
import java.util.Optional;

public final class Zga3 extends Record {
  private final Zs3f ZLM;
  
  private final Point ZN;
  
  public Zga3(Component paramComponent) {
    this(new Zs3f(paramComponent), Optional.<Component>ofNullable(paramComponent).map(Component::getLocation).orElse(null));
  }
  
  public Zga3(Zs3f paramZs3f, Point paramPoint) {
    this.ZLM = paramZs3f;
    this.ZN = paramPoint;
  }
  
  int ZLF() {
    return ((Integer)Optional.<Point>ofNullable(this.ZN).map(Zga3::lambda$x$0).orElse(Integer.valueOf(0))).intValue();
  }
  
  int ZI() {
    return ((Integer)Optional.<Point>ofNullable(this.ZN).map(Zga3::lambda$y$1).orElse(Integer.valueOf(0))).intValue();
  }
  
  int ZL() {
    return ((Integer)Optional.<Zs3f>ofNullable(this.ZLM).map(Zs3f::ZZy).orElse(Integer.valueOf(0))).intValue();
  }
  
  int Zd() {
    return ((Integer)Optional.<Zs3f>ofNullable(this.ZLM).map(Zs3f::ZZ0).orElse(Integer.valueOf(0))).intValue();
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zga3;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zga3;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zga3;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public Zs3f ZLM() {
    return this.ZLM;
  }
  
  private static Integer lambda$y$1(Point paramPoint) {
    return Integer.valueOf(paramPoint.y);
  }
  
  private static Integer lambda$x$0(Point paramPoint) {
    return Integer.valueOf(paramPoint.x);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zga3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */