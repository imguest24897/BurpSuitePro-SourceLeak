package com.fasterxml;

public enum Zqi {
  ANY, NATURAL, SCALAR, ARRAY, OBJECT, NUMBER, NUMBER_FLOAT, NUMBER_INT, STRING, BOOLEAN, BINARY;
  
  private static final Zqi[] Zw;
  
  public boolean Zp() {
    return (this == NUMBER || this == NUMBER_INT || this == NUMBER_FLOAT);
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: istore #4
    //   9: ldc '0Sf,\\b^u\\f1U`79 D>\\t1U`\\n1U`76\\t=\\b\\rUs&,\\r\\rQ`= Bk'
    //   11: dup
    //   12: astore_3
    //   13: invokevirtual length : ()I
    //   16: istore #5
    //   18: bipush #6
    //   20: istore_2
    //   21: iconst_m1
    //   22: istore_1
    //   23: bipush #92
    //   25: iinc #1, 1
    //   28: aload_3
    //   29: iload_1
    //   30: dup
    //   31: iload_2
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 129
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
    //   68: ldc '2\\fE=\\nN('
    //   70: dup
    //   71: astore_3
    //   72: invokevirtual length : ()I
    //   75: istore #5
    //   77: iconst_5
    //   78: istore_2
    //   79: iconst_m1
    //   80: istore_1
    //   81: bipush #80
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
    //   200: bipush #35
    //   202: goto -> 232
    //   205: bipush #27
    //   207: goto -> 232
    //   210: bipush #16
    //   212: goto -> 232
    //   215: bipush #29
    //   217: goto -> 232
    //   220: bipush #76
    //   222: goto -> 232
    //   225: bipush #110
    //   227: goto -> 232
    //   230: bipush #52
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
    //   271: tableswitch default -> 40, 0 -> 98
    //   288: new com/fasterxml/Zqi
    //   291: dup
    //   292: aload_0
    //   293: iconst_3
    //   294: aaload
    //   295: iconst_0
    //   296: invokespecial <init> : (Ljava/lang/String;I)V
    //   299: putstatic com/fasterxml/Zqi.ANY : Lcom/fasterxml/Zqi;
    //   302: new com/fasterxml/Zqi
    //   305: dup
    //   306: aload_0
    //   307: bipush #10
    //   309: aaload
    //   310: iconst_1
    //   311: invokespecial <init> : (Ljava/lang/String;I)V
    //   314: putstatic com/fasterxml/Zqi.NATURAL : Lcom/fasterxml/Zqi;
    //   317: new com/fasterxml/Zqi
    //   320: dup
    //   321: aload_0
    //   322: bipush #7
    //   324: aaload
    //   325: iconst_2
    //   326: invokespecial <init> : (Ljava/lang/String;I)V
    //   329: putstatic com/fasterxml/Zqi.SCALAR : Lcom/fasterxml/Zqi;
    //   332: new com/fasterxml/Zqi
    //   335: dup
    //   336: aload_0
    //   337: bipush #9
    //   339: aaload
    //   340: iconst_3
    //   341: invokespecial <init> : (Ljava/lang/String;I)V
    //   344: putstatic com/fasterxml/Zqi.ARRAY : Lcom/fasterxml/Zqi;
    //   347: new com/fasterxml/Zqi
    //   350: dup
    //   351: aload_0
    //   352: iconst_0
    //   353: aaload
    //   354: iconst_4
    //   355: invokespecial <init> : (Ljava/lang/String;I)V
    //   358: putstatic com/fasterxml/Zqi.OBJECT : Lcom/fasterxml/Zqi;
    //   361: new com/fasterxml/Zqi
    //   364: dup
    //   365: aload_0
    //   366: iconst_4
    //   367: aaload
    //   368: iconst_5
    //   369: invokespecial <init> : (Ljava/lang/String;I)V
    //   372: putstatic com/fasterxml/Zqi.NUMBER : Lcom/fasterxml/Zqi;
    //   375: new com/fasterxml/Zqi
    //   378: dup
    //   379: aload_0
    //   380: iconst_2
    //   381: aaload
    //   382: bipush #6
    //   384: invokespecial <init> : (Ljava/lang/String;I)V
    //   387: putstatic com/fasterxml/Zqi.NUMBER_FLOAT : Lcom/fasterxml/Zqi;
    //   390: new com/fasterxml/Zqi
    //   393: dup
    //   394: aload_0
    //   395: iconst_5
    //   396: aaload
    //   397: bipush #7
    //   399: invokespecial <init> : (Ljava/lang/String;I)V
    //   402: putstatic com/fasterxml/Zqi.NUMBER_INT : Lcom/fasterxml/Zqi;
    //   405: new com/fasterxml/Zqi
    //   408: dup
    //   409: aload_0
    //   410: iconst_1
    //   411: aaload
    //   412: bipush #8
    //   414: invokespecial <init> : (Ljava/lang/String;I)V
    //   417: putstatic com/fasterxml/Zqi.STRING : Lcom/fasterxml/Zqi;
    //   420: new com/fasterxml/Zqi
    //   423: dup
    //   424: aload_0
    //   425: bipush #6
    //   427: aaload
    //   428: bipush #9
    //   430: invokespecial <init> : (Ljava/lang/String;I)V
    //   433: putstatic com/fasterxml/Zqi.BOOLEAN : Lcom/fasterxml/Zqi;
    //   436: new com/fasterxml/Zqi
    //   439: dup
    //   440: aload_0
    //   441: bipush #8
    //   443: aaload
    //   444: bipush #10
    //   446: invokespecial <init> : (Ljava/lang/String;I)V
    //   449: putstatic com/fasterxml/Zqi.BINARY : Lcom/fasterxml/Zqi;
    //   452: bipush #11
    //   454: anewarray com/fasterxml/Zqi
    //   457: dup
    //   458: iconst_0
    //   459: getstatic com/fasterxml/Zqi.ANY : Lcom/fasterxml/Zqi;
    //   462: aastore
    //   463: dup
    //   464: iconst_1
    //   465: getstatic com/fasterxml/Zqi.NATURAL : Lcom/fasterxml/Zqi;
    //   468: aastore
    //   469: dup
    //   470: iconst_2
    //   471: getstatic com/fasterxml/Zqi.SCALAR : Lcom/fasterxml/Zqi;
    //   474: aastore
    //   475: dup
    //   476: iconst_3
    //   477: getstatic com/fasterxml/Zqi.ARRAY : Lcom/fasterxml/Zqi;
    //   480: aastore
    //   481: dup
    //   482: iconst_4
    //   483: getstatic com/fasterxml/Zqi.OBJECT : Lcom/fasterxml/Zqi;
    //   486: aastore
    //   487: dup
    //   488: iconst_5
    //   489: getstatic com/fasterxml/Zqi.NUMBER : Lcom/fasterxml/Zqi;
    //   492: aastore
    //   493: dup
    //   494: bipush #6
    //   496: getstatic com/fasterxml/Zqi.NUMBER_FLOAT : Lcom/fasterxml/Zqi;
    //   499: aastore
    //   500: dup
    //   501: bipush #7
    //   503: getstatic com/fasterxml/Zqi.NUMBER_INT : Lcom/fasterxml/Zqi;
    //   506: aastore
    //   507: dup
    //   508: bipush #8
    //   510: getstatic com/fasterxml/Zqi.STRING : Lcom/fasterxml/Zqi;
    //   513: aastore
    //   514: dup
    //   515: bipush #9
    //   517: getstatic com/fasterxml/Zqi.BOOLEAN : Lcom/fasterxml/Zqi;
    //   520: aastore
    //   521: dup
    //   522: bipush #10
    //   524: getstatic com/fasterxml/Zqi.BINARY : Lcom/fasterxml/Zqi;
    //   527: aastore
    //   528: putstatic com/fasterxml/Zqi.Zw : [Lcom/fasterxml/Zqi;
    //   531: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zqi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */