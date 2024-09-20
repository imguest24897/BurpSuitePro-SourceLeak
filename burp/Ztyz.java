package burp;

import net.portswigger.Zmw;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Ztyz implements Zmrh {
  private static final String[] ZM;
  
  private final Zxwh Zh;
  
  public Ztyz(Zxwh paramZxwh) {
    this.Zh = paramZxwh;
  }
  
  public Zbtk Zi() {
    return new Zbyf(this.Zh);
  }
  
  public byte[] ZT(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    Zbqc[] arrayOfZbqc = Zbtk.Zl();
    null = Zmw.Zm(paramArrayOfbyte1);
    switch (this.Zh.ZWN()) {
      case 0:
        Zmw.Zq(null);
        if (arrayOfZbqc != null);
        return null;
      case 1:
        Zmw.ZO(null);
        if (arrayOfZbqc != null);
        return null;
      case 2:
        Zmw.ZX(null);
        if (arrayOfZbqc != null);
        return null;
      case 3:
        Zmw.Zp(null);
        if (arrayOfZbqc != null)
          break; 
        return null;
    } 
    Zuh.Zv(false, Zqf.Zk, this.Zh.ZWN());
    return paramArrayOfbyte1;
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore_0
    //   5: iconst_0
    //   6: istore #4
    //   8: ldc '|zUXXHMgjdGR\\r|zUXXHMgJdGR'
    //   10: dup
    //   11: astore_3
    //   12: invokevirtual length : ()I
    //   15: istore #5
    //   17: bipush #13
    //   19: istore_2
    //   20: iconst_m1
    //   21: istore_1
    //   22: bipush #126
    //   24: iinc #1, 1
    //   27: aload_3
    //   28: iload_1
    //   29: dup
    //   30: iload_2
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 129
    //   39: aload_0
    //   40: swap
    //   41: iload #4
    //   43: iinc #4, 1
    //   46: swap
    //   47: aastore
    //   48: iload_1
    //   49: iload_2
    //   50: iadd
    //   51: dup
    //   52: istore_1
    //   53: iload #5
    //   55: if_icmpge -> 67
    //   58: aload_3
    //   59: iload_1
    //   60: invokevirtual charAt : (I)C
    //   63: istore_2
    //   64: goto -> 22
    //   67: ldc '17I$\\b\\rx\\n)\\r17I=\\nx\\n)'
    //   69: dup
    //   70: astore_3
    //   71: invokevirtual length : ()I
    //   74: istore #5
    //   76: bipush #13
    //   78: istore_2
    //   79: iconst_m1
    //   80: istore_1
    //   81: bipush #51
    //   83: iinc #1, 1
    //   86: aload_3
    //   87: iload_1
    //   88: dup
    //   89: iload_2
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 129
    //   98: aload_0
    //   99: swap
    //   100: iload #4
    //   102: iinc #4, 1
    //   105: swap
    //   106: aastore
    //   107: iload_1
    //   108: iload_2
    //   109: iadd
    //   110: dup
    //   111: istore_1
    //   112: iload #5
    //   114: if_icmpge -> 126
    //   117: aload_3
    //   118: iload_1
    //   119: invokevirtual charAt : (I)C
    //   122: istore_2
    //   123: goto -> 81
    //   126: goto -> 288
    //   129: dup_x2
    //   130: pop
    //   131: invokevirtual toCharArray : ()[C
    //   134: dup_x1
    //   135: arraylength
    //   136: dup_x2
    //   137: pop
    //   138: iconst_0
    //   139: istore #6
    //   141: dup2_x1
    //   142: pop2
    //   143: dup_x2
    //   144: iconst_1
    //   145: if_icmpgt -> 248
    //   148: dup2
    //   149: swap
    //   150: iload #6
    //   152: dup2_x1
    //   153: caload
    //   154: swap
    //   155: iload #6
    //   157: bipush #7
    //   159: irem
    //   160: tableswitch default -> 230, 0 -> 200, 1 -> 205, 2 -> 210, 3 -> 215, 4 -> 220, 5 -> 225
    //   200: bipush #86
    //   202: goto -> 232
    //   205: bipush #107
    //   207: goto -> 232
    //   210: bipush #90
    //   212: goto -> 232
    //   215: bipush #123
    //   217: goto -> 232
    //   220: bipush #84
    //   222: goto -> 232
    //   225: bipush #73
    //   227: goto -> 232
    //   230: bipush #70
    //   232: ixor
    //   233: ixor
    //   234: i2c
    //   235: castore
    //   236: iinc #6, 1
    //   239: dup
    //   240: ifne -> 248
    //   243: dup2
    //   244: dup_x1
    //   245: goto -> 152
    //   248: dup2_x1
    //   249: pop2
    //   250: dup_x2
    //   251: iload #6
    //   253: if_icmpgt -> 148
    //   256: pop
    //   257: new java/lang/String
    //   260: dup_x1
    //   261: swap
    //   262: invokespecial <init> : ([C)V
    //   265: invokevirtual intern : ()Ljava/lang/String;
    //   268: swap
    //   269: pop
    //   270: swap
    //   271: tableswitch default -> 39, 0 -> 98
    //   288: iconst_4
    //   289: anewarray java/lang/String
    //   292: dup
    //   293: iconst_0
    //   294: aload_0
    //   295: iconst_2
    //   296: aaload
    //   297: aastore
    //   298: dup
    //   299: iconst_1
    //   300: aload_0
    //   301: iconst_3
    //   302: aaload
    //   303: aastore
    //   304: dup
    //   305: iconst_2
    //   306: aload_0
    //   307: iconst_1
    //   308: aaload
    //   309: aastore
    //   310: dup
    //   311: iconst_3
    //   312: aload_0
    //   313: iconst_0
    //   314: aaload
    //   315: aastore
    //   316: putstatic burp/Ztyz.ZM : [Ljava/lang/String;
    //   319: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztyz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */