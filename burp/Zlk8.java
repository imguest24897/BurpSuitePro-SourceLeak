package burp;

import javax.swing.ImageIcon;

final class Zlk8 extends Record {
  private final ImageIcon zwk;
  
  private final String zwb;
  
  private Zlk8(ImageIcon paramImageIcon, String paramString) {
    this.zwk = paramImageIcon;
    this.zwb = paramString;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zlk8;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zlk8;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zlk8;Ljava/lang/Object;)Z
    //   7: ireturn
  }
  
  public ImageIcon Zwk() {
    return this.zwk;
  }
  
  public String Zwb() {
    return this.zwb;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlk8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */