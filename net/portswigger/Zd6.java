package net.portswigger;

import java.util.BitSet;
import java.util.EnumSet;

class Zd6 {
  private static Zkd ZR(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: aconst_null
    //   4: astore #4
    //   6: istore_3
    //   7: iload_0
    //   8: bipush #35
    //   10: if_icmpne -> 23
    //   13: aload_1
    //   14: bipush #49
    //   16: invokevirtual set : (I)V
    //   19: iload_3
    //   20: ifne -> 364
    //   23: iload_0
    //   24: bipush #48
    //   26: if_icmplt -> 76
    //   29: iload_0
    //   30: bipush #57
    //   32: if_icmpgt -> 76
    //   35: aload_1
    //   36: bipush #41
    //   38: invokevirtual set : (I)V
    //   41: aload_1
    //   42: bipush #64
    //   44: invokevirtual set : (I)V
    //   47: aload_1
    //   48: sipush #132
    //   51: invokevirtual set : (I)V
    //   54: aload_1
    //   55: bipush #84
    //   57: invokevirtual set : (I)V
    //   60: aload_1
    //   61: bipush #50
    //   63: invokevirtual set : (I)V
    //   66: aload_1
    //   67: bipush #15
    //   69: invokevirtual set : (I)V
    //   72: iload_3
    //   73: ifne -> 364
    //   76: iload_0
    //   77: bipush #97
    //   79: if_icmpne -> 98
    //   82: aload_1
    //   83: bipush #16
    //   85: invokevirtual set : (I)V
    //   88: aload_1
    //   89: bipush #76
    //   91: invokevirtual set : (I)V
    //   94: iload_3
    //   95: ifne -> 364
    //   98: iload_0
    //   99: bipush #99
    //   101: if_icmpne -> 120
    //   104: aload_1
    //   105: bipush #69
    //   107: invokevirtual set : (I)V
    //   110: aload_1
    //   111: bipush #85
    //   113: invokevirtual set : (I)V
    //   116: iload_3
    //   117: ifne -> 364
    //   120: iload_0
    //   121: bipush #100
    //   123: if_icmpne -> 142
    //   126: aload_1
    //   127: bipush #123
    //   129: invokevirtual set : (I)V
    //   132: aload_1
    //   133: bipush #56
    //   135: invokevirtual set : (I)V
    //   138: iload_3
    //   139: ifne -> 364
    //   142: iload_0
    //   143: bipush #101
    //   145: if_icmpne -> 164
    //   148: aload_1
    //   149: bipush #91
    //   151: invokevirtual set : (I)V
    //   154: aload_1
    //   155: bipush #38
    //   157: invokevirtual set : (I)V
    //   160: iload_3
    //   161: ifne -> 364
    //   164: iload_0
    //   165: bipush #102
    //   167: if_icmpne -> 181
    //   170: aload_1
    //   171: sipush #131
    //   174: invokevirtual set : (I)V
    //   177: iload_3
    //   178: ifne -> 364
    //   181: iload_0
    //   182: bipush #104
    //   184: if_icmpne -> 197
    //   187: aload_1
    //   188: bipush #111
    //   190: invokevirtual set : (I)V
    //   193: iload_3
    //   194: ifne -> 364
    //   197: iload_0
    //   198: bipush #105
    //   200: if_icmpne -> 231
    //   203: aload_1
    //   204: bipush #31
    //   206: invokevirtual set : (I)V
    //   209: aload_1
    //   210: bipush #40
    //   212: invokevirtual set : (I)V
    //   215: aload_1
    //   216: bipush #125
    //   218: invokevirtual set : (I)V
    //   221: aload_1
    //   222: bipush #81
    //   224: invokevirtual set : (I)V
    //   227: iload_3
    //   228: ifne -> 364
    //   231: iload_0
    //   232: bipush #108
    //   234: if_icmpne -> 247
    //   237: aload_1
    //   238: bipush #93
    //   240: invokevirtual set : (I)V
    //   243: iload_3
    //   244: ifne -> 364
    //   247: iload_0
    //   248: bipush #109
    //   250: if_icmpne -> 269
    //   253: aload_1
    //   254: bipush #101
    //   256: invokevirtual set : (I)V
    //   259: aload_1
    //   260: bipush #36
    //   262: invokevirtual set : (I)V
    //   265: iload_3
    //   266: ifne -> 364
    //   269: iload_0
    //   270: bipush #110
    //   272: if_icmpne -> 291
    //   275: aload_1
    //   276: bipush #26
    //   278: invokevirtual set : (I)V
    //   281: aload_1
    //   282: bipush #113
    //   284: invokevirtual set : (I)V
    //   287: iload_3
    //   288: ifne -> 364
    //   291: iload_0
    //   292: bipush #111
    //   294: if_icmpne -> 308
    //   297: aload_1
    //   298: sipush #128
    //   301: invokevirtual set : (I)V
    //   304: iload_3
    //   305: ifne -> 364
    //   308: iload_0
    //   309: bipush #114
    //   311: if_icmpne -> 330
    //   314: aload_1
    //   315: bipush #30
    //   317: invokevirtual set : (I)V
    //   320: aload_1
    //   321: bipush #119
    //   323: invokevirtual set : (I)V
    //   326: iload_3
    //   327: ifne -> 364
    //   330: iload_0
    //   331: bipush #115
    //   333: if_icmpne -> 346
    //   336: aload_1
    //   337: bipush #87
    //   339: invokevirtual set : (I)V
    //   342: iload_3
    //   343: ifne -> 364
    //   346: iload_0
    //   347: bipush #116
    //   349: if_icmpne -> 364
    //   352: aload_1
    //   353: bipush #80
    //   355: invokevirtual set : (I)V
    //   358: aload_1
    //   359: bipush #23
    //   361: invokevirtual set : (I)V
    //   364: iload_0
    //   365: bipush #65
    //   367: if_icmplt -> 376
    //   370: iload_0
    //   371: bipush #90
    //   373: if_icmple -> 394
    //   376: iload_0
    //   377: bipush #95
    //   379: if_icmpeq -> 394
    //   382: iload_0
    //   383: bipush #97
    //   385: if_icmplt -> 415
    //   388: iload_0
    //   389: bipush #122
    //   391: if_icmpgt -> 415
    //   394: aload_1
    //   395: bipush #42
    //   397: invokevirtual set : (I)V
    //   400: aload_2
    //   401: getstatic net/portswigger/Zkd.UNKNOWN_STRING : Lnet/portswigger/Zkd;
    //   404: invokevirtual contains : (Ljava/lang/Object;)Z
    //   407: ifeq -> 415
    //   410: getstatic net/portswigger/Zkd.UNKNOWN_STRING : Lnet/portswigger/Zkd;
    //   413: astore #4
    //   415: iload_0
    //   416: iflt -> 434
    //   419: aload_2
    //   420: getstatic net/portswigger/Zkd.UNKNOWN : Lnet/portswigger/Zkd;
    //   423: invokevirtual contains : (Ljava/lang/Object;)Z
    //   426: ifeq -> 434
    //   429: getstatic net/portswigger/Zkd.UNKNOWN : Lnet/portswigger/Zkd;
    //   432: astore #4
    //   434: iload_0
    //   435: bipush #46
    //   437: if_icmpne -> 459
    //   440: aload_2
    //   441: getstatic net/portswigger/Zkd.DOT : Lnet/portswigger/Zkd;
    //   444: invokevirtual contains : (Ljava/lang/Object;)Z
    //   447: ifeq -> 818
    //   450: getstatic net/portswigger/Zkd.DOT : Lnet/portswigger/Zkd;
    //   453: astore #4
    //   455: iload_3
    //   456: ifne -> 818
    //   459: iload_0
    //   460: bipush #58
    //   462: if_icmpne -> 484
    //   465: aload_2
    //   466: getstatic net/portswigger/Zkd.COLON : Lnet/portswigger/Zkd;
    //   469: invokevirtual contains : (Ljava/lang/Object;)Z
    //   472: ifeq -> 818
    //   475: getstatic net/portswigger/Zkd.COLON : Lnet/portswigger/Zkd;
    //   478: astore #4
    //   480: iload_3
    //   481: ifne -> 818
    //   484: iload_0
    //   485: bipush #123
    //   487: if_icmpne -> 509
    //   490: aload_2
    //   491: getstatic net/portswigger/Zkd.VARIABLE_START : Lnet/portswigger/Zkd;
    //   494: invokevirtual contains : (Ljava/lang/Object;)Z
    //   497: ifeq -> 818
    //   500: getstatic net/portswigger/Zkd.VARIABLE_START : Lnet/portswigger/Zkd;
    //   503: astore #4
    //   505: iload_3
    //   506: ifne -> 818
    //   509: iload_0
    //   510: bipush #44
    //   512: if_icmpne -> 534
    //   515: aload_2
    //   516: getstatic net/portswigger/Zkd.COMMA : Lnet/portswigger/Zkd;
    //   519: invokevirtual contains : (Ljava/lang/Object;)Z
    //   522: ifeq -> 818
    //   525: getstatic net/portswigger/Zkd.COMMA : Lnet/portswigger/Zkd;
    //   528: astore #4
    //   530: iload_3
    //   531: ifne -> 818
    //   534: iload_0
    //   535: bipush #48
    //   537: if_icmplt -> 565
    //   540: iload_0
    //   541: bipush #57
    //   543: if_icmpgt -> 565
    //   546: aload_2
    //   547: getstatic net/portswigger/Zkd.NATURAL_NUMBER : Lnet/portswigger/Zkd;
    //   550: invokevirtual contains : (Ljava/lang/Object;)Z
    //   553: ifeq -> 818
    //   556: getstatic net/portswigger/Zkd.NATURAL_NUMBER : Lnet/portswigger/Zkd;
    //   559: astore #4
    //   561: iload_3
    //   562: ifne -> 818
    //   565: iload_0
    //   566: bipush #41
    //   568: if_icmpne -> 590
    //   571: aload_2
    //   572: getstatic net/portswigger/Zkd.CLOSE_BRACKET : Lnet/portswigger/Zkd;
    //   575: invokevirtual contains : (Ljava/lang/Object;)Z
    //   578: ifeq -> 818
    //   581: getstatic net/portswigger/Zkd.CLOSE_BRACKET : Lnet/portswigger/Zkd;
    //   584: astore #4
    //   586: iload_3
    //   587: ifne -> 818
    //   590: iload_0
    //   591: bipush #40
    //   593: if_icmpne -> 615
    //   596: aload_2
    //   597: getstatic net/portswigger/Zkd.OPEN_BRACKET : Lnet/portswigger/Zkd;
    //   600: invokevirtual contains : (Ljava/lang/Object;)Z
    //   603: ifeq -> 818
    //   606: getstatic net/portswigger/Zkd.OPEN_BRACKET : Lnet/portswigger/Zkd;
    //   609: astore #4
    //   611: iload_3
    //   612: ifne -> 818
    //   615: iload_0
    //   616: bipush #34
    //   618: if_icmpne -> 640
    //   621: aload_2
    //   622: getstatic net/portswigger/Zkd.LITERAL_STRING_OPENING_QUOTE : Lnet/portswigger/Zkd;
    //   625: invokevirtual contains : (Ljava/lang/Object;)Z
    //   628: ifeq -> 818
    //   631: getstatic net/portswigger/Zkd.LITERAL_STRING_OPENING_QUOTE : Lnet/portswigger/Zkd;
    //   634: astore #4
    //   636: iload_3
    //   637: ifne -> 818
    //   640: iload_0
    //   641: bipush #96
    //   643: if_icmpne -> 665
    //   646: aload_2
    //   647: getstatic net/portswigger/Zkd.INTERPOLATABLE_STRING_OPENING_QUOTE : Lnet/portswigger/Zkd;
    //   650: invokevirtual contains : (Ljava/lang/Object;)Z
    //   653: ifeq -> 818
    //   656: getstatic net/portswigger/Zkd.INTERPOLATABLE_STRING_OPENING_QUOTE : Lnet/portswigger/Zkd;
    //   659: astore #4
    //   661: iload_3
    //   662: ifne -> 818
    //   665: iload_0
    //   666: bipush #10
    //   668: if_icmpne -> 690
    //   671: aload_2
    //   672: getstatic net/portswigger/Zkd.NEWLINE : Lnet/portswigger/Zkd;
    //   675: invokevirtual contains : (Ljava/lang/Object;)Z
    //   678: ifeq -> 818
    //   681: getstatic net/portswigger/Zkd.NEWLINE : Lnet/portswigger/Zkd;
    //   684: astore #4
    //   686: iload_3
    //   687: ifne -> 818
    //   690: iload_0
    //   691: bipush #35
    //   693: if_icmpne -> 722
    //   696: aload_1
    //   697: sipush #130
    //   700: invokevirtual set : (I)V
    //   703: aload_2
    //   704: getstatic net/portswigger/Zkd.COMMENT : Lnet/portswigger/Zkd;
    //   707: invokevirtual contains : (Ljava/lang/Object;)Z
    //   710: ifeq -> 818
    //   713: getstatic net/portswigger/Zkd.COMMENT : Lnet/portswigger/Zkd;
    //   716: astore #4
    //   718: iload_3
    //   719: ifne -> 818
    //   722: iload_0
    //   723: bipush #12
    //   725: if_icmpne -> 747
    //   728: aload_2
    //   729: getstatic net/portswigger/Zkd._TOKEN_4 : Lnet/portswigger/Zkd;
    //   732: invokevirtual contains : (Ljava/lang/Object;)Z
    //   735: ifeq -> 818
    //   738: getstatic net/portswigger/Zkd._TOKEN_4 : Lnet/portswigger/Zkd;
    //   741: astore #4
    //   743: iload_3
    //   744: ifne -> 818
    //   747: iload_0
    //   748: bipush #13
    //   750: if_icmpne -> 772
    //   753: aload_2
    //   754: getstatic net/portswigger/Zkd._TOKEN_3 : Lnet/portswigger/Zkd;
    //   757: invokevirtual contains : (Ljava/lang/Object;)Z
    //   760: ifeq -> 818
    //   763: getstatic net/portswigger/Zkd._TOKEN_3 : Lnet/portswigger/Zkd;
    //   766: astore #4
    //   768: iload_3
    //   769: ifne -> 818
    //   772: iload_0
    //   773: bipush #9
    //   775: if_icmpne -> 797
    //   778: aload_2
    //   779: getstatic net/portswigger/Zkd._TOKEN_2 : Lnet/portswigger/Zkd;
    //   782: invokevirtual contains : (Ljava/lang/Object;)Z
    //   785: ifeq -> 818
    //   788: getstatic net/portswigger/Zkd._TOKEN_2 : Lnet/portswigger/Zkd;
    //   791: astore #4
    //   793: iload_3
    //   794: ifne -> 818
    //   797: iload_0
    //   798: bipush #32
    //   800: if_icmpne -> 818
    //   803: aload_2
    //   804: getstatic net/portswigger/Zkd._TOKEN_1 : Lnet/portswigger/Zkd;
    //   807: invokevirtual contains : (Ljava/lang/Object;)Z
    //   810: ifeq -> 818
    //   813: getstatic net/portswigger/Zkd._TOKEN_1 : Lnet/portswigger/Zkd;
    //   816: astore #4
    //   818: aload #4
    //   820: areturn
  }
  
  private static Zkd Zpj(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 32)
      paramBitSet.set(122); 
    return zkd;
  }
  
  private static Zkd Zt(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 114)
      paramBitSet.set(95); 
    return zkd;
  }
  
  private static Zkd Zp0(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 109)
      paramBitSet.set(109); 
    return zkd;
  }
  
  private static Zkd ZJ(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 100)
      paramBitSet.set(43); 
    return zkd;
  }
  
  private static Zkd ZKY(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 105)
      paramBitSet.set(114); 
    return zkd;
  }
  
  private static Zkd Zpv(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 114)
      paramBitSet.set(72); 
    return zkd;
  }
  
  private static Zkd Zd(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 105)
      paramBitSet.set(21); 
    return zkd;
  }
  
  private static Zkd Zp_(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 101 && paramEnumSet.contains(Zkd.AND_CONTINUE))
      zkd = Zkd.AND_CONTINUE; 
    return zkd;
  }
  
  private static Zkd ZK4(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 101 && paramEnumSet.contains(Zkd.ISSUE_NAME_HEADER))
      zkd = Zkd.ISSUE_NAME_HEADER; 
    return zkd;
  }
  
  private static Zkd Zo(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 104)
      paramBitSet.set(60); 
    return zkd;
  }
  
  private static Zkd Zf(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 111)
      paramBitSet.set(94); 
    return zkd;
  }
  
  private static Zkd ZG(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 100)
      paramBitSet.set(44); 
    return zkd;
  }
  
  private static Zkd Zk(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 116)
      paramBitSet.set(121); 
    return zkd;
  }
  
  private static Zkd ZO(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 111 && paramEnumSet.contains(Zkd.INFO_SEVERITY))
      zkd = Zkd.INFO_SEVERITY; 
    return zkd;
  }
  
  private static Zkd ZS(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt >= 48 && paramInt <= 57) {
      paramBitSet.set(132);
      if (paramEnumSet.contains(Zkd.NATURAL_NUMBER))
        zkd = Zkd.NATURAL_NUMBER; 
    } 
    return zkd;
  }
  
  private static Zkd Zpf(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 110)
      paramBitSet.set(52); 
    return zkd;
  }
  
  private static Zkd Za(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 104 && paramEnumSet.contains(Zkd.HIGH_SEVERITY))
      zkd = Zkd.HIGH_SEVERITY; 
    return zkd;
  }
  
  private static Zkd ZKE(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 100)
      paramBitSet.set(74); 
    return zkd;
  }
  
  private static Zkd ZpU(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 97)
      paramBitSet.set(126); 
    return zkd;
  }
  
  private static Zkd Zp3(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 115 && paramEnumSet.contains(Zkd.MATCHES_KEY))
      zkd = Zkd.MATCHES_KEY; 
    return zkd;
  }
  
  private static Zkd Zg(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 117)
      paramBitSet.set(48); 
    return zkd;
  }
  
  private static Zkd ZpW(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 105)
      paramBitSet.set(110); 
    return zkd;
  }
  
  private static Zkd ZKs(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 101)
      paramBitSet.set(120); 
    return zkd;
  }
  
  private static Zkd ZpN(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 101)
      paramBitSet.set(2); 
    return zkd;
  }
  
  private static Zkd Zx(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 101 && paramEnumSet.contains(Zkd.TENTATIVE_CONFIDENCE))
      zkd = Zkd.TENTATIVE_CONFIDENCE; 
    return zkd;
  }
  
  private static Zkd ZpY(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 97)
      paramBitSet.set(92); 
    return zkd;
  }
  
  private static Zkd ZD(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 121 && paramEnumSet.contains(Zkd.SEVERITY_HEADER))
      zkd = Zkd.SEVERITY_HEADER; 
    return zkd;
  }
  
  private static Zkd ZQ(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 110)
      paramBitSet.set(54); 
    return zkd;
  }
  
  private static Zkd Zpk(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 105)
      paramBitSet.set(115); 
    return zkd;
  }
  
  private static Zkd ZY(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 101)
      paramBitSet.set(3); 
    return zkd;
  }
  
  private static Zkd ZpC(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 110 && paramEnumSet.contains(Zkd.IN_KEY))
      zkd = Zkd.IN_KEY; 
    return zkd;
  }
  
  private static Zkd ZKF(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 115)
      paramBitSet.set(57); 
    return zkd;
  }
  
  private static Zkd Zpg(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 101)
      paramBitSet.set(6); 
    return zkd;
  }
  
  private static Zkd ZpH(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 10 && paramEnumSet.contains(Zkd._TOKEN_5))
      zkd = Zkd._TOKEN_5; 
    return zkd;
  }
  
  private static Zkd ZT(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 116 && paramEnumSet.contains(Zkd.BOOL_NOT))
      zkd = Zkd.BOOL_NOT; 
    return zkd;
  }
  
  private static Zkd ZpD(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 97)
      paramBitSet.set(108); 
    return zkd;
  }
  
  private static Zkd ZpV(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 114)
      paramBitSet.set(73); 
    return zkd;
  }
  
  private static Zkd ZW(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 110)
      paramBitSet.set(4); 
    return zkd;
  }
  
  private static Zkd Zph(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 99)
      paramBitSet.set(10); 
    return zkd;
  }
  
  private static Zkd ZKt(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 115 && paramEnumSet.contains(Zkd.IS_KEY))
      zkd = Zkd.IS_KEY; 
    return zkd;
  }
  
  private static Zkd Zpr(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt >= 48 && paramInt <= 57) {
      paramBitSet.set(15);
      paramBitSet.set(132);
      paramBitSet.set(64);
      if (paramEnumSet.contains(Zkd.NATURAL_NUMBER))
        zkd = Zkd.NATURAL_NUMBER; 
    } 
    return zkd;
  }
  
  private static Zkd Zpt(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt >= 48 && paramInt <= 57) {
      paramBitSet.set(42);
      if (paramEnumSet.contains(Zkd.UNKNOWN_STRING))
        zkd = Zkd.UNKNOWN_STRING; 
    } else if ((paramInt >= 65 && paramInt <= 90) || paramInt == 95 || (paramInt >= 97 && paramInt <= 122)) {
      paramBitSet.set(42);
      if (paramEnumSet.contains(Zkd.UNKNOWN_STRING))
        zkd = Zkd.UNKNOWN_STRING; 
    } 
    return zkd;
  }
  
  private static Zkd Zp8(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 32)
      paramBitSet.set(29); 
    return zkd;
  }
  
  private static Zkd Zpp(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 101)
      paramBitSet.set(117); 
    return zkd;
  }
  
  private static Zkd ZpR(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 100)
      paramBitSet.set(7); 
    return zkd;
  }
  
  private static Zkd ZpQ(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 115)
      paramBitSet.set(32); 
    return zkd;
  }
  
  private static Zkd ZpK(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 102)
      paramBitSet.set(106); 
    return zkd;
  }
  
  private static Zkd Zp2(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 109 && paramEnumSet.contains(Zkd.MEDIUM_SEVERITY))
      zkd = Zkd.MEDIUM_SEVERITY; 
    return zkd;
  }
  
  private static Zkd ZK(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    // Byte code:
    //   0: invokestatic Zy : ()Z
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
    //   36: bipush #49
    //   38: invokevirtual set : (I)V
    //   41: iload_3
    //   42: ifeq -> 82
    //   45: iload_0
    //   46: bipush #13
    //   48: if_icmpne -> 61
    //   51: aload_1
    //   52: bipush #34
    //   54: invokevirtual set : (I)V
    //   57: iload_3
    //   58: ifeq -> 82
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
  
  private static Zkd ZpL(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt >= 48 && paramInt <= 57) {
      paramBitSet.set(15);
      paramBitSet.set(132);
      paramBitSet.set(84);
      paramBitSet.set(64);
      paramBitSet.set(41);
      if (paramEnumSet.contains(Zkd.NATURAL_NUMBER))
        zkd = Zkd.NATURAL_NUMBER; 
    } 
    return zkd;
  }
  
  private static Zkd Zb(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 102)
      paramBitSet.set(14); 
    return zkd;
  }
  
  private static Zkd Zc(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 100)
      paramBitSet.set(79); 
    return zkd;
  }
  
  private static Zkd Zp(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 119 && paramEnumSet.contains(Zkd.LOW_SEVERITY))
      zkd = Zkd.LOW_SEVERITY; 
    return zkd;
  }
  
  private static Zkd ZpT(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 117)
      paramBitSet.set(8); 
    return zkd;
  }
  
  private static Zkd Zpx(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 108 && paramEnumSet.contains(Zkd.DETAIL_HEADER))
      zkd = Zkd.DETAIL_HEADER; 
    return zkd;
  }
  
  private static Zkd ZN(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 101)
      paramBitSet.set(102); 
    return zkd;
  }
  
  private static Zkd Zpd(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 117)
      paramBitSet.set(75); 
    return zkd;
  }
  
  private static Zkd Z_(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 103)
      paramBitSet.set(17); 
    return zkd;
  }
  
  private static Zkd ZKi(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 100 && paramEnumSet.contains(Zkd.BOOL_AND))
      zkd = Zkd.BOOL_AND; 
    return zkd;
  }
  
  private static Zkd ZL(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 101)
      paramBitSet.set(20); 
    return zkd;
  }
  
  private static Zkd ZpJ(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 105)
      paramBitSet.set(55); 
    return zkd;
  }
  
  private static Zkd Zpw(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 111)
      paramBitSet.set(70); 
    return zkd;
  }
  
  private static Zkd Zp1(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 101 && paramEnumSet.contains(Zkd.ELSE_HEADER))
      zkd = Zkd.ELSE_HEADER; 
    return zkd;
  }
  
  private static Zkd ZX(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt >= 48 && paramInt <= 57) {
      paramBitSet.set(15);
      paramBitSet.set(132);
      if (paramEnumSet.contains(Zkd.NATURAL_NUMBER))
        zkd = Zkd.NATURAL_NUMBER; 
    } 
    return zkd;
  }
  
  private static Zkd ZpG(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 110)
      paramBitSet.set(103); 
    return zkd;
  }
  
  private static Zkd Zps(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 116)
      paramBitSet.set(1); 
    return zkd;
  }
  
  private static Zkd Zw(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 112)
      paramBitSet.set(107); 
    return zkd;
  }
  
  private static Zkd Zp7(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 110 && paramEnumSet.contains(Zkd.THEN))
      zkd = Zkd.THEN; 
    return zkd;
  }
  
  private static Zkd ZKe(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 111)
      paramBitSet.set(65); 
    return zkd;
  }
  
  private static Zkd ZKJ(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 110)
      paramBitSet.set(13); 
    return zkd;
  }
  
  private static Zkd Zn(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 99)
      paramBitSet.set(82); 
    return zkd;
  }
  
  private static Zkd ZKL(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 105)
      paramBitSet.set(77); 
    return zkd;
  }
  
  private static Zkd ZpS(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 116)
      paramBitSet.set(86); 
    return zkd;
  }
  
  private static Zkd ZpI(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 105)
      paramBitSet.set(118); 
    return zkd;
  }
  
  private static Zkd Zpn(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 101 && paramEnumSet.contains(Zkd.REPORT_ISSUE_HEADER))
      zkd = Zkd.REPORT_ISSUE_HEADER; 
    return zkd;
  }
  
  private static Zkd Zp4(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 110)
      paramBitSet.set(59); 
    return zkd;
  }
  
  private static Zkd ZM(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 116)
      paramBitSet.set(27); 
    return zkd;
  }
  
  private static Zkd Ze(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 115)
      paramBitSet.set(63); 
    return zkd;
  }
  
  private static Zkd Zp9(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 32)
      paramBitSet.set(99); 
    return zkd;
  }
  
  private static Zkd Zj(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 104)
      paramBitSet.set(96); 
    return zkd;
  }
  
  private static Zkd ZKr(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 110)
      paramBitSet.set(51); 
    return zkd;
  }
  
  private static Zkd ZpM(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 101 && paramEnumSet.contains(Zkd.CONFIDENCE_HEADER))
      zkd = Zkd.CONFIDENCE_HEADER; 
    return zkd;
  }
  
  private static Zkd Zm(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 97)
      paramBitSet.set(61); 
    return zkd;
  }
  
  private static Zkd ZpB(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt >= 48 && paramInt <= 57) {
      paramBitSet.set(15);
      paramBitSet.set(132);
      paramBitSet.set(64);
      paramBitSet.set(41);
      if (paramEnumSet.contains(Zkd.NATURAL_NUMBER))
        zkd = Zkd.NATURAL_NUMBER; 
    } 
    return zkd;
  }
  
  private static Zkd Zpm(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 101)
      paramBitSet.set(37); 
    return zkd;
  }
  
  private static Zkd Zy(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 97)
      paramBitSet.set(22); 
    return zkd;
  }
  
  private static Zkd Zp5(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 101)
      paramBitSet.set(124); 
    return zkd;
  }
  
  private static Zkd ZI(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 109 && paramEnumSet.contains(Zkd.FIRM_CONFIDENCE))
      zkd = Zkd.FIRM_CONFIDENCE; 
    return zkd;
  }
  
  private static Zkd ZpP(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 114)
      paramBitSet.set(66); 
    return zkd;
  }
  
  private static Zkd ZKP(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 32)
      paramBitSet.set(105); 
    return zkd;
  }
  
  private static Zkd Zi(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 108)
      paramBitSet.set(78); 
    return zkd;
  }
  
  private static Zkd Zpq(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 109)
      paramBitSet.set(9); 
    return zkd;
  }
  
  private static Zkd ZpO(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 111)
      paramBitSet.set(53); 
    return zkd;
  }
  
  private static Zkd Zz(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 109 && paramEnumSet.contains(Zkd.DIFFERS_FROM_KEY))
      zkd = Zkd.DIFFERS_FROM_KEY; 
    return zkd;
  }
  
  private static Zkd Zl(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 115)
      paramBitSet.set(90); 
    return zkd;
  }
  
  private static Zkd Zv(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 101)
      paramBitSet.set(68); 
    return zkd;
  }
  
  private static Zkd Zp6(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 116)
      paramBitSet.set(19); 
    return zkd;
  }
  
  private static Zkd Zpe(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 114)
      paramBitSet.set(88); 
    return zkd;
  }
  
  private static Zkd ZE(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 99)
      paramBitSet.set(62); 
    return zkd;
  }
  
  private static Zkd Zpl(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 114)
      paramBitSet.set(11); 
    return zkd;
  }
  
  private static Zkd ZP(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 101)
      paramBitSet.set(45); 
    return zkd;
  }
  
  private static Zkd ZF(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 116)
      paramBitSet.set(83); 
    return zkd;
  }
  
  private static Zkd ZC(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 102)
      paramBitSet.set(129); 
    return zkd;
  }
  
  private static Zkd ZpA(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 111)
      paramBitSet.set(127); 
    return zkd;
  }
  
  private static Zkd Zr(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 102)
      paramBitSet.set(100); 
    return zkd;
  }
  
  private static Zkd ZK_(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 102)
      paramBitSet.set(24); 
    return zkd;
  }
  
  private static Zkd ZH(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 111)
      paramBitSet.set(89); 
    return zkd;
  }
  
  private static Zkd ZKK(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 116)
      paramBitSet.set(39); 
    return zkd;
  }
  
  private static Zkd ZKp(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 101)
      paramBitSet.set(18); 
    return zkd;
  }
  
  private static Zkd ZB(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 110 && paramEnumSet.contains(Zkd.CERTAIN_CONFIDENCE))
      zkd = Zkd.CERTAIN_CONFIDENCE; 
    return zkd;
  }
  
  private static Zkd ZZ(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 105)
      paramBitSet.set(58); 
    return zkd;
  }
  
  private static Zkd ZpZ(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 116)
      paramBitSet.set(116); 
    return zkd;
  }
  
  private static Zkd ZpE(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 111)
      paramBitSet.set(35); 
    return zkd;
  }
  
  private static Zkd ZU(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 118)
      paramBitSet.set(25); 
    return zkd;
  }
  
  private static Zkd ZK9(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 102 && paramEnumSet.contains(Zkd.IF_FOOTER))
      zkd = Zkd.IF_FOOTER; 
    return zkd;
  }
  
  private static Zkd Zu(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 105)
      paramBitSet.set(104); 
    return zkd;
  }
  
  private static Zkd ZpF(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 110)
      paramBitSet.set(71); 
    return zkd;
  }
  
  private static Zkd Zpu(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 97)
      paramBitSet.set(112); 
    return zkd;
  }
  
  private static Zkd Zpa(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 101)
      paramBitSet.set(67); 
    return zkd;
  }
  
  private static Zkd Zpb(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 110)
      paramBitSet.set(97); 
    return zkd;
  }
  
  private static Zkd Zpz(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 105)
      paramBitSet.set(28); 
    return zkd;
  }
  
  private static Zkd ZKR(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 105)
      paramBitSet.set(46); 
    return zkd;
  }
  
  private static Zkd ZA(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 105)
      paramBitSet.set(47); 
    return zkd;
  }
  
  private static Zkd Zpo(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 118)
      paramBitSet.set(33); 
    return zkd;
  }
  
  private static Zkd Zpc(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 102 && paramEnumSet.contains(Zkd.IF_HEADER))
      zkd = Zkd.IF_HEADER; 
    return zkd;
  }
  
  private static Zkd Zh(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 116)
      paramBitSet.set(5); 
    return zkd;
  }
  
  private static Zkd Zs(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 110 && paramEnumSet.contains(Zkd.REMEDIATION_HEADER))
      zkd = Zkd.REMEDIATION_HEADER; 
    return zkd;
  }
  
  private static Zkd Zq(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 114 && paramEnumSet.contains(Zkd.BOOL_OR))
      zkd = Zkd.BOOL_OR; 
    return zkd;
  }
  
  private static Zkd ZV(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 105)
      paramBitSet.set(12); 
    return zkd;
  }
  
  private static Zkd ZpX(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if ((paramInt >= 0 && paramInt <= 9) || paramInt == 11 || paramInt == 12 || paramInt >= 14) {
      paramBitSet.set(130);
      if (paramEnumSet.contains(Zkd.COMMENT))
        zkd = Zkd.COMMENT; 
    } 
    return zkd;
  }
  
  private static Zkd Zpi(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 105)
      paramBitSet.set(98); 
    return zkd;
  }
  
  private static Zkd Zpy(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt >= 48 && paramInt <= 57 && paramEnumSet.contains(Zkd.NATURAL_NUMBER))
      zkd = Zkd.NATURAL_NUMBER; 
    return zkd;
  }
  
  private static void ZU() {
    Zch[] arrayOfZch = { 
        Zd6::ZR, Zd6::Zpj, Zd6::Zt, Zd6::Zp0, Zd6::ZJ, Zd6::ZKY, Zd6::Zpv, Zd6::Zd, Zd6::Zp_, Zd6::ZK4, 
        Zd6::Zo, Zd6::Zf, Zd6::ZG, Zd6::Zk, Zd6::ZO, Zd6::ZS, Zd6::Zpf, Zd6::Za, Zd6::ZKE, Zd6::ZpU, 
        Zd6::Zp3, Zd6::Zg, Zd6::ZpW, Zd6::ZKs, Zd6::ZpN, Zd6::Zx, Zd6::ZpY, Zd6::ZD, Zd6::ZQ, Zd6::Zpk, 
        Zd6::ZY, Zd6::ZpC, Zd6::ZKF, Zd6::Zpg, Zd6::ZpH, Zd6::ZT, Zd6::ZpD, Zd6::ZpV, Zd6::ZW, Zd6::Zph, 
        Zd6::ZKt, Zd6::Zpr, Zd6::Zpt, Zd6::Zp8, Zd6::Zpp, Zd6::ZpR, Zd6::ZpQ, Zd6::ZpK, Zd6::Zp2, Zd6::ZK, 
        Zd6::ZpL, Zd6::Zb, Zd6::Zc, Zd6::Zp, Zd6::ZpT, Zd6::Zpx, Zd6::ZN, Zd6::Zpd, Zd6::Z_, Zd6::ZKi, 
        Zd6::ZL, Zd6::ZpJ, Zd6::Zpw, Zd6::Zp1, Zd6::ZX, Zd6::ZpG, Zd6::Zps, Zd6::Zw, Zd6::Zp7, Zd6::ZKe, 
        Zd6::ZKJ, Zd6::Zn, Zd6::ZKL, Zd6::ZpS, Zd6::ZpI, Zd6::Zpn, Zd6::Zp4, Zd6::ZM, Zd6::Ze, Zd6::Zp9, 
        Zd6::Zj, Zd6::ZKr, Zd6::ZpM, Zd6::Zm, Zd6::ZpB, Zd6::Zpm, Zd6::Zy, Zd6::Zp5, Zd6::ZI, Zd6::ZpP, 
        Zd6::ZKP, Zd6::Zi, Zd6::Zpq, Zd6::ZpO, Zd6::Zz, Zd6::Zl, Zd6::Zv, Zd6::Zp6, Zd6::Zpe, Zd6::ZE, 
        Zd6::Zpl, Zd6::ZP, Zd6::ZF, Zd6::ZC, Zd6::ZpA, Zd6::Zr, Zd6::ZK_, Zd6::ZH, Zd6::ZKK, Zd6::ZKp, 
        Zd6::ZB, Zd6::ZZ, Zd6::ZpZ, Zd6::ZpE, Zd6::ZU, Zd6::ZK9, Zd6::Zu, Zd6::ZpF, Zd6::Zpu, Zd6::Zpa, 
        Zd6::Zpb, Zd6::Zpz, Zd6::ZKR, Zd6::ZA, Zd6::Zpo, Zd6::Zpc, Zd6::Zh, Zd6::Zs, Zd6::Zq, Zd6::ZV, 
        Zd6::ZpX, Zd6::Zpi, Zd6::Zpy };
    Zf0.Zo.put(Zrm4.PassiveCheck, arrayOfZch);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zd6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */