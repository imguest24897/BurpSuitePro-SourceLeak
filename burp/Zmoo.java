package burp;

public final class Zmoo extends Record {
  private final Zm6x ZF;
  
  private final Throwable ZG;
  
  private final Object Zc;
  
  private final Object Zj;
  
  private static boolean ZN;
  
  public Zmoo(Zm6x paramZm6x, Throwable paramThrowable, Object paramObject1, Object paramObject2) {
    boolean bool = ZD();
    this.ZF = paramZm6x;
    this.ZG = paramThrowable;
    this.Zc = paramObject1;
    this.Zj = paramObject2;
    if (!bool)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zmoo;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zmoo;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zmoo;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public static void ZJ(boolean paramBoolean) {
    ZN = paramBoolean;
  }
  
  public static boolean ZD() {
    return ZN;
  }
  
  public static boolean Zc() {
    boolean bool = ZD();
    return !bool;
  }
  
  static {
    if (Zc())
      ZJ(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmoo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */