package net.portswigger.browser;

public final class Zdq extends Record implements Zr {
  private final String Zf;
  
  private static String ZD;
  
  public Zdq(String paramString) {
    this.Zf = paramString;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lnet/portswigger/browser/Zdq;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lnet/portswigger/browser/Zdq;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lnet/portswigger/browser/Zdq;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public static void Zi(String paramString) {
    ZD = paramString;
  }
  
  public static String Zl() {
    return ZD;
  }
  
  static {
    if (Zl() != null)
      Zi("xXFgBc"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zdq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */