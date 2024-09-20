package burp;

final class Zxe7 extends Record {
  private final Ztgw Za;
  
  private final Zefx ZA;
  
  private final Ze45 Zu;
  
  private final boolean ZP;
  
  private final Zlgm ZB;
  
  private Zxe7(Ztgw paramZtgw, Zefx paramZefx, Ze45 paramZe45, boolean paramBoolean, Zlgm paramZlgm) {
    this.Za = paramZtgw;
    this.ZA = paramZefx;
    this.Zu = paramZe45;
    this.ZP = paramBoolean;
    this.ZB = paramZlgm;
  }
  
  static Zxe7 Zy(Ztgw paramZtgw) {
    Zxgd zxgd = Zxgd.ZZ();
    return new Zxe7(paramZtgw, paramZtgw.ZP(), zxgd.ZO(), zxgd.Zh(), Zxe7::lambda$notWeaponized$0);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zxe7;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zxe7;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zxe7;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  private static boolean lambda$notWeaponized$0(Zrdu paramZrdu, String paramString) {
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxe7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */