package burp;

public interface Zeqj {
  public static final String[] a;
  
  public static final String[] b;
  
  Object Zj(Zzvx paramZzvx, String... paramVarArgs);
  
  String ZA(Zzvx paramZzvx, String... paramVarArgs) {
    Object object = Zj(paramZzvx, paramVarArgs);
    if (object instanceof Zx69) {
      Zx69 zx69 = (Zx69)object;
      return zx69.Zs();
    } 
    return String.valueOf(object);
  }
  
  static Zm0j Zw(Zb1d paramZb1d) {
    return new Zm0j(paramZb1d);
  }
  
  static Zeqj ZA(Zm3v<?> paramZm3v) {
    return new Zs03(paramZm3v);
  }
  
  static Zeqj Zx(String paramString) {
    return new Zs8r(paramString);
  }
  
  static Zeqj Ze(String paramString, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: sipush #-31200
    //   4: sipush #-27741
    //   7: invokestatic a : (II)Ljava/lang/String;
    //   10: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   13: astore_3
    //   14: invokestatic ZK : ()[I
    //   17: aload_3
    //   18: iconst_0
    //   19: aaload
    //   20: astore #4
    //   22: astore_2
    //   23: sipush #-31191
    //   26: sipush #14320
    //   29: invokestatic a : (II)Ljava/lang/String;
    //   32: aload_3
    //   33: iconst_1
    //   34: aaload
    //   35: invokevirtual equals : (Ljava/lang/Object;)Z
    //   38: ifeq -> 519
    //   41: aload_3
    //   42: arraylength
    //   43: iconst_2
    //   44: if_icmpne -> 71
    //   47: goto -> 54
    //   50: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   53: athrow
    //   54: iconst_1
    //   55: anewarray java/lang/String
    //   58: dup
    //   59: iconst_0
    //   60: aload #4
    //   62: aastore
    //   63: invokestatic Za : ([Ljava/lang/String;)Lburp/Zeqj;
    //   66: areturn
    //   67: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   70: athrow
    //   71: aload_3
    //   72: arraylength
    //   73: iconst_3
    //   74: if_icmpne -> 498
    //   77: aload_3
    //   78: iconst_2
    //   79: aaload
    //   80: astore #5
    //   82: aload #5
    //   84: astore #6
    //   86: iconst_m1
    //   87: istore #7
    //   89: aload #6
    //   91: invokevirtual hashCode : ()I
    //   94: lookupswitch default -> 334, -1077554975 -> 183, -930560991 -> 214, 116079 -> 152, 3029410 -> 245, 107944136 -> 307, 795307910 -> 276
    //   152: aload #6
    //   154: sipush #-31178
    //   157: sipush #32348
    //   160: invokestatic a : (II)Ljava/lang/String;
    //   163: invokevirtual equals : (Ljava/lang/Object;)Z
    //   166: ifeq -> 334
    //   169: goto -> 176
    //   172: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   175: athrow
    //   176: iconst_0
    //   177: istore #7
    //   179: aload_2
    //   180: ifnonnull -> 334
    //   183: aload #6
    //   185: sipush #-31182
    //   188: sipush #-17434
    //   191: invokestatic a : (II)Ljava/lang/String;
    //   194: invokevirtual equals : (Ljava/lang/Object;)Z
    //   197: ifeq -> 334
    //   200: goto -> 207
    //   203: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   206: athrow
    //   207: iconst_1
    //   208: istore #7
    //   210: aload_2
    //   211: ifnonnull -> 334
    //   214: aload #6
    //   216: sipush #-31187
    //   219: sipush #27151
    //   222: invokestatic a : (II)Ljava/lang/String;
    //   225: invokevirtual equals : (Ljava/lang/Object;)Z
    //   228: ifeq -> 334
    //   231: goto -> 238
    //   234: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   237: athrow
    //   238: iconst_2
    //   239: istore #7
    //   241: aload_2
    //   242: ifnonnull -> 334
    //   245: aload #6
    //   247: sipush #-31193
    //   250: sipush #-22579
    //   253: invokestatic a : (II)Ljava/lang/String;
    //   256: invokevirtual equals : (Ljava/lang/Object;)Z
    //   259: ifeq -> 334
    //   262: goto -> 269
    //   265: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   268: athrow
    //   269: iconst_3
    //   270: istore #7
    //   272: aload_2
    //   273: ifnonnull -> 334
    //   276: aload #6
    //   278: sipush #-31197
    //   281: sipush #-32530
    //   284: invokestatic a : (II)Ljava/lang/String;
    //   287: invokevirtual equals : (Ljava/lang/Object;)Z
    //   290: ifeq -> 334
    //   293: goto -> 300
    //   296: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   299: athrow
    //   300: iconst_4
    //   301: istore #7
    //   303: aload_2
    //   304: ifnonnull -> 334
    //   307: aload #6
    //   309: sipush #-31190
    //   312: sipush #-7663
    //   315: invokestatic a : (II)Ljava/lang/String;
    //   318: invokevirtual equals : (Ljava/lang/Object;)Z
    //   321: ifeq -> 334
    //   324: goto -> 331
    //   327: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   330: athrow
    //   331: iconst_5
    //   332: istore #7
    //   334: iload #7
    //   336: tableswitch default -> 473, 0 -> 376, 1 -> 395, 2 -> 410, 3 -> 425, 4 -> 440, 5 -> 458
    //   376: iconst_1
    //   377: anewarray java/lang/String
    //   380: dup
    //   381: iconst_0
    //   382: aload #4
    //   384: aastore
    //   385: invokestatic ZW : ([Ljava/lang/String;)Lburp/Zeqj;
    //   388: goto -> 497
    //   391: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   394: athrow
    //   395: iconst_1
    //   396: anewarray java/lang/String
    //   399: dup
    //   400: iconst_0
    //   401: aload #4
    //   403: aastore
    //   404: invokestatic Zd : ([Ljava/lang/String;)Lburp/Zeqj;
    //   407: goto -> 497
    //   410: iconst_1
    //   411: anewarray java/lang/String
    //   414: dup
    //   415: iconst_0
    //   416: aload #4
    //   418: aastore
    //   419: invokestatic Zw : ([Ljava/lang/String;)Lburp/Zeqj;
    //   422: goto -> 497
    //   425: iconst_1
    //   426: anewarray java/lang/String
    //   429: dup
    //   430: iconst_0
    //   431: aload #4
    //   433: aastore
    //   434: invokestatic ZA : ([Ljava/lang/String;)Lburp/Zeqj;
    //   437: goto -> 497
    //   440: iconst_1
    //   441: anewarray java/lang/String
    //   444: dup
    //   445: iconst_0
    //   446: aload #4
    //   448: aastore
    //   449: invokestatic Zv : ([Ljava/lang/String;)Lburp/Zryv;
    //   452: invokevirtual ZX : ()Lburp/Zeqj;
    //   455: goto -> 497
    //   458: iconst_1
    //   459: anewarray java/lang/String
    //   462: dup
    //   463: iconst_0
    //   464: aload #4
    //   466: aastore
    //   467: invokestatic Zk : ([Ljava/lang/String;)Lburp/Zeqj;
    //   470: goto -> 497
    //   473: new java/lang/IllegalArgumentException
    //   476: dup
    //   477: aload_0
    //   478: sipush #-31185
    //   481: sipush #20139
    //   484: invokestatic a : (II)Ljava/lang/String;
    //   487: swap
    //   488: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   493: invokespecial <init> : (Ljava/lang/String;)V
    //   496: athrow
    //   497: areturn
    //   498: aload_3
    //   499: arraylength
    //   500: iconst_4
    //   501: if_icmpne -> 897
    //   504: aload_3
    //   505: iconst_3
    //   506: aaload
    //   507: astore #5
    //   509: aload_0
    //   510: aload #4
    //   512: aload #5
    //   514: iload_1
    //   515: invokestatic ZV : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lburp/Zeqj;
    //   518: areturn
    //   519: sipush #-31194
    //   522: sipush #-19633
    //   525: invokestatic a : (II)Ljava/lang/String;
    //   528: aload_3
    //   529: iconst_1
    //   530: aaload
    //   531: invokevirtual equals : (Ljava/lang/Object;)Z
    //   534: ifeq -> 897
    //   537: aload_3
    //   538: arraylength
    //   539: iconst_2
    //   540: if_icmpne -> 567
    //   543: goto -> 550
    //   546: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   549: athrow
    //   550: iconst_1
    //   551: anewarray java/lang/String
    //   554: dup
    //   555: iconst_0
    //   556: aload #4
    //   558: aastore
    //   559: invokestatic Zo : ([Ljava/lang/String;)Lburp/Zeqj;
    //   562: areturn
    //   563: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   566: athrow
    //   567: aload_3
    //   568: arraylength
    //   569: iconst_3
    //   570: if_icmpne -> 876
    //   573: aload_3
    //   574: iconst_2
    //   575: aaload
    //   576: astore #5
    //   578: aload #5
    //   580: astore #6
    //   582: iconst_m1
    //   583: istore #7
    //   585: aload #6
    //   587: invokevirtual hashCode : ()I
    //   590: lookupswitch default -> 751, -930560991 -> 724, -891699686 -> 663, 3029410 -> 632, 795307910 -> 693
    //   632: aload #6
    //   634: sipush #-31195
    //   637: sipush #-18814
    //   640: invokestatic a : (II)Ljava/lang/String;
    //   643: invokevirtual equals : (Ljava/lang/Object;)Z
    //   646: ifeq -> 751
    //   649: goto -> 656
    //   652: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   655: athrow
    //   656: iconst_0
    //   657: istore #7
    //   659: aload_2
    //   660: ifnonnull -> 751
    //   663: aload #6
    //   665: sipush #-31180
    //   668: bipush #60
    //   670: invokestatic a : (II)Ljava/lang/String;
    //   673: invokevirtual equals : (Ljava/lang/Object;)Z
    //   676: ifeq -> 751
    //   679: goto -> 686
    //   682: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   685: athrow
    //   686: iconst_1
    //   687: istore #7
    //   689: aload_2
    //   690: ifnonnull -> 751
    //   693: aload #6
    //   695: sipush #-31177
    //   698: sipush #1535
    //   701: invokestatic a : (II)Ljava/lang/String;
    //   704: invokevirtual equals : (Ljava/lang/Object;)Z
    //   707: ifeq -> 751
    //   710: goto -> 717
    //   713: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   716: athrow
    //   717: iconst_2
    //   718: istore #7
    //   720: aload_2
    //   721: ifnonnull -> 751
    //   724: aload #6
    //   726: sipush #-31183
    //   729: sipush #5965
    //   732: invokestatic a : (II)Ljava/lang/String;
    //   735: invokevirtual equals : (Ljava/lang/Object;)Z
    //   738: ifeq -> 751
    //   741: goto -> 748
    //   744: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   747: athrow
    //   748: iconst_3
    //   749: istore #7
    //   751: iload #7
    //   753: tableswitch default -> 851, 0 -> 784, 1 -> 803, 2 -> 818, 3 -> 836
    //   784: iconst_1
    //   785: anewarray java/lang/String
    //   788: dup
    //   789: iconst_0
    //   790: aload #4
    //   792: aastore
    //   793: invokestatic ZS : ([Ljava/lang/String;)Lburp/Zeqj;
    //   796: goto -> 875
    //   799: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   802: athrow
    //   803: iconst_1
    //   804: anewarray java/lang/String
    //   807: dup
    //   808: iconst_0
    //   809: aload #4
    //   811: aastore
    //   812: invokestatic ZU : ([Ljava/lang/String;)Lburp/Zm0j;
    //   815: goto -> 875
    //   818: iconst_1
    //   819: anewarray java/lang/String
    //   822: dup
    //   823: iconst_0
    //   824: aload #4
    //   826: aastore
    //   827: invokestatic Zm : ([Ljava/lang/String;)Lburp/Zbs5;
    //   830: invokevirtual ZN : ()Lburp/Zeqj;
    //   833: goto -> 875
    //   836: iconst_1
    //   837: anewarray java/lang/String
    //   840: dup
    //   841: iconst_0
    //   842: aload #4
    //   844: aastore
    //   845: invokestatic ZY : ([Ljava/lang/String;)Lburp/Zeqj;
    //   848: goto -> 875
    //   851: new java/lang/IllegalArgumentException
    //   854: dup
    //   855: aload_0
    //   856: sipush #-31179
    //   859: sipush #-20759
    //   862: invokestatic a : (II)Ljava/lang/String;
    //   865: swap
    //   866: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   871: invokespecial <init> : (Ljava/lang/String;)V
    //   874: athrow
    //   875: areturn
    //   876: aload_3
    //   877: arraylength
    //   878: iconst_4
    //   879: if_icmpne -> 897
    //   882: aload_3
    //   883: iconst_3
    //   884: aaload
    //   885: astore #5
    //   887: aload_0
    //   888: aload #4
    //   890: aload #5
    //   892: iload_1
    //   893: invokestatic ZV : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lburp/Zeqj;
    //   896: areturn
    //   897: new java/lang/IllegalArgumentException
    //   900: dup
    //   901: aload_0
    //   902: sipush #-31179
    //   905: sipush #-20759
    //   908: invokestatic a : (II)Ljava/lang/String;
    //   911: swap
    //   912: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   917: invokespecial <init> : (Ljava/lang/String;)V
    //   920: athrow
    // Exception table:
    //   from	to	target	type
    //   23	47	50	java/lang/IllegalArgumentException
    //   41	67	67	java/lang/IllegalArgumentException
    //   89	169	172	java/lang/IllegalArgumentException
    //   179	200	203	java/lang/IllegalArgumentException
    //   210	231	234	java/lang/IllegalArgumentException
    //   241	262	265	java/lang/IllegalArgumentException
    //   272	293	296	java/lang/IllegalArgumentException
    //   303	324	327	java/lang/IllegalArgumentException
    //   334	391	391	java/lang/IllegalArgumentException
    //   519	543	546	java/lang/IllegalArgumentException
    //   537	563	563	java/lang/IllegalArgumentException
    //   585	649	652	java/lang/IllegalArgumentException
    //   659	679	682	java/lang/IllegalArgumentException
    //   689	710	713	java/lang/IllegalArgumentException
    //   720	741	744	java/lang/IllegalArgumentException
    //   751	799	799	java/lang/IllegalArgumentException
  }
  
  private static Zeqj ZV(String paramString1, String paramString2, String paramString3, boolean paramBoolean) {
    // Byte code:
    //   0: aload_1
    //   1: iload_3
    //   2: aload_2
    //   3: aload_0
    //   4: <illegal opcode> ZZ : (Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lburp/Zb1d;
    //   9: invokestatic Zw : (Lburp/Zb1d;)Lburp/Zm0j;
    //   12: areturn
  }
  
  private static Zx69 lambda$getUrlFeature$0(String paramString1, boolean paramBoolean, String paramString2, String paramString3, Zzvx paramZzvx, String[] paramArrayOfString) {
    // Byte code:
    //   0: aload #4
    //   2: aload_0
    //   3: invokevirtual Zk : (Ljava/lang/String;)Lburp/Zzbn;
    //   6: astore #7
    //   8: invokestatic ZK : ()[I
    //   11: aload #7
    //   13: invokevirtual ZR : ()Lburp/Zefx;
    //   16: astore #8
    //   18: astore #6
    //   20: aload #8
    //   22: invokeinterface ZG : ()Ljava/util/List;
    //   27: iconst_0
    //   28: invokeinterface get : (I)Ljava/lang/Object;
    //   33: checkcast java/lang/String
    //   36: invokestatic ZG : (Ljava/lang/String;)Lburp/Zm0u;
    //   39: astore #9
    //   41: aload #8
    //   43: invokeinterface ZF : ()Lburp/Zlit;
    //   48: astore #10
    //   50: iload_1
    //   51: ifeq -> 255
    //   54: aload_2
    //   55: astore #11
    //   57: iconst_m1
    //   58: istore #12
    //   60: aload #11
    //   62: invokevirtual hashCode : ()I
    //   65: lookupswitch default -> 191, 3143036 -> 164, 3433509 -> 100, 107944136 -> 132
    //   100: aload #11
    //   102: sipush #-31196
    //   105: sipush #-26480
    //   108: invokestatic a : (II)Ljava/lang/String;
    //   111: invokevirtual equals : (Ljava/lang/Object;)Z
    //   114: ifeq -> 191
    //   117: goto -> 124
    //   120: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   123: athrow
    //   124: iconst_0
    //   125: istore #12
    //   127: aload #6
    //   129: ifnonnull -> 191
    //   132: aload #11
    //   134: sipush #-31198
    //   137: sipush #-2651
    //   140: invokestatic a : (II)Ljava/lang/String;
    //   143: invokevirtual equals : (Ljava/lang/Object;)Z
    //   146: ifeq -> 191
    //   149: goto -> 156
    //   152: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   155: athrow
    //   156: iconst_1
    //   157: istore #12
    //   159: aload #6
    //   161: ifnonnull -> 191
    //   164: aload #11
    //   166: sipush #-31181
    //   169: sipush #22267
    //   172: invokestatic a : (II)Ljava/lang/String;
    //   175: invokevirtual equals : (Ljava/lang/Object;)Z
    //   178: ifeq -> 191
    //   181: goto -> 188
    //   184: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   187: athrow
    //   188: iconst_2
    //   189: istore #12
    //   191: iload #12
    //   193: tableswitch default -> 255, 0 -> 220, 1 -> 220, 2 -> 220
    //   220: aload #7
    //   222: new burp/Zl1r
    //   225: dup
    //   226: aload #9
    //   228: getfield ZB : Lburp/Zef;
    //   231: invokevirtual ZgZ : ()I
    //   234: aload #9
    //   236: getfield ZB : Lburp/Zef;
    //   239: invokevirtual Zgg : ()I
    //   242: invokespecial <init> : (II)V
    //   245: invokevirtual ZV : (Lburp/Zl1r;)V
    //   248: goto -> 255
    //   251: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   254: athrow
    //   255: aload_2
    //   256: astore #11
    //   258: iconst_m1
    //   259: istore #12
    //   261: aload #11
    //   263: invokevirtual hashCode : ()I
    //   266: lookupswitch default -> 511, -989163880 -> 452, 3143036 -> 420, 3208616 -> 356, 3433509 -> 324, 3446913 -> 484, 107944136 -> 388
    //   324: aload #11
    //   326: sipush #-31188
    //   329: sipush #-5000
    //   332: invokestatic a : (II)Ljava/lang/String;
    //   335: invokevirtual equals : (Ljava/lang/Object;)Z
    //   338: ifeq -> 511
    //   341: goto -> 348
    //   344: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   347: athrow
    //   348: iconst_0
    //   349: istore #12
    //   351: aload #6
    //   353: ifnonnull -> 511
    //   356: aload #11
    //   358: sipush #-31199
    //   361: sipush #-15552
    //   364: invokestatic a : (II)Ljava/lang/String;
    //   367: invokevirtual equals : (Ljava/lang/Object;)Z
    //   370: ifeq -> 511
    //   373: goto -> 380
    //   376: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   379: athrow
    //   380: iconst_1
    //   381: istore #12
    //   383: aload #6
    //   385: ifnonnull -> 511
    //   388: aload #11
    //   390: sipush #-31198
    //   393: sipush #-2651
    //   396: invokestatic a : (II)Ljava/lang/String;
    //   399: invokevirtual equals : (Ljava/lang/Object;)Z
    //   402: ifeq -> 511
    //   405: goto -> 412
    //   408: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   411: athrow
    //   412: iconst_2
    //   413: istore #12
    //   415: aload #6
    //   417: ifnonnull -> 511
    //   420: aload #11
    //   422: sipush #-31189
    //   425: sipush #6714
    //   428: invokestatic a : (II)Ljava/lang/String;
    //   431: invokevirtual equals : (Ljava/lang/Object;)Z
    //   434: ifeq -> 511
    //   437: goto -> 444
    //   440: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   443: athrow
    //   444: iconst_3
    //   445: istore #12
    //   447: aload #6
    //   449: ifnonnull -> 511
    //   452: aload #11
    //   454: sipush #-31186
    //   457: sipush #-21965
    //   460: invokestatic a : (II)Ljava/lang/String;
    //   463: invokevirtual equals : (Ljava/lang/Object;)Z
    //   466: ifeq -> 511
    //   469: goto -> 476
    //   472: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   475: athrow
    //   476: iconst_4
    //   477: istore #12
    //   479: aload #6
    //   481: ifnonnull -> 511
    //   484: aload #11
    //   486: sipush #-31192
    //   489: sipush #23155
    //   492: invokestatic a : (II)Ljava/lang/String;
    //   495: invokevirtual equals : (Ljava/lang/Object;)Z
    //   498: ifeq -> 511
    //   501: goto -> 508
    //   504: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   507: athrow
    //   508: iconst_5
    //   509: istore #12
    //   511: iload #12
    //   513: tableswitch default -> 655, 0 -> 552, 1 -> 572, 2 -> 588, 3 -> 604, 4 -> 620, 5 -> 636
    //   552: aload #10
    //   554: invokeinterface Zd4 : ()[B
    //   559: invokestatic Zy : ([B)Lburp/Zyf;
    //   562: invokestatic Zp : (Lburp/Zstu;)Lburp/Zx69;
    //   565: goto -> 679
    //   568: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   571: athrow
    //   572: aload #10
    //   574: invokeinterface Zd1 : ()Ljava/lang/String;
    //   579: invokestatic Zv : (Ljava/lang/String;)Lburp/Zstu;
    //   582: invokestatic Zp : (Lburp/Zstu;)Lburp/Zx69;
    //   585: goto -> 679
    //   588: aload #10
    //   590: invokeinterface ZdC : ()[B
    //   595: invokestatic Zy : ([B)Lburp/Zyf;
    //   598: invokestatic Zp : (Lburp/Zstu;)Lburp/Zx69;
    //   601: goto -> 679
    //   604: aload #10
    //   606: invokeinterface ZdH : ()[B
    //   611: invokestatic Zy : ([B)Lburp/Zyf;
    //   614: invokestatic Zp : (Lburp/Zstu;)Lburp/Zx69;
    //   617: goto -> 679
    //   620: aload #10
    //   622: invokeinterface Zdq : ()Ljava/lang/String;
    //   627: invokestatic Zv : (Ljava/lang/String;)Lburp/Zstu;
    //   630: invokestatic Zp : (Lburp/Zstu;)Lburp/Zx69;
    //   633: goto -> 679
    //   636: aload #10
    //   638: invokeinterface Zda : ()I
    //   643: invokestatic valueOf : (I)Ljava/lang/String;
    //   646: invokestatic Za : (Ljava/lang/String;)Lburp/Zyf;
    //   649: invokestatic Zp : (Lburp/Zstu;)Lburp/Zx69;
    //   652: goto -> 679
    //   655: new java/lang/IllegalArgumentException
    //   658: dup
    //   659: aload_3
    //   660: sipush #-31179
    //   663: sipush #-20759
    //   666: invokestatic a : (II)Ljava/lang/String;
    //   669: swap
    //   670: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   675: invokespecial <init> : (Ljava/lang/String;)V
    //   678: athrow
    //   679: areturn
    // Exception table:
    //   from	to	target	type
    //   60	117	120	java/lang/IllegalArgumentException
    //   127	149	152	java/lang/IllegalArgumentException
    //   159	181	184	java/lang/IllegalArgumentException
    //   191	248	251	java/lang/IllegalArgumentException
    //   261	341	344	java/lang/IllegalArgumentException
    //   351	373	376	java/lang/IllegalArgumentException
    //   383	405	408	java/lang/IllegalArgumentException
    //   415	437	440	java/lang/IllegalArgumentException
    //   447	469	472	java/lang/IllegalArgumentException
    //   479	501	504	java/lang/IllegalArgumentException
    //   511	568	568	java/lang/IllegalArgumentException
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  static {
    // Byte code:
    //   0: bipush #23
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'r\\n\\bYX+¦ë\\nÓÈ]ýÊØZÃ'7Ðn®ÕéwV$¼fÐä4¿tuÙúù@L»ACJþþefJ÷=\\ndÏVúâ¶j\\bHõ<_î\\f,Ó:ÝÊXmÅö ßÃb|£c\\b¤êbqxM Ö÷/ó±|\\nN9Ã@{çmÈ$jZÏW¿ÄÔjWõC\\r v$y>~üx'4rÑy·,Þlí!¦VÙC\\rîÙwó'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #106
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 142
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
    //   67: ldc 'ç_\\f 2SóWA¬'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #6
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #25
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 142
    //   98: aload #5
    //   100: swap
    //   101: iload_3
    //   102: iinc #3, 1
    //   105: swap
    //   106: aastore
    //   107: iload_0
    //   108: iload_1
    //   109: iadd
    //   110: dup
    //   111: istore_0
    //   112: iload #4
    //   114: if_icmpge -> 126
    //   117: aload_2
    //   118: iload_0
    //   119: invokevirtual charAt : (I)C
    //   122: istore_1
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic burp/Zeqj.a : [Ljava/lang/String;
    //   131: bipush #23
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zeqj.b : [Ljava/lang/String;
    //   139: goto -> 300
    //   142: dup_x2
    //   143: pop
    //   144: invokevirtual toCharArray : ()[C
    //   147: dup_x1
    //   148: arraylength
    //   149: dup_x2
    //   150: pop
    //   151: iconst_0
    //   152: istore #6
    //   154: dup2_x1
    //   155: pop2
    //   156: dup_x2
    //   157: iconst_1
    //   158: if_icmpgt -> 260
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #16
    //   214: goto -> 244
    //   217: bipush #84
    //   219: goto -> 244
    //   222: bipush #43
    //   224: goto -> 244
    //   227: bipush #103
    //   229: goto -> 244
    //   232: bipush #105
    //   234: goto -> 244
    //   237: bipush #78
    //   239: goto -> 244
    //   242: bipush #56
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 165
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 161
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF8627) & 0xFFFF;
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
      char c = 'þ';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeqj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */