package burp;

final class Zrjb extends Record {
  private final int ZTe;
  
  private final int ZTt;
  
  private final boolean ZTV;
  
  private Zrjb(int paramInt1, int paramInt2, boolean paramBoolean) {
    this.ZTe = paramInt1;
    this.ZTt = paramInt2;
    this.ZTV = paramBoolean;
  }
  
  boolean ZQ(int paramInt, boolean paramBoolean) {
    return (this.ZTe == paramInt && this.ZTV == paramBoolean);
  }
  
  public Zrjb ZTB() {
    return new Zrjb(0, this.ZTt - this.ZTe, this.ZTV);
  }
  
  public static Zrjb ZT2() {
    return new Zrjb(-1, -1, false);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zrjb;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zrjb;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zrjb;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public int ZTe() {
    return this.ZTe;
  }
  
  public int ZTt() {
    return this.ZTt;
  }
  
  public boolean ZTV() {
    return this.ZTV;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrjb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */