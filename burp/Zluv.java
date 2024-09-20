package burp;

public final class Zluv extends Record {
  private final Zmw9<?> zsq;
  
  private final Zg9f ZF;
  
  private static Zbqc[] ZU;
  
  public Zluv(Zmw9<?> paramZmw9, Zg9f paramZg9f) {
    this.zsq = paramZmw9;
    this.ZF = paramZg9f;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zluv;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zluv;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zluv;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public Zmw9<?> Zsq() {
    return this.zsq;
  }
  
  public static void Zl(Zbqc[] paramArrayOfZbqc) {
    ZU = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zs() {
    return ZU;
  }
  
  static {
    if (Zs() == null)
      Zl(new Zbqc[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zluv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */