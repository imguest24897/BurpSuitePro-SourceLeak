package burp;

import java.util.function.BooleanSupplier;

public final class Zzqc extends Record {
  private final int zbu;
  
  private final BooleanSupplier zbW;
  
  private final Zgxp Za;
  
  public Zzqc(Zzys paramZzys, Zgxp paramZgxp) {
    this(paramZzys.ZPo(), paramZzys.ZNH().Zek()::Zhw, paramZgxp);
  }
  
  public Zzqc(int paramInt, BooleanSupplier paramBooleanSupplier, Zgxp paramZgxp) {
    this.zbu = paramInt;
    this.zbW = paramBooleanSupplier;
    this.Za = paramZgxp;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zzqc;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zzqc;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zzqc;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public int Zbu() {
    return this.zbu;
  }
  
  public BooleanSupplier ZbW() {
    return this.zbW;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzqc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */