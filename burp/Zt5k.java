package burp;

public final class Zt5k extends Record {
  private final Exception zbo;
  
  private static String[] ZO;
  
  public Zt5k(Exception paramException) {
    this.zbo = paramException;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zt5k;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zt5k;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zt5k;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public Exception Zbo() {
    return this.zbo;
  }
  
  public static void Zy(String[] paramArrayOfString) {
    ZO = paramArrayOfString;
  }
  
  public static String[] Zb() {
    return ZO;
  }
  
  static {
    if (Zb() != null)
      Zy(new String[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt5k.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */