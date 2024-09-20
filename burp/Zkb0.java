package burp;

public final class Zkb0 extends Record {
  private final Zsua ZWb;
  
  private static boolean Ze;
  
  public Zkb0(Zsua paramZsua) {
    this.ZWb = paramZsua;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zkb0;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zkb0;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zkb0;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public Zsua ZWb() {
    return this.ZWb;
  }
  
  public static void ZA(boolean paramBoolean) {
    Ze = paramBoolean;
  }
  
  public static boolean ZW() {
    return Ze;
  }
  
  public static boolean Zq() {
    boolean bool = ZW();
    return !bool;
  }
  
  static {
    if (Zq())
      ZA(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkb0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */