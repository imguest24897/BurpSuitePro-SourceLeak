package burp;

import java.util.Set;

public class Zep6 {
  private static final Set<String> Zf;
  
  static boolean ZC(String paramString) {
    return Zf.contains(paramString);
  }
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: istore #4
    //   9: ldc 'K&V|EP!$X'B= #E\\fP 6^ <=E\\fZ><GK:  EZ&\\r4EZ<<GK-~\\fV :pV!\\t!K;~\\r^0 fK&V|EP!$X'B=94EQ '7V2A7KY&2V2A:EK0A0Jx:  #GJ!\\t~K'!ZY0\\b:P*K&V|EP!$X'B=06\z?TY=\\r'qK&V|EP!$X'B=0~\\r\''WO\\n<\h&` '7O:\\n6V;\\r?LT+8\\t7RI01\\f[131H0u`4#Xh &K&V|E\\fV6!F\8C:V 0C#K"4\\r\\rMuK&V|EP!$X'B= #KK%\\fJ6\\tn\\bM\\n&Z+%<\\f\\rL<=>3>\\fV8Q6\\nZ1\\t75\\nM"6NO\\n2^2n\\bM\\n&P!K&V|EH!6F\8C1O+&:\\r'
    //   11: dup
    //   12: astore_3
    //   13: invokevirtual length : ()I
    //   16: istore #5
    //   18: bipush #105
    //   20: istore_2
    //   21: iconst_m1
    //   22: istore_1
    //   23: bipush #23
    //   25: iinc #1, 1
    //   28: aload_3
    //   29: iload_1
    //   30: dup
    //   31: iload_2
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 130
    //   40: aload_0
    //   41: swap
    //   42: iload #4
    //   44: iinc #4, 1
    //   47: swap
    //   48: aastore
    //   49: iload_1
    //   50: iload_2
    //   51: iadd
    //   52: dup
    //   53: istore_1
    //   54: iload #5
    //   56: if_icmpge -> 68
    //   59: aload_3
    //   60: iload_1
    //   61: invokevirtual charAt : (I)C
    //   64: istore_2
    //   65: goto -> 23
    //   68: ldc '*4c,~Tm0x.\\t7\\f+'p9j'48>\\b6m$x?\\b),4v(+m$r/02oc3(\\bm0e3=T+.c9'24:17\\b#'r/I*4c,~Tm0x.\\t7\\f+'p9j'48>+m5y0'o%y4*'$:=\\r-V1#v2-%m`5\\t,V 5e,P7+4r'
    //   70: dup
    //   71: astore_3
    //   72: invokevirtual length : ()I
    //   75: istore #5
    //   77: bipush #81
    //   79: istore_2
    //   80: iconst_m1
    //   81: istore_1
    //   82: bipush #63
    //   84: iinc #1, 1
    //   87: aload_3
    //   88: iload_1
    //   89: dup
    //   90: iload_2
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 130
    //   99: aload_0
    //   100: swap
    //   101: iload #4
    //   103: iinc #4, 1
    //   106: swap
    //   107: aastore
    //   108: iload_1
    //   109: iload_2
    //   110: iadd
    //   111: dup
    //   112: istore_1
    //   113: iload #5
    //   115: if_icmpge -> 127
    //   118: aload_3
    //   119: iload_1
    //   120: invokevirtual charAt : (I)C
    //   123: istore_2
    //   124: goto -> 82
    //   127: goto -> 288
    //   130: dup_x2
    //   131: pop
    //   132: invokevirtual toCharArray : ()[C
    //   135: dup_x1
    //   136: arraylength
    //   137: dup_x2
    //   138: pop
    //   139: iconst_0
    //   140: istore #6
    //   142: dup2_x1
    //   143: pop2
    //   144: dup_x2
    //   145: iconst_1
    //   146: if_icmpgt -> 248
    //   149: dup2
    //   150: swap
    //   151: iload #6
    //   153: dup2_x1
    //   154: caload
    //   155: swap
    //   156: iload #6
    //   158: bipush #7
    //   160: irem
    //   161: tableswitch default -> 230, 0 -> 200, 1 -> 205, 2 -> 210, 3 -> 215, 4 -> 220, 5 -> 225
    //   200: bipush #125
    //   202: goto -> 232
    //   205: bipush #127
    //   207: goto -> 232
    //   210: bipush #40
    //   212: goto -> 232
    //   215: bipush #99
    //   217: goto -> 232
    //   220: bipush #66
    //   222: goto -> 232
    //   225: bipush #123
    //   227: goto -> 232
    //   230: bipush #68
    //   232: ixor
    //   233: ixor
    //   234: i2c
    //   235: castore
    //   236: iinc #6, 1
    //   239: dup
    //   240: ifne -> 248
    //   243: dup2
    //   244: dup_x1
    //   245: goto -> 153
    //   248: dup2_x1
    //   249: pop2
    //   250: dup_x2
    //   251: iload #6
    //   253: if_icmpgt -> 149
    //   256: pop
    //   257: new java/lang/String
    //   260: dup_x1
    //   261: swap
    //   262: invokespecial <init> : ([C)V
    //   265: invokevirtual intern : ()Ljava/lang/String;
    //   268: swap
    //   269: pop
    //   270: swap
    //   271: tableswitch default -> 40, 0 -> 99
    //   288: aload_0
    //   289: bipush #7
    //   291: aaload
    //   292: aload_0
    //   293: iconst_4
    //   294: aaload
    //   295: aload_0
    //   296: bipush #8
    //   298: aaload
    //   299: aload_0
    //   300: iconst_2
    //   301: aaload
    //   302: aload_0
    //   303: iconst_1
    //   304: aaload
    //   305: aload_0
    //   306: iconst_0
    //   307: aaload
    //   308: aload_0
    //   309: iconst_3
    //   310: aaload
    //   311: aload_0
    //   312: iconst_5
    //   313: aaload
    //   314: aload_0
    //   315: bipush #6
    //   317: aaload
    //   318: invokestatic of : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Set;
    //   321: putstatic burp/Zep6.Zf : Ljava/util/Set;
    //   324: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zep6.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */