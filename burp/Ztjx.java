package burp;

import java.util.List;

public final class Ztjx extends Record {
  private final List<Zlz8> ZEU;
  
  private static boolean Zl;
  
  public Ztjx(List<Zlz8> paramList) {
    this.ZEU = paramList;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Ztjx;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Ztjx;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Ztjx;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public List<Zlz8> ZEU() {
    return this.ZEU;
  }
  
  public static void ZQ(boolean paramBoolean) {
    Zl = paramBoolean;
  }
  
  public static boolean ZE() {
    return Zl;
  }
  
  public static boolean ZEt() {
    boolean bool = ZE();
    return !bool;
  }
  
  static {
    if (ZEt())
      ZQ(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztjx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */