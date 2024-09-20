package burp;

import java.util.Arrays;

public class Zz0x {
  public static final Zz0x Zh;
  
  public final byte Zj;
  
  private static final String a;
  
  public Zz0x(byte paramByte) {
    this.Zj = paramByte;
  }
  
  public String Zn() {
    return Integer.toHexString(this.Zj);
  }
  
  public boolean ZL(int... paramVarArgs) {
    return Arrays.stream(paramVarArgs).allMatch(this::lambda$isSet$0);
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Zz0x zz0x = (Zz0x)paramObject;
    return (this.Zj == zz0x.Zj);
  }
  
  public String toString() {
    return a + a + Zn();
  }
  
  public static Zz0x Zx(byte... paramVarArgs) {
    int i = 0;
    String[] arrayOfString = Zsp.Ze();
    byte[] arrayOfByte = paramVarArgs;
    int j = arrayOfByte.length;
    byte b = 0;
    while (b < j) {
      byte b1 = arrayOfByte[b];
      i |= b1;
      b++;
      if (arrayOfString != null)
        break; 
    } 
    return new Zz0x((byte)i);
  }
  
  private boolean lambda$isSet$0(int paramInt) {
    return ((this.Zj & paramInt) == paramInt);
  }
  
  static {
    // Byte code:
    //   0: bipush #87
    //   2: ldc '8?htx-{Sx\\fcMu'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zz0x.a : Ljava/lang/String;
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
    //   80: bipush #41
    //   82: goto -> 112
    //   85: bipush #62
    //   87: goto -> 112
    //   90: bipush #9
    //   92: goto -> 112
    //   95: bipush #42
    //   97: goto -> 112
    //   100: bipush #90
    //   102: goto -> 112
    //   105: bipush #101
    //   107: goto -> 112
    //   110: bipush #67
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
    //   154: new burp/Zz0x
    //   157: dup
    //   158: iconst_0
    //   159: invokespecial <init> : (B)V
    //   162: putstatic burp/Zz0x.Zh : Lburp/Zz0x;
    //   165: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz0x.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */