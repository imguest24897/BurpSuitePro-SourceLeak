package burp;

import java.awt.Graphics;
import java.util.function.Consumer;

public final class Zgt9 extends Record {
  private final Zx0i zbh;
  
  private final Consumer<Graphics> zbq;
  
  public Zgt9(Zx0i paramZx0i, Consumer<Graphics> paramConsumer) {
    this.zbh = paramZx0i;
    this.zbq = paramConsumer;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zgt9;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zgt9;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zgt9;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public Zx0i Zbh() {
    return this.zbh;
  }
  
  public Consumer<Graphics> Zbq() {
    return this.zbq;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgt9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */