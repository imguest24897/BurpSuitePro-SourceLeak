package burp;

public final class Zx02 extends Record {
  private final String ztV;
  
  private final String zt2;
  
  private final String ztQ;
  
  public Zx02(String paramString1, String paramString2, String paramString3) {
    this.ztV = paramString1;
    this.zt2 = paramString2;
    this.ztQ = paramString3;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zx02;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zx02;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zx02;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public String ZtV() {
    return this.ztV;
  }
  
  public String Zt2() {
    return this.zt2;
  }
  
  public String ZtQ() {
    return this.ztQ;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx02.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */