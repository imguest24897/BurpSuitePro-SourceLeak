package burp;

public final class Zlwu extends Record {
  private final boolean zd;
  
  private final String zn;
  
  public Zlwu(boolean paramBoolean, String paramString) {
    this.zd = paramBoolean;
    this.zn = paramString;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zlwu;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zlwu;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zlwu;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public boolean Zd() {
    return this.zd;
  }
  
  public String Zn() {
    return this.zn;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlwu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */