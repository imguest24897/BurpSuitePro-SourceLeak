package burp;

import java.math.BigInteger;

class Ztys extends ClassLoader {
  static Object Zs;
  
  static String Zn;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZG(Object paramObject) {
    Zsf3.Zb = a(14037, 22455);
    Zsf3.ZH = new BigInteger(a(14039, -30926));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zb20.ZL.charAt(Math.abs(((BigInteger)Zmpp.Z_).intValue() % 32)) > Zlnq.ZQ.charAt(Math.abs(((BigInteger)Zx4y.Zc).intValue() % 32))) {
          try {
            Zkco.Zq(Class.forName(a(14033, -26391)));
            if (!bool)
              Zsq6.Zy(Class.forName(a(14040, 10274))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zsq6.Zy(Class.forName(a(14040, 10274)));
    } catch (Throwable throwable) {}
  }
  
  static void ZV(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean Zb(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zss6.ZG : Ljava/lang/Object;
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
    //   868: putstatic burp/Zz3w.ZX : Ljava/lang/Object;
    //   871: getstatic burp/Zeor.Zb : Ljava/lang/Object;
    //   874: checkcast java/math/BigInteger
    //   877: invokevirtual toByteArray : ()[B
    //   880: astore_3
    //   881: bipush #32
    //   883: newarray int
    //   885: dup
    //   886: iconst_0
    //   887: ldc 943331329
    //   889: iastore
    //   890: dup
    //   891: iconst_1
    //   892: ldc 170788368
    //   894: iastore
    //   895: dup
    //   896: iconst_2
    //   897: ldc 1008414755
    //   899: iastore
    //   900: dup
    //   901: iconst_3
    //   902: ldc 187049985
    //   904: iastore
    //   905: dup
    //   906: iconst_4
    //   907: ldc 1010368540
    //   909: iastore
    //   910: dup
    //   911: iconst_5
    //   912: ldc 220604441
    //   914: iastore
    //   915: dup
    //   916: bipush #6
    //   918: ldc 940377620
    //   920: iastore
    //   921: dup
    //   922: bipush #7
    //   924: ldc 255209728
    //   926: iastore
    //   927: dup
    //   928: bipush #8
    //   930: ldc 689771012
    //   932: iastore
    //   933: dup
    //   934: bipush #9
    //   936: ldc 221709344
    //   938: iastore
    //   939: dup
    //   940: bipush #10
    //   942: ldc 957157408
    //   944: iastore
    //   945: dup
    //   946: bipush #11
    //   948: ldc 892536332
    //   950: iastore
    //   951: dup
    //   952: bipush #12
    //   954: ldc 722417666
    //   956: iastore
    //   957: dup
    //   958: bipush #13
    //   960: ldc 1026621720
    //   962: iastore
    //   963: dup
    //   964: bipush #14
    //   966: ldc 655302664
    //   968: iastore
    //   969: dup
    //   970: bipush #15
    //   972: ldc 890966315
    //   974: iastore
    //   975: dup
    //   976: bipush #16
    //   978: ldc 187632156
    //   980: iastore
    //   981: dup
    //   982: bipush #17
    //   984: ldc 874189824
    //   986: iastore
    //   987: dup
    //   988: bipush #18
    //   990: ldc 254150144
    //   992: iastore
    //   993: dup
    //   994: bipush #19
    //   996: ldc 924386310
    //   998: iastore
    //   999: dup
    //   1000: bipush #20
    //   1002: ldc 121057538
    //   1004: iastore
    //   1005: dup
    //   1006: bipush #21
    //   1008: ldc 840500228
    //   1010: iastore
    //   1011: dup
    //   1012: bipush #22
    //   1014: ldc 389160971
    //   1016: iastore
    //   1017: dup
    //   1018: bipush #23
    //   1020: ldc 907870729
    //   1022: iastore
    //   1023: dup
    //   1024: bipush #24
    //   1026: ldc 389426184
    //   1028: iastore
    //   1029: dup
    //   1030: bipush #25
    //   1032: ldc 973875457
    //   1034: iastore
    //   1035: dup
    //   1036: bipush #26
    //   1038: ldc 372376604
    //   1040: iastore
    //   1041: dup
    //   1042: bipush #27
    //   1044: ldc 707731490
    //   1046: iastore
    //   1047: dup
    //   1048: bipush #28
    //   1050: ldc 1043334948
    //   1052: iastore
    //   1053: dup
    //   1054: bipush #29
    //   1056: ldc 439222784
    //   1058: iastore
    //   1059: dup
    //   1060: bipush #30
    //   1062: ldc 876216579
    //   1064: iastore
    //   1065: dup
    //   1066: bipush #31
    //   1068: ldc 455999525
    //   1070: iastore
    //   1071: astore #5
    //   1073: bipush #8
    //   1075: aload_3
    //   1076: arraylength
    //   1077: bipush #8
    //   1079: irem
    //   1080: isub
    //   1081: istore #6
    //   1083: aload_3
    //   1084: arraylength
    //   1085: iload #6
    //   1087: iadd
    //   1088: newarray byte
    //   1090: astore #7
    //   1092: iconst_0
    //   1093: istore #8
    //   1095: iload #8
    //   1097: aload_3
    //   1098: arraylength
    //   1099: if_icmpge -> 1118
    //   1102: aload #7
    //   1104: iload #8
    //   1106: aload_3
    //   1107: iload #8
    //   1109: baload
    //   1110: bastore
    //   1111: iinc #8, 1
    //   1114: iload_2
    //   1115: ifne -> 1095
    //   1118: aload_3
    //   1119: arraylength
    //   1120: istore #8
    //   1122: iload #8
    //   1124: aload #7
    //   1126: arraylength
    //   1127: if_icmpge -> 1145
    //   1130: aload #7
    //   1132: iload #8
    //   1134: iload #6
    //   1136: i2b
    //   1137: bastore
    //   1138: iinc #8, 1
    //   1141: iload_2
    //   1142: ifne -> 1122
    //   1145: aload #7
    //   1147: astore_3
    //   1148: bipush #64
    //   1150: newarray int
    //   1152: dup
    //   1153: iconst_0
    //   1154: ldc 16843776
    //   1156: iastore
    //   1157: dup
    //   1158: iconst_1
    //   1159: iconst_0
    //   1160: iastore
    //   1161: dup
    //   1162: iconst_2
    //   1163: ldc 65536
    //   1165: iastore
    //   1166: dup
    //   1167: iconst_3
    //   1168: ldc 16843780
    //   1170: iastore
    //   1171: dup
    //   1172: iconst_4
    //   1173: ldc 16842756
    //   1175: iastore
    //   1176: dup
    //   1177: iconst_5
    //   1178: ldc 66564
    //   1180: iastore
    //   1181: dup
    //   1182: bipush #6
    //   1184: iconst_4
    //   1185: iastore
    //   1186: dup
    //   1187: bipush #7
    //   1189: ldc 65536
    //   1191: iastore
    //   1192: dup
    //   1193: bipush #8
    //   1195: sipush #1024
    //   1198: iastore
    //   1199: dup
    //   1200: bipush #9
    //   1202: ldc 16843776
    //   1204: iastore
    //   1205: dup
    //   1206: bipush #10
    //   1208: ldc 16843780
    //   1210: iastore
    //   1211: dup
    //   1212: bipush #11
    //   1214: sipush #1024
    //   1217: iastore
    //   1218: dup
    //   1219: bipush #12
    //   1221: ldc 16778244
    //   1223: iastore
    //   1224: dup
    //   1225: bipush #13
    //   1227: ldc 16842756
    //   1229: iastore
    //   1230: dup
    //   1231: bipush #14
    //   1233: ldc 16777216
    //   1235: iastore
    //   1236: dup
    //   1237: bipush #15
    //   1239: iconst_4
    //   1240: iastore
    //   1241: dup
    //   1242: bipush #16
    //   1244: sipush #1028
    //   1247: iastore
    //   1248: dup
    //   1249: bipush #17
    //   1251: ldc 16778240
    //   1253: iastore
    //   1254: dup
    //   1255: bipush #18
    //   1257: ldc 16778240
    //   1259: iastore
    //   1260: dup
    //   1261: bipush #19
    //   1263: ldc 66560
    //   1265: iastore
    //   1266: dup
    //   1267: bipush #20
    //   1269: ldc 66560
    //   1271: iastore
    //   1272: dup
    //   1273: bipush #21
    //   1275: ldc 16842752
    //   1277: iastore
    //   1278: dup
    //   1279: bipush #22
    //   1281: ldc 16842752
    //   1283: iastore
    //   1284: dup
    //   1285: bipush #23
    //   1287: ldc 16778244
    //   1289: iastore
    //   1290: dup
    //   1291: bipush #24
    //   1293: ldc 65540
    //   1295: iastore
    //   1296: dup
    //   1297: bipush #25
    //   1299: ldc 16777220
    //   1301: iastore
    //   1302: dup
    //   1303: bipush #26
    //   1305: ldc 16777220
    //   1307: iastore
    //   1308: dup
    //   1309: bipush #27
    //   1311: ldc 65540
    //   1313: iastore
    //   1314: dup
    //   1315: bipush #28
    //   1317: iconst_0
    //   1318: iastore
    //   1319: dup
    //   1320: bipush #29
    //   1322: sipush #1028
    //   1325: iastore
    //   1326: dup
    //   1327: bipush #30
    //   1329: ldc 66564
    //   1331: iastore
    //   1332: dup
    //   1333: bipush #31
    //   1335: ldc 16777216
    //   1337: iastore
    //   1338: dup
    //   1339: bipush #32
    //   1341: ldc 65536
    //   1343: iastore
    //   1344: dup
    //   1345: bipush #33
    //   1347: ldc 16843780
    //   1349: iastore
    //   1350: dup
    //   1351: bipush #34
    //   1353: iconst_4
    //   1354: iastore
    //   1355: dup
    //   1356: bipush #35
    //   1358: ldc 16842752
    //   1360: iastore
    //   1361: dup
    //   1362: bipush #36
    //   1364: ldc 16843776
    //   1366: iastore
    //   1367: dup
    //   1368: bipush #37
    //   1370: ldc 16777216
    //   1372: iastore
    //   1373: dup
    //   1374: bipush #38
    //   1376: ldc 16777216
    //   1378: iastore
    //   1379: dup
    //   1380: bipush #39
    //   1382: sipush #1024
    //   1385: iastore
    //   1386: dup
    //   1387: bipush #40
    //   1389: ldc 16842756
    //   1391: iastore
    //   1392: dup
    //   1393: bipush #41
    //   1395: ldc 65536
    //   1397: iastore
    //   1398: dup
    //   1399: bipush #42
    //   1401: ldc 66560
    //   1403: iastore
    //   1404: dup
    //   1405: bipush #43
    //   1407: ldc 16777220
    //   1409: iastore
    //   1410: dup
    //   1411: bipush #44
    //   1413: sipush #1024
    //   1416: iastore
    //   1417: dup
    //   1418: bipush #45
    //   1420: iconst_4
    //   1421: iastore
    //   1422: dup
    //   1423: bipush #46
    //   1425: ldc 16778244
    //   1427: iastore
    //   1428: dup
    //   1429: bipush #47
    //   1431: ldc 66564
    //   1433: iastore
    //   1434: dup
    //   1435: bipush #48
    //   1437: ldc 16843780
    //   1439: iastore
    //   1440: dup
    //   1441: bipush #49
    //   1443: ldc 65540
    //   1445: iastore
    //   1446: dup
    //   1447: bipush #50
    //   1449: ldc 16842752
    //   1451: iastore
    //   1452: dup
    //   1453: bipush #51
    //   1455: ldc 16778244
    //   1457: iastore
    //   1458: dup
    //   1459: bipush #52
    //   1461: ldc 16777220
    //   1463: iastore
    //   1464: dup
    //   1465: bipush #53
    //   1467: sipush #1028
    //   1470: iastore
    //   1471: dup
    //   1472: bipush #54
    //   1474: ldc 66564
    //   1476: iastore
    //   1477: dup
    //   1478: bipush #55
    //   1480: ldc 16843776
    //   1482: iastore
    //   1483: dup
    //   1484: bipush #56
    //   1486: sipush #1028
    //   1489: iastore
    //   1490: dup
    //   1491: bipush #57
    //   1493: ldc 16778240
    //   1495: iastore
    //   1496: dup
    //   1497: bipush #58
    //   1499: ldc 16778240
    //   1501: iastore
    //   1502: dup
    //   1503: bipush #59
    //   1505: iconst_0
    //   1506: iastore
    //   1507: dup
    //   1508: bipush #60
    //   1510: ldc 65540
    //   1512: iastore
    //   1513: dup
    //   1514: bipush #61
    //   1516: ldc 66560
    //   1518: iastore
    //   1519: dup
    //   1520: bipush #62
    //   1522: iconst_0
    //   1523: iastore
    //   1524: dup
    //   1525: bipush #63
    //   1527: ldc 16842756
    //   1529: iastore
    //   1530: astore #8
    //   1532: bipush #64
    //   1534: newarray int
    //   1536: dup
    //   1537: iconst_0
    //   1538: ldc -2146402272
    //   1540: iastore
    //   1541: dup
    //   1542: iconst_1
    //   1543: ldc -2147450880
    //   1545: iastore
    //   1546: dup
    //   1547: iconst_2
    //   1548: ldc 32768
    //   1550: iastore
    //   1551: dup
    //   1552: iconst_3
    //   1553: ldc 1081376
    //   1555: iastore
    //   1556: dup
    //   1557: iconst_4
    //   1558: ldc 1048576
    //   1560: iastore
    //   1561: dup
    //   1562: iconst_5
    //   1563: bipush #32
    //   1565: iastore
    //   1566: dup
    //   1567: bipush #6
    //   1569: ldc -2146435040
    //   1571: iastore
    //   1572: dup
    //   1573: bipush #7
    //   1575: ldc -2147450848
    //   1577: iastore
    //   1578: dup
    //   1579: bipush #8
    //   1581: ldc -2147483616
    //   1583: iastore
    //   1584: dup
    //   1585: bipush #9
    //   1587: ldc -2146402272
    //   1589: iastore
    //   1590: dup
    //   1591: bipush #10
    //   1593: ldc -2146402304
    //   1595: iastore
    //   1596: dup
    //   1597: bipush #11
    //   1599: ldc -2147483648
    //   1601: iastore
    //   1602: dup
    //   1603: bipush #12
    //   1605: ldc -2147450880
    //   1607: iastore
    //   1608: dup
    //   1609: bipush #13
    //   1611: ldc 1048576
    //   1613: iastore
    //   1614: dup
    //   1615: bipush #14
    //   1617: bipush #32
    //   1619: iastore
    //   1620: dup
    //   1621: bipush #15
    //   1623: ldc -2146435040
    //   1625: iastore
    //   1626: dup
    //   1627: bipush #16
    //   1629: ldc 1081344
    //   1631: iastore
    //   1632: dup
    //   1633: bipush #17
    //   1635: ldc 1048608
    //   1637: iastore
    //   1638: dup
    //   1639: bipush #18
    //   1641: ldc -2147450848
    //   1643: iastore
    //   1644: dup
    //   1645: bipush #19
    //   1647: iconst_0
    //   1648: iastore
    //   1649: dup
    //   1650: bipush #20
    //   1652: ldc -2147483648
    //   1654: iastore
    //   1655: dup
    //   1656: bipush #21
    //   1658: ldc 32768
    //   1660: iastore
    //   1661: dup
    //   1662: bipush #22
    //   1664: ldc 1081376
    //   1666: iastore
    //   1667: dup
    //   1668: bipush #23
    //   1670: ldc -2146435072
    //   1672: iastore
    //   1673: dup
    //   1674: bipush #24
    //   1676: ldc 1048608
    //   1678: iastore
    //   1679: dup
    //   1680: bipush #25
    //   1682: ldc -2147483616
    //   1684: iastore
    //   1685: dup
    //   1686: bipush #26
    //   1688: iconst_0
    //   1689: iastore
    //   1690: dup
    //   1691: bipush #27
    //   1693: ldc 1081344
    //   1695: iastore
    //   1696: dup
    //   1697: bipush #28
    //   1699: ldc 32800
    //   1701: iastore
    //   1702: dup
    //   1703: bipush #29
    //   1705: ldc -2146402304
    //   1707: iastore
    //   1708: dup
    //   1709: bipush #30
    //   1711: ldc -2146435072
    //   1713: iastore
    //   1714: dup
    //   1715: bipush #31
    //   1717: ldc 32800
    //   1719: iastore
    //   1720: dup
    //   1721: bipush #32
    //   1723: iconst_0
    //   1724: iastore
    //   1725: dup
    //   1726: bipush #33
    //   1728: ldc 1081376
    //   1730: iastore
    //   1731: dup
    //   1732: bipush #34
    //   1734: ldc -2146435040
    //   1736: iastore
    //   1737: dup
    //   1738: bipush #35
    //   1740: ldc 1048576
    //   1742: iastore
    //   1743: dup
    //   1744: bipush #36
    //   1746: ldc -2147450848
    //   1748: iastore
    //   1749: dup
    //   1750: bipush #37
    //   1752: ldc -2146435072
    //   1754: iastore
    //   1755: dup
    //   1756: bipush #38
    //   1758: ldc -2146402304
    //   1760: iastore
    //   1761: dup
    //   1762: bipush #39
    //   1764: ldc 32768
    //   1766: iastore
    //   1767: dup
    //   1768: bipush #40
    //   1770: ldc -2146435072
    //   1772: iastore
    //   1773: dup
    //   1774: bipush #41
    //   1776: ldc -2147450880
    //   1778: iastore
    //   1779: dup
    //   1780: bipush #42
    //   1782: bipush #32
    //   1784: iastore
    //   1785: dup
    //   1786: bipush #43
    //   1788: ldc -2146402272
    //   1790: iastore
    //   1791: dup
    //   1792: bipush #44
    //   1794: ldc 1081376
    //   1796: iastore
    //   1797: dup
    //   1798: bipush #45
    //   1800: bipush #32
    //   1802: iastore
    //   1803: dup
    //   1804: bipush #46
    //   1806: ldc 32768
    //   1808: iastore
    //   1809: dup
    //   1810: bipush #47
    //   1812: ldc -2147483648
    //   1814: iastore
    //   1815: dup
    //   1816: bipush #48
    //   1818: ldc 32800
    //   1820: iastore
    //   1821: dup
    //   1822: bipush #49
    //   1824: ldc -2146402304
    //   1826: iastore
    //   1827: dup
    //   1828: bipush #50
    //   1830: ldc 1048576
    //   1832: iastore
    //   1833: dup
    //   1834: bipush #51
    //   1836: ldc -2147483616
    //   1838: iastore
    //   1839: dup
    //   1840: bipush #52
    //   1842: ldc 1048608
    //   1844: iastore
    //   1845: dup
    //   1846: bipush #53
    //   1848: ldc -2147450848
    //   1850: iastore
    //   1851: dup
    //   1852: bipush #54
    //   1854: ldc -2147483616
    //   1856: iastore
    //   1857: dup
    //   1858: bipush #55
    //   1860: ldc 1048608
    //   1862: iastore
    //   1863: dup
    //   1864: bipush #56
    //   1866: ldc 1081344
    //   1868: iastore
    //   1869: dup
    //   1870: bipush #57
    //   1872: iconst_0
    //   1873: iastore
    //   1874: dup
    //   1875: bipush #58
    //   1877: ldc -2147450880
    //   1879: iastore
    //   1880: dup
    //   1881: bipush #59
    //   1883: ldc 32800
    //   1885: iastore
    //   1886: dup
    //   1887: bipush #60
    //   1889: ldc -2147483648
    //   1891: iastore
    //   1892: dup
    //   1893: bipush #61
    //   1895: ldc -2146435040
    //   1897: iastore
    //   1898: dup
    //   1899: bipush #62
    //   1901: ldc -2146402272
    //   1903: iastore
    //   1904: dup
    //   1905: bipush #63
    //   1907: ldc 1081344
    //   1909: iastore
    //   1910: astore #9
    //   1912: bipush #64
    //   1914: newarray int
    //   1916: dup
    //   1917: iconst_0
    //   1918: sipush #520
    //   1921: iastore
    //   1922: dup
    //   1923: iconst_1
    //   1924: ldc 134349312
    //   1926: iastore
    //   1927: dup
    //   1928: iconst_2
    //   1929: iconst_0
    //   1930: iastore
    //   1931: dup
    //   1932: iconst_3
    //   1933: ldc 134348808
    //   1935: iastore
    //   1936: dup
    //   1937: iconst_4
    //   1938: ldc 134218240
    //   1940: iastore
    //   1941: dup
    //   1942: iconst_5
    //   1943: iconst_0
    //   1944: iastore
    //   1945: dup
    //   1946: bipush #6
    //   1948: ldc 131592
    //   1950: iastore
    //   1951: dup
    //   1952: bipush #7
    //   1954: ldc 134218240
    //   1956: iastore
    //   1957: dup
    //   1958: bipush #8
    //   1960: ldc 131080
    //   1962: iastore
    //   1963: dup
    //   1964: bipush #9
    //   1966: ldc 134217736
    //   1968: iastore
    //   1969: dup
    //   1970: bipush #10
    //   1972: ldc 134217736
    //   1974: iastore
    //   1975: dup
    //   1976: bipush #11
    //   1978: ldc 131072
    //   1980: iastore
    //   1981: dup
    //   1982: bipush #12
    //   1984: ldc 134349320
    //   1986: iastore
    //   1987: dup
    //   1988: bipush #13
    //   1990: ldc 131080
    //   1992: iastore
    //   1993: dup
    //   1994: bipush #14
    //   1996: ldc 134348800
    //   1998: iastore
    //   1999: dup
    //   2000: bipush #15
    //   2002: sipush #520
    //   2005: iastore
    //   2006: dup
    //   2007: bipush #16
    //   2009: ldc 134217728
    //   2011: iastore
    //   2012: dup
    //   2013: bipush #17
    //   2015: bipush #8
    //   2017: iastore
    //   2018: dup
    //   2019: bipush #18
    //   2021: ldc 134349312
    //   2023: iastore
    //   2024: dup
    //   2025: bipush #19
    //   2027: sipush #512
    //   2030: iastore
    //   2031: dup
    //   2032: bipush #20
    //   2034: ldc 131584
    //   2036: iastore
    //   2037: dup
    //   2038: bipush #21
    //   2040: ldc 134348800
    //   2042: iastore
    //   2043: dup
    //   2044: bipush #22
    //   2046: ldc 134348808
    //   2048: iastore
    //   2049: dup
    //   2050: bipush #23
    //   2052: ldc 131592
    //   2054: iastore
    //   2055: dup
    //   2056: bipush #24
    //   2058: ldc 134218248
    //   2060: iastore
    //   2061: dup
    //   2062: bipush #25
    //   2064: ldc 131584
    //   2066: iastore
    //   2067: dup
    //   2068: bipush #26
    //   2070: ldc 131072
    //   2072: iastore
    //   2073: dup
    //   2074: bipush #27
    //   2076: ldc 134218248
    //   2078: iastore
    //   2079: dup
    //   2080: bipush #28
    //   2082: bipush #8
    //   2084: iastore
    //   2085: dup
    //   2086: bipush #29
    //   2088: ldc 134349320
    //   2090: iastore
    //   2091: dup
    //   2092: bipush #30
    //   2094: sipush #512
    //   2097: iastore
    //   2098: dup
    //   2099: bipush #31
    //   2101: ldc 134217728
    //   2103: iastore
    //   2104: dup
    //   2105: bipush #32
    //   2107: ldc 134349312
    //   2109: iastore
    //   2110: dup
    //   2111: bipush #33
    //   2113: ldc 134217728
    //   2115: iastore
    //   2116: dup
    //   2117: bipush #34
    //   2119: ldc 131080
    //   2121: iastore
    //   2122: dup
    //   2123: bipush #35
    //   2125: sipush #520
    //   2128: iastore
    //   2129: dup
    //   2130: bipush #36
    //   2132: ldc 131072
    //   2134: iastore
    //   2135: dup
    //   2136: bipush #37
    //   2138: ldc 134349312
    //   2140: iastore
    //   2141: dup
    //   2142: bipush #38
    //   2144: ldc 134218240
    //   2146: iastore
    //   2147: dup
    //   2148: bipush #39
    //   2150: iconst_0
    //   2151: iastore
    //   2152: dup
    //   2153: bipush #40
    //   2155: sipush #512
    //   2158: iastore
    //   2159: dup
    //   2160: bipush #41
    //   2162: ldc 131080
    //   2164: iastore
    //   2165: dup
    //   2166: bipush #42
    //   2168: ldc 134349320
    //   2170: iastore
    //   2171: dup
    //   2172: bipush #43
    //   2174: ldc 134218240
    //   2176: iastore
    //   2177: dup
    //   2178: bipush #44
    //   2180: ldc 134217736
    //   2182: iastore
    //   2183: dup
    //   2184: bipush #45
    //   2186: sipush #512
    //   2189: iastore
    //   2190: dup
    //   2191: bipush #46
    //   2193: iconst_0
    //   2194: iastore
    //   2195: dup
    //   2196: bipush #47
    //   2198: ldc 134348808
    //   2200: iastore
    //   2201: dup
    //   2202: bipush #48
    //   2204: ldc 134218248
    //   2206: iastore
    //   2207: dup
    //   2208: bipush #49
    //   2210: ldc 131072
    //   2212: iastore
    //   2213: dup
    //   2214: bipush #50
    //   2216: ldc 134217728
    //   2218: iastore
    //   2219: dup
    //   2220: bipush #51
    //   2222: ldc 134349320
    //   2224: iastore
    //   2225: dup
    //   2226: bipush #52
    //   2228: bipush #8
    //   2230: iastore
    //   2231: dup
    //   2232: bipush #53
    //   2234: ldc 131592
    //   2236: iastore
    //   2237: dup
    //   2238: bipush #54
    //   2240: ldc 131584
    //   2242: iastore
    //   2243: dup
    //   2244: bipush #55
    //   2246: ldc 134217736
    //   2248: iastore
    //   2249: dup
    //   2250: bipush #56
    //   2252: ldc 134348800
    //   2254: iastore
    //   2255: dup
    //   2256: bipush #57
    //   2258: ldc 134218248
    //   2260: iastore
    //   2261: dup
    //   2262: bipush #58
    //   2264: sipush #520
    //   2267: iastore
    //   2268: dup
    //   2269: bipush #59
    //   2271: ldc 134348800
    //   2273: iastore
    //   2274: dup
    //   2275: bipush #60
    //   2277: ldc 131592
    //   2279: iastore
    //   2280: dup
    //   2281: bipush #61
    //   2283: bipush #8
    //   2285: iastore
    //   2286: dup
    //   2287: bipush #62
    //   2289: ldc 134348808
    //   2291: iastore
    //   2292: dup
    //   2293: bipush #63
    //   2295: ldc 131584
    //   2297: iastore
    //   2298: astore #10
    //   2300: bipush #64
    //   2302: newarray int
    //   2304: dup
    //   2305: iconst_0
    //   2306: ldc 8396801
    //   2308: iastore
    //   2309: dup
    //   2310: iconst_1
    //   2311: sipush #8321
    //   2314: iastore
    //   2315: dup
    //   2316: iconst_2
    //   2317: sipush #8321
    //   2320: iastore
    //   2321: dup
    //   2322: iconst_3
    //   2323: sipush #128
    //   2326: iastore
    //   2327: dup
    //   2328: iconst_4
    //   2329: ldc 8396928
    //   2331: iastore
    //   2332: dup
    //   2333: iconst_5
    //   2334: ldc 8388737
    //   2336: iastore
    //   2337: dup
    //   2338: bipush #6
    //   2340: ldc 8388609
    //   2342: iastore
    //   2343: dup
    //   2344: bipush #7
    //   2346: sipush #8193
    //   2349: iastore
    //   2350: dup
    //   2351: bipush #8
    //   2353: iconst_0
    //   2354: iastore
    //   2355: dup
    //   2356: bipush #9
    //   2358: ldc 8396800
    //   2360: iastore
    //   2361: dup
    //   2362: bipush #10
    //   2364: ldc 8396800
    //   2366: iastore
    //   2367: dup
    //   2368: bipush #11
    //   2370: ldc 8396929
    //   2372: iastore
    //   2373: dup
    //   2374: bipush #12
    //   2376: sipush #129
    //   2379: iastore
    //   2380: dup
    //   2381: bipush #13
    //   2383: iconst_0
    //   2384: iastore
    //   2385: dup
    //   2386: bipush #14
    //   2388: ldc 8388736
    //   2390: iastore
    //   2391: dup
    //   2392: bipush #15
    //   2394: ldc 8388609
    //   2396: iastore
    //   2397: dup
    //   2398: bipush #16
    //   2400: iconst_1
    //   2401: iastore
    //   2402: dup
    //   2403: bipush #17
    //   2405: sipush #8192
    //   2408: iastore
    //   2409: dup
    //   2410: bipush #18
    //   2412: ldc 8388608
    //   2414: iastore
    //   2415: dup
    //   2416: bipush #19
    //   2418: ldc 8396801
    //   2420: iastore
    //   2421: dup
    //   2422: bipush #20
    //   2424: sipush #128
    //   2427: iastore
    //   2428: dup
    //   2429: bipush #21
    //   2431: ldc 8388608
    //   2433: iastore
    //   2434: dup
    //   2435: bipush #22
    //   2437: sipush #8193
    //   2440: iastore
    //   2441: dup
    //   2442: bipush #23
    //   2444: sipush #8320
    //   2447: iastore
    //   2448: dup
    //   2449: bipush #24
    //   2451: ldc 8388737
    //   2453: iastore
    //   2454: dup
    //   2455: bipush #25
    //   2457: iconst_1
    //   2458: iastore
    //   2459: dup
    //   2460: bipush #26
    //   2462: sipush #8320
    //   2465: iastore
    //   2466: dup
    //   2467: bipush #27
    //   2469: ldc 8388736
    //   2471: iastore
    //   2472: dup
    //   2473: bipush #28
    //   2475: sipush #8192
    //   2478: iastore
    //   2479: dup
    //   2480: bipush #29
    //   2482: ldc 8396928
    //   2484: iastore
    //   2485: dup
    //   2486: bipush #30
    //   2488: ldc 8396929
    //   2490: iastore
    //   2491: dup
    //   2492: bipush #31
    //   2494: sipush #129
    //   2497: iastore
    //   2498: dup
    //   2499: bipush #32
    //   2501: ldc 8388736
    //   2503: iastore
    //   2504: dup
    //   2505: bipush #33
    //   2507: ldc 8388609
    //   2509: iastore
    //   2510: dup
    //   2511: bipush #34
    //   2513: ldc 8396800
    //   2515: iastore
    //   2516: dup
    //   2517: bipush #35
    //   2519: ldc 8396929
    //   2521: iastore
    //   2522: dup
    //   2523: bipush #36
    //   2525: sipush #129
    //   2528: iastore
    //   2529: dup
    //   2530: bipush #37
    //   2532: iconst_0
    //   2533: iastore
    //   2534: dup
    //   2535: bipush #38
    //   2537: iconst_0
    //   2538: iastore
    //   2539: dup
    //   2540: bipush #39
    //   2542: ldc 8396800
    //   2544: iastore
    //   2545: dup
    //   2546: bipush #40
    //   2548: sipush #8320
    //   2551: iastore
    //   2552: dup
    //   2553: bipush #41
    //   2555: ldc 8388736
    //   2557: iastore
    //   2558: dup
    //   2559: bipush #42
    //   2561: ldc 8388737
    //   2563: iastore
    //   2564: dup
    //   2565: bipush #43
    //   2567: iconst_1
    //   2568: iastore
    //   2569: dup
    //   2570: bipush #44
    //   2572: ldc 8396801
    //   2574: iastore
    //   2575: dup
    //   2576: bipush #45
    //   2578: sipush #8321
    //   2581: iastore
    //   2582: dup
    //   2583: bipush #46
    //   2585: sipush #8321
    //   2588: iastore
    //   2589: dup
    //   2590: bipush #47
    //   2592: sipush #128
    //   2595: iastore
    //   2596: dup
    //   2597: bipush #48
    //   2599: ldc 8396929
    //   2601: iastore
    //   2602: dup
    //   2603: bipush #49
    //   2605: sipush #129
    //   2608: iastore
    //   2609: dup
    //   2610: bipush #50
    //   2612: iconst_1
    //   2613: iastore
    //   2614: dup
    //   2615: bipush #51
    //   2617: sipush #8192
    //   2620: iastore
    //   2621: dup
    //   2622: bipush #52
    //   2624: ldc 8388609
    //   2626: iastore
    //   2627: dup
    //   2628: bipush #53
    //   2630: sipush #8193
    //   2633: iastore
    //   2634: dup
    //   2635: bipush #54
    //   2637: ldc 8396928
    //   2639: iastore
    //   2640: dup
    //   2641: bipush #55
    //   2643: ldc 8388737
    //   2645: iastore
    //   2646: dup
    //   2647: bipush #56
    //   2649: sipush #8193
    //   2652: iastore
    //   2653: dup
    //   2654: bipush #57
    //   2656: sipush #8320
    //   2659: iastore
    //   2660: dup
    //   2661: bipush #58
    //   2663: ldc 8388608
    //   2665: iastore
    //   2666: dup
    //   2667: bipush #59
    //   2669: ldc 8396801
    //   2671: iastore
    //   2672: dup
    //   2673: bipush #60
    //   2675: sipush #128
    //   2678: iastore
    //   2679: dup
    //   2680: bipush #61
    //   2682: ldc 8388608
    //   2684: iastore
    //   2685: dup
    //   2686: bipush #62
    //   2688: sipush #8192
    //   2691: iastore
    //   2692: dup
    //   2693: bipush #63
    //   2695: ldc 8396928
    //   2697: iastore
    //   2698: astore #11
    //   2700: bipush #64
    //   2702: newarray int
    //   2704: dup
    //   2705: iconst_0
    //   2706: sipush #256
    //   2709: iastore
    //   2710: dup
    //   2711: iconst_1
    //   2712: ldc 34078976
    //   2714: iastore
    //   2715: dup
    //   2716: iconst_2
    //   2717: ldc 34078720
    //   2719: iastore
    //   2720: dup
    //   2721: iconst_3
    //   2722: ldc 1107296512
    //   2724: iastore
    //   2725: dup
    //   2726: iconst_4
    //   2727: ldc 524288
    //   2729: iastore
    //   2730: dup
    //   2731: iconst_5
    //   2732: sipush #256
    //   2735: iastore
    //   2736: dup
    //   2737: bipush #6
    //   2739: ldc 1073741824
    //   2741: iastore
    //   2742: dup
    //   2743: bipush #7
    //   2745: ldc 34078720
    //   2747: iastore
    //   2748: dup
    //   2749: bipush #8
    //   2751: ldc 1074266368
    //   2753: iastore
    //   2754: dup
    //   2755: bipush #9
    //   2757: ldc 524288
    //   2759: iastore
    //   2760: dup
    //   2761: bipush #10
    //   2763: ldc 33554688
    //   2765: iastore
    //   2766: dup
    //   2767: bipush #11
    //   2769: ldc 1074266368
    //   2771: iastore
    //   2772: dup
    //   2773: bipush #12
    //   2775: ldc 1107296512
    //   2777: iastore
    //   2778: dup
    //   2779: bipush #13
    //   2781: ldc 1107820544
    //   2783: iastore
    //   2784: dup
    //   2785: bipush #14
    //   2787: ldc 524544
    //   2789: iastore
    //   2790: dup
    //   2791: bipush #15
    //   2793: ldc 1073741824
    //   2795: iastore
    //   2796: dup
    //   2797: bipush #16
    //   2799: ldc 33554432
    //   2801: iastore
    //   2802: dup
    //   2803: bipush #17
    //   2805: ldc 1074266112
    //   2807: iastore
    //   2808: dup
    //   2809: bipush #18
    //   2811: ldc 1074266112
    //   2813: iastore
    //   2814: dup
    //   2815: bipush #19
    //   2817: iconst_0
    //   2818: iastore
    //   2819: dup
    //   2820: bipush #20
    //   2822: ldc 1073742080
    //   2824: iastore
    //   2825: dup
    //   2826: bipush #21
    //   2828: ldc 1107820800
    //   2830: iastore
    //   2831: dup
    //   2832: bipush #22
    //   2834: ldc 1107820800
    //   2836: iastore
    //   2837: dup
    //   2838: bipush #23
    //   2840: ldc 33554688
    //   2842: iastore
    //   2843: dup
    //   2844: bipush #24
    //   2846: ldc 1107820544
    //   2848: iastore
    //   2849: dup
    //   2850: bipush #25
    //   2852: ldc 1073742080
    //   2854: iastore
    //   2855: dup
    //   2856: bipush #26
    //   2858: iconst_0
    //   2859: iastore
    //   2860: dup
    //   2861: bipush #27
    //   2863: ldc 1107296256
    //   2865: iastore
    //   2866: dup
    //   2867: bipush #28
    //   2869: ldc 34078976
    //   2871: iastore
    //   2872: dup
    //   2873: bipush #29
    //   2875: ldc 33554432
    //   2877: iastore
    //   2878: dup
    //   2879: bipush #30
    //   2881: ldc 1107296256
    //   2883: iastore
    //   2884: dup
    //   2885: bipush #31
    //   2887: ldc 524544
    //   2889: iastore
    //   2890: dup
    //   2891: bipush #32
    //   2893: ldc 524288
    //   2895: iastore
    //   2896: dup
    //   2897: bipush #33
    //   2899: ldc 1107296512
    //   2901: iastore
    //   2902: dup
    //   2903: bipush #34
    //   2905: sipush #256
    //   2908: iastore
    //   2909: dup
    //   2910: bipush #35
    //   2912: ldc 33554432
    //   2914: iastore
    //   2915: dup
    //   2916: bipush #36
    //   2918: ldc 1073741824
    //   2920: iastore
    //   2921: dup
    //   2922: bipush #37
    //   2924: ldc 34078720
    //   2926: iastore
    //   2927: dup
    //   2928: bipush #38
    //   2930: ldc 1107296512
    //   2932: iastore
    //   2933: dup
    //   2934: bipush #39
    //   2936: ldc 1074266368
    //   2938: iastore
    //   2939: dup
    //   2940: bipush #40
    //   2942: ldc 33554688
    //   2944: iastore
    //   2945: dup
    //   2946: bipush #41
    //   2948: ldc 1073741824
    //   2950: iastore
    //   2951: dup
    //   2952: bipush #42
    //   2954: ldc 1107820544
    //   2956: iastore
    //   2957: dup
    //   2958: bipush #43
    //   2960: ldc 34078976
    //   2962: iastore
    //   2963: dup
    //   2964: bipush #44
    //   2966: ldc 1074266368
    //   2968: iastore
    //   2969: dup
    //   2970: bipush #45
    //   2972: sipush #256
    //   2975: iastore
    //   2976: dup
    //   2977: bipush #46
    //   2979: ldc 33554432
    //   2981: iastore
    //   2982: dup
    //   2983: bipush #47
    //   2985: ldc 1107820544
    //   2987: iastore
    //   2988: dup
    //   2989: bipush #48
    //   2991: ldc 1107820800
    //   2993: iastore
    //   2994: dup
    //   2995: bipush #49
    //   2997: ldc 524544
    //   2999: iastore
    //   3000: dup
    //   3001: bipush #50
    //   3003: ldc 1107296256
    //   3005: iastore
    //   3006: dup
    //   3007: bipush #51
    //   3009: ldc 1107820800
    //   3011: iastore
    //   3012: dup
    //   3013: bipush #52
    //   3015: ldc 34078720
    //   3017: iastore
    //   3018: dup
    //   3019: bipush #53
    //   3021: iconst_0
    //   3022: iastore
    //   3023: dup
    //   3024: bipush #54
    //   3026: ldc 1074266112
    //   3028: iastore
    //   3029: dup
    //   3030: bipush #55
    //   3032: ldc 1107296256
    //   3034: iastore
    //   3035: dup
    //   3036: bipush #56
    //   3038: ldc 524544
    //   3040: iastore
    //   3041: dup
    //   3042: bipush #57
    //   3044: ldc 33554688
    //   3046: iastore
    //   3047: dup
    //   3048: bipush #58
    //   3050: ldc 1073742080
    //   3052: iastore
    //   3053: dup
    //   3054: bipush #59
    //   3056: ldc 524288
    //   3058: iastore
    //   3059: dup
    //   3060: bipush #60
    //   3062: iconst_0
    //   3063: iastore
    //   3064: dup
    //   3065: bipush #61
    //   3067: ldc 1074266112
    //   3069: iastore
    //   3070: dup
    //   3071: bipush #62
    //   3073: ldc 34078976
    //   3075: iastore
    //   3076: dup
    //   3077: bipush #63
    //   3079: ldc 1073742080
    //   3081: iastore
    //   3082: astore #12
    //   3084: bipush #64
    //   3086: newarray int
    //   3088: dup
    //   3089: iconst_0
    //   3090: ldc 536870928
    //   3092: iastore
    //   3093: dup
    //   3094: iconst_1
    //   3095: ldc 541065216
    //   3097: iastore
    //   3098: dup
    //   3099: iconst_2
    //   3100: sipush #16384
    //   3103: iastore
    //   3104: dup
    //   3105: iconst_3
    //   3106: ldc 541081616
    //   3108: iastore
    //   3109: dup
    //   3110: iconst_4
    //   3111: ldc 541065216
    //   3113: iastore
    //   3114: dup
    //   3115: iconst_5
    //   3116: bipush #16
    //   3118: iastore
    //   3119: dup
    //   3120: bipush #6
    //   3122: ldc 541081616
    //   3124: iastore
    //   3125: dup
    //   3126: bipush #7
    //   3128: ldc 4194304
    //   3130: iastore
    //   3131: dup
    //   3132: bipush #8
    //   3134: ldc 536887296
    //   3136: iastore
    //   3137: dup
    //   3138: bipush #9
    //   3140: ldc 4210704
    //   3142: iastore
    //   3143: dup
    //   3144: bipush #10
    //   3146: ldc 4194304
    //   3148: iastore
    //   3149: dup
    //   3150: bipush #11
    //   3152: ldc 536870928
    //   3154: iastore
    //   3155: dup
    //   3156: bipush #12
    //   3158: ldc 4194320
    //   3160: iastore
    //   3161: dup
    //   3162: bipush #13
    //   3164: ldc 536887296
    //   3166: iastore
    //   3167: dup
    //   3168: bipush #14
    //   3170: ldc 536870912
    //   3172: iastore
    //   3173: dup
    //   3174: bipush #15
    //   3176: sipush #16400
    //   3179: iastore
    //   3180: dup
    //   3181: bipush #16
    //   3183: iconst_0
    //   3184: iastore
    //   3185: dup
    //   3186: bipush #17
    //   3188: ldc 4194320
    //   3190: iastore
    //   3191: dup
    //   3192: bipush #18
    //   3194: ldc 536887312
    //   3196: iastore
    //   3197: dup
    //   3198: bipush #19
    //   3200: sipush #16384
    //   3203: iastore
    //   3204: dup
    //   3205: bipush #20
    //   3207: ldc 4210688
    //   3209: iastore
    //   3210: dup
    //   3211: bipush #21
    //   3213: ldc 536887312
    //   3215: iastore
    //   3216: dup
    //   3217: bipush #22
    //   3219: bipush #16
    //   3221: iastore
    //   3222: dup
    //   3223: bipush #23
    //   3225: ldc 541065232
    //   3227: iastore
    //   3228: dup
    //   3229: bipush #24
    //   3231: ldc 541065232
    //   3233: iastore
    //   3234: dup
    //   3235: bipush #25
    //   3237: iconst_0
    //   3238: iastore
    //   3239: dup
    //   3240: bipush #26
    //   3242: ldc 4210704
    //   3244: iastore
    //   3245: dup
    //   3246: bipush #27
    //   3248: ldc 541081600
    //   3250: iastore
    //   3251: dup
    //   3252: bipush #28
    //   3254: sipush #16400
    //   3257: iastore
    //   3258: dup
    //   3259: bipush #29
    //   3261: ldc 4210688
    //   3263: iastore
    //   3264: dup
    //   3265: bipush #30
    //   3267: ldc 541081600
    //   3269: iastore
    //   3270: dup
    //   3271: bipush #31
    //   3273: ldc 536870912
    //   3275: iastore
    //   3276: dup
    //   3277: bipush #32
    //   3279: ldc 536887296
    //   3281: iastore
    //   3282: dup
    //   3283: bipush #33
    //   3285: bipush #16
    //   3287: iastore
    //   3288: dup
    //   3289: bipush #34
    //   3291: ldc 541065232
    //   3293: iastore
    //   3294: dup
    //   3295: bipush #35
    //   3297: ldc 4210688
    //   3299: iastore
    //   3300: dup
    //   3301: bipush #36
    //   3303: ldc 541081616
    //   3305: iastore
    //   3306: dup
    //   3307: bipush #37
    //   3309: ldc 4194304
    //   3311: iastore
    //   3312: dup
    //   3313: bipush #38
    //   3315: sipush #16400
    //   3318: iastore
    //   3319: dup
    //   3320: bipush #39
    //   3322: ldc 536870928
    //   3324: iastore
    //   3325: dup
    //   3326: bipush #40
    //   3328: ldc 4194304
    //   3330: iastore
    //   3331: dup
    //   3332: bipush #41
    //   3334: ldc 536887296
    //   3336: iastore
    //   3337: dup
    //   3338: bipush #42
    //   3340: ldc 536870912
    //   3342: iastore
    //   3343: dup
    //   3344: bipush #43
    //   3346: sipush #16400
    //   3349: iastore
    //   3350: dup
    //   3351: bipush #44
    //   3353: ldc 536870928
    //   3355: iastore
    //   3356: dup
    //   3357: bipush #45
    //   3359: ldc 541081616
    //   3361: iastore
    //   3362: dup
    //   3363: bipush #46
    //   3365: ldc 4210688
    //   3367: iastore
    //   3368: dup
    //   3369: bipush #47
    //   3371: ldc 541065216
    //   3373: iastore
    //   3374: dup
    //   3375: bipush #48
    //   3377: ldc 4210704
    //   3379: iastore
    //   3380: dup
    //   3381: bipush #49
    //   3383: ldc 541081600
    //   3385: iastore
    //   3386: dup
    //   3387: bipush #50
    //   3389: iconst_0
    //   3390: iastore
    //   3391: dup
    //   3392: bipush #51
    //   3394: ldc 541065232
    //   3396: iastore
    //   3397: dup
    //   3398: bipush #52
    //   3400: bipush #16
    //   3402: iastore
    //   3403: dup
    //   3404: bipush #53
    //   3406: sipush #16384
    //   3409: iastore
    //   3410: dup
    //   3411: bipush #54
    //   3413: ldc 541065216
    //   3415: iastore
    //   3416: dup
    //   3417: bipush #55
    //   3419: ldc 4210704
    //   3421: iastore
    //   3422: dup
    //   3423: bipush #56
    //   3425: sipush #16384
    //   3428: iastore
    //   3429: dup
    //   3430: bipush #57
    //   3432: ldc 4194320
    //   3434: iastore
    //   3435: dup
    //   3436: bipush #58
    //   3438: ldc 536887312
    //   3440: iastore
    //   3441: dup
    //   3442: bipush #59
    //   3444: iconst_0
    //   3445: iastore
    //   3446: dup
    //   3447: bipush #60
    //   3449: ldc 541081600
    //   3451: iastore
    //   3452: dup
    //   3453: bipush #61
    //   3455: ldc 536870912
    //   3457: iastore
    //   3458: dup
    //   3459: bipush #62
    //   3461: ldc 4194320
    //   3463: iastore
    //   3464: dup
    //   3465: bipush #63
    //   3467: ldc 536887312
    //   3469: iastore
    //   3470: astore #13
    //   3472: bipush #64
    //   3474: newarray int
    //   3476: dup
    //   3477: iconst_0
    //   3478: ldc 2097152
    //   3480: iastore
    //   3481: dup
    //   3482: iconst_1
    //   3483: ldc 69206018
    //   3485: iastore
    //   3486: dup
    //   3487: iconst_2
    //   3488: ldc 67110914
    //   3490: iastore
    //   3491: dup
    //   3492: iconst_3
    //   3493: iconst_0
    //   3494: iastore
    //   3495: dup
    //   3496: iconst_4
    //   3497: sipush #2048
    //   3500: iastore
    //   3501: dup
    //   3502: iconst_5
    //   3503: ldc 67110914
    //   3505: iastore
    //   3506: dup
    //   3507: bipush #6
    //   3509: ldc 2099202
    //   3511: iastore
    //   3512: dup
    //   3513: bipush #7
    //   3515: ldc 69208064
    //   3517: iastore
    //   3518: dup
    //   3519: bipush #8
    //   3521: ldc 69208066
    //   3523: iastore
    //   3524: dup
    //   3525: bipush #9
    //   3527: ldc 2097152
    //   3529: iastore
    //   3530: dup
    //   3531: bipush #10
    //   3533: iconst_0
    //   3534: iastore
    //   3535: dup
    //   3536: bipush #11
    //   3538: ldc 67108866
    //   3540: iastore
    //   3541: dup
    //   3542: bipush #12
    //   3544: iconst_2
    //   3545: iastore
    //   3546: dup
    //   3547: bipush #13
    //   3549: ldc 67108864
    //   3551: iastore
    //   3552: dup
    //   3553: bipush #14
    //   3555: ldc 69206018
    //   3557: iastore
    //   3558: dup
    //   3559: bipush #15
    //   3561: sipush #2050
    //   3564: iastore
    //   3565: dup
    //   3566: bipush #16
    //   3568: ldc 67110912
    //   3570: iastore
    //   3571: dup
    //   3572: bipush #17
    //   3574: ldc 2099202
    //   3576: iastore
    //   3577: dup
    //   3578: bipush #18
    //   3580: ldc 2097154
    //   3582: iastore
    //   3583: dup
    //   3584: bipush #19
    //   3586: ldc 67110912
    //   3588: iastore
    //   3589: dup
    //   3590: bipush #20
    //   3592: ldc 67108866
    //   3594: iastore
    //   3595: dup
    //   3596: bipush #21
    //   3598: ldc 69206016
    //   3600: iastore
    //   3601: dup
    //   3602: bipush #22
    //   3604: ldc 69208064
    //   3606: iastore
    //   3607: dup
    //   3608: bipush #23
    //   3610: ldc 2097154
    //   3612: iastore
    //   3613: dup
    //   3614: bipush #24
    //   3616: ldc 69206016
    //   3618: iastore
    //   3619: dup
    //   3620: bipush #25
    //   3622: sipush #2048
    //   3625: iastore
    //   3626: dup
    //   3627: bipush #26
    //   3629: sipush #2050
    //   3632: iastore
    //   3633: dup
    //   3634: bipush #27
    //   3636: ldc 69208066
    //   3638: iastore
    //   3639: dup
    //   3640: bipush #28
    //   3642: ldc 2099200
    //   3644: iastore
    //   3645: dup
    //   3646: bipush #29
    //   3648: iconst_2
    //   3649: iastore
    //   3650: dup
    //   3651: bipush #30
    //   3653: ldc 67108864
    //   3655: iastore
    //   3656: dup
    //   3657: bipush #31
    //   3659: ldc 2099200
    //   3661: iastore
    //   3662: dup
    //   3663: bipush #32
    //   3665: ldc 67108864
    //   3667: iastore
    //   3668: dup
    //   3669: bipush #33
    //   3671: ldc 2099200
    //   3673: iastore
    //   3674: dup
    //   3675: bipush #34
    //   3677: ldc 2097152
    //   3679: iastore
    //   3680: dup
    //   3681: bipush #35
    //   3683: ldc 67110914
    //   3685: iastore
    //   3686: dup
    //   3687: bipush #36
    //   3689: ldc 67110914
    //   3691: iastore
    //   3692: dup
    //   3693: bipush #37
    //   3695: ldc 69206018
    //   3697: iastore
    //   3698: dup
    //   3699: bipush #38
    //   3701: ldc 69206018
    //   3703: iastore
    //   3704: dup
    //   3705: bipush #39
    //   3707: iconst_2
    //   3708: iastore
    //   3709: dup
    //   3710: bipush #40
    //   3712: ldc 2097154
    //   3714: iastore
    //   3715: dup
    //   3716: bipush #41
    //   3718: ldc 67108864
    //   3720: iastore
    //   3721: dup
    //   3722: bipush #42
    //   3724: ldc 67110912
    //   3726: iastore
    //   3727: dup
    //   3728: bipush #43
    //   3730: ldc 2097152
    //   3732: iastore
    //   3733: dup
    //   3734: bipush #44
    //   3736: ldc 69208064
    //   3738: iastore
    //   3739: dup
    //   3740: bipush #45
    //   3742: sipush #2050
    //   3745: iastore
    //   3746: dup
    //   3747: bipush #46
    //   3749: ldc 2099202
    //   3751: iastore
    //   3752: dup
    //   3753: bipush #47
    //   3755: ldc 69208064
    //   3757: iastore
    //   3758: dup
    //   3759: bipush #48
    //   3761: sipush #2050
    //   3764: iastore
    //   3765: dup
    //   3766: bipush #49
    //   3768: ldc 67108866
    //   3770: iastore
    //   3771: dup
    //   3772: bipush #50
    //   3774: ldc 69208066
    //   3776: iastore
    //   3777: dup
    //   3778: bipush #51
    //   3780: ldc 69206016
    //   3782: iastore
    //   3783: dup
    //   3784: bipush #52
    //   3786: ldc 2099200
    //   3788: iastore
    //   3789: dup
    //   3790: bipush #53
    //   3792: iconst_0
    //   3793: iastore
    //   3794: dup
    //   3795: bipush #54
    //   3797: iconst_2
    //   3798: iastore
    //   3799: dup
    //   3800: bipush #55
    //   3802: ldc 69208066
    //   3804: iastore
    //   3805: dup
    //   3806: bipush #56
    //   3808: iconst_0
    //   3809: iastore
    //   3810: dup
    //   3811: bipush #57
    //   3813: ldc 2099202
    //   3815: iastore
    //   3816: dup
    //   3817: bipush #58
    //   3819: ldc 69206016
    //   3821: iastore
    //   3822: dup
    //   3823: bipush #59
    //   3825: sipush #2048
    //   3828: iastore
    //   3829: dup
    //   3830: bipush #60
    //   3832: ldc 67108866
    //   3834: iastore
    //   3835: dup
    //   3836: bipush #61
    //   3838: ldc 67110912
    //   3840: iastore
    //   3841: dup
    //   3842: bipush #62
    //   3844: sipush #2048
    //   3847: iastore
    //   3848: dup
    //   3849: bipush #63
    //   3851: ldc 2097154
    //   3853: iastore
    //   3854: astore #14
    //   3856: bipush #64
    //   3858: newarray int
    //   3860: dup
    //   3861: iconst_0
    //   3862: ldc 268439616
    //   3864: iastore
    //   3865: dup
    //   3866: iconst_1
    //   3867: sipush #4096
    //   3870: iastore
    //   3871: dup
    //   3872: iconst_2
    //   3873: ldc 262144
    //   3875: iastore
    //   3876: dup
    //   3877: iconst_3
    //   3878: ldc 268701760
    //   3880: iastore
    //   3881: dup
    //   3882: iconst_4
    //   3883: ldc 268435456
    //   3885: iastore
    //   3886: dup
    //   3887: iconst_5
    //   3888: ldc 268439616
    //   3890: iastore
    //   3891: dup
    //   3892: bipush #6
    //   3894: bipush #64
    //   3896: iastore
    //   3897: dup
    //   3898: bipush #7
    //   3900: ldc 268435456
    //   3902: iastore
    //   3903: dup
    //   3904: bipush #8
    //   3906: ldc 262208
    //   3908: iastore
    //   3909: dup
    //   3910: bipush #9
    //   3912: ldc 268697600
    //   3914: iastore
    //   3915: dup
    //   3916: bipush #10
    //   3918: ldc 268701760
    //   3920: iastore
    //   3921: dup
    //   3922: bipush #11
    //   3924: ldc 266240
    //   3926: iastore
    //   3927: dup
    //   3928: bipush #12
    //   3930: ldc 268701696
    //   3932: iastore
    //   3933: dup
    //   3934: bipush #13
    //   3936: ldc 266304
    //   3938: iastore
    //   3939: dup
    //   3940: bipush #14
    //   3942: sipush #4096
    //   3945: iastore
    //   3946: dup
    //   3947: bipush #15
    //   3949: bipush #64
    //   3951: iastore
    //   3952: dup
    //   3953: bipush #16
    //   3955: ldc 268697600
    //   3957: iastore
    //   3958: dup
    //   3959: bipush #17
    //   3961: ldc 268435520
    //   3963: iastore
    //   3964: dup
    //   3965: bipush #18
    //   3967: ldc 268439552
    //   3969: iastore
    //   3970: dup
    //   3971: bipush #19
    //   3973: sipush #4160
    //   3976: iastore
    //   3977: dup
    //   3978: bipush #20
    //   3980: ldc 266240
    //   3982: iastore
    //   3983: dup
    //   3984: bipush #21
    //   3986: ldc 262208
    //   3988: iastore
    //   3989: dup
    //   3990: bipush #22
    //   3992: ldc 268697664
    //   3994: iastore
    //   3995: dup
    //   3996: bipush #23
    //   3998: ldc 268701696
    //   4000: iastore
    //   4001: dup
    //   4002: bipush #24
    //   4004: sipush #4160
    //   4007: iastore
    //   4008: dup
    //   4009: bipush #25
    //   4011: iconst_0
    //   4012: iastore
    //   4013: dup
    //   4014: bipush #26
    //   4016: iconst_0
    //   4017: iastore
    //   4018: dup
    //   4019: bipush #27
    //   4021: ldc 268697664
    //   4023: iastore
    //   4024: dup
    //   4025: bipush #28
    //   4027: ldc 268435520
    //   4029: iastore
    //   4030: dup
    //   4031: bipush #29
    //   4033: ldc 268439552
    //   4035: iastore
    //   4036: dup
    //   4037: bipush #30
    //   4039: ldc 266304
    //   4041: iastore
    //   4042: dup
    //   4043: bipush #31
    //   4045: ldc 262144
    //   4047: iastore
    //   4048: dup
    //   4049: bipush #32
    //   4051: ldc 266304
    //   4053: iastore
    //   4054: dup
    //   4055: bipush #33
    //   4057: ldc 262144
    //   4059: iastore
    //   4060: dup
    //   4061: bipush #34
    //   4063: ldc 268701696
    //   4065: iastore
    //   4066: dup
    //   4067: bipush #35
    //   4069: sipush #4096
    //   4072: iastore
    //   4073: dup
    //   4074: bipush #36
    //   4076: bipush #64
    //   4078: iastore
    //   4079: dup
    //   4080: bipush #37
    //   4082: ldc 268697664
    //   4084: iastore
    //   4085: dup
    //   4086: bipush #38
    //   4088: sipush #4096
    //   4091: iastore
    //   4092: dup
    //   4093: bipush #39
    //   4095: ldc 266304
    //   4097: iastore
    //   4098: dup
    //   4099: bipush #40
    //   4101: ldc 268439552
    //   4103: iastore
    //   4104: dup
    //   4105: bipush #41
    //   4107: bipush #64
    //   4109: iastore
    //   4110: dup
    //   4111: bipush #42
    //   4113: ldc 268435520
    //   4115: iastore
    //   4116: dup
    //   4117: bipush #43
    //   4119: ldc 268697600
    //   4121: iastore
    //   4122: dup
    //   4123: bipush #44
    //   4125: ldc 268697664
    //   4127: iastore
    //   4128: dup
    //   4129: bipush #45
    //   4131: ldc 268435456
    //   4133: iastore
    //   4134: dup
    //   4135: bipush #46
    //   4137: ldc 262144
    //   4139: iastore
    //   4140: dup
    //   4141: bipush #47
    //   4143: ldc 268439616
    //   4145: iastore
    //   4146: dup
    //   4147: bipush #48
    //   4149: iconst_0
    //   4150: iastore
    //   4151: dup
    //   4152: bipush #49
    //   4154: ldc 268701760
    //   4156: iastore
    //   4157: dup
    //   4158: bipush #50
    //   4160: ldc 262208
    //   4162: iastore
    //   4163: dup
    //   4164: bipush #51
    //   4166: ldc 268435520
    //   4168: iastore
    //   4169: dup
    //   4170: bipush #52
    //   4172: ldc 268697600
    //   4174: iastore
    //   4175: dup
    //   4176: bipush #53
    //   4178: ldc 268439552
    //   4180: iastore
    //   4181: dup
    //   4182: bipush #54
    //   4184: ldc 268439616
    //   4186: iastore
    //   4187: dup
    //   4188: bipush #55
    //   4190: iconst_0
    //   4191: iastore
    //   4192: dup
    //   4193: bipush #56
    //   4195: ldc 268701760
    //   4197: iastore
    //   4198: dup
    //   4199: bipush #57
    //   4201: ldc 266240
    //   4203: iastore
    //   4204: dup
    //   4205: bipush #58
    //   4207: ldc 266240
    //   4209: iastore
    //   4210: dup
    //   4211: bipush #59
    //   4213: sipush #4160
    //   4216: iastore
    //   4217: dup
    //   4218: bipush #60
    //   4220: sipush #4160
    //   4223: iastore
    //   4224: dup
    //   4225: bipush #61
    //   4227: ldc 262208
    //   4229: iastore
    //   4230: dup
    //   4231: bipush #62
    //   4233: ldc 268435456
    //   4235: iastore
    //   4236: dup
    //   4237: bipush #63
    //   4239: ldc 268701696
    //   4241: iastore
    //   4242: astore #15
    //   4244: aload_3
    //   4245: arraylength
    //   4246: istore #16
    //   4248: iconst_2
    //   4249: newarray int
    //   4251: astore #17
    //   4253: iload #16
    //   4255: newarray byte
    //   4257: astore #4
    //   4259: iload #16
    //   4261: bipush #8
    //   4263: idiv
    //   4264: istore #18
    //   4266: iconst_0
    //   4267: istore #19
    //   4269: iload #19
    //   4271: iload #18
    //   4273: if_icmpge -> 5187
    //   4276: iload #19
    //   4278: bipush #8
    //   4280: imul
    //   4281: istore #20
    //   4283: iconst_0
    //   4284: istore #21
    //   4286: iload #21
    //   4288: iconst_2
    //   4289: if_icmpge -> 4374
    //   4292: aload #17
    //   4294: iload #21
    //   4296: aload_3
    //   4297: iload #20
    //   4299: iload #21
    //   4301: iconst_4
    //   4302: imul
    //   4303: iadd
    //   4304: baload
    //   4305: sipush #255
    //   4308: iand
    //   4309: bipush #24
    //   4311: ishl
    //   4312: aload_3
    //   4313: iload #20
    //   4315: iload #21
    //   4317: iconst_4
    //   4318: imul
    //   4319: iadd
    //   4320: iconst_1
    //   4321: iadd
    //   4322: baload
    //   4323: sipush #255
    //   4326: iand
    //   4327: bipush #16
    //   4329: ishl
    //   4330: ior
    //   4331: aload_3
    //   4332: iload #20
    //   4334: iload #21
    //   4336: iconst_4
    //   4337: imul
    //   4338: iadd
    //   4339: iconst_2
    //   4340: iadd
    //   4341: baload
    //   4342: sipush #255
    //   4345: iand
    //   4346: bipush #8
    //   4348: ishl
    //   4349: ior
    //   4350: aload_3
    //   4351: iload #20
    //   4353: iload #21
    //   4355: iconst_4
    //   4356: imul
    //   4357: iadd
    //   4358: iconst_3
    //   4359: iadd
    //   4360: baload
    //   4361: sipush #255
    //   4364: iand
    //   4365: ior
    //   4366: iastore
    //   4367: iinc #21, 1
    //   4370: iload_2
    //   4371: ifne -> 4286
    //   4374: iconst_0
    //   4375: istore #26
    //   4377: aload #17
    //   4379: iconst_0
    //   4380: iaload
    //   4381: istore #24
    //   4383: aload #17
    //   4385: iconst_1
    //   4386: iaload
    //   4387: istore #23
    //   4389: iload #24
    //   4391: iconst_4
    //   4392: iushr
    //   4393: iload #23
    //   4395: ixor
    //   4396: ldc 252645135
    //   4398: iand
    //   4399: istore #22
    //   4401: iload #23
    //   4403: iload #22
    //   4405: ixor
    //   4406: istore #23
    //   4408: iload #24
    //   4410: iload #22
    //   4412: iconst_4
    //   4413: ishl
    //   4414: ixor
    //   4415: istore #24
    //   4417: iload #24
    //   4419: bipush #16
    //   4421: iushr
    //   4422: iload #23
    //   4424: ixor
    //   4425: ldc 65535
    //   4427: iand
    //   4428: istore #22
    //   4430: iload #23
    //   4432: iload #22
    //   4434: ixor
    //   4435: istore #23
    //   4437: iload #24
    //   4439: iload #22
    //   4441: bipush #16
    //   4443: ishl
    //   4444: ixor
    //   4445: istore #24
    //   4447: iload #23
    //   4449: iconst_2
    //   4450: iushr
    //   4451: iload #24
    //   4453: ixor
    //   4454: ldc 858993459
    //   4456: iand
    //   4457: istore #22
    //   4459: iload #24
    //   4461: iload #22
    //   4463: ixor
    //   4464: istore #24
    //   4466: iload #23
    //   4468: iload #22
    //   4470: iconst_2
    //   4471: ishl
    //   4472: ixor
    //   4473: istore #23
    //   4475: iload #23
    //   4477: bipush #8
    //   4479: iushr
    //   4480: iload #24
    //   4482: ixor
    //   4483: ldc 16711935
    //   4485: iand
    //   4486: istore #22
    //   4488: iload #24
    //   4490: iload #22
    //   4492: ixor
    //   4493: istore #24
    //   4495: iload #23
    //   4497: iload #22
    //   4499: bipush #8
    //   4501: ishl
    //   4502: ixor
    //   4503: istore #23
    //   4505: iload #23
    //   4507: iconst_1
    //   4508: ishl
    //   4509: iload #23
    //   4511: bipush #31
    //   4513: iushr
    //   4514: iconst_1
    //   4515: iand
    //   4516: ior
    //   4517: istore #23
    //   4519: iload #24
    //   4521: iload #23
    //   4523: ixor
    //   4524: ldc -1431655766
    //   4526: iand
    //   4527: istore #22
    //   4529: iload #24
    //   4531: iload #22
    //   4533: ixor
    //   4534: istore #24
    //   4536: iload #23
    //   4538: iload #22
    //   4540: ixor
    //   4541: istore #23
    //   4543: iload #24
    //   4545: iconst_1
    //   4546: ishl
    //   4547: iload #24
    //   4549: bipush #31
    //   4551: iushr
    //   4552: iconst_1
    //   4553: iand
    //   4554: ior
    //   4555: istore #24
    //   4557: iconst_0
    //   4558: istore #25
    //   4560: iload #25
    //   4562: bipush #8
    //   4564: if_icmpge -> 4902
    //   4567: iload #23
    //   4569: bipush #28
    //   4571: ishl
    //   4572: iload #23
    //   4574: iconst_4
    //   4575: iushr
    //   4576: ior
    //   4577: istore #22
    //   4579: iload #22
    //   4581: aload #5
    //   4583: iload #26
    //   4585: iinc #26, 1
    //   4588: iaload
    //   4589: ixor
    //   4590: istore #22
    //   4592: aload #14
    //   4594: iload #22
    //   4596: bipush #63
    //   4598: iand
    //   4599: iaload
    //   4600: istore #21
    //   4602: iload #21
    //   4604: aload #12
    //   4606: iload #22
    //   4608: bipush #8
    //   4610: iushr
    //   4611: bipush #63
    //   4613: iand
    //   4614: iaload
    //   4615: ior
    //   4616: istore #21
    //   4618: iload #21
    //   4620: aload #10
    //   4622: iload #22
    //   4624: bipush #16
    //   4626: iushr
    //   4627: bipush #63
    //   4629: iand
    //   4630: iaload
    //   4631: ior
    //   4632: istore #21
    //   4634: iload #21
    //   4636: aload #8
    //   4638: iload #22
    //   4640: bipush #24
    //   4642: iushr
    //   4643: bipush #63
    //   4645: iand
    //   4646: iaload
    //   4647: ior
    //   4648: istore #21
    //   4650: iload #23
    //   4652: aload #5
    //   4654: iload #26
    //   4656: iinc #26, 1
    //   4659: iaload
    //   4660: ixor
    //   4661: istore #22
    //   4663: iload #21
    //   4665: aload #15
    //   4667: iload #22
    //   4669: bipush #63
    //   4671: iand
    //   4672: iaload
    //   4673: ior
    //   4674: istore #21
    //   4676: iload #21
    //   4678: aload #13
    //   4680: iload #22
    //   4682: bipush #8
    //   4684: iushr
    //   4685: bipush #63
    //   4687: iand
    //   4688: iaload
    //   4689: ior
    //   4690: istore #21
    //   4692: iload #21
    //   4694: aload #11
    //   4696: iload #22
    //   4698: bipush #16
    //   4700: iushr
    //   4701: bipush #63
    //   4703: iand
    //   4704: iaload
    //   4705: ior
    //   4706: istore #21
    //   4708: iload #21
    //   4710: aload #9
    //   4712: iload #22
    //   4714: bipush #24
    //   4716: iushr
    //   4717: bipush #63
    //   4719: iand
    //   4720: iaload
    //   4721: ior
    //   4722: istore #21
    //   4724: iload #24
    //   4726: iload #21
    //   4728: ixor
    //   4729: istore #24
    //   4731: iload #24
    //   4733: bipush #28
    //   4735: ishl
    //   4736: iload #24
    //   4738: iconst_4
    //   4739: iushr
    //   4740: ior
    //   4741: istore #22
    //   4743: iload #22
    //   4745: aload #5
    //   4747: iload #26
    //   4749: iinc #26, 1
    //   4752: iaload
    //   4753: ixor
    //   4754: istore #22
    //   4756: aload #14
    //   4758: iload #22
    //   4760: bipush #63
    //   4762: iand
    //   4763: iaload
    //   4764: istore #21
    //   4766: iload #21
    //   4768: aload #12
    //   4770: iload #22
    //   4772: bipush #8
    //   4774: iushr
    //   4775: bipush #63
    //   4777: iand
    //   4778: iaload
    //   4779: ior
    //   4780: istore #21
    //   4782: iload #21
    //   4784: aload #10
    //   4786: iload #22
    //   4788: bipush #16
    //   4790: iushr
    //   4791: bipush #63
    //   4793: iand
    //   4794: iaload
    //   4795: ior
    //   4796: istore #21
    //   4798: iload #21
    //   4800: aload #8
    //   4802: iload #22
    //   4804: bipush #24
    //   4806: iushr
    //   4807: bipush #63
    //   4809: iand
    //   4810: iaload
    //   4811: ior
    //   4812: istore #21
    //   4814: iload #24
    //   4816: aload #5
    //   4818: iload #26
    //   4820: iinc #26, 1
    //   4823: iaload
    //   4824: ixor
    //   4825: istore #22
    //   4827: iload #21
    //   4829: aload #15
    //   4831: iload #22
    //   4833: bipush #63
    //   4835: iand
    //   4836: iaload
    //   4837: ior
    //   4838: istore #21
    //   4840: iload #21
    //   4842: aload #13
    //   4844: iload #22
    //   4846: bipush #8
    //   4848: iushr
    //   4849: bipush #63
    //   4851: iand
    //   4852: iaload
    //   4853: ior
    //   4854: istore #21
    //   4856: iload #21
    //   4858: aload #11
    //   4860: iload #22
    //   4862: bipush #16
    //   4864: iushr
    //   4865: bipush #63
    //   4867: iand
    //   4868: iaload
    //   4869: ior
    //   4870: istore #21
    //   4872: iload #21
    //   4874: aload #9
    //   4876: iload #22
    //   4878: bipush #24
    //   4880: iushr
    //   4881: bipush #63
    //   4883: iand
    //   4884: iaload
    //   4885: ior
    //   4886: istore #21
    //   4888: iload #23
    //   4890: iload #21
    //   4892: ixor
    //   4893: istore #23
    //   4895: iinc #25, 1
    //   4898: iload_2
    //   4899: ifne -> 4560
    //   4902: iload #23
    //   4904: bipush #31
    //   4906: ishl
    //   4907: iload #23
    //   4909: iconst_1
    //   4910: iushr
    //   4911: ior
    //   4912: istore #23
    //   4914: iload #24
    //   4916: iload #23
    //   4918: ixor
    //   4919: ldc -1431655766
    //   4921: iand
    //   4922: istore #22
    //   4924: iload #24
    //   4926: iload #22
    //   4928: ixor
    //   4929: istore #24
    //   4931: iload #23
    //   4933: iload #22
    //   4935: ixor
    //   4936: istore #23
    //   4938: iload #24
    //   4940: bipush #31
    //   4942: ishl
    //   4943: iload #24
    //   4945: iconst_1
    //   4946: iushr
    //   4947: ior
    //   4948: istore #24
    //   4950: iload #24
    //   4952: bipush #8
    //   4954: iushr
    //   4955: iload #23
    //   4957: ixor
    //   4958: ldc 16711935
    //   4960: iand
    //   4961: istore #22
    //   4963: iload #23
    //   4965: iload #22
    //   4967: ixor
    //   4968: istore #23
    //   4970: iload #24
    //   4972: iload #22
    //   4974: bipush #8
    //   4976: ishl
    //   4977: ixor
    //   4978: istore #24
    //   4980: iload #24
    //   4982: iconst_2
    //   4983: iushr
    //   4984: iload #23
    //   4986: ixor
    //   4987: ldc 858993459
    //   4989: iand
    //   4990: istore #22
    //   4992: iload #23
    //   4994: iload #22
    //   4996: ixor
    //   4997: istore #23
    //   4999: iload #24
    //   5001: iload #22
    //   5003: iconst_2
    //   5004: ishl
    //   5005: ixor
    //   5006: istore #24
    //   5008: iload #23
    //   5010: bipush #16
    //   5012: iushr
    //   5013: iload #24
    //   5015: ixor
    //   5016: ldc 65535
    //   5018: iand
    //   5019: istore #22
    //   5021: iload #24
    //   5023: iload #22
    //   5025: ixor
    //   5026: istore #24
    //   5028: iload #23
    //   5030: iload #22
    //   5032: bipush #16
    //   5034: ishl
    //   5035: ixor
    //   5036: istore #23
    //   5038: iload #23
    //   5040: iconst_4
    //   5041: iushr
    //   5042: iload #24
    //   5044: ixor
    //   5045: ldc 252645135
    //   5047: iand
    //   5048: istore #22
    //   5050: iload #24
    //   5052: iload #22
    //   5054: ixor
    //   5055: istore #24
    //   5057: iload #23
    //   5059: iload #22
    //   5061: iconst_4
    //   5062: ishl
    //   5063: ixor
    //   5064: istore #23
    //   5066: aload #17
    //   5068: iconst_0
    //   5069: iload #23
    //   5071: iastore
    //   5072: aload #17
    //   5074: iconst_1
    //   5075: iload #24
    //   5077: iastore
    //   5078: iload #19
    //   5080: bipush #8
    //   5082: imul
    //   5083: istore #27
    //   5085: iconst_0
    //   5086: istore #28
    //   5088: iload #28
    //   5090: iconst_2
    //   5091: if_icmpge -> 5180
    //   5094: aload #4
    //   5096: iload #27
    //   5098: iload #28
    //   5100: iconst_4
    //   5101: imul
    //   5102: iadd
    //   5103: aload #17
    //   5105: iload #28
    //   5107: iaload
    //   5108: bipush #24
    //   5110: iushr
    //   5111: i2b
    //   5112: bastore
    //   5113: aload #4
    //   5115: iload #27
    //   5117: iload #28
    //   5119: iconst_4
    //   5120: imul
    //   5121: iadd
    //   5122: iconst_1
    //   5123: iadd
    //   5124: aload #17
    //   5126: iload #28
    //   5128: iaload
    //   5129: bipush #16
    //   5131: iushr
    //   5132: i2b
    //   5133: bastore
    //   5134: aload #4
    //   5136: iload #27
    //   5138: iload #28
    //   5140: iconst_4
    //   5141: imul
    //   5142: iadd
    //   5143: iconst_2
    //   5144: iadd
    //   5145: aload #17
    //   5147: iload #28
    //   5149: iaload
    //   5150: bipush #8
    //   5152: iushr
    //   5153: i2b
    //   5154: bastore
    //   5155: aload #4
    //   5157: iload #27
    //   5159: iload #28
    //   5161: iconst_4
    //   5162: imul
    //   5163: iadd
    //   5164: iconst_3
    //   5165: iadd
    //   5166: aload #17
    //   5168: iload #28
    //   5170: iaload
    //   5171: i2b
    //   5172: bastore
    //   5173: iinc #28, 1
    //   5176: iload_2
    //   5177: ifne -> 5088
    //   5180: iinc #19, 1
    //   5183: iload_2
    //   5184: ifne -> 4269
    //   5187: new java/math/BigInteger
    //   5190: dup
    //   5191: aload #4
    //   5193: invokespecial <init> : ([B)V
    //   5196: invokevirtual abs : ()Ljava/math/BigInteger;
    //   5199: putstatic burp/Zzxs.Zg : Ljava/lang/Object;
    //   5202: sipush #14046
    //   5205: getstatic burp/Zxxf.ZZ : Ljava/lang/Object;
    //   5208: checkcast java/math/BigInteger
    //   5211: getstatic burp/Zeuz.Zp : Ljava/lang/Object;
    //   5214: checkcast java/math/BigInteger
    //   5217: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   5220: putstatic burp/Zrye.Zx : Ljava/lang/Object;
    //   5223: sipush #19670
    //   5226: invokestatic a : (II)Ljava/lang/String;
    //   5229: iconst_1
    //   5230: ldc burp/Ze_0
    //   5232: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5235: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5238: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5241: astore_3
    //   5242: aload_3
    //   5243: arraylength
    //   5244: istore #4
    //   5246: iconst_0
    //   5247: istore #5
    //   5249: iload #5
    //   5251: iload #4
    //   5253: if_icmpge -> 5390
    //   5256: aload_3
    //   5257: iload #5
    //   5259: aaload
    //   5260: astore #6
    //   5262: aload #6
    //   5264: invokevirtual getModifiers : ()I
    //   5267: invokestatic isStatic : (I)Z
    //   5270: ifne -> 5280
    //   5273: goto -> 5383
    //   5276: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5279: athrow
    //   5280: aload #6
    //   5282: invokevirtual getType : ()Ljava/lang/Class;
    //   5285: astore #7
    //   5287: aload #7
    //   5289: ifnull -> 5370
    //   5292: aload #7
    //   5294: invokevirtual isPrimitive : ()Z
    //   5297: ifne -> 5370
    //   5300: goto -> 5307
    //   5303: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5306: athrow
    //   5307: aload #7
    //   5309: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5312: ifnull -> 5370
    //   5315: goto -> 5322
    //   5318: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5321: athrow
    //   5322: aload #7
    //   5324: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5327: invokevirtual getName : ()Ljava/lang/String;
    //   5330: ifnull -> 5370
    //   5333: goto -> 5340
    //   5336: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5339: athrow
    //   5340: aload #7
    //   5342: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5345: invokevirtual getName : ()Ljava/lang/String;
    //   5348: sipush #14041
    //   5351: sipush #14516
    //   5354: invokestatic a : (II)Ljava/lang/String;
    //   5357: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5360: ifne -> 5370
    //   5363: goto -> 5370
    //   5366: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5369: athrow
    //   5370: aload #6
    //   5372: iconst_1
    //   5373: invokevirtual setAccessible : (Z)V
    //   5376: aload #6
    //   5378: aconst_null
    //   5379: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5382: pop
    //   5383: iinc #5, 1
    //   5386: iload_2
    //   5387: ifne -> 5249
    //   5390: sipush #14032
    //   5393: sipush #-6836
    //   5396: invokestatic a : (II)Ljava/lang/String;
    //   5399: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5402: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5405: astore_3
    //   5406: aload_3
    //   5407: arraylength
    //   5408: istore #4
    //   5410: iconst_0
    //   5411: istore #5
    //   5413: iload #5
    //   5415: iload #4
    //   5417: if_icmpge -> 5546
    //   5420: aload_3
    //   5421: iload #5
    //   5423: aaload
    //   5424: astore #6
    //   5426: aload #6
    //   5428: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5431: pop
    //   5432: aload #6
    //   5434: invokevirtual getModifiers : ()I
    //   5437: invokestatic isStatic : (I)Z
    //   5440: ifeq -> 5532
    //   5443: aload #6
    //   5445: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5448: arraylength
    //   5449: iconst_2
    //   5450: if_icmpne -> 5532
    //   5453: goto -> 5460
    //   5456: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5459: athrow
    //   5460: aload #6
    //   5462: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5465: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   5468: if_acmpne -> 5532
    //   5471: goto -> 5478
    //   5474: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5477: athrow
    //   5478: aload #6
    //   5480: iconst_1
    //   5481: invokevirtual setAccessible : (Z)V
    //   5484: aload #6
    //   5486: aconst_null
    //   5487: iconst_2
    //   5488: anewarray java/lang/Object
    //   5491: dup
    //   5492: iconst_0
    //   5493: aload_0
    //   5494: aastore
    //   5495: dup
    //   5496: iconst_1
    //   5497: aload_1
    //   5498: ifnonnull -> 5516
    //   5501: goto -> 5508
    //   5504: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5507: athrow
    //   5508: aload_1
    //   5509: goto -> 5523
    //   5512: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5515: athrow
    //   5516: aload_1
    //   5517: checkcast [B
    //   5520: invokevirtual clone : ()Ljava/lang/Object;
    //   5523: aastore
    //   5524: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5527: pop
    //   5528: iload_2
    //   5529: ifne -> 5546
    //   5532: iinc #5, 1
    //   5535: iload_2
    //   5536: ifne -> 5413
    //   5539: goto -> 5546
    //   5542: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5545: athrow
    //   5546: sipush #14042
    //   5549: sipush #7911
    //   5552: invokestatic a : (II)Ljava/lang/String;
    //   5555: iconst_1
    //   5556: ldc burp/Zbli
    //   5558: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5561: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5564: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5567: astore_3
    //   5568: aload_3
    //   5569: arraylength
    //   5570: istore #4
    //   5572: iconst_0
    //   5573: istore #5
    //   5575: iload #5
    //   5577: iload #4
    //   5579: if_icmpge -> 5716
    //   5582: aload_3
    //   5583: iload #5
    //   5585: aaload
    //   5586: astore #6
    //   5588: aload #6
    //   5590: invokevirtual getModifiers : ()I
    //   5593: invokestatic isStatic : (I)Z
    //   5596: ifne -> 5606
    //   5599: goto -> 5709
    //   5602: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5605: athrow
    //   5606: aload #6
    //   5608: invokevirtual getType : ()Ljava/lang/Class;
    //   5611: astore #7
    //   5613: aload #7
    //   5615: ifnull -> 5696
    //   5618: aload #7
    //   5620: invokevirtual isPrimitive : ()Z
    //   5623: ifne -> 5696
    //   5626: goto -> 5633
    //   5629: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5632: athrow
    //   5633: aload #7
    //   5635: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5638: ifnull -> 5696
    //   5641: goto -> 5648
    //   5644: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5647: athrow
    //   5648: aload #7
    //   5650: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5653: invokevirtual getName : ()Ljava/lang/String;
    //   5656: ifnull -> 5696
    //   5659: goto -> 5666
    //   5662: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5665: athrow
    //   5666: aload #7
    //   5668: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5671: invokevirtual getName : ()Ljava/lang/String;
    //   5674: sipush #14043
    //   5677: sipush #-5749
    //   5680: invokestatic a : (II)Ljava/lang/String;
    //   5683: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5686: ifne -> 5696
    //   5689: goto -> 5696
    //   5692: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5695: athrow
    //   5696: aload #6
    //   5698: iconst_1
    //   5699: invokevirtual setAccessible : (Z)V
    //   5702: aload #6
    //   5704: aconst_null
    //   5705: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5708: pop
    //   5709: iinc #5, 1
    //   5712: iload_2
    //   5713: ifne -> 5575
    //   5716: sipush #14035
    //   5719: sipush #28149
    //   5722: invokestatic a : (II)Ljava/lang/String;
    //   5725: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5728: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5731: astore_3
    //   5732: aload_3
    //   5733: arraylength
    //   5734: istore #4
    //   5736: iconst_0
    //   5737: istore #5
    //   5739: iload #5
    //   5741: iload #4
    //   5743: if_icmpge -> 5875
    //   5746: aload_3
    //   5747: iload #5
    //   5749: aaload
    //   5750: astore #6
    //   5752: aload #6
    //   5754: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5757: pop
    //   5758: aload #6
    //   5760: invokevirtual getModifiers : ()I
    //   5763: invokestatic isStatic : (I)Z
    //   5766: ifeq -> 5861
    //   5769: aload #6
    //   5771: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5774: arraylength
    //   5775: iconst_2
    //   5776: if_icmpne -> 5861
    //   5779: goto -> 5786
    //   5782: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5785: athrow
    //   5786: aload #6
    //   5788: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5791: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   5794: invokevirtual equals : (Ljava/lang/Object;)Z
    //   5797: ifeq -> 5861
    //   5800: goto -> 5807
    //   5803: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5806: athrow
    //   5807: aload #6
    //   5809: iconst_1
    //   5810: invokevirtual setAccessible : (Z)V
    //   5813: aload #6
    //   5815: aconst_null
    //   5816: iconst_2
    //   5817: anewarray java/lang/Object
    //   5820: dup
    //   5821: iconst_0
    //   5822: aload_0
    //   5823: aastore
    //   5824: dup
    //   5825: iconst_1
    //   5826: aload_1
    //   5827: ifnonnull -> 5845
    //   5830: goto -> 5837
    //   5833: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5836: athrow
    //   5837: aload_1
    //   5838: goto -> 5852
    //   5841: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5844: athrow
    //   5845: aload_1
    //   5846: checkcast [B
    //   5849: invokevirtual clone : ()Ljava/lang/Object;
    //   5852: aastore
    //   5853: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5856: pop
    //   5857: iload_2
    //   5858: ifne -> 5875
    //   5861: iinc #5, 1
    //   5864: iload_2
    //   5865: ifne -> 5739
    //   5868: goto -> 5875
    //   5871: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5874: athrow
    //   5875: getstatic burp/Zx4y.Zc : Ljava/lang/Object;
    //   5878: checkcast java/math/BigInteger
    //   5881: invokevirtual toByteArray : ()[B
    //   5884: astore_3
    //   5885: aload_3
    //   5886: arraylength
    //   5887: bipush #8
    //   5889: iadd
    //   5890: bipush #6
    //   5892: ishr
    //   5893: iconst_1
    //   5894: iadd
    //   5895: bipush #16
    //   5897: imul
    //   5898: newarray int
    //   5900: astore #5
    //   5902: iconst_0
    //   5903: istore #6
    //   5905: iload #6
    //   5907: aload_3
    //   5908: arraylength
    //   5909: if_icmpge -> 5952
    //   5912: aload_3
    //   5913: iload #6
    //   5915: baload
    //   5916: sipush #255
    //   5919: iand
    //   5920: istore #7
    //   5922: aload #5
    //   5924: iload #6
    //   5926: iconst_2
    //   5927: ishr
    //   5928: dup2
    //   5929: iaload
    //   5930: iload #7
    //   5932: bipush #24
    //   5934: iload #6
    //   5936: iconst_4
    //   5937: irem
    //   5938: bipush #8
    //   5940: imul
    //   5941: isub
    //   5942: ishl
    //   5943: ior
    //   5944: iastore
    //   5945: iinc #6, 1
    //   5948: iload_2
    //   5949: ifne -> 5905
    //   5952: aload #5
    //   5954: iload #6
    //   5956: iconst_2
    //   5957: ishr
    //   5958: dup2
    //   5959: iaload
    //   5960: sipush #128
    //   5963: bipush #24
    //   5965: iload #6
    //   5967: iconst_4
    //   5968: irem
    //   5969: bipush #8
    //   5971: imul
    //   5972: isub
    //   5973: ishl
    //   5974: ior
    //   5975: iastore
    //   5976: aload #5
    //   5978: aload #5
    //   5980: arraylength
    //   5981: iconst_1
    //   5982: isub
    //   5983: aload_3
    //   5984: arraylength
    //   5985: bipush #8
    //   5987: imul
    //   5988: iastore
    //   5989: bipush #80
    //   5991: newarray int
    //   5993: astore #7
    //   5995: ldc 1732584193
    //   5997: istore #8
    //   5999: ldc -271733879
    //   6001: istore #9
    //   6003: ldc -1732584194
    //   6005: istore #10
    //   6007: ldc 271733878
    //   6009: istore #11
    //   6011: ldc -1009589776
    //   6013: istore #12
    //   6015: iconst_0
    //   6016: istore #6
    //   6018: iload #6
    //   6020: aload #5
    //   6022: arraylength
    //   6023: if_icmpge -> 6345
    //   6026: iload #8
    //   6028: istore #13
    //   6030: iload #9
    //   6032: istore #14
    //   6034: iload #10
    //   6036: istore #15
    //   6038: iload #11
    //   6040: istore #16
    //   6042: iload #12
    //   6044: istore #17
    //   6046: iconst_0
    //   6047: istore #18
    //   6049: iload #18
    //   6051: bipush #80
    //   6053: if_icmpge -> 6303
    //   6056: iload #18
    //   6058: bipush #16
    //   6060: if_icmpge -> 6087
    //   6063: aload #7
    //   6065: iload #18
    //   6067: aload #5
    //   6069: iload #6
    //   6071: iload #18
    //   6073: iadd
    //   6074: iaload
    //   6075: iastore
    //   6076: iload_2
    //   6077: ifne -> 6142
    //   6080: goto -> 6087
    //   6083: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6086: athrow
    //   6087: aload #7
    //   6089: iload #18
    //   6091: iconst_3
    //   6092: isub
    //   6093: iaload
    //   6094: aload #7
    //   6096: iload #18
    //   6098: bipush #8
    //   6100: isub
    //   6101: iaload
    //   6102: ixor
    //   6103: aload #7
    //   6105: iload #18
    //   6107: bipush #14
    //   6109: isub
    //   6110: iaload
    //   6111: ixor
    //   6112: aload #7
    //   6114: iload #18
    //   6116: bipush #16
    //   6118: isub
    //   6119: iaload
    //   6120: ixor
    //   6121: istore #19
    //   6123: iload #19
    //   6125: iconst_1
    //   6126: ishl
    //   6127: iload #19
    //   6129: bipush #31
    //   6131: iushr
    //   6132: ior
    //   6133: istore #20
    //   6135: aload #7
    //   6137: iload #18
    //   6139: iload #20
    //   6141: iastore
    //   6142: iload #8
    //   6144: iconst_5
    //   6145: ishl
    //   6146: iload #8
    //   6148: bipush #27
    //   6150: iushr
    //   6151: ior
    //   6152: istore #19
    //   6154: iload #19
    //   6156: iload #12
    //   6158: iadd
    //   6159: aload #7
    //   6161: iload #18
    //   6163: iaload
    //   6164: iadd
    //   6165: iload #18
    //   6167: bipush #20
    //   6169: if_icmpge -> 6195
    //   6172: ldc 1518500249
    //   6174: iload #9
    //   6176: iload #10
    //   6178: iand
    //   6179: iload #9
    //   6181: iconst_m1
    //   6182: ixor
    //   6183: iload #11
    //   6185: iand
    //   6186: ior
    //   6187: iadd
    //   6188: goto -> 6265
    //   6191: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6194: athrow
    //   6195: iload #18
    //   6197: bipush #40
    //   6199: if_icmpge -> 6220
    //   6202: ldc 1859775393
    //   6204: iload #9
    //   6206: iload #10
    //   6208: ixor
    //   6209: iload #11
    //   6211: ixor
    //   6212: iadd
    //   6213: goto -> 6265
    //   6216: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6219: athrow
    //   6220: iload #18
    //   6222: bipush #60
    //   6224: if_icmpge -> 6254
    //   6227: ldc -1894007588
    //   6229: iload #9
    //   6231: iload #10
    //   6233: iand
    //   6234: iload #9
    //   6236: iload #11
    //   6238: iand
    //   6239: ior
    //   6240: iload #10
    //   6242: iload #11
    //   6244: iand
    //   6245: ior
    //   6246: iadd
    //   6247: goto -> 6265
    //   6250: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6253: athrow
    //   6254: ldc -899497514
    //   6256: iload #9
    //   6258: iload #10
    //   6260: ixor
    //   6261: iload #11
    //   6263: ixor
    //   6264: iadd
    //   6265: iadd
    //   6266: istore #20
    //   6268: iload #11
    //   6270: istore #12
    //   6272: iload #10
    //   6274: istore #11
    //   6276: iload #9
    //   6278: bipush #30
    //   6280: ishl
    //   6281: iload #9
    //   6283: iconst_2
    //   6284: iushr
    //   6285: ior
    //   6286: istore #10
    //   6288: iload #8
    //   6290: istore #9
    //   6292: iload #20
    //   6294: istore #8
    //   6296: iinc #18, 1
    //   6299: iload_2
    //   6300: ifne -> 6049
    //   6303: iload #8
    //   6305: iload #13
    //   6307: iadd
    //   6308: istore #8
    //   6310: iload #9
    //   6312: iload #14
    //   6314: iadd
    //   6315: istore #9
    //   6317: iload #10
    //   6319: iload #15
    //   6321: iadd
    //   6322: istore #10
    //   6324: iload #11
    //   6326: iload #16
    //   6328: iadd
    //   6329: istore #11
    //   6331: iload #12
    //   6333: iload #17
    //   6335: iadd
    //   6336: istore #12
    //   6338: iinc #6, 16
    //   6341: iload_2
    //   6342: ifne -> 6018
    //   6345: iconst_5
    //   6346: newarray int
    //   6348: dup
    //   6349: iconst_0
    //   6350: iload #8
    //   6352: iastore
    //   6353: dup
    //   6354: iconst_1
    //   6355: iload #9
    //   6357: iastore
    //   6358: dup
    //   6359: iconst_2
    //   6360: iload #10
    //   6362: iastore
    //   6363: dup
    //   6364: iconst_3
    //   6365: iload #11
    //   6367: iastore
    //   6368: dup
    //   6369: iconst_4
    //   6370: iload #12
    //   6372: iastore
    //   6373: astore #13
    //   6375: bipush #20
    //   6377: newarray byte
    //   6379: astore #14
    //   6381: iconst_0
    //   6382: istore #15
    //   6384: iload #15
    //   6386: bipush #20
    //   6388: if_icmpge -> 6429
    //   6391: aload #13
    //   6393: iload #15
    //   6395: iconst_4
    //   6396: idiv
    //   6397: iaload
    //   6398: istore #16
    //   6400: iconst_3
    //   6401: iload #15
    //   6403: iconst_4
    //   6404: irem
    //   6405: isub
    //   6406: bipush #8
    //   6408: imul
    //   6409: istore #17
    //   6411: aload #14
    //   6413: iload #15
    //   6415: iload #16
    //   6417: iload #17
    //   6419: iushr
    //   6420: i2b
    //   6421: bastore
    //   6422: iinc #15, 1
    //   6425: iload_2
    //   6426: ifne -> 6384
    //   6429: aload #14
    //   6431: astore #4
    //   6433: sipush #14038
    //   6436: iconst_0
    //   6437: istore_3
    //   6438: sipush #19153
    //   6441: invokestatic a : (II)Ljava/lang/String;
    //   6444: iconst_1
    //   6445: ldc burp/Zsde
    //   6447: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   6450: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   6453: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   6456: astore #4
    //   6458: aload #4
    //   6460: arraylength
    //   6461: istore #5
    //   6463: iconst_0
    //   6464: istore #6
    //   6466: iload #6
    //   6468: iload #5
    //   6470: if_icmpge -> 6608
    //   6473: aload #4
    //   6475: iload #6
    //   6477: aaload
    //   6478: astore #7
    //   6480: aload #7
    //   6482: invokevirtual getModifiers : ()I
    //   6485: invokestatic isStatic : (I)Z
    //   6488: ifne -> 6498
    //   6491: goto -> 6601
    //   6494: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6497: athrow
    //   6498: aload #7
    //   6500: invokevirtual getType : ()Ljava/lang/Class;
    //   6503: astore #8
    //   6505: aload #8
    //   6507: ifnull -> 6588
    //   6510: aload #8
    //   6512: invokevirtual isPrimitive : ()Z
    //   6515: ifne -> 6588
    //   6518: goto -> 6525
    //   6521: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6524: athrow
    //   6525: aload #8
    //   6527: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6530: ifnull -> 6588
    //   6533: goto -> 6540
    //   6536: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6539: athrow
    //   6540: aload #8
    //   6542: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6545: invokevirtual getName : ()Ljava/lang/String;
    //   6548: ifnull -> 6588
    //   6551: goto -> 6558
    //   6554: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6557: athrow
    //   6558: aload #8
    //   6560: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6563: invokevirtual getName : ()Ljava/lang/String;
    //   6566: sipush #14043
    //   6569: sipush #-5749
    //   6572: invokestatic a : (II)Ljava/lang/String;
    //   6575: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   6578: ifne -> 6588
    //   6581: goto -> 6588
    //   6584: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6587: athrow
    //   6588: aload #7
    //   6590: iconst_1
    //   6591: invokevirtual setAccessible : (Z)V
    //   6594: aload #7
    //   6596: aconst_null
    //   6597: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   6600: pop
    //   6601: iinc #6, 1
    //   6604: iload_2
    //   6605: ifne -> 6466
    //   6608: sipush #14047
    //   6611: sipush #-28219
    //   6614: invokestatic a : (II)Ljava/lang/String;
    //   6617: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   6620: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   6623: astore #4
    //   6625: aload #4
    //   6627: arraylength
    //   6628: istore #5
    //   6630: iconst_0
    //   6631: istore #6
    //   6633: iload #6
    //   6635: iload #5
    //   6637: if_icmpge -> 6773
    //   6640: aload #4
    //   6642: iload #6
    //   6644: aaload
    //   6645: astore #7
    //   6647: aload #7
    //   6649: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6652: pop
    //   6653: aload #7
    //   6655: invokevirtual getModifiers : ()I
    //   6658: invokestatic isStatic : (I)Z
    //   6661: ifeq -> 6759
    //   6664: aload #7
    //   6666: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6669: arraylength
    //   6670: iconst_2
    //   6671: if_icmpne -> 6759
    //   6674: goto -> 6681
    //   6677: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6680: athrow
    //   6681: aload #7
    //   6683: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   6686: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   6689: if_acmpne -> 6759
    //   6692: goto -> 6699
    //   6695: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6698: athrow
    //   6699: aload #7
    //   6701: iconst_1
    //   6702: invokevirtual setAccessible : (Z)V
    //   6705: aload #7
    //   6707: aconst_null
    //   6708: iconst_2
    //   6709: anewarray java/lang/Object
    //   6712: dup
    //   6713: iconst_0
    //   6714: aload_0
    //   6715: aastore
    //   6716: dup
    //   6717: iconst_1
    //   6718: aload_1
    //   6719: ifnonnull -> 6737
    //   6722: goto -> 6729
    //   6725: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6728: athrow
    //   6729: aload_1
    //   6730: goto -> 6744
    //   6733: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6736: athrow
    //   6737: aload_1
    //   6738: checkcast [B
    //   6741: invokevirtual clone : ()Ljava/lang/Object;
    //   6744: aastore
    //   6745: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   6748: checkcast java/lang/Boolean
    //   6751: invokevirtual booleanValue : ()Z
    //   6754: istore_3
    //   6755: iload_2
    //   6756: ifne -> 6773
    //   6759: iinc #6, 1
    //   6762: iload_2
    //   6763: ifne -> 6633
    //   6766: goto -> 6773
    //   6769: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6772: athrow
    //   6773: iload_3
    //   6774: ireturn
    //   6775: astore_3
    //   6776: new java/lang/Exception
    //   6779: dup
    //   6780: aload_3
    //   6781: invokevirtual getMessage : ()Ljava/lang/String;
    //   6784: invokespecial <init> : (Ljava/lang/String;)V
    //   6787: athrow
    // Exception table:
    //   from	to	target	type
    //   4	6774	6775	java/lang/Throwable
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
    //   5262	5276	5276	java/lang/Throwable
    //   5287	5300	5303	java/lang/Throwable
    //   5292	5315	5318	java/lang/Throwable
    //   5307	5333	5336	java/lang/Throwable
    //   5322	5363	5366	java/lang/Throwable
    //   5426	5453	5456	java/lang/Throwable
    //   5443	5471	5474	java/lang/Throwable
    //   5460	5501	5504	java/lang/Throwable
    //   5478	5512	5512	java/lang/Throwable
    //   5523	5539	5542	java/lang/Throwable
    //   5588	5602	5602	java/lang/Throwable
    //   5613	5626	5629	java/lang/Throwable
    //   5618	5641	5644	java/lang/Throwable
    //   5633	5659	5662	java/lang/Throwable
    //   5648	5689	5692	java/lang/Throwable
    //   5752	5779	5782	java/lang/Throwable
    //   5769	5800	5803	java/lang/Throwable
    //   5786	5830	5833	java/lang/Throwable
    //   5807	5841	5841	java/lang/Throwable
    //   5852	5868	5871	java/lang/Throwable
    //   6056	6080	6083	java/lang/Throwable
    //   6154	6191	6191	java/lang/Throwable
    //   6195	6216	6216	java/lang/Throwable
    //   6220	6250	6250	java/lang/Throwable
    //   6480	6494	6494	java/lang/Throwable
    //   6505	6518	6521	java/lang/Throwable
    //   6510	6533	6536	java/lang/Throwable
    //   6525	6551	6554	java/lang/Throwable
    //   6540	6581	6584	java/lang/Throwable
    //   6647	6674	6677	java/lang/Throwable
    //   6664	6692	6695	java/lang/Throwable
    //   6681	6722	6725	java/lang/Throwable
    //   6699	6733	6733	java/lang/Throwable
    //   6755	6766	6769	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #14
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc ' q\\fyp\\r#M¨Zrö,ør©ÛI¿áBº}ëW\\rýJ"¸®UGawÛOøì>ÀvU©\\tn²4?CËÕªQwöj¶ÂX"íJ)¬K©½\\tq6&7møD\\b\\tr VC;ÁyÊ4M£*VßEòc=FÃÐósàlpÄÖ {<nD,Z¥èB¹¦ÓPæ\;\\fðÙ÷Ù`%êcï6by¿`OÕÕ,ü\\tÍ\\tÏù®Î|Í`õ 4Ï\\t3îÃa+ò(¯ÓB6îÐ"çÉdÎ×\=¼ ýp+¿ÍVÖµ E@p¤óKX&SÖâúpSbK>¡`Ë.\\t_Ùól$ärïå ¤S\\tþ©Çb\\tå \\rã'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #26
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
    //   68: ldc '\\thÜ%iü\\t\\nÉäÓÐn²'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #77
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
    //   129: putstatic burp/Ztys.a : [Ljava/lang/String;
    //   132: bipush #14
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Ztys.b : [Ljava/lang/String;
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
    //   212: bipush #75
    //   214: goto -> 244
    //   217: bipush #21
    //   219: goto -> 244
    //   222: bipush #116
    //   224: goto -> 244
    //   227: bipush #7
    //   229: goto -> 244
    //   232: bipush #52
    //   234: goto -> 244
    //   237: bipush #52
    //   239: goto -> 244
    //   242: bipush #77
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
    //   304: sipush #14034
    //   307: sipush #7550
    //   310: invokestatic a : (II)Ljava/lang/String;
    //   313: invokespecial <init> : (Ljava/lang/String;)V
    //   316: putstatic burp/Ztys.Zs : Ljava/lang/Object;
    //   319: sipush #14036
    //   322: sipush #18579
    //   325: invokestatic a : (II)Ljava/lang/String;
    //   328: putstatic burp/Ztys.Zn : Ljava/lang/String;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x36D3) & 0xFFFF;
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
      char c = 'ï';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztys.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */