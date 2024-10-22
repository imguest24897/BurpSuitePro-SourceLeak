package com.fasterxml.Zb;

public enum Zk {
  INT, LONG, BIG_INTEGER, FLOAT, DOUBLE, BIG_DECIMAL;
  
  private static final Zk[] Zu;
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: istore #4
    //   9: ldc 'Qp<([s=Uu45,XR{6Ss&0''
    //   11: dup
    //   12: astore_3
    //   13: invokevirtual length : ()I
    //   16: istore #5
    //   18: iconst_5
    //   19: istore_2
    //   20: iconst_m1
    //   21: istore_1
    //   22: bipush #74
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
    //   67: ldc ''F}JU=,@n, U'
    //   69: dup
    //   70: astore_3
    //   71: invokevirtual length : ()I
    //   74: istore #5
    //   76: bipush #11
    //   78: istore_2
    //   79: iconst_m1
    //   80: istore_1
    //   81: bipush #56
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
    //   200: bipush #93
    //   202: goto -> 232
    //   205: bipush #118
    //   207: goto -> 232
    //   210: bipush #57
    //   212: goto -> 232
    //   215: bipush #26
    //   217: goto -> 232
    //   220: bipush #54
    //   222: goto -> 232
    //   225: bipush #40
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
    //   288: new com/fasterxml/Zb/Zk
    //   291: dup
    //   292: aload_0
    //   293: iconst_5
    //   294: aaload
    //   295: iconst_0
    //   296: invokespecial <init> : (Ljava/lang/String;I)V
    //   299: putstatic com/fasterxml/Zb/Zk.INT : Lcom/fasterxml/Zb/Zk;
    //   302: new com/fasterxml/Zb/Zk
    //   305: dup
    //   306: aload_0
    //   307: iconst_1
    //   308: aaload
    //   309: iconst_1
    //   310: invokespecial <init> : (Ljava/lang/String;I)V
    //   313: putstatic com/fasterxml/Zb/Zk.LONG : Lcom/fasterxml/Zb/Zk;
    //   316: new com/fasterxml/Zb/Zk
    //   319: dup
    //   320: aload_0
    //   321: iconst_2
    //   322: aaload
    //   323: iconst_2
    //   324: invokespecial <init> : (Ljava/lang/String;I)V
    //   327: putstatic com/fasterxml/Zb/Zk.BIG_INTEGER : Lcom/fasterxml/Zb/Zk;
    //   330: new com/fasterxml/Zb/Zk
    //   333: dup
    //   334: aload_0
    //   335: iconst_0
    //   336: aaload
    //   337: iconst_3
    //   338: invokespecial <init> : (Ljava/lang/String;I)V
    //   341: putstatic com/fasterxml/Zb/Zk.FLOAT : Lcom/fasterxml/Zb/Zk;
    //   344: new com/fasterxml/Zb/Zk
    //   347: dup
    //   348: aload_0
    //   349: iconst_3
    //   350: aaload
    //   351: iconst_4
    //   352: invokespecial <init> : (Ljava/lang/String;I)V
    //   355: putstatic com/fasterxml/Zb/Zk.DOUBLE : Lcom/fasterxml/Zb/Zk;
    //   358: new com/fasterxml/Zb/Zk
    //   361: dup
    //   362: aload_0
    //   363: iconst_4
    //   364: aaload
    //   365: iconst_5
    //   366: invokespecial <init> : (Ljava/lang/String;I)V
    //   369: putstatic com/fasterxml/Zb/Zk.BIG_DECIMAL : Lcom/fasterxml/Zb/Zk;
    //   372: bipush #6
    //   374: anewarray com/fasterxml/Zb/Zk
    //   377: dup
    //   378: iconst_0
    //   379: getstatic com/fasterxml/Zb/Zk.INT : Lcom/fasterxml/Zb/Zk;
    //   382: aastore
    //   383: dup
    //   384: iconst_1
    //   385: getstatic com/fasterxml/Zb/Zk.LONG : Lcom/fasterxml/Zb/Zk;
    //   388: aastore
    //   389: dup
    //   390: iconst_2
    //   391: getstatic com/fasterxml/Zb/Zk.BIG_INTEGER : Lcom/fasterxml/Zb/Zk;
    //   394: aastore
    //   395: dup
    //   396: iconst_3
    //   397: getstatic com/fasterxml/Zb/Zk.FLOAT : Lcom/fasterxml/Zb/Zk;
    //   400: aastore
    //   401: dup
    //   402: iconst_4
    //   403: getstatic com/fasterxml/Zb/Zk.DOUBLE : Lcom/fasterxml/Zb/Zk;
    //   406: aastore
    //   407: dup
    //   408: iconst_5
    //   409: getstatic com/fasterxml/Zb/Zk.BIG_DECIMAL : Lcom/fasterxml/Zb/Zk;
    //   412: aastore
    //   413: putstatic com/fasterxml/Zb/Zk.Zu : [Lcom/fasterxml/Zb/Zk;
    //   416: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zb\Zk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */