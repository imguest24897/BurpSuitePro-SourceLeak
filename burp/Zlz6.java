package burp;

import java.util.Set;

final class Zlz6 extends Record {
  private final String ZAu;
  
  private final String ZQ;
  
  private final Set<String> ZAJ;
  
  private final Set<String> ZAg;
  
  private Zlz6(String paramString1, String paramString2, Set<String> paramSet1, Set<String> paramSet2) {
    this.ZAu = paramString1;
    this.ZQ = paramString2;
    this.ZAJ = paramSet1;
    this.ZAg = paramSet2;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zlz6;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zlz6;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zlz6;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public String ZAu() {
    return this.ZAu;
  }
  
  public Set<String> ZAJ() {
    return this.ZAJ;
  }
  
  public Set<String> ZAg() {
    return this.ZAg;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlz6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */