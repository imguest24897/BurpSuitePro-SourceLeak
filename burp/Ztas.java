package burp;

public final class Ztas extends Record {
  private final Zt8i ZUi;
  
  private final Zlat ZU8;
  
  private static int ZQ;
  
  public Ztas(Zt8i paramZt8i, Zlat paramZlat) {
    this.ZUi = paramZt8i;
    this.ZU8 = paramZlat;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Ztas;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Ztas;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Ztas;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public Zt8i ZUi() {
    return this.ZUi;
  }
  
  public Zlat ZU8() {
    return this.ZU8;
  }
  
  public static void ZF(int paramInt) {
    ZQ = paramInt;
  }
  
  public static int ZUQ() {
    return ZQ;
  }
  
  public static int ZU() {
    int i = ZUQ();
    return (i == 0) ? 105 : 0;
  }
  
  static {
    if (ZUQ() != 0)
      ZF(79); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztas.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */