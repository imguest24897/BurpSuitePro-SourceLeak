package net.portswigger;

import java.util.BitSet;
import java.util.EnumSet;

class Zzb {
  private static Zfh Zoh(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    // Byte code:
    //   0: invokestatic Za : ()[Ljava/lang/String;
    //   3: aconst_null
    //   4: astore #4
    //   6: astore_3
    //   7: iload_0
    //   8: bipush #35
    //   10: if_icmpne -> 23
    //   13: aload_1
    //   14: bipush #48
    //   16: invokevirtual set : (I)V
    //   19: aload_3
    //   20: ifnonnull -> 357
    //   23: iload_0
    //   24: bipush #48
    //   26: if_icmplt -> 75
    //   29: iload_0
    //   30: bipush #57
    //   32: if_icmpgt -> 75
    //   35: aload_1
    //   36: bipush #56
    //   38: invokevirtual set : (I)V
    //   41: aload_1
    //   42: bipush #73
    //   44: invokevirtual set : (I)V
    //   47: aload_1
    //   48: bipush #69
    //   50: invokevirtual set : (I)V
    //   53: aload_1
    //   54: bipush #8
    //   56: invokevirtual set : (I)V
    //   59: aload_1
    //   60: bipush #32
    //   62: invokevirtual set : (I)V
    //   65: aload_1
    //   66: bipush #34
    //   68: invokevirtual set : (I)V
    //   71: aload_3
    //   72: ifnonnull -> 357
    //   75: iload_0
    //   76: bipush #97
    //   78: if_icmpne -> 102
    //   81: aload_1
    //   82: bipush #10
    //   84: invokevirtual set : (I)V
    //   87: aload_1
    //   88: bipush #95
    //   90: invokevirtual set : (I)V
    //   93: aload_1
    //   94: iconst_4
    //   95: invokevirtual set : (I)V
    //   98: aload_3
    //   99: ifnonnull -> 357
    //   102: iload_0
    //   103: bipush #98
    //   105: if_icmpne -> 118
    //   108: aload_1
    //   109: bipush #11
    //   111: invokevirtual set : (I)V
    //   114: aload_3
    //   115: ifnonnull -> 357
    //   118: iload_0
    //   119: bipush #99
    //   121: if_icmpne -> 134
    //   124: aload_1
    //   125: bipush #42
    //   127: invokevirtual set : (I)V
    //   130: aload_3
    //   131: ifnonnull -> 357
    //   134: iload_0
    //   135: bipush #100
    //   137: if_icmpne -> 156
    //   140: aload_1
    //   141: bipush #19
    //   143: invokevirtual set : (I)V
    //   146: aload_1
    //   147: bipush #76
    //   149: invokevirtual set : (I)V
    //   152: aload_3
    //   153: ifnonnull -> 357
    //   156: iload_0
    //   157: bipush #103
    //   159: if_icmpne -> 172
    //   162: aload_1
    //   163: bipush #97
    //   165: invokevirtual set : (I)V
    //   168: aload_3
    //   169: ifnonnull -> 357
    //   172: iload_0
    //   173: bipush #104
    //   175: if_icmpne -> 194
    //   178: aload_1
    //   179: bipush #78
    //   181: invokevirtual set : (I)V
    //   184: aload_1
    //   185: bipush #44
    //   187: invokevirtual set : (I)V
    //   190: aload_3
    //   191: ifnonnull -> 357
    //   194: iload_0
    //   195: bipush #105
    //   197: if_icmpne -> 210
    //   200: aload_1
    //   201: bipush #55
    //   203: invokevirtual set : (I)V
    //   206: aload_3
    //   207: ifnonnull -> 357
    //   210: iload_0
    //   211: bipush #108
    //   213: if_icmpne -> 226
    //   216: aload_1
    //   217: bipush #99
    //   219: invokevirtual set : (I)V
    //   222: aload_3
    //   223: ifnonnull -> 357
    //   226: iload_0
    //   227: bipush #109
    //   229: if_icmpne -> 242
    //   232: aload_1
    //   233: bipush #14
    //   235: invokevirtual set : (I)V
    //   238: aload_3
    //   239: ifnonnull -> 357
    //   242: iload_0
    //   243: bipush #110
    //   245: if_icmpne -> 264
    //   248: aload_1
    //   249: bipush #20
    //   251: invokevirtual set : (I)V
    //   254: aload_1
    //   255: bipush #62
    //   257: invokevirtual set : (I)V
    //   260: aload_3
    //   261: ifnonnull -> 357
    //   264: iload_0
    //   265: bipush #111
    //   267: if_icmpne -> 280
    //   270: aload_1
    //   271: bipush #91
    //   273: invokevirtual set : (I)V
    //   276: aload_3
    //   277: ifnonnull -> 357
    //   280: iload_0
    //   281: bipush #113
    //   283: if_icmpne -> 296
    //   286: aload_1
    //   287: bipush #53
    //   289: invokevirtual set : (I)V
    //   292: aload_3
    //   293: ifnonnull -> 357
    //   296: iload_0
    //   297: bipush #114
    //   299: if_icmpne -> 324
    //   302: aload_1
    //   303: bipush #70
    //   305: invokevirtual set : (I)V
    //   308: aload_1
    //   309: bipush #43
    //   311: invokevirtual set : (I)V
    //   314: aload_1
    //   315: bipush #116
    //   317: invokevirtual set : (I)V
    //   320: aload_3
    //   321: ifnonnull -> 357
    //   324: iload_0
    //   325: bipush #116
    //   327: if_icmpne -> 345
    //   330: aload_1
    //   331: bipush #79
    //   333: invokevirtual set : (I)V
    //   336: aload_1
    //   337: iconst_3
    //   338: invokevirtual set : (I)V
    //   341: aload_3
    //   342: ifnonnull -> 357
    //   345: iload_0
    //   346: bipush #118
    //   348: if_icmpne -> 357
    //   351: aload_1
    //   352: bipush #88
    //   354: invokevirtual set : (I)V
    //   357: iload_0
    //   358: bipush #65
    //   360: if_icmplt -> 369
    //   363: iload_0
    //   364: bipush #90
    //   366: if_icmple -> 387
    //   369: iload_0
    //   370: bipush #95
    //   372: if_icmpeq -> 387
    //   375: iload_0
    //   376: bipush #97
    //   378: if_icmplt -> 408
    //   381: iload_0
    //   382: bipush #122
    //   384: if_icmpgt -> 408
    //   387: aload_1
    //   388: bipush #28
    //   390: invokevirtual set : (I)V
    //   393: aload_2
    //   394: getstatic net/portswigger/Zfh.UNKNOWN_STRING : Lnet/portswigger/Zfh;
    //   397: invokevirtual contains : (Ljava/lang/Object;)Z
    //   400: ifeq -> 408
    //   403: getstatic net/portswigger/Zfh.UNKNOWN_STRING : Lnet/portswigger/Zfh;
    //   406: astore #4
    //   408: iload_0
    //   409: iflt -> 427
    //   412: aload_2
    //   413: getstatic net/portswigger/Zfh.UNKNOWN : Lnet/portswigger/Zfh;
    //   416: invokevirtual contains : (Ljava/lang/Object;)Z
    //   419: ifeq -> 427
    //   422: getstatic net/portswigger/Zfh.UNKNOWN : Lnet/portswigger/Zfh;
    //   425: astore #4
    //   427: iload_0
    //   428: bipush #46
    //   430: if_icmpne -> 452
    //   433: aload_2
    //   434: getstatic net/portswigger/Zfh.DOT : Lnet/portswigger/Zfh;
    //   437: invokevirtual contains : (Ljava/lang/Object;)Z
    //   440: ifeq -> 890
    //   443: getstatic net/portswigger/Zfh.DOT : Lnet/portswigger/Zfh;
    //   446: astore #4
    //   448: aload_3
    //   449: ifnonnull -> 890
    //   452: iload_0
    //   453: bipush #65
    //   455: if_icmplt -> 464
    //   458: iload_0
    //   459: bipush #90
    //   461: if_icmple -> 482
    //   464: iload_0
    //   465: bipush #95
    //   467: if_icmpeq -> 482
    //   470: iload_0
    //   471: bipush #97
    //   473: if_icmplt -> 507
    //   476: iload_0
    //   477: bipush #122
    //   479: if_icmpgt -> 507
    //   482: aload_1
    //   483: bipush #111
    //   485: invokevirtual set : (I)V
    //   488: aload_2
    //   489: getstatic net/portswigger/Zfh.VARIABLE_NAME : Lnet/portswigger/Zfh;
    //   492: invokevirtual contains : (Ljava/lang/Object;)Z
    //   495: ifeq -> 890
    //   498: getstatic net/portswigger/Zfh.VARIABLE_NAME : Lnet/portswigger/Zfh;
    //   501: astore #4
    //   503: aload_3
    //   504: ifnonnull -> 890
    //   507: iload_0
    //   508: bipush #58
    //   510: if_icmpne -> 532
    //   513: aload_2
    //   514: getstatic net/portswigger/Zfh.COLON : Lnet/portswigger/Zfh;
    //   517: invokevirtual contains : (Ljava/lang/Object;)Z
    //   520: ifeq -> 890
    //   523: getstatic net/portswigger/Zfh.COLON : Lnet/portswigger/Zfh;
    //   526: astore #4
    //   528: aload_3
    //   529: ifnonnull -> 890
    //   532: iload_0
    //   533: bipush #123
    //   535: if_icmpne -> 557
    //   538: aload_2
    //   539: getstatic net/portswigger/Zfh.VARIABLE_START : Lnet/portswigger/Zfh;
    //   542: invokevirtual contains : (Ljava/lang/Object;)Z
    //   545: ifeq -> 890
    //   548: getstatic net/portswigger/Zfh.VARIABLE_START : Lnet/portswigger/Zfh;
    //   551: astore #4
    //   553: aload_3
    //   554: ifnonnull -> 890
    //   557: iload_0
    //   558: bipush #44
    //   560: if_icmpne -> 582
    //   563: aload_2
    //   564: getstatic net/portswigger/Zfh.COMMA : Lnet/portswigger/Zfh;
    //   567: invokevirtual contains : (Ljava/lang/Object;)Z
    //   570: ifeq -> 890
    //   573: getstatic net/portswigger/Zfh.COMMA : Lnet/portswigger/Zfh;
    //   576: astore #4
    //   578: aload_3
    //   579: ifnonnull -> 890
    //   582: iload_0
    //   583: bipush #48
    //   585: if_icmplt -> 613
    //   588: iload_0
    //   589: bipush #57
    //   591: if_icmpgt -> 613
    //   594: aload_2
    //   595: getstatic net/portswigger/Zfh.NATURAL_NUMBER : Lnet/portswigger/Zfh;
    //   598: invokevirtual contains : (Ljava/lang/Object;)Z
    //   601: ifeq -> 890
    //   604: getstatic net/portswigger/Zfh.NATURAL_NUMBER : Lnet/portswigger/Zfh;
    //   607: astore #4
    //   609: aload_3
    //   610: ifnonnull -> 890
    //   613: iload_0
    //   614: bipush #41
    //   616: if_icmpne -> 638
    //   619: aload_2
    //   620: getstatic net/portswigger/Zfh.CLOSE_BRACKET : Lnet/portswigger/Zfh;
    //   623: invokevirtual contains : (Ljava/lang/Object;)Z
    //   626: ifeq -> 890
    //   629: getstatic net/portswigger/Zfh.CLOSE_BRACKET : Lnet/portswigger/Zfh;
    //   632: astore #4
    //   634: aload_3
    //   635: ifnonnull -> 890
    //   638: iload_0
    //   639: bipush #40
    //   641: if_icmpne -> 663
    //   644: aload_2
    //   645: getstatic net/portswigger/Zfh.OPEN_BRACKET : Lnet/portswigger/Zfh;
    //   648: invokevirtual contains : (Ljava/lang/Object;)Z
    //   651: ifeq -> 890
    //   654: getstatic net/portswigger/Zfh.OPEN_BRACKET : Lnet/portswigger/Zfh;
    //   657: astore #4
    //   659: aload_3
    //   660: ifnonnull -> 890
    //   663: iload_0
    //   664: bipush #34
    //   666: if_icmpne -> 688
    //   669: aload_2
    //   670: getstatic net/portswigger/Zfh.LITERAL_STRING_OPENING_QUOTE : Lnet/portswigger/Zfh;
    //   673: invokevirtual contains : (Ljava/lang/Object;)Z
    //   676: ifeq -> 890
    //   679: getstatic net/portswigger/Zfh.LITERAL_STRING_OPENING_QUOTE : Lnet/portswigger/Zfh;
    //   682: astore #4
    //   684: aload_3
    //   685: ifnonnull -> 890
    //   688: iload_0
    //   689: bipush #96
    //   691: if_icmpne -> 713
    //   694: aload_2
    //   695: getstatic net/portswigger/Zfh.INTERPOLATABLE_STRING_OPENING_QUOTE : Lnet/portswigger/Zfh;
    //   698: invokevirtual contains : (Ljava/lang/Object;)Z
    //   701: ifeq -> 890
    //   704: getstatic net/portswigger/Zfh.INTERPOLATABLE_STRING_OPENING_QUOTE : Lnet/portswigger/Zfh;
    //   707: astore #4
    //   709: aload_3
    //   710: ifnonnull -> 890
    //   713: iload_0
    //   714: bipush #61
    //   716: if_icmpne -> 738
    //   719: aload_2
    //   720: getstatic net/portswigger/Zfh.EQUALS : Lnet/portswigger/Zfh;
    //   723: invokevirtual contains : (Ljava/lang/Object;)Z
    //   726: ifeq -> 890
    //   729: getstatic net/portswigger/Zfh.EQUALS : Lnet/portswigger/Zfh;
    //   732: astore #4
    //   734: aload_3
    //   735: ifnonnull -> 890
    //   738: iload_0
    //   739: bipush #10
    //   741: if_icmpne -> 763
    //   744: aload_2
    //   745: getstatic net/portswigger/Zfh.NEWLINE : Lnet/portswigger/Zfh;
    //   748: invokevirtual contains : (Ljava/lang/Object;)Z
    //   751: ifeq -> 890
    //   754: getstatic net/portswigger/Zfh.NEWLINE : Lnet/portswigger/Zfh;
    //   757: astore #4
    //   759: aload_3
    //   760: ifnonnull -> 890
    //   763: iload_0
    //   764: bipush #35
    //   766: if_icmpne -> 794
    //   769: aload_1
    //   770: bipush #33
    //   772: invokevirtual set : (I)V
    //   775: aload_2
    //   776: getstatic net/portswigger/Zfh.COMMENT : Lnet/portswigger/Zfh;
    //   779: invokevirtual contains : (Ljava/lang/Object;)Z
    //   782: ifeq -> 890
    //   785: getstatic net/portswigger/Zfh.COMMENT : Lnet/portswigger/Zfh;
    //   788: astore #4
    //   790: aload_3
    //   791: ifnonnull -> 890
    //   794: iload_0
    //   795: bipush #12
    //   797: if_icmpne -> 819
    //   800: aload_2
    //   801: getstatic net/portswigger/Zfh._TOKEN_4 : Lnet/portswigger/Zfh;
    //   804: invokevirtual contains : (Ljava/lang/Object;)Z
    //   807: ifeq -> 890
    //   810: getstatic net/portswigger/Zfh._TOKEN_4 : Lnet/portswigger/Zfh;
    //   813: astore #4
    //   815: aload_3
    //   816: ifnonnull -> 890
    //   819: iload_0
    //   820: bipush #13
    //   822: if_icmpne -> 844
    //   825: aload_2
    //   826: getstatic net/portswigger/Zfh._TOKEN_3 : Lnet/portswigger/Zfh;
    //   829: invokevirtual contains : (Ljava/lang/Object;)Z
    //   832: ifeq -> 890
    //   835: getstatic net/portswigger/Zfh._TOKEN_3 : Lnet/portswigger/Zfh;
    //   838: astore #4
    //   840: aload_3
    //   841: ifnonnull -> 890
    //   844: iload_0
    //   845: bipush #9
    //   847: if_icmpne -> 869
    //   850: aload_2
    //   851: getstatic net/portswigger/Zfh._TOKEN_2 : Lnet/portswigger/Zfh;
    //   854: invokevirtual contains : (Ljava/lang/Object;)Z
    //   857: ifeq -> 890
    //   860: getstatic net/portswigger/Zfh._TOKEN_2 : Lnet/portswigger/Zfh;
    //   863: astore #4
    //   865: aload_3
    //   866: ifnonnull -> 890
    //   869: iload_0
    //   870: bipush #32
    //   872: if_icmpne -> 890
    //   875: aload_2
    //   876: getstatic net/portswigger/Zfh._TOKEN_1 : Lnet/portswigger/Zfh;
    //   879: invokevirtual contains : (Ljava/lang/Object;)Z
    //   882: ifeq -> 890
    //   885: getstatic net/portswigger/Zfh._TOKEN_1 : Lnet/portswigger/Zfh;
    //   888: astore #4
    //   890: aload #4
    //   892: areturn
  }
  
  private static Zfh Zf(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 105)
      paramBitSet.set(86); 
    return zfh;
  }
  
  private static Zfh Zo9(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 107)
      paramBitSet.set(30); 
    return zfh;
  }
  
  private static Zfh ZoN(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 104)
      paramBitSet.set(37); 
    return zfh;
  }
  
  private static Zfh ZTs(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 110)
      paramBitSet.set(63); 
    return zfh;
  }
  
  private static Zfh ZoS(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101)
      paramBitSet.set(24); 
    return zfh;
  }
  
  private static Zfh ZI(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 104)
      paramBitSet.set(98); 
    return zfh;
  }
  
  private static Zfh Z_(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 110 && paramEnumSet.contains(Zfh.THEN))
      zfh = Zfh.THEN; 
    return zfh;
  }
  
  private static Zfh Zoj(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt >= 48 && paramInt <= 57) {
      paramBitSet.set(56);
      paramBitSet.set(73);
      paramBitSet.set(32);
      paramBitSet.set(34);
      if (paramEnumSet.contains(Zfh.NATURAL_NUMBER))
        zfh = Zfh.NATURAL_NUMBER; 
    } 
    return zfh;
  }
  
  private static Zfh Zou(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 10 && paramEnumSet.contains(Zfh._TOKEN_5))
      zfh = Zfh._TOKEN_5; 
    return zfh;
  }
  
  private static Zfh Zd(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 110)
      paramBitSet.set(68); 
    return zfh;
  }
  
  private static Zfh ZE(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 111)
      paramBitSet.set(84); 
    return zfh;
  }
  
  private static Zfh ZTq(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 114)
      paramBitSet.set(107); 
    return zfh;
  }
  
  private static Zfh Zi(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 114 && paramEnumSet.contains(Zfh.AUTHOR_HEADER))
      zfh = Zfh.AUTHOR_HEADER; 
    return zfh;
  }
  
  private static Zfh ZN(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101)
      paramBitSet.set(121); 
    return zfh;
  }
  
  private static Zfh Zo_(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 100)
      paramBitSet.set(5); 
    return zfh;
  }
  
  private static Zfh ZoE(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 113)
      paramBitSet.set(58); 
    return zfh;
  }
  
  private static Zfh ZoC(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 102)
      paramBitSet.set(1); 
    return zfh;
  }
  
  private static Zfh Zov(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 110 && paramEnumSet.contains(Zfh.DESCRIPTION_HEADER))
      zfh = Zfh.DESCRIPTION_HEADER; 
    return zfh;
  }
  
  private static Zfh Zq(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101)
      paramBitSet.set(17); 
    return zfh;
  }
  
  private static Zfh Zo3(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 111)
      paramBitSet.set(122); 
    return zfh;
  }
  
  private static Zfh Zo6(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 97)
      paramBitSet.set(15); 
    return zfh;
  }
  
  private static Zfh ZP(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 115 && paramEnumSet.contains(Zfh.TAGS_HEADER))
      zfh = Zfh.TAGS_HEADER; 
    return zfh;
  }
  
  private static Zfh Zz(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 105)
      paramBitSet.set(85); 
    return zfh;
  }
  
  private static Zfh Zoo(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 114 && paramEnumSet.contains(Zfh.HEADER))
      zfh = Zfh.HEADER; 
    return zfh;
  }
  
  private static Zfh Zoq(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 99)
      paramBitSet.set(77); 
    return zfh;
  }
  
  private static Zfh Zon(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 111)
      paramBitSet.set(105); 
    return zfh;
  }
  
  private static Zfh ZK(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 103)
      paramBitSet.set(22); 
    return zfh;
  }
  
  private static Zfh Zoe(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt >= 48 && paramInt <= 57) {
      paramBitSet.set(28);
      if (paramEnumSet.contains(Zfh.UNKNOWN_STRING))
        zfh = Zfh.UNKNOWN_STRING; 
    } else if ((paramInt >= 65 && paramInt <= 90) || paramInt == 95 || (paramInt >= 97 && paramInt <= 122)) {
      paramBitSet.set(28);
      if (paramEnumSet.contains(Zfh.UNKNOWN_STRING))
        zfh = Zfh.UNKNOWN_STRING; 
    } 
    return zfh;
  }
  
  private static Zfh Za(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 121 && paramEnumSet.contains(Zfh.BODY))
      zfh = Zfh.BODY; 
    return zfh;
  }
  
  private static Zfh Zof(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 105)
      paramBitSet.set(90); 
    return zfh;
  }
  
  private static Zfh ZZ(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101)
      paramBitSet.set(126); 
    return zfh;
  }
  
  private static Zfh Zoi(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt >= 48 && paramInt <= 57) {
      paramBitSet.set(73);
      paramBitSet.set(34);
      if (paramEnumSet.contains(Zfh.NATURAL_NUMBER))
        zfh = Zfh.NATURAL_NUMBER; 
    } 
    return zfh;
  }
  
  private static Zfh ZTQ(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if ((paramInt >= 0 && paramInt <= 9) || paramInt == 11 || paramInt == 12 || paramInt >= 14) {
      paramBitSet.set(33);
      if (paramEnumSet.contains(Zfh.COMMENT))
        zfh = Zfh.COMMENT; 
    } 
    return zfh;
  }
  
  private static Zfh Zj(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt >= 48 && paramInt <= 57) {
      paramBitSet.set(73);
      if (paramEnumSet.contains(Zfh.NATURAL_NUMBER))
        zfh = Zfh.NATURAL_NUMBER; 
    } 
    return zfh;
  }
  
  private static Zfh Zop(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101 && paramEnumSet.contains(Zfh.NAME_HEADER))
      zfh = Zfh.NAME_HEADER; 
    return zfh;
  }
  
  private static Zfh ZG(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 111)
      paramBitSet.set(71); 
    return zfh;
  }
  
  private static Zfh ZoU(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101)
      paramBitSet.set(7); 
    return zfh;
  }
  
  private static Zfh Zs(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101)
      paramBitSet.set(41); 
    return zfh;
  }
  
  private static Zfh ZoM(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 103)
      paramBitSet.set(82); 
    return zfh;
  }
  
  private static Zfh ZoY(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 110 && paramEnumSet.contains(Zfh.GIVEN_HEADER))
      zfh = Zfh.GIVEN_HEADER; 
    return zfh;
  }
  
  private static Zfh ZR(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 114)
      paramBitSet.set(114); 
    return zfh;
  }
  
  private static Zfh ZC(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 111)
      paramBitSet.set(113); 
    return zfh;
  }
  
  private static Zfh Zor(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101)
      paramBitSet.set(16); 
    return zfh;
  }
  
  private static Zfh Zo(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 111)
      paramBitSet.set(94); 
    return zfh;
  }
  
  private static Zfh Zog(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 115)
      paramBitSet.set(46); 
    return zfh;
  }
  
  private static Zfh Zo1(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101 && paramEnumSet.contains(Zfh.RESPONSE_FREQ))
      zfh = Zfh.RESPONSE_FREQ; 
    return zfh;
  }
  
  private static Zfh Zb(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 116 && paramEnumSet.contains(Zfh.INSERTION_POINT_FREQ))
      zfh = Zfh.INSERTION_POINT_FREQ; 
    return zfh;
  }
  
  private static Zfh ZoR(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
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
    //   36: bipush #48
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
  
  private static Zfh ZW(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 98)
      paramBitSet.set(31); 
    return zfh;
  }
  
  private static Zfh Zot(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 116)
      paramBitSet.set(65); 
    return zfh;
  }
  
  private static Zfh Zo8(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101)
      paramBitSet.set(128); 
    return zfh;
  }
  
  private static Zfh ZJ(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 97)
      paramBitSet.set(96); 
    return zfh;
  }
  
  private static Zfh ZoV(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 117)
      paramBitSet.set(72); 
    return zfh;
  }
  
  private static Zfh Ze(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 99)
      paramBitSet.set(87); 
    return zfh;
  }
  
  private static Zfh ZT_(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 110)
      paramBitSet.set(123); 
    return zfh;
  }
  
  private static Zfh ZT0(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt >= 48 && paramInt <= 57) {
      paramBitSet.set(73);
      paramBitSet.set(32);
      paramBitSet.set(34);
      if (paramEnumSet.contains(Zfh.NATURAL_NUMBER))
        zfh = Zfh.NATURAL_NUMBER; 
    } 
    return zfh;
  }
  
  private static Zfh Zu(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 116 && paramEnumSet.contains(Zfh.REQUEST_FREQ))
      zfh = Zfh.REQUEST_FREQ; 
    return zfh;
  }
  
  private static Zfh Zv(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 117)
      paramBitSet.set(51); 
    return zfh;
  }
  
  private static Zfh ZoA(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101)
      paramBitSet.set(40); 
    return zfh;
  }
  
  private static Zfh Zc(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 112)
      paramBitSet.set(120); 
    return zfh;
  }
  
  private static Zfh ZQ(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 97)
      paramBitSet.set(117); 
    return zfh;
  }
  
  private static Zfh Zob(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 97)
      paramBitSet.set(110); 
    return zfh;
  }
  
  private static Zfh ZoT(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 121 && paramEnumSet.contains(Zfh.ANY))
      zfh = Zfh.ANY; 
    return zfh;
  }
  
  private static Zfh ZY(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 116 && paramEnumSet.contains(Zfh.HOST_FREQ))
      zfh = Zfh.HOST_FREQ; 
    return zfh;
  }
  
  private static Zfh ZoP(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 97 && paramEnumSet.contains(Zfh.METADATA_HEADER))
      zfh = Zfh.METADATA_HEADER; 
    return zfh;
  }
  
  private static Zfh Zo7(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 112)
      paramBitSet.set(26); 
    return zfh;
  }
  
  private static Zfh Zt(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 110)
      paramBitSet.set(104); 
    return zfh;
  }
  
  private static Zfh ZT(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 100 && paramEnumSet.contains(Zfh.BOOL_AND))
      zfh = Zfh.BOOL_AND; 
    return zfh;
  }
  
  private static Zfh ZS(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt >= 48 && paramInt <= 57) {
      paramBitSet.set(56);
      paramBitSet.set(73);
      paramBitSet.set(32);
      paramBitSet.set(34);
      paramBitSet.set(8);
      if (paramEnumSet.contains(Zfh.NATURAL_NUMBER))
        zfh = Zfh.NATURAL_NUMBER; 
    } 
    return zfh;
  }
  
  private static Zfh Zr(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 117)
      paramBitSet.set(112); 
    return zfh;
  }
  
  private static Zfh Zk(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 105)
      paramBitSet.set(125); 
    return zfh;
  }
  
  private static Zfh ZoI(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101)
      paramBitSet.set(12); 
    return zfh;
  }
  
  private static Zfh ZoG(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt >= 48 && paramInt <= 57 && paramEnumSet.contains(Zfh.NATURAL_NUMBER))
      zfh = Zfh.NATURAL_NUMBER; 
    return zfh;
  }
  
  private static Zfh ZTu(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 114)
      paramBitSet.set(124); 
    return zfh;
  }
  
  private static Zfh ZoX(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 97)
      paramBitSet.set(54); 
    return zfh;
  }
  
  private static Zfh ZL(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101)
      paramBitSet.set(118); 
    return zfh;
  }
  
  private static Zfh ZV(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 114)
      paramBitSet.set(100); 
    return zfh;
  }
  
  private static Zfh Zoa(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101)
      paramBitSet.set(21); 
    return zfh;
  }
  
  private static Zfh ZU(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 97)
      paramBitSet.set(27); 
    return zfh;
  }
  
  private static Zfh Zom(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 111)
      paramBitSet.set(67); 
    return zfh;
  }
  
  private static Zfh Zo5(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 115)
      paramBitSet.set(66); 
    return zfh;
  }
  
  private static Zfh Zm(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 117)
      paramBitSet.set(61); 
    return zfh;
  }
  
  private static Zfh ZoK(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101)
      paramBitSet.set(75); 
    return zfh;
  }
  
  private static Zfh ZTZ(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 100)
      paramBitSet.set(29); 
    return zfh;
  }
  
  private static Zfh ZTj(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 111)
      paramBitSet.set(18); 
    return zfh;
  }
  
  private static Zfh ZoJ(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 110)
      paramBitSet.set(89); 
    return zfh;
  }
  
  private static Zfh Zox(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 104 && paramEnumSet.contains(Zfh.RUN_FOR_EACH_HEADER))
      zfh = Zfh.RUN_FOR_EACH_HEADER; 
    return zfh;
  }
  
  private static Zfh Zok(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 49)
      paramBitSet.set(109); 
    return zfh;
  }
  
  private static Zfh Zo4(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101 && paramEnumSet.contains(Zfh.DEFINE_HEADER))
      zfh = Zfh.DEFINE_HEADER; 
    return zfh;
  }
  
  private static Zfh ZoO(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101 && paramEnumSet.contains(Zfh.COOKIE))
      zfh = Zfh.COOKIE; 
    return zfh;
  }
  
  private static Zfh ZoL(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 114 && paramEnumSet.contains(Zfh.BOOL_OR))
      zfh = Zfh.BOOL_OR; 
    return zfh;
  }
  
  private static Zfh ZoB(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 97 && paramEnumSet.contains(Zfh.LANGUAGE_LEVEL_1))
      zfh = Zfh.LANGUAGE_LEVEL_1; 
    return zfh;
  }
  
  private static Zfh Zn(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 32)
      paramBitSet.set(127); 
    return zfh;
  }
  
  private static Zfh Zl(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 115)
      paramBitSet.set(64); 
    return zfh;
  }
  
  private static Zfh ZH(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 117)
      paramBitSet.set(103); 
    return zfh;
  }
  
  private static Zfh Zoy(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 100)
      paramBitSet.set(101); 
    return zfh;
  }
  
  private static Zfh Zoz(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 105)
      paramBitSet.set(119); 
    return zfh;
  }
  
  private static Zfh ZB(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 111)
      paramBitSet.set(13); 
    return zfh;
  }
  
  private static Zfh ZoW(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 97)
      paramBitSet.set(129); 
    return zfh;
  }
  
  private static Zfh Zx(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 105)
      paramBitSet.set(60); 
    return zfh;
  }
  
  private static Zfh ZTp(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 97)
      paramBitSet.set(50); 
    return zfh;
  }
  
  private static Zfh ZX(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 112)
      paramBitSet.set(36); 
    return zfh;
  }
  
  private static Zfh ZoZ(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 116)
      paramBitSet.set(6); 
    return zfh;
  }
  
  private static Zfh ZM(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 32)
      paramBitSet.set(102); 
    return zfh;
  }
  
  private static Zfh ZTc(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 110)
      paramBitSet.set(45); 
    return zfh;
  }
  
  private static Zfh ZD(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 111)
      paramBitSet.set(74); 
    return zfh;
  }
  
  private static Zfh Zw(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 121 && paramEnumSet.contains(Zfh.QUERY))
      zfh = Zfh.QUERY; 
    return zfh;
  }
  
  private static Zfh ZT4(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101 && paramEnumSet.contains(Zfh.LANGUAGE_HEADER))
      zfh = Zfh.LANGUAGE_HEADER; 
    return zfh;
  }
  
  private static Zfh ZoF(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 45)
      paramBitSet.set(49); 
    return zfh;
  }
  
  private static Zfh ZF(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 109)
      paramBitSet.set(35); 
    return zfh;
  }
  
  private static Zfh Zo0(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt >= 48 && paramInt <= 57) {
      paramBitSet.set(111);
      if (paramEnumSet.contains(Zfh.VARIABLE_NAME))
        zfh = Zfh.VARIABLE_NAME; 
    } else if ((paramInt >= 65 && paramInt <= 90) || paramInt == 95 || (paramInt >= 97 && paramInt <= 122)) {
      paramBitSet.set(111);
      if (paramEnumSet.contains(Zfh.VARIABLE_NAME))
        zfh = Zfh.VARIABLE_NAME; 
    } 
    return zfh;
  }
  
  private static Zfh Zos(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 110)
      paramBitSet.set(93); 
    return zfh;
  }
  
  private static Zfh ZTP(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 111)
      paramBitSet.set(2); 
    return zfh;
  }
  
  private static Zfh Zp(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 116)
      paramBitSet.set(115); 
    return zfh;
  }
  
  private static Zfh ZTf(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 105)
      paramBitSet.set(80); 
    return zfh;
  }
  
  private static Zfh Zy(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 101)
      paramBitSet.set(81); 
    return zfh;
  }
  
  private static Zfh Zod(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 103)
      paramBitSet.set(108); 
    return zfh;
  }
  
  private static Zfh ZoQ(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 115)
      paramBitSet.set(25); 
    return zfh;
  }
  
  private static Zfh Zo2(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 118)
      paramBitSet.set(59); 
    return zfh;
  }
  
  private static Zfh ZoH(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 116)
      paramBitSet.set(23); 
    return zfh;
  }
  
  private static Zfh ZA(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 116)
      paramBitSet.set(52); 
    return zfh;
  }
  
  private static Zfh ZoD(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 116 && paramEnumSet.contains(Zfh.BOOL_NOT))
      zfh = Zfh.BOOL_NOT; 
    return zfh;
  }
  
  private static Zfh Zow(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 115)
      paramBitSet.set(38); 
    return zfh;
  }
  
  private static Zfh ZO(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 32)
      paramBitSet.set(83); 
    return zfh;
  }
  
  private static Zfh Zoc(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 110)
      paramBitSet.set(47); 
    return zfh;
  }
  
  private static Zfh Zh(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 116)
      paramBitSet.set(92); 
    return zfh;
  }
  
  private static Zfh ZTn(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 102)
      paramBitSet.set(106); 
    return zfh;
  }
  
  private static Zfh Zg(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 115)
      paramBitSet.set(57); 
    return zfh;
  }
  
  private static Zfh Zol(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 110)
      paramBitSet.set(39); 
    return zfh;
  }
  
  private static void Zf() {
    Zfw[] arrayOfZfw = { 
        Zzb::Zoh, Zzb::Zf, Zzb::Zo9, Zzb::ZoN, Zzb::ZTs, Zzb::ZoS, Zzb::ZI, Zzb::Z_, Zzb::Zoj, Zzb::Zou, 
        Zzb::Zd, Zzb::ZE, Zzb::ZTq, Zzb::Zi, Zzb::ZN, Zzb::Zo_, Zzb::ZoE, Zzb::ZoC, Zzb::Zov, Zzb::Zq, 
        Zzb::Zo3, Zzb::Zo6, Zzb::ZP, Zzb::Zz, Zzb::Zoo, Zzb::Zoq, Zzb::Zon, Zzb::ZK, Zzb::Zoe, Zzb::Za, 
        Zzb::Zof, Zzb::ZZ, Zzb::Zoi, Zzb::ZTQ, Zzb::Zj, Zzb::Zop, Zzb::ZG, Zzb::ZoU, Zzb::Zs, Zzb::ZoM, 
        Zzb::ZoY, Zzb::ZR, Zzb::ZC, Zzb::Zor, Zzb::Zo, Zzb::Zog, Zzb::Zo1, Zzb::Zb, Zzb::ZoR, Zzb::ZW, 
        Zzb::Zot, Zzb::Zo8, Zzb::ZJ, Zzb::ZoV, Zzb::Ze, Zzb::ZT_, Zzb::ZT0, Zzb::Zu, Zzb::Zv, Zzb::ZoA, 
        Zzb::Zc, Zzb::ZQ, Zzb::Zob, Zzb::ZoT, Zzb::ZY, Zzb::ZoP, Zzb::Zo7, Zzb::Zt, Zzb::ZT, Zzb::ZS, 
        Zzb::Zr, Zzb::Zk, Zzb::ZoI, Zzb::ZoG, Zzb::ZTu, Zzb::ZoX, Zzb::ZL, Zzb::ZV, Zzb::Zoa, Zzb::ZU, 
        Zzb::Zom, Zzb::Zo5, Zzb::Zm, Zzb::ZoK, Zzb::ZTZ, Zzb::ZTj, Zzb::ZoJ, Zzb::Zox, Zzb::Zok, Zzb::Zo4, 
        Zzb::ZoO, Zzb::ZoL, Zzb::ZoB, Zzb::Zn, Zzb::Zl, Zzb::ZH, Zzb::Zoy, Zzb::Zoz, Zzb::ZB, Zzb::ZoW, 
        Zzb::Zx, Zzb::ZTp, Zzb::ZX, Zzb::ZoZ, Zzb::ZM, Zzb::ZTc, Zzb::ZD, Zzb::Zw, Zzb::ZT4, Zzb::ZoF, 
        Zzb::ZF, Zzb::Zo0, Zzb::Zos, Zzb::ZTP, Zzb::Zp, Zzb::ZTf, Zzb::Zy, Zzb::Zod, Zzb::ZoQ, Zzb::Zo2, 
        Zzb::ZoH, Zzb::ZA, Zzb::ZoD, Zzb::Zow, Zzb::ZO, Zzb::Zoc, Zzb::Zh, Zzb::ZTn, Zzb::Zg, Zzb::Zol };
    Zuk.ZC.put(Zzv.DEFAULT, arrayOfZfw);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zzb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */