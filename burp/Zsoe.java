package burp;

final class Zsoe extends Record {
  private final Zlit ZJ;
  
  private final String Zn;
  
  private Zsoe(Zlit paramZlit, String paramString) {
    this.ZJ = paramZlit;
    this.Zn = paramString;
  }
  
  static Zsoe ZJ(Zlit paramZlit) {
    String str = Zzs_.Zb(paramZlit);
    return new Zsoe(paramZlit.Zdx(), str);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zsoe;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zsoe;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zsoe;Ljava/lang/Object;)Z
    //   7: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsoe.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */