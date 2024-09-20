package burp;

import java.math.BigInteger;

class Zgwq extends ClassLoader {
  static String ZV;
  
  static Object Ze;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean ZH(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: ldc2_w 8682522807148012
    //   7: invokestatic currentTimeMillis : ()J
    //   10: lxor
    //   11: lstore #4
    //   13: lload #4
    //   15: ldc2_w 25214903917
    //   18: lmul
    //   19: ldc2_w 11
    //   22: ladd
    //   23: ldc2_w 281474976710655
    //   26: land
    //   27: lstore #4
    //   29: lload #4
    //   31: bipush #32
    //   33: lshl
    //   34: lstore #6
    //   36: lload #4
    //   38: ldc2_w 25214903917
    //   41: lmul
    //   42: ldc2_w 11
    //   45: ladd
    //   46: ldc2_w 281474976710655
    //   49: land
    //   50: lstore #4
    //   52: lload #6
    //   54: lload #4
    //   56: ladd
    //   57: lstore #6
    //   59: bipush #16
    //   61: newarray byte
    //   63: dup
    //   64: iconst_0
    //   65: bipush #48
    //   67: bastore
    //   68: dup
    //   69: iconst_1
    //   70: bipush #49
    //   72: bastore
    //   73: dup
    //   74: iconst_2
    //   75: bipush #50
    //   77: bastore
    //   78: dup
    //   79: iconst_3
    //   80: bipush #51
    //   82: bastore
    //   83: dup
    //   84: iconst_4
    //   85: bipush #52
    //   87: bastore
    //   88: dup
    //   89: iconst_5
    //   90: bipush #53
    //   92: bastore
    //   93: dup
    //   94: bipush #6
    //   96: bipush #54
    //   98: bastore
    //   99: dup
    //   100: bipush #7
    //   102: bipush #55
    //   104: bastore
    //   105: dup
    //   106: bipush #8
    //   108: bipush #56
    //   110: bastore
    //   111: dup
    //   112: bipush #9
    //   114: bipush #57
    //   116: bastore
    //   117: dup
    //   118: bipush #10
    //   120: bipush #97
    //   122: bastore
    //   123: dup
    //   124: bipush #11
    //   126: bipush #98
    //   128: bastore
    //   129: dup
    //   130: bipush #12
    //   132: bipush #99
    //   134: bastore
    //   135: dup
    //   136: bipush #13
    //   138: bipush #100
    //   140: bastore
    //   141: dup
    //   142: bipush #14
    //   144: bipush #101
    //   146: bastore
    //   147: dup
    //   148: bipush #15
    //   150: bipush #102
    //   152: bastore
    //   153: astore #8
    //   155: bipush #64
    //   157: newarray byte
    //   159: astore #9
    //   161: bipush #64
    //   163: istore #10
    //   165: bipush #16
    //   167: istore #11
    //   169: iload #11
    //   171: iconst_1
    //   172: isub
    //   173: i2l
    //   174: lstore #12
    //   176: aload #9
    //   178: iinc #10, -1
    //   181: iload #10
    //   183: aload #8
    //   185: lload #6
    //   187: lload #12
    //   189: land
    //   190: l2i
    //   191: baload
    //   192: bastore
    //   193: lload #6
    //   195: iconst_4
    //   196: lushr
    //   197: lstore #6
    //   199: lload #6
    //   201: lconst_0
    //   202: lcmp
    //   203: ifne -> 176
    //   206: bipush #64
    //   208: iload #10
    //   210: isub
    //   211: newarray byte
    //   213: astore_3
    //   214: iconst_0
    //   215: istore #14
    //   217: iload #14
    //   219: aload_3
    //   220: arraylength
    //   221: if_icmpge -> 243
    //   224: aload_3
    //   225: iload #14
    //   227: aload #9
    //   229: iload #10
    //   231: iload #14
    //   233: iadd
    //   234: baload
    //   235: bastore
    //   236: iinc #14, 1
    //   239: iload_2
    //   240: ifne -> 217
    //   243: aload_3
    //   244: arraylength
    //   245: bipush #10
    //   247: if_icmplt -> 13
    //   250: getstatic burp/Zltb.ZL : Ljava/lang/Object;
    //   253: checkcast java/math/BigInteger
    //   256: invokevirtual toByteArray : ()[B
    //   259: astore_3
    //   260: aload_3
    //   261: arraylength
    //   262: bipush #8
    //   264: iadd
    //   265: bipush #6
    //   267: ishr
    //   268: iconst_1
    //   269: iadd
    //   270: bipush #16
    //   272: imul
    //   273: newarray int
    //   275: astore #5
    //   277: iconst_0
    //   278: istore #6
    //   280: iload #6
    //   282: aload_3
    //   283: arraylength
    //   284: if_icmpge -> 327
    //   287: aload_3
    //   288: iload #6
    //   290: baload
    //   291: sipush #255
    //   294: iand
    //   295: istore #7
    //   297: aload #5
    //   299: iload #6
    //   301: iconst_2
    //   302: ishr
    //   303: dup2
    //   304: iaload
    //   305: iload #7
    //   307: bipush #24
    //   309: iload #6
    //   311: iconst_4
    //   312: irem
    //   313: bipush #8
    //   315: imul
    //   316: isub
    //   317: ishl
    //   318: ior
    //   319: iastore
    //   320: iinc #6, 1
    //   323: iload_2
    //   324: ifne -> 280
    //   327: aload #5
    //   329: iload #6
    //   331: iconst_2
    //   332: ishr
    //   333: dup2
    //   334: iaload
    //   335: sipush #128
    //   338: bipush #24
    //   340: iload #6
    //   342: iconst_4
    //   343: irem
    //   344: bipush #8
    //   346: imul
    //   347: isub
    //   348: ishl
    //   349: ior
    //   350: iastore
    //   351: aload #5
    //   353: aload #5
    //   355: arraylength
    //   356: iconst_1
    //   357: isub
    //   358: aload_3
    //   359: arraylength
    //   360: bipush #8
    //   362: imul
    //   363: iastore
    //   364: bipush #80
    //   366: newarray int
    //   368: astore #7
    //   370: ldc 1732584193
    //   372: istore #8
    //   374: ldc -271733879
    //   376: istore #9
    //   378: ldc -1732584194
    //   380: istore #10
    //   382: ldc 271733878
    //   384: istore #11
    //   386: ldc -1009589776
    //   388: istore #12
    //   390: iconst_0
    //   391: istore #6
    //   393: iload #6
    //   395: aload #5
    //   397: arraylength
    //   398: if_icmpge -> 720
    //   401: iload #8
    //   403: istore #13
    //   405: iload #9
    //   407: istore #14
    //   409: iload #10
    //   411: istore #15
    //   413: iload #11
    //   415: istore #16
    //   417: iload #12
    //   419: istore #17
    //   421: iconst_0
    //   422: istore #18
    //   424: iload #18
    //   426: bipush #80
    //   428: if_icmpge -> 678
    //   431: iload #18
    //   433: bipush #16
    //   435: if_icmpge -> 462
    //   438: aload #7
    //   440: iload #18
    //   442: aload #5
    //   444: iload #6
    //   446: iload #18
    //   448: iadd
    //   449: iaload
    //   450: iastore
    //   451: iload_2
    //   452: ifne -> 517
    //   455: goto -> 462
    //   458: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   461: athrow
    //   462: aload #7
    //   464: iload #18
    //   466: iconst_3
    //   467: isub
    //   468: iaload
    //   469: aload #7
    //   471: iload #18
    //   473: bipush #8
    //   475: isub
    //   476: iaload
    //   477: ixor
    //   478: aload #7
    //   480: iload #18
    //   482: bipush #14
    //   484: isub
    //   485: iaload
    //   486: ixor
    //   487: aload #7
    //   489: iload #18
    //   491: bipush #16
    //   493: isub
    //   494: iaload
    //   495: ixor
    //   496: istore #19
    //   498: iload #19
    //   500: iconst_1
    //   501: ishl
    //   502: iload #19
    //   504: bipush #31
    //   506: iushr
    //   507: ior
    //   508: istore #20
    //   510: aload #7
    //   512: iload #18
    //   514: iload #20
    //   516: iastore
    //   517: iload #8
    //   519: iconst_5
    //   520: ishl
    //   521: iload #8
    //   523: bipush #27
    //   525: iushr
    //   526: ior
    //   527: istore #19
    //   529: iload #19
    //   531: iload #12
    //   533: iadd
    //   534: aload #7
    //   536: iload #18
    //   538: iaload
    //   539: iadd
    //   540: iload #18
    //   542: bipush #20
    //   544: if_icmpge -> 570
    //   547: ldc 1518500249
    //   549: iload #9
    //   551: iload #10
    //   553: iand
    //   554: iload #9
    //   556: iconst_m1
    //   557: ixor
    //   558: iload #11
    //   560: iand
    //   561: ior
    //   562: iadd
    //   563: goto -> 640
    //   566: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   569: athrow
    //   570: iload #18
    //   572: bipush #40
    //   574: if_icmpge -> 595
    //   577: ldc 1859775393
    //   579: iload #9
    //   581: iload #10
    //   583: ixor
    //   584: iload #11
    //   586: ixor
    //   587: iadd
    //   588: goto -> 640
    //   591: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   594: athrow
    //   595: iload #18
    //   597: bipush #60
    //   599: if_icmpge -> 629
    //   602: ldc -1894007588
    //   604: iload #9
    //   606: iload #10
    //   608: iand
    //   609: iload #9
    //   611: iload #11
    //   613: iand
    //   614: ior
    //   615: iload #10
    //   617: iload #11
    //   619: iand
    //   620: ior
    //   621: iadd
    //   622: goto -> 640
    //   625: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   628: athrow
    //   629: ldc -899497514
    //   631: iload #9
    //   633: iload #10
    //   635: ixor
    //   636: iload #11
    //   638: ixor
    //   639: iadd
    //   640: iadd
    //   641: istore #20
    //   643: iload #11
    //   645: istore #12
    //   647: iload #10
    //   649: istore #11
    //   651: iload #9
    //   653: bipush #30
    //   655: ishl
    //   656: iload #9
    //   658: iconst_2
    //   659: iushr
    //   660: ior
    //   661: istore #10
    //   663: iload #8
    //   665: istore #9
    //   667: iload #20
    //   669: istore #8
    //   671: iinc #18, 1
    //   674: iload_2
    //   675: ifne -> 424
    //   678: iload #8
    //   680: iload #13
    //   682: iadd
    //   683: istore #8
    //   685: iload #9
    //   687: iload #14
    //   689: iadd
    //   690: istore #9
    //   692: iload #10
    //   694: iload #15
    //   696: iadd
    //   697: istore #10
    //   699: iload #11
    //   701: iload #16
    //   703: iadd
    //   704: istore #11
    //   706: iload #12
    //   708: iload #17
    //   710: iadd
    //   711: istore #12
    //   713: iinc #6, 16
    //   716: iload_2
    //   717: ifne -> 393
    //   720: iconst_5
    //   721: newarray int
    //   723: dup
    //   724: iconst_0
    //   725: iload #8
    //   727: iastore
    //   728: dup
    //   729: iconst_1
    //   730: iload #9
    //   732: iastore
    //   733: dup
    //   734: iconst_2
    //   735: iload #10
    //   737: iastore
    //   738: dup
    //   739: iconst_3
    //   740: iload #11
    //   742: iastore
    //   743: dup
    //   744: iconst_4
    //   745: iload #12
    //   747: iastore
    //   748: astore #13
    //   750: bipush #20
    //   752: newarray byte
    //   754: astore #14
    //   756: iconst_0
    //   757: istore #15
    //   759: iload #15
    //   761: bipush #20
    //   763: if_icmpge -> 804
    //   766: aload #13
    //   768: iload #15
    //   770: iconst_4
    //   771: idiv
    //   772: iaload
    //   773: istore #16
    //   775: iconst_3
    //   776: iload #15
    //   778: iconst_4
    //   779: irem
    //   780: isub
    //   781: bipush #8
    //   783: imul
    //   784: istore #17
    //   786: aload #14
    //   788: iload #15
    //   790: iload #16
    //   792: iload #17
    //   794: iushr
    //   795: i2b
    //   796: bastore
    //   797: iinc #15, 1
    //   800: iload_2
    //   801: ifne -> 759
    //   804: aload #14
    //   806: astore #4
    //   808: new java/math/BigInteger
    //   811: dup
    //   812: aload #4
    //   814: invokespecial <init> : ([B)V
    //   817: invokevirtual abs : ()Ljava/math/BigInteger;
    //   820: putstatic burp/Ztd6.ZI : Ljava/lang/Object;
    //   823: getstatic burp/Zkku.Zz : Ljava/lang/Object;
    //   826: checkcast java/math/BigInteger
    //   829: invokevirtual toByteArray : ()[B
    //   832: astore_3
    //   833: aload_3
    //   834: arraylength
    //   835: bipush #8
    //   837: iadd
    //   838: bipush #6
    //   840: ishr
    //   841: iconst_1
    //   842: iadd
    //   843: bipush #16
    //   845: imul
    //   846: newarray int
    //   848: astore #5
    //   850: iconst_0
    //   851: istore #6
    //   853: iload #6
    //   855: aload_3
    //   856: arraylength
    //   857: if_icmpge -> 900
    //   860: aload_3
    //   861: iload #6
    //   863: baload
    //   864: sipush #255
    //   867: iand
    //   868: istore #7
    //   870: aload #5
    //   872: iload #6
    //   874: iconst_2
    //   875: ishr
    //   876: dup2
    //   877: iaload
    //   878: iload #7
    //   880: bipush #24
    //   882: iload #6
    //   884: iconst_4
    //   885: irem
    //   886: bipush #8
    //   888: imul
    //   889: isub
    //   890: ishl
    //   891: ior
    //   892: iastore
    //   893: iinc #6, 1
    //   896: iload_2
    //   897: ifne -> 853
    //   900: aload #5
    //   902: iload #6
    //   904: iconst_2
    //   905: ishr
    //   906: dup2
    //   907: iaload
    //   908: sipush #128
    //   911: bipush #24
    //   913: iload #6
    //   915: iconst_4
    //   916: irem
    //   917: bipush #8
    //   919: imul
    //   920: isub
    //   921: ishl
    //   922: ior
    //   923: iastore
    //   924: aload #5
    //   926: aload #5
    //   928: arraylength
    //   929: iconst_1
    //   930: isub
    //   931: aload_3
    //   932: arraylength
    //   933: bipush #8
    //   935: imul
    //   936: iastore
    //   937: bipush #80
    //   939: newarray int
    //   941: astore #7
    //   943: ldc 1732584193
    //   945: istore #8
    //   947: ldc -271733879
    //   949: istore #9
    //   951: ldc -1732584194
    //   953: istore #10
    //   955: ldc 271733878
    //   957: istore #11
    //   959: ldc -1009589776
    //   961: istore #12
    //   963: iconst_0
    //   964: istore #6
    //   966: iload #6
    //   968: aload #5
    //   970: arraylength
    //   971: if_icmpge -> 1293
    //   974: iload #8
    //   976: istore #13
    //   978: iload #9
    //   980: istore #14
    //   982: iload #10
    //   984: istore #15
    //   986: iload #11
    //   988: istore #16
    //   990: iload #12
    //   992: istore #17
    //   994: iconst_0
    //   995: istore #18
    //   997: iload #18
    //   999: bipush #80
    //   1001: if_icmpge -> 1251
    //   1004: iload #18
    //   1006: bipush #16
    //   1008: if_icmpge -> 1035
    //   1011: aload #7
    //   1013: iload #18
    //   1015: aload #5
    //   1017: iload #6
    //   1019: iload #18
    //   1021: iadd
    //   1022: iaload
    //   1023: iastore
    //   1024: iload_2
    //   1025: ifne -> 1090
    //   1028: goto -> 1035
    //   1031: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1034: athrow
    //   1035: aload #7
    //   1037: iload #18
    //   1039: iconst_3
    //   1040: isub
    //   1041: iaload
    //   1042: aload #7
    //   1044: iload #18
    //   1046: bipush #8
    //   1048: isub
    //   1049: iaload
    //   1050: ixor
    //   1051: aload #7
    //   1053: iload #18
    //   1055: bipush #14
    //   1057: isub
    //   1058: iaload
    //   1059: ixor
    //   1060: aload #7
    //   1062: iload #18
    //   1064: bipush #16
    //   1066: isub
    //   1067: iaload
    //   1068: ixor
    //   1069: istore #19
    //   1071: iload #19
    //   1073: iconst_1
    //   1074: ishl
    //   1075: iload #19
    //   1077: bipush #31
    //   1079: iushr
    //   1080: ior
    //   1081: istore #20
    //   1083: aload #7
    //   1085: iload #18
    //   1087: iload #20
    //   1089: iastore
    //   1090: iload #8
    //   1092: iconst_5
    //   1093: ishl
    //   1094: iload #8
    //   1096: bipush #27
    //   1098: iushr
    //   1099: ior
    //   1100: istore #19
    //   1102: iload #19
    //   1104: iload #12
    //   1106: iadd
    //   1107: aload #7
    //   1109: iload #18
    //   1111: iaload
    //   1112: iadd
    //   1113: iload #18
    //   1115: bipush #20
    //   1117: if_icmpge -> 1143
    //   1120: ldc 1518500249
    //   1122: iload #9
    //   1124: iload #10
    //   1126: iand
    //   1127: iload #9
    //   1129: iconst_m1
    //   1130: ixor
    //   1131: iload #11
    //   1133: iand
    //   1134: ior
    //   1135: iadd
    //   1136: goto -> 1213
    //   1139: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1142: athrow
    //   1143: iload #18
    //   1145: bipush #40
    //   1147: if_icmpge -> 1168
    //   1150: ldc 1859775393
    //   1152: iload #9
    //   1154: iload #10
    //   1156: ixor
    //   1157: iload #11
    //   1159: ixor
    //   1160: iadd
    //   1161: goto -> 1213
    //   1164: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1167: athrow
    //   1168: iload #18
    //   1170: bipush #60
    //   1172: if_icmpge -> 1202
    //   1175: ldc -1894007588
    //   1177: iload #9
    //   1179: iload #10
    //   1181: iand
    //   1182: iload #9
    //   1184: iload #11
    //   1186: iand
    //   1187: ior
    //   1188: iload #10
    //   1190: iload #11
    //   1192: iand
    //   1193: ior
    //   1194: iadd
    //   1195: goto -> 1213
    //   1198: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1201: athrow
    //   1202: ldc -899497514
    //   1204: iload #9
    //   1206: iload #10
    //   1208: ixor
    //   1209: iload #11
    //   1211: ixor
    //   1212: iadd
    //   1213: iadd
    //   1214: istore #20
    //   1216: iload #11
    //   1218: istore #12
    //   1220: iload #10
    //   1222: istore #11
    //   1224: iload #9
    //   1226: bipush #30
    //   1228: ishl
    //   1229: iload #9
    //   1231: iconst_2
    //   1232: iushr
    //   1233: ior
    //   1234: istore #10
    //   1236: iload #8
    //   1238: istore #9
    //   1240: iload #20
    //   1242: istore #8
    //   1244: iinc #18, 1
    //   1247: iload_2
    //   1248: ifne -> 997
    //   1251: iload #8
    //   1253: iload #13
    //   1255: iadd
    //   1256: istore #8
    //   1258: iload #9
    //   1260: iload #14
    //   1262: iadd
    //   1263: istore #9
    //   1265: iload #10
    //   1267: iload #15
    //   1269: iadd
    //   1270: istore #10
    //   1272: iload #11
    //   1274: iload #16
    //   1276: iadd
    //   1277: istore #11
    //   1279: iload #12
    //   1281: iload #17
    //   1283: iadd
    //   1284: istore #12
    //   1286: iinc #6, 16
    //   1289: iload_2
    //   1290: ifne -> 966
    //   1293: iconst_5
    //   1294: newarray int
    //   1296: dup
    //   1297: iconst_0
    //   1298: iload #8
    //   1300: iastore
    //   1301: dup
    //   1302: iconst_1
    //   1303: iload #9
    //   1305: iastore
    //   1306: dup
    //   1307: iconst_2
    //   1308: iload #10
    //   1310: iastore
    //   1311: dup
    //   1312: iconst_3
    //   1313: iload #11
    //   1315: iastore
    //   1316: dup
    //   1317: iconst_4
    //   1318: iload #12
    //   1320: iastore
    //   1321: astore #13
    //   1323: bipush #20
    //   1325: newarray byte
    //   1327: astore #14
    //   1329: iconst_0
    //   1330: istore #15
    //   1332: iload #15
    //   1334: bipush #20
    //   1336: if_icmpge -> 1377
    //   1339: aload #13
    //   1341: iload #15
    //   1343: iconst_4
    //   1344: idiv
    //   1345: iaload
    //   1346: istore #16
    //   1348: iconst_3
    //   1349: iload #15
    //   1351: iconst_4
    //   1352: irem
    //   1353: isub
    //   1354: bipush #8
    //   1356: imul
    //   1357: istore #17
    //   1359: aload #14
    //   1361: iload #15
    //   1363: iload #16
    //   1365: iload #17
    //   1367: iushr
    //   1368: i2b
    //   1369: bastore
    //   1370: iinc #15, 1
    //   1373: iload_2
    //   1374: ifne -> 1332
    //   1377: aload #14
    //   1379: astore #4
    //   1381: sipush #7447
    //   1384: new java/math/BigInteger
    //   1387: dup
    //   1388: aload #4
    //   1390: invokespecial <init> : ([B)V
    //   1393: invokevirtual abs : ()Ljava/math/BigInteger;
    //   1396: putstatic burp/Zlyf.Zm : Ljava/lang/Object;
    //   1399: sipush #-320
    //   1402: invokestatic a : (II)Ljava/lang/String;
    //   1405: iconst_1
    //   1406: ldc burp/Ztdx
    //   1408: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1411: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1414: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1417: astore_3
    //   1418: aload_3
    //   1419: arraylength
    //   1420: istore #4
    //   1422: iconst_0
    //   1423: istore #5
    //   1425: iload #5
    //   1427: iload #4
    //   1429: if_icmpge -> 1566
    //   1432: aload_3
    //   1433: iload #5
    //   1435: aaload
    //   1436: astore #6
    //   1438: aload #6
    //   1440: invokevirtual getModifiers : ()I
    //   1443: invokestatic isStatic : (I)Z
    //   1446: ifne -> 1456
    //   1449: goto -> 1559
    //   1452: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1455: athrow
    //   1456: aload #6
    //   1458: invokevirtual getType : ()Ljava/lang/Class;
    //   1461: astore #7
    //   1463: aload #7
    //   1465: ifnull -> 1546
    //   1468: aload #7
    //   1470: invokevirtual isPrimitive : ()Z
    //   1473: ifne -> 1546
    //   1476: goto -> 1483
    //   1479: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1482: athrow
    //   1483: aload #7
    //   1485: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1488: ifnull -> 1546
    //   1491: goto -> 1498
    //   1494: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1497: athrow
    //   1498: aload #7
    //   1500: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1503: invokevirtual getName : ()Ljava/lang/String;
    //   1506: ifnull -> 1546
    //   1509: goto -> 1516
    //   1512: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1515: athrow
    //   1516: aload #7
    //   1518: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1521: invokevirtual getName : ()Ljava/lang/String;
    //   1524: sipush #7450
    //   1527: sipush #295
    //   1530: invokestatic a : (II)Ljava/lang/String;
    //   1533: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1536: ifne -> 1546
    //   1539: goto -> 1546
    //   1542: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1545: athrow
    //   1546: aload #6
    //   1548: iconst_1
    //   1549: invokevirtual setAccessible : (Z)V
    //   1552: aload #6
    //   1554: aconst_null
    //   1555: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1558: pop
    //   1559: iinc #5, 1
    //   1562: iload_2
    //   1563: ifne -> 1425
    //   1566: sipush #7442
    //   1569: sipush #394
    //   1572: invokestatic a : (II)Ljava/lang/String;
    //   1575: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1578: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1581: astore_3
    //   1582: aload_3
    //   1583: arraylength
    //   1584: istore #4
    //   1586: iconst_0
    //   1587: istore #5
    //   1589: iload #5
    //   1591: iload #4
    //   1593: if_icmpge -> 1725
    //   1596: aload_3
    //   1597: iload #5
    //   1599: aaload
    //   1600: astore #6
    //   1602: aload #6
    //   1604: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1607: pop
    //   1608: aload #6
    //   1610: invokevirtual getModifiers : ()I
    //   1613: invokestatic isStatic : (I)Z
    //   1616: ifeq -> 1711
    //   1619: aload #6
    //   1621: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1624: arraylength
    //   1625: iconst_2
    //   1626: if_icmpne -> 1711
    //   1629: goto -> 1636
    //   1632: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1635: athrow
    //   1636: aload #6
    //   1638: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1641: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1644: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1647: ifeq -> 1711
    //   1650: goto -> 1657
    //   1653: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1656: athrow
    //   1657: aload #6
    //   1659: iconst_1
    //   1660: invokevirtual setAccessible : (Z)V
    //   1663: aload #6
    //   1665: aconst_null
    //   1666: iconst_2
    //   1667: anewarray java/lang/Object
    //   1670: dup
    //   1671: iconst_0
    //   1672: aload_0
    //   1673: aastore
    //   1674: dup
    //   1675: iconst_1
    //   1676: aload_1
    //   1677: ifnonnull -> 1695
    //   1680: goto -> 1687
    //   1683: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1686: athrow
    //   1687: aload_1
    //   1688: goto -> 1702
    //   1691: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1694: athrow
    //   1695: aload_1
    //   1696: checkcast [B
    //   1699: invokevirtual clone : ()Ljava/lang/Object;
    //   1702: aastore
    //   1703: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1706: pop
    //   1707: iload_2
    //   1708: ifne -> 1725
    //   1711: iinc #5, 1
    //   1714: iload_2
    //   1715: ifne -> 1589
    //   1718: goto -> 1725
    //   1721: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1724: athrow
    //   1725: getstatic burp/Ztd6.Zu : Ljava/lang/String;
    //   1728: getstatic burp/Zty3.Zz : Ljava/lang/Object;
    //   1731: checkcast java/math/BigInteger
    //   1734: invokevirtual intValue : ()I
    //   1737: bipush #32
    //   1739: irem
    //   1740: invokestatic abs : (I)I
    //   1743: invokevirtual charAt : (I)C
    //   1746: getstatic burp/Zzwl.Zy : Ljava/lang/String;
    //   1749: getstatic burp/Ztes.ZX : Ljava/lang/Object;
    //   1752: checkcast java/math/BigInteger
    //   1755: invokevirtual intValue : ()I
    //   1758: bipush #32
    //   1760: irem
    //   1761: invokestatic abs : (I)I
    //   1764: invokevirtual charAt : (I)C
    //   1767: if_icmpgt -> 1874
    //   1770: getstatic burp/Zzwl.Zy : Ljava/lang/String;
    //   1773: getstatic burp/Zsin.Za : Ljava/lang/Object;
    //   1776: checkcast java/math/BigInteger
    //   1779: invokevirtual intValue : ()I
    //   1782: bipush #32
    //   1784: irem
    //   1785: invokestatic abs : (I)I
    //   1788: invokevirtual charAt : (I)C
    //   1791: getstatic burp/Zzy5.ZD : Ljava/lang/String;
    //   1794: getstatic burp/Zgdt.Zb : Ljava/lang/Object;
    //   1797: checkcast java/math/BigInteger
    //   1800: invokevirtual intValue : ()I
    //   1803: bipush #32
    //   1805: irem
    //   1806: invokestatic abs : (I)I
    //   1809: invokevirtual charAt : (I)C
    //   1812: if_icmple -> 1874
    //   1815: goto -> 1822
    //   1818: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1821: athrow
    //   1822: getstatic burp/Zzv.Zy : Ljava/lang/String;
    //   1825: getstatic burp/Zkku.Zz : Ljava/lang/Object;
    //   1828: checkcast java/math/BigInteger
    //   1831: invokevirtual intValue : ()I
    //   1834: bipush #32
    //   1836: irem
    //   1837: invokestatic abs : (I)I
    //   1840: invokevirtual charAt : (I)C
    //   1843: getstatic burp/Zz58.ZT : Ljava/lang/String;
    //   1846: getstatic burp/Zxoa.Zr : Ljava/lang/Object;
    //   1849: checkcast java/math/BigInteger
    //   1852: invokevirtual intValue : ()I
    //   1855: bipush #32
    //   1857: irem
    //   1858: invokestatic abs : (I)I
    //   1861: invokevirtual charAt : (I)C
    //   1864: if_icmple -> 1882
    //   1867: goto -> 1874
    //   1870: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1873: athrow
    //   1874: iconst_1
    //   1875: goto -> 1883
    //   1878: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1881: athrow
    //   1882: iconst_0
    //   1883: ireturn
    //   1884: astore_3
    //   1885: new java/lang/Exception
    //   1888: dup
    //   1889: aload_3
    //   1890: invokevirtual getMessage : ()Ljava/lang/String;
    //   1893: invokespecial <init> : (Ljava/lang/String;)V
    //   1896: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1883	1884	java/lang/Throwable
    //   431	455	458	java/lang/Throwable
    //   529	566	566	java/lang/Throwable
    //   570	591	591	java/lang/Throwable
    //   595	625	625	java/lang/Throwable
    //   1004	1028	1031	java/lang/Throwable
    //   1102	1139	1139	java/lang/Throwable
    //   1143	1164	1164	java/lang/Throwable
    //   1168	1198	1198	java/lang/Throwable
    //   1438	1452	1452	java/lang/Throwable
    //   1463	1476	1479	java/lang/Throwable
    //   1468	1491	1494	java/lang/Throwable
    //   1483	1509	1512	java/lang/Throwable
    //   1498	1539	1542	java/lang/Throwable
    //   1602	1629	1632	java/lang/Throwable
    //   1619	1650	1653	java/lang/Throwable
    //   1636	1680	1683	java/lang/Throwable
    //   1657	1691	1691	java/lang/Throwable
    //   1702	1718	1721	java/lang/Throwable
    //   1725	1815	1818	java/lang/Throwable
    //   1770	1867	1870	java/lang/Throwable
    //   1822	1878	1878	java/lang/Throwable
  }
  
  static void ZN(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void ZE(Object paramObject) {
    Zs36.Zr = a(7440, -21881);
    Zs36.Zs = new BigInteger(a(7446, -27446));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zmjr.Zc.charAt(Math.abs(((BigInteger)Zlno.ZU).intValue() % 32)) <= Zs36.Zr.charAt(Math.abs(((BigInteger)Zeyt.ZR).intValue() % 32))) {
          try {
            Ztte.ZN(Class.forName(a(7443, 1641)));
            if (bool)
              Zghe.ZV(Class.forName(a(7445, -29831))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zghe.ZV(Class.forName(a(7445, -29831)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'åP"EûpÇ8\\t%\\fë>¥ !0 ^\\nöDº&ôÕ¡8ÞälÈHË èÓÞ3`| ²gò#Î;IY©-\:ônð!ËÉ\ü}L)8×H Mìâqò¤Ý\}ÚÝ£ªôN46§výlvTZ£ïR§è0»®þ'Lvì!¸èÈh%M \\bèÒIïlþTã^å\\f:Eí½g\\t¹S©%|)FýMîv¡ätl©C©ÑêÚóÞ;¦½d2cÙ]B'!&ØFÛëVa~·k6¬é,ÍÚ°ÃÆ!pÉ)¸,ìÆ6×¥ñf3'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #22
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
    //   68: ldc ':\\bñf©<x2_KßW'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #31
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
    //   129: putstatic burp/Zgwq.a : [Ljava/lang/String;
    //   132: bipush #9
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zgwq.b : [Ljava/lang/String;
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
    //   212: bipush #32
    //   214: goto -> 244
    //   217: bipush #27
    //   219: goto -> 244
    //   222: bipush #18
    //   224: goto -> 244
    //   227: bipush #83
    //   229: goto -> 244
    //   232: bipush #59
    //   234: goto -> 244
    //   237: bipush #66
    //   239: goto -> 244
    //   242: bipush #71
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
    //   300: sipush #7441
    //   303: sipush #-30888
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zgwq.ZV : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: sipush #7444
    //   319: sipush #928
    //   322: invokestatic a : (II)Ljava/lang/String;
    //   325: invokespecial <init> : (Ljava/lang/String;)V
    //   328: putstatic burp/Zgwq.Ze : Ljava/lang/Object;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x1D12) & 0xFFFF;
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
      char c = '×';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgwq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */