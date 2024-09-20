package burp;

import java.util.Comparator;
import java.util.Objects;

public class Zkh2 {
  public static final Zkh2 ZO;
  
  public static final Zkh2 Zf;
  
  public static final Comparator<Zkh2> ZF;
  
  private final byte ZT;
  
  private static final String a;
  
  private Zkh2(byte paramByte) {
    this.ZT = paramByte;
  }
  
  public static Zkh2 Zw(byte paramByte) {
    return new Zkh2(paramByte);
  }
  
  public static Zkh2 Zj(int paramInt) {
    return (paramInt < 0 || paramInt > 255) ? Zj(255) : new Zkh2((byte)paramInt);
  }
  
  public byte ZF() {
    return this.ZT;
  }
  
  public int ZJ() {
    return Byte.toUnsignedInt(this.ZT);
  }
  
  public boolean Zo() {
    return equals(ZO);
  }
  
  public boolean Zc() {
    return equals(Zf);
  }
  
  public String toString() {
    return Zc() ? String.format(a, new Object[] { Integer.valueOf(255) }) : Integer.toString(ZJ());
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Zkh2 zkh2 = (Zkh2)paramObject;
    return (this.ZT == zkh2.ZT);
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { Byte.valueOf(this.ZT) });
  }
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: ldc 'UV'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zkh2.a : Ljava/lang/String;
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
    //   80: bipush #124
    //   82: goto -> 112
    //   85: bipush #119
    //   87: goto -> 112
    //   90: bipush #113
    //   92: goto -> 112
    //   95: bipush #49
    //   97: goto -> 112
    //   100: bipush #66
    //   102: goto -> 112
    //   105: bipush #82
    //   107: goto -> 112
    //   110: bipush #47
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
    //   154: iconst_0
    //   155: invokestatic Zj : (I)Lburp/Zkh2;
    //   158: putstatic burp/Zkh2.ZO : Lburp/Zkh2;
    //   161: sipush #255
    //   164: invokestatic Zj : (I)Lburp/Zkh2;
    //   167: putstatic burp/Zkh2.Zf : Lburp/Zkh2;
    //   170: <illegal opcode> applyAsInt : ()Ljava/util/function/ToIntFunction;
    //   175: invokestatic comparingInt : (Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;
    //   178: putstatic burp/Zkh2.ZF : Ljava/util/Comparator;
    //   181: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkh2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */