package burp;

import net.portswigger.Zkb;
import net.portswigger.Zmw;
import net.portswigger.Zsy;

public class Zxpw {
  private final byte[] Zn;
  
  final byte[] ZS;
  
  final byte[] ZF;
  
  final byte[] ZD;
  
  private static Zbqc[] Zu;
  
  private static final String a;
  
  Zxpw(byte[] paramArrayOfbyte, Zsy paramZsy) {
    this(new byte[0], paramArrayOfbyte, paramZsy);
  }
  
  Zxpw(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, Zsy paramZsy) {
    this.Zn = paramArrayOfbyte2;
    this.ZS = paramArrayOfbyte1;
    this.ZD = Zkb.Zy(paramZsy.Z_(5) + paramZsy.Z_(5) + a);
    this.ZF = Zmw.Zq(new byte[][] { paramArrayOfbyte1, paramArrayOfbyte2, this.ZD });
  }
  
  public byte[] Zt() {
    return Zmw.Zq(new byte[][] { this.ZS, this.Zn });
  }
  
  boolean Zr() {
    return (this.ZS.length > 0);
  }
  
  public static void ZW(Zbqc[] paramArrayOfZbqc) {
    Zu = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Za() {
    return Zu;
  }
  
  static {
    // Byte code:
    //   0: invokestatic Za : ()[Lburp/Zbqc;
    //   3: ifnull -> 13
    //   6: iconst_5
    //   7: anewarray burp/Zbqc
    //   10: invokestatic ZW : ([Lburp/Zbqc;)V
    //   13: bipush #49
    //   15: ldc 'L*Yr'
    //   17: iconst_m1
    //   18: goto -> 27
    //   21: putstatic burp/Zxpw.a : Ljava/lang/String;
    //   24: goto -> 166
    //   27: dup_x2
    //   28: pop
    //   29: invokevirtual toCharArray : ()[C
    //   32: dup_x1
    //   33: arraylength
    //   34: dup_x2
    //   35: pop
    //   36: iconst_0
    //   37: istore_0
    //   38: dup2_x1
    //   39: pop2
    //   40: dup_x2
    //   41: iconst_1
    //   42: if_icmpgt -> 140
    //   45: dup2
    //   46: swap
    //   47: iload_0
    //   48: dup2_x1
    //   49: caload
    //   50: swap
    //   51: iload_0
    //   52: bipush #7
    //   54: irem
    //   55: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #90
    //   94: goto -> 124
    //   97: bipush #52
    //   99: goto -> 124
    //   102: bipush #74
    //   104: goto -> 124
    //   107: bipush #127
    //   109: goto -> 124
    //   112: bipush #119
    //   114: goto -> 124
    //   117: bipush #120
    //   119: goto -> 124
    //   122: bipush #7
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 48
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 45
    //   147: pop
    //   148: new java/lang/String
    //   151: dup_x1
    //   152: swap
    //   153: invokespecial <init> : ([C)V
    //   156: invokevirtual intern : ()Ljava/lang/String;
    //   159: swap
    //   160: pop
    //   161: swap
    //   162: pop
    //   163: goto -> 21
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxpw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */