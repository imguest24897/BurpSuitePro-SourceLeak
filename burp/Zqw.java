package burp;

public interface Zqw {
  public static final String[] Zj;
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: istore #4
    //   9: ldc 'J]a\\flnJTuJc\\bjHhB|\\tWhJeqx]h\\tK\q\\bvh]hHhBn\\b{gu]pweK'
    //   11: dup
    //   12: astore_3
    //   13: invokevirtual length : ()I
    //   16: istore #5
    //   18: bipush #8
    //   20: istore_2
    //   21: iconst_m1
    //   22: istore_1
    //   23: bipush #83
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
    //   68: ldc '?\\b,{)\\b3z\\n'
    //   70: dup
    //   71: astore_3
    //   72: invokevirtual length : ()I
    //   75: istore #5
    //   77: bipush #6
    //   79: istore_2
    //   80: iconst_m1
    //   81: istore_1
    //   82: bipush #32
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
    //   200: bipush #107
    //   202: goto -> 232
    //   205: bipush #73
    //   207: goto -> 232
    //   210: bipush #126
    //   212: goto -> 232
    //   215: bipush #87
    //   217: goto -> 232
    //   220: bipush #62
    //   222: goto -> 232
    //   225: bipush #75
    //   227: goto -> 232
    //   230: bipush #88
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
    //   288: bipush #8
    //   290: anewarray java/lang/String
    //   293: dup
    //   294: iconst_0
    //   295: aload_0
    //   296: bipush #7
    //   298: aaload
    //   299: aastore
    //   300: dup
    //   301: iconst_1
    //   302: aload_0
    //   303: iconst_1
    //   304: aaload
    //   305: aastore
    //   306: dup
    //   307: iconst_2
    //   308: aload_0
    //   309: iconst_5
    //   310: aaload
    //   311: aastore
    //   312: dup
    //   313: iconst_3
    //   314: aload_0
    //   315: iconst_2
    //   316: aaload
    //   317: aastore
    //   318: dup
    //   319: iconst_4
    //   320: aload_0
    //   321: iconst_0
    //   322: aaload
    //   323: aastore
    //   324: dup
    //   325: iconst_5
    //   326: aload_0
    //   327: iconst_4
    //   328: aaload
    //   329: aastore
    //   330: dup
    //   331: bipush #6
    //   333: aload_0
    //   334: bipush #6
    //   336: aaload
    //   337: aastore
    //   338: dup
    //   339: bipush #7
    //   341: aload_0
    //   342: iconst_3
    //   343: aaload
    //   344: aastore
    //   345: putstatic burp/Zqw.Zj : [Ljava/lang/String;
    //   348: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zqw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */