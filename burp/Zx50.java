package burp;

public final class Zx50 extends Record {
  private final Zxs7 zdQ;
  
  private static Zbqc[] ZH;
  
  public Zx50(Zxs7 paramZxs7) {
    this.zdQ = paramZxs7;
  }
  
  public static Zx50 Zt(Zxs7 paramZxs7) {
    return new Zx50(paramZxs7);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zx50;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zx50;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zx50;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public Zxs7 ZdQ() {
    return this.zdQ;
  }
  
  public static void ZN(Zbqc[] paramArrayOfZbqc) {
    ZH = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zd() {
    return ZH;
  }
  
  static {
    if (Zd() == null)
      ZN(new Zbqc[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx50.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */