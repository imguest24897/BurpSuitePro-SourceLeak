package burp;

import java.util.LinkedList;
import java.util.List;

public class Zldg {
  private static final List<Ztnz> ZT;
  
  private static final List<Ztnz> ZE;
  
  public static List<Ztnz> Zd(boolean paramBoolean) {
    return paramBoolean ? new LinkedList<>(ZE) : new LinkedList<>(ZT);
  }
  
  static {
    // Byte code:
    //   0: bipush #22
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: istore #4
    //   9: ldc '6+[tR-+*E`B\\n(HtF\\f=T7N5U?\\t4'PaEt9%RdP>\\t%pV<Ht\\n!\\rE<P52\\r_kB\\t%pV<Ht\\n 7\\rG<p>*4'PaEt0*ZuX7\\r6%]t*G~]\\n 7\\rG<p>*>E=="TeTuU&\\r6%]t*G~]*E`B\\n(HtF\\f=T7N5U?\\t4'PaEt0*ZuX74'PaEt9%RdP>\\n6+[tR-+_kB4'PaE(Ft'
    //   11: dup
    //   12: astore_3
    //   13: invokevirtual length : ()I
    //   16: istore #5
    //   18: bipush #10
    //   20: istore_2
    //   21: iconst_m1
    //   22: istore_1
    //   23: bipush #41
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
    //   68: ldc 'l@*YuJvZv[iO.>mQ'
    //   70: dup
    //   71: astore_3
    //   72: invokevirtual length : ()I
    //   75: istore #5
    //   77: bipush #6
    //   79: istore_2
    //   80: iconst_m1
    //   81: istore_1
    //   82: bipush #98
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
    //   200: bipush #92
    //   202: goto -> 232
    //   205: bipush #109
    //   207: goto -> 232
    //   210: bipush #65
    //   212: goto -> 232
    //   215: bipush #28
    //   217: goto -> 232
    //   220: bipush #56
    //   222: goto -> 232
    //   225: bipush #24
    //   227: goto -> 232
    //   230: bipush #112
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
    //   288: new burp/Ztnz
    //   291: dup
    //   292: aload_0
    //   293: bipush #8
    //   295: aaload
    //   296: aload_0
    //   297: bipush #11
    //   299: aaload
    //   300: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   303: new burp/Ztnz
    //   306: dup
    //   307: aload_0
    //   308: bipush #18
    //   310: aaload
    //   311: aload_0
    //   312: iconst_5
    //   313: aaload
    //   314: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   317: new burp/Ztnz
    //   320: dup
    //   321: aload_0
    //   322: iconst_2
    //   323: aaload
    //   324: aload_0
    //   325: bipush #13
    //   327: aaload
    //   328: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   331: new burp/Ztnz
    //   334: dup
    //   335: aload_0
    //   336: bipush #10
    //   338: aaload
    //   339: invokestatic ZC : ()Ljava/lang/String;
    //   342: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   345: new burp/Ztnz
    //   348: dup
    //   349: aload_0
    //   350: bipush #16
    //   352: aaload
    //   353: aload_0
    //   354: bipush #19
    //   356: aaload
    //   357: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   360: new burp/Ztnz
    //   363: dup
    //   364: aload_0
    //   365: bipush #12
    //   367: aaload
    //   368: aload_0
    //   369: iconst_3
    //   370: aaload
    //   371: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   374: invokestatic of : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
    //   377: putstatic burp/Zldg.ZT : Ljava/util/List;
    //   380: new burp/Ztnz
    //   383: dup
    //   384: aload_0
    //   385: bipush #14
    //   387: aaload
    //   388: aload_0
    //   389: bipush #21
    //   391: aaload
    //   392: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   395: new burp/Ztnz
    //   398: dup
    //   399: aload_0
    //   400: bipush #20
    //   402: aaload
    //   403: aload_0
    //   404: bipush #17
    //   406: aaload
    //   407: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   410: new burp/Ztnz
    //   413: dup
    //   414: aload_0
    //   415: bipush #15
    //   417: aaload
    //   418: aload_0
    //   419: iconst_1
    //   420: aaload
    //   421: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   424: new burp/Ztnz
    //   427: dup
    //   428: aload_0
    //   429: bipush #7
    //   431: aaload
    //   432: invokestatic ZC : ()Ljava/lang/String;
    //   435: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   438: new burp/Ztnz
    //   441: dup
    //   442: aload_0
    //   443: iconst_0
    //   444: aaload
    //   445: aload_0
    //   446: iconst_4
    //   447: aaload
    //   448: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   451: new burp/Ztnz
    //   454: dup
    //   455: aload_0
    //   456: bipush #9
    //   458: aaload
    //   459: aload_0
    //   460: bipush #6
    //   462: aaload
    //   463: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   466: invokestatic of : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
    //   469: putstatic burp/Zldg.ZE : Ljava/util/List;
    //   472: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zldg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */