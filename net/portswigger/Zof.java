package net.portswigger;

import java.util.BitSet;
import java.util.EnumSet;

class Zof {
  private static Zfh Zp(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    // Byte code:
    //   0: invokestatic Za : ()[Ljava/lang/String;
    //   3: aconst_null
    //   4: astore #4
    //   6: astore_3
    //   7: iload_0
    //   8: bipush #35
    //   10: if_icmpne -> 24
    //   13: aload_1
    //   14: sipush #132
    //   17: invokevirtual set : (I)V
    //   20: aload_3
    //   21: ifnonnull -> 333
    //   24: iload_0
    //   25: bipush #48
    //   27: if_icmplt -> 76
    //   30: iload_0
    //   31: bipush #57
    //   33: if_icmpgt -> 76
    //   36: aload_1
    //   37: bipush #120
    //   39: invokevirtual set : (I)V
    //   42: aload_1
    //   43: bipush #102
    //   45: invokevirtual set : (I)V
    //   48: aload_1
    //   49: bipush #33
    //   51: invokevirtual set : (I)V
    //   54: aload_1
    //   55: bipush #112
    //   57: invokevirtual set : (I)V
    //   60: aload_1
    //   61: bipush #49
    //   63: invokevirtual set : (I)V
    //   66: aload_1
    //   67: bipush #24
    //   69: invokevirtual set : (I)V
    //   72: aload_3
    //   73: ifnonnull -> 333
    //   76: iload_0
    //   77: bipush #98
    //   79: if_icmpne -> 105
    //   82: aload_1
    //   83: bipush #31
    //   85: invokevirtual set : (I)V
    //   88: aload_1
    //   89: bipush #46
    //   91: invokevirtual set : (I)V
    //   94: aload_1
    //   95: sipush #133
    //   98: invokevirtual set : (I)V
    //   101: aload_3
    //   102: ifnonnull -> 333
    //   105: iload_0
    //   106: bipush #102
    //   108: if_icmpne -> 121
    //   111: aload_1
    //   112: bipush #84
    //   114: invokevirtual set : (I)V
    //   117: aload_3
    //   118: ifnonnull -> 333
    //   121: iload_0
    //   122: bipush #103
    //   124: if_icmpne -> 138
    //   127: aload_1
    //   128: sipush #170
    //   131: invokevirtual set : (I)V
    //   134: aload_3
    //   135: ifnonnull -> 333
    //   138: iload_0
    //   139: bipush #104
    //   141: if_icmpne -> 167
    //   144: aload_1
    //   145: bipush #44
    //   147: invokevirtual set : (I)V
    //   150: aload_1
    //   151: sipush #140
    //   154: invokevirtual set : (I)V
    //   157: aload_1
    //   158: bipush #117
    //   160: invokevirtual set : (I)V
    //   163: aload_3
    //   164: ifnonnull -> 333
    //   167: iload_0
    //   168: bipush #109
    //   170: if_icmpne -> 189
    //   173: aload_1
    //   174: bipush #53
    //   176: invokevirtual set : (I)V
    //   179: aload_1
    //   180: bipush #125
    //   182: invokevirtual set : (I)V
    //   185: aload_3
    //   186: ifnonnull -> 333
    //   189: iload_0
    //   190: bipush #112
    //   192: if_icmpne -> 217
    //   195: aload_1
    //   196: bipush #22
    //   198: invokevirtual set : (I)V
    //   201: aload_1
    //   202: bipush #27
    //   204: invokevirtual set : (I)V
    //   207: aload_1
    //   208: bipush #98
    //   210: invokevirtual set : (I)V
    //   213: aload_3
    //   214: ifnonnull -> 333
    //   217: iload_0
    //   218: bipush #113
    //   220: if_icmpne -> 233
    //   223: aload_1
    //   224: bipush #64
    //   226: invokevirtual set : (I)V
    //   229: aload_3
    //   230: ifnonnull -> 333
    //   233: iload_0
    //   234: bipush #114
    //   236: if_icmpne -> 268
    //   239: aload_1
    //   240: bipush #10
    //   242: invokevirtual set : (I)V
    //   245: aload_1
    //   246: sipush #173
    //   249: invokevirtual set : (I)V
    //   252: aload_1
    //   253: bipush #87
    //   255: invokevirtual set : (I)V
    //   258: aload_1
    //   259: bipush #82
    //   261: invokevirtual set : (I)V
    //   264: aload_3
    //   265: ifnonnull -> 333
    //   268: iload_0
    //   269: bipush #115
    //   271: if_icmpne -> 299
    //   274: aload_1
    //   275: sipush #157
    //   278: invokevirtual set : (I)V
    //   281: aload_1
    //   282: sipush #175
    //   285: invokevirtual set : (I)V
    //   288: aload_1
    //   289: sipush #135
    //   292: invokevirtual set : (I)V
    //   295: aload_3
    //   296: ifnonnull -> 333
    //   299: iload_0
    //   300: bipush #116
    //   302: if_icmpne -> 321
    //   305: aload_1
    //   306: bipush #20
    //   308: invokevirtual set : (I)V
    //   311: aload_1
    //   312: bipush #73
    //   314: invokevirtual set : (I)V
    //   317: aload_3
    //   318: ifnonnull -> 333
    //   321: iload_0
    //   322: bipush #117
    //   324: if_icmpne -> 333
    //   327: aload_1
    //   328: bipush #52
    //   330: invokevirtual set : (I)V
    //   333: iload_0
    //   334: bipush #65
    //   336: if_icmplt -> 345
    //   339: iload_0
    //   340: bipush #90
    //   342: if_icmple -> 363
    //   345: iload_0
    //   346: bipush #95
    //   348: if_icmpeq -> 363
    //   351: iload_0
    //   352: bipush #97
    //   354: if_icmplt -> 384
    //   357: iload_0
    //   358: bipush #122
    //   360: if_icmpgt -> 384
    //   363: aload_1
    //   364: bipush #89
    //   366: invokevirtual set : (I)V
    //   369: aload_2
    //   370: getstatic net/portswigger/Zfh.UNKNOWN_STRING : Lnet/portswigger/Zfh;
    //   373: invokevirtual contains : (Ljava/lang/Object;)Z
    //   376: ifeq -> 384
    //   379: getstatic net/portswigger/Zfh.UNKNOWN_STRING : Lnet/portswigger/Zfh;
    //   382: astore #4
    //   384: iload_0
    //   385: iflt -> 403
    //   388: aload_2
    //   389: getstatic net/portswigger/Zfh.UNKNOWN : Lnet/portswigger/Zfh;
    //   392: invokevirtual contains : (Ljava/lang/Object;)Z
    //   395: ifeq -> 403
    //   398: getstatic net/portswigger/Zfh.UNKNOWN : Lnet/portswigger/Zfh;
    //   401: astore #4
    //   403: iload_0
    //   404: bipush #46
    //   406: if_icmpne -> 428
    //   409: aload_2
    //   410: getstatic net/portswigger/Zfh.DOT : Lnet/portswigger/Zfh;
    //   413: invokevirtual contains : (Ljava/lang/Object;)Z
    //   416: ifeq -> 841
    //   419: getstatic net/portswigger/Zfh.DOT : Lnet/portswigger/Zfh;
    //   422: astore #4
    //   424: aload_3
    //   425: ifnonnull -> 841
    //   428: iload_0
    //   429: bipush #65
    //   431: if_icmplt -> 440
    //   434: iload_0
    //   435: bipush #90
    //   437: if_icmple -> 458
    //   440: iload_0
    //   441: bipush #95
    //   443: if_icmpeq -> 458
    //   446: iload_0
    //   447: bipush #97
    //   449: if_icmplt -> 483
    //   452: iload_0
    //   453: bipush #122
    //   455: if_icmpgt -> 483
    //   458: aload_1
    //   459: bipush #58
    //   461: invokevirtual set : (I)V
    //   464: aload_2
    //   465: getstatic net/portswigger/Zfh.VARIABLE_NAME : Lnet/portswigger/Zfh;
    //   468: invokevirtual contains : (Ljava/lang/Object;)Z
    //   471: ifeq -> 841
    //   474: getstatic net/portswigger/Zfh.VARIABLE_NAME : Lnet/portswigger/Zfh;
    //   477: astore #4
    //   479: aload_3
    //   480: ifnonnull -> 841
    //   483: iload_0
    //   484: bipush #125
    //   486: if_icmpne -> 508
    //   489: aload_2
    //   490: getstatic net/portswigger/Zfh.VARIABLE_END : Lnet/portswigger/Zfh;
    //   493: invokevirtual contains : (Ljava/lang/Object;)Z
    //   496: ifeq -> 841
    //   499: getstatic net/portswigger/Zfh.VARIABLE_END : Lnet/portswigger/Zfh;
    //   502: astore #4
    //   504: aload_3
    //   505: ifnonnull -> 841
    //   508: iload_0
    //   509: bipush #123
    //   511: if_icmpne -> 533
    //   514: aload_2
    //   515: getstatic net/portswigger/Zfh.VARIABLE_START : Lnet/portswigger/Zfh;
    //   518: invokevirtual contains : (Ljava/lang/Object;)Z
    //   521: ifeq -> 841
    //   524: getstatic net/portswigger/Zfh.VARIABLE_START : Lnet/portswigger/Zfh;
    //   527: astore #4
    //   529: aload_3
    //   530: ifnonnull -> 841
    //   533: iload_0
    //   534: bipush #44
    //   536: if_icmpne -> 558
    //   539: aload_2
    //   540: getstatic net/portswigger/Zfh.COMMA : Lnet/portswigger/Zfh;
    //   543: invokevirtual contains : (Ljava/lang/Object;)Z
    //   546: ifeq -> 841
    //   549: getstatic net/portswigger/Zfh.COMMA : Lnet/portswigger/Zfh;
    //   552: astore #4
    //   554: aload_3
    //   555: ifnonnull -> 841
    //   558: iload_0
    //   559: bipush #48
    //   561: if_icmplt -> 589
    //   564: iload_0
    //   565: bipush #57
    //   567: if_icmpgt -> 589
    //   570: aload_2
    //   571: getstatic net/portswigger/Zfh.NATURAL_NUMBER : Lnet/portswigger/Zfh;
    //   574: invokevirtual contains : (Ljava/lang/Object;)Z
    //   577: ifeq -> 841
    //   580: getstatic net/portswigger/Zfh.NATURAL_NUMBER : Lnet/portswigger/Zfh;
    //   583: astore #4
    //   585: aload_3
    //   586: ifnonnull -> 841
    //   589: iload_0
    //   590: bipush #41
    //   592: if_icmpne -> 614
    //   595: aload_2
    //   596: getstatic net/portswigger/Zfh.CLOSE_BRACKET : Lnet/portswigger/Zfh;
    //   599: invokevirtual contains : (Ljava/lang/Object;)Z
    //   602: ifeq -> 841
    //   605: getstatic net/portswigger/Zfh.CLOSE_BRACKET : Lnet/portswigger/Zfh;
    //   608: astore #4
    //   610: aload_3
    //   611: ifnonnull -> 841
    //   614: iload_0
    //   615: bipush #40
    //   617: if_icmpne -> 639
    //   620: aload_2
    //   621: getstatic net/portswigger/Zfh.OPEN_BRACKET : Lnet/portswigger/Zfh;
    //   624: invokevirtual contains : (Ljava/lang/Object;)Z
    //   627: ifeq -> 841
    //   630: getstatic net/portswigger/Zfh.OPEN_BRACKET : Lnet/portswigger/Zfh;
    //   633: astore #4
    //   635: aload_3
    //   636: ifnonnull -> 841
    //   639: iload_0
    //   640: bipush #34
    //   642: if_icmpne -> 664
    //   645: aload_2
    //   646: getstatic net/portswigger/Zfh.LITERAL_STRING_OPENING_QUOTE : Lnet/portswigger/Zfh;
    //   649: invokevirtual contains : (Ljava/lang/Object;)Z
    //   652: ifeq -> 841
    //   655: getstatic net/portswigger/Zfh.LITERAL_STRING_OPENING_QUOTE : Lnet/portswigger/Zfh;
    //   658: astore #4
    //   660: aload_3
    //   661: ifnonnull -> 841
    //   664: iload_0
    //   665: bipush #96
    //   667: if_icmpne -> 689
    //   670: aload_2
    //   671: getstatic net/portswigger/Zfh.INTERPOLATABLE_STRING_OPENING_QUOTE : Lnet/portswigger/Zfh;
    //   674: invokevirtual contains : (Ljava/lang/Object;)Z
    //   677: ifeq -> 841
    //   680: getstatic net/portswigger/Zfh.INTERPOLATABLE_STRING_OPENING_QUOTE : Lnet/portswigger/Zfh;
    //   683: astore #4
    //   685: aload_3
    //   686: ifnonnull -> 841
    //   689: iload_0
    //   690: bipush #10
    //   692: if_icmpne -> 714
    //   695: aload_2
    //   696: getstatic net/portswigger/Zfh.NEWLINE : Lnet/portswigger/Zfh;
    //   699: invokevirtual contains : (Ljava/lang/Object;)Z
    //   702: ifeq -> 841
    //   705: getstatic net/portswigger/Zfh.NEWLINE : Lnet/portswigger/Zfh;
    //   708: astore #4
    //   710: aload_3
    //   711: ifnonnull -> 841
    //   714: iload_0
    //   715: bipush #35
    //   717: if_icmpne -> 745
    //   720: aload_1
    //   721: bipush #74
    //   723: invokevirtual set : (I)V
    //   726: aload_2
    //   727: getstatic net/portswigger/Zfh.COMMENT : Lnet/portswigger/Zfh;
    //   730: invokevirtual contains : (Ljava/lang/Object;)Z
    //   733: ifeq -> 841
    //   736: getstatic net/portswigger/Zfh.COMMENT : Lnet/portswigger/Zfh;
    //   739: astore #4
    //   741: aload_3
    //   742: ifnonnull -> 841
    //   745: iload_0
    //   746: bipush #12
    //   748: if_icmpne -> 770
    //   751: aload_2
    //   752: getstatic net/portswigger/Zfh._TOKEN_4 : Lnet/portswigger/Zfh;
    //   755: invokevirtual contains : (Ljava/lang/Object;)Z
    //   758: ifeq -> 841
    //   761: getstatic net/portswigger/Zfh._TOKEN_4 : Lnet/portswigger/Zfh;
    //   764: astore #4
    //   766: aload_3
    //   767: ifnonnull -> 841
    //   770: iload_0
    //   771: bipush #13
    //   773: if_icmpne -> 795
    //   776: aload_2
    //   777: getstatic net/portswigger/Zfh._TOKEN_3 : Lnet/portswigger/Zfh;
    //   780: invokevirtual contains : (Ljava/lang/Object;)Z
    //   783: ifeq -> 841
    //   786: getstatic net/portswigger/Zfh._TOKEN_3 : Lnet/portswigger/Zfh;
    //   789: astore #4
    //   791: aload_3
    //   792: ifnonnull -> 841
    //   795: iload_0
    //   796: bipush #9
    //   798: if_icmpne -> 820
    //   801: aload_2
    //   802: getstatic net/portswigger/Zfh._TOKEN_2 : Lnet/portswigger/Zfh;
    //   805: invokevirtual contains : (Ljava/lang/Object;)Z
    //   808: ifeq -> 841
    //   811: getstatic net/portswigger/Zfh._TOKEN_2 : Lnet/portswigger/Zfh;
    //   814: astore #4
    //   816: aload_3
    //   817: ifnonnull -> 841
    //   820: iload_0
    //   821: bipush #32
    //   823: if_icmpne -> 841
    //   826: aload_2
    //   827: getstatic net/portswigger/Zfh._TOKEN_1 : Lnet/portswigger/Zfh;
    //   830: invokevirtual contains : (Ljava/lang/Object;)Z
    //   833: ifeq -> 841
    //   836: getstatic net/portswigger/Zfh._TOKEN_1 : Lnet/portswigger/Zfh;
    //   839: astore #4
    //   841: aload #4
    //   843: areturn
  }
  
  private static Zfh ZT(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 110)
      paramBitSet.set(152); 
    return zfh;
  }
  
  private static Zfh Z_D(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 99)
      paramBitSet.set(149); 
    return zfh;
  }
  
  private static Zfh Z_J(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 109)
      paramBitSet.set(160); 
    return zfh;
  }
  
  private static Zfh Z_V(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 110)
      paramBitSet.set(134); 
    return zfh;
  }
  
  private static Zfh Zn_(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 97)
      paramBitSet.set(55); 
    return zfh;
  }
  
  private static Zfh Zvd(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 115 && paramEnumSet.contains(Zfh.REQUEST_RESPONSE_COMMON_PROPERTY))
      zfh = Zfh.REQUEST_RESPONSE_COMMON_PROPERTY; 
    return zfh;
  }
  
  private static Zfh Z_9(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 115)
      paramBitSet.set(19); 
    return zfh;
  }
  
  private static Zfh ZnX(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101)
      paramBitSet.set(115); 
    return zfh;
  }
  
  private static Zfh Zn4(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101 && paramEnumSet.contains(Zfh.RESPONSE_OBJECT))
      zfh = Zfh.RESPONSE_OBJECT; 
    return zfh;
  }
  
  private static Zfh Z_H(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101)
      paramBitSet.set(109); 
    return zfh;
  }
  
  private static Zfh Zn8(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 108)
      paramBitSet.set(38); 
    return zfh;
  }
  
  private static Zfh Zns(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 100)
      paramBitSet.set(126); 
    return zfh;
  }
  
  private static Zfh Z_g(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 121 && paramEnumSet.contains(Zfh.URL_PROPERTY))
      zfh = Zfh.URL_PROPERTY; 
    return zfh;
  }
  
  private static Zfh ZI(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 115)
      paramBitSet.set(172); 
    return zfh;
  }
  
  private static Zfh Z_r(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 97)
      paramBitSet.set(165); 
    return zfh;
  }
  
  private static Zfh Z_v(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 116)
      paramBitSet.set(54); 
    return zfh;
  }
  
  private static Zfh Znw(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 97)
      paramBitSet.set(94); 
    return zfh;
  }
  
  private static Zfh ZnP(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 54)
      paramBitSet.set(116); 
    return zfh;
  }
  
  private static Zfh Zr(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 116 && paramEnumSet.contains(Zfh.REQUEST_OBJECT))
      zfh = Zfh.REQUEST_OBJECT; 
    return zfh;
  }
  
  private static Zfh Z_a(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 111)
      paramBitSet.set(163); 
    return zfh;
  }
  
  private static Zfh Z_L(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 100 && paramEnumSet.contains(Zfh.REQUEST_SPECIFIC_PROPERTY))
      zfh = Zfh.REQUEST_SPECIFIC_PROPERTY; 
    return zfh;
  }
  
  private static Zfh Z_y(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 111)
      paramBitSet.set(138); 
    return zfh;
  }
  
  private static Zfh Z_i(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 110)
      paramBitSet.set(105); 
    return zfh;
  }
  
  private static Zfh Zn9(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt >= 48 && paramInt <= 57) {
      paramBitSet.set(102);
      paramBitSet.set(49);
      paramBitSet.set(33);
      paramBitSet.set(120);
      if (paramEnumSet.contains(Zfh.NATURAL_NUMBER))
        zfh = Zfh.NATURAL_NUMBER; 
    } 
    return zfh;
  }
  
  private static Zfh ZnK(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 116)
      paramBitSet.set(37); 
    return zfh;
  }
  
  private static Zfh Znp(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 111)
      paramBitSet.set(150); 
    return zfh;
  }
  
  private static Zfh Z_5(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 114)
      paramBitSet.set(176); 
    return zfh;
  }
  
  private static Zfh Z_S(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 112)
      paramBitSet.set(75); 
    return zfh;
  }
  
  private static Zfh Za(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101)
      paramBitSet.set(7); 
    return zfh;
  }
  
  private static Zfh Zv(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 95)
      paramBitSet.set(171); 
    return zfh;
  }
  
  private static Zfh Zc(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 97)
      paramBitSet.set(111); 
    return zfh;
  }
  
  private static Zfh ZnN(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101)
      paramBitSet.set(96); 
    return zfh;
  }
  
  private static Zfh Ze(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt >= 48 && paramInt <= 57) {
      paramBitSet.set(49);
      paramBitSet.set(120);
      if (paramEnumSet.contains(Zfh.NATURAL_NUMBER))
        zfh = Zfh.NATURAL_NUMBER; 
    } 
    return zfh;
  }
  
  private static Zfh ZP(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 108)
      paramBitSet.set(167); 
    return zfh;
  }
  
  private static Zfh Znn(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 49 && paramEnumSet.contains(Zfh.SHA1_FUNCTION))
      zfh = Zfh.SHA1_FUNCTION; 
    return zfh;
  }
  
  private static Zfh Zy(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 111)
      paramBitSet.set(63); 
    return zfh;
  }
  
  private static Zfh ZnV(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 104)
      paramBitSet.set(71); 
    return zfh;
  }
  
  private static Zfh ZnF(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101 && paramEnumSet.contains(Zfh.URL_PROPERTY))
      zfh = Zfh.URL_PROPERTY; 
    return zfh;
  }
  
  private static Zfh Z_N(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 95)
      paramBitSet.set(145); 
    return zfh;
  }
  
  private static Zfh Zn(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 114)
      paramBitSet.set(159); 
    return zfh;
  }
  
  private static Zfh Z_e(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101)
      paramBitSet.set(23); 
    return zfh;
  }
  
  private static Zfh Znb(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 117)
      paramBitSet.set(29); 
    return zfh;
  }
  
  private static Zfh ZW(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101 && paramEnumSet.contains(Zfh.BASE64_ENCODE_FUNCTION))
      zfh = Zfh.BASE64_ENCODE_FUNCTION; 
    return zfh;
  }
  
  private static Zfh Z_j(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 111)
      paramBitSet.set(113); 
    return zfh;
  }
  
  private static Zfh Z_C(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 110)
      paramBitSet.set(174); 
    return zfh;
  }
  
  private static Zfh Zs(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 111)
      paramBitSet.set(77); 
    return zfh;
  }
  
  private static Zfh Z_s(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 116)
      paramBitSet.set(67); 
    return zfh;
  }
  
  private static Zfh Z_E(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 97)
      paramBitSet.set(35); 
    return zfh;
  }
  
  private static Zfh Zj(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt >= 48 && paramInt <= 57 && paramEnumSet.contains(Zfh.NATURAL_NUMBER))
      zfh = Zfh.NATURAL_NUMBER; 
    return zfh;
  }
  
  private static Zfh Znc(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 117)
      paramBitSet.set(137); 
    return zfh;
  }
  
  private static Zfh ZnE(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 99)
      paramBitSet.set(169); 
    return zfh;
  }
  
  private static Zfh Zx(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 114)
      paramBitSet.set(76); 
    return zfh;
  }
  
  private static Zfh ZvB(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 100)
      paramBitSet.set(177); 
    return zfh;
  }
  
  private static Zfh Z_q(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 104 && paramEnumSet.contains(Zfh.URL_PROPERTY))
      zfh = Zfh.URL_PROPERTY; 
    return zfh;
  }
  
  private static Zfh ZnJ(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 116)
      paramBitSet.set(129); 
    return zfh;
  }
  
  private static Zfh Zi(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 115)
      paramBitSet.set(104); 
    return zfh;
  }
  
  private static Zfh Z_l(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101)
      paramBitSet.set(62); 
    return zfh;
  }
  
  private static Zfh Zny(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt >= 48 && paramInt <= 57) {
      paramBitSet.set(58);
      if (paramEnumSet.contains(Zfh.VARIABLE_NAME))
        zfh = Zfh.VARIABLE_NAME; 
    } else if ((paramInt >= 65 && paramInt <= 90) || paramInt == 95 || (paramInt >= 97 && paramInt <= 122)) {
      paramBitSet.set(58);
      if (paramEnumSet.contains(Zfh.VARIABLE_NAME))
        zfh = Zfh.VARIABLE_NAME; 
    } 
    return zfh;
  }
  
  private static Zfh Znk(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 116)
      paramBitSet.set(32); 
    return zfh;
  }
  
  private static Zfh ZH(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 114)
      paramBitSet.set(91); 
    return zfh;
  }
  
  private static Zfh ZnU(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 95)
      paramBitSet.set(147); 
    return zfh;
  }
  
  private static Zfh Zu(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 115)
      paramBitSet.set(108); 
    return zfh;
  }
  
  private static Zfh Z_u(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 100)
      paramBitSet.set(101); 
    return zfh;
  }
  
  private static Zfh ZnA(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 117)
      paramBitSet.set(127); 
    return zfh;
  }
  
  private static Zfh Z_B(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 108)
      paramBitSet.set(168); 
    return zfh;
  }
  
  private static Zfh Zz(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 114)
      paramBitSet.set(179); 
    return zfh;
  }
  
  private static Zfh ZR(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 111)
      paramBitSet.set(70); 
    return zfh;
  }
  
  private static Zfh Znl(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 100)
      paramBitSet.set(43); 
    return zfh;
  }
  
  private static Zfh ZJ(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 114)
      paramBitSet.set(6); 
    return zfh;
  }
  
  private static Zfh ZS(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 114)
      paramBitSet.set(61); 
    return zfh;
  }
  
  private static Zfh Zb(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 111)
      paramBitSet.set(21); 
    return zfh;
  }
  
  private static Zfh ZX(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101)
      paramBitSet.set(18); 
    return zfh;
  }
  
  private static Zfh ZB(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 111)
      paramBitSet.set(100); 
    return zfh;
  }
  
  private static Zfh ZL(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if ((paramInt >= 0 && paramInt <= 9) || paramInt == 11 || paramInt == 12 || paramInt >= 14) {
      paramBitSet.set(74);
      if (paramEnumSet.contains(Zfh.COMMENT))
        zfh = Zfh.COMMENT; 
    } 
    return zfh;
  }
  
  private static Zfh ZN(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 108)
      paramBitSet.set(88); 
    return zfh;
  }
  
  private static Zfh ZnO(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 108 && paramEnumSet.contains(Zfh.URL))
      zfh = Zfh.URL; 
    return zfh;
  }
  
  private static Zfh Znf(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 100)
      paramBitSet.set(166); 
    return zfh;
  }
  
  private static Zfh ZA(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101)
      paramBitSet.set(156); 
    return zfh;
  }
  
  private static Zfh Z_K(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 113)
      paramBitSet.set(42); 
    return zfh;
  }
  
  private static Zfh ZnL(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 116 && paramEnumSet.contains(Zfh.URL_PROPERTY))
      zfh = Zfh.URL_PROPERTY; 
    return zfh;
  }
  
  private static Zfh Znt(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 114)
      paramBitSet.set(13); 
    return zfh;
  }
  
  private static Zfh Znx(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 97)
      paramBitSet.set(1); 
    return zfh;
  }
  
  private static Zfh ZY(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 115)
      paramBitSet.set(39); 
    return zfh;
  }
  
  private static Zfh ZD(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 105)
      paramBitSet.set(11); 
    return zfh;
  }
  
  private static Zfh ZvN(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 120)
      paramBitSet.set(86); 
    return zfh;
  }
  
  private static Zfh ZnQ(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 95)
      paramBitSet.set(60); 
    return zfh;
  }
  
  private static Zfh Zni(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101)
      paramBitSet.set(56); 
    return zfh;
  }
  
  private static Zfh ZK(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 97)
      paramBitSet.set(2); 
    return zfh;
  }
  
  private static Zfh Z_G(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt >= 48 && paramInt <= 57) {
      paramBitSet.set(89);
      if (paramEnumSet.contains(Zfh.UNKNOWN_STRING))
        zfh = Zfh.UNKNOWN_STRING; 
    } else if ((paramInt >= 65 && paramInt <= 90) || paramInt == 95 || (paramInt >= 97 && paramInt <= 122)) {
      paramBitSet.set(89);
      if (paramEnumSet.contains(Zfh.UNKNOWN_STRING))
        zfh = Zfh.UNKNOWN_STRING; 
    } 
    return zfh;
  }
  
  private static Zfh Z_6(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 111)
      paramBitSet.set(103); 
    return zfh;
  }
  
  private static Zfh Zn2(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101)
      paramBitSet.set(28); 
    return zfh;
  }
  
  private static Zfh ZnC(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 98)
      paramBitSet.set(155); 
    return zfh;
  }
  
  private static Zfh Znv(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101 && paramEnumSet.contains(Zfh.RESPONSE_SPECIFIC_PROPERTY))
      zfh = Zfh.RESPONSE_SPECIFIC_PROPERTY; 
    return zfh;
  }
  
  private static Zfh Z_F(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 100)
      paramBitSet.set(144); 
    return zfh;
  }
  
  private static Zfh Znh(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 95)
      paramBitSet.set(41); 
    return zfh;
  }
  
  private static Zfh Zt(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 95)
      paramBitSet.set(51); 
    return zfh;
  }
  
  private static Zfh ZF(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101)
      paramBitSet.set(85); 
    return zfh;
  }
  
  private static Zfh Z_T(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 97)
      paramBitSet.set(16); 
    return zfh;
  }
  
  private static Zfh Z_W(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 52)
      paramBitSet.set(143); 
    return zfh;
  }
  
  private static Zfh Z_o(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 95)
      paramBitSet.set(50); 
    return zfh;
  }
  
  private static Zfh Z_7(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101 && paramEnumSet.contains(Zfh.BASE64_DECODE_FUNCTION))
      zfh = Zfh.BASE64_DECODE_FUNCTION; 
    return zfh;
  }
  
  private static Zfh Z_A(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt >= 48 && paramInt <= 57) {
      paramBitSet.set(49);
      paramBitSet.set(33);
      paramBitSet.set(120);
      if (paramEnumSet.contains(Zfh.NATURAL_NUMBER))
        zfh = Zfh.NATURAL_NUMBER; 
    } 
    return zfh;
  }
  
  private static Zfh Z_3(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 99)
      paramBitSet.set(107); 
    return zfh;
  }
  
  private static Zfh ZC(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 112)
      paramBitSet.set(148); 
    return zfh;
  }
  
  private static Zfh ZE(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 99)
      paramBitSet.set(153); 
    return zfh;
  }
  
  private static Zfh Zn3(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 116)
      paramBitSet.set(110); 
    return zfh;
  }
  
  private static Zfh Z_p(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 111)
      paramBitSet.set(181); 
    return zfh;
  }
  
  private static Zfh Znd(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 115 && paramEnumSet.contains(Zfh.GENERATE_COLLABORATOR_ADDRESS_FUNCTION))
      zfh = Zfh.GENERATE_COLLABORATOR_ADDRESS_FUNCTION; 
    return zfh;
  }
  
  private static Zfh ZnT(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 103)
      paramBitSet.set(97); 
    return zfh;
  }
  
  private static Zfh Zo(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 112)
      paramBitSet.set(30); 
    return zfh;
  }
  
  private static Zfh Z_d(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 115)
      paramBitSet.set(72); 
    return zfh;
  }
  
  private static Zfh Z_f(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt >= 48 && paramInt <= 57) {
      paramBitSet.set(102);
      paramBitSet.set(49);
      paramBitSet.set(24);
      paramBitSet.set(33);
      paramBitSet.set(120);
      if (paramEnumSet.contains(Zfh.NATURAL_NUMBER))
        zfh = Zfh.NATURAL_NUMBER; 
    } 
    return zfh;
  }
  
  private static Zfh Znq(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 115)
      paramBitSet.set(128); 
    return zfh;
  }
  
  private static Zfh Z_x(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 116)
      paramBitSet.set(141); 
    return zfh;
  }
  
  private static Zfh ZG(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 114 && paramEnumSet.contains(Zfh.TO_LOWER_FUNCTION))
      zfh = Zfh.TO_LOWER_FUNCTION; 
    return zfh;
  }
  
  private static Zfh Zn0(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 52)
      paramBitSet.set(95); 
    return zfh;
  }
  
  private static Zfh Z_R(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 116)
      paramBitSet.set(106); 
    return zfh;
  }
  
  private static Zfh Znj(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 10 && paramEnumSet.contains(Zfh._TOKEN_5))
      zfh = Zfh._TOKEN_5; 
    return zfh;
  }
  
  private static Zfh Z_t(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 112)
      paramBitSet.set(78); 
    return zfh;
  }
  
  private static Zfh ZO(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt >= 48 && paramInt <= 57) {
      paramBitSet.set(49);
      if (paramEnumSet.contains(Zfh.NATURAL_NUMBER))
        zfh = Zfh.NATURAL_NUMBER; 
    } 
    return zfh;
  }
  
  private static Zfh ZnH(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 110 && paramEnumSet.contains(Zfh.REQUEST_RESPONSE_COMMON_PROPERTY))
      zfh = Zfh.REQUEST_RESPONSE_COMMON_PROPERTY; 
    return zfh;
  }
  
  private static Zfh Zd(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 111)
      paramBitSet.set(3); 
    return zfh;
  }
  
  private static Zfh Zl(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 99)
      paramBitSet.set(36); 
    return zfh;
  }
  
  private static Zfh Z_Q(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 116)
      paramBitSet.set(90); 
    return zfh;
  }
  
  private static Zfh Z_O(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101)
      paramBitSet.set(25); 
    return zfh;
  }
  
  private static Zfh Zna(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 114)
      paramBitSet.set(57); 
    return zfh;
  }
  
  private static Zfh ZZ(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101)
      paramBitSet.set(81); 
    return zfh;
  }
  
  private static Zfh Zw(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 116 && paramEnumSet.contains(Zfh.URL_PROPERTY))
      zfh = Zfh.URL_PROPERTY; 
    return zfh;
  }
  
  private static Zfh Z_z(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 117)
      paramBitSet.set(83); 
    return zfh;
  }
  
  private static Zfh ZnS(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 100)
      paramBitSet.set(12); 
    return zfh;
  }
  
  private static Zfh ZnW(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101)
      paramBitSet.set(123); 
    return zfh;
  }
  
  private static Zfh Zm(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
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
    //   32: if_icmplt -> 46
    //   35: aload_1
    //   36: sipush #132
    //   39: invokevirtual set : (I)V
    //   42: aload_3
    //   43: ifnonnull -> 83
    //   46: iload_0
    //   47: bipush #13
    //   49: if_icmpne -> 62
    //   52: aload_1
    //   53: bipush #118
    //   55: invokevirtual set : (I)V
    //   58: aload_3
    //   59: ifnonnull -> 83
    //   62: iload_0
    //   63: bipush #10
    //   65: if_icmpne -> 83
    //   68: aload_2
    //   69: getstatic net/portswigger/Zfh._TOKEN_5 : Lnet/portswigger/Zfh;
    //   72: invokevirtual contains : (Ljava/lang/Object;)Z
    //   75: ifeq -> 83
    //   78: getstatic net/portswigger/Zfh._TOKEN_5 : Lnet/portswigger/Zfh;
    //   81: astore #4
    //   83: iload_0
    //   84: bipush #13
    //   86: if_icmpne -> 104
    //   89: aload_2
    //   90: getstatic net/portswigger/Zfh._TOKEN_5 : Lnet/portswigger/Zfh;
    //   93: invokevirtual contains : (Ljava/lang/Object;)Z
    //   96: ifeq -> 104
    //   99: getstatic net/portswigger/Zfh._TOKEN_5 : Lnet/portswigger/Zfh;
    //   102: astore #4
    //   104: aload #4
    //   106: areturn
  }
  
  private static Zfh Z_4(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 97)
      paramBitSet.set(14); 
    return zfh;
  }
  
  private static Zfh Zne(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 115)
      paramBitSet.set(9); 
    return zfh;
  }
  
  private static Zfh Zn1(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 104)
      paramBitSet.set(48); 
    return zfh;
  }
  
  private static Zfh Z_m(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 100)
      paramBitSet.set(131); 
    return zfh;
  }
  
  private static Zfh ZnB(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 112)
      paramBitSet.set(119); 
    return zfh;
  }
  
  private static Zfh Znm(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 114)
      paramBitSet.set(80); 
    return zfh;
  }
  
  private static Zfh ZnG(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 54 && paramEnumSet.contains(Zfh.SHA256_FUNCTION))
      zfh = Zfh.SHA256_FUNCTION; 
    return zfh;
  }
  
  private static Zfh ZnD(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101)
      paramBitSet.set(17); 
    return zfh;
  }
  
  private static Zfh Zn7(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 114 && paramEnumSet.contains(Zfh.RANDOM_STR_FUNCTION))
      zfh = Zfh.RANDOM_STR_FUNCTION; 
    return zfh;
  }
  
  private static Zfh ZM(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 97)
      paramBitSet.set(92); 
    return zfh;
  }
  
  private static Zfh Z_U(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 95)
      paramBitSet.set(136); 
    return zfh;
  }
  
  private static Zfh Z_w(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101)
      paramBitSet.set(69); 
    return zfh;
  }
  
  private static Zfh Zn5(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 99)
      paramBitSet.set(26); 
    return zfh;
  }
  
  private static Zfh ZV(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 111)
      paramBitSet.set(121); 
    return zfh;
  }
  
  private static Zfh Zf(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 97)
      paramBitSet.set(130); 
    return zfh;
  }
  
  private static Zfh Z_Z(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 111)
      paramBitSet.set(4); 
    return zfh;
  }
  
  private static Zfh ZQ(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101 && paramEnumSet.contains(Zfh.REGEX_REPLACE_FUNCTION))
      zfh = Zfh.REGEX_REPLACE_FUNCTION; 
    return zfh;
  }
  
  private static Zfh Z__(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 100)
      paramBitSet.set(93); 
    return zfh;
  }
  
  private static Zfh ZnR(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 53)
      paramBitSet.set(139); 
    return zfh;
  }
  
  private static Zfh ZnI(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 100)
      paramBitSet.set(122); 
    return zfh;
  }
  
  private static Zfh Z_1(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 111)
      paramBitSet.set(68); 
    return zfh;
  }
  
  private static Zfh Z_I(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 115)
      paramBitSet.set(164); 
    return zfh;
  }
  
  private static Zfh ZnY(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 111)
      paramBitSet.set(66); 
    return zfh;
  }
  
  private static Zfh Zg(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 114 && paramEnumSet.contains(Zfh.TO_UPPER_FUNCTION))
      zfh = Zfh.TO_UPPER_FUNCTION; 
    return zfh;
  }
  
  private static Zfh Z_(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 104)
      paramBitSet.set(15); 
    return zfh;
  }
  
  private static Zfh ZU(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101)
      paramBitSet.set(162); 
    return zfh;
  }
  
  private static Zfh Z_n(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 97)
      paramBitSet.set(59); 
    return zfh;
  }
  
  private static Zfh Z_M(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 95)
      paramBitSet.set(180); 
    return zfh;
  }
  
  private static Zfh Z_c(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 54)
      paramBitSet.set(99); 
    return zfh;
  }
  
  private static Zfh Z_P(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 114)
      paramBitSet.set(154); 
    return zfh;
  }
  
  private static Zfh Zn6(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 95)
      paramBitSet.set(34); 
    return zfh;
  }
  
  private static Zfh Z_k(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 105)
      paramBitSet.set(146); 
    return zfh;
  }
  
  private static Zfh Z_8(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 50)
      paramBitSet.set(151); 
    return zfh;
  }
  
  private static Zfh Z_2(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 121 && paramEnumSet.contains(Zfh.REQUEST_RESPONSE_COMMON_PROPERTY))
      zfh = Zfh.REQUEST_RESPONSE_COMMON_PROPERTY; 
    return zfh;
  }
  
  private static Zfh Zno(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 111)
      paramBitSet.set(178); 
    return zfh;
  }
  
  private static Zfh Zk(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 108)
      paramBitSet.set(142); 
    return zfh;
  }
  
  private static Zfh Znr(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 111)
      paramBitSet.set(65); 
    return zfh;
  }
  
  private static Zfh Znu(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101)
      paramBitSet.set(45); 
    return zfh;
  }
  
  private static Zfh Zng(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 118)
      paramBitSet.set(158); 
    return zfh;
  }
  
  private static Zfh Z_h(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101)
      paramBitSet.set(161); 
    return zfh;
  }
  
  private static Zfh Zh(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101)
      paramBitSet.set(79); 
    return zfh;
  }
  
  private static Zfh Z_b(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101)
      paramBitSet.set(40); 
    return zfh;
  }
  
  private static Zfh ZnZ(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 116)
      paramBitSet.set(5); 
    return zfh;
  }
  
  private static Zfh Zq(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 111)
      paramBitSet.set(124); 
    return zfh;
  }
  
  private static Zfh ZnM(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 53 && paramEnumSet.contains(Zfh.MD5_FUNCTION))
      zfh = Zfh.MD5_FUNCTION; 
    return zfh;
  }
  
  private static Zfh Z_X(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 119)
      paramBitSet.set(8); 
    return zfh;
  }
  
  private static Zfh Z_Y(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 97)
      paramBitSet.set(47); 
    return zfh;
  }
  
  private static Zfh Z_0(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 115)
      paramBitSet.set(114); 
    return zfh;
  }
  
  private static Zfh Znz(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 108 && paramEnumSet.contains(Zfh.URL_PROPERTY))
      zfh = Zfh.URL_PROPERTY; 
    return zfh;
  }
  
  private static void ZX() {
    Zfw[] arrayOfZfw = { 
        Zof::Zp, Zof::ZT, Zof::Z_D, Zof::Z_J, Zof::Z_V, Zof::Zn_, Zof::Zvd, Zof::Z_9, Zof::ZnX, Zof::Zn4, 
        Zof::Z_H, Zof::Zn8, Zof::Zns, Zof::Z_g, Zof::ZI, Zof::Z_r, Zof::Z_v, Zof::Znw, Zof::ZnP, Zof::Zr, 
        Zof::Z_a, Zof::Z_L, Zof::Z_y, Zof::Z_i, Zof::Zn9, Zof::ZnK, Zof::Znp, Zof::Z_5, Zof::Z_S, Zof::Za, 
        Zof::Zv, Zof::Zc, Zof::ZnN, Zof::Ze, Zof::ZP, Zof::Znn, Zof::Zy, Zof::ZnV, Zof::ZnF, Zof::Z_N, 
        Zof::Zn, Zof::Z_e, Zof::Znb, Zof::ZW, Zof::Z_j, Zof::Z_C, Zof::Zs, Zof::Z_s, Zof::Z_E, Zof::Zj, 
        Zof::Znc, Zof::ZnE, Zof::Zx, Zof::ZvB, Zof::Z_q, Zof::ZnJ, Zof::Zi, Zof::Z_l, Zof::Zny, Zof::Znk, 
        Zof::ZH, Zof::ZnU, Zof::Zu, Zof::Z_u, Zof::ZnA, Zof::Z_B, Zof::Zz, Zof::ZR, Zof::Znl, Zof::ZJ, 
        Zof::ZS, Zof::Zb, Zof::ZX, Zof::ZB, Zof::ZL, Zof::ZN, Zof::ZnO, Zof::Znf, Zof::ZA, Zof::Z_K, 
        Zof::ZnL, Zof::Znt, Zof::Znx, Zof::ZY, Zof::ZD, Zof::ZvN, Zof::ZnQ, Zof::Zni, Zof::ZK, Zof::Z_G, 
        Zof::Z_6, Zof::Zn2, Zof::ZnC, Zof::Znv, Zof::Z_F, Zof::Znh, Zof::Zt, Zof::ZF, Zof::Z_T, Zof::Z_W, 
        Zof::Z_o, Zof::Z_7, Zof::Z_A, Zof::Z_3, Zof::ZC, Zof::ZE, Zof::Zn3, Zof::Z_p, Zof::Znd, Zof::ZnT, 
        Zof::Zo, Zof::Z_d, Zof::Z_f, Zof::Znq, Zof::Z_x, Zof::ZG, Zof::Zn0, Zof::Z_R, Zof::Znj, Zof::Z_t, 
        Zof::ZO, Zof::ZnH, Zof::Zd, Zof::Zl, Zof::Z_Q, Zof::Z_O, Zof::Zna, Zof::ZZ, Zof::Zw, Zof::Z_z, 
        Zof::ZnS, Zof::ZnW, Zof::Zm, Zof::Z_4, Zof::Zne, Zof::Zn1, Zof::Z_m, Zof::ZnB, Zof::Znm, Zof::ZnG, 
        Zof::ZnD, Zof::Zn7, Zof::ZM, Zof::Z_U, Zof::Z_w, Zof::Zn5, Zof::ZV, Zof::Zf, Zof::Z_Z, Zof::ZQ, 
        Zof::Z__, Zof::ZnR, Zof::ZnI, Zof::Z_1, Zof::Z_I, Zof::ZnY, Zof::Zg, Zof::Z_, Zof::ZU, Zof::Z_n, 
        Zof::Z_M, Zof::Z_c, Zof::Z_P, Zof::Zn6, Zof::Z_k, Zof::Z_8, Zof::Z_2, Zof::Zno, Zof::Zk, Zof::Znr, 
        Zof::Znu, Zof::Zng, Zof::Z_h, Zof::Zh, Zof::Z_b, Zof::ZnZ, Zof::Zq, Zof::ZnM, Zof::Z_X, Zof::Z_Y, 
        Zof::Z_0, Zof::Znz };
    Zuk.ZC.put(Zzv.WithinVariableRef, arrayOfZfw);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zof.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */