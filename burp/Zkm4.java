package burp;

import java.util.List;

public final class Zkm4 extends Record {
  private final List<Zzme> ZJA;
  
  private static int Zz;
  
  public Zkm4(List<Zzme> paramList) {
    this.ZJA = paramList;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zkm4;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zkm4;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zkm4;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public List<Zzme> ZJA() {
    return this.ZJA;
  }
  
  public static void Zc(int paramInt) {
    Zz = paramInt;
  }
  
  public static int Zi() {
    return Zz;
  }
  
  public static int ZJ() {
    int i = Zi();
    return (i == 0) ? 120 : 0;
  }
  
  static {
    if (ZJ() == 0)
      Zc(109); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkm4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */