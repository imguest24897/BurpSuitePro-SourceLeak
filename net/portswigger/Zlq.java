package net.portswigger;

import java.util.List;

public final class Zlq extends Record implements Zms {
  private final Zms ZDP;
  
  private final List<Zlq> ZK;
  
  private Zlq(Zfj paramZfj) {
    this(paramZfj.ZO, paramZfj.Z_);
  }
  
  public Zlq(Zms paramZms, List<Zlq> paramList) {
    this.ZDP = paramZms;
    this.ZK = paramList;
  }
  
  public void ZF(Zuo paramZuo) {
    paramZuo.Zm(this);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lnet/portswigger/Zlq;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lnet/portswigger/Zlq;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lnet/portswigger/Zlq;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public Zms ZDP() {
    return this.ZDP;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zlq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */