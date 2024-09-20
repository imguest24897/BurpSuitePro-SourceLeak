package burp;

import java.util.List;

public final class Zlbj extends Record {
  private final List<String> zkA;
  
  public Zlbj(List<String> paramList) {
    this.zkA = paramList;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zlbj;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zlbj;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zlbj;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public List<String> ZkA() {
    return this.zkA;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlbj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */