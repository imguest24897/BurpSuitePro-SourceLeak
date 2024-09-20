package burp;

final class Zk9i extends Record {
  private final byte[] zpm;
  
  private final int zpZ;
  
  private final int zph;
  
  private final int zpg;
  
  private final int zpj;
  
  Zk9i(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.zpm = paramArrayOfbyte;
    this.zpZ = paramInt1;
    this.zph = paramInt2;
    this.zpg = paramInt3;
    this.zpj = paramInt4;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zk9i;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zk9i;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zk9i;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public byte[] Zpm() {
    return this.zpm;
  }
  
  public int ZpZ() {
    return this.zpZ;
  }
  
  public int Zph() {
    return this.zph;
  }
  
  public int Zpg() {
    return this.zpg;
  }
  
  public int Zpj() {
    return this.zpj;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk9i.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */