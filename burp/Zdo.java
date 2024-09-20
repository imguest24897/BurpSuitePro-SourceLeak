package burp;

final class Zdo extends Record {
  private final String ZP;
  
  private final Zz3o ZS;
  
  private final Zm6i Zg;
  
  Zdo(String paramString, Zz3o paramZz3o) {
    this(paramString, paramZz3o, null);
  }
  
  private Zdo(String paramString, Zz3o paramZz3o, Zm6i paramZm6i) {
    this.ZP = paramString;
    this.ZS = paramZz3o;
    this.Zg = paramZm6i;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zdo;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zdo;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zdo;Ljava/lang/Object;)Z
    //   7: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zdo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */