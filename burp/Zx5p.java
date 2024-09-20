package burp;

import java.util.Collection;

public final class Zx5p extends Record {
  private final Collection<Zrnc> zhI;
  
  public Zx5p(Collection<Zrnc> paramCollection) {
    this.zhI = paramCollection;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zx5p;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zx5p;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zx5p;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public Collection<Zrnc> ZhI() {
    return this.zhI;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx5p.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */