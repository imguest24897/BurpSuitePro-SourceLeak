package burp;

public final class Ztkm extends Record {
  private final Zre8 ZDM;
  
  private final String ZDZ;
  
  public Ztkm(Zre8 paramZre8, String paramString) {
    this.ZDM = paramZre8;
    this.ZDZ = paramString;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Ztkm;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Ztkm;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Ztkm;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public Zre8 ZDM() {
    return this.ZDM;
  }
  
  public String ZDZ() {
    return this.ZDZ;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztkm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */