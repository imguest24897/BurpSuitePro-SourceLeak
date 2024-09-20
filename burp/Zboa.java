package burp;

import java.math.BigInteger;

class Zboa extends ClassLoader {
  static String Zq;
  
  static Object Zh;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZQ(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void Zc(Object paramObject) {
    Zbu.ZV = a(-8435, 3386);
    Zbu.ZW = new BigInteger(a(-8437, 10513));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Ztfr.Zo.charAt(Math.abs(((BigInteger)Zeoi.ZE).intValue() % 32)) <= Zz16.ZA.charAt(Math.abs(((BigInteger)Zmpc.Zc).intValue() % 32))) {
          try {
            Zeqr.Zn(Class.forName(a(-8439, 22475)));
            if (bool)
              Zest.ZE(Class.forName(a(-8438, 8550))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zest.ZE(Class.forName(a(-8438, 8550)));
    } catch (Throwable throwable) {}
  }
  
  static boolean ZX(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zgde.ZG : Ljava/lang/Object;
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
    //   868: putstatic burp/Zb9m.ZK : Ljava/lang/Object;
    //   871: getstatic burp/Zmpc.Zc : Ljava/lang/Object;
    //   874: checkcast java/math/BigInteger
    //   877: invokevirtual toByteArray : ()[B
    //   880: astore_3
    //   881: aload_3
    //   882: arraylength
    //   883: bipush #8
    //   885: iadd
    //   886: bipush #6
    //   888: ishr
    //   889: iconst_1
    //   890: iadd
    //   891: bipush #16
    //   893: imul
    //   894: newarray int
    //   896: astore #5
    //   898: iconst_0
    //   899: istore #6
    //   901: iload #6
    //   903: aload_3
    //   904: arraylength
    //   905: if_icmpge -> 948
    //   908: aload_3
    //   909: iload #6
    //   911: baload
    //   912: sipush #255
    //   915: iand
    //   916: istore #7
    //   918: aload #5
    //   920: iload #6
    //   922: iconst_2
    //   923: ishr
    //   924: dup2
    //   925: iaload
    //   926: iload #7
    //   928: bipush #24
    //   930: iload #6
    //   932: iconst_4
    //   933: irem
    //   934: bipush #8
    //   936: imul
    //   937: isub
    //   938: ishl
    //   939: ior
    //   940: iastore
    //   941: iinc #6, 1
    //   944: iload_2
    //   945: ifeq -> 901
    //   948: aload #5
    //   950: iload #6
    //   952: iconst_2
    //   953: ishr
    //   954: dup2
    //   955: iaload
    //   956: sipush #128
    //   959: bipush #24
    //   961: iload #6
    //   963: iconst_4
    //   964: irem
    //   965: bipush #8
    //   967: imul
    //   968: isub
    //   969: ishl
    //   970: ior
    //   971: iastore
    //   972: aload #5
    //   974: aload #5
    //   976: arraylength
    //   977: iconst_1
    //   978: isub
    //   979: aload_3
    //   980: arraylength
    //   981: bipush #8
    //   983: imul
    //   984: iastore
    //   985: bipush #80
    //   987: newarray int
    //   989: astore #7
    //   991: ldc 1732584193
    //   993: istore #8
    //   995: ldc -271733879
    //   997: istore #9
    //   999: ldc -1732584194
    //   1001: istore #10
    //   1003: ldc 271733878
    //   1005: istore #11
    //   1007: ldc -1009589776
    //   1009: istore #12
    //   1011: iconst_0
    //   1012: istore #6
    //   1014: iload #6
    //   1016: aload #5
    //   1018: arraylength
    //   1019: if_icmpge -> 1341
    //   1022: iload #8
    //   1024: istore #13
    //   1026: iload #9
    //   1028: istore #14
    //   1030: iload #10
    //   1032: istore #15
    //   1034: iload #11
    //   1036: istore #16
    //   1038: iload #12
    //   1040: istore #17
    //   1042: iconst_0
    //   1043: istore #18
    //   1045: iload #18
    //   1047: bipush #80
    //   1049: if_icmpge -> 1299
    //   1052: iload #18
    //   1054: bipush #16
    //   1056: if_icmpge -> 1083
    //   1059: aload #7
    //   1061: iload #18
    //   1063: aload #5
    //   1065: iload #6
    //   1067: iload #18
    //   1069: iadd
    //   1070: iaload
    //   1071: iastore
    //   1072: iload_2
    //   1073: ifeq -> 1138
    //   1076: goto -> 1083
    //   1079: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1082: athrow
    //   1083: aload #7
    //   1085: iload #18
    //   1087: iconst_3
    //   1088: isub
    //   1089: iaload
    //   1090: aload #7
    //   1092: iload #18
    //   1094: bipush #8
    //   1096: isub
    //   1097: iaload
    //   1098: ixor
    //   1099: aload #7
    //   1101: iload #18
    //   1103: bipush #14
    //   1105: isub
    //   1106: iaload
    //   1107: ixor
    //   1108: aload #7
    //   1110: iload #18
    //   1112: bipush #16
    //   1114: isub
    //   1115: iaload
    //   1116: ixor
    //   1117: istore #19
    //   1119: iload #19
    //   1121: iconst_1
    //   1122: ishl
    //   1123: iload #19
    //   1125: bipush #31
    //   1127: iushr
    //   1128: ior
    //   1129: istore #20
    //   1131: aload #7
    //   1133: iload #18
    //   1135: iload #20
    //   1137: iastore
    //   1138: iload #8
    //   1140: iconst_5
    //   1141: ishl
    //   1142: iload #8
    //   1144: bipush #27
    //   1146: iushr
    //   1147: ior
    //   1148: istore #19
    //   1150: iload #19
    //   1152: iload #12
    //   1154: iadd
    //   1155: aload #7
    //   1157: iload #18
    //   1159: iaload
    //   1160: iadd
    //   1161: iload #18
    //   1163: bipush #20
    //   1165: if_icmpge -> 1191
    //   1168: ldc 1518500249
    //   1170: iload #9
    //   1172: iload #10
    //   1174: iand
    //   1175: iload #9
    //   1177: iconst_m1
    //   1178: ixor
    //   1179: iload #11
    //   1181: iand
    //   1182: ior
    //   1183: iadd
    //   1184: goto -> 1261
    //   1187: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1190: athrow
    //   1191: iload #18
    //   1193: bipush #40
    //   1195: if_icmpge -> 1216
    //   1198: ldc 1859775393
    //   1200: iload #9
    //   1202: iload #10
    //   1204: ixor
    //   1205: iload #11
    //   1207: ixor
    //   1208: iadd
    //   1209: goto -> 1261
    //   1212: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1215: athrow
    //   1216: iload #18
    //   1218: bipush #60
    //   1220: if_icmpge -> 1250
    //   1223: ldc -1894007588
    //   1225: iload #9
    //   1227: iload #10
    //   1229: iand
    //   1230: iload #9
    //   1232: iload #11
    //   1234: iand
    //   1235: ior
    //   1236: iload #10
    //   1238: iload #11
    //   1240: iand
    //   1241: ior
    //   1242: iadd
    //   1243: goto -> 1261
    //   1246: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1249: athrow
    //   1250: ldc -899497514
    //   1252: iload #9
    //   1254: iload #10
    //   1256: ixor
    //   1257: iload #11
    //   1259: ixor
    //   1260: iadd
    //   1261: iadd
    //   1262: istore #20
    //   1264: iload #11
    //   1266: istore #12
    //   1268: iload #10
    //   1270: istore #11
    //   1272: iload #9
    //   1274: bipush #30
    //   1276: ishl
    //   1277: iload #9
    //   1279: iconst_2
    //   1280: iushr
    //   1281: ior
    //   1282: istore #10
    //   1284: iload #8
    //   1286: istore #9
    //   1288: iload #20
    //   1290: istore #8
    //   1292: iinc #18, 1
    //   1295: iload_2
    //   1296: ifeq -> 1045
    //   1299: iload #8
    //   1301: iload #13
    //   1303: iadd
    //   1304: istore #8
    //   1306: iload #9
    //   1308: iload #14
    //   1310: iadd
    //   1311: istore #9
    //   1313: iload #10
    //   1315: iload #15
    //   1317: iadd
    //   1318: istore #10
    //   1320: iload #11
    //   1322: iload #16
    //   1324: iadd
    //   1325: istore #11
    //   1327: iload #12
    //   1329: iload #17
    //   1331: iadd
    //   1332: istore #12
    //   1334: iinc #6, 16
    //   1337: iload_2
    //   1338: ifeq -> 1014
    //   1341: iconst_5
    //   1342: newarray int
    //   1344: dup
    //   1345: iconst_0
    //   1346: iload #8
    //   1348: iastore
    //   1349: dup
    //   1350: iconst_1
    //   1351: iload #9
    //   1353: iastore
    //   1354: dup
    //   1355: iconst_2
    //   1356: iload #10
    //   1358: iastore
    //   1359: dup
    //   1360: iconst_3
    //   1361: iload #11
    //   1363: iastore
    //   1364: dup
    //   1365: iconst_4
    //   1366: iload #12
    //   1368: iastore
    //   1369: astore #13
    //   1371: bipush #20
    //   1373: newarray byte
    //   1375: astore #14
    //   1377: iconst_0
    //   1378: istore #15
    //   1380: iload #15
    //   1382: bipush #20
    //   1384: if_icmpge -> 1425
    //   1387: aload #13
    //   1389: iload #15
    //   1391: iconst_4
    //   1392: idiv
    //   1393: iaload
    //   1394: istore #16
    //   1396: iconst_3
    //   1397: iload #15
    //   1399: iconst_4
    //   1400: irem
    //   1401: isub
    //   1402: bipush #8
    //   1404: imul
    //   1405: istore #17
    //   1407: aload #14
    //   1409: iload #15
    //   1411: iload #16
    //   1413: iload #17
    //   1415: iushr
    //   1416: i2b
    //   1417: bastore
    //   1418: iinc #15, 1
    //   1421: iload_2
    //   1422: ifeq -> 1380
    //   1425: aload #14
    //   1427: astore #4
    //   1429: sipush #-8440
    //   1432: new java/math/BigInteger
    //   1435: dup
    //   1436: aload #4
    //   1438: invokespecial <init> : ([B)V
    //   1441: invokevirtual abs : ()Ljava/math/BigInteger;
    //   1444: putstatic burp/Ze40.ZO : Ljava/lang/Object;
    //   1447: sipush #6321
    //   1450: getstatic burp/Zmy3.Zx : Ljava/lang/Object;
    //   1453: checkcast java/math/BigInteger
    //   1456: getstatic burp/Zgco.Zx : Ljava/lang/Object;
    //   1459: checkcast java/math/BigInteger
    //   1462: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   1465: putstatic burp/Zrw7.ZV : Ljava/lang/Object;
    //   1468: invokestatic a : (II)Ljava/lang/String;
    //   1471: iconst_1
    //   1472: ldc burp/Zxyq
    //   1474: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1477: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1480: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1483: astore_3
    //   1484: aload_3
    //   1485: arraylength
    //   1486: istore #4
    //   1488: iconst_0
    //   1489: istore #5
    //   1491: iload #5
    //   1493: iload #4
    //   1495: if_icmpge -> 1632
    //   1498: aload_3
    //   1499: iload #5
    //   1501: aaload
    //   1502: astore #6
    //   1504: aload #6
    //   1506: invokevirtual getModifiers : ()I
    //   1509: invokestatic isStatic : (I)Z
    //   1512: ifne -> 1522
    //   1515: goto -> 1625
    //   1518: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1521: athrow
    //   1522: aload #6
    //   1524: invokevirtual getType : ()Ljava/lang/Class;
    //   1527: astore #7
    //   1529: aload #7
    //   1531: ifnull -> 1612
    //   1534: aload #7
    //   1536: invokevirtual isPrimitive : ()Z
    //   1539: ifne -> 1612
    //   1542: goto -> 1549
    //   1545: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1548: athrow
    //   1549: aload #7
    //   1551: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1554: ifnull -> 1612
    //   1557: goto -> 1564
    //   1560: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1563: athrow
    //   1564: aload #7
    //   1566: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1569: invokevirtual getName : ()Ljava/lang/String;
    //   1572: ifnull -> 1612
    //   1575: goto -> 1582
    //   1578: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1581: athrow
    //   1582: aload #7
    //   1584: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1587: invokevirtual getName : ()Ljava/lang/String;
    //   1590: sipush #-8434
    //   1593: sipush #18764
    //   1596: invokestatic a : (II)Ljava/lang/String;
    //   1599: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1602: ifne -> 1612
    //   1605: goto -> 1612
    //   1608: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1611: athrow
    //   1612: aload #6
    //   1614: iconst_1
    //   1615: invokevirtual setAccessible : (Z)V
    //   1618: aload #6
    //   1620: aconst_null
    //   1621: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1624: pop
    //   1625: iinc #5, 1
    //   1628: iload_2
    //   1629: ifeq -> 1491
    //   1632: sipush #-8433
    //   1635: sipush #-1595
    //   1638: invokestatic a : (II)Ljava/lang/String;
    //   1641: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1644: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1647: astore_3
    //   1648: aload_3
    //   1649: arraylength
    //   1650: istore #4
    //   1652: iconst_0
    //   1653: istore #5
    //   1655: iload #5
    //   1657: iload #4
    //   1659: if_icmpge -> 1791
    //   1662: aload_3
    //   1663: iload #5
    //   1665: aaload
    //   1666: astore #6
    //   1668: aload #6
    //   1670: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1673: pop
    //   1674: aload #6
    //   1676: invokevirtual getModifiers : ()I
    //   1679: invokestatic isStatic : (I)Z
    //   1682: ifeq -> 1777
    //   1685: aload #6
    //   1687: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1690: arraylength
    //   1691: iconst_2
    //   1692: if_icmpne -> 1777
    //   1695: goto -> 1702
    //   1698: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1701: athrow
    //   1702: aload #6
    //   1704: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1707: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1710: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1713: ifeq -> 1777
    //   1716: goto -> 1723
    //   1719: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1722: athrow
    //   1723: aload #6
    //   1725: iconst_1
    //   1726: invokevirtual setAccessible : (Z)V
    //   1729: aload #6
    //   1731: aconst_null
    //   1732: iconst_2
    //   1733: anewarray java/lang/Object
    //   1736: dup
    //   1737: iconst_0
    //   1738: aload_0
    //   1739: aastore
    //   1740: dup
    //   1741: iconst_1
    //   1742: aload_1
    //   1743: ifnonnull -> 1761
    //   1746: goto -> 1753
    //   1749: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1752: athrow
    //   1753: aload_1
    //   1754: goto -> 1768
    //   1757: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1760: athrow
    //   1761: aload_1
    //   1762: checkcast [B
    //   1765: invokevirtual clone : ()Ljava/lang/Object;
    //   1768: aastore
    //   1769: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1772: pop
    //   1773: iload_2
    //   1774: ifeq -> 1791
    //   1777: iinc #5, 1
    //   1780: iload_2
    //   1781: ifeq -> 1655
    //   1784: goto -> 1791
    //   1787: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1790: athrow
    //   1791: getstatic burp/Zry9.ZW : Ljava/lang/String;
    //   1794: getstatic burp/Zvi.Zs : Ljava/lang/Object;
    //   1797: checkcast java/math/BigInteger
    //   1800: invokevirtual intValue : ()I
    //   1803: bipush #32
    //   1805: irem
    //   1806: invokestatic abs : (I)I
    //   1809: invokevirtual charAt : (I)C
    //   1812: getstatic burp/Zl4v.ZD : Ljava/lang/String;
    //   1815: getstatic burp/Zmd.ZU : Ljava/lang/Object;
    //   1818: checkcast java/math/BigInteger
    //   1821: invokevirtual intValue : ()I
    //   1824: bipush #32
    //   1826: irem
    //   1827: invokestatic abs : (I)I
    //   1830: invokevirtual charAt : (I)C
    //   1833: if_icmpgt -> 1940
    //   1836: getstatic burp/Zm81.ZY : Ljava/lang/String;
    //   1839: getstatic burp/Zx_u.Zy : Ljava/lang/Object;
    //   1842: checkcast java/math/BigInteger
    //   1845: invokevirtual intValue : ()I
    //   1848: bipush #32
    //   1850: irem
    //   1851: invokestatic abs : (I)I
    //   1854: invokevirtual charAt : (I)C
    //   1857: getstatic burp/Zboa.Zq : Ljava/lang/String;
    //   1860: getstatic burp/Zg2z.ZU : Ljava/lang/Object;
    //   1863: checkcast java/math/BigInteger
    //   1866: invokevirtual intValue : ()I
    //   1869: bipush #32
    //   1871: irem
    //   1872: invokestatic abs : (I)I
    //   1875: invokevirtual charAt : (I)C
    //   1878: if_icmpgt -> 1940
    //   1881: goto -> 1888
    //   1884: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1887: athrow
    //   1888: getstatic burp/Zl1q.ZY : Ljava/lang/String;
    //   1891: getstatic burp/Zvi.Zs : Ljava/lang/Object;
    //   1894: checkcast java/math/BigInteger
    //   1897: invokevirtual intValue : ()I
    //   1900: bipush #32
    //   1902: irem
    //   1903: invokestatic abs : (I)I
    //   1906: invokevirtual charAt : (I)C
    //   1909: getstatic burp/Zb9m.Zc : Ljava/lang/String;
    //   1912: getstatic burp/Zelz.Z_ : Ljava/lang/Object;
    //   1915: checkcast java/math/BigInteger
    //   1918: invokevirtual intValue : ()I
    //   1921: bipush #32
    //   1923: irem
    //   1924: invokestatic abs : (I)I
    //   1927: invokevirtual charAt : (I)C
    //   1930: if_icmpgt -> 1948
    //   1933: goto -> 1940
    //   1936: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1939: athrow
    //   1940: iconst_1
    //   1941: goto -> 1949
    //   1944: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1947: athrow
    //   1948: iconst_0
    //   1949: ireturn
    //   1950: astore_3
    //   1951: new java/lang/Exception
    //   1954: dup
    //   1955: aload_3
    //   1956: invokevirtual getMessage : ()Ljava/lang/String;
    //   1959: invokespecial <init> : (Ljava/lang/String;)V
    //   1962: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1949	1950	java/lang/Throwable
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
    //   1052	1076	1079	java/lang/Throwable
    //   1150	1187	1187	java/lang/Throwable
    //   1191	1212	1212	java/lang/Throwable
    //   1216	1246	1246	java/lang/Throwable
    //   1504	1518	1518	java/lang/Throwable
    //   1529	1542	1545	java/lang/Throwable
    //   1534	1557	1560	java/lang/Throwable
    //   1549	1575	1578	java/lang/Throwable
    //   1564	1605	1608	java/lang/Throwable
    //   1668	1695	1698	java/lang/Throwable
    //   1685	1716	1719	java/lang/Throwable
    //   1702	1746	1749	java/lang/Throwable
    //   1723	1757	1757	java/lang/Throwable
    //   1768	1784	1787	java/lang/Throwable
    //   1791	1881	1884	java/lang/Throwable
    //   1836	1933	1936	java/lang/Throwable
    //   1888	1944	1944	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '\\nÚ4Ïþ¤aÏ-5?zÕÜ/á¤·ÑèÕx Syg(y ;h9øOò£ Xý¨Ì\\f\\tD5¥´æ«\\t,"<§äÆH°\\tÐ£ ê§ç\\tÿLFjV]/®>'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #32
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #114
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
    //   68: ldc 'O.ãâýáyâY´²£®eºï©Æ/cÊÍD^÷±s¼N@È-ö_ëýsZón8ÙLßÛû\\nynÉkÇ%Ø$jeòñ*»1\\t ?ãJ¬!ýQ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #77
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #89
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
    //   129: putstatic burp/Zboa.a : [Ljava/lang/String;
    //   132: bipush #8
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zboa.b : [Ljava/lang/String;
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
    //   212: bipush #46
    //   214: goto -> 244
    //   217: bipush #99
    //   219: goto -> 244
    //   222: bipush #28
    //   224: goto -> 244
    //   227: bipush #24
    //   229: goto -> 244
    //   232: bipush #51
    //   234: goto -> 244
    //   237: bipush #11
    //   239: goto -> 244
    //   242: bipush #49
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
    //   300: sipush #-8436
    //   303: sipush #22376
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zboa.Zq : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: iconst_1
    //   317: bipush #32
    //   319: newarray byte
    //   321: dup
    //   322: iconst_0
    //   323: bipush #109
    //   325: bastore
    //   326: dup
    //   327: iconst_1
    //   328: bipush #61
    //   330: bastore
    //   331: dup
    //   332: iconst_2
    //   333: bipush #81
    //   335: bastore
    //   336: dup
    //   337: iconst_3
    //   338: bipush #-25
    //   340: bastore
    //   341: dup
    //   342: iconst_4
    //   343: bipush #-4
    //   345: bastore
    //   346: dup
    //   347: iconst_5
    //   348: bipush #107
    //   350: bastore
    //   351: dup
    //   352: bipush #6
    //   354: bipush #-45
    //   356: bastore
    //   357: dup
    //   358: bipush #7
    //   360: bipush #-109
    //   362: bastore
    //   363: dup
    //   364: bipush #8
    //   366: bipush #17
    //   368: bastore
    //   369: dup
    //   370: bipush #9
    //   372: bipush #-103
    //   374: bastore
    //   375: dup
    //   376: bipush #10
    //   378: bipush #-101
    //   380: bastore
    //   381: dup
    //   382: bipush #11
    //   384: bipush #124
    //   386: bastore
    //   387: dup
    //   388: bipush #12
    //   390: bipush #29
    //   392: bastore
    //   393: dup
    //   394: bipush #13
    //   396: bipush #43
    //   398: bastore
    //   399: dup
    //   400: bipush #14
    //   402: bipush #-51
    //   404: bastore
    //   405: dup
    //   406: bipush #15
    //   408: bipush #-44
    //   410: bastore
    //   411: dup
    //   412: bipush #16
    //   414: bipush #121
    //   416: bastore
    //   417: dup
    //   418: bipush #17
    //   420: bipush #86
    //   422: bastore
    //   423: dup
    //   424: bipush #18
    //   426: bipush #-64
    //   428: bastore
    //   429: dup
    //   430: bipush #19
    //   432: bipush #54
    //   434: bastore
    //   435: dup
    //   436: bipush #20
    //   438: bipush #21
    //   440: bastore
    //   441: dup
    //   442: bipush #21
    //   444: bipush #97
    //   446: bastore
    //   447: dup
    //   448: bipush #22
    //   450: bipush #64
    //   452: bastore
    //   453: dup
    //   454: bipush #23
    //   456: bipush #-45
    //   458: bastore
    //   459: dup
    //   460: bipush #24
    //   462: bipush #-74
    //   464: bastore
    //   465: dup
    //   466: bipush #25
    //   468: bipush #106
    //   470: bastore
    //   471: dup
    //   472: bipush #26
    //   474: bipush #-69
    //   476: bastore
    //   477: dup
    //   478: bipush #27
    //   480: bipush #-108
    //   482: bastore
    //   483: dup
    //   484: bipush #28
    //   486: bipush #-16
    //   488: bastore
    //   489: dup
    //   490: bipush #29
    //   492: bipush #-88
    //   494: bastore
    //   495: dup
    //   496: bipush #30
    //   498: bipush #-96
    //   500: bastore
    //   501: dup
    //   502: bipush #31
    //   504: bipush #-57
    //   506: bastore
    //   507: invokespecial <init> : (I[B)V
    //   510: putstatic burp/Zboa.Zh : Ljava/lang/Object;
    //   513: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFDF0D) & 0xFFFF;
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
      byte b1 = 39;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zboa.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */