package net.portswigger;

import java.util.List;

public final class Zkm extends Record implements Zms {
  private final List<Zms> zxi;
  
  private final List<Zkm> ZY;
  
  private static final Zkm Ze = new Zkm(new Zsw());
  
  private Zkm(Zsw paramZsw) {
    this(paramZsw.Zo, paramZsw.ZZ);
  }
  
  public Zkm(List<Zms> paramList, List<Zkm> paramList1) {
    this.zxi = paramList;
    this.ZY = paramList1;
  }
  
  public void ZF(Zuo paramZuo) {
    paramZuo.Zv(this);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lnet/portswigger/Zkm;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lnet/portswigger/Zkm;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lnet/portswigger/Zkm;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public List<Zms> Zxi() {
    return this.zxi;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zkm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */