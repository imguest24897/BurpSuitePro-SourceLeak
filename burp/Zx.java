package burp;

import java.util.List;
import net.portswigger.Zen;

final class Zx extends Record {
  private final Zen ZZ;
  
  private final byte[] Zq;
  
  private final List<byte[]> Zg;
  
  private final byte[] Zl;
  
  private final byte[] Zh;
  
  private Zx(Zen paramZen, byte[] paramArrayOfbyte1, List<byte[]> paramList, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    this.ZZ = paramZen;
    this.Zq = paramArrayOfbyte1;
    this.Zg = paramList;
    this.Zl = paramArrayOfbyte2;
    this.Zh = paramArrayOfbyte3;
  }
  
  public final String toString() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> toString : (Lburp/Zx;)Ljava/lang/String;
    //   6: areturn
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: <illegal opcode> hashCode : (Lburp/Zx;)I
    //   6: ireturn
  }
  
  public final boolean equals(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> equals : (Lburp/Zx;Ljava/lang/Object;)Z
    //   7: ireturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */