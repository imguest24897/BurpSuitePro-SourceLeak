package burp;

public final class Zvop extends Record {
  private final String ztP;
  
  private final Zx8r ztk;
  
  public Zvop(String paramString, Zx8r paramZx8r) {
    this.ztP = paramString;
    this.ztk = paramZx8r;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zvop;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zvop;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zvop;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public String ZtP() {
    return this.ztP;
  }
  
  public Zx8r Ztk() {
    return this.ztk;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zvop.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */