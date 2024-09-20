package burp;

import java.util.EnumSet;

final class Ztmg extends Record {
  private final int ZA;
  
  private final String Zm;
  
  private final EnumSet<Zb25> Zd;
  
  private Ztmg(int paramInt, String paramString, EnumSet<Zb25> paramEnumSet) {
    this.ZA = paramInt;
    this.Zm = paramString;
    this.Zd = paramEnumSet;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Ztmg;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Ztmg;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Ztmg;Ljava/lang/Object;)Z
    //   7: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztmg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */