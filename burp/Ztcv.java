package burp;

import java.math.BigInteger;

class Ztcv extends ClassLoader {
  static String Zl;
  
  static Object ZY;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZB(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean ZR(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: sipush #-26369
    //   7: sipush #-10031
    //   10: invokestatic a : (II)Ljava/lang/String;
    //   13: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   16: invokestatic ZW : (Ljava/lang/Object;)V
    //   19: getstatic burp/Ztj5.Zj : Ljava/lang/Object;
    //   22: checkcast java/math/BigInteger
    //   25: invokevirtual toByteArray : ()[B
    //   28: astore_3
    //   29: aload_3
    //   30: arraylength
    //   31: bipush #8
    //   33: iadd
    //   34: bipush #6
    //   36: ishr
    //   37: iconst_1
    //   38: iadd
    //   39: bipush #16
    //   41: imul
    //   42: newarray int
    //   44: astore #5
    //   46: iconst_0
    //   47: istore #6
    //   49: iload #6
    //   51: aload_3
    //   52: arraylength
    //   53: if_icmpge -> 96
    //   56: aload_3
    //   57: iload #6
    //   59: baload
    //   60: sipush #255
    //   63: iand
    //   64: istore #7
    //   66: aload #5
    //   68: iload #6
    //   70: iconst_2
    //   71: ishr
    //   72: dup2
    //   73: iaload
    //   74: iload #7
    //   76: bipush #24
    //   78: iload #6
    //   80: iconst_4
    //   81: irem
    //   82: bipush #8
    //   84: imul
    //   85: isub
    //   86: ishl
    //   87: ior
    //   88: iastore
    //   89: iinc #6, 1
    //   92: iload_2
    //   93: ifne -> 49
    //   96: aload #5
    //   98: iload #6
    //   100: iconst_2
    //   101: ishr
    //   102: dup2
    //   103: iaload
    //   104: sipush #128
    //   107: bipush #24
    //   109: iload #6
    //   111: iconst_4
    //   112: irem
    //   113: bipush #8
    //   115: imul
    //   116: isub
    //   117: ishl
    //   118: ior
    //   119: iastore
    //   120: aload #5
    //   122: aload #5
    //   124: arraylength
    //   125: iconst_1
    //   126: isub
    //   127: aload_3
    //   128: arraylength
    //   129: bipush #8
    //   131: imul
    //   132: iastore
    //   133: bipush #80
    //   135: newarray int
    //   137: astore #7
    //   139: ldc 1732584193
    //   141: istore #8
    //   143: ldc -271733879
    //   145: istore #9
    //   147: ldc -1732584194
    //   149: istore #10
    //   151: ldc 271733878
    //   153: istore #11
    //   155: ldc -1009589776
    //   157: istore #12
    //   159: iconst_0
    //   160: istore #6
    //   162: iload #6
    //   164: aload #5
    //   166: arraylength
    //   167: if_icmpge -> 489
    //   170: iload #8
    //   172: istore #13
    //   174: iload #9
    //   176: istore #14
    //   178: iload #10
    //   180: istore #15
    //   182: iload #11
    //   184: istore #16
    //   186: iload #12
    //   188: istore #17
    //   190: iconst_0
    //   191: istore #18
    //   193: iload #18
    //   195: bipush #80
    //   197: if_icmpge -> 447
    //   200: iload #18
    //   202: bipush #16
    //   204: if_icmpge -> 231
    //   207: aload #7
    //   209: iload #18
    //   211: aload #5
    //   213: iload #6
    //   215: iload #18
    //   217: iadd
    //   218: iaload
    //   219: iastore
    //   220: iload_2
    //   221: ifne -> 286
    //   224: goto -> 231
    //   227: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   230: athrow
    //   231: aload #7
    //   233: iload #18
    //   235: iconst_3
    //   236: isub
    //   237: iaload
    //   238: aload #7
    //   240: iload #18
    //   242: bipush #8
    //   244: isub
    //   245: iaload
    //   246: ixor
    //   247: aload #7
    //   249: iload #18
    //   251: bipush #14
    //   253: isub
    //   254: iaload
    //   255: ixor
    //   256: aload #7
    //   258: iload #18
    //   260: bipush #16
    //   262: isub
    //   263: iaload
    //   264: ixor
    //   265: istore #19
    //   267: iload #19
    //   269: iconst_1
    //   270: ishl
    //   271: iload #19
    //   273: bipush #31
    //   275: iushr
    //   276: ior
    //   277: istore #20
    //   279: aload #7
    //   281: iload #18
    //   283: iload #20
    //   285: iastore
    //   286: iload #8
    //   288: iconst_5
    //   289: ishl
    //   290: iload #8
    //   292: bipush #27
    //   294: iushr
    //   295: ior
    //   296: istore #19
    //   298: iload #19
    //   300: iload #12
    //   302: iadd
    //   303: aload #7
    //   305: iload #18
    //   307: iaload
    //   308: iadd
    //   309: iload #18
    //   311: bipush #20
    //   313: if_icmpge -> 339
    //   316: ldc 1518500249
    //   318: iload #9
    //   320: iload #10
    //   322: iand
    //   323: iload #9
    //   325: iconst_m1
    //   326: ixor
    //   327: iload #11
    //   329: iand
    //   330: ior
    //   331: iadd
    //   332: goto -> 409
    //   335: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   338: athrow
    //   339: iload #18
    //   341: bipush #40
    //   343: if_icmpge -> 364
    //   346: ldc 1859775393
    //   348: iload #9
    //   350: iload #10
    //   352: ixor
    //   353: iload #11
    //   355: ixor
    //   356: iadd
    //   357: goto -> 409
    //   360: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   363: athrow
    //   364: iload #18
    //   366: bipush #60
    //   368: if_icmpge -> 398
    //   371: ldc -1894007588
    //   373: iload #9
    //   375: iload #10
    //   377: iand
    //   378: iload #9
    //   380: iload #11
    //   382: iand
    //   383: ior
    //   384: iload #10
    //   386: iload #11
    //   388: iand
    //   389: ior
    //   390: iadd
    //   391: goto -> 409
    //   394: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   397: athrow
    //   398: ldc -899497514
    //   400: iload #9
    //   402: iload #10
    //   404: ixor
    //   405: iload #11
    //   407: ixor
    //   408: iadd
    //   409: iadd
    //   410: istore #20
    //   412: iload #11
    //   414: istore #12
    //   416: iload #10
    //   418: istore #11
    //   420: iload #9
    //   422: bipush #30
    //   424: ishl
    //   425: iload #9
    //   427: iconst_2
    //   428: iushr
    //   429: ior
    //   430: istore #10
    //   432: iload #8
    //   434: istore #9
    //   436: iload #20
    //   438: istore #8
    //   440: iinc #18, 1
    //   443: iload_2
    //   444: ifne -> 193
    //   447: iload #8
    //   449: iload #13
    //   451: iadd
    //   452: istore #8
    //   454: iload #9
    //   456: iload #14
    //   458: iadd
    //   459: istore #9
    //   461: iload #10
    //   463: iload #15
    //   465: iadd
    //   466: istore #10
    //   468: iload #11
    //   470: iload #16
    //   472: iadd
    //   473: istore #11
    //   475: iload #12
    //   477: iload #17
    //   479: iadd
    //   480: istore #12
    //   482: iinc #6, 16
    //   485: iload_2
    //   486: ifne -> 162
    //   489: iconst_5
    //   490: newarray int
    //   492: dup
    //   493: iconst_0
    //   494: iload #8
    //   496: iastore
    //   497: dup
    //   498: iconst_1
    //   499: iload #9
    //   501: iastore
    //   502: dup
    //   503: iconst_2
    //   504: iload #10
    //   506: iastore
    //   507: dup
    //   508: iconst_3
    //   509: iload #11
    //   511: iastore
    //   512: dup
    //   513: iconst_4
    //   514: iload #12
    //   516: iastore
    //   517: astore #13
    //   519: bipush #20
    //   521: newarray byte
    //   523: astore #14
    //   525: iconst_0
    //   526: istore #15
    //   528: iload #15
    //   530: bipush #20
    //   532: if_icmpge -> 573
    //   535: aload #13
    //   537: iload #15
    //   539: iconst_4
    //   540: idiv
    //   541: iaload
    //   542: istore #16
    //   544: iconst_3
    //   545: iload #15
    //   547: iconst_4
    //   548: irem
    //   549: isub
    //   550: bipush #8
    //   552: imul
    //   553: istore #17
    //   555: aload #14
    //   557: iload #15
    //   559: iload #16
    //   561: iload #17
    //   563: iushr
    //   564: i2b
    //   565: bastore
    //   566: iinc #15, 1
    //   569: iload_2
    //   570: ifne -> 528
    //   573: aload #14
    //   575: astore #4
    //   577: new java/math/BigInteger
    //   580: dup
    //   581: aload #4
    //   583: invokespecial <init> : ([B)V
    //   586: invokevirtual abs : ()Ljava/math/BigInteger;
    //   589: putstatic burp/Zm52.ZR : Ljava/lang/Object;
    //   592: getstatic burp/Zbzk.ZI : Ljava/lang/Object;
    //   595: checkcast java/math/BigInteger
    //   598: getstatic burp/Zix.ZO : Ljava/lang/Object;
    //   601: checkcast java/math/BigInteger
    //   604: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   607: putstatic burp/Zzoi.ZI : Ljava/lang/Object;
    //   610: getstatic burp/Zbzk.ZI : Ljava/lang/Object;
    //   613: checkcast java/math/BigInteger
    //   616: invokevirtual toByteArray : ()[B
    //   619: astore_3
    //   620: iconst_0
    //   621: istore #5
    //   623: iconst_0
    //   624: istore #6
    //   626: iload #6
    //   628: aload_3
    //   629: arraylength
    //   630: if_icmpge -> 775
    //   633: aload_3
    //   634: iload #6
    //   636: baload
    //   637: istore #7
    //   639: iload #7
    //   641: bipush #48
    //   643: if_icmplt -> 660
    //   646: iload #7
    //   648: bipush #57
    //   650: if_icmple -> 758
    //   653: goto -> 660
    //   656: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   659: athrow
    //   660: iload #7
    //   662: bipush #65
    //   664: if_icmplt -> 688
    //   667: goto -> 674
    //   670: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   673: athrow
    //   674: iload #7
    //   676: bipush #90
    //   678: if_icmple -> 758
    //   681: goto -> 688
    //   684: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   687: athrow
    //   688: iload #7
    //   690: bipush #97
    //   692: if_icmplt -> 716
    //   695: goto -> 702
    //   698: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   701: athrow
    //   702: iload #7
    //   704: bipush #122
    //   706: if_icmple -> 758
    //   709: goto -> 716
    //   712: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   715: athrow
    //   716: iload #7
    //   718: bipush #43
    //   720: if_icmpeq -> 758
    //   723: goto -> 730
    //   726: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   729: athrow
    //   730: iload #7
    //   732: bipush #47
    //   734: if_icmpeq -> 758
    //   737: goto -> 744
    //   740: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   743: athrow
    //   744: iload #7
    //   746: bipush #61
    //   748: if_icmpne -> 768
    //   751: goto -> 758
    //   754: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   757: athrow
    //   758: iinc #5, 1
    //   761: goto -> 768
    //   764: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   767: athrow
    //   768: iinc #6, 1
    //   771: iload_2
    //   772: ifne -> 626
    //   775: iload #5
    //   777: newarray byte
    //   779: astore #6
    //   781: iconst_0
    //   782: istore #7
    //   784: iconst_0
    //   785: istore #8
    //   787: iload #8
    //   789: aload_3
    //   790: arraylength
    //   791: if_icmpge -> 943
    //   794: aload_3
    //   795: iload #8
    //   797: baload
    //   798: istore #9
    //   800: iload #9
    //   802: bipush #48
    //   804: if_icmplt -> 821
    //   807: iload #9
    //   809: bipush #57
    //   811: if_icmple -> 919
    //   814: goto -> 821
    //   817: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   820: athrow
    //   821: iload #9
    //   823: bipush #65
    //   825: if_icmplt -> 849
    //   828: goto -> 835
    //   831: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   834: athrow
    //   835: iload #9
    //   837: bipush #90
    //   839: if_icmple -> 919
    //   842: goto -> 849
    //   845: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   848: athrow
    //   849: iload #9
    //   851: bipush #97
    //   853: if_icmplt -> 877
    //   856: goto -> 863
    //   859: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   862: athrow
    //   863: iload #9
    //   865: bipush #122
    //   867: if_icmple -> 919
    //   870: goto -> 877
    //   873: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   876: athrow
    //   877: iload #9
    //   879: bipush #43
    //   881: if_icmpeq -> 919
    //   884: goto -> 891
    //   887: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   890: athrow
    //   891: iload #9
    //   893: bipush #47
    //   895: if_icmpeq -> 919
    //   898: goto -> 905
    //   901: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   904: athrow
    //   905: iload #9
    //   907: bipush #61
    //   909: if_icmpne -> 936
    //   912: goto -> 919
    //   915: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   918: athrow
    //   919: aload #6
    //   921: iload #7
    //   923: iload #9
    //   925: bastore
    //   926: iinc #7, 1
    //   929: goto -> 936
    //   932: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   935: athrow
    //   936: iinc #8, 1
    //   939: iload_2
    //   940: ifne -> 787
    //   943: aload #6
    //   945: astore #4
    //   947: aload #4
    //   949: astore_3
    //   950: aload_3
    //   951: arraylength
    //   952: istore #5
    //   954: aload_3
    //   955: iload #5
    //   957: iconst_1
    //   958: isub
    //   959: baload
    //   960: bipush #61
    //   962: if_icmpne -> 972
    //   965: iinc #5, -1
    //   968: iload_2
    //   969: ifne -> 954
    //   972: iload #5
    //   974: aload_3
    //   975: arraylength
    //   976: iconst_4
    //   977: idiv
    //   978: isub
    //   979: newarray byte
    //   981: astore #6
    //   983: iconst_0
    //   984: istore #7
    //   986: iload #7
    //   988: aload_3
    //   989: arraylength
    //   990: if_icmpge -> 1252
    //   993: aload_3
    //   994: iload #7
    //   996: baload
    //   997: bipush #61
    //   999: if_icmpne -> 1018
    //   1002: aload_3
    //   1003: iload #7
    //   1005: iconst_0
    //   1006: bastore
    //   1007: iload_2
    //   1008: ifne -> 1245
    //   1011: goto -> 1018
    //   1014: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1017: athrow
    //   1018: aload_3
    //   1019: iload #7
    //   1021: baload
    //   1022: bipush #47
    //   1024: if_icmpne -> 1051
    //   1027: goto -> 1034
    //   1030: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1033: athrow
    //   1034: aload_3
    //   1035: iload #7
    //   1037: bipush #63
    //   1039: bastore
    //   1040: iload_2
    //   1041: ifne -> 1245
    //   1044: goto -> 1051
    //   1047: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1050: athrow
    //   1051: aload_3
    //   1052: iload #7
    //   1054: baload
    //   1055: bipush #43
    //   1057: if_icmpne -> 1084
    //   1060: goto -> 1067
    //   1063: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1066: athrow
    //   1067: aload_3
    //   1068: iload #7
    //   1070: bipush #62
    //   1072: bastore
    //   1073: iload_2
    //   1074: ifne -> 1245
    //   1077: goto -> 1084
    //   1080: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1083: athrow
    //   1084: aload_3
    //   1085: iload #7
    //   1087: baload
    //   1088: bipush #48
    //   1090: if_icmplt -> 1139
    //   1093: goto -> 1100
    //   1096: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1099: athrow
    //   1100: aload_3
    //   1101: iload #7
    //   1103: baload
    //   1104: bipush #57
    //   1106: if_icmpgt -> 1139
    //   1109: goto -> 1116
    //   1112: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1115: athrow
    //   1116: aload_3
    //   1117: iload #7
    //   1119: aload_3
    //   1120: iload #7
    //   1122: baload
    //   1123: bipush #-4
    //   1125: isub
    //   1126: i2b
    //   1127: bastore
    //   1128: iload_2
    //   1129: ifne -> 1245
    //   1132: goto -> 1139
    //   1135: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1138: athrow
    //   1139: aload_3
    //   1140: iload #7
    //   1142: baload
    //   1143: bipush #97
    //   1145: if_icmplt -> 1194
    //   1148: goto -> 1155
    //   1151: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1154: athrow
    //   1155: aload_3
    //   1156: iload #7
    //   1158: baload
    //   1159: bipush #122
    //   1161: if_icmpgt -> 1194
    //   1164: goto -> 1171
    //   1167: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1170: athrow
    //   1171: aload_3
    //   1172: iload #7
    //   1174: aload_3
    //   1175: iload #7
    //   1177: baload
    //   1178: bipush #71
    //   1180: isub
    //   1181: i2b
    //   1182: bastore
    //   1183: iload_2
    //   1184: ifne -> 1245
    //   1187: goto -> 1194
    //   1190: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1193: athrow
    //   1194: aload_3
    //   1195: iload #7
    //   1197: baload
    //   1198: bipush #65
    //   1200: if_icmplt -> 1245
    //   1203: goto -> 1210
    //   1206: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1209: athrow
    //   1210: aload_3
    //   1211: iload #7
    //   1213: baload
    //   1214: bipush #90
    //   1216: if_icmpgt -> 1245
    //   1219: goto -> 1226
    //   1222: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1225: athrow
    //   1226: aload_3
    //   1227: iload #7
    //   1229: aload_3
    //   1230: iload #7
    //   1232: baload
    //   1233: bipush #65
    //   1235: isub
    //   1236: i2b
    //   1237: bastore
    //   1238: goto -> 1245
    //   1241: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1244: athrow
    //   1245: iinc #7, 1
    //   1248: iload_2
    //   1249: ifne -> 986
    //   1252: iconst_0
    //   1253: istore #7
    //   1255: iconst_0
    //   1256: istore #8
    //   1258: iload #8
    //   1260: aload #6
    //   1262: arraylength
    //   1263: iconst_2
    //   1264: isub
    //   1265: if_icmpge -> 1368
    //   1268: aload #6
    //   1270: iload #8
    //   1272: aload_3
    //   1273: iload #7
    //   1275: baload
    //   1276: iconst_2
    //   1277: ishl
    //   1278: sipush #255
    //   1281: iand
    //   1282: aload_3
    //   1283: iload #7
    //   1285: iconst_1
    //   1286: iadd
    //   1287: baload
    //   1288: iconst_4
    //   1289: iushr
    //   1290: iconst_3
    //   1291: iand
    //   1292: ior
    //   1293: i2b
    //   1294: bastore
    //   1295: aload #6
    //   1297: iload #8
    //   1299: iconst_1
    //   1300: iadd
    //   1301: aload_3
    //   1302: iload #7
    //   1304: iconst_1
    //   1305: iadd
    //   1306: baload
    //   1307: iconst_4
    //   1308: ishl
    //   1309: sipush #255
    //   1312: iand
    //   1313: aload_3
    //   1314: iload #7
    //   1316: iconst_2
    //   1317: iadd
    //   1318: baload
    //   1319: iconst_2
    //   1320: iushr
    //   1321: bipush #15
    //   1323: iand
    //   1324: ior
    //   1325: i2b
    //   1326: bastore
    //   1327: aload #6
    //   1329: iload #8
    //   1331: iconst_2
    //   1332: iadd
    //   1333: aload_3
    //   1334: iload #7
    //   1336: iconst_2
    //   1337: iadd
    //   1338: baload
    //   1339: bipush #6
    //   1341: ishl
    //   1342: sipush #255
    //   1345: iand
    //   1346: aload_3
    //   1347: iload #7
    //   1349: iconst_3
    //   1350: iadd
    //   1351: baload
    //   1352: bipush #63
    //   1354: iand
    //   1355: ior
    //   1356: i2b
    //   1357: bastore
    //   1358: iinc #7, 4
    //   1361: iinc #8, 3
    //   1364: iload_2
    //   1365: ifne -> 1258
    //   1368: iload #8
    //   1370: aload #6
    //   1372: arraylength
    //   1373: if_icmpge -> 1410
    //   1376: aload #6
    //   1378: iload #8
    //   1380: aload_3
    //   1381: iload #7
    //   1383: baload
    //   1384: iconst_2
    //   1385: ishl
    //   1386: sipush #255
    //   1389: iand
    //   1390: aload_3
    //   1391: iload #7
    //   1393: iconst_1
    //   1394: iadd
    //   1395: baload
    //   1396: iconst_4
    //   1397: iushr
    //   1398: iconst_3
    //   1399: iand
    //   1400: ior
    //   1401: i2b
    //   1402: bastore
    //   1403: goto -> 1410
    //   1406: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1409: athrow
    //   1410: iinc #8, 1
    //   1413: iload #8
    //   1415: aload #6
    //   1417: arraylength
    //   1418: if_icmpge -> 1458
    //   1421: aload #6
    //   1423: iload #8
    //   1425: aload_3
    //   1426: iload #7
    //   1428: iconst_1
    //   1429: iadd
    //   1430: baload
    //   1431: iconst_4
    //   1432: ishl
    //   1433: sipush #255
    //   1436: iand
    //   1437: aload_3
    //   1438: iload #7
    //   1440: iconst_2
    //   1441: iadd
    //   1442: baload
    //   1443: iconst_2
    //   1444: iushr
    //   1445: bipush #15
    //   1447: iand
    //   1448: ior
    //   1449: i2b
    //   1450: bastore
    //   1451: goto -> 1458
    //   1454: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1457: athrow
    //   1458: aload #6
    //   1460: astore #4
    //   1462: sipush #-26370
    //   1465: new java/math/BigInteger
    //   1468: dup
    //   1469: aload #4
    //   1471: invokespecial <init> : ([B)V
    //   1474: invokevirtual abs : ()Ljava/math/BigInteger;
    //   1477: putstatic burp/Zl50.ZV : Ljava/lang/Object;
    //   1480: sipush #-19058
    //   1483: invokestatic a : (II)Ljava/lang/String;
    //   1486: iconst_1
    //   1487: ldc burp/Ztd6
    //   1489: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1492: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1495: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1498: astore_3
    //   1499: aload_3
    //   1500: arraylength
    //   1501: istore #4
    //   1503: iconst_0
    //   1504: istore #5
    //   1506: iload #5
    //   1508: iload #4
    //   1510: if_icmpge -> 1647
    //   1513: aload_3
    //   1514: iload #5
    //   1516: aaload
    //   1517: astore #6
    //   1519: aload #6
    //   1521: invokevirtual getModifiers : ()I
    //   1524: invokestatic isStatic : (I)Z
    //   1527: ifne -> 1537
    //   1530: goto -> 1640
    //   1533: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1536: athrow
    //   1537: aload #6
    //   1539: invokevirtual getType : ()Ljava/lang/Class;
    //   1542: astore #7
    //   1544: aload #7
    //   1546: ifnull -> 1627
    //   1549: aload #7
    //   1551: invokevirtual isPrimitive : ()Z
    //   1554: ifne -> 1627
    //   1557: goto -> 1564
    //   1560: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1563: athrow
    //   1564: aload #7
    //   1566: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1569: ifnull -> 1627
    //   1572: goto -> 1579
    //   1575: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1578: athrow
    //   1579: aload #7
    //   1581: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1584: invokevirtual getName : ()Ljava/lang/String;
    //   1587: ifnull -> 1627
    //   1590: goto -> 1597
    //   1593: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1596: athrow
    //   1597: aload #7
    //   1599: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1602: invokevirtual getName : ()Ljava/lang/String;
    //   1605: sipush #-26393
    //   1608: sipush #-23503
    //   1611: invokestatic a : (II)Ljava/lang/String;
    //   1614: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1617: ifne -> 1627
    //   1620: goto -> 1627
    //   1623: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1626: athrow
    //   1627: aload #6
    //   1629: iconst_1
    //   1630: invokevirtual setAccessible : (Z)V
    //   1633: aload #6
    //   1635: aconst_null
    //   1636: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1639: pop
    //   1640: iinc #5, 1
    //   1643: iload_2
    //   1644: ifne -> 1506
    //   1647: sipush #-26394
    //   1650: sipush #11975
    //   1653: invokestatic a : (II)Ljava/lang/String;
    //   1656: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1659: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1662: astore_3
    //   1663: aload_3
    //   1664: arraylength
    //   1665: istore #4
    //   1667: iconst_0
    //   1668: istore #5
    //   1670: iload #5
    //   1672: iload #4
    //   1674: if_icmpge -> 1806
    //   1677: aload_3
    //   1678: iload #5
    //   1680: aaload
    //   1681: astore #6
    //   1683: aload #6
    //   1685: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1688: pop
    //   1689: aload #6
    //   1691: invokevirtual getModifiers : ()I
    //   1694: invokestatic isStatic : (I)Z
    //   1697: ifeq -> 1792
    //   1700: aload #6
    //   1702: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1705: arraylength
    //   1706: iconst_2
    //   1707: if_icmpne -> 1792
    //   1710: goto -> 1717
    //   1713: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1716: athrow
    //   1717: aload #6
    //   1719: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1722: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1725: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1728: ifeq -> 1792
    //   1731: goto -> 1738
    //   1734: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1737: athrow
    //   1738: aload #6
    //   1740: iconst_1
    //   1741: invokevirtual setAccessible : (Z)V
    //   1744: aload #6
    //   1746: aconst_null
    //   1747: iconst_2
    //   1748: anewarray java/lang/Object
    //   1751: dup
    //   1752: iconst_0
    //   1753: aload_0
    //   1754: aastore
    //   1755: dup
    //   1756: iconst_1
    //   1757: aload_1
    //   1758: ifnonnull -> 1776
    //   1761: goto -> 1768
    //   1764: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1767: athrow
    //   1768: aload_1
    //   1769: goto -> 1783
    //   1772: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1775: athrow
    //   1776: aload_1
    //   1777: checkcast [B
    //   1780: invokevirtual clone : ()Ljava/lang/Object;
    //   1783: aastore
    //   1784: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1787: pop
    //   1788: iload_2
    //   1789: ifne -> 1806
    //   1792: iinc #5, 1
    //   1795: iload_2
    //   1796: ifne -> 1670
    //   1799: goto -> 1806
    //   1802: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1805: athrow
    //   1806: iconst_0
    //   1807: istore_3
    //   1808: getstatic burp/Zl06.ZL : Ljava/lang/String;
    //   1811: getstatic burp/Zlhq.Zw : Ljava/lang/Object;
    //   1814: checkcast java/math/BigInteger
    //   1817: invokevirtual intValue : ()I
    //   1820: bipush #32
    //   1822: irem
    //   1823: invokestatic abs : (I)I
    //   1826: invokevirtual charAt : (I)C
    //   1829: getstatic burp/Zrcy.Zq : Ljava/lang/String;
    //   1832: getstatic burp/Zk7e.ZW : Ljava/lang/Object;
    //   1835: checkcast java/math/BigInteger
    //   1838: invokevirtual intValue : ()I
    //   1841: bipush #32
    //   1843: irem
    //   1844: invokestatic abs : (I)I
    //   1847: invokevirtual charAt : (I)C
    //   1850: if_icmple -> 2194
    //   1853: sipush #-26399
    //   1856: sipush #28736
    //   1859: invokestatic a : (II)Ljava/lang/String;
    //   1862: iconst_1
    //   1863: ldc burp/Zkig
    //   1865: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1868: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1871: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1874: astore #4
    //   1876: aload #4
    //   1878: arraylength
    //   1879: istore #5
    //   1881: iconst_0
    //   1882: istore #6
    //   1884: iload #6
    //   1886: iload #5
    //   1888: if_icmpge -> 2026
    //   1891: aload #4
    //   1893: iload #6
    //   1895: aaload
    //   1896: astore #7
    //   1898: aload #7
    //   1900: invokevirtual getModifiers : ()I
    //   1903: invokestatic isStatic : (I)Z
    //   1906: ifne -> 1916
    //   1909: goto -> 2019
    //   1912: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1915: athrow
    //   1916: aload #7
    //   1918: invokevirtual getType : ()Ljava/lang/Class;
    //   1921: astore #8
    //   1923: aload #8
    //   1925: ifnull -> 2006
    //   1928: aload #8
    //   1930: invokevirtual isPrimitive : ()Z
    //   1933: ifne -> 2006
    //   1936: goto -> 1943
    //   1939: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1942: athrow
    //   1943: aload #8
    //   1945: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1948: ifnull -> 2006
    //   1951: goto -> 1958
    //   1954: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1957: athrow
    //   1958: aload #8
    //   1960: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1963: invokevirtual getName : ()Ljava/lang/String;
    //   1966: ifnull -> 2006
    //   1969: goto -> 1976
    //   1972: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1975: athrow
    //   1976: aload #8
    //   1978: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1981: invokevirtual getName : ()Ljava/lang/String;
    //   1984: sipush #-26389
    //   1987: sipush #24917
    //   1990: invokestatic a : (II)Ljava/lang/String;
    //   1993: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1996: ifne -> 2006
    //   1999: goto -> 2006
    //   2002: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2005: athrow
    //   2006: aload #7
    //   2008: iconst_1
    //   2009: invokevirtual setAccessible : (Z)V
    //   2012: aload #7
    //   2014: aconst_null
    //   2015: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2018: pop
    //   2019: iinc #6, 1
    //   2022: iload_2
    //   2023: ifne -> 1884
    //   2026: sipush #-26385
    //   2029: sipush #14453
    //   2032: invokestatic a : (II)Ljava/lang/String;
    //   2035: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2038: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2041: astore #4
    //   2043: aload #4
    //   2045: arraylength
    //   2046: istore #5
    //   2048: iconst_0
    //   2049: istore #6
    //   2051: iload #6
    //   2053: iload #5
    //   2055: if_icmpge -> 2191
    //   2058: aload #4
    //   2060: iload #6
    //   2062: aaload
    //   2063: astore #7
    //   2065: aload #7
    //   2067: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2070: pop
    //   2071: aload #7
    //   2073: invokevirtual getModifiers : ()I
    //   2076: invokestatic isStatic : (I)Z
    //   2079: ifeq -> 2177
    //   2082: aload #7
    //   2084: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2087: arraylength
    //   2088: iconst_2
    //   2089: if_icmpne -> 2177
    //   2092: goto -> 2099
    //   2095: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2098: athrow
    //   2099: aload #7
    //   2101: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2104: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2107: if_acmpne -> 2177
    //   2110: goto -> 2117
    //   2113: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2116: athrow
    //   2117: aload #7
    //   2119: iconst_1
    //   2120: invokevirtual setAccessible : (Z)V
    //   2123: aload #7
    //   2125: aconst_null
    //   2126: iconst_2
    //   2127: anewarray java/lang/Object
    //   2130: dup
    //   2131: iconst_0
    //   2132: aload_0
    //   2133: aastore
    //   2134: dup
    //   2135: iconst_1
    //   2136: aload_1
    //   2137: ifnonnull -> 2155
    //   2140: goto -> 2147
    //   2143: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2146: athrow
    //   2147: aload_1
    //   2148: goto -> 2162
    //   2151: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2154: athrow
    //   2155: aload_1
    //   2156: checkcast [B
    //   2159: invokevirtual clone : ()Ljava/lang/Object;
    //   2162: aastore
    //   2163: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2166: checkcast java/lang/Boolean
    //   2169: invokevirtual booleanValue : ()Z
    //   2172: istore_3
    //   2173: iload_2
    //   2174: ifne -> 2191
    //   2177: iinc #6, 1
    //   2180: iload_2
    //   2181: ifne -> 2051
    //   2184: goto -> 2191
    //   2187: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2190: athrow
    //   2191: goto -> 2532
    //   2194: sipush #-26377
    //   2197: sipush #19864
    //   2200: invokestatic a : (II)Ljava/lang/String;
    //   2203: iconst_1
    //   2204: ldc burp/Zg2z
    //   2206: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2209: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2212: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2215: astore #4
    //   2217: aload #4
    //   2219: arraylength
    //   2220: istore #5
    //   2222: iconst_0
    //   2223: istore #6
    //   2225: iload #6
    //   2227: iload #5
    //   2229: if_icmpge -> 2367
    //   2232: aload #4
    //   2234: iload #6
    //   2236: aaload
    //   2237: astore #7
    //   2239: aload #7
    //   2241: invokevirtual getModifiers : ()I
    //   2244: invokestatic isStatic : (I)Z
    //   2247: ifne -> 2257
    //   2250: goto -> 2360
    //   2253: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2256: athrow
    //   2257: aload #7
    //   2259: invokevirtual getType : ()Ljava/lang/Class;
    //   2262: astore #8
    //   2264: aload #8
    //   2266: ifnull -> 2347
    //   2269: aload #8
    //   2271: invokevirtual isPrimitive : ()Z
    //   2274: ifne -> 2347
    //   2277: goto -> 2284
    //   2280: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2283: athrow
    //   2284: aload #8
    //   2286: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2289: ifnull -> 2347
    //   2292: goto -> 2299
    //   2295: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2298: athrow
    //   2299: aload #8
    //   2301: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2304: invokevirtual getName : ()Ljava/lang/String;
    //   2307: ifnull -> 2347
    //   2310: goto -> 2317
    //   2313: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2316: athrow
    //   2317: aload #8
    //   2319: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2322: invokevirtual getName : ()Ljava/lang/String;
    //   2325: sipush #-26389
    //   2328: sipush #24917
    //   2331: invokestatic a : (II)Ljava/lang/String;
    //   2334: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2337: ifne -> 2347
    //   2340: goto -> 2347
    //   2343: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2346: athrow
    //   2347: aload #7
    //   2349: iconst_1
    //   2350: invokevirtual setAccessible : (Z)V
    //   2353: aload #7
    //   2355: aconst_null
    //   2356: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2359: pop
    //   2360: iinc #6, 1
    //   2363: iload_2
    //   2364: ifne -> 2225
    //   2367: sipush #-26398
    //   2370: sipush #27074
    //   2373: invokestatic a : (II)Ljava/lang/String;
    //   2376: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2379: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2382: astore #4
    //   2384: aload #4
    //   2386: arraylength
    //   2387: istore #5
    //   2389: iconst_0
    //   2390: istore #6
    //   2392: iload #6
    //   2394: iload #5
    //   2396: if_icmpge -> 2532
    //   2399: aload #4
    //   2401: iload #6
    //   2403: aaload
    //   2404: astore #7
    //   2406: aload #7
    //   2408: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2411: pop
    //   2412: aload #7
    //   2414: invokevirtual getModifiers : ()I
    //   2417: invokestatic isStatic : (I)Z
    //   2420: ifeq -> 2518
    //   2423: aload #7
    //   2425: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2428: arraylength
    //   2429: iconst_2
    //   2430: if_icmpne -> 2518
    //   2433: goto -> 2440
    //   2436: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2439: athrow
    //   2440: aload #7
    //   2442: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2445: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2448: if_acmpne -> 2518
    //   2451: goto -> 2458
    //   2454: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2457: athrow
    //   2458: aload #7
    //   2460: iconst_1
    //   2461: invokevirtual setAccessible : (Z)V
    //   2464: aload #7
    //   2466: aconst_null
    //   2467: iconst_2
    //   2468: anewarray java/lang/Object
    //   2471: dup
    //   2472: iconst_0
    //   2473: aload_0
    //   2474: aastore
    //   2475: dup
    //   2476: iconst_1
    //   2477: aload_1
    //   2478: ifnonnull -> 2496
    //   2481: goto -> 2488
    //   2484: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2487: athrow
    //   2488: aload_1
    //   2489: goto -> 2503
    //   2492: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2495: athrow
    //   2496: aload_1
    //   2497: checkcast [B
    //   2500: invokevirtual clone : ()Ljava/lang/Object;
    //   2503: aastore
    //   2504: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2507: checkcast java/lang/Boolean
    //   2510: invokevirtual booleanValue : ()Z
    //   2513: istore_3
    //   2514: iload_2
    //   2515: ifne -> 2532
    //   2518: iinc #6, 1
    //   2521: iload_2
    //   2522: ifne -> 2392
    //   2525: goto -> 2532
    //   2528: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2531: athrow
    //   2532: iload_3
    //   2533: ifeq -> 2538
    //   2536: iload_3
    //   2537: ireturn
    //   2538: getstatic burp/Zm4i.Zl : Ljava/lang/String;
    //   2541: getstatic burp/Zstb.ZC : Ljava/lang/Object;
    //   2544: checkcast java/math/BigInteger
    //   2547: invokevirtual intValue : ()I
    //   2550: bipush #32
    //   2552: irem
    //   2553: invokestatic abs : (I)I
    //   2556: invokevirtual charAt : (I)C
    //   2559: getstatic burp/Zzr5.Zg : Ljava/lang/String;
    //   2562: getstatic burp/Zv8c.Zx : Ljava/lang/Object;
    //   2565: checkcast java/math/BigInteger
    //   2568: invokevirtual intValue : ()I
    //   2571: bipush #32
    //   2573: irem
    //   2574: invokestatic abs : (I)I
    //   2577: invokevirtual charAt : (I)C
    //   2580: if_icmple -> 2925
    //   2583: sipush #-26388
    //   2586: sipush #9107
    //   2589: invokestatic a : (II)Ljava/lang/String;
    //   2592: iconst_1
    //   2593: ldc burp/Zg_5
    //   2595: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2598: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2601: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2604: astore #4
    //   2606: aload #4
    //   2608: arraylength
    //   2609: istore #5
    //   2611: iconst_0
    //   2612: istore #6
    //   2614: iload #6
    //   2616: iload #5
    //   2618: if_icmpge -> 2756
    //   2621: aload #4
    //   2623: iload #6
    //   2625: aaload
    //   2626: astore #7
    //   2628: aload #7
    //   2630: invokevirtual getModifiers : ()I
    //   2633: invokestatic isStatic : (I)Z
    //   2636: ifne -> 2646
    //   2639: goto -> 2749
    //   2642: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2645: athrow
    //   2646: aload #7
    //   2648: invokevirtual getType : ()Ljava/lang/Class;
    //   2651: astore #8
    //   2653: aload #8
    //   2655: ifnull -> 2736
    //   2658: aload #8
    //   2660: invokevirtual isPrimitive : ()Z
    //   2663: ifne -> 2736
    //   2666: goto -> 2673
    //   2669: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2672: athrow
    //   2673: aload #8
    //   2675: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2678: ifnull -> 2736
    //   2681: goto -> 2688
    //   2684: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2687: athrow
    //   2688: aload #8
    //   2690: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2693: invokevirtual getName : ()Ljava/lang/String;
    //   2696: ifnull -> 2736
    //   2699: goto -> 2706
    //   2702: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2705: athrow
    //   2706: aload #8
    //   2708: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2711: invokevirtual getName : ()Ljava/lang/String;
    //   2714: sipush #-26389
    //   2717: sipush #24917
    //   2720: invokestatic a : (II)Ljava/lang/String;
    //   2723: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2726: ifne -> 2736
    //   2729: goto -> 2736
    //   2732: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2735: athrow
    //   2736: aload #7
    //   2738: iconst_1
    //   2739: invokevirtual setAccessible : (Z)V
    //   2742: aload #7
    //   2744: aconst_null
    //   2745: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2748: pop
    //   2749: iinc #6, 1
    //   2752: iload_2
    //   2753: ifne -> 2614
    //   2756: sipush #-26382
    //   2759: sipush #13341
    //   2762: invokestatic a : (II)Ljava/lang/String;
    //   2765: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2768: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2771: astore #4
    //   2773: aload #4
    //   2775: arraylength
    //   2776: istore #5
    //   2778: iconst_0
    //   2779: istore #6
    //   2781: iload #6
    //   2783: iload #5
    //   2785: if_icmpge -> 2921
    //   2788: aload #4
    //   2790: iload #6
    //   2792: aaload
    //   2793: astore #7
    //   2795: aload #7
    //   2797: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2800: pop
    //   2801: aload #7
    //   2803: invokevirtual getModifiers : ()I
    //   2806: invokestatic isStatic : (I)Z
    //   2809: ifeq -> 2907
    //   2812: aload #7
    //   2814: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2817: arraylength
    //   2818: iconst_2
    //   2819: if_icmpne -> 2907
    //   2822: goto -> 2829
    //   2825: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2828: athrow
    //   2829: aload #7
    //   2831: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2834: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2837: if_acmpne -> 2907
    //   2840: goto -> 2847
    //   2843: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2846: athrow
    //   2847: aload #7
    //   2849: iconst_1
    //   2850: invokevirtual setAccessible : (Z)V
    //   2853: aload #7
    //   2855: aconst_null
    //   2856: iconst_2
    //   2857: anewarray java/lang/Object
    //   2860: dup
    //   2861: iconst_0
    //   2862: aload_0
    //   2863: aastore
    //   2864: dup
    //   2865: iconst_1
    //   2866: aload_1
    //   2867: ifnonnull -> 2885
    //   2870: goto -> 2877
    //   2873: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2876: athrow
    //   2877: aload_1
    //   2878: goto -> 2892
    //   2881: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2884: athrow
    //   2885: aload_1
    //   2886: checkcast [B
    //   2889: invokevirtual clone : ()Ljava/lang/Object;
    //   2892: aastore
    //   2893: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2896: checkcast java/lang/Boolean
    //   2899: invokevirtual booleanValue : ()Z
    //   2902: istore_3
    //   2903: iload_2
    //   2904: ifne -> 2921
    //   2907: iinc #6, 1
    //   2910: iload_2
    //   2911: ifne -> 2781
    //   2914: goto -> 2921
    //   2917: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2920: athrow
    //   2921: iload_2
    //   2922: ifne -> 3263
    //   2925: sipush #-26384
    //   2928: sipush #19360
    //   2931: invokestatic a : (II)Ljava/lang/String;
    //   2934: iconst_1
    //   2935: ldc burp/Zs5i
    //   2937: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2940: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2943: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2946: astore #4
    //   2948: aload #4
    //   2950: arraylength
    //   2951: istore #5
    //   2953: iconst_0
    //   2954: istore #6
    //   2956: iload #6
    //   2958: iload #5
    //   2960: if_icmpge -> 3098
    //   2963: aload #4
    //   2965: iload #6
    //   2967: aaload
    //   2968: astore #7
    //   2970: aload #7
    //   2972: invokevirtual getModifiers : ()I
    //   2975: invokestatic isStatic : (I)Z
    //   2978: ifne -> 2988
    //   2981: goto -> 3091
    //   2984: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2987: athrow
    //   2988: aload #7
    //   2990: invokevirtual getType : ()Ljava/lang/Class;
    //   2993: astore #8
    //   2995: aload #8
    //   2997: ifnull -> 3078
    //   3000: aload #8
    //   3002: invokevirtual isPrimitive : ()Z
    //   3005: ifne -> 3078
    //   3008: goto -> 3015
    //   3011: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3014: athrow
    //   3015: aload #8
    //   3017: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3020: ifnull -> 3078
    //   3023: goto -> 3030
    //   3026: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3029: athrow
    //   3030: aload #8
    //   3032: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3035: invokevirtual getName : ()Ljava/lang/String;
    //   3038: ifnull -> 3078
    //   3041: goto -> 3048
    //   3044: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3047: athrow
    //   3048: aload #8
    //   3050: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3053: invokevirtual getName : ()Ljava/lang/String;
    //   3056: sipush #-26389
    //   3059: sipush #24917
    //   3062: invokestatic a : (II)Ljava/lang/String;
    //   3065: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3068: ifne -> 3078
    //   3071: goto -> 3078
    //   3074: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3077: athrow
    //   3078: aload #7
    //   3080: iconst_1
    //   3081: invokevirtual setAccessible : (Z)V
    //   3084: aload #7
    //   3086: aconst_null
    //   3087: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3090: pop
    //   3091: iinc #6, 1
    //   3094: iload_2
    //   3095: ifne -> 2956
    //   3098: sipush #-26386
    //   3101: sipush #18535
    //   3104: invokestatic a : (II)Ljava/lang/String;
    //   3107: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3110: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3113: astore #4
    //   3115: aload #4
    //   3117: arraylength
    //   3118: istore #5
    //   3120: iconst_0
    //   3121: istore #6
    //   3123: iload #6
    //   3125: iload #5
    //   3127: if_icmpge -> 3263
    //   3130: aload #4
    //   3132: iload #6
    //   3134: aaload
    //   3135: astore #7
    //   3137: aload #7
    //   3139: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3142: pop
    //   3143: aload #7
    //   3145: invokevirtual getModifiers : ()I
    //   3148: invokestatic isStatic : (I)Z
    //   3151: ifeq -> 3249
    //   3154: aload #7
    //   3156: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3159: arraylength
    //   3160: iconst_2
    //   3161: if_icmpne -> 3249
    //   3164: goto -> 3171
    //   3167: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3170: athrow
    //   3171: aload #7
    //   3173: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3176: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3179: if_acmpne -> 3249
    //   3182: goto -> 3189
    //   3185: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3188: athrow
    //   3189: aload #7
    //   3191: iconst_1
    //   3192: invokevirtual setAccessible : (Z)V
    //   3195: aload #7
    //   3197: aconst_null
    //   3198: iconst_2
    //   3199: anewarray java/lang/Object
    //   3202: dup
    //   3203: iconst_0
    //   3204: aload_0
    //   3205: aastore
    //   3206: dup
    //   3207: iconst_1
    //   3208: aload_1
    //   3209: ifnonnull -> 3227
    //   3212: goto -> 3219
    //   3215: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3218: athrow
    //   3219: aload_1
    //   3220: goto -> 3234
    //   3223: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3226: athrow
    //   3227: aload_1
    //   3228: checkcast [B
    //   3231: invokevirtual clone : ()Ljava/lang/Object;
    //   3234: aastore
    //   3235: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3238: checkcast java/lang/Boolean
    //   3241: invokevirtual booleanValue : ()Z
    //   3244: istore_3
    //   3245: iload_2
    //   3246: ifne -> 3263
    //   3249: iinc #6, 1
    //   3252: iload_2
    //   3253: ifne -> 3123
    //   3256: goto -> 3263
    //   3259: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3262: athrow
    //   3263: iload_3
    //   3264: ifeq -> 3269
    //   3267: iload_3
    //   3268: ireturn
    //   3269: getstatic burp/Zlf0.ZS : Ljava/lang/String;
    //   3272: getstatic burp/Zeoy.Zt : Ljava/lang/Object;
    //   3275: checkcast java/math/BigInteger
    //   3278: invokevirtual intValue : ()I
    //   3281: bipush #32
    //   3283: irem
    //   3284: invokestatic abs : (I)I
    //   3287: invokevirtual charAt : (I)C
    //   3290: getstatic burp/Zkjr.Zg : Ljava/lang/String;
    //   3293: getstatic burp/Ztye.ZK : Ljava/lang/Object;
    //   3296: checkcast java/math/BigInteger
    //   3299: invokevirtual intValue : ()I
    //   3302: bipush #32
    //   3304: irem
    //   3305: invokestatic abs : (I)I
    //   3308: invokevirtual charAt : (I)C
    //   3311: if_icmple -> 3656
    //   3314: sipush #-26392
    //   3317: sipush #31211
    //   3320: invokestatic a : (II)Ljava/lang/String;
    //   3323: iconst_1
    //   3324: ldc burp/Zry0
    //   3326: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3329: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3332: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3335: astore #4
    //   3337: aload #4
    //   3339: arraylength
    //   3340: istore #5
    //   3342: iconst_0
    //   3343: istore #6
    //   3345: iload #6
    //   3347: iload #5
    //   3349: if_icmpge -> 3487
    //   3352: aload #4
    //   3354: iload #6
    //   3356: aaload
    //   3357: astore #7
    //   3359: aload #7
    //   3361: invokevirtual getModifiers : ()I
    //   3364: invokestatic isStatic : (I)Z
    //   3367: ifne -> 3377
    //   3370: goto -> 3480
    //   3373: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3376: athrow
    //   3377: aload #7
    //   3379: invokevirtual getType : ()Ljava/lang/Class;
    //   3382: astore #8
    //   3384: aload #8
    //   3386: ifnull -> 3467
    //   3389: aload #8
    //   3391: invokevirtual isPrimitive : ()Z
    //   3394: ifne -> 3467
    //   3397: goto -> 3404
    //   3400: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3403: athrow
    //   3404: aload #8
    //   3406: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3409: ifnull -> 3467
    //   3412: goto -> 3419
    //   3415: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3418: athrow
    //   3419: aload #8
    //   3421: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3424: invokevirtual getName : ()Ljava/lang/String;
    //   3427: ifnull -> 3467
    //   3430: goto -> 3437
    //   3433: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3436: athrow
    //   3437: aload #8
    //   3439: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3442: invokevirtual getName : ()Ljava/lang/String;
    //   3445: sipush #-26389
    //   3448: sipush #24917
    //   3451: invokestatic a : (II)Ljava/lang/String;
    //   3454: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3457: ifne -> 3467
    //   3460: goto -> 3467
    //   3463: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3466: athrow
    //   3467: aload #7
    //   3469: iconst_1
    //   3470: invokevirtual setAccessible : (Z)V
    //   3473: aload #7
    //   3475: aconst_null
    //   3476: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3479: pop
    //   3480: iinc #6, 1
    //   3483: iload_2
    //   3484: ifne -> 3345
    //   3487: sipush #-26373
    //   3490: sipush #-24782
    //   3493: invokestatic a : (II)Ljava/lang/String;
    //   3496: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3499: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3502: astore #4
    //   3504: aload #4
    //   3506: arraylength
    //   3507: istore #5
    //   3509: iconst_0
    //   3510: istore #6
    //   3512: iload #6
    //   3514: iload #5
    //   3516: if_icmpge -> 3652
    //   3519: aload #4
    //   3521: iload #6
    //   3523: aaload
    //   3524: astore #7
    //   3526: aload #7
    //   3528: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3531: pop
    //   3532: aload #7
    //   3534: invokevirtual getModifiers : ()I
    //   3537: invokestatic isStatic : (I)Z
    //   3540: ifeq -> 3638
    //   3543: aload #7
    //   3545: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3548: arraylength
    //   3549: iconst_2
    //   3550: if_icmpne -> 3638
    //   3553: goto -> 3560
    //   3556: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3559: athrow
    //   3560: aload #7
    //   3562: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3565: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3568: if_acmpne -> 3638
    //   3571: goto -> 3578
    //   3574: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3577: athrow
    //   3578: aload #7
    //   3580: iconst_1
    //   3581: invokevirtual setAccessible : (Z)V
    //   3584: aload #7
    //   3586: aconst_null
    //   3587: iconst_2
    //   3588: anewarray java/lang/Object
    //   3591: dup
    //   3592: iconst_0
    //   3593: aload_0
    //   3594: aastore
    //   3595: dup
    //   3596: iconst_1
    //   3597: aload_1
    //   3598: ifnonnull -> 3616
    //   3601: goto -> 3608
    //   3604: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3607: athrow
    //   3608: aload_1
    //   3609: goto -> 3623
    //   3612: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3615: athrow
    //   3616: aload_1
    //   3617: checkcast [B
    //   3620: invokevirtual clone : ()Ljava/lang/Object;
    //   3623: aastore
    //   3624: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3627: checkcast java/lang/Boolean
    //   3630: invokevirtual booleanValue : ()Z
    //   3633: istore_3
    //   3634: iload_2
    //   3635: ifne -> 3652
    //   3638: iinc #6, 1
    //   3641: iload_2
    //   3642: ifne -> 3512
    //   3645: goto -> 3652
    //   3648: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3651: athrow
    //   3652: iload_2
    //   3653: ifne -> 3994
    //   3656: sipush #-26400
    //   3659: sipush #-1181
    //   3662: invokestatic a : (II)Ljava/lang/String;
    //   3665: iconst_1
    //   3666: ldc burp/Zgr1
    //   3668: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3671: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3674: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3677: astore #4
    //   3679: aload #4
    //   3681: arraylength
    //   3682: istore #5
    //   3684: iconst_0
    //   3685: istore #6
    //   3687: iload #6
    //   3689: iload #5
    //   3691: if_icmpge -> 3829
    //   3694: aload #4
    //   3696: iload #6
    //   3698: aaload
    //   3699: astore #7
    //   3701: aload #7
    //   3703: invokevirtual getModifiers : ()I
    //   3706: invokestatic isStatic : (I)Z
    //   3709: ifne -> 3719
    //   3712: goto -> 3822
    //   3715: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3718: athrow
    //   3719: aload #7
    //   3721: invokevirtual getType : ()Ljava/lang/Class;
    //   3724: astore #8
    //   3726: aload #8
    //   3728: ifnull -> 3809
    //   3731: aload #8
    //   3733: invokevirtual isPrimitive : ()Z
    //   3736: ifne -> 3809
    //   3739: goto -> 3746
    //   3742: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3745: athrow
    //   3746: aload #8
    //   3748: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3751: ifnull -> 3809
    //   3754: goto -> 3761
    //   3757: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3760: athrow
    //   3761: aload #8
    //   3763: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3766: invokevirtual getName : ()Ljava/lang/String;
    //   3769: ifnull -> 3809
    //   3772: goto -> 3779
    //   3775: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3778: athrow
    //   3779: aload #8
    //   3781: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3784: invokevirtual getName : ()Ljava/lang/String;
    //   3787: sipush #-26389
    //   3790: sipush #24917
    //   3793: invokestatic a : (II)Ljava/lang/String;
    //   3796: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3799: ifne -> 3809
    //   3802: goto -> 3809
    //   3805: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3808: athrow
    //   3809: aload #7
    //   3811: iconst_1
    //   3812: invokevirtual setAccessible : (Z)V
    //   3815: aload #7
    //   3817: aconst_null
    //   3818: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3821: pop
    //   3822: iinc #6, 1
    //   3825: iload_2
    //   3826: ifne -> 3687
    //   3829: sipush #-26381
    //   3832: sipush #5866
    //   3835: invokestatic a : (II)Ljava/lang/String;
    //   3838: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3841: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3844: astore #4
    //   3846: aload #4
    //   3848: arraylength
    //   3849: istore #5
    //   3851: iconst_0
    //   3852: istore #6
    //   3854: iload #6
    //   3856: iload #5
    //   3858: if_icmpge -> 3994
    //   3861: aload #4
    //   3863: iload #6
    //   3865: aaload
    //   3866: astore #7
    //   3868: aload #7
    //   3870: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3873: pop
    //   3874: aload #7
    //   3876: invokevirtual getModifiers : ()I
    //   3879: invokestatic isStatic : (I)Z
    //   3882: ifeq -> 3980
    //   3885: aload #7
    //   3887: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3890: arraylength
    //   3891: iconst_2
    //   3892: if_icmpne -> 3980
    //   3895: goto -> 3902
    //   3898: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3901: athrow
    //   3902: aload #7
    //   3904: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3907: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3910: if_acmpne -> 3980
    //   3913: goto -> 3920
    //   3916: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3919: athrow
    //   3920: aload #7
    //   3922: iconst_1
    //   3923: invokevirtual setAccessible : (Z)V
    //   3926: aload #7
    //   3928: aconst_null
    //   3929: iconst_2
    //   3930: anewarray java/lang/Object
    //   3933: dup
    //   3934: iconst_0
    //   3935: aload_0
    //   3936: aastore
    //   3937: dup
    //   3938: iconst_1
    //   3939: aload_1
    //   3940: ifnonnull -> 3958
    //   3943: goto -> 3950
    //   3946: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3949: athrow
    //   3950: aload_1
    //   3951: goto -> 3965
    //   3954: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3957: athrow
    //   3958: aload_1
    //   3959: checkcast [B
    //   3962: invokevirtual clone : ()Ljava/lang/Object;
    //   3965: aastore
    //   3966: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3969: checkcast java/lang/Boolean
    //   3972: invokevirtual booleanValue : ()Z
    //   3975: istore_3
    //   3976: iload_2
    //   3977: ifne -> 3994
    //   3980: iinc #6, 1
    //   3983: iload_2
    //   3984: ifne -> 3854
    //   3987: goto -> 3994
    //   3990: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3993: athrow
    //   3994: iload_3
    //   3995: ifeq -> 4000
    //   3998: iload_3
    //   3999: ireturn
    //   4000: getstatic burp/Ztye.ZR : Ljava/lang/String;
    //   4003: getstatic burp/Zl39.ZA : Ljava/lang/Object;
    //   4006: checkcast java/math/BigInteger
    //   4009: invokevirtual intValue : ()I
    //   4012: bipush #32
    //   4014: irem
    //   4015: invokestatic abs : (I)I
    //   4018: invokevirtual charAt : (I)C
    //   4021: getstatic burp/Zrva.Zr : Ljava/lang/String;
    //   4024: getstatic burp/Ze8i.Zq : Ljava/lang/Object;
    //   4027: checkcast java/math/BigInteger
    //   4030: invokevirtual intValue : ()I
    //   4033: bipush #32
    //   4035: irem
    //   4036: invokestatic abs : (I)I
    //   4039: invokevirtual charAt : (I)C
    //   4042: if_icmple -> 4387
    //   4045: sipush #-26372
    //   4048: sipush #-470
    //   4051: invokestatic a : (II)Ljava/lang/String;
    //   4054: iconst_1
    //   4055: ldc burp/Ztpg
    //   4057: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4060: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4063: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4066: astore #4
    //   4068: aload #4
    //   4070: arraylength
    //   4071: istore #5
    //   4073: iconst_0
    //   4074: istore #6
    //   4076: iload #6
    //   4078: iload #5
    //   4080: if_icmpge -> 4218
    //   4083: aload #4
    //   4085: iload #6
    //   4087: aaload
    //   4088: astore #7
    //   4090: aload #7
    //   4092: invokevirtual getModifiers : ()I
    //   4095: invokestatic isStatic : (I)Z
    //   4098: ifne -> 4108
    //   4101: goto -> 4211
    //   4104: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4107: athrow
    //   4108: aload #7
    //   4110: invokevirtual getType : ()Ljava/lang/Class;
    //   4113: astore #8
    //   4115: aload #8
    //   4117: ifnull -> 4198
    //   4120: aload #8
    //   4122: invokevirtual isPrimitive : ()Z
    //   4125: ifne -> 4198
    //   4128: goto -> 4135
    //   4131: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4134: athrow
    //   4135: aload #8
    //   4137: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4140: ifnull -> 4198
    //   4143: goto -> 4150
    //   4146: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4149: athrow
    //   4150: aload #8
    //   4152: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4155: invokevirtual getName : ()Ljava/lang/String;
    //   4158: ifnull -> 4198
    //   4161: goto -> 4168
    //   4164: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4167: athrow
    //   4168: aload #8
    //   4170: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4173: invokevirtual getName : ()Ljava/lang/String;
    //   4176: sipush #-26389
    //   4179: sipush #24917
    //   4182: invokestatic a : (II)Ljava/lang/String;
    //   4185: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4188: ifne -> 4198
    //   4191: goto -> 4198
    //   4194: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4197: athrow
    //   4198: aload #7
    //   4200: iconst_1
    //   4201: invokevirtual setAccessible : (Z)V
    //   4204: aload #7
    //   4206: aconst_null
    //   4207: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4210: pop
    //   4211: iinc #6, 1
    //   4214: iload_2
    //   4215: ifne -> 4076
    //   4218: sipush #-26397
    //   4221: sipush #-13702
    //   4224: invokestatic a : (II)Ljava/lang/String;
    //   4227: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4230: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4233: astore #4
    //   4235: aload #4
    //   4237: arraylength
    //   4238: istore #5
    //   4240: iconst_0
    //   4241: istore #6
    //   4243: iload #6
    //   4245: iload #5
    //   4247: if_icmpge -> 4383
    //   4250: aload #4
    //   4252: iload #6
    //   4254: aaload
    //   4255: astore #7
    //   4257: aload #7
    //   4259: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4262: pop
    //   4263: aload #7
    //   4265: invokevirtual getModifiers : ()I
    //   4268: invokestatic isStatic : (I)Z
    //   4271: ifeq -> 4369
    //   4274: aload #7
    //   4276: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4279: arraylength
    //   4280: iconst_2
    //   4281: if_icmpne -> 4369
    //   4284: goto -> 4291
    //   4287: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4290: athrow
    //   4291: aload #7
    //   4293: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4296: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4299: if_acmpne -> 4369
    //   4302: goto -> 4309
    //   4305: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4308: athrow
    //   4309: aload #7
    //   4311: iconst_1
    //   4312: invokevirtual setAccessible : (Z)V
    //   4315: aload #7
    //   4317: aconst_null
    //   4318: iconst_2
    //   4319: anewarray java/lang/Object
    //   4322: dup
    //   4323: iconst_0
    //   4324: aload_0
    //   4325: aastore
    //   4326: dup
    //   4327: iconst_1
    //   4328: aload_1
    //   4329: ifnonnull -> 4347
    //   4332: goto -> 4339
    //   4335: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4338: athrow
    //   4339: aload_1
    //   4340: goto -> 4354
    //   4343: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4346: athrow
    //   4347: aload_1
    //   4348: checkcast [B
    //   4351: invokevirtual clone : ()Ljava/lang/Object;
    //   4354: aastore
    //   4355: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4358: checkcast java/lang/Boolean
    //   4361: invokevirtual booleanValue : ()Z
    //   4364: istore_3
    //   4365: iload_2
    //   4366: ifne -> 4383
    //   4369: iinc #6, 1
    //   4372: iload_2
    //   4373: ifne -> 4243
    //   4376: goto -> 4383
    //   4379: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4382: athrow
    //   4383: iload_2
    //   4384: ifne -> 4725
    //   4387: sipush #-26380
    //   4390: sipush #-8213
    //   4393: invokestatic a : (II)Ljava/lang/String;
    //   4396: iconst_1
    //   4397: ldc burp/Zstq
    //   4399: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4402: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4405: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4408: astore #4
    //   4410: aload #4
    //   4412: arraylength
    //   4413: istore #5
    //   4415: iconst_0
    //   4416: istore #6
    //   4418: iload #6
    //   4420: iload #5
    //   4422: if_icmpge -> 4560
    //   4425: aload #4
    //   4427: iload #6
    //   4429: aaload
    //   4430: astore #7
    //   4432: aload #7
    //   4434: invokevirtual getModifiers : ()I
    //   4437: invokestatic isStatic : (I)Z
    //   4440: ifne -> 4450
    //   4443: goto -> 4553
    //   4446: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4449: athrow
    //   4450: aload #7
    //   4452: invokevirtual getType : ()Ljava/lang/Class;
    //   4455: astore #8
    //   4457: aload #8
    //   4459: ifnull -> 4540
    //   4462: aload #8
    //   4464: invokevirtual isPrimitive : ()Z
    //   4467: ifne -> 4540
    //   4470: goto -> 4477
    //   4473: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4476: athrow
    //   4477: aload #8
    //   4479: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4482: ifnull -> 4540
    //   4485: goto -> 4492
    //   4488: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4491: athrow
    //   4492: aload #8
    //   4494: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4497: invokevirtual getName : ()Ljava/lang/String;
    //   4500: ifnull -> 4540
    //   4503: goto -> 4510
    //   4506: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4509: athrow
    //   4510: aload #8
    //   4512: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4515: invokevirtual getName : ()Ljava/lang/String;
    //   4518: sipush #-26389
    //   4521: sipush #24917
    //   4524: invokestatic a : (II)Ljava/lang/String;
    //   4527: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4530: ifne -> 4540
    //   4533: goto -> 4540
    //   4536: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4539: athrow
    //   4540: aload #7
    //   4542: iconst_1
    //   4543: invokevirtual setAccessible : (Z)V
    //   4546: aload #7
    //   4548: aconst_null
    //   4549: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4552: pop
    //   4553: iinc #6, 1
    //   4556: iload_2
    //   4557: ifne -> 4418
    //   4560: sipush #-26371
    //   4563: sipush #-4730
    //   4566: invokestatic a : (II)Ljava/lang/String;
    //   4569: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4572: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4575: astore #4
    //   4577: aload #4
    //   4579: arraylength
    //   4580: istore #5
    //   4582: iconst_0
    //   4583: istore #6
    //   4585: iload #6
    //   4587: iload #5
    //   4589: if_icmpge -> 4725
    //   4592: aload #4
    //   4594: iload #6
    //   4596: aaload
    //   4597: astore #7
    //   4599: aload #7
    //   4601: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4604: pop
    //   4605: aload #7
    //   4607: invokevirtual getModifiers : ()I
    //   4610: invokestatic isStatic : (I)Z
    //   4613: ifeq -> 4711
    //   4616: aload #7
    //   4618: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4621: arraylength
    //   4622: iconst_2
    //   4623: if_icmpne -> 4711
    //   4626: goto -> 4633
    //   4629: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4632: athrow
    //   4633: aload #7
    //   4635: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4638: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4641: if_acmpne -> 4711
    //   4644: goto -> 4651
    //   4647: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4650: athrow
    //   4651: aload #7
    //   4653: iconst_1
    //   4654: invokevirtual setAccessible : (Z)V
    //   4657: aload #7
    //   4659: aconst_null
    //   4660: iconst_2
    //   4661: anewarray java/lang/Object
    //   4664: dup
    //   4665: iconst_0
    //   4666: aload_0
    //   4667: aastore
    //   4668: dup
    //   4669: iconst_1
    //   4670: aload_1
    //   4671: ifnonnull -> 4689
    //   4674: goto -> 4681
    //   4677: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4680: athrow
    //   4681: aload_1
    //   4682: goto -> 4696
    //   4685: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4688: athrow
    //   4689: aload_1
    //   4690: checkcast [B
    //   4693: invokevirtual clone : ()Ljava/lang/Object;
    //   4696: aastore
    //   4697: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4700: checkcast java/lang/Boolean
    //   4703: invokevirtual booleanValue : ()Z
    //   4706: istore_3
    //   4707: iload_2
    //   4708: ifne -> 4725
    //   4711: iinc #6, 1
    //   4714: iload_2
    //   4715: ifne -> 4585
    //   4718: goto -> 4725
    //   4721: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4724: athrow
    //   4725: iload_3
    //   4726: ifeq -> 4731
    //   4729: iload_3
    //   4730: ireturn
    //   4731: getstatic burp/Zkm0.ZL : Ljava/lang/String;
    //   4734: getstatic burp/Zmr7.ZO : Ljava/lang/Object;
    //   4737: checkcast java/math/BigInteger
    //   4740: invokevirtual intValue : ()I
    //   4743: bipush #32
    //   4745: irem
    //   4746: invokestatic abs : (I)I
    //   4749: invokevirtual charAt : (I)C
    //   4752: getstatic burp/Zrtv.ZA : Ljava/lang/String;
    //   4755: getstatic burp/Zex.ZO : Ljava/lang/Object;
    //   4758: checkcast java/math/BigInteger
    //   4761: invokevirtual intValue : ()I
    //   4764: bipush #32
    //   4766: irem
    //   4767: invokestatic abs : (I)I
    //   4770: invokevirtual charAt : (I)C
    //   4773: if_icmpgt -> 5118
    //   4776: sipush #-26390
    //   4779: sipush #-18403
    //   4782: invokestatic a : (II)Ljava/lang/String;
    //   4785: iconst_1
    //   4786: ldc burp/Zb8v
    //   4788: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4791: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4794: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4797: astore #4
    //   4799: aload #4
    //   4801: arraylength
    //   4802: istore #5
    //   4804: iconst_0
    //   4805: istore #6
    //   4807: iload #6
    //   4809: iload #5
    //   4811: if_icmpge -> 4949
    //   4814: aload #4
    //   4816: iload #6
    //   4818: aaload
    //   4819: astore #7
    //   4821: aload #7
    //   4823: invokevirtual getModifiers : ()I
    //   4826: invokestatic isStatic : (I)Z
    //   4829: ifne -> 4839
    //   4832: goto -> 4942
    //   4835: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4838: athrow
    //   4839: aload #7
    //   4841: invokevirtual getType : ()Ljava/lang/Class;
    //   4844: astore #8
    //   4846: aload #8
    //   4848: ifnull -> 4929
    //   4851: aload #8
    //   4853: invokevirtual isPrimitive : ()Z
    //   4856: ifne -> 4929
    //   4859: goto -> 4866
    //   4862: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4865: athrow
    //   4866: aload #8
    //   4868: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4871: ifnull -> 4929
    //   4874: goto -> 4881
    //   4877: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4880: athrow
    //   4881: aload #8
    //   4883: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4886: invokevirtual getName : ()Ljava/lang/String;
    //   4889: ifnull -> 4929
    //   4892: goto -> 4899
    //   4895: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4898: athrow
    //   4899: aload #8
    //   4901: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4904: invokevirtual getName : ()Ljava/lang/String;
    //   4907: sipush #-26389
    //   4910: sipush #24917
    //   4913: invokestatic a : (II)Ljava/lang/String;
    //   4916: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4919: ifne -> 4929
    //   4922: goto -> 4929
    //   4925: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4928: athrow
    //   4929: aload #7
    //   4931: iconst_1
    //   4932: invokevirtual setAccessible : (Z)V
    //   4935: aload #7
    //   4937: aconst_null
    //   4938: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4941: pop
    //   4942: iinc #6, 1
    //   4945: iload_2
    //   4946: ifne -> 4807
    //   4949: sipush #-26374
    //   4952: sipush #-18881
    //   4955: invokestatic a : (II)Ljava/lang/String;
    //   4958: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4961: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4964: astore #4
    //   4966: aload #4
    //   4968: arraylength
    //   4969: istore #5
    //   4971: iconst_0
    //   4972: istore #6
    //   4974: iload #6
    //   4976: iload #5
    //   4978: if_icmpge -> 5114
    //   4981: aload #4
    //   4983: iload #6
    //   4985: aaload
    //   4986: astore #7
    //   4988: aload #7
    //   4990: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4993: pop
    //   4994: aload #7
    //   4996: invokevirtual getModifiers : ()I
    //   4999: invokestatic isStatic : (I)Z
    //   5002: ifeq -> 5100
    //   5005: aload #7
    //   5007: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5010: arraylength
    //   5011: iconst_2
    //   5012: if_icmpne -> 5100
    //   5015: goto -> 5022
    //   5018: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5021: athrow
    //   5022: aload #7
    //   5024: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5027: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   5030: if_acmpne -> 5100
    //   5033: goto -> 5040
    //   5036: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5039: athrow
    //   5040: aload #7
    //   5042: iconst_1
    //   5043: invokevirtual setAccessible : (Z)V
    //   5046: aload #7
    //   5048: aconst_null
    //   5049: iconst_2
    //   5050: anewarray java/lang/Object
    //   5053: dup
    //   5054: iconst_0
    //   5055: aload_0
    //   5056: aastore
    //   5057: dup
    //   5058: iconst_1
    //   5059: aload_1
    //   5060: ifnonnull -> 5078
    //   5063: goto -> 5070
    //   5066: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5069: athrow
    //   5070: aload_1
    //   5071: goto -> 5085
    //   5074: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5077: athrow
    //   5078: aload_1
    //   5079: checkcast [B
    //   5082: invokevirtual clone : ()Ljava/lang/Object;
    //   5085: aastore
    //   5086: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5089: checkcast java/lang/Boolean
    //   5092: invokevirtual booleanValue : ()Z
    //   5095: istore_3
    //   5096: iload_2
    //   5097: ifne -> 5114
    //   5100: iinc #6, 1
    //   5103: iload_2
    //   5104: ifne -> 4974
    //   5107: goto -> 5114
    //   5110: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5113: athrow
    //   5114: iload_2
    //   5115: ifne -> 5456
    //   5118: sipush #-26378
    //   5121: sipush #24716
    //   5124: invokestatic a : (II)Ljava/lang/String;
    //   5127: iconst_1
    //   5128: ldc burp/Zzmw
    //   5130: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5133: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5136: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5139: astore #4
    //   5141: aload #4
    //   5143: arraylength
    //   5144: istore #5
    //   5146: iconst_0
    //   5147: istore #6
    //   5149: iload #6
    //   5151: iload #5
    //   5153: if_icmpge -> 5291
    //   5156: aload #4
    //   5158: iload #6
    //   5160: aaload
    //   5161: astore #7
    //   5163: aload #7
    //   5165: invokevirtual getModifiers : ()I
    //   5168: invokestatic isStatic : (I)Z
    //   5171: ifne -> 5181
    //   5174: goto -> 5284
    //   5177: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5180: athrow
    //   5181: aload #7
    //   5183: invokevirtual getType : ()Ljava/lang/Class;
    //   5186: astore #8
    //   5188: aload #8
    //   5190: ifnull -> 5271
    //   5193: aload #8
    //   5195: invokevirtual isPrimitive : ()Z
    //   5198: ifne -> 5271
    //   5201: goto -> 5208
    //   5204: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5207: athrow
    //   5208: aload #8
    //   5210: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5213: ifnull -> 5271
    //   5216: goto -> 5223
    //   5219: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5222: athrow
    //   5223: aload #8
    //   5225: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5228: invokevirtual getName : ()Ljava/lang/String;
    //   5231: ifnull -> 5271
    //   5234: goto -> 5241
    //   5237: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5240: athrow
    //   5241: aload #8
    //   5243: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5246: invokevirtual getName : ()Ljava/lang/String;
    //   5249: sipush #-26389
    //   5252: sipush #24917
    //   5255: invokestatic a : (II)Ljava/lang/String;
    //   5258: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5261: ifne -> 5271
    //   5264: goto -> 5271
    //   5267: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5270: athrow
    //   5271: aload #7
    //   5273: iconst_1
    //   5274: invokevirtual setAccessible : (Z)V
    //   5277: aload #7
    //   5279: aconst_null
    //   5280: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5283: pop
    //   5284: iinc #6, 1
    //   5287: iload_2
    //   5288: ifne -> 5149
    //   5291: sipush #-26395
    //   5294: sipush #-14432
    //   5297: invokestatic a : (II)Ljava/lang/String;
    //   5300: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5303: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5306: astore #4
    //   5308: aload #4
    //   5310: arraylength
    //   5311: istore #5
    //   5313: iconst_0
    //   5314: istore #6
    //   5316: iload #6
    //   5318: iload #5
    //   5320: if_icmpge -> 5456
    //   5323: aload #4
    //   5325: iload #6
    //   5327: aaload
    //   5328: astore #7
    //   5330: aload #7
    //   5332: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5335: pop
    //   5336: aload #7
    //   5338: invokevirtual getModifiers : ()I
    //   5341: invokestatic isStatic : (I)Z
    //   5344: ifeq -> 5442
    //   5347: aload #7
    //   5349: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5352: arraylength
    //   5353: iconst_2
    //   5354: if_icmpne -> 5442
    //   5357: goto -> 5364
    //   5360: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5363: athrow
    //   5364: aload #7
    //   5366: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5369: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   5372: if_acmpne -> 5442
    //   5375: goto -> 5382
    //   5378: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5381: athrow
    //   5382: aload #7
    //   5384: iconst_1
    //   5385: invokevirtual setAccessible : (Z)V
    //   5388: aload #7
    //   5390: aconst_null
    //   5391: iconst_2
    //   5392: anewarray java/lang/Object
    //   5395: dup
    //   5396: iconst_0
    //   5397: aload_0
    //   5398: aastore
    //   5399: dup
    //   5400: iconst_1
    //   5401: aload_1
    //   5402: ifnonnull -> 5420
    //   5405: goto -> 5412
    //   5408: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5411: athrow
    //   5412: aload_1
    //   5413: goto -> 5427
    //   5416: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5419: athrow
    //   5420: aload_1
    //   5421: checkcast [B
    //   5424: invokevirtual clone : ()Ljava/lang/Object;
    //   5427: aastore
    //   5428: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5431: checkcast java/lang/Boolean
    //   5434: invokevirtual booleanValue : ()Z
    //   5437: istore_3
    //   5438: iload_2
    //   5439: ifne -> 5456
    //   5442: iinc #6, 1
    //   5445: iload_2
    //   5446: ifne -> 5316
    //   5449: goto -> 5456
    //   5452: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5455: athrow
    //   5456: iload_3
    //   5457: ireturn
    //   5458: astore_3
    //   5459: new java/lang/Exception
    //   5462: dup
    //   5463: aload_3
    //   5464: invokevirtual getMessage : ()Ljava/lang/String;
    //   5467: invokespecial <init> : (Ljava/lang/String;)V
    //   5470: athrow
    // Exception table:
    //   from	to	target	type
    //   4	2537	5458	java/lang/Throwable
    //   200	224	227	java/lang/Throwable
    //   298	335	335	java/lang/Throwable
    //   339	360	360	java/lang/Throwable
    //   364	394	394	java/lang/Throwable
    //   639	653	656	java/lang/Throwable
    //   646	667	670	java/lang/Throwable
    //   660	681	684	java/lang/Throwable
    //   674	695	698	java/lang/Throwable
    //   688	709	712	java/lang/Throwable
    //   702	723	726	java/lang/Throwable
    //   716	737	740	java/lang/Throwable
    //   730	751	754	java/lang/Throwable
    //   744	761	764	java/lang/Throwable
    //   800	814	817	java/lang/Throwable
    //   807	828	831	java/lang/Throwable
    //   821	842	845	java/lang/Throwable
    //   835	856	859	java/lang/Throwable
    //   849	870	873	java/lang/Throwable
    //   863	884	887	java/lang/Throwable
    //   877	898	901	java/lang/Throwable
    //   891	912	915	java/lang/Throwable
    //   905	929	932	java/lang/Throwable
    //   993	1011	1014	java/lang/Throwable
    //   1002	1027	1030	java/lang/Throwable
    //   1018	1044	1047	java/lang/Throwable
    //   1034	1060	1063	java/lang/Throwable
    //   1051	1077	1080	java/lang/Throwable
    //   1067	1093	1096	java/lang/Throwable
    //   1084	1109	1112	java/lang/Throwable
    //   1100	1132	1135	java/lang/Throwable
    //   1116	1148	1151	java/lang/Throwable
    //   1139	1164	1167	java/lang/Throwable
    //   1155	1187	1190	java/lang/Throwable
    //   1171	1203	1206	java/lang/Throwable
    //   1194	1219	1222	java/lang/Throwable
    //   1210	1238	1241	java/lang/Throwable
    //   1368	1403	1406	java/lang/Throwable
    //   1410	1451	1454	java/lang/Throwable
    //   1519	1533	1533	java/lang/Throwable
    //   1544	1557	1560	java/lang/Throwable
    //   1549	1572	1575	java/lang/Throwable
    //   1564	1590	1593	java/lang/Throwable
    //   1579	1620	1623	java/lang/Throwable
    //   1683	1710	1713	java/lang/Throwable
    //   1700	1731	1734	java/lang/Throwable
    //   1717	1761	1764	java/lang/Throwable
    //   1738	1772	1772	java/lang/Throwable
    //   1783	1799	1802	java/lang/Throwable
    //   1898	1912	1912	java/lang/Throwable
    //   1923	1936	1939	java/lang/Throwable
    //   1928	1951	1954	java/lang/Throwable
    //   1943	1969	1972	java/lang/Throwable
    //   1958	1999	2002	java/lang/Throwable
    //   2065	2092	2095	java/lang/Throwable
    //   2082	2110	2113	java/lang/Throwable
    //   2099	2140	2143	java/lang/Throwable
    //   2117	2151	2151	java/lang/Throwable
    //   2173	2184	2187	java/lang/Throwable
    //   2239	2253	2253	java/lang/Throwable
    //   2264	2277	2280	java/lang/Throwable
    //   2269	2292	2295	java/lang/Throwable
    //   2284	2310	2313	java/lang/Throwable
    //   2299	2340	2343	java/lang/Throwable
    //   2406	2433	2436	java/lang/Throwable
    //   2423	2451	2454	java/lang/Throwable
    //   2440	2481	2484	java/lang/Throwable
    //   2458	2492	2492	java/lang/Throwable
    //   2514	2525	2528	java/lang/Throwable
    //   2538	3268	5458	java/lang/Throwable
    //   2628	2642	2642	java/lang/Throwable
    //   2653	2666	2669	java/lang/Throwable
    //   2658	2681	2684	java/lang/Throwable
    //   2673	2699	2702	java/lang/Throwable
    //   2688	2729	2732	java/lang/Throwable
    //   2795	2822	2825	java/lang/Throwable
    //   2812	2840	2843	java/lang/Throwable
    //   2829	2870	2873	java/lang/Throwable
    //   2847	2881	2881	java/lang/Throwable
    //   2903	2914	2917	java/lang/Throwable
    //   2970	2984	2984	java/lang/Throwable
    //   2995	3008	3011	java/lang/Throwable
    //   3000	3023	3026	java/lang/Throwable
    //   3015	3041	3044	java/lang/Throwable
    //   3030	3071	3074	java/lang/Throwable
    //   3137	3164	3167	java/lang/Throwable
    //   3154	3182	3185	java/lang/Throwable
    //   3171	3212	3215	java/lang/Throwable
    //   3189	3223	3223	java/lang/Throwable
    //   3245	3256	3259	java/lang/Throwable
    //   3269	3999	5458	java/lang/Throwable
    //   3359	3373	3373	java/lang/Throwable
    //   3384	3397	3400	java/lang/Throwable
    //   3389	3412	3415	java/lang/Throwable
    //   3404	3430	3433	java/lang/Throwable
    //   3419	3460	3463	java/lang/Throwable
    //   3526	3553	3556	java/lang/Throwable
    //   3543	3571	3574	java/lang/Throwable
    //   3560	3601	3604	java/lang/Throwable
    //   3578	3612	3612	java/lang/Throwable
    //   3634	3645	3648	java/lang/Throwable
    //   3701	3715	3715	java/lang/Throwable
    //   3726	3739	3742	java/lang/Throwable
    //   3731	3754	3757	java/lang/Throwable
    //   3746	3772	3775	java/lang/Throwable
    //   3761	3802	3805	java/lang/Throwable
    //   3868	3895	3898	java/lang/Throwable
    //   3885	3913	3916	java/lang/Throwable
    //   3902	3943	3946	java/lang/Throwable
    //   3920	3954	3954	java/lang/Throwable
    //   3976	3987	3990	java/lang/Throwable
    //   4000	4730	5458	java/lang/Throwable
    //   4090	4104	4104	java/lang/Throwable
    //   4115	4128	4131	java/lang/Throwable
    //   4120	4143	4146	java/lang/Throwable
    //   4135	4161	4164	java/lang/Throwable
    //   4150	4191	4194	java/lang/Throwable
    //   4257	4284	4287	java/lang/Throwable
    //   4274	4302	4305	java/lang/Throwable
    //   4291	4332	4335	java/lang/Throwable
    //   4309	4343	4343	java/lang/Throwable
    //   4365	4376	4379	java/lang/Throwable
    //   4432	4446	4446	java/lang/Throwable
    //   4457	4470	4473	java/lang/Throwable
    //   4462	4485	4488	java/lang/Throwable
    //   4477	4503	4506	java/lang/Throwable
    //   4492	4533	4536	java/lang/Throwable
    //   4599	4626	4629	java/lang/Throwable
    //   4616	4644	4647	java/lang/Throwable
    //   4633	4674	4677	java/lang/Throwable
    //   4651	4685	4685	java/lang/Throwable
    //   4707	4718	4721	java/lang/Throwable
    //   4731	5457	5458	java/lang/Throwable
    //   4821	4835	4835	java/lang/Throwable
    //   4846	4859	4862	java/lang/Throwable
    //   4851	4874	4877	java/lang/Throwable
    //   4866	4892	4895	java/lang/Throwable
    //   4881	4922	4925	java/lang/Throwable
    //   4988	5015	5018	java/lang/Throwable
    //   5005	5033	5036	java/lang/Throwable
    //   5022	5063	5066	java/lang/Throwable
    //   5040	5074	5074	java/lang/Throwable
    //   5096	5107	5110	java/lang/Throwable
    //   5163	5177	5177	java/lang/Throwable
    //   5188	5201	5204	java/lang/Throwable
    //   5193	5216	5219	java/lang/Throwable
    //   5208	5234	5237	java/lang/Throwable
    //   5223	5264	5267	java/lang/Throwable
    //   5330	5357	5360	java/lang/Throwable
    //   5347	5375	5378	java/lang/Throwable
    //   5364	5405	5408	java/lang/Throwable
    //   5382	5416	5416	java/lang/Throwable
    //   5438	5449	5452	java/lang/Throwable
  }
  
  static void ZI(Object paramObject) {
    Zmx6.ZG = a(-26387, -11795);
    Zmx6.ZJ = new BigInteger(a(-26391, 21071));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zel.Zi.charAt(Math.abs(((BigInteger)Zzyr.Za).intValue() % 32)) <= Zzmw.Zd.charAt(Math.abs(((BigInteger)Ztlz.ZW).intValue() % 32))) {
          try {
            Zmyg.Zz(Class.forName(a(-26383, 15186)));
            if (!bool)
              Zgu4.Zi(Class.forName(a(-26396, 27471))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zgu4.Zi(Class.forName(a(-26396, 27471)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #30
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÙÎ&pS¤L¥ëè\\t±qrço\\tIDÔd3ÀP\\tYÔÆ$qJ\\tàµÎÂpÁ°ü\\tý!x¶¦^zV\\td0%ZÐâó\\tßú§+]òp\\t·Ö_yd¬\\tü6h ÊÀ'Y$Ãqé:¨$*ù²Öe×¤Ó°&IRô%Ð%Æ\\tô?7»ÞÂaÒúªö\\t\\tÑG´?^NÚMÕúÌÝê¿º$íÂ§²âøéÃç*¾ ¨Àê®CSë\ÝÔ3|·÷¿«^å\\rFlÑÇbª¸ W×nªÞa°+\\tØ»GAêÍ\\t4E/ô7§\\t¤´=ÊÓðã© Eñ¬MåäøChW³is±Ó!ÐûfwÒUWMÿ\\t%è\\rAÕ%Î\\tW/C¹}ü\\tµÌÅsÈ\\tÔé3a×Ú\\t:ñîb©å¢r\\tc^ÅÌ[Øæ\\tT#Ì0¸·\\tñLÕQÏÃ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #32
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 143
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
    //   68: ldc 'Õvh4*x_\\tõFÉd'¤²'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #102
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 143
    //   99: aload #5
    //   101: swap
    //   102: iload_3
    //   103: iinc #3, 1
    //   106: swap
    //   107: aastore
    //   108: iload_0
    //   109: iload_1
    //   110: iadd
    //   111: dup
    //   112: istore_0
    //   113: iload #4
    //   115: if_icmpge -> 127
    //   118: aload_2
    //   119: iload_0
    //   120: invokevirtual charAt : (I)C
    //   123: istore_1
    //   124: goto -> 82
    //   127: aload #5
    //   129: putstatic burp/Ztcv.a : [Ljava/lang/String;
    //   132: bipush #30
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Ztcv.b : [Ljava/lang/String;
    //   140: goto -> 300
    //   143: dup_x2
    //   144: pop
    //   145: invokevirtual toCharArray : ()[C
    //   148: dup_x1
    //   149: arraylength
    //   150: dup_x2
    //   151: pop
    //   152: iconst_0
    //   153: istore #6
    //   155: dup2_x1
    //   156: pop2
    //   157: dup_x2
    //   158: iconst_1
    //   159: if_icmpgt -> 260
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #12
    //   214: goto -> 244
    //   217: bipush #63
    //   219: goto -> 244
    //   222: bipush #80
    //   224: goto -> 244
    //   227: bipush #52
    //   229: goto -> 244
    //   232: bipush #72
    //   234: goto -> 244
    //   237: bipush #47
    //   239: goto -> 244
    //   242: bipush #52
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 166
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 162
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 99
    //   300: sipush #-26379
    //   303: sipush #-14519
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Ztcv.Zl : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: bipush #32
    //   318: newarray byte
    //   320: dup
    //   321: iconst_0
    //   322: bipush #99
    //   324: bastore
    //   325: dup
    //   326: iconst_1
    //   327: bipush #39
    //   329: bastore
    //   330: dup
    //   331: iconst_2
    //   332: bipush #50
    //   334: bastore
    //   335: dup
    //   336: iconst_3
    //   337: bipush #76
    //   339: bastore
    //   340: dup
    //   341: iconst_4
    //   342: bipush #66
    //   344: bastore
    //   345: dup
    //   346: iconst_5
    //   347: bipush #-5
    //   349: bastore
    //   350: dup
    //   351: bipush #6
    //   353: bipush #21
    //   355: bastore
    //   356: dup
    //   357: bipush #7
    //   359: bipush #55
    //   361: bastore
    //   362: dup
    //   363: bipush #8
    //   365: bipush #-114
    //   367: bastore
    //   368: dup
    //   369: bipush #9
    //   371: bipush #15
    //   373: bastore
    //   374: dup
    //   375: bipush #10
    //   377: bipush #-40
    //   379: bastore
    //   380: dup
    //   381: bipush #11
    //   383: bipush #-57
    //   385: bastore
    //   386: dup
    //   387: bipush #12
    //   389: bipush #-103
    //   391: bastore
    //   392: dup
    //   393: bipush #13
    //   395: bipush #113
    //   397: bastore
    //   398: dup
    //   399: bipush #14
    //   401: bipush #-54
    //   403: bastore
    //   404: dup
    //   405: bipush #15
    //   407: bipush #99
    //   409: bastore
    //   410: dup
    //   411: bipush #16
    //   413: bipush #26
    //   415: bastore
    //   416: dup
    //   417: bipush #17
    //   419: bipush #-118
    //   421: bastore
    //   422: dup
    //   423: bipush #18
    //   425: bipush #114
    //   427: bastore
    //   428: dup
    //   429: bipush #19
    //   431: bipush #13
    //   433: bastore
    //   434: dup
    //   435: bipush #20
    //   437: bipush #-34
    //   439: bastore
    //   440: dup
    //   441: bipush #21
    //   443: bipush #-38
    //   445: bastore
    //   446: dup
    //   447: bipush #22
    //   449: bipush #-97
    //   451: bastore
    //   452: dup
    //   453: bipush #23
    //   455: bipush #31
    //   457: bastore
    //   458: dup
    //   459: bipush #24
    //   461: bipush #-45
    //   463: bastore
    //   464: dup
    //   465: bipush #25
    //   467: bipush #-45
    //   469: bastore
    //   470: dup
    //   471: bipush #26
    //   473: bipush #-114
    //   475: bastore
    //   476: dup
    //   477: bipush #27
    //   479: bipush #11
    //   481: bastore
    //   482: dup
    //   483: bipush #28
    //   485: bipush #-104
    //   487: bastore
    //   488: dup
    //   489: bipush #29
    //   491: bipush #-64
    //   493: bastore
    //   494: dup
    //   495: bipush #30
    //   497: bipush #-59
    //   499: bastore
    //   500: dup
    //   501: bipush #31
    //   503: bipush #94
    //   505: bastore
    //   506: invokespecial <init> : ([B)V
    //   509: putstatic burp/Ztcv.ZY : Ljava/lang/Object;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF98E6) & 0xFFFF;
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
      byte b1 = 102;
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
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztcv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */