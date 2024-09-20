package burp;

import java.util.List;

final class Zlmr extends Record {
  private final Zmrn zyK;
  
  private final List<Zsvm> zyQ;
  
  private final List<Zsvm> zyI;
  
  private Zlmr(Zmrn paramZmrn, List<Zsvm> paramList1, List<Zsvm> paramList2) {
    this.zyK = paramZmrn;
    this.zyQ = paramList1;
    this.zyI = paramList2;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zlmr;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zlmr;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zlmr;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public Zmrn ZyK() {
    return this.zyK;
  }
  
  public List<Zsvm> ZyQ() {
    return this.zyQ;
  }
  
  public List<Zsvm> ZyI() {
    return this.zyI;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlmr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */