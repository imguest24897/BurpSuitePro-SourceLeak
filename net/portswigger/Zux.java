package net.portswigger;

import java.util.function.Predicate;

final class Zux extends Record {
  private final Zfz zlM;
  
  private final Zfz zlu;
  
  private final boolean zlw;
  
  private final Predicate<Zot> Zv;
  
  private static final Zux ZA = new Zux(Zkc.ZL, Zkc.ZL, false, Zux::lambda$static$0);
  
  Zux(Zfz paramZfz1, Zfz paramZfz2, boolean paramBoolean, Predicate<Zot> paramPredicate) {
    this.zlM = paramZfz1;
    this.zlu = paramZfz2;
    this.zlw = paramBoolean;
    this.Zv = paramPredicate;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lnet/portswigger/Zux;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lnet/portswigger/Zux;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lnet/portswigger/Zux;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public Zfz ZlM() {
    return this.zlM;
  }
  
  public Zfz Zlu() {
    return this.zlu;
  }
  
  public boolean Zlw() {
    return this.zlw;
  }
  
  private static boolean lambda$static$0(Zot paramZot) {
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zux.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */