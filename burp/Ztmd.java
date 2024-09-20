package burp;

import java.util.Set;

public final class Ztmd extends Record {
  private final Set<Zzgy> ZMP;
  
  private final Zt58 ZMa;
  
  private static String[] Z_;
  
  public Ztmd(Set<Zzgy> paramSet, Zt58 paramZt58) {
    this.ZMP = paramSet;
    this.ZMa = paramZt58;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Ztmd;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Ztmd;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Ztmd;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public Set<Zzgy> ZMP() {
    return this.ZMP;
  }
  
  public Zt58 ZMa() {
    return this.ZMa;
  }
  
  public static void ZY(String[] paramArrayOfString) {
    Z_ = paramArrayOfString;
  }
  
  public static String[] ZM() {
    return Z_;
  }
  
  static {
    if (ZM() == null)
      ZY(new String[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztmd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */