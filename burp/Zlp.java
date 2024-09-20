package burp;

public final class Zlp extends Record {
  private final boolean ZQl;
  
  public Zlp(boolean paramBoolean) {
    this.ZQl = paramBoolean;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zlp;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zlp;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zlp;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public boolean ZQl() {
    return this.ZQl;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */