package net.portswigger;

import java.util.BitSet;
import java.util.EnumSet;

class Zzh {
  private static Zkd Ztf(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: aconst_null
    //   4: astore #4
    //   6: istore_3
    //   7: iload_0
    //   8: bipush #35
    //   10: if_icmpne -> 23
    //   13: aload_1
    //   14: bipush #82
    //   16: invokevirtual set : (I)V
    //   19: iload_3
    //   20: ifne -> 374
    //   23: iload_0
    //   24: bipush #48
    //   26: if_icmplt -> 75
    //   29: iload_0
    //   30: bipush #57
    //   32: if_icmpgt -> 75
    //   35: aload_1
    //   36: bipush #71
    //   38: invokevirtual set : (I)V
    //   41: aload_1
    //   42: bipush #50
    //   44: invokevirtual set : (I)V
    //   47: aload_1
    //   48: bipush #86
    //   50: invokevirtual set : (I)V
    //   53: aload_1
    //   54: bipush #78
    //   56: invokevirtual set : (I)V
    //   59: aload_1
    //   60: bipush #9
    //   62: invokevirtual set : (I)V
    //   65: aload_1
    //   66: bipush #65
    //   68: invokevirtual set : (I)V
    //   71: iload_3
    //   72: ifne -> 374
    //   75: iload_0
    //   76: bipush #97
    //   78: if_icmpne -> 103
    //   81: aload_1
    //   82: bipush #81
    //   84: invokevirtual set : (I)V
    //   87: aload_1
    //   88: bipush #101
    //   90: invokevirtual set : (I)V
    //   93: aload_1
    //   94: bipush #103
    //   96: invokevirtual set : (I)V
    //   99: iload_3
    //   100: ifne -> 374
    //   103: iload_0
    //   104: bipush #98
    //   106: if_icmpne -> 119
    //   109: aload_1
    //   110: bipush #117
    //   112: invokevirtual set : (I)V
    //   115: iload_3
    //   116: ifne -> 374
    //   119: iload_0
    //   120: bipush #99
    //   122: if_icmpne -> 134
    //   125: aload_1
    //   126: iconst_2
    //   127: invokevirtual set : (I)V
    //   130: iload_3
    //   131: ifne -> 374
    //   134: iload_0
    //   135: bipush #100
    //   137: if_icmpne -> 156
    //   140: aload_1
    //   141: bipush #15
    //   143: invokevirtual set : (I)V
    //   146: aload_1
    //   147: bipush #107
    //   149: invokevirtual set : (I)V
    //   152: iload_3
    //   153: ifne -> 374
    //   156: iload_0
    //   157: bipush #103
    //   159: if_icmpne -> 172
    //   162: aload_1
    //   163: bipush #22
    //   165: invokevirtual set : (I)V
    //   168: iload_3
    //   169: ifne -> 374
    //   172: iload_0
    //   173: bipush #104
    //   175: if_icmpne -> 194
    //   178: aload_1
    //   179: bipush #32
    //   181: invokevirtual set : (I)V
    //   184: aload_1
    //   185: bipush #96
    //   187: invokevirtual set : (I)V
    //   190: iload_3
    //   191: ifne -> 374
    //   194: iload_0
    //   195: bipush #105
    //   197: if_icmpne -> 210
    //   200: aload_1
    //   201: bipush #49
    //   203: invokevirtual set : (I)V
    //   206: iload_3
    //   207: ifne -> 374
    //   210: iload_0
    //   211: bipush #108
    //   213: if_icmpne -> 226
    //   216: aload_1
    //   217: bipush #57
    //   219: invokevirtual set : (I)V
    //   222: iload_3
    //   223: ifne -> 374
    //   226: iload_0
    //   227: bipush #109
    //   229: if_icmpne -> 242
    //   232: aload_1
    //   233: bipush #95
    //   235: invokevirtual set : (I)V
    //   238: iload_3
    //   239: ifne -> 374
    //   242: iload_0
    //   243: bipush #110
    //   245: if_icmpne -> 264
    //   248: aload_1
    //   249: bipush #59
    //   251: invokevirtual set : (I)V
    //   254: aload_1
    //   255: bipush #121
    //   257: invokevirtual set : (I)V
    //   260: iload_3
    //   261: ifne -> 374
    //   264: iload_0
    //   265: bipush #111
    //   267: if_icmpne -> 280
    //   270: aload_1
    //   271: bipush #106
    //   273: invokevirtual set : (I)V
    //   276: iload_3
    //   277: ifne -> 374
    //   280: iload_0
    //   281: bipush #112
    //   283: if_icmpne -> 296
    //   286: aload_1
    //   287: bipush #123
    //   289: invokevirtual set : (I)V
    //   292: iload_3
    //   293: ifne -> 374
    //   296: iload_0
    //   297: bipush #113
    //   299: if_icmpne -> 312
    //   302: aload_1
    //   303: bipush #110
    //   305: invokevirtual set : (I)V
    //   308: iload_3
    //   309: ifne -> 374
    //   312: iload_0
    //   313: bipush #114
    //   315: if_icmpne -> 340
    //   318: aload_1
    //   319: bipush #29
    //   321: invokevirtual set : (I)V
    //   324: aload_1
    //   325: bipush #18
    //   327: invokevirtual set : (I)V
    //   330: aload_1
    //   331: bipush #99
    //   333: invokevirtual set : (I)V
    //   336: iload_3
    //   337: ifne -> 374
    //   340: iload_0
    //   341: bipush #116
    //   343: if_icmpne -> 362
    //   346: aload_1
    //   347: bipush #60
    //   349: invokevirtual set : (I)V
    //   352: aload_1
    //   353: bipush #47
    //   355: invokevirtual set : (I)V
    //   358: iload_3
    //   359: ifne -> 374
    //   362: iload_0
    //   363: bipush #118
    //   365: if_icmpne -> 374
    //   368: aload_1
    //   369: bipush #113
    //   371: invokevirtual set : (I)V
    //   374: iload_0
    //   375: bipush #65
    //   377: if_icmplt -> 386
    //   380: iload_0
    //   381: bipush #90
    //   383: if_icmple -> 404
    //   386: iload_0
    //   387: bipush #95
    //   389: if_icmpeq -> 404
    //   392: iload_0
    //   393: bipush #97
    //   395: if_icmplt -> 425
    //   398: iload_0
    //   399: bipush #122
    //   401: if_icmpgt -> 425
    //   404: aload_1
    //   405: bipush #70
    //   407: invokevirtual set : (I)V
    //   410: aload_2
    //   411: getstatic net/portswigger/Zkd.UNKNOWN_STRING : Lnet/portswigger/Zkd;
    //   414: invokevirtual contains : (Ljava/lang/Object;)Z
    //   417: ifeq -> 425
    //   420: getstatic net/portswigger/Zkd.UNKNOWN_STRING : Lnet/portswigger/Zkd;
    //   423: astore #4
    //   425: iload_0
    //   426: iflt -> 444
    //   429: aload_2
    //   430: getstatic net/portswigger/Zkd.UNKNOWN : Lnet/portswigger/Zkd;
    //   433: invokevirtual contains : (Ljava/lang/Object;)Z
    //   436: ifeq -> 444
    //   439: getstatic net/portswigger/Zkd.UNKNOWN : Lnet/portswigger/Zkd;
    //   442: astore #4
    //   444: iload_0
    //   445: bipush #46
    //   447: if_icmpne -> 469
    //   450: aload_2
    //   451: getstatic net/portswigger/Zkd.DOT : Lnet/portswigger/Zkd;
    //   454: invokevirtual contains : (Ljava/lang/Object;)Z
    //   457: ifeq -> 907
    //   460: getstatic net/portswigger/Zkd.DOT : Lnet/portswigger/Zkd;
    //   463: astore #4
    //   465: iload_3
    //   466: ifne -> 907
    //   469: iload_0
    //   470: bipush #65
    //   472: if_icmplt -> 481
    //   475: iload_0
    //   476: bipush #90
    //   478: if_icmple -> 499
    //   481: iload_0
    //   482: bipush #95
    //   484: if_icmpeq -> 499
    //   487: iload_0
    //   488: bipush #97
    //   490: if_icmplt -> 524
    //   493: iload_0
    //   494: bipush #122
    //   496: if_icmpgt -> 524
    //   499: aload_1
    //   500: bipush #56
    //   502: invokevirtual set : (I)V
    //   505: aload_2
    //   506: getstatic net/portswigger/Zkd.VARIABLE_NAME : Lnet/portswigger/Zkd;
    //   509: invokevirtual contains : (Ljava/lang/Object;)Z
    //   512: ifeq -> 907
    //   515: getstatic net/portswigger/Zkd.VARIABLE_NAME : Lnet/portswigger/Zkd;
    //   518: astore #4
    //   520: iload_3
    //   521: ifne -> 907
    //   524: iload_0
    //   525: bipush #58
    //   527: if_icmpne -> 549
    //   530: aload_2
    //   531: getstatic net/portswigger/Zkd.COLON : Lnet/portswigger/Zkd;
    //   534: invokevirtual contains : (Ljava/lang/Object;)Z
    //   537: ifeq -> 907
    //   540: getstatic net/portswigger/Zkd.COLON : Lnet/portswigger/Zkd;
    //   543: astore #4
    //   545: iload_3
    //   546: ifne -> 907
    //   549: iload_0
    //   550: bipush #123
    //   552: if_icmpne -> 574
    //   555: aload_2
    //   556: getstatic net/portswigger/Zkd.VARIABLE_START : Lnet/portswigger/Zkd;
    //   559: invokevirtual contains : (Ljava/lang/Object;)Z
    //   562: ifeq -> 907
    //   565: getstatic net/portswigger/Zkd.VARIABLE_START : Lnet/portswigger/Zkd;
    //   568: astore #4
    //   570: iload_3
    //   571: ifne -> 907
    //   574: iload_0
    //   575: bipush #44
    //   577: if_icmpne -> 599
    //   580: aload_2
    //   581: getstatic net/portswigger/Zkd.COMMA : Lnet/portswigger/Zkd;
    //   584: invokevirtual contains : (Ljava/lang/Object;)Z
    //   587: ifeq -> 907
    //   590: getstatic net/portswigger/Zkd.COMMA : Lnet/portswigger/Zkd;
    //   593: astore #4
    //   595: iload_3
    //   596: ifne -> 907
    //   599: iload_0
    //   600: bipush #48
    //   602: if_icmplt -> 630
    //   605: iload_0
    //   606: bipush #57
    //   608: if_icmpgt -> 630
    //   611: aload_2
    //   612: getstatic net/portswigger/Zkd.NATURAL_NUMBER : Lnet/portswigger/Zkd;
    //   615: invokevirtual contains : (Ljava/lang/Object;)Z
    //   618: ifeq -> 907
    //   621: getstatic net/portswigger/Zkd.NATURAL_NUMBER : Lnet/portswigger/Zkd;
    //   624: astore #4
    //   626: iload_3
    //   627: ifne -> 907
    //   630: iload_0
    //   631: bipush #41
    //   633: if_icmpne -> 655
    //   636: aload_2
    //   637: getstatic net/portswigger/Zkd.CLOSE_BRACKET : Lnet/portswigger/Zkd;
    //   640: invokevirtual contains : (Ljava/lang/Object;)Z
    //   643: ifeq -> 907
    //   646: getstatic net/portswigger/Zkd.CLOSE_BRACKET : Lnet/portswigger/Zkd;
    //   649: astore #4
    //   651: iload_3
    //   652: ifne -> 907
    //   655: iload_0
    //   656: bipush #40
    //   658: if_icmpne -> 680
    //   661: aload_2
    //   662: getstatic net/portswigger/Zkd.OPEN_BRACKET : Lnet/portswigger/Zkd;
    //   665: invokevirtual contains : (Ljava/lang/Object;)Z
    //   668: ifeq -> 907
    //   671: getstatic net/portswigger/Zkd.OPEN_BRACKET : Lnet/portswigger/Zkd;
    //   674: astore #4
    //   676: iload_3
    //   677: ifne -> 907
    //   680: iload_0
    //   681: bipush #34
    //   683: if_icmpne -> 705
    //   686: aload_2
    //   687: getstatic net/portswigger/Zkd.LITERAL_STRING_OPENING_QUOTE : Lnet/portswigger/Zkd;
    //   690: invokevirtual contains : (Ljava/lang/Object;)Z
    //   693: ifeq -> 907
    //   696: getstatic net/portswigger/Zkd.LITERAL_STRING_OPENING_QUOTE : Lnet/portswigger/Zkd;
    //   699: astore #4
    //   701: iload_3
    //   702: ifne -> 907
    //   705: iload_0
    //   706: bipush #96
    //   708: if_icmpne -> 730
    //   711: aload_2
    //   712: getstatic net/portswigger/Zkd.INTERPOLATABLE_STRING_OPENING_QUOTE : Lnet/portswigger/Zkd;
    //   715: invokevirtual contains : (Ljava/lang/Object;)Z
    //   718: ifeq -> 907
    //   721: getstatic net/portswigger/Zkd.INTERPOLATABLE_STRING_OPENING_QUOTE : Lnet/portswigger/Zkd;
    //   724: astore #4
    //   726: iload_3
    //   727: ifne -> 907
    //   730: iload_0
    //   731: bipush #61
    //   733: if_icmpne -> 755
    //   736: aload_2
    //   737: getstatic net/portswigger/Zkd.EQUALS : Lnet/portswigger/Zkd;
    //   740: invokevirtual contains : (Ljava/lang/Object;)Z
    //   743: ifeq -> 907
    //   746: getstatic net/portswigger/Zkd.EQUALS : Lnet/portswigger/Zkd;
    //   749: astore #4
    //   751: iload_3
    //   752: ifne -> 907
    //   755: iload_0
    //   756: bipush #10
    //   758: if_icmpne -> 780
    //   761: aload_2
    //   762: getstatic net/portswigger/Zkd.NEWLINE : Lnet/portswigger/Zkd;
    //   765: invokevirtual contains : (Ljava/lang/Object;)Z
    //   768: ifeq -> 907
    //   771: getstatic net/portswigger/Zkd.NEWLINE : Lnet/portswigger/Zkd;
    //   774: astore #4
    //   776: iload_3
    //   777: ifne -> 907
    //   780: iload_0
    //   781: bipush #35
    //   783: if_icmpne -> 811
    //   786: aload_1
    //   787: bipush #6
    //   789: invokevirtual set : (I)V
    //   792: aload_2
    //   793: getstatic net/portswigger/Zkd.COMMENT : Lnet/portswigger/Zkd;
    //   796: invokevirtual contains : (Ljava/lang/Object;)Z
    //   799: ifeq -> 907
    //   802: getstatic net/portswigger/Zkd.COMMENT : Lnet/portswigger/Zkd;
    //   805: astore #4
    //   807: iload_3
    //   808: ifne -> 907
    //   811: iload_0
    //   812: bipush #12
    //   814: if_icmpne -> 836
    //   817: aload_2
    //   818: getstatic net/portswigger/Zkd._TOKEN_4 : Lnet/portswigger/Zkd;
    //   821: invokevirtual contains : (Ljava/lang/Object;)Z
    //   824: ifeq -> 907
    //   827: getstatic net/portswigger/Zkd._TOKEN_4 : Lnet/portswigger/Zkd;
    //   830: astore #4
    //   832: iload_3
    //   833: ifne -> 907
    //   836: iload_0
    //   837: bipush #13
    //   839: if_icmpne -> 861
    //   842: aload_2
    //   843: getstatic net/portswigger/Zkd._TOKEN_3 : Lnet/portswigger/Zkd;
    //   846: invokevirtual contains : (Ljava/lang/Object;)Z
    //   849: ifeq -> 907
    //   852: getstatic net/portswigger/Zkd._TOKEN_3 : Lnet/portswigger/Zkd;
    //   855: astore #4
    //   857: iload_3
    //   858: ifne -> 907
    //   861: iload_0
    //   862: bipush #9
    //   864: if_icmpne -> 886
    //   867: aload_2
    //   868: getstatic net/portswigger/Zkd._TOKEN_2 : Lnet/portswigger/Zkd;
    //   871: invokevirtual contains : (Ljava/lang/Object;)Z
    //   874: ifeq -> 907
    //   877: getstatic net/portswigger/Zkd._TOKEN_2 : Lnet/portswigger/Zkd;
    //   880: astore #4
    //   882: iload_3
    //   883: ifne -> 907
    //   886: iload_0
    //   887: bipush #32
    //   889: if_icmpne -> 907
    //   892: aload_2
    //   893: getstatic net/portswigger/Zkd._TOKEN_1 : Lnet/portswigger/Zkd;
    //   896: invokevirtual contains : (Ljava/lang/Object;)Z
    //   899: ifeq -> 907
    //   902: getstatic net/portswigger/Zkd._TOKEN_1 : Lnet/portswigger/Zkd;
    //   905: astore #4
    //   907: aload #4
    //   909: areturn
  }
  
  private static Zkd ZF9(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 111)
      paramBitSet.set(89); 
    return zkd;
  }
  
  private static Zkd ZP(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 111)
      paramBitSet.set(30); 
    return zkd;
  }
  
  private static Zkd Zm(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 112)
      paramBitSet.set(38); 
    return zkd;
  }
  
  private static Zkd ZtE(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 101)
      paramBitSet.set(66); 
    return zkd;
  }
  
  private static Zkd Ztk(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 115)
      paramBitSet.set(24); 
    return zkd;
  }
  
  private static Zkd ZFL(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if ((paramInt >= 0 && paramInt <= 9) || paramInt == 11 || paramInt == 12 || paramInt >= 14) {
      paramBitSet.set(6);
      if (paramEnumSet.contains(Zkd.COMMENT))
        zkd = Zkd.COMMENT; 
    } 
    return zkd;
  }
  
  private static Zkd ZQ(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 105)
      paramBitSet.set(73); 
    return zkd;
  }
  
  private static Zkd Zt4(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 105)
      paramBitSet.set(3); 
    return zkd;
  }
  
  private static Zkd ZtP(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt >= 48 && paramInt <= 57) {
      paramBitSet.set(50);
      paramBitSet.set(65);
      if (paramEnumSet.contains(Zkd.NATURAL_NUMBER))
        zkd = Zkd.NATURAL_NUMBER; 
    } 
    return zkd;
  }
  
  private static Zkd ZtN(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 116 && paramEnumSet.contains(Zkd.HOST_FREQ))
      zkd = Zkd.HOST_FREQ; 
    return zkd;
  }
  
  private static Zkd Zr(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 101)
      paramBitSet.set(87); 
    return zkd;
  }
  
  private static Zkd Ztg(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 114 && paramEnumSet.contains(Zkd.AUTHOR_HEADER))
      zkd = Zkd.AUTHOR_HEADER; 
    return zkd;
  }
  
  private static Zkd ZFC(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 116)
      paramBitSet.set(55); 
    return zkd;
  }
  
  private static Zkd ZtW(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 97)
      paramBitSet.set(124); 
    return zkd;
  }
  
  private static Zkd ZE(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 101)
      paramBitSet.set(5); 
    return zkd;
  }
  
  private static Zkd ZtX(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 117)
      paramBitSet.set(61); 
    return zkd;
  }
  
  private static Zkd Zto(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 102)
      paramBitSet.set(1); 
    return zkd;
  }
  
  private static Zkd ZM(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 101)
      paramBitSet.set(91); 
    return zkd;
  }
  
  private static Zkd Zb(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 32)
      paramBitSet.set(17); 
    return zkd;
  }
  
  private static Zkd ZtB(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 105)
      paramBitSet.set(125); 
    return zkd;
  }
  
  private static Zkd ZtS(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 100 && paramEnumSet.contains(Zkd.BOOL_AND))
      zkd = Zkd.BOOL_AND; 
    return zkd;
  }
  
  private static Zkd Ztc(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 105)
      paramBitSet.set(33); 
    return zkd;
  }
  
  private static Zkd ZtM(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 116)
      paramBitSet.set(88); 
    return zkd;
  }
  
  private static Zkd Zt9(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 99)
      paramBitSet.set(72); 
    return zkd;
  }
  
  private static Zkd ZF_(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 109)
      paramBitSet.set(80); 
    return zkd;
  }
  
  private static Zkd ZtJ(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 110)
      paramBitSet.set(108); 
    return zkd;
  }
  
  private static Zkd ZW(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 10 && paramEnumSet.contains(Zkd._TOKEN_5))
      zkd = Zkd._TOKEN_5; 
    return zkd;
  }
  
  private static Zkd ZB(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 110)
      paramBitSet.set(19); 
    return zkd;
  }
  
  private static Zkd Zt5(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 117)
      paramBitSet.set(28); 
    return zkd;
  }
  
  private static Zkd ZL(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 111)
      paramBitSet.set(93); 
    return zkd;
  }
  
  private static Zkd Ztu(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 115)
      paramBitSet.set(129); 
    return zkd;
  }
  
  private static Zkd Zx(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 111)
      paramBitSet.set(34); 
    return zkd;
  }
  
  private static Zkd Ze(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 118)
      paramBitSet.set(43); 
    return zkd;
  }
  
  private static Zkd ZtR(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 115)
      paramBitSet.set(10); 
    return zkd;
  }
  
  private static Zkd Zts(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 45)
      paramBitSet.set(100); 
    return zkd;
  }
  
  private static Zkd ZFf(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 105)
      paramBitSet.set(74); 
    return zkd;
  }
  
  private static Zkd Ztn(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 101 && paramEnumSet.contains(Zkd.RESPONSE_FREQ))
      zkd = Zkd.RESPONSE_FREQ; 
    return zkd;
  }
  
  private static Zkd ZtY(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 116)
      paramBitSet.set(7); 
    return zkd;
  }
  
  private static Zkd ZtD(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 99)
      paramBitSet.set(42); 
    return zkd;
  }
  
  private static Zkd Zt_(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 114)
      paramBitSet.set(85); 
    return zkd;
  }
  
  private static Zkd ZtO(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 97 && paramEnumSet.contains(Zkd.LANGUAGE_LEVEL_1))
      zkd = Zkd.LANGUAGE_LEVEL_1; 
    return zkd;
  }
  
  private static Zkd Ztp(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 104 && paramEnumSet.contains(Zkd.RUN_FOR_EACH_HEADER))
      zkd = Zkd.RUN_FOR_EACH_HEADER; 
    return zkd;
  }
  
  private static Zkd Zl(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 101)
      paramBitSet.set(116); 
    return zkd;
  }
  
  private static Zkd Zt6(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 103)
      paramBitSet.set(16); 
    return zkd;
  }
  
  private static Zkd ZFW(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 116)
      paramBitSet.set(97); 
    return zkd;
  }
  
  private static Zkd Ztx(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 115)
      paramBitSet.set(37); 
    return zkd;
  }
  
  private static Zkd Zv(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 97)
      paramBitSet.set(48); 
    return zkd;
  }
  
  private static Zkd Zz(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 103)
      paramBitSet.set(98); 
    return zkd;
  }
  
  private static Zkd Zg(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 110)
      paramBitSet.set(102); 
    return zkd;
  }
  
  private static Zkd ZtZ(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt >= 48 && paramInt <= 57 && paramEnumSet.contains(Zkd.NATURAL_NUMBER))
      zkd = Zkd.NATURAL_NUMBER; 
    return zkd;
  }
  
  private static Zkd Zte(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 101)
      paramBitSet.set(31); 
    return zkd;
  }
  
  private static Zkd Zq(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 112)
      paramBitSet.set(68); 
    return zkd;
  }
  
  private static Zkd ZF(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 103)
      paramBitSet.set(131); 
    return zkd;
  }
  
  private static Zkd Ztq(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 97 && paramEnumSet.contains(Zkd.METADATA_HEADER))
      zkd = Zkd.METADATA_HEADER; 
    return zkd;
  }
  
  private static Zkd ZtF(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 104)
      paramBitSet.set(75); 
    return zkd;
  }
  
  private static Zkd Zj(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt >= 48 && paramInt <= 57) {
      paramBitSet.set(56);
      if (paramEnumSet.contains(Zkd.VARIABLE_NAME))
        zkd = Zkd.VARIABLE_NAME; 
    } else if ((paramInt >= 65 && paramInt <= 90) || paramInt == 95 || (paramInt >= 97 && paramInt <= 122)) {
      paramBitSet.set(56);
      if (paramEnumSet.contains(Zkd.VARIABLE_NAME))
        zkd = Zkd.VARIABLE_NAME; 
    } 
    return zkd;
  }
  
  private static Zkd ZS(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 97)
      paramBitSet.set(90); 
    return zkd;
  }
  
  private static Zkd ZtQ(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 101)
      paramBitSet.set(126); 
    return zkd;
  }
  
  private static Zkd Zk(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 111)
      paramBitSet.set(76); 
    return zkd;
  }
  
  private static Zkd ZFD(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 104)
      paramBitSet.set(11); 
    return zkd;
  }
  
  private static Zkd Zc(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 97)
      paramBitSet.set(53); 
    return zkd;
  }
  
  private static Zkd Zi(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 116)
      paramBitSet.set(41); 
    return zkd;
  }
  
  private static Zkd ZC(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 121 && paramEnumSet.contains(Zkd.ANY))
      zkd = Zkd.ANY; 
    return zkd;
  }
  
  private static Zkd ZtG(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 105)
      paramBitSet.set(120); 
    return zkd;
  }
  
  private static Zkd Zy(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt >= 48 && paramInt <= 57) {
      paramBitSet.set(50);
      if (paramEnumSet.contains(Zkd.NATURAL_NUMBER))
        zkd = Zkd.NATURAL_NUMBER; 
    } 
    return zkd;
  }
  
  private static Zkd Zt(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 114)
      paramBitSet.set(79); 
    return zkd;
  }
  
  private static Zkd ZtI(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 100)
      paramBitSet.set(14); 
    return zkd;
  }
  
  private static Zkd ZtC(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 111)
      paramBitSet.set(114); 
    return zkd;
  }
  
  private static Zkd ZK(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 105)
      paramBitSet.set(26); 
    return zkd;
  }
  
  private static Zkd ZY(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt >= 48 && paramInt <= 57) {
      paramBitSet.set(70);
      if (paramEnumSet.contains(Zkd.UNKNOWN_STRING))
        zkd = Zkd.UNKNOWN_STRING; 
    } else if ((paramInt >= 65 && paramInt <= 90) || paramInt == 95 || (paramInt >= 97 && paramInt <= 122)) {
      paramBitSet.set(70);
      if (paramEnumSet.contains(Zkd.UNKNOWN_STRING))
        zkd = Zkd.UNKNOWN_STRING; 
    } 
    return zkd;
  }
  
  private static Zkd Zw(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt >= 48 && paramInt <= 57) {
      paramBitSet.set(50);
      paramBitSet.set(9);
      paramBitSet.set(65);
      if (paramEnumSet.contains(Zkd.NATURAL_NUMBER))
        zkd = Zkd.NATURAL_NUMBER; 
    } 
    return zkd;
  }
  
  private static Zkd Zu(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 114)
      paramBitSet.set(8); 
    return zkd;
  }
  
  private static Zkd Zt3(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 111)
      paramBitSet.set(115); 
    return zkd;
  }
  
  private static Zkd Zt2(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 110)
      paramBitSet.set(128); 
    return zkd;
  }
  
  private static Zkd Ztd(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 111)
      paramBitSet.set(12); 
    return zkd;
  }
  
  private static Zkd ZR(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 116 && paramEnumSet.contains(Zkd.BOOL_NOT))
      zkd = Zkd.BOOL_NOT; 
    return zkd;
  }
  
  private static Zkd ZFj(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 101)
      paramBitSet.set(127); 
    return zkd;
  }
  
  private static Zkd ZT(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt >= 48 && paramInt <= 57) {
      paramBitSet.set(71);
      paramBitSet.set(50);
      paramBitSet.set(9);
      paramBitSet.set(65);
      if (paramEnumSet.contains(Zkd.NATURAL_NUMBER))
        zkd = Zkd.NATURAL_NUMBER; 
    } 
    return zkd;
  }
  
  private static Zkd ZtL(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 121 && paramEnumSet.contains(Zkd.QUERY))
      zkd = Zkd.QUERY; 
    return zkd;
  }
  
  private static Zkd ZFl(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 101 && paramEnumSet.contains(Zkd.NAME_HEADER))
      zkd = Zkd.NAME_HEADER; 
    return zkd;
  }
  
  private static Zkd Ztt(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 110)
      paramBitSet.set(21); 
    return zkd;
  }
  
  private static Zkd Ztv(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: aconst_null
    //   4: astore #4
    //   6: istore_3
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
    //   36: bipush #82
    //   38: invokevirtual set : (I)V
    //   41: iload_3
    //   42: ifne -> 82
    //   45: iload_0
    //   46: bipush #13
    //   48: if_icmpne -> 61
    //   51: aload_1
    //   52: bipush #27
    //   54: invokevirtual set : (I)V
    //   57: iload_3
    //   58: ifne -> 82
    //   61: iload_0
    //   62: bipush #10
    //   64: if_icmpne -> 82
    //   67: aload_2
    //   68: getstatic net/portswigger/Zkd._TOKEN_5 : Lnet/portswigger/Zkd;
    //   71: invokevirtual contains : (Ljava/lang/Object;)Z
    //   74: ifeq -> 82
    //   77: getstatic net/portswigger/Zkd._TOKEN_5 : Lnet/portswigger/Zkd;
    //   80: astore #4
    //   82: iload_0
    //   83: bipush #13
    //   85: if_icmpne -> 103
    //   88: aload_2
    //   89: getstatic net/portswigger/Zkd._TOKEN_5 : Lnet/portswigger/Zkd;
    //   92: invokevirtual contains : (Ljava/lang/Object;)Z
    //   95: ifeq -> 103
    //   98: getstatic net/portswigger/Zkd._TOKEN_5 : Lnet/portswigger/Zkd;
    //   101: astore #4
    //   103: aload #4
    //   105: areturn
  }
  
  private static Zkd Zty(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 121 && paramEnumSet.contains(Zkd.BODY))
      zkd = Zkd.BODY; 
    return zkd;
  }
  
  private static Zkd Z_(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 111)
      paramBitSet.set(69); 
    return zkd;
  }
  
  private static Zkd Zti(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 116)
      paramBitSet.set(64); 
    return zkd;
  }
  
  private static Zkd ZA(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt >= 48 && paramInt <= 57) {
      paramBitSet.set(71);
      paramBitSet.set(50);
      paramBitSet.set(9);
      paramBitSet.set(65);
      paramBitSet.set(78);
      if (paramEnumSet.contains(Zkd.NATURAL_NUMBER))
        zkd = Zkd.NATURAL_NUMBER; 
    } 
    return zkd;
  }
  
  private static Zkd ZFu(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 110 && paramEnumSet.contains(Zkd.THEN))
      zkd = Zkd.THEN; 
    return zkd;
  }
  
  private static Zkd ZH(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 104 && paramEnumSet.contains(Zkd.PATH_FREQ))
      zkd = Zkd.PATH_FREQ; 
    return zkd;
  }
  
  private static Zkd Zta(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 114)
      paramBitSet.set(92); 
    return zkd;
  }
  
  private static Zkd ZFV(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 110)
      paramBitSet.set(44); 
    return zkd;
  }
  
  private static Zkd ZtV(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 113)
      paramBitSet.set(112); 
    return zkd;
  }
  
  private static Zkd Zs(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 32)
      paramBitSet.set(58); 
    return zkd;
  }
  
  private static Zkd Ztb(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 107)
      paramBitSet.set(20); 
    return zkd;
  }
  
  private static Zkd ZtH(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 32)
      paramBitSet.set(119); 
    return zkd;
  }
  
  private static Zkd Zh(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 101)
      paramBitSet.set(45); 
    return zkd;
  }
  
  private static Zkd Zt7(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 101)
      paramBitSet.set(130); 
    return zkd;
  }
  
  private static Zkd Zo(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 97)
      paramBitSet.set(67); 
    return zkd;
  }
  
  private static Zkd ZF1(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 115 && paramEnumSet.contains(Zkd.TAGS_HEADER))
      zkd = Zkd.TAGS_HEADER; 
    return zkd;
  }
  
  private static Zkd ZX(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 101)
      paramBitSet.set(104); 
    return zkd;
  }
  
  private static Zkd Ztl(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 98)
      paramBitSet.set(122); 
    return zkd;
  }
  
  private static Zkd ZFF(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 117)
      paramBitSet.set(13); 
    return zkd;
  }
  
  private static Zkd ZF8(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 115)
      paramBitSet.set(132); 
    return zkd;
  }
  
  private static Zkd ZFZ(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 110)
      paramBitSet.set(63); 
    return zkd;
  }
  
  private static Zkd ZtA(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 115)
      paramBitSet.set(52); 
    return zkd;
  }
  
  private static Zkd Ztz(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 102)
      paramBitSet.set(36); 
    return zkd;
  }
  
  private static Zkd ZI(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 114 && paramEnumSet.contains(Zkd.BOOL_OR))
      zkd = Zkd.BOOL_OR; 
    return zkd;
  }
  
  private static Zkd ZZ(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 101)
      paramBitSet.set(105); 
    return zkd;
  }
  
  private static Zkd ZtU(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 116 && paramEnumSet.contains(Zkd.INSERTION_POINT_FREQ))
      zkd = Zkd.INSERTION_POINT_FREQ; 
    return zkd;
  }
  
  private static Zkd Zp(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 100)
      paramBitSet.set(77); 
    return zkd;
  }
  
  private static Zkd Ztm(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 117)
      paramBitSet.set(4); 
    return zkd;
  }
  
  private static Zkd Zn(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 110)
      paramBitSet.set(94); 
    return zkd;
  }
  
  private static Zkd Ztw(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 117)
      paramBitSet.set(51); 
    return zkd;
  }
  
  private static Zkd ZO(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 50)
      paramBitSet.set(35); 
    return zkd;
  }
  
  private static Zkd Zf(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 110)
      paramBitSet.set(46); 
    return zkd;
  }
  
  private static Zkd Zt1(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 110 && paramEnumSet.contains(Zkd.DESCRIPTION_HEADER))
      zkd = Zkd.DESCRIPTION_HEADER; 
    return zkd;
  }
  
  private static Zkd ZD(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 110 && paramEnumSet.contains(Zkd.GIVEN_HEADER))
      zkd = Zkd.GIVEN_HEADER; 
    return zkd;
  }
  
  private static Zkd ZU(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 111)
      paramBitSet.set(118); 
    return zkd;
  }
  
  private static Zkd ZG(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 100)
      paramBitSet.set(83); 
    return zkd;
  }
  
  private static Zkd Zt0(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 112)
      paramBitSet.set(84); 
    return zkd;
  }
  
  private static Zkd ZV(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 111)
      paramBitSet.set(111); 
    return zkd;
  }
  
  private static Zkd Zd(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 97)
      paramBitSet.set(25); 
    return zkd;
  }
  
  private static Zkd Ztj(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 101)
      paramBitSet.set(62); 
    return zkd;
  }
  
  private static Zkd Ztr(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 97)
      paramBitSet.set(23); 
    return zkd;
  }
  
  private static Zkd ZJ(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 116)
      paramBitSet.set(54); 
    return zkd;
  }
  
  private static Zkd Zt8(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 101 && paramEnumSet.contains(Zkd.COOKIE))
      zkd = Zkd.COOKIE; 
    return zkd;
  }
  
  private static Zkd ZFv(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 97)
      paramBitSet.set(39); 
    return zkd;
  }
  
  private static Zkd Za(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 114 && paramEnumSet.contains(Zkd.HEADER))
      zkd = Zkd.HEADER; 
    return zkd;
  }
  
  private static Zkd ZtT(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 101 && paramEnumSet.contains(Zkd.DEFINE_HEADER))
      zkd = Zkd.DEFINE_HEADER; 
    return zkd;
  }
  
  private static Zkd ZFq(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 116 && paramEnumSet.contains(Zkd.REQUEST_FREQ))
      zkd = Zkd.REQUEST_FREQ; 
    return zkd;
  }
  
  private static Zkd ZtK(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 97)
      paramBitSet.set(109); 
    return zkd;
  }
  
  private static Zkd ZN(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 101 && paramEnumSet.contains(Zkd.LANGUAGE_HEADER))
      zkd = Zkd.LANGUAGE_HEADER; 
    return zkd;
  }
  
  private static Zkd Zth(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 101)
      paramBitSet.set(40); 
    return zkd;
  }
  
  private static void Zf() {
    Zch[] arrayOfZch = { 
        Zzh::Ztf, Zzh::ZF9, Zzh::ZP, Zzh::Zm, Zzh::ZtE, Zzh::Ztk, Zzh::ZFL, Zzh::ZQ, Zzh::Zt4, Zzh::ZtP, 
        Zzh::ZtN, Zzh::Zr, Zzh::Ztg, Zzh::ZFC, Zzh::ZtW, Zzh::ZE, Zzh::ZtX, Zzh::Zto, Zzh::ZM, Zzh::Zb, 
        Zzh::ZtB, Zzh::ZtS, Zzh::Ztc, Zzh::ZtM, Zzh::Zt9, Zzh::ZF_, Zzh::ZtJ, Zzh::ZW, Zzh::ZB, Zzh::Zt5, 
        Zzh::ZL, Zzh::Ztu, Zzh::Zx, Zzh::Ze, Zzh::ZtR, Zzh::Zts, Zzh::ZFf, Zzh::Ztn, Zzh::ZtY, Zzh::ZtD, 
        Zzh::Zt_, Zzh::ZtO, Zzh::Ztp, Zzh::Zl, Zzh::Zt6, Zzh::ZFW, Zzh::Ztx, Zzh::Zv, Zzh::Zz, Zzh::Zg, 
        Zzh::ZtZ, Zzh::Zte, Zzh::Zq, Zzh::ZF, Zzh::Ztq, Zzh::ZtF, Zzh::Zj, Zzh::ZS, Zzh::ZtQ, Zzh::Zk, 
        Zzh::ZFD, Zzh::Zc, Zzh::Zi, Zzh::ZC, Zzh::ZtG, Zzh::Zy, Zzh::Zt, Zzh::ZtI, Zzh::ZtC, Zzh::ZK, 
        Zzh::ZY, Zzh::Zw, Zzh::Zu, Zzh::Zt3, Zzh::Zt2, Zzh::Ztd, Zzh::ZR, Zzh::ZFj, Zzh::ZT, Zzh::ZtL, 
        Zzh::ZFl, Zzh::Ztt, Zzh::Ztv, Zzh::Zty, Zzh::Z_, Zzh::Zti, Zzh::ZA, Zzh::ZFu, Zzh::ZH, Zzh::Zta, 
        Zzh::ZFV, Zzh::ZtV, Zzh::Zs, Zzh::Ztb, Zzh::ZtH, Zzh::Zh, Zzh::Zt7, Zzh::Zo, Zzh::ZF1, Zzh::ZX, 
        Zzh::Ztl, Zzh::ZFF, Zzh::ZF8, Zzh::ZFZ, Zzh::ZtA, Zzh::Ztz, Zzh::ZI, Zzh::ZZ, Zzh::ZtU, Zzh::Zp, 
        Zzh::Ztm, Zzh::Zn, Zzh::Ztw, Zzh::ZO, Zzh::Zf, Zzh::Zt1, Zzh::ZD, Zzh::ZU, Zzh::ZG, Zzh::Zt0, 
        Zzh::ZV, Zzh::Zd, Zzh::Ztj, Zzh::Ztr, Zzh::ZJ, Zzh::Zt8, Zzh::ZFv, Zzh::Za, Zzh::ZtT, Zzh::ZFq, 
        Zzh::ZtK, Zzh::ZN, Zzh::Zth };
    Zf0.Zo.put(Zrm4.DEFAULT, arrayOfZch);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zzh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */