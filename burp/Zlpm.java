package burp;

import java.awt.event.ActionEvent;
import java.util.function.Consumer;
import javax.swing.KeyStroke;

public final class Zlpm extends Record {
  private final KeyStroke zxZ;
  
  private final Object zx0;
  
  private final Consumer<ActionEvent> zxV;
  
  public Zlpm(int paramInt, Object paramObject, Consumer<ActionEvent> paramConsumer) {
    this(KeyStroke.getKeyStroke(paramInt, 0), paramObject, paramConsumer);
  }
  
  public Zlpm(KeyStroke paramKeyStroke, Object paramObject, Consumer<ActionEvent> paramConsumer) {
    this.zxZ = paramKeyStroke;
    this.zx0 = paramObject;
    this.zxV = paramConsumer;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zlpm;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zlpm;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zlpm;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public KeyStroke ZxZ() {
    return this.zxZ;
  }
  
  public Object Zx0() {
    return this.zx0;
  }
  
  public Consumer<ActionEvent> ZxV() {
    return this.zxV;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlpm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */