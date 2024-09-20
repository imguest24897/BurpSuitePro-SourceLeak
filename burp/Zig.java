package burp;

import java.util.Optional;
import java.util.function.Supplier;

final class Zig extends Record {
  private final Zsuo zz6;
  
  private final Supplier<Zsmh> zzm;
  
  private final Supplier<Zsmh> Zp;
  
  private final Supplier<Boolean> zzu;
  
  private final Ztd7 zzn;
  
  private Zig(Zsuo paramZsuo, Supplier<Zsmh> paramSupplier1, Supplier<Zsmh> paramSupplier2, Supplier<Boolean> paramSupplier, Ztd7 paramZtd7) {
    this.zz6 = paramZsuo;
    this.zzm = paramSupplier1;
    this.Zp = paramSupplier2;
    this.zzu = paramSupplier;
    this.zzn = paramZtd7;
  }
  
  Optional<Zsmh> Zza() {
    return Optional.ofNullable(this.zzm.get());
  }
  
  Optional<Zsmh> ZzS() {
    return Optional.ofNullable(this.Zp.get());
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zig;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zig;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zig;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public Zsuo Zz6() {
    return this.zz6;
  }
  
  public Supplier<Zsmh> Zzm() {
    return this.zzm;
  }
  
  public Supplier<Boolean> Zzu() {
    return this.zzu;
  }
  
  public Ztd7 Zzn() {
    return this.zzn;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zig.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */