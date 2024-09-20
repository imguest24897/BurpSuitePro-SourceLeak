package burp;

public final class Zt83 extends Record {
  private final String ZOf;
  
  private final byte ZOX;
  
  public static final Zt83 ZS = new Zt83("", (byte)0);
  
  public Zt83(String paramString, byte paramByte) {
    this.ZOf = paramString;
    this.ZOX = paramByte;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zt83;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zt83;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zt83;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public String ZOf() {
    return this.ZOf;
  }
  
  public byte ZOX() {
    return this.ZOX;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt83.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */