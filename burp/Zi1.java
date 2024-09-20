package burp;

import javax.swing.border.LineBorder;

final class Zi1 extends Record {
  private final Zbqc Zb;
  
  private final Zm99 ZS;
  
  private Zi1(Zbqc paramZbqc, Zm99 paramZm99) {
    this.Zb = paramZbqc;
    this.ZS = paramZm99;
  }
  
  void Zk() {
    this.Zb.setBorder(new LineBorder(Zlkk.BORDER.ZS()));
    this.ZS.setIconTextGap((int)(Zrt.ZH() * 1.5D));
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zi1;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zi1;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zi1;Ljava/lang/Object;)Z
    //   7: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zi1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */