package net.portswigger;

import java.util.BitSet;
import java.util.EnumSet;

class Zz1 {
  private static Zfh ZAx(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    // Byte code:
    //   0: invokestatic Za : ()[Ljava/lang/String;
    //   3: aconst_null
    //   4: astore #4
    //   6: astore_3
    //   7: iload_0
    //   8: bipush #35
    //   10: if_icmpne -> 23
    //   13: aload_1
    //   14: bipush #58
    //   16: invokevirtual set : (I)V
    //   19: aload_3
    //   20: ifnonnull -> 348
    //   23: iload_0
    //   24: bipush #48
    //   26: if_icmplt -> 75
    //   29: iload_0
    //   30: bipush #57
    //   32: if_icmpgt -> 75
    //   35: aload_1
    //   36: bipush #99
    //   38: invokevirtual set : (I)V
    //   41: aload_1
    //   42: bipush #113
    //   44: invokevirtual set : (I)V
    //   47: aload_1
    //   48: bipush #69
    //   50: invokevirtual set : (I)V
    //   53: aload_1
    //   54: bipush #103
    //   56: invokevirtual set : (I)V
    //   59: aload_1
    //   60: bipush #81
    //   62: invokevirtual set : (I)V
    //   65: aload_1
    //   66: bipush #15
    //   68: invokevirtual set : (I)V
    //   71: aload_3
    //   72: ifnonnull -> 348
    //   75: iload_0
    //   76: bipush #97
    //   78: if_icmpne -> 91
    //   81: aload_1
    //   82: bipush #104
    //   84: invokevirtual set : (I)V
    //   87: aload_3
    //   88: ifnonnull -> 348
    //   91: iload_0
    //   92: bipush #99
    //   94: if_icmpne -> 113
    //   97: aload_1
    //   98: bipush #96
    //   100: invokevirtual set : (I)V
    //   103: aload_1
    //   104: bipush #42
    //   106: invokevirtual set : (I)V
    //   109: aload_3
    //   110: ifnonnull -> 348
    //   113: iload_0
    //   114: bipush #100
    //   116: if_icmpne -> 135
    //   119: aload_1
    //   120: bipush #64
    //   122: invokevirtual set : (I)V
    //   125: aload_1
    //   126: bipush #41
    //   128: invokevirtual set : (I)V
    //   131: aload_3
    //   132: ifnonnull -> 348
    //   135: iload_0
    //   136: bipush #101
    //   138: if_icmpne -> 157
    //   141: aload_1
    //   142: bipush #110
    //   144: invokevirtual set : (I)V
    //   147: aload_1
    //   148: bipush #117
    //   150: invokevirtual set : (I)V
    //   153: aload_3
    //   154: ifnonnull -> 348
    //   157: iload_0
    //   158: bipush #102
    //   160: if_icmpne -> 173
    //   163: aload_1
    //   164: bipush #93
    //   166: invokevirtual set : (I)V
    //   169: aload_3
    //   170: ifnonnull -> 348
    //   173: iload_0
    //   174: bipush #104
    //   176: if_icmpne -> 189
    //   179: aload_1
    //   180: bipush #98
    //   182: invokevirtual set : (I)V
    //   185: aload_3
    //   186: ifnonnull -> 348
    //   189: iload_0
    //   190: bipush #105
    //   192: if_icmpne -> 223
    //   195: aload_1
    //   196: bipush #80
    //   198: invokevirtual set : (I)V
    //   201: aload_1
    //   202: bipush #25
    //   204: invokevirtual set : (I)V
    //   207: aload_1
    //   208: bipush #12
    //   210: invokevirtual set : (I)V
    //   213: aload_1
    //   214: bipush #76
    //   216: invokevirtual set : (I)V
    //   219: aload_3
    //   220: ifnonnull -> 348
    //   223: iload_0
    //   224: bipush #108
    //   226: if_icmpne -> 239
    //   229: aload_1
    //   230: bipush #115
    //   232: invokevirtual set : (I)V
    //   235: aload_3
    //   236: ifnonnull -> 348
    //   239: iload_0
    //   240: bipush #109
    //   242: if_icmpne -> 261
    //   245: aload_1
    //   246: bipush #60
    //   248: invokevirtual set : (I)V
    //   251: aload_1
    //   252: bipush #85
    //   254: invokevirtual set : (I)V
    //   257: aload_3
    //   258: ifnonnull -> 348
    //   261: iload_0
    //   262: bipush #110
    //   264: if_icmpne -> 277
    //   267: aload_1
    //   268: bipush #32
    //   270: invokevirtual set : (I)V
    //   273: aload_3
    //   274: ifnonnull -> 348
    //   277: iload_0
    //   278: bipush #111
    //   280: if_icmpne -> 293
    //   283: aload_1
    //   284: bipush #70
    //   286: invokevirtual set : (I)V
    //   289: aload_3
    //   290: ifnonnull -> 348
    //   293: iload_0
    //   294: bipush #114
    //   296: if_icmpne -> 315
    //   299: aload_1
    //   300: bipush #17
    //   302: invokevirtual set : (I)V
    //   305: aload_1
    //   306: bipush #29
    //   308: invokevirtual set : (I)V
    //   311: aload_3
    //   312: ifnonnull -> 348
    //   315: iload_0
    //   316: bipush #115
    //   318: if_icmpne -> 331
    //   321: aload_1
    //   322: bipush #94
    //   324: invokevirtual set : (I)V
    //   327: aload_3
    //   328: ifnonnull -> 348
    //   331: iload_0
    //   332: bipush #116
    //   334: if_icmpne -> 348
    //   337: aload_1
    //   338: bipush #78
    //   340: invokevirtual set : (I)V
    //   343: aload_1
    //   344: iconst_4
    //   345: invokevirtual set : (I)V
    //   348: iload_0
    //   349: bipush #65
    //   351: if_icmplt -> 360
    //   354: iload_0
    //   355: bipush #90
    //   357: if_icmple -> 378
    //   360: iload_0
    //   361: bipush #95
    //   363: if_icmpeq -> 378
    //   366: iload_0
    //   367: bipush #97
    //   369: if_icmplt -> 399
    //   372: iload_0
    //   373: bipush #122
    //   375: if_icmpgt -> 399
    //   378: aload_1
    //   379: bipush #100
    //   381: invokevirtual set : (I)V
    //   384: aload_2
    //   385: getstatic net/portswigger/Zfh.UNKNOWN_STRING : Lnet/portswigger/Zfh;
    //   388: invokevirtual contains : (Ljava/lang/Object;)Z
    //   391: ifeq -> 399
    //   394: getstatic net/portswigger/Zfh.UNKNOWN_STRING : Lnet/portswigger/Zfh;
    //   397: astore #4
    //   399: iload_0
    //   400: iflt -> 418
    //   403: aload_2
    //   404: getstatic net/portswigger/Zfh.UNKNOWN : Lnet/portswigger/Zfh;
    //   407: invokevirtual contains : (Ljava/lang/Object;)Z
    //   410: ifeq -> 418
    //   413: getstatic net/portswigger/Zfh.UNKNOWN : Lnet/portswigger/Zfh;
    //   416: astore #4
    //   418: iload_0
    //   419: bipush #46
    //   421: if_icmpne -> 443
    //   424: aload_2
    //   425: getstatic net/portswigger/Zfh.DOT : Lnet/portswigger/Zfh;
    //   428: invokevirtual contains : (Ljava/lang/Object;)Z
    //   431: ifeq -> 801
    //   434: getstatic net/portswigger/Zfh.DOT : Lnet/portswigger/Zfh;
    //   437: astore #4
    //   439: aload_3
    //   440: ifnonnull -> 801
    //   443: iload_0
    //   444: bipush #58
    //   446: if_icmpne -> 468
    //   449: aload_2
    //   450: getstatic net/portswigger/Zfh.COLON : Lnet/portswigger/Zfh;
    //   453: invokevirtual contains : (Ljava/lang/Object;)Z
    //   456: ifeq -> 801
    //   459: getstatic net/portswigger/Zfh.COLON : Lnet/portswigger/Zfh;
    //   462: astore #4
    //   464: aload_3
    //   465: ifnonnull -> 801
    //   468: iload_0
    //   469: bipush #123
    //   471: if_icmpne -> 493
    //   474: aload_2
    //   475: getstatic net/portswigger/Zfh.VARIABLE_START : Lnet/portswigger/Zfh;
    //   478: invokevirtual contains : (Ljava/lang/Object;)Z
    //   481: ifeq -> 801
    //   484: getstatic net/portswigger/Zfh.VARIABLE_START : Lnet/portswigger/Zfh;
    //   487: astore #4
    //   489: aload_3
    //   490: ifnonnull -> 801
    //   493: iload_0
    //   494: bipush #44
    //   496: if_icmpne -> 518
    //   499: aload_2
    //   500: getstatic net/portswigger/Zfh.COMMA : Lnet/portswigger/Zfh;
    //   503: invokevirtual contains : (Ljava/lang/Object;)Z
    //   506: ifeq -> 801
    //   509: getstatic net/portswigger/Zfh.COMMA : Lnet/portswigger/Zfh;
    //   512: astore #4
    //   514: aload_3
    //   515: ifnonnull -> 801
    //   518: iload_0
    //   519: bipush #48
    //   521: if_icmplt -> 549
    //   524: iload_0
    //   525: bipush #57
    //   527: if_icmpgt -> 549
    //   530: aload_2
    //   531: getstatic net/portswigger/Zfh.NATURAL_NUMBER : Lnet/portswigger/Zfh;
    //   534: invokevirtual contains : (Ljava/lang/Object;)Z
    //   537: ifeq -> 801
    //   540: getstatic net/portswigger/Zfh.NATURAL_NUMBER : Lnet/portswigger/Zfh;
    //   543: astore #4
    //   545: aload_3
    //   546: ifnonnull -> 801
    //   549: iload_0
    //   550: bipush #41
    //   552: if_icmpne -> 574
    //   555: aload_2
    //   556: getstatic net/portswigger/Zfh.CLOSE_BRACKET : Lnet/portswigger/Zfh;
    //   559: invokevirtual contains : (Ljava/lang/Object;)Z
    //   562: ifeq -> 801
    //   565: getstatic net/portswigger/Zfh.CLOSE_BRACKET : Lnet/portswigger/Zfh;
    //   568: astore #4
    //   570: aload_3
    //   571: ifnonnull -> 801
    //   574: iload_0
    //   575: bipush #40
    //   577: if_icmpne -> 599
    //   580: aload_2
    //   581: getstatic net/portswigger/Zfh.OPEN_BRACKET : Lnet/portswigger/Zfh;
    //   584: invokevirtual contains : (Ljava/lang/Object;)Z
    //   587: ifeq -> 801
    //   590: getstatic net/portswigger/Zfh.OPEN_BRACKET : Lnet/portswigger/Zfh;
    //   593: astore #4
    //   595: aload_3
    //   596: ifnonnull -> 801
    //   599: iload_0
    //   600: bipush #34
    //   602: if_icmpne -> 624
    //   605: aload_2
    //   606: getstatic net/portswigger/Zfh.LITERAL_STRING_OPENING_QUOTE : Lnet/portswigger/Zfh;
    //   609: invokevirtual contains : (Ljava/lang/Object;)Z
    //   612: ifeq -> 801
    //   615: getstatic net/portswigger/Zfh.LITERAL_STRING_OPENING_QUOTE : Lnet/portswigger/Zfh;
    //   618: astore #4
    //   620: aload_3
    //   621: ifnonnull -> 801
    //   624: iload_0
    //   625: bipush #96
    //   627: if_icmpne -> 649
    //   630: aload_2
    //   631: getstatic net/portswigger/Zfh.INTERPOLATABLE_STRING_OPENING_QUOTE : Lnet/portswigger/Zfh;
    //   634: invokevirtual contains : (Ljava/lang/Object;)Z
    //   637: ifeq -> 801
    //   640: getstatic net/portswigger/Zfh.INTERPOLATABLE_STRING_OPENING_QUOTE : Lnet/portswigger/Zfh;
    //   643: astore #4
    //   645: aload_3
    //   646: ifnonnull -> 801
    //   649: iload_0
    //   650: bipush #10
    //   652: if_icmpne -> 674
    //   655: aload_2
    //   656: getstatic net/portswigger/Zfh.NEWLINE : Lnet/portswigger/Zfh;
    //   659: invokevirtual contains : (Ljava/lang/Object;)Z
    //   662: ifeq -> 801
    //   665: getstatic net/portswigger/Zfh.NEWLINE : Lnet/portswigger/Zfh;
    //   668: astore #4
    //   670: aload_3
    //   671: ifnonnull -> 801
    //   674: iload_0
    //   675: bipush #35
    //   677: if_icmpne -> 705
    //   680: aload_1
    //   681: bipush #45
    //   683: invokevirtual set : (I)V
    //   686: aload_2
    //   687: getstatic net/portswigger/Zfh.COMMENT : Lnet/portswigger/Zfh;
    //   690: invokevirtual contains : (Ljava/lang/Object;)Z
    //   693: ifeq -> 801
    //   696: getstatic net/portswigger/Zfh.COMMENT : Lnet/portswigger/Zfh;
    //   699: astore #4
    //   701: aload_3
    //   702: ifnonnull -> 801
    //   705: iload_0
    //   706: bipush #12
    //   708: if_icmpne -> 730
    //   711: aload_2
    //   712: getstatic net/portswigger/Zfh._TOKEN_4 : Lnet/portswigger/Zfh;
    //   715: invokevirtual contains : (Ljava/lang/Object;)Z
    //   718: ifeq -> 801
    //   721: getstatic net/portswigger/Zfh._TOKEN_4 : Lnet/portswigger/Zfh;
    //   724: astore #4
    //   726: aload_3
    //   727: ifnonnull -> 801
    //   730: iload_0
    //   731: bipush #13
    //   733: if_icmpne -> 755
    //   736: aload_2
    //   737: getstatic net/portswigger/Zfh._TOKEN_3 : Lnet/portswigger/Zfh;
    //   740: invokevirtual contains : (Ljava/lang/Object;)Z
    //   743: ifeq -> 801
    //   746: getstatic net/portswigger/Zfh._TOKEN_3 : Lnet/portswigger/Zfh;
    //   749: astore #4
    //   751: aload_3
    //   752: ifnonnull -> 801
    //   755: iload_0
    //   756: bipush #9
    //   758: if_icmpne -> 780
    //   761: aload_2
    //   762: getstatic net/portswigger/Zfh._TOKEN_2 : Lnet/portswigger/Zfh;
    //   765: invokevirtual contains : (Ljava/lang/Object;)Z
    //   768: ifeq -> 801
    //   771: getstatic net/portswigger/Zfh._TOKEN_2 : Lnet/portswigger/Zfh;
    //   774: astore #4
    //   776: aload_3
    //   777: ifnonnull -> 801
    //   780: iload_0
    //   781: bipush #32
    //   783: if_icmpne -> 801
    //   786: aload_2
    //   787: getstatic net/portswigger/Zfh._TOKEN_1 : Lnet/portswigger/Zfh;
    //   790: invokevirtual contains : (Ljava/lang/Object;)Z
    //   793: ifeq -> 801
    //   796: getstatic net/portswigger/Zfh._TOKEN_1 : Lnet/portswigger/Zfh;
    //   799: astore #4
    //   801: aload #4
    //   803: areturn
  }
  
  private static Zfh Zu(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 110)
      paramBitSet.set(19); 
    return zfh;
  }
  
  private static Zfh ZAQ(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 102)
      paramBitSet.set(86); 
    return zfh;
  }
  
  private static Zfh Zs(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 114)
      paramBitSet.set(92); 
    return zfh;
  }
  
  private static Zfh ZAf(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 104)
      paramBitSet.set(95); 
    return zfh;
  }
  
  private static Zfh ZY(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 105)
      paramBitSet.set(22); 
    return zfh;
  }
  
  private static Zfh Zm(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 105)
      paramBitSet.set(26); 
    return zfh;
  }
  
  private static Zfh Zt(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 116)
      paramBitSet.set(21); 
    return zfh;
  }
  
  private static Zfh ZAi(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 105)
      paramBitSet.set(88); 
    return zfh;
  }
  
  private static Zfh ZB(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 10 && paramEnumSet.contains(Zfh._TOKEN_5))
      zfh = Zfh._TOKEN_5; 
    return zfh;
  }
  
  private static Zfh ZAH(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 109 && paramEnumSet.contains(Zfh.DIFFERS_FROM_KEY))
      zfh = Zfh.DIFFERS_FROM_KEY; 
    return zfh;
  }
  
  private static Zfh ZAg(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 97)
      paramBitSet.set(59); 
    return zfh;
  }
  
  private static Zfh Zb(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 102 && paramEnumSet.contains(Zfh.IF_HEADER))
      zfh = Zfh.IF_HEADER; 
    return zfh;
  }
  
  private static Zfh ZAt(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 100)
      paramBitSet.set(108); 
    return zfh;
  }
  
  private static Zfh ZAq(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 117)
      paramBitSet.set(82); 
    return zfh;
  }
  
  private static Zfh Zj(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt >= 48 && paramInt <= 57) {
      paramBitSet.set(81);
      paramBitSet.set(99);
      paramBitSet.set(103);
      paramBitSet.set(113);
      paramBitSet.set(69);
      if (paramEnumSet.contains(Zfh.NATURAL_NUMBER))
        zfh = Zfh.NATURAL_NUMBER; 
    } 
    return zfh;
  }
  
  private static Zfh Zp(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 111)
      paramBitSet.set(10); 
    return zfh;
  }
  
  private static Zfh ZA2(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101)
      paramBitSet.set(83); 
    return zfh;
  }
  
  private static Zfh Zw(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 105)
      paramBitSet.set(118); 
    return zfh;
  }
  
  private static Zfh ZnX(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 99)
      paramBitSet.set(57); 
    return zfh;
  }
  
  private static Zfh ZAs(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 32)
      paramBitSet.set(54); 
    return zfh;
  }
  
  private static Zfh Zl(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 97)
      paramBitSet.set(35); 
    return zfh;
  }
  
  private static Zfh ZAu(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 118)
      paramBitSet.set(56); 
    return zfh;
  }
  
  private static Zfh ZP(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 110 && paramEnumSet.contains(Zfh.CERTAIN_CONFIDENCE))
      zfh = Zfh.CERTAIN_CONFIDENCE; 
    return zfh;
  }
  
  private static Zfh ZAU(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101)
      paramBitSet.set(13); 
    return zfh;
  }
  
  private static Zfh ZAN(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 115 && paramEnumSet.contains(Zfh.IS_KEY))
      zfh = Zfh.IS_KEY; 
    return zfh;
  }
  
  private static Zfh Zq(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 116)
      paramBitSet.set(52); 
    return zfh;
  }
  
  private static Zfh Z_(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 102 && paramEnumSet.contains(Zfh.IF_FOOTER))
      zfh = Zfh.IF_FOOTER; 
    return zfh;
  }
  
  private static Zfh Zf(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 110 && paramEnumSet.contains(Zfh.REMEDIATION_HEADER))
      zfh = Zfh.REMEDIATION_HEADER; 
    return zfh;
  }
  
  private static Zfh ZI(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101)
      paramBitSet.set(53); 
    return zfh;
  }
  
  private static Zfh ZAw(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 114)
      paramBitSet.set(16); 
    return zfh;
  }
  
  private static Zfh Zr(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 105)
      paramBitSet.set(40); 
    return zfh;
  }
  
  private static Zfh ZAl(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 111)
      paramBitSet.set(65); 
    return zfh;
  }
  
  private static Zfh Zg(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 119 && paramEnumSet.contains(Zfh.LOW_SEVERITY))
      zfh = Zfh.LOW_SEVERITY; 
    return zfh;
  }
  
  private static Zfh ZAv(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 115)
      paramBitSet.set(111); 
    return zfh;
  }
  
  private static Zfh ZJ(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 116)
      paramBitSet.set(5); 
    return zfh;
  }
  
  private static Zfh ZAO(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 100)
      paramBitSet.set(8); 
    return zfh;
  }
  
  private static Zfh ZA_(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 114)
      paramBitSet.set(79); 
    return zfh;
  }
  
  private static Zfh ZK(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 97)
      paramBitSet.set(116); 
    return zfh;
  }
  
  private static Zfh ZAM(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 100)
      paramBitSet.set(47); 
    return zfh;
  }
  
  private static Zfh ZAV(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 108 && paramEnumSet.contains(Zfh.DETAIL_HEADER))
      zfh = Zfh.DETAIL_HEADER; 
    return zfh;
  }
  
  private static Zfh Zx(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101)
      paramBitSet.set(67); 
    return zfh;
  }
  
  private static Zfh ZAy(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101)
      paramBitSet.set(106); 
    return zfh;
  }
  
  private static Zfh ZR(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101)
      paramBitSet.set(3); 
    return zfh;
  }
  
  private static Zfh ZA5(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 116)
      paramBitSet.set(11); 
    return zfh;
  }
  
  private static Zfh ZD(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if ((paramInt >= 0 && paramInt <= 9) || paramInt == 11 || paramInt == 12 || paramInt >= 14) {
      paramBitSet.set(45);
      if (paramEnumSet.contains(Zfh.COMMENT))
        zfh = Zfh.COMMENT; 
    } 
    return zfh;
  }
  
  private static Zfh ZAX(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 102)
      paramBitSet.set(18); 
    return zfh;
  }
  
  private static Zfh ZV(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 32)
      paramBitSet.set(97); 
    return zfh;
  }
  
  private static Zfh Zh(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 102)
      paramBitSet.set(43); 
    return zfh;
  }
  
  private static Zfh ZAT(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 114)
      paramBitSet.set(6); 
    return zfh;
  }
  
  private static Zfh ZA6(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 105)
      paramBitSet.set(107); 
    return zfh;
  }
  
  private static Zfh Znv(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 105)
      paramBitSet.set(105); 
    return zfh;
  }
  
  private static Zfh ZAL(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 121 && paramEnumSet.contains(Zfh.SEVERITY_HEADER))
      zfh = Zfh.SEVERITY_HEADER; 
    return zfh;
  }
  
  private static Zfh ZU(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 109)
      paramBitSet.set(24); 
    return zfh;
  }
  
  private static Zfh ZA4(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 102)
      paramBitSet.set(30); 
    return zfh;
  }
  
  private static Zfh ZAz(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 99)
      paramBitSet.set(77); 
    return zfh;
  }
  
  private static Zfh ZAC(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101 && paramEnumSet.contains(Zfh.TENTATIVE_CONFIDENCE))
      zfh = Zfh.TENTATIVE_CONFIDENCE; 
    return zfh;
  }
  
  private static Zfh Zz(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101 && paramEnumSet.contains(Zfh.CONFIDENCE_HEADER))
      zfh = Zfh.CONFIDENCE_HEADER; 
    return zfh;
  }
  
  private static Zfh ZF(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    // Byte code:
    //   0: invokestatic Za : ()[Ljava/lang/String;
    //   3: aconst_null
    //   4: astore #4
    //   6: astore_3
    //   7: iload_0
    //   8: iflt -> 17
    //   11: iload_0
    //   12: bipush #9
    //   14: if_icmple -> 35
    //   17: iload_0
    //   18: bipush #11
    //   20: if_icmpeq -> 35
    //   23: iload_0
    //   24: bipush #12
    //   26: if_icmpeq -> 35
    //   29: iload_0
    //   30: bipush #14
    //   32: if_icmplt -> 45
    //   35: aload_1
    //   36: bipush #58
    //   38: invokevirtual set : (I)V
    //   41: aload_3
    //   42: ifnonnull -> 82
    //   45: iload_0
    //   46: bipush #13
    //   48: if_icmpne -> 61
    //   51: aload_1
    //   52: bipush #9
    //   54: invokevirtual set : (I)V
    //   57: aload_3
    //   58: ifnonnull -> 82
    //   61: iload_0
    //   62: bipush #10
    //   64: if_icmpne -> 82
    //   67: aload_2
    //   68: getstatic net/portswigger/Zfh._TOKEN_5 : Lnet/portswigger/Zfh;
    //   71: invokevirtual contains : (Ljava/lang/Object;)Z
    //   74: ifeq -> 82
    //   77: getstatic net/portswigger/Zfh._TOKEN_5 : Lnet/portswigger/Zfh;
    //   80: astore #4
    //   82: iload_0
    //   83: bipush #13
    //   85: if_icmpne -> 103
    //   88: aload_2
    //   89: getstatic net/portswigger/Zfh._TOKEN_5 : Lnet/portswigger/Zfh;
    //   92: invokevirtual contains : (Ljava/lang/Object;)Z
    //   95: ifeq -> 103
    //   98: getstatic net/portswigger/Zfh._TOKEN_5 : Lnet/portswigger/Zfh;
    //   101: astore #4
    //   103: aload #4
    //   105: areturn
  }
  
  private static Zfh ZS(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 105)
      paramBitSet.set(23); 
    return zfh;
  }
  
  private static Zfh ZAS(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101)
      paramBitSet.set(36); 
    return zfh;
  }
  
  private static Zfh ZO(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 103)
      paramBitSet.set(71); 
    return zfh;
  }
  
  private static Zfh Zk(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101)
      paramBitSet.set(1); 
    return zfh;
  }
  
  private static Zfh ZT(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 118)
      paramBitSet.set(102); 
    return zfh;
  }
  
  private static Zfh ZA7(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 105)
      paramBitSet.set(89); 
    return zfh;
  }
  
  private static Zfh ZAI(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 116 && paramEnumSet.contains(Zfh.BOOL_NOT))
      zfh = Zfh.BOOL_NOT; 
    return zfh;
  }
  
  private static Zfh ZAE(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 110)
      paramBitSet.set(7); 
    return zfh;
  }
  
  private static Zfh Zv(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 116)
      paramBitSet.set(75); 
    return zfh;
  }
  
  private static Zfh ZAn(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 110)
      paramBitSet.set(46); 
    return zfh;
  }
  
  private static Zfh Za(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt >= 48 && paramInt <= 57 && paramEnumSet.contains(Zfh.NATURAL_NUMBER))
      zfh = Zfh.NATURAL_NUMBER; 
    return zfh;
  }
  
  private static Zfh ZAa(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 114 && paramEnumSet.contains(Zfh.BOOL_OR))
      zfh = Zfh.BOOL_OR; 
    return zfh;
  }
  
  private static Zfh ZG(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 104 && paramEnumSet.contains(Zfh.HIGH_SEVERITY))
      zfh = Zfh.HIGH_SEVERITY; 
    return zfh;
  }
  
  private static Zfh ZAk(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 32)
      paramBitSet.set(50); 
    return zfh;
  }
  
  private static Zfh ZH(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 111)
      paramBitSet.set(37); 
    return zfh;
  }
  
  private static Zfh Zc(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101)
      paramBitSet.set(84); 
    return zfh;
  }
  
  private static Zfh ZAA(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 97)
      paramBitSet.set(31); 
    return zfh;
  }
  
  private static Zfh ZM(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 110 && paramEnumSet.contains(Zfh.IN_KEY))
      zfh = Zfh.IN_KEY; 
    return zfh;
  }
  
  private static Zfh ZAd(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 104)
      paramBitSet.set(74); 
    return zfh;
  }
  
  private static Zfh ZQ(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101)
      paramBitSet.set(66); 
    return zfh;
  }
  
  private static Zfh ZW(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 116)
      paramBitSet.set(72); 
    return zfh;
  }
  
  private static Zfh ZAY(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 110)
      paramBitSet.set(2); 
    return zfh;
  }
  
  private static Zfh ZAc(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt >= 48 && paramInt <= 57) {
      paramBitSet.set(99);
      paramBitSet.set(103);
      paramBitSet.set(113);
      paramBitSet.set(69);
      if (paramEnumSet.contains(Zfh.NATURAL_NUMBER))
        zfh = Zfh.NATURAL_NUMBER; 
    } 
    return zfh;
  }
  
  private static Zfh Zd(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101 && paramEnumSet.contains(Zfh.REPORT_ISSUE_HEADER))
      zfh = Zfh.REPORT_ISSUE_HEADER; 
    return zfh;
  }
  
  private static Zfh Zo(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 112)
      paramBitSet.set(73); 
    return zfh;
  }
  
  private static Zfh ZAp(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 115 && paramEnumSet.contains(Zfh.MATCHES_KEY))
      zfh = Zfh.MATCHES_KEY; 
    return zfh;
  }
  
  private static Zfh ZL(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 97)
      paramBitSet.set(114); 
    return zfh;
  }
  
  private static Zfh ZAB(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 111 && paramEnumSet.contains(Zfh.INFO_SEVERITY))
      zfh = Zfh.INFO_SEVERITY; 
    return zfh;
  }
  
  private static Zfh ZA0(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 115)
      paramBitSet.set(14); 
    return zfh;
  }
  
  private static Zfh ZN(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 117)
      paramBitSet.set(91); 
    return zfh;
  }
  
  private static Zfh ZAJ(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 102)
      paramBitSet.set(48); 
    return zfh;
  }
  
  private static Zfh ZA9(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 110 && paramEnumSet.contains(Zfh.THEN))
      zfh = Zfh.THEN; 
    return zfh;
  }
  
  private static Zfh Zy(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 109 && paramEnumSet.contains(Zfh.MEDIUM_SEVERITY))
      zfh = Zfh.MEDIUM_SEVERITY; 
    return zfh;
  }
  
  private static Zfh ZAD(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 115)
      paramBitSet.set(20); 
    return zfh;
  }
  
  private static Zfh ZAW(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 105)
      paramBitSet.set(109); 
    return zfh;
  }
  
  private static Zfh ZAP(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101)
      paramBitSet.set(63); 
    return zfh;
  }
  
  private static Zfh Ze(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101)
      paramBitSet.set(90); 
    return zfh;
  }
  
  private static Zfh ZnJ(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 111)
      paramBitSet.set(68); 
    return zfh;
  }
  
  private static Zfh ZAo(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 105)
      paramBitSet.set(27); 
    return zfh;
  }
  
  private static Zfh ZAr(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 105)
      paramBitSet.set(61); 
    return zfh;
  }
  
  private static Zfh ZE(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt >= 48 && paramInt <= 57) {
      paramBitSet.set(113);
      paramBitSet.set(69);
      if (paramEnumSet.contains(Zfh.NATURAL_NUMBER))
        zfh = Zfh.NATURAL_NUMBER; 
    } 
    return zfh;
  }
  
  private static Zfh ZAR(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt >= 48 && paramInt <= 57) {
      paramBitSet.set(100);
      if (paramEnumSet.contains(Zfh.UNKNOWN_STRING))
        zfh = Zfh.UNKNOWN_STRING; 
    } else if ((paramInt >= 65 && paramInt <= 90) || paramInt == 95 || (paramInt >= 97 && paramInt <= 122)) {
      paramBitSet.set(100);
      if (paramEnumSet.contains(Zfh.UNKNOWN_STRING))
        zfh = Zfh.UNKNOWN_STRING; 
    } 
    return zfh;
  }
  
  private static Zfh ZX(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 100 && paramEnumSet.contains(Zfh.BOOL_AND))
      zfh = Zfh.BOOL_AND; 
    return zfh;
  }
  
  private static Zfh ZAK(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101)
      paramBitSet.set(49); 
    return zfh;
  }
  
  private static Zfh ZA8(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt >= 48 && paramInt <= 57) {
      paramBitSet.set(99);
      paramBitSet.set(113);
      paramBitSet.set(69);
      if (paramEnumSet.contains(Zfh.NATURAL_NUMBER))
        zfh = Zfh.NATURAL_NUMBER; 
    } 
    return zfh;
  }
  
  private static Zfh ZAZ(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 110)
      paramBitSet.set(101); 
    return zfh;
  }
  
  private static Zfh ZA(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 111)
      paramBitSet.set(28); 
    return zfh;
  }
  
  private static Zfh ZAj(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 114)
      paramBitSet.set(44); 
    return zfh;
  }
  
  private static Zfh ZC(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 115)
      paramBitSet.set(87); 
    return zfh;
  }
  
  private static Zfh ZAh(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 105)
      paramBitSet.set(38); 
    return zfh;
  }
  
  private static Zfh ZAF(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 114)
      paramBitSet.set(112); 
    return zfh;
  }
  
  private static Zfh Zn(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 108)
      paramBitSet.set(34); 
    return zfh;
  }
  
  private static Zfh ZAm(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101 && paramEnumSet.contains(Zfh.ELSE_HEADER))
      zfh = Zfh.ELSE_HEADER; 
    return zfh;
  }
  
  private static Zfh ZA3(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 109 && paramEnumSet.contains(Zfh.FIRM_CONFIDENCE))
      zfh = Zfh.FIRM_CONFIDENCE; 
    return zfh;
  }
  
  private static Zfh ZAG(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt >= 48 && paramInt <= 57) {
      paramBitSet.set(69);
      if (paramEnumSet.contains(Zfh.NATURAL_NUMBER))
        zfh = Zfh.NATURAL_NUMBER; 
    } 
    return zfh;
  }
  
  private static Zfh ZAe(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 116)
      paramBitSet.set(55); 
    return zfh;
  }
  
  private static Zfh ZZ(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 111)
      paramBitSet.set(33); 
    return zfh;
  }
  
  private static Zfh Zi(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 116)
      paramBitSet.set(51); 
    return zfh;
  }
  
  private static Zfh ZAb(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 110)
      paramBitSet.set(39); 
    return zfh;
  }
  
  private static Zfh ZA1(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 100)
      paramBitSet.set(62); 
    return zfh;
  }
  
  private static void ZO() {
    Zfw[] arrayOfZfw = { 
        Zz1::ZAx, Zz1::Zu, Zz1::ZAQ, Zz1::Zs, Zz1::ZAf, Zz1::ZY, Zz1::Zm, Zz1::Zt, Zz1::ZAi, Zz1::ZB, 
        Zz1::ZAH, Zz1::ZAg, Zz1::Zb, Zz1::ZAt, Zz1::ZAq, Zz1::Zj, Zz1::Zp, Zz1::ZA2, Zz1::Zw, Zz1::ZnX, 
        Zz1::ZAs, Zz1::Zl, Zz1::ZAu, Zz1::ZP, Zz1::ZAU, Zz1::ZAN, Zz1::Zq, Zz1::Z_, Zz1::Zf, Zz1::ZI, 
        Zz1::ZAw, Zz1::Zr, Zz1::ZAl, Zz1::Zg, Zz1::ZAv, Zz1::ZJ, Zz1::ZAO, Zz1::ZA_, Zz1::ZK, Zz1::ZAM, 
        Zz1::ZAV, Zz1::Zx, Zz1::ZAy, Zz1::ZR, Zz1::ZA5, Zz1::ZD, Zz1::ZAX, Zz1::ZV, Zz1::Zh, Zz1::ZAT, 
        Zz1::ZA6, Zz1::Znv, Zz1::ZAL, Zz1::ZU, Zz1::ZA4, Zz1::ZAz, Zz1::ZAC, Zz1::Zz, Zz1::ZF, Zz1::ZS, 
        Zz1::ZAS, Zz1::ZO, Zz1::Zk, Zz1::ZT, Zz1::ZA7, Zz1::ZAI, Zz1::ZAE, Zz1::Zv, Zz1::ZAn, Zz1::Za, 
        Zz1::ZAa, Zz1::ZG, Zz1::ZAk, Zz1::ZH, Zz1::Zc, Zz1::ZAA, Zz1::ZM, Zz1::ZAd, Zz1::ZQ, Zz1::ZW, 
        Zz1::ZAY, Zz1::ZAc, Zz1::Zd, Zz1::Zo, Zz1::ZAp, Zz1::ZL, Zz1::ZAB, Zz1::ZA0, Zz1::ZN, Zz1::ZAJ, 
        Zz1::ZA9, Zz1::Zy, Zz1::ZAD, Zz1::ZAW, Zz1::ZAP, Zz1::Ze, Zz1::ZnJ, Zz1::ZAo, Zz1::ZAr, Zz1::ZE, 
        Zz1::ZAR, Zz1::ZX, Zz1::ZAK, Zz1::ZA8, Zz1::ZAZ, Zz1::ZA, Zz1::ZAj, Zz1::ZC, Zz1::ZAh, Zz1::ZAF, 
        Zz1::Zn, Zz1::ZAm, Zz1::ZA3, Zz1::ZAG, Zz1::ZAe, Zz1::ZZ, Zz1::Zi, Zz1::ZAb, Zz1::ZA1 };
    Zuk.ZC.put(Zzv.PassiveCheck, arrayOfZfw);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zz1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */