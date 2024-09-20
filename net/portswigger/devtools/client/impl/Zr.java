package net.portswigger.devtools.client.impl;

final class Zr extends Record {
  private final String ZD;
  
  private final String ZX;
  
  private Zr(String paramString1, String paramString2) {
    this.ZD = paramString1;
    this.ZX = paramString2;
  }
  
  static Zr Zz() {
    return new Zr(null, null);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lnet/portswigger/devtools/client/impl/Zr;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lnet/portswigger/devtools/client/impl/Zr;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lnet/portswigger/devtools/client/impl/Zr;Ljava/lang/Object;)Z
    //   7: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */