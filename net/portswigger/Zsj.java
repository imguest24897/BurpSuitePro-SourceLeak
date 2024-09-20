package net.portswigger;

import java.util.List;

public final class Zsj extends Record implements Zms {
  private final List<Zms> ZYQ;
  
  private static final Zsj Zd = new Zsj(new Zoa());
  
  private Zsj(Zoa paramZoa) {
    this(paramZoa.ZW);
  }
  
  public Zsj(List<Zms> paramList) {
    this.ZYQ = paramList;
  }
  
  public void ZF(Zuo paramZuo) {
    paramZuo.ZY(this);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lnet/portswigger/Zsj;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lnet/portswigger/Zsj;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lnet/portswigger/Zsj;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public List<Zms> ZYQ() {
    return this.ZYQ;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zsj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */