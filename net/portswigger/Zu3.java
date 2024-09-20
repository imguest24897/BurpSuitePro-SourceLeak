package net.portswigger;

import java.util.List;

public final class Zu3 extends Record implements Zms {
  private final List<Zv7> zqi;
  
  private final List<Zu3> zqA;
  
  private Zu3(Ztz paramZtz) {
    this(paramZtz.Zu, paramZtz.ZE);
  }
  
  public Zu3(List<Zv7> paramList, List<Zu3> paramList1) {
    this.zqi = paramList;
    this.zqA = paramList1;
  }
  
  public void ZF(Zuo paramZuo) {
    paramZuo.Zp(this);
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lnet/portswigger/Zu3;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lnet/portswigger/Zu3;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lnet/portswigger/Zu3;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public List<Zv7> Zqi() {
    return this.zqi;
  }
  
  public List<Zu3> ZqA() {
    return this.zqA;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zu3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */