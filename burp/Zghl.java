package burp;

import net.portswigger.Zsy;

public final class Zghl extends Record {
  private final Zsy ZB;
  
  private static final byte[] Zl = new byte[] { 0, 0, 0, 0 };
  
  public Zghl(Zsy paramZsy) {
    this.ZB = paramZsy;
  }
  
  public Ztfl Za(Ze3o paramZe3o) {
    return (paramZe3o == Ze3o.CLIENT_TO_SERVER) ? new Ztfl(true, this.ZB.ZU().Zz(4)) : new Ztfl(false, Zl);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zghl;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zghl;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zghl;Ljava/lang/Object;)Z
    //   7: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zghl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */