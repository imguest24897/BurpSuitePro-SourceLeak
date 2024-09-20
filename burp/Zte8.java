package burp;

import java.util.List;

final class Zte8 extends Record {
  private final Zmrn ZDt;
  
  private final List<Zsvm> ZD2;
  
  private final List<Zsvm> ZDo;
  
  private Zte8(Zmrn paramZmrn, List<Zsvm> paramList1, List<Zsvm> paramList2) {
    this.ZDt = paramZmrn;
    this.ZD2 = paramList1;
    this.ZDo = paramList2;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zte8;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zte8;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zte8;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public Zmrn ZDt() {
    return this.ZDt;
  }
  
  public List<Zsvm> ZD2() {
    return this.ZD2;
  }
  
  public List<Zsvm> ZDo() {
    return this.ZDo;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zte8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */