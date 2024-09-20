package burp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import net.portswigger.Zah;
import net.portswigger.Zk_;

final class Zsx1 extends Record implements ActionListener {
  private final ActionListener Zn;
  
  private final Zkvz Zr;
  
  private Zsx1(ActionListener paramActionListener, Zkvz paramZkvz) {
    this.Zn = paramActionListener;
    this.Zr = paramZkvz;
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    try {
      this.Zn.actionPerformed(paramActionEvent);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.EXTENSION_GENERATED);
      throwable.printStackTrace(new PrintStream(this.Zr));
    } 
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zsx1;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zsx1;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zsx1;Ljava/lang/Object;)Z
    //   7: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsx1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */