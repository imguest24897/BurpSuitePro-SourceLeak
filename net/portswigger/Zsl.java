package net.portswigger;

import java.util.List;

class Zsl extends Zs5 {
  final Zrz7 ZW;
  
  private static final String a;
  
  Zsl(Zrz7 paramZrz71, Zrz7 paramZrz72) {
    super(paramZrz72);
  }
  
  String ZN(List<Zo3> paramList, Zo3 paramZo3, String paramString) {
    return String.format(a, new Object[] { paramZo3.ZK, paramString, this.ZW.ZI(paramZo3.ZY), this.ZW.ZZ(paramZo3.Zg) });
  }
  
  static {
    // Byte code:
    //   0: bipush #119
    //   2: ldc 'sxoQgP.q)nStP.q0ie9s#ie>+28g>+2!?o<02?v`xoQ'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic net/portswigger/Zsl.a : Ljava/lang/String;
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
    //   80: bipush #56
    //   82: goto -> 112
    //   85: bipush #123
    //   87: goto -> 112
    //   90: bipush #106
    //   92: goto -> 112
    //   95: bipush #24
    //   97: goto -> 112
    //   100: bipush #44
    //   102: goto -> 112
    //   105: bipush #83
    //   107: goto -> 112
    //   110: bipush #61
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zsl.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */