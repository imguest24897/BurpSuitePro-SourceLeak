package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zmbl extends Zmvg {
  private static final String a;
  
  public String Zi(Zvs paramZvs, byte paramByte1, int paramInt, Ztlj paramZtlj, Ztub paramZtub, Zefg<Zxtl> paramZefg, Zmzk paramZmzk, byte[] paramArrayOfbyte, byte paramByte2, byte paramByte3) {
    String[] arrayOfString = Zzhp.ZC();
    StringBuilder stringBuilder = new StringBuilder();
    if (paramZvs == Zzu2.JWT_PRIVATE_KEY_DISCLOSURE) {
      stringBuilder.append(a);
      if (arrayOfString == null) {
        Zuh.ZT(false, Zqf.Zr, paramZvs.toString());
        return stringBuilder.toString();
      } 
      return stringBuilder.toString();
    } 
    Zuh.ZT(false, Zqf.Zr, paramZvs.toString());
    return stringBuilder.toString();
  }
  
  static {
    // Byte code:
    //   0: bipush #38
    //   2: ldc 'C1OG!"u=XXIw\\rP\\fG93f1RF0gf6E5"c<Y\\bLx_F#&n6UOw7u1J\2gl=EXK8*w7RF#4)xhM$"';S\\rD3ge=\\r[2#':EXI9gf,HK<"uxH\\b0"i=N\2gf*^\%&u!I;.cxv/|$i'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zmbl.a : Ljava/lang/String;
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
    //   80: bipush #33
    //   82: goto -> 112
    //   85: bipush #126
    //   87: goto -> 112
    //   90: bipush #26
    //   92: goto -> 112
    //   95: bipush #94
    //   97: goto -> 112
    //   100: bipush #14
    //   102: goto -> 112
    //   105: bipush #113
    //   107: goto -> 112
    //   110: bipush #97
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmbl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */