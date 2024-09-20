package net.portswigger;

public final class Zv7 extends Record implements Zms {
  private final Zms zrU;
  
  private final Zms zrf;
  
  private Zv7(Zok paramZok) {
    this(paramZok.Zi, paramZok.ZL);
  }
  
  public Zv7(Zms paramZms1, Zms paramZms2) {
    this.zrU = paramZms1;
    this.zrf = paramZms2;
  }
  
  public void ZF(Zuo paramZuo) {
    paramZuo.Zt(this);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lnet/portswigger/Zv7;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lnet/portswigger/Zv7;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lnet/portswigger/Zv7;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public Zms ZrU() {
    return this.zrU;
  }
  
  public Zms Zrf() {
    return this.zrf;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zv7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */