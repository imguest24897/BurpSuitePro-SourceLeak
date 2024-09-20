package burp;

import java.awt.Rectangle;

public final class Zkcz extends Record {
  private final boolean ZAd;
  
  private final Rectangle ZAG;
  
  public Zkcz(boolean paramBoolean, Rectangle paramRectangle) {
    this.ZAd = paramBoolean;
    this.ZAG = paramRectangle;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zkcz;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zkcz;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zkcz;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public boolean ZAd() {
    return this.ZAd;
  }
  
  public Rectangle ZAG() {
    return this.ZAG;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkcz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */