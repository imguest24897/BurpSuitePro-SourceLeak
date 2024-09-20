package burp;

public final class Zrqo extends Record {
  private final String ZQ;
  
  private final int zji;
  
  private final int zjv;
  
  private static String Zg;
  
  public Zrqo(String paramString, int paramInt1, int paramInt2) {
    this.ZQ = paramString;
    this.zji = paramInt1;
    this.zjv = paramInt2;
  }
  
  public int Zjx() {
    return this.ZQ.length();
  }
  
  public String Zjp() {
    return this.ZQ.trim();
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zrqo;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zrqo;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zrqo;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public int Zji() {
    return this.zji;
  }
  
  public int Zjv() {
    return this.zjv;
  }
  
  public static void Zm(String paramString) {
    Zg = paramString;
  }
  
  public static String ZjI() {
    return Zg;
  }
  
  static {
    if (ZjI() != null)
      Zm("E4t8M"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrqo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */