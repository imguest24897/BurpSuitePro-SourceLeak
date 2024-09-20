package burp;

import java.math.BigInteger;

class Zzhu extends ClassLoader {
  static String ZT;
  
  static Object ZW;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZK(Object paramObject) {
    Zlhu.ZC = a(32525, 381);
    Zlhu.ZJ = new BigInteger(a(32523, 27143));
  }
  
  static boolean ZZ(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zlvx.ZM : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: invokevirtual toByteArray : ()[B
    //   13: astore_3
    //   14: bipush #32
    //   16: newarray int
    //   18: dup
    //   19: iconst_0
    //   20: ldc 876216579
    //   22: iastore
    //   23: dup
    //   24: iconst_1
    //   25: ldc 455999525
    //   27: iastore
    //   28: dup
    //   29: iconst_2
    //   30: ldc 1043334948
    //   32: iastore
    //   33: dup
    //   34: iconst_3
    //   35: ldc 439222784
    //   37: iastore
    //   38: dup
    //   39: iconst_4
    //   40: ldc 372376604
    //   42: iastore
    //   43: dup
    //   44: iconst_5
    //   45: ldc 707731490
    //   47: iastore
    //   48: dup
    //   49: bipush #6
    //   51: ldc 389426184
    //   53: iastore
    //   54: dup
    //   55: bipush #7
    //   57: ldc 973875457
    //   59: iastore
    //   60: dup
    //   61: bipush #8
    //   63: ldc 389160971
    //   65: iastore
    //   66: dup
    //   67: bipush #9
    //   69: ldc 907870729
    //   71: iastore
    //   72: dup
    //   73: bipush #10
    //   75: ldc 121057538
    //   77: iastore
    //   78: dup
    //   79: bipush #11
    //   81: ldc 840500228
    //   83: iastore
    //   84: dup
    //   85: bipush #12
    //   87: ldc 254150144
    //   89: iastore
    //   90: dup
    //   91: bipush #13
    //   93: ldc 924386310
    //   95: iastore
    //   96: dup
    //   97: bipush #14
    //   99: ldc 187632156
    //   101: iastore
    //   102: dup
    //   103: bipush #15
    //   105: ldc 874189824
    //   107: iastore
    //   108: dup
    //   109: bipush #16
    //   111: ldc 655302664
    //   113: iastore
    //   114: dup
    //   115: bipush #17
    //   117: ldc 890966315
    //   119: iastore
    //   120: dup
    //   121: bipush #18
    //   123: ldc 722417666
    //   125: iastore
    //   126: dup
    //   127: bipush #19
    //   129: ldc 1026621720
    //   131: iastore
    //   132: dup
    //   133: bipush #20
    //   135: ldc 957157408
    //   137: iastore
    //   138: dup
    //   139: bipush #21
    //   141: ldc 892536332
    //   143: iastore
    //   144: dup
    //   145: bipush #22
    //   147: ldc 689771012
    //   149: iastore
    //   150: dup
    //   151: bipush #23
    //   153: ldc 221709344
    //   155: iastore
    //   156: dup
    //   157: bipush #24
    //   159: ldc 940377620
    //   161: iastore
    //   162: dup
    //   163: bipush #25
    //   165: ldc 255209728
    //   167: iastore
    //   168: dup
    //   169: bipush #26
    //   171: ldc 1010368540
    //   173: iastore
    //   174: dup
    //   175: bipush #27
    //   177: ldc 220604441
    //   179: iastore
    //   180: dup
    //   181: bipush #28
    //   183: ldc 1008414755
    //   185: iastore
    //   186: dup
    //   187: bipush #29
    //   189: ldc 187049985
    //   191: iastore
    //   192: dup
    //   193: bipush #30
    //   195: ldc 943331329
    //   197: iastore
    //   198: dup
    //   199: bipush #31
    //   201: ldc 170788368
    //   203: iastore
    //   204: astore #5
    //   206: bipush #64
    //   208: newarray int
    //   210: dup
    //   211: iconst_0
    //   212: ldc 16843776
    //   214: iastore
    //   215: dup
    //   216: iconst_1
    //   217: iconst_0
    //   218: iastore
    //   219: dup
    //   220: iconst_2
    //   221: ldc 65536
    //   223: iastore
    //   224: dup
    //   225: iconst_3
    //   226: ldc 16843780
    //   228: iastore
    //   229: dup
    //   230: iconst_4
    //   231: ldc 16842756
    //   233: iastore
    //   234: dup
    //   235: iconst_5
    //   236: ldc 66564
    //   238: iastore
    //   239: dup
    //   240: bipush #6
    //   242: iconst_4
    //   243: iastore
    //   244: dup
    //   245: bipush #7
    //   247: ldc 65536
    //   249: iastore
    //   250: dup
    //   251: bipush #8
    //   253: sipush #1024
    //   256: iastore
    //   257: dup
    //   258: bipush #9
    //   260: ldc 16843776
    //   262: iastore
    //   263: dup
    //   264: bipush #10
    //   266: ldc 16843780
    //   268: iastore
    //   269: dup
    //   270: bipush #11
    //   272: sipush #1024
    //   275: iastore
    //   276: dup
    //   277: bipush #12
    //   279: ldc 16778244
    //   281: iastore
    //   282: dup
    //   283: bipush #13
    //   285: ldc 16842756
    //   287: iastore
    //   288: dup
    //   289: bipush #14
    //   291: ldc 16777216
    //   293: iastore
    //   294: dup
    //   295: bipush #15
    //   297: iconst_4
    //   298: iastore
    //   299: dup
    //   300: bipush #16
    //   302: sipush #1028
    //   305: iastore
    //   306: dup
    //   307: bipush #17
    //   309: ldc 16778240
    //   311: iastore
    //   312: dup
    //   313: bipush #18
    //   315: ldc 16778240
    //   317: iastore
    //   318: dup
    //   319: bipush #19
    //   321: ldc 66560
    //   323: iastore
    //   324: dup
    //   325: bipush #20
    //   327: ldc 66560
    //   329: iastore
    //   330: dup
    //   331: bipush #21
    //   333: ldc 16842752
    //   335: iastore
    //   336: dup
    //   337: bipush #22
    //   339: ldc 16842752
    //   341: iastore
    //   342: dup
    //   343: bipush #23
    //   345: ldc 16778244
    //   347: iastore
    //   348: dup
    //   349: bipush #24
    //   351: ldc 65540
    //   353: iastore
    //   354: dup
    //   355: bipush #25
    //   357: ldc 16777220
    //   359: iastore
    //   360: dup
    //   361: bipush #26
    //   363: ldc 16777220
    //   365: iastore
    //   366: dup
    //   367: bipush #27
    //   369: ldc 65540
    //   371: iastore
    //   372: dup
    //   373: bipush #28
    //   375: iconst_0
    //   376: iastore
    //   377: dup
    //   378: bipush #29
    //   380: sipush #1028
    //   383: iastore
    //   384: dup
    //   385: bipush #30
    //   387: ldc 66564
    //   389: iastore
    //   390: dup
    //   391: bipush #31
    //   393: ldc 16777216
    //   395: iastore
    //   396: dup
    //   397: bipush #32
    //   399: ldc 65536
    //   401: iastore
    //   402: dup
    //   403: bipush #33
    //   405: ldc 16843780
    //   407: iastore
    //   408: dup
    //   409: bipush #34
    //   411: iconst_4
    //   412: iastore
    //   413: dup
    //   414: bipush #35
    //   416: ldc 16842752
    //   418: iastore
    //   419: dup
    //   420: bipush #36
    //   422: ldc 16843776
    //   424: iastore
    //   425: dup
    //   426: bipush #37
    //   428: ldc 16777216
    //   430: iastore
    //   431: dup
    //   432: bipush #38
    //   434: ldc 16777216
    //   436: iastore
    //   437: dup
    //   438: bipush #39
    //   440: sipush #1024
    //   443: iastore
    //   444: dup
    //   445: bipush #40
    //   447: ldc 16842756
    //   449: iastore
    //   450: dup
    //   451: bipush #41
    //   453: ldc 65536
    //   455: iastore
    //   456: dup
    //   457: bipush #42
    //   459: ldc 66560
    //   461: iastore
    //   462: dup
    //   463: bipush #43
    //   465: ldc 16777220
    //   467: iastore
    //   468: dup
    //   469: bipush #44
    //   471: sipush #1024
    //   474: iastore
    //   475: dup
    //   476: bipush #45
    //   478: iconst_4
    //   479: iastore
    //   480: dup
    //   481: bipush #46
    //   483: ldc 16778244
    //   485: iastore
    //   486: dup
    //   487: bipush #47
    //   489: ldc 66564
    //   491: iastore
    //   492: dup
    //   493: bipush #48
    //   495: ldc 16843780
    //   497: iastore
    //   498: dup
    //   499: bipush #49
    //   501: ldc 65540
    //   503: iastore
    //   504: dup
    //   505: bipush #50
    //   507: ldc 16842752
    //   509: iastore
    //   510: dup
    //   511: bipush #51
    //   513: ldc 16778244
    //   515: iastore
    //   516: dup
    //   517: bipush #52
    //   519: ldc 16777220
    //   521: iastore
    //   522: dup
    //   523: bipush #53
    //   525: sipush #1028
    //   528: iastore
    //   529: dup
    //   530: bipush #54
    //   532: ldc 66564
    //   534: iastore
    //   535: dup
    //   536: bipush #55
    //   538: ldc 16843776
    //   540: iastore
    //   541: dup
    //   542: bipush #56
    //   544: sipush #1028
    //   547: iastore
    //   548: dup
    //   549: bipush #57
    //   551: ldc 16778240
    //   553: iastore
    //   554: dup
    //   555: bipush #58
    //   557: ldc 16778240
    //   559: iastore
    //   560: dup
    //   561: bipush #59
    //   563: iconst_0
    //   564: iastore
    //   565: dup
    //   566: bipush #60
    //   568: ldc 65540
    //   570: iastore
    //   571: dup
    //   572: bipush #61
    //   574: ldc 66560
    //   576: iastore
    //   577: dup
    //   578: bipush #62
    //   580: iconst_0
    //   581: iastore
    //   582: dup
    //   583: bipush #63
    //   585: ldc 16842756
    //   587: iastore
    //   588: astore #6
    //   590: bipush #64
    //   592: newarray int
    //   594: dup
    //   595: iconst_0
    //   596: ldc -2146402272
    //   598: iastore
    //   599: dup
    //   600: iconst_1
    //   601: ldc -2147450880
    //   603: iastore
    //   604: dup
    //   605: iconst_2
    //   606: ldc 32768
    //   608: iastore
    //   609: dup
    //   610: iconst_3
    //   611: ldc 1081376
    //   613: iastore
    //   614: dup
    //   615: iconst_4
    //   616: ldc 1048576
    //   618: iastore
    //   619: dup
    //   620: iconst_5
    //   621: bipush #32
    //   623: iastore
    //   624: dup
    //   625: bipush #6
    //   627: ldc -2146435040
    //   629: iastore
    //   630: dup
    //   631: bipush #7
    //   633: ldc -2147450848
    //   635: iastore
    //   636: dup
    //   637: bipush #8
    //   639: ldc -2147483616
    //   641: iastore
    //   642: dup
    //   643: bipush #9
    //   645: ldc -2146402272
    //   647: iastore
    //   648: dup
    //   649: bipush #10
    //   651: ldc -2146402304
    //   653: iastore
    //   654: dup
    //   655: bipush #11
    //   657: ldc -2147483648
    //   659: iastore
    //   660: dup
    //   661: bipush #12
    //   663: ldc -2147450880
    //   665: iastore
    //   666: dup
    //   667: bipush #13
    //   669: ldc 1048576
    //   671: iastore
    //   672: dup
    //   673: bipush #14
    //   675: bipush #32
    //   677: iastore
    //   678: dup
    //   679: bipush #15
    //   681: ldc -2146435040
    //   683: iastore
    //   684: dup
    //   685: bipush #16
    //   687: ldc 1081344
    //   689: iastore
    //   690: dup
    //   691: bipush #17
    //   693: ldc 1048608
    //   695: iastore
    //   696: dup
    //   697: bipush #18
    //   699: ldc -2147450848
    //   701: iastore
    //   702: dup
    //   703: bipush #19
    //   705: iconst_0
    //   706: iastore
    //   707: dup
    //   708: bipush #20
    //   710: ldc -2147483648
    //   712: iastore
    //   713: dup
    //   714: bipush #21
    //   716: ldc 32768
    //   718: iastore
    //   719: dup
    //   720: bipush #22
    //   722: ldc 1081376
    //   724: iastore
    //   725: dup
    //   726: bipush #23
    //   728: ldc -2146435072
    //   730: iastore
    //   731: dup
    //   732: bipush #24
    //   734: ldc 1048608
    //   736: iastore
    //   737: dup
    //   738: bipush #25
    //   740: ldc -2147483616
    //   742: iastore
    //   743: dup
    //   744: bipush #26
    //   746: iconst_0
    //   747: iastore
    //   748: dup
    //   749: bipush #27
    //   751: ldc 1081344
    //   753: iastore
    //   754: dup
    //   755: bipush #28
    //   757: ldc 32800
    //   759: iastore
    //   760: dup
    //   761: bipush #29
    //   763: ldc -2146402304
    //   765: iastore
    //   766: dup
    //   767: bipush #30
    //   769: ldc -2146435072
    //   771: iastore
    //   772: dup
    //   773: bipush #31
    //   775: ldc 32800
    //   777: iastore
    //   778: dup
    //   779: bipush #32
    //   781: iconst_0
    //   782: iastore
    //   783: dup
    //   784: bipush #33
    //   786: ldc 1081376
    //   788: iastore
    //   789: dup
    //   790: bipush #34
    //   792: ldc -2146435040
    //   794: iastore
    //   795: dup
    //   796: bipush #35
    //   798: ldc 1048576
    //   800: iastore
    //   801: dup
    //   802: bipush #36
    //   804: ldc -2147450848
    //   806: iastore
    //   807: dup
    //   808: bipush #37
    //   810: ldc -2146435072
    //   812: iastore
    //   813: dup
    //   814: bipush #38
    //   816: ldc -2146402304
    //   818: iastore
    //   819: dup
    //   820: bipush #39
    //   822: ldc 32768
    //   824: iastore
    //   825: dup
    //   826: bipush #40
    //   828: ldc -2146435072
    //   830: iastore
    //   831: dup
    //   832: bipush #41
    //   834: ldc -2147450880
    //   836: iastore
    //   837: dup
    //   838: bipush #42
    //   840: bipush #32
    //   842: iastore
    //   843: dup
    //   844: bipush #43
    //   846: ldc -2146402272
    //   848: iastore
    //   849: dup
    //   850: bipush #44
    //   852: ldc 1081376
    //   854: iastore
    //   855: dup
    //   856: bipush #45
    //   858: bipush #32
    //   860: iastore
    //   861: dup
    //   862: bipush #46
    //   864: ldc 32768
    //   866: iastore
    //   867: dup
    //   868: bipush #47
    //   870: ldc -2147483648
    //   872: iastore
    //   873: dup
    //   874: bipush #48
    //   876: ldc 32800
    //   878: iastore
    //   879: dup
    //   880: bipush #49
    //   882: ldc -2146402304
    //   884: iastore
    //   885: dup
    //   886: bipush #50
    //   888: ldc 1048576
    //   890: iastore
    //   891: dup
    //   892: bipush #51
    //   894: ldc -2147483616
    //   896: iastore
    //   897: dup
    //   898: bipush #52
    //   900: ldc 1048608
    //   902: iastore
    //   903: dup
    //   904: bipush #53
    //   906: ldc -2147450848
    //   908: iastore
    //   909: dup
    //   910: bipush #54
    //   912: ldc -2147483616
    //   914: iastore
    //   915: dup
    //   916: bipush #55
    //   918: ldc 1048608
    //   920: iastore
    //   921: dup
    //   922: bipush #56
    //   924: ldc 1081344
    //   926: iastore
    //   927: dup
    //   928: bipush #57
    //   930: iconst_0
    //   931: iastore
    //   932: dup
    //   933: bipush #58
    //   935: ldc -2147450880
    //   937: iastore
    //   938: dup
    //   939: bipush #59
    //   941: ldc 32800
    //   943: iastore
    //   944: dup
    //   945: bipush #60
    //   947: ldc -2147483648
    //   949: iastore
    //   950: dup
    //   951: bipush #61
    //   953: ldc -2146435040
    //   955: iastore
    //   956: dup
    //   957: bipush #62
    //   959: ldc -2146402272
    //   961: iastore
    //   962: dup
    //   963: bipush #63
    //   965: ldc 1081344
    //   967: iastore
    //   968: astore #7
    //   970: bipush #64
    //   972: newarray int
    //   974: dup
    //   975: iconst_0
    //   976: sipush #520
    //   979: iastore
    //   980: dup
    //   981: iconst_1
    //   982: ldc 134349312
    //   984: iastore
    //   985: dup
    //   986: iconst_2
    //   987: iconst_0
    //   988: iastore
    //   989: dup
    //   990: iconst_3
    //   991: ldc 134348808
    //   993: iastore
    //   994: dup
    //   995: iconst_4
    //   996: ldc 134218240
    //   998: iastore
    //   999: dup
    //   1000: iconst_5
    //   1001: iconst_0
    //   1002: iastore
    //   1003: dup
    //   1004: bipush #6
    //   1006: ldc 131592
    //   1008: iastore
    //   1009: dup
    //   1010: bipush #7
    //   1012: ldc 134218240
    //   1014: iastore
    //   1015: dup
    //   1016: bipush #8
    //   1018: ldc 131080
    //   1020: iastore
    //   1021: dup
    //   1022: bipush #9
    //   1024: ldc 134217736
    //   1026: iastore
    //   1027: dup
    //   1028: bipush #10
    //   1030: ldc 134217736
    //   1032: iastore
    //   1033: dup
    //   1034: bipush #11
    //   1036: ldc 131072
    //   1038: iastore
    //   1039: dup
    //   1040: bipush #12
    //   1042: ldc 134349320
    //   1044: iastore
    //   1045: dup
    //   1046: bipush #13
    //   1048: ldc 131080
    //   1050: iastore
    //   1051: dup
    //   1052: bipush #14
    //   1054: ldc 134348800
    //   1056: iastore
    //   1057: dup
    //   1058: bipush #15
    //   1060: sipush #520
    //   1063: iastore
    //   1064: dup
    //   1065: bipush #16
    //   1067: ldc 134217728
    //   1069: iastore
    //   1070: dup
    //   1071: bipush #17
    //   1073: bipush #8
    //   1075: iastore
    //   1076: dup
    //   1077: bipush #18
    //   1079: ldc 134349312
    //   1081: iastore
    //   1082: dup
    //   1083: bipush #19
    //   1085: sipush #512
    //   1088: iastore
    //   1089: dup
    //   1090: bipush #20
    //   1092: ldc 131584
    //   1094: iastore
    //   1095: dup
    //   1096: bipush #21
    //   1098: ldc 134348800
    //   1100: iastore
    //   1101: dup
    //   1102: bipush #22
    //   1104: ldc 134348808
    //   1106: iastore
    //   1107: dup
    //   1108: bipush #23
    //   1110: ldc 131592
    //   1112: iastore
    //   1113: dup
    //   1114: bipush #24
    //   1116: ldc 134218248
    //   1118: iastore
    //   1119: dup
    //   1120: bipush #25
    //   1122: ldc 131584
    //   1124: iastore
    //   1125: dup
    //   1126: bipush #26
    //   1128: ldc 131072
    //   1130: iastore
    //   1131: dup
    //   1132: bipush #27
    //   1134: ldc 134218248
    //   1136: iastore
    //   1137: dup
    //   1138: bipush #28
    //   1140: bipush #8
    //   1142: iastore
    //   1143: dup
    //   1144: bipush #29
    //   1146: ldc 134349320
    //   1148: iastore
    //   1149: dup
    //   1150: bipush #30
    //   1152: sipush #512
    //   1155: iastore
    //   1156: dup
    //   1157: bipush #31
    //   1159: ldc 134217728
    //   1161: iastore
    //   1162: dup
    //   1163: bipush #32
    //   1165: ldc 134349312
    //   1167: iastore
    //   1168: dup
    //   1169: bipush #33
    //   1171: ldc 134217728
    //   1173: iastore
    //   1174: dup
    //   1175: bipush #34
    //   1177: ldc 131080
    //   1179: iastore
    //   1180: dup
    //   1181: bipush #35
    //   1183: sipush #520
    //   1186: iastore
    //   1187: dup
    //   1188: bipush #36
    //   1190: ldc 131072
    //   1192: iastore
    //   1193: dup
    //   1194: bipush #37
    //   1196: ldc 134349312
    //   1198: iastore
    //   1199: dup
    //   1200: bipush #38
    //   1202: ldc 134218240
    //   1204: iastore
    //   1205: dup
    //   1206: bipush #39
    //   1208: iconst_0
    //   1209: iastore
    //   1210: dup
    //   1211: bipush #40
    //   1213: sipush #512
    //   1216: iastore
    //   1217: dup
    //   1218: bipush #41
    //   1220: ldc 131080
    //   1222: iastore
    //   1223: dup
    //   1224: bipush #42
    //   1226: ldc 134349320
    //   1228: iastore
    //   1229: dup
    //   1230: bipush #43
    //   1232: ldc 134218240
    //   1234: iastore
    //   1235: dup
    //   1236: bipush #44
    //   1238: ldc 134217736
    //   1240: iastore
    //   1241: dup
    //   1242: bipush #45
    //   1244: sipush #512
    //   1247: iastore
    //   1248: dup
    //   1249: bipush #46
    //   1251: iconst_0
    //   1252: iastore
    //   1253: dup
    //   1254: bipush #47
    //   1256: ldc 134348808
    //   1258: iastore
    //   1259: dup
    //   1260: bipush #48
    //   1262: ldc 134218248
    //   1264: iastore
    //   1265: dup
    //   1266: bipush #49
    //   1268: ldc 131072
    //   1270: iastore
    //   1271: dup
    //   1272: bipush #50
    //   1274: ldc 134217728
    //   1276: iastore
    //   1277: dup
    //   1278: bipush #51
    //   1280: ldc 134349320
    //   1282: iastore
    //   1283: dup
    //   1284: bipush #52
    //   1286: bipush #8
    //   1288: iastore
    //   1289: dup
    //   1290: bipush #53
    //   1292: ldc 131592
    //   1294: iastore
    //   1295: dup
    //   1296: bipush #54
    //   1298: ldc 131584
    //   1300: iastore
    //   1301: dup
    //   1302: bipush #55
    //   1304: ldc 134217736
    //   1306: iastore
    //   1307: dup
    //   1308: bipush #56
    //   1310: ldc 134348800
    //   1312: iastore
    //   1313: dup
    //   1314: bipush #57
    //   1316: ldc 134218248
    //   1318: iastore
    //   1319: dup
    //   1320: bipush #58
    //   1322: sipush #520
    //   1325: iastore
    //   1326: dup
    //   1327: bipush #59
    //   1329: ldc 134348800
    //   1331: iastore
    //   1332: dup
    //   1333: bipush #60
    //   1335: ldc 131592
    //   1337: iastore
    //   1338: dup
    //   1339: bipush #61
    //   1341: bipush #8
    //   1343: iastore
    //   1344: dup
    //   1345: bipush #62
    //   1347: ldc 134348808
    //   1349: iastore
    //   1350: dup
    //   1351: bipush #63
    //   1353: ldc 131584
    //   1355: iastore
    //   1356: astore #8
    //   1358: bipush #64
    //   1360: newarray int
    //   1362: dup
    //   1363: iconst_0
    //   1364: ldc 8396801
    //   1366: iastore
    //   1367: dup
    //   1368: iconst_1
    //   1369: sipush #8321
    //   1372: iastore
    //   1373: dup
    //   1374: iconst_2
    //   1375: sipush #8321
    //   1378: iastore
    //   1379: dup
    //   1380: iconst_3
    //   1381: sipush #128
    //   1384: iastore
    //   1385: dup
    //   1386: iconst_4
    //   1387: ldc 8396928
    //   1389: iastore
    //   1390: dup
    //   1391: iconst_5
    //   1392: ldc 8388737
    //   1394: iastore
    //   1395: dup
    //   1396: bipush #6
    //   1398: ldc 8388609
    //   1400: iastore
    //   1401: dup
    //   1402: bipush #7
    //   1404: sipush #8193
    //   1407: iastore
    //   1408: dup
    //   1409: bipush #8
    //   1411: iconst_0
    //   1412: iastore
    //   1413: dup
    //   1414: bipush #9
    //   1416: ldc 8396800
    //   1418: iastore
    //   1419: dup
    //   1420: bipush #10
    //   1422: ldc 8396800
    //   1424: iastore
    //   1425: dup
    //   1426: bipush #11
    //   1428: ldc 8396929
    //   1430: iastore
    //   1431: dup
    //   1432: bipush #12
    //   1434: sipush #129
    //   1437: iastore
    //   1438: dup
    //   1439: bipush #13
    //   1441: iconst_0
    //   1442: iastore
    //   1443: dup
    //   1444: bipush #14
    //   1446: ldc 8388736
    //   1448: iastore
    //   1449: dup
    //   1450: bipush #15
    //   1452: ldc 8388609
    //   1454: iastore
    //   1455: dup
    //   1456: bipush #16
    //   1458: iconst_1
    //   1459: iastore
    //   1460: dup
    //   1461: bipush #17
    //   1463: sipush #8192
    //   1466: iastore
    //   1467: dup
    //   1468: bipush #18
    //   1470: ldc 8388608
    //   1472: iastore
    //   1473: dup
    //   1474: bipush #19
    //   1476: ldc 8396801
    //   1478: iastore
    //   1479: dup
    //   1480: bipush #20
    //   1482: sipush #128
    //   1485: iastore
    //   1486: dup
    //   1487: bipush #21
    //   1489: ldc 8388608
    //   1491: iastore
    //   1492: dup
    //   1493: bipush #22
    //   1495: sipush #8193
    //   1498: iastore
    //   1499: dup
    //   1500: bipush #23
    //   1502: sipush #8320
    //   1505: iastore
    //   1506: dup
    //   1507: bipush #24
    //   1509: ldc 8388737
    //   1511: iastore
    //   1512: dup
    //   1513: bipush #25
    //   1515: iconst_1
    //   1516: iastore
    //   1517: dup
    //   1518: bipush #26
    //   1520: sipush #8320
    //   1523: iastore
    //   1524: dup
    //   1525: bipush #27
    //   1527: ldc 8388736
    //   1529: iastore
    //   1530: dup
    //   1531: bipush #28
    //   1533: sipush #8192
    //   1536: iastore
    //   1537: dup
    //   1538: bipush #29
    //   1540: ldc 8396928
    //   1542: iastore
    //   1543: dup
    //   1544: bipush #30
    //   1546: ldc 8396929
    //   1548: iastore
    //   1549: dup
    //   1550: bipush #31
    //   1552: sipush #129
    //   1555: iastore
    //   1556: dup
    //   1557: bipush #32
    //   1559: ldc 8388736
    //   1561: iastore
    //   1562: dup
    //   1563: bipush #33
    //   1565: ldc 8388609
    //   1567: iastore
    //   1568: dup
    //   1569: bipush #34
    //   1571: ldc 8396800
    //   1573: iastore
    //   1574: dup
    //   1575: bipush #35
    //   1577: ldc 8396929
    //   1579: iastore
    //   1580: dup
    //   1581: bipush #36
    //   1583: sipush #129
    //   1586: iastore
    //   1587: dup
    //   1588: bipush #37
    //   1590: iconst_0
    //   1591: iastore
    //   1592: dup
    //   1593: bipush #38
    //   1595: iconst_0
    //   1596: iastore
    //   1597: dup
    //   1598: bipush #39
    //   1600: ldc 8396800
    //   1602: iastore
    //   1603: dup
    //   1604: bipush #40
    //   1606: sipush #8320
    //   1609: iastore
    //   1610: dup
    //   1611: bipush #41
    //   1613: ldc 8388736
    //   1615: iastore
    //   1616: dup
    //   1617: bipush #42
    //   1619: ldc 8388737
    //   1621: iastore
    //   1622: dup
    //   1623: bipush #43
    //   1625: iconst_1
    //   1626: iastore
    //   1627: dup
    //   1628: bipush #44
    //   1630: ldc 8396801
    //   1632: iastore
    //   1633: dup
    //   1634: bipush #45
    //   1636: sipush #8321
    //   1639: iastore
    //   1640: dup
    //   1641: bipush #46
    //   1643: sipush #8321
    //   1646: iastore
    //   1647: dup
    //   1648: bipush #47
    //   1650: sipush #128
    //   1653: iastore
    //   1654: dup
    //   1655: bipush #48
    //   1657: ldc 8396929
    //   1659: iastore
    //   1660: dup
    //   1661: bipush #49
    //   1663: sipush #129
    //   1666: iastore
    //   1667: dup
    //   1668: bipush #50
    //   1670: iconst_1
    //   1671: iastore
    //   1672: dup
    //   1673: bipush #51
    //   1675: sipush #8192
    //   1678: iastore
    //   1679: dup
    //   1680: bipush #52
    //   1682: ldc 8388609
    //   1684: iastore
    //   1685: dup
    //   1686: bipush #53
    //   1688: sipush #8193
    //   1691: iastore
    //   1692: dup
    //   1693: bipush #54
    //   1695: ldc 8396928
    //   1697: iastore
    //   1698: dup
    //   1699: bipush #55
    //   1701: ldc 8388737
    //   1703: iastore
    //   1704: dup
    //   1705: bipush #56
    //   1707: sipush #8193
    //   1710: iastore
    //   1711: dup
    //   1712: bipush #57
    //   1714: sipush #8320
    //   1717: iastore
    //   1718: dup
    //   1719: bipush #58
    //   1721: ldc 8388608
    //   1723: iastore
    //   1724: dup
    //   1725: bipush #59
    //   1727: ldc 8396801
    //   1729: iastore
    //   1730: dup
    //   1731: bipush #60
    //   1733: sipush #128
    //   1736: iastore
    //   1737: dup
    //   1738: bipush #61
    //   1740: ldc 8388608
    //   1742: iastore
    //   1743: dup
    //   1744: bipush #62
    //   1746: sipush #8192
    //   1749: iastore
    //   1750: dup
    //   1751: bipush #63
    //   1753: ldc 8396928
    //   1755: iastore
    //   1756: astore #9
    //   1758: bipush #64
    //   1760: newarray int
    //   1762: dup
    //   1763: iconst_0
    //   1764: sipush #256
    //   1767: iastore
    //   1768: dup
    //   1769: iconst_1
    //   1770: ldc 34078976
    //   1772: iastore
    //   1773: dup
    //   1774: iconst_2
    //   1775: ldc 34078720
    //   1777: iastore
    //   1778: dup
    //   1779: iconst_3
    //   1780: ldc 1107296512
    //   1782: iastore
    //   1783: dup
    //   1784: iconst_4
    //   1785: ldc 524288
    //   1787: iastore
    //   1788: dup
    //   1789: iconst_5
    //   1790: sipush #256
    //   1793: iastore
    //   1794: dup
    //   1795: bipush #6
    //   1797: ldc 1073741824
    //   1799: iastore
    //   1800: dup
    //   1801: bipush #7
    //   1803: ldc 34078720
    //   1805: iastore
    //   1806: dup
    //   1807: bipush #8
    //   1809: ldc 1074266368
    //   1811: iastore
    //   1812: dup
    //   1813: bipush #9
    //   1815: ldc 524288
    //   1817: iastore
    //   1818: dup
    //   1819: bipush #10
    //   1821: ldc 33554688
    //   1823: iastore
    //   1824: dup
    //   1825: bipush #11
    //   1827: ldc 1074266368
    //   1829: iastore
    //   1830: dup
    //   1831: bipush #12
    //   1833: ldc 1107296512
    //   1835: iastore
    //   1836: dup
    //   1837: bipush #13
    //   1839: ldc 1107820544
    //   1841: iastore
    //   1842: dup
    //   1843: bipush #14
    //   1845: ldc 524544
    //   1847: iastore
    //   1848: dup
    //   1849: bipush #15
    //   1851: ldc 1073741824
    //   1853: iastore
    //   1854: dup
    //   1855: bipush #16
    //   1857: ldc 33554432
    //   1859: iastore
    //   1860: dup
    //   1861: bipush #17
    //   1863: ldc 1074266112
    //   1865: iastore
    //   1866: dup
    //   1867: bipush #18
    //   1869: ldc 1074266112
    //   1871: iastore
    //   1872: dup
    //   1873: bipush #19
    //   1875: iconst_0
    //   1876: iastore
    //   1877: dup
    //   1878: bipush #20
    //   1880: ldc 1073742080
    //   1882: iastore
    //   1883: dup
    //   1884: bipush #21
    //   1886: ldc 1107820800
    //   1888: iastore
    //   1889: dup
    //   1890: bipush #22
    //   1892: ldc 1107820800
    //   1894: iastore
    //   1895: dup
    //   1896: bipush #23
    //   1898: ldc 33554688
    //   1900: iastore
    //   1901: dup
    //   1902: bipush #24
    //   1904: ldc 1107820544
    //   1906: iastore
    //   1907: dup
    //   1908: bipush #25
    //   1910: ldc 1073742080
    //   1912: iastore
    //   1913: dup
    //   1914: bipush #26
    //   1916: iconst_0
    //   1917: iastore
    //   1918: dup
    //   1919: bipush #27
    //   1921: ldc 1107296256
    //   1923: iastore
    //   1924: dup
    //   1925: bipush #28
    //   1927: ldc 34078976
    //   1929: iastore
    //   1930: dup
    //   1931: bipush #29
    //   1933: ldc 33554432
    //   1935: iastore
    //   1936: dup
    //   1937: bipush #30
    //   1939: ldc 1107296256
    //   1941: iastore
    //   1942: dup
    //   1943: bipush #31
    //   1945: ldc 524544
    //   1947: iastore
    //   1948: dup
    //   1949: bipush #32
    //   1951: ldc 524288
    //   1953: iastore
    //   1954: dup
    //   1955: bipush #33
    //   1957: ldc 1107296512
    //   1959: iastore
    //   1960: dup
    //   1961: bipush #34
    //   1963: sipush #256
    //   1966: iastore
    //   1967: dup
    //   1968: bipush #35
    //   1970: ldc 33554432
    //   1972: iastore
    //   1973: dup
    //   1974: bipush #36
    //   1976: ldc 1073741824
    //   1978: iastore
    //   1979: dup
    //   1980: bipush #37
    //   1982: ldc 34078720
    //   1984: iastore
    //   1985: dup
    //   1986: bipush #38
    //   1988: ldc 1107296512
    //   1990: iastore
    //   1991: dup
    //   1992: bipush #39
    //   1994: ldc 1074266368
    //   1996: iastore
    //   1997: dup
    //   1998: bipush #40
    //   2000: ldc 33554688
    //   2002: iastore
    //   2003: dup
    //   2004: bipush #41
    //   2006: ldc 1073741824
    //   2008: iastore
    //   2009: dup
    //   2010: bipush #42
    //   2012: ldc 1107820544
    //   2014: iastore
    //   2015: dup
    //   2016: bipush #43
    //   2018: ldc 34078976
    //   2020: iastore
    //   2021: dup
    //   2022: bipush #44
    //   2024: ldc 1074266368
    //   2026: iastore
    //   2027: dup
    //   2028: bipush #45
    //   2030: sipush #256
    //   2033: iastore
    //   2034: dup
    //   2035: bipush #46
    //   2037: ldc 33554432
    //   2039: iastore
    //   2040: dup
    //   2041: bipush #47
    //   2043: ldc 1107820544
    //   2045: iastore
    //   2046: dup
    //   2047: bipush #48
    //   2049: ldc 1107820800
    //   2051: iastore
    //   2052: dup
    //   2053: bipush #49
    //   2055: ldc 524544
    //   2057: iastore
    //   2058: dup
    //   2059: bipush #50
    //   2061: ldc 1107296256
    //   2063: iastore
    //   2064: dup
    //   2065: bipush #51
    //   2067: ldc 1107820800
    //   2069: iastore
    //   2070: dup
    //   2071: bipush #52
    //   2073: ldc 34078720
    //   2075: iastore
    //   2076: dup
    //   2077: bipush #53
    //   2079: iconst_0
    //   2080: iastore
    //   2081: dup
    //   2082: bipush #54
    //   2084: ldc 1074266112
    //   2086: iastore
    //   2087: dup
    //   2088: bipush #55
    //   2090: ldc 1107296256
    //   2092: iastore
    //   2093: dup
    //   2094: bipush #56
    //   2096: ldc 524544
    //   2098: iastore
    //   2099: dup
    //   2100: bipush #57
    //   2102: ldc 33554688
    //   2104: iastore
    //   2105: dup
    //   2106: bipush #58
    //   2108: ldc 1073742080
    //   2110: iastore
    //   2111: dup
    //   2112: bipush #59
    //   2114: ldc 524288
    //   2116: iastore
    //   2117: dup
    //   2118: bipush #60
    //   2120: iconst_0
    //   2121: iastore
    //   2122: dup
    //   2123: bipush #61
    //   2125: ldc 1074266112
    //   2127: iastore
    //   2128: dup
    //   2129: bipush #62
    //   2131: ldc 34078976
    //   2133: iastore
    //   2134: dup
    //   2135: bipush #63
    //   2137: ldc 1073742080
    //   2139: iastore
    //   2140: astore #10
    //   2142: bipush #64
    //   2144: newarray int
    //   2146: dup
    //   2147: iconst_0
    //   2148: ldc 536870928
    //   2150: iastore
    //   2151: dup
    //   2152: iconst_1
    //   2153: ldc 541065216
    //   2155: iastore
    //   2156: dup
    //   2157: iconst_2
    //   2158: sipush #16384
    //   2161: iastore
    //   2162: dup
    //   2163: iconst_3
    //   2164: ldc 541081616
    //   2166: iastore
    //   2167: dup
    //   2168: iconst_4
    //   2169: ldc 541065216
    //   2171: iastore
    //   2172: dup
    //   2173: iconst_5
    //   2174: bipush #16
    //   2176: iastore
    //   2177: dup
    //   2178: bipush #6
    //   2180: ldc 541081616
    //   2182: iastore
    //   2183: dup
    //   2184: bipush #7
    //   2186: ldc 4194304
    //   2188: iastore
    //   2189: dup
    //   2190: bipush #8
    //   2192: ldc 536887296
    //   2194: iastore
    //   2195: dup
    //   2196: bipush #9
    //   2198: ldc 4210704
    //   2200: iastore
    //   2201: dup
    //   2202: bipush #10
    //   2204: ldc 4194304
    //   2206: iastore
    //   2207: dup
    //   2208: bipush #11
    //   2210: ldc 536870928
    //   2212: iastore
    //   2213: dup
    //   2214: bipush #12
    //   2216: ldc 4194320
    //   2218: iastore
    //   2219: dup
    //   2220: bipush #13
    //   2222: ldc 536887296
    //   2224: iastore
    //   2225: dup
    //   2226: bipush #14
    //   2228: ldc 536870912
    //   2230: iastore
    //   2231: dup
    //   2232: bipush #15
    //   2234: sipush #16400
    //   2237: iastore
    //   2238: dup
    //   2239: bipush #16
    //   2241: iconst_0
    //   2242: iastore
    //   2243: dup
    //   2244: bipush #17
    //   2246: ldc 4194320
    //   2248: iastore
    //   2249: dup
    //   2250: bipush #18
    //   2252: ldc 536887312
    //   2254: iastore
    //   2255: dup
    //   2256: bipush #19
    //   2258: sipush #16384
    //   2261: iastore
    //   2262: dup
    //   2263: bipush #20
    //   2265: ldc 4210688
    //   2267: iastore
    //   2268: dup
    //   2269: bipush #21
    //   2271: ldc 536887312
    //   2273: iastore
    //   2274: dup
    //   2275: bipush #22
    //   2277: bipush #16
    //   2279: iastore
    //   2280: dup
    //   2281: bipush #23
    //   2283: ldc 541065232
    //   2285: iastore
    //   2286: dup
    //   2287: bipush #24
    //   2289: ldc 541065232
    //   2291: iastore
    //   2292: dup
    //   2293: bipush #25
    //   2295: iconst_0
    //   2296: iastore
    //   2297: dup
    //   2298: bipush #26
    //   2300: ldc 4210704
    //   2302: iastore
    //   2303: dup
    //   2304: bipush #27
    //   2306: ldc 541081600
    //   2308: iastore
    //   2309: dup
    //   2310: bipush #28
    //   2312: sipush #16400
    //   2315: iastore
    //   2316: dup
    //   2317: bipush #29
    //   2319: ldc 4210688
    //   2321: iastore
    //   2322: dup
    //   2323: bipush #30
    //   2325: ldc 541081600
    //   2327: iastore
    //   2328: dup
    //   2329: bipush #31
    //   2331: ldc 536870912
    //   2333: iastore
    //   2334: dup
    //   2335: bipush #32
    //   2337: ldc 536887296
    //   2339: iastore
    //   2340: dup
    //   2341: bipush #33
    //   2343: bipush #16
    //   2345: iastore
    //   2346: dup
    //   2347: bipush #34
    //   2349: ldc 541065232
    //   2351: iastore
    //   2352: dup
    //   2353: bipush #35
    //   2355: ldc 4210688
    //   2357: iastore
    //   2358: dup
    //   2359: bipush #36
    //   2361: ldc 541081616
    //   2363: iastore
    //   2364: dup
    //   2365: bipush #37
    //   2367: ldc 4194304
    //   2369: iastore
    //   2370: dup
    //   2371: bipush #38
    //   2373: sipush #16400
    //   2376: iastore
    //   2377: dup
    //   2378: bipush #39
    //   2380: ldc 536870928
    //   2382: iastore
    //   2383: dup
    //   2384: bipush #40
    //   2386: ldc 4194304
    //   2388: iastore
    //   2389: dup
    //   2390: bipush #41
    //   2392: ldc 536887296
    //   2394: iastore
    //   2395: dup
    //   2396: bipush #42
    //   2398: ldc 536870912
    //   2400: iastore
    //   2401: dup
    //   2402: bipush #43
    //   2404: sipush #16400
    //   2407: iastore
    //   2408: dup
    //   2409: bipush #44
    //   2411: ldc 536870928
    //   2413: iastore
    //   2414: dup
    //   2415: bipush #45
    //   2417: ldc 541081616
    //   2419: iastore
    //   2420: dup
    //   2421: bipush #46
    //   2423: ldc 4210688
    //   2425: iastore
    //   2426: dup
    //   2427: bipush #47
    //   2429: ldc 541065216
    //   2431: iastore
    //   2432: dup
    //   2433: bipush #48
    //   2435: ldc 4210704
    //   2437: iastore
    //   2438: dup
    //   2439: bipush #49
    //   2441: ldc 541081600
    //   2443: iastore
    //   2444: dup
    //   2445: bipush #50
    //   2447: iconst_0
    //   2448: iastore
    //   2449: dup
    //   2450: bipush #51
    //   2452: ldc 541065232
    //   2454: iastore
    //   2455: dup
    //   2456: bipush #52
    //   2458: bipush #16
    //   2460: iastore
    //   2461: dup
    //   2462: bipush #53
    //   2464: sipush #16384
    //   2467: iastore
    //   2468: dup
    //   2469: bipush #54
    //   2471: ldc 541065216
    //   2473: iastore
    //   2474: dup
    //   2475: bipush #55
    //   2477: ldc 4210704
    //   2479: iastore
    //   2480: dup
    //   2481: bipush #56
    //   2483: sipush #16384
    //   2486: iastore
    //   2487: dup
    //   2488: bipush #57
    //   2490: ldc 4194320
    //   2492: iastore
    //   2493: dup
    //   2494: bipush #58
    //   2496: ldc 536887312
    //   2498: iastore
    //   2499: dup
    //   2500: bipush #59
    //   2502: iconst_0
    //   2503: iastore
    //   2504: dup
    //   2505: bipush #60
    //   2507: ldc 541081600
    //   2509: iastore
    //   2510: dup
    //   2511: bipush #61
    //   2513: ldc 536870912
    //   2515: iastore
    //   2516: dup
    //   2517: bipush #62
    //   2519: ldc 4194320
    //   2521: iastore
    //   2522: dup
    //   2523: bipush #63
    //   2525: ldc 536887312
    //   2527: iastore
    //   2528: astore #11
    //   2530: bipush #64
    //   2532: newarray int
    //   2534: dup
    //   2535: iconst_0
    //   2536: ldc 2097152
    //   2538: iastore
    //   2539: dup
    //   2540: iconst_1
    //   2541: ldc 69206018
    //   2543: iastore
    //   2544: dup
    //   2545: iconst_2
    //   2546: ldc 67110914
    //   2548: iastore
    //   2549: dup
    //   2550: iconst_3
    //   2551: iconst_0
    //   2552: iastore
    //   2553: dup
    //   2554: iconst_4
    //   2555: sipush #2048
    //   2558: iastore
    //   2559: dup
    //   2560: iconst_5
    //   2561: ldc 67110914
    //   2563: iastore
    //   2564: dup
    //   2565: bipush #6
    //   2567: ldc 2099202
    //   2569: iastore
    //   2570: dup
    //   2571: bipush #7
    //   2573: ldc 69208064
    //   2575: iastore
    //   2576: dup
    //   2577: bipush #8
    //   2579: ldc 69208066
    //   2581: iastore
    //   2582: dup
    //   2583: bipush #9
    //   2585: ldc 2097152
    //   2587: iastore
    //   2588: dup
    //   2589: bipush #10
    //   2591: iconst_0
    //   2592: iastore
    //   2593: dup
    //   2594: bipush #11
    //   2596: ldc 67108866
    //   2598: iastore
    //   2599: dup
    //   2600: bipush #12
    //   2602: iconst_2
    //   2603: iastore
    //   2604: dup
    //   2605: bipush #13
    //   2607: ldc 67108864
    //   2609: iastore
    //   2610: dup
    //   2611: bipush #14
    //   2613: ldc 69206018
    //   2615: iastore
    //   2616: dup
    //   2617: bipush #15
    //   2619: sipush #2050
    //   2622: iastore
    //   2623: dup
    //   2624: bipush #16
    //   2626: ldc 67110912
    //   2628: iastore
    //   2629: dup
    //   2630: bipush #17
    //   2632: ldc 2099202
    //   2634: iastore
    //   2635: dup
    //   2636: bipush #18
    //   2638: ldc 2097154
    //   2640: iastore
    //   2641: dup
    //   2642: bipush #19
    //   2644: ldc 67110912
    //   2646: iastore
    //   2647: dup
    //   2648: bipush #20
    //   2650: ldc 67108866
    //   2652: iastore
    //   2653: dup
    //   2654: bipush #21
    //   2656: ldc 69206016
    //   2658: iastore
    //   2659: dup
    //   2660: bipush #22
    //   2662: ldc 69208064
    //   2664: iastore
    //   2665: dup
    //   2666: bipush #23
    //   2668: ldc 2097154
    //   2670: iastore
    //   2671: dup
    //   2672: bipush #24
    //   2674: ldc 69206016
    //   2676: iastore
    //   2677: dup
    //   2678: bipush #25
    //   2680: sipush #2048
    //   2683: iastore
    //   2684: dup
    //   2685: bipush #26
    //   2687: sipush #2050
    //   2690: iastore
    //   2691: dup
    //   2692: bipush #27
    //   2694: ldc 69208066
    //   2696: iastore
    //   2697: dup
    //   2698: bipush #28
    //   2700: ldc 2099200
    //   2702: iastore
    //   2703: dup
    //   2704: bipush #29
    //   2706: iconst_2
    //   2707: iastore
    //   2708: dup
    //   2709: bipush #30
    //   2711: ldc 67108864
    //   2713: iastore
    //   2714: dup
    //   2715: bipush #31
    //   2717: ldc 2099200
    //   2719: iastore
    //   2720: dup
    //   2721: bipush #32
    //   2723: ldc 67108864
    //   2725: iastore
    //   2726: dup
    //   2727: bipush #33
    //   2729: ldc 2099200
    //   2731: iastore
    //   2732: dup
    //   2733: bipush #34
    //   2735: ldc 2097152
    //   2737: iastore
    //   2738: dup
    //   2739: bipush #35
    //   2741: ldc 67110914
    //   2743: iastore
    //   2744: dup
    //   2745: bipush #36
    //   2747: ldc 67110914
    //   2749: iastore
    //   2750: dup
    //   2751: bipush #37
    //   2753: ldc 69206018
    //   2755: iastore
    //   2756: dup
    //   2757: bipush #38
    //   2759: ldc 69206018
    //   2761: iastore
    //   2762: dup
    //   2763: bipush #39
    //   2765: iconst_2
    //   2766: iastore
    //   2767: dup
    //   2768: bipush #40
    //   2770: ldc 2097154
    //   2772: iastore
    //   2773: dup
    //   2774: bipush #41
    //   2776: ldc 67108864
    //   2778: iastore
    //   2779: dup
    //   2780: bipush #42
    //   2782: ldc 67110912
    //   2784: iastore
    //   2785: dup
    //   2786: bipush #43
    //   2788: ldc 2097152
    //   2790: iastore
    //   2791: dup
    //   2792: bipush #44
    //   2794: ldc 69208064
    //   2796: iastore
    //   2797: dup
    //   2798: bipush #45
    //   2800: sipush #2050
    //   2803: iastore
    //   2804: dup
    //   2805: bipush #46
    //   2807: ldc 2099202
    //   2809: iastore
    //   2810: dup
    //   2811: bipush #47
    //   2813: ldc 69208064
    //   2815: iastore
    //   2816: dup
    //   2817: bipush #48
    //   2819: sipush #2050
    //   2822: iastore
    //   2823: dup
    //   2824: bipush #49
    //   2826: ldc 67108866
    //   2828: iastore
    //   2829: dup
    //   2830: bipush #50
    //   2832: ldc 69208066
    //   2834: iastore
    //   2835: dup
    //   2836: bipush #51
    //   2838: ldc 69206016
    //   2840: iastore
    //   2841: dup
    //   2842: bipush #52
    //   2844: ldc 2099200
    //   2846: iastore
    //   2847: dup
    //   2848: bipush #53
    //   2850: iconst_0
    //   2851: iastore
    //   2852: dup
    //   2853: bipush #54
    //   2855: iconst_2
    //   2856: iastore
    //   2857: dup
    //   2858: bipush #55
    //   2860: ldc 69208066
    //   2862: iastore
    //   2863: dup
    //   2864: bipush #56
    //   2866: iconst_0
    //   2867: iastore
    //   2868: dup
    //   2869: bipush #57
    //   2871: ldc 2099202
    //   2873: iastore
    //   2874: dup
    //   2875: bipush #58
    //   2877: ldc 69206016
    //   2879: iastore
    //   2880: dup
    //   2881: bipush #59
    //   2883: sipush #2048
    //   2886: iastore
    //   2887: dup
    //   2888: bipush #60
    //   2890: ldc 67108866
    //   2892: iastore
    //   2893: dup
    //   2894: bipush #61
    //   2896: ldc 67110912
    //   2898: iastore
    //   2899: dup
    //   2900: bipush #62
    //   2902: sipush #2048
    //   2905: iastore
    //   2906: dup
    //   2907: bipush #63
    //   2909: ldc 2097154
    //   2911: iastore
    //   2912: astore #12
    //   2914: bipush #64
    //   2916: newarray int
    //   2918: dup
    //   2919: iconst_0
    //   2920: ldc 268439616
    //   2922: iastore
    //   2923: dup
    //   2924: iconst_1
    //   2925: sipush #4096
    //   2928: iastore
    //   2929: dup
    //   2930: iconst_2
    //   2931: ldc 262144
    //   2933: iastore
    //   2934: dup
    //   2935: iconst_3
    //   2936: ldc 268701760
    //   2938: iastore
    //   2939: dup
    //   2940: iconst_4
    //   2941: ldc 268435456
    //   2943: iastore
    //   2944: dup
    //   2945: iconst_5
    //   2946: ldc 268439616
    //   2948: iastore
    //   2949: dup
    //   2950: bipush #6
    //   2952: bipush #64
    //   2954: iastore
    //   2955: dup
    //   2956: bipush #7
    //   2958: ldc 268435456
    //   2960: iastore
    //   2961: dup
    //   2962: bipush #8
    //   2964: ldc 262208
    //   2966: iastore
    //   2967: dup
    //   2968: bipush #9
    //   2970: ldc 268697600
    //   2972: iastore
    //   2973: dup
    //   2974: bipush #10
    //   2976: ldc 268701760
    //   2978: iastore
    //   2979: dup
    //   2980: bipush #11
    //   2982: ldc 266240
    //   2984: iastore
    //   2985: dup
    //   2986: bipush #12
    //   2988: ldc 268701696
    //   2990: iastore
    //   2991: dup
    //   2992: bipush #13
    //   2994: ldc 266304
    //   2996: iastore
    //   2997: dup
    //   2998: bipush #14
    //   3000: sipush #4096
    //   3003: iastore
    //   3004: dup
    //   3005: bipush #15
    //   3007: bipush #64
    //   3009: iastore
    //   3010: dup
    //   3011: bipush #16
    //   3013: ldc 268697600
    //   3015: iastore
    //   3016: dup
    //   3017: bipush #17
    //   3019: ldc 268435520
    //   3021: iastore
    //   3022: dup
    //   3023: bipush #18
    //   3025: ldc 268439552
    //   3027: iastore
    //   3028: dup
    //   3029: bipush #19
    //   3031: sipush #4160
    //   3034: iastore
    //   3035: dup
    //   3036: bipush #20
    //   3038: ldc 266240
    //   3040: iastore
    //   3041: dup
    //   3042: bipush #21
    //   3044: ldc 262208
    //   3046: iastore
    //   3047: dup
    //   3048: bipush #22
    //   3050: ldc 268697664
    //   3052: iastore
    //   3053: dup
    //   3054: bipush #23
    //   3056: ldc 268701696
    //   3058: iastore
    //   3059: dup
    //   3060: bipush #24
    //   3062: sipush #4160
    //   3065: iastore
    //   3066: dup
    //   3067: bipush #25
    //   3069: iconst_0
    //   3070: iastore
    //   3071: dup
    //   3072: bipush #26
    //   3074: iconst_0
    //   3075: iastore
    //   3076: dup
    //   3077: bipush #27
    //   3079: ldc 268697664
    //   3081: iastore
    //   3082: dup
    //   3083: bipush #28
    //   3085: ldc 268435520
    //   3087: iastore
    //   3088: dup
    //   3089: bipush #29
    //   3091: ldc 268439552
    //   3093: iastore
    //   3094: dup
    //   3095: bipush #30
    //   3097: ldc 266304
    //   3099: iastore
    //   3100: dup
    //   3101: bipush #31
    //   3103: ldc 262144
    //   3105: iastore
    //   3106: dup
    //   3107: bipush #32
    //   3109: ldc 266304
    //   3111: iastore
    //   3112: dup
    //   3113: bipush #33
    //   3115: ldc 262144
    //   3117: iastore
    //   3118: dup
    //   3119: bipush #34
    //   3121: ldc 268701696
    //   3123: iastore
    //   3124: dup
    //   3125: bipush #35
    //   3127: sipush #4096
    //   3130: iastore
    //   3131: dup
    //   3132: bipush #36
    //   3134: bipush #64
    //   3136: iastore
    //   3137: dup
    //   3138: bipush #37
    //   3140: ldc 268697664
    //   3142: iastore
    //   3143: dup
    //   3144: bipush #38
    //   3146: sipush #4096
    //   3149: iastore
    //   3150: dup
    //   3151: bipush #39
    //   3153: ldc 266304
    //   3155: iastore
    //   3156: dup
    //   3157: bipush #40
    //   3159: ldc 268439552
    //   3161: iastore
    //   3162: dup
    //   3163: bipush #41
    //   3165: bipush #64
    //   3167: iastore
    //   3168: dup
    //   3169: bipush #42
    //   3171: ldc 268435520
    //   3173: iastore
    //   3174: dup
    //   3175: bipush #43
    //   3177: ldc 268697600
    //   3179: iastore
    //   3180: dup
    //   3181: bipush #44
    //   3183: ldc 268697664
    //   3185: iastore
    //   3186: dup
    //   3187: bipush #45
    //   3189: ldc 268435456
    //   3191: iastore
    //   3192: dup
    //   3193: bipush #46
    //   3195: ldc 262144
    //   3197: iastore
    //   3198: dup
    //   3199: bipush #47
    //   3201: ldc 268439616
    //   3203: iastore
    //   3204: dup
    //   3205: bipush #48
    //   3207: iconst_0
    //   3208: iastore
    //   3209: dup
    //   3210: bipush #49
    //   3212: ldc 268701760
    //   3214: iastore
    //   3215: dup
    //   3216: bipush #50
    //   3218: ldc 262208
    //   3220: iastore
    //   3221: dup
    //   3222: bipush #51
    //   3224: ldc 268435520
    //   3226: iastore
    //   3227: dup
    //   3228: bipush #52
    //   3230: ldc 268697600
    //   3232: iastore
    //   3233: dup
    //   3234: bipush #53
    //   3236: ldc 268439552
    //   3238: iastore
    //   3239: dup
    //   3240: bipush #54
    //   3242: ldc 268439616
    //   3244: iastore
    //   3245: dup
    //   3246: bipush #55
    //   3248: iconst_0
    //   3249: iastore
    //   3250: dup
    //   3251: bipush #56
    //   3253: ldc 268701760
    //   3255: iastore
    //   3256: dup
    //   3257: bipush #57
    //   3259: ldc 266240
    //   3261: iastore
    //   3262: dup
    //   3263: bipush #58
    //   3265: ldc 266240
    //   3267: iastore
    //   3268: dup
    //   3269: bipush #59
    //   3271: sipush #4160
    //   3274: iastore
    //   3275: dup
    //   3276: bipush #60
    //   3278: sipush #4160
    //   3281: iastore
    //   3282: dup
    //   3283: bipush #61
    //   3285: ldc 262208
    //   3287: iastore
    //   3288: dup
    //   3289: bipush #62
    //   3291: ldc 268435456
    //   3293: iastore
    //   3294: dup
    //   3295: bipush #63
    //   3297: ldc 268701696
    //   3299: iastore
    //   3300: astore #13
    //   3302: aload_3
    //   3303: arraylength
    //   3304: istore #14
    //   3306: iload #14
    //   3308: bipush #8
    //   3310: irem
    //   3311: ifeq -> 3335
    //   3314: new java/lang/Exception
    //   3317: dup
    //   3318: sipush #32534
    //   3321: sipush #-836
    //   3324: invokestatic a : (II)Ljava/lang/String;
    //   3327: invokespecial <init> : (Ljava/lang/String;)V
    //   3330: athrow
    //   3331: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3334: athrow
    //   3335: iconst_2
    //   3336: newarray int
    //   3338: astore #15
    //   3340: iload #14
    //   3342: newarray byte
    //   3344: astore #16
    //   3346: iload #14
    //   3348: bipush #8
    //   3350: idiv
    //   3351: istore #17
    //   3353: iconst_0
    //   3354: istore #18
    //   3356: iload #18
    //   3358: iload #17
    //   3360: if_icmpge -> 4274
    //   3363: iload #18
    //   3365: bipush #8
    //   3367: imul
    //   3368: istore #19
    //   3370: iconst_0
    //   3371: istore #20
    //   3373: iload #20
    //   3375: iconst_2
    //   3376: if_icmpge -> 3461
    //   3379: aload #15
    //   3381: iload #20
    //   3383: aload_3
    //   3384: iload #19
    //   3386: iload #20
    //   3388: iconst_4
    //   3389: imul
    //   3390: iadd
    //   3391: baload
    //   3392: sipush #255
    //   3395: iand
    //   3396: bipush #24
    //   3398: ishl
    //   3399: aload_3
    //   3400: iload #19
    //   3402: iload #20
    //   3404: iconst_4
    //   3405: imul
    //   3406: iadd
    //   3407: iconst_1
    //   3408: iadd
    //   3409: baload
    //   3410: sipush #255
    //   3413: iand
    //   3414: bipush #16
    //   3416: ishl
    //   3417: ior
    //   3418: aload_3
    //   3419: iload #19
    //   3421: iload #20
    //   3423: iconst_4
    //   3424: imul
    //   3425: iadd
    //   3426: iconst_2
    //   3427: iadd
    //   3428: baload
    //   3429: sipush #255
    //   3432: iand
    //   3433: bipush #8
    //   3435: ishl
    //   3436: ior
    //   3437: aload_3
    //   3438: iload #19
    //   3440: iload #20
    //   3442: iconst_4
    //   3443: imul
    //   3444: iadd
    //   3445: iconst_3
    //   3446: iadd
    //   3447: baload
    //   3448: sipush #255
    //   3451: iand
    //   3452: ior
    //   3453: iastore
    //   3454: iinc #20, 1
    //   3457: iload_2
    //   3458: ifeq -> 3373
    //   3461: iconst_0
    //   3462: istore #25
    //   3464: aload #15
    //   3466: iconst_0
    //   3467: iaload
    //   3468: istore #23
    //   3470: aload #15
    //   3472: iconst_1
    //   3473: iaload
    //   3474: istore #22
    //   3476: iload #23
    //   3478: iconst_4
    //   3479: iushr
    //   3480: iload #22
    //   3482: ixor
    //   3483: ldc 252645135
    //   3485: iand
    //   3486: istore #21
    //   3488: iload #22
    //   3490: iload #21
    //   3492: ixor
    //   3493: istore #22
    //   3495: iload #23
    //   3497: iload #21
    //   3499: iconst_4
    //   3500: ishl
    //   3501: ixor
    //   3502: istore #23
    //   3504: iload #23
    //   3506: bipush #16
    //   3508: iushr
    //   3509: iload #22
    //   3511: ixor
    //   3512: ldc 65535
    //   3514: iand
    //   3515: istore #21
    //   3517: iload #22
    //   3519: iload #21
    //   3521: ixor
    //   3522: istore #22
    //   3524: iload #23
    //   3526: iload #21
    //   3528: bipush #16
    //   3530: ishl
    //   3531: ixor
    //   3532: istore #23
    //   3534: iload #22
    //   3536: iconst_2
    //   3537: iushr
    //   3538: iload #23
    //   3540: ixor
    //   3541: ldc 858993459
    //   3543: iand
    //   3544: istore #21
    //   3546: iload #23
    //   3548: iload #21
    //   3550: ixor
    //   3551: istore #23
    //   3553: iload #22
    //   3555: iload #21
    //   3557: iconst_2
    //   3558: ishl
    //   3559: ixor
    //   3560: istore #22
    //   3562: iload #22
    //   3564: bipush #8
    //   3566: iushr
    //   3567: iload #23
    //   3569: ixor
    //   3570: ldc 16711935
    //   3572: iand
    //   3573: istore #21
    //   3575: iload #23
    //   3577: iload #21
    //   3579: ixor
    //   3580: istore #23
    //   3582: iload #22
    //   3584: iload #21
    //   3586: bipush #8
    //   3588: ishl
    //   3589: ixor
    //   3590: istore #22
    //   3592: iload #22
    //   3594: iconst_1
    //   3595: ishl
    //   3596: iload #22
    //   3598: bipush #31
    //   3600: iushr
    //   3601: iconst_1
    //   3602: iand
    //   3603: ior
    //   3604: istore #22
    //   3606: iload #23
    //   3608: iload #22
    //   3610: ixor
    //   3611: ldc -1431655766
    //   3613: iand
    //   3614: istore #21
    //   3616: iload #23
    //   3618: iload #21
    //   3620: ixor
    //   3621: istore #23
    //   3623: iload #22
    //   3625: iload #21
    //   3627: ixor
    //   3628: istore #22
    //   3630: iload #23
    //   3632: iconst_1
    //   3633: ishl
    //   3634: iload #23
    //   3636: bipush #31
    //   3638: iushr
    //   3639: iconst_1
    //   3640: iand
    //   3641: ior
    //   3642: istore #23
    //   3644: iconst_0
    //   3645: istore #24
    //   3647: iload #24
    //   3649: bipush #8
    //   3651: if_icmpge -> 3989
    //   3654: iload #22
    //   3656: bipush #28
    //   3658: ishl
    //   3659: iload #22
    //   3661: iconst_4
    //   3662: iushr
    //   3663: ior
    //   3664: istore #21
    //   3666: iload #21
    //   3668: aload #5
    //   3670: iload #25
    //   3672: iinc #25, 1
    //   3675: iaload
    //   3676: ixor
    //   3677: istore #21
    //   3679: aload #12
    //   3681: iload #21
    //   3683: bipush #63
    //   3685: iand
    //   3686: iaload
    //   3687: istore #20
    //   3689: iload #20
    //   3691: aload #10
    //   3693: iload #21
    //   3695: bipush #8
    //   3697: iushr
    //   3698: bipush #63
    //   3700: iand
    //   3701: iaload
    //   3702: ior
    //   3703: istore #20
    //   3705: iload #20
    //   3707: aload #8
    //   3709: iload #21
    //   3711: bipush #16
    //   3713: iushr
    //   3714: bipush #63
    //   3716: iand
    //   3717: iaload
    //   3718: ior
    //   3719: istore #20
    //   3721: iload #20
    //   3723: aload #6
    //   3725: iload #21
    //   3727: bipush #24
    //   3729: iushr
    //   3730: bipush #63
    //   3732: iand
    //   3733: iaload
    //   3734: ior
    //   3735: istore #20
    //   3737: iload #22
    //   3739: aload #5
    //   3741: iload #25
    //   3743: iinc #25, 1
    //   3746: iaload
    //   3747: ixor
    //   3748: istore #21
    //   3750: iload #20
    //   3752: aload #13
    //   3754: iload #21
    //   3756: bipush #63
    //   3758: iand
    //   3759: iaload
    //   3760: ior
    //   3761: istore #20
    //   3763: iload #20
    //   3765: aload #11
    //   3767: iload #21
    //   3769: bipush #8
    //   3771: iushr
    //   3772: bipush #63
    //   3774: iand
    //   3775: iaload
    //   3776: ior
    //   3777: istore #20
    //   3779: iload #20
    //   3781: aload #9
    //   3783: iload #21
    //   3785: bipush #16
    //   3787: iushr
    //   3788: bipush #63
    //   3790: iand
    //   3791: iaload
    //   3792: ior
    //   3793: istore #20
    //   3795: iload #20
    //   3797: aload #7
    //   3799: iload #21
    //   3801: bipush #24
    //   3803: iushr
    //   3804: bipush #63
    //   3806: iand
    //   3807: iaload
    //   3808: ior
    //   3809: istore #20
    //   3811: iload #23
    //   3813: iload #20
    //   3815: ixor
    //   3816: istore #23
    //   3818: iload #23
    //   3820: bipush #28
    //   3822: ishl
    //   3823: iload #23
    //   3825: iconst_4
    //   3826: iushr
    //   3827: ior
    //   3828: istore #21
    //   3830: iload #21
    //   3832: aload #5
    //   3834: iload #25
    //   3836: iinc #25, 1
    //   3839: iaload
    //   3840: ixor
    //   3841: istore #21
    //   3843: aload #12
    //   3845: iload #21
    //   3847: bipush #63
    //   3849: iand
    //   3850: iaload
    //   3851: istore #20
    //   3853: iload #20
    //   3855: aload #10
    //   3857: iload #21
    //   3859: bipush #8
    //   3861: iushr
    //   3862: bipush #63
    //   3864: iand
    //   3865: iaload
    //   3866: ior
    //   3867: istore #20
    //   3869: iload #20
    //   3871: aload #8
    //   3873: iload #21
    //   3875: bipush #16
    //   3877: iushr
    //   3878: bipush #63
    //   3880: iand
    //   3881: iaload
    //   3882: ior
    //   3883: istore #20
    //   3885: iload #20
    //   3887: aload #6
    //   3889: iload #21
    //   3891: bipush #24
    //   3893: iushr
    //   3894: bipush #63
    //   3896: iand
    //   3897: iaload
    //   3898: ior
    //   3899: istore #20
    //   3901: iload #23
    //   3903: aload #5
    //   3905: iload #25
    //   3907: iinc #25, 1
    //   3910: iaload
    //   3911: ixor
    //   3912: istore #21
    //   3914: iload #20
    //   3916: aload #13
    //   3918: iload #21
    //   3920: bipush #63
    //   3922: iand
    //   3923: iaload
    //   3924: ior
    //   3925: istore #20
    //   3927: iload #20
    //   3929: aload #11
    //   3931: iload #21
    //   3933: bipush #8
    //   3935: iushr
    //   3936: bipush #63
    //   3938: iand
    //   3939: iaload
    //   3940: ior
    //   3941: istore #20
    //   3943: iload #20
    //   3945: aload #9
    //   3947: iload #21
    //   3949: bipush #16
    //   3951: iushr
    //   3952: bipush #63
    //   3954: iand
    //   3955: iaload
    //   3956: ior
    //   3957: istore #20
    //   3959: iload #20
    //   3961: aload #7
    //   3963: iload #21
    //   3965: bipush #24
    //   3967: iushr
    //   3968: bipush #63
    //   3970: iand
    //   3971: iaload
    //   3972: ior
    //   3973: istore #20
    //   3975: iload #22
    //   3977: iload #20
    //   3979: ixor
    //   3980: istore #22
    //   3982: iinc #24, 1
    //   3985: iload_2
    //   3986: ifeq -> 3647
    //   3989: iload #22
    //   3991: bipush #31
    //   3993: ishl
    //   3994: iload #22
    //   3996: iconst_1
    //   3997: iushr
    //   3998: ior
    //   3999: istore #22
    //   4001: iload #23
    //   4003: iload #22
    //   4005: ixor
    //   4006: ldc -1431655766
    //   4008: iand
    //   4009: istore #21
    //   4011: iload #23
    //   4013: iload #21
    //   4015: ixor
    //   4016: istore #23
    //   4018: iload #22
    //   4020: iload #21
    //   4022: ixor
    //   4023: istore #22
    //   4025: iload #23
    //   4027: bipush #31
    //   4029: ishl
    //   4030: iload #23
    //   4032: iconst_1
    //   4033: iushr
    //   4034: ior
    //   4035: istore #23
    //   4037: iload #23
    //   4039: bipush #8
    //   4041: iushr
    //   4042: iload #22
    //   4044: ixor
    //   4045: ldc 16711935
    //   4047: iand
    //   4048: istore #21
    //   4050: iload #22
    //   4052: iload #21
    //   4054: ixor
    //   4055: istore #22
    //   4057: iload #23
    //   4059: iload #21
    //   4061: bipush #8
    //   4063: ishl
    //   4064: ixor
    //   4065: istore #23
    //   4067: iload #23
    //   4069: iconst_2
    //   4070: iushr
    //   4071: iload #22
    //   4073: ixor
    //   4074: ldc 858993459
    //   4076: iand
    //   4077: istore #21
    //   4079: iload #22
    //   4081: iload #21
    //   4083: ixor
    //   4084: istore #22
    //   4086: iload #23
    //   4088: iload #21
    //   4090: iconst_2
    //   4091: ishl
    //   4092: ixor
    //   4093: istore #23
    //   4095: iload #22
    //   4097: bipush #16
    //   4099: iushr
    //   4100: iload #23
    //   4102: ixor
    //   4103: ldc 65535
    //   4105: iand
    //   4106: istore #21
    //   4108: iload #23
    //   4110: iload #21
    //   4112: ixor
    //   4113: istore #23
    //   4115: iload #22
    //   4117: iload #21
    //   4119: bipush #16
    //   4121: ishl
    //   4122: ixor
    //   4123: istore #22
    //   4125: iload #22
    //   4127: iconst_4
    //   4128: iushr
    //   4129: iload #23
    //   4131: ixor
    //   4132: ldc 252645135
    //   4134: iand
    //   4135: istore #21
    //   4137: iload #23
    //   4139: iload #21
    //   4141: ixor
    //   4142: istore #23
    //   4144: iload #22
    //   4146: iload #21
    //   4148: iconst_4
    //   4149: ishl
    //   4150: ixor
    //   4151: istore #22
    //   4153: aload #15
    //   4155: iconst_0
    //   4156: iload #22
    //   4158: iastore
    //   4159: aload #15
    //   4161: iconst_1
    //   4162: iload #23
    //   4164: iastore
    //   4165: iload #18
    //   4167: bipush #8
    //   4169: imul
    //   4170: istore #26
    //   4172: iconst_0
    //   4173: istore #27
    //   4175: iload #27
    //   4177: iconst_2
    //   4178: if_icmpge -> 4267
    //   4181: aload #16
    //   4183: iload #26
    //   4185: iload #27
    //   4187: iconst_4
    //   4188: imul
    //   4189: iadd
    //   4190: aload #15
    //   4192: iload #27
    //   4194: iaload
    //   4195: bipush #24
    //   4197: iushr
    //   4198: i2b
    //   4199: bastore
    //   4200: aload #16
    //   4202: iload #26
    //   4204: iload #27
    //   4206: iconst_4
    //   4207: imul
    //   4208: iadd
    //   4209: iconst_1
    //   4210: iadd
    //   4211: aload #15
    //   4213: iload #27
    //   4215: iaload
    //   4216: bipush #16
    //   4218: iushr
    //   4219: i2b
    //   4220: bastore
    //   4221: aload #16
    //   4223: iload #26
    //   4225: iload #27
    //   4227: iconst_4
    //   4228: imul
    //   4229: iadd
    //   4230: iconst_2
    //   4231: iadd
    //   4232: aload #15
    //   4234: iload #27
    //   4236: iaload
    //   4237: bipush #8
    //   4239: iushr
    //   4240: i2b
    //   4241: bastore
    //   4242: aload #16
    //   4244: iload #26
    //   4246: iload #27
    //   4248: iconst_4
    //   4249: imul
    //   4250: iadd
    //   4251: iconst_3
    //   4252: iadd
    //   4253: aload #15
    //   4255: iload #27
    //   4257: iaload
    //   4258: i2b
    //   4259: bastore
    //   4260: iinc #27, 1
    //   4263: iload_2
    //   4264: ifeq -> 4175
    //   4267: iinc #18, 1
    //   4270: iload_2
    //   4271: ifeq -> 3356
    //   4274: aload #16
    //   4276: aload #16
    //   4278: arraylength
    //   4279: iconst_1
    //   4280: isub
    //   4281: baload
    //   4282: istore #18
    //   4284: aload #16
    //   4286: arraylength
    //   4287: iload #18
    //   4289: isub
    //   4290: newarray byte
    //   4292: astore #4
    //   4294: aload #16
    //   4296: arraylength
    //   4297: aload #4
    //   4299: arraylength
    //   4300: if_icmpge -> 4324
    //   4303: new java/lang/Exception
    //   4306: dup
    //   4307: sipush #32537
    //   4310: sipush #-28561
    //   4313: invokestatic a : (II)Ljava/lang/String;
    //   4316: invokespecial <init> : (Ljava/lang/String;)V
    //   4319: athrow
    //   4320: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4323: athrow
    //   4324: iconst_0
    //   4325: istore #19
    //   4327: iload #19
    //   4329: aload #4
    //   4331: arraylength
    //   4332: if_icmpge -> 4352
    //   4335: aload #4
    //   4337: iload #19
    //   4339: aload #16
    //   4341: iload #19
    //   4343: baload
    //   4344: bastore
    //   4345: iinc #19, 1
    //   4348: iload_2
    //   4349: ifeq -> 4327
    //   4352: new java/math/BigInteger
    //   4355: dup
    //   4356: aload #4
    //   4358: invokespecial <init> : ([B)V
    //   4361: invokevirtual abs : ()Ljava/math/BigInteger;
    //   4364: putstatic burp/Zl6z.Zt : Ljava/lang/Object;
    //   4367: sipush #32526
    //   4370: sipush #22491
    //   4373: invokestatic a : (II)Ljava/lang/String;
    //   4376: iconst_1
    //   4377: ldc burp/Zbxp
    //   4379: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4382: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4385: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4388: astore_3
    //   4389: aload_3
    //   4390: arraylength
    //   4391: istore #4
    //   4393: iconst_0
    //   4394: istore #5
    //   4396: iload #5
    //   4398: iload #4
    //   4400: if_icmpge -> 4537
    //   4403: aload_3
    //   4404: iload #5
    //   4406: aaload
    //   4407: astore #6
    //   4409: aload #6
    //   4411: invokevirtual getModifiers : ()I
    //   4414: invokestatic isStatic : (I)Z
    //   4417: ifne -> 4427
    //   4420: goto -> 4530
    //   4423: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4426: athrow
    //   4427: aload #6
    //   4429: invokevirtual getType : ()Ljava/lang/Class;
    //   4432: astore #7
    //   4434: aload #7
    //   4436: ifnull -> 4517
    //   4439: aload #7
    //   4441: invokevirtual isPrimitive : ()Z
    //   4444: ifne -> 4517
    //   4447: goto -> 4454
    //   4450: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4453: athrow
    //   4454: aload #7
    //   4456: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4459: ifnull -> 4517
    //   4462: goto -> 4469
    //   4465: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4468: athrow
    //   4469: aload #7
    //   4471: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4474: invokevirtual getName : ()Ljava/lang/String;
    //   4477: ifnull -> 4517
    //   4480: goto -> 4487
    //   4483: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4486: athrow
    //   4487: aload #7
    //   4489: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4492: invokevirtual getName : ()Ljava/lang/String;
    //   4495: sipush #32512
    //   4498: sipush #5849
    //   4501: invokestatic a : (II)Ljava/lang/String;
    //   4504: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4507: ifne -> 4517
    //   4510: goto -> 4517
    //   4513: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4516: athrow
    //   4517: aload #6
    //   4519: iconst_1
    //   4520: invokevirtual setAccessible : (Z)V
    //   4523: aload #6
    //   4525: aconst_null
    //   4526: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4529: pop
    //   4530: iinc #5, 1
    //   4533: iload_2
    //   4534: ifeq -> 4396
    //   4537: sipush #32529
    //   4540: sipush #29034
    //   4543: invokestatic a : (II)Ljava/lang/String;
    //   4546: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4549: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4552: astore_3
    //   4553: aload_3
    //   4554: arraylength
    //   4555: istore #4
    //   4557: iconst_0
    //   4558: istore #5
    //   4560: iload #5
    //   4562: iload #4
    //   4564: if_icmpge -> 4696
    //   4567: aload_3
    //   4568: iload #5
    //   4570: aaload
    //   4571: astore #6
    //   4573: aload #6
    //   4575: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4578: pop
    //   4579: aload #6
    //   4581: invokevirtual getModifiers : ()I
    //   4584: invokestatic isStatic : (I)Z
    //   4587: ifeq -> 4682
    //   4590: aload #6
    //   4592: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4595: arraylength
    //   4596: iconst_2
    //   4597: if_icmpne -> 4682
    //   4600: goto -> 4607
    //   4603: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4606: athrow
    //   4607: aload #6
    //   4609: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4612: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   4615: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4618: ifeq -> 4682
    //   4621: goto -> 4628
    //   4624: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4627: athrow
    //   4628: aload #6
    //   4630: iconst_1
    //   4631: invokevirtual setAccessible : (Z)V
    //   4634: aload #6
    //   4636: aconst_null
    //   4637: iconst_2
    //   4638: anewarray java/lang/Object
    //   4641: dup
    //   4642: iconst_0
    //   4643: aload_0
    //   4644: aastore
    //   4645: dup
    //   4646: iconst_1
    //   4647: aload_1
    //   4648: ifnonnull -> 4666
    //   4651: goto -> 4658
    //   4654: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4657: athrow
    //   4658: aload_1
    //   4659: goto -> 4673
    //   4662: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4665: athrow
    //   4666: aload_1
    //   4667: checkcast [B
    //   4670: invokevirtual clone : ()Ljava/lang/Object;
    //   4673: aastore
    //   4674: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4677: pop
    //   4678: iload_2
    //   4679: ifeq -> 4696
    //   4682: iinc #5, 1
    //   4685: iload_2
    //   4686: ifeq -> 4560
    //   4689: goto -> 4696
    //   4692: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4695: athrow
    //   4696: iconst_0
    //   4697: istore_3
    //   4698: getstatic burp/Zz0.ZX : Ljava/lang/String;
    //   4701: getstatic burp/Zr4z.ZH : Ljava/lang/Object;
    //   4704: checkcast java/math/BigInteger
    //   4707: invokevirtual intValue : ()I
    //   4710: bipush #32
    //   4712: irem
    //   4713: invokestatic abs : (I)I
    //   4716: invokevirtual charAt : (I)C
    //   4719: getstatic burp/Zrnw.Zg : Ljava/lang/String;
    //   4722: getstatic burp/Zg5.Zs : Ljava/lang/Object;
    //   4725: checkcast java/math/BigInteger
    //   4728: invokevirtual intValue : ()I
    //   4731: bipush #32
    //   4733: irem
    //   4734: invokestatic abs : (I)I
    //   4737: invokevirtual charAt : (I)C
    //   4740: if_icmpgt -> 5084
    //   4743: sipush #32535
    //   4746: sipush #11758
    //   4749: invokestatic a : (II)Ljava/lang/String;
    //   4752: iconst_1
    //   4753: ldc burp/Zmt6
    //   4755: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4758: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4761: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4764: astore #4
    //   4766: aload #4
    //   4768: arraylength
    //   4769: istore #5
    //   4771: iconst_0
    //   4772: istore #6
    //   4774: iload #6
    //   4776: iload #5
    //   4778: if_icmpge -> 4916
    //   4781: aload #4
    //   4783: iload #6
    //   4785: aaload
    //   4786: astore #7
    //   4788: aload #7
    //   4790: invokevirtual getModifiers : ()I
    //   4793: invokestatic isStatic : (I)Z
    //   4796: ifne -> 4806
    //   4799: goto -> 4909
    //   4802: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4805: athrow
    //   4806: aload #7
    //   4808: invokevirtual getType : ()Ljava/lang/Class;
    //   4811: astore #8
    //   4813: aload #8
    //   4815: ifnull -> 4896
    //   4818: aload #8
    //   4820: invokevirtual isPrimitive : ()Z
    //   4823: ifne -> 4896
    //   4826: goto -> 4833
    //   4829: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4832: athrow
    //   4833: aload #8
    //   4835: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4838: ifnull -> 4896
    //   4841: goto -> 4848
    //   4844: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4847: athrow
    //   4848: aload #8
    //   4850: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4853: invokevirtual getName : ()Ljava/lang/String;
    //   4856: ifnull -> 4896
    //   4859: goto -> 4866
    //   4862: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4865: athrow
    //   4866: aload #8
    //   4868: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4871: invokevirtual getName : ()Ljava/lang/String;
    //   4874: sipush #32533
    //   4877: sipush #-3421
    //   4880: invokestatic a : (II)Ljava/lang/String;
    //   4883: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4886: ifne -> 4896
    //   4889: goto -> 4896
    //   4892: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4895: athrow
    //   4896: aload #7
    //   4898: iconst_1
    //   4899: invokevirtual setAccessible : (Z)V
    //   4902: aload #7
    //   4904: aconst_null
    //   4905: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4908: pop
    //   4909: iinc #6, 1
    //   4912: iload_2
    //   4913: ifeq -> 4774
    //   4916: sipush #32541
    //   4919: sipush #-32142
    //   4922: invokestatic a : (II)Ljava/lang/String;
    //   4925: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4928: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4931: astore #4
    //   4933: aload #4
    //   4935: arraylength
    //   4936: istore #5
    //   4938: iconst_0
    //   4939: istore #6
    //   4941: iload #6
    //   4943: iload #5
    //   4945: if_icmpge -> 5081
    //   4948: aload #4
    //   4950: iload #6
    //   4952: aaload
    //   4953: astore #7
    //   4955: aload #7
    //   4957: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4960: pop
    //   4961: aload #7
    //   4963: invokevirtual getModifiers : ()I
    //   4966: invokestatic isStatic : (I)Z
    //   4969: ifeq -> 5067
    //   4972: aload #7
    //   4974: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4977: arraylength
    //   4978: iconst_2
    //   4979: if_icmpne -> 5067
    //   4982: goto -> 4989
    //   4985: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4988: athrow
    //   4989: aload #7
    //   4991: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4994: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4997: if_acmpne -> 5067
    //   5000: goto -> 5007
    //   5003: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5006: athrow
    //   5007: aload #7
    //   5009: iconst_1
    //   5010: invokevirtual setAccessible : (Z)V
    //   5013: aload #7
    //   5015: aconst_null
    //   5016: iconst_2
    //   5017: anewarray java/lang/Object
    //   5020: dup
    //   5021: iconst_0
    //   5022: aload_0
    //   5023: aastore
    //   5024: dup
    //   5025: iconst_1
    //   5026: aload_1
    //   5027: ifnonnull -> 5045
    //   5030: goto -> 5037
    //   5033: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5036: athrow
    //   5037: aload_1
    //   5038: goto -> 5052
    //   5041: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5044: athrow
    //   5045: aload_1
    //   5046: checkcast [B
    //   5049: invokevirtual clone : ()Ljava/lang/Object;
    //   5052: aastore
    //   5053: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5056: checkcast java/lang/Boolean
    //   5059: invokevirtual booleanValue : ()Z
    //   5062: istore_3
    //   5063: iload_2
    //   5064: ifeq -> 5081
    //   5067: iinc #6, 1
    //   5070: iload_2
    //   5071: ifeq -> 4941
    //   5074: goto -> 5081
    //   5077: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5080: athrow
    //   5081: goto -> 5422
    //   5084: sipush #32531
    //   5087: sipush #-29662
    //   5090: invokestatic a : (II)Ljava/lang/String;
    //   5093: iconst_1
    //   5094: ldc burp/Zrs0
    //   5096: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5099: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5102: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5105: astore #4
    //   5107: aload #4
    //   5109: arraylength
    //   5110: istore #5
    //   5112: iconst_0
    //   5113: istore #6
    //   5115: iload #6
    //   5117: iload #5
    //   5119: if_icmpge -> 5257
    //   5122: aload #4
    //   5124: iload #6
    //   5126: aaload
    //   5127: astore #7
    //   5129: aload #7
    //   5131: invokevirtual getModifiers : ()I
    //   5134: invokestatic isStatic : (I)Z
    //   5137: ifne -> 5147
    //   5140: goto -> 5250
    //   5143: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5146: athrow
    //   5147: aload #7
    //   5149: invokevirtual getType : ()Ljava/lang/Class;
    //   5152: astore #8
    //   5154: aload #8
    //   5156: ifnull -> 5237
    //   5159: aload #8
    //   5161: invokevirtual isPrimitive : ()Z
    //   5164: ifne -> 5237
    //   5167: goto -> 5174
    //   5170: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5173: athrow
    //   5174: aload #8
    //   5176: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5179: ifnull -> 5237
    //   5182: goto -> 5189
    //   5185: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5188: athrow
    //   5189: aload #8
    //   5191: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5194: invokevirtual getName : ()Ljava/lang/String;
    //   5197: ifnull -> 5237
    //   5200: goto -> 5207
    //   5203: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5206: athrow
    //   5207: aload #8
    //   5209: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5212: invokevirtual getName : ()Ljava/lang/String;
    //   5215: sipush #32533
    //   5218: sipush #-3421
    //   5221: invokestatic a : (II)Ljava/lang/String;
    //   5224: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5227: ifne -> 5237
    //   5230: goto -> 5237
    //   5233: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5236: athrow
    //   5237: aload #7
    //   5239: iconst_1
    //   5240: invokevirtual setAccessible : (Z)V
    //   5243: aload #7
    //   5245: aconst_null
    //   5246: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5249: pop
    //   5250: iinc #6, 1
    //   5253: iload_2
    //   5254: ifeq -> 5115
    //   5257: sipush #32538
    //   5260: sipush #-22035
    //   5263: invokestatic a : (II)Ljava/lang/String;
    //   5266: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5269: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5272: astore #4
    //   5274: aload #4
    //   5276: arraylength
    //   5277: istore #5
    //   5279: iconst_0
    //   5280: istore #6
    //   5282: iload #6
    //   5284: iload #5
    //   5286: if_icmpge -> 5422
    //   5289: aload #4
    //   5291: iload #6
    //   5293: aaload
    //   5294: astore #7
    //   5296: aload #7
    //   5298: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5301: pop
    //   5302: aload #7
    //   5304: invokevirtual getModifiers : ()I
    //   5307: invokestatic isStatic : (I)Z
    //   5310: ifeq -> 5408
    //   5313: aload #7
    //   5315: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5318: arraylength
    //   5319: iconst_2
    //   5320: if_icmpne -> 5408
    //   5323: goto -> 5330
    //   5326: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5329: athrow
    //   5330: aload #7
    //   5332: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5335: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   5338: if_acmpne -> 5408
    //   5341: goto -> 5348
    //   5344: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5347: athrow
    //   5348: aload #7
    //   5350: iconst_1
    //   5351: invokevirtual setAccessible : (Z)V
    //   5354: aload #7
    //   5356: aconst_null
    //   5357: iconst_2
    //   5358: anewarray java/lang/Object
    //   5361: dup
    //   5362: iconst_0
    //   5363: aload_0
    //   5364: aastore
    //   5365: dup
    //   5366: iconst_1
    //   5367: aload_1
    //   5368: ifnonnull -> 5386
    //   5371: goto -> 5378
    //   5374: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5377: athrow
    //   5378: aload_1
    //   5379: goto -> 5393
    //   5382: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5385: athrow
    //   5386: aload_1
    //   5387: checkcast [B
    //   5390: invokevirtual clone : ()Ljava/lang/Object;
    //   5393: aastore
    //   5394: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5397: checkcast java/lang/Boolean
    //   5400: invokevirtual booleanValue : ()Z
    //   5403: istore_3
    //   5404: iload_2
    //   5405: ifeq -> 5422
    //   5408: iinc #6, 1
    //   5411: iload_2
    //   5412: ifeq -> 5282
    //   5415: goto -> 5422
    //   5418: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5421: athrow
    //   5422: iload_3
    //   5423: ifeq -> 5428
    //   5426: iload_3
    //   5427: ireturn
    //   5428: getstatic burp/Zbxa.ZY : Ljava/lang/String;
    //   5431: getstatic burp/Zzh9.Zv : Ljava/lang/Object;
    //   5434: checkcast java/math/BigInteger
    //   5437: invokevirtual intValue : ()I
    //   5440: bipush #32
    //   5442: irem
    //   5443: invokestatic abs : (I)I
    //   5446: invokevirtual charAt : (I)C
    //   5449: getstatic burp/Zzxa.Zl : Ljava/lang/String;
    //   5452: getstatic burp/Zrh1.ZF : Ljava/lang/Object;
    //   5455: checkcast java/math/BigInteger
    //   5458: invokevirtual intValue : ()I
    //   5461: bipush #32
    //   5463: irem
    //   5464: invokestatic abs : (I)I
    //   5467: invokevirtual charAt : (I)C
    //   5470: if_icmpgt -> 5815
    //   5473: sipush #32530
    //   5476: sipush #16637
    //   5479: invokestatic a : (II)Ljava/lang/String;
    //   5482: iconst_1
    //   5483: ldc burp/Zr8r
    //   5485: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5488: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5491: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5494: astore #4
    //   5496: aload #4
    //   5498: arraylength
    //   5499: istore #5
    //   5501: iconst_0
    //   5502: istore #6
    //   5504: iload #6
    //   5506: iload #5
    //   5508: if_icmpge -> 5646
    //   5511: aload #4
    //   5513: iload #6
    //   5515: aaload
    //   5516: astore #7
    //   5518: aload #7
    //   5520: invokevirtual getModifiers : ()I
    //   5523: invokestatic isStatic : (I)Z
    //   5526: ifne -> 5536
    //   5529: goto -> 5639
    //   5532: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5535: athrow
    //   5536: aload #7
    //   5538: invokevirtual getType : ()Ljava/lang/Class;
    //   5541: astore #8
    //   5543: aload #8
    //   5545: ifnull -> 5626
    //   5548: aload #8
    //   5550: invokevirtual isPrimitive : ()Z
    //   5553: ifne -> 5626
    //   5556: goto -> 5563
    //   5559: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5562: athrow
    //   5563: aload #8
    //   5565: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5568: ifnull -> 5626
    //   5571: goto -> 5578
    //   5574: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5577: athrow
    //   5578: aload #8
    //   5580: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5583: invokevirtual getName : ()Ljava/lang/String;
    //   5586: ifnull -> 5626
    //   5589: goto -> 5596
    //   5592: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5595: athrow
    //   5596: aload #8
    //   5598: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5601: invokevirtual getName : ()Ljava/lang/String;
    //   5604: sipush #32533
    //   5607: sipush #-3421
    //   5610: invokestatic a : (II)Ljava/lang/String;
    //   5613: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5616: ifne -> 5626
    //   5619: goto -> 5626
    //   5622: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5625: athrow
    //   5626: aload #7
    //   5628: iconst_1
    //   5629: invokevirtual setAccessible : (Z)V
    //   5632: aload #7
    //   5634: aconst_null
    //   5635: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5638: pop
    //   5639: iinc #6, 1
    //   5642: iload_2
    //   5643: ifeq -> 5504
    //   5646: sipush #32542
    //   5649: sipush #13009
    //   5652: invokestatic a : (II)Ljava/lang/String;
    //   5655: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5658: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5661: astore #4
    //   5663: aload #4
    //   5665: arraylength
    //   5666: istore #5
    //   5668: iconst_0
    //   5669: istore #6
    //   5671: iload #6
    //   5673: iload #5
    //   5675: if_icmpge -> 5811
    //   5678: aload #4
    //   5680: iload #6
    //   5682: aaload
    //   5683: astore #7
    //   5685: aload #7
    //   5687: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5690: pop
    //   5691: aload #7
    //   5693: invokevirtual getModifiers : ()I
    //   5696: invokestatic isStatic : (I)Z
    //   5699: ifeq -> 5797
    //   5702: aload #7
    //   5704: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5707: arraylength
    //   5708: iconst_2
    //   5709: if_icmpne -> 5797
    //   5712: goto -> 5719
    //   5715: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5718: athrow
    //   5719: aload #7
    //   5721: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5724: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   5727: if_acmpne -> 5797
    //   5730: goto -> 5737
    //   5733: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5736: athrow
    //   5737: aload #7
    //   5739: iconst_1
    //   5740: invokevirtual setAccessible : (Z)V
    //   5743: aload #7
    //   5745: aconst_null
    //   5746: iconst_2
    //   5747: anewarray java/lang/Object
    //   5750: dup
    //   5751: iconst_0
    //   5752: aload_0
    //   5753: aastore
    //   5754: dup
    //   5755: iconst_1
    //   5756: aload_1
    //   5757: ifnonnull -> 5775
    //   5760: goto -> 5767
    //   5763: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5766: athrow
    //   5767: aload_1
    //   5768: goto -> 5782
    //   5771: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5774: athrow
    //   5775: aload_1
    //   5776: checkcast [B
    //   5779: invokevirtual clone : ()Ljava/lang/Object;
    //   5782: aastore
    //   5783: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5786: checkcast java/lang/Boolean
    //   5789: invokevirtual booleanValue : ()Z
    //   5792: istore_3
    //   5793: iload_2
    //   5794: ifeq -> 5811
    //   5797: iinc #6, 1
    //   5800: iload_2
    //   5801: ifeq -> 5671
    //   5804: goto -> 5811
    //   5807: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5810: athrow
    //   5811: iload_2
    //   5812: ifeq -> 6153
    //   5815: sipush #32520
    //   5818: sipush #-13030
    //   5821: invokestatic a : (II)Ljava/lang/String;
    //   5824: iconst_1
    //   5825: ldc burp/Zegk
    //   5827: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5830: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5833: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5836: astore #4
    //   5838: aload #4
    //   5840: arraylength
    //   5841: istore #5
    //   5843: iconst_0
    //   5844: istore #6
    //   5846: iload #6
    //   5848: iload #5
    //   5850: if_icmpge -> 5988
    //   5853: aload #4
    //   5855: iload #6
    //   5857: aaload
    //   5858: astore #7
    //   5860: aload #7
    //   5862: invokevirtual getModifiers : ()I
    //   5865: invokestatic isStatic : (I)Z
    //   5868: ifne -> 5878
    //   5871: goto -> 5981
    //   5874: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5877: athrow
    //   5878: aload #7
    //   5880: invokevirtual getType : ()Ljava/lang/Class;
    //   5883: astore #8
    //   5885: aload #8
    //   5887: ifnull -> 5968
    //   5890: aload #8
    //   5892: invokevirtual isPrimitive : ()Z
    //   5895: ifne -> 5968
    //   5898: goto -> 5905
    //   5901: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5904: athrow
    //   5905: aload #8
    //   5907: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5910: ifnull -> 5968
    //   5913: goto -> 5920
    //   5916: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5919: athrow
    //   5920: aload #8
    //   5922: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5925: invokevirtual getName : ()Ljava/lang/String;
    //   5928: ifnull -> 5968
    //   5931: goto -> 5938
    //   5934: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5937: athrow
    //   5938: aload #8
    //   5940: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5943: invokevirtual getName : ()Ljava/lang/String;
    //   5946: sipush #32533
    //   5949: sipush #-3421
    //   5952: invokestatic a : (II)Ljava/lang/String;
    //   5955: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5958: ifne -> 5968
    //   5961: goto -> 5968
    //   5964: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5967: athrow
    //   5968: aload #7
    //   5970: iconst_1
    //   5971: invokevirtual setAccessible : (Z)V
    //   5974: aload #7
    //   5976: aconst_null
    //   5977: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5980: pop
    //   5981: iinc #6, 1
    //   5984: iload_2
    //   5985: ifeq -> 5846
    //   5988: sipush #32539
    //   5991: sipush #8853
    //   5994: invokestatic a : (II)Ljava/lang/String;
    //   5997: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   6000: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   6003: astore #4
    //   6005: aload #4
    //   6007: arraylength
    //   6008: istore #5
    //   6010: iconst_0
    //   6011: istore #6
    //   6013: iload #6
    //   6015: iload #5
    //   6017: if_icmpge -> 6153
    //   6020: aload #4
    //   6022: iload #6
    //   6024: aaload
    //   6025: astore #7
    //   6027: aload #7
    //   6029: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6032: pop
    //   6033: aload #7
    //   6035: invokevirtual getModifiers : ()I
    //   6038: invokestatic isStatic : (I)Z
    //   6041: ifeq -> 6139
    //   6044: aload #7
    //   6046: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6049: arraylength
    //   6050: iconst_2
    //   6051: if_icmpne -> 6139
    //   6054: goto -> 6061
    //   6057: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6060: athrow
    //   6061: aload #7
    //   6063: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   6066: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   6069: if_acmpne -> 6139
    //   6072: goto -> 6079
    //   6075: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6078: athrow
    //   6079: aload #7
    //   6081: iconst_1
    //   6082: invokevirtual setAccessible : (Z)V
    //   6085: aload #7
    //   6087: aconst_null
    //   6088: iconst_2
    //   6089: anewarray java/lang/Object
    //   6092: dup
    //   6093: iconst_0
    //   6094: aload_0
    //   6095: aastore
    //   6096: dup
    //   6097: iconst_1
    //   6098: aload_1
    //   6099: ifnonnull -> 6117
    //   6102: goto -> 6109
    //   6105: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6108: athrow
    //   6109: aload_1
    //   6110: goto -> 6124
    //   6113: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6116: athrow
    //   6117: aload_1
    //   6118: checkcast [B
    //   6121: invokevirtual clone : ()Ljava/lang/Object;
    //   6124: aastore
    //   6125: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   6128: checkcast java/lang/Boolean
    //   6131: invokevirtual booleanValue : ()Z
    //   6134: istore_3
    //   6135: iload_2
    //   6136: ifeq -> 6153
    //   6139: iinc #6, 1
    //   6142: iload_2
    //   6143: ifeq -> 6013
    //   6146: goto -> 6153
    //   6149: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6152: athrow
    //   6153: iload_3
    //   6154: ifeq -> 6159
    //   6157: iload_3
    //   6158: ireturn
    //   6159: getstatic burp/Zrt9.Zc : Ljava/lang/String;
    //   6162: getstatic burp/Zzpj.ZI : Ljava/lang/Object;
    //   6165: checkcast java/math/BigInteger
    //   6168: invokevirtual intValue : ()I
    //   6171: bipush #32
    //   6173: irem
    //   6174: invokestatic abs : (I)I
    //   6177: invokevirtual charAt : (I)C
    //   6180: getstatic burp/Zzb2.ZJ : Ljava/lang/String;
    //   6183: getstatic burp/Zbzj.Zz : Ljava/lang/Object;
    //   6186: checkcast java/math/BigInteger
    //   6189: invokevirtual intValue : ()I
    //   6192: bipush #32
    //   6194: irem
    //   6195: invokestatic abs : (I)I
    //   6198: invokevirtual charAt : (I)C
    //   6201: if_icmple -> 6546
    //   6204: sipush #32532
    //   6207: sipush #23017
    //   6210: invokestatic a : (II)Ljava/lang/String;
    //   6213: iconst_1
    //   6214: ldc burp/Zxtn
    //   6216: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   6219: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   6222: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   6225: astore #4
    //   6227: aload #4
    //   6229: arraylength
    //   6230: istore #5
    //   6232: iconst_0
    //   6233: istore #6
    //   6235: iload #6
    //   6237: iload #5
    //   6239: if_icmpge -> 6377
    //   6242: aload #4
    //   6244: iload #6
    //   6246: aaload
    //   6247: astore #7
    //   6249: aload #7
    //   6251: invokevirtual getModifiers : ()I
    //   6254: invokestatic isStatic : (I)Z
    //   6257: ifne -> 6267
    //   6260: goto -> 6370
    //   6263: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6266: athrow
    //   6267: aload #7
    //   6269: invokevirtual getType : ()Ljava/lang/Class;
    //   6272: astore #8
    //   6274: aload #8
    //   6276: ifnull -> 6357
    //   6279: aload #8
    //   6281: invokevirtual isPrimitive : ()Z
    //   6284: ifne -> 6357
    //   6287: goto -> 6294
    //   6290: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6293: athrow
    //   6294: aload #8
    //   6296: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6299: ifnull -> 6357
    //   6302: goto -> 6309
    //   6305: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6308: athrow
    //   6309: aload #8
    //   6311: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6314: invokevirtual getName : ()Ljava/lang/String;
    //   6317: ifnull -> 6357
    //   6320: goto -> 6327
    //   6323: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6326: athrow
    //   6327: aload #8
    //   6329: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6332: invokevirtual getName : ()Ljava/lang/String;
    //   6335: sipush #32533
    //   6338: sipush #-3421
    //   6341: invokestatic a : (II)Ljava/lang/String;
    //   6344: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   6347: ifne -> 6357
    //   6350: goto -> 6357
    //   6353: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6356: athrow
    //   6357: aload #7
    //   6359: iconst_1
    //   6360: invokevirtual setAccessible : (Z)V
    //   6363: aload #7
    //   6365: aconst_null
    //   6366: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   6369: pop
    //   6370: iinc #6, 1
    //   6373: iload_2
    //   6374: ifeq -> 6235
    //   6377: sipush #32543
    //   6380: sipush #-31448
    //   6383: invokestatic a : (II)Ljava/lang/String;
    //   6386: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   6389: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   6392: astore #4
    //   6394: aload #4
    //   6396: arraylength
    //   6397: istore #5
    //   6399: iconst_0
    //   6400: istore #6
    //   6402: iload #6
    //   6404: iload #5
    //   6406: if_icmpge -> 6542
    //   6409: aload #4
    //   6411: iload #6
    //   6413: aaload
    //   6414: astore #7
    //   6416: aload #7
    //   6418: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6421: pop
    //   6422: aload #7
    //   6424: invokevirtual getModifiers : ()I
    //   6427: invokestatic isStatic : (I)Z
    //   6430: ifeq -> 6528
    //   6433: aload #7
    //   6435: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6438: arraylength
    //   6439: iconst_2
    //   6440: if_icmpne -> 6528
    //   6443: goto -> 6450
    //   6446: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6449: athrow
    //   6450: aload #7
    //   6452: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   6455: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   6458: if_acmpne -> 6528
    //   6461: goto -> 6468
    //   6464: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6467: athrow
    //   6468: aload #7
    //   6470: iconst_1
    //   6471: invokevirtual setAccessible : (Z)V
    //   6474: aload #7
    //   6476: aconst_null
    //   6477: iconst_2
    //   6478: anewarray java/lang/Object
    //   6481: dup
    //   6482: iconst_0
    //   6483: aload_0
    //   6484: aastore
    //   6485: dup
    //   6486: iconst_1
    //   6487: aload_1
    //   6488: ifnonnull -> 6506
    //   6491: goto -> 6498
    //   6494: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6497: athrow
    //   6498: aload_1
    //   6499: goto -> 6513
    //   6502: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6505: athrow
    //   6506: aload_1
    //   6507: checkcast [B
    //   6510: invokevirtual clone : ()Ljava/lang/Object;
    //   6513: aastore
    //   6514: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   6517: checkcast java/lang/Boolean
    //   6520: invokevirtual booleanValue : ()Z
    //   6523: istore_3
    //   6524: iload_2
    //   6525: ifeq -> 6542
    //   6528: iinc #6, 1
    //   6531: iload_2
    //   6532: ifeq -> 6402
    //   6535: goto -> 6542
    //   6538: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6541: athrow
    //   6542: iload_2
    //   6543: ifeq -> 6884
    //   6546: sipush #32521
    //   6549: sipush #12851
    //   6552: invokestatic a : (II)Ljava/lang/String;
    //   6555: iconst_1
    //   6556: ldc burp/Zro2
    //   6558: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   6561: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   6564: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   6567: astore #4
    //   6569: aload #4
    //   6571: arraylength
    //   6572: istore #5
    //   6574: iconst_0
    //   6575: istore #6
    //   6577: iload #6
    //   6579: iload #5
    //   6581: if_icmpge -> 6719
    //   6584: aload #4
    //   6586: iload #6
    //   6588: aaload
    //   6589: astore #7
    //   6591: aload #7
    //   6593: invokevirtual getModifiers : ()I
    //   6596: invokestatic isStatic : (I)Z
    //   6599: ifne -> 6609
    //   6602: goto -> 6712
    //   6605: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6608: athrow
    //   6609: aload #7
    //   6611: invokevirtual getType : ()Ljava/lang/Class;
    //   6614: astore #8
    //   6616: aload #8
    //   6618: ifnull -> 6699
    //   6621: aload #8
    //   6623: invokevirtual isPrimitive : ()Z
    //   6626: ifne -> 6699
    //   6629: goto -> 6636
    //   6632: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6635: athrow
    //   6636: aload #8
    //   6638: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6641: ifnull -> 6699
    //   6644: goto -> 6651
    //   6647: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6650: athrow
    //   6651: aload #8
    //   6653: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6656: invokevirtual getName : ()Ljava/lang/String;
    //   6659: ifnull -> 6699
    //   6662: goto -> 6669
    //   6665: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6668: athrow
    //   6669: aload #8
    //   6671: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6674: invokevirtual getName : ()Ljava/lang/String;
    //   6677: sipush #32533
    //   6680: sipush #-3421
    //   6683: invokestatic a : (II)Ljava/lang/String;
    //   6686: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   6689: ifne -> 6699
    //   6692: goto -> 6699
    //   6695: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6698: athrow
    //   6699: aload #7
    //   6701: iconst_1
    //   6702: invokevirtual setAccessible : (Z)V
    //   6705: aload #7
    //   6707: aconst_null
    //   6708: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   6711: pop
    //   6712: iinc #6, 1
    //   6715: iload_2
    //   6716: ifeq -> 6577
    //   6719: sipush #32540
    //   6722: sipush #-29999
    //   6725: invokestatic a : (II)Ljava/lang/String;
    //   6728: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   6731: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   6734: astore #4
    //   6736: aload #4
    //   6738: arraylength
    //   6739: istore #5
    //   6741: iconst_0
    //   6742: istore #6
    //   6744: iload #6
    //   6746: iload #5
    //   6748: if_icmpge -> 6884
    //   6751: aload #4
    //   6753: iload #6
    //   6755: aaload
    //   6756: astore #7
    //   6758: aload #7
    //   6760: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6763: pop
    //   6764: aload #7
    //   6766: invokevirtual getModifiers : ()I
    //   6769: invokestatic isStatic : (I)Z
    //   6772: ifeq -> 6870
    //   6775: aload #7
    //   6777: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6780: arraylength
    //   6781: iconst_2
    //   6782: if_icmpne -> 6870
    //   6785: goto -> 6792
    //   6788: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6791: athrow
    //   6792: aload #7
    //   6794: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   6797: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   6800: if_acmpne -> 6870
    //   6803: goto -> 6810
    //   6806: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6809: athrow
    //   6810: aload #7
    //   6812: iconst_1
    //   6813: invokevirtual setAccessible : (Z)V
    //   6816: aload #7
    //   6818: aconst_null
    //   6819: iconst_2
    //   6820: anewarray java/lang/Object
    //   6823: dup
    //   6824: iconst_0
    //   6825: aload_0
    //   6826: aastore
    //   6827: dup
    //   6828: iconst_1
    //   6829: aload_1
    //   6830: ifnonnull -> 6848
    //   6833: goto -> 6840
    //   6836: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6839: athrow
    //   6840: aload_1
    //   6841: goto -> 6855
    //   6844: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6847: athrow
    //   6848: aload_1
    //   6849: checkcast [B
    //   6852: invokevirtual clone : ()Ljava/lang/Object;
    //   6855: aastore
    //   6856: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   6859: checkcast java/lang/Boolean
    //   6862: invokevirtual booleanValue : ()Z
    //   6865: istore_3
    //   6866: iload_2
    //   6867: ifeq -> 6884
    //   6870: iinc #6, 1
    //   6873: iload_2
    //   6874: ifeq -> 6744
    //   6877: goto -> 6884
    //   6880: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6883: athrow
    //   6884: iload_3
    //   6885: ifeq -> 6890
    //   6888: iload_3
    //   6889: ireturn
    //   6890: getstatic burp/Zzhu.ZT : Ljava/lang/String;
    //   6893: getstatic burp/Zlvx.ZM : Ljava/lang/Object;
    //   6896: checkcast java/math/BigInteger
    //   6899: invokevirtual intValue : ()I
    //   6902: bipush #32
    //   6904: irem
    //   6905: invokestatic abs : (I)I
    //   6908: invokevirtual charAt : (I)C
    //   6911: getstatic burp/Zmdm.Za : Ljava/lang/String;
    //   6914: getstatic burp/Ztc2.ZM : Ljava/lang/Object;
    //   6917: checkcast java/math/BigInteger
    //   6920: invokevirtual intValue : ()I
    //   6923: bipush #32
    //   6925: irem
    //   6926: invokestatic abs : (I)I
    //   6929: invokevirtual charAt : (I)C
    //   6932: if_icmpgt -> 7277
    //   6935: sipush #32528
    //   6938: sipush #-19163
    //   6941: invokestatic a : (II)Ljava/lang/String;
    //   6944: iconst_1
    //   6945: ldc burp/Ztdt
    //   6947: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   6950: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   6953: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   6956: astore #4
    //   6958: aload #4
    //   6960: arraylength
    //   6961: istore #5
    //   6963: iconst_0
    //   6964: istore #6
    //   6966: iload #6
    //   6968: iload #5
    //   6970: if_icmpge -> 7108
    //   6973: aload #4
    //   6975: iload #6
    //   6977: aaload
    //   6978: astore #7
    //   6980: aload #7
    //   6982: invokevirtual getModifiers : ()I
    //   6985: invokestatic isStatic : (I)Z
    //   6988: ifne -> 6998
    //   6991: goto -> 7101
    //   6994: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6997: athrow
    //   6998: aload #7
    //   7000: invokevirtual getType : ()Ljava/lang/Class;
    //   7003: astore #8
    //   7005: aload #8
    //   7007: ifnull -> 7088
    //   7010: aload #8
    //   7012: invokevirtual isPrimitive : ()Z
    //   7015: ifne -> 7088
    //   7018: goto -> 7025
    //   7021: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7024: athrow
    //   7025: aload #8
    //   7027: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7030: ifnull -> 7088
    //   7033: goto -> 7040
    //   7036: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7039: athrow
    //   7040: aload #8
    //   7042: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7045: invokevirtual getName : ()Ljava/lang/String;
    //   7048: ifnull -> 7088
    //   7051: goto -> 7058
    //   7054: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7057: athrow
    //   7058: aload #8
    //   7060: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7063: invokevirtual getName : ()Ljava/lang/String;
    //   7066: sipush #32533
    //   7069: sipush #-3421
    //   7072: invokestatic a : (II)Ljava/lang/String;
    //   7075: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   7078: ifne -> 7088
    //   7081: goto -> 7088
    //   7084: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7087: athrow
    //   7088: aload #7
    //   7090: iconst_1
    //   7091: invokevirtual setAccessible : (Z)V
    //   7094: aload #7
    //   7096: aconst_null
    //   7097: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   7100: pop
    //   7101: iinc #6, 1
    //   7104: iload_2
    //   7105: ifeq -> 6966
    //   7108: sipush #32527
    //   7111: sipush #13580
    //   7114: invokestatic a : (II)Ljava/lang/String;
    //   7117: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   7120: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   7123: astore #4
    //   7125: aload #4
    //   7127: arraylength
    //   7128: istore #5
    //   7130: iconst_0
    //   7131: istore #6
    //   7133: iload #6
    //   7135: iload #5
    //   7137: if_icmpge -> 7273
    //   7140: aload #4
    //   7142: iload #6
    //   7144: aaload
    //   7145: astore #7
    //   7147: aload #7
    //   7149: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   7152: pop
    //   7153: aload #7
    //   7155: invokevirtual getModifiers : ()I
    //   7158: invokestatic isStatic : (I)Z
    //   7161: ifeq -> 7259
    //   7164: aload #7
    //   7166: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   7169: arraylength
    //   7170: iconst_2
    //   7171: if_icmpne -> 7259
    //   7174: goto -> 7181
    //   7177: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7180: athrow
    //   7181: aload #7
    //   7183: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   7186: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   7189: if_acmpne -> 7259
    //   7192: goto -> 7199
    //   7195: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7198: athrow
    //   7199: aload #7
    //   7201: iconst_1
    //   7202: invokevirtual setAccessible : (Z)V
    //   7205: aload #7
    //   7207: aconst_null
    //   7208: iconst_2
    //   7209: anewarray java/lang/Object
    //   7212: dup
    //   7213: iconst_0
    //   7214: aload_0
    //   7215: aastore
    //   7216: dup
    //   7217: iconst_1
    //   7218: aload_1
    //   7219: ifnonnull -> 7237
    //   7222: goto -> 7229
    //   7225: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7228: athrow
    //   7229: aload_1
    //   7230: goto -> 7244
    //   7233: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7236: athrow
    //   7237: aload_1
    //   7238: checkcast [B
    //   7241: invokevirtual clone : ()Ljava/lang/Object;
    //   7244: aastore
    //   7245: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   7248: checkcast java/lang/Boolean
    //   7251: invokevirtual booleanValue : ()Z
    //   7254: istore_3
    //   7255: iload_2
    //   7256: ifeq -> 7273
    //   7259: iinc #6, 1
    //   7262: iload_2
    //   7263: ifeq -> 7133
    //   7266: goto -> 7273
    //   7269: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7272: athrow
    //   7273: iload_2
    //   7274: ifeq -> 7615
    //   7277: sipush #32513
    //   7280: sipush #23713
    //   7283: invokestatic a : (II)Ljava/lang/String;
    //   7286: iconst_1
    //   7287: ldc burp/Zblv
    //   7289: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   7292: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   7295: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   7298: astore #4
    //   7300: aload #4
    //   7302: arraylength
    //   7303: istore #5
    //   7305: iconst_0
    //   7306: istore #6
    //   7308: iload #6
    //   7310: iload #5
    //   7312: if_icmpge -> 7450
    //   7315: aload #4
    //   7317: iload #6
    //   7319: aaload
    //   7320: astore #7
    //   7322: aload #7
    //   7324: invokevirtual getModifiers : ()I
    //   7327: invokestatic isStatic : (I)Z
    //   7330: ifne -> 7340
    //   7333: goto -> 7443
    //   7336: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7339: athrow
    //   7340: aload #7
    //   7342: invokevirtual getType : ()Ljava/lang/Class;
    //   7345: astore #8
    //   7347: aload #8
    //   7349: ifnull -> 7430
    //   7352: aload #8
    //   7354: invokevirtual isPrimitive : ()Z
    //   7357: ifne -> 7430
    //   7360: goto -> 7367
    //   7363: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7366: athrow
    //   7367: aload #8
    //   7369: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7372: ifnull -> 7430
    //   7375: goto -> 7382
    //   7378: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7381: athrow
    //   7382: aload #8
    //   7384: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7387: invokevirtual getName : ()Ljava/lang/String;
    //   7390: ifnull -> 7430
    //   7393: goto -> 7400
    //   7396: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7399: athrow
    //   7400: aload #8
    //   7402: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7405: invokevirtual getName : ()Ljava/lang/String;
    //   7408: sipush #32533
    //   7411: sipush #-3421
    //   7414: invokestatic a : (II)Ljava/lang/String;
    //   7417: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   7420: ifne -> 7430
    //   7423: goto -> 7430
    //   7426: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7429: athrow
    //   7430: aload #7
    //   7432: iconst_1
    //   7433: invokevirtual setAccessible : (Z)V
    //   7436: aload #7
    //   7438: aconst_null
    //   7439: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   7442: pop
    //   7443: iinc #6, 1
    //   7446: iload_2
    //   7447: ifeq -> 7308
    //   7450: sipush #32524
    //   7453: sipush #-25005
    //   7456: invokestatic a : (II)Ljava/lang/String;
    //   7459: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   7462: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   7465: astore #4
    //   7467: aload #4
    //   7469: arraylength
    //   7470: istore #5
    //   7472: iconst_0
    //   7473: istore #6
    //   7475: iload #6
    //   7477: iload #5
    //   7479: if_icmpge -> 7615
    //   7482: aload #4
    //   7484: iload #6
    //   7486: aaload
    //   7487: astore #7
    //   7489: aload #7
    //   7491: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   7494: pop
    //   7495: aload #7
    //   7497: invokevirtual getModifiers : ()I
    //   7500: invokestatic isStatic : (I)Z
    //   7503: ifeq -> 7601
    //   7506: aload #7
    //   7508: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   7511: arraylength
    //   7512: iconst_2
    //   7513: if_icmpne -> 7601
    //   7516: goto -> 7523
    //   7519: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7522: athrow
    //   7523: aload #7
    //   7525: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   7528: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   7531: if_acmpne -> 7601
    //   7534: goto -> 7541
    //   7537: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7540: athrow
    //   7541: aload #7
    //   7543: iconst_1
    //   7544: invokevirtual setAccessible : (Z)V
    //   7547: aload #7
    //   7549: aconst_null
    //   7550: iconst_2
    //   7551: anewarray java/lang/Object
    //   7554: dup
    //   7555: iconst_0
    //   7556: aload_0
    //   7557: aastore
    //   7558: dup
    //   7559: iconst_1
    //   7560: aload_1
    //   7561: ifnonnull -> 7579
    //   7564: goto -> 7571
    //   7567: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7570: athrow
    //   7571: aload_1
    //   7572: goto -> 7586
    //   7575: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7578: athrow
    //   7579: aload_1
    //   7580: checkcast [B
    //   7583: invokevirtual clone : ()Ljava/lang/Object;
    //   7586: aastore
    //   7587: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   7590: checkcast java/lang/Boolean
    //   7593: invokevirtual booleanValue : ()Z
    //   7596: istore_3
    //   7597: iload_2
    //   7598: ifeq -> 7615
    //   7601: iinc #6, 1
    //   7604: iload_2
    //   7605: ifeq -> 7475
    //   7608: goto -> 7615
    //   7611: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7614: athrow
    //   7615: iload_3
    //   7616: ireturn
    //   7617: astore_3
    //   7618: new java/lang/Exception
    //   7621: dup
    //   7622: aload_3
    //   7623: invokevirtual getMessage : ()Ljava/lang/String;
    //   7626: invokespecial <init> : (Ljava/lang/String;)V
    //   7629: athrow
    // Exception table:
    //   from	to	target	type
    //   4	5427	7617	java/lang/Throwable
    //   3306	3331	3331	java/lang/Throwable
    //   4294	4320	4320	java/lang/Throwable
    //   4409	4423	4423	java/lang/Throwable
    //   4434	4447	4450	java/lang/Throwable
    //   4439	4462	4465	java/lang/Throwable
    //   4454	4480	4483	java/lang/Throwable
    //   4469	4510	4513	java/lang/Throwable
    //   4573	4600	4603	java/lang/Throwable
    //   4590	4621	4624	java/lang/Throwable
    //   4607	4651	4654	java/lang/Throwable
    //   4628	4662	4662	java/lang/Throwable
    //   4673	4689	4692	java/lang/Throwable
    //   4788	4802	4802	java/lang/Throwable
    //   4813	4826	4829	java/lang/Throwable
    //   4818	4841	4844	java/lang/Throwable
    //   4833	4859	4862	java/lang/Throwable
    //   4848	4889	4892	java/lang/Throwable
    //   4955	4982	4985	java/lang/Throwable
    //   4972	5000	5003	java/lang/Throwable
    //   4989	5030	5033	java/lang/Throwable
    //   5007	5041	5041	java/lang/Throwable
    //   5063	5074	5077	java/lang/Throwable
    //   5129	5143	5143	java/lang/Throwable
    //   5154	5167	5170	java/lang/Throwable
    //   5159	5182	5185	java/lang/Throwable
    //   5174	5200	5203	java/lang/Throwable
    //   5189	5230	5233	java/lang/Throwable
    //   5296	5323	5326	java/lang/Throwable
    //   5313	5341	5344	java/lang/Throwable
    //   5330	5371	5374	java/lang/Throwable
    //   5348	5382	5382	java/lang/Throwable
    //   5404	5415	5418	java/lang/Throwable
    //   5428	6158	7617	java/lang/Throwable
    //   5518	5532	5532	java/lang/Throwable
    //   5543	5556	5559	java/lang/Throwable
    //   5548	5571	5574	java/lang/Throwable
    //   5563	5589	5592	java/lang/Throwable
    //   5578	5619	5622	java/lang/Throwable
    //   5685	5712	5715	java/lang/Throwable
    //   5702	5730	5733	java/lang/Throwable
    //   5719	5760	5763	java/lang/Throwable
    //   5737	5771	5771	java/lang/Throwable
    //   5793	5804	5807	java/lang/Throwable
    //   5860	5874	5874	java/lang/Throwable
    //   5885	5898	5901	java/lang/Throwable
    //   5890	5913	5916	java/lang/Throwable
    //   5905	5931	5934	java/lang/Throwable
    //   5920	5961	5964	java/lang/Throwable
    //   6027	6054	6057	java/lang/Throwable
    //   6044	6072	6075	java/lang/Throwable
    //   6061	6102	6105	java/lang/Throwable
    //   6079	6113	6113	java/lang/Throwable
    //   6135	6146	6149	java/lang/Throwable
    //   6159	6889	7617	java/lang/Throwable
    //   6249	6263	6263	java/lang/Throwable
    //   6274	6287	6290	java/lang/Throwable
    //   6279	6302	6305	java/lang/Throwable
    //   6294	6320	6323	java/lang/Throwable
    //   6309	6350	6353	java/lang/Throwable
    //   6416	6443	6446	java/lang/Throwable
    //   6433	6461	6464	java/lang/Throwable
    //   6450	6491	6494	java/lang/Throwable
    //   6468	6502	6502	java/lang/Throwable
    //   6524	6535	6538	java/lang/Throwable
    //   6591	6605	6605	java/lang/Throwable
    //   6616	6629	6632	java/lang/Throwable
    //   6621	6644	6647	java/lang/Throwable
    //   6636	6662	6665	java/lang/Throwable
    //   6651	6692	6695	java/lang/Throwable
    //   6758	6785	6788	java/lang/Throwable
    //   6775	6803	6806	java/lang/Throwable
    //   6792	6833	6836	java/lang/Throwable
    //   6810	6844	6844	java/lang/Throwable
    //   6866	6877	6880	java/lang/Throwable
    //   6890	7616	7617	java/lang/Throwable
    //   6980	6994	6994	java/lang/Throwable
    //   7005	7018	7021	java/lang/Throwable
    //   7010	7033	7036	java/lang/Throwable
    //   7025	7051	7054	java/lang/Throwable
    //   7040	7081	7084	java/lang/Throwable
    //   7147	7174	7177	java/lang/Throwable
    //   7164	7192	7195	java/lang/Throwable
    //   7181	7222	7225	java/lang/Throwable
    //   7199	7233	7233	java/lang/Throwable
    //   7255	7266	7269	java/lang/Throwable
    //   7322	7336	7336	java/lang/Throwable
    //   7347	7360	7363	java/lang/Throwable
    //   7352	7375	7378	java/lang/Throwable
    //   7367	7393	7396	java/lang/Throwable
    //   7382	7423	7426	java/lang/Throwable
    //   7489	7516	7519	java/lang/Throwable
    //   7506	7534	7537	java/lang/Throwable
    //   7523	7564	7567	java/lang/Throwable
    //   7541	7575	7575	java/lang/Throwable
    //   7597	7608	7611	java/lang/Throwable
  }
  
  static void ZF(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #26
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'V\\f²ÁéúTàµË\3còâö'0àSK#efÇ©T¨Ç÷?ÓLê\\r¸@H\\tí¿ä9¯\\tÀ\\tNë³!X_é©\\b í]s@c²\\tKm0c5B×¢ä\\t ]|¡}Þ\\tÐCí[ÍB\\bq÷w0Ý(Ýº\\tõìçSÏDF\\teb bj¦ø\\trp>w0ï\\t"¤ZexLl×£3Q\\rO\\rtìlZ àuò®L%\\t¼ëÎ³êX,á\\tt×-ÉI\\b±oÝÞ«\\bMgÂ°2îxLh­ÈEà!\\bµè?'WàÅÔFF±\\tÖ4¢½mqo½Tqàhë'èø¾ôÝwî6CÔûNM³ïë?mØÀx¹"õ.²ôç\\n\\råÎØvÃÏ=Hí{©5;\\nÃbm1pnÌÁ©¸íò×^ÞôF.iáè@#CéA­±J9í¬I\\tW³E­ÆN` R×!¨xBú2H;'©=!'ç¾!ß6î/ÏXÚõ\\t2ÝÐtE:\\b\\bEXf8âaã'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #32
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #49
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 142
    //   40: aload #5
    //   42: swap
    //   43: iload_3
    //   44: iinc #3, 1
    //   47: swap
    //   48: aastore
    //   49: iload_0
    //   50: iload_1
    //   51: iadd
    //   52: dup
    //   53: istore_0
    //   54: iload #4
    //   56: if_icmpge -> 68
    //   59: aload_2
    //   60: iload_0
    //   61: invokevirtual charAt : (I)C
    //   64: istore_1
    //   65: goto -> 23
    //   68: ldc 'Éü\\tÏ<(°àm'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_4
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #103
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
    //   128: putstatic burp/Zzhu.a : [Ljava/lang/String;
    //   131: bipush #26
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zzhu.b : [Ljava/lang/String;
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
    //   212: bipush #66
    //   214: goto -> 244
    //   217: bipush #67
    //   219: goto -> 244
    //   222: bipush #90
    //   224: goto -> 244
    //   227: bipush #26
    //   229: goto -> 244
    //   232: bipush #125
    //   234: goto -> 244
    //   237: bipush #94
    //   239: goto -> 244
    //   242: bipush #79
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
    //   283: tableswitch default -> 40, 0 -> 98
    //   300: sipush #32536
    //   303: sipush #-13183
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zzhu.ZT : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: sipush #32522
    //   319: sipush #25146
    //   322: invokestatic a : (II)Ljava/lang/String;
    //   325: invokespecial <init> : (Ljava/lang/String;)V
    //   328: putstatic burp/Zzhu.ZW : Ljava/lang/Object;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x7F18) & 0xFFFF;
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
      char c = '§';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzhu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */