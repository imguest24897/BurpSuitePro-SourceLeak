package burp;

import net.portswigger.Zli;

class Zm16 {
  private static final String a;
  
  static String Zf(Zrtx paramZrtx) {
    return paramZrtx.getClass().getName() + paramZrtx.getClass().getName() + a;
  }
  
  static boolean ZG(Zrtx paramZrtx, Zlit paramZlit) {
    if (!paramZlit.Zdz().equals(paramZrtx.ZlL().Zdz()))
      return false; 
    byte[] arrayOfByte1 = paramZrtx.ZlL().ZdH();
    byte[] arrayOfByte2 = paramZlit.ZdH();
    return (arrayOfByte2.length > arrayOfByte1.length && Zli.ZB(arrayOfByte2, arrayOfByte1, 0) && arrayOfByte2[arrayOfByte1.length] == 47);
  }
  
  static boolean ZQ(Zrtx paramZrtx, Object paramObject) {
    if (!(paramObject instanceof Zrtx))
      return false; 
    Zrtx zrtx = (Zrtx)paramObject;
    return paramZrtx.ZlL().equals(zrtx.ZlL());
  }
  
  static int ZP(Zrtx paramZrtx, Zez3 paramZez3) {
    if (paramZez3 == null)
      return -1; 
    int i = paramZrtx.ZlL().compareTo(paramZez3.ZlL());
    if (i == 0 && !Zk8c.Zq(paramZez3))
      i = -1; 
    return i;
  }
  
  static boolean ZL(Zrtx paramZrtx, Zz28 paramZz28) {
    return paramZz28.ZG(paramZrtx.ZlL()) ? true : paramZrtx.ZK(new Zl93(paramZz28));
  }
  
  static {
    // Byte code:
    //   0: bipush #58
    //   2: ldc 'i'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zm16.a : Ljava/lang/String;
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
    //   80: bipush #27
    //   82: goto -> 112
    //   85: bipush #115
    //   87: goto -> 112
    //   90: bipush #13
    //   92: goto -> 112
    //   95: bipush #40
    //   97: goto -> 112
    //   100: bipush #31
    //   102: goto -> 112
    //   105: bipush #32
    //   107: goto -> 112
    //   110: bipush #115
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm16.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */