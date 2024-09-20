package burp;

import java.util.List;

public final class Zmkn extends Record {
  private final List<Ztzs> zfv;
  
  private static String ZX;
  
  public Zmkn(List<Ztzs> paramList) {
    this.zfv = paramList;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zmkn;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zmkn;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zmkn;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public List<Ztzs> Zfv() {
    return this.zfv;
  }
  
  public static void ZY(String paramString) {
    ZX = paramString;
  }
  
  public static String Zfc() {
    return ZX;
  }
  
  static {
    if (Zfc() == null)
      ZY("bl8Vq"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmkn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */