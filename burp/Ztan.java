package burp;

final class Ztan extends Record {
  private final Zmy1 ZE;
  
  private final String Zo;
  
  private final String ZC;
  
  private Ztan(Zmy1 paramZmy1, String paramString1, String paramString2) {
    this.ZE = paramZmy1;
    this.Zo = paramString1;
    this.ZC = paramString2;
  }
  
  public String toString() {
    return this.ZE.ZG();
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Ztan;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Ztan;Ljava/lang/Object;)Z
    //   7: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztan.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */