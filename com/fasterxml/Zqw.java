package com.fasterxml;

import com.fasterxml.Zc.Zf;

public final class Zqw {
  private static final char[] ZM;
  
  private static final byte[] Zb;
  
  private static final Zqw ZD;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static Zqw ZO() {
    return ZD;
  }
  
  public char[] Zf(String paramString) {
    // Byte code:
    //   0: invokestatic Zn : ()I
    //   3: aload_1
    //   4: invokevirtual length : ()I
    //   7: istore_3
    //   8: iload_3
    //   9: invokestatic Zo : (I)I
    //   12: newarray char
    //   14: astore #4
    //   16: invokestatic Zg : ()[I
    //   19: astore #5
    //   21: aload #5
    //   23: arraylength
    //   24: istore #6
    //   26: iconst_0
    //   27: istore #7
    //   29: aconst_null
    //   30: astore #8
    //   32: istore_2
    //   33: iconst_0
    //   34: istore #9
    //   36: aconst_null
    //   37: astore #10
    //   39: iload #7
    //   41: iload_3
    //   42: if_icmpge -> 365
    //   45: aload_1
    //   46: iload #7
    //   48: invokevirtual charAt : (I)C
    //   51: istore #11
    //   53: iload #11
    //   55: iload #6
    //   57: if_icmpge -> 79
    //   60: aload #5
    //   62: iload #11
    //   64: iaload
    //   65: ifeq -> 79
    //   68: iload_2
    //   69: ifeq -> 179
    //   72: goto -> 79
    //   75: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   78: athrow
    //   79: iload #9
    //   81: aload #4
    //   83: arraylength
    //   84: if_icmplt -> 138
    //   87: goto -> 94
    //   90: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   93: athrow
    //   94: aload #8
    //   96: ifnonnull -> 113
    //   99: goto -> 106
    //   102: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   105: athrow
    //   106: aload #4
    //   108: invokestatic Zb : ([C)Lcom/fasterxml/Zc/Zg;
    //   111: astore #8
    //   113: aload #8
    //   115: invokevirtual ZI : ()[C
    //   118: astore #4
    //   120: goto -> 135
    //   123: astore #12
    //   125: new java/lang/IllegalStateException
    //   128: dup
    //   129: aload #12
    //   131: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   134: athrow
    //   135: iconst_0
    //   136: istore #9
    //   138: aload #4
    //   140: iload #9
    //   142: iinc #9, 1
    //   145: iload #11
    //   147: castore
    //   148: iinc #7, 1
    //   151: iload #7
    //   153: iload_3
    //   154: if_icmplt -> 168
    //   157: iload_2
    //   158: ifeq -> 365
    //   161: goto -> 168
    //   164: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   167: athrow
    //   168: iload_2
    //   169: ifeq -> 45
    //   172: goto -> 179
    //   175: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   178: athrow
    //   179: aload #10
    //   181: ifnonnull -> 190
    //   184: aload_0
    //   185: invokespecial ZZ : ()[C
    //   188: astore #10
    //   190: aload_1
    //   191: iload #7
    //   193: iinc #7, 1
    //   196: invokevirtual charAt : (I)C
    //   199: istore #11
    //   201: aload #5
    //   203: iload #11
    //   205: iaload
    //   206: istore #12
    //   208: iload #12
    //   210: ifge -> 228
    //   213: aload_0
    //   214: iload #11
    //   216: aload #10
    //   218: invokespecial ZT : (I[C)I
    //   221: goto -> 236
    //   224: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   227: athrow
    //   228: aload_0
    //   229: iload #12
    //   231: aload #10
    //   233: invokespecial ZD : (I[C)I
    //   236: istore #13
    //   238: iload #9
    //   240: iload #13
    //   242: iadd
    //   243: aload #4
    //   245: arraylength
    //   246: if_icmple -> 342
    //   249: aload #4
    //   251: arraylength
    //   252: iload #9
    //   254: isub
    //   255: istore #14
    //   257: iload #14
    //   259: ifle -> 281
    //   262: aload #10
    //   264: iconst_0
    //   265: aload #4
    //   267: iload #9
    //   269: iload #14
    //   271: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   274: goto -> 281
    //   277: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   280: athrow
    //   281: aload #8
    //   283: ifnonnull -> 293
    //   286: aload #4
    //   288: invokestatic Zb : ([C)Lcom/fasterxml/Zc/Zg;
    //   291: astore #8
    //   293: aload #8
    //   295: invokevirtual ZI : ()[C
    //   298: astore #4
    //   300: goto -> 315
    //   303: astore #15
    //   305: new java/lang/IllegalStateException
    //   308: dup
    //   309: aload #15
    //   311: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   314: athrow
    //   315: iload #13
    //   317: iload #14
    //   319: isub
    //   320: istore #15
    //   322: aload #10
    //   324: iload #14
    //   326: aload #4
    //   328: iconst_0
    //   329: iload #15
    //   331: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   334: iload #15
    //   336: istore #9
    //   338: iload_2
    //   339: ifeq -> 361
    //   342: aload #10
    //   344: iconst_0
    //   345: aload #4
    //   347: iload #9
    //   349: iload #13
    //   351: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   354: iload #9
    //   356: iload #13
    //   358: iadd
    //   359: istore #9
    //   361: iload_2
    //   362: ifeq -> 39
    //   365: aload #8
    //   367: ifnonnull -> 383
    //   370: aload #4
    //   372: iconst_0
    //   373: iload #9
    //   375: invokestatic copyOfRange : ([CII)[C
    //   378: areturn
    //   379: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   382: athrow
    //   383: aload #8
    //   385: iload #9
    //   387: invokevirtual ZD : (I)V
    //   390: aload #8
    //   392: invokevirtual Zd : ()[C
    //   395: areturn
    //   396: astore #11
    //   398: new java/lang/IllegalStateException
    //   401: dup
    //   402: aload #11
    //   404: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   407: athrow
    // Exception table:
    //   from	to	target	type
    //   60	72	75	java/io/IOException
    //   68	87	90	java/io/IOException
    //   79	99	102	java/io/IOException
    //   113	120	123	java/io/IOException
    //   138	161	164	java/io/IOException
    //   157	172	175	java/io/IOException
    //   208	224	224	java/io/IOException
    //   257	274	277	java/io/IOException
    //   293	300	303	java/io/IOException
    //   365	379	379	java/io/IOException
    //   390	395	396	java/io/IOException
  }
  
  public byte[] Za(String paramString) {
    // Byte code:
    //   0: invokestatic ZD : ()I
    //   3: iconst_0
    //   4: istore_3
    //   5: aload_1
    //   6: invokevirtual length : ()I
    //   9: istore #4
    //   11: iconst_0
    //   12: istore #5
    //   14: istore_2
    //   15: iload #4
    //   17: invokestatic Zz : (I)I
    //   20: newarray byte
    //   22: astore #6
    //   24: aconst_null
    //   25: astore #7
    //   27: iload_3
    //   28: iload #4
    //   30: if_icmpge -> 606
    //   33: invokestatic Zg : ()[I
    //   36: astore #8
    //   38: aload_1
    //   39: iload_3
    //   40: invokevirtual charAt : (I)C
    //   43: istore #9
    //   45: iload #9
    //   47: bipush #127
    //   49: if_icmpgt -> 159
    //   52: aload #8
    //   54: iload #9
    //   56: iaload
    //   57: ifeq -> 71
    //   60: iload_2
    //   61: ifne -> 159
    //   64: goto -> 71
    //   67: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   70: athrow
    //   71: iload #5
    //   73: aload #6
    //   75: arraylength
    //   76: if_icmplt -> 117
    //   79: goto -> 86
    //   82: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   85: athrow
    //   86: aload #7
    //   88: ifnonnull -> 107
    //   91: goto -> 98
    //   94: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   97: athrow
    //   98: aload #6
    //   100: iload #5
    //   102: invokestatic Za : ([BI)Lcom/fasterxml/Zc/Zf;
    //   105: astore #7
    //   107: aload #7
    //   109: invokevirtual Zn : ()[B
    //   112: astore #6
    //   114: iconst_0
    //   115: istore #5
    //   117: aload #6
    //   119: iload #5
    //   121: iinc #5, 1
    //   124: iload #9
    //   126: i2b
    //   127: bastore
    //   128: iinc #3, 1
    //   131: iload_3
    //   132: iload #4
    //   134: if_icmplt -> 148
    //   137: iload_2
    //   138: ifne -> 606
    //   141: goto -> 148
    //   144: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   147: athrow
    //   148: iload_2
    //   149: ifne -> 38
    //   152: goto -> 159
    //   155: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   158: athrow
    //   159: aload #7
    //   161: ifnonnull -> 173
    //   164: aload #6
    //   166: iload #5
    //   168: invokestatic Za : ([BI)Lcom/fasterxml/Zc/Zf;
    //   171: astore #7
    //   173: iload #5
    //   175: aload #6
    //   177: arraylength
    //   178: if_icmplt -> 191
    //   181: aload #7
    //   183: invokevirtual Zn : ()[B
    //   186: astore #6
    //   188: iconst_0
    //   189: istore #5
    //   191: aload_1
    //   192: iload_3
    //   193: iinc #3, 1
    //   196: invokevirtual charAt : (I)C
    //   199: istore #9
    //   201: iload #9
    //   203: bipush #127
    //   205: if_icmpgt -> 240
    //   208: aload #8
    //   210: iload #9
    //   212: iaload
    //   213: istore #10
    //   215: aload_0
    //   216: iload #9
    //   218: iload #10
    //   220: aload #7
    //   222: iload #5
    //   224: invokespecial ZZ : (IILcom/fasterxml/Zc/Zf;I)I
    //   227: istore #5
    //   229: aload #7
    //   231: invokevirtual Zj : ()[B
    //   234: astore #6
    //   236: iload_2
    //   237: ifne -> 27
    //   240: iload #9
    //   242: sipush #2047
    //   245: if_icmpgt -> 281
    //   248: aload #6
    //   250: iload #5
    //   252: iinc #5, 1
    //   255: sipush #192
    //   258: iload #9
    //   260: bipush #6
    //   262: ishr
    //   263: ior
    //   264: i2b
    //   265: bastore
    //   266: sipush #128
    //   269: iload #9
    //   271: bipush #63
    //   273: iand
    //   274: ior
    //   275: istore #9
    //   277: iload_2
    //   278: ifne -> 573
    //   281: iload #9
    //   283: ldc 55296
    //   285: if_icmplt -> 309
    //   288: goto -> 295
    //   291: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   294: athrow
    //   295: iload #9
    //   297: ldc 57343
    //   299: if_icmple -> 388
    //   302: goto -> 309
    //   305: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   308: athrow
    //   309: aload #6
    //   311: iload #5
    //   313: iinc #5, 1
    //   316: sipush #224
    //   319: iload #9
    //   321: bipush #12
    //   323: ishr
    //   324: ior
    //   325: i2b
    //   326: bastore
    //   327: iload #5
    //   329: aload #6
    //   331: arraylength
    //   332: if_icmplt -> 352
    //   335: goto -> 342
    //   338: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   341: athrow
    //   342: aload #7
    //   344: invokevirtual Zn : ()[B
    //   347: astore #6
    //   349: iconst_0
    //   350: istore #5
    //   352: aload #6
    //   354: iload #5
    //   356: iinc #5, 1
    //   359: sipush #128
    //   362: iload #9
    //   364: bipush #6
    //   366: ishr
    //   367: bipush #63
    //   369: iand
    //   370: ior
    //   371: i2b
    //   372: bastore
    //   373: sipush #128
    //   376: iload #9
    //   378: bipush #63
    //   380: iand
    //   381: ior
    //   382: istore #9
    //   384: iload_2
    //   385: ifne -> 573
    //   388: iload #9
    //   390: ldc 56319
    //   392: if_icmple -> 414
    //   395: goto -> 402
    //   398: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   401: athrow
    //   402: iload #9
    //   404: invokestatic Zi : (I)V
    //   407: goto -> 414
    //   410: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   413: athrow
    //   414: iload_3
    //   415: iload #4
    //   417: if_icmplt -> 432
    //   420: iload #9
    //   422: invokestatic Zi : (I)V
    //   425: goto -> 432
    //   428: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   431: athrow
    //   432: iload #9
    //   434: aload_1
    //   435: iload_3
    //   436: iinc #3, 1
    //   439: invokevirtual charAt : (I)C
    //   442: invokestatic ZZ : (II)I
    //   445: istore #9
    //   447: iload #9
    //   449: ldc 1114111
    //   451: if_icmple -> 466
    //   454: iload #9
    //   456: invokestatic Zi : (I)V
    //   459: goto -> 466
    //   462: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   465: athrow
    //   466: aload #6
    //   468: iload #5
    //   470: iinc #5, 1
    //   473: sipush #240
    //   476: iload #9
    //   478: bipush #18
    //   480: ishr
    //   481: ior
    //   482: i2b
    //   483: bastore
    //   484: iload #5
    //   486: aload #6
    //   488: arraylength
    //   489: if_icmplt -> 502
    //   492: aload #7
    //   494: invokevirtual Zn : ()[B
    //   497: astore #6
    //   499: iconst_0
    //   500: istore #5
    //   502: aload #6
    //   504: iload #5
    //   506: iinc #5, 1
    //   509: sipush #128
    //   512: iload #9
    //   514: bipush #12
    //   516: ishr
    //   517: bipush #63
    //   519: iand
    //   520: ior
    //   521: i2b
    //   522: bastore
    //   523: iload #5
    //   525: aload #6
    //   527: arraylength
    //   528: if_icmplt -> 541
    //   531: aload #7
    //   533: invokevirtual Zn : ()[B
    //   536: astore #6
    //   538: iconst_0
    //   539: istore #5
    //   541: aload #6
    //   543: iload #5
    //   545: iinc #5, 1
    //   548: sipush #128
    //   551: iload #9
    //   553: bipush #6
    //   555: ishr
    //   556: bipush #63
    //   558: iand
    //   559: ior
    //   560: i2b
    //   561: bastore
    //   562: sipush #128
    //   565: iload #9
    //   567: bipush #63
    //   569: iand
    //   570: ior
    //   571: istore #9
    //   573: iload #5
    //   575: aload #6
    //   577: arraylength
    //   578: if_icmplt -> 591
    //   581: aload #7
    //   583: invokevirtual Zn : ()[B
    //   586: astore #6
    //   588: iconst_0
    //   589: istore #5
    //   591: aload #6
    //   593: iload #5
    //   595: iinc #5, 1
    //   598: iload #9
    //   600: i2b
    //   601: bastore
    //   602: iload_2
    //   603: ifne -> 27
    //   606: aload #7
    //   608: ifnonnull -> 624
    //   611: aload #6
    //   613: iconst_0
    //   614: iload #5
    //   616: invokestatic copyOfRange : ([BII)[B
    //   619: areturn
    //   620: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   623: athrow
    //   624: aload #7
    //   626: iload #5
    //   628: invokevirtual ZH : (I)[B
    //   631: areturn
    // Exception table:
    //   from	to	target	type
    //   52	64	67	java/lang/IllegalStateException
    //   60	79	82	java/lang/IllegalStateException
    //   71	91	94	java/lang/IllegalStateException
    //   117	141	144	java/lang/IllegalStateException
    //   137	152	155	java/lang/IllegalStateException
    //   277	288	291	java/lang/IllegalStateException
    //   281	302	305	java/lang/IllegalStateException
    //   295	335	338	java/lang/IllegalStateException
    //   384	395	398	java/lang/IllegalStateException
    //   388	407	410	java/lang/IllegalStateException
    //   414	425	428	java/lang/IllegalStateException
    //   447	459	462	java/lang/IllegalStateException
    //   606	620	620	java/lang/IllegalStateException
  }
  
  public byte[] Ze(String paramString) {
    // Byte code:
    //   0: invokestatic ZD : ()I
    //   3: iconst_0
    //   4: istore_3
    //   5: aload_1
    //   6: invokevirtual length : ()I
    //   9: istore #4
    //   11: iconst_0
    //   12: istore #5
    //   14: iload #4
    //   16: invokestatic Zz : (I)I
    //   19: newarray byte
    //   21: astore #6
    //   23: aload #6
    //   25: arraylength
    //   26: istore #7
    //   28: aconst_null
    //   29: astore #8
    //   31: istore_2
    //   32: iload_3
    //   33: iload #4
    //   35: if_icmpge -> 539
    //   38: aload_1
    //   39: iload_3
    //   40: iinc #3, 1
    //   43: invokevirtual charAt : (I)C
    //   46: istore #9
    //   48: iload #9
    //   50: bipush #127
    //   52: if_icmpgt -> 140
    //   55: iload #5
    //   57: iload #7
    //   59: if_icmplt -> 98
    //   62: aload #8
    //   64: ifnonnull -> 83
    //   67: goto -> 74
    //   70: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   73: athrow
    //   74: aload #6
    //   76: iload #5
    //   78: invokestatic Za : ([BI)Lcom/fasterxml/Zc/Zf;
    //   81: astore #8
    //   83: aload #8
    //   85: invokevirtual Zn : ()[B
    //   88: astore #6
    //   90: aload #6
    //   92: arraylength
    //   93: istore #7
    //   95: iconst_0
    //   96: istore #5
    //   98: aload #6
    //   100: iload #5
    //   102: iinc #5, 1
    //   105: iload #9
    //   107: i2b
    //   108: bastore
    //   109: iload_3
    //   110: iload #4
    //   112: if_icmplt -> 126
    //   115: iload_2
    //   116: ifne -> 539
    //   119: goto -> 126
    //   122: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   125: athrow
    //   126: aload_1
    //   127: iload_3
    //   128: iinc #3, 1
    //   131: invokevirtual charAt : (I)C
    //   134: istore #9
    //   136: iload_2
    //   137: ifne -> 48
    //   140: aload #8
    //   142: ifnonnull -> 154
    //   145: aload #6
    //   147: iload #5
    //   149: invokestatic Za : ([BI)Lcom/fasterxml/Zc/Zf;
    //   152: astore #8
    //   154: iload #5
    //   156: iload #7
    //   158: if_icmplt -> 176
    //   161: aload #8
    //   163: invokevirtual Zn : ()[B
    //   166: astore #6
    //   168: aload #6
    //   170: arraylength
    //   171: istore #7
    //   173: iconst_0
    //   174: istore #5
    //   176: iload #9
    //   178: sipush #2048
    //   181: if_icmpge -> 213
    //   184: aload #6
    //   186: iload #5
    //   188: iinc #5, 1
    //   191: sipush #192
    //   194: iload #9
    //   196: bipush #6
    //   198: ishr
    //   199: ior
    //   200: i2b
    //   201: bastore
    //   202: iload_2
    //   203: ifne -> 495
    //   206: goto -> 213
    //   209: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   212: athrow
    //   213: iload #9
    //   215: ldc 55296
    //   217: if_icmplt -> 241
    //   220: goto -> 227
    //   223: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   226: athrow
    //   227: iload #9
    //   229: ldc 57343
    //   231: if_icmple -> 313
    //   234: goto -> 241
    //   237: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   240: athrow
    //   241: aload #6
    //   243: iload #5
    //   245: iinc #5, 1
    //   248: sipush #224
    //   251: iload #9
    //   253: bipush #12
    //   255: ishr
    //   256: ior
    //   257: i2b
    //   258: bastore
    //   259: iload #5
    //   261: iload #7
    //   263: if_icmplt -> 288
    //   266: goto -> 273
    //   269: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   272: athrow
    //   273: aload #8
    //   275: invokevirtual Zn : ()[B
    //   278: astore #6
    //   280: aload #6
    //   282: arraylength
    //   283: istore #7
    //   285: iconst_0
    //   286: istore #5
    //   288: aload #6
    //   290: iload #5
    //   292: iinc #5, 1
    //   295: sipush #128
    //   298: iload #9
    //   300: bipush #6
    //   302: ishr
    //   303: bipush #63
    //   305: iand
    //   306: ior
    //   307: i2b
    //   308: bastore
    //   309: iload_2
    //   310: ifne -> 495
    //   313: iload #9
    //   315: ldc 56319
    //   317: if_icmple -> 339
    //   320: goto -> 327
    //   323: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   326: athrow
    //   327: iload #9
    //   329: invokestatic Zi : (I)V
    //   332: goto -> 339
    //   335: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   338: athrow
    //   339: iload_3
    //   340: iload #4
    //   342: if_icmplt -> 357
    //   345: iload #9
    //   347: invokestatic Zi : (I)V
    //   350: goto -> 357
    //   353: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   356: athrow
    //   357: iload #9
    //   359: aload_1
    //   360: iload_3
    //   361: iinc #3, 1
    //   364: invokevirtual charAt : (I)C
    //   367: invokestatic ZZ : (II)I
    //   370: istore #9
    //   372: iload #9
    //   374: ldc 1114111
    //   376: if_icmple -> 391
    //   379: iload #9
    //   381: invokestatic Zi : (I)V
    //   384: goto -> 391
    //   387: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   390: athrow
    //   391: aload #6
    //   393: iload #5
    //   395: iinc #5, 1
    //   398: sipush #240
    //   401: iload #9
    //   403: bipush #18
    //   405: ishr
    //   406: ior
    //   407: i2b
    //   408: bastore
    //   409: iload #5
    //   411: iload #7
    //   413: if_icmplt -> 431
    //   416: aload #8
    //   418: invokevirtual Zn : ()[B
    //   421: astore #6
    //   423: aload #6
    //   425: arraylength
    //   426: istore #7
    //   428: iconst_0
    //   429: istore #5
    //   431: aload #6
    //   433: iload #5
    //   435: iinc #5, 1
    //   438: sipush #128
    //   441: iload #9
    //   443: bipush #12
    //   445: ishr
    //   446: bipush #63
    //   448: iand
    //   449: ior
    //   450: i2b
    //   451: bastore
    //   452: iload #5
    //   454: iload #7
    //   456: if_icmplt -> 474
    //   459: aload #8
    //   461: invokevirtual Zn : ()[B
    //   464: astore #6
    //   466: aload #6
    //   468: arraylength
    //   469: istore #7
    //   471: iconst_0
    //   472: istore #5
    //   474: aload #6
    //   476: iload #5
    //   478: iinc #5, 1
    //   481: sipush #128
    //   484: iload #9
    //   486: bipush #6
    //   488: ishr
    //   489: bipush #63
    //   491: iand
    //   492: ior
    //   493: i2b
    //   494: bastore
    //   495: iload #5
    //   497: iload #7
    //   499: if_icmplt -> 517
    //   502: aload #8
    //   504: invokevirtual Zn : ()[B
    //   507: astore #6
    //   509: aload #6
    //   511: arraylength
    //   512: istore #7
    //   514: iconst_0
    //   515: istore #5
    //   517: aload #6
    //   519: iload #5
    //   521: iinc #5, 1
    //   524: sipush #128
    //   527: iload #9
    //   529: bipush #63
    //   531: iand
    //   532: ior
    //   533: i2b
    //   534: bastore
    //   535: iload_2
    //   536: ifne -> 32
    //   539: aload #8
    //   541: ifnonnull -> 557
    //   544: aload #6
    //   546: iconst_0
    //   547: iload #5
    //   549: invokestatic copyOfRange : ([BII)[B
    //   552: areturn
    //   553: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   556: athrow
    //   557: aload #8
    //   559: iload #5
    //   561: invokevirtual ZH : (I)[B
    //   564: areturn
    // Exception table:
    //   from	to	target	type
    //   55	67	70	java/lang/IllegalStateException
    //   98	119	122	java/lang/IllegalStateException
    //   176	206	209	java/lang/IllegalStateException
    //   184	220	223	java/lang/IllegalStateException
    //   213	234	237	java/lang/IllegalStateException
    //   227	266	269	java/lang/IllegalStateException
    //   288	320	323	java/lang/IllegalStateException
    //   313	332	335	java/lang/IllegalStateException
    //   339	350	353	java/lang/IllegalStateException
    //   372	384	387	java/lang/IllegalStateException
    //   539	553	553	java/lang/IllegalStateException
  }
  
  private char[] ZZ() {
    char[] arrayOfChar = new char[6];
    arrayOfChar[0] = '\\';
    arrayOfChar[2] = '0';
    arrayOfChar[3] = '0';
    return arrayOfChar;
  }
  
  private int ZT(int paramInt, char[] paramArrayOfchar) {
    paramArrayOfchar[1] = 'u';
    paramArrayOfchar[4] = ZM[paramInt >> 4];
    paramArrayOfchar[5] = ZM[paramInt & 0xF];
    return 6;
  }
  
  private int ZD(int paramInt, char[] paramArrayOfchar) {
    paramArrayOfchar[1] = (char)paramInt;
    return 2;
  }
  
  private int ZZ(int paramInt1, int paramInt2, Zf paramZf, int paramInt3) {
    // Byte code:
    //   0: invokestatic ZD : ()I
    //   3: aload_3
    //   4: iload #4
    //   6: invokevirtual ZR : (I)V
    //   9: aload_3
    //   10: bipush #92
    //   12: invokevirtual ZX : (I)V
    //   15: istore #5
    //   17: iload_2
    //   18: ifge -> 130
    //   21: aload_3
    //   22: bipush #117
    //   24: invokevirtual ZX : (I)V
    //   27: iload_1
    //   28: sipush #255
    //   31: if_icmple -> 83
    //   34: goto -> 41
    //   37: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   40: athrow
    //   41: iload_1
    //   42: bipush #8
    //   44: ishr
    //   45: istore #6
    //   47: aload_3
    //   48: getstatic com/fasterxml/Zqw.Zb : [B
    //   51: iload #6
    //   53: iconst_4
    //   54: ishr
    //   55: baload
    //   56: invokevirtual ZX : (I)V
    //   59: aload_3
    //   60: getstatic com/fasterxml/Zqw.Zb : [B
    //   63: iload #6
    //   65: bipush #15
    //   67: iand
    //   68: baload
    //   69: invokevirtual ZX : (I)V
    //   72: iload_1
    //   73: sipush #255
    //   76: iand
    //   77: istore_1
    //   78: iload #5
    //   80: ifne -> 102
    //   83: aload_3
    //   84: bipush #48
    //   86: invokevirtual ZX : (I)V
    //   89: aload_3
    //   90: bipush #48
    //   92: invokevirtual ZX : (I)V
    //   95: goto -> 102
    //   98: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   101: athrow
    //   102: aload_3
    //   103: getstatic com/fasterxml/Zqw.Zb : [B
    //   106: iload_1
    //   107: iconst_4
    //   108: ishr
    //   109: baload
    //   110: invokevirtual ZX : (I)V
    //   113: aload_3
    //   114: getstatic com/fasterxml/Zqw.Zb : [B
    //   117: iload_1
    //   118: bipush #15
    //   120: iand
    //   121: baload
    //   122: invokevirtual ZX : (I)V
    //   125: iload #5
    //   127: ifne -> 143
    //   130: aload_3
    //   131: iload_2
    //   132: i2b
    //   133: invokevirtual ZX : (I)V
    //   136: goto -> 143
    //   139: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   142: athrow
    //   143: aload_3
    //   144: invokevirtual ZD : ()I
    //   147: ireturn
    // Exception table:
    //   from	to	target	type
    //   17	34	37	java/lang/IllegalStateException
    //   78	95	98	java/lang/IllegalStateException
    //   102	136	139	java/lang/IllegalStateException
  }
  
  private static int ZZ(int paramInt1, int paramInt2) {
    try {
      if (paramInt2 >= 56320)
        try {
          if (paramInt2 <= 57343)
            return (paramInt1 << 10) + paramInt2 + -56613888; 
          throw new IllegalArgumentException(a(30465, -14106) + Integer.toHexString(paramInt1) + a(30464, 3178) + Integer.toHexString(paramInt2) + a(30467, -10709));
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    throw new IllegalArgumentException(a(30465, -14106) + Integer.toHexString(paramInt1) + a(30464, 3178) + Integer.toHexString(paramInt2) + a(30467, -10709));
  }
  
  private static void Zi(int paramInt) {
    throw new IllegalArgumentException(Zg2.ZL(paramInt));
  }
  
  static int Zo(int paramInt) {
    int i = Math.max(16, paramInt + Math.min(6 + (paramInt >> 3), 1000));
    return Math.min(i, 32000);
  }
  
  static int Zz(int paramInt) {
    int i = Math.max(24, paramInt + 6 + (paramInt >> 1));
    return Math.min(i, 32000);
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'cÞe/xÃad²\Và-ª¿#®ÜgHçÜAÍ\\bt%­/%ÃÎ#t»ÂÃ§³,/nþÞó_JÇ.Jú=H|¤'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #36
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #87
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
    //   69: putstatic com/fasterxml/Zqw.a : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic com/fasterxml/Zqw.b : [Ljava/lang/String;
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
    //   152: bipush #127
    //   154: goto -> 184
    //   157: bipush #16
    //   159: goto -> 184
    //   162: bipush #62
    //   164: goto -> 184
    //   167: bipush #28
    //   169: goto -> 184
    //   172: bipush #73
    //   174: goto -> 184
    //   177: bipush #112
    //   179: goto -> 184
    //   182: bipush #19
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
    //   227: iconst_1
    //   228: invokestatic Zo : (Z)[C
    //   231: putstatic com/fasterxml/Zqw.ZM : [C
    //   234: iconst_1
    //   235: invokestatic ZB : (Z)[B
    //   238: putstatic com/fasterxml/Zqw.Zb : [B
    //   241: new com/fasterxml/Zqw
    //   244: dup
    //   245: invokespecial <init> : ()V
    //   248: putstatic com/fasterxml/Zqw.ZD : Lcom/fasterxml/Zqw;
    //   251: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x7701) & 0xFFFF;
    if (b[i] == null) {
      char[] arrayOfChar = a[i].toCharArray();
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
      char c = '½';
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
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zqw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */