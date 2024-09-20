package burp;

import net.portswigger.browser.Zd_;

public final class Zt6y extends Record {
  private final Zd_ zbD;
  
  private final String zbI;
  
  private final Zeuf Zr;
  
  public Zt6y(Zd_ paramZd_, String paramString, Zeuf paramZeuf) {
    this.zbD = paramZd_;
    this.zbI = paramString;
    this.Zr = paramZeuf;
  }
  
  public Ze9n Zbu() {
    return (new Ze3m(this.Zr, Zlkk.FOREGROUND)).ZU(Zmcx.EXTRA_LARGE_LINE_SIZE).Z_();
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zt6y;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zt6y;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zt6y;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public Zd_ ZbD() {
    return this.zbD;
  }
  
  public String ZbI() {
    return this.zbI;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt6y.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */