package net.portswigger.browser;

import burp.Zbqc;

public final class Zjn extends Record {
  private final Zc4 za0;
  
  private final String zaS;
  
  private final boolean za9;
  
  private static String ZB;
  
  public Zjn(Zc4 paramZc4, String paramString, boolean paramBoolean) {
    this.za0 = paramZc4;
    String str = Za();
    this.zaS = paramString;
    this.za9 = paramBoolean;
    if (Zbqc.Zwu() == null)
      Zx("x5fXzb"); 
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lnet/portswigger/browser/Zjn;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lnet/portswigger/browser/Zjn;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lnet/portswigger/browser/Zjn;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public Zc4 Za0() {
    return this.za0;
  }
  
  public String ZaS() {
    return this.zaS;
  }
  
  public boolean Za9() {
    return this.za9;
  }
  
  public static void Zx(String paramString) {
    ZB = paramString;
  }
  
  public static String Za() {
    return ZB;
  }
  
  static {
    if (Za() == null)
      Zx("yz7j8b"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zjn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */