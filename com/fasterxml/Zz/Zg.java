package com.fasterxml.Zz;

import java.math.BigDecimal;

final class Zg extends Zo {
  private static final String[] d;
  
  private static final String[] e;
  
  public BigDecimal ZM(CharSequence paramCharSequence, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: invokestatic ZA : ()[Lburp/Zbqc;
    //   3: astore #4
    //   5: aload_1
    //   6: invokeinterface length : ()I
    //   11: istore #5
    //   13: iload #5
    //   15: iload_2
    //   16: iload_3
    //   17: invokestatic ZP : (III)I
    //   20: istore #6
    //   22: iload_3
    //   23: invokestatic ZH : (I)Z
    //   26: ifeq -> 37
    //   29: aload_0
    //   30: aload_1
    //   31: iload_2
    //   32: iload_3
    //   33: invokevirtual Zj : (Ljava/lang/CharSequence;II)Ljava/math/BigDecimal;
    //   36: areturn
    //   37: lconst_0
    //   38: lstore #7
    //   40: iconst_m1
    //   41: istore #10
    //   43: iload_2
    //   44: istore #12
    //   46: aload_1
    //   47: iload #12
    //   49: iload #6
    //   51: invokestatic Ze : (Ljava/lang/CharSequence;II)C
    //   54: istore #13
    //   56: iconst_0
    //   57: istore #14
    //   59: iload #13
    //   61: bipush #45
    //   63: if_icmpne -> 74
    //   66: iconst_1
    //   67: goto -> 75
    //   70: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   73: athrow
    //   74: iconst_0
    //   75: istore #15
    //   77: iload #15
    //   79: ifne -> 96
    //   82: iload #13
    //   84: bipush #43
    //   86: if_icmpne -> 135
    //   89: goto -> 96
    //   92: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   95: athrow
    //   96: aload_1
    //   97: iinc #12, 1
    //   100: iload #12
    //   102: iload #6
    //   104: invokestatic Ze : (Ljava/lang/CharSequence;II)C
    //   107: istore #13
    //   109: iload #13
    //   111: ifne -> 135
    //   114: new java/lang/NumberFormatException
    //   117: dup
    //   118: sipush #-10826
    //   121: sipush #-7069
    //   124: invokestatic b : (II)Ljava/lang/String;
    //   127: invokespecial <init> : (Ljava/lang/String;)V
    //   130: athrow
    //   131: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   134: athrow
    //   135: iload #12
    //   137: istore #9
    //   139: iload #12
    //   141: iload #6
    //   143: if_icmpge -> 293
    //   146: aload_1
    //   147: iload #12
    //   149: invokeinterface charAt : (I)C
    //   154: istore #13
    //   156: iload #13
    //   158: invokestatic ZD : (C)Z
    //   161: ifeq -> 185
    //   164: ldc2_w 10
    //   167: lload #7
    //   169: lmul
    //   170: iload #13
    //   172: i2l
    //   173: ladd
    //   174: ldc2_w 48
    //   177: lsub
    //   178: lstore #7
    //   180: aload #4
    //   182: ifnull -> 285
    //   185: iload #13
    //   187: bipush #46
    //   189: if_icmpne -> 293
    //   192: goto -> 199
    //   195: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   198: athrow
    //   199: iload #14
    //   201: iload #10
    //   203: iflt -> 221
    //   206: goto -> 213
    //   209: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   212: athrow
    //   213: iconst_1
    //   214: goto -> 222
    //   217: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   220: athrow
    //   221: iconst_0
    //   222: ior
    //   223: istore #14
    //   225: iload #12
    //   227: istore #10
    //   229: iload #12
    //   231: iload #6
    //   233: iconst_4
    //   234: isub
    //   235: if_icmpge -> 285
    //   238: aload_1
    //   239: iload #12
    //   241: iconst_1
    //   242: iadd
    //   243: invokestatic ZM : (Ljava/lang/CharSequence;I)I
    //   246: istore #16
    //   248: iload #16
    //   250: ifge -> 265
    //   253: aload #4
    //   255: ifnull -> 285
    //   258: goto -> 265
    //   261: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   264: athrow
    //   265: ldc2_w 10000
    //   268: lload #7
    //   270: lmul
    //   271: iload #16
    //   273: i2l
    //   274: ladd
    //   275: lstore #7
    //   277: iinc #12, 4
    //   280: aload #4
    //   282: ifnull -> 229
    //   285: iinc #12, 1
    //   288: aload #4
    //   290: ifnull -> 139
    //   293: iload #12
    //   295: istore #17
    //   297: iload #10
    //   299: ifge -> 321
    //   302: iload #17
    //   304: iload #9
    //   306: isub
    //   307: istore #16
    //   309: iload #17
    //   311: istore #10
    //   313: lconst_0
    //   314: lstore #18
    //   316: aload #4
    //   318: ifnull -> 340
    //   321: iload #17
    //   323: iload #9
    //   325: isub
    //   326: iconst_1
    //   327: isub
    //   328: istore #16
    //   330: iload #10
    //   332: iload #17
    //   334: isub
    //   335: iconst_1
    //   336: iadd
    //   337: i2l
    //   338: lstore #18
    //   340: lconst_0
    //   341: lstore #20
    //   343: iload #13
    //   345: bipush #32
    //   347: ior
    //   348: bipush #101
    //   350: if_icmpne -> 510
    //   353: iload #12
    //   355: istore #11
    //   357: aload_1
    //   358: iinc #12, 1
    //   361: iload #12
    //   363: iload #6
    //   365: invokestatic Ze : (Ljava/lang/CharSequence;II)C
    //   368: istore #13
    //   370: iload #13
    //   372: bipush #45
    //   374: if_icmpne -> 385
    //   377: iconst_1
    //   378: goto -> 386
    //   381: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   384: athrow
    //   385: iconst_0
    //   386: istore #22
    //   388: iload #22
    //   390: ifne -> 407
    //   393: iload #13
    //   395: bipush #43
    //   397: if_icmpne -> 420
    //   400: goto -> 407
    //   403: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   406: athrow
    //   407: aload_1
    //   408: iinc #12, 1
    //   411: iload #12
    //   413: iload #6
    //   415: invokestatic Ze : (Ljava/lang/CharSequence;II)C
    //   418: istore #13
    //   420: iload #14
    //   422: iload #13
    //   424: invokestatic ZD : (C)Z
    //   427: ifne -> 438
    //   430: iconst_1
    //   431: goto -> 439
    //   434: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   437: athrow
    //   438: iconst_0
    //   439: ior
    //   440: istore #14
    //   442: lload #20
    //   444: ldc2_w 2147483647
    //   447: lcmp
    //   448: ifge -> 467
    //   451: ldc2_w 10
    //   454: lload #20
    //   456: lmul
    //   457: iload #13
    //   459: i2l
    //   460: ladd
    //   461: ldc2_w 48
    //   464: lsub
    //   465: lstore #20
    //   467: aload_1
    //   468: iinc #12, 1
    //   471: iload #12
    //   473: iload #6
    //   475: invokestatic Ze : (Ljava/lang/CharSequence;II)C
    //   478: istore #13
    //   480: iload #13
    //   482: invokestatic ZD : (C)Z
    //   485: ifne -> 442
    //   488: iload #22
    //   490: ifeq -> 498
    //   493: lload #20
    //   495: lneg
    //   496: lstore #20
    //   498: lload #18
    //   500: lload #20
    //   502: ladd
    //   503: lstore #18
    //   505: aload #4
    //   507: ifnull -> 514
    //   510: iload #6
    //   512: istore #11
    //   514: iload #14
    //   516: iload #16
    //   518: ifne -> 529
    //   521: iconst_1
    //   522: goto -> 530
    //   525: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   528: athrow
    //   529: iconst_0
    //   530: ior
    //   531: istore #14
    //   533: iload #14
    //   535: iload #12
    //   537: iload #6
    //   539: iload #16
    //   541: lload #18
    //   543: invokestatic Zi : (ZIIIJ)V
    //   546: iload #16
    //   548: bipush #19
    //   550: if_icmpge -> 591
    //   553: new java/math/BigDecimal
    //   556: dup
    //   557: iload #15
    //   559: ifeq -> 579
    //   562: goto -> 569
    //   565: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   568: athrow
    //   569: lload #7
    //   571: lneg
    //   572: goto -> 581
    //   575: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   578: athrow
    //   579: lload #7
    //   581: invokespecial <init> : (J)V
    //   584: lload #18
    //   586: l2i
    //   587: invokevirtual scaleByPowerOfTen : (I)Ljava/math/BigDecimal;
    //   590: areturn
    //   591: aload_0
    //   592: aload_1
    //   593: iload #9
    //   595: iload #10
    //   597: iload #10
    //   599: iconst_1
    //   600: iadd
    //   601: iload #11
    //   603: iload #15
    //   605: lload #18
    //   607: l2i
    //   608: invokevirtual Zq : (Ljava/lang/CharSequence;IIIIZI)Ljava/math/BigDecimal;
    //   611: areturn
    //   612: astore #5
    //   614: new java/lang/NumberFormatException
    //   617: dup
    //   618: sipush #-10828
    //   621: sipush #25536
    //   624: invokestatic b : (II)Ljava/lang/String;
    //   627: invokespecial <init> : (Ljava/lang/String;)V
    //   630: astore #6
    //   632: aload #6
    //   634: aload #5
    //   636: invokevirtual initCause : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   639: pop
    //   640: aload #6
    //   642: athrow
    // Exception table:
    //   from	to	target	type
    //   5	36	612	java/lang/ArithmeticException
    //   37	590	612	java/lang/ArithmeticException
    //   59	70	70	java/lang/ArithmeticException
    //   77	89	92	java/lang/ArithmeticException
    //   109	131	131	java/lang/ArithmeticException
    //   180	192	195	java/lang/ArithmeticException
    //   185	206	209	java/lang/ArithmeticException
    //   199	217	217	java/lang/ArithmeticException
    //   248	258	261	java/lang/ArithmeticException
    //   370	381	381	java/lang/ArithmeticException
    //   388	400	403	java/lang/ArithmeticException
    //   420	434	434	java/lang/ArithmeticException
    //   514	525	525	java/lang/ArithmeticException
    //   533	562	565	java/lang/ArithmeticException
    //   553	575	575	java/lang/ArithmeticException
    //   591	611	612	java/lang/ArithmeticException
  }
  
  BigDecimal Zj(CharSequence paramCharSequence, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: iconst_m1
    //   1: istore #7
    //   3: invokestatic ZA : ()[Lburp/Zbqc;
    //   6: iconst_m1
    //   7: istore #8
    //   9: astore #4
    //   11: iload_2
    //   12: iload_3
    //   13: iadd
    //   14: istore #10
    //   16: iload_2
    //   17: istore #11
    //   19: aload_1
    //   20: iload #11
    //   22: iload #10
    //   24: invokestatic Ze : (Ljava/lang/CharSequence;II)C
    //   27: istore #12
    //   29: iconst_0
    //   30: istore #13
    //   32: iload #12
    //   34: bipush #45
    //   36: if_icmpne -> 47
    //   39: iconst_1
    //   40: goto -> 48
    //   43: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   46: athrow
    //   47: iconst_0
    //   48: istore #14
    //   50: iload #14
    //   52: ifne -> 69
    //   55: iload #12
    //   57: bipush #43
    //   59: if_icmpne -> 108
    //   62: goto -> 69
    //   65: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   68: athrow
    //   69: aload_1
    //   70: iinc #11, 1
    //   73: iload #11
    //   75: iload #10
    //   77: invokestatic Ze : (Ljava/lang/CharSequence;II)C
    //   80: istore #12
    //   82: iload #12
    //   84: ifne -> 108
    //   87: new java/lang/NumberFormatException
    //   90: dup
    //   91: sipush #-10827
    //   94: sipush #-31828
    //   97: invokestatic b : (II)Ljava/lang/String;
    //   100: invokespecial <init> : (Ljava/lang/String;)V
    //   103: athrow
    //   104: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   107: athrow
    //   108: iload #11
    //   110: istore #5
    //   112: iload #11
    //   114: iload #10
    //   116: bipush #8
    //   118: isub
    //   119: if_icmpge -> 146
    //   122: aload_1
    //   123: iload #11
    //   125: invokestatic ZL : (Ljava/lang/CharSequence;I)Z
    //   128: ifeq -> 146
    //   131: iinc #11, 8
    //   134: aload #4
    //   136: ifnull -> 112
    //   139: goto -> 146
    //   142: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   145: athrow
    //   146: iload #11
    //   148: iload #10
    //   150: if_icmpge -> 181
    //   153: aload_1
    //   154: iload #11
    //   156: invokeinterface charAt : (I)C
    //   161: bipush #48
    //   163: if_icmpne -> 181
    //   166: iinc #11, 1
    //   169: aload #4
    //   171: ifnull -> 146
    //   174: goto -> 181
    //   177: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   180: athrow
    //   181: iload #11
    //   183: istore #6
    //   185: iload #11
    //   187: iload #10
    //   189: bipush #8
    //   191: isub
    //   192: if_icmpge -> 219
    //   195: aload_1
    //   196: iload #11
    //   198: invokestatic ZX : (Ljava/lang/CharSequence;I)Z
    //   201: ifeq -> 219
    //   204: iinc #11, 8
    //   207: aload #4
    //   209: ifnull -> 185
    //   212: goto -> 219
    //   215: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   218: athrow
    //   219: iload #11
    //   221: iload #10
    //   223: if_icmpge -> 258
    //   226: aload_1
    //   227: iload #11
    //   229: invokeinterface charAt : (I)C
    //   234: dup
    //   235: istore #12
    //   237: invokestatic ZD : (C)Z
    //   240: ifeq -> 258
    //   243: iinc #11, 1
    //   246: aload #4
    //   248: ifnull -> 219
    //   251: goto -> 258
    //   254: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   257: athrow
    //   258: iload #12
    //   260: bipush #46
    //   262: if_icmpne -> 418
    //   265: iload #11
    //   267: iinc #11, 1
    //   270: istore #7
    //   272: iload #11
    //   274: iload #10
    //   276: bipush #8
    //   278: isub
    //   279: if_icmpge -> 306
    //   282: aload_1
    //   283: iload #11
    //   285: invokestatic ZL : (Ljava/lang/CharSequence;I)Z
    //   288: ifeq -> 306
    //   291: iinc #11, 8
    //   294: aload #4
    //   296: ifnull -> 272
    //   299: goto -> 306
    //   302: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   305: athrow
    //   306: iload #11
    //   308: iload #10
    //   310: if_icmpge -> 341
    //   313: aload_1
    //   314: iload #11
    //   316: invokeinterface charAt : (I)C
    //   321: bipush #48
    //   323: if_icmpne -> 341
    //   326: iinc #11, 1
    //   329: aload #4
    //   331: ifnull -> 306
    //   334: goto -> 341
    //   337: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   340: athrow
    //   341: iload #11
    //   343: istore #8
    //   345: iload #11
    //   347: iload #10
    //   349: bipush #8
    //   351: isub
    //   352: if_icmpge -> 379
    //   355: aload_1
    //   356: iload #11
    //   358: invokestatic ZX : (Ljava/lang/CharSequence;I)Z
    //   361: ifeq -> 379
    //   364: iinc #11, 8
    //   367: aload #4
    //   369: ifnull -> 345
    //   372: goto -> 379
    //   375: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   378: athrow
    //   379: iload #11
    //   381: iload #10
    //   383: if_icmpge -> 418
    //   386: aload_1
    //   387: iload #11
    //   389: invokeinterface charAt : (I)C
    //   394: dup
    //   395: istore #12
    //   397: invokestatic ZD : (C)Z
    //   400: ifeq -> 418
    //   403: iinc #11, 1
    //   406: aload #4
    //   408: ifnull -> 379
    //   411: goto -> 418
    //   414: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   417: athrow
    //   418: iload #11
    //   420: istore #16
    //   422: iload #7
    //   424: ifge -> 450
    //   427: iload #16
    //   429: iload #6
    //   431: isub
    //   432: istore #15
    //   434: iload #16
    //   436: istore #7
    //   438: iload #16
    //   440: istore #8
    //   442: lconst_0
    //   443: lstore #17
    //   445: aload #4
    //   447: ifnull -> 495
    //   450: iload #6
    //   452: iload #7
    //   454: if_icmpne -> 476
    //   457: goto -> 464
    //   460: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   463: athrow
    //   464: iload #16
    //   466: iload #8
    //   468: isub
    //   469: goto -> 483
    //   472: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   475: athrow
    //   476: iload #16
    //   478: iload #6
    //   480: isub
    //   481: iconst_1
    //   482: isub
    //   483: istore #15
    //   485: iload #7
    //   487: iload #16
    //   489: isub
    //   490: iconst_1
    //   491: iadd
    //   492: i2l
    //   493: lstore #17
    //   495: lconst_0
    //   496: lstore #19
    //   498: iload #12
    //   500: bipush #32
    //   502: ior
    //   503: bipush #101
    //   505: if_icmpne -> 662
    //   508: iload #11
    //   510: istore #9
    //   512: aload_1
    //   513: iinc #11, 1
    //   516: iload #11
    //   518: iload #10
    //   520: invokestatic Ze : (Ljava/lang/CharSequence;II)C
    //   523: istore #12
    //   525: iload #12
    //   527: bipush #45
    //   529: if_icmpne -> 540
    //   532: iconst_1
    //   533: goto -> 541
    //   536: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   539: athrow
    //   540: iconst_0
    //   541: istore #21
    //   543: iload #21
    //   545: ifne -> 562
    //   548: iload #12
    //   550: bipush #43
    //   552: if_icmpne -> 575
    //   555: goto -> 562
    //   558: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   561: athrow
    //   562: aload_1
    //   563: iinc #11, 1
    //   566: iload #11
    //   568: iload #10
    //   570: invokestatic Ze : (Ljava/lang/CharSequence;II)C
    //   573: istore #12
    //   575: iload #12
    //   577: invokestatic ZD : (C)Z
    //   580: ifne -> 591
    //   583: iconst_1
    //   584: goto -> 592
    //   587: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   590: athrow
    //   591: iconst_0
    //   592: istore #13
    //   594: lload #19
    //   596: ldc2_w 2147483647
    //   599: lcmp
    //   600: ifge -> 619
    //   603: ldc2_w 10
    //   606: lload #19
    //   608: lmul
    //   609: iload #12
    //   611: i2l
    //   612: ladd
    //   613: ldc2_w 48
    //   616: lsub
    //   617: lstore #19
    //   619: aload_1
    //   620: iinc #11, 1
    //   623: iload #11
    //   625: iload #10
    //   627: invokestatic Ze : (Ljava/lang/CharSequence;II)C
    //   630: istore #12
    //   632: iload #12
    //   634: invokestatic ZD : (C)Z
    //   637: ifne -> 594
    //   640: iload #21
    //   642: ifeq -> 650
    //   645: lload #19
    //   647: lneg
    //   648: lstore #19
    //   650: lload #17
    //   652: lload #19
    //   654: ladd
    //   655: lstore #17
    //   657: aload #4
    //   659: ifnull -> 666
    //   662: iload #10
    //   664: istore #9
    //   666: iload #13
    //   668: iload #5
    //   670: iload #7
    //   672: if_icmpne -> 697
    //   675: iload #7
    //   677: iload #9
    //   679: if_icmpne -> 697
    //   682: goto -> 689
    //   685: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   688: athrow
    //   689: iconst_1
    //   690: goto -> 698
    //   693: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   696: athrow
    //   697: iconst_0
    //   698: ior
    //   699: istore #13
    //   701: iload #13
    //   703: iload #11
    //   705: iload #10
    //   707: iload #15
    //   709: lload #17
    //   711: invokestatic Zi : (ZIIIJ)V
    //   714: aload_0
    //   715: aload_1
    //   716: iload #6
    //   718: iload #7
    //   720: iload #8
    //   722: iload #9
    //   724: iload #14
    //   726: lload #17
    //   728: l2i
    //   729: invokevirtual Zq : (Ljava/lang/CharSequence;IIIIZI)Ljava/math/BigDecimal;
    //   732: invokestatic Zwu : ()[Lburp/Zbqc;
    //   735: ifnonnull -> 752
    //   738: iconst_3
    //   739: anewarray burp/Zbqc
    //   742: invokestatic Zd : ([Lburp/Zbqc;)V
    //   745: goto -> 752
    //   748: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   751: athrow
    //   752: areturn
    // Exception table:
    //   from	to	target	type
    //   32	43	43	java/lang/ArithmeticException
    //   50	62	65	java/lang/ArithmeticException
    //   82	104	104	java/lang/ArithmeticException
    //   122	139	142	java/lang/ArithmeticException
    //   153	174	177	java/lang/ArithmeticException
    //   195	212	215	java/lang/ArithmeticException
    //   237	251	254	java/lang/ArithmeticException
    //   282	299	302	java/lang/ArithmeticException
    //   313	334	337	java/lang/ArithmeticException
    //   355	372	375	java/lang/ArithmeticException
    //   397	411	414	java/lang/ArithmeticException
    //   445	457	460	java/lang/ArithmeticException
    //   450	472	472	java/lang/ArithmeticException
    //   525	536	536	java/lang/ArithmeticException
    //   543	555	558	java/lang/ArithmeticException
    //   575	587	587	java/lang/ArithmeticException
    //   666	682	685	java/lang/ArithmeticException
    //   675	693	693	java/lang/ArithmeticException
    //   701	745	748	java/lang/ArithmeticException
  }
  
  BigDecimal Zq(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean, int paramInt5) {
    // Byte code:
    //   0: iload #5
    //   2: iload_3
    //   3: isub
    //   4: iconst_1
    //   5: isub
    //   6: istore #9
    //   8: invokestatic ZA : ()[Lburp/Zbqc;
    //   11: iload #5
    //   13: iload #4
    //   15: isub
    //   16: istore #10
    //   18: iload_3
    //   19: iload_2
    //   20: isub
    //   21: istore #11
    //   23: astore #8
    //   25: aconst_null
    //   26: astore #12
    //   28: iload #11
    //   30: ifle -> 89
    //   33: iload #11
    //   35: sipush #400
    //   38: if_icmple -> 76
    //   41: goto -> 48
    //   44: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   47: athrow
    //   48: invokestatic Zh : ()Ljava/util/NavigableMap;
    //   51: astore #12
    //   53: aload #12
    //   55: iload_2
    //   56: iload_3
    //   57: invokestatic Zf : (Ljava/util/NavigableMap;II)V
    //   60: aload_1
    //   61: iload_2
    //   62: iload_3
    //   63: aload #12
    //   65: sipush #400
    //   68: invokestatic Zc : (Ljava/lang/CharSequence;IILjava/util/Map;I)Ljava/math/BigInteger;
    //   71: astore #14
    //   73: goto -> 94
    //   76: aload_1
    //   77: iload_2
    //   78: iload_3
    //   79: invokestatic Zh : (Ljava/lang/CharSequence;II)Ljava/math/BigInteger;
    //   82: astore #14
    //   84: aload #8
    //   86: ifnull -> 94
    //   89: getstatic java/math/BigInteger.ZERO : Ljava/math/BigInteger;
    //   92: astore #14
    //   94: iload #9
    //   96: ifle -> 215
    //   99: iload #10
    //   101: sipush #400
    //   104: if_icmple -> 160
    //   107: goto -> 114
    //   110: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   113: athrow
    //   114: aload #12
    //   116: ifnonnull -> 131
    //   119: goto -> 126
    //   122: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   125: athrow
    //   126: invokestatic Zh : ()Ljava/util/NavigableMap;
    //   129: astore #12
    //   131: aload #12
    //   133: iload #4
    //   135: iload #5
    //   137: invokestatic Zf : (Ljava/util/NavigableMap;II)V
    //   140: aload_1
    //   141: iload #4
    //   143: iload #5
    //   145: aload #12
    //   147: sipush #400
    //   150: invokestatic Zc : (Ljava/lang/CharSequence;IILjava/util/Map;I)Ljava/math/BigInteger;
    //   153: astore #15
    //   155: aload #8
    //   157: ifnull -> 170
    //   160: aload_1
    //   161: iload #4
    //   163: iload #5
    //   165: invokestatic Zh : (Ljava/lang/CharSequence;II)Ljava/math/BigInteger;
    //   168: astore #15
    //   170: aload #14
    //   172: invokevirtual signum : ()I
    //   175: ifne -> 187
    //   178: aload #15
    //   180: astore #13
    //   182: aload #8
    //   184: ifnull -> 210
    //   187: aload #12
    //   189: iload #9
    //   191: invokestatic Ze : (Ljava/util/NavigableMap;I)Ljava/math/BigInteger;
    //   194: astore #16
    //   196: aload #14
    //   198: aload #16
    //   200: invokestatic ZT : (Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   203: aload #15
    //   205: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   208: astore #13
    //   210: aload #8
    //   212: ifnull -> 219
    //   215: aload #14
    //   217: astore #13
    //   219: new java/math/BigDecimal
    //   222: dup
    //   223: iload #6
    //   225: ifeq -> 240
    //   228: aload #13
    //   230: invokevirtual negate : ()Ljava/math/BigInteger;
    //   233: goto -> 242
    //   236: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   239: athrow
    //   240: aload #13
    //   242: iload #7
    //   244: ineg
    //   245: invokespecial <init> : (Ljava/math/BigInteger;I)V
    //   248: areturn
    // Exception table:
    //   from	to	target	type
    //   28	41	44	java/lang/ArithmeticException
    //   94	107	110	java/lang/ArithmeticException
    //   99	119	122	java/lang/ArithmeticException
    //   219	236	236	java/lang/ArithmeticException
  }
  
  private static ArithmeticException a(ArithmeticException paramArithmeticException) {
    return paramArithmeticException;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'õfF)Ë|£|ôUêÝ½A¶òÖÛ°3JãdÙLok%øFNÙå8'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #20
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #28
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
    //   69: putstatic com/fasterxml/Zz/Zg.d : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic com/fasterxml/Zz/Zg.e : [Ljava/lang/String;
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
    //   152: bipush #52
    //   154: goto -> 184
    //   157: bipush #37
    //   159: goto -> 184
    //   162: bipush #21
    //   164: goto -> 184
    //   167: bipush #89
    //   169: goto -> 184
    //   172: bipush #51
    //   174: goto -> 184
    //   177: bipush #117
    //   179: goto -> 184
    //   182: bipush #86
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
  
  private static String b(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFD5B4) & 0xFFFF;
    if (e[i] == null) {
      char[] arrayOfChar = d[i].toCharArray();
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
      char c = '©';
      int j = (paramInt2 & 0xFF) - c;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - c;
      if (k < 0)
        k += 256; 
      for (byte b = 0; b < arrayOfChar.length; b++) {
        int m = b % 2;
        if (m == 0) {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b]) & 0xFF;
        } else {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b]) & 0xFF;
        } 
      } 
      e[i] = (new String(arrayOfChar)).intern();
    } 
    return e[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zz\Zg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */