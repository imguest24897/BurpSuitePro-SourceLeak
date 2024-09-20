package net.portswigger;

public final class Zl2 extends Record implements Zms {
  private final String z_r;
  
  private final String Zk;
  
  private final Zrms Zj;
  
  private final boolean ZF;
  
  private Zl2(Zls paramZls) {
    this(paramZls.Ze, paramZls.Z_, paramZls.ZP, paramZls.ZL);
  }
  
  public Zl2(String paramString1, String paramString2, Zrms paramZrms, boolean paramBoolean) {
    this.z_r = paramString1;
    this.Zk = paramString2;
    this.Zj = paramZrms;
    this.ZF = paramBoolean;
  }
  
  public void ZF(Zuo paramZuo) {
    paramZuo.ZX(this);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lnet/portswigger/Zl2;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lnet/portswigger/Zl2;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lnet/portswigger/Zl2;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public String Z_r() {
    return this.z_r;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zl2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */