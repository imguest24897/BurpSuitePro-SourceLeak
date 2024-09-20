package burp;

import net.portswigger.browser.Zcv;

public final class Zlyj extends Record {
  private final Zsxd ZBB;
  
  private final Zcv ZBc;
  
  private static int Zq;
  
  public Zlyj(Zsxd paramZsxd, Zcv paramZcv) {
    this.ZBB = paramZsxd;
    this.ZBc = paramZcv;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zlyj;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zlyj;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zlyj;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public Zsxd ZBB() {
    return this.ZBB;
  }
  
  public Zcv ZBc() {
    return this.ZBc;
  }
  
  public static void Zf(int paramInt) {
    Zq = paramInt;
  }
  
  public static int Ze() {
    return Zq;
  }
  
  public static int ZB() {
    int i = Ze();
    return (i == 0) ? 20 : 0;
  }
  
  static {
    if (Ze() == 0)
      Zf(25); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlyj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */