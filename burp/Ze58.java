package burp;

import java.util.Set;

final class Ze58 extends Record {
  private final String zrS;
  
  private final String ZE;
  
  private final Set<String> zrE;
  
  private final Set<String> zrx;
  
  private Ze58(String paramString1, String paramString2, Set<String> paramSet1, Set<String> paramSet2) {
    this.zrS = paramString1;
    this.ZE = paramString2;
    this.zrE = paramSet1;
    this.zrx = paramSet2;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Ze58;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Ze58;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Ze58;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public String ZrS() {
    return this.zrS;
  }
  
  public Set<String> ZrE() {
    return this.zrE;
  }
  
  public Set<String> Zrx() {
    return this.zrx;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze58.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */