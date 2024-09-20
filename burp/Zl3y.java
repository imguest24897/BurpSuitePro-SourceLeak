package burp;

import java.util.function.Supplier;

final class Zl3y extends Record implements Zt7b {
  private final Zr2e Zx;
  
  private final Supplier<? extends Zzxp> ZP;
  
  private Zl3y(Zr2e paramZr2e, Supplier<? extends Zzxp> paramSupplier) {
    this.Zx = paramZr2e;
    this.ZP = paramSupplier;
  }
  
  public void Zj(Zgu3 paramZgu3) {
    this.Zx.Zd(this.ZP.get());
  }
  
  public void ZU() {
    this.Zx.Zd(Zzxp.Zr);
  }
  
  public void Zn() {
    this.Zx.ZY();
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zl3y;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zl3y;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zl3y;Ljava/lang/Object;)Z
    //   7: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl3y.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */