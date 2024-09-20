package burp;

class Zg_7 {
  private static final String[] Zl;
  
  final double Zp;
  
  final byte ZX;
  
  Zg_7(double paramDouble, byte paramByte) {
    this.Zp = paramDouble;
    this.ZX = paramByte;
  }
  
  public String toString() {
    return (this.ZX == 0) ? Zl[0] : ("" + this.Zp + " " + this.Zp);
  }
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: istore #4
    //   9: ldc '}\\n}?ly*q\\t\\r5\\ty{\\r?'
    //   11: dup
    //   12: astore_3
    //   13: invokevirtual length : ()I
    //   16: istore #5
    //   18: iconst_5
    //   19: istore_2
    //   20: iconst_m1
    //   21: istore_1
    //   22: bipush #89
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
    //   67: ldc 'Q3QXUv[0'
    //   69: dup
    //   70: astore_3
    //   71: invokevirtual length : ()I
    //   74: istore #5
    //   76: bipush #6
    //   78: istore_2
    //   79: iconst_m1
    //   80: istore_1
    //   81: bipush #16
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
    //   200: bipush #40
    //   202: goto -> 232
    //   205: bipush #77
    //   207: goto -> 232
    //   210: bipush #34
    //   212: goto -> 232
    //   215: bipush #32
    //   217: goto -> 232
    //   220: bipush #32
    //   222: goto -> 232
    //   225: bipush #21
    //   227: goto -> 232
    //   230: bipush #13
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
    //   288: bipush #10
    //   290: anewarray java/lang/String
    //   293: dup
    //   294: iconst_0
    //   295: aload_0
    //   296: iconst_4
    //   297: aaload
    //   298: aastore
    //   299: dup
    //   300: iconst_1
    //   301: aload_0
    //   302: iconst_1
    //   303: aaload
    //   304: aastore
    //   305: dup
    //   306: iconst_2
    //   307: aload_0
    //   308: bipush #6
    //   310: aaload
    //   311: aastore
    //   312: dup
    //   313: iconst_3
    //   314: aload_0
    //   315: iconst_0
    //   316: aaload
    //   317: aastore
    //   318: dup
    //   319: iconst_4
    //   320: aload_0
    //   321: bipush #7
    //   323: aaload
    //   324: aastore
    //   325: dup
    //   326: iconst_5
    //   327: aload_0
    //   328: iconst_5
    //   329: aaload
    //   330: aastore
    //   331: dup
    //   332: bipush #6
    //   334: aload_0
    //   335: bipush #8
    //   337: aaload
    //   338: aastore
    //   339: dup
    //   340: bipush #7
    //   342: ldc '%'
    //   344: aastore
    //   345: dup
    //   346: bipush #8
    //   348: aload_0
    //   349: iconst_3
    //   350: aaload
    //   351: aastore
    //   352: dup
    //   353: bipush #9
    //   355: aload_0
    //   356: iconst_2
    //   357: aaload
    //   358: aastore
    //   359: putstatic burp/Zg_7.Zl : [Ljava/lang/String;
    //   362: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg_7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */