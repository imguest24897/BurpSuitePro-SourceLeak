package burp;

import java.util.Collection;

final class Zrdv extends Record {
  private final Collection<Zrdb> ZPn;
  
  private final Collection<Zrdb> ZP0;
  
  Zrdv(Collection<Zrdb> paramCollection1, Collection<Zrdb> paramCollection2) {
    this.ZPn = paramCollection1;
    this.ZP0 = paramCollection2;
  }
  
  boolean ZPp() {
    return !this.ZPn.isEmpty();
  }
  
  boolean ZP() {
    return !this.ZP0.isEmpty();
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zrdv;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zrdv;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zrdv;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public Collection<Zrdb> ZPn() {
    return this.ZPn;
  }
  
  public Collection<Zrdb> ZP0() {
    return this.ZP0;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrdv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */