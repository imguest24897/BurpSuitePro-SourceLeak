package burp;

public final class Zlah extends Record {
  private final byte ZRb;
  
  private final byte ZRN;
  
  public static final Zlah Zr = new Zlah((byte)0, (byte)0);
  
  private static int[] Zv;
  
  public Zlah(byte paramByte1, byte paramByte2) {
    this.ZRb = paramByte1;
    this.ZRN = paramByte2;
  }
  
  public boolean ZR() {
    return (this.ZRb != 0 && this.ZRN != 0);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zlah;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zlah;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zlah;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public byte ZRb() {
    return this.ZRb;
  }
  
  public byte ZRN() {
    return this.ZRN;
  }
  
  public static void ZK(int[] paramArrayOfint) {
    Zv = paramArrayOfint;
  }
  
  public static int[] ZRg() {
    return Zv;
  }
  
  static {
    if (ZRg() != null)
      ZK(new int[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlah.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */