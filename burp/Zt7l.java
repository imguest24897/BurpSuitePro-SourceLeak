package burp;

import java.util.function.Supplier;

final class Zt7l extends Record implements Zt7b {
  private final Zr2e Zt;
  
  private final Supplier<? extends Zzxp> ZQ;
  
  private Zt7l(Zr2e paramZr2e, Supplier<? extends Zzxp> paramSupplier) {
    this.Zt = paramZr2e;
    this.ZQ = paramSupplier;
  }
  
  public void Zj(Zgu3 paramZgu3) {
    this.Zt.ZC(this.ZQ.get());
  }
  
  public void ZU() {
    this.Zt.ZC(Zzxp.Zr);
  }
  
  public void Zn() {
    this.Zt.Zh();
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zt7l;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zt7l;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zt7l;Ljava/lang/Object;)Z
    //   7: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt7l.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */