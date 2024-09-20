package burp;

public final class Zzcs extends Record {
  private final Zm0f ZJ;
  
  private final Zbj5 ZM;
  
  private static int[] Zj;
  
  public Zzcs(Zm0f paramZm0f, Zbj5 paramZbj5) {
    this.ZJ = paramZm0f;
    this.ZM = paramZbj5;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zzcs;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zzcs;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zzcs;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public Zm0f ZJ() {
    return this.ZJ;
  }
  
  public Zbj5 ZM() {
    return this.ZM;
  }
  
  public static void Zh(int[] paramArrayOfint) {
    Zj = paramArrayOfint;
  }
  
  public static int[] ZE() {
    return Zj;
  }
  
  static {
    if (ZE() == null)
      Zh(new int[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzcs.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */