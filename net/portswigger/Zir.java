package net.portswigger;

import java.util.function.Predicate;

final class Zir extends Record {
  private final Zg3 zjr;
  
  private final Zg3 zj4;
  
  private final boolean zjK;
  
  private final Predicate<Zld> ZJ;
  
  private static final Zir ZU = new Zir(Ztw.Zg, Ztw.Zg, false, Zir::lambda$static$0);
  
  Zir(Zg3 paramZg31, Zg3 paramZg32, boolean paramBoolean, Predicate<Zld> paramPredicate) {
    this.zjr = paramZg31;
    this.zj4 = paramZg32;
    this.zjK = paramBoolean;
    this.ZJ = paramPredicate;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lnet/portswigger/Zir;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lnet/portswigger/Zir;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lnet/portswigger/Zir;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public Zg3 Zjr() {
    return this.zjr;
  }
  
  public Zg3 Zj4() {
    return this.zj4;
  }
  
  public boolean ZjK() {
    return this.zjK;
  }
  
  private static boolean lambda$static$0(Zld paramZld) {
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zir.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */