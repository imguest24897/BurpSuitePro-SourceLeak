package burp;

import java.util.function.Supplier;

public final class Zxfr<T> extends Record {
  private final Class<T> ZB;
  
  private final Supplier<T> zr;
  
  public Zxfr(Class<T> paramClass, Supplier<T> paramSupplier) {
    this.ZB = paramClass;
    this.zr = paramSupplier;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zxfr;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zxfr;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zxfr;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public Class<T> ZB() {
    return this.ZB;
  }
  
  public Supplier<T> Zr() {
    return this.zr;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxfr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */