package burp;

import java.math.BigInteger;

class Zb3p extends ClassLoader {
  static Object Zx;
  
  static String ZX;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean ZS(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zs6g.Zq : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: invokevirtual toByteArray : ()[B
    //   13: astore_3
    //   14: iconst_0
    //   15: istore #5
    //   17: iconst_0
    //   18: istore #6
    //   20: iload #6
    //   22: aload_3
    //   23: arraylength
    //   24: if_icmpge -> 169
    //   27: aload_3
    //   28: iload #6
    //   30: baload
    //   31: istore #7
    //   33: iload #7
    //   35: bipush #48
    //   37: if_icmplt -> 54
    //   40: iload #7
    //   42: bipush #57
    //   44: if_icmple -> 152
    //   47: goto -> 54
    //   50: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   53: athrow
    //   54: iload #7
    //   56: bipush #65
    //   58: if_icmplt -> 82
    //   61: goto -> 68
    //   64: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   67: athrow
    //   68: iload #7
    //   70: bipush #90
    //   72: if_icmple -> 152
    //   75: goto -> 82
    //   78: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   81: athrow
    //   82: iload #7
    //   84: bipush #97
    //   86: if_icmplt -> 110
    //   89: goto -> 96
    //   92: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   95: athrow
    //   96: iload #7
    //   98: bipush #122
    //   100: if_icmple -> 152
    //   103: goto -> 110
    //   106: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   109: athrow
    //   110: iload #7
    //   112: bipush #43
    //   114: if_icmpeq -> 152
    //   117: goto -> 124
    //   120: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   123: athrow
    //   124: iload #7
    //   126: bipush #47
    //   128: if_icmpeq -> 152
    //   131: goto -> 138
    //   134: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   137: athrow
    //   138: iload #7
    //   140: bipush #61
    //   142: if_icmpne -> 162
    //   145: goto -> 152
    //   148: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   151: athrow
    //   152: iinc #5, 1
    //   155: goto -> 162
    //   158: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   161: athrow
    //   162: iinc #6, 1
    //   165: iload_2
    //   166: ifne -> 20
    //   169: iload #5
    //   171: newarray byte
    //   173: astore #6
    //   175: iconst_0
    //   176: istore #7
    //   178: iconst_0
    //   179: istore #8
    //   181: iload #8
    //   183: aload_3
    //   184: arraylength
    //   185: if_icmpge -> 337
    //   188: aload_3
    //   189: iload #8
    //   191: baload
    //   192: istore #9
    //   194: iload #9
    //   196: bipush #48
    //   198: if_icmplt -> 215
    //   201: iload #9
    //   203: bipush #57
    //   205: if_icmple -> 313
    //   208: goto -> 215
    //   211: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   214: athrow
    //   215: iload #9
    //   217: bipush #65
    //   219: if_icmplt -> 243
    //   222: goto -> 229
    //   225: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   228: athrow
    //   229: iload #9
    //   231: bipush #90
    //   233: if_icmple -> 313
    //   236: goto -> 243
    //   239: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   242: athrow
    //   243: iload #9
    //   245: bipush #97
    //   247: if_icmplt -> 271
    //   250: goto -> 257
    //   253: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   256: athrow
    //   257: iload #9
    //   259: bipush #122
    //   261: if_icmple -> 313
    //   264: goto -> 271
    //   267: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   270: athrow
    //   271: iload #9
    //   273: bipush #43
    //   275: if_icmpeq -> 313
    //   278: goto -> 285
    //   281: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   284: athrow
    //   285: iload #9
    //   287: bipush #47
    //   289: if_icmpeq -> 313
    //   292: goto -> 299
    //   295: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   298: athrow
    //   299: iload #9
    //   301: bipush #61
    //   303: if_icmpne -> 330
    //   306: goto -> 313
    //   309: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   312: athrow
    //   313: aload #6
    //   315: iload #7
    //   317: iload #9
    //   319: bastore
    //   320: iinc #7, 1
    //   323: goto -> 330
    //   326: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   329: athrow
    //   330: iinc #8, 1
    //   333: iload_2
    //   334: ifne -> 181
    //   337: aload #6
    //   339: astore #4
    //   341: aload #4
    //   343: astore_3
    //   344: aload_3
    //   345: arraylength
    //   346: istore #5
    //   348: aload_3
    //   349: iload #5
    //   351: iconst_1
    //   352: isub
    //   353: baload
    //   354: bipush #61
    //   356: if_icmpne -> 366
    //   359: iinc #5, -1
    //   362: iload_2
    //   363: ifne -> 348
    //   366: iload #5
    //   368: aload_3
    //   369: arraylength
    //   370: iconst_4
    //   371: idiv
    //   372: isub
    //   373: newarray byte
    //   375: astore #6
    //   377: iconst_0
    //   378: istore #7
    //   380: iload #7
    //   382: aload_3
    //   383: arraylength
    //   384: if_icmpge -> 646
    //   387: aload_3
    //   388: iload #7
    //   390: baload
    //   391: bipush #61
    //   393: if_icmpne -> 412
    //   396: aload_3
    //   397: iload #7
    //   399: iconst_0
    //   400: bastore
    //   401: iload_2
    //   402: ifne -> 639
    //   405: goto -> 412
    //   408: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   411: athrow
    //   412: aload_3
    //   413: iload #7
    //   415: baload
    //   416: bipush #47
    //   418: if_icmpne -> 445
    //   421: goto -> 428
    //   424: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   427: athrow
    //   428: aload_3
    //   429: iload #7
    //   431: bipush #63
    //   433: bastore
    //   434: iload_2
    //   435: ifne -> 639
    //   438: goto -> 445
    //   441: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   444: athrow
    //   445: aload_3
    //   446: iload #7
    //   448: baload
    //   449: bipush #43
    //   451: if_icmpne -> 478
    //   454: goto -> 461
    //   457: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   460: athrow
    //   461: aload_3
    //   462: iload #7
    //   464: bipush #62
    //   466: bastore
    //   467: iload_2
    //   468: ifne -> 639
    //   471: goto -> 478
    //   474: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   477: athrow
    //   478: aload_3
    //   479: iload #7
    //   481: baload
    //   482: bipush #48
    //   484: if_icmplt -> 533
    //   487: goto -> 494
    //   490: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   493: athrow
    //   494: aload_3
    //   495: iload #7
    //   497: baload
    //   498: bipush #57
    //   500: if_icmpgt -> 533
    //   503: goto -> 510
    //   506: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   509: athrow
    //   510: aload_3
    //   511: iload #7
    //   513: aload_3
    //   514: iload #7
    //   516: baload
    //   517: bipush #-4
    //   519: isub
    //   520: i2b
    //   521: bastore
    //   522: iload_2
    //   523: ifne -> 639
    //   526: goto -> 533
    //   529: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   532: athrow
    //   533: aload_3
    //   534: iload #7
    //   536: baload
    //   537: bipush #97
    //   539: if_icmplt -> 588
    //   542: goto -> 549
    //   545: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   548: athrow
    //   549: aload_3
    //   550: iload #7
    //   552: baload
    //   553: bipush #122
    //   555: if_icmpgt -> 588
    //   558: goto -> 565
    //   561: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   564: athrow
    //   565: aload_3
    //   566: iload #7
    //   568: aload_3
    //   569: iload #7
    //   571: baload
    //   572: bipush #71
    //   574: isub
    //   575: i2b
    //   576: bastore
    //   577: iload_2
    //   578: ifne -> 639
    //   581: goto -> 588
    //   584: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   587: athrow
    //   588: aload_3
    //   589: iload #7
    //   591: baload
    //   592: bipush #65
    //   594: if_icmplt -> 639
    //   597: goto -> 604
    //   600: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   603: athrow
    //   604: aload_3
    //   605: iload #7
    //   607: baload
    //   608: bipush #90
    //   610: if_icmpgt -> 639
    //   613: goto -> 620
    //   616: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   619: athrow
    //   620: aload_3
    //   621: iload #7
    //   623: aload_3
    //   624: iload #7
    //   626: baload
    //   627: bipush #65
    //   629: isub
    //   630: i2b
    //   631: bastore
    //   632: goto -> 639
    //   635: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   638: athrow
    //   639: iinc #7, 1
    //   642: iload_2
    //   643: ifne -> 380
    //   646: iconst_0
    //   647: istore #7
    //   649: iconst_0
    //   650: istore #8
    //   652: iload #8
    //   654: aload #6
    //   656: arraylength
    //   657: iconst_2
    //   658: isub
    //   659: if_icmpge -> 762
    //   662: aload #6
    //   664: iload #8
    //   666: aload_3
    //   667: iload #7
    //   669: baload
    //   670: iconst_2
    //   671: ishl
    //   672: sipush #255
    //   675: iand
    //   676: aload_3
    //   677: iload #7
    //   679: iconst_1
    //   680: iadd
    //   681: baload
    //   682: iconst_4
    //   683: iushr
    //   684: iconst_3
    //   685: iand
    //   686: ior
    //   687: i2b
    //   688: bastore
    //   689: aload #6
    //   691: iload #8
    //   693: iconst_1
    //   694: iadd
    //   695: aload_3
    //   696: iload #7
    //   698: iconst_1
    //   699: iadd
    //   700: baload
    //   701: iconst_4
    //   702: ishl
    //   703: sipush #255
    //   706: iand
    //   707: aload_3
    //   708: iload #7
    //   710: iconst_2
    //   711: iadd
    //   712: baload
    //   713: iconst_2
    //   714: iushr
    //   715: bipush #15
    //   717: iand
    //   718: ior
    //   719: i2b
    //   720: bastore
    //   721: aload #6
    //   723: iload #8
    //   725: iconst_2
    //   726: iadd
    //   727: aload_3
    //   728: iload #7
    //   730: iconst_2
    //   731: iadd
    //   732: baload
    //   733: bipush #6
    //   735: ishl
    //   736: sipush #255
    //   739: iand
    //   740: aload_3
    //   741: iload #7
    //   743: iconst_3
    //   744: iadd
    //   745: baload
    //   746: bipush #63
    //   748: iand
    //   749: ior
    //   750: i2b
    //   751: bastore
    //   752: iinc #7, 4
    //   755: iinc #8, 3
    //   758: iload_2
    //   759: ifne -> 652
    //   762: iload #8
    //   764: aload #6
    //   766: arraylength
    //   767: if_icmpge -> 804
    //   770: aload #6
    //   772: iload #8
    //   774: aload_3
    //   775: iload #7
    //   777: baload
    //   778: iconst_2
    //   779: ishl
    //   780: sipush #255
    //   783: iand
    //   784: aload_3
    //   785: iload #7
    //   787: iconst_1
    //   788: iadd
    //   789: baload
    //   790: iconst_4
    //   791: iushr
    //   792: iconst_3
    //   793: iand
    //   794: ior
    //   795: i2b
    //   796: bastore
    //   797: goto -> 804
    //   800: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   803: athrow
    //   804: iinc #8, 1
    //   807: iload #8
    //   809: aload #6
    //   811: arraylength
    //   812: if_icmpge -> 852
    //   815: aload #6
    //   817: iload #8
    //   819: aload_3
    //   820: iload #7
    //   822: iconst_1
    //   823: iadd
    //   824: baload
    //   825: iconst_4
    //   826: ishl
    //   827: sipush #255
    //   830: iand
    //   831: aload_3
    //   832: iload #7
    //   834: iconst_2
    //   835: iadd
    //   836: baload
    //   837: iconst_2
    //   838: iushr
    //   839: bipush #15
    //   841: iand
    //   842: ior
    //   843: i2b
    //   844: bastore
    //   845: goto -> 852
    //   848: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   851: athrow
    //   852: aload #6
    //   854: astore #4
    //   856: new java/math/BigInteger
    //   859: dup
    //   860: aload #4
    //   862: invokespecial <init> : ([B)V
    //   865: invokevirtual abs : ()Ljava/math/BigInteger;
    //   868: putstatic burp/Zls_.ZR : Ljava/lang/Object;
    //   871: getstatic burp/Ztes.ZX : Ljava/lang/Object;
    //   874: checkcast java/math/BigInteger
    //   877: invokevirtual toByteArray : ()[B
    //   880: astore_3
    //   881: new java/lang/StringBuilder
    //   884: dup
    //   885: invokespecial <init> : ()V
    //   888: astore #5
    //   890: aload #5
    //   892: sipush #3695
    //   895: sipush #27550
    //   898: invokestatic a : (II)Ljava/lang/String;
    //   901: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   904: pop
    //   905: aload_3
    //   906: astore #6
    //   908: aload #6
    //   910: arraylength
    //   911: istore #7
    //   913: iconst_0
    //   914: istore #8
    //   916: iload #8
    //   918: iload #7
    //   920: if_icmpge -> 946
    //   923: aload #6
    //   925: iload #8
    //   927: baload
    //   928: istore #9
    //   930: aload #5
    //   932: iload #9
    //   934: i2c
    //   935: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   938: pop
    //   939: iinc #8, 1
    //   942: iload_2
    //   943: ifne -> 916
    //   946: aload #5
    //   948: sipush #3700
    //   951: sipush #13054
    //   954: invokestatic a : (II)Ljava/lang/String;
    //   957: ldc ''
    //   959: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   962: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   965: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   968: pop
    //   969: aload #5
    //   971: sipush #3697
    //   974: sipush #-8878
    //   977: invokestatic a : (II)Ljava/lang/String;
    //   980: ldc ''
    //   982: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   985: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   988: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   991: pop
    //   992: aload #5
    //   994: invokevirtual toString : ()Ljava/lang/String;
    //   997: invokevirtual getBytes : ()[B
    //   1000: astore #4
    //   1002: aload #4
    //   1004: astore_3
    //   1005: aload_3
    //   1006: arraylength
    //   1007: bipush #8
    //   1009: iadd
    //   1010: bipush #6
    //   1012: ishr
    //   1013: iconst_1
    //   1014: iadd
    //   1015: bipush #16
    //   1017: imul
    //   1018: newarray int
    //   1020: astore #5
    //   1022: iconst_0
    //   1023: istore #6
    //   1025: iload #6
    //   1027: aload_3
    //   1028: arraylength
    //   1029: if_icmpge -> 1072
    //   1032: aload_3
    //   1033: iload #6
    //   1035: baload
    //   1036: sipush #255
    //   1039: iand
    //   1040: istore #7
    //   1042: aload #5
    //   1044: iload #6
    //   1046: iconst_2
    //   1047: ishr
    //   1048: dup2
    //   1049: iaload
    //   1050: iload #7
    //   1052: bipush #24
    //   1054: iload #6
    //   1056: iconst_4
    //   1057: irem
    //   1058: bipush #8
    //   1060: imul
    //   1061: isub
    //   1062: ishl
    //   1063: ior
    //   1064: iastore
    //   1065: iinc #6, 1
    //   1068: iload_2
    //   1069: ifne -> 1025
    //   1072: aload #5
    //   1074: iload #6
    //   1076: iconst_2
    //   1077: ishr
    //   1078: dup2
    //   1079: iaload
    //   1080: sipush #128
    //   1083: bipush #24
    //   1085: iload #6
    //   1087: iconst_4
    //   1088: irem
    //   1089: bipush #8
    //   1091: imul
    //   1092: isub
    //   1093: ishl
    //   1094: ior
    //   1095: iastore
    //   1096: aload #5
    //   1098: aload #5
    //   1100: arraylength
    //   1101: iconst_1
    //   1102: isub
    //   1103: aload_3
    //   1104: arraylength
    //   1105: bipush #8
    //   1107: imul
    //   1108: iastore
    //   1109: bipush #80
    //   1111: newarray int
    //   1113: astore #7
    //   1115: ldc 1732584193
    //   1117: istore #8
    //   1119: ldc -271733879
    //   1121: istore #9
    //   1123: ldc -1732584194
    //   1125: istore #10
    //   1127: ldc 271733878
    //   1129: istore #11
    //   1131: ldc -1009589776
    //   1133: istore #12
    //   1135: iconst_0
    //   1136: istore #6
    //   1138: iload #6
    //   1140: aload #5
    //   1142: arraylength
    //   1143: if_icmpge -> 1465
    //   1146: iload #8
    //   1148: istore #13
    //   1150: iload #9
    //   1152: istore #14
    //   1154: iload #10
    //   1156: istore #15
    //   1158: iload #11
    //   1160: istore #16
    //   1162: iload #12
    //   1164: istore #17
    //   1166: iconst_0
    //   1167: istore #18
    //   1169: iload #18
    //   1171: bipush #80
    //   1173: if_icmpge -> 1423
    //   1176: iload #18
    //   1178: bipush #16
    //   1180: if_icmpge -> 1207
    //   1183: aload #7
    //   1185: iload #18
    //   1187: aload #5
    //   1189: iload #6
    //   1191: iload #18
    //   1193: iadd
    //   1194: iaload
    //   1195: iastore
    //   1196: iload_2
    //   1197: ifne -> 1262
    //   1200: goto -> 1207
    //   1203: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1206: athrow
    //   1207: aload #7
    //   1209: iload #18
    //   1211: iconst_3
    //   1212: isub
    //   1213: iaload
    //   1214: aload #7
    //   1216: iload #18
    //   1218: bipush #8
    //   1220: isub
    //   1221: iaload
    //   1222: ixor
    //   1223: aload #7
    //   1225: iload #18
    //   1227: bipush #14
    //   1229: isub
    //   1230: iaload
    //   1231: ixor
    //   1232: aload #7
    //   1234: iload #18
    //   1236: bipush #16
    //   1238: isub
    //   1239: iaload
    //   1240: ixor
    //   1241: istore #19
    //   1243: iload #19
    //   1245: iconst_1
    //   1246: ishl
    //   1247: iload #19
    //   1249: bipush #31
    //   1251: iushr
    //   1252: ior
    //   1253: istore #20
    //   1255: aload #7
    //   1257: iload #18
    //   1259: iload #20
    //   1261: iastore
    //   1262: iload #8
    //   1264: iconst_5
    //   1265: ishl
    //   1266: iload #8
    //   1268: bipush #27
    //   1270: iushr
    //   1271: ior
    //   1272: istore #19
    //   1274: iload #19
    //   1276: iload #12
    //   1278: iadd
    //   1279: aload #7
    //   1281: iload #18
    //   1283: iaload
    //   1284: iadd
    //   1285: iload #18
    //   1287: bipush #20
    //   1289: if_icmpge -> 1315
    //   1292: ldc 1518500249
    //   1294: iload #9
    //   1296: iload #10
    //   1298: iand
    //   1299: iload #9
    //   1301: iconst_m1
    //   1302: ixor
    //   1303: iload #11
    //   1305: iand
    //   1306: ior
    //   1307: iadd
    //   1308: goto -> 1385
    //   1311: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1314: athrow
    //   1315: iload #18
    //   1317: bipush #40
    //   1319: if_icmpge -> 1340
    //   1322: ldc 1859775393
    //   1324: iload #9
    //   1326: iload #10
    //   1328: ixor
    //   1329: iload #11
    //   1331: ixor
    //   1332: iadd
    //   1333: goto -> 1385
    //   1336: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1339: athrow
    //   1340: iload #18
    //   1342: bipush #60
    //   1344: if_icmpge -> 1374
    //   1347: ldc -1894007588
    //   1349: iload #9
    //   1351: iload #10
    //   1353: iand
    //   1354: iload #9
    //   1356: iload #11
    //   1358: iand
    //   1359: ior
    //   1360: iload #10
    //   1362: iload #11
    //   1364: iand
    //   1365: ior
    //   1366: iadd
    //   1367: goto -> 1385
    //   1370: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1373: athrow
    //   1374: ldc -899497514
    //   1376: iload #9
    //   1378: iload #10
    //   1380: ixor
    //   1381: iload #11
    //   1383: ixor
    //   1384: iadd
    //   1385: iadd
    //   1386: istore #20
    //   1388: iload #11
    //   1390: istore #12
    //   1392: iload #10
    //   1394: istore #11
    //   1396: iload #9
    //   1398: bipush #30
    //   1400: ishl
    //   1401: iload #9
    //   1403: iconst_2
    //   1404: iushr
    //   1405: ior
    //   1406: istore #10
    //   1408: iload #8
    //   1410: istore #9
    //   1412: iload #20
    //   1414: istore #8
    //   1416: iinc #18, 1
    //   1419: iload_2
    //   1420: ifne -> 1169
    //   1423: iload #8
    //   1425: iload #13
    //   1427: iadd
    //   1428: istore #8
    //   1430: iload #9
    //   1432: iload #14
    //   1434: iadd
    //   1435: istore #9
    //   1437: iload #10
    //   1439: iload #15
    //   1441: iadd
    //   1442: istore #10
    //   1444: iload #11
    //   1446: iload #16
    //   1448: iadd
    //   1449: istore #11
    //   1451: iload #12
    //   1453: iload #17
    //   1455: iadd
    //   1456: istore #12
    //   1458: iinc #6, 16
    //   1461: iload_2
    //   1462: ifne -> 1138
    //   1465: iconst_5
    //   1466: newarray int
    //   1468: dup
    //   1469: iconst_0
    //   1470: iload #8
    //   1472: iastore
    //   1473: dup
    //   1474: iconst_1
    //   1475: iload #9
    //   1477: iastore
    //   1478: dup
    //   1479: iconst_2
    //   1480: iload #10
    //   1482: iastore
    //   1483: dup
    //   1484: iconst_3
    //   1485: iload #11
    //   1487: iastore
    //   1488: dup
    //   1489: iconst_4
    //   1490: iload #12
    //   1492: iastore
    //   1493: astore #13
    //   1495: bipush #20
    //   1497: newarray byte
    //   1499: astore #14
    //   1501: iconst_0
    //   1502: istore #15
    //   1504: iload #15
    //   1506: bipush #20
    //   1508: if_icmpge -> 1549
    //   1511: aload #13
    //   1513: iload #15
    //   1515: iconst_4
    //   1516: idiv
    //   1517: iaload
    //   1518: istore #16
    //   1520: iconst_3
    //   1521: iload #15
    //   1523: iconst_4
    //   1524: irem
    //   1525: isub
    //   1526: bipush #8
    //   1528: imul
    //   1529: istore #17
    //   1531: aload #14
    //   1533: iload #15
    //   1535: iload #16
    //   1537: iload #17
    //   1539: iushr
    //   1540: i2b
    //   1541: bastore
    //   1542: iinc #15, 1
    //   1545: iload_2
    //   1546: ifne -> 1504
    //   1549: aload #14
    //   1551: astore #4
    //   1553: getstatic burp/Zs_.Zs : Ljava/lang/Object;
    //   1556: checkcast java/math/BigInteger
    //   1559: invokevirtual toByteArray : ()[B
    //   1562: astore_3
    //   1563: new java/lang/StringBuilder
    //   1566: dup
    //   1567: invokespecial <init> : ()V
    //   1570: astore #5
    //   1572: aload #5
    //   1574: sipush #3694
    //   1577: sipush #21676
    //   1580: invokestatic a : (II)Ljava/lang/String;
    //   1583: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1586: pop
    //   1587: aload_3
    //   1588: astore #6
    //   1590: aload #6
    //   1592: arraylength
    //   1593: istore #7
    //   1595: iconst_0
    //   1596: istore #8
    //   1598: iload #8
    //   1600: iload #7
    //   1602: if_icmpge -> 1628
    //   1605: aload #6
    //   1607: iload #8
    //   1609: baload
    //   1610: istore #9
    //   1612: aload #5
    //   1614: iload #9
    //   1616: i2c
    //   1617: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   1620: pop
    //   1621: iinc #8, 1
    //   1624: iload_2
    //   1625: ifne -> 1598
    //   1628: aload #5
    //   1630: sipush #3681
    //   1633: sipush #-1907
    //   1636: invokestatic a : (II)Ljava/lang/String;
    //   1639: ldc ''
    //   1641: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1644: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   1647: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1650: pop
    //   1651: aload #5
    //   1653: sipush #3683
    //   1656: sipush #-21606
    //   1659: invokestatic a : (II)Ljava/lang/String;
    //   1662: ldc ''
    //   1664: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1667: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   1670: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1673: pop
    //   1674: aload #5
    //   1676: invokevirtual toString : ()Ljava/lang/String;
    //   1679: invokevirtual getBytes : ()[B
    //   1682: astore #4
    //   1684: aload #4
    //   1686: astore_3
    //   1687: aload_3
    //   1688: arraylength
    //   1689: bipush #8
    //   1691: iadd
    //   1692: bipush #6
    //   1694: ishr
    //   1695: iconst_1
    //   1696: iadd
    //   1697: bipush #16
    //   1699: imul
    //   1700: newarray int
    //   1702: astore #5
    //   1704: iconst_0
    //   1705: istore #6
    //   1707: iload #6
    //   1709: aload_3
    //   1710: arraylength
    //   1711: if_icmpge -> 1754
    //   1714: aload_3
    //   1715: iload #6
    //   1717: baload
    //   1718: sipush #255
    //   1721: iand
    //   1722: istore #7
    //   1724: aload #5
    //   1726: iload #6
    //   1728: iconst_2
    //   1729: ishr
    //   1730: dup2
    //   1731: iaload
    //   1732: iload #7
    //   1734: bipush #24
    //   1736: iload #6
    //   1738: iconst_4
    //   1739: irem
    //   1740: bipush #8
    //   1742: imul
    //   1743: isub
    //   1744: ishl
    //   1745: ior
    //   1746: iastore
    //   1747: iinc #6, 1
    //   1750: iload_2
    //   1751: ifne -> 1707
    //   1754: aload #5
    //   1756: iload #6
    //   1758: iconst_2
    //   1759: ishr
    //   1760: dup2
    //   1761: iaload
    //   1762: sipush #128
    //   1765: bipush #24
    //   1767: iload #6
    //   1769: iconst_4
    //   1770: irem
    //   1771: bipush #8
    //   1773: imul
    //   1774: isub
    //   1775: ishl
    //   1776: ior
    //   1777: iastore
    //   1778: aload #5
    //   1780: aload #5
    //   1782: arraylength
    //   1783: iconst_1
    //   1784: isub
    //   1785: aload_3
    //   1786: arraylength
    //   1787: bipush #8
    //   1789: imul
    //   1790: iastore
    //   1791: bipush #80
    //   1793: newarray int
    //   1795: astore #7
    //   1797: ldc 1732584193
    //   1799: istore #8
    //   1801: ldc -271733879
    //   1803: istore #9
    //   1805: ldc -1732584194
    //   1807: istore #10
    //   1809: ldc 271733878
    //   1811: istore #11
    //   1813: ldc -1009589776
    //   1815: istore #12
    //   1817: iconst_0
    //   1818: istore #6
    //   1820: iload #6
    //   1822: aload #5
    //   1824: arraylength
    //   1825: if_icmpge -> 2147
    //   1828: iload #8
    //   1830: istore #13
    //   1832: iload #9
    //   1834: istore #14
    //   1836: iload #10
    //   1838: istore #15
    //   1840: iload #11
    //   1842: istore #16
    //   1844: iload #12
    //   1846: istore #17
    //   1848: iconst_0
    //   1849: istore #18
    //   1851: iload #18
    //   1853: bipush #80
    //   1855: if_icmpge -> 2105
    //   1858: iload #18
    //   1860: bipush #16
    //   1862: if_icmpge -> 1889
    //   1865: aload #7
    //   1867: iload #18
    //   1869: aload #5
    //   1871: iload #6
    //   1873: iload #18
    //   1875: iadd
    //   1876: iaload
    //   1877: iastore
    //   1878: iload_2
    //   1879: ifne -> 1944
    //   1882: goto -> 1889
    //   1885: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1888: athrow
    //   1889: aload #7
    //   1891: iload #18
    //   1893: iconst_3
    //   1894: isub
    //   1895: iaload
    //   1896: aload #7
    //   1898: iload #18
    //   1900: bipush #8
    //   1902: isub
    //   1903: iaload
    //   1904: ixor
    //   1905: aload #7
    //   1907: iload #18
    //   1909: bipush #14
    //   1911: isub
    //   1912: iaload
    //   1913: ixor
    //   1914: aload #7
    //   1916: iload #18
    //   1918: bipush #16
    //   1920: isub
    //   1921: iaload
    //   1922: ixor
    //   1923: istore #19
    //   1925: iload #19
    //   1927: iconst_1
    //   1928: ishl
    //   1929: iload #19
    //   1931: bipush #31
    //   1933: iushr
    //   1934: ior
    //   1935: istore #20
    //   1937: aload #7
    //   1939: iload #18
    //   1941: iload #20
    //   1943: iastore
    //   1944: iload #8
    //   1946: iconst_5
    //   1947: ishl
    //   1948: iload #8
    //   1950: bipush #27
    //   1952: iushr
    //   1953: ior
    //   1954: istore #19
    //   1956: iload #19
    //   1958: iload #12
    //   1960: iadd
    //   1961: aload #7
    //   1963: iload #18
    //   1965: iaload
    //   1966: iadd
    //   1967: iload #18
    //   1969: bipush #20
    //   1971: if_icmpge -> 1997
    //   1974: ldc 1518500249
    //   1976: iload #9
    //   1978: iload #10
    //   1980: iand
    //   1981: iload #9
    //   1983: iconst_m1
    //   1984: ixor
    //   1985: iload #11
    //   1987: iand
    //   1988: ior
    //   1989: iadd
    //   1990: goto -> 2067
    //   1993: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1996: athrow
    //   1997: iload #18
    //   1999: bipush #40
    //   2001: if_icmpge -> 2022
    //   2004: ldc 1859775393
    //   2006: iload #9
    //   2008: iload #10
    //   2010: ixor
    //   2011: iload #11
    //   2013: ixor
    //   2014: iadd
    //   2015: goto -> 2067
    //   2018: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2021: athrow
    //   2022: iload #18
    //   2024: bipush #60
    //   2026: if_icmpge -> 2056
    //   2029: ldc -1894007588
    //   2031: iload #9
    //   2033: iload #10
    //   2035: iand
    //   2036: iload #9
    //   2038: iload #11
    //   2040: iand
    //   2041: ior
    //   2042: iload #10
    //   2044: iload #11
    //   2046: iand
    //   2047: ior
    //   2048: iadd
    //   2049: goto -> 2067
    //   2052: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2055: athrow
    //   2056: ldc -899497514
    //   2058: iload #9
    //   2060: iload #10
    //   2062: ixor
    //   2063: iload #11
    //   2065: ixor
    //   2066: iadd
    //   2067: iadd
    //   2068: istore #20
    //   2070: iload #11
    //   2072: istore #12
    //   2074: iload #10
    //   2076: istore #11
    //   2078: iload #9
    //   2080: bipush #30
    //   2082: ishl
    //   2083: iload #9
    //   2085: iconst_2
    //   2086: iushr
    //   2087: ior
    //   2088: istore #10
    //   2090: iload #8
    //   2092: istore #9
    //   2094: iload #20
    //   2096: istore #8
    //   2098: iinc #18, 1
    //   2101: iload_2
    //   2102: ifne -> 1851
    //   2105: iload #8
    //   2107: iload #13
    //   2109: iadd
    //   2110: istore #8
    //   2112: iload #9
    //   2114: iload #14
    //   2116: iadd
    //   2117: istore #9
    //   2119: iload #10
    //   2121: iload #15
    //   2123: iadd
    //   2124: istore #10
    //   2126: iload #11
    //   2128: iload #16
    //   2130: iadd
    //   2131: istore #11
    //   2133: iload #12
    //   2135: iload #17
    //   2137: iadd
    //   2138: istore #12
    //   2140: iinc #6, 16
    //   2143: iload_2
    //   2144: ifne -> 1820
    //   2147: iconst_5
    //   2148: newarray int
    //   2150: dup
    //   2151: iconst_0
    //   2152: iload #8
    //   2154: iastore
    //   2155: dup
    //   2156: iconst_1
    //   2157: iload #9
    //   2159: iastore
    //   2160: dup
    //   2161: iconst_2
    //   2162: iload #10
    //   2164: iastore
    //   2165: dup
    //   2166: iconst_3
    //   2167: iload #11
    //   2169: iastore
    //   2170: dup
    //   2171: iconst_4
    //   2172: iload #12
    //   2174: iastore
    //   2175: astore #13
    //   2177: bipush #20
    //   2179: newarray byte
    //   2181: astore #14
    //   2183: iconst_0
    //   2184: istore #15
    //   2186: iload #15
    //   2188: bipush #20
    //   2190: if_icmpge -> 2231
    //   2193: aload #13
    //   2195: iload #15
    //   2197: iconst_4
    //   2198: idiv
    //   2199: iaload
    //   2200: istore #16
    //   2202: iconst_3
    //   2203: iload #15
    //   2205: iconst_4
    //   2206: irem
    //   2207: isub
    //   2208: bipush #8
    //   2210: imul
    //   2211: istore #17
    //   2213: aload #14
    //   2215: iload #15
    //   2217: iload #16
    //   2219: iload #17
    //   2221: iushr
    //   2222: i2b
    //   2223: bastore
    //   2224: iinc #15, 1
    //   2227: iload_2
    //   2228: ifne -> 2186
    //   2231: aload #14
    //   2233: astore #4
    //   2235: sipush #3709
    //   2238: sipush #-19842
    //   2241: invokestatic a : (II)Ljava/lang/String;
    //   2244: iconst_1
    //   2245: ldc burp/Zxo4
    //   2247: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2250: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2253: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2256: astore_3
    //   2257: aload_3
    //   2258: arraylength
    //   2259: istore #4
    //   2261: iconst_0
    //   2262: istore #5
    //   2264: iload #5
    //   2266: iload #4
    //   2268: if_icmpge -> 2405
    //   2271: aload_3
    //   2272: iload #5
    //   2274: aaload
    //   2275: astore #6
    //   2277: aload #6
    //   2279: invokevirtual getModifiers : ()I
    //   2282: invokestatic isStatic : (I)Z
    //   2285: ifne -> 2295
    //   2288: goto -> 2398
    //   2291: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2294: athrow
    //   2295: aload #6
    //   2297: invokevirtual getType : ()Ljava/lang/Class;
    //   2300: astore #7
    //   2302: aload #7
    //   2304: ifnull -> 2385
    //   2307: aload #7
    //   2309: invokevirtual isPrimitive : ()Z
    //   2312: ifne -> 2385
    //   2315: goto -> 2322
    //   2318: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2321: athrow
    //   2322: aload #7
    //   2324: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2327: ifnull -> 2385
    //   2330: goto -> 2337
    //   2333: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2336: athrow
    //   2337: aload #7
    //   2339: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2342: invokevirtual getName : ()Ljava/lang/String;
    //   2345: ifnull -> 2385
    //   2348: goto -> 2355
    //   2351: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2354: athrow
    //   2355: aload #7
    //   2357: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2360: invokevirtual getName : ()Ljava/lang/String;
    //   2363: sipush #3703
    //   2366: sipush #3988
    //   2369: invokestatic a : (II)Ljava/lang/String;
    //   2372: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2375: ifne -> 2385
    //   2378: goto -> 2385
    //   2381: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2384: athrow
    //   2385: aload #6
    //   2387: iconst_1
    //   2388: invokevirtual setAccessible : (Z)V
    //   2391: aload #6
    //   2393: aconst_null
    //   2394: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2397: pop
    //   2398: iinc #5, 1
    //   2401: iload_2
    //   2402: ifne -> 2264
    //   2405: sipush #3688
    //   2408: sipush #8665
    //   2411: invokestatic a : (II)Ljava/lang/String;
    //   2414: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2417: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2420: astore_3
    //   2421: aload_3
    //   2422: arraylength
    //   2423: istore #4
    //   2425: iconst_0
    //   2426: istore #5
    //   2428: iload #5
    //   2430: iload #4
    //   2432: if_icmpge -> 2564
    //   2435: aload_3
    //   2436: iload #5
    //   2438: aaload
    //   2439: astore #6
    //   2441: aload #6
    //   2443: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2446: pop
    //   2447: aload #6
    //   2449: invokevirtual getModifiers : ()I
    //   2452: invokestatic isStatic : (I)Z
    //   2455: ifeq -> 2550
    //   2458: aload #6
    //   2460: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2463: arraylength
    //   2464: iconst_2
    //   2465: if_icmpne -> 2550
    //   2468: goto -> 2475
    //   2471: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2474: athrow
    //   2475: aload #6
    //   2477: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2480: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   2483: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2486: ifeq -> 2550
    //   2489: goto -> 2496
    //   2492: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2495: athrow
    //   2496: aload #6
    //   2498: iconst_1
    //   2499: invokevirtual setAccessible : (Z)V
    //   2502: aload #6
    //   2504: aconst_null
    //   2505: iconst_2
    //   2506: anewarray java/lang/Object
    //   2509: dup
    //   2510: iconst_0
    //   2511: aload_0
    //   2512: aastore
    //   2513: dup
    //   2514: iconst_1
    //   2515: aload_1
    //   2516: ifnonnull -> 2534
    //   2519: goto -> 2526
    //   2522: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2525: athrow
    //   2526: aload_1
    //   2527: goto -> 2541
    //   2530: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2533: athrow
    //   2534: aload_1
    //   2535: checkcast [B
    //   2538: invokevirtual clone : ()Ljava/lang/Object;
    //   2541: aastore
    //   2542: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2545: pop
    //   2546: iload_2
    //   2547: ifne -> 2564
    //   2550: iinc #5, 1
    //   2553: iload_2
    //   2554: ifne -> 2428
    //   2557: goto -> 2564
    //   2560: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2563: athrow
    //   2564: iconst_0
    //   2565: istore_3
    //   2566: getstatic burp/Zk7w.ZB : Ljava/lang/String;
    //   2569: getstatic burp/Zr_k.Zx : Ljava/lang/Object;
    //   2572: checkcast java/math/BigInteger
    //   2575: invokevirtual intValue : ()I
    //   2578: bipush #32
    //   2580: irem
    //   2581: invokestatic abs : (I)I
    //   2584: invokevirtual charAt : (I)C
    //   2587: getstatic burp/Zmt6.Zx : Ljava/lang/String;
    //   2590: getstatic burp/Zre1.ZN : Ljava/lang/Object;
    //   2593: checkcast java/math/BigInteger
    //   2596: invokevirtual intValue : ()I
    //   2599: bipush #32
    //   2601: irem
    //   2602: invokestatic abs : (I)I
    //   2605: invokevirtual charAt : (I)C
    //   2608: if_icmple -> 2952
    //   2611: sipush #3704
    //   2614: sipush #-23986
    //   2617: invokestatic a : (II)Ljava/lang/String;
    //   2620: iconst_1
    //   2621: ldc burp/Zz0
    //   2623: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2626: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2629: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2632: astore #4
    //   2634: aload #4
    //   2636: arraylength
    //   2637: istore #5
    //   2639: iconst_0
    //   2640: istore #6
    //   2642: iload #6
    //   2644: iload #5
    //   2646: if_icmpge -> 2784
    //   2649: aload #4
    //   2651: iload #6
    //   2653: aaload
    //   2654: astore #7
    //   2656: aload #7
    //   2658: invokevirtual getModifiers : ()I
    //   2661: invokestatic isStatic : (I)Z
    //   2664: ifne -> 2674
    //   2667: goto -> 2777
    //   2670: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2673: athrow
    //   2674: aload #7
    //   2676: invokevirtual getType : ()Ljava/lang/Class;
    //   2679: astore #8
    //   2681: aload #8
    //   2683: ifnull -> 2764
    //   2686: aload #8
    //   2688: invokevirtual isPrimitive : ()Z
    //   2691: ifne -> 2764
    //   2694: goto -> 2701
    //   2697: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2700: athrow
    //   2701: aload #8
    //   2703: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2706: ifnull -> 2764
    //   2709: goto -> 2716
    //   2712: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2715: athrow
    //   2716: aload #8
    //   2718: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2721: invokevirtual getName : ()Ljava/lang/String;
    //   2724: ifnull -> 2764
    //   2727: goto -> 2734
    //   2730: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2733: athrow
    //   2734: aload #8
    //   2736: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2739: invokevirtual getName : ()Ljava/lang/String;
    //   2742: sipush #3698
    //   2745: sipush #29146
    //   2748: invokestatic a : (II)Ljava/lang/String;
    //   2751: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2754: ifne -> 2764
    //   2757: goto -> 2764
    //   2760: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2763: athrow
    //   2764: aload #7
    //   2766: iconst_1
    //   2767: invokevirtual setAccessible : (Z)V
    //   2770: aload #7
    //   2772: aconst_null
    //   2773: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2776: pop
    //   2777: iinc #6, 1
    //   2780: iload_2
    //   2781: ifne -> 2642
    //   2784: sipush #3706
    //   2787: sipush #13591
    //   2790: invokestatic a : (II)Ljava/lang/String;
    //   2793: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2796: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2799: astore #4
    //   2801: aload #4
    //   2803: arraylength
    //   2804: istore #5
    //   2806: iconst_0
    //   2807: istore #6
    //   2809: iload #6
    //   2811: iload #5
    //   2813: if_icmpge -> 2949
    //   2816: aload #4
    //   2818: iload #6
    //   2820: aaload
    //   2821: astore #7
    //   2823: aload #7
    //   2825: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2828: pop
    //   2829: aload #7
    //   2831: invokevirtual getModifiers : ()I
    //   2834: invokestatic isStatic : (I)Z
    //   2837: ifeq -> 2935
    //   2840: aload #7
    //   2842: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2845: arraylength
    //   2846: iconst_2
    //   2847: if_icmpne -> 2935
    //   2850: goto -> 2857
    //   2853: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2856: athrow
    //   2857: aload #7
    //   2859: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2862: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2865: if_acmpne -> 2935
    //   2868: goto -> 2875
    //   2871: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2874: athrow
    //   2875: aload #7
    //   2877: iconst_1
    //   2878: invokevirtual setAccessible : (Z)V
    //   2881: aload #7
    //   2883: aconst_null
    //   2884: iconst_2
    //   2885: anewarray java/lang/Object
    //   2888: dup
    //   2889: iconst_0
    //   2890: aload_0
    //   2891: aastore
    //   2892: dup
    //   2893: iconst_1
    //   2894: aload_1
    //   2895: ifnonnull -> 2913
    //   2898: goto -> 2905
    //   2901: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2904: athrow
    //   2905: aload_1
    //   2906: goto -> 2920
    //   2909: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2912: athrow
    //   2913: aload_1
    //   2914: checkcast [B
    //   2917: invokevirtual clone : ()Ljava/lang/Object;
    //   2920: aastore
    //   2921: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2924: checkcast java/lang/Boolean
    //   2927: invokevirtual booleanValue : ()Z
    //   2930: istore_3
    //   2931: iload_2
    //   2932: ifne -> 2949
    //   2935: iinc #6, 1
    //   2938: iload_2
    //   2939: ifne -> 2809
    //   2942: goto -> 2949
    //   2945: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2948: athrow
    //   2949: goto -> 3290
    //   2952: sipush #3708
    //   2955: sipush #30212
    //   2958: invokestatic a : (II)Ljava/lang/String;
    //   2961: iconst_1
    //   2962: ldc burp/Zgjj
    //   2964: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2967: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2970: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2973: astore #4
    //   2975: aload #4
    //   2977: arraylength
    //   2978: istore #5
    //   2980: iconst_0
    //   2981: istore #6
    //   2983: iload #6
    //   2985: iload #5
    //   2987: if_icmpge -> 3125
    //   2990: aload #4
    //   2992: iload #6
    //   2994: aaload
    //   2995: astore #7
    //   2997: aload #7
    //   2999: invokevirtual getModifiers : ()I
    //   3002: invokestatic isStatic : (I)Z
    //   3005: ifne -> 3015
    //   3008: goto -> 3118
    //   3011: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3014: athrow
    //   3015: aload #7
    //   3017: invokevirtual getType : ()Ljava/lang/Class;
    //   3020: astore #8
    //   3022: aload #8
    //   3024: ifnull -> 3105
    //   3027: aload #8
    //   3029: invokevirtual isPrimitive : ()Z
    //   3032: ifne -> 3105
    //   3035: goto -> 3042
    //   3038: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3041: athrow
    //   3042: aload #8
    //   3044: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3047: ifnull -> 3105
    //   3050: goto -> 3057
    //   3053: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3056: athrow
    //   3057: aload #8
    //   3059: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3062: invokevirtual getName : ()Ljava/lang/String;
    //   3065: ifnull -> 3105
    //   3068: goto -> 3075
    //   3071: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3074: athrow
    //   3075: aload #8
    //   3077: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3080: invokevirtual getName : ()Ljava/lang/String;
    //   3083: sipush #3698
    //   3086: sipush #29146
    //   3089: invokestatic a : (II)Ljava/lang/String;
    //   3092: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3095: ifne -> 3105
    //   3098: goto -> 3105
    //   3101: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3104: athrow
    //   3105: aload #7
    //   3107: iconst_1
    //   3108: invokevirtual setAccessible : (Z)V
    //   3111: aload #7
    //   3113: aconst_null
    //   3114: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3117: pop
    //   3118: iinc #6, 1
    //   3121: iload_2
    //   3122: ifne -> 2983
    //   3125: sipush #3685
    //   3128: sipush #11622
    //   3131: invokestatic a : (II)Ljava/lang/String;
    //   3134: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3137: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3140: astore #4
    //   3142: aload #4
    //   3144: arraylength
    //   3145: istore #5
    //   3147: iconst_0
    //   3148: istore #6
    //   3150: iload #6
    //   3152: iload #5
    //   3154: if_icmpge -> 3290
    //   3157: aload #4
    //   3159: iload #6
    //   3161: aaload
    //   3162: astore #7
    //   3164: aload #7
    //   3166: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3169: pop
    //   3170: aload #7
    //   3172: invokevirtual getModifiers : ()I
    //   3175: invokestatic isStatic : (I)Z
    //   3178: ifeq -> 3276
    //   3181: aload #7
    //   3183: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3186: arraylength
    //   3187: iconst_2
    //   3188: if_icmpne -> 3276
    //   3191: goto -> 3198
    //   3194: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3197: athrow
    //   3198: aload #7
    //   3200: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3203: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3206: if_acmpne -> 3276
    //   3209: goto -> 3216
    //   3212: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3215: athrow
    //   3216: aload #7
    //   3218: iconst_1
    //   3219: invokevirtual setAccessible : (Z)V
    //   3222: aload #7
    //   3224: aconst_null
    //   3225: iconst_2
    //   3226: anewarray java/lang/Object
    //   3229: dup
    //   3230: iconst_0
    //   3231: aload_0
    //   3232: aastore
    //   3233: dup
    //   3234: iconst_1
    //   3235: aload_1
    //   3236: ifnonnull -> 3254
    //   3239: goto -> 3246
    //   3242: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3245: athrow
    //   3246: aload_1
    //   3247: goto -> 3261
    //   3250: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3253: athrow
    //   3254: aload_1
    //   3255: checkcast [B
    //   3258: invokevirtual clone : ()Ljava/lang/Object;
    //   3261: aastore
    //   3262: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3265: checkcast java/lang/Boolean
    //   3268: invokevirtual booleanValue : ()Z
    //   3271: istore_3
    //   3272: iload_2
    //   3273: ifne -> 3290
    //   3276: iinc #6, 1
    //   3279: iload_2
    //   3280: ifne -> 3150
    //   3283: goto -> 3290
    //   3286: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3289: athrow
    //   3290: iload_3
    //   3291: ifeq -> 3296
    //   3294: iload_3
    //   3295: ireturn
    //   3296: getstatic burp/Zg97.ZX : Ljava/lang/String;
    //   3299: getstatic burp/Zmiy.Zi : Ljava/lang/Object;
    //   3302: checkcast java/math/BigInteger
    //   3305: invokevirtual intValue : ()I
    //   3308: bipush #32
    //   3310: irem
    //   3311: invokestatic abs : (I)I
    //   3314: invokevirtual charAt : (I)C
    //   3317: getstatic burp/Zs33.ZX : Ljava/lang/String;
    //   3320: getstatic burp/Zzc7.ZG : Ljava/lang/Object;
    //   3323: checkcast java/math/BigInteger
    //   3326: invokevirtual intValue : ()I
    //   3329: bipush #32
    //   3331: irem
    //   3332: invokestatic abs : (I)I
    //   3335: invokevirtual charAt : (I)C
    //   3338: if_icmple -> 3683
    //   3341: sipush #3707
    //   3344: sipush #-21251
    //   3347: invokestatic a : (II)Ljava/lang/String;
    //   3350: iconst_1
    //   3351: ldc burp/Zgyc
    //   3353: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3356: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3359: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3362: astore #4
    //   3364: aload #4
    //   3366: arraylength
    //   3367: istore #5
    //   3369: iconst_0
    //   3370: istore #6
    //   3372: iload #6
    //   3374: iload #5
    //   3376: if_icmpge -> 3514
    //   3379: aload #4
    //   3381: iload #6
    //   3383: aaload
    //   3384: astore #7
    //   3386: aload #7
    //   3388: invokevirtual getModifiers : ()I
    //   3391: invokestatic isStatic : (I)Z
    //   3394: ifne -> 3404
    //   3397: goto -> 3507
    //   3400: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3403: athrow
    //   3404: aload #7
    //   3406: invokevirtual getType : ()Ljava/lang/Class;
    //   3409: astore #8
    //   3411: aload #8
    //   3413: ifnull -> 3494
    //   3416: aload #8
    //   3418: invokevirtual isPrimitive : ()Z
    //   3421: ifne -> 3494
    //   3424: goto -> 3431
    //   3427: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3430: athrow
    //   3431: aload #8
    //   3433: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3436: ifnull -> 3494
    //   3439: goto -> 3446
    //   3442: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3445: athrow
    //   3446: aload #8
    //   3448: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3451: invokevirtual getName : ()Ljava/lang/String;
    //   3454: ifnull -> 3494
    //   3457: goto -> 3464
    //   3460: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3463: athrow
    //   3464: aload #8
    //   3466: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3469: invokevirtual getName : ()Ljava/lang/String;
    //   3472: sipush #3698
    //   3475: sipush #29146
    //   3478: invokestatic a : (II)Ljava/lang/String;
    //   3481: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3484: ifne -> 3494
    //   3487: goto -> 3494
    //   3490: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3493: athrow
    //   3494: aload #7
    //   3496: iconst_1
    //   3497: invokevirtual setAccessible : (Z)V
    //   3500: aload #7
    //   3502: aconst_null
    //   3503: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3506: pop
    //   3507: iinc #6, 1
    //   3510: iload_2
    //   3511: ifne -> 3372
    //   3514: sipush #3689
    //   3517: sipush #-19353
    //   3520: invokestatic a : (II)Ljava/lang/String;
    //   3523: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3526: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3529: astore #4
    //   3531: aload #4
    //   3533: arraylength
    //   3534: istore #5
    //   3536: iconst_0
    //   3537: istore #6
    //   3539: iload #6
    //   3541: iload #5
    //   3543: if_icmpge -> 3679
    //   3546: aload #4
    //   3548: iload #6
    //   3550: aaload
    //   3551: astore #7
    //   3553: aload #7
    //   3555: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3558: pop
    //   3559: aload #7
    //   3561: invokevirtual getModifiers : ()I
    //   3564: invokestatic isStatic : (I)Z
    //   3567: ifeq -> 3665
    //   3570: aload #7
    //   3572: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3575: arraylength
    //   3576: iconst_2
    //   3577: if_icmpne -> 3665
    //   3580: goto -> 3587
    //   3583: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3586: athrow
    //   3587: aload #7
    //   3589: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3592: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3595: if_acmpne -> 3665
    //   3598: goto -> 3605
    //   3601: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3604: athrow
    //   3605: aload #7
    //   3607: iconst_1
    //   3608: invokevirtual setAccessible : (Z)V
    //   3611: aload #7
    //   3613: aconst_null
    //   3614: iconst_2
    //   3615: anewarray java/lang/Object
    //   3618: dup
    //   3619: iconst_0
    //   3620: aload_0
    //   3621: aastore
    //   3622: dup
    //   3623: iconst_1
    //   3624: aload_1
    //   3625: ifnonnull -> 3643
    //   3628: goto -> 3635
    //   3631: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3634: athrow
    //   3635: aload_1
    //   3636: goto -> 3650
    //   3639: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3642: athrow
    //   3643: aload_1
    //   3644: checkcast [B
    //   3647: invokevirtual clone : ()Ljava/lang/Object;
    //   3650: aastore
    //   3651: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3654: checkcast java/lang/Boolean
    //   3657: invokevirtual booleanValue : ()Z
    //   3660: istore_3
    //   3661: iload_2
    //   3662: ifne -> 3679
    //   3665: iinc #6, 1
    //   3668: iload_2
    //   3669: ifne -> 3539
    //   3672: goto -> 3679
    //   3675: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3678: athrow
    //   3679: iload_2
    //   3680: ifne -> 4021
    //   3683: sipush #3711
    //   3686: sipush #19601
    //   3689: invokestatic a : (II)Ljava/lang/String;
    //   3692: iconst_1
    //   3693: ldc burp/Zvos
    //   3695: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3698: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3701: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3704: astore #4
    //   3706: aload #4
    //   3708: arraylength
    //   3709: istore #5
    //   3711: iconst_0
    //   3712: istore #6
    //   3714: iload #6
    //   3716: iload #5
    //   3718: if_icmpge -> 3856
    //   3721: aload #4
    //   3723: iload #6
    //   3725: aaload
    //   3726: astore #7
    //   3728: aload #7
    //   3730: invokevirtual getModifiers : ()I
    //   3733: invokestatic isStatic : (I)Z
    //   3736: ifne -> 3746
    //   3739: goto -> 3849
    //   3742: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3745: athrow
    //   3746: aload #7
    //   3748: invokevirtual getType : ()Ljava/lang/Class;
    //   3751: astore #8
    //   3753: aload #8
    //   3755: ifnull -> 3836
    //   3758: aload #8
    //   3760: invokevirtual isPrimitive : ()Z
    //   3763: ifne -> 3836
    //   3766: goto -> 3773
    //   3769: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3772: athrow
    //   3773: aload #8
    //   3775: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3778: ifnull -> 3836
    //   3781: goto -> 3788
    //   3784: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3787: athrow
    //   3788: aload #8
    //   3790: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3793: invokevirtual getName : ()Ljava/lang/String;
    //   3796: ifnull -> 3836
    //   3799: goto -> 3806
    //   3802: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3805: athrow
    //   3806: aload #8
    //   3808: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3811: invokevirtual getName : ()Ljava/lang/String;
    //   3814: sipush #3698
    //   3817: sipush #29146
    //   3820: invokestatic a : (II)Ljava/lang/String;
    //   3823: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3826: ifne -> 3836
    //   3829: goto -> 3836
    //   3832: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3835: athrow
    //   3836: aload #7
    //   3838: iconst_1
    //   3839: invokevirtual setAccessible : (Z)V
    //   3842: aload #7
    //   3844: aconst_null
    //   3845: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3848: pop
    //   3849: iinc #6, 1
    //   3852: iload_2
    //   3853: ifne -> 3714
    //   3856: sipush #3702
    //   3859: sipush #11963
    //   3862: invokestatic a : (II)Ljava/lang/String;
    //   3865: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3868: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3871: astore #4
    //   3873: aload #4
    //   3875: arraylength
    //   3876: istore #5
    //   3878: iconst_0
    //   3879: istore #6
    //   3881: iload #6
    //   3883: iload #5
    //   3885: if_icmpge -> 4021
    //   3888: aload #4
    //   3890: iload #6
    //   3892: aaload
    //   3893: astore #7
    //   3895: aload #7
    //   3897: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3900: pop
    //   3901: aload #7
    //   3903: invokevirtual getModifiers : ()I
    //   3906: invokestatic isStatic : (I)Z
    //   3909: ifeq -> 4007
    //   3912: aload #7
    //   3914: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3917: arraylength
    //   3918: iconst_2
    //   3919: if_icmpne -> 4007
    //   3922: goto -> 3929
    //   3925: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3928: athrow
    //   3929: aload #7
    //   3931: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3934: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3937: if_acmpne -> 4007
    //   3940: goto -> 3947
    //   3943: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3946: athrow
    //   3947: aload #7
    //   3949: iconst_1
    //   3950: invokevirtual setAccessible : (Z)V
    //   3953: aload #7
    //   3955: aconst_null
    //   3956: iconst_2
    //   3957: anewarray java/lang/Object
    //   3960: dup
    //   3961: iconst_0
    //   3962: aload_0
    //   3963: aastore
    //   3964: dup
    //   3965: iconst_1
    //   3966: aload_1
    //   3967: ifnonnull -> 3985
    //   3970: goto -> 3977
    //   3973: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3976: athrow
    //   3977: aload_1
    //   3978: goto -> 3992
    //   3981: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3984: athrow
    //   3985: aload_1
    //   3986: checkcast [B
    //   3989: invokevirtual clone : ()Ljava/lang/Object;
    //   3992: aastore
    //   3993: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3996: checkcast java/lang/Boolean
    //   3999: invokevirtual booleanValue : ()Z
    //   4002: istore_3
    //   4003: iload_2
    //   4004: ifne -> 4021
    //   4007: iinc #6, 1
    //   4010: iload_2
    //   4011: ifne -> 3881
    //   4014: goto -> 4021
    //   4017: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4020: athrow
    //   4021: iload_3
    //   4022: ifeq -> 4027
    //   4025: iload_3
    //   4026: ireturn
    //   4027: getstatic burp/Zs36.Zr : Ljava/lang/String;
    //   4030: getstatic burp/Zghe.ZJ : Ljava/lang/Object;
    //   4033: checkcast java/math/BigInteger
    //   4036: invokevirtual intValue : ()I
    //   4039: bipush #32
    //   4041: irem
    //   4042: invokestatic abs : (I)I
    //   4045: invokevirtual charAt : (I)C
    //   4048: getstatic burp/Ztes.Zo : Ljava/lang/String;
    //   4051: getstatic burp/Zty5.Zf : Ljava/lang/Object;
    //   4054: checkcast java/math/BigInteger
    //   4057: invokevirtual intValue : ()I
    //   4060: bipush #32
    //   4062: irem
    //   4063: invokestatic abs : (I)I
    //   4066: invokevirtual charAt : (I)C
    //   4069: if_icmpgt -> 4414
    //   4072: sipush #3686
    //   4075: sipush #13297
    //   4078: invokestatic a : (II)Ljava/lang/String;
    //   4081: iconst_1
    //   4082: ldc burp/Zrxm
    //   4084: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4087: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4090: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4093: astore #4
    //   4095: aload #4
    //   4097: arraylength
    //   4098: istore #5
    //   4100: iconst_0
    //   4101: istore #6
    //   4103: iload #6
    //   4105: iload #5
    //   4107: if_icmpge -> 4245
    //   4110: aload #4
    //   4112: iload #6
    //   4114: aaload
    //   4115: astore #7
    //   4117: aload #7
    //   4119: invokevirtual getModifiers : ()I
    //   4122: invokestatic isStatic : (I)Z
    //   4125: ifne -> 4135
    //   4128: goto -> 4238
    //   4131: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4134: athrow
    //   4135: aload #7
    //   4137: invokevirtual getType : ()Ljava/lang/Class;
    //   4140: astore #8
    //   4142: aload #8
    //   4144: ifnull -> 4225
    //   4147: aload #8
    //   4149: invokevirtual isPrimitive : ()Z
    //   4152: ifne -> 4225
    //   4155: goto -> 4162
    //   4158: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4161: athrow
    //   4162: aload #8
    //   4164: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4167: ifnull -> 4225
    //   4170: goto -> 4177
    //   4173: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4176: athrow
    //   4177: aload #8
    //   4179: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4182: invokevirtual getName : ()Ljava/lang/String;
    //   4185: ifnull -> 4225
    //   4188: goto -> 4195
    //   4191: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4194: athrow
    //   4195: aload #8
    //   4197: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4200: invokevirtual getName : ()Ljava/lang/String;
    //   4203: sipush #3698
    //   4206: sipush #29146
    //   4209: invokestatic a : (II)Ljava/lang/String;
    //   4212: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4215: ifne -> 4225
    //   4218: goto -> 4225
    //   4221: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4224: athrow
    //   4225: aload #7
    //   4227: iconst_1
    //   4228: invokevirtual setAccessible : (Z)V
    //   4231: aload #7
    //   4233: aconst_null
    //   4234: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4237: pop
    //   4238: iinc #6, 1
    //   4241: iload_2
    //   4242: ifne -> 4103
    //   4245: sipush #3690
    //   4248: sipush #-5251
    //   4251: invokestatic a : (II)Ljava/lang/String;
    //   4254: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4257: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4260: astore #4
    //   4262: aload #4
    //   4264: arraylength
    //   4265: istore #5
    //   4267: iconst_0
    //   4268: istore #6
    //   4270: iload #6
    //   4272: iload #5
    //   4274: if_icmpge -> 4410
    //   4277: aload #4
    //   4279: iload #6
    //   4281: aaload
    //   4282: astore #7
    //   4284: aload #7
    //   4286: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4289: pop
    //   4290: aload #7
    //   4292: invokevirtual getModifiers : ()I
    //   4295: invokestatic isStatic : (I)Z
    //   4298: ifeq -> 4396
    //   4301: aload #7
    //   4303: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4306: arraylength
    //   4307: iconst_2
    //   4308: if_icmpne -> 4396
    //   4311: goto -> 4318
    //   4314: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4317: athrow
    //   4318: aload #7
    //   4320: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4323: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4326: if_acmpne -> 4396
    //   4329: goto -> 4336
    //   4332: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4335: athrow
    //   4336: aload #7
    //   4338: iconst_1
    //   4339: invokevirtual setAccessible : (Z)V
    //   4342: aload #7
    //   4344: aconst_null
    //   4345: iconst_2
    //   4346: anewarray java/lang/Object
    //   4349: dup
    //   4350: iconst_0
    //   4351: aload_0
    //   4352: aastore
    //   4353: dup
    //   4354: iconst_1
    //   4355: aload_1
    //   4356: ifnonnull -> 4374
    //   4359: goto -> 4366
    //   4362: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4365: athrow
    //   4366: aload_1
    //   4367: goto -> 4381
    //   4370: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4373: athrow
    //   4374: aload_1
    //   4375: checkcast [B
    //   4378: invokevirtual clone : ()Ljava/lang/Object;
    //   4381: aastore
    //   4382: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4385: checkcast java/lang/Boolean
    //   4388: invokevirtual booleanValue : ()Z
    //   4391: istore_3
    //   4392: iload_2
    //   4393: ifne -> 4410
    //   4396: iinc #6, 1
    //   4399: iload_2
    //   4400: ifne -> 4270
    //   4403: goto -> 4410
    //   4406: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4409: athrow
    //   4410: iload_2
    //   4411: ifne -> 4752
    //   4414: sipush #3682
    //   4417: sipush #-304
    //   4420: invokestatic a : (II)Ljava/lang/String;
    //   4423: iconst_1
    //   4424: ldc burp/Zgk1
    //   4426: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4429: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4432: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4435: astore #4
    //   4437: aload #4
    //   4439: arraylength
    //   4440: istore #5
    //   4442: iconst_0
    //   4443: istore #6
    //   4445: iload #6
    //   4447: iload #5
    //   4449: if_icmpge -> 4587
    //   4452: aload #4
    //   4454: iload #6
    //   4456: aaload
    //   4457: astore #7
    //   4459: aload #7
    //   4461: invokevirtual getModifiers : ()I
    //   4464: invokestatic isStatic : (I)Z
    //   4467: ifne -> 4477
    //   4470: goto -> 4580
    //   4473: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4476: athrow
    //   4477: aload #7
    //   4479: invokevirtual getType : ()Ljava/lang/Class;
    //   4482: astore #8
    //   4484: aload #8
    //   4486: ifnull -> 4567
    //   4489: aload #8
    //   4491: invokevirtual isPrimitive : ()Z
    //   4494: ifne -> 4567
    //   4497: goto -> 4504
    //   4500: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4503: athrow
    //   4504: aload #8
    //   4506: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4509: ifnull -> 4567
    //   4512: goto -> 4519
    //   4515: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4518: athrow
    //   4519: aload #8
    //   4521: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4524: invokevirtual getName : ()Ljava/lang/String;
    //   4527: ifnull -> 4567
    //   4530: goto -> 4537
    //   4533: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4536: athrow
    //   4537: aload #8
    //   4539: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4542: invokevirtual getName : ()Ljava/lang/String;
    //   4545: sipush #3698
    //   4548: sipush #29146
    //   4551: invokestatic a : (II)Ljava/lang/String;
    //   4554: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4557: ifne -> 4567
    //   4560: goto -> 4567
    //   4563: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4566: athrow
    //   4567: aload #7
    //   4569: iconst_1
    //   4570: invokevirtual setAccessible : (Z)V
    //   4573: aload #7
    //   4575: aconst_null
    //   4576: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4579: pop
    //   4580: iinc #6, 1
    //   4583: iload_2
    //   4584: ifne -> 4445
    //   4587: sipush #3680
    //   4590: sipush #-4689
    //   4593: invokestatic a : (II)Ljava/lang/String;
    //   4596: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4599: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4602: astore #4
    //   4604: aload #4
    //   4606: arraylength
    //   4607: istore #5
    //   4609: iconst_0
    //   4610: istore #6
    //   4612: iload #6
    //   4614: iload #5
    //   4616: if_icmpge -> 4752
    //   4619: aload #4
    //   4621: iload #6
    //   4623: aaload
    //   4624: astore #7
    //   4626: aload #7
    //   4628: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4631: pop
    //   4632: aload #7
    //   4634: invokevirtual getModifiers : ()I
    //   4637: invokestatic isStatic : (I)Z
    //   4640: ifeq -> 4738
    //   4643: aload #7
    //   4645: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4648: arraylength
    //   4649: iconst_2
    //   4650: if_icmpne -> 4738
    //   4653: goto -> 4660
    //   4656: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4659: athrow
    //   4660: aload #7
    //   4662: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4665: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4668: if_acmpne -> 4738
    //   4671: goto -> 4678
    //   4674: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4677: athrow
    //   4678: aload #7
    //   4680: iconst_1
    //   4681: invokevirtual setAccessible : (Z)V
    //   4684: aload #7
    //   4686: aconst_null
    //   4687: iconst_2
    //   4688: anewarray java/lang/Object
    //   4691: dup
    //   4692: iconst_0
    //   4693: aload_0
    //   4694: aastore
    //   4695: dup
    //   4696: iconst_1
    //   4697: aload_1
    //   4698: ifnonnull -> 4716
    //   4701: goto -> 4708
    //   4704: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4707: athrow
    //   4708: aload_1
    //   4709: goto -> 4723
    //   4712: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4715: athrow
    //   4716: aload_1
    //   4717: checkcast [B
    //   4720: invokevirtual clone : ()Ljava/lang/Object;
    //   4723: aastore
    //   4724: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4727: checkcast java/lang/Boolean
    //   4730: invokevirtual booleanValue : ()Z
    //   4733: istore_3
    //   4734: iload_2
    //   4735: ifne -> 4752
    //   4738: iinc #6, 1
    //   4741: iload_2
    //   4742: ifne -> 4612
    //   4745: goto -> 4752
    //   4748: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4751: athrow
    //   4752: iload_3
    //   4753: ifeq -> 4758
    //   4756: iload_3
    //   4757: ireturn
    //   4758: getstatic burp/Zebj.ZF : Ljava/lang/String;
    //   4761: getstatic burp/Zgny.ZR : Ljava/lang/Object;
    //   4764: checkcast java/math/BigInteger
    //   4767: invokevirtual intValue : ()I
    //   4770: bipush #32
    //   4772: irem
    //   4773: invokestatic abs : (I)I
    //   4776: invokevirtual charAt : (I)C
    //   4779: getstatic burp/Zgii.Ze : Ljava/lang/String;
    //   4782: getstatic burp/Zgkl.ZK : Ljava/lang/Object;
    //   4785: checkcast java/math/BigInteger
    //   4788: invokevirtual intValue : ()I
    //   4791: bipush #32
    //   4793: irem
    //   4794: invokestatic abs : (I)I
    //   4797: invokevirtual charAt : (I)C
    //   4800: if_icmpgt -> 5145
    //   4803: sipush #3710
    //   4806: sipush #-32702
    //   4809: invokestatic a : (II)Ljava/lang/String;
    //   4812: iconst_1
    //   4813: ldc burp/Zgw_
    //   4815: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4818: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4821: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4824: astore #4
    //   4826: aload #4
    //   4828: arraylength
    //   4829: istore #5
    //   4831: iconst_0
    //   4832: istore #6
    //   4834: iload #6
    //   4836: iload #5
    //   4838: if_icmpge -> 4976
    //   4841: aload #4
    //   4843: iload #6
    //   4845: aaload
    //   4846: astore #7
    //   4848: aload #7
    //   4850: invokevirtual getModifiers : ()I
    //   4853: invokestatic isStatic : (I)Z
    //   4856: ifne -> 4866
    //   4859: goto -> 4969
    //   4862: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4865: athrow
    //   4866: aload #7
    //   4868: invokevirtual getType : ()Ljava/lang/Class;
    //   4871: astore #8
    //   4873: aload #8
    //   4875: ifnull -> 4956
    //   4878: aload #8
    //   4880: invokevirtual isPrimitive : ()Z
    //   4883: ifne -> 4956
    //   4886: goto -> 4893
    //   4889: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4892: athrow
    //   4893: aload #8
    //   4895: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4898: ifnull -> 4956
    //   4901: goto -> 4908
    //   4904: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4907: athrow
    //   4908: aload #8
    //   4910: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4913: invokevirtual getName : ()Ljava/lang/String;
    //   4916: ifnull -> 4956
    //   4919: goto -> 4926
    //   4922: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4925: athrow
    //   4926: aload #8
    //   4928: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4931: invokevirtual getName : ()Ljava/lang/String;
    //   4934: sipush #3698
    //   4937: sipush #29146
    //   4940: invokestatic a : (II)Ljava/lang/String;
    //   4943: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4946: ifne -> 4956
    //   4949: goto -> 4956
    //   4952: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4955: athrow
    //   4956: aload #7
    //   4958: iconst_1
    //   4959: invokevirtual setAccessible : (Z)V
    //   4962: aload #7
    //   4964: aconst_null
    //   4965: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4968: pop
    //   4969: iinc #6, 1
    //   4972: iload_2
    //   4973: ifne -> 4834
    //   4976: sipush #3687
    //   4979: sipush #28975
    //   4982: invokestatic a : (II)Ljava/lang/String;
    //   4985: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4988: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4991: astore #4
    //   4993: aload #4
    //   4995: arraylength
    //   4996: istore #5
    //   4998: iconst_0
    //   4999: istore #6
    //   5001: iload #6
    //   5003: iload #5
    //   5005: if_icmpge -> 5141
    //   5008: aload #4
    //   5010: iload #6
    //   5012: aaload
    //   5013: astore #7
    //   5015: aload #7
    //   5017: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5020: pop
    //   5021: aload #7
    //   5023: invokevirtual getModifiers : ()I
    //   5026: invokestatic isStatic : (I)Z
    //   5029: ifeq -> 5127
    //   5032: aload #7
    //   5034: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5037: arraylength
    //   5038: iconst_2
    //   5039: if_icmpne -> 5127
    //   5042: goto -> 5049
    //   5045: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5048: athrow
    //   5049: aload #7
    //   5051: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5054: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   5057: if_acmpne -> 5127
    //   5060: goto -> 5067
    //   5063: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5066: athrow
    //   5067: aload #7
    //   5069: iconst_1
    //   5070: invokevirtual setAccessible : (Z)V
    //   5073: aload #7
    //   5075: aconst_null
    //   5076: iconst_2
    //   5077: anewarray java/lang/Object
    //   5080: dup
    //   5081: iconst_0
    //   5082: aload_0
    //   5083: aastore
    //   5084: dup
    //   5085: iconst_1
    //   5086: aload_1
    //   5087: ifnonnull -> 5105
    //   5090: goto -> 5097
    //   5093: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5096: athrow
    //   5097: aload_1
    //   5098: goto -> 5112
    //   5101: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5104: athrow
    //   5105: aload_1
    //   5106: checkcast [B
    //   5109: invokevirtual clone : ()Ljava/lang/Object;
    //   5112: aastore
    //   5113: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5116: checkcast java/lang/Boolean
    //   5119: invokevirtual booleanValue : ()Z
    //   5122: istore_3
    //   5123: iload_2
    //   5124: ifne -> 5141
    //   5127: iinc #6, 1
    //   5130: iload_2
    //   5131: ifne -> 5001
    //   5134: goto -> 5141
    //   5137: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5140: athrow
    //   5141: iload_2
    //   5142: ifne -> 5483
    //   5145: sipush #3701
    //   5148: sipush #-7181
    //   5151: invokestatic a : (II)Ljava/lang/String;
    //   5154: iconst_1
    //   5155: ldc burp/Zmji
    //   5157: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5160: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5163: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5166: astore #4
    //   5168: aload #4
    //   5170: arraylength
    //   5171: istore #5
    //   5173: iconst_0
    //   5174: istore #6
    //   5176: iload #6
    //   5178: iload #5
    //   5180: if_icmpge -> 5318
    //   5183: aload #4
    //   5185: iload #6
    //   5187: aaload
    //   5188: astore #7
    //   5190: aload #7
    //   5192: invokevirtual getModifiers : ()I
    //   5195: invokestatic isStatic : (I)Z
    //   5198: ifne -> 5208
    //   5201: goto -> 5311
    //   5204: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5207: athrow
    //   5208: aload #7
    //   5210: invokevirtual getType : ()Ljava/lang/Class;
    //   5213: astore #8
    //   5215: aload #8
    //   5217: ifnull -> 5298
    //   5220: aload #8
    //   5222: invokevirtual isPrimitive : ()Z
    //   5225: ifne -> 5298
    //   5228: goto -> 5235
    //   5231: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5234: athrow
    //   5235: aload #8
    //   5237: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5240: ifnull -> 5298
    //   5243: goto -> 5250
    //   5246: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5249: athrow
    //   5250: aload #8
    //   5252: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5255: invokevirtual getName : ()Ljava/lang/String;
    //   5258: ifnull -> 5298
    //   5261: goto -> 5268
    //   5264: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5267: athrow
    //   5268: aload #8
    //   5270: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5273: invokevirtual getName : ()Ljava/lang/String;
    //   5276: sipush #3698
    //   5279: sipush #29146
    //   5282: invokestatic a : (II)Ljava/lang/String;
    //   5285: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5288: ifne -> 5298
    //   5291: goto -> 5298
    //   5294: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5297: athrow
    //   5298: aload #7
    //   5300: iconst_1
    //   5301: invokevirtual setAccessible : (Z)V
    //   5304: aload #7
    //   5306: aconst_null
    //   5307: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5310: pop
    //   5311: iinc #6, 1
    //   5314: iload_2
    //   5315: ifne -> 5176
    //   5318: sipush #3684
    //   5321: sipush #21943
    //   5324: invokestatic a : (II)Ljava/lang/String;
    //   5327: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5330: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5333: astore #4
    //   5335: aload #4
    //   5337: arraylength
    //   5338: istore #5
    //   5340: iconst_0
    //   5341: istore #6
    //   5343: iload #6
    //   5345: iload #5
    //   5347: if_icmpge -> 5483
    //   5350: aload #4
    //   5352: iload #6
    //   5354: aaload
    //   5355: astore #7
    //   5357: aload #7
    //   5359: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5362: pop
    //   5363: aload #7
    //   5365: invokevirtual getModifiers : ()I
    //   5368: invokestatic isStatic : (I)Z
    //   5371: ifeq -> 5469
    //   5374: aload #7
    //   5376: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5379: arraylength
    //   5380: iconst_2
    //   5381: if_icmpne -> 5469
    //   5384: goto -> 5391
    //   5387: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5390: athrow
    //   5391: aload #7
    //   5393: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5396: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   5399: if_acmpne -> 5469
    //   5402: goto -> 5409
    //   5405: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5408: athrow
    //   5409: aload #7
    //   5411: iconst_1
    //   5412: invokevirtual setAccessible : (Z)V
    //   5415: aload #7
    //   5417: aconst_null
    //   5418: iconst_2
    //   5419: anewarray java/lang/Object
    //   5422: dup
    //   5423: iconst_0
    //   5424: aload_0
    //   5425: aastore
    //   5426: dup
    //   5427: iconst_1
    //   5428: aload_1
    //   5429: ifnonnull -> 5447
    //   5432: goto -> 5439
    //   5435: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5438: athrow
    //   5439: aload_1
    //   5440: goto -> 5454
    //   5443: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5446: athrow
    //   5447: aload_1
    //   5448: checkcast [B
    //   5451: invokevirtual clone : ()Ljava/lang/Object;
    //   5454: aastore
    //   5455: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5458: checkcast java/lang/Boolean
    //   5461: invokevirtual booleanValue : ()Z
    //   5464: istore_3
    //   5465: iload_2
    //   5466: ifne -> 5483
    //   5469: iinc #6, 1
    //   5472: iload_2
    //   5473: ifne -> 5343
    //   5476: goto -> 5483
    //   5479: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5482: athrow
    //   5483: iload_3
    //   5484: ireturn
    //   5485: astore_3
    //   5486: new java/lang/Exception
    //   5489: dup
    //   5490: aload_3
    //   5491: invokevirtual getMessage : ()Ljava/lang/String;
    //   5494: invokespecial <init> : (Ljava/lang/String;)V
    //   5497: athrow
    // Exception table:
    //   from	to	target	type
    //   4	3295	5485	java/lang/Throwable
    //   33	47	50	java/lang/Throwable
    //   40	61	64	java/lang/Throwable
    //   54	75	78	java/lang/Throwable
    //   68	89	92	java/lang/Throwable
    //   82	103	106	java/lang/Throwable
    //   96	117	120	java/lang/Throwable
    //   110	131	134	java/lang/Throwable
    //   124	145	148	java/lang/Throwable
    //   138	155	158	java/lang/Throwable
    //   194	208	211	java/lang/Throwable
    //   201	222	225	java/lang/Throwable
    //   215	236	239	java/lang/Throwable
    //   229	250	253	java/lang/Throwable
    //   243	264	267	java/lang/Throwable
    //   257	278	281	java/lang/Throwable
    //   271	292	295	java/lang/Throwable
    //   285	306	309	java/lang/Throwable
    //   299	323	326	java/lang/Throwable
    //   387	405	408	java/lang/Throwable
    //   396	421	424	java/lang/Throwable
    //   412	438	441	java/lang/Throwable
    //   428	454	457	java/lang/Throwable
    //   445	471	474	java/lang/Throwable
    //   461	487	490	java/lang/Throwable
    //   478	503	506	java/lang/Throwable
    //   494	526	529	java/lang/Throwable
    //   510	542	545	java/lang/Throwable
    //   533	558	561	java/lang/Throwable
    //   549	581	584	java/lang/Throwable
    //   565	597	600	java/lang/Throwable
    //   588	613	616	java/lang/Throwable
    //   604	632	635	java/lang/Throwable
    //   762	797	800	java/lang/Throwable
    //   804	845	848	java/lang/Throwable
    //   1176	1200	1203	java/lang/Throwable
    //   1274	1311	1311	java/lang/Throwable
    //   1315	1336	1336	java/lang/Throwable
    //   1340	1370	1370	java/lang/Throwable
    //   1858	1882	1885	java/lang/Throwable
    //   1956	1993	1993	java/lang/Throwable
    //   1997	2018	2018	java/lang/Throwable
    //   2022	2052	2052	java/lang/Throwable
    //   2277	2291	2291	java/lang/Throwable
    //   2302	2315	2318	java/lang/Throwable
    //   2307	2330	2333	java/lang/Throwable
    //   2322	2348	2351	java/lang/Throwable
    //   2337	2378	2381	java/lang/Throwable
    //   2441	2468	2471	java/lang/Throwable
    //   2458	2489	2492	java/lang/Throwable
    //   2475	2519	2522	java/lang/Throwable
    //   2496	2530	2530	java/lang/Throwable
    //   2541	2557	2560	java/lang/Throwable
    //   2656	2670	2670	java/lang/Throwable
    //   2681	2694	2697	java/lang/Throwable
    //   2686	2709	2712	java/lang/Throwable
    //   2701	2727	2730	java/lang/Throwable
    //   2716	2757	2760	java/lang/Throwable
    //   2823	2850	2853	java/lang/Throwable
    //   2840	2868	2871	java/lang/Throwable
    //   2857	2898	2901	java/lang/Throwable
    //   2875	2909	2909	java/lang/Throwable
    //   2931	2942	2945	java/lang/Throwable
    //   2997	3011	3011	java/lang/Throwable
    //   3022	3035	3038	java/lang/Throwable
    //   3027	3050	3053	java/lang/Throwable
    //   3042	3068	3071	java/lang/Throwable
    //   3057	3098	3101	java/lang/Throwable
    //   3164	3191	3194	java/lang/Throwable
    //   3181	3209	3212	java/lang/Throwable
    //   3198	3239	3242	java/lang/Throwable
    //   3216	3250	3250	java/lang/Throwable
    //   3272	3283	3286	java/lang/Throwable
    //   3296	4026	5485	java/lang/Throwable
    //   3386	3400	3400	java/lang/Throwable
    //   3411	3424	3427	java/lang/Throwable
    //   3416	3439	3442	java/lang/Throwable
    //   3431	3457	3460	java/lang/Throwable
    //   3446	3487	3490	java/lang/Throwable
    //   3553	3580	3583	java/lang/Throwable
    //   3570	3598	3601	java/lang/Throwable
    //   3587	3628	3631	java/lang/Throwable
    //   3605	3639	3639	java/lang/Throwable
    //   3661	3672	3675	java/lang/Throwable
    //   3728	3742	3742	java/lang/Throwable
    //   3753	3766	3769	java/lang/Throwable
    //   3758	3781	3784	java/lang/Throwable
    //   3773	3799	3802	java/lang/Throwable
    //   3788	3829	3832	java/lang/Throwable
    //   3895	3922	3925	java/lang/Throwable
    //   3912	3940	3943	java/lang/Throwable
    //   3929	3970	3973	java/lang/Throwable
    //   3947	3981	3981	java/lang/Throwable
    //   4003	4014	4017	java/lang/Throwable
    //   4027	4757	5485	java/lang/Throwable
    //   4117	4131	4131	java/lang/Throwable
    //   4142	4155	4158	java/lang/Throwable
    //   4147	4170	4173	java/lang/Throwable
    //   4162	4188	4191	java/lang/Throwable
    //   4177	4218	4221	java/lang/Throwable
    //   4284	4311	4314	java/lang/Throwable
    //   4301	4329	4332	java/lang/Throwable
    //   4318	4359	4362	java/lang/Throwable
    //   4336	4370	4370	java/lang/Throwable
    //   4392	4403	4406	java/lang/Throwable
    //   4459	4473	4473	java/lang/Throwable
    //   4484	4497	4500	java/lang/Throwable
    //   4489	4512	4515	java/lang/Throwable
    //   4504	4530	4533	java/lang/Throwable
    //   4519	4560	4563	java/lang/Throwable
    //   4626	4653	4656	java/lang/Throwable
    //   4643	4671	4674	java/lang/Throwable
    //   4660	4701	4704	java/lang/Throwable
    //   4678	4712	4712	java/lang/Throwable
    //   4734	4745	4748	java/lang/Throwable
    //   4758	5484	5485	java/lang/Throwable
    //   4848	4862	4862	java/lang/Throwable
    //   4873	4886	4889	java/lang/Throwable
    //   4878	4901	4904	java/lang/Throwable
    //   4893	4919	4922	java/lang/Throwable
    //   4908	4949	4952	java/lang/Throwable
    //   5015	5042	5045	java/lang/Throwable
    //   5032	5060	5063	java/lang/Throwable
    //   5049	5090	5093	java/lang/Throwable
    //   5067	5101	5101	java/lang/Throwable
    //   5123	5134	5137	java/lang/Throwable
    //   5190	5204	5204	java/lang/Throwable
    //   5215	5228	5231	java/lang/Throwable
    //   5220	5243	5246	java/lang/Throwable
    //   5235	5261	5264	java/lang/Throwable
    //   5250	5291	5294	java/lang/Throwable
    //   5357	5384	5387	java/lang/Throwable
    //   5374	5402	5405	java/lang/Throwable
    //   5391	5432	5435	java/lang/Throwable
    //   5409	5443	5443	java/lang/Throwable
    //   5465	5476	5479	java/lang/Throwable
  }
  
  static void Zp(Object paramObject) {
    Zs9u.ZM = a(3692, 18732);
    Zs9u.Zd = new BigInteger(a(3699, 5011));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zbxp.ZS.charAt(Math.abs(((BigInteger)Zlyf.Zm).intValue() % 32)) > Zgdt.Zd.charAt(Math.abs(((BigInteger)Zgii.ZD).intValue() % 32))) {
          try {
            Zezz.ZO(Class.forName(a(3705, 8960)));
            if (bool)
              Zkup.Za(Class.forName(a(3696, -18902))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zkup.Za(Class.forName(a(3696, -18902)));
    } catch (Throwable throwable) {}
  }
  
  static void Zk(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #32
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Ö¾ðÈíKeÏ\\tàþÔJ¹w-GÐ¡NÄ\\t95íÁâ\\tìæUIbe<Á\\t\\b ÙOOr\\töw{á$}³)\\tçM4<¥ÌóûyM÷i\\b;×Éê\\nÙ¤\\f¶TîGO1Ü -n?Öòóæ)ò{ÀR(Fôãzht½ås<ý»åÃQÂÜEó<exû¾LNäúáíº@\\t<ÊOÌÊÒ.Ù\\täãTé©vk£Q\\tTTBk¨<MR &®°\\bcgNÝú"3:,TwÔSP°I5³ý°Ó^é y|[Cu(,öcc3-É¬s. ÀC/¤ 9ÿ¦ôþ8¼îñY>"â%a@>*|2i" òÍ¾^ËÕÌ7]gÄ+8\yP'Bó§²\\týX(ÂüQMªDðÂm,Ý´MßëÇmÌÀ#\\f\\b^S¢wAÆMÔÁ$$fºÚIöÔX9x-1²H+_b°}·9ÁJáa²ÄXËÞd¾è¨|ÝG.\\tþ)óì,E#\\t/-ö­ó<¶\\tè-Õ0MtÅ\\tvTãÁ;Z`ðÇ&µ\\t!>ìR¾M\\r\\t:Ò»ë\\tqZæÞÿ $N\\t(ÌÍ\\fÊ:Ê\\tõFv]íàây\\tu';Ç,±úµ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #108
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
    //   68: ldc 'åñIÑª\\r\\th¶'¡%:'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #74
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
    //   129: putstatic burp/Zb3p.a : [Ljava/lang/String;
    //   132: bipush #32
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zb3p.b : [Ljava/lang/String;
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
    //   159: if_icmpgt -> 259
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 221, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #91
    //   214: goto -> 243
    //   217: iconst_4
    //   218: goto -> 243
    //   221: bipush #30
    //   223: goto -> 243
    //   226: bipush #95
    //   228: goto -> 243
    //   231: bipush #19
    //   233: goto -> 243
    //   236: bipush #101
    //   238: goto -> 243
    //   241: bipush #91
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 166
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 162
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 99
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: sipush #3691
    //   307: sipush #-25256
    //   310: invokestatic a : (II)Ljava/lang/String;
    //   313: invokespecial <init> : (Ljava/lang/String;)V
    //   316: putstatic burp/Zb3p.Zx : Ljava/lang/Object;
    //   319: sipush #3693
    //   322: sipush #-11878
    //   325: invokestatic a : (II)Ljava/lang/String;
    //   328: putstatic burp/Zb3p.ZX : Ljava/lang/String;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xE63) & 0xFFFF;
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
      byte b1 = 104;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb3p.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */