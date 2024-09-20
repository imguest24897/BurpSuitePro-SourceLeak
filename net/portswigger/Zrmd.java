package net.portswigger;

public final class Zrmd extends Record implements Zms {
  private static final Zrmd ZP = new Zrmd();
  
  public static Zrmd ZR() {
    return ZP;
  }
  
  public void ZF(Zuo paramZuo) {
    paramZuo.ZF(this);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lnet/portswigger/Zrmd;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lnet/portswigger/Zrmd;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lnet/portswigger/Zrmd;Ljava/lang/Object;)Z
    //   7: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zrmd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */