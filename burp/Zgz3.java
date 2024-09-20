package burp;

import java.util.function.Consumer;

final class Zgz3 extends Record implements Ztzr {
  private final Consumer<Boolean> ZN;
  
  private Zgz3(Consumer<Boolean> paramConsumer) {
    this.ZN = paramConsumer;
  }
  
  public void Zu() {
    this.ZN.accept(Boolean.valueOf(true));
  }
  
  public void Zl() {
    this.ZN.accept(Boolean.valueOf(false));
  }
  
  public void Zn() {
    this.ZN.accept(Boolean.valueOf(true));
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zgz3;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zgz3;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zgz3;Ljava/lang/Object;)Z
    //   7: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgz3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */