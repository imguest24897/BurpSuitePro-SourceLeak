package burp;

public final class Zgh0 extends Record {
  private final byte[] ZGp;
  
  private final boolean ZG1;
  
  public Zgh0(byte[] paramArrayOfbyte, boolean paramBoolean) {
    this.ZGp = paramArrayOfbyte;
    this.ZG1 = paramBoolean;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zgh0;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zgh0;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zgh0;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public byte[] ZGp() {
    return this.ZGp;
  }
  
  public boolean ZG1() {
    return this.ZG1;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgh0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */