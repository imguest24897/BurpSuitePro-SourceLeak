package burp;

public final class Ztcx extends Record {
  private final boolean ZLR;
  
  private final Ztb0 ZLf;
  
  public Ztcx(boolean paramBoolean, Ztb0 paramZtb0) {
    this.ZLR = paramBoolean;
    this.ZLf = paramZtb0;
  }
  
  static Ztcx ZL0() {
    return new Ztcx(false, Ztb0.Zw());
  }
  
  static Ztcx Zc(Zmo paramZmo, Zgi paramZgi, String... paramVarArgs) {
    return new Ztcx(true, paramZmo.Zp(paramZgi, paramVarArgs));
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Ztcx;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Ztcx;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Ztcx;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public boolean ZLR() {
    return this.ZLR;
  }
  
  public Ztb0 ZLf() {
    return this.ZLf;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztcx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */