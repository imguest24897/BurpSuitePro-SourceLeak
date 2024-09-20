package com.fasterxml.Zz;

import java.math.BigDecimal;

final class Zz extends Zo {
  private static final String[] d;
  
  private static final String[] e;
  
  public BigDecimal ZH(char[] paramArrayOfchar, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: invokestatic ZA : ()[Lburp/Zbqc;
    //   3: astore #4
    //   5: aload_1
    //   6: arraylength
    //   7: iload_2
    //   8: iload_3
    //   9: invokestatic ZP : (III)I
    //   12: istore #5
    //   14: iload_3
    //   15: invokestatic ZH : (I)Z
    //   18: ifeq -> 29
    //   21: aload_0
    //   22: aload_1
    //   23: iload_2
    //   24: iload_3
    //   25: invokevirtual Zm : ([CII)Ljava/math/BigDecimal;
    //   28: areturn
    //   29: lconst_0
    //   30: lstore #6
    //   32: iconst_m1
    //   33: istore #9
    //   35: iload_2
    //   36: istore #11
    //   38: aload_1
    //   39: iload #11
    //   41: iload #5
    //   43: invokestatic ZM : ([CII)C
    //   46: istore #12
    //   48: iconst_0
    //   49: istore #13
    //   51: iload #12
    //   53: bipush #45
    //   55: if_icmpne -> 66
    //   58: iconst_1
    //   59: goto -> 67
    //   62: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   65: athrow
    //   66: iconst_0
    //   67: istore #14
    //   69: iload #14
    //   71: ifne -> 88
    //   74: iload #12
    //   76: bipush #43
    //   78: if_icmpne -> 127
    //   81: goto -> 88
    //   84: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   87: athrow
    //   88: aload_1
    //   89: iinc #11, 1
    //   92: iload #11
    //   94: iload #5
    //   96: invokestatic ZM : ([CII)C
    //   99: istore #12
    //   101: iload #12
    //   103: ifne -> 127
    //   106: new java/lang/NumberFormatException
    //   109: dup
    //   110: sipush #11497
    //   113: sipush #-16506
    //   116: invokestatic b : (II)Ljava/lang/String;
    //   119: invokespecial <init> : (Ljava/lang/String;)V
    //   122: athrow
    //   123: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   126: athrow
    //   127: iload #11
    //   129: istore #8
    //   131: iload #11
    //   133: iload #5
    //   135: if_icmpge -> 281
    //   138: aload_1
    //   139: iload #11
    //   141: caload
    //   142: istore #12
    //   144: iload #12
    //   146: invokestatic ZD : (C)Z
    //   149: ifeq -> 173
    //   152: ldc2_w 10
    //   155: lload #6
    //   157: lmul
    //   158: iload #12
    //   160: i2l
    //   161: ladd
    //   162: ldc2_w 48
    //   165: lsub
    //   166: lstore #6
    //   168: aload #4
    //   170: ifnull -> 273
    //   173: iload #12
    //   175: bipush #46
    //   177: if_icmpne -> 281
    //   180: goto -> 187
    //   183: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   186: athrow
    //   187: iload #13
    //   189: iload #9
    //   191: iflt -> 209
    //   194: goto -> 201
    //   197: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   200: athrow
    //   201: iconst_1
    //   202: goto -> 210
    //   205: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   208: athrow
    //   209: iconst_0
    //   210: ior
    //   211: istore #13
    //   213: iload #11
    //   215: istore #9
    //   217: iload #11
    //   219: iload #5
    //   221: iconst_4
    //   222: isub
    //   223: if_icmpge -> 273
    //   226: aload_1
    //   227: iload #11
    //   229: iconst_1
    //   230: iadd
    //   231: invokestatic Zt : ([CI)I
    //   234: istore #15
    //   236: iload #15
    //   238: ifge -> 253
    //   241: aload #4
    //   243: ifnull -> 273
    //   246: goto -> 253
    //   249: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   252: athrow
    //   253: ldc2_w 10000
    //   256: lload #6
    //   258: lmul
    //   259: iload #15
    //   261: i2l
    //   262: ladd
    //   263: lstore #6
    //   265: iinc #11, 4
    //   268: aload #4
    //   270: ifnull -> 217
    //   273: iinc #11, 1
    //   276: aload #4
    //   278: ifnull -> 131
    //   281: iload #11
    //   283: istore #16
    //   285: iload #9
    //   287: ifge -> 309
    //   290: iload #16
    //   292: iload #8
    //   294: isub
    //   295: istore #15
    //   297: iload #16
    //   299: istore #9
    //   301: lconst_0
    //   302: lstore #17
    //   304: aload #4
    //   306: ifnull -> 328
    //   309: iload #16
    //   311: iload #8
    //   313: isub
    //   314: iconst_1
    //   315: isub
    //   316: istore #15
    //   318: iload #9
    //   320: iload #16
    //   322: isub
    //   323: iconst_1
    //   324: iadd
    //   325: i2l
    //   326: lstore #17
    //   328: lconst_0
    //   329: lstore #19
    //   331: iload #12
    //   333: bipush #32
    //   335: ior
    //   336: bipush #101
    //   338: if_icmpne -> 498
    //   341: iload #11
    //   343: istore #10
    //   345: aload_1
    //   346: iinc #11, 1
    //   349: iload #11
    //   351: iload #5
    //   353: invokestatic ZM : ([CII)C
    //   356: istore #12
    //   358: iload #12
    //   360: bipush #45
    //   362: if_icmpne -> 373
    //   365: iconst_1
    //   366: goto -> 374
    //   369: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   372: athrow
    //   373: iconst_0
    //   374: istore #21
    //   376: iload #21
    //   378: ifne -> 395
    //   381: iload #12
    //   383: bipush #43
    //   385: if_icmpne -> 408
    //   388: goto -> 395
    //   391: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   394: athrow
    //   395: aload_1
    //   396: iinc #11, 1
    //   399: iload #11
    //   401: iload #5
    //   403: invokestatic ZM : ([CII)C
    //   406: istore #12
    //   408: iload #13
    //   410: iload #12
    //   412: invokestatic ZD : (C)Z
    //   415: ifne -> 426
    //   418: iconst_1
    //   419: goto -> 427
    //   422: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   425: athrow
    //   426: iconst_0
    //   427: ior
    //   428: istore #13
    //   430: lload #19
    //   432: ldc2_w 2147483647
    //   435: lcmp
    //   436: ifge -> 455
    //   439: ldc2_w 10
    //   442: lload #19
    //   444: lmul
    //   445: iload #12
    //   447: i2l
    //   448: ladd
    //   449: ldc2_w 48
    //   452: lsub
    //   453: lstore #19
    //   455: aload_1
    //   456: iinc #11, 1
    //   459: iload #11
    //   461: iload #5
    //   463: invokestatic ZM : ([CII)C
    //   466: istore #12
    //   468: iload #12
    //   470: invokestatic ZD : (C)Z
    //   473: ifne -> 430
    //   476: iload #21
    //   478: ifeq -> 486
    //   481: lload #19
    //   483: lneg
    //   484: lstore #19
    //   486: lload #17
    //   488: lload #19
    //   490: ladd
    //   491: lstore #17
    //   493: aload #4
    //   495: ifnull -> 502
    //   498: iload #5
    //   500: istore #10
    //   502: iload #13
    //   504: iload #15
    //   506: ifne -> 517
    //   509: iconst_1
    //   510: goto -> 518
    //   513: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   516: athrow
    //   517: iconst_0
    //   518: ior
    //   519: istore #13
    //   521: iload #13
    //   523: iload #11
    //   525: iload #5
    //   527: iload #15
    //   529: lload #17
    //   531: invokestatic Zi : (ZIIIJ)V
    //   534: iload #15
    //   536: bipush #19
    //   538: if_icmpge -> 579
    //   541: new java/math/BigDecimal
    //   544: dup
    //   545: iload #14
    //   547: ifeq -> 567
    //   550: goto -> 557
    //   553: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   556: athrow
    //   557: lload #6
    //   559: lneg
    //   560: goto -> 569
    //   563: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   566: athrow
    //   567: lload #6
    //   569: invokespecial <init> : (J)V
    //   572: lload #17
    //   574: l2i
    //   575: invokevirtual scaleByPowerOfTen : (I)Ljava/math/BigDecimal;
    //   578: areturn
    //   579: aload_0
    //   580: aload_1
    //   581: iload #8
    //   583: iload #9
    //   585: iload #9
    //   587: iconst_1
    //   588: iadd
    //   589: iload #10
    //   591: iload #14
    //   593: lload #17
    //   595: l2i
    //   596: invokevirtual ZQ : ([CIIIIZI)Ljava/math/BigDecimal;
    //   599: areturn
    //   600: astore #5
    //   602: new java/lang/NumberFormatException
    //   605: dup
    //   606: sipush #11496
    //   609: sipush #13407
    //   612: invokestatic b : (II)Ljava/lang/String;
    //   615: invokespecial <init> : (Ljava/lang/String;)V
    //   618: astore #6
    //   620: aload #6
    //   622: aload #5
    //   624: invokevirtual initCause : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   627: pop
    //   628: aload #6
    //   630: athrow
    // Exception table:
    //   from	to	target	type
    //   5	28	600	java/lang/ArithmeticException
    //   29	578	600	java/lang/ArithmeticException
    //   51	62	62	java/lang/ArithmeticException
    //   69	81	84	java/lang/ArithmeticException
    //   101	123	123	java/lang/ArithmeticException
    //   168	180	183	java/lang/ArithmeticException
    //   173	194	197	java/lang/ArithmeticException
    //   187	205	205	java/lang/ArithmeticException
    //   236	246	249	java/lang/ArithmeticException
    //   358	369	369	java/lang/ArithmeticException
    //   376	388	391	java/lang/ArithmeticException
    //   408	422	422	java/lang/ArithmeticException
    //   502	513	513	java/lang/ArithmeticException
    //   521	550	553	java/lang/ArithmeticException
    //   541	563	563	java/lang/ArithmeticException
    //   579	599	600	java/lang/ArithmeticException
  }
  
  BigDecimal Zm(char[] paramArrayOfchar, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: iconst_m1
    //   1: istore #7
    //   3: iconst_m1
    //   4: istore #8
    //   6: iload_2
    //   7: iload_3
    //   8: iadd
    //   9: istore #10
    //   11: invokestatic ZA : ()[Lburp/Zbqc;
    //   14: iload_2
    //   15: istore #11
    //   17: astore #4
    //   19: aload_1
    //   20: iload #11
    //   22: iload #10
    //   24: invokestatic ZM : ([CII)C
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
    //   77: invokestatic ZM : ([CII)C
    //   80: istore #12
    //   82: iload #12
    //   84: ifne -> 108
    //   87: new java/lang/NumberFormatException
    //   90: dup
    //   91: sipush #11498
    //   94: sipush #-2608
    //   97: invokestatic b : (II)Ljava/lang/String;
    //   100: invokespecial <init> : (Ljava/lang/String;)V
    //   103: athrow
    //   104: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   107: athrow
    //   108: iload #11
    //   110: istore #6
    //   112: iload #10
    //   114: bipush #8
    //   116: isub
    //   117: ldc 1073741824
    //   119: invokestatic min : (II)I
    //   122: istore #15
    //   124: iload #11
    //   126: iload #15
    //   128: if_icmpge -> 162
    //   131: aload_1
    //   132: iload #11
    //   134: invokestatic ZB : ([CI)Z
    //   137: ifeq -> 162
    //   140: iinc #11, 8
    //   143: aload #4
    //   145: ifnull -> 124
    //   148: goto -> 155
    //   151: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   154: athrow
    //   155: iconst_5
    //   156: anewarray burp/Zbqc
    //   159: invokestatic Zr : ([Lburp/Zbqc;)V
    //   162: iload #11
    //   164: iload #10
    //   166: if_icmpge -> 193
    //   169: aload_1
    //   170: iload #11
    //   172: caload
    //   173: bipush #48
    //   175: if_icmpne -> 193
    //   178: iinc #11, 1
    //   181: aload #4
    //   183: ifnull -> 162
    //   186: goto -> 193
    //   189: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   192: athrow
    //   193: iload #11
    //   195: istore #5
    //   197: iload #11
    //   199: iload #15
    //   201: if_icmpge -> 228
    //   204: aload_1
    //   205: iload #11
    //   207: invokestatic Zz : ([CI)Z
    //   210: ifeq -> 228
    //   213: iinc #11, 8
    //   216: aload #4
    //   218: ifnull -> 197
    //   221: goto -> 228
    //   224: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   227: athrow
    //   228: iload #11
    //   230: iload #10
    //   232: if_icmpge -> 263
    //   235: aload_1
    //   236: iload #11
    //   238: caload
    //   239: dup
    //   240: istore #12
    //   242: invokestatic ZD : (C)Z
    //   245: ifeq -> 263
    //   248: iinc #11, 1
    //   251: aload #4
    //   253: ifnull -> 228
    //   256: goto -> 263
    //   259: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   262: athrow
    //   263: iload #12
    //   265: bipush #46
    //   267: if_icmpne -> 409
    //   270: iload #11
    //   272: iinc #11, 1
    //   275: istore #8
    //   277: iload #11
    //   279: iload #15
    //   281: if_icmpge -> 308
    //   284: aload_1
    //   285: iload #11
    //   287: invokestatic ZB : ([CI)Z
    //   290: ifeq -> 308
    //   293: iinc #11, 8
    //   296: aload #4
    //   298: ifnull -> 277
    //   301: goto -> 308
    //   304: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   307: athrow
    //   308: iload #11
    //   310: iload #10
    //   312: if_icmpge -> 339
    //   315: aload_1
    //   316: iload #11
    //   318: caload
    //   319: bipush #48
    //   321: if_icmpne -> 339
    //   324: iinc #11, 1
    //   327: aload #4
    //   329: ifnull -> 308
    //   332: goto -> 339
    //   335: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   338: athrow
    //   339: iload #11
    //   341: istore #7
    //   343: iload #11
    //   345: iload #15
    //   347: if_icmpge -> 374
    //   350: aload_1
    //   351: iload #11
    //   353: invokestatic Zz : ([CI)Z
    //   356: ifeq -> 374
    //   359: iinc #11, 8
    //   362: aload #4
    //   364: ifnull -> 343
    //   367: goto -> 374
    //   370: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   373: athrow
    //   374: iload #11
    //   376: iload #10
    //   378: if_icmpge -> 409
    //   381: aload_1
    //   382: iload #11
    //   384: caload
    //   385: dup
    //   386: istore #12
    //   388: invokestatic ZD : (C)Z
    //   391: ifeq -> 409
    //   394: iinc #11, 1
    //   397: aload #4
    //   399: ifnull -> 374
    //   402: goto -> 409
    //   405: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   408: athrow
    //   409: iload #11
    //   411: istore #17
    //   413: iload #8
    //   415: ifge -> 441
    //   418: iload #17
    //   420: iload #5
    //   422: isub
    //   423: istore #16
    //   425: iload #17
    //   427: istore #8
    //   429: iload #17
    //   431: istore #7
    //   433: lconst_0
    //   434: lstore #18
    //   436: aload #4
    //   438: ifnull -> 486
    //   441: iload #5
    //   443: iload #8
    //   445: if_icmpne -> 467
    //   448: goto -> 455
    //   451: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   454: athrow
    //   455: iload #17
    //   457: iload #7
    //   459: isub
    //   460: goto -> 474
    //   463: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   466: athrow
    //   467: iload #17
    //   469: iload #5
    //   471: isub
    //   472: iconst_1
    //   473: isub
    //   474: istore #16
    //   476: iload #8
    //   478: iload #17
    //   480: isub
    //   481: iconst_1
    //   482: iadd
    //   483: i2l
    //   484: lstore #18
    //   486: lconst_0
    //   487: lstore #20
    //   489: iload #12
    //   491: bipush #32
    //   493: ior
    //   494: bipush #101
    //   496: if_icmpne -> 653
    //   499: iload #11
    //   501: istore #9
    //   503: aload_1
    //   504: iinc #11, 1
    //   507: iload #11
    //   509: iload #10
    //   511: invokestatic ZM : ([CII)C
    //   514: istore #12
    //   516: iload #12
    //   518: bipush #45
    //   520: if_icmpne -> 531
    //   523: iconst_1
    //   524: goto -> 532
    //   527: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   530: athrow
    //   531: iconst_0
    //   532: istore #22
    //   534: iload #22
    //   536: ifne -> 553
    //   539: iload #12
    //   541: bipush #43
    //   543: if_icmpne -> 566
    //   546: goto -> 553
    //   549: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   552: athrow
    //   553: aload_1
    //   554: iinc #11, 1
    //   557: iload #11
    //   559: iload #10
    //   561: invokestatic ZM : ([CII)C
    //   564: istore #12
    //   566: iload #12
    //   568: invokestatic ZD : (C)Z
    //   571: ifne -> 582
    //   574: iconst_1
    //   575: goto -> 583
    //   578: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   581: athrow
    //   582: iconst_0
    //   583: istore #13
    //   585: lload #20
    //   587: ldc2_w 2147483647
    //   590: lcmp
    //   591: ifge -> 610
    //   594: ldc2_w 10
    //   597: lload #20
    //   599: lmul
    //   600: iload #12
    //   602: i2l
    //   603: ladd
    //   604: ldc2_w 48
    //   607: lsub
    //   608: lstore #20
    //   610: aload_1
    //   611: iinc #11, 1
    //   614: iload #11
    //   616: iload #10
    //   618: invokestatic ZM : ([CII)C
    //   621: istore #12
    //   623: iload #12
    //   625: invokestatic ZD : (C)Z
    //   628: ifne -> 585
    //   631: iload #22
    //   633: ifeq -> 641
    //   636: lload #20
    //   638: lneg
    //   639: lstore #20
    //   641: lload #18
    //   643: lload #20
    //   645: ladd
    //   646: lstore #18
    //   648: aload #4
    //   650: ifnull -> 657
    //   653: iload #10
    //   655: istore #9
    //   657: iload #13
    //   659: iload #6
    //   661: iload #8
    //   663: if_icmpne -> 688
    //   666: iload #8
    //   668: iload #9
    //   670: if_icmpne -> 688
    //   673: goto -> 680
    //   676: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   679: athrow
    //   680: iconst_1
    //   681: goto -> 689
    //   684: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   687: athrow
    //   688: iconst_0
    //   689: ior
    //   690: istore #13
    //   692: iload #13
    //   694: iload #11
    //   696: iload #10
    //   698: iload #16
    //   700: lload #18
    //   702: invokestatic Zi : (ZIIIJ)V
    //   705: aload_0
    //   706: aload_1
    //   707: iload #5
    //   709: iload #8
    //   711: iload #7
    //   713: iload #9
    //   715: iload #14
    //   717: lload #18
    //   719: l2i
    //   720: invokevirtual ZQ : ([CIIIIZI)Ljava/math/BigDecimal;
    //   723: areturn
    // Exception table:
    //   from	to	target	type
    //   32	43	43	java/lang/ArithmeticException
    //   50	62	65	java/lang/ArithmeticException
    //   82	104	104	java/lang/ArithmeticException
    //   131	148	151	java/lang/ArithmeticException
    //   169	186	189	java/lang/ArithmeticException
    //   204	221	224	java/lang/ArithmeticException
    //   242	256	259	java/lang/ArithmeticException
    //   284	301	304	java/lang/ArithmeticException
    //   315	332	335	java/lang/ArithmeticException
    //   350	367	370	java/lang/ArithmeticException
    //   388	402	405	java/lang/ArithmeticException
    //   436	448	451	java/lang/ArithmeticException
    //   441	463	463	java/lang/ArithmeticException
    //   516	527	527	java/lang/ArithmeticException
    //   534	546	549	java/lang/ArithmeticException
    //   566	578	578	java/lang/ArithmeticException
    //   657	673	676	java/lang/ArithmeticException
    //   666	684	684	java/lang/ArithmeticException
  }
  
  BigDecimal ZQ(char[] paramArrayOfchar, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean, int paramInt5) {
    // Byte code:
    //   0: iload #5
    //   2: iload_3
    //   3: isub
    //   4: iconst_1
    //   5: isub
    //   6: istore #9
    //   8: iload #5
    //   10: iload #4
    //   12: isub
    //   13: istore #10
    //   15: iload #5
    //   17: iload #4
    //   19: isub
    //   20: istore #11
    //   22: invokestatic ZA : ()[Lburp/Zbqc;
    //   25: iload_3
    //   26: iload_2
    //   27: isub
    //   28: istore #12
    //   30: astore #8
    //   32: aconst_null
    //   33: astore #13
    //   35: iload #12
    //   37: ifle -> 96
    //   40: iload #12
    //   42: sipush #400
    //   45: if_icmple -> 83
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   54: athrow
    //   55: invokestatic Zh : ()Ljava/util/NavigableMap;
    //   58: astore #13
    //   60: aload #13
    //   62: iload_2
    //   63: iload_3
    //   64: invokestatic Zf : (Ljava/util/NavigableMap;II)V
    //   67: aload_1
    //   68: iload_2
    //   69: iload_3
    //   70: aload #13
    //   72: sipush #400
    //   75: invokestatic Zj : ([CIILjava/util/Map;I)Ljava/math/BigInteger;
    //   78: astore #15
    //   80: goto -> 101
    //   83: aload_1
    //   84: iload_2
    //   85: iload_3
    //   86: invokestatic Zh : ([CII)Ljava/math/BigInteger;
    //   89: astore #15
    //   91: aload #8
    //   93: ifnull -> 101
    //   96: getstatic java/math/BigInteger.ZERO : Ljava/math/BigInteger;
    //   99: astore #15
    //   101: iload #10
    //   103: ifle -> 225
    //   106: iload #11
    //   108: sipush #400
    //   111: if_icmple -> 169
    //   114: goto -> 121
    //   117: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   120: athrow
    //   121: aload #13
    //   123: ifnonnull -> 138
    //   126: goto -> 133
    //   129: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   132: athrow
    //   133: invokestatic Zh : ()Ljava/util/NavigableMap;
    //   136: astore #13
    //   138: aload #13
    //   140: iload_3
    //   141: iconst_1
    //   142: iadd
    //   143: iload #5
    //   145: invokestatic Zf : (Ljava/util/NavigableMap;II)V
    //   148: aload_1
    //   149: iload_3
    //   150: iconst_1
    //   151: iadd
    //   152: iload #5
    //   154: aload #13
    //   156: sipush #400
    //   159: invokestatic Zj : ([CIILjava/util/Map;I)Ljava/math/BigInteger;
    //   162: astore #16
    //   164: aload #8
    //   166: ifnull -> 180
    //   169: aload_1
    //   170: iload_3
    //   171: iconst_1
    //   172: iadd
    //   173: iload #5
    //   175: invokestatic Zh : ([CII)Ljava/math/BigInteger;
    //   178: astore #16
    //   180: aload #15
    //   182: invokevirtual signum : ()I
    //   185: ifne -> 197
    //   188: aload #16
    //   190: astore #14
    //   192: aload #8
    //   194: ifnull -> 220
    //   197: aload #13
    //   199: iload #9
    //   201: invokestatic Ze : (Ljava/util/NavigableMap;I)Ljava/math/BigInteger;
    //   204: astore #17
    //   206: aload #15
    //   208: aload #17
    //   210: invokestatic ZT : (Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   213: aload #16
    //   215: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   218: astore #14
    //   220: aload #8
    //   222: ifnull -> 229
    //   225: aload #15
    //   227: astore #14
    //   229: new java/math/BigDecimal
    //   232: dup
    //   233: iload #6
    //   235: ifeq -> 250
    //   238: aload #14
    //   240: invokevirtual negate : ()Ljava/math/BigInteger;
    //   243: goto -> 252
    //   246: invokestatic a : (Ljava/lang/ArithmeticException;)Ljava/lang/ArithmeticException;
    //   249: athrow
    //   250: aload #14
    //   252: iload #7
    //   254: ineg
    //   255: invokespecial <init> : (Ljava/math/BigInteger;I)V
    //   258: areturn
    // Exception table:
    //   from	to	target	type
    //   35	48	51	java/lang/ArithmeticException
    //   101	114	117	java/lang/ArithmeticException
    //   106	126	129	java/lang/ArithmeticException
    //   229	246	246	java/lang/ArithmeticException
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
    //   8: ldc '9rv¨{.øÈPíú¦*ªö=¥AkKÊ}#RçöÌf¿ãBðò'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #20
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #82
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
    //   69: putstatic com/fasterxml/Zz/Zz.d : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic com/fasterxml/Zz/Zz.e : [Ljava/lang/String;
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
    //   152: bipush #78
    //   154: goto -> 184
    //   157: bipush #105
    //   159: goto -> 184
    //   162: bipush #84
    //   164: goto -> 184
    //   167: bipush #82
    //   169: goto -> 184
    //   172: bipush #112
    //   174: goto -> 184
    //   177: bipush #28
    //   179: goto -> 184
    //   182: bipush #46
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
    int i = (paramInt1 ^ 0x2CE8) & 0xFFFF;
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
      byte b1 = 62;
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
      e[i] = (new String(arrayOfChar)).intern();
    } 
    return e[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zz\Zz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */