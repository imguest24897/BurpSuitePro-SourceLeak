package burp;

import java.util.function.Supplier;

final class Ztsk extends Record implements Zt7b {
  private final Zr2e Zi;
  
  private final Supplier<? extends Zzxp> Zf;
  
  private Ztsk(Zr2e paramZr2e, Supplier<? extends Zzxp> paramSupplier) {
    this.Zi = paramZr2e;
    this.Zf = paramSupplier;
  }
  
  public void Zj(Zgu3 paramZgu3) {
    this.Zi.ZU(this.Zf.get());
  }
  
  public void ZU() {
    this.Zi.ZU(Zzxp.Zr);
  }
  
  public void Zn() {
    this.Zi.Zy();
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Ztsk;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Ztsk;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Ztsk;Ljava/lang/Object;)Z
    //   7: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztsk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */