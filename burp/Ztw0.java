package burp;

import java.util.List;

public final class Ztw0 extends Record {
  private final List<Zzl1> ZVM;
  
  private final Zsxd ZV6;
  
  public Ztw0(List<Zzl1> paramList, Zsxd paramZsxd) {
    this.ZVM = paramList;
    this.ZV6 = paramZsxd;
  }
  
  public Zzl1 ZV() {
    return this.ZVM.get(this.ZVM.size() - 1);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Ztw0;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Ztw0;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Ztw0;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public List<Zzl1> ZVM() {
    return this.ZVM;
  }
  
  public Zsxd ZV6() {
    return this.ZV6;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztw0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */