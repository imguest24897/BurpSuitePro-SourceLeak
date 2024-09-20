package burp;

public final class Ztb0 extends Record {
  private final String ZD;
  
  private final String ZN;
  
  public Ztb0(String paramString1, String paramString2) {
    this.ZD = paramString1;
    this.ZN = paramString2;
  }
  
  public String Z_(Zra1 paramZra1) {
    try {
      switch (Zl7s.Zb[paramZra1.ordinal()]) {
        default:
          throw new MatchException(null, null);
        case 1:
        
        case 2:
        case 3:
          break;
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return this.ZN;
  }
  
  static Ztb0 Zw() {
    return new Ztb0(null, null);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Ztb0;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Ztb0;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Ztb0;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  private static MatchException a(MatchException paramMatchException) {
    return paramMatchException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztb0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */