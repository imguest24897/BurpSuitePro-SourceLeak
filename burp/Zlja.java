package burp;

public final class Zlja extends Record {
  private final boolean zwT;
  
  private final Ztb0 zwi;
  
  public Zlja(boolean paramBoolean, Ztb0 paramZtb0) {
    this.zwT = paramBoolean;
    this.zwi = paramZtb0;
  }
  
  static Zlja ZwE() {
    return new Zlja(true, null);
  }
  
  static Zlja Z_(Ztb0 paramZtb0) {
    return new Zlja(false, paramZtb0);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zlja;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zlja;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zlja;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public boolean ZwT() {
    return this.zwT;
  }
  
  public Ztb0 Zwi() {
    return this.zwi;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlja.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */