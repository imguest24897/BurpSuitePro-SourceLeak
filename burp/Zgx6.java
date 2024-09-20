package burp;

import java.math.BigInteger;

class Zgx6 extends ClassLoader {
  static String ZX;
  
  static Object Zo;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean Zf(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zz5h.ZD : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: invokevirtual toByteArray : ()[B
    //   13: astore_3
    //   14: new java/lang/StringBuilder
    //   17: dup
    //   18: invokespecial <init> : ()V
    //   21: astore #5
    //   23: aload #5
    //   25: sipush #-12625
    //   28: sipush #13224
    //   31: invokestatic a : (II)Ljava/lang/String;
    //   34: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   37: pop
    //   38: aload_3
    //   39: astore #6
    //   41: aload #6
    //   43: arraylength
    //   44: istore #7
    //   46: iconst_0
    //   47: istore #8
    //   49: iload #8
    //   51: iload #7
    //   53: if_icmpge -> 79
    //   56: aload #6
    //   58: iload #8
    //   60: baload
    //   61: istore #9
    //   63: aload #5
    //   65: iload #9
    //   67: i2c
    //   68: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   71: pop
    //   72: iinc #8, 1
    //   75: iload_2
    //   76: ifeq -> 49
    //   79: aload #5
    //   81: sipush #-12640
    //   84: bipush #-76
    //   86: invokestatic a : (II)Ljava/lang/String;
    //   89: ldc ''
    //   91: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   94: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   97: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: pop
    //   101: aload #5
    //   103: sipush #-12631
    //   106: sipush #7055
    //   109: invokestatic a : (II)Ljava/lang/String;
    //   112: ldc ''
    //   114: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   117: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   120: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   123: pop
    //   124: aload #5
    //   126: invokevirtual toString : ()Ljava/lang/String;
    //   129: invokevirtual getBytes : ()[B
    //   132: astore #4
    //   134: aload #4
    //   136: astore_3
    //   137: aload_3
    //   138: arraylength
    //   139: bipush #8
    //   141: iadd
    //   142: bipush #6
    //   144: ishr
    //   145: iconst_1
    //   146: iadd
    //   147: bipush #16
    //   149: imul
    //   150: newarray int
    //   152: astore #5
    //   154: iconst_0
    //   155: istore #6
    //   157: iload #6
    //   159: aload_3
    //   160: arraylength
    //   161: if_icmpge -> 204
    //   164: aload_3
    //   165: iload #6
    //   167: baload
    //   168: sipush #255
    //   171: iand
    //   172: istore #7
    //   174: aload #5
    //   176: iload #6
    //   178: iconst_2
    //   179: ishr
    //   180: dup2
    //   181: iaload
    //   182: iload #7
    //   184: bipush #24
    //   186: iload #6
    //   188: iconst_4
    //   189: irem
    //   190: bipush #8
    //   192: imul
    //   193: isub
    //   194: ishl
    //   195: ior
    //   196: iastore
    //   197: iinc #6, 1
    //   200: iload_2
    //   201: ifeq -> 157
    //   204: aload #5
    //   206: iload #6
    //   208: iconst_2
    //   209: ishr
    //   210: dup2
    //   211: iaload
    //   212: sipush #128
    //   215: bipush #24
    //   217: iload #6
    //   219: iconst_4
    //   220: irem
    //   221: bipush #8
    //   223: imul
    //   224: isub
    //   225: ishl
    //   226: ior
    //   227: iastore
    //   228: aload #5
    //   230: aload #5
    //   232: arraylength
    //   233: iconst_1
    //   234: isub
    //   235: aload_3
    //   236: arraylength
    //   237: bipush #8
    //   239: imul
    //   240: iastore
    //   241: bipush #80
    //   243: newarray int
    //   245: astore #7
    //   247: ldc 1732584193
    //   249: istore #8
    //   251: ldc -271733879
    //   253: istore #9
    //   255: ldc -1732584194
    //   257: istore #10
    //   259: ldc 271733878
    //   261: istore #11
    //   263: ldc -1009589776
    //   265: istore #12
    //   267: iconst_0
    //   268: istore #6
    //   270: iload #6
    //   272: aload #5
    //   274: arraylength
    //   275: if_icmpge -> 597
    //   278: iload #8
    //   280: istore #13
    //   282: iload #9
    //   284: istore #14
    //   286: iload #10
    //   288: istore #15
    //   290: iload #11
    //   292: istore #16
    //   294: iload #12
    //   296: istore #17
    //   298: iconst_0
    //   299: istore #18
    //   301: iload #18
    //   303: bipush #80
    //   305: if_icmpge -> 555
    //   308: iload #18
    //   310: bipush #16
    //   312: if_icmpge -> 339
    //   315: aload #7
    //   317: iload #18
    //   319: aload #5
    //   321: iload #6
    //   323: iload #18
    //   325: iadd
    //   326: iaload
    //   327: iastore
    //   328: iload_2
    //   329: ifeq -> 394
    //   332: goto -> 339
    //   335: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   338: athrow
    //   339: aload #7
    //   341: iload #18
    //   343: iconst_3
    //   344: isub
    //   345: iaload
    //   346: aload #7
    //   348: iload #18
    //   350: bipush #8
    //   352: isub
    //   353: iaload
    //   354: ixor
    //   355: aload #7
    //   357: iload #18
    //   359: bipush #14
    //   361: isub
    //   362: iaload
    //   363: ixor
    //   364: aload #7
    //   366: iload #18
    //   368: bipush #16
    //   370: isub
    //   371: iaload
    //   372: ixor
    //   373: istore #19
    //   375: iload #19
    //   377: iconst_1
    //   378: ishl
    //   379: iload #19
    //   381: bipush #31
    //   383: iushr
    //   384: ior
    //   385: istore #20
    //   387: aload #7
    //   389: iload #18
    //   391: iload #20
    //   393: iastore
    //   394: iload #8
    //   396: iconst_5
    //   397: ishl
    //   398: iload #8
    //   400: bipush #27
    //   402: iushr
    //   403: ior
    //   404: istore #19
    //   406: iload #19
    //   408: iload #12
    //   410: iadd
    //   411: aload #7
    //   413: iload #18
    //   415: iaload
    //   416: iadd
    //   417: iload #18
    //   419: bipush #20
    //   421: if_icmpge -> 447
    //   424: ldc 1518500249
    //   426: iload #9
    //   428: iload #10
    //   430: iand
    //   431: iload #9
    //   433: iconst_m1
    //   434: ixor
    //   435: iload #11
    //   437: iand
    //   438: ior
    //   439: iadd
    //   440: goto -> 517
    //   443: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   446: athrow
    //   447: iload #18
    //   449: bipush #40
    //   451: if_icmpge -> 472
    //   454: ldc 1859775393
    //   456: iload #9
    //   458: iload #10
    //   460: ixor
    //   461: iload #11
    //   463: ixor
    //   464: iadd
    //   465: goto -> 517
    //   468: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   471: athrow
    //   472: iload #18
    //   474: bipush #60
    //   476: if_icmpge -> 506
    //   479: ldc -1894007588
    //   481: iload #9
    //   483: iload #10
    //   485: iand
    //   486: iload #9
    //   488: iload #11
    //   490: iand
    //   491: ior
    //   492: iload #10
    //   494: iload #11
    //   496: iand
    //   497: ior
    //   498: iadd
    //   499: goto -> 517
    //   502: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   505: athrow
    //   506: ldc -899497514
    //   508: iload #9
    //   510: iload #10
    //   512: ixor
    //   513: iload #11
    //   515: ixor
    //   516: iadd
    //   517: iadd
    //   518: istore #20
    //   520: iload #11
    //   522: istore #12
    //   524: iload #10
    //   526: istore #11
    //   528: iload #9
    //   530: bipush #30
    //   532: ishl
    //   533: iload #9
    //   535: iconst_2
    //   536: iushr
    //   537: ior
    //   538: istore #10
    //   540: iload #8
    //   542: istore #9
    //   544: iload #20
    //   546: istore #8
    //   548: iinc #18, 1
    //   551: iload_2
    //   552: ifeq -> 301
    //   555: iload #8
    //   557: iload #13
    //   559: iadd
    //   560: istore #8
    //   562: iload #9
    //   564: iload #14
    //   566: iadd
    //   567: istore #9
    //   569: iload #10
    //   571: iload #15
    //   573: iadd
    //   574: istore #10
    //   576: iload #11
    //   578: iload #16
    //   580: iadd
    //   581: istore #11
    //   583: iload #12
    //   585: iload #17
    //   587: iadd
    //   588: istore #12
    //   590: iinc #6, 16
    //   593: iload_2
    //   594: ifeq -> 270
    //   597: iconst_5
    //   598: newarray int
    //   600: dup
    //   601: iconst_0
    //   602: iload #8
    //   604: iastore
    //   605: dup
    //   606: iconst_1
    //   607: iload #9
    //   609: iastore
    //   610: dup
    //   611: iconst_2
    //   612: iload #10
    //   614: iastore
    //   615: dup
    //   616: iconst_3
    //   617: iload #11
    //   619: iastore
    //   620: dup
    //   621: iconst_4
    //   622: iload #12
    //   624: iastore
    //   625: astore #13
    //   627: bipush #20
    //   629: newarray byte
    //   631: astore #14
    //   633: iconst_0
    //   634: istore #15
    //   636: iload #15
    //   638: bipush #20
    //   640: if_icmpge -> 681
    //   643: aload #13
    //   645: iload #15
    //   647: iconst_4
    //   648: idiv
    //   649: iaload
    //   650: istore #16
    //   652: iconst_3
    //   653: iload #15
    //   655: iconst_4
    //   656: irem
    //   657: isub
    //   658: bipush #8
    //   660: imul
    //   661: istore #17
    //   663: aload #14
    //   665: iload #15
    //   667: iload #16
    //   669: iload #17
    //   671: iushr
    //   672: i2b
    //   673: bastore
    //   674: iinc #15, 1
    //   677: iload_2
    //   678: ifeq -> 636
    //   681: aload #14
    //   683: astore #4
    //   685: getstatic burp/Zl8l.ZJ : Ljava/lang/Object;
    //   688: checkcast java/math/BigInteger
    //   691: getstatic burp/Zmou.ZT : Ljava/lang/Object;
    //   694: checkcast java/math/BigInteger
    //   697: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   700: putstatic burp/Zgfq.Za : Ljava/lang/Object;
    //   703: getstatic burp/Zg_i.ZQ : Ljava/lang/Object;
    //   706: checkcast java/math/BigInteger
    //   709: invokevirtual toByteArray : ()[B
    //   712: astore_3
    //   713: new java/lang/StringBuilder
    //   716: dup
    //   717: invokespecial <init> : ()V
    //   720: astore #5
    //   722: aload #5
    //   724: sipush #-12633
    //   727: sipush #5741
    //   730: invokestatic a : (II)Ljava/lang/String;
    //   733: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   736: pop
    //   737: aload_3
    //   738: astore #6
    //   740: aload #6
    //   742: arraylength
    //   743: istore #7
    //   745: iconst_0
    //   746: istore #8
    //   748: iload #8
    //   750: iload #7
    //   752: if_icmpge -> 778
    //   755: aload #6
    //   757: iload #8
    //   759: baload
    //   760: istore #9
    //   762: aload #5
    //   764: iload #9
    //   766: i2c
    //   767: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   770: pop
    //   771: iinc #8, 1
    //   774: iload_2
    //   775: ifeq -> 748
    //   778: aload #5
    //   780: sipush #-12629
    //   783: sipush #-15542
    //   786: invokestatic a : (II)Ljava/lang/String;
    //   789: ldc ''
    //   791: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   794: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   797: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   800: pop
    //   801: aload #5
    //   803: sipush #-12630
    //   806: sipush #-21781
    //   809: invokestatic a : (II)Ljava/lang/String;
    //   812: ldc ''
    //   814: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   817: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   820: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   823: pop
    //   824: aload #5
    //   826: invokevirtual toString : ()Ljava/lang/String;
    //   829: invokevirtual getBytes : ()[B
    //   832: astore #4
    //   834: aload #4
    //   836: astore_3
    //   837: aload_3
    //   838: arraylength
    //   839: bipush #8
    //   841: iadd
    //   842: bipush #6
    //   844: ishr
    //   845: iconst_1
    //   846: iadd
    //   847: bipush #16
    //   849: imul
    //   850: newarray int
    //   852: astore #5
    //   854: iconst_0
    //   855: istore #6
    //   857: iload #6
    //   859: aload_3
    //   860: arraylength
    //   861: if_icmpge -> 904
    //   864: aload_3
    //   865: iload #6
    //   867: baload
    //   868: sipush #255
    //   871: iand
    //   872: istore #7
    //   874: aload #5
    //   876: iload #6
    //   878: iconst_2
    //   879: ishr
    //   880: dup2
    //   881: iaload
    //   882: iload #7
    //   884: bipush #24
    //   886: iload #6
    //   888: iconst_4
    //   889: irem
    //   890: bipush #8
    //   892: imul
    //   893: isub
    //   894: ishl
    //   895: ior
    //   896: iastore
    //   897: iinc #6, 1
    //   900: iload_2
    //   901: ifeq -> 857
    //   904: aload #5
    //   906: iload #6
    //   908: iconst_2
    //   909: ishr
    //   910: dup2
    //   911: iaload
    //   912: sipush #128
    //   915: bipush #24
    //   917: iload #6
    //   919: iconst_4
    //   920: irem
    //   921: bipush #8
    //   923: imul
    //   924: isub
    //   925: ishl
    //   926: ior
    //   927: iastore
    //   928: aload #5
    //   930: aload #5
    //   932: arraylength
    //   933: iconst_1
    //   934: isub
    //   935: aload_3
    //   936: arraylength
    //   937: bipush #8
    //   939: imul
    //   940: iastore
    //   941: bipush #80
    //   943: newarray int
    //   945: astore #7
    //   947: ldc 1732584193
    //   949: istore #8
    //   951: ldc -271733879
    //   953: istore #9
    //   955: ldc -1732584194
    //   957: istore #10
    //   959: ldc 271733878
    //   961: istore #11
    //   963: ldc -1009589776
    //   965: istore #12
    //   967: iconst_0
    //   968: istore #6
    //   970: iload #6
    //   972: aload #5
    //   974: arraylength
    //   975: if_icmpge -> 1297
    //   978: iload #8
    //   980: istore #13
    //   982: iload #9
    //   984: istore #14
    //   986: iload #10
    //   988: istore #15
    //   990: iload #11
    //   992: istore #16
    //   994: iload #12
    //   996: istore #17
    //   998: iconst_0
    //   999: istore #18
    //   1001: iload #18
    //   1003: bipush #80
    //   1005: if_icmpge -> 1255
    //   1008: iload #18
    //   1010: bipush #16
    //   1012: if_icmpge -> 1039
    //   1015: aload #7
    //   1017: iload #18
    //   1019: aload #5
    //   1021: iload #6
    //   1023: iload #18
    //   1025: iadd
    //   1026: iaload
    //   1027: iastore
    //   1028: iload_2
    //   1029: ifeq -> 1094
    //   1032: goto -> 1039
    //   1035: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1038: athrow
    //   1039: aload #7
    //   1041: iload #18
    //   1043: iconst_3
    //   1044: isub
    //   1045: iaload
    //   1046: aload #7
    //   1048: iload #18
    //   1050: bipush #8
    //   1052: isub
    //   1053: iaload
    //   1054: ixor
    //   1055: aload #7
    //   1057: iload #18
    //   1059: bipush #14
    //   1061: isub
    //   1062: iaload
    //   1063: ixor
    //   1064: aload #7
    //   1066: iload #18
    //   1068: bipush #16
    //   1070: isub
    //   1071: iaload
    //   1072: ixor
    //   1073: istore #19
    //   1075: iload #19
    //   1077: iconst_1
    //   1078: ishl
    //   1079: iload #19
    //   1081: bipush #31
    //   1083: iushr
    //   1084: ior
    //   1085: istore #20
    //   1087: aload #7
    //   1089: iload #18
    //   1091: iload #20
    //   1093: iastore
    //   1094: iload #8
    //   1096: iconst_5
    //   1097: ishl
    //   1098: iload #8
    //   1100: bipush #27
    //   1102: iushr
    //   1103: ior
    //   1104: istore #19
    //   1106: iload #19
    //   1108: iload #12
    //   1110: iadd
    //   1111: aload #7
    //   1113: iload #18
    //   1115: iaload
    //   1116: iadd
    //   1117: iload #18
    //   1119: bipush #20
    //   1121: if_icmpge -> 1147
    //   1124: ldc 1518500249
    //   1126: iload #9
    //   1128: iload #10
    //   1130: iand
    //   1131: iload #9
    //   1133: iconst_m1
    //   1134: ixor
    //   1135: iload #11
    //   1137: iand
    //   1138: ior
    //   1139: iadd
    //   1140: goto -> 1217
    //   1143: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1146: athrow
    //   1147: iload #18
    //   1149: bipush #40
    //   1151: if_icmpge -> 1172
    //   1154: ldc 1859775393
    //   1156: iload #9
    //   1158: iload #10
    //   1160: ixor
    //   1161: iload #11
    //   1163: ixor
    //   1164: iadd
    //   1165: goto -> 1217
    //   1168: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1171: athrow
    //   1172: iload #18
    //   1174: bipush #60
    //   1176: if_icmpge -> 1206
    //   1179: ldc -1894007588
    //   1181: iload #9
    //   1183: iload #10
    //   1185: iand
    //   1186: iload #9
    //   1188: iload #11
    //   1190: iand
    //   1191: ior
    //   1192: iload #10
    //   1194: iload #11
    //   1196: iand
    //   1197: ior
    //   1198: iadd
    //   1199: goto -> 1217
    //   1202: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1205: athrow
    //   1206: ldc -899497514
    //   1208: iload #9
    //   1210: iload #10
    //   1212: ixor
    //   1213: iload #11
    //   1215: ixor
    //   1216: iadd
    //   1217: iadd
    //   1218: istore #20
    //   1220: iload #11
    //   1222: istore #12
    //   1224: iload #10
    //   1226: istore #11
    //   1228: iload #9
    //   1230: bipush #30
    //   1232: ishl
    //   1233: iload #9
    //   1235: iconst_2
    //   1236: iushr
    //   1237: ior
    //   1238: istore #10
    //   1240: iload #8
    //   1242: istore #9
    //   1244: iload #20
    //   1246: istore #8
    //   1248: iinc #18, 1
    //   1251: iload_2
    //   1252: ifeq -> 1001
    //   1255: iload #8
    //   1257: iload #13
    //   1259: iadd
    //   1260: istore #8
    //   1262: iload #9
    //   1264: iload #14
    //   1266: iadd
    //   1267: istore #9
    //   1269: iload #10
    //   1271: iload #15
    //   1273: iadd
    //   1274: istore #10
    //   1276: iload #11
    //   1278: iload #16
    //   1280: iadd
    //   1281: istore #11
    //   1283: iload #12
    //   1285: iload #17
    //   1287: iadd
    //   1288: istore #12
    //   1290: iinc #6, 16
    //   1293: iload_2
    //   1294: ifeq -> 970
    //   1297: iconst_5
    //   1298: newarray int
    //   1300: dup
    //   1301: iconst_0
    //   1302: iload #8
    //   1304: iastore
    //   1305: dup
    //   1306: iconst_1
    //   1307: iload #9
    //   1309: iastore
    //   1310: dup
    //   1311: iconst_2
    //   1312: iload #10
    //   1314: iastore
    //   1315: dup
    //   1316: iconst_3
    //   1317: iload #11
    //   1319: iastore
    //   1320: dup
    //   1321: iconst_4
    //   1322: iload #12
    //   1324: iastore
    //   1325: astore #13
    //   1327: bipush #20
    //   1329: newarray byte
    //   1331: astore #14
    //   1333: iconst_0
    //   1334: istore #15
    //   1336: iload #15
    //   1338: bipush #20
    //   1340: if_icmpge -> 1381
    //   1343: aload #13
    //   1345: iload #15
    //   1347: iconst_4
    //   1348: idiv
    //   1349: iaload
    //   1350: istore #16
    //   1352: iconst_3
    //   1353: iload #15
    //   1355: iconst_4
    //   1356: irem
    //   1357: isub
    //   1358: bipush #8
    //   1360: imul
    //   1361: istore #17
    //   1363: aload #14
    //   1365: iload #15
    //   1367: iload #16
    //   1369: iload #17
    //   1371: iushr
    //   1372: i2b
    //   1373: bastore
    //   1374: iinc #15, 1
    //   1377: iload_2
    //   1378: ifeq -> 1336
    //   1381: aload #14
    //   1383: astore #4
    //   1385: sipush #-12637
    //   1388: sipush #26930
    //   1391: invokestatic a : (II)Ljava/lang/String;
    //   1394: iconst_1
    //   1395: ldc burp/Zb8_
    //   1397: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1400: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1403: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1406: astore_3
    //   1407: aload_3
    //   1408: arraylength
    //   1409: istore #4
    //   1411: iconst_0
    //   1412: istore #5
    //   1414: iload #5
    //   1416: iload #4
    //   1418: if_icmpge -> 1555
    //   1421: aload_3
    //   1422: iload #5
    //   1424: aaload
    //   1425: astore #6
    //   1427: aload #6
    //   1429: invokevirtual getModifiers : ()I
    //   1432: invokestatic isStatic : (I)Z
    //   1435: ifne -> 1445
    //   1438: goto -> 1548
    //   1441: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1444: athrow
    //   1445: aload #6
    //   1447: invokevirtual getType : ()Ljava/lang/Class;
    //   1450: astore #7
    //   1452: aload #7
    //   1454: ifnull -> 1535
    //   1457: aload #7
    //   1459: invokevirtual isPrimitive : ()Z
    //   1462: ifne -> 1535
    //   1465: goto -> 1472
    //   1468: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1471: athrow
    //   1472: aload #7
    //   1474: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1477: ifnull -> 1535
    //   1480: goto -> 1487
    //   1483: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1486: athrow
    //   1487: aload #7
    //   1489: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1492: invokevirtual getName : ()Ljava/lang/String;
    //   1495: ifnull -> 1535
    //   1498: goto -> 1505
    //   1501: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1504: athrow
    //   1505: aload #7
    //   1507: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1510: invokevirtual getName : ()Ljava/lang/String;
    //   1513: sipush #-12639
    //   1516: sipush #-5241
    //   1519: invokestatic a : (II)Ljava/lang/String;
    //   1522: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1525: ifne -> 1535
    //   1528: goto -> 1535
    //   1531: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1534: athrow
    //   1535: aload #6
    //   1537: iconst_1
    //   1538: invokevirtual setAccessible : (Z)V
    //   1541: aload #6
    //   1543: aconst_null
    //   1544: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1547: pop
    //   1548: iinc #5, 1
    //   1551: iload_2
    //   1552: ifeq -> 1414
    //   1555: sipush #-12636
    //   1558: sipush #-5936
    //   1561: invokestatic a : (II)Ljava/lang/String;
    //   1564: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1567: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1570: astore_3
    //   1571: aload_3
    //   1572: arraylength
    //   1573: istore #4
    //   1575: iconst_0
    //   1576: istore #5
    //   1578: iload #5
    //   1580: iload #4
    //   1582: if_icmpge -> 1714
    //   1585: aload_3
    //   1586: iload #5
    //   1588: aaload
    //   1589: astore #6
    //   1591: aload #6
    //   1593: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1596: pop
    //   1597: aload #6
    //   1599: invokevirtual getModifiers : ()I
    //   1602: invokestatic isStatic : (I)Z
    //   1605: ifeq -> 1700
    //   1608: aload #6
    //   1610: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1613: arraylength
    //   1614: iconst_2
    //   1615: if_icmpne -> 1700
    //   1618: goto -> 1625
    //   1621: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1624: athrow
    //   1625: aload #6
    //   1627: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1630: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1633: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1636: ifeq -> 1700
    //   1639: goto -> 1646
    //   1642: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1645: athrow
    //   1646: aload #6
    //   1648: iconst_1
    //   1649: invokevirtual setAccessible : (Z)V
    //   1652: aload #6
    //   1654: aconst_null
    //   1655: iconst_2
    //   1656: anewarray java/lang/Object
    //   1659: dup
    //   1660: iconst_0
    //   1661: aload_0
    //   1662: aastore
    //   1663: dup
    //   1664: iconst_1
    //   1665: aload_1
    //   1666: ifnonnull -> 1684
    //   1669: goto -> 1676
    //   1672: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1675: athrow
    //   1676: aload_1
    //   1677: goto -> 1691
    //   1680: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1683: athrow
    //   1684: aload_1
    //   1685: checkcast [B
    //   1688: invokevirtual clone : ()Ljava/lang/Object;
    //   1691: aastore
    //   1692: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1695: pop
    //   1696: iload_2
    //   1697: ifeq -> 1714
    //   1700: iinc #5, 1
    //   1703: iload_2
    //   1704: ifeq -> 1578
    //   1707: goto -> 1714
    //   1710: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1713: athrow
    //   1714: getstatic burp/Zzi3.ZS : Ljava/lang/String;
    //   1717: getstatic burp/Zstq.Zf : Ljava/lang/Object;
    //   1720: checkcast java/math/BigInteger
    //   1723: invokevirtual intValue : ()I
    //   1726: bipush #32
    //   1728: irem
    //   1729: invokestatic abs : (I)I
    //   1732: invokevirtual charAt : (I)C
    //   1735: getstatic burp/Zgfq.Zn : Ljava/lang/String;
    //   1738: getstatic burp/Zg_i.ZQ : Ljava/lang/Object;
    //   1741: checkcast java/math/BigInteger
    //   1744: invokevirtual intValue : ()I
    //   1747: bipush #32
    //   1749: irem
    //   1750: invokestatic abs : (I)I
    //   1753: invokevirtual charAt : (I)C
    //   1756: if_icmpgt -> 1863
    //   1759: getstatic burp/Zkby.Zf : Ljava/lang/String;
    //   1762: getstatic burp/Zzi3.ZJ : Ljava/lang/Object;
    //   1765: checkcast java/math/BigInteger
    //   1768: invokevirtual intValue : ()I
    //   1771: bipush #32
    //   1773: irem
    //   1774: invokestatic abs : (I)I
    //   1777: invokevirtual charAt : (I)C
    //   1780: getstatic burp/Zl55.Zp : Ljava/lang/String;
    //   1783: getstatic burp/Zlqy.ZP : Ljava/lang/Object;
    //   1786: checkcast java/math/BigInteger
    //   1789: invokevirtual intValue : ()I
    //   1792: bipush #32
    //   1794: irem
    //   1795: invokestatic abs : (I)I
    //   1798: invokevirtual charAt : (I)C
    //   1801: if_icmpgt -> 1863
    //   1804: goto -> 1811
    //   1807: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1810: athrow
    //   1811: getstatic burp/Zgqp.ZA : Ljava/lang/String;
    //   1814: getstatic burp/Zxzt.ZY : Ljava/lang/Object;
    //   1817: checkcast java/math/BigInteger
    //   1820: invokevirtual intValue : ()I
    //   1823: bipush #32
    //   1825: irem
    //   1826: invokestatic abs : (I)I
    //   1829: invokevirtual charAt : (I)C
    //   1832: getstatic burp/Zgz2.ZI : Ljava/lang/String;
    //   1835: getstatic burp/Zlqq.ZV : Ljava/lang/Object;
    //   1838: checkcast java/math/BigInteger
    //   1841: invokevirtual intValue : ()I
    //   1844: bipush #32
    //   1846: irem
    //   1847: invokestatic abs : (I)I
    //   1850: invokevirtual charAt : (I)C
    //   1853: if_icmple -> 1871
    //   1856: goto -> 1863
    //   1859: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1862: athrow
    //   1863: iconst_1
    //   1864: goto -> 1872
    //   1867: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1870: athrow
    //   1871: iconst_0
    //   1872: ireturn
    //   1873: astore_3
    //   1874: new java/lang/Exception
    //   1877: dup
    //   1878: aload_3
    //   1879: invokevirtual getMessage : ()Ljava/lang/String;
    //   1882: invokespecial <init> : (Ljava/lang/String;)V
    //   1885: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1872	1873	java/lang/Throwable
    //   308	332	335	java/lang/Throwable
    //   406	443	443	java/lang/Throwable
    //   447	468	468	java/lang/Throwable
    //   472	502	502	java/lang/Throwable
    //   1008	1032	1035	java/lang/Throwable
    //   1106	1143	1143	java/lang/Throwable
    //   1147	1168	1168	java/lang/Throwable
    //   1172	1202	1202	java/lang/Throwable
    //   1427	1441	1441	java/lang/Throwable
    //   1452	1465	1468	java/lang/Throwable
    //   1457	1480	1483	java/lang/Throwable
    //   1472	1498	1501	java/lang/Throwable
    //   1487	1528	1531	java/lang/Throwable
    //   1591	1618	1621	java/lang/Throwable
    //   1608	1639	1642	java/lang/Throwable
    //   1625	1669	1672	java/lang/Throwable
    //   1646	1680	1680	java/lang/Throwable
    //   1691	1707	1710	java/lang/Throwable
    //   1714	1804	1807	java/lang/Throwable
    //   1759	1856	1859	java/lang/Throwable
    //   1811	1867	1867	java/lang/Throwable
  }
  
  static void Zt(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void Z_(Object paramObject) {
    Zlfg.Zb = a(-12634, -5447);
    Zlfg.Zv = new BigInteger(a(-12635, -23457));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zmou.ZP.charAt(Math.abs(((BigInteger)Zeoa.ZF).intValue() % 32)) > Zxzt.ZG.charAt(Math.abs(((BigInteger)Zltp.ZT).intValue() % 32))) {
          try {
            Zl1e.Ze(Class.forName(a(-12638, -5946)));
            if (!bool)
              Zmou.ZD(Class.forName(a(-12627, -31778))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zmou.ZD(Class.forName(a(-12627, -31778)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #15
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¨~w\8âZ6ÿ$É6ü4ÃÊãôNQa¿cð©  ªØ¨ñ!U>S¶y'æÐ\\rR÷L¸@þñGóM?Yâzâ»tg±~þ¬SMu$Î>¸Ç\\tàîJíüXí¦½¸GGoÜ?TU/½aøk\\râ"D½÷¡µUÆõëöëÞù\\t÷µ |N7ÅÂ¥\\t?9mÙ¡)\\t¦ê\\nJmhì^Ø6 èÏZ 5ßÄhï¾,ïåQò9^kPÀä_ÅKZüq¤ ÕGºô\\fUúñsËñkU¿(yFàUÕÕ\\tI:'O³\\tÁÖæºÁsÜMøxú÷ë_7Kª!Cô½bÓ+nßM´¾úÅÍÞ©^ögêÂ,`B¥Õ9}z¤Q©}?Öjüóç¤R_e"fÿÞ-'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #32
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #20
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
    //   68: ldc '`Ü$>ûw@à\\tçq½ È´&'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #106
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
    //   129: putstatic burp/Zgx6.a : [Ljava/lang/String;
    //   132: bipush #15
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zgx6.b : [Ljava/lang/String;
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
    //   212: bipush #91
    //   214: goto -> 244
    //   217: bipush #38
    //   219: goto -> 244
    //   222: bipush #127
    //   224: goto -> 244
    //   227: bipush #51
    //   229: goto -> 244
    //   232: bipush #33
    //   234: goto -> 244
    //   237: bipush #108
    //   239: goto -> 244
    //   242: bipush #57
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
    //   300: sipush #-12626
    //   303: sipush #2467
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zgx6.ZX : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: sipush #-12628
    //   319: sipush #-11974
    //   322: invokestatic a : (II)Ljava/lang/String;
    //   325: invokespecial <init> : (Ljava/lang/String;)V
    //   328: putstatic burp/Zgx6.Zo : Ljava/lang/Object;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFCEA7) & 0xFFFF;
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
      byte b1 = 17;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgx6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */