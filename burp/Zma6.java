package burp;

final class Zma6 extends Record implements Zssv {
  private final Runnable ZZ;
  
  private final Runnable Zw;
  
  private Zma6(Runnable paramRunnable1, Runnable paramRunnable2) {
    this.ZZ = paramRunnable1;
    this.Zw = paramRunnable2;
  }
  
  public void ZW() {
    this.ZZ.run();
    this.Zw.run();
  }
  
  public void Zj() {
    this.Zw.run();
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zma6;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zma6;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zma6;Ljava/lang/Object;)Z
    //   7: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zma6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */