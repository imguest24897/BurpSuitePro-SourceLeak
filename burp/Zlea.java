package burp;

import net.portswigger.browser.Zct;

public final class Zlea extends Record {
  private final String ZJj;
  
  private final Zct ZJ5;
  
  public Zlea(String paramString, Zct paramZct) {
    this.ZJj = paramString;
    this.ZJ5 = paramZct;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zlea;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zlea;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zlea;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public String ZJj() {
    return this.ZJj;
  }
  
  public Zct ZJ5() {
    return this.ZJ5;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlea.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */