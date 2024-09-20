package com.fasterxml.Zz;

import burp.Zbqc;
import burp.Zmuc;

abstract class Zu extends Za {
  private static final String[] b;
  
  private static final String[] c;
  
  private static int Zt(CharSequence paramCharSequence, int paramInt1, int paramInt2) {
    Zbqc[] arrayOfZbqc = Zmuc.ZA();
    while (paramInt1 < paramInt2) {
      try {
        if (paramCharSequence.charAt(paramInt1) <= ' ') {
          paramInt1++;
          if (arrayOfZbqc != null)
            break; 
        } 
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
    } 
    return paramInt1;
  }
  
  abstract long ZL();
  
  abstract long Zl();
  
  private long ZK(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2) {
    // Byte code:
    //   0: invokestatic ZA : ()[Lburp/Zbqc;
    //   3: lconst_0
    //   4: lstore #8
    //   6: astore #7
    //   8: iload_2
    //   9: istore #10
    //   11: iconst_m1
    //   12: istore #11
    //   14: iconst_0
    //   15: istore #12
    //   17: iconst_0
    //   18: istore #13
    //   20: iload_2
    //   21: iload #4
    //   23: if_icmpge -> 115
    //   26: aload_1
    //   27: iload_2
    //   28: invokeinterface charAt : (I)C
    //   33: istore #13
    //   35: iload #13
    //   37: invokestatic ZD : (C)Z
    //   40: ifeq -> 64
    //   43: ldc2_w 10
    //   46: lload #8
    //   48: lmul
    //   49: iload #13
    //   51: i2l
    //   52: ladd
    //   53: ldc2_w 48
    //   56: lsub
    //   57: lstore #8
    //   59: aload #7
    //   61: ifnull -> 107
    //   64: iload #13
    //   66: bipush #46
    //   68: if_icmpne -> 115
    //   71: goto -> 78
    //   74: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   77: athrow
    //   78: iload #12
    //   80: iload #11
    //   82: iflt -> 100
    //   85: goto -> 92
    //   88: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   91: athrow
    //   92: iconst_1
    //   93: goto -> 101
    //   96: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   99: athrow
    //   100: iconst_0
    //   101: ior
    //   102: istore #12
    //   104: iload_2
    //   105: istore #11
    //   107: iinc #2, 1
    //   110: aload #7
    //   112: ifnull -> 20
    //   115: iload_2
    //   116: istore #15
    //   118: iload #11
    //   120: ifge -> 142
    //   123: iload #15
    //   125: iload #10
    //   127: isub
    //   128: istore #14
    //   130: iload #15
    //   132: istore #11
    //   134: iconst_0
    //   135: istore #16
    //   137: aload #7
    //   139: ifnull -> 160
    //   142: iload #15
    //   144: iload #10
    //   146: isub
    //   147: iconst_1
    //   148: isub
    //   149: istore #14
    //   151: iload #11
    //   153: iload #15
    //   155: isub
    //   156: iconst_1
    //   157: iadd
    //   158: istore #16
    //   160: iconst_0
    //   161: istore #17
    //   163: iload #13
    //   165: bipush #32
    //   167: ior
    //   168: bipush #101
    //   170: if_icmpne -> 314
    //   173: aload_1
    //   174: iinc #2, 1
    //   177: iload_2
    //   178: iload #4
    //   180: invokestatic Ze : (Ljava/lang/CharSequence;II)C
    //   183: istore #13
    //   185: iload #13
    //   187: bipush #45
    //   189: if_icmpne -> 200
    //   192: iconst_1
    //   193: goto -> 201
    //   196: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   199: athrow
    //   200: iconst_0
    //   201: istore #18
    //   203: iload #18
    //   205: ifne -> 222
    //   208: iload #13
    //   210: bipush #43
    //   212: if_icmpne -> 234
    //   215: goto -> 222
    //   218: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   221: athrow
    //   222: aload_1
    //   223: iinc #2, 1
    //   226: iload_2
    //   227: iload #4
    //   229: invokestatic Ze : (Ljava/lang/CharSequence;II)C
    //   232: istore #13
    //   234: iload #12
    //   236: iload #13
    //   238: invokestatic ZD : (C)Z
    //   241: ifne -> 252
    //   244: iconst_1
    //   245: goto -> 253
    //   248: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   251: athrow
    //   252: iconst_0
    //   253: ior
    //   254: istore #12
    //   256: iload #17
    //   258: sipush #1024
    //   261: if_icmpge -> 277
    //   264: bipush #10
    //   266: iload #17
    //   268: imul
    //   269: iload #13
    //   271: iadd
    //   272: bipush #48
    //   274: isub
    //   275: istore #17
    //   277: aload_1
    //   278: iinc #2, 1
    //   281: iload_2
    //   282: iload #4
    //   284: invokestatic Ze : (Ljava/lang/CharSequence;II)C
    //   287: istore #13
    //   289: iload #13
    //   291: invokestatic ZD : (C)Z
    //   294: ifne -> 256
    //   297: iload #18
    //   299: ifeq -> 307
    //   302: iload #17
    //   304: ineg
    //   305: istore #17
    //   307: iload #16
    //   309: iload #17
    //   311: iadd
    //   312: istore #16
    //   314: iload #13
    //   316: bipush #34
    //   318: ior
    //   319: bipush #102
    //   321: if_icmpne -> 334
    //   324: iinc #2, 1
    //   327: goto -> 334
    //   330: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   333: athrow
    //   334: aload_1
    //   335: iload_2
    //   336: iload #4
    //   338: invokestatic Zt : (Ljava/lang/CharSequence;II)I
    //   341: istore_2
    //   342: iload #12
    //   344: ifne -> 384
    //   347: iload_2
    //   348: iload #4
    //   350: if_icmplt -> 384
    //   353: goto -> 360
    //   356: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   359: athrow
    //   360: iload #6
    //   362: ifne -> 405
    //   365: goto -> 372
    //   368: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   371: athrow
    //   372: iload #14
    //   374: ifne -> 405
    //   377: goto -> 384
    //   380: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   383: athrow
    //   384: new java/lang/NumberFormatException
    //   387: dup
    //   388: sipush #-29716
    //   391: sipush #-22210
    //   394: invokestatic a : (II)Ljava/lang/String;
    //   397: invokespecial <init> : (Ljava/lang/String;)V
    //   400: athrow
    //   401: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   404: athrow
    //   405: iconst_0
    //   406: istore #19
    //   408: iload #14
    //   410: bipush #19
    //   412: if_icmple -> 534
    //   415: lconst_0
    //   416: lstore #8
    //   418: iload #10
    //   420: istore_2
    //   421: iload_2
    //   422: iload #15
    //   424: if_icmpge -> 500
    //   427: aload_1
    //   428: iload_2
    //   429: invokeinterface charAt : (I)C
    //   434: istore #13
    //   436: iload #13
    //   438: bipush #46
    //   440: if_icmpne -> 458
    //   443: iinc #19, 1
    //   446: aload #7
    //   448: ifnull -> 492
    //   451: goto -> 458
    //   454: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   457: athrow
    //   458: lload #8
    //   460: ldc2_w 1000000000000000000
    //   463: invokestatic compareUnsigned : (JJ)I
    //   466: ifge -> 500
    //   469: goto -> 476
    //   472: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   475: athrow
    //   476: ldc2_w 10
    //   479: lload #8
    //   481: lmul
    //   482: iload #13
    //   484: i2l
    //   485: ladd
    //   486: ldc2_w 48
    //   489: lsub
    //   490: lstore #8
    //   492: iinc #2, 1
    //   495: aload #7
    //   497: ifnull -> 421
    //   500: iload_2
    //   501: iload #15
    //   503: if_icmpge -> 514
    //   506: iconst_1
    //   507: goto -> 515
    //   510: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   513: athrow
    //   514: iconst_0
    //   515: istore #18
    //   517: iload #11
    //   519: iload_2
    //   520: isub
    //   521: iload #19
    //   523: iadd
    //   524: iload #17
    //   526: iadd
    //   527: istore #20
    //   529: aload #7
    //   531: ifnull -> 540
    //   534: iconst_0
    //   535: istore #18
    //   537: iconst_0
    //   538: istore #20
    //   540: aload_0
    //   541: aload_1
    //   542: iload_3
    //   543: iload #4
    //   545: iload #5
    //   547: lload #8
    //   549: iload #16
    //   551: iload #18
    //   553: iload #20
    //   555: invokevirtual Zy : (Ljava/lang/CharSequence;IIZJIZI)J
    //   558: lreturn
    // Exception table:
    //   from	to	target	type
    //   59	71	74	java/lang/NumberFormatException
    //   64	85	88	java/lang/NumberFormatException
    //   78	96	96	java/lang/NumberFormatException
    //   185	196	196	java/lang/NumberFormatException
    //   203	215	218	java/lang/NumberFormatException
    //   234	248	248	java/lang/NumberFormatException
    //   314	327	330	java/lang/NumberFormatException
    //   342	353	356	java/lang/NumberFormatException
    //   347	365	368	java/lang/NumberFormatException
    //   360	377	380	java/lang/NumberFormatException
    //   372	401	401	java/lang/NumberFormatException
    //   436	451	454	java/lang/NumberFormatException
    //   443	469	472	java/lang/NumberFormatException
    //   500	510	510	java/lang/NumberFormatException
  }
  
  public final long ZX(CharSequence paramCharSequence, int paramInt1, int paramInt2) {
    int i = ZP(paramCharSequence.length(), paramInt1, paramInt2);
    int j = Zt(paramCharSequence, paramInt1, i);
    try {
      if (j == i)
        throw new NumberFormatException(a(-29715, -3156)); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    char c = paramCharSequence.charAt(j);
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    boolean bool1 = (c == '-') ? true : false;
    try {
      if (bool1 || c == '+') {
        c = Ze(paramCharSequence, ++j, i);
        try {
          if (c == '\000')
            throw new NumberFormatException(a(-29716, -22210)); 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      if (c >= 'I')
        return Za(paramCharSequence, j, i, bool1); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    boolean bool2 = (c == '0') ? true : false;
    if (bool2) {
      c = Ze(paramCharSequence, ++j, i);
      try {
        if ((c | 0x20) == 120)
          return Zs(paramCharSequence, j + 1, paramInt1, i, bool1); 
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
    } 
    return ZK(paramCharSequence, j, paramInt1, i, bool1, bool2);
  }
  
  private long Zs(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic ZA : ()[Lburp/Zbqc;
    //   3: lconst_0
    //   4: lstore #7
    //   6: astore #6
    //   8: iconst_0
    //   9: istore #9
    //   11: iload_2
    //   12: istore #10
    //   14: iconst_m1
    //   15: istore #11
    //   17: iconst_0
    //   18: istore #13
    //   20: iconst_0
    //   21: istore #14
    //   23: iload_2
    //   24: iload #4
    //   26: if_icmpge -> 159
    //   29: aload_1
    //   30: iload_2
    //   31: invokeinterface charAt : (I)C
    //   36: istore #14
    //   38: iload #14
    //   40: invokestatic Ze : (C)I
    //   43: istore #15
    //   45: iload #15
    //   47: iflt -> 65
    //   50: lload #7
    //   52: iconst_4
    //   53: lshl
    //   54: iload #15
    //   56: i2l
    //   57: lor
    //   58: lstore #7
    //   60: aload #6
    //   62: ifnull -> 151
    //   65: iload #15
    //   67: bipush #-4
    //   69: if_icmpne -> 159
    //   72: goto -> 79
    //   75: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   78: athrow
    //   79: iload #13
    //   81: iload #11
    //   83: iflt -> 101
    //   86: goto -> 93
    //   89: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   92: athrow
    //   93: iconst_1
    //   94: goto -> 102
    //   97: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   100: athrow
    //   101: iconst_0
    //   102: ior
    //   103: istore #13
    //   105: iload_2
    //   106: istore #11
    //   108: iload_2
    //   109: iload #4
    //   111: bipush #8
    //   113: isub
    //   114: if_icmpge -> 151
    //   117: aload_1
    //   118: iload_2
    //   119: iconst_1
    //   120: iadd
    //   121: invokestatic ZU : (Ljava/lang/CharSequence;I)J
    //   124: lstore #16
    //   126: lload #16
    //   128: lconst_0
    //   129: lcmp
    //   130: iflt -> 151
    //   133: lload #7
    //   135: bipush #32
    //   137: lshl
    //   138: lload #16
    //   140: ladd
    //   141: lstore #7
    //   143: iinc #2, 8
    //   146: aload #6
    //   148: ifnull -> 108
    //   151: iinc #2, 1
    //   154: aload #6
    //   156: ifnull -> 23
    //   159: iload_2
    //   160: istore #15
    //   162: iload #11
    //   164: ifge -> 183
    //   167: iload #15
    //   169: iload #10
    //   171: isub
    //   172: istore #12
    //   174: iload #15
    //   176: istore #11
    //   178: aload #6
    //   180: ifnull -> 208
    //   183: iload #15
    //   185: iload #10
    //   187: isub
    //   188: iconst_1
    //   189: isub
    //   190: istore #12
    //   192: iload #11
    //   194: iload_2
    //   195: isub
    //   196: iconst_1
    //   197: iadd
    //   198: sipush #1024
    //   201: invokestatic min : (II)I
    //   204: iconst_4
    //   205: imul
    //   206: istore #9
    //   208: iconst_0
    //   209: istore #16
    //   211: iload #14
    //   213: bipush #32
    //   215: ior
    //   216: bipush #112
    //   218: if_icmpne -> 229
    //   221: iconst_1
    //   222: goto -> 230
    //   225: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   228: athrow
    //   229: iconst_0
    //   230: istore #17
    //   232: iload #17
    //   234: ifeq -> 378
    //   237: aload_1
    //   238: iinc #2, 1
    //   241: iload_2
    //   242: iload #4
    //   244: invokestatic Ze : (Ljava/lang/CharSequence;II)C
    //   247: istore #14
    //   249: iload #14
    //   251: bipush #45
    //   253: if_icmpne -> 264
    //   256: iconst_1
    //   257: goto -> 265
    //   260: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   263: athrow
    //   264: iconst_0
    //   265: istore #18
    //   267: iload #18
    //   269: ifne -> 286
    //   272: iload #14
    //   274: bipush #43
    //   276: if_icmpne -> 298
    //   279: goto -> 286
    //   282: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   285: athrow
    //   286: aload_1
    //   287: iinc #2, 1
    //   290: iload_2
    //   291: iload #4
    //   293: invokestatic Ze : (Ljava/lang/CharSequence;II)C
    //   296: istore #14
    //   298: iload #13
    //   300: iload #14
    //   302: invokestatic ZD : (C)Z
    //   305: ifne -> 316
    //   308: iconst_1
    //   309: goto -> 317
    //   312: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   315: athrow
    //   316: iconst_0
    //   317: ior
    //   318: istore #13
    //   320: iload #16
    //   322: sipush #1024
    //   325: if_icmpge -> 341
    //   328: bipush #10
    //   330: iload #16
    //   332: imul
    //   333: iload #14
    //   335: iadd
    //   336: bipush #48
    //   338: isub
    //   339: istore #16
    //   341: aload_1
    //   342: iinc #2, 1
    //   345: iload_2
    //   346: iload #4
    //   348: invokestatic Ze : (Ljava/lang/CharSequence;II)C
    //   351: istore #14
    //   353: iload #14
    //   355: invokestatic ZD : (C)Z
    //   358: ifne -> 320
    //   361: iload #18
    //   363: ifeq -> 371
    //   366: iload #16
    //   368: ineg
    //   369: istore #16
    //   371: iload #9
    //   373: iload #16
    //   375: iadd
    //   376: istore #9
    //   378: iload #14
    //   380: bipush #34
    //   382: ior
    //   383: bipush #102
    //   385: if_icmpne -> 398
    //   388: iinc #2, 1
    //   391: goto -> 398
    //   394: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   397: athrow
    //   398: aload_1
    //   399: iload_2
    //   400: iload #4
    //   402: invokestatic Zt : (Ljava/lang/CharSequence;II)I
    //   405: istore_2
    //   406: iload #13
    //   408: ifne -> 448
    //   411: iload_2
    //   412: iload #4
    //   414: if_icmplt -> 448
    //   417: goto -> 424
    //   420: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   423: athrow
    //   424: iload #12
    //   426: ifeq -> 448
    //   429: goto -> 436
    //   432: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   435: athrow
    //   436: iload #17
    //   438: ifne -> 469
    //   441: goto -> 448
    //   444: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   447: athrow
    //   448: new java/lang/NumberFormatException
    //   451: dup
    //   452: sipush #-29716
    //   455: sipush #-22210
    //   458: invokestatic a : (II)Ljava/lang/String;
    //   461: invokespecial <init> : (Ljava/lang/String;)V
    //   464: athrow
    //   465: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   468: athrow
    //   469: iconst_0
    //   470: istore #19
    //   472: iload #12
    //   474: bipush #16
    //   476: if_icmple -> 585
    //   479: lconst_0
    //   480: lstore #7
    //   482: iload #10
    //   484: istore_2
    //   485: iload_2
    //   486: iload #15
    //   488: if_icmpge -> 563
    //   491: aload_1
    //   492: iload_2
    //   493: invokeinterface charAt : (I)C
    //   498: istore #14
    //   500: iload #14
    //   502: invokestatic Ze : (C)I
    //   505: istore #20
    //   507: iload #20
    //   509: iflt -> 545
    //   512: lload #7
    //   514: ldc2_w 1000000000000000000
    //   517: invokestatic compareUnsigned : (JJ)I
    //   520: ifge -> 563
    //   523: goto -> 530
    //   526: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   529: athrow
    //   530: lload #7
    //   532: iconst_4
    //   533: lshl
    //   534: iload #20
    //   536: i2l
    //   537: lor
    //   538: lstore #7
    //   540: aload #6
    //   542: ifnull -> 555
    //   545: iinc #19, 1
    //   548: goto -> 555
    //   551: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   554: athrow
    //   555: iinc #2, 1
    //   558: aload #6
    //   560: ifnull -> 485
    //   563: iload_2
    //   564: iload #15
    //   566: if_icmpge -> 577
    //   569: iconst_1
    //   570: goto -> 578
    //   573: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   576: athrow
    //   577: iconst_0
    //   578: istore #18
    //   580: aload #6
    //   582: ifnull -> 588
    //   585: iconst_0
    //   586: istore #18
    //   588: aload_0
    //   589: aload_1
    //   590: iload_3
    //   591: iload #4
    //   593: iload #5
    //   595: lload #7
    //   597: iload #9
    //   599: iload #18
    //   601: iload #11
    //   603: iload_2
    //   604: isub
    //   605: iload #19
    //   607: iadd
    //   608: iconst_4
    //   609: imul
    //   610: iload #16
    //   612: iadd
    //   613: invokevirtual Zh : (Ljava/lang/CharSequence;IIZJIZI)J
    //   616: lreturn
    // Exception table:
    //   from	to	target	type
    //   60	72	75	java/lang/NumberFormatException
    //   65	86	89	java/lang/NumberFormatException
    //   79	97	97	java/lang/NumberFormatException
    //   211	225	225	java/lang/NumberFormatException
    //   249	260	260	java/lang/NumberFormatException
    //   267	279	282	java/lang/NumberFormatException
    //   298	312	312	java/lang/NumberFormatException
    //   378	391	394	java/lang/NumberFormatException
    //   406	417	420	java/lang/NumberFormatException
    //   411	429	432	java/lang/NumberFormatException
    //   424	441	444	java/lang/NumberFormatException
    //   436	465	465	java/lang/NumberFormatException
    //   507	523	526	java/lang/NumberFormatException
    //   540	548	551	java/lang/NumberFormatException
    //   563	573	573	java/lang/NumberFormatException
  }
  
  private long Za(CharSequence paramCharSequence, int paramInt1, int paramInt2, boolean paramBoolean) {
    try {
      if (paramCharSequence.charAt(paramInt1) == 'N') {
        try {
          if (paramInt1 + 2 < paramInt2)
            try {
              if (paramCharSequence.charAt(paramInt1 + 1) == 'a' && paramCharSequence.charAt(paramInt1 + 2) == 'N') {
                paramInt1 = Zt(paramCharSequence, paramInt1 + 3, paramInt2);
                try {
                  if (paramInt1 == paramInt2)
                    return ZL(); 
                } catch (NumberFormatException numberFormatException) {
                  throw a(null);
                } 
              } 
            } catch (NumberFormatException numberFormatException) {
              throw a(null);
            }  
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
      } else {
        try {
          if (paramInt1 + 7 < paramInt2)
            try {
              if (paramCharSequence.charAt(paramInt1) == 'I')
                try {
                  if (paramCharSequence.charAt(paramInt1 + 1) == 'n')
                    try {
                      if (paramCharSequence.charAt(paramInt1 + 2) == 'f')
                        try {
                          if (paramCharSequence.charAt(paramInt1 + 3) == 'i')
                            try {
                              if (paramCharSequence.charAt(paramInt1 + 4) == 'n')
                                try {
                                  if (paramCharSequence.charAt(paramInt1 + 5) == 'i')
                                    try {
                                      if (paramCharSequence.charAt(paramInt1 + 6) == 't' && paramCharSequence.charAt(paramInt1 + 7) == 'y') {
                                        paramInt1 = Zt(paramCharSequence, paramInt1 + 8, paramInt2);
                                        try {
                                          if (paramInt1 == paramInt2) {
                                            try {
                                            
                                            } catch (NumberFormatException numberFormatException) {
                                              throw a(null);
                                            } 
                                            return paramBoolean ? Zl() : ZE();
                                          } 
                                        } catch (NumberFormatException numberFormatException) {
                                          throw a(null);
                                        } 
                                      } 
                                    } catch (NumberFormatException numberFormatException) {
                                      throw a(null);
                                    }  
                                } catch (NumberFormatException numberFormatException) {
                                  throw a(null);
                                }  
                            } catch (NumberFormatException numberFormatException) {
                              throw a(null);
                            }  
                        } catch (NumberFormatException numberFormatException) {
                          throw a(null);
                        }  
                    } catch (NumberFormatException numberFormatException) {
                      throw a(null);
                    }  
                } catch (NumberFormatException numberFormatException) {
                  throw a(null);
                }  
            } catch (NumberFormatException numberFormatException) {
              throw a(null);
            }  
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    throw new NumberFormatException(a(-29716, -22210));
  }
  
  abstract long ZE();
  
  abstract long Zy(CharSequence paramCharSequence, int paramInt1, int paramInt2, boolean paramBoolean1, long paramLong, int paramInt3, boolean paramBoolean2, int paramInt4);
  
  abstract long Zh(CharSequence paramCharSequence, int paramInt1, int paramInt2, boolean paramBoolean1, long paramLong, int paramInt3, boolean paramBoolean2, int paramInt4);
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '%GõÅKÿ½_Ö~,:cÁhÍ¤/+§'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #14
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #10
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 82
    //   39: aload #5
    //   41: swap
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: swap
    //   47: aastore
    //   48: iload_0
    //   49: iload_1
    //   50: iadd
    //   51: dup
    //   52: istore_0
    //   53: iload #4
    //   55: if_icmpge -> 67
    //   58: aload_2
    //   59: iload_0
    //   60: invokevirtual charAt : (I)C
    //   63: istore_1
    //   64: goto -> 22
    //   67: aload #5
    //   69: putstatic com/fasterxml/Zz/Zu.b : [Ljava/lang/String;
    //   72: iconst_2
    //   73: anewarray java/lang/String
    //   76: putstatic com/fasterxml/Zz/Zu.c : [Ljava/lang/String;
    //   79: goto -> 227
    //   82: dup_x2
    //   83: pop
    //   84: invokevirtual toCharArray : ()[C
    //   87: dup_x1
    //   88: arraylength
    //   89: dup_x2
    //   90: pop
    //   91: iconst_0
    //   92: istore #6
    //   94: dup2_x1
    //   95: pop2
    //   96: dup_x2
    //   97: iconst_1
    //   98: if_icmpgt -> 200
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #95
    //   154: goto -> 184
    //   157: bipush #124
    //   159: goto -> 184
    //   162: bipush #107
    //   164: goto -> 184
    //   167: bipush #8
    //   169: goto -> 184
    //   172: bipush #70
    //   174: goto -> 184
    //   177: bipush #100
    //   179: goto -> 184
    //   182: bipush #96
    //   184: ixor
    //   185: ixor
    //   186: i2c
    //   187: castore
    //   188: iinc #6, 1
    //   191: dup
    //   192: ifne -> 200
    //   195: dup2
    //   196: dup_x1
    //   197: goto -> 105
    //   200: dup2_x1
    //   201: pop2
    //   202: dup_x2
    //   203: iload #6
    //   205: if_icmpgt -> 101
    //   208: pop
    //   209: new java/lang/String
    //   212: dup_x1
    //   213: swap
    //   214: invokespecial <init> : ([C)V
    //   217: invokevirtual intern : ()Ljava/lang/String;
    //   220: swap
    //   221: pop
    //   222: swap
    //   223: pop
    //   224: goto -> 39
    //   227: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF8BEC) & 0xFFFF;
    if (c[i] == null) {
      char[] arrayOfChar = b[i].toCharArray();
      switch (arrayOfChar[0] & 0xFF) {
        case 0:
        
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
        case 5:
        
        case 6:
        
        case 7:
        
        case 8:
        
        case 9:
        
        case 10:
        
        case 11:
        
        case 12:
        
        case 13:
        
        case 14:
        
        case 15:
        
        case 16:
        
        case 17:
        
        case 18:
        
        case 19:
        
        case 20:
        
        case 21:
        
        case 22:
        
        case 23:
        
        case 24:
        
        case 25:
        
        case 26:
        
        case 27:
        
        case 28:
        
        case 29:
        
        case 30:
        
        case 31:
        
        case 32:
        
        case 33:
        
        case 34:
        
        case 35:
        
        case 36:
        
        case 37:
        
        case 38:
        
        case 39:
        
        case 40:
        
        case 41:
        
        case 42:
        
        case 43:
        
        case 44:
        
        case 45:
        
        case 46:
        
        case 47:
        
        case 48:
        
        case 49:
        
        case 50:
        
        case 51:
        
        case 52:
        
        case 53:
        
        case 54:
        
        case 55:
        
        case 56:
        
        case 57:
        
        case 58:
        
        case 59:
        
        case 60:
        
        case 61:
        
        case 62:
        
        case 63:
        
        case 64:
        
        case 65:
        
        case 66:
        
        case 67:
        
        case 68:
        
        case 69:
        
        case 70:
        
        case 71:
        
        case 72:
        
        case 73:
        
        case 74:
        
        case 75:
        
        case 76:
        
        case 77:
        
        case 78:
        
        case 79:
        
        case 80:
        
        case 81:
        
        case 82:
        
        case 83:
        
        case 84:
        
        case 85:
        
        case 86:
        
        case 87:
        
        case 88:
        
        case 89:
        
        case 90:
        
        case 91:
        
        case 92:
        
        case 93:
        
        case 94:
        
        case 95:
        
        case 96:
        
        case 97:
        
        case 98:
        
        case 99:
        
        case 100:
        
        case 101:
        
        case 102:
        
        case 103:
        
        case 104:
        
        case 105:
        
        case 106:
        
        case 107:
        
        case 108:
        
        case 109:
        
        case 110:
        
        case 111:
        
        case 112:
        
        case 113:
        
        case 114:
        
        case 115:
        
        case 116:
        
        case 117:
        
        case 118:
        
        case 119:
        
        case 120:
        
        case 121:
        
        case 122:
        
        case 123:
        
        case 124:
        
        case 125:
        
        case 126:
        
        case 127:
        
        case 128:
        
        case 129:
        
        case 130:
        
        case 131:
        
        case 132:
        
        case 133:
        
        case 134:
        
        case 135:
        
        case 136:
        
        case 137:
        
        case 138:
        
        case 139:
        
        case 140:
        
        case 141:
        
        case 142:
        
        case 143:
        
        case 144:
        
        case 145:
        
        case 146:
        
        case 147:
        
        case 148:
        
        case 149:
        
        case 150:
        
        case 151:
        
        case 152:
        
        case 153:
        
        case 154:
        
        case 155:
        
        case 156:
        
        case 157:
        
        case 158:
        
        case 159:
        
        case 160:
        
        case 161:
        
        case 162:
        
        case 163:
        
        case 164:
        
        case 165:
        
        case 166:
        
        case 167:
        
        case 168:
        
        case 169:
        
        case 170:
        
        case 171:
        
        case 172:
        
        case 173:
        
        case 174:
        
        case 175:
        
        case 176:
        
        case 177:
        
        case 178:
        
        case 179:
        
        case 180:
        
        case 181:
        
        case 182:
        
        case 183:
        
        case 184:
        
        case 185:
        
        case 186:
        
        case 187:
        
        case 188:
        
        case 189:
        
        case 190:
        
        case 191:
        
        case 192:
        
        case 193:
        
        case 194:
        
        case 195:
        
        case 196:
        
        case 197:
        
        case 198:
        
        case 199:
        
        case 200:
        
        case 201:
        
        case 202:
        
        case 203:
        
        case 204:
        
        case 205:
        
        case 206:
        
        case 207:
        
        case 208:
        
        case 209:
        
        case 210:
        
        case 211:
        
        case 212:
        
        case 213:
        
        case 214:
        
        case 215:
        
        case 216:
        
        case 217:
        
        case 218:
        
        case 219:
        
        case 220:
        
        case 221:
        
        case 222:
        
        case 223:
        
        case 224:
        
        case 225:
        
        case 226:
        
        case 227:
        
        case 228:
        
        case 229:
        
        case 230:
        
        case 231:
        
        case 232:
        
        case 233:
        
        case 234:
        
        case 235:
        
        case 236:
        
        case 237:
        
        case 238:
        
        case 239:
        
        case 240:
        
        case 241:
        
        case 242:
        
        case 243:
        
        case 244:
        
        case 245:
        
        case 246:
        
        case 247:
        
        case 248:
        
        case 249:
        
        case 250:
        
        case 251:
        
        case 252:
        
        case 253:
        
        case 254:
        
        default:
          break;
      } 
      byte b1 = 93;
      int j = (paramInt2 & 0xFF) - b1;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - b1;
      if (k < 0)
        k += 256; 
      for (byte b2 = 0; b2 < arrayOfChar.length; b2++) {
        int m = b2 % 2;
        if (m == 0) {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b2]) & 0xFF;
        } else {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b2]) & 0xFF;
        } 
      } 
      c[i] = (new String(arrayOfChar)).intern();
    } 
    return c[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zz\Zu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */