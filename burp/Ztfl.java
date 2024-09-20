package burp;

public final class Ztfl extends Record {
  private final boolean ZCu;
  
  private final byte[] ZC9;
  
  public Ztfl(boolean paramBoolean, byte[] paramArrayOfbyte) {
    this.ZCu = paramBoolean;
    this.ZC9 = paramArrayOfbyte;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Ztfl;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Ztfl;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Ztfl;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public boolean ZCu() {
    return this.ZCu;
  }
  
  public byte[] ZC9() {
    return this.ZC9;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztfl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */