package net.portswigger;

public final class Zkv extends Record implements Zu7<Boolean> {
  private final Boolean ZNG;
  
  private static final Zkv Zl = new Zkv(Boolean.valueOf(true));
  
  private static final Zkv Zv = new Zkv(Boolean.valueOf(false));
  
  public Zkv(Boolean paramBoolean) {
    this.ZNG = paramBoolean;
  }
  
  public static Zkv ZW(boolean paramBoolean) {
    return paramBoolean ? Zl : Zv;
  }
  
  public void ZF(Zuo paramZuo) {
    paramZuo.ZT(this);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lnet/portswigger/Zkv;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lnet/portswigger/Zkv;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lnet/portswigger/Zkv;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public Boolean ZNG() {
    return this.ZNG;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zkv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */