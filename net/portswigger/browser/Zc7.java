package net.portswigger.browser;

public final class Zc7 extends Record {
  private final String ZRz;
  
  private final String ZRO;
  
  private static String ZG;
  
  public Zc7(String paramString1, String paramString2) {
    this.ZRz = paramString1;
    this.ZRO = paramString2;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lnet/portswigger/browser/Zc7;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lnet/portswigger/browser/Zc7;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lnet/portswigger/browser/Zc7;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public String ZRz() {
    return this.ZRz;
  }
  
  public String ZRO() {
    return this.ZRO;
  }
  
  public static void ZL(String paramString) {
    ZG = paramString;
  }
  
  public static String ZRu() {
    return ZG;
  }
  
  static {
    if (ZRu() == null)
      ZL("uUizJb"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zc7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */