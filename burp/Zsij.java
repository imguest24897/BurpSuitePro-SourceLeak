package burp;

public final class Zsij extends Record {
  private final Throwable ZMm;
  
  private final long ZM2;
  
  private final String ZMN;
  
  private static boolean Zq;
  
  public Zsij(Throwable paramThrowable, long paramLong, String paramString) {
    this.ZMm = paramThrowable;
    this.ZM2 = paramLong;
    boolean bool = ZMl();
    this.ZMN = paramString;
    if (!bool)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zsij;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zsij;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zsij;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public Throwable ZMm() {
    return this.ZMm;
  }
  
  public long ZM2() {
    return this.ZM2;
  }
  
  public String ZMN() {
    return this.ZMN;
  }
  
  public static void Zr(boolean paramBoolean) {
    Zq = paramBoolean;
  }
  
  public static boolean ZMl() {
    return Zq;
  }
  
  public static boolean ZMU() {
    boolean bool = ZMl();
    return !bool;
  }
  
  static {
    if (ZMU())
      Zr(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsij.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */