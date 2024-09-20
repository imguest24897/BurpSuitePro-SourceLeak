package burp;

import java.math.BigInteger;

class Zlvx extends ClassLoader {
  static Object ZM;
  
  static String Zr;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean ZT(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zz5l.Zb : Ljava/lang/Object;
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
    //   868: putstatic burp/Zenq.Zd : Ljava/lang/Object;
    //   871: getstatic burp/Zzr5.Za : Ljava/lang/Object;
    //   874: checkcast java/math/BigInteger
    //   877: getstatic burp/Zej5.ZB : Ljava/lang/Object;
    //   880: checkcast java/math/BigInteger
    //   883: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   886: putstatic burp/Zs_3.ZZ : Ljava/lang/Object;
    //   889: getstatic burp/Zmfw.ZS : Ljava/lang/Object;
    //   892: checkcast java/math/BigInteger
    //   895: invokevirtual toByteArray : ()[B
    //   898: astore_3
    //   899: aload_3
    //   900: arraylength
    //   901: iconst_2
    //   902: iadd
    //   903: newarray byte
    //   905: astore #5
    //   907: iconst_0
    //   908: istore #6
    //   910: iload #6
    //   912: aload_3
    //   913: arraylength
    //   914: if_icmpge -> 933
    //   917: aload #5
    //   919: iload #6
    //   921: aload_3
    //   922: iload #6
    //   924: baload
    //   925: bastore
    //   926: iinc #6, 1
    //   929: iload_2
    //   930: ifeq -> 910
    //   933: aload #5
    //   935: arraylength
    //   936: iconst_3
    //   937: idiv
    //   938: iconst_4
    //   939: imul
    //   940: newarray byte
    //   942: astore #4
    //   944: iconst_0
    //   945: istore #6
    //   947: iconst_0
    //   948: istore #7
    //   950: iload #6
    //   952: aload_3
    //   953: arraylength
    //   954: if_icmpge -> 1065
    //   957: aload #4
    //   959: iload #7
    //   961: aload #5
    //   963: iload #6
    //   965: baload
    //   966: iconst_2
    //   967: iushr
    //   968: bipush #63
    //   970: iand
    //   971: i2b
    //   972: bastore
    //   973: aload #4
    //   975: iload #7
    //   977: iconst_1
    //   978: iadd
    //   979: aload #5
    //   981: iload #6
    //   983: iconst_1
    //   984: iadd
    //   985: baload
    //   986: iconst_4
    //   987: iushr
    //   988: bipush #15
    //   990: iand
    //   991: aload #5
    //   993: iload #6
    //   995: baload
    //   996: iconst_4
    //   997: ishl
    //   998: bipush #63
    //   1000: iand
    //   1001: ior
    //   1002: i2b
    //   1003: bastore
    //   1004: aload #4
    //   1006: iload #7
    //   1008: iconst_2
    //   1009: iadd
    //   1010: aload #5
    //   1012: iload #6
    //   1014: iconst_2
    //   1015: iadd
    //   1016: baload
    //   1017: bipush #6
    //   1019: iushr
    //   1020: iconst_3
    //   1021: iand
    //   1022: aload #5
    //   1024: iload #6
    //   1026: iconst_1
    //   1027: iadd
    //   1028: baload
    //   1029: iconst_2
    //   1030: ishl
    //   1031: bipush #63
    //   1033: iand
    //   1034: ior
    //   1035: i2b
    //   1036: bastore
    //   1037: aload #4
    //   1039: iload #7
    //   1041: iconst_3
    //   1042: iadd
    //   1043: aload #5
    //   1045: iload #6
    //   1047: iconst_2
    //   1048: iadd
    //   1049: baload
    //   1050: bipush #63
    //   1052: iand
    //   1053: i2b
    //   1054: bastore
    //   1055: iinc #6, 3
    //   1058: iinc #7, 4
    //   1061: iload_2
    //   1062: ifeq -> 950
    //   1065: iconst_0
    //   1066: istore #6
    //   1068: iload #6
    //   1070: aload #4
    //   1072: arraylength
    //   1073: if_icmpge -> 1257
    //   1076: aload #4
    //   1078: iload #6
    //   1080: baload
    //   1081: bipush #26
    //   1083: if_icmpge -> 1111
    //   1086: aload #4
    //   1088: iload #6
    //   1090: aload #4
    //   1092: iload #6
    //   1094: baload
    //   1095: bipush #65
    //   1097: iadd
    //   1098: i2b
    //   1099: bastore
    //   1100: iload_2
    //   1101: ifeq -> 1250
    //   1104: goto -> 1111
    //   1107: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1110: athrow
    //   1111: aload #4
    //   1113: iload #6
    //   1115: baload
    //   1116: bipush #52
    //   1118: if_icmpge -> 1156
    //   1121: goto -> 1128
    //   1124: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1127: athrow
    //   1128: aload #4
    //   1130: iload #6
    //   1132: aload #4
    //   1134: iload #6
    //   1136: baload
    //   1137: bipush #97
    //   1139: iadd
    //   1140: bipush #26
    //   1142: isub
    //   1143: i2b
    //   1144: bastore
    //   1145: iload_2
    //   1146: ifeq -> 1250
    //   1149: goto -> 1156
    //   1152: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1155: athrow
    //   1156: aload #4
    //   1158: iload #6
    //   1160: baload
    //   1161: bipush #62
    //   1163: if_icmpge -> 1201
    //   1166: goto -> 1173
    //   1169: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1172: athrow
    //   1173: aload #4
    //   1175: iload #6
    //   1177: aload #4
    //   1179: iload #6
    //   1181: baload
    //   1182: bipush #48
    //   1184: iadd
    //   1185: bipush #52
    //   1187: isub
    //   1188: i2b
    //   1189: bastore
    //   1190: iload_2
    //   1191: ifeq -> 1250
    //   1194: goto -> 1201
    //   1197: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1200: athrow
    //   1201: aload #4
    //   1203: iload #6
    //   1205: baload
    //   1206: bipush #63
    //   1208: if_icmpge -> 1236
    //   1211: goto -> 1218
    //   1214: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1217: athrow
    //   1218: aload #4
    //   1220: iload #6
    //   1222: bipush #43
    //   1224: bastore
    //   1225: iload_2
    //   1226: ifeq -> 1250
    //   1229: goto -> 1236
    //   1232: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1235: athrow
    //   1236: aload #4
    //   1238: iload #6
    //   1240: bipush #47
    //   1242: bastore
    //   1243: goto -> 1250
    //   1246: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1249: athrow
    //   1250: iinc #6, 1
    //   1253: iload_2
    //   1254: ifeq -> 1068
    //   1257: aload #4
    //   1259: arraylength
    //   1260: iconst_1
    //   1261: isub
    //   1262: istore #6
    //   1264: iload #6
    //   1266: aload_3
    //   1267: arraylength
    //   1268: iconst_4
    //   1269: imul
    //   1270: iconst_3
    //   1271: idiv
    //   1272: if_icmple -> 1289
    //   1275: aload #4
    //   1277: iload #6
    //   1279: bipush #61
    //   1281: bastore
    //   1282: iinc #6, -1
    //   1285: iload_2
    //   1286: ifeq -> 1264
    //   1289: new java/math/BigInteger
    //   1292: dup
    //   1293: aload #4
    //   1295: invokespecial <init> : ([B)V
    //   1298: invokevirtual abs : ()Ljava/math/BigInteger;
    //   1301: putstatic burp/Zs56.ZC : Ljava/lang/Object;
    //   1304: sipush #26199
    //   1307: sipush #-15239
    //   1310: invokestatic a : (II)Ljava/lang/String;
    //   1313: iconst_1
    //   1314: ldc burp/Zzi_
    //   1316: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1319: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1322: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1325: astore_3
    //   1326: aload_3
    //   1327: arraylength
    //   1328: istore #4
    //   1330: iconst_0
    //   1331: istore #5
    //   1333: iload #5
    //   1335: iload #4
    //   1337: if_icmpge -> 1474
    //   1340: aload_3
    //   1341: iload #5
    //   1343: aaload
    //   1344: astore #6
    //   1346: aload #6
    //   1348: invokevirtual getModifiers : ()I
    //   1351: invokestatic isStatic : (I)Z
    //   1354: ifne -> 1364
    //   1357: goto -> 1467
    //   1360: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1363: athrow
    //   1364: aload #6
    //   1366: invokevirtual getType : ()Ljava/lang/Class;
    //   1369: astore #7
    //   1371: aload #7
    //   1373: ifnull -> 1454
    //   1376: aload #7
    //   1378: invokevirtual isPrimitive : ()Z
    //   1381: ifne -> 1454
    //   1384: goto -> 1391
    //   1387: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1390: athrow
    //   1391: aload #7
    //   1393: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1396: ifnull -> 1454
    //   1399: goto -> 1406
    //   1402: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1405: athrow
    //   1406: aload #7
    //   1408: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1411: invokevirtual getName : ()Ljava/lang/String;
    //   1414: ifnull -> 1454
    //   1417: goto -> 1424
    //   1420: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1423: athrow
    //   1424: aload #7
    //   1426: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1429: invokevirtual getName : ()Ljava/lang/String;
    //   1432: sipush #26193
    //   1435: sipush #-29371
    //   1438: invokestatic a : (II)Ljava/lang/String;
    //   1441: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1444: ifne -> 1454
    //   1447: goto -> 1454
    //   1450: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1453: athrow
    //   1454: aload #6
    //   1456: iconst_1
    //   1457: invokevirtual setAccessible : (Z)V
    //   1460: aload #6
    //   1462: aconst_null
    //   1463: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1466: pop
    //   1467: iinc #5, 1
    //   1470: iload_2
    //   1471: ifeq -> 1333
    //   1474: sipush #26194
    //   1477: sipush #-13439
    //   1480: invokestatic a : (II)Ljava/lang/String;
    //   1483: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1486: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1489: astore_3
    //   1490: aload_3
    //   1491: arraylength
    //   1492: istore #4
    //   1494: iconst_0
    //   1495: istore #5
    //   1497: iload #5
    //   1499: iload #4
    //   1501: if_icmpge -> 1612
    //   1504: aload_3
    //   1505: iload #5
    //   1507: aaload
    //   1508: astore #6
    //   1510: aload #6
    //   1512: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1515: pop
    //   1516: aload #6
    //   1518: invokevirtual getModifiers : ()I
    //   1521: invokestatic isStatic : (I)Z
    //   1524: ifeq -> 1598
    //   1527: aload #6
    //   1529: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1532: arraylength
    //   1533: iconst_2
    //   1534: if_icmpne -> 1598
    //   1537: goto -> 1544
    //   1540: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1543: athrow
    //   1544: aload #6
    //   1546: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1549: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1552: if_acmpne -> 1598
    //   1555: goto -> 1562
    //   1558: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1561: athrow
    //   1562: aload #6
    //   1564: iconst_1
    //   1565: invokevirtual setAccessible : (Z)V
    //   1568: aload #6
    //   1570: aconst_null
    //   1571: iconst_2
    //   1572: anewarray java/lang/Object
    //   1575: dup
    //   1576: iconst_0
    //   1577: aload_0
    //   1578: aastore
    //   1579: dup
    //   1580: iconst_1
    //   1581: aload_1
    //   1582: aastore
    //   1583: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1586: pop
    //   1587: iload_2
    //   1588: ifeq -> 1612
    //   1591: goto -> 1598
    //   1594: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1597: athrow
    //   1598: iinc #5, 1
    //   1601: iload_2
    //   1602: ifeq -> 1497
    //   1605: goto -> 1612
    //   1608: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1611: athrow
    //   1612: sipush #26191
    //   1615: sipush #-3798
    //   1618: invokestatic a : (II)Ljava/lang/String;
    //   1621: iconst_1
    //   1622: ldc burp/Zro2
    //   1624: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1627: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1630: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1633: astore_3
    //   1634: aload_3
    //   1635: arraylength
    //   1636: istore #4
    //   1638: iconst_0
    //   1639: istore #5
    //   1641: iload #5
    //   1643: iload #4
    //   1645: if_icmpge -> 1782
    //   1648: aload_3
    //   1649: iload #5
    //   1651: aaload
    //   1652: astore #6
    //   1654: aload #6
    //   1656: invokevirtual getModifiers : ()I
    //   1659: invokestatic isStatic : (I)Z
    //   1662: ifne -> 1672
    //   1665: goto -> 1775
    //   1668: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1671: athrow
    //   1672: aload #6
    //   1674: invokevirtual getType : ()Ljava/lang/Class;
    //   1677: astore #7
    //   1679: aload #7
    //   1681: ifnull -> 1762
    //   1684: aload #7
    //   1686: invokevirtual isPrimitive : ()Z
    //   1689: ifne -> 1762
    //   1692: goto -> 1699
    //   1695: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1698: athrow
    //   1699: aload #7
    //   1701: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1704: ifnull -> 1762
    //   1707: goto -> 1714
    //   1710: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1713: athrow
    //   1714: aload #7
    //   1716: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1719: invokevirtual getName : ()Ljava/lang/String;
    //   1722: ifnull -> 1762
    //   1725: goto -> 1732
    //   1728: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1731: athrow
    //   1732: aload #7
    //   1734: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1737: invokevirtual getName : ()Ljava/lang/String;
    //   1740: sipush #26189
    //   1743: sipush #27963
    //   1746: invokestatic a : (II)Ljava/lang/String;
    //   1749: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1752: ifne -> 1762
    //   1755: goto -> 1762
    //   1758: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1761: athrow
    //   1762: aload #6
    //   1764: iconst_1
    //   1765: invokevirtual setAccessible : (Z)V
    //   1768: aload #6
    //   1770: aconst_null
    //   1771: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1774: pop
    //   1775: iinc #5, 1
    //   1778: iload_2
    //   1779: ifeq -> 1641
    //   1782: sipush #26196
    //   1785: sipush #10178
    //   1788: invokestatic a : (II)Ljava/lang/String;
    //   1791: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1794: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1797: astore_3
    //   1798: aload_3
    //   1799: arraylength
    //   1800: istore #4
    //   1802: iconst_0
    //   1803: istore #5
    //   1805: iload #5
    //   1807: iload #4
    //   1809: if_icmpge -> 1941
    //   1812: aload_3
    //   1813: iload #5
    //   1815: aaload
    //   1816: astore #6
    //   1818: aload #6
    //   1820: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1823: pop
    //   1824: aload #6
    //   1826: invokevirtual getModifiers : ()I
    //   1829: invokestatic isStatic : (I)Z
    //   1832: ifeq -> 1927
    //   1835: aload #6
    //   1837: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1840: arraylength
    //   1841: iconst_2
    //   1842: if_icmpne -> 1927
    //   1845: goto -> 1852
    //   1848: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1851: athrow
    //   1852: aload #6
    //   1854: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1857: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1860: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1863: ifeq -> 1927
    //   1866: goto -> 1873
    //   1869: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1872: athrow
    //   1873: aload #6
    //   1875: iconst_1
    //   1876: invokevirtual setAccessible : (Z)V
    //   1879: aload #6
    //   1881: aconst_null
    //   1882: iconst_2
    //   1883: anewarray java/lang/Object
    //   1886: dup
    //   1887: iconst_0
    //   1888: aload_0
    //   1889: aastore
    //   1890: dup
    //   1891: iconst_1
    //   1892: aload_1
    //   1893: ifnonnull -> 1911
    //   1896: goto -> 1903
    //   1899: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1902: athrow
    //   1903: aload_1
    //   1904: goto -> 1918
    //   1907: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1910: athrow
    //   1911: aload_1
    //   1912: checkcast [B
    //   1915: invokevirtual clone : ()Ljava/lang/Object;
    //   1918: aastore
    //   1919: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1922: pop
    //   1923: iload_2
    //   1924: ifeq -> 1941
    //   1927: iinc #5, 1
    //   1930: iload_2
    //   1931: ifeq -> 1805
    //   1934: goto -> 1941
    //   1937: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1940: athrow
    //   1941: iconst_0
    //   1942: istore_3
    //   1943: getstatic burp/Ztsc.ZL : Ljava/lang/String;
    //   1946: getstatic burp/Zzpj.ZI : Ljava/lang/Object;
    //   1949: checkcast java/math/BigInteger
    //   1952: invokevirtual intValue : ()I
    //   1955: bipush #32
    //   1957: irem
    //   1958: invokestatic abs : (I)I
    //   1961: invokevirtual charAt : (I)C
    //   1964: getstatic burp/Zzhu.ZT : Ljava/lang/String;
    //   1967: getstatic burp/Zl5.ZY : Ljava/lang/Object;
    //   1970: checkcast java/math/BigInteger
    //   1973: invokevirtual intValue : ()I
    //   1976: bipush #32
    //   1978: irem
    //   1979: invokestatic abs : (I)I
    //   1982: invokevirtual charAt : (I)C
    //   1985: if_icmple -> 2329
    //   1988: sipush #26201
    //   1991: sipush #25236
    //   1994: invokestatic a : (II)Ljava/lang/String;
    //   1997: iconst_1
    //   1998: ldc burp/Zelz
    //   2000: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2003: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2006: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2009: astore #4
    //   2011: aload #4
    //   2013: arraylength
    //   2014: istore #5
    //   2016: iconst_0
    //   2017: istore #6
    //   2019: iload #6
    //   2021: iload #5
    //   2023: if_icmpge -> 2161
    //   2026: aload #4
    //   2028: iload #6
    //   2030: aaload
    //   2031: astore #7
    //   2033: aload #7
    //   2035: invokevirtual getModifiers : ()I
    //   2038: invokestatic isStatic : (I)Z
    //   2041: ifne -> 2051
    //   2044: goto -> 2154
    //   2047: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2050: athrow
    //   2051: aload #7
    //   2053: invokevirtual getType : ()Ljava/lang/Class;
    //   2056: astore #8
    //   2058: aload #8
    //   2060: ifnull -> 2141
    //   2063: aload #8
    //   2065: invokevirtual isPrimitive : ()Z
    //   2068: ifne -> 2141
    //   2071: goto -> 2078
    //   2074: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2077: athrow
    //   2078: aload #8
    //   2080: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2083: ifnull -> 2141
    //   2086: goto -> 2093
    //   2089: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2092: athrow
    //   2093: aload #8
    //   2095: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2098: invokevirtual getName : ()Ljava/lang/String;
    //   2101: ifnull -> 2141
    //   2104: goto -> 2111
    //   2107: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2110: athrow
    //   2111: aload #8
    //   2113: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2116: invokevirtual getName : ()Ljava/lang/String;
    //   2119: sipush #26189
    //   2122: sipush #27963
    //   2125: invokestatic a : (II)Ljava/lang/String;
    //   2128: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2131: ifne -> 2141
    //   2134: goto -> 2141
    //   2137: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2140: athrow
    //   2141: aload #7
    //   2143: iconst_1
    //   2144: invokevirtual setAccessible : (Z)V
    //   2147: aload #7
    //   2149: aconst_null
    //   2150: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2153: pop
    //   2154: iinc #6, 1
    //   2157: iload_2
    //   2158: ifeq -> 2019
    //   2161: sipush #26187
    //   2164: sipush #5558
    //   2167: invokestatic a : (II)Ljava/lang/String;
    //   2170: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2173: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2176: astore #4
    //   2178: aload #4
    //   2180: arraylength
    //   2181: istore #5
    //   2183: iconst_0
    //   2184: istore #6
    //   2186: iload #6
    //   2188: iload #5
    //   2190: if_icmpge -> 2326
    //   2193: aload #4
    //   2195: iload #6
    //   2197: aaload
    //   2198: astore #7
    //   2200: aload #7
    //   2202: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2205: pop
    //   2206: aload #7
    //   2208: invokevirtual getModifiers : ()I
    //   2211: invokestatic isStatic : (I)Z
    //   2214: ifeq -> 2312
    //   2217: aload #7
    //   2219: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2222: arraylength
    //   2223: iconst_2
    //   2224: if_icmpne -> 2312
    //   2227: goto -> 2234
    //   2230: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2233: athrow
    //   2234: aload #7
    //   2236: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2239: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2242: if_acmpne -> 2312
    //   2245: goto -> 2252
    //   2248: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2251: athrow
    //   2252: aload #7
    //   2254: iconst_1
    //   2255: invokevirtual setAccessible : (Z)V
    //   2258: aload #7
    //   2260: aconst_null
    //   2261: iconst_2
    //   2262: anewarray java/lang/Object
    //   2265: dup
    //   2266: iconst_0
    //   2267: aload_0
    //   2268: aastore
    //   2269: dup
    //   2270: iconst_1
    //   2271: aload_1
    //   2272: ifnonnull -> 2290
    //   2275: goto -> 2282
    //   2278: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2281: athrow
    //   2282: aload_1
    //   2283: goto -> 2297
    //   2286: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2289: athrow
    //   2290: aload_1
    //   2291: checkcast [B
    //   2294: invokevirtual clone : ()Ljava/lang/Object;
    //   2297: aastore
    //   2298: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2301: checkcast java/lang/Boolean
    //   2304: invokevirtual booleanValue : ()Z
    //   2307: istore_3
    //   2308: iload_2
    //   2309: ifeq -> 2326
    //   2312: iinc #6, 1
    //   2315: iload_2
    //   2316: ifeq -> 2186
    //   2319: goto -> 2326
    //   2322: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2325: athrow
    //   2326: goto -> 2667
    //   2329: sipush #26198
    //   2332: sipush #19989
    //   2335: invokestatic a : (II)Ljava/lang/String;
    //   2338: iconst_1
    //   2339: ldc burp/Zt7w
    //   2341: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2344: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2347: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2350: astore #4
    //   2352: aload #4
    //   2354: arraylength
    //   2355: istore #5
    //   2357: iconst_0
    //   2358: istore #6
    //   2360: iload #6
    //   2362: iload #5
    //   2364: if_icmpge -> 2502
    //   2367: aload #4
    //   2369: iload #6
    //   2371: aaload
    //   2372: astore #7
    //   2374: aload #7
    //   2376: invokevirtual getModifiers : ()I
    //   2379: invokestatic isStatic : (I)Z
    //   2382: ifne -> 2392
    //   2385: goto -> 2495
    //   2388: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2391: athrow
    //   2392: aload #7
    //   2394: invokevirtual getType : ()Ljava/lang/Class;
    //   2397: astore #8
    //   2399: aload #8
    //   2401: ifnull -> 2482
    //   2404: aload #8
    //   2406: invokevirtual isPrimitive : ()Z
    //   2409: ifne -> 2482
    //   2412: goto -> 2419
    //   2415: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2418: athrow
    //   2419: aload #8
    //   2421: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2424: ifnull -> 2482
    //   2427: goto -> 2434
    //   2430: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2433: athrow
    //   2434: aload #8
    //   2436: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2439: invokevirtual getName : ()Ljava/lang/String;
    //   2442: ifnull -> 2482
    //   2445: goto -> 2452
    //   2448: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2451: athrow
    //   2452: aload #8
    //   2454: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2457: invokevirtual getName : ()Ljava/lang/String;
    //   2460: sipush #26189
    //   2463: sipush #27963
    //   2466: invokestatic a : (II)Ljava/lang/String;
    //   2469: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2472: ifne -> 2482
    //   2475: goto -> 2482
    //   2478: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2481: athrow
    //   2482: aload #7
    //   2484: iconst_1
    //   2485: invokevirtual setAccessible : (Z)V
    //   2488: aload #7
    //   2490: aconst_null
    //   2491: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2494: pop
    //   2495: iinc #6, 1
    //   2498: iload_2
    //   2499: ifeq -> 2360
    //   2502: sipush #26188
    //   2505: sipush #-30905
    //   2508: invokestatic a : (II)Ljava/lang/String;
    //   2511: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2514: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2517: astore #4
    //   2519: aload #4
    //   2521: arraylength
    //   2522: istore #5
    //   2524: iconst_0
    //   2525: istore #6
    //   2527: iload #6
    //   2529: iload #5
    //   2531: if_icmpge -> 2667
    //   2534: aload #4
    //   2536: iload #6
    //   2538: aaload
    //   2539: astore #7
    //   2541: aload #7
    //   2543: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2546: pop
    //   2547: aload #7
    //   2549: invokevirtual getModifiers : ()I
    //   2552: invokestatic isStatic : (I)Z
    //   2555: ifeq -> 2653
    //   2558: aload #7
    //   2560: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2563: arraylength
    //   2564: iconst_2
    //   2565: if_icmpne -> 2653
    //   2568: goto -> 2575
    //   2571: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2574: athrow
    //   2575: aload #7
    //   2577: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2580: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2583: if_acmpne -> 2653
    //   2586: goto -> 2593
    //   2589: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2592: athrow
    //   2593: aload #7
    //   2595: iconst_1
    //   2596: invokevirtual setAccessible : (Z)V
    //   2599: aload #7
    //   2601: aconst_null
    //   2602: iconst_2
    //   2603: anewarray java/lang/Object
    //   2606: dup
    //   2607: iconst_0
    //   2608: aload_0
    //   2609: aastore
    //   2610: dup
    //   2611: iconst_1
    //   2612: aload_1
    //   2613: ifnonnull -> 2631
    //   2616: goto -> 2623
    //   2619: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2622: athrow
    //   2623: aload_1
    //   2624: goto -> 2638
    //   2627: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2630: athrow
    //   2631: aload_1
    //   2632: checkcast [B
    //   2635: invokevirtual clone : ()Ljava/lang/Object;
    //   2638: aastore
    //   2639: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2642: checkcast java/lang/Boolean
    //   2645: invokevirtual booleanValue : ()Z
    //   2648: istore_3
    //   2649: iload_2
    //   2650: ifeq -> 2667
    //   2653: iinc #6, 1
    //   2656: iload_2
    //   2657: ifeq -> 2527
    //   2660: goto -> 2667
    //   2663: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2666: athrow
    //   2667: iload_3
    //   2668: ifeq -> 2673
    //   2671: iload_3
    //   2672: ireturn
    //   2673: getstatic burp/Zrct.ZT : Ljava/lang/String;
    //   2676: getstatic burp/Zrxf.ZS : Ljava/lang/Object;
    //   2679: checkcast java/math/BigInteger
    //   2682: invokevirtual intValue : ()I
    //   2685: bipush #32
    //   2687: irem
    //   2688: invokestatic abs : (I)I
    //   2691: invokevirtual charAt : (I)C
    //   2694: getstatic burp/Zl5.ZE : Ljava/lang/String;
    //   2697: getstatic burp/Zeqw.ZV : Ljava/lang/Object;
    //   2700: checkcast java/math/BigInteger
    //   2703: invokevirtual intValue : ()I
    //   2706: bipush #32
    //   2708: irem
    //   2709: invokestatic abs : (I)I
    //   2712: invokevirtual charAt : (I)C
    //   2715: if_icmple -> 3060
    //   2718: sipush #26203
    //   2721: sipush #-3822
    //   2724: invokestatic a : (II)Ljava/lang/String;
    //   2727: iconst_1
    //   2728: ldc burp/Zeqo
    //   2730: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2733: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2736: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2739: astore #4
    //   2741: aload #4
    //   2743: arraylength
    //   2744: istore #5
    //   2746: iconst_0
    //   2747: istore #6
    //   2749: iload #6
    //   2751: iload #5
    //   2753: if_icmpge -> 2891
    //   2756: aload #4
    //   2758: iload #6
    //   2760: aaload
    //   2761: astore #7
    //   2763: aload #7
    //   2765: invokevirtual getModifiers : ()I
    //   2768: invokestatic isStatic : (I)Z
    //   2771: ifne -> 2781
    //   2774: goto -> 2884
    //   2777: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2780: athrow
    //   2781: aload #7
    //   2783: invokevirtual getType : ()Ljava/lang/Class;
    //   2786: astore #8
    //   2788: aload #8
    //   2790: ifnull -> 2871
    //   2793: aload #8
    //   2795: invokevirtual isPrimitive : ()Z
    //   2798: ifne -> 2871
    //   2801: goto -> 2808
    //   2804: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2807: athrow
    //   2808: aload #8
    //   2810: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2813: ifnull -> 2871
    //   2816: goto -> 2823
    //   2819: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2822: athrow
    //   2823: aload #8
    //   2825: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2828: invokevirtual getName : ()Ljava/lang/String;
    //   2831: ifnull -> 2871
    //   2834: goto -> 2841
    //   2837: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2840: athrow
    //   2841: aload #8
    //   2843: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2846: invokevirtual getName : ()Ljava/lang/String;
    //   2849: sipush #26189
    //   2852: sipush #27963
    //   2855: invokestatic a : (II)Ljava/lang/String;
    //   2858: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2861: ifne -> 2871
    //   2864: goto -> 2871
    //   2867: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2870: athrow
    //   2871: aload #7
    //   2873: iconst_1
    //   2874: invokevirtual setAccessible : (Z)V
    //   2877: aload #7
    //   2879: aconst_null
    //   2880: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2883: pop
    //   2884: iinc #6, 1
    //   2887: iload_2
    //   2888: ifeq -> 2749
    //   2891: sipush #26190
    //   2894: sipush #-23133
    //   2897: invokestatic a : (II)Ljava/lang/String;
    //   2900: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2903: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2906: astore #4
    //   2908: aload #4
    //   2910: arraylength
    //   2911: istore #5
    //   2913: iconst_0
    //   2914: istore #6
    //   2916: iload #6
    //   2918: iload #5
    //   2920: if_icmpge -> 3056
    //   2923: aload #4
    //   2925: iload #6
    //   2927: aaload
    //   2928: astore #7
    //   2930: aload #7
    //   2932: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2935: pop
    //   2936: aload #7
    //   2938: invokevirtual getModifiers : ()I
    //   2941: invokestatic isStatic : (I)Z
    //   2944: ifeq -> 3042
    //   2947: aload #7
    //   2949: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2952: arraylength
    //   2953: iconst_2
    //   2954: if_icmpne -> 3042
    //   2957: goto -> 2964
    //   2960: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2963: athrow
    //   2964: aload #7
    //   2966: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2969: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2972: if_acmpne -> 3042
    //   2975: goto -> 2982
    //   2978: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2981: athrow
    //   2982: aload #7
    //   2984: iconst_1
    //   2985: invokevirtual setAccessible : (Z)V
    //   2988: aload #7
    //   2990: aconst_null
    //   2991: iconst_2
    //   2992: anewarray java/lang/Object
    //   2995: dup
    //   2996: iconst_0
    //   2997: aload_0
    //   2998: aastore
    //   2999: dup
    //   3000: iconst_1
    //   3001: aload_1
    //   3002: ifnonnull -> 3020
    //   3005: goto -> 3012
    //   3008: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3011: athrow
    //   3012: aload_1
    //   3013: goto -> 3027
    //   3016: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3019: athrow
    //   3020: aload_1
    //   3021: checkcast [B
    //   3024: invokevirtual clone : ()Ljava/lang/Object;
    //   3027: aastore
    //   3028: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3031: checkcast java/lang/Boolean
    //   3034: invokevirtual booleanValue : ()Z
    //   3037: istore_3
    //   3038: iload_2
    //   3039: ifeq -> 3056
    //   3042: iinc #6, 1
    //   3045: iload_2
    //   3046: ifeq -> 2916
    //   3049: goto -> 3056
    //   3052: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3055: athrow
    //   3056: iload_2
    //   3057: ifeq -> 3398
    //   3060: sipush #26181
    //   3063: sipush #5105
    //   3066: invokestatic a : (II)Ljava/lang/String;
    //   3069: iconst_1
    //   3070: ldc burp/Zrd0
    //   3072: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3075: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3078: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3081: astore #4
    //   3083: aload #4
    //   3085: arraylength
    //   3086: istore #5
    //   3088: iconst_0
    //   3089: istore #6
    //   3091: iload #6
    //   3093: iload #5
    //   3095: if_icmpge -> 3233
    //   3098: aload #4
    //   3100: iload #6
    //   3102: aaload
    //   3103: astore #7
    //   3105: aload #7
    //   3107: invokevirtual getModifiers : ()I
    //   3110: invokestatic isStatic : (I)Z
    //   3113: ifne -> 3123
    //   3116: goto -> 3226
    //   3119: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3122: athrow
    //   3123: aload #7
    //   3125: invokevirtual getType : ()Ljava/lang/Class;
    //   3128: astore #8
    //   3130: aload #8
    //   3132: ifnull -> 3213
    //   3135: aload #8
    //   3137: invokevirtual isPrimitive : ()Z
    //   3140: ifne -> 3213
    //   3143: goto -> 3150
    //   3146: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3149: athrow
    //   3150: aload #8
    //   3152: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3155: ifnull -> 3213
    //   3158: goto -> 3165
    //   3161: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3164: athrow
    //   3165: aload #8
    //   3167: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3170: invokevirtual getName : ()Ljava/lang/String;
    //   3173: ifnull -> 3213
    //   3176: goto -> 3183
    //   3179: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3182: athrow
    //   3183: aload #8
    //   3185: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3188: invokevirtual getName : ()Ljava/lang/String;
    //   3191: sipush #26189
    //   3194: sipush #27963
    //   3197: invokestatic a : (II)Ljava/lang/String;
    //   3200: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3203: ifne -> 3213
    //   3206: goto -> 3213
    //   3209: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3212: athrow
    //   3213: aload #7
    //   3215: iconst_1
    //   3216: invokevirtual setAccessible : (Z)V
    //   3219: aload #7
    //   3221: aconst_null
    //   3222: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3225: pop
    //   3226: iinc #6, 1
    //   3229: iload_2
    //   3230: ifeq -> 3091
    //   3233: sipush #26195
    //   3236: sipush #30100
    //   3239: invokestatic a : (II)Ljava/lang/String;
    //   3242: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3245: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3248: astore #4
    //   3250: aload #4
    //   3252: arraylength
    //   3253: istore #5
    //   3255: iconst_0
    //   3256: istore #6
    //   3258: iload #6
    //   3260: iload #5
    //   3262: if_icmpge -> 3398
    //   3265: aload #4
    //   3267: iload #6
    //   3269: aaload
    //   3270: astore #7
    //   3272: aload #7
    //   3274: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3277: pop
    //   3278: aload #7
    //   3280: invokevirtual getModifiers : ()I
    //   3283: invokestatic isStatic : (I)Z
    //   3286: ifeq -> 3384
    //   3289: aload #7
    //   3291: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3294: arraylength
    //   3295: iconst_2
    //   3296: if_icmpne -> 3384
    //   3299: goto -> 3306
    //   3302: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3305: athrow
    //   3306: aload #7
    //   3308: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3311: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3314: if_acmpne -> 3384
    //   3317: goto -> 3324
    //   3320: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3323: athrow
    //   3324: aload #7
    //   3326: iconst_1
    //   3327: invokevirtual setAccessible : (Z)V
    //   3330: aload #7
    //   3332: aconst_null
    //   3333: iconst_2
    //   3334: anewarray java/lang/Object
    //   3337: dup
    //   3338: iconst_0
    //   3339: aload_0
    //   3340: aastore
    //   3341: dup
    //   3342: iconst_1
    //   3343: aload_1
    //   3344: ifnonnull -> 3362
    //   3347: goto -> 3354
    //   3350: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3353: athrow
    //   3354: aload_1
    //   3355: goto -> 3369
    //   3358: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3361: athrow
    //   3362: aload_1
    //   3363: checkcast [B
    //   3366: invokevirtual clone : ()Ljava/lang/Object;
    //   3369: aastore
    //   3370: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3373: checkcast java/lang/Boolean
    //   3376: invokevirtual booleanValue : ()Z
    //   3379: istore_3
    //   3380: iload_2
    //   3381: ifeq -> 3398
    //   3384: iinc #6, 1
    //   3387: iload_2
    //   3388: ifeq -> 3258
    //   3391: goto -> 3398
    //   3394: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3397: athrow
    //   3398: iload_3
    //   3399: ifeq -> 3404
    //   3402: iload_3
    //   3403: ireturn
    //   3404: getstatic burp/Zr8r.Zn : Ljava/lang/String;
    //   3407: getstatic burp/Zrxf.ZS : Ljava/lang/Object;
    //   3410: checkcast java/math/BigInteger
    //   3413: invokevirtual intValue : ()I
    //   3416: bipush #32
    //   3418: irem
    //   3419: invokestatic abs : (I)I
    //   3422: invokevirtual charAt : (I)C
    //   3425: getstatic burp/Zgs6.ZD : Ljava/lang/String;
    //   3428: getstatic burp/Zgr1.Zf : Ljava/lang/Object;
    //   3431: checkcast java/math/BigInteger
    //   3434: invokevirtual intValue : ()I
    //   3437: bipush #32
    //   3439: irem
    //   3440: invokestatic abs : (I)I
    //   3443: invokevirtual charAt : (I)C
    //   3446: if_icmple -> 3791
    //   3449: sipush #26179
    //   3452: sipush #-26202
    //   3455: invokestatic a : (II)Ljava/lang/String;
    //   3458: iconst_1
    //   3459: ldc burp/Zxzp
    //   3461: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3464: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3467: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3470: astore #4
    //   3472: aload #4
    //   3474: arraylength
    //   3475: istore #5
    //   3477: iconst_0
    //   3478: istore #6
    //   3480: iload #6
    //   3482: iload #5
    //   3484: if_icmpge -> 3622
    //   3487: aload #4
    //   3489: iload #6
    //   3491: aaload
    //   3492: astore #7
    //   3494: aload #7
    //   3496: invokevirtual getModifiers : ()I
    //   3499: invokestatic isStatic : (I)Z
    //   3502: ifne -> 3512
    //   3505: goto -> 3615
    //   3508: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3511: athrow
    //   3512: aload #7
    //   3514: invokevirtual getType : ()Ljava/lang/Class;
    //   3517: astore #8
    //   3519: aload #8
    //   3521: ifnull -> 3602
    //   3524: aload #8
    //   3526: invokevirtual isPrimitive : ()Z
    //   3529: ifne -> 3602
    //   3532: goto -> 3539
    //   3535: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3538: athrow
    //   3539: aload #8
    //   3541: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3544: ifnull -> 3602
    //   3547: goto -> 3554
    //   3550: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3553: athrow
    //   3554: aload #8
    //   3556: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3559: invokevirtual getName : ()Ljava/lang/String;
    //   3562: ifnull -> 3602
    //   3565: goto -> 3572
    //   3568: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3571: athrow
    //   3572: aload #8
    //   3574: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3577: invokevirtual getName : ()Ljava/lang/String;
    //   3580: sipush #26189
    //   3583: sipush #27963
    //   3586: invokestatic a : (II)Ljava/lang/String;
    //   3589: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3592: ifne -> 3602
    //   3595: goto -> 3602
    //   3598: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3601: athrow
    //   3602: aload #7
    //   3604: iconst_1
    //   3605: invokevirtual setAccessible : (Z)V
    //   3608: aload #7
    //   3610: aconst_null
    //   3611: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3614: pop
    //   3615: iinc #6, 1
    //   3618: iload_2
    //   3619: ifeq -> 3480
    //   3622: sipush #26197
    //   3625: sipush #9900
    //   3628: invokestatic a : (II)Ljava/lang/String;
    //   3631: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3634: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3637: astore #4
    //   3639: aload #4
    //   3641: arraylength
    //   3642: istore #5
    //   3644: iconst_0
    //   3645: istore #6
    //   3647: iload #6
    //   3649: iload #5
    //   3651: if_icmpge -> 3787
    //   3654: aload #4
    //   3656: iload #6
    //   3658: aaload
    //   3659: astore #7
    //   3661: aload #7
    //   3663: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3666: pop
    //   3667: aload #7
    //   3669: invokevirtual getModifiers : ()I
    //   3672: invokestatic isStatic : (I)Z
    //   3675: ifeq -> 3773
    //   3678: aload #7
    //   3680: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3683: arraylength
    //   3684: iconst_2
    //   3685: if_icmpne -> 3773
    //   3688: goto -> 3695
    //   3691: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3694: athrow
    //   3695: aload #7
    //   3697: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3700: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3703: if_acmpne -> 3773
    //   3706: goto -> 3713
    //   3709: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3712: athrow
    //   3713: aload #7
    //   3715: iconst_1
    //   3716: invokevirtual setAccessible : (Z)V
    //   3719: aload #7
    //   3721: aconst_null
    //   3722: iconst_2
    //   3723: anewarray java/lang/Object
    //   3726: dup
    //   3727: iconst_0
    //   3728: aload_0
    //   3729: aastore
    //   3730: dup
    //   3731: iconst_1
    //   3732: aload_1
    //   3733: ifnonnull -> 3751
    //   3736: goto -> 3743
    //   3739: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3742: athrow
    //   3743: aload_1
    //   3744: goto -> 3758
    //   3747: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3750: athrow
    //   3751: aload_1
    //   3752: checkcast [B
    //   3755: invokevirtual clone : ()Ljava/lang/Object;
    //   3758: aastore
    //   3759: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3762: checkcast java/lang/Boolean
    //   3765: invokevirtual booleanValue : ()Z
    //   3768: istore_3
    //   3769: iload_2
    //   3770: ifeq -> 3787
    //   3773: iinc #6, 1
    //   3776: iload_2
    //   3777: ifeq -> 3647
    //   3780: goto -> 3787
    //   3783: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3786: athrow
    //   3787: iload_2
    //   3788: ifeq -> 4129
    //   3791: sipush #26192
    //   3794: sipush #-9925
    //   3797: invokestatic a : (II)Ljava/lang/String;
    //   3800: iconst_1
    //   3801: ldc burp/Zmz
    //   3803: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3806: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3809: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3812: astore #4
    //   3814: aload #4
    //   3816: arraylength
    //   3817: istore #5
    //   3819: iconst_0
    //   3820: istore #6
    //   3822: iload #6
    //   3824: iload #5
    //   3826: if_icmpge -> 3964
    //   3829: aload #4
    //   3831: iload #6
    //   3833: aaload
    //   3834: astore #7
    //   3836: aload #7
    //   3838: invokevirtual getModifiers : ()I
    //   3841: invokestatic isStatic : (I)Z
    //   3844: ifne -> 3854
    //   3847: goto -> 3957
    //   3850: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3853: athrow
    //   3854: aload #7
    //   3856: invokevirtual getType : ()Ljava/lang/Class;
    //   3859: astore #8
    //   3861: aload #8
    //   3863: ifnull -> 3944
    //   3866: aload #8
    //   3868: invokevirtual isPrimitive : ()Z
    //   3871: ifne -> 3944
    //   3874: goto -> 3881
    //   3877: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3880: athrow
    //   3881: aload #8
    //   3883: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3886: ifnull -> 3944
    //   3889: goto -> 3896
    //   3892: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3895: athrow
    //   3896: aload #8
    //   3898: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3901: invokevirtual getName : ()Ljava/lang/String;
    //   3904: ifnull -> 3944
    //   3907: goto -> 3914
    //   3910: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3913: athrow
    //   3914: aload #8
    //   3916: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3919: invokevirtual getName : ()Ljava/lang/String;
    //   3922: sipush #26189
    //   3925: sipush #27963
    //   3928: invokestatic a : (II)Ljava/lang/String;
    //   3931: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3934: ifne -> 3944
    //   3937: goto -> 3944
    //   3940: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3943: athrow
    //   3944: aload #7
    //   3946: iconst_1
    //   3947: invokevirtual setAccessible : (Z)V
    //   3950: aload #7
    //   3952: aconst_null
    //   3953: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3956: pop
    //   3957: iinc #6, 1
    //   3960: iload_2
    //   3961: ifeq -> 3822
    //   3964: sipush #26192
    //   3967: sipush #-9925
    //   3970: invokestatic a : (II)Ljava/lang/String;
    //   3973: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3976: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3979: astore #4
    //   3981: aload #4
    //   3983: arraylength
    //   3984: istore #5
    //   3986: iconst_0
    //   3987: istore #6
    //   3989: iload #6
    //   3991: iload #5
    //   3993: if_icmpge -> 4129
    //   3996: aload #4
    //   3998: iload #6
    //   4000: aaload
    //   4001: astore #7
    //   4003: aload #7
    //   4005: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4008: pop
    //   4009: aload #7
    //   4011: invokevirtual getModifiers : ()I
    //   4014: invokestatic isStatic : (I)Z
    //   4017: ifeq -> 4115
    //   4020: aload #7
    //   4022: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4025: arraylength
    //   4026: iconst_2
    //   4027: if_icmpne -> 4115
    //   4030: goto -> 4037
    //   4033: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4036: athrow
    //   4037: aload #7
    //   4039: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4042: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4045: if_acmpne -> 4115
    //   4048: goto -> 4055
    //   4051: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4054: athrow
    //   4055: aload #7
    //   4057: iconst_1
    //   4058: invokevirtual setAccessible : (Z)V
    //   4061: aload #7
    //   4063: aconst_null
    //   4064: iconst_2
    //   4065: anewarray java/lang/Object
    //   4068: dup
    //   4069: iconst_0
    //   4070: aload_0
    //   4071: aastore
    //   4072: dup
    //   4073: iconst_1
    //   4074: aload_1
    //   4075: ifnonnull -> 4093
    //   4078: goto -> 4085
    //   4081: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4084: athrow
    //   4085: aload_1
    //   4086: goto -> 4100
    //   4089: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4092: athrow
    //   4093: aload_1
    //   4094: checkcast [B
    //   4097: invokevirtual clone : ()Ljava/lang/Object;
    //   4100: aastore
    //   4101: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4104: checkcast java/lang/Boolean
    //   4107: invokevirtual booleanValue : ()Z
    //   4110: istore_3
    //   4111: iload_2
    //   4112: ifeq -> 4129
    //   4115: iinc #6, 1
    //   4118: iload_2
    //   4119: ifeq -> 3989
    //   4122: goto -> 4129
    //   4125: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4128: athrow
    //   4129: iload_3
    //   4130: ifeq -> 4135
    //   4133: iload_3
    //   4134: ireturn
    //   4135: getstatic burp/Zms1.ZZ : Ljava/lang/String;
    //   4138: getstatic burp/Zs5k.Zg : Ljava/lang/Object;
    //   4141: checkcast java/math/BigInteger
    //   4144: invokevirtual intValue : ()I
    //   4147: bipush #32
    //   4149: irem
    //   4150: invokestatic abs : (I)I
    //   4153: invokevirtual charAt : (I)C
    //   4156: getstatic burp/Zlhu.ZC : Ljava/lang/String;
    //   4159: getstatic burp/Zz0.ZJ : Ljava/lang/Object;
    //   4162: checkcast java/math/BigInteger
    //   4165: invokevirtual intValue : ()I
    //   4168: bipush #32
    //   4170: irem
    //   4171: invokestatic abs : (I)I
    //   4174: invokevirtual charAt : (I)C
    //   4177: if_icmple -> 4522
    //   4180: sipush #26200
    //   4183: sipush #-2996
    //   4186: invokestatic a : (II)Ljava/lang/String;
    //   4189: iconst_1
    //   4190: ldc burp/Zkdc
    //   4192: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4195: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4198: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4201: astore #4
    //   4203: aload #4
    //   4205: arraylength
    //   4206: istore #5
    //   4208: iconst_0
    //   4209: istore #6
    //   4211: iload #6
    //   4213: iload #5
    //   4215: if_icmpge -> 4353
    //   4218: aload #4
    //   4220: iload #6
    //   4222: aaload
    //   4223: astore #7
    //   4225: aload #7
    //   4227: invokevirtual getModifiers : ()I
    //   4230: invokestatic isStatic : (I)Z
    //   4233: ifne -> 4243
    //   4236: goto -> 4346
    //   4239: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4242: athrow
    //   4243: aload #7
    //   4245: invokevirtual getType : ()Ljava/lang/Class;
    //   4248: astore #8
    //   4250: aload #8
    //   4252: ifnull -> 4333
    //   4255: aload #8
    //   4257: invokevirtual isPrimitive : ()Z
    //   4260: ifne -> 4333
    //   4263: goto -> 4270
    //   4266: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4269: athrow
    //   4270: aload #8
    //   4272: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4275: ifnull -> 4333
    //   4278: goto -> 4285
    //   4281: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4284: athrow
    //   4285: aload #8
    //   4287: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4290: invokevirtual getName : ()Ljava/lang/String;
    //   4293: ifnull -> 4333
    //   4296: goto -> 4303
    //   4299: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4302: athrow
    //   4303: aload #8
    //   4305: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4308: invokevirtual getName : ()Ljava/lang/String;
    //   4311: sipush #26189
    //   4314: sipush #27963
    //   4317: invokestatic a : (II)Ljava/lang/String;
    //   4320: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4323: ifne -> 4333
    //   4326: goto -> 4333
    //   4329: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4332: athrow
    //   4333: aload #7
    //   4335: iconst_1
    //   4336: invokevirtual setAccessible : (Z)V
    //   4339: aload #7
    //   4341: aconst_null
    //   4342: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4345: pop
    //   4346: iinc #6, 1
    //   4349: iload_2
    //   4350: ifeq -> 4211
    //   4353: sipush #26183
    //   4356: sipush #-18439
    //   4359: invokestatic a : (II)Ljava/lang/String;
    //   4362: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4365: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4368: astore #4
    //   4370: aload #4
    //   4372: arraylength
    //   4373: istore #5
    //   4375: iconst_0
    //   4376: istore #6
    //   4378: iload #6
    //   4380: iload #5
    //   4382: if_icmpge -> 4518
    //   4385: aload #4
    //   4387: iload #6
    //   4389: aaload
    //   4390: astore #7
    //   4392: aload #7
    //   4394: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4397: pop
    //   4398: aload #7
    //   4400: invokevirtual getModifiers : ()I
    //   4403: invokestatic isStatic : (I)Z
    //   4406: ifeq -> 4504
    //   4409: aload #7
    //   4411: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4414: arraylength
    //   4415: iconst_2
    //   4416: if_icmpne -> 4504
    //   4419: goto -> 4426
    //   4422: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4425: athrow
    //   4426: aload #7
    //   4428: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4431: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4434: if_acmpne -> 4504
    //   4437: goto -> 4444
    //   4440: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4443: athrow
    //   4444: aload #7
    //   4446: iconst_1
    //   4447: invokevirtual setAccessible : (Z)V
    //   4450: aload #7
    //   4452: aconst_null
    //   4453: iconst_2
    //   4454: anewarray java/lang/Object
    //   4457: dup
    //   4458: iconst_0
    //   4459: aload_0
    //   4460: aastore
    //   4461: dup
    //   4462: iconst_1
    //   4463: aload_1
    //   4464: ifnonnull -> 4482
    //   4467: goto -> 4474
    //   4470: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4473: athrow
    //   4474: aload_1
    //   4475: goto -> 4489
    //   4478: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4481: athrow
    //   4482: aload_1
    //   4483: checkcast [B
    //   4486: invokevirtual clone : ()Ljava/lang/Object;
    //   4489: aastore
    //   4490: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4493: checkcast java/lang/Boolean
    //   4496: invokevirtual booleanValue : ()Z
    //   4499: istore_3
    //   4500: iload_2
    //   4501: ifeq -> 4518
    //   4504: iinc #6, 1
    //   4507: iload_2
    //   4508: ifeq -> 4378
    //   4511: goto -> 4518
    //   4514: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4517: athrow
    //   4518: iload_2
    //   4519: ifeq -> 4860
    //   4522: sipush #26184
    //   4525: sipush #-26731
    //   4528: invokestatic a : (II)Ljava/lang/String;
    //   4531: iconst_1
    //   4532: ldc burp/Zl1n
    //   4534: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4537: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4540: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4543: astore #4
    //   4545: aload #4
    //   4547: arraylength
    //   4548: istore #5
    //   4550: iconst_0
    //   4551: istore #6
    //   4553: iload #6
    //   4555: iload #5
    //   4557: if_icmpge -> 4695
    //   4560: aload #4
    //   4562: iload #6
    //   4564: aaload
    //   4565: astore #7
    //   4567: aload #7
    //   4569: invokevirtual getModifiers : ()I
    //   4572: invokestatic isStatic : (I)Z
    //   4575: ifne -> 4585
    //   4578: goto -> 4688
    //   4581: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4584: athrow
    //   4585: aload #7
    //   4587: invokevirtual getType : ()Ljava/lang/Class;
    //   4590: astore #8
    //   4592: aload #8
    //   4594: ifnull -> 4675
    //   4597: aload #8
    //   4599: invokevirtual isPrimitive : ()Z
    //   4602: ifne -> 4675
    //   4605: goto -> 4612
    //   4608: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4611: athrow
    //   4612: aload #8
    //   4614: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4617: ifnull -> 4675
    //   4620: goto -> 4627
    //   4623: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4626: athrow
    //   4627: aload #8
    //   4629: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4632: invokevirtual getName : ()Ljava/lang/String;
    //   4635: ifnull -> 4675
    //   4638: goto -> 4645
    //   4641: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4644: athrow
    //   4645: aload #8
    //   4647: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4650: invokevirtual getName : ()Ljava/lang/String;
    //   4653: sipush #26189
    //   4656: sipush #27963
    //   4659: invokestatic a : (II)Ljava/lang/String;
    //   4662: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4665: ifne -> 4675
    //   4668: goto -> 4675
    //   4671: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4674: athrow
    //   4675: aload #7
    //   4677: iconst_1
    //   4678: invokevirtual setAccessible : (Z)V
    //   4681: aload #7
    //   4683: aconst_null
    //   4684: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4687: pop
    //   4688: iinc #6, 1
    //   4691: iload_2
    //   4692: ifeq -> 4553
    //   4695: sipush #26177
    //   4698: sipush #5303
    //   4701: invokestatic a : (II)Ljava/lang/String;
    //   4704: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4707: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4710: astore #4
    //   4712: aload #4
    //   4714: arraylength
    //   4715: istore #5
    //   4717: iconst_0
    //   4718: istore #6
    //   4720: iload #6
    //   4722: iload #5
    //   4724: if_icmpge -> 4860
    //   4727: aload #4
    //   4729: iload #6
    //   4731: aaload
    //   4732: astore #7
    //   4734: aload #7
    //   4736: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4739: pop
    //   4740: aload #7
    //   4742: invokevirtual getModifiers : ()I
    //   4745: invokestatic isStatic : (I)Z
    //   4748: ifeq -> 4846
    //   4751: aload #7
    //   4753: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4756: arraylength
    //   4757: iconst_2
    //   4758: if_icmpne -> 4846
    //   4761: goto -> 4768
    //   4764: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4767: athrow
    //   4768: aload #7
    //   4770: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4773: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4776: if_acmpne -> 4846
    //   4779: goto -> 4786
    //   4782: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4785: athrow
    //   4786: aload #7
    //   4788: iconst_1
    //   4789: invokevirtual setAccessible : (Z)V
    //   4792: aload #7
    //   4794: aconst_null
    //   4795: iconst_2
    //   4796: anewarray java/lang/Object
    //   4799: dup
    //   4800: iconst_0
    //   4801: aload_0
    //   4802: aastore
    //   4803: dup
    //   4804: iconst_1
    //   4805: aload_1
    //   4806: ifnonnull -> 4824
    //   4809: goto -> 4816
    //   4812: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4815: athrow
    //   4816: aload_1
    //   4817: goto -> 4831
    //   4820: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4823: athrow
    //   4824: aload_1
    //   4825: checkcast [B
    //   4828: invokevirtual clone : ()Ljava/lang/Object;
    //   4831: aastore
    //   4832: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4835: checkcast java/lang/Boolean
    //   4838: invokevirtual booleanValue : ()Z
    //   4841: istore_3
    //   4842: iload_2
    //   4843: ifeq -> 4860
    //   4846: iinc #6, 1
    //   4849: iload_2
    //   4850: ifeq -> 4720
    //   4853: goto -> 4860
    //   4856: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4859: athrow
    //   4860: iload_3
    //   4861: ireturn
    //   4862: astore_3
    //   4863: new java/lang/Exception
    //   4866: dup
    //   4867: aload_3
    //   4868: invokevirtual getMessage : ()Ljava/lang/String;
    //   4871: invokespecial <init> : (Ljava/lang/String;)V
    //   4874: athrow
    // Exception table:
    //   from	to	target	type
    //   4	2672	4862	java/lang/Throwable
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
    //   1076	1104	1107	java/lang/Throwable
    //   1086	1121	1124	java/lang/Throwable
    //   1111	1149	1152	java/lang/Throwable
    //   1128	1166	1169	java/lang/Throwable
    //   1156	1194	1197	java/lang/Throwable
    //   1173	1211	1214	java/lang/Throwable
    //   1201	1229	1232	java/lang/Throwable
    //   1218	1243	1246	java/lang/Throwable
    //   1346	1360	1360	java/lang/Throwable
    //   1371	1384	1387	java/lang/Throwable
    //   1376	1399	1402	java/lang/Throwable
    //   1391	1417	1420	java/lang/Throwable
    //   1406	1447	1450	java/lang/Throwable
    //   1510	1537	1540	java/lang/Throwable
    //   1527	1555	1558	java/lang/Throwable
    //   1544	1591	1594	java/lang/Throwable
    //   1562	1605	1608	java/lang/Throwable
    //   1654	1668	1668	java/lang/Throwable
    //   1679	1692	1695	java/lang/Throwable
    //   1684	1707	1710	java/lang/Throwable
    //   1699	1725	1728	java/lang/Throwable
    //   1714	1755	1758	java/lang/Throwable
    //   1818	1845	1848	java/lang/Throwable
    //   1835	1866	1869	java/lang/Throwable
    //   1852	1896	1899	java/lang/Throwable
    //   1873	1907	1907	java/lang/Throwable
    //   1918	1934	1937	java/lang/Throwable
    //   2033	2047	2047	java/lang/Throwable
    //   2058	2071	2074	java/lang/Throwable
    //   2063	2086	2089	java/lang/Throwable
    //   2078	2104	2107	java/lang/Throwable
    //   2093	2134	2137	java/lang/Throwable
    //   2200	2227	2230	java/lang/Throwable
    //   2217	2245	2248	java/lang/Throwable
    //   2234	2275	2278	java/lang/Throwable
    //   2252	2286	2286	java/lang/Throwable
    //   2308	2319	2322	java/lang/Throwable
    //   2374	2388	2388	java/lang/Throwable
    //   2399	2412	2415	java/lang/Throwable
    //   2404	2427	2430	java/lang/Throwable
    //   2419	2445	2448	java/lang/Throwable
    //   2434	2475	2478	java/lang/Throwable
    //   2541	2568	2571	java/lang/Throwable
    //   2558	2586	2589	java/lang/Throwable
    //   2575	2616	2619	java/lang/Throwable
    //   2593	2627	2627	java/lang/Throwable
    //   2649	2660	2663	java/lang/Throwable
    //   2673	3403	4862	java/lang/Throwable
    //   2763	2777	2777	java/lang/Throwable
    //   2788	2801	2804	java/lang/Throwable
    //   2793	2816	2819	java/lang/Throwable
    //   2808	2834	2837	java/lang/Throwable
    //   2823	2864	2867	java/lang/Throwable
    //   2930	2957	2960	java/lang/Throwable
    //   2947	2975	2978	java/lang/Throwable
    //   2964	3005	3008	java/lang/Throwable
    //   2982	3016	3016	java/lang/Throwable
    //   3038	3049	3052	java/lang/Throwable
    //   3105	3119	3119	java/lang/Throwable
    //   3130	3143	3146	java/lang/Throwable
    //   3135	3158	3161	java/lang/Throwable
    //   3150	3176	3179	java/lang/Throwable
    //   3165	3206	3209	java/lang/Throwable
    //   3272	3299	3302	java/lang/Throwable
    //   3289	3317	3320	java/lang/Throwable
    //   3306	3347	3350	java/lang/Throwable
    //   3324	3358	3358	java/lang/Throwable
    //   3380	3391	3394	java/lang/Throwable
    //   3404	4134	4862	java/lang/Throwable
    //   3494	3508	3508	java/lang/Throwable
    //   3519	3532	3535	java/lang/Throwable
    //   3524	3547	3550	java/lang/Throwable
    //   3539	3565	3568	java/lang/Throwable
    //   3554	3595	3598	java/lang/Throwable
    //   3661	3688	3691	java/lang/Throwable
    //   3678	3706	3709	java/lang/Throwable
    //   3695	3736	3739	java/lang/Throwable
    //   3713	3747	3747	java/lang/Throwable
    //   3769	3780	3783	java/lang/Throwable
    //   3836	3850	3850	java/lang/Throwable
    //   3861	3874	3877	java/lang/Throwable
    //   3866	3889	3892	java/lang/Throwable
    //   3881	3907	3910	java/lang/Throwable
    //   3896	3937	3940	java/lang/Throwable
    //   4003	4030	4033	java/lang/Throwable
    //   4020	4048	4051	java/lang/Throwable
    //   4037	4078	4081	java/lang/Throwable
    //   4055	4089	4089	java/lang/Throwable
    //   4111	4122	4125	java/lang/Throwable
    //   4135	4861	4862	java/lang/Throwable
    //   4225	4239	4239	java/lang/Throwable
    //   4250	4263	4266	java/lang/Throwable
    //   4255	4278	4281	java/lang/Throwable
    //   4270	4296	4299	java/lang/Throwable
    //   4285	4326	4329	java/lang/Throwable
    //   4392	4419	4422	java/lang/Throwable
    //   4409	4437	4440	java/lang/Throwable
    //   4426	4467	4470	java/lang/Throwable
    //   4444	4478	4478	java/lang/Throwable
    //   4500	4511	4514	java/lang/Throwable
    //   4567	4581	4581	java/lang/Throwable
    //   4592	4605	4608	java/lang/Throwable
    //   4597	4620	4623	java/lang/Throwable
    //   4612	4638	4641	java/lang/Throwable
    //   4627	4668	4671	java/lang/Throwable
    //   4734	4761	4764	java/lang/Throwable
    //   4751	4779	4782	java/lang/Throwable
    //   4768	4809	4812	java/lang/Throwable
    //   4786	4820	4820	java/lang/Throwable
    //   4842	4853	4856	java/lang/Throwable
  }
  
  static void Zu(Object paramObject) {
    Zecm.Zv = a(26185, 22163);
    Zecm.ZJ = new BigInteger(a(26186, 32531));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zm5s.Z_.charAt(Math.abs(((BigInteger)Zecm.ZJ).intValue() % 32)) > Zmfw.ZV.charAt(Math.abs(((BigInteger)Zefn.ZJ).intValue() % 32))) {
          try {
            Ztpg.Zx(Class.forName(a(26178, 19246)));
            if (bool)
              Zgs6.Zt(Class.forName(a(26180, -5470))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zgs6.Zt(Class.forName(a(26180, -5470)));
    } catch (Throwable throwable) {}
  }
  
  static void Zf(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #27
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¢d+×aMcR/'5}OÓäùäEç2)z32¥¸gQÒk§¶©ã#]çWBËs ·áv©~ ¶Ôg;iácX#rÉË`È_\\tµóÉ}]ZC¤>\\tvh±R4¢2K\\tÆÛ÷>Ð\\bJÉ6:¢²­¥\\tÆ;§dyê[ ¬è¸lGx»ªèë»Hù#ï®ðá49¼~¸êd]² xGK°\\bêýâ S~$#6R®¹gK>è¼nA\\t\\rÈÞ¿¶ 7ì\\t·m®U C°Më02¤á²NNH_Åy*5!¬5aø/ÿ\\tèòèCd|ÕõÍ.ÈÎ7j°%¯D´L]nd{ó·Yqñ[Ükâ,v6$GÙßê"Ë;z\\t/Ô7Æ<Ü\\tù@`lùdü\\tu@Ñ^=one­¯\\tÑ\\bEÌµqYx\\tâ×©\\f^\\tEÈ×¶1)~\\t$û0ów\\tÁQG)Ðg¯'\\tyPàné/Â½\\t02yEK]O-\\tWºTÖ2QK'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #107
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
    //   68: ldc 'lÿVUI)\\t¬Óï¤`='
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #34
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
    //   129: putstatic burp/Zlvx.a : [Ljava/lang/String;
    //   132: bipush #27
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zlvx.b : [Ljava/lang/String;
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
    //   212: bipush #123
    //   214: goto -> 244
    //   217: bipush #87
    //   219: goto -> 244
    //   222: bipush #74
    //   224: goto -> 244
    //   227: bipush #68
    //   229: goto -> 244
    //   232: bipush #57
    //   234: goto -> 244
    //   237: bipush #95
    //   239: goto -> 244
    //   242: bipush #80
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
    //   304: sipush #26176
    //   307: sipush #489
    //   310: invokestatic a : (II)Ljava/lang/String;
    //   313: invokespecial <init> : (Ljava/lang/String;)V
    //   316: putstatic burp/Zlvx.ZM : Ljava/lang/Object;
    //   319: sipush #26182
    //   322: sipush #-20605
    //   325: invokestatic a : (II)Ljava/lang/String;
    //   328: putstatic burp/Zlvx.Zr : Ljava/lang/String;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x6641) & 0xFFFF;
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
      byte b1 = 10;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlvx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */