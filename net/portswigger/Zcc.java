package net.portswigger;

public final class Zcc extends Record implements Zrm9 {
  private final String ZS;
  
  private final Zfe ZC;
  
  public Zcc(String paramString, Zfe paramZfe) {
    this.ZS = paramString;
    this.ZC = paramZfe;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lnet/portswigger/Zcc;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lnet/portswigger/Zcc;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lnet/portswigger/Zcc;Ljava/lang/Object;)Z
    //   7: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zcc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */