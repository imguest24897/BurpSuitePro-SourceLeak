package burp;

import java.util.List;

public final class Zge3 extends Record {
  private final Zm0l ZCf;
  
  private final List<Zsvm> ZCk;
  
  private static int[] ZW;
  
  protected Zge3(Zm0l paramZm0l, List<Zsvm> paramList) {
    this.ZCf = paramZm0l;
    this.ZCk = paramList;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zge3;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zge3;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zge3;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public Zm0l ZCf() {
    return this.ZCf;
  }
  
  public List<Zsvm> ZCk() {
    return this.ZCk;
  }
  
  public static void ZV(int[] paramArrayOfint) {
    ZW = paramArrayOfint;
  }
  
  public static int[] ZC() {
    return ZW;
  }
  
  static {
    if (ZC() == null)
      ZV(new int[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zge3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */