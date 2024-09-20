package burp;

import java.math.BigInteger;

class Zkk2 extends ClassLoader {
  static String ZI;
  
  static Object Zq;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean ZX(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: new java/lang/String
    //   7: dup
    //   8: aload_1
    //   9: checkcast [B
    //   12: invokespecial <init> : ([B)V
    //   15: putstatic burp/Zs0b.ZT : Ljava/lang/String;
    //   18: getstatic burp/Zrd0.Zs : Ljava/lang/Object;
    //   21: checkcast java/math/BigInteger
    //   24: getstatic burp/Zeqw.ZV : Ljava/lang/Object;
    //   27: checkcast java/math/BigInteger
    //   30: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   33: putstatic burp/Zejg.ZR : Ljava/lang/Object;
    //   36: getstatic burp/Zsow.ZV : Ljava/lang/Object;
    //   39: checkcast java/math/BigInteger
    //   42: invokevirtual toByteArray : ()[B
    //   45: astore_3
    //   46: new java/lang/StringBuilder
    //   49: dup
    //   50: invokespecial <init> : ()V
    //   53: astore #5
    //   55: aload #5
    //   57: sipush #9768
    //   60: sipush #-15961
    //   63: invokestatic a : (II)Ljava/lang/String;
    //   66: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   69: pop
    //   70: aload_3
    //   71: astore #6
    //   73: aload #6
    //   75: arraylength
    //   76: istore #7
    //   78: iconst_0
    //   79: istore #8
    //   81: iload #8
    //   83: iload #7
    //   85: if_icmpge -> 111
    //   88: aload #6
    //   90: iload #8
    //   92: baload
    //   93: istore #9
    //   95: aload #5
    //   97: iload #9
    //   99: i2c
    //   100: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   103: pop
    //   104: iinc #8, 1
    //   107: iload_2
    //   108: ifne -> 81
    //   111: aload #5
    //   113: sipush #9763
    //   116: sipush #17537
    //   119: invokestatic a : (II)Ljava/lang/String;
    //   122: ldc ''
    //   124: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   127: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   130: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   133: pop
    //   134: aload #5
    //   136: sipush #9771
    //   139: sipush #-32396
    //   142: invokestatic a : (II)Ljava/lang/String;
    //   145: ldc ''
    //   147: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   150: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   153: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   156: pop
    //   157: aload #5
    //   159: invokevirtual toString : ()Ljava/lang/String;
    //   162: invokevirtual getBytes : ()[B
    //   165: astore #4
    //   167: aload #4
    //   169: astore_3
    //   170: aload_3
    //   171: arraylength
    //   172: bipush #8
    //   174: iadd
    //   175: bipush #6
    //   177: ishr
    //   178: iconst_1
    //   179: iadd
    //   180: bipush #16
    //   182: imul
    //   183: newarray int
    //   185: astore #5
    //   187: iconst_0
    //   188: istore #6
    //   190: iload #6
    //   192: aload_3
    //   193: arraylength
    //   194: if_icmpge -> 237
    //   197: aload_3
    //   198: iload #6
    //   200: baload
    //   201: sipush #255
    //   204: iand
    //   205: istore #7
    //   207: aload #5
    //   209: iload #6
    //   211: iconst_2
    //   212: ishr
    //   213: dup2
    //   214: iaload
    //   215: iload #7
    //   217: bipush #24
    //   219: iload #6
    //   221: iconst_4
    //   222: irem
    //   223: bipush #8
    //   225: imul
    //   226: isub
    //   227: ishl
    //   228: ior
    //   229: iastore
    //   230: iinc #6, 1
    //   233: iload_2
    //   234: ifne -> 190
    //   237: aload #5
    //   239: iload #6
    //   241: iconst_2
    //   242: ishr
    //   243: dup2
    //   244: iaload
    //   245: sipush #128
    //   248: bipush #24
    //   250: iload #6
    //   252: iconst_4
    //   253: irem
    //   254: bipush #8
    //   256: imul
    //   257: isub
    //   258: ishl
    //   259: ior
    //   260: iastore
    //   261: aload #5
    //   263: aload #5
    //   265: arraylength
    //   266: iconst_1
    //   267: isub
    //   268: aload_3
    //   269: arraylength
    //   270: bipush #8
    //   272: imul
    //   273: iastore
    //   274: bipush #80
    //   276: newarray int
    //   278: astore #7
    //   280: ldc 1732584193
    //   282: istore #8
    //   284: ldc -271733879
    //   286: istore #9
    //   288: ldc -1732584194
    //   290: istore #10
    //   292: ldc 271733878
    //   294: istore #11
    //   296: ldc -1009589776
    //   298: istore #12
    //   300: iconst_0
    //   301: istore #6
    //   303: iload #6
    //   305: aload #5
    //   307: arraylength
    //   308: if_icmpge -> 630
    //   311: iload #8
    //   313: istore #13
    //   315: iload #9
    //   317: istore #14
    //   319: iload #10
    //   321: istore #15
    //   323: iload #11
    //   325: istore #16
    //   327: iload #12
    //   329: istore #17
    //   331: iconst_0
    //   332: istore #18
    //   334: iload #18
    //   336: bipush #80
    //   338: if_icmpge -> 588
    //   341: iload #18
    //   343: bipush #16
    //   345: if_icmpge -> 372
    //   348: aload #7
    //   350: iload #18
    //   352: aload #5
    //   354: iload #6
    //   356: iload #18
    //   358: iadd
    //   359: iaload
    //   360: iastore
    //   361: iload_2
    //   362: ifne -> 427
    //   365: goto -> 372
    //   368: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   371: athrow
    //   372: aload #7
    //   374: iload #18
    //   376: iconst_3
    //   377: isub
    //   378: iaload
    //   379: aload #7
    //   381: iload #18
    //   383: bipush #8
    //   385: isub
    //   386: iaload
    //   387: ixor
    //   388: aload #7
    //   390: iload #18
    //   392: bipush #14
    //   394: isub
    //   395: iaload
    //   396: ixor
    //   397: aload #7
    //   399: iload #18
    //   401: bipush #16
    //   403: isub
    //   404: iaload
    //   405: ixor
    //   406: istore #19
    //   408: iload #19
    //   410: iconst_1
    //   411: ishl
    //   412: iload #19
    //   414: bipush #31
    //   416: iushr
    //   417: ior
    //   418: istore #20
    //   420: aload #7
    //   422: iload #18
    //   424: iload #20
    //   426: iastore
    //   427: iload #8
    //   429: iconst_5
    //   430: ishl
    //   431: iload #8
    //   433: bipush #27
    //   435: iushr
    //   436: ior
    //   437: istore #19
    //   439: iload #19
    //   441: iload #12
    //   443: iadd
    //   444: aload #7
    //   446: iload #18
    //   448: iaload
    //   449: iadd
    //   450: iload #18
    //   452: bipush #20
    //   454: if_icmpge -> 480
    //   457: ldc 1518500249
    //   459: iload #9
    //   461: iload #10
    //   463: iand
    //   464: iload #9
    //   466: iconst_m1
    //   467: ixor
    //   468: iload #11
    //   470: iand
    //   471: ior
    //   472: iadd
    //   473: goto -> 550
    //   476: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   479: athrow
    //   480: iload #18
    //   482: bipush #40
    //   484: if_icmpge -> 505
    //   487: ldc 1859775393
    //   489: iload #9
    //   491: iload #10
    //   493: ixor
    //   494: iload #11
    //   496: ixor
    //   497: iadd
    //   498: goto -> 550
    //   501: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   504: athrow
    //   505: iload #18
    //   507: bipush #60
    //   509: if_icmpge -> 539
    //   512: ldc -1894007588
    //   514: iload #9
    //   516: iload #10
    //   518: iand
    //   519: iload #9
    //   521: iload #11
    //   523: iand
    //   524: ior
    //   525: iload #10
    //   527: iload #11
    //   529: iand
    //   530: ior
    //   531: iadd
    //   532: goto -> 550
    //   535: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   538: athrow
    //   539: ldc -899497514
    //   541: iload #9
    //   543: iload #10
    //   545: ixor
    //   546: iload #11
    //   548: ixor
    //   549: iadd
    //   550: iadd
    //   551: istore #20
    //   553: iload #11
    //   555: istore #12
    //   557: iload #10
    //   559: istore #11
    //   561: iload #9
    //   563: bipush #30
    //   565: ishl
    //   566: iload #9
    //   568: iconst_2
    //   569: iushr
    //   570: ior
    //   571: istore #10
    //   573: iload #8
    //   575: istore #9
    //   577: iload #20
    //   579: istore #8
    //   581: iinc #18, 1
    //   584: iload_2
    //   585: ifne -> 334
    //   588: iload #8
    //   590: iload #13
    //   592: iadd
    //   593: istore #8
    //   595: iload #9
    //   597: iload #14
    //   599: iadd
    //   600: istore #9
    //   602: iload #10
    //   604: iload #15
    //   606: iadd
    //   607: istore #10
    //   609: iload #11
    //   611: iload #16
    //   613: iadd
    //   614: istore #11
    //   616: iload #12
    //   618: iload #17
    //   620: iadd
    //   621: istore #12
    //   623: iinc #6, 16
    //   626: iload_2
    //   627: ifne -> 303
    //   630: iconst_5
    //   631: newarray int
    //   633: dup
    //   634: iconst_0
    //   635: iload #8
    //   637: iastore
    //   638: dup
    //   639: iconst_1
    //   640: iload #9
    //   642: iastore
    //   643: dup
    //   644: iconst_2
    //   645: iload #10
    //   647: iastore
    //   648: dup
    //   649: iconst_3
    //   650: iload #11
    //   652: iastore
    //   653: dup
    //   654: iconst_4
    //   655: iload #12
    //   657: iastore
    //   658: astore #13
    //   660: bipush #20
    //   662: newarray byte
    //   664: astore #14
    //   666: iconst_0
    //   667: istore #15
    //   669: iload #15
    //   671: bipush #20
    //   673: if_icmpge -> 714
    //   676: aload #13
    //   678: iload #15
    //   680: iconst_4
    //   681: idiv
    //   682: iaload
    //   683: istore #16
    //   685: iconst_3
    //   686: iload #15
    //   688: iconst_4
    //   689: irem
    //   690: isub
    //   691: bipush #8
    //   693: imul
    //   694: istore #17
    //   696: aload #14
    //   698: iload #15
    //   700: iload #16
    //   702: iload #17
    //   704: iushr
    //   705: i2b
    //   706: bastore
    //   707: iinc #15, 1
    //   710: iload_2
    //   711: ifne -> 669
    //   714: aload #14
    //   716: astore #4
    //   718: getstatic burp/Zxo4.ZV : Ljava/lang/Object;
    //   721: checkcast java/math/BigInteger
    //   724: invokevirtual toByteArray : ()[B
    //   727: astore_3
    //   728: aload_3
    //   729: arraylength
    //   730: iconst_2
    //   731: iadd
    //   732: newarray byte
    //   734: astore #5
    //   736: iconst_0
    //   737: istore #6
    //   739: iload #6
    //   741: aload_3
    //   742: arraylength
    //   743: if_icmpge -> 762
    //   746: aload #5
    //   748: iload #6
    //   750: aload_3
    //   751: iload #6
    //   753: baload
    //   754: bastore
    //   755: iinc #6, 1
    //   758: iload_2
    //   759: ifne -> 739
    //   762: aload #5
    //   764: arraylength
    //   765: iconst_3
    //   766: idiv
    //   767: iconst_4
    //   768: imul
    //   769: newarray byte
    //   771: astore #4
    //   773: iconst_0
    //   774: istore #6
    //   776: iconst_0
    //   777: istore #7
    //   779: iload #6
    //   781: aload_3
    //   782: arraylength
    //   783: if_icmpge -> 894
    //   786: aload #4
    //   788: iload #7
    //   790: aload #5
    //   792: iload #6
    //   794: baload
    //   795: iconst_2
    //   796: iushr
    //   797: bipush #63
    //   799: iand
    //   800: i2b
    //   801: bastore
    //   802: aload #4
    //   804: iload #7
    //   806: iconst_1
    //   807: iadd
    //   808: aload #5
    //   810: iload #6
    //   812: iconst_1
    //   813: iadd
    //   814: baload
    //   815: iconst_4
    //   816: iushr
    //   817: bipush #15
    //   819: iand
    //   820: aload #5
    //   822: iload #6
    //   824: baload
    //   825: iconst_4
    //   826: ishl
    //   827: bipush #63
    //   829: iand
    //   830: ior
    //   831: i2b
    //   832: bastore
    //   833: aload #4
    //   835: iload #7
    //   837: iconst_2
    //   838: iadd
    //   839: aload #5
    //   841: iload #6
    //   843: iconst_2
    //   844: iadd
    //   845: baload
    //   846: bipush #6
    //   848: iushr
    //   849: iconst_3
    //   850: iand
    //   851: aload #5
    //   853: iload #6
    //   855: iconst_1
    //   856: iadd
    //   857: baload
    //   858: iconst_2
    //   859: ishl
    //   860: bipush #63
    //   862: iand
    //   863: ior
    //   864: i2b
    //   865: bastore
    //   866: aload #4
    //   868: iload #7
    //   870: iconst_3
    //   871: iadd
    //   872: aload #5
    //   874: iload #6
    //   876: iconst_2
    //   877: iadd
    //   878: baload
    //   879: bipush #63
    //   881: iand
    //   882: i2b
    //   883: bastore
    //   884: iinc #6, 3
    //   887: iinc #7, 4
    //   890: iload_2
    //   891: ifne -> 779
    //   894: iconst_0
    //   895: istore #6
    //   897: iload #6
    //   899: aload #4
    //   901: arraylength
    //   902: if_icmpge -> 1086
    //   905: aload #4
    //   907: iload #6
    //   909: baload
    //   910: bipush #26
    //   912: if_icmpge -> 940
    //   915: aload #4
    //   917: iload #6
    //   919: aload #4
    //   921: iload #6
    //   923: baload
    //   924: bipush #65
    //   926: iadd
    //   927: i2b
    //   928: bastore
    //   929: iload_2
    //   930: ifne -> 1079
    //   933: goto -> 940
    //   936: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   939: athrow
    //   940: aload #4
    //   942: iload #6
    //   944: baload
    //   945: bipush #52
    //   947: if_icmpge -> 985
    //   950: goto -> 957
    //   953: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   956: athrow
    //   957: aload #4
    //   959: iload #6
    //   961: aload #4
    //   963: iload #6
    //   965: baload
    //   966: bipush #97
    //   968: iadd
    //   969: bipush #26
    //   971: isub
    //   972: i2b
    //   973: bastore
    //   974: iload_2
    //   975: ifne -> 1079
    //   978: goto -> 985
    //   981: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   984: athrow
    //   985: aload #4
    //   987: iload #6
    //   989: baload
    //   990: bipush #62
    //   992: if_icmpge -> 1030
    //   995: goto -> 1002
    //   998: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1001: athrow
    //   1002: aload #4
    //   1004: iload #6
    //   1006: aload #4
    //   1008: iload #6
    //   1010: baload
    //   1011: bipush #48
    //   1013: iadd
    //   1014: bipush #52
    //   1016: isub
    //   1017: i2b
    //   1018: bastore
    //   1019: iload_2
    //   1020: ifne -> 1079
    //   1023: goto -> 1030
    //   1026: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1029: athrow
    //   1030: aload #4
    //   1032: iload #6
    //   1034: baload
    //   1035: bipush #63
    //   1037: if_icmpge -> 1065
    //   1040: goto -> 1047
    //   1043: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1046: athrow
    //   1047: aload #4
    //   1049: iload #6
    //   1051: bipush #43
    //   1053: bastore
    //   1054: iload_2
    //   1055: ifne -> 1079
    //   1058: goto -> 1065
    //   1061: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1064: athrow
    //   1065: aload #4
    //   1067: iload #6
    //   1069: bipush #47
    //   1071: bastore
    //   1072: goto -> 1079
    //   1075: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1078: athrow
    //   1079: iinc #6, 1
    //   1082: iload_2
    //   1083: ifne -> 897
    //   1086: aload #4
    //   1088: arraylength
    //   1089: iconst_1
    //   1090: isub
    //   1091: istore #6
    //   1093: iload #6
    //   1095: aload_3
    //   1096: arraylength
    //   1097: iconst_4
    //   1098: imul
    //   1099: iconst_3
    //   1100: idiv
    //   1101: if_icmple -> 1118
    //   1104: aload #4
    //   1106: iload #6
    //   1108: bipush #61
    //   1110: bastore
    //   1111: iinc #6, -1
    //   1114: iload_2
    //   1115: ifne -> 1093
    //   1118: new java/math/BigInteger
    //   1121: dup
    //   1122: aload #4
    //   1124: invokespecial <init> : ([B)V
    //   1127: invokevirtual abs : ()Ljava/math/BigInteger;
    //   1130: putstatic burp/Ztp.Zp : Ljava/lang/Object;
    //   1133: sipush #9769
    //   1136: sipush #-16534
    //   1139: invokestatic a : (II)Ljava/lang/String;
    //   1142: iconst_1
    //   1143: ldc burp/Zxwl
    //   1145: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1148: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1151: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1154: astore_3
    //   1155: aload_3
    //   1156: arraylength
    //   1157: istore #4
    //   1159: iconst_0
    //   1160: istore #5
    //   1162: iload #5
    //   1164: iload #4
    //   1166: if_icmpge -> 1303
    //   1169: aload_3
    //   1170: iload #5
    //   1172: aaload
    //   1173: astore #6
    //   1175: aload #6
    //   1177: invokevirtual getModifiers : ()I
    //   1180: invokestatic isStatic : (I)Z
    //   1183: ifne -> 1193
    //   1186: goto -> 1296
    //   1189: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1192: athrow
    //   1193: aload #6
    //   1195: invokevirtual getType : ()Ljava/lang/Class;
    //   1198: astore #7
    //   1200: aload #7
    //   1202: ifnull -> 1283
    //   1205: aload #7
    //   1207: invokevirtual isPrimitive : ()Z
    //   1210: ifne -> 1283
    //   1213: goto -> 1220
    //   1216: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1219: athrow
    //   1220: aload #7
    //   1222: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1225: ifnull -> 1283
    //   1228: goto -> 1235
    //   1231: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1234: athrow
    //   1235: aload #7
    //   1237: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1240: invokevirtual getName : ()Ljava/lang/String;
    //   1243: ifnull -> 1283
    //   1246: goto -> 1253
    //   1249: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1252: athrow
    //   1253: aload #7
    //   1255: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1258: invokevirtual getName : ()Ljava/lang/String;
    //   1261: sipush #9761
    //   1264: sipush #-30522
    //   1267: invokestatic a : (II)Ljava/lang/String;
    //   1270: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1273: ifne -> 1283
    //   1276: goto -> 1283
    //   1279: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1282: athrow
    //   1283: aload #6
    //   1285: iconst_1
    //   1286: invokevirtual setAccessible : (Z)V
    //   1289: aload #6
    //   1291: aconst_null
    //   1292: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1295: pop
    //   1296: iinc #5, 1
    //   1299: iload_2
    //   1300: ifne -> 1162
    //   1303: sipush #9762
    //   1306: sipush #-11804
    //   1309: invokestatic a : (II)Ljava/lang/String;
    //   1312: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1315: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1318: astore_3
    //   1319: aload_3
    //   1320: arraylength
    //   1321: istore #4
    //   1323: iconst_0
    //   1324: istore #5
    //   1326: iload #5
    //   1328: iload #4
    //   1330: if_icmpge -> 1459
    //   1333: aload_3
    //   1334: iload #5
    //   1336: aaload
    //   1337: astore #6
    //   1339: aload #6
    //   1341: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1344: pop
    //   1345: aload #6
    //   1347: invokevirtual getModifiers : ()I
    //   1350: invokestatic isStatic : (I)Z
    //   1353: ifeq -> 1445
    //   1356: aload #6
    //   1358: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1361: arraylength
    //   1362: iconst_2
    //   1363: if_icmpne -> 1445
    //   1366: goto -> 1373
    //   1369: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1372: athrow
    //   1373: aload #6
    //   1375: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1378: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1381: if_acmpne -> 1445
    //   1384: goto -> 1391
    //   1387: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1390: athrow
    //   1391: aload #6
    //   1393: iconst_1
    //   1394: invokevirtual setAccessible : (Z)V
    //   1397: aload #6
    //   1399: aconst_null
    //   1400: iconst_2
    //   1401: anewarray java/lang/Object
    //   1404: dup
    //   1405: iconst_0
    //   1406: aload_0
    //   1407: aastore
    //   1408: dup
    //   1409: iconst_1
    //   1410: aload_1
    //   1411: ifnonnull -> 1429
    //   1414: goto -> 1421
    //   1417: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1420: athrow
    //   1421: aload_1
    //   1422: goto -> 1436
    //   1425: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1428: athrow
    //   1429: aload_1
    //   1430: checkcast [B
    //   1433: invokevirtual clone : ()Ljava/lang/Object;
    //   1436: aastore
    //   1437: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1440: pop
    //   1441: iload_2
    //   1442: ifne -> 1459
    //   1445: iinc #5, 1
    //   1448: iload_2
    //   1449: ifne -> 1326
    //   1452: goto -> 1459
    //   1455: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1458: athrow
    //   1459: sipush #9774
    //   1462: sipush #-26884
    //   1465: invokestatic a : (II)Ljava/lang/String;
    //   1468: iconst_1
    //   1469: ldc burp/Zgfm
    //   1471: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1474: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1477: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1480: astore_3
    //   1481: aload_3
    //   1482: arraylength
    //   1483: istore #4
    //   1485: iconst_0
    //   1486: istore #5
    //   1488: iload #5
    //   1490: iload #4
    //   1492: if_icmpge -> 1629
    //   1495: aload_3
    //   1496: iload #5
    //   1498: aaload
    //   1499: astore #6
    //   1501: aload #6
    //   1503: invokevirtual getModifiers : ()I
    //   1506: invokestatic isStatic : (I)Z
    //   1509: ifne -> 1519
    //   1512: goto -> 1622
    //   1515: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1518: athrow
    //   1519: aload #6
    //   1521: invokevirtual getType : ()Ljava/lang/Class;
    //   1524: astore #7
    //   1526: aload #7
    //   1528: ifnull -> 1609
    //   1531: aload #7
    //   1533: invokevirtual isPrimitive : ()Z
    //   1536: ifne -> 1609
    //   1539: goto -> 1546
    //   1542: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1545: athrow
    //   1546: aload #7
    //   1548: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1551: ifnull -> 1609
    //   1554: goto -> 1561
    //   1557: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1560: athrow
    //   1561: aload #7
    //   1563: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1566: invokevirtual getName : ()Ljava/lang/String;
    //   1569: ifnull -> 1609
    //   1572: goto -> 1579
    //   1575: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1578: athrow
    //   1579: aload #7
    //   1581: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1584: invokevirtual getName : ()Ljava/lang/String;
    //   1587: sipush #9773
    //   1590: sipush #3621
    //   1593: invokestatic a : (II)Ljava/lang/String;
    //   1596: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1599: ifne -> 1609
    //   1602: goto -> 1609
    //   1605: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1608: athrow
    //   1609: aload #6
    //   1611: iconst_1
    //   1612: invokevirtual setAccessible : (Z)V
    //   1615: aload #6
    //   1617: aconst_null
    //   1618: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1621: pop
    //   1622: iinc #5, 1
    //   1625: iload_2
    //   1626: ifne -> 1488
    //   1629: sipush #9772
    //   1632: sipush #17660
    //   1635: invokestatic a : (II)Ljava/lang/String;
    //   1638: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1641: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1644: astore_3
    //   1645: aload_3
    //   1646: arraylength
    //   1647: istore #4
    //   1649: iconst_0
    //   1650: istore #5
    //   1652: iload #5
    //   1654: iload #4
    //   1656: if_icmpge -> 1788
    //   1659: aload_3
    //   1660: iload #5
    //   1662: aaload
    //   1663: astore #6
    //   1665: aload #6
    //   1667: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1670: pop
    //   1671: aload #6
    //   1673: invokevirtual getModifiers : ()I
    //   1676: invokestatic isStatic : (I)Z
    //   1679: ifeq -> 1774
    //   1682: aload #6
    //   1684: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1687: arraylength
    //   1688: iconst_2
    //   1689: if_icmpne -> 1774
    //   1692: goto -> 1699
    //   1695: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1698: athrow
    //   1699: aload #6
    //   1701: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1704: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1707: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1710: ifeq -> 1774
    //   1713: goto -> 1720
    //   1716: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1719: athrow
    //   1720: aload #6
    //   1722: iconst_1
    //   1723: invokevirtual setAccessible : (Z)V
    //   1726: aload #6
    //   1728: aconst_null
    //   1729: iconst_2
    //   1730: anewarray java/lang/Object
    //   1733: dup
    //   1734: iconst_0
    //   1735: aload_0
    //   1736: aastore
    //   1737: dup
    //   1738: iconst_1
    //   1739: aload_1
    //   1740: ifnonnull -> 1758
    //   1743: goto -> 1750
    //   1746: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1749: athrow
    //   1750: aload_1
    //   1751: goto -> 1765
    //   1754: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1757: athrow
    //   1758: aload_1
    //   1759: checkcast [B
    //   1762: invokevirtual clone : ()Ljava/lang/Object;
    //   1765: aastore
    //   1766: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1769: pop
    //   1770: iload_2
    //   1771: ifne -> 1788
    //   1774: iinc #5, 1
    //   1777: iload_2
    //   1778: ifne -> 1652
    //   1781: goto -> 1788
    //   1784: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1787: athrow
    //   1788: iconst_0
    //   1789: istore_3
    //   1790: sipush #9760
    //   1793: sipush #13477
    //   1796: invokestatic a : (II)Ljava/lang/String;
    //   1799: iconst_1
    //   1800: ldc burp/Zk52
    //   1802: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1805: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1808: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1811: astore #4
    //   1813: aload #4
    //   1815: arraylength
    //   1816: istore #5
    //   1818: iconst_0
    //   1819: istore #6
    //   1821: iload #6
    //   1823: iload #5
    //   1825: if_icmpge -> 1963
    //   1828: aload #4
    //   1830: iload #6
    //   1832: aaload
    //   1833: astore #7
    //   1835: aload #7
    //   1837: invokevirtual getModifiers : ()I
    //   1840: invokestatic isStatic : (I)Z
    //   1843: ifne -> 1853
    //   1846: goto -> 1956
    //   1849: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1852: athrow
    //   1853: aload #7
    //   1855: invokevirtual getType : ()Ljava/lang/Class;
    //   1858: astore #8
    //   1860: aload #8
    //   1862: ifnull -> 1943
    //   1865: aload #8
    //   1867: invokevirtual isPrimitive : ()Z
    //   1870: ifne -> 1943
    //   1873: goto -> 1880
    //   1876: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1879: athrow
    //   1880: aload #8
    //   1882: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1885: ifnull -> 1943
    //   1888: goto -> 1895
    //   1891: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1894: athrow
    //   1895: aload #8
    //   1897: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1900: invokevirtual getName : ()Ljava/lang/String;
    //   1903: ifnull -> 1943
    //   1906: goto -> 1913
    //   1909: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1912: athrow
    //   1913: aload #8
    //   1915: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1918: invokevirtual getName : ()Ljava/lang/String;
    //   1921: sipush #9773
    //   1924: sipush #3621
    //   1927: invokestatic a : (II)Ljava/lang/String;
    //   1930: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1933: ifne -> 1943
    //   1936: goto -> 1943
    //   1939: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1942: athrow
    //   1943: aload #7
    //   1945: iconst_1
    //   1946: invokevirtual setAccessible : (Z)V
    //   1949: aload #7
    //   1951: aconst_null
    //   1952: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1955: pop
    //   1956: iinc #6, 1
    //   1959: iload_2
    //   1960: ifne -> 1821
    //   1963: sipush #9770
    //   1966: sipush #22911
    //   1969: invokestatic a : (II)Ljava/lang/String;
    //   1972: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1975: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1978: astore #4
    //   1980: aload #4
    //   1982: arraylength
    //   1983: istore #5
    //   1985: iconst_0
    //   1986: istore #6
    //   1988: iload #6
    //   1990: iload #5
    //   1992: if_icmpge -> 2128
    //   1995: aload #4
    //   1997: iload #6
    //   1999: aaload
    //   2000: astore #7
    //   2002: aload #7
    //   2004: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2007: pop
    //   2008: aload #7
    //   2010: invokevirtual getModifiers : ()I
    //   2013: invokestatic isStatic : (I)Z
    //   2016: ifeq -> 2114
    //   2019: aload #7
    //   2021: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2024: arraylength
    //   2025: iconst_2
    //   2026: if_icmpne -> 2114
    //   2029: goto -> 2036
    //   2032: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2035: athrow
    //   2036: aload #7
    //   2038: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2041: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2044: if_acmpne -> 2114
    //   2047: goto -> 2054
    //   2050: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2053: athrow
    //   2054: aload #7
    //   2056: iconst_1
    //   2057: invokevirtual setAccessible : (Z)V
    //   2060: aload #7
    //   2062: aconst_null
    //   2063: iconst_2
    //   2064: anewarray java/lang/Object
    //   2067: dup
    //   2068: iconst_0
    //   2069: aload_0
    //   2070: aastore
    //   2071: dup
    //   2072: iconst_1
    //   2073: aload_1
    //   2074: ifnonnull -> 2092
    //   2077: goto -> 2084
    //   2080: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2083: athrow
    //   2084: aload_1
    //   2085: goto -> 2099
    //   2088: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2091: athrow
    //   2092: aload_1
    //   2093: checkcast [B
    //   2096: invokevirtual clone : ()Ljava/lang/Object;
    //   2099: aastore
    //   2100: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2103: checkcast java/lang/Boolean
    //   2106: invokevirtual booleanValue : ()Z
    //   2109: istore_3
    //   2110: iload_2
    //   2111: ifne -> 2128
    //   2114: iinc #6, 1
    //   2117: iload_2
    //   2118: ifne -> 1988
    //   2121: goto -> 2128
    //   2124: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2127: athrow
    //   2128: iload_3
    //   2129: ireturn
    //   2130: astore_3
    //   2131: new java/lang/Exception
    //   2134: dup
    //   2135: aload_3
    //   2136: invokevirtual getMessage : ()Ljava/lang/String;
    //   2139: invokespecial <init> : (Ljava/lang/String;)V
    //   2142: athrow
    // Exception table:
    //   from	to	target	type
    //   4	2129	2130	java/lang/Throwable
    //   341	365	368	java/lang/Throwable
    //   439	476	476	java/lang/Throwable
    //   480	501	501	java/lang/Throwable
    //   505	535	535	java/lang/Throwable
    //   905	933	936	java/lang/Throwable
    //   915	950	953	java/lang/Throwable
    //   940	978	981	java/lang/Throwable
    //   957	995	998	java/lang/Throwable
    //   985	1023	1026	java/lang/Throwable
    //   1002	1040	1043	java/lang/Throwable
    //   1030	1058	1061	java/lang/Throwable
    //   1047	1072	1075	java/lang/Throwable
    //   1175	1189	1189	java/lang/Throwable
    //   1200	1213	1216	java/lang/Throwable
    //   1205	1228	1231	java/lang/Throwable
    //   1220	1246	1249	java/lang/Throwable
    //   1235	1276	1279	java/lang/Throwable
    //   1339	1366	1369	java/lang/Throwable
    //   1356	1384	1387	java/lang/Throwable
    //   1373	1414	1417	java/lang/Throwable
    //   1391	1425	1425	java/lang/Throwable
    //   1436	1452	1455	java/lang/Throwable
    //   1501	1515	1515	java/lang/Throwable
    //   1526	1539	1542	java/lang/Throwable
    //   1531	1554	1557	java/lang/Throwable
    //   1546	1572	1575	java/lang/Throwable
    //   1561	1602	1605	java/lang/Throwable
    //   1665	1692	1695	java/lang/Throwable
    //   1682	1713	1716	java/lang/Throwable
    //   1699	1743	1746	java/lang/Throwable
    //   1720	1754	1754	java/lang/Throwable
    //   1765	1781	1784	java/lang/Throwable
    //   1835	1849	1849	java/lang/Throwable
    //   1860	1873	1876	java/lang/Throwable
    //   1865	1888	1891	java/lang/Throwable
    //   1880	1906	1909	java/lang/Throwable
    //   1895	1936	1939	java/lang/Throwable
    //   2002	2029	2032	java/lang/Throwable
    //   2019	2047	2050	java/lang/Throwable
    //   2036	2077	2080	java/lang/Throwable
    //   2054	2088	2088	java/lang/Throwable
    //   2110	2121	2124	java/lang/Throwable
  }
  
  static void ZP(Object paramObject) {
    Zrpm.ZG = a(9781, -14635);
    Zrpm.ZR = new BigInteger(a(9764, 2775));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zgjj.Zi.charAt(Math.abs(((BigInteger)Zl8i.ZY).intValue() % 32)) <= Zrpm.ZG.charAt(Math.abs(((BigInteger)Zl8i.ZY).intValue() % 32))) {
          try {
            Zm3s.Zx(Class.forName(a(9765, 9463)));
            if (!bool)
              Zgia.ZR(Class.forName(a(9775, 16316))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zgia.ZR(Class.forName(a(9775, 16316)));
    } catch (Throwable throwable) {}
  }
  
  static void ZA(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #17
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ê±Q©Mx;Fð`m½PPåxyZÉÞX8¤9|Ð¬öU¿äÀÓ5Ï)à¯¼\\bUÊ\\t>W#¦Ìü¦¨£µÙ${lììéä44  ;'×+&í3"©îÔÓáD)¾m¦\\fd¨%£ï£ àLPkÃ\Qfãc/ð¿Róf@ÆúUIBmÄ\\rj<F:e¢dÜò³Âù2LB½(õ¨Y¢"5((\\bÖ\\fbî/IÀ1ÜÂøy? \\tyÝ\\\tG´®ª9i±[ñèÞ\Ý\\t£®í9Q\\f®êq.\\tv\½³ná\\t\\tyáåNe\\t üs§·Ú o\\t».ýYS\\týÔ ¼åXÝï\{Ävk÷àiÜ\\fx²>{?áÀKnU\\tw³ZØd8Ý'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #40
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
    //   68: ldc 'wËL/Ý± wM!ü¾Íy6@Ä¿9?jI[äÍï¡Ñ·ð¾³'
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
    //   129: putstatic burp/Zkk2.a : [Ljava/lang/String;
    //   132: bipush #17
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zkk2.b : [Ljava/lang/String;
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
    //   212: bipush #40
    //   214: goto -> 244
    //   217: bipush #93
    //   219: goto -> 244
    //   222: bipush #7
    //   224: goto -> 244
    //   227: bipush #21
    //   229: goto -> 244
    //   232: bipush #6
    //   234: goto -> 244
    //   237: bipush #71
    //   239: goto -> 244
    //   242: bipush #72
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
    //   300: sipush #9767
    //   303: sipush #-31731
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zkk2.ZI : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: sipush #9766
    //   319: sipush #-27697
    //   322: invokestatic a : (II)Ljava/lang/String;
    //   325: invokespecial <init> : (Ljava/lang/String;)V
    //   328: putstatic burp/Zkk2.Zq : Ljava/lang/Object;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x2625) & 0xFFFF;
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
      byte b1 = 114;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkk2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */