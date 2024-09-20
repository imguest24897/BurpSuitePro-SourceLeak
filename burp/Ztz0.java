package burp;

final class Ztz0 extends Record {
  private final String Zb;
  
  private final int Zc;
  
  private final Zm_s ZX;
  
  private Ztz0(String paramString, int paramInt, Zm_s paramZm_s) {
    this.Zb = paramString;
    this.Zc = paramInt;
    this.ZX = paramZm_s;
  }
  
  boolean ZA(Ztz0 paramZtz0) {
    return (this.ZX != paramZtz0.ZX) ? false : ((this.ZX == Zm_s.INSERT) ? ((this.Zc + this.Zb.length() == paramZtz0.Zc)) : ((paramZtz0.Zc + paramZtz0.Zb.length() == this.Zc)));
  }
  
  Ztz0 Ze(Ztz0 paramZtz0) {
    return (this.ZX == Zm_s.INSERT) ? new Ztz0(this.Zb + this.Zb, this.Zc, Zm_s.INSERT) : new Ztz0(paramZtz0.Zb + paramZtz0.Zb, paramZtz0.Zc, Zm_s.REMOVE);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Ztz0;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Ztz0;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Ztz0;Ljava/lang/Object;)Z
    //   7: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztz0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */