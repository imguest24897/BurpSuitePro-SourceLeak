package burp;

public final class Ztpr extends Record {
  private final String ZJO;
  
  private final String ZJZ;
  
  private final Zmya ZJC;
  
  private static int[] Zq;
  
  public Ztpr(String paramString1, String paramString2, Zmya paramZmya) {
    this.ZJO = paramString1;
    this.ZJZ = paramString2;
    this.ZJC = paramZmya;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Ztpr;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Ztpr;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Ztpr;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public String ZJO() {
    return this.ZJO;
  }
  
  public String ZJZ() {
    return this.ZJZ;
  }
  
  public Zmya ZJC() {
    return this.ZJC;
  }
  
  public static void ZM(int[] paramArrayOfint) {
    Zq = paramArrayOfint;
  }
  
  public static int[] ZJx() {
    return Zq;
  }
  
  static {
    if (ZJx() != null)
      ZM(new int[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztpr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */