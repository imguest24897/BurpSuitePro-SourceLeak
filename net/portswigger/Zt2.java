package net.portswigger;

import java.util.List;

public final class Zt2 extends Record implements Zms {
  private final List<Zms> ZEJ;
  
  private final List<Zms> ZH;
  
  public Zt2(Ztk paramZtk) {
    this(paramZtk.ZS, paramZtk.Zy);
  }
  
  public Zt2(List<Zms> paramList1, List<Zms> paramList2) {
    this.ZEJ = paramList1;
    this.ZH = paramList2;
  }
  
  public void ZF(Zuo paramZuo) {
    paramZuo.ZV(this);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lnet/portswigger/Zt2;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lnet/portswigger/Zt2;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lnet/portswigger/Zt2;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public List<Zms> ZEJ() {
    return this.ZEJ;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zt2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */