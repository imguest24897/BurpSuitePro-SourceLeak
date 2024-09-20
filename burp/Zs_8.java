package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zs_8 {
  private static final String a;
  
  static Zstu Zg(Zeo2 paramZeo2) {
    Zbr zbr = Zb(paramZeo2);
    if (zbr == null || zbr.Zd())
      return null; 
    Zuh.ZT(zbr.Zz(), Zqf.Zr, a);
    return zbr.Zr();
  }
  
  public static Zbr Zb(Zeo2 paramZeo2) {
    Zbr zbr1 = paramZeo2.ZX9();
    if (zbr1 != null)
      return zbr1; 
    Zbr zbr2 = paramZeo2.ZXI();
    return (zbr2 != null) ? zbr2 : paramZeo2.ZXD();
  }
  
  static {
    // Byte code:
    //   0: bipush #64
    //   2: ldc 'IpG#};`8lzdQ~)|u8G!|~u.C$h;iW<m;\\bdJW#lJhQ$lz/'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zs_8.a : Ljava/lang/String;
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
    //   80: bipush #91
    //   82: goto -> 112
    //   85: bipush #42
    //   87: goto -> 112
    //   90: bipush #65
    //   92: goto -> 112
    //   95: bipush #42
    //   97: goto -> 112
    //   100: bipush #98
    //   102: goto -> 112
    //   105: bipush #16
    //   107: goto -> 112
    //   110: bipush #73
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs_8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */