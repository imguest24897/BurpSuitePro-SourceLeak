package burp;

public final class Zz4 extends Record {
  private final String zru;
  
  private final String zrj;
  
  public Zz4(String paramString1, String paramString2) {
    this.zru = paramString1;
    this.zrj = paramString2;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zz4;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zz4;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zz4;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public String Zru() {
    return this.zru;
  }
  
  public String Zrj() {
    return this.zrj;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */