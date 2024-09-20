package burp;

import java.util.Set;

final class Zgzr extends Record {
  private final Zlit ZE;
  
  private final String ZD;
  
  private final Set<Zlou> ZA;
  
  private final Zsba zb;
  
  private final Zstu ZX;
  
  Zgzr(Zlit paramZlit, String paramString, Set<Zlou> paramSet, Zsba paramZsba, Zstu paramZstu) {
    this.ZE = paramZlit;
    this.ZD = paramString;
    this.ZA = paramSet;
    this.zb = paramZsba;
    this.ZX = paramZstu;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zgzr;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zgzr;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zgzr;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public Zlit ZE() {
    return this.ZE;
  }
  
  public String ZD() {
    return this.ZD;
  }
  
  public Set<Zlou> ZA() {
    return this.ZA;
  }
  
  public Zsba Zb() {
    return this.zb;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgzr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */