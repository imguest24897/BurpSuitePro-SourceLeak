package burp;

import java.math.BigInteger;

class Zb9h extends ClassLoader {
  static Object Zm;
  
  static String Zf;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zt(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean Zk(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Ze_l.ZX : Ljava/lang/Object;
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
    //   166: ifeq -> 20
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
    //   334: ifeq -> 181
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
    //   363: ifeq -> 348
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
    //   402: ifeq -> 639
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
    //   435: ifeq -> 639
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
    //   468: ifeq -> 639
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
    //   523: ifeq -> 639
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
    //   578: ifeq -> 639
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
    //   643: ifeq -> 380
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
    //   759: ifeq -> 652
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
    //   868: putstatic burp/Zmpp.Z_ : Ljava/lang/Object;
    //   871: getstatic burp/Zro5.ZT : Ljava/lang/Object;
    //   874: checkcast java/math/BigInteger
    //   877: invokevirtual toByteArray : ()[B
    //   880: astore_3
    //   881: new java/lang/StringBuilder
    //   884: dup
    //   885: invokespecial <init> : ()V
    //   888: astore #5
    //   890: aload #5
    //   892: sipush #-3718
    //   895: sipush #21162
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
    //   943: ifeq -> 916
    //   946: aload #5
    //   948: sipush #-3724
    //   951: sipush #-25062
    //   954: invokestatic a : (II)Ljava/lang/String;
    //   957: ldc ''
    //   959: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   962: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   965: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   968: pop
    //   969: aload #5
    //   971: sipush #-3714
    //   974: sipush #15812
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
    //   1069: ifeq -> 1025
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
    //   1197: ifeq -> 1262
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
    //   1420: ifeq -> 1169
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
    //   1462: ifeq -> 1138
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
    //   1546: ifeq -> 1504
    //   1549: aload #14
    //   1551: astore #4
    //   1553: getstatic burp/Zlsw.ZJ : Ljava/lang/Object;
    //   1556: checkcast java/math/BigInteger
    //   1559: invokevirtual toByteArray : ()[B
    //   1562: astore_3
    //   1563: new java/lang/StringBuilder
    //   1566: dup
    //   1567: invokespecial <init> : ()V
    //   1570: astore #5
    //   1572: aload #5
    //   1574: sipush #-3727
    //   1577: sipush #28233
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
    //   1625: ifeq -> 1598
    //   1628: aload #5
    //   1630: sipush #-3720
    //   1633: sipush #6565
    //   1636: invokestatic a : (II)Ljava/lang/String;
    //   1639: ldc ''
    //   1641: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1644: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   1647: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1650: pop
    //   1651: aload #5
    //   1653: sipush #-3725
    //   1656: sipush #16078
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
    //   1751: ifeq -> 1707
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
    //   1879: ifeq -> 1944
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
    //   2102: ifeq -> 1851
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
    //   2144: ifeq -> 1820
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
    //   2228: ifeq -> 2186
    //   2231: aload #14
    //   2233: astore #4
    //   2235: sipush #-3735
    //   2238: sipush #-28081
    //   2241: invokestatic a : (II)Ljava/lang/String;
    //   2244: iconst_1
    //   2245: ldc burp/Zx4u
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
    //   2363: sipush #-3717
    //   2366: sipush #-9579
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
    //   2402: ifeq -> 2264
    //   2405: sipush #-3728
    //   2408: sipush #-21923
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
    //   2547: ifeq -> 2564
    //   2550: iinc #5, 1
    //   2553: iload_2
    //   2554: ifeq -> 2428
    //   2557: goto -> 2564
    //   2560: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2563: athrow
    //   2564: getstatic burp/Zlsw.ZJ : Ljava/lang/Object;
    //   2567: checkcast java/math/BigInteger
    //   2570: invokevirtual toByteArray : ()[B
    //   2573: astore_3
    //   2574: bipush #64
    //   2576: newarray byte
    //   2578: dup
    //   2579: iconst_0
    //   2580: bipush #-128
    //   2582: bastore
    //   2583: dup
    //   2584: iconst_1
    //   2585: iconst_0
    //   2586: bastore
    //   2587: dup
    //   2588: iconst_2
    //   2589: iconst_0
    //   2590: bastore
    //   2591: dup
    //   2592: iconst_3
    //   2593: iconst_0
    //   2594: bastore
    //   2595: dup
    //   2596: iconst_4
    //   2597: iconst_0
    //   2598: bastore
    //   2599: dup
    //   2600: iconst_5
    //   2601: iconst_0
    //   2602: bastore
    //   2603: dup
    //   2604: bipush #6
    //   2606: iconst_0
    //   2607: bastore
    //   2608: dup
    //   2609: bipush #7
    //   2611: iconst_0
    //   2612: bastore
    //   2613: dup
    //   2614: bipush #8
    //   2616: iconst_0
    //   2617: bastore
    //   2618: dup
    //   2619: bipush #9
    //   2621: iconst_0
    //   2622: bastore
    //   2623: dup
    //   2624: bipush #10
    //   2626: iconst_0
    //   2627: bastore
    //   2628: dup
    //   2629: bipush #11
    //   2631: iconst_0
    //   2632: bastore
    //   2633: dup
    //   2634: bipush #12
    //   2636: iconst_0
    //   2637: bastore
    //   2638: dup
    //   2639: bipush #13
    //   2641: iconst_0
    //   2642: bastore
    //   2643: dup
    //   2644: bipush #14
    //   2646: iconst_0
    //   2647: bastore
    //   2648: dup
    //   2649: bipush #15
    //   2651: iconst_0
    //   2652: bastore
    //   2653: dup
    //   2654: bipush #16
    //   2656: iconst_0
    //   2657: bastore
    //   2658: dup
    //   2659: bipush #17
    //   2661: iconst_0
    //   2662: bastore
    //   2663: dup
    //   2664: bipush #18
    //   2666: iconst_0
    //   2667: bastore
    //   2668: dup
    //   2669: bipush #19
    //   2671: iconst_0
    //   2672: bastore
    //   2673: dup
    //   2674: bipush #20
    //   2676: iconst_0
    //   2677: bastore
    //   2678: dup
    //   2679: bipush #21
    //   2681: iconst_0
    //   2682: bastore
    //   2683: dup
    //   2684: bipush #22
    //   2686: iconst_0
    //   2687: bastore
    //   2688: dup
    //   2689: bipush #23
    //   2691: iconst_0
    //   2692: bastore
    //   2693: dup
    //   2694: bipush #24
    //   2696: iconst_0
    //   2697: bastore
    //   2698: dup
    //   2699: bipush #25
    //   2701: iconst_0
    //   2702: bastore
    //   2703: dup
    //   2704: bipush #26
    //   2706: iconst_0
    //   2707: bastore
    //   2708: dup
    //   2709: bipush #27
    //   2711: iconst_0
    //   2712: bastore
    //   2713: dup
    //   2714: bipush #28
    //   2716: iconst_0
    //   2717: bastore
    //   2718: dup
    //   2719: bipush #29
    //   2721: iconst_0
    //   2722: bastore
    //   2723: dup
    //   2724: bipush #30
    //   2726: iconst_0
    //   2727: bastore
    //   2728: dup
    //   2729: bipush #31
    //   2731: iconst_0
    //   2732: bastore
    //   2733: dup
    //   2734: bipush #32
    //   2736: iconst_0
    //   2737: bastore
    //   2738: dup
    //   2739: bipush #33
    //   2741: iconst_0
    //   2742: bastore
    //   2743: dup
    //   2744: bipush #34
    //   2746: iconst_0
    //   2747: bastore
    //   2748: dup
    //   2749: bipush #35
    //   2751: iconst_0
    //   2752: bastore
    //   2753: dup
    //   2754: bipush #36
    //   2756: iconst_0
    //   2757: bastore
    //   2758: dup
    //   2759: bipush #37
    //   2761: iconst_0
    //   2762: bastore
    //   2763: dup
    //   2764: bipush #38
    //   2766: iconst_0
    //   2767: bastore
    //   2768: dup
    //   2769: bipush #39
    //   2771: iconst_0
    //   2772: bastore
    //   2773: dup
    //   2774: bipush #40
    //   2776: iconst_0
    //   2777: bastore
    //   2778: dup
    //   2779: bipush #41
    //   2781: iconst_0
    //   2782: bastore
    //   2783: dup
    //   2784: bipush #42
    //   2786: iconst_0
    //   2787: bastore
    //   2788: dup
    //   2789: bipush #43
    //   2791: iconst_0
    //   2792: bastore
    //   2793: dup
    //   2794: bipush #44
    //   2796: iconst_0
    //   2797: bastore
    //   2798: dup
    //   2799: bipush #45
    //   2801: iconst_0
    //   2802: bastore
    //   2803: dup
    //   2804: bipush #46
    //   2806: iconst_0
    //   2807: bastore
    //   2808: dup
    //   2809: bipush #47
    //   2811: iconst_0
    //   2812: bastore
    //   2813: dup
    //   2814: bipush #48
    //   2816: iconst_0
    //   2817: bastore
    //   2818: dup
    //   2819: bipush #49
    //   2821: iconst_0
    //   2822: bastore
    //   2823: dup
    //   2824: bipush #50
    //   2826: iconst_0
    //   2827: bastore
    //   2828: dup
    //   2829: bipush #51
    //   2831: iconst_0
    //   2832: bastore
    //   2833: dup
    //   2834: bipush #52
    //   2836: iconst_0
    //   2837: bastore
    //   2838: dup
    //   2839: bipush #53
    //   2841: iconst_0
    //   2842: bastore
    //   2843: dup
    //   2844: bipush #54
    //   2846: iconst_0
    //   2847: bastore
    //   2848: dup
    //   2849: bipush #55
    //   2851: iconst_0
    //   2852: bastore
    //   2853: dup
    //   2854: bipush #56
    //   2856: iconst_0
    //   2857: bastore
    //   2858: dup
    //   2859: bipush #57
    //   2861: iconst_0
    //   2862: bastore
    //   2863: dup
    //   2864: bipush #58
    //   2866: iconst_0
    //   2867: bastore
    //   2868: dup
    //   2869: bipush #59
    //   2871: iconst_0
    //   2872: bastore
    //   2873: dup
    //   2874: bipush #60
    //   2876: iconst_0
    //   2877: bastore
    //   2878: dup
    //   2879: bipush #61
    //   2881: iconst_0
    //   2882: bastore
    //   2883: dup
    //   2884: bipush #62
    //   2886: iconst_0
    //   2887: bastore
    //   2888: dup
    //   2889: bipush #63
    //   2891: iconst_0
    //   2892: bastore
    //   2893: astore #5
    //   2895: bipush #64
    //   2897: newarray int
    //   2899: dup
    //   2900: iconst_0
    //   2901: ldc 1116352408
    //   2903: iastore
    //   2904: dup
    //   2905: iconst_1
    //   2906: ldc 1899447441
    //   2908: iastore
    //   2909: dup
    //   2910: iconst_2
    //   2911: ldc -1245643825
    //   2913: iastore
    //   2914: dup
    //   2915: iconst_3
    //   2916: ldc -373957723
    //   2918: iastore
    //   2919: dup
    //   2920: iconst_4
    //   2921: ldc 961987163
    //   2923: iastore
    //   2924: dup
    //   2925: iconst_5
    //   2926: ldc 1508970993
    //   2928: iastore
    //   2929: dup
    //   2930: bipush #6
    //   2932: ldc -1841331548
    //   2934: iastore
    //   2935: dup
    //   2936: bipush #7
    //   2938: ldc -1424204075
    //   2940: iastore
    //   2941: dup
    //   2942: bipush #8
    //   2944: ldc -670586216
    //   2946: iastore
    //   2947: dup
    //   2948: bipush #9
    //   2950: ldc 310598401
    //   2952: iastore
    //   2953: dup
    //   2954: bipush #10
    //   2956: ldc 607225278
    //   2958: iastore
    //   2959: dup
    //   2960: bipush #11
    //   2962: ldc 1426881987
    //   2964: iastore
    //   2965: dup
    //   2966: bipush #12
    //   2968: ldc 1925078388
    //   2970: iastore
    //   2971: dup
    //   2972: bipush #13
    //   2974: ldc -2132889090
    //   2976: iastore
    //   2977: dup
    //   2978: bipush #14
    //   2980: ldc -1680079193
    //   2982: iastore
    //   2983: dup
    //   2984: bipush #15
    //   2986: ldc -1046744716
    //   2988: iastore
    //   2989: dup
    //   2990: bipush #16
    //   2992: ldc -459576895
    //   2994: iastore
    //   2995: dup
    //   2996: bipush #17
    //   2998: ldc -272742522
    //   3000: iastore
    //   3001: dup
    //   3002: bipush #18
    //   3004: ldc 264347078
    //   3006: iastore
    //   3007: dup
    //   3008: bipush #19
    //   3010: ldc 604807628
    //   3012: iastore
    //   3013: dup
    //   3014: bipush #20
    //   3016: ldc 770255983
    //   3018: iastore
    //   3019: dup
    //   3020: bipush #21
    //   3022: ldc 1249150122
    //   3024: iastore
    //   3025: dup
    //   3026: bipush #22
    //   3028: ldc 1555081692
    //   3030: iastore
    //   3031: dup
    //   3032: bipush #23
    //   3034: ldc 1996064986
    //   3036: iastore
    //   3037: dup
    //   3038: bipush #24
    //   3040: ldc -1740746414
    //   3042: iastore
    //   3043: dup
    //   3044: bipush #25
    //   3046: ldc -1473132947
    //   3048: iastore
    //   3049: dup
    //   3050: bipush #26
    //   3052: ldc -1341970488
    //   3054: iastore
    //   3055: dup
    //   3056: bipush #27
    //   3058: ldc -1084653625
    //   3060: iastore
    //   3061: dup
    //   3062: bipush #28
    //   3064: ldc -958395405
    //   3066: iastore
    //   3067: dup
    //   3068: bipush #29
    //   3070: ldc -710438585
    //   3072: iastore
    //   3073: dup
    //   3074: bipush #30
    //   3076: ldc 113926993
    //   3078: iastore
    //   3079: dup
    //   3080: bipush #31
    //   3082: ldc 338241895
    //   3084: iastore
    //   3085: dup
    //   3086: bipush #32
    //   3088: ldc 666307205
    //   3090: iastore
    //   3091: dup
    //   3092: bipush #33
    //   3094: ldc 773529912
    //   3096: iastore
    //   3097: dup
    //   3098: bipush #34
    //   3100: ldc 1294757372
    //   3102: iastore
    //   3103: dup
    //   3104: bipush #35
    //   3106: ldc 1396182291
    //   3108: iastore
    //   3109: dup
    //   3110: bipush #36
    //   3112: ldc 1695183700
    //   3114: iastore
    //   3115: dup
    //   3116: bipush #37
    //   3118: ldc 1986661051
    //   3120: iastore
    //   3121: dup
    //   3122: bipush #38
    //   3124: ldc -2117940946
    //   3126: iastore
    //   3127: dup
    //   3128: bipush #39
    //   3130: ldc -1838011259
    //   3132: iastore
    //   3133: dup
    //   3134: bipush #40
    //   3136: ldc -1564481375
    //   3138: iastore
    //   3139: dup
    //   3140: bipush #41
    //   3142: ldc -1474664885
    //   3144: iastore
    //   3145: dup
    //   3146: bipush #42
    //   3148: ldc -1035236496
    //   3150: iastore
    //   3151: dup
    //   3152: bipush #43
    //   3154: ldc -949202525
    //   3156: iastore
    //   3157: dup
    //   3158: bipush #44
    //   3160: ldc -778901479
    //   3162: iastore
    //   3163: dup
    //   3164: bipush #45
    //   3166: ldc -694614492
    //   3168: iastore
    //   3169: dup
    //   3170: bipush #46
    //   3172: ldc -200395387
    //   3174: iastore
    //   3175: dup
    //   3176: bipush #47
    //   3178: ldc 275423344
    //   3180: iastore
    //   3181: dup
    //   3182: bipush #48
    //   3184: ldc 430227734
    //   3186: iastore
    //   3187: dup
    //   3188: bipush #49
    //   3190: ldc 506948616
    //   3192: iastore
    //   3193: dup
    //   3194: bipush #50
    //   3196: ldc 659060556
    //   3198: iastore
    //   3199: dup
    //   3200: bipush #51
    //   3202: ldc 883997877
    //   3204: iastore
    //   3205: dup
    //   3206: bipush #52
    //   3208: ldc 958139571
    //   3210: iastore
    //   3211: dup
    //   3212: bipush #53
    //   3214: ldc 1322822218
    //   3216: iastore
    //   3217: dup
    //   3218: bipush #54
    //   3220: ldc 1537002063
    //   3222: iastore
    //   3223: dup
    //   3224: bipush #55
    //   3226: ldc 1747873779
    //   3228: iastore
    //   3229: dup
    //   3230: bipush #56
    //   3232: ldc 1955562222
    //   3234: iastore
    //   3235: dup
    //   3236: bipush #57
    //   3238: ldc 2024104815
    //   3240: iastore
    //   3241: dup
    //   3242: bipush #58
    //   3244: ldc -2067236844
    //   3246: iastore
    //   3247: dup
    //   3248: bipush #59
    //   3250: ldc -1933114872
    //   3252: iastore
    //   3253: dup
    //   3254: bipush #60
    //   3256: ldc -1866530822
    //   3258: iastore
    //   3259: dup
    //   3260: bipush #61
    //   3262: ldc -1538233109
    //   3264: iastore
    //   3265: dup
    //   3266: bipush #62
    //   3268: ldc -1090935817
    //   3270: iastore
    //   3271: dup
    //   3272: bipush #63
    //   3274: ldc -965641998
    //   3276: iastore
    //   3277: astore #6
    //   3279: iconst_2
    //   3280: newarray int
    //   3282: dup
    //   3283: iconst_0
    //   3284: iconst_0
    //   3285: iastore
    //   3286: dup
    //   3287: iconst_1
    //   3288: iconst_0
    //   3289: iastore
    //   3290: astore #7
    //   3292: bipush #8
    //   3294: newarray int
    //   3296: dup
    //   3297: iconst_0
    //   3298: ldc 1779033703
    //   3300: iastore
    //   3301: dup
    //   3302: iconst_1
    //   3303: ldc -1150833019
    //   3305: iastore
    //   3306: dup
    //   3307: iconst_2
    //   3308: ldc 1013904242
    //   3310: iastore
    //   3311: dup
    //   3312: iconst_3
    //   3313: ldc -1521486534
    //   3315: iastore
    //   3316: dup
    //   3317: iconst_4
    //   3318: ldc 1359893119
    //   3320: iastore
    //   3321: dup
    //   3322: iconst_5
    //   3323: ldc -1694144372
    //   3325: iastore
    //   3326: dup
    //   3327: bipush #6
    //   3329: ldc 528734635
    //   3331: iastore
    //   3332: dup
    //   3333: bipush #7
    //   3335: ldc 1541459225
    //   3337: iastore
    //   3338: astore #8
    //   3340: bipush #64
    //   3342: newarray byte
    //   3344: astore #9
    //   3346: bipush #64
    //   3348: newarray byte
    //   3350: astore #10
    //   3352: aload_3
    //   3353: arraylength
    //   3354: istore #11
    //   3356: aload #7
    //   3358: iconst_0
    //   3359: iaload
    //   3360: bipush #63
    //   3362: iand
    //   3363: istore #12
    //   3365: aload #7
    //   3367: iconst_0
    //   3368: dup2
    //   3369: iaload
    //   3370: iload #11
    //   3372: iadd
    //   3373: iastore
    //   3374: aload #7
    //   3376: iconst_0
    //   3377: dup2
    //   3378: iaload
    //   3379: iconst_m1
    //   3380: iand
    //   3381: iastore
    //   3382: aload #7
    //   3384: iconst_0
    //   3385: iaload
    //   3386: iload #11
    //   3388: if_icmpge -> 3406
    //   3391: aload #7
    //   3393: iconst_1
    //   3394: dup2
    //   3395: iaload
    //   3396: iconst_1
    //   3397: iadd
    //   3398: iastore
    //   3399: goto -> 3406
    //   3402: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3405: athrow
    //   3406: iconst_0
    //   3407: istore #13
    //   3409: iload #11
    //   3411: bipush #64
    //   3413: if_icmplt -> 4022
    //   3416: iconst_0
    //   3417: istore #14
    //   3419: iload #14
    //   3421: bipush #64
    //   3423: if_icmpge -> 3445
    //   3426: aload #10
    //   3428: iload #14
    //   3430: aload_3
    //   3431: iload #13
    //   3433: iload #14
    //   3435: iadd
    //   3436: baload
    //   3437: bastore
    //   3438: iinc #14, 1
    //   3441: iload_2
    //   3442: ifeq -> 3419
    //   3445: bipush #64
    //   3447: newarray int
    //   3449: astore #14
    //   3451: bipush #8
    //   3453: newarray int
    //   3455: astore #15
    //   3457: iconst_0
    //   3458: istore #16
    //   3460: iload #16
    //   3462: bipush #8
    //   3464: if_icmpge -> 3484
    //   3467: aload #15
    //   3469: iload #16
    //   3471: aload #8
    //   3473: iload #16
    //   3475: iaload
    //   3476: iastore
    //   3477: iinc #16, 1
    //   3480: iload_2
    //   3481: ifeq -> 3460
    //   3484: iconst_0
    //   3485: istore #16
    //   3487: iload #16
    //   3489: bipush #64
    //   3491: if_icmpge -> 3982
    //   3494: iload #16
    //   3496: bipush #16
    //   3498: if_icmpge -> 3579
    //   3501: aload #14
    //   3503: iload #16
    //   3505: aload #10
    //   3507: iconst_4
    //   3508: iload #16
    //   3510: imul
    //   3511: baload
    //   3512: sipush #255
    //   3515: iand
    //   3516: bipush #24
    //   3518: ishl
    //   3519: aload #10
    //   3521: iconst_4
    //   3522: iload #16
    //   3524: imul
    //   3525: iconst_1
    //   3526: iadd
    //   3527: baload
    //   3528: sipush #255
    //   3531: iand
    //   3532: bipush #16
    //   3534: ishl
    //   3535: ior
    //   3536: aload #10
    //   3538: iconst_4
    //   3539: iload #16
    //   3541: imul
    //   3542: iconst_2
    //   3543: iadd
    //   3544: baload
    //   3545: sipush #255
    //   3548: iand
    //   3549: bipush #8
    //   3551: ishl
    //   3552: ior
    //   3553: aload #10
    //   3555: iconst_4
    //   3556: iload #16
    //   3558: imul
    //   3559: iconst_3
    //   3560: iadd
    //   3561: baload
    //   3562: sipush #255
    //   3565: iand
    //   3566: ior
    //   3567: iastore
    //   3568: iload_2
    //   3569: ifeq -> 3722
    //   3572: goto -> 3579
    //   3575: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3578: athrow
    //   3579: aload #14
    //   3581: iload #16
    //   3583: aload #14
    //   3585: iload #16
    //   3587: iconst_2
    //   3588: isub
    //   3589: iaload
    //   3590: bipush #17
    //   3592: iushr
    //   3593: aload #14
    //   3595: iload #16
    //   3597: iconst_2
    //   3598: isub
    //   3599: iaload
    //   3600: bipush #15
    //   3602: ishl
    //   3603: ior
    //   3604: aload #14
    //   3606: iload #16
    //   3608: iconst_2
    //   3609: isub
    //   3610: iaload
    //   3611: bipush #19
    //   3613: iushr
    //   3614: aload #14
    //   3616: iload #16
    //   3618: iconst_2
    //   3619: isub
    //   3620: iaload
    //   3621: bipush #13
    //   3623: ishl
    //   3624: ior
    //   3625: ixor
    //   3626: aload #14
    //   3628: iload #16
    //   3630: iconst_2
    //   3631: isub
    //   3632: iaload
    //   3633: bipush #10
    //   3635: iushr
    //   3636: ixor
    //   3637: aload #14
    //   3639: iload #16
    //   3641: bipush #7
    //   3643: isub
    //   3644: iaload
    //   3645: iadd
    //   3646: aload #14
    //   3648: iload #16
    //   3650: bipush #15
    //   3652: isub
    //   3653: iaload
    //   3654: bipush #7
    //   3656: iushr
    //   3657: aload #14
    //   3659: iload #16
    //   3661: bipush #15
    //   3663: isub
    //   3664: iaload
    //   3665: bipush #25
    //   3667: ishl
    //   3668: ior
    //   3669: aload #14
    //   3671: iload #16
    //   3673: bipush #15
    //   3675: isub
    //   3676: iaload
    //   3677: bipush #18
    //   3679: iushr
    //   3680: aload #14
    //   3682: iload #16
    //   3684: bipush #15
    //   3686: isub
    //   3687: iaload
    //   3688: bipush #14
    //   3690: ishl
    //   3691: ior
    //   3692: ixor
    //   3693: aload #14
    //   3695: iload #16
    //   3697: bipush #15
    //   3699: isub
    //   3700: iaload
    //   3701: iconst_3
    //   3702: iushr
    //   3703: ixor
    //   3704: iadd
    //   3705: aload #14
    //   3707: iload #16
    //   3709: bipush #16
    //   3711: isub
    //   3712: iaload
    //   3713: iadd
    //   3714: iastore
    //   3715: goto -> 3722
    //   3718: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3721: athrow
    //   3722: aload #15
    //   3724: bipush #7
    //   3726: iaload
    //   3727: aload #15
    //   3729: iconst_4
    //   3730: iaload
    //   3731: bipush #6
    //   3733: iushr
    //   3734: aload #15
    //   3736: iconst_4
    //   3737: iaload
    //   3738: bipush #26
    //   3740: ishl
    //   3741: ior
    //   3742: aload #15
    //   3744: iconst_4
    //   3745: iaload
    //   3746: bipush #11
    //   3748: iushr
    //   3749: aload #15
    //   3751: iconst_4
    //   3752: iaload
    //   3753: bipush #21
    //   3755: ishl
    //   3756: ior
    //   3757: ixor
    //   3758: aload #15
    //   3760: iconst_4
    //   3761: iaload
    //   3762: bipush #25
    //   3764: iushr
    //   3765: aload #15
    //   3767: iconst_4
    //   3768: iaload
    //   3769: bipush #7
    //   3771: ishl
    //   3772: ior
    //   3773: ixor
    //   3774: iadd
    //   3775: aload #15
    //   3777: bipush #6
    //   3779: iaload
    //   3780: aload #15
    //   3782: iconst_4
    //   3783: iaload
    //   3784: aload #15
    //   3786: iconst_5
    //   3787: iaload
    //   3788: aload #15
    //   3790: bipush #6
    //   3792: iaload
    //   3793: ixor
    //   3794: iand
    //   3795: ixor
    //   3796: iadd
    //   3797: aload #6
    //   3799: iload #16
    //   3801: iaload
    //   3802: iadd
    //   3803: aload #14
    //   3805: iload #16
    //   3807: iaload
    //   3808: iadd
    //   3809: istore #17
    //   3811: aload #15
    //   3813: iconst_0
    //   3814: iaload
    //   3815: iconst_2
    //   3816: iushr
    //   3817: aload #15
    //   3819: iconst_0
    //   3820: iaload
    //   3821: bipush #30
    //   3823: ishl
    //   3824: ior
    //   3825: aload #15
    //   3827: iconst_0
    //   3828: iaload
    //   3829: bipush #13
    //   3831: iushr
    //   3832: aload #15
    //   3834: iconst_0
    //   3835: iaload
    //   3836: bipush #19
    //   3838: ishl
    //   3839: ior
    //   3840: ixor
    //   3841: aload #15
    //   3843: iconst_0
    //   3844: iaload
    //   3845: bipush #22
    //   3847: iushr
    //   3848: aload #15
    //   3850: iconst_0
    //   3851: iaload
    //   3852: bipush #10
    //   3854: ishl
    //   3855: ior
    //   3856: ixor
    //   3857: aload #15
    //   3859: iconst_0
    //   3860: iaload
    //   3861: aload #15
    //   3863: iconst_1
    //   3864: iaload
    //   3865: iand
    //   3866: aload #15
    //   3868: iconst_2
    //   3869: iaload
    //   3870: aload #15
    //   3872: iconst_0
    //   3873: iaload
    //   3874: aload #15
    //   3876: iconst_1
    //   3877: iaload
    //   3878: ior
    //   3879: iand
    //   3880: ior
    //   3881: iadd
    //   3882: istore #18
    //   3884: aload #15
    //   3886: iconst_3
    //   3887: dup2
    //   3888: iaload
    //   3889: iload #17
    //   3891: iadd
    //   3892: iastore
    //   3893: aload #15
    //   3895: bipush #7
    //   3897: iload #17
    //   3899: iload #18
    //   3901: iadd
    //   3902: iastore
    //   3903: aload #15
    //   3905: bipush #7
    //   3907: iaload
    //   3908: istore #17
    //   3910: aload #15
    //   3912: bipush #7
    //   3914: aload #15
    //   3916: bipush #6
    //   3918: iaload
    //   3919: iastore
    //   3920: aload #15
    //   3922: bipush #6
    //   3924: aload #15
    //   3926: iconst_5
    //   3927: iaload
    //   3928: iastore
    //   3929: aload #15
    //   3931: iconst_5
    //   3932: aload #15
    //   3934: iconst_4
    //   3935: iaload
    //   3936: iastore
    //   3937: aload #15
    //   3939: iconst_4
    //   3940: aload #15
    //   3942: iconst_3
    //   3943: iaload
    //   3944: iastore
    //   3945: aload #15
    //   3947: iconst_3
    //   3948: aload #15
    //   3950: iconst_2
    //   3951: iaload
    //   3952: iastore
    //   3953: aload #15
    //   3955: iconst_2
    //   3956: aload #15
    //   3958: iconst_1
    //   3959: iaload
    //   3960: iastore
    //   3961: aload #15
    //   3963: iconst_1
    //   3964: aload #15
    //   3966: iconst_0
    //   3967: iaload
    //   3968: iastore
    //   3969: aload #15
    //   3971: iconst_0
    //   3972: iload #17
    //   3974: iastore
    //   3975: iinc #16, 1
    //   3978: iload_2
    //   3979: ifeq -> 3487
    //   3982: iconst_0
    //   3983: istore #16
    //   3985: iload #16
    //   3987: bipush #8
    //   3989: if_icmpge -> 4012
    //   3992: aload #8
    //   3994: iload #16
    //   3996: dup2
    //   3997: iaload
    //   3998: aload #15
    //   4000: iload #16
    //   4002: iaload
    //   4003: iadd
    //   4004: iastore
    //   4005: iinc #16, 1
    //   4008: iload_2
    //   4009: ifeq -> 3985
    //   4012: iinc #13, 64
    //   4015: iinc #11, -64
    //   4018: iload_2
    //   4019: ifeq -> 3409
    //   4022: iload #11
    //   4024: ifle -> 4059
    //   4027: iconst_0
    //   4028: istore #14
    //   4030: iload #14
    //   4032: iload #11
    //   4034: if_icmpge -> 4059
    //   4037: aload #9
    //   4039: iload #12
    //   4041: iload #14
    //   4043: iadd
    //   4044: aload_3
    //   4045: iload #13
    //   4047: iload #14
    //   4049: iadd
    //   4050: baload
    //   4051: bastore
    //   4052: iinc #14, 1
    //   4055: iload_2
    //   4056: ifeq -> 4030
    //   4059: aload #7
    //   4061: iconst_0
    //   4062: iaload
    //   4063: bipush #29
    //   4065: iushr
    //   4066: aload #7
    //   4068: iconst_1
    //   4069: iaload
    //   4070: iconst_3
    //   4071: ishl
    //   4072: ior
    //   4073: istore #14
    //   4075: aload #7
    //   4077: iconst_0
    //   4078: iaload
    //   4079: iconst_3
    //   4080: ishl
    //   4081: istore #15
    //   4083: aload #7
    //   4085: iconst_0
    //   4086: iaload
    //   4087: bipush #63
    //   4089: iand
    //   4090: istore #16
    //   4092: iload #16
    //   4094: bipush #56
    //   4096: if_icmpge -> 4111
    //   4099: bipush #56
    //   4101: iload #16
    //   4103: isub
    //   4104: goto -> 4116
    //   4107: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4110: athrow
    //   4111: bipush #120
    //   4113: iload #16
    //   4115: isub
    //   4116: istore #17
    //   4118: aload #7
    //   4120: iconst_0
    //   4121: iaload
    //   4122: bipush #63
    //   4124: iand
    //   4125: istore #12
    //   4127: bipush #64
    //   4129: iload #12
    //   4131: isub
    //   4132: istore #18
    //   4134: aload #7
    //   4136: iconst_0
    //   4137: dup2
    //   4138: iaload
    //   4139: iload #17
    //   4141: iadd
    //   4142: iastore
    //   4143: aload #7
    //   4145: iconst_0
    //   4146: dup2
    //   4147: iaload
    //   4148: iconst_m1
    //   4149: iand
    //   4150: iastore
    //   4151: aload #7
    //   4153: iconst_0
    //   4154: iaload
    //   4155: iload #17
    //   4157: if_icmpge -> 4175
    //   4160: aload #7
    //   4162: iconst_1
    //   4163: dup2
    //   4164: iaload
    //   4165: iconst_1
    //   4166: iadd
    //   4167: iastore
    //   4168: goto -> 4175
    //   4171: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4174: athrow
    //   4175: iconst_0
    //   4176: istore #13
    //   4178: iload #12
    //   4180: ifle -> 4811
    //   4183: iload #17
    //   4185: iload #18
    //   4187: if_icmplt -> 4811
    //   4190: goto -> 4197
    //   4193: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4196: athrow
    //   4197: iconst_0
    //   4198: istore #19
    //   4200: iload #19
    //   4202: iload #18
    //   4204: if_icmpge -> 4227
    //   4207: aload #9
    //   4209: iload #12
    //   4211: iload #19
    //   4213: iadd
    //   4214: aload #5
    //   4216: iload #19
    //   4218: baload
    //   4219: bastore
    //   4220: iinc #19, 1
    //   4223: iload_2
    //   4224: ifeq -> 4200
    //   4227: bipush #64
    //   4229: newarray int
    //   4231: astore #19
    //   4233: bipush #8
    //   4235: newarray int
    //   4237: astore #20
    //   4239: iconst_0
    //   4240: istore #21
    //   4242: iload #21
    //   4244: bipush #8
    //   4246: if_icmpge -> 4266
    //   4249: aload #20
    //   4251: iload #21
    //   4253: aload #8
    //   4255: iload #21
    //   4257: iaload
    //   4258: iastore
    //   4259: iinc #21, 1
    //   4262: iload_2
    //   4263: ifeq -> 4242
    //   4266: iconst_0
    //   4267: istore #21
    //   4269: iload #21
    //   4271: bipush #64
    //   4273: if_icmpge -> 4764
    //   4276: iload #21
    //   4278: bipush #16
    //   4280: if_icmpge -> 4361
    //   4283: aload #19
    //   4285: iload #21
    //   4287: aload #9
    //   4289: iconst_4
    //   4290: iload #21
    //   4292: imul
    //   4293: baload
    //   4294: sipush #255
    //   4297: iand
    //   4298: bipush #24
    //   4300: ishl
    //   4301: aload #9
    //   4303: iconst_4
    //   4304: iload #21
    //   4306: imul
    //   4307: iconst_1
    //   4308: iadd
    //   4309: baload
    //   4310: sipush #255
    //   4313: iand
    //   4314: bipush #16
    //   4316: ishl
    //   4317: ior
    //   4318: aload #9
    //   4320: iconst_4
    //   4321: iload #21
    //   4323: imul
    //   4324: iconst_2
    //   4325: iadd
    //   4326: baload
    //   4327: sipush #255
    //   4330: iand
    //   4331: bipush #8
    //   4333: ishl
    //   4334: ior
    //   4335: aload #9
    //   4337: iconst_4
    //   4338: iload #21
    //   4340: imul
    //   4341: iconst_3
    //   4342: iadd
    //   4343: baload
    //   4344: sipush #255
    //   4347: iand
    //   4348: ior
    //   4349: iastore
    //   4350: iload_2
    //   4351: ifeq -> 4504
    //   4354: goto -> 4361
    //   4357: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4360: athrow
    //   4361: aload #19
    //   4363: iload #21
    //   4365: aload #19
    //   4367: iload #21
    //   4369: iconst_2
    //   4370: isub
    //   4371: iaload
    //   4372: bipush #17
    //   4374: iushr
    //   4375: aload #19
    //   4377: iload #21
    //   4379: iconst_2
    //   4380: isub
    //   4381: iaload
    //   4382: bipush #15
    //   4384: ishl
    //   4385: ior
    //   4386: aload #19
    //   4388: iload #21
    //   4390: iconst_2
    //   4391: isub
    //   4392: iaload
    //   4393: bipush #19
    //   4395: iushr
    //   4396: aload #19
    //   4398: iload #21
    //   4400: iconst_2
    //   4401: isub
    //   4402: iaload
    //   4403: bipush #13
    //   4405: ishl
    //   4406: ior
    //   4407: ixor
    //   4408: aload #19
    //   4410: iload #21
    //   4412: iconst_2
    //   4413: isub
    //   4414: iaload
    //   4415: bipush #10
    //   4417: iushr
    //   4418: ixor
    //   4419: aload #19
    //   4421: iload #21
    //   4423: bipush #7
    //   4425: isub
    //   4426: iaload
    //   4427: iadd
    //   4428: aload #19
    //   4430: iload #21
    //   4432: bipush #15
    //   4434: isub
    //   4435: iaload
    //   4436: bipush #7
    //   4438: iushr
    //   4439: aload #19
    //   4441: iload #21
    //   4443: bipush #15
    //   4445: isub
    //   4446: iaload
    //   4447: bipush #25
    //   4449: ishl
    //   4450: ior
    //   4451: aload #19
    //   4453: iload #21
    //   4455: bipush #15
    //   4457: isub
    //   4458: iaload
    //   4459: bipush #18
    //   4461: iushr
    //   4462: aload #19
    //   4464: iload #21
    //   4466: bipush #15
    //   4468: isub
    //   4469: iaload
    //   4470: bipush #14
    //   4472: ishl
    //   4473: ior
    //   4474: ixor
    //   4475: aload #19
    //   4477: iload #21
    //   4479: bipush #15
    //   4481: isub
    //   4482: iaload
    //   4483: iconst_3
    //   4484: iushr
    //   4485: ixor
    //   4486: iadd
    //   4487: aload #19
    //   4489: iload #21
    //   4491: bipush #16
    //   4493: isub
    //   4494: iaload
    //   4495: iadd
    //   4496: iastore
    //   4497: goto -> 4504
    //   4500: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4503: athrow
    //   4504: aload #20
    //   4506: bipush #7
    //   4508: iaload
    //   4509: aload #20
    //   4511: iconst_4
    //   4512: iaload
    //   4513: bipush #6
    //   4515: iushr
    //   4516: aload #20
    //   4518: iconst_4
    //   4519: iaload
    //   4520: bipush #26
    //   4522: ishl
    //   4523: ior
    //   4524: aload #20
    //   4526: iconst_4
    //   4527: iaload
    //   4528: bipush #11
    //   4530: iushr
    //   4531: aload #20
    //   4533: iconst_4
    //   4534: iaload
    //   4535: bipush #21
    //   4537: ishl
    //   4538: ior
    //   4539: ixor
    //   4540: aload #20
    //   4542: iconst_4
    //   4543: iaload
    //   4544: bipush #25
    //   4546: iushr
    //   4547: aload #20
    //   4549: iconst_4
    //   4550: iaload
    //   4551: bipush #7
    //   4553: ishl
    //   4554: ior
    //   4555: ixor
    //   4556: iadd
    //   4557: aload #20
    //   4559: bipush #6
    //   4561: iaload
    //   4562: aload #20
    //   4564: iconst_4
    //   4565: iaload
    //   4566: aload #20
    //   4568: iconst_5
    //   4569: iaload
    //   4570: aload #20
    //   4572: bipush #6
    //   4574: iaload
    //   4575: ixor
    //   4576: iand
    //   4577: ixor
    //   4578: iadd
    //   4579: aload #6
    //   4581: iload #21
    //   4583: iaload
    //   4584: iadd
    //   4585: aload #19
    //   4587: iload #21
    //   4589: iaload
    //   4590: iadd
    //   4591: istore #22
    //   4593: aload #20
    //   4595: iconst_0
    //   4596: iaload
    //   4597: iconst_2
    //   4598: iushr
    //   4599: aload #20
    //   4601: iconst_0
    //   4602: iaload
    //   4603: bipush #30
    //   4605: ishl
    //   4606: ior
    //   4607: aload #20
    //   4609: iconst_0
    //   4610: iaload
    //   4611: bipush #13
    //   4613: iushr
    //   4614: aload #20
    //   4616: iconst_0
    //   4617: iaload
    //   4618: bipush #19
    //   4620: ishl
    //   4621: ior
    //   4622: ixor
    //   4623: aload #20
    //   4625: iconst_0
    //   4626: iaload
    //   4627: bipush #22
    //   4629: iushr
    //   4630: aload #20
    //   4632: iconst_0
    //   4633: iaload
    //   4634: bipush #10
    //   4636: ishl
    //   4637: ior
    //   4638: ixor
    //   4639: aload #20
    //   4641: iconst_0
    //   4642: iaload
    //   4643: aload #20
    //   4645: iconst_1
    //   4646: iaload
    //   4647: iand
    //   4648: aload #20
    //   4650: iconst_2
    //   4651: iaload
    //   4652: aload #20
    //   4654: iconst_0
    //   4655: iaload
    //   4656: aload #20
    //   4658: iconst_1
    //   4659: iaload
    //   4660: ior
    //   4661: iand
    //   4662: ior
    //   4663: iadd
    //   4664: istore #23
    //   4666: aload #20
    //   4668: iconst_3
    //   4669: dup2
    //   4670: iaload
    //   4671: iload #22
    //   4673: iadd
    //   4674: iastore
    //   4675: aload #20
    //   4677: bipush #7
    //   4679: iload #22
    //   4681: iload #23
    //   4683: iadd
    //   4684: iastore
    //   4685: aload #20
    //   4687: bipush #7
    //   4689: iaload
    //   4690: istore #22
    //   4692: aload #20
    //   4694: bipush #7
    //   4696: aload #20
    //   4698: bipush #6
    //   4700: iaload
    //   4701: iastore
    //   4702: aload #20
    //   4704: bipush #6
    //   4706: aload #20
    //   4708: iconst_5
    //   4709: iaload
    //   4710: iastore
    //   4711: aload #20
    //   4713: iconst_5
    //   4714: aload #20
    //   4716: iconst_4
    //   4717: iaload
    //   4718: iastore
    //   4719: aload #20
    //   4721: iconst_4
    //   4722: aload #20
    //   4724: iconst_3
    //   4725: iaload
    //   4726: iastore
    //   4727: aload #20
    //   4729: iconst_3
    //   4730: aload #20
    //   4732: iconst_2
    //   4733: iaload
    //   4734: iastore
    //   4735: aload #20
    //   4737: iconst_2
    //   4738: aload #20
    //   4740: iconst_1
    //   4741: iaload
    //   4742: iastore
    //   4743: aload #20
    //   4745: iconst_1
    //   4746: aload #20
    //   4748: iconst_0
    //   4749: iaload
    //   4750: iastore
    //   4751: aload #20
    //   4753: iconst_0
    //   4754: iload #22
    //   4756: iastore
    //   4757: iinc #21, 1
    //   4760: iload_2
    //   4761: ifeq -> 4269
    //   4764: iconst_0
    //   4765: istore #21
    //   4767: iload #21
    //   4769: bipush #8
    //   4771: if_icmpge -> 4794
    //   4774: aload #8
    //   4776: iload #21
    //   4778: dup2
    //   4779: iaload
    //   4780: aload #20
    //   4782: iload #21
    //   4784: iaload
    //   4785: iadd
    //   4786: iastore
    //   4787: iinc #21, 1
    //   4790: iload_2
    //   4791: ifeq -> 4767
    //   4794: iload #13
    //   4796: iload #18
    //   4798: iadd
    //   4799: istore #13
    //   4801: iload #17
    //   4803: iload #18
    //   4805: isub
    //   4806: istore #17
    //   4808: iconst_0
    //   4809: istore #12
    //   4811: iload #17
    //   4813: bipush #64
    //   4815: if_icmplt -> 5425
    //   4818: iconst_0
    //   4819: istore #19
    //   4821: iload #19
    //   4823: bipush #64
    //   4825: if_icmpge -> 4848
    //   4828: aload #10
    //   4830: iload #19
    //   4832: aload #5
    //   4834: iload #13
    //   4836: iload #19
    //   4838: iadd
    //   4839: baload
    //   4840: bastore
    //   4841: iinc #19, 1
    //   4844: iload_2
    //   4845: ifeq -> 4821
    //   4848: bipush #64
    //   4850: newarray int
    //   4852: astore #19
    //   4854: bipush #8
    //   4856: newarray int
    //   4858: astore #20
    //   4860: iconst_0
    //   4861: istore #21
    //   4863: iload #21
    //   4865: bipush #8
    //   4867: if_icmpge -> 4887
    //   4870: aload #20
    //   4872: iload #21
    //   4874: aload #8
    //   4876: iload #21
    //   4878: iaload
    //   4879: iastore
    //   4880: iinc #21, 1
    //   4883: iload_2
    //   4884: ifeq -> 4863
    //   4887: iconst_0
    //   4888: istore #21
    //   4890: iload #21
    //   4892: bipush #64
    //   4894: if_icmpge -> 5385
    //   4897: iload #21
    //   4899: bipush #16
    //   4901: if_icmpge -> 4982
    //   4904: aload #19
    //   4906: iload #21
    //   4908: aload #10
    //   4910: iconst_4
    //   4911: iload #21
    //   4913: imul
    //   4914: baload
    //   4915: sipush #255
    //   4918: iand
    //   4919: bipush #24
    //   4921: ishl
    //   4922: aload #10
    //   4924: iconst_4
    //   4925: iload #21
    //   4927: imul
    //   4928: iconst_1
    //   4929: iadd
    //   4930: baload
    //   4931: sipush #255
    //   4934: iand
    //   4935: bipush #16
    //   4937: ishl
    //   4938: ior
    //   4939: aload #10
    //   4941: iconst_4
    //   4942: iload #21
    //   4944: imul
    //   4945: iconst_2
    //   4946: iadd
    //   4947: baload
    //   4948: sipush #255
    //   4951: iand
    //   4952: bipush #8
    //   4954: ishl
    //   4955: ior
    //   4956: aload #10
    //   4958: iconst_4
    //   4959: iload #21
    //   4961: imul
    //   4962: iconst_3
    //   4963: iadd
    //   4964: baload
    //   4965: sipush #255
    //   4968: iand
    //   4969: ior
    //   4970: iastore
    //   4971: iload_2
    //   4972: ifeq -> 5125
    //   4975: goto -> 4982
    //   4978: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4981: athrow
    //   4982: aload #19
    //   4984: iload #21
    //   4986: aload #19
    //   4988: iload #21
    //   4990: iconst_2
    //   4991: isub
    //   4992: iaload
    //   4993: bipush #17
    //   4995: iushr
    //   4996: aload #19
    //   4998: iload #21
    //   5000: iconst_2
    //   5001: isub
    //   5002: iaload
    //   5003: bipush #15
    //   5005: ishl
    //   5006: ior
    //   5007: aload #19
    //   5009: iload #21
    //   5011: iconst_2
    //   5012: isub
    //   5013: iaload
    //   5014: bipush #19
    //   5016: iushr
    //   5017: aload #19
    //   5019: iload #21
    //   5021: iconst_2
    //   5022: isub
    //   5023: iaload
    //   5024: bipush #13
    //   5026: ishl
    //   5027: ior
    //   5028: ixor
    //   5029: aload #19
    //   5031: iload #21
    //   5033: iconst_2
    //   5034: isub
    //   5035: iaload
    //   5036: bipush #10
    //   5038: iushr
    //   5039: ixor
    //   5040: aload #19
    //   5042: iload #21
    //   5044: bipush #7
    //   5046: isub
    //   5047: iaload
    //   5048: iadd
    //   5049: aload #19
    //   5051: iload #21
    //   5053: bipush #15
    //   5055: isub
    //   5056: iaload
    //   5057: bipush #7
    //   5059: iushr
    //   5060: aload #19
    //   5062: iload #21
    //   5064: bipush #15
    //   5066: isub
    //   5067: iaload
    //   5068: bipush #25
    //   5070: ishl
    //   5071: ior
    //   5072: aload #19
    //   5074: iload #21
    //   5076: bipush #15
    //   5078: isub
    //   5079: iaload
    //   5080: bipush #18
    //   5082: iushr
    //   5083: aload #19
    //   5085: iload #21
    //   5087: bipush #15
    //   5089: isub
    //   5090: iaload
    //   5091: bipush #14
    //   5093: ishl
    //   5094: ior
    //   5095: ixor
    //   5096: aload #19
    //   5098: iload #21
    //   5100: bipush #15
    //   5102: isub
    //   5103: iaload
    //   5104: iconst_3
    //   5105: iushr
    //   5106: ixor
    //   5107: iadd
    //   5108: aload #19
    //   5110: iload #21
    //   5112: bipush #16
    //   5114: isub
    //   5115: iaload
    //   5116: iadd
    //   5117: iastore
    //   5118: goto -> 5125
    //   5121: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5124: athrow
    //   5125: aload #20
    //   5127: bipush #7
    //   5129: iaload
    //   5130: aload #20
    //   5132: iconst_4
    //   5133: iaload
    //   5134: bipush #6
    //   5136: iushr
    //   5137: aload #20
    //   5139: iconst_4
    //   5140: iaload
    //   5141: bipush #26
    //   5143: ishl
    //   5144: ior
    //   5145: aload #20
    //   5147: iconst_4
    //   5148: iaload
    //   5149: bipush #11
    //   5151: iushr
    //   5152: aload #20
    //   5154: iconst_4
    //   5155: iaload
    //   5156: bipush #21
    //   5158: ishl
    //   5159: ior
    //   5160: ixor
    //   5161: aload #20
    //   5163: iconst_4
    //   5164: iaload
    //   5165: bipush #25
    //   5167: iushr
    //   5168: aload #20
    //   5170: iconst_4
    //   5171: iaload
    //   5172: bipush #7
    //   5174: ishl
    //   5175: ior
    //   5176: ixor
    //   5177: iadd
    //   5178: aload #20
    //   5180: bipush #6
    //   5182: iaload
    //   5183: aload #20
    //   5185: iconst_4
    //   5186: iaload
    //   5187: aload #20
    //   5189: iconst_5
    //   5190: iaload
    //   5191: aload #20
    //   5193: bipush #6
    //   5195: iaload
    //   5196: ixor
    //   5197: iand
    //   5198: ixor
    //   5199: iadd
    //   5200: aload #6
    //   5202: iload #21
    //   5204: iaload
    //   5205: iadd
    //   5206: aload #19
    //   5208: iload #21
    //   5210: iaload
    //   5211: iadd
    //   5212: istore #22
    //   5214: aload #20
    //   5216: iconst_0
    //   5217: iaload
    //   5218: iconst_2
    //   5219: iushr
    //   5220: aload #20
    //   5222: iconst_0
    //   5223: iaload
    //   5224: bipush #30
    //   5226: ishl
    //   5227: ior
    //   5228: aload #20
    //   5230: iconst_0
    //   5231: iaload
    //   5232: bipush #13
    //   5234: iushr
    //   5235: aload #20
    //   5237: iconst_0
    //   5238: iaload
    //   5239: bipush #19
    //   5241: ishl
    //   5242: ior
    //   5243: ixor
    //   5244: aload #20
    //   5246: iconst_0
    //   5247: iaload
    //   5248: bipush #22
    //   5250: iushr
    //   5251: aload #20
    //   5253: iconst_0
    //   5254: iaload
    //   5255: bipush #10
    //   5257: ishl
    //   5258: ior
    //   5259: ixor
    //   5260: aload #20
    //   5262: iconst_0
    //   5263: iaload
    //   5264: aload #20
    //   5266: iconst_1
    //   5267: iaload
    //   5268: iand
    //   5269: aload #20
    //   5271: iconst_2
    //   5272: iaload
    //   5273: aload #20
    //   5275: iconst_0
    //   5276: iaload
    //   5277: aload #20
    //   5279: iconst_1
    //   5280: iaload
    //   5281: ior
    //   5282: iand
    //   5283: ior
    //   5284: iadd
    //   5285: istore #23
    //   5287: aload #20
    //   5289: iconst_3
    //   5290: dup2
    //   5291: iaload
    //   5292: iload #22
    //   5294: iadd
    //   5295: iastore
    //   5296: aload #20
    //   5298: bipush #7
    //   5300: iload #22
    //   5302: iload #23
    //   5304: iadd
    //   5305: iastore
    //   5306: aload #20
    //   5308: bipush #7
    //   5310: iaload
    //   5311: istore #22
    //   5313: aload #20
    //   5315: bipush #7
    //   5317: aload #20
    //   5319: bipush #6
    //   5321: iaload
    //   5322: iastore
    //   5323: aload #20
    //   5325: bipush #6
    //   5327: aload #20
    //   5329: iconst_5
    //   5330: iaload
    //   5331: iastore
    //   5332: aload #20
    //   5334: iconst_5
    //   5335: aload #20
    //   5337: iconst_4
    //   5338: iaload
    //   5339: iastore
    //   5340: aload #20
    //   5342: iconst_4
    //   5343: aload #20
    //   5345: iconst_3
    //   5346: iaload
    //   5347: iastore
    //   5348: aload #20
    //   5350: iconst_3
    //   5351: aload #20
    //   5353: iconst_2
    //   5354: iaload
    //   5355: iastore
    //   5356: aload #20
    //   5358: iconst_2
    //   5359: aload #20
    //   5361: iconst_1
    //   5362: iaload
    //   5363: iastore
    //   5364: aload #20
    //   5366: iconst_1
    //   5367: aload #20
    //   5369: iconst_0
    //   5370: iaload
    //   5371: iastore
    //   5372: aload #20
    //   5374: iconst_0
    //   5375: iload #22
    //   5377: iastore
    //   5378: iinc #21, 1
    //   5381: iload_2
    //   5382: ifeq -> 4890
    //   5385: iconst_0
    //   5386: istore #21
    //   5388: iload #21
    //   5390: bipush #8
    //   5392: if_icmpge -> 5415
    //   5395: aload #8
    //   5397: iload #21
    //   5399: dup2
    //   5400: iaload
    //   5401: aload #20
    //   5403: iload #21
    //   5405: iaload
    //   5406: iadd
    //   5407: iastore
    //   5408: iinc #21, 1
    //   5411: iload_2
    //   5412: ifeq -> 5388
    //   5415: iinc #13, 64
    //   5418: iinc #17, -64
    //   5421: iload_2
    //   5422: ifeq -> 4811
    //   5425: iload #17
    //   5427: ifle -> 5463
    //   5430: iconst_0
    //   5431: istore #19
    //   5433: iload #19
    //   5435: iload #17
    //   5437: if_icmpge -> 5463
    //   5440: aload #9
    //   5442: iload #12
    //   5444: iload #19
    //   5446: iadd
    //   5447: aload #5
    //   5449: iload #13
    //   5451: iload #19
    //   5453: iadd
    //   5454: baload
    //   5455: bastore
    //   5456: iinc #19, 1
    //   5459: iload_2
    //   5460: ifeq -> 5433
    //   5463: bipush #8
    //   5465: newarray byte
    //   5467: astore #19
    //   5469: aload #19
    //   5471: iconst_0
    //   5472: iload #14
    //   5474: bipush #24
    //   5476: iushr
    //   5477: i2b
    //   5478: bastore
    //   5479: aload #19
    //   5481: iconst_1
    //   5482: iload #14
    //   5484: bipush #16
    //   5486: iushr
    //   5487: i2b
    //   5488: bastore
    //   5489: aload #19
    //   5491: iconst_2
    //   5492: iload #14
    //   5494: bipush #8
    //   5496: iushr
    //   5497: i2b
    //   5498: bastore
    //   5499: aload #19
    //   5501: iconst_3
    //   5502: iload #14
    //   5504: i2b
    //   5505: bastore
    //   5506: aload #19
    //   5508: iconst_4
    //   5509: iload #15
    //   5511: bipush #24
    //   5513: iushr
    //   5514: i2b
    //   5515: bastore
    //   5516: aload #19
    //   5518: iconst_5
    //   5519: iload #15
    //   5521: bipush #16
    //   5523: iushr
    //   5524: i2b
    //   5525: bastore
    //   5526: aload #19
    //   5528: bipush #6
    //   5530: iload #15
    //   5532: bipush #8
    //   5534: iushr
    //   5535: i2b
    //   5536: bastore
    //   5537: aload #19
    //   5539: bipush #7
    //   5541: iload #15
    //   5543: i2b
    //   5544: bastore
    //   5545: bipush #8
    //   5547: istore #11
    //   5549: aload #7
    //   5551: iconst_0
    //   5552: iaload
    //   5553: bipush #63
    //   5555: iand
    //   5556: istore #12
    //   5558: bipush #64
    //   5560: iload #12
    //   5562: isub
    //   5563: istore #18
    //   5565: aload #7
    //   5567: iconst_0
    //   5568: dup2
    //   5569: iaload
    //   5570: iload #11
    //   5572: iadd
    //   5573: iastore
    //   5574: aload #7
    //   5576: iconst_0
    //   5577: dup2
    //   5578: iaload
    //   5579: iconst_m1
    //   5580: iand
    //   5581: iastore
    //   5582: aload #7
    //   5584: iconst_0
    //   5585: iaload
    //   5586: iload #11
    //   5588: if_icmpge -> 5606
    //   5591: aload #7
    //   5593: iconst_1
    //   5594: dup2
    //   5595: iaload
    //   5596: iconst_1
    //   5597: iadd
    //   5598: iastore
    //   5599: goto -> 5606
    //   5602: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5605: athrow
    //   5606: iload #12
    //   5608: ifle -> 6222
    //   5611: iload #11
    //   5613: iload #18
    //   5615: if_icmplt -> 6222
    //   5618: goto -> 5625
    //   5621: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5624: athrow
    //   5625: iconst_0
    //   5626: istore #20
    //   5628: iload #20
    //   5630: iload #18
    //   5632: if_icmpge -> 5655
    //   5635: aload #9
    //   5637: iload #12
    //   5639: iload #20
    //   5641: iadd
    //   5642: aload #19
    //   5644: iload #20
    //   5646: baload
    //   5647: bastore
    //   5648: iinc #20, 1
    //   5651: iload_2
    //   5652: ifeq -> 5628
    //   5655: bipush #64
    //   5657: newarray int
    //   5659: astore #20
    //   5661: bipush #8
    //   5663: newarray int
    //   5665: astore #21
    //   5667: iconst_0
    //   5668: istore #22
    //   5670: iload #22
    //   5672: bipush #8
    //   5674: if_icmpge -> 5694
    //   5677: aload #21
    //   5679: iload #22
    //   5681: aload #8
    //   5683: iload #22
    //   5685: iaload
    //   5686: iastore
    //   5687: iinc #22, 1
    //   5690: iload_2
    //   5691: ifeq -> 5670
    //   5694: iconst_0
    //   5695: istore #22
    //   5697: iload #22
    //   5699: bipush #64
    //   5701: if_icmpge -> 6192
    //   5704: iload #22
    //   5706: bipush #16
    //   5708: if_icmpge -> 5789
    //   5711: aload #20
    //   5713: iload #22
    //   5715: aload #9
    //   5717: iconst_4
    //   5718: iload #22
    //   5720: imul
    //   5721: baload
    //   5722: sipush #255
    //   5725: iand
    //   5726: bipush #24
    //   5728: ishl
    //   5729: aload #9
    //   5731: iconst_4
    //   5732: iload #22
    //   5734: imul
    //   5735: iconst_1
    //   5736: iadd
    //   5737: baload
    //   5738: sipush #255
    //   5741: iand
    //   5742: bipush #16
    //   5744: ishl
    //   5745: ior
    //   5746: aload #9
    //   5748: iconst_4
    //   5749: iload #22
    //   5751: imul
    //   5752: iconst_2
    //   5753: iadd
    //   5754: baload
    //   5755: sipush #255
    //   5758: iand
    //   5759: bipush #8
    //   5761: ishl
    //   5762: ior
    //   5763: aload #9
    //   5765: iconst_4
    //   5766: iload #22
    //   5768: imul
    //   5769: iconst_3
    //   5770: iadd
    //   5771: baload
    //   5772: sipush #255
    //   5775: iand
    //   5776: ior
    //   5777: iastore
    //   5778: iload_2
    //   5779: ifeq -> 5932
    //   5782: goto -> 5789
    //   5785: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5788: athrow
    //   5789: aload #20
    //   5791: iload #22
    //   5793: aload #20
    //   5795: iload #22
    //   5797: iconst_2
    //   5798: isub
    //   5799: iaload
    //   5800: bipush #17
    //   5802: iushr
    //   5803: aload #20
    //   5805: iload #22
    //   5807: iconst_2
    //   5808: isub
    //   5809: iaload
    //   5810: bipush #15
    //   5812: ishl
    //   5813: ior
    //   5814: aload #20
    //   5816: iload #22
    //   5818: iconst_2
    //   5819: isub
    //   5820: iaload
    //   5821: bipush #19
    //   5823: iushr
    //   5824: aload #20
    //   5826: iload #22
    //   5828: iconst_2
    //   5829: isub
    //   5830: iaload
    //   5831: bipush #13
    //   5833: ishl
    //   5834: ior
    //   5835: ixor
    //   5836: aload #20
    //   5838: iload #22
    //   5840: iconst_2
    //   5841: isub
    //   5842: iaload
    //   5843: bipush #10
    //   5845: iushr
    //   5846: ixor
    //   5847: aload #20
    //   5849: iload #22
    //   5851: bipush #7
    //   5853: isub
    //   5854: iaload
    //   5855: iadd
    //   5856: aload #20
    //   5858: iload #22
    //   5860: bipush #15
    //   5862: isub
    //   5863: iaload
    //   5864: bipush #7
    //   5866: iushr
    //   5867: aload #20
    //   5869: iload #22
    //   5871: bipush #15
    //   5873: isub
    //   5874: iaload
    //   5875: bipush #25
    //   5877: ishl
    //   5878: ior
    //   5879: aload #20
    //   5881: iload #22
    //   5883: bipush #15
    //   5885: isub
    //   5886: iaload
    //   5887: bipush #18
    //   5889: iushr
    //   5890: aload #20
    //   5892: iload #22
    //   5894: bipush #15
    //   5896: isub
    //   5897: iaload
    //   5898: bipush #14
    //   5900: ishl
    //   5901: ior
    //   5902: ixor
    //   5903: aload #20
    //   5905: iload #22
    //   5907: bipush #15
    //   5909: isub
    //   5910: iaload
    //   5911: iconst_3
    //   5912: iushr
    //   5913: ixor
    //   5914: iadd
    //   5915: aload #20
    //   5917: iload #22
    //   5919: bipush #16
    //   5921: isub
    //   5922: iaload
    //   5923: iadd
    //   5924: iastore
    //   5925: goto -> 5932
    //   5928: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5931: athrow
    //   5932: aload #21
    //   5934: bipush #7
    //   5936: iaload
    //   5937: aload #21
    //   5939: iconst_4
    //   5940: iaload
    //   5941: bipush #6
    //   5943: iushr
    //   5944: aload #21
    //   5946: iconst_4
    //   5947: iaload
    //   5948: bipush #26
    //   5950: ishl
    //   5951: ior
    //   5952: aload #21
    //   5954: iconst_4
    //   5955: iaload
    //   5956: bipush #11
    //   5958: iushr
    //   5959: aload #21
    //   5961: iconst_4
    //   5962: iaload
    //   5963: bipush #21
    //   5965: ishl
    //   5966: ior
    //   5967: ixor
    //   5968: aload #21
    //   5970: iconst_4
    //   5971: iaload
    //   5972: bipush #25
    //   5974: iushr
    //   5975: aload #21
    //   5977: iconst_4
    //   5978: iaload
    //   5979: bipush #7
    //   5981: ishl
    //   5982: ior
    //   5983: ixor
    //   5984: iadd
    //   5985: aload #21
    //   5987: bipush #6
    //   5989: iaload
    //   5990: aload #21
    //   5992: iconst_4
    //   5993: iaload
    //   5994: aload #21
    //   5996: iconst_5
    //   5997: iaload
    //   5998: aload #21
    //   6000: bipush #6
    //   6002: iaload
    //   6003: ixor
    //   6004: iand
    //   6005: ixor
    //   6006: iadd
    //   6007: aload #6
    //   6009: iload #22
    //   6011: iaload
    //   6012: iadd
    //   6013: aload #20
    //   6015: iload #22
    //   6017: iaload
    //   6018: iadd
    //   6019: istore #23
    //   6021: aload #21
    //   6023: iconst_0
    //   6024: iaload
    //   6025: iconst_2
    //   6026: iushr
    //   6027: aload #21
    //   6029: iconst_0
    //   6030: iaload
    //   6031: bipush #30
    //   6033: ishl
    //   6034: ior
    //   6035: aload #21
    //   6037: iconst_0
    //   6038: iaload
    //   6039: bipush #13
    //   6041: iushr
    //   6042: aload #21
    //   6044: iconst_0
    //   6045: iaload
    //   6046: bipush #19
    //   6048: ishl
    //   6049: ior
    //   6050: ixor
    //   6051: aload #21
    //   6053: iconst_0
    //   6054: iaload
    //   6055: bipush #22
    //   6057: iushr
    //   6058: aload #21
    //   6060: iconst_0
    //   6061: iaload
    //   6062: bipush #10
    //   6064: ishl
    //   6065: ior
    //   6066: ixor
    //   6067: aload #21
    //   6069: iconst_0
    //   6070: iaload
    //   6071: aload #21
    //   6073: iconst_1
    //   6074: iaload
    //   6075: iand
    //   6076: aload #21
    //   6078: iconst_2
    //   6079: iaload
    //   6080: aload #21
    //   6082: iconst_0
    //   6083: iaload
    //   6084: aload #21
    //   6086: iconst_1
    //   6087: iaload
    //   6088: ior
    //   6089: iand
    //   6090: ior
    //   6091: iadd
    //   6092: istore #24
    //   6094: aload #21
    //   6096: iconst_3
    //   6097: dup2
    //   6098: iaload
    //   6099: iload #23
    //   6101: iadd
    //   6102: iastore
    //   6103: aload #21
    //   6105: bipush #7
    //   6107: iload #23
    //   6109: iload #24
    //   6111: iadd
    //   6112: iastore
    //   6113: aload #21
    //   6115: bipush #7
    //   6117: iaload
    //   6118: istore #23
    //   6120: aload #21
    //   6122: bipush #7
    //   6124: aload #21
    //   6126: bipush #6
    //   6128: iaload
    //   6129: iastore
    //   6130: aload #21
    //   6132: bipush #6
    //   6134: aload #21
    //   6136: iconst_5
    //   6137: iaload
    //   6138: iastore
    //   6139: aload #21
    //   6141: iconst_5
    //   6142: aload #21
    //   6144: iconst_4
    //   6145: iaload
    //   6146: iastore
    //   6147: aload #21
    //   6149: iconst_4
    //   6150: aload #21
    //   6152: iconst_3
    //   6153: iaload
    //   6154: iastore
    //   6155: aload #21
    //   6157: iconst_3
    //   6158: aload #21
    //   6160: iconst_2
    //   6161: iaload
    //   6162: iastore
    //   6163: aload #21
    //   6165: iconst_2
    //   6166: aload #21
    //   6168: iconst_1
    //   6169: iaload
    //   6170: iastore
    //   6171: aload #21
    //   6173: iconst_1
    //   6174: aload #21
    //   6176: iconst_0
    //   6177: iaload
    //   6178: iastore
    //   6179: aload #21
    //   6181: iconst_0
    //   6182: iload #23
    //   6184: iastore
    //   6185: iinc #22, 1
    //   6188: iload_2
    //   6189: ifeq -> 5697
    //   6192: iconst_0
    //   6193: istore #22
    //   6195: iload #22
    //   6197: bipush #8
    //   6199: if_icmpge -> 6222
    //   6202: aload #8
    //   6204: iload #22
    //   6206: dup2
    //   6207: iaload
    //   6208: aload #21
    //   6210: iload #22
    //   6212: iaload
    //   6213: iadd
    //   6214: iastore
    //   6215: iinc #22, 1
    //   6218: iload_2
    //   6219: ifeq -> 6195
    //   6222: bipush #32
    //   6224: newarray byte
    //   6226: astore #4
    //   6228: aload #4
    //   6230: iconst_0
    //   6231: aload #8
    //   6233: iconst_0
    //   6234: iaload
    //   6235: bipush #24
    //   6237: iushr
    //   6238: i2b
    //   6239: bastore
    //   6240: aload #4
    //   6242: iconst_1
    //   6243: aload #8
    //   6245: iconst_0
    //   6246: iaload
    //   6247: bipush #16
    //   6249: iushr
    //   6250: i2b
    //   6251: bastore
    //   6252: aload #4
    //   6254: iconst_2
    //   6255: aload #8
    //   6257: iconst_0
    //   6258: iaload
    //   6259: bipush #8
    //   6261: iushr
    //   6262: i2b
    //   6263: bastore
    //   6264: aload #4
    //   6266: iconst_3
    //   6267: aload #8
    //   6269: iconst_0
    //   6270: iaload
    //   6271: i2b
    //   6272: bastore
    //   6273: aload #4
    //   6275: iconst_4
    //   6276: aload #8
    //   6278: iconst_1
    //   6279: iaload
    //   6280: bipush #24
    //   6282: iushr
    //   6283: i2b
    //   6284: bastore
    //   6285: aload #4
    //   6287: iconst_5
    //   6288: aload #8
    //   6290: iconst_1
    //   6291: iaload
    //   6292: bipush #16
    //   6294: iushr
    //   6295: i2b
    //   6296: bastore
    //   6297: aload #4
    //   6299: bipush #6
    //   6301: aload #8
    //   6303: iconst_1
    //   6304: iaload
    //   6305: bipush #8
    //   6307: iushr
    //   6308: i2b
    //   6309: bastore
    //   6310: aload #4
    //   6312: bipush #7
    //   6314: aload #8
    //   6316: iconst_1
    //   6317: iaload
    //   6318: i2b
    //   6319: bastore
    //   6320: aload #4
    //   6322: bipush #8
    //   6324: aload #8
    //   6326: iconst_2
    //   6327: iaload
    //   6328: bipush #24
    //   6330: iushr
    //   6331: i2b
    //   6332: bastore
    //   6333: aload #4
    //   6335: bipush #9
    //   6337: aload #8
    //   6339: iconst_2
    //   6340: iaload
    //   6341: bipush #16
    //   6343: iushr
    //   6344: i2b
    //   6345: bastore
    //   6346: aload #4
    //   6348: bipush #10
    //   6350: aload #8
    //   6352: iconst_2
    //   6353: iaload
    //   6354: bipush #8
    //   6356: iushr
    //   6357: i2b
    //   6358: bastore
    //   6359: aload #4
    //   6361: bipush #11
    //   6363: aload #8
    //   6365: iconst_2
    //   6366: iaload
    //   6367: i2b
    //   6368: bastore
    //   6369: aload #4
    //   6371: bipush #12
    //   6373: aload #8
    //   6375: iconst_3
    //   6376: iaload
    //   6377: bipush #24
    //   6379: iushr
    //   6380: i2b
    //   6381: bastore
    //   6382: aload #4
    //   6384: bipush #13
    //   6386: aload #8
    //   6388: iconst_3
    //   6389: iaload
    //   6390: bipush #16
    //   6392: iushr
    //   6393: i2b
    //   6394: bastore
    //   6395: aload #4
    //   6397: bipush #14
    //   6399: aload #8
    //   6401: iconst_3
    //   6402: iaload
    //   6403: bipush #8
    //   6405: iushr
    //   6406: i2b
    //   6407: bastore
    //   6408: aload #4
    //   6410: bipush #15
    //   6412: aload #8
    //   6414: iconst_3
    //   6415: iaload
    //   6416: i2b
    //   6417: bastore
    //   6418: aload #4
    //   6420: bipush #16
    //   6422: aload #8
    //   6424: iconst_4
    //   6425: iaload
    //   6426: bipush #24
    //   6428: iushr
    //   6429: i2b
    //   6430: bastore
    //   6431: aload #4
    //   6433: bipush #17
    //   6435: aload #8
    //   6437: iconst_4
    //   6438: iaload
    //   6439: bipush #16
    //   6441: iushr
    //   6442: i2b
    //   6443: bastore
    //   6444: aload #4
    //   6446: bipush #18
    //   6448: aload #8
    //   6450: iconst_4
    //   6451: iaload
    //   6452: bipush #8
    //   6454: iushr
    //   6455: i2b
    //   6456: bastore
    //   6457: aload #4
    //   6459: bipush #19
    //   6461: aload #8
    //   6463: iconst_4
    //   6464: iaload
    //   6465: i2b
    //   6466: bastore
    //   6467: aload #4
    //   6469: bipush #20
    //   6471: aload #8
    //   6473: iconst_5
    //   6474: iaload
    //   6475: bipush #24
    //   6477: iushr
    //   6478: i2b
    //   6479: bastore
    //   6480: aload #4
    //   6482: bipush #21
    //   6484: aload #8
    //   6486: iconst_5
    //   6487: iaload
    //   6488: bipush #16
    //   6490: iushr
    //   6491: i2b
    //   6492: bastore
    //   6493: aload #4
    //   6495: bipush #22
    //   6497: aload #8
    //   6499: iconst_5
    //   6500: iaload
    //   6501: bipush #8
    //   6503: iushr
    //   6504: i2b
    //   6505: bastore
    //   6506: aload #4
    //   6508: bipush #23
    //   6510: aload #8
    //   6512: iconst_5
    //   6513: iaload
    //   6514: i2b
    //   6515: bastore
    //   6516: aload #4
    //   6518: bipush #24
    //   6520: aload #8
    //   6522: bipush #6
    //   6524: iaload
    //   6525: bipush #24
    //   6527: iushr
    //   6528: i2b
    //   6529: bastore
    //   6530: aload #4
    //   6532: bipush #25
    //   6534: aload #8
    //   6536: bipush #6
    //   6538: iaload
    //   6539: bipush #16
    //   6541: iushr
    //   6542: i2b
    //   6543: bastore
    //   6544: aload #4
    //   6546: bipush #26
    //   6548: aload #8
    //   6550: bipush #6
    //   6552: iaload
    //   6553: bipush #8
    //   6555: iushr
    //   6556: i2b
    //   6557: bastore
    //   6558: aload #4
    //   6560: bipush #27
    //   6562: aload #8
    //   6564: bipush #6
    //   6566: iaload
    //   6567: i2b
    //   6568: bastore
    //   6569: aload #4
    //   6571: bipush #28
    //   6573: aload #8
    //   6575: bipush #7
    //   6577: iaload
    //   6578: bipush #24
    //   6580: iushr
    //   6581: i2b
    //   6582: bastore
    //   6583: aload #4
    //   6585: bipush #29
    //   6587: aload #8
    //   6589: bipush #7
    //   6591: iaload
    //   6592: bipush #16
    //   6594: iushr
    //   6595: i2b
    //   6596: bastore
    //   6597: aload #4
    //   6599: bipush #30
    //   6601: aload #8
    //   6603: bipush #7
    //   6605: iaload
    //   6606: bipush #8
    //   6608: iushr
    //   6609: i2b
    //   6610: bastore
    //   6611: aload #4
    //   6613: bipush #31
    //   6615: aload #8
    //   6617: bipush #7
    //   6619: iaload
    //   6620: i2b
    //   6621: bastore
    //   6622: new java/io/ByteArrayOutputStream
    //   6625: dup
    //   6626: invokespecial <init> : ()V
    //   6629: astore_3
    //   6630: sipush #-3736
    //   6633: aload_3
    //   6634: sipush #202
    //   6637: invokevirtual write : (I)V
    //   6640: sipush #9292
    //   6643: aload_3
    //   6644: sipush #254
    //   6647: invokevirtual write : (I)V
    //   6650: aload_3
    //   6651: sipush #186
    //   6654: invokevirtual write : (I)V
    //   6657: aload_3
    //   6658: sipush #190
    //   6661: invokevirtual write : (I)V
    //   6664: aload_3
    //   6665: iconst_0
    //   6666: invokevirtual write : (I)V
    //   6669: aload_3
    //   6670: iconst_1
    //   6671: invokevirtual write : (I)V
    //   6674: aload_3
    //   6675: iconst_0
    //   6676: invokevirtual write : (I)V
    //   6679: aload_3
    //   6680: bipush #50
    //   6682: invokevirtual write : (I)V
    //   6685: aload_3
    //   6686: getstatic burp/Zkk6.Zb : Ljava/lang/Object;
    //   6689: checkcast java/math/BigInteger
    //   6692: invokevirtual toByteArray : ()[B
    //   6695: invokevirtual write : ([B)V
    //   6698: aload_3
    //   6699: getstatic burp/Zg1l.Zg : Ljava/lang/Object;
    //   6702: checkcast java/math/BigInteger
    //   6705: invokevirtual toByteArray : ()[B
    //   6708: invokevirtual write : ([B)V
    //   6711: aload_3
    //   6712: getstatic burp/Zxjw.ZU : Ljava/lang/Object;
    //   6715: checkcast java/math/BigInteger
    //   6718: invokevirtual toByteArray : ()[B
    //   6721: invokevirtual write : ([B)V
    //   6724: aload_3
    //   6725: invokevirtual toByteArray : ()[B
    //   6728: astore #4
    //   6730: aconst_null
    //   6731: astore #5
    //   6733: invokestatic a : (II)Ljava/lang/String;
    //   6736: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   6739: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   6742: astore #6
    //   6744: aload #6
    //   6746: arraylength
    //   6747: istore #7
    //   6749: iconst_0
    //   6750: istore #8
    //   6752: iload #8
    //   6754: iload #7
    //   6756: if_icmpge -> 6884
    //   6759: aload #6
    //   6761: iload #8
    //   6763: aaload
    //   6764: astore #9
    //   6766: aload #9
    //   6768: invokevirtual getName : ()Ljava/lang/String;
    //   6771: sipush #-3719
    //   6774: sipush #23458
    //   6777: invokestatic a : (II)Ljava/lang/String;
    //   6780: invokevirtual equals : (Ljava/lang/Object;)Z
    //   6783: ifeq -> 6877
    //   6786: aload #9
    //   6788: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6791: astore #10
    //   6793: aload #10
    //   6795: arraylength
    //   6796: iconst_4
    //   6797: if_icmpeq -> 6807
    //   6800: goto -> 6877
    //   6803: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6806: athrow
    //   6807: aload #10
    //   6809: iconst_0
    //   6810: aaload
    //   6811: ldc java/lang/String
    //   6813: if_acmpeq -> 6823
    //   6816: goto -> 6877
    //   6819: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6822: athrow
    //   6823: aload #10
    //   6825: iconst_1
    //   6826: aaload
    //   6827: ldc [B
    //   6829: if_acmpeq -> 6839
    //   6832: goto -> 6877
    //   6835: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6838: athrow
    //   6839: aload #10
    //   6841: iconst_2
    //   6842: aaload
    //   6843: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   6846: if_acmpeq -> 6856
    //   6849: goto -> 6877
    //   6852: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6855: athrow
    //   6856: aload #10
    //   6858: iconst_3
    //   6859: aaload
    //   6860: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   6863: if_acmpeq -> 6873
    //   6866: goto -> 6877
    //   6869: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6872: athrow
    //   6873: aload #9
    //   6875: astore #5
    //   6877: iinc #8, 1
    //   6880: iload_2
    //   6881: ifeq -> 6752
    //   6884: aload #5
    //   6886: iconst_1
    //   6887: invokevirtual setAccessible : (Z)V
    //   6890: ldc burp/Zl3j
    //   6892: iconst_0
    //   6893: anewarray java/lang/Class
    //   6896: invokevirtual getDeclaredConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   6899: astore #6
    //   6901: aload #6
    //   6903: iconst_1
    //   6904: invokevirtual setAccessible : (Z)V
    //   6907: aload #5
    //   6909: aload #6
    //   6911: iconst_0
    //   6912: anewarray java/lang/Object
    //   6915: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   6918: iconst_4
    //   6919: anewarray java/lang/Object
    //   6922: dup
    //   6923: iconst_0
    //   6924: sipush #-3721
    //   6927: sipush #6526
    //   6930: invokestatic a : (II)Ljava/lang/String;
    //   6933: aastore
    //   6934: dup
    //   6935: iconst_1
    //   6936: aload #4
    //   6938: aastore
    //   6939: dup
    //   6940: iconst_2
    //   6941: iconst_0
    //   6942: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6945: aastore
    //   6946: dup
    //   6947: iconst_3
    //   6948: aload #4
    //   6950: arraylength
    //   6951: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6954: aastore
    //   6955: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   6958: pop
    //   6959: goto -> 6963
    //   6962: astore_3
    //   6963: getstatic burp/Zb14.Ze : Ljava/lang/String;
    //   6966: getstatic burp/Zlb6.Zz : Ljava/lang/Object;
    //   6969: checkcast java/math/BigInteger
    //   6972: invokevirtual intValue : ()I
    //   6975: bipush #32
    //   6977: irem
    //   6978: invokestatic abs : (I)I
    //   6981: invokevirtual charAt : (I)C
    //   6984: getstatic burp/Ztkc.ZU : Ljava/lang/String;
    //   6987: getstatic burp/Zg2.ZE : Ljava/lang/Object;
    //   6990: checkcast java/math/BigInteger
    //   6993: invokevirtual intValue : ()I
    //   6996: bipush #32
    //   6998: irem
    //   6999: invokestatic abs : (I)I
    //   7002: invokevirtual charAt : (I)C
    //   7005: if_icmple -> 7120
    //   7008: getstatic burp/Zzs9.Zg : Ljava/lang/String;
    //   7011: getstatic burp/Zgw_.Zf : Ljava/lang/Object;
    //   7014: checkcast java/math/BigInteger
    //   7017: invokevirtual intValue : ()I
    //   7020: bipush #32
    //   7022: irem
    //   7023: invokestatic abs : (I)I
    //   7026: invokevirtual charAt : (I)C
    //   7029: getstatic burp/Zx_x.Zv : Ljava/lang/String;
    //   7032: getstatic burp/Zgw_.Zf : Ljava/lang/Object;
    //   7035: checkcast java/math/BigInteger
    //   7038: invokevirtual intValue : ()I
    //   7041: bipush #32
    //   7043: irem
    //   7044: invokestatic abs : (I)I
    //   7047: invokevirtual charAt : (I)C
    //   7050: if_icmpgt -> 7120
    //   7053: goto -> 7060
    //   7056: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7059: athrow
    //   7060: getstatic burp/Zdk.Ze : Ljava/lang/String;
    //   7063: getstatic burp/Zrs0.Zz : Ljava/lang/Object;
    //   7066: checkcast java/math/BigInteger
    //   7069: invokevirtual intValue : ()I
    //   7072: bipush #32
    //   7074: irem
    //   7075: invokestatic abs : (I)I
    //   7078: invokevirtual charAt : (I)C
    //   7081: getstatic burp/Zztz.Zp : Ljava/lang/String;
    //   7084: getstatic burp/Zmt7.Z_ : Ljava/lang/Object;
    //   7087: checkcast java/math/BigInteger
    //   7090: invokevirtual intValue : ()I
    //   7093: bipush #32
    //   7095: irem
    //   7096: invokestatic abs : (I)I
    //   7099: invokevirtual charAt : (I)C
    //   7102: if_icmple -> 7120
    //   7105: goto -> 7112
    //   7108: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7111: athrow
    //   7112: iconst_1
    //   7113: goto -> 7121
    //   7116: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7119: athrow
    //   7120: iconst_0
    //   7121: ireturn
    //   7122: astore_3
    //   7123: new java/lang/Exception
    //   7126: dup
    //   7127: aload_3
    //   7128: invokevirtual getMessage : ()Ljava/lang/String;
    //   7131: invokespecial <init> : (Ljava/lang/String;)V
    //   7134: athrow
    // Exception table:
    //   from	to	target	type
    //   4	7121	7122	java/lang/Throwable
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
    //   3365	3399	3402	java/lang/Throwable
    //   3494	3572	3575	java/lang/Throwable
    //   3501	3715	3718	java/lang/Throwable
    //   4092	4107	4107	java/lang/Throwable
    //   4134	4168	4171	java/lang/Throwable
    //   4178	4190	4193	java/lang/Throwable
    //   4276	4354	4357	java/lang/Throwable
    //   4283	4497	4500	java/lang/Throwable
    //   4897	4975	4978	java/lang/Throwable
    //   4904	5118	5121	java/lang/Throwable
    //   5565	5599	5602	java/lang/Throwable
    //   5606	5618	5621	java/lang/Throwable
    //   5704	5782	5785	java/lang/Throwable
    //   5711	5925	5928	java/lang/Throwable
    //   6622	6959	6962	java/lang/Throwable
    //   6793	6803	6803	java/lang/Throwable
    //   6807	6819	6819	java/lang/Throwable
    //   6823	6835	6835	java/lang/Throwable
    //   6839	6852	6852	java/lang/Throwable
    //   6856	6869	6869	java/lang/Throwable
    //   6963	7053	7056	java/lang/Throwable
    //   7008	7105	7108	java/lang/Throwable
    //   7060	7116	7116	java/lang/Throwable
  }
  
  static void Zi(Object paramObject) {
    Zlav.ZW = a(-3715, -45);
    Zlav.Zp = new BigInteger(a(-3716, 24322));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zro5.ZY.charAt(Math.abs(((BigInteger)Ztdx.ZX).intValue() % 32)) > Zf.charAt(Math.abs(((BigInteger)Zlav.Zp).intValue() % 32))) {
          try {
            Zsgl.Ze(Class.forName(a(-3723, -13155)));
            if (bool)
              Zgt6.ZV(Class.forName(a(-3726, -17240))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zgt6.ZV(Class.forName(a(-3726, -17240)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #18
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¢|Ä¥­*Åí;1Óúí:Æ6`yÏmØ Î¡*$q¬'\\nuùÙûgMb\zU!,SOÄÇ LÜß]ÅOô'Ìuý`SÊå«Eáö=þvr»ÂÂ¤MÏýXi¿â¼jØ5>°XAKVÇ$Kö6[Ð\\tRÂqX¹îwÜè,ÆVûàOÐå\4J|*Õô"°h¥¢¤ gßtí ½!wÏÄjýa´§Ð_'s¼mTè§1ÍCb<¸\\t\\tìx&âÞ: <ÊYÉá)\\b\\r\\b>eÖl}¿!õÝw,´¶Éx\\t)£âª\\tÌ>9"1©<öf\\tWØ¨:öÜÑ÷h\\tñ­|l\\tWB÷Lòbæ\\b»g5ÍE©MgSÖ#fFDÚ¤ÎfÕÃ åê1£ã)¸\\b/(µó°¬¹"ÊÛ'´7^ÉtT;öùµÿË±L\\bh°0v{>ªh9?x'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #11
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
    //   68: ldc 'O>[±e³CIóòU½µ±aÕL-/¨®×¿'
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
    //   129: putstatic burp/Zb9h.a : [Ljava/lang/String;
    //   132: bipush #18
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zb9h.b : [Ljava/lang/String;
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
    //   212: bipush #87
    //   214: goto -> 244
    //   217: bipush #51
    //   219: goto -> 244
    //   222: bipush #98
    //   224: goto -> 244
    //   227: bipush #122
    //   229: goto -> 244
    //   232: bipush #43
    //   234: goto -> 244
    //   237: bipush #102
    //   239: goto -> 244
    //   242: bipush #99
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
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: sipush #-3722
    //   307: sipush #-8343
    //   310: invokestatic a : (II)Ljava/lang/String;
    //   313: invokespecial <init> : (Ljava/lang/String;)V
    //   316: putstatic burp/Zb9h.Zm : Ljava/lang/Object;
    //   319: sipush #-3713
    //   322: sipush #-13520
    //   325: invokestatic a : (II)Ljava/lang/String;
    //   328: putstatic burp/Zb9h.Zf : Ljava/lang/String;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFF179) & 0xFFFF;
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
      byte b1 = 124;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb9h.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */