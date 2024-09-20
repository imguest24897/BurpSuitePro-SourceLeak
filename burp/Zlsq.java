package burp;

final class Zlsq extends Record {
  private final String zlj;
  
  private final Zb2c Zp;
  
  private Zlsq(String paramString, Zb2c paramZb2c) {
    this.zlj = paramString;
    this.Zp = paramZb2c;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zlsq;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zlsq;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zlsq;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public String Zlj() {
    return this.zlj;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlsq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */