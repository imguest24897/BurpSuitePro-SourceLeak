package burp;

import java.util.Objects;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

final class Zrhx extends Record implements AncestorListener {
  private final Zrid Ze;
  
  private final Ztwv Zj;
  
  private Zrhx(Zrid paramZrid, Ztwv paramZtwv) {
    this.Ze = paramZrid;
    this.Zj = paramZtwv;
  }
  
  public void ancestorAdded(AncestorEvent paramAncestorEvent) {
    Objects.requireNonNull(this.Ze);
    this.Zj.Zx(this.Ze::Zl);
  }
  
  public void ancestorRemoved(AncestorEvent paramAncestorEvent) {}
  
  public void ancestorMoved(AncestorEvent paramAncestorEvent) {}
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zrhx;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zrhx;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zrhx;Ljava/lang/Object;)Z
    //   7: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrhx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */