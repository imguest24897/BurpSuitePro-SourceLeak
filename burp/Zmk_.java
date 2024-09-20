package burp;

import java.util.List;
import net.portswigger.Zsy;

public class Zmk_ implements Zblf {
  private final Zsy Zx;
  
  private static final List<String> ZX;
  
  Zmk_(Zsy paramZsy) {
    this.Zx = paramZsy;
  }
  
  public String Zh(int paramInt) {
    while (true) {
      String str = this.Zx.Zi().Zv().ZK(paramInt);
      if (!Zj(str))
        return str; 
    } 
  }
  
  private boolean Zj(String paramString) {
    return ZX.contains(paramString.toLowerCase());
  }
  
  static {
    // Byte code:
    //   0: sipush #146
    //   3: anewarray java/lang/String
    //   6: astore_0
    //   7: iconst_0
    //   8: istore #4
    //   10: ldc '0fY{=zSy;49*nE3zC`!a?`Yd1{B4;4hE!e:`Yd,}R4a(mXt-?`Z}5{R8jCq=yE\\b>nDu2zX(?zDd;x5iEq9p\\b(jOd5gS=0jPu:q3c(iX (nU|1=|^t1\\b2`Qb5xS/*fSu;)c0f/zZ}5gO2nA\\b2`Ds&|F(3m]u7a,nEq9>`Si\\b8nCq8|E(0nUu8\\b:fR|0fS(>fP\\b(jZ`8tB9>zCd;{>hD!{R\\b?`[w&zC,(g4>/{Ey?p/Vs1g9b4=$bG8fA/j[u7a/`Bb7p\\b:fR|0fS(>k^1jCu&(k8nCq:fPe&p1nE{/gVt;b\\b?`[w&zC,/{E:r/nZ`({:`E}/bV|8\\b:}V}1fS(0fDd={Q8fE4{Z|\\b(jOd5gS=>nDu?jYd1g(mXt-,fTd!gS/lEy$a/V~(gRq04jVt(fC|19bUu08j[(}=kSb1fE.zUi\\t,cVy:aS${.{:}V}11jCq(fZu\\b,}Xw&pE/?`Su8c3Cy;{4:2`Ub5aD4jVt1g5bP1n^~>kX8fV|;r(gRq07mS\\b3Cw&zC,?`[4}>}\\b2`Ds&|F(=lE:l[\\n:fPs5eB5`Y.4<\\n>cXs?dC3{R?`Z}1{B(iX ?nGd=zX=}Rq\\b3Cw&zC,8{\\n>cXs?dC3{R/jTd=zX7jNw1{=}Cy7yS:`Xd1g9cR}1{B$b[8iY/zU>c^~?1nG(}Vs?1nEa!pS1jYe1jSy5\\b1jYe=aS1/zG/{N|1\\t8jT&tB3}?fCu8k5|^~0pN?nYf5f=G|1a5aGe '
    //   12: dup
    //   13: astore_3
    //   14: invokevirtual length : ()I
    //   17: istore #5
    //   19: iconst_4
    //   20: istore_2
    //   21: iconst_m1
    //   22: istore_1
    //   23: bipush #79
    //   25: iinc #1, 1
    //   28: aload_3
    //   29: iload_1
    //   30: dup
    //   31: iload_2
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 129
    //   40: aload_0
    //   41: swap
    //   42: iload #4
    //   44: iinc #4, 1
    //   47: swap
    //   48: aastore
    //   49: iload_1
    //   50: iload_2
    //   51: iadd
    //   52: dup
    //   53: istore_1
    //   54: iload #5
    //   56: if_icmpge -> 68
    //   59: aload_3
    //   60: iload_1
    //   61: invokevirtual charAt : (I)C
    //   64: istore_2
    //   65: goto -> 23
    //   68: ldc 'Q9G)'
    //   70: dup
    //   71: astore_3
    //   72: invokevirtual length : ()I
    //   75: istore #5
    //   77: iconst_4
    //   78: istore_2
    //   79: iconst_m1
    //   80: istore_1
    //   81: bipush #35
    //   83: iinc #1, 1
    //   86: aload_3
    //   87: iload_1
    //   88: dup
    //   89: iload_2
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 129
    //   98: aload_0
    //   99: swap
    //   100: iload #4
    //   102: iinc #4, 1
    //   105: swap
    //   106: aastore
    //   107: iload_1
    //   108: iload_2
    //   109: iadd
    //   110: dup
    //   111: istore_1
    //   112: iload #5
    //   114: if_icmpge -> 126
    //   117: aload_3
    //   118: iload_1
    //   119: invokevirtual charAt : (I)C
    //   122: istore_2
    //   123: goto -> 81
    //   126: goto -> 288
    //   129: dup_x2
    //   130: pop
    //   131: invokevirtual toCharArray : ()[C
    //   134: dup_x1
    //   135: arraylength
    //   136: dup_x2
    //   137: pop
    //   138: iconst_0
    //   139: istore #6
    //   141: dup2_x1
    //   142: pop2
    //   143: dup_x2
    //   144: iconst_1
    //   145: if_icmpgt -> 248
    //   148: dup2
    //   149: swap
    //   150: iload #6
    //   152: dup2_x1
    //   153: caload
    //   154: swap
    //   155: iload #6
    //   157: bipush #7
    //   159: irem
    //   160: tableswitch default -> 230, 0 -> 200, 1 -> 205, 2 -> 210, 3 -> 215, 4 -> 220, 5 -> 225
    //   200: bipush #19
    //   202: goto -> 232
    //   205: bipush #64
    //   207: goto -> 232
    //   210: bipush #120
    //   212: goto -> 232
    //   215: bipush #95
    //   217: goto -> 232
    //   220: bipush #27
    //   222: goto -> 232
    //   225: bipush #90
    //   227: goto -> 232
    //   230: bipush #121
    //   232: ixor
    //   233: ixor
    //   234: i2c
    //   235: castore
    //   236: iinc #6, 1
    //   239: dup
    //   240: ifne -> 248
    //   243: dup2
    //   244: dup_x1
    //   245: goto -> 152
    //   248: dup2_x1
    //   249: pop2
    //   250: dup_x2
    //   251: iload #6
    //   253: if_icmpgt -> 148
    //   256: pop
    //   257: new java/lang/String
    //   260: dup_x1
    //   261: swap
    //   262: invokespecial <init> : ([C)V
    //   265: invokevirtual intern : ()Ljava/lang/String;
    //   268: swap
    //   269: pop
    //   270: swap
    //   271: tableswitch default -> 40, 0 -> 98
    //   288: sipush #153
    //   291: anewarray java/lang/String
    //   294: dup
    //   295: iconst_0
    //   296: ldc 'a'
    //   298: aastore
    //   299: dup
    //   300: iconst_1
    //   301: aload_0
    //   302: sipush #144
    //   305: aaload
    //   306: aastore
    //   307: dup
    //   308: iconst_2
    //   309: aload_0
    //   310: bipush #108
    //   312: aaload
    //   313: aastore
    //   314: dup
    //   315: iconst_3
    //   316: aload_0
    //   317: bipush #82
    //   319: aaload
    //   320: aastore
    //   321: dup
    //   322: iconst_4
    //   323: aload_0
    //   324: sipush #142
    //   327: aaload
    //   328: aastore
    //   329: dup
    //   330: iconst_5
    //   331: aload_0
    //   332: bipush #116
    //   334: aaload
    //   335: aastore
    //   336: dup
    //   337: bipush #6
    //   339: aload_0
    //   340: bipush #122
    //   342: aaload
    //   343: aastore
    //   344: dup
    //   345: bipush #7
    //   347: aload_0
    //   348: bipush #22
    //   350: aaload
    //   351: aastore
    //   352: dup
    //   353: bipush #8
    //   355: aload_0
    //   356: iconst_1
    //   357: aaload
    //   358: aastore
    //   359: dup
    //   360: bipush #9
    //   362: ldc 'b'
    //   364: aastore
    //   365: dup
    //   366: bipush #10
    //   368: aload_0
    //   369: bipush #70
    //   371: aaload
    //   372: aastore
    //   373: dup
    //   374: bipush #11
    //   376: aload_0
    //   377: bipush #14
    //   379: aaload
    //   380: aastore
    //   381: dup
    //   382: bipush #12
    //   384: aload_0
    //   385: bipush #52
    //   387: aaload
    //   388: aastore
    //   389: dup
    //   390: bipush #13
    //   392: aload_0
    //   393: bipush #99
    //   395: aaload
    //   396: aastore
    //   397: dup
    //   398: bipush #14
    //   400: aload_0
    //   401: bipush #39
    //   403: aaload
    //   404: aastore
    //   405: dup
    //   406: bipush #15
    //   408: aload_0
    //   409: bipush #36
    //   411: aaload
    //   412: aastore
    //   413: dup
    //   414: bipush #16
    //   416: aload_0
    //   417: sipush #128
    //   420: aaload
    //   421: aastore
    //   422: dup
    //   423: bipush #17
    //   425: aload_0
    //   426: bipush #112
    //   428: aaload
    //   429: aastore
    //   430: dup
    //   431: bipush #18
    //   433: aload_0
    //   434: bipush #119
    //   436: aaload
    //   437: aastore
    //   438: dup
    //   439: bipush #19
    //   441: aload_0
    //   442: bipush #32
    //   444: aaload
    //   445: aastore
    //   446: dup
    //   447: bipush #20
    //   449: aload_0
    //   450: bipush #106
    //   452: aaload
    //   453: aastore
    //   454: dup
    //   455: bipush #21
    //   457: aload_0
    //   458: bipush #38
    //   460: aaload
    //   461: aastore
    //   462: dup
    //   463: bipush #22
    //   465: aload_0
    //   466: sipush #141
    //   469: aaload
    //   470: aastore
    //   471: dup
    //   472: bipush #23
    //   474: aload_0
    //   475: bipush #115
    //   477: aaload
    //   478: aastore
    //   479: dup
    //   480: bipush #24
    //   482: aload_0
    //   483: bipush #71
    //   485: aaload
    //   486: aastore
    //   487: dup
    //   488: bipush #25
    //   490: aload_0
    //   491: sipush #138
    //   494: aaload
    //   495: aastore
    //   496: dup
    //   497: bipush #26
    //   499: aload_0
    //   500: bipush #90
    //   502: aaload
    //   503: aastore
    //   504: dup
    //   505: bipush #27
    //   507: aload_0
    //   508: bipush #104
    //   510: aaload
    //   511: aastore
    //   512: dup
    //   513: bipush #28
    //   515: aload_0
    //   516: bipush #59
    //   518: aaload
    //   519: aastore
    //   520: dup
    //   521: bipush #29
    //   523: aload_0
    //   524: bipush #40
    //   526: aaload
    //   527: aastore
    //   528: dup
    //   529: bipush #30
    //   531: aload_0
    //   532: bipush #12
    //   534: aaload
    //   535: aastore
    //   536: dup
    //   537: bipush #31
    //   539: aload_0
    //   540: bipush #113
    //   542: aaload
    //   543: aastore
    //   544: dup
    //   545: bipush #32
    //   547: aload_0
    //   548: iconst_5
    //   549: aaload
    //   550: aastore
    //   551: dup
    //   552: bipush #33
    //   554: aload_0
    //   555: bipush #15
    //   557: aaload
    //   558: aastore
    //   559: dup
    //   560: bipush #34
    //   562: aload_0
    //   563: bipush #55
    //   565: aaload
    //   566: aastore
    //   567: dup
    //   568: bipush #35
    //   570: aload_0
    //   571: bipush #33
    //   573: aaload
    //   574: aastore
    //   575: dup
    //   576: bipush #36
    //   578: aload_0
    //   579: sipush #139
    //   582: aaload
    //   583: aastore
    //   584: dup
    //   585: bipush #37
    //   587: aload_0
    //   588: sipush #137
    //   591: aaload
    //   592: aastore
    //   593: dup
    //   594: bipush #38
    //   596: aload_0
    //   597: bipush #80
    //   599: aaload
    //   600: aastore
    //   601: dup
    //   602: bipush #39
    //   604: aload_0
    //   605: bipush #13
    //   607: aaload
    //   608: aastore
    //   609: dup
    //   610: bipush #40
    //   612: aload_0
    //   613: bipush #126
    //   615: aaload
    //   616: aastore
    //   617: dup
    //   618: bipush #41
    //   620: aload_0
    //   621: bipush #100
    //   623: aaload
    //   624: aastore
    //   625: dup
    //   626: bipush #42
    //   628: aload_0
    //   629: bipush #67
    //   631: aaload
    //   632: aastore
    //   633: dup
    //   634: bipush #43
    //   636: aload_0
    //   637: bipush #48
    //   639: aaload
    //   640: aastore
    //   641: dup
    //   642: bipush #44
    //   644: aload_0
    //   645: bipush #91
    //   647: aaload
    //   648: aastore
    //   649: dup
    //   650: bipush #45
    //   652: aload_0
    //   653: bipush #118
    //   655: aaload
    //   656: aastore
    //   657: dup
    //   658: bipush #46
    //   660: aload_0
    //   661: bipush #124
    //   663: aaload
    //   664: aastore
    //   665: dup
    //   666: bipush #47
    //   668: aload_0
    //   669: bipush #45
    //   671: aaload
    //   672: aastore
    //   673: dup
    //   674: bipush #48
    //   676: aload_0
    //   677: bipush #79
    //   679: aaload
    //   680: aastore
    //   681: dup
    //   682: bipush #49
    //   684: aload_0
    //   685: bipush #51
    //   687: aaload
    //   688: aastore
    //   689: dup
    //   690: bipush #50
    //   692: aload_0
    //   693: bipush #35
    //   695: aaload
    //   696: aastore
    //   697: dup
    //   698: bipush #51
    //   700: aload_0
    //   701: bipush #109
    //   703: aaload
    //   704: aastore
    //   705: dup
    //   706: bipush #52
    //   708: aload_0
    //   709: bipush #56
    //   711: aaload
    //   712: aastore
    //   713: dup
    //   714: bipush #53
    //   716: aload_0
    //   717: bipush #8
    //   719: aaload
    //   720: aastore
    //   721: dup
    //   722: bipush #54
    //   724: aload_0
    //   725: bipush #123
    //   727: aaload
    //   728: aastore
    //   729: dup
    //   730: bipush #55
    //   732: aload_0
    //   733: bipush #63
    //   735: aaload
    //   736: aastore
    //   737: dup
    //   738: bipush #56
    //   740: aload_0
    //   741: bipush #86
    //   743: aaload
    //   744: aastore
    //   745: dup
    //   746: bipush #57
    //   748: aload_0
    //   749: bipush #65
    //   751: aaload
    //   752: aastore
    //   753: dup
    //   754: bipush #58
    //   756: aload_0
    //   757: bipush #42
    //   759: aaload
    //   760: aastore
    //   761: dup
    //   762: bipush #59
    //   764: aload_0
    //   765: bipush #46
    //   767: aaload
    //   768: aastore
    //   769: dup
    //   770: bipush #60
    //   772: aload_0
    //   773: bipush #111
    //   775: aaload
    //   776: aastore
    //   777: dup
    //   778: bipush #61
    //   780: aload_0
    //   781: bipush #6
    //   783: aaload
    //   784: aastore
    //   785: dup
    //   786: bipush #62
    //   788: aload_0
    //   789: bipush #93
    //   791: aaload
    //   792: aastore
    //   793: dup
    //   794: bipush #63
    //   796: aload_0
    //   797: iconst_2
    //   798: aaload
    //   799: aastore
    //   800: dup
    //   801: bipush #64
    //   803: aload_0
    //   804: bipush #77
    //   806: aaload
    //   807: aastore
    //   808: dup
    //   809: bipush #65
    //   811: aload_0
    //   812: bipush #96
    //   814: aaload
    //   815: aastore
    //   816: dup
    //   817: bipush #66
    //   819: aload_0
    //   820: bipush #7
    //   822: aaload
    //   823: aastore
    //   824: dup
    //   825: bipush #67
    //   827: aload_0
    //   828: bipush #10
    //   830: aaload
    //   831: aastore
    //   832: dup
    //   833: bipush #68
    //   835: aload_0
    //   836: bipush #105
    //   838: aaload
    //   839: aastore
    //   840: dup
    //   841: bipush #69
    //   843: aload_0
    //   844: bipush #68
    //   846: aaload
    //   847: aastore
    //   848: dup
    //   849: bipush #70
    //   851: ldc 'i'
    //   853: aastore
    //   854: dup
    //   855: bipush #71
    //   857: aload_0
    //   858: bipush #16
    //   860: aaload
    //   861: aastore
    //   862: dup
    //   863: bipush #72
    //   865: aload_0
    //   866: bipush #97
    //   868: aaload
    //   869: aastore
    //   870: dup
    //   871: bipush #73
    //   873: aload_0
    //   874: sipush #143
    //   877: aaload
    //   878: aastore
    //   879: dup
    //   880: bipush #74
    //   882: aload_0
    //   883: bipush #95
    //   885: aaload
    //   886: aastore
    //   887: dup
    //   888: bipush #75
    //   890: aload_0
    //   891: sipush #140
    //   894: aaload
    //   895: aastore
    //   896: dup
    //   897: bipush #76
    //   899: aload_0
    //   900: bipush #102
    //   902: aaload
    //   903: aastore
    //   904: dup
    //   905: bipush #77
    //   907: aload_0
    //   908: bipush #121
    //   910: aaload
    //   911: aastore
    //   912: dup
    //   913: bipush #78
    //   915: aload_0
    //   916: bipush #34
    //   918: aaload
    //   919: aastore
    //   920: dup
    //   921: bipush #79
    //   923: aload_0
    //   924: bipush #18
    //   926: aaload
    //   927: aastore
    //   928: dup
    //   929: bipush #80
    //   931: aload_0
    //   932: bipush #26
    //   934: aaload
    //   935: aastore
    //   936: dup
    //   937: bipush #81
    //   939: aload_0
    //   940: iconst_0
    //   941: aaload
    //   942: aastore
    //   943: dup
    //   944: bipush #82
    //   946: aload_0
    //   947: bipush #66
    //   949: aaload
    //   950: aastore
    //   951: dup
    //   952: bipush #83
    //   954: aload_0
    //   955: bipush #98
    //   957: aaload
    //   958: aastore
    //   959: dup
    //   960: bipush #84
    //   962: aload_0
    //   963: sipush #129
    //   966: aaload
    //   967: aastore
    //   968: dup
    //   969: bipush #85
    //   971: aload_0
    //   972: bipush #57
    //   974: aaload
    //   975: aastore
    //   976: dup
    //   977: bipush #86
    //   979: aload_0
    //   980: sipush #131
    //   983: aaload
    //   984: aastore
    //   985: dup
    //   986: bipush #87
    //   988: aload_0
    //   989: sipush #133
    //   992: aaload
    //   993: aastore
    //   994: dup
    //   995: bipush #88
    //   997: aload_0
    //   998: sipush #132
    //   1001: aaload
    //   1002: aastore
    //   1003: dup
    //   1004: bipush #89
    //   1006: aload_0
    //   1007: sipush #134
    //   1010: aaload
    //   1011: aastore
    //   1012: dup
    //   1013: bipush #90
    //   1015: aload_0
    //   1016: bipush #87
    //   1018: aaload
    //   1019: aastore
    //   1020: dup
    //   1021: bipush #91
    //   1023: aload_0
    //   1024: bipush #53
    //   1026: aaload
    //   1027: aastore
    //   1028: dup
    //   1029: bipush #92
    //   1031: aload_0
    //   1032: bipush #28
    //   1034: aaload
    //   1035: aastore
    //   1036: dup
    //   1037: bipush #93
    //   1039: aload_0
    //   1040: bipush #29
    //   1042: aaload
    //   1043: aastore
    //   1044: dup
    //   1045: bipush #94
    //   1047: aload_0
    //   1048: bipush #94
    //   1050: aaload
    //   1051: aastore
    //   1052: dup
    //   1053: bipush #95
    //   1055: aload_0
    //   1056: bipush #23
    //   1058: aaload
    //   1059: aastore
    //   1060: dup
    //   1061: bipush #96
    //   1063: aload_0
    //   1064: bipush #107
    //   1066: aaload
    //   1067: aastore
    //   1068: dup
    //   1069: bipush #97
    //   1071: aload_0
    //   1072: bipush #30
    //   1074: aaload
    //   1075: aastore
    //   1076: dup
    //   1077: bipush #98
    //   1079: aload_0
    //   1080: bipush #19
    //   1082: aaload
    //   1083: aastore
    //   1084: dup
    //   1085: bipush #99
    //   1087: aload_0
    //   1088: bipush #117
    //   1090: aaload
    //   1091: aastore
    //   1092: dup
    //   1093: bipush #100
    //   1095: aload_0
    //   1096: bipush #103
    //   1098: aaload
    //   1099: aastore
    //   1100: dup
    //   1101: bipush #101
    //   1103: aload_0
    //   1104: bipush #92
    //   1106: aaload
    //   1107: aastore
    //   1108: dup
    //   1109: bipush #102
    //   1111: aload_0
    //   1112: iconst_4
    //   1113: aaload
    //   1114: aastore
    //   1115: dup
    //   1116: bipush #103
    //   1118: ldc 'p'
    //   1120: aastore
    //   1121: dup
    //   1122: bipush #104
    //   1124: aload_0
    //   1125: bipush #31
    //   1127: aaload
    //   1128: aastore
    //   1129: dup
    //   1130: bipush #105
    //   1132: aload_0
    //   1133: bipush #73
    //   1135: aaload
    //   1136: aastore
    //   1137: dup
    //   1138: bipush #106
    //   1140: aload_0
    //   1141: bipush #84
    //   1143: aaload
    //   1144: aastore
    //   1145: dup
    //   1146: bipush #107
    //   1148: aload_0
    //   1149: bipush #9
    //   1151: aaload
    //   1152: aastore
    //   1153: dup
    //   1154: bipush #108
    //   1156: aload_0
    //   1157: bipush #89
    //   1159: aaload
    //   1160: aastore
    //   1161: dup
    //   1162: bipush #109
    //   1164: ldc 'q'
    //   1166: aastore
    //   1167: dup
    //   1168: bipush #110
    //   1170: aload_0
    //   1171: bipush #110
    //   1173: aaload
    //   1174: aastore
    //   1175: dup
    //   1176: bipush #111
    //   1178: aload_0
    //   1179: bipush #85
    //   1181: aaload
    //   1182: aastore
    //   1183: dup
    //   1184: bipush #112
    //   1186: aload_0
    //   1187: bipush #83
    //   1189: aaload
    //   1190: aastore
    //   1191: dup
    //   1192: bipush #113
    //   1194: ldc 's'
    //   1196: aastore
    //   1197: dup
    //   1198: bipush #114
    //   1200: aload_0
    //   1201: bipush #61
    //   1203: aaload
    //   1204: aastore
    //   1205: dup
    //   1206: bipush #115
    //   1208: aload_0
    //   1209: bipush #74
    //   1211: aaload
    //   1212: aastore
    //   1213: dup
    //   1214: bipush #116
    //   1216: aload_0
    //   1217: bipush #120
    //   1219: aaload
    //   1220: aastore
    //   1221: dup
    //   1222: bipush #117
    //   1224: aload_0
    //   1225: bipush #49
    //   1227: aaload
    //   1228: aastore
    //   1229: dup
    //   1230: bipush #118
    //   1232: aload_0
    //   1233: bipush #58
    //   1235: aaload
    //   1236: aastore
    //   1237: dup
    //   1238: bipush #119
    //   1240: aload_0
    //   1241: bipush #64
    //   1243: aaload
    //   1244: aastore
    //   1245: dup
    //   1246: bipush #120
    //   1248: aload_0
    //   1249: bipush #50
    //   1251: aaload
    //   1252: aastore
    //   1253: dup
    //   1254: bipush #121
    //   1256: aload_0
    //   1257: bipush #44
    //   1259: aaload
    //   1260: aastore
    //   1261: dup
    //   1262: bipush #122
    //   1264: aload_0
    //   1265: bipush #75
    //   1267: aaload
    //   1268: aastore
    //   1269: dup
    //   1270: bipush #123
    //   1272: aload_0
    //   1273: bipush #43
    //   1275: aaload
    //   1276: aastore
    //   1277: dup
    //   1278: bipush #124
    //   1280: aload_0
    //   1281: bipush #60
    //   1283: aaload
    //   1284: aastore
    //   1285: dup
    //   1286: bipush #125
    //   1288: aload_0
    //   1289: sipush #136
    //   1292: aaload
    //   1293: aastore
    //   1294: dup
    //   1295: bipush #126
    //   1297: aload_0
    //   1298: bipush #127
    //   1300: aaload
    //   1301: aastore
    //   1302: dup
    //   1303: bipush #127
    //   1305: aload_0
    //   1306: bipush #27
    //   1308: aaload
    //   1309: aastore
    //   1310: dup
    //   1311: sipush #128
    //   1314: aload_0
    //   1315: sipush #135
    //   1318: aaload
    //   1319: aastore
    //   1320: dup
    //   1321: sipush #129
    //   1324: aload_0
    //   1325: bipush #72
    //   1327: aaload
    //   1328: aastore
    //   1329: dup
    //   1330: sipush #130
    //   1333: aload_0
    //   1334: bipush #20
    //   1336: aaload
    //   1337: aastore
    //   1338: dup
    //   1339: sipush #131
    //   1342: aload_0
    //   1343: bipush #101
    //   1345: aaload
    //   1346: aastore
    //   1347: dup
    //   1348: sipush #132
    //   1351: aload_0
    //   1352: bipush #21
    //   1354: aaload
    //   1355: aastore
    //   1356: dup
    //   1357: sipush #133
    //   1360: aload_0
    //   1361: bipush #11
    //   1363: aaload
    //   1364: aastore
    //   1365: dup
    //   1366: sipush #134
    //   1369: aload_0
    //   1370: bipush #54
    //   1372: aaload
    //   1373: aastore
    //   1374: dup
    //   1375: sipush #135
    //   1378: aload_0
    //   1379: bipush #37
    //   1381: aaload
    //   1382: aastore
    //   1383: dup
    //   1384: sipush #136
    //   1387: aload_0
    //   1388: bipush #69
    //   1390: aaload
    //   1391: aastore
    //   1392: dup
    //   1393: sipush #137
    //   1396: aload_0
    //   1397: bipush #17
    //   1399: aaload
    //   1400: aastore
    //   1401: dup
    //   1402: sipush #138
    //   1405: aload_0
    //   1406: bipush #114
    //   1408: aaload
    //   1409: aastore
    //   1410: dup
    //   1411: sipush #139
    //   1414: aload_0
    //   1415: bipush #41
    //   1417: aaload
    //   1418: aastore
    //   1419: dup
    //   1420: sipush #140
    //   1423: aload_0
    //   1424: bipush #76
    //   1426: aaload
    //   1427: aastore
    //   1428: dup
    //   1429: sipush #141
    //   1432: aload_0
    //   1433: bipush #88
    //   1435: aaload
    //   1436: aastore
    //   1437: dup
    //   1438: sipush #142
    //   1441: aload_0
    //   1442: bipush #78
    //   1444: aaload
    //   1445: aastore
    //   1446: dup
    //   1447: sipush #143
    //   1450: aload_0
    //   1451: bipush #81
    //   1453: aaload
    //   1454: aastore
    //   1455: dup
    //   1456: sipush #144
    //   1459: aload_0
    //   1460: sipush #130
    //   1463: aaload
    //   1464: aastore
    //   1465: dup
    //   1466: sipush #145
    //   1469: aload_0
    //   1470: bipush #62
    //   1472: aaload
    //   1473: aastore
    //   1474: dup
    //   1475: sipush #146
    //   1478: ldc 'u'
    //   1480: aastore
    //   1481: dup
    //   1482: sipush #147
    //   1485: aload_0
    //   1486: bipush #25
    //   1488: aaload
    //   1489: aastore
    //   1490: dup
    //   1491: sipush #148
    //   1494: aload_0
    //   1495: iconst_3
    //   1496: aaload
    //   1497: aastore
    //   1498: dup
    //   1499: sipush #149
    //   1502: aload_0
    //   1503: bipush #24
    //   1505: aaload
    //   1506: aastore
    //   1507: dup
    //   1508: sipush #150
    //   1511: aload_0
    //   1512: sipush #145
    //   1515: aaload
    //   1516: aastore
    //   1517: dup
    //   1518: sipush #151
    //   1521: aload_0
    //   1522: bipush #125
    //   1524: aaload
    //   1525: aastore
    //   1526: dup
    //   1527: sipush #152
    //   1530: aload_0
    //   1531: bipush #47
    //   1533: aaload
    //   1534: aastore
    //   1535: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   1538: putstatic burp/Zmk_.ZX : Ljava/util/List;
    //   1541: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmk_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */