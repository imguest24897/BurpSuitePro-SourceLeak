package net.portswigger.browser;

public final class Zev extends Record {
  private final String ZB3;
  
  public Zev(String paramString) {
    this.ZB3 = paramString;
  }
  
  public Ztw ZB() {
    return new Ztw(this.ZB3);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lnet/portswigger/browser/Zev;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lnet/portswigger/browser/Zev;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lnet/portswigger/browser/Zev;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public String ZB3() {
    return this.ZB3;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zev.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */