package burp;

import net.portswigger.Zli;

class Zbnp {
  private static final String a;
  
  static String ZO(Zmxt paramZmxt) {
    return paramZmxt.getClass().getName() + paramZmxt.getClass().getName() + a;
  }
  
  static boolean Ze(Zmxt paramZmxt, Zlit paramZlit) {
    return (paramZlit.Zdz().equals(paramZmxt.ZlL().Zdz()) && Zli.ZQ(paramZlit.Zd4(), paramZmxt.ZlL().Zd4()));
  }
  
  static boolean Zk(Zmxt paramZmxt, Object paramObject) {
    if (!(paramObject instanceof Zmxt))
      return false; 
    Zmxt zmxt = (Zmxt)paramObject;
    return paramZmxt.ZlL().equals(zmxt.ZlL());
  }
  
  static int ZO(Zmxt paramZmxt, Zez3 paramZez3) {
    if (paramZez3 == null)
      return -1; 
    int i = paramZmxt.ZlL().compareTo(paramZez3.ZlL());
    if (i == 0 && !Zk8c.Zh(paramZez3))
      i = 1; 
    return i;
  }
  
  static boolean ZG(Zmxt paramZmxt, Zz28 paramZz28) {
    return paramZz28.ZG(paramZmxt.ZlL()) ? true : paramZmxt.ZK(new Zl9s(paramZz28));
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: ldc '^u'
    //   3: iconst_m1
    //   4: goto -> 13
    //   7: putstatic burp/Zbnp.a : Ljava/lang/String;
    //   10: goto -> 154
    //   13: dup_x2
    //   14: pop
    //   15: invokevirtual toCharArray : ()[C
    //   18: dup_x1
    //   19: arraylength
    //   20: dup_x2
    //   21: pop
    //   22: iconst_0
    //   23: istore_0
    //   24: dup2_x1
    //   25: pop2
    //   26: dup_x2
    //   27: iconst_1
    //   28: if_icmpgt -> 128
    //   31: dup2
    //   32: swap
    //   33: iload_0
    //   34: dup2_x1
    //   35: caload
    //   36: swap
    //   37: iload_0
    //   38: bipush #7
    //   40: irem
    //   41: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #97
    //   82: goto -> 112
    //   85: bipush #80
    //   87: goto -> 112
    //   90: bipush #79
    //   92: goto -> 112
    //   95: bipush #40
    //   97: goto -> 112
    //   100: bipush #48
    //   102: goto -> 112
    //   105: bipush #101
    //   107: goto -> 112
    //   110: bipush #121
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 34
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 31
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
    //   151: goto -> 7
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbnp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */