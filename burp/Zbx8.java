package burp;

import burp.api.montoya.core.Range;
import java.util.Objects;

public class Zbx8 implements Range {
  private final int Zu;
  
  private final int ZF;
  
  private static final String a;
  
  private Zbx8(int paramInt1, int paramInt2) {
    this.Zu = paramInt1;
    this.ZF = paramInt2;
  }
  
  public int startIndexInclusive() {
    return this.Zu;
  }
  
  public int endIndexExclusive() {
    return this.ZF;
  }
  
  public boolean contains(int paramInt) {
    return (this.Zu <= paramInt && paramInt < this.ZF);
  }
  
  public String toString() {
    return String.format(a, new Object[] { Integer.valueOf(this.Zu), Integer.valueOf(this.ZF) });
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Zbx8 zbx8 = (Zbx8)paramObject;
    return (this.Zu == zbx8.Zu && this.ZF == zbx8.ZF);
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { Integer.valueOf(this.Zu), Integer.valueOf(this.ZF) });
  }
  
  static Range ZZ(int paramInt1, int paramInt2) {
    return new Zbx8(paramInt1, paramInt2);
  }
  
  static Range ZM(int[] paramArrayOfint) {
    return (paramArrayOfint == null || paramArrayOfint.length != 2) ? null : ZZ(paramArrayOfint[0], paramArrayOfint[1]);
  }
  
  static {
    // Byte code:
    //   0: bipush #63
    //   2: ldc '@'eHWMF'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zbx8.a : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #36
    //   82: goto -> 112
    //   85: bipush #61
    //   87: goto -> 112
    //   90: bipush #62
    //   92: goto -> 112
    //   95: bipush #91
    //   97: goto -> 112
    //   100: bipush #72
    //   102: goto -> 112
    //   105: bipush #87
    //   107: goto -> 112
    //   110: bipush #76
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbx8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */