package burp;

import java.math.BigInteger;

class Zgs6 extends ClassLoader {
  static String ZD;
  
  static Object Za;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zq(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void Zt(Object paramObject) {
    Zmdm.Za = a(-20263, 119);
    Zmdm.ZZ = new BigInteger(a(-20265, -9022));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zmdm.Za.charAt(Math.abs(((BigInteger)Zmfw.ZS).intValue() % 32)) > Zrp3.Zf.charAt(Math.abs(((BigInteger)Zmdm.ZZ).intValue() % 32))) {
          try {
            Zrdy.Zn(Class.forName(a(-20279, 21543)));
            if (!bool)
              Zsf4.ZF(Class.forName(a(-20261, 30260))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zsf4.ZF(Class.forName(a(-20261, 30260)));
    } catch (Throwable throwable) {}
  }
  
  static boolean Zs(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zzoc.Zx : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: invokevirtual toByteArray : ()[B
    //   13: astore_3
    //   14: aload_3
    //   15: arraylength
    //   16: bipush #8
    //   18: iadd
    //   19: bipush #6
    //   21: ishr
    //   22: iconst_1
    //   23: iadd
    //   24: bipush #16
    //   26: imul
    //   27: newarray int
    //   29: astore #5
    //   31: iconst_0
    //   32: istore #6
    //   34: iload #6
    //   36: aload_3
    //   37: arraylength
    //   38: if_icmpge -> 81
    //   41: aload_3
    //   42: iload #6
    //   44: baload
    //   45: sipush #255
    //   48: iand
    //   49: istore #7
    //   51: aload #5
    //   53: iload #6
    //   55: iconst_2
    //   56: ishr
    //   57: dup2
    //   58: iaload
    //   59: iload #7
    //   61: bipush #24
    //   63: iload #6
    //   65: iconst_4
    //   66: irem
    //   67: bipush #8
    //   69: imul
    //   70: isub
    //   71: ishl
    //   72: ior
    //   73: iastore
    //   74: iinc #6, 1
    //   77: iload_2
    //   78: ifeq -> 34
    //   81: aload #5
    //   83: iload #6
    //   85: iconst_2
    //   86: ishr
    //   87: dup2
    //   88: iaload
    //   89: sipush #128
    //   92: bipush #24
    //   94: iload #6
    //   96: iconst_4
    //   97: irem
    //   98: bipush #8
    //   100: imul
    //   101: isub
    //   102: ishl
    //   103: ior
    //   104: iastore
    //   105: aload #5
    //   107: aload #5
    //   109: arraylength
    //   110: iconst_1
    //   111: isub
    //   112: aload_3
    //   113: arraylength
    //   114: bipush #8
    //   116: imul
    //   117: iastore
    //   118: bipush #80
    //   120: newarray int
    //   122: astore #7
    //   124: ldc 1732584193
    //   126: istore #8
    //   128: ldc -271733879
    //   130: istore #9
    //   132: ldc -1732584194
    //   134: istore #10
    //   136: ldc 271733878
    //   138: istore #11
    //   140: ldc -1009589776
    //   142: istore #12
    //   144: iconst_0
    //   145: istore #6
    //   147: iload #6
    //   149: aload #5
    //   151: arraylength
    //   152: if_icmpge -> 474
    //   155: iload #8
    //   157: istore #13
    //   159: iload #9
    //   161: istore #14
    //   163: iload #10
    //   165: istore #15
    //   167: iload #11
    //   169: istore #16
    //   171: iload #12
    //   173: istore #17
    //   175: iconst_0
    //   176: istore #18
    //   178: iload #18
    //   180: bipush #80
    //   182: if_icmpge -> 432
    //   185: iload #18
    //   187: bipush #16
    //   189: if_icmpge -> 216
    //   192: aload #7
    //   194: iload #18
    //   196: aload #5
    //   198: iload #6
    //   200: iload #18
    //   202: iadd
    //   203: iaload
    //   204: iastore
    //   205: iload_2
    //   206: ifeq -> 271
    //   209: goto -> 216
    //   212: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   215: athrow
    //   216: aload #7
    //   218: iload #18
    //   220: iconst_3
    //   221: isub
    //   222: iaload
    //   223: aload #7
    //   225: iload #18
    //   227: bipush #8
    //   229: isub
    //   230: iaload
    //   231: ixor
    //   232: aload #7
    //   234: iload #18
    //   236: bipush #14
    //   238: isub
    //   239: iaload
    //   240: ixor
    //   241: aload #7
    //   243: iload #18
    //   245: bipush #16
    //   247: isub
    //   248: iaload
    //   249: ixor
    //   250: istore #19
    //   252: iload #19
    //   254: iconst_1
    //   255: ishl
    //   256: iload #19
    //   258: bipush #31
    //   260: iushr
    //   261: ior
    //   262: istore #20
    //   264: aload #7
    //   266: iload #18
    //   268: iload #20
    //   270: iastore
    //   271: iload #8
    //   273: iconst_5
    //   274: ishl
    //   275: iload #8
    //   277: bipush #27
    //   279: iushr
    //   280: ior
    //   281: istore #19
    //   283: iload #19
    //   285: iload #12
    //   287: iadd
    //   288: aload #7
    //   290: iload #18
    //   292: iaload
    //   293: iadd
    //   294: iload #18
    //   296: bipush #20
    //   298: if_icmpge -> 324
    //   301: ldc 1518500249
    //   303: iload #9
    //   305: iload #10
    //   307: iand
    //   308: iload #9
    //   310: iconst_m1
    //   311: ixor
    //   312: iload #11
    //   314: iand
    //   315: ior
    //   316: iadd
    //   317: goto -> 394
    //   320: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   323: athrow
    //   324: iload #18
    //   326: bipush #40
    //   328: if_icmpge -> 349
    //   331: ldc 1859775393
    //   333: iload #9
    //   335: iload #10
    //   337: ixor
    //   338: iload #11
    //   340: ixor
    //   341: iadd
    //   342: goto -> 394
    //   345: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   348: athrow
    //   349: iload #18
    //   351: bipush #60
    //   353: if_icmpge -> 383
    //   356: ldc -1894007588
    //   358: iload #9
    //   360: iload #10
    //   362: iand
    //   363: iload #9
    //   365: iload #11
    //   367: iand
    //   368: ior
    //   369: iload #10
    //   371: iload #11
    //   373: iand
    //   374: ior
    //   375: iadd
    //   376: goto -> 394
    //   379: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   382: athrow
    //   383: ldc -899497514
    //   385: iload #9
    //   387: iload #10
    //   389: ixor
    //   390: iload #11
    //   392: ixor
    //   393: iadd
    //   394: iadd
    //   395: istore #20
    //   397: iload #11
    //   399: istore #12
    //   401: iload #10
    //   403: istore #11
    //   405: iload #9
    //   407: bipush #30
    //   409: ishl
    //   410: iload #9
    //   412: iconst_2
    //   413: iushr
    //   414: ior
    //   415: istore #10
    //   417: iload #8
    //   419: istore #9
    //   421: iload #20
    //   423: istore #8
    //   425: iinc #18, 1
    //   428: iload_2
    //   429: ifeq -> 178
    //   432: iload #8
    //   434: iload #13
    //   436: iadd
    //   437: istore #8
    //   439: iload #9
    //   441: iload #14
    //   443: iadd
    //   444: istore #9
    //   446: iload #10
    //   448: iload #15
    //   450: iadd
    //   451: istore #10
    //   453: iload #11
    //   455: iload #16
    //   457: iadd
    //   458: istore #11
    //   460: iload #12
    //   462: iload #17
    //   464: iadd
    //   465: istore #12
    //   467: iinc #6, 16
    //   470: iload_2
    //   471: ifeq -> 147
    //   474: iconst_5
    //   475: newarray int
    //   477: dup
    //   478: iconst_0
    //   479: iload #8
    //   481: iastore
    //   482: dup
    //   483: iconst_1
    //   484: iload #9
    //   486: iastore
    //   487: dup
    //   488: iconst_2
    //   489: iload #10
    //   491: iastore
    //   492: dup
    //   493: iconst_3
    //   494: iload #11
    //   496: iastore
    //   497: dup
    //   498: iconst_4
    //   499: iload #12
    //   501: iastore
    //   502: astore #13
    //   504: bipush #20
    //   506: newarray byte
    //   508: astore #14
    //   510: iconst_0
    //   511: istore #15
    //   513: iload #15
    //   515: bipush #20
    //   517: if_icmpge -> 558
    //   520: aload #13
    //   522: iload #15
    //   524: iconst_4
    //   525: idiv
    //   526: iaload
    //   527: istore #16
    //   529: iconst_3
    //   530: iload #15
    //   532: iconst_4
    //   533: irem
    //   534: isub
    //   535: bipush #8
    //   537: imul
    //   538: istore #17
    //   540: aload #14
    //   542: iload #15
    //   544: iload #16
    //   546: iload #17
    //   548: iushr
    //   549: i2b
    //   550: bastore
    //   551: iinc #15, 1
    //   554: iload_2
    //   555: ifeq -> 513
    //   558: aload #14
    //   560: astore #4
    //   562: new java/math/BigInteger
    //   565: dup
    //   566: aload #4
    //   568: invokespecial <init> : ([B)V
    //   571: invokevirtual abs : ()Ljava/math/BigInteger;
    //   574: putstatic burp/Zxee.Zj : Ljava/lang/Object;
    //   577: getstatic burp/Zs56.ZC : Ljava/lang/Object;
    //   580: checkcast java/math/BigInteger
    //   583: invokevirtual toByteArray : ()[B
    //   586: astore_3
    //   587: bipush #32
    //   589: newarray int
    //   591: dup
    //   592: iconst_0
    //   593: ldc 943331329
    //   595: iastore
    //   596: dup
    //   597: iconst_1
    //   598: ldc 170788368
    //   600: iastore
    //   601: dup
    //   602: iconst_2
    //   603: ldc 1008414755
    //   605: iastore
    //   606: dup
    //   607: iconst_3
    //   608: ldc 187049985
    //   610: iastore
    //   611: dup
    //   612: iconst_4
    //   613: ldc 1010368540
    //   615: iastore
    //   616: dup
    //   617: iconst_5
    //   618: ldc 220604441
    //   620: iastore
    //   621: dup
    //   622: bipush #6
    //   624: ldc 940377620
    //   626: iastore
    //   627: dup
    //   628: bipush #7
    //   630: ldc 255209728
    //   632: iastore
    //   633: dup
    //   634: bipush #8
    //   636: ldc 689771012
    //   638: iastore
    //   639: dup
    //   640: bipush #9
    //   642: ldc 221709344
    //   644: iastore
    //   645: dup
    //   646: bipush #10
    //   648: ldc 957157408
    //   650: iastore
    //   651: dup
    //   652: bipush #11
    //   654: ldc 892536332
    //   656: iastore
    //   657: dup
    //   658: bipush #12
    //   660: ldc 722417666
    //   662: iastore
    //   663: dup
    //   664: bipush #13
    //   666: ldc 1026621720
    //   668: iastore
    //   669: dup
    //   670: bipush #14
    //   672: ldc 655302664
    //   674: iastore
    //   675: dup
    //   676: bipush #15
    //   678: ldc 890966315
    //   680: iastore
    //   681: dup
    //   682: bipush #16
    //   684: ldc 187632156
    //   686: iastore
    //   687: dup
    //   688: bipush #17
    //   690: ldc 874189824
    //   692: iastore
    //   693: dup
    //   694: bipush #18
    //   696: ldc 254150144
    //   698: iastore
    //   699: dup
    //   700: bipush #19
    //   702: ldc 924386310
    //   704: iastore
    //   705: dup
    //   706: bipush #20
    //   708: ldc 121057538
    //   710: iastore
    //   711: dup
    //   712: bipush #21
    //   714: ldc 840500228
    //   716: iastore
    //   717: dup
    //   718: bipush #22
    //   720: ldc 389160971
    //   722: iastore
    //   723: dup
    //   724: bipush #23
    //   726: ldc 907870729
    //   728: iastore
    //   729: dup
    //   730: bipush #24
    //   732: ldc 389426184
    //   734: iastore
    //   735: dup
    //   736: bipush #25
    //   738: ldc 973875457
    //   740: iastore
    //   741: dup
    //   742: bipush #26
    //   744: ldc 372376604
    //   746: iastore
    //   747: dup
    //   748: bipush #27
    //   750: ldc 707731490
    //   752: iastore
    //   753: dup
    //   754: bipush #28
    //   756: ldc 1043334948
    //   758: iastore
    //   759: dup
    //   760: bipush #29
    //   762: ldc 439222784
    //   764: iastore
    //   765: dup
    //   766: bipush #30
    //   768: ldc 876216579
    //   770: iastore
    //   771: dup
    //   772: bipush #31
    //   774: ldc 455999525
    //   776: iastore
    //   777: astore #5
    //   779: bipush #8
    //   781: aload_3
    //   782: arraylength
    //   783: bipush #8
    //   785: irem
    //   786: isub
    //   787: istore #6
    //   789: aload_3
    //   790: arraylength
    //   791: iload #6
    //   793: iadd
    //   794: newarray byte
    //   796: astore #7
    //   798: iconst_0
    //   799: istore #8
    //   801: iload #8
    //   803: aload_3
    //   804: arraylength
    //   805: if_icmpge -> 824
    //   808: aload #7
    //   810: iload #8
    //   812: aload_3
    //   813: iload #8
    //   815: baload
    //   816: bastore
    //   817: iinc #8, 1
    //   820: iload_2
    //   821: ifeq -> 801
    //   824: aload_3
    //   825: arraylength
    //   826: istore #8
    //   828: iload #8
    //   830: aload #7
    //   832: arraylength
    //   833: if_icmpge -> 851
    //   836: aload #7
    //   838: iload #8
    //   840: iload #6
    //   842: i2b
    //   843: bastore
    //   844: iinc #8, 1
    //   847: iload_2
    //   848: ifeq -> 828
    //   851: aload #7
    //   853: astore_3
    //   854: bipush #64
    //   856: newarray int
    //   858: dup
    //   859: iconst_0
    //   860: ldc 16843776
    //   862: iastore
    //   863: dup
    //   864: iconst_1
    //   865: iconst_0
    //   866: iastore
    //   867: dup
    //   868: iconst_2
    //   869: ldc 65536
    //   871: iastore
    //   872: dup
    //   873: iconst_3
    //   874: ldc 16843780
    //   876: iastore
    //   877: dup
    //   878: iconst_4
    //   879: ldc 16842756
    //   881: iastore
    //   882: dup
    //   883: iconst_5
    //   884: ldc 66564
    //   886: iastore
    //   887: dup
    //   888: bipush #6
    //   890: iconst_4
    //   891: iastore
    //   892: dup
    //   893: bipush #7
    //   895: ldc 65536
    //   897: iastore
    //   898: dup
    //   899: bipush #8
    //   901: sipush #1024
    //   904: iastore
    //   905: dup
    //   906: bipush #9
    //   908: ldc 16843776
    //   910: iastore
    //   911: dup
    //   912: bipush #10
    //   914: ldc 16843780
    //   916: iastore
    //   917: dup
    //   918: bipush #11
    //   920: sipush #1024
    //   923: iastore
    //   924: dup
    //   925: bipush #12
    //   927: ldc 16778244
    //   929: iastore
    //   930: dup
    //   931: bipush #13
    //   933: ldc 16842756
    //   935: iastore
    //   936: dup
    //   937: bipush #14
    //   939: ldc 16777216
    //   941: iastore
    //   942: dup
    //   943: bipush #15
    //   945: iconst_4
    //   946: iastore
    //   947: dup
    //   948: bipush #16
    //   950: sipush #1028
    //   953: iastore
    //   954: dup
    //   955: bipush #17
    //   957: ldc 16778240
    //   959: iastore
    //   960: dup
    //   961: bipush #18
    //   963: ldc 16778240
    //   965: iastore
    //   966: dup
    //   967: bipush #19
    //   969: ldc 66560
    //   971: iastore
    //   972: dup
    //   973: bipush #20
    //   975: ldc 66560
    //   977: iastore
    //   978: dup
    //   979: bipush #21
    //   981: ldc 16842752
    //   983: iastore
    //   984: dup
    //   985: bipush #22
    //   987: ldc 16842752
    //   989: iastore
    //   990: dup
    //   991: bipush #23
    //   993: ldc 16778244
    //   995: iastore
    //   996: dup
    //   997: bipush #24
    //   999: ldc 65540
    //   1001: iastore
    //   1002: dup
    //   1003: bipush #25
    //   1005: ldc 16777220
    //   1007: iastore
    //   1008: dup
    //   1009: bipush #26
    //   1011: ldc 16777220
    //   1013: iastore
    //   1014: dup
    //   1015: bipush #27
    //   1017: ldc 65540
    //   1019: iastore
    //   1020: dup
    //   1021: bipush #28
    //   1023: iconst_0
    //   1024: iastore
    //   1025: dup
    //   1026: bipush #29
    //   1028: sipush #1028
    //   1031: iastore
    //   1032: dup
    //   1033: bipush #30
    //   1035: ldc 66564
    //   1037: iastore
    //   1038: dup
    //   1039: bipush #31
    //   1041: ldc 16777216
    //   1043: iastore
    //   1044: dup
    //   1045: bipush #32
    //   1047: ldc 65536
    //   1049: iastore
    //   1050: dup
    //   1051: bipush #33
    //   1053: ldc 16843780
    //   1055: iastore
    //   1056: dup
    //   1057: bipush #34
    //   1059: iconst_4
    //   1060: iastore
    //   1061: dup
    //   1062: bipush #35
    //   1064: ldc 16842752
    //   1066: iastore
    //   1067: dup
    //   1068: bipush #36
    //   1070: ldc 16843776
    //   1072: iastore
    //   1073: dup
    //   1074: bipush #37
    //   1076: ldc 16777216
    //   1078: iastore
    //   1079: dup
    //   1080: bipush #38
    //   1082: ldc 16777216
    //   1084: iastore
    //   1085: dup
    //   1086: bipush #39
    //   1088: sipush #1024
    //   1091: iastore
    //   1092: dup
    //   1093: bipush #40
    //   1095: ldc 16842756
    //   1097: iastore
    //   1098: dup
    //   1099: bipush #41
    //   1101: ldc 65536
    //   1103: iastore
    //   1104: dup
    //   1105: bipush #42
    //   1107: ldc 66560
    //   1109: iastore
    //   1110: dup
    //   1111: bipush #43
    //   1113: ldc 16777220
    //   1115: iastore
    //   1116: dup
    //   1117: bipush #44
    //   1119: sipush #1024
    //   1122: iastore
    //   1123: dup
    //   1124: bipush #45
    //   1126: iconst_4
    //   1127: iastore
    //   1128: dup
    //   1129: bipush #46
    //   1131: ldc 16778244
    //   1133: iastore
    //   1134: dup
    //   1135: bipush #47
    //   1137: ldc 66564
    //   1139: iastore
    //   1140: dup
    //   1141: bipush #48
    //   1143: ldc 16843780
    //   1145: iastore
    //   1146: dup
    //   1147: bipush #49
    //   1149: ldc 65540
    //   1151: iastore
    //   1152: dup
    //   1153: bipush #50
    //   1155: ldc 16842752
    //   1157: iastore
    //   1158: dup
    //   1159: bipush #51
    //   1161: ldc 16778244
    //   1163: iastore
    //   1164: dup
    //   1165: bipush #52
    //   1167: ldc 16777220
    //   1169: iastore
    //   1170: dup
    //   1171: bipush #53
    //   1173: sipush #1028
    //   1176: iastore
    //   1177: dup
    //   1178: bipush #54
    //   1180: ldc 66564
    //   1182: iastore
    //   1183: dup
    //   1184: bipush #55
    //   1186: ldc 16843776
    //   1188: iastore
    //   1189: dup
    //   1190: bipush #56
    //   1192: sipush #1028
    //   1195: iastore
    //   1196: dup
    //   1197: bipush #57
    //   1199: ldc 16778240
    //   1201: iastore
    //   1202: dup
    //   1203: bipush #58
    //   1205: ldc 16778240
    //   1207: iastore
    //   1208: dup
    //   1209: bipush #59
    //   1211: iconst_0
    //   1212: iastore
    //   1213: dup
    //   1214: bipush #60
    //   1216: ldc 65540
    //   1218: iastore
    //   1219: dup
    //   1220: bipush #61
    //   1222: ldc 66560
    //   1224: iastore
    //   1225: dup
    //   1226: bipush #62
    //   1228: iconst_0
    //   1229: iastore
    //   1230: dup
    //   1231: bipush #63
    //   1233: ldc 16842756
    //   1235: iastore
    //   1236: astore #8
    //   1238: bipush #64
    //   1240: newarray int
    //   1242: dup
    //   1243: iconst_0
    //   1244: ldc -2146402272
    //   1246: iastore
    //   1247: dup
    //   1248: iconst_1
    //   1249: ldc -2147450880
    //   1251: iastore
    //   1252: dup
    //   1253: iconst_2
    //   1254: ldc 32768
    //   1256: iastore
    //   1257: dup
    //   1258: iconst_3
    //   1259: ldc 1081376
    //   1261: iastore
    //   1262: dup
    //   1263: iconst_4
    //   1264: ldc 1048576
    //   1266: iastore
    //   1267: dup
    //   1268: iconst_5
    //   1269: bipush #32
    //   1271: iastore
    //   1272: dup
    //   1273: bipush #6
    //   1275: ldc -2146435040
    //   1277: iastore
    //   1278: dup
    //   1279: bipush #7
    //   1281: ldc -2147450848
    //   1283: iastore
    //   1284: dup
    //   1285: bipush #8
    //   1287: ldc -2147483616
    //   1289: iastore
    //   1290: dup
    //   1291: bipush #9
    //   1293: ldc -2146402272
    //   1295: iastore
    //   1296: dup
    //   1297: bipush #10
    //   1299: ldc -2146402304
    //   1301: iastore
    //   1302: dup
    //   1303: bipush #11
    //   1305: ldc -2147483648
    //   1307: iastore
    //   1308: dup
    //   1309: bipush #12
    //   1311: ldc -2147450880
    //   1313: iastore
    //   1314: dup
    //   1315: bipush #13
    //   1317: ldc 1048576
    //   1319: iastore
    //   1320: dup
    //   1321: bipush #14
    //   1323: bipush #32
    //   1325: iastore
    //   1326: dup
    //   1327: bipush #15
    //   1329: ldc -2146435040
    //   1331: iastore
    //   1332: dup
    //   1333: bipush #16
    //   1335: ldc 1081344
    //   1337: iastore
    //   1338: dup
    //   1339: bipush #17
    //   1341: ldc 1048608
    //   1343: iastore
    //   1344: dup
    //   1345: bipush #18
    //   1347: ldc -2147450848
    //   1349: iastore
    //   1350: dup
    //   1351: bipush #19
    //   1353: iconst_0
    //   1354: iastore
    //   1355: dup
    //   1356: bipush #20
    //   1358: ldc -2147483648
    //   1360: iastore
    //   1361: dup
    //   1362: bipush #21
    //   1364: ldc 32768
    //   1366: iastore
    //   1367: dup
    //   1368: bipush #22
    //   1370: ldc 1081376
    //   1372: iastore
    //   1373: dup
    //   1374: bipush #23
    //   1376: ldc -2146435072
    //   1378: iastore
    //   1379: dup
    //   1380: bipush #24
    //   1382: ldc 1048608
    //   1384: iastore
    //   1385: dup
    //   1386: bipush #25
    //   1388: ldc -2147483616
    //   1390: iastore
    //   1391: dup
    //   1392: bipush #26
    //   1394: iconst_0
    //   1395: iastore
    //   1396: dup
    //   1397: bipush #27
    //   1399: ldc 1081344
    //   1401: iastore
    //   1402: dup
    //   1403: bipush #28
    //   1405: ldc 32800
    //   1407: iastore
    //   1408: dup
    //   1409: bipush #29
    //   1411: ldc -2146402304
    //   1413: iastore
    //   1414: dup
    //   1415: bipush #30
    //   1417: ldc -2146435072
    //   1419: iastore
    //   1420: dup
    //   1421: bipush #31
    //   1423: ldc 32800
    //   1425: iastore
    //   1426: dup
    //   1427: bipush #32
    //   1429: iconst_0
    //   1430: iastore
    //   1431: dup
    //   1432: bipush #33
    //   1434: ldc 1081376
    //   1436: iastore
    //   1437: dup
    //   1438: bipush #34
    //   1440: ldc -2146435040
    //   1442: iastore
    //   1443: dup
    //   1444: bipush #35
    //   1446: ldc 1048576
    //   1448: iastore
    //   1449: dup
    //   1450: bipush #36
    //   1452: ldc -2147450848
    //   1454: iastore
    //   1455: dup
    //   1456: bipush #37
    //   1458: ldc -2146435072
    //   1460: iastore
    //   1461: dup
    //   1462: bipush #38
    //   1464: ldc -2146402304
    //   1466: iastore
    //   1467: dup
    //   1468: bipush #39
    //   1470: ldc 32768
    //   1472: iastore
    //   1473: dup
    //   1474: bipush #40
    //   1476: ldc -2146435072
    //   1478: iastore
    //   1479: dup
    //   1480: bipush #41
    //   1482: ldc -2147450880
    //   1484: iastore
    //   1485: dup
    //   1486: bipush #42
    //   1488: bipush #32
    //   1490: iastore
    //   1491: dup
    //   1492: bipush #43
    //   1494: ldc -2146402272
    //   1496: iastore
    //   1497: dup
    //   1498: bipush #44
    //   1500: ldc 1081376
    //   1502: iastore
    //   1503: dup
    //   1504: bipush #45
    //   1506: bipush #32
    //   1508: iastore
    //   1509: dup
    //   1510: bipush #46
    //   1512: ldc 32768
    //   1514: iastore
    //   1515: dup
    //   1516: bipush #47
    //   1518: ldc -2147483648
    //   1520: iastore
    //   1521: dup
    //   1522: bipush #48
    //   1524: ldc 32800
    //   1526: iastore
    //   1527: dup
    //   1528: bipush #49
    //   1530: ldc -2146402304
    //   1532: iastore
    //   1533: dup
    //   1534: bipush #50
    //   1536: ldc 1048576
    //   1538: iastore
    //   1539: dup
    //   1540: bipush #51
    //   1542: ldc -2147483616
    //   1544: iastore
    //   1545: dup
    //   1546: bipush #52
    //   1548: ldc 1048608
    //   1550: iastore
    //   1551: dup
    //   1552: bipush #53
    //   1554: ldc -2147450848
    //   1556: iastore
    //   1557: dup
    //   1558: bipush #54
    //   1560: ldc -2147483616
    //   1562: iastore
    //   1563: dup
    //   1564: bipush #55
    //   1566: ldc 1048608
    //   1568: iastore
    //   1569: dup
    //   1570: bipush #56
    //   1572: ldc 1081344
    //   1574: iastore
    //   1575: dup
    //   1576: bipush #57
    //   1578: iconst_0
    //   1579: iastore
    //   1580: dup
    //   1581: bipush #58
    //   1583: ldc -2147450880
    //   1585: iastore
    //   1586: dup
    //   1587: bipush #59
    //   1589: ldc 32800
    //   1591: iastore
    //   1592: dup
    //   1593: bipush #60
    //   1595: ldc -2147483648
    //   1597: iastore
    //   1598: dup
    //   1599: bipush #61
    //   1601: ldc -2146435040
    //   1603: iastore
    //   1604: dup
    //   1605: bipush #62
    //   1607: ldc -2146402272
    //   1609: iastore
    //   1610: dup
    //   1611: bipush #63
    //   1613: ldc 1081344
    //   1615: iastore
    //   1616: astore #9
    //   1618: bipush #64
    //   1620: newarray int
    //   1622: dup
    //   1623: iconst_0
    //   1624: sipush #520
    //   1627: iastore
    //   1628: dup
    //   1629: iconst_1
    //   1630: ldc 134349312
    //   1632: iastore
    //   1633: dup
    //   1634: iconst_2
    //   1635: iconst_0
    //   1636: iastore
    //   1637: dup
    //   1638: iconst_3
    //   1639: ldc 134348808
    //   1641: iastore
    //   1642: dup
    //   1643: iconst_4
    //   1644: ldc 134218240
    //   1646: iastore
    //   1647: dup
    //   1648: iconst_5
    //   1649: iconst_0
    //   1650: iastore
    //   1651: dup
    //   1652: bipush #6
    //   1654: ldc 131592
    //   1656: iastore
    //   1657: dup
    //   1658: bipush #7
    //   1660: ldc 134218240
    //   1662: iastore
    //   1663: dup
    //   1664: bipush #8
    //   1666: ldc 131080
    //   1668: iastore
    //   1669: dup
    //   1670: bipush #9
    //   1672: ldc 134217736
    //   1674: iastore
    //   1675: dup
    //   1676: bipush #10
    //   1678: ldc 134217736
    //   1680: iastore
    //   1681: dup
    //   1682: bipush #11
    //   1684: ldc 131072
    //   1686: iastore
    //   1687: dup
    //   1688: bipush #12
    //   1690: ldc 134349320
    //   1692: iastore
    //   1693: dup
    //   1694: bipush #13
    //   1696: ldc 131080
    //   1698: iastore
    //   1699: dup
    //   1700: bipush #14
    //   1702: ldc 134348800
    //   1704: iastore
    //   1705: dup
    //   1706: bipush #15
    //   1708: sipush #520
    //   1711: iastore
    //   1712: dup
    //   1713: bipush #16
    //   1715: ldc 134217728
    //   1717: iastore
    //   1718: dup
    //   1719: bipush #17
    //   1721: bipush #8
    //   1723: iastore
    //   1724: dup
    //   1725: bipush #18
    //   1727: ldc 134349312
    //   1729: iastore
    //   1730: dup
    //   1731: bipush #19
    //   1733: sipush #512
    //   1736: iastore
    //   1737: dup
    //   1738: bipush #20
    //   1740: ldc 131584
    //   1742: iastore
    //   1743: dup
    //   1744: bipush #21
    //   1746: ldc 134348800
    //   1748: iastore
    //   1749: dup
    //   1750: bipush #22
    //   1752: ldc 134348808
    //   1754: iastore
    //   1755: dup
    //   1756: bipush #23
    //   1758: ldc 131592
    //   1760: iastore
    //   1761: dup
    //   1762: bipush #24
    //   1764: ldc 134218248
    //   1766: iastore
    //   1767: dup
    //   1768: bipush #25
    //   1770: ldc 131584
    //   1772: iastore
    //   1773: dup
    //   1774: bipush #26
    //   1776: ldc 131072
    //   1778: iastore
    //   1779: dup
    //   1780: bipush #27
    //   1782: ldc 134218248
    //   1784: iastore
    //   1785: dup
    //   1786: bipush #28
    //   1788: bipush #8
    //   1790: iastore
    //   1791: dup
    //   1792: bipush #29
    //   1794: ldc 134349320
    //   1796: iastore
    //   1797: dup
    //   1798: bipush #30
    //   1800: sipush #512
    //   1803: iastore
    //   1804: dup
    //   1805: bipush #31
    //   1807: ldc 134217728
    //   1809: iastore
    //   1810: dup
    //   1811: bipush #32
    //   1813: ldc 134349312
    //   1815: iastore
    //   1816: dup
    //   1817: bipush #33
    //   1819: ldc 134217728
    //   1821: iastore
    //   1822: dup
    //   1823: bipush #34
    //   1825: ldc 131080
    //   1827: iastore
    //   1828: dup
    //   1829: bipush #35
    //   1831: sipush #520
    //   1834: iastore
    //   1835: dup
    //   1836: bipush #36
    //   1838: ldc 131072
    //   1840: iastore
    //   1841: dup
    //   1842: bipush #37
    //   1844: ldc 134349312
    //   1846: iastore
    //   1847: dup
    //   1848: bipush #38
    //   1850: ldc 134218240
    //   1852: iastore
    //   1853: dup
    //   1854: bipush #39
    //   1856: iconst_0
    //   1857: iastore
    //   1858: dup
    //   1859: bipush #40
    //   1861: sipush #512
    //   1864: iastore
    //   1865: dup
    //   1866: bipush #41
    //   1868: ldc 131080
    //   1870: iastore
    //   1871: dup
    //   1872: bipush #42
    //   1874: ldc 134349320
    //   1876: iastore
    //   1877: dup
    //   1878: bipush #43
    //   1880: ldc 134218240
    //   1882: iastore
    //   1883: dup
    //   1884: bipush #44
    //   1886: ldc 134217736
    //   1888: iastore
    //   1889: dup
    //   1890: bipush #45
    //   1892: sipush #512
    //   1895: iastore
    //   1896: dup
    //   1897: bipush #46
    //   1899: iconst_0
    //   1900: iastore
    //   1901: dup
    //   1902: bipush #47
    //   1904: ldc 134348808
    //   1906: iastore
    //   1907: dup
    //   1908: bipush #48
    //   1910: ldc 134218248
    //   1912: iastore
    //   1913: dup
    //   1914: bipush #49
    //   1916: ldc 131072
    //   1918: iastore
    //   1919: dup
    //   1920: bipush #50
    //   1922: ldc 134217728
    //   1924: iastore
    //   1925: dup
    //   1926: bipush #51
    //   1928: ldc 134349320
    //   1930: iastore
    //   1931: dup
    //   1932: bipush #52
    //   1934: bipush #8
    //   1936: iastore
    //   1937: dup
    //   1938: bipush #53
    //   1940: ldc 131592
    //   1942: iastore
    //   1943: dup
    //   1944: bipush #54
    //   1946: ldc 131584
    //   1948: iastore
    //   1949: dup
    //   1950: bipush #55
    //   1952: ldc 134217736
    //   1954: iastore
    //   1955: dup
    //   1956: bipush #56
    //   1958: ldc 134348800
    //   1960: iastore
    //   1961: dup
    //   1962: bipush #57
    //   1964: ldc 134218248
    //   1966: iastore
    //   1967: dup
    //   1968: bipush #58
    //   1970: sipush #520
    //   1973: iastore
    //   1974: dup
    //   1975: bipush #59
    //   1977: ldc 134348800
    //   1979: iastore
    //   1980: dup
    //   1981: bipush #60
    //   1983: ldc 131592
    //   1985: iastore
    //   1986: dup
    //   1987: bipush #61
    //   1989: bipush #8
    //   1991: iastore
    //   1992: dup
    //   1993: bipush #62
    //   1995: ldc 134348808
    //   1997: iastore
    //   1998: dup
    //   1999: bipush #63
    //   2001: ldc 131584
    //   2003: iastore
    //   2004: astore #10
    //   2006: bipush #64
    //   2008: newarray int
    //   2010: dup
    //   2011: iconst_0
    //   2012: ldc 8396801
    //   2014: iastore
    //   2015: dup
    //   2016: iconst_1
    //   2017: sipush #8321
    //   2020: iastore
    //   2021: dup
    //   2022: iconst_2
    //   2023: sipush #8321
    //   2026: iastore
    //   2027: dup
    //   2028: iconst_3
    //   2029: sipush #128
    //   2032: iastore
    //   2033: dup
    //   2034: iconst_4
    //   2035: ldc 8396928
    //   2037: iastore
    //   2038: dup
    //   2039: iconst_5
    //   2040: ldc 8388737
    //   2042: iastore
    //   2043: dup
    //   2044: bipush #6
    //   2046: ldc 8388609
    //   2048: iastore
    //   2049: dup
    //   2050: bipush #7
    //   2052: sipush #8193
    //   2055: iastore
    //   2056: dup
    //   2057: bipush #8
    //   2059: iconst_0
    //   2060: iastore
    //   2061: dup
    //   2062: bipush #9
    //   2064: ldc 8396800
    //   2066: iastore
    //   2067: dup
    //   2068: bipush #10
    //   2070: ldc 8396800
    //   2072: iastore
    //   2073: dup
    //   2074: bipush #11
    //   2076: ldc 8396929
    //   2078: iastore
    //   2079: dup
    //   2080: bipush #12
    //   2082: sipush #129
    //   2085: iastore
    //   2086: dup
    //   2087: bipush #13
    //   2089: iconst_0
    //   2090: iastore
    //   2091: dup
    //   2092: bipush #14
    //   2094: ldc 8388736
    //   2096: iastore
    //   2097: dup
    //   2098: bipush #15
    //   2100: ldc 8388609
    //   2102: iastore
    //   2103: dup
    //   2104: bipush #16
    //   2106: iconst_1
    //   2107: iastore
    //   2108: dup
    //   2109: bipush #17
    //   2111: sipush #8192
    //   2114: iastore
    //   2115: dup
    //   2116: bipush #18
    //   2118: ldc 8388608
    //   2120: iastore
    //   2121: dup
    //   2122: bipush #19
    //   2124: ldc 8396801
    //   2126: iastore
    //   2127: dup
    //   2128: bipush #20
    //   2130: sipush #128
    //   2133: iastore
    //   2134: dup
    //   2135: bipush #21
    //   2137: ldc 8388608
    //   2139: iastore
    //   2140: dup
    //   2141: bipush #22
    //   2143: sipush #8193
    //   2146: iastore
    //   2147: dup
    //   2148: bipush #23
    //   2150: sipush #8320
    //   2153: iastore
    //   2154: dup
    //   2155: bipush #24
    //   2157: ldc 8388737
    //   2159: iastore
    //   2160: dup
    //   2161: bipush #25
    //   2163: iconst_1
    //   2164: iastore
    //   2165: dup
    //   2166: bipush #26
    //   2168: sipush #8320
    //   2171: iastore
    //   2172: dup
    //   2173: bipush #27
    //   2175: ldc 8388736
    //   2177: iastore
    //   2178: dup
    //   2179: bipush #28
    //   2181: sipush #8192
    //   2184: iastore
    //   2185: dup
    //   2186: bipush #29
    //   2188: ldc 8396928
    //   2190: iastore
    //   2191: dup
    //   2192: bipush #30
    //   2194: ldc 8396929
    //   2196: iastore
    //   2197: dup
    //   2198: bipush #31
    //   2200: sipush #129
    //   2203: iastore
    //   2204: dup
    //   2205: bipush #32
    //   2207: ldc 8388736
    //   2209: iastore
    //   2210: dup
    //   2211: bipush #33
    //   2213: ldc 8388609
    //   2215: iastore
    //   2216: dup
    //   2217: bipush #34
    //   2219: ldc 8396800
    //   2221: iastore
    //   2222: dup
    //   2223: bipush #35
    //   2225: ldc 8396929
    //   2227: iastore
    //   2228: dup
    //   2229: bipush #36
    //   2231: sipush #129
    //   2234: iastore
    //   2235: dup
    //   2236: bipush #37
    //   2238: iconst_0
    //   2239: iastore
    //   2240: dup
    //   2241: bipush #38
    //   2243: iconst_0
    //   2244: iastore
    //   2245: dup
    //   2246: bipush #39
    //   2248: ldc 8396800
    //   2250: iastore
    //   2251: dup
    //   2252: bipush #40
    //   2254: sipush #8320
    //   2257: iastore
    //   2258: dup
    //   2259: bipush #41
    //   2261: ldc 8388736
    //   2263: iastore
    //   2264: dup
    //   2265: bipush #42
    //   2267: ldc 8388737
    //   2269: iastore
    //   2270: dup
    //   2271: bipush #43
    //   2273: iconst_1
    //   2274: iastore
    //   2275: dup
    //   2276: bipush #44
    //   2278: ldc 8396801
    //   2280: iastore
    //   2281: dup
    //   2282: bipush #45
    //   2284: sipush #8321
    //   2287: iastore
    //   2288: dup
    //   2289: bipush #46
    //   2291: sipush #8321
    //   2294: iastore
    //   2295: dup
    //   2296: bipush #47
    //   2298: sipush #128
    //   2301: iastore
    //   2302: dup
    //   2303: bipush #48
    //   2305: ldc 8396929
    //   2307: iastore
    //   2308: dup
    //   2309: bipush #49
    //   2311: sipush #129
    //   2314: iastore
    //   2315: dup
    //   2316: bipush #50
    //   2318: iconst_1
    //   2319: iastore
    //   2320: dup
    //   2321: bipush #51
    //   2323: sipush #8192
    //   2326: iastore
    //   2327: dup
    //   2328: bipush #52
    //   2330: ldc 8388609
    //   2332: iastore
    //   2333: dup
    //   2334: bipush #53
    //   2336: sipush #8193
    //   2339: iastore
    //   2340: dup
    //   2341: bipush #54
    //   2343: ldc 8396928
    //   2345: iastore
    //   2346: dup
    //   2347: bipush #55
    //   2349: ldc 8388737
    //   2351: iastore
    //   2352: dup
    //   2353: bipush #56
    //   2355: sipush #8193
    //   2358: iastore
    //   2359: dup
    //   2360: bipush #57
    //   2362: sipush #8320
    //   2365: iastore
    //   2366: dup
    //   2367: bipush #58
    //   2369: ldc 8388608
    //   2371: iastore
    //   2372: dup
    //   2373: bipush #59
    //   2375: ldc 8396801
    //   2377: iastore
    //   2378: dup
    //   2379: bipush #60
    //   2381: sipush #128
    //   2384: iastore
    //   2385: dup
    //   2386: bipush #61
    //   2388: ldc 8388608
    //   2390: iastore
    //   2391: dup
    //   2392: bipush #62
    //   2394: sipush #8192
    //   2397: iastore
    //   2398: dup
    //   2399: bipush #63
    //   2401: ldc 8396928
    //   2403: iastore
    //   2404: astore #11
    //   2406: bipush #64
    //   2408: newarray int
    //   2410: dup
    //   2411: iconst_0
    //   2412: sipush #256
    //   2415: iastore
    //   2416: dup
    //   2417: iconst_1
    //   2418: ldc 34078976
    //   2420: iastore
    //   2421: dup
    //   2422: iconst_2
    //   2423: ldc 34078720
    //   2425: iastore
    //   2426: dup
    //   2427: iconst_3
    //   2428: ldc 1107296512
    //   2430: iastore
    //   2431: dup
    //   2432: iconst_4
    //   2433: ldc 524288
    //   2435: iastore
    //   2436: dup
    //   2437: iconst_5
    //   2438: sipush #256
    //   2441: iastore
    //   2442: dup
    //   2443: bipush #6
    //   2445: ldc 1073741824
    //   2447: iastore
    //   2448: dup
    //   2449: bipush #7
    //   2451: ldc 34078720
    //   2453: iastore
    //   2454: dup
    //   2455: bipush #8
    //   2457: ldc 1074266368
    //   2459: iastore
    //   2460: dup
    //   2461: bipush #9
    //   2463: ldc 524288
    //   2465: iastore
    //   2466: dup
    //   2467: bipush #10
    //   2469: ldc 33554688
    //   2471: iastore
    //   2472: dup
    //   2473: bipush #11
    //   2475: ldc 1074266368
    //   2477: iastore
    //   2478: dup
    //   2479: bipush #12
    //   2481: ldc 1107296512
    //   2483: iastore
    //   2484: dup
    //   2485: bipush #13
    //   2487: ldc 1107820544
    //   2489: iastore
    //   2490: dup
    //   2491: bipush #14
    //   2493: ldc 524544
    //   2495: iastore
    //   2496: dup
    //   2497: bipush #15
    //   2499: ldc 1073741824
    //   2501: iastore
    //   2502: dup
    //   2503: bipush #16
    //   2505: ldc 33554432
    //   2507: iastore
    //   2508: dup
    //   2509: bipush #17
    //   2511: ldc 1074266112
    //   2513: iastore
    //   2514: dup
    //   2515: bipush #18
    //   2517: ldc 1074266112
    //   2519: iastore
    //   2520: dup
    //   2521: bipush #19
    //   2523: iconst_0
    //   2524: iastore
    //   2525: dup
    //   2526: bipush #20
    //   2528: ldc 1073742080
    //   2530: iastore
    //   2531: dup
    //   2532: bipush #21
    //   2534: ldc 1107820800
    //   2536: iastore
    //   2537: dup
    //   2538: bipush #22
    //   2540: ldc 1107820800
    //   2542: iastore
    //   2543: dup
    //   2544: bipush #23
    //   2546: ldc 33554688
    //   2548: iastore
    //   2549: dup
    //   2550: bipush #24
    //   2552: ldc 1107820544
    //   2554: iastore
    //   2555: dup
    //   2556: bipush #25
    //   2558: ldc 1073742080
    //   2560: iastore
    //   2561: dup
    //   2562: bipush #26
    //   2564: iconst_0
    //   2565: iastore
    //   2566: dup
    //   2567: bipush #27
    //   2569: ldc 1107296256
    //   2571: iastore
    //   2572: dup
    //   2573: bipush #28
    //   2575: ldc 34078976
    //   2577: iastore
    //   2578: dup
    //   2579: bipush #29
    //   2581: ldc 33554432
    //   2583: iastore
    //   2584: dup
    //   2585: bipush #30
    //   2587: ldc 1107296256
    //   2589: iastore
    //   2590: dup
    //   2591: bipush #31
    //   2593: ldc 524544
    //   2595: iastore
    //   2596: dup
    //   2597: bipush #32
    //   2599: ldc 524288
    //   2601: iastore
    //   2602: dup
    //   2603: bipush #33
    //   2605: ldc 1107296512
    //   2607: iastore
    //   2608: dup
    //   2609: bipush #34
    //   2611: sipush #256
    //   2614: iastore
    //   2615: dup
    //   2616: bipush #35
    //   2618: ldc 33554432
    //   2620: iastore
    //   2621: dup
    //   2622: bipush #36
    //   2624: ldc 1073741824
    //   2626: iastore
    //   2627: dup
    //   2628: bipush #37
    //   2630: ldc 34078720
    //   2632: iastore
    //   2633: dup
    //   2634: bipush #38
    //   2636: ldc 1107296512
    //   2638: iastore
    //   2639: dup
    //   2640: bipush #39
    //   2642: ldc 1074266368
    //   2644: iastore
    //   2645: dup
    //   2646: bipush #40
    //   2648: ldc 33554688
    //   2650: iastore
    //   2651: dup
    //   2652: bipush #41
    //   2654: ldc 1073741824
    //   2656: iastore
    //   2657: dup
    //   2658: bipush #42
    //   2660: ldc 1107820544
    //   2662: iastore
    //   2663: dup
    //   2664: bipush #43
    //   2666: ldc 34078976
    //   2668: iastore
    //   2669: dup
    //   2670: bipush #44
    //   2672: ldc 1074266368
    //   2674: iastore
    //   2675: dup
    //   2676: bipush #45
    //   2678: sipush #256
    //   2681: iastore
    //   2682: dup
    //   2683: bipush #46
    //   2685: ldc 33554432
    //   2687: iastore
    //   2688: dup
    //   2689: bipush #47
    //   2691: ldc 1107820544
    //   2693: iastore
    //   2694: dup
    //   2695: bipush #48
    //   2697: ldc 1107820800
    //   2699: iastore
    //   2700: dup
    //   2701: bipush #49
    //   2703: ldc 524544
    //   2705: iastore
    //   2706: dup
    //   2707: bipush #50
    //   2709: ldc 1107296256
    //   2711: iastore
    //   2712: dup
    //   2713: bipush #51
    //   2715: ldc 1107820800
    //   2717: iastore
    //   2718: dup
    //   2719: bipush #52
    //   2721: ldc 34078720
    //   2723: iastore
    //   2724: dup
    //   2725: bipush #53
    //   2727: iconst_0
    //   2728: iastore
    //   2729: dup
    //   2730: bipush #54
    //   2732: ldc 1074266112
    //   2734: iastore
    //   2735: dup
    //   2736: bipush #55
    //   2738: ldc 1107296256
    //   2740: iastore
    //   2741: dup
    //   2742: bipush #56
    //   2744: ldc 524544
    //   2746: iastore
    //   2747: dup
    //   2748: bipush #57
    //   2750: ldc 33554688
    //   2752: iastore
    //   2753: dup
    //   2754: bipush #58
    //   2756: ldc 1073742080
    //   2758: iastore
    //   2759: dup
    //   2760: bipush #59
    //   2762: ldc 524288
    //   2764: iastore
    //   2765: dup
    //   2766: bipush #60
    //   2768: iconst_0
    //   2769: iastore
    //   2770: dup
    //   2771: bipush #61
    //   2773: ldc 1074266112
    //   2775: iastore
    //   2776: dup
    //   2777: bipush #62
    //   2779: ldc 34078976
    //   2781: iastore
    //   2782: dup
    //   2783: bipush #63
    //   2785: ldc 1073742080
    //   2787: iastore
    //   2788: astore #12
    //   2790: bipush #64
    //   2792: newarray int
    //   2794: dup
    //   2795: iconst_0
    //   2796: ldc 536870928
    //   2798: iastore
    //   2799: dup
    //   2800: iconst_1
    //   2801: ldc 541065216
    //   2803: iastore
    //   2804: dup
    //   2805: iconst_2
    //   2806: sipush #16384
    //   2809: iastore
    //   2810: dup
    //   2811: iconst_3
    //   2812: ldc 541081616
    //   2814: iastore
    //   2815: dup
    //   2816: iconst_4
    //   2817: ldc 541065216
    //   2819: iastore
    //   2820: dup
    //   2821: iconst_5
    //   2822: bipush #16
    //   2824: iastore
    //   2825: dup
    //   2826: bipush #6
    //   2828: ldc 541081616
    //   2830: iastore
    //   2831: dup
    //   2832: bipush #7
    //   2834: ldc 4194304
    //   2836: iastore
    //   2837: dup
    //   2838: bipush #8
    //   2840: ldc 536887296
    //   2842: iastore
    //   2843: dup
    //   2844: bipush #9
    //   2846: ldc 4210704
    //   2848: iastore
    //   2849: dup
    //   2850: bipush #10
    //   2852: ldc 4194304
    //   2854: iastore
    //   2855: dup
    //   2856: bipush #11
    //   2858: ldc 536870928
    //   2860: iastore
    //   2861: dup
    //   2862: bipush #12
    //   2864: ldc 4194320
    //   2866: iastore
    //   2867: dup
    //   2868: bipush #13
    //   2870: ldc 536887296
    //   2872: iastore
    //   2873: dup
    //   2874: bipush #14
    //   2876: ldc 536870912
    //   2878: iastore
    //   2879: dup
    //   2880: bipush #15
    //   2882: sipush #16400
    //   2885: iastore
    //   2886: dup
    //   2887: bipush #16
    //   2889: iconst_0
    //   2890: iastore
    //   2891: dup
    //   2892: bipush #17
    //   2894: ldc 4194320
    //   2896: iastore
    //   2897: dup
    //   2898: bipush #18
    //   2900: ldc 536887312
    //   2902: iastore
    //   2903: dup
    //   2904: bipush #19
    //   2906: sipush #16384
    //   2909: iastore
    //   2910: dup
    //   2911: bipush #20
    //   2913: ldc 4210688
    //   2915: iastore
    //   2916: dup
    //   2917: bipush #21
    //   2919: ldc 536887312
    //   2921: iastore
    //   2922: dup
    //   2923: bipush #22
    //   2925: bipush #16
    //   2927: iastore
    //   2928: dup
    //   2929: bipush #23
    //   2931: ldc 541065232
    //   2933: iastore
    //   2934: dup
    //   2935: bipush #24
    //   2937: ldc 541065232
    //   2939: iastore
    //   2940: dup
    //   2941: bipush #25
    //   2943: iconst_0
    //   2944: iastore
    //   2945: dup
    //   2946: bipush #26
    //   2948: ldc 4210704
    //   2950: iastore
    //   2951: dup
    //   2952: bipush #27
    //   2954: ldc 541081600
    //   2956: iastore
    //   2957: dup
    //   2958: bipush #28
    //   2960: sipush #16400
    //   2963: iastore
    //   2964: dup
    //   2965: bipush #29
    //   2967: ldc 4210688
    //   2969: iastore
    //   2970: dup
    //   2971: bipush #30
    //   2973: ldc 541081600
    //   2975: iastore
    //   2976: dup
    //   2977: bipush #31
    //   2979: ldc 536870912
    //   2981: iastore
    //   2982: dup
    //   2983: bipush #32
    //   2985: ldc 536887296
    //   2987: iastore
    //   2988: dup
    //   2989: bipush #33
    //   2991: bipush #16
    //   2993: iastore
    //   2994: dup
    //   2995: bipush #34
    //   2997: ldc 541065232
    //   2999: iastore
    //   3000: dup
    //   3001: bipush #35
    //   3003: ldc 4210688
    //   3005: iastore
    //   3006: dup
    //   3007: bipush #36
    //   3009: ldc 541081616
    //   3011: iastore
    //   3012: dup
    //   3013: bipush #37
    //   3015: ldc 4194304
    //   3017: iastore
    //   3018: dup
    //   3019: bipush #38
    //   3021: sipush #16400
    //   3024: iastore
    //   3025: dup
    //   3026: bipush #39
    //   3028: ldc 536870928
    //   3030: iastore
    //   3031: dup
    //   3032: bipush #40
    //   3034: ldc 4194304
    //   3036: iastore
    //   3037: dup
    //   3038: bipush #41
    //   3040: ldc 536887296
    //   3042: iastore
    //   3043: dup
    //   3044: bipush #42
    //   3046: ldc 536870912
    //   3048: iastore
    //   3049: dup
    //   3050: bipush #43
    //   3052: sipush #16400
    //   3055: iastore
    //   3056: dup
    //   3057: bipush #44
    //   3059: ldc 536870928
    //   3061: iastore
    //   3062: dup
    //   3063: bipush #45
    //   3065: ldc 541081616
    //   3067: iastore
    //   3068: dup
    //   3069: bipush #46
    //   3071: ldc 4210688
    //   3073: iastore
    //   3074: dup
    //   3075: bipush #47
    //   3077: ldc 541065216
    //   3079: iastore
    //   3080: dup
    //   3081: bipush #48
    //   3083: ldc 4210704
    //   3085: iastore
    //   3086: dup
    //   3087: bipush #49
    //   3089: ldc 541081600
    //   3091: iastore
    //   3092: dup
    //   3093: bipush #50
    //   3095: iconst_0
    //   3096: iastore
    //   3097: dup
    //   3098: bipush #51
    //   3100: ldc 541065232
    //   3102: iastore
    //   3103: dup
    //   3104: bipush #52
    //   3106: bipush #16
    //   3108: iastore
    //   3109: dup
    //   3110: bipush #53
    //   3112: sipush #16384
    //   3115: iastore
    //   3116: dup
    //   3117: bipush #54
    //   3119: ldc 541065216
    //   3121: iastore
    //   3122: dup
    //   3123: bipush #55
    //   3125: ldc 4210704
    //   3127: iastore
    //   3128: dup
    //   3129: bipush #56
    //   3131: sipush #16384
    //   3134: iastore
    //   3135: dup
    //   3136: bipush #57
    //   3138: ldc 4194320
    //   3140: iastore
    //   3141: dup
    //   3142: bipush #58
    //   3144: ldc 536887312
    //   3146: iastore
    //   3147: dup
    //   3148: bipush #59
    //   3150: iconst_0
    //   3151: iastore
    //   3152: dup
    //   3153: bipush #60
    //   3155: ldc 541081600
    //   3157: iastore
    //   3158: dup
    //   3159: bipush #61
    //   3161: ldc 536870912
    //   3163: iastore
    //   3164: dup
    //   3165: bipush #62
    //   3167: ldc 4194320
    //   3169: iastore
    //   3170: dup
    //   3171: bipush #63
    //   3173: ldc 536887312
    //   3175: iastore
    //   3176: astore #13
    //   3178: bipush #64
    //   3180: newarray int
    //   3182: dup
    //   3183: iconst_0
    //   3184: ldc 2097152
    //   3186: iastore
    //   3187: dup
    //   3188: iconst_1
    //   3189: ldc 69206018
    //   3191: iastore
    //   3192: dup
    //   3193: iconst_2
    //   3194: ldc 67110914
    //   3196: iastore
    //   3197: dup
    //   3198: iconst_3
    //   3199: iconst_0
    //   3200: iastore
    //   3201: dup
    //   3202: iconst_4
    //   3203: sipush #2048
    //   3206: iastore
    //   3207: dup
    //   3208: iconst_5
    //   3209: ldc 67110914
    //   3211: iastore
    //   3212: dup
    //   3213: bipush #6
    //   3215: ldc 2099202
    //   3217: iastore
    //   3218: dup
    //   3219: bipush #7
    //   3221: ldc 69208064
    //   3223: iastore
    //   3224: dup
    //   3225: bipush #8
    //   3227: ldc 69208066
    //   3229: iastore
    //   3230: dup
    //   3231: bipush #9
    //   3233: ldc 2097152
    //   3235: iastore
    //   3236: dup
    //   3237: bipush #10
    //   3239: iconst_0
    //   3240: iastore
    //   3241: dup
    //   3242: bipush #11
    //   3244: ldc 67108866
    //   3246: iastore
    //   3247: dup
    //   3248: bipush #12
    //   3250: iconst_2
    //   3251: iastore
    //   3252: dup
    //   3253: bipush #13
    //   3255: ldc 67108864
    //   3257: iastore
    //   3258: dup
    //   3259: bipush #14
    //   3261: ldc 69206018
    //   3263: iastore
    //   3264: dup
    //   3265: bipush #15
    //   3267: sipush #2050
    //   3270: iastore
    //   3271: dup
    //   3272: bipush #16
    //   3274: ldc 67110912
    //   3276: iastore
    //   3277: dup
    //   3278: bipush #17
    //   3280: ldc 2099202
    //   3282: iastore
    //   3283: dup
    //   3284: bipush #18
    //   3286: ldc 2097154
    //   3288: iastore
    //   3289: dup
    //   3290: bipush #19
    //   3292: ldc 67110912
    //   3294: iastore
    //   3295: dup
    //   3296: bipush #20
    //   3298: ldc 67108866
    //   3300: iastore
    //   3301: dup
    //   3302: bipush #21
    //   3304: ldc 69206016
    //   3306: iastore
    //   3307: dup
    //   3308: bipush #22
    //   3310: ldc 69208064
    //   3312: iastore
    //   3313: dup
    //   3314: bipush #23
    //   3316: ldc 2097154
    //   3318: iastore
    //   3319: dup
    //   3320: bipush #24
    //   3322: ldc 69206016
    //   3324: iastore
    //   3325: dup
    //   3326: bipush #25
    //   3328: sipush #2048
    //   3331: iastore
    //   3332: dup
    //   3333: bipush #26
    //   3335: sipush #2050
    //   3338: iastore
    //   3339: dup
    //   3340: bipush #27
    //   3342: ldc 69208066
    //   3344: iastore
    //   3345: dup
    //   3346: bipush #28
    //   3348: ldc 2099200
    //   3350: iastore
    //   3351: dup
    //   3352: bipush #29
    //   3354: iconst_2
    //   3355: iastore
    //   3356: dup
    //   3357: bipush #30
    //   3359: ldc 67108864
    //   3361: iastore
    //   3362: dup
    //   3363: bipush #31
    //   3365: ldc 2099200
    //   3367: iastore
    //   3368: dup
    //   3369: bipush #32
    //   3371: ldc 67108864
    //   3373: iastore
    //   3374: dup
    //   3375: bipush #33
    //   3377: ldc 2099200
    //   3379: iastore
    //   3380: dup
    //   3381: bipush #34
    //   3383: ldc 2097152
    //   3385: iastore
    //   3386: dup
    //   3387: bipush #35
    //   3389: ldc 67110914
    //   3391: iastore
    //   3392: dup
    //   3393: bipush #36
    //   3395: ldc 67110914
    //   3397: iastore
    //   3398: dup
    //   3399: bipush #37
    //   3401: ldc 69206018
    //   3403: iastore
    //   3404: dup
    //   3405: bipush #38
    //   3407: ldc 69206018
    //   3409: iastore
    //   3410: dup
    //   3411: bipush #39
    //   3413: iconst_2
    //   3414: iastore
    //   3415: dup
    //   3416: bipush #40
    //   3418: ldc 2097154
    //   3420: iastore
    //   3421: dup
    //   3422: bipush #41
    //   3424: ldc 67108864
    //   3426: iastore
    //   3427: dup
    //   3428: bipush #42
    //   3430: ldc 67110912
    //   3432: iastore
    //   3433: dup
    //   3434: bipush #43
    //   3436: ldc 2097152
    //   3438: iastore
    //   3439: dup
    //   3440: bipush #44
    //   3442: ldc 69208064
    //   3444: iastore
    //   3445: dup
    //   3446: bipush #45
    //   3448: sipush #2050
    //   3451: iastore
    //   3452: dup
    //   3453: bipush #46
    //   3455: ldc 2099202
    //   3457: iastore
    //   3458: dup
    //   3459: bipush #47
    //   3461: ldc 69208064
    //   3463: iastore
    //   3464: dup
    //   3465: bipush #48
    //   3467: sipush #2050
    //   3470: iastore
    //   3471: dup
    //   3472: bipush #49
    //   3474: ldc 67108866
    //   3476: iastore
    //   3477: dup
    //   3478: bipush #50
    //   3480: ldc 69208066
    //   3482: iastore
    //   3483: dup
    //   3484: bipush #51
    //   3486: ldc 69206016
    //   3488: iastore
    //   3489: dup
    //   3490: bipush #52
    //   3492: ldc 2099200
    //   3494: iastore
    //   3495: dup
    //   3496: bipush #53
    //   3498: iconst_0
    //   3499: iastore
    //   3500: dup
    //   3501: bipush #54
    //   3503: iconst_2
    //   3504: iastore
    //   3505: dup
    //   3506: bipush #55
    //   3508: ldc 69208066
    //   3510: iastore
    //   3511: dup
    //   3512: bipush #56
    //   3514: iconst_0
    //   3515: iastore
    //   3516: dup
    //   3517: bipush #57
    //   3519: ldc 2099202
    //   3521: iastore
    //   3522: dup
    //   3523: bipush #58
    //   3525: ldc 69206016
    //   3527: iastore
    //   3528: dup
    //   3529: bipush #59
    //   3531: sipush #2048
    //   3534: iastore
    //   3535: dup
    //   3536: bipush #60
    //   3538: ldc 67108866
    //   3540: iastore
    //   3541: dup
    //   3542: bipush #61
    //   3544: ldc 67110912
    //   3546: iastore
    //   3547: dup
    //   3548: bipush #62
    //   3550: sipush #2048
    //   3553: iastore
    //   3554: dup
    //   3555: bipush #63
    //   3557: ldc 2097154
    //   3559: iastore
    //   3560: astore #14
    //   3562: bipush #64
    //   3564: newarray int
    //   3566: dup
    //   3567: iconst_0
    //   3568: ldc 268439616
    //   3570: iastore
    //   3571: dup
    //   3572: iconst_1
    //   3573: sipush #4096
    //   3576: iastore
    //   3577: dup
    //   3578: iconst_2
    //   3579: ldc 262144
    //   3581: iastore
    //   3582: dup
    //   3583: iconst_3
    //   3584: ldc 268701760
    //   3586: iastore
    //   3587: dup
    //   3588: iconst_4
    //   3589: ldc 268435456
    //   3591: iastore
    //   3592: dup
    //   3593: iconst_5
    //   3594: ldc 268439616
    //   3596: iastore
    //   3597: dup
    //   3598: bipush #6
    //   3600: bipush #64
    //   3602: iastore
    //   3603: dup
    //   3604: bipush #7
    //   3606: ldc 268435456
    //   3608: iastore
    //   3609: dup
    //   3610: bipush #8
    //   3612: ldc 262208
    //   3614: iastore
    //   3615: dup
    //   3616: bipush #9
    //   3618: ldc 268697600
    //   3620: iastore
    //   3621: dup
    //   3622: bipush #10
    //   3624: ldc 268701760
    //   3626: iastore
    //   3627: dup
    //   3628: bipush #11
    //   3630: ldc 266240
    //   3632: iastore
    //   3633: dup
    //   3634: bipush #12
    //   3636: ldc 268701696
    //   3638: iastore
    //   3639: dup
    //   3640: bipush #13
    //   3642: ldc 266304
    //   3644: iastore
    //   3645: dup
    //   3646: bipush #14
    //   3648: sipush #4096
    //   3651: iastore
    //   3652: dup
    //   3653: bipush #15
    //   3655: bipush #64
    //   3657: iastore
    //   3658: dup
    //   3659: bipush #16
    //   3661: ldc 268697600
    //   3663: iastore
    //   3664: dup
    //   3665: bipush #17
    //   3667: ldc 268435520
    //   3669: iastore
    //   3670: dup
    //   3671: bipush #18
    //   3673: ldc 268439552
    //   3675: iastore
    //   3676: dup
    //   3677: bipush #19
    //   3679: sipush #4160
    //   3682: iastore
    //   3683: dup
    //   3684: bipush #20
    //   3686: ldc 266240
    //   3688: iastore
    //   3689: dup
    //   3690: bipush #21
    //   3692: ldc 262208
    //   3694: iastore
    //   3695: dup
    //   3696: bipush #22
    //   3698: ldc 268697664
    //   3700: iastore
    //   3701: dup
    //   3702: bipush #23
    //   3704: ldc 268701696
    //   3706: iastore
    //   3707: dup
    //   3708: bipush #24
    //   3710: sipush #4160
    //   3713: iastore
    //   3714: dup
    //   3715: bipush #25
    //   3717: iconst_0
    //   3718: iastore
    //   3719: dup
    //   3720: bipush #26
    //   3722: iconst_0
    //   3723: iastore
    //   3724: dup
    //   3725: bipush #27
    //   3727: ldc 268697664
    //   3729: iastore
    //   3730: dup
    //   3731: bipush #28
    //   3733: ldc 268435520
    //   3735: iastore
    //   3736: dup
    //   3737: bipush #29
    //   3739: ldc 268439552
    //   3741: iastore
    //   3742: dup
    //   3743: bipush #30
    //   3745: ldc 266304
    //   3747: iastore
    //   3748: dup
    //   3749: bipush #31
    //   3751: ldc 262144
    //   3753: iastore
    //   3754: dup
    //   3755: bipush #32
    //   3757: ldc 266304
    //   3759: iastore
    //   3760: dup
    //   3761: bipush #33
    //   3763: ldc 262144
    //   3765: iastore
    //   3766: dup
    //   3767: bipush #34
    //   3769: ldc 268701696
    //   3771: iastore
    //   3772: dup
    //   3773: bipush #35
    //   3775: sipush #4096
    //   3778: iastore
    //   3779: dup
    //   3780: bipush #36
    //   3782: bipush #64
    //   3784: iastore
    //   3785: dup
    //   3786: bipush #37
    //   3788: ldc 268697664
    //   3790: iastore
    //   3791: dup
    //   3792: bipush #38
    //   3794: sipush #4096
    //   3797: iastore
    //   3798: dup
    //   3799: bipush #39
    //   3801: ldc 266304
    //   3803: iastore
    //   3804: dup
    //   3805: bipush #40
    //   3807: ldc 268439552
    //   3809: iastore
    //   3810: dup
    //   3811: bipush #41
    //   3813: bipush #64
    //   3815: iastore
    //   3816: dup
    //   3817: bipush #42
    //   3819: ldc 268435520
    //   3821: iastore
    //   3822: dup
    //   3823: bipush #43
    //   3825: ldc 268697600
    //   3827: iastore
    //   3828: dup
    //   3829: bipush #44
    //   3831: ldc 268697664
    //   3833: iastore
    //   3834: dup
    //   3835: bipush #45
    //   3837: ldc 268435456
    //   3839: iastore
    //   3840: dup
    //   3841: bipush #46
    //   3843: ldc 262144
    //   3845: iastore
    //   3846: dup
    //   3847: bipush #47
    //   3849: ldc 268439616
    //   3851: iastore
    //   3852: dup
    //   3853: bipush #48
    //   3855: iconst_0
    //   3856: iastore
    //   3857: dup
    //   3858: bipush #49
    //   3860: ldc 268701760
    //   3862: iastore
    //   3863: dup
    //   3864: bipush #50
    //   3866: ldc 262208
    //   3868: iastore
    //   3869: dup
    //   3870: bipush #51
    //   3872: ldc 268435520
    //   3874: iastore
    //   3875: dup
    //   3876: bipush #52
    //   3878: ldc 268697600
    //   3880: iastore
    //   3881: dup
    //   3882: bipush #53
    //   3884: ldc 268439552
    //   3886: iastore
    //   3887: dup
    //   3888: bipush #54
    //   3890: ldc 268439616
    //   3892: iastore
    //   3893: dup
    //   3894: bipush #55
    //   3896: iconst_0
    //   3897: iastore
    //   3898: dup
    //   3899: bipush #56
    //   3901: ldc 268701760
    //   3903: iastore
    //   3904: dup
    //   3905: bipush #57
    //   3907: ldc 266240
    //   3909: iastore
    //   3910: dup
    //   3911: bipush #58
    //   3913: ldc 266240
    //   3915: iastore
    //   3916: dup
    //   3917: bipush #59
    //   3919: sipush #4160
    //   3922: iastore
    //   3923: dup
    //   3924: bipush #60
    //   3926: sipush #4160
    //   3929: iastore
    //   3930: dup
    //   3931: bipush #61
    //   3933: ldc 262208
    //   3935: iastore
    //   3936: dup
    //   3937: bipush #62
    //   3939: ldc 268435456
    //   3941: iastore
    //   3942: dup
    //   3943: bipush #63
    //   3945: ldc 268701696
    //   3947: iastore
    //   3948: astore #15
    //   3950: aload_3
    //   3951: arraylength
    //   3952: istore #16
    //   3954: iconst_2
    //   3955: newarray int
    //   3957: astore #17
    //   3959: iload #16
    //   3961: newarray byte
    //   3963: astore #4
    //   3965: iload #16
    //   3967: bipush #8
    //   3969: idiv
    //   3970: istore #18
    //   3972: iconst_0
    //   3973: istore #19
    //   3975: iload #19
    //   3977: iload #18
    //   3979: if_icmpge -> 4893
    //   3982: iload #19
    //   3984: bipush #8
    //   3986: imul
    //   3987: istore #20
    //   3989: iconst_0
    //   3990: istore #21
    //   3992: iload #21
    //   3994: iconst_2
    //   3995: if_icmpge -> 4080
    //   3998: aload #17
    //   4000: iload #21
    //   4002: aload_3
    //   4003: iload #20
    //   4005: iload #21
    //   4007: iconst_4
    //   4008: imul
    //   4009: iadd
    //   4010: baload
    //   4011: sipush #255
    //   4014: iand
    //   4015: bipush #24
    //   4017: ishl
    //   4018: aload_3
    //   4019: iload #20
    //   4021: iload #21
    //   4023: iconst_4
    //   4024: imul
    //   4025: iadd
    //   4026: iconst_1
    //   4027: iadd
    //   4028: baload
    //   4029: sipush #255
    //   4032: iand
    //   4033: bipush #16
    //   4035: ishl
    //   4036: ior
    //   4037: aload_3
    //   4038: iload #20
    //   4040: iload #21
    //   4042: iconst_4
    //   4043: imul
    //   4044: iadd
    //   4045: iconst_2
    //   4046: iadd
    //   4047: baload
    //   4048: sipush #255
    //   4051: iand
    //   4052: bipush #8
    //   4054: ishl
    //   4055: ior
    //   4056: aload_3
    //   4057: iload #20
    //   4059: iload #21
    //   4061: iconst_4
    //   4062: imul
    //   4063: iadd
    //   4064: iconst_3
    //   4065: iadd
    //   4066: baload
    //   4067: sipush #255
    //   4070: iand
    //   4071: ior
    //   4072: iastore
    //   4073: iinc #21, 1
    //   4076: iload_2
    //   4077: ifeq -> 3992
    //   4080: iconst_0
    //   4081: istore #26
    //   4083: aload #17
    //   4085: iconst_0
    //   4086: iaload
    //   4087: istore #24
    //   4089: aload #17
    //   4091: iconst_1
    //   4092: iaload
    //   4093: istore #23
    //   4095: iload #24
    //   4097: iconst_4
    //   4098: iushr
    //   4099: iload #23
    //   4101: ixor
    //   4102: ldc 252645135
    //   4104: iand
    //   4105: istore #22
    //   4107: iload #23
    //   4109: iload #22
    //   4111: ixor
    //   4112: istore #23
    //   4114: iload #24
    //   4116: iload #22
    //   4118: iconst_4
    //   4119: ishl
    //   4120: ixor
    //   4121: istore #24
    //   4123: iload #24
    //   4125: bipush #16
    //   4127: iushr
    //   4128: iload #23
    //   4130: ixor
    //   4131: ldc 65535
    //   4133: iand
    //   4134: istore #22
    //   4136: iload #23
    //   4138: iload #22
    //   4140: ixor
    //   4141: istore #23
    //   4143: iload #24
    //   4145: iload #22
    //   4147: bipush #16
    //   4149: ishl
    //   4150: ixor
    //   4151: istore #24
    //   4153: iload #23
    //   4155: iconst_2
    //   4156: iushr
    //   4157: iload #24
    //   4159: ixor
    //   4160: ldc 858993459
    //   4162: iand
    //   4163: istore #22
    //   4165: iload #24
    //   4167: iload #22
    //   4169: ixor
    //   4170: istore #24
    //   4172: iload #23
    //   4174: iload #22
    //   4176: iconst_2
    //   4177: ishl
    //   4178: ixor
    //   4179: istore #23
    //   4181: iload #23
    //   4183: bipush #8
    //   4185: iushr
    //   4186: iload #24
    //   4188: ixor
    //   4189: ldc 16711935
    //   4191: iand
    //   4192: istore #22
    //   4194: iload #24
    //   4196: iload #22
    //   4198: ixor
    //   4199: istore #24
    //   4201: iload #23
    //   4203: iload #22
    //   4205: bipush #8
    //   4207: ishl
    //   4208: ixor
    //   4209: istore #23
    //   4211: iload #23
    //   4213: iconst_1
    //   4214: ishl
    //   4215: iload #23
    //   4217: bipush #31
    //   4219: iushr
    //   4220: iconst_1
    //   4221: iand
    //   4222: ior
    //   4223: istore #23
    //   4225: iload #24
    //   4227: iload #23
    //   4229: ixor
    //   4230: ldc -1431655766
    //   4232: iand
    //   4233: istore #22
    //   4235: iload #24
    //   4237: iload #22
    //   4239: ixor
    //   4240: istore #24
    //   4242: iload #23
    //   4244: iload #22
    //   4246: ixor
    //   4247: istore #23
    //   4249: iload #24
    //   4251: iconst_1
    //   4252: ishl
    //   4253: iload #24
    //   4255: bipush #31
    //   4257: iushr
    //   4258: iconst_1
    //   4259: iand
    //   4260: ior
    //   4261: istore #24
    //   4263: iconst_0
    //   4264: istore #25
    //   4266: iload #25
    //   4268: bipush #8
    //   4270: if_icmpge -> 4608
    //   4273: iload #23
    //   4275: bipush #28
    //   4277: ishl
    //   4278: iload #23
    //   4280: iconst_4
    //   4281: iushr
    //   4282: ior
    //   4283: istore #22
    //   4285: iload #22
    //   4287: aload #5
    //   4289: iload #26
    //   4291: iinc #26, 1
    //   4294: iaload
    //   4295: ixor
    //   4296: istore #22
    //   4298: aload #14
    //   4300: iload #22
    //   4302: bipush #63
    //   4304: iand
    //   4305: iaload
    //   4306: istore #21
    //   4308: iload #21
    //   4310: aload #12
    //   4312: iload #22
    //   4314: bipush #8
    //   4316: iushr
    //   4317: bipush #63
    //   4319: iand
    //   4320: iaload
    //   4321: ior
    //   4322: istore #21
    //   4324: iload #21
    //   4326: aload #10
    //   4328: iload #22
    //   4330: bipush #16
    //   4332: iushr
    //   4333: bipush #63
    //   4335: iand
    //   4336: iaload
    //   4337: ior
    //   4338: istore #21
    //   4340: iload #21
    //   4342: aload #8
    //   4344: iload #22
    //   4346: bipush #24
    //   4348: iushr
    //   4349: bipush #63
    //   4351: iand
    //   4352: iaload
    //   4353: ior
    //   4354: istore #21
    //   4356: iload #23
    //   4358: aload #5
    //   4360: iload #26
    //   4362: iinc #26, 1
    //   4365: iaload
    //   4366: ixor
    //   4367: istore #22
    //   4369: iload #21
    //   4371: aload #15
    //   4373: iload #22
    //   4375: bipush #63
    //   4377: iand
    //   4378: iaload
    //   4379: ior
    //   4380: istore #21
    //   4382: iload #21
    //   4384: aload #13
    //   4386: iload #22
    //   4388: bipush #8
    //   4390: iushr
    //   4391: bipush #63
    //   4393: iand
    //   4394: iaload
    //   4395: ior
    //   4396: istore #21
    //   4398: iload #21
    //   4400: aload #11
    //   4402: iload #22
    //   4404: bipush #16
    //   4406: iushr
    //   4407: bipush #63
    //   4409: iand
    //   4410: iaload
    //   4411: ior
    //   4412: istore #21
    //   4414: iload #21
    //   4416: aload #9
    //   4418: iload #22
    //   4420: bipush #24
    //   4422: iushr
    //   4423: bipush #63
    //   4425: iand
    //   4426: iaload
    //   4427: ior
    //   4428: istore #21
    //   4430: iload #24
    //   4432: iload #21
    //   4434: ixor
    //   4435: istore #24
    //   4437: iload #24
    //   4439: bipush #28
    //   4441: ishl
    //   4442: iload #24
    //   4444: iconst_4
    //   4445: iushr
    //   4446: ior
    //   4447: istore #22
    //   4449: iload #22
    //   4451: aload #5
    //   4453: iload #26
    //   4455: iinc #26, 1
    //   4458: iaload
    //   4459: ixor
    //   4460: istore #22
    //   4462: aload #14
    //   4464: iload #22
    //   4466: bipush #63
    //   4468: iand
    //   4469: iaload
    //   4470: istore #21
    //   4472: iload #21
    //   4474: aload #12
    //   4476: iload #22
    //   4478: bipush #8
    //   4480: iushr
    //   4481: bipush #63
    //   4483: iand
    //   4484: iaload
    //   4485: ior
    //   4486: istore #21
    //   4488: iload #21
    //   4490: aload #10
    //   4492: iload #22
    //   4494: bipush #16
    //   4496: iushr
    //   4497: bipush #63
    //   4499: iand
    //   4500: iaload
    //   4501: ior
    //   4502: istore #21
    //   4504: iload #21
    //   4506: aload #8
    //   4508: iload #22
    //   4510: bipush #24
    //   4512: iushr
    //   4513: bipush #63
    //   4515: iand
    //   4516: iaload
    //   4517: ior
    //   4518: istore #21
    //   4520: iload #24
    //   4522: aload #5
    //   4524: iload #26
    //   4526: iinc #26, 1
    //   4529: iaload
    //   4530: ixor
    //   4531: istore #22
    //   4533: iload #21
    //   4535: aload #15
    //   4537: iload #22
    //   4539: bipush #63
    //   4541: iand
    //   4542: iaload
    //   4543: ior
    //   4544: istore #21
    //   4546: iload #21
    //   4548: aload #13
    //   4550: iload #22
    //   4552: bipush #8
    //   4554: iushr
    //   4555: bipush #63
    //   4557: iand
    //   4558: iaload
    //   4559: ior
    //   4560: istore #21
    //   4562: iload #21
    //   4564: aload #11
    //   4566: iload #22
    //   4568: bipush #16
    //   4570: iushr
    //   4571: bipush #63
    //   4573: iand
    //   4574: iaload
    //   4575: ior
    //   4576: istore #21
    //   4578: iload #21
    //   4580: aload #9
    //   4582: iload #22
    //   4584: bipush #24
    //   4586: iushr
    //   4587: bipush #63
    //   4589: iand
    //   4590: iaload
    //   4591: ior
    //   4592: istore #21
    //   4594: iload #23
    //   4596: iload #21
    //   4598: ixor
    //   4599: istore #23
    //   4601: iinc #25, 1
    //   4604: iload_2
    //   4605: ifeq -> 4266
    //   4608: iload #23
    //   4610: bipush #31
    //   4612: ishl
    //   4613: iload #23
    //   4615: iconst_1
    //   4616: iushr
    //   4617: ior
    //   4618: istore #23
    //   4620: iload #24
    //   4622: iload #23
    //   4624: ixor
    //   4625: ldc -1431655766
    //   4627: iand
    //   4628: istore #22
    //   4630: iload #24
    //   4632: iload #22
    //   4634: ixor
    //   4635: istore #24
    //   4637: iload #23
    //   4639: iload #22
    //   4641: ixor
    //   4642: istore #23
    //   4644: iload #24
    //   4646: bipush #31
    //   4648: ishl
    //   4649: iload #24
    //   4651: iconst_1
    //   4652: iushr
    //   4653: ior
    //   4654: istore #24
    //   4656: iload #24
    //   4658: bipush #8
    //   4660: iushr
    //   4661: iload #23
    //   4663: ixor
    //   4664: ldc 16711935
    //   4666: iand
    //   4667: istore #22
    //   4669: iload #23
    //   4671: iload #22
    //   4673: ixor
    //   4674: istore #23
    //   4676: iload #24
    //   4678: iload #22
    //   4680: bipush #8
    //   4682: ishl
    //   4683: ixor
    //   4684: istore #24
    //   4686: iload #24
    //   4688: iconst_2
    //   4689: iushr
    //   4690: iload #23
    //   4692: ixor
    //   4693: ldc 858993459
    //   4695: iand
    //   4696: istore #22
    //   4698: iload #23
    //   4700: iload #22
    //   4702: ixor
    //   4703: istore #23
    //   4705: iload #24
    //   4707: iload #22
    //   4709: iconst_2
    //   4710: ishl
    //   4711: ixor
    //   4712: istore #24
    //   4714: iload #23
    //   4716: bipush #16
    //   4718: iushr
    //   4719: iload #24
    //   4721: ixor
    //   4722: ldc 65535
    //   4724: iand
    //   4725: istore #22
    //   4727: iload #24
    //   4729: iload #22
    //   4731: ixor
    //   4732: istore #24
    //   4734: iload #23
    //   4736: iload #22
    //   4738: bipush #16
    //   4740: ishl
    //   4741: ixor
    //   4742: istore #23
    //   4744: iload #23
    //   4746: iconst_4
    //   4747: iushr
    //   4748: iload #24
    //   4750: ixor
    //   4751: ldc 252645135
    //   4753: iand
    //   4754: istore #22
    //   4756: iload #24
    //   4758: iload #22
    //   4760: ixor
    //   4761: istore #24
    //   4763: iload #23
    //   4765: iload #22
    //   4767: iconst_4
    //   4768: ishl
    //   4769: ixor
    //   4770: istore #23
    //   4772: aload #17
    //   4774: iconst_0
    //   4775: iload #23
    //   4777: iastore
    //   4778: aload #17
    //   4780: iconst_1
    //   4781: iload #24
    //   4783: iastore
    //   4784: iload #19
    //   4786: bipush #8
    //   4788: imul
    //   4789: istore #27
    //   4791: iconst_0
    //   4792: istore #28
    //   4794: iload #28
    //   4796: iconst_2
    //   4797: if_icmpge -> 4886
    //   4800: aload #4
    //   4802: iload #27
    //   4804: iload #28
    //   4806: iconst_4
    //   4807: imul
    //   4808: iadd
    //   4809: aload #17
    //   4811: iload #28
    //   4813: iaload
    //   4814: bipush #24
    //   4816: iushr
    //   4817: i2b
    //   4818: bastore
    //   4819: aload #4
    //   4821: iload #27
    //   4823: iload #28
    //   4825: iconst_4
    //   4826: imul
    //   4827: iadd
    //   4828: iconst_1
    //   4829: iadd
    //   4830: aload #17
    //   4832: iload #28
    //   4834: iaload
    //   4835: bipush #16
    //   4837: iushr
    //   4838: i2b
    //   4839: bastore
    //   4840: aload #4
    //   4842: iload #27
    //   4844: iload #28
    //   4846: iconst_4
    //   4847: imul
    //   4848: iadd
    //   4849: iconst_2
    //   4850: iadd
    //   4851: aload #17
    //   4853: iload #28
    //   4855: iaload
    //   4856: bipush #8
    //   4858: iushr
    //   4859: i2b
    //   4860: bastore
    //   4861: aload #4
    //   4863: iload #27
    //   4865: iload #28
    //   4867: iconst_4
    //   4868: imul
    //   4869: iadd
    //   4870: iconst_3
    //   4871: iadd
    //   4872: aload #17
    //   4874: iload #28
    //   4876: iaload
    //   4877: i2b
    //   4878: bastore
    //   4879: iinc #28, 1
    //   4882: iload_2
    //   4883: ifeq -> 4794
    //   4886: iinc #19, 1
    //   4889: iload_2
    //   4890: ifeq -> 3975
    //   4893: new java/math/BigInteger
    //   4896: dup
    //   4897: aload #4
    //   4899: invokespecial <init> : ([B)V
    //   4902: invokevirtual abs : ()Ljava/math/BigInteger;
    //   4905: putstatic burp/Zgs6.Za : Ljava/lang/Object;
    //   4908: sipush #-20266
    //   4911: sipush #-30113
    //   4914: invokestatic a : (II)Ljava/lang/String;
    //   4917: iconst_1
    //   4918: ldc burp/Zvk
    //   4920: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4923: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4926: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4929: astore_3
    //   4930: aload_3
    //   4931: arraylength
    //   4932: istore #4
    //   4934: iconst_0
    //   4935: istore #5
    //   4937: iload #5
    //   4939: iload #4
    //   4941: if_icmpge -> 5078
    //   4944: aload_3
    //   4945: iload #5
    //   4947: aaload
    //   4948: astore #6
    //   4950: aload #6
    //   4952: invokevirtual getModifiers : ()I
    //   4955: invokestatic isStatic : (I)Z
    //   4958: ifne -> 4968
    //   4961: goto -> 5071
    //   4964: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4967: athrow
    //   4968: aload #6
    //   4970: invokevirtual getType : ()Ljava/lang/Class;
    //   4973: astore #7
    //   4975: aload #7
    //   4977: ifnull -> 5058
    //   4980: aload #7
    //   4982: invokevirtual isPrimitive : ()Z
    //   4985: ifne -> 5058
    //   4988: goto -> 4995
    //   4991: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4994: athrow
    //   4995: aload #7
    //   4997: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5000: ifnull -> 5058
    //   5003: goto -> 5010
    //   5006: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5009: athrow
    //   5010: aload #7
    //   5012: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5015: invokevirtual getName : ()Ljava/lang/String;
    //   5018: ifnull -> 5058
    //   5021: goto -> 5028
    //   5024: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5027: athrow
    //   5028: aload #7
    //   5030: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5033: invokevirtual getName : ()Ljava/lang/String;
    //   5036: sipush #-20283
    //   5039: sipush #17216
    //   5042: invokestatic a : (II)Ljava/lang/String;
    //   5045: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5048: ifne -> 5058
    //   5051: goto -> 5058
    //   5054: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5057: athrow
    //   5058: aload #6
    //   5060: iconst_1
    //   5061: invokevirtual setAccessible : (Z)V
    //   5064: aload #6
    //   5066: aconst_null
    //   5067: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5070: pop
    //   5071: iinc #5, 1
    //   5074: iload_2
    //   5075: ifeq -> 4937
    //   5078: sipush #-20260
    //   5081: sipush #7205
    //   5084: invokestatic a : (II)Ljava/lang/String;
    //   5087: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5090: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5093: astore_3
    //   5094: aload_3
    //   5095: arraylength
    //   5096: istore #4
    //   5098: iconst_0
    //   5099: istore #5
    //   5101: iload #5
    //   5103: iload #4
    //   5105: if_icmpge -> 5216
    //   5108: aload_3
    //   5109: iload #5
    //   5111: aaload
    //   5112: astore #6
    //   5114: aload #6
    //   5116: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5119: pop
    //   5120: aload #6
    //   5122: invokevirtual getModifiers : ()I
    //   5125: invokestatic isStatic : (I)Z
    //   5128: ifeq -> 5202
    //   5131: aload #6
    //   5133: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5136: arraylength
    //   5137: iconst_2
    //   5138: if_icmpne -> 5202
    //   5141: goto -> 5148
    //   5144: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5147: athrow
    //   5148: aload #6
    //   5150: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5153: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   5156: if_acmpne -> 5202
    //   5159: goto -> 5166
    //   5162: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5165: athrow
    //   5166: aload #6
    //   5168: iconst_1
    //   5169: invokevirtual setAccessible : (Z)V
    //   5172: aload #6
    //   5174: aconst_null
    //   5175: iconst_2
    //   5176: anewarray java/lang/Object
    //   5179: dup
    //   5180: iconst_0
    //   5181: aload_0
    //   5182: aastore
    //   5183: dup
    //   5184: iconst_1
    //   5185: aload_1
    //   5186: aastore
    //   5187: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5190: pop
    //   5191: iload_2
    //   5192: ifeq -> 5216
    //   5195: goto -> 5202
    //   5198: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5201: athrow
    //   5202: iinc #5, 1
    //   5205: iload_2
    //   5206: ifeq -> 5101
    //   5209: goto -> 5216
    //   5212: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5215: athrow
    //   5216: sipush #-20288
    //   5219: sipush #-150
    //   5222: invokestatic a : (II)Ljava/lang/String;
    //   5225: iconst_1
    //   5226: ldc burp/Zrcx
    //   5228: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5231: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5234: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5237: astore_3
    //   5238: aload_3
    //   5239: arraylength
    //   5240: istore #4
    //   5242: iconst_0
    //   5243: istore #5
    //   5245: iload #5
    //   5247: iload #4
    //   5249: if_icmpge -> 5386
    //   5252: aload_3
    //   5253: iload #5
    //   5255: aaload
    //   5256: astore #6
    //   5258: aload #6
    //   5260: invokevirtual getModifiers : ()I
    //   5263: invokestatic isStatic : (I)Z
    //   5266: ifne -> 5276
    //   5269: goto -> 5379
    //   5272: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5275: athrow
    //   5276: aload #6
    //   5278: invokevirtual getType : ()Ljava/lang/Class;
    //   5281: astore #7
    //   5283: aload #7
    //   5285: ifnull -> 5366
    //   5288: aload #7
    //   5290: invokevirtual isPrimitive : ()Z
    //   5293: ifne -> 5366
    //   5296: goto -> 5303
    //   5299: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5302: athrow
    //   5303: aload #7
    //   5305: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5308: ifnull -> 5366
    //   5311: goto -> 5318
    //   5314: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5317: athrow
    //   5318: aload #7
    //   5320: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5323: invokevirtual getName : ()Ljava/lang/String;
    //   5326: ifnull -> 5366
    //   5329: goto -> 5336
    //   5332: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5335: athrow
    //   5336: aload #7
    //   5338: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5341: invokevirtual getName : ()Ljava/lang/String;
    //   5344: sipush #-20268
    //   5347: sipush #19182
    //   5350: invokestatic a : (II)Ljava/lang/String;
    //   5353: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5356: ifne -> 5366
    //   5359: goto -> 5366
    //   5362: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5365: athrow
    //   5366: aload #6
    //   5368: iconst_1
    //   5369: invokevirtual setAccessible : (Z)V
    //   5372: aload #6
    //   5374: aconst_null
    //   5375: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5378: pop
    //   5379: iinc #5, 1
    //   5382: iload_2
    //   5383: ifeq -> 5245
    //   5386: sipush #-20259
    //   5389: sipush #-15421
    //   5392: invokestatic a : (II)Ljava/lang/String;
    //   5395: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5398: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5401: astore_3
    //   5402: aload_3
    //   5403: arraylength
    //   5404: istore #4
    //   5406: iconst_0
    //   5407: istore #5
    //   5409: iload #5
    //   5411: iload #4
    //   5413: if_icmpge -> 5545
    //   5416: aload_3
    //   5417: iload #5
    //   5419: aaload
    //   5420: astore #6
    //   5422: aload #6
    //   5424: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5427: pop
    //   5428: aload #6
    //   5430: invokevirtual getModifiers : ()I
    //   5433: invokestatic isStatic : (I)Z
    //   5436: ifeq -> 5531
    //   5439: aload #6
    //   5441: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5444: arraylength
    //   5445: iconst_2
    //   5446: if_icmpne -> 5531
    //   5449: goto -> 5456
    //   5452: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5455: athrow
    //   5456: aload #6
    //   5458: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5461: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   5464: invokevirtual equals : (Ljava/lang/Object;)Z
    //   5467: ifeq -> 5531
    //   5470: goto -> 5477
    //   5473: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5476: athrow
    //   5477: aload #6
    //   5479: iconst_1
    //   5480: invokevirtual setAccessible : (Z)V
    //   5483: aload #6
    //   5485: aconst_null
    //   5486: iconst_2
    //   5487: anewarray java/lang/Object
    //   5490: dup
    //   5491: iconst_0
    //   5492: aload_0
    //   5493: aastore
    //   5494: dup
    //   5495: iconst_1
    //   5496: aload_1
    //   5497: ifnonnull -> 5515
    //   5500: goto -> 5507
    //   5503: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5506: athrow
    //   5507: aload_1
    //   5508: goto -> 5522
    //   5511: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5514: athrow
    //   5515: aload_1
    //   5516: checkcast [B
    //   5519: invokevirtual clone : ()Ljava/lang/Object;
    //   5522: aastore
    //   5523: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5526: pop
    //   5527: iload_2
    //   5528: ifeq -> 5545
    //   5531: iinc #5, 1
    //   5534: iload_2
    //   5535: ifeq -> 5409
    //   5538: goto -> 5545
    //   5541: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5544: athrow
    //   5545: getstatic burp/Zzb2.ZW : Ljava/lang/Object;
    //   5548: checkcast java/math/BigInteger
    //   5551: invokevirtual intValue : ()I
    //   5554: i2l
    //   5555: invokestatic currentTimeMillis : ()J
    //   5558: ladd
    //   5559: getstatic burp/Ztpg.Z_ : Ljava/lang/Object;
    //   5562: checkcast java/math/BigInteger
    //   5565: invokevirtual intValue : ()I
    //   5568: i2l
    //   5569: lcmp
    //   5570: ifge -> 5902
    //   5573: sipush #-20277
    //   5576: sipush #28571
    //   5579: invokestatic a : (II)Ljava/lang/String;
    //   5582: iconst_1
    //   5583: ldc burp/Zl50
    //   5585: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5588: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5591: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5594: astore_3
    //   5595: aload_3
    //   5596: arraylength
    //   5597: istore #4
    //   5599: iconst_0
    //   5600: istore #5
    //   5602: iload #5
    //   5604: iload #4
    //   5606: if_icmpge -> 5743
    //   5609: aload_3
    //   5610: iload #5
    //   5612: aaload
    //   5613: astore #6
    //   5615: aload #6
    //   5617: invokevirtual getModifiers : ()I
    //   5620: invokestatic isStatic : (I)Z
    //   5623: ifne -> 5633
    //   5626: goto -> 5736
    //   5629: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5632: athrow
    //   5633: aload #6
    //   5635: invokevirtual getType : ()Ljava/lang/Class;
    //   5638: astore #7
    //   5640: aload #7
    //   5642: ifnull -> 5723
    //   5645: aload #7
    //   5647: invokevirtual isPrimitive : ()Z
    //   5650: ifne -> 5723
    //   5653: goto -> 5660
    //   5656: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5659: athrow
    //   5660: aload #7
    //   5662: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5665: ifnull -> 5723
    //   5668: goto -> 5675
    //   5671: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5674: athrow
    //   5675: aload #7
    //   5677: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5680: invokevirtual getName : ()Ljava/lang/String;
    //   5683: ifnull -> 5723
    //   5686: goto -> 5693
    //   5689: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5692: athrow
    //   5693: aload #7
    //   5695: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5698: invokevirtual getName : ()Ljava/lang/String;
    //   5701: sipush #-20268
    //   5704: sipush #19182
    //   5707: invokestatic a : (II)Ljava/lang/String;
    //   5710: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5713: ifne -> 5723
    //   5716: goto -> 5723
    //   5719: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5722: athrow
    //   5723: aload #6
    //   5725: iconst_1
    //   5726: invokevirtual setAccessible : (Z)V
    //   5729: aload #6
    //   5731: aconst_null
    //   5732: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5735: pop
    //   5736: iinc #5, 1
    //   5739: iload_2
    //   5740: ifeq -> 5602
    //   5743: sipush #-20264
    //   5746: sipush #-9352
    //   5749: invokestatic a : (II)Ljava/lang/String;
    //   5752: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5755: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5758: astore_3
    //   5759: aload_3
    //   5760: arraylength
    //   5761: istore #4
    //   5763: iconst_0
    //   5764: istore #5
    //   5766: iload #5
    //   5768: iload #4
    //   5770: if_icmpge -> 5902
    //   5773: aload_3
    //   5774: iload #5
    //   5776: aaload
    //   5777: astore #6
    //   5779: aload #6
    //   5781: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5784: pop
    //   5785: aload #6
    //   5787: invokevirtual getModifiers : ()I
    //   5790: invokestatic isStatic : (I)Z
    //   5793: ifeq -> 5888
    //   5796: aload #6
    //   5798: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5801: arraylength
    //   5802: iconst_2
    //   5803: if_icmpne -> 5888
    //   5806: goto -> 5813
    //   5809: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5812: athrow
    //   5813: aload #6
    //   5815: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5818: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   5821: invokevirtual equals : (Ljava/lang/Object;)Z
    //   5824: ifeq -> 5888
    //   5827: goto -> 5834
    //   5830: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5833: athrow
    //   5834: aload #6
    //   5836: iconst_1
    //   5837: invokevirtual setAccessible : (Z)V
    //   5840: aload #6
    //   5842: aconst_null
    //   5843: iconst_2
    //   5844: anewarray java/lang/Object
    //   5847: dup
    //   5848: iconst_0
    //   5849: aload_0
    //   5850: aastore
    //   5851: dup
    //   5852: iconst_1
    //   5853: aload_1
    //   5854: ifnonnull -> 5872
    //   5857: goto -> 5864
    //   5860: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5863: athrow
    //   5864: aload_1
    //   5865: goto -> 5879
    //   5868: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5871: athrow
    //   5872: aload_1
    //   5873: checkcast [B
    //   5876: invokevirtual clone : ()Ljava/lang/Object;
    //   5879: aastore
    //   5880: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5883: pop
    //   5884: iload_2
    //   5885: ifeq -> 5902
    //   5888: iinc #5, 1
    //   5891: iload_2
    //   5892: ifeq -> 5766
    //   5895: goto -> 5902
    //   5898: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5901: athrow
    //   5902: iconst_0
    //   5903: istore_3
    //   5904: getstatic burp/Zxee.Zd : Ljava/lang/String;
    //   5907: getstatic burp/Zb8_.ZT : Ljava/lang/Object;
    //   5910: checkcast java/math/BigInteger
    //   5913: invokevirtual intValue : ()I
    //   5916: bipush #32
    //   5918: irem
    //   5919: invokestatic abs : (I)I
    //   5922: invokevirtual charAt : (I)C
    //   5925: getstatic burp/Zeai.ZA : Ljava/lang/String;
    //   5928: getstatic burp/Zrnw.ZN : Ljava/lang/Object;
    //   5931: checkcast java/math/BigInteger
    //   5934: invokevirtual intValue : ()I
    //   5937: bipush #32
    //   5939: irem
    //   5940: invokestatic abs : (I)I
    //   5943: invokevirtual charAt : (I)C
    //   5946: if_icmpgt -> 6290
    //   5949: sipush #-20267
    //   5952: sipush #3892
    //   5955: invokestatic a : (II)Ljava/lang/String;
    //   5958: iconst_1
    //   5959: ldc burp/Zzxa
    //   5961: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5964: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5967: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5970: astore #4
    //   5972: aload #4
    //   5974: arraylength
    //   5975: istore #5
    //   5977: iconst_0
    //   5978: istore #6
    //   5980: iload #6
    //   5982: iload #5
    //   5984: if_icmpge -> 6122
    //   5987: aload #4
    //   5989: iload #6
    //   5991: aaload
    //   5992: astore #7
    //   5994: aload #7
    //   5996: invokevirtual getModifiers : ()I
    //   5999: invokestatic isStatic : (I)Z
    //   6002: ifne -> 6012
    //   6005: goto -> 6115
    //   6008: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6011: athrow
    //   6012: aload #7
    //   6014: invokevirtual getType : ()Ljava/lang/Class;
    //   6017: astore #8
    //   6019: aload #8
    //   6021: ifnull -> 6102
    //   6024: aload #8
    //   6026: invokevirtual isPrimitive : ()Z
    //   6029: ifne -> 6102
    //   6032: goto -> 6039
    //   6035: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6038: athrow
    //   6039: aload #8
    //   6041: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6044: ifnull -> 6102
    //   6047: goto -> 6054
    //   6050: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6053: athrow
    //   6054: aload #8
    //   6056: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6059: invokevirtual getName : ()Ljava/lang/String;
    //   6062: ifnull -> 6102
    //   6065: goto -> 6072
    //   6068: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6071: athrow
    //   6072: aload #8
    //   6074: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6077: invokevirtual getName : ()Ljava/lang/String;
    //   6080: sipush #-20268
    //   6083: sipush #19182
    //   6086: invokestatic a : (II)Ljava/lang/String;
    //   6089: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   6092: ifne -> 6102
    //   6095: goto -> 6102
    //   6098: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6101: athrow
    //   6102: aload #7
    //   6104: iconst_1
    //   6105: invokevirtual setAccessible : (Z)V
    //   6108: aload #7
    //   6110: aconst_null
    //   6111: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   6114: pop
    //   6115: iinc #6, 1
    //   6118: iload_2
    //   6119: ifeq -> 5980
    //   6122: sipush #-20275
    //   6125: sipush #-2913
    //   6128: invokestatic a : (II)Ljava/lang/String;
    //   6131: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   6134: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   6137: astore #4
    //   6139: aload #4
    //   6141: arraylength
    //   6142: istore #5
    //   6144: iconst_0
    //   6145: istore #6
    //   6147: iload #6
    //   6149: iload #5
    //   6151: if_icmpge -> 6287
    //   6154: aload #4
    //   6156: iload #6
    //   6158: aaload
    //   6159: astore #7
    //   6161: aload #7
    //   6163: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6166: pop
    //   6167: aload #7
    //   6169: invokevirtual getModifiers : ()I
    //   6172: invokestatic isStatic : (I)Z
    //   6175: ifeq -> 6273
    //   6178: aload #7
    //   6180: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6183: arraylength
    //   6184: iconst_2
    //   6185: if_icmpne -> 6273
    //   6188: goto -> 6195
    //   6191: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6194: athrow
    //   6195: aload #7
    //   6197: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   6200: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   6203: if_acmpne -> 6273
    //   6206: goto -> 6213
    //   6209: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6212: athrow
    //   6213: aload #7
    //   6215: iconst_1
    //   6216: invokevirtual setAccessible : (Z)V
    //   6219: aload #7
    //   6221: aconst_null
    //   6222: iconst_2
    //   6223: anewarray java/lang/Object
    //   6226: dup
    //   6227: iconst_0
    //   6228: aload_0
    //   6229: aastore
    //   6230: dup
    //   6231: iconst_1
    //   6232: aload_1
    //   6233: ifnonnull -> 6251
    //   6236: goto -> 6243
    //   6239: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6242: athrow
    //   6243: aload_1
    //   6244: goto -> 6258
    //   6247: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6250: athrow
    //   6251: aload_1
    //   6252: checkcast [B
    //   6255: invokevirtual clone : ()Ljava/lang/Object;
    //   6258: aastore
    //   6259: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   6262: checkcast java/lang/Boolean
    //   6265: invokevirtual booleanValue : ()Z
    //   6268: istore_3
    //   6269: iload_2
    //   6270: ifeq -> 6287
    //   6273: iinc #6, 1
    //   6276: iload_2
    //   6277: ifeq -> 6147
    //   6280: goto -> 6287
    //   6283: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6286: athrow
    //   6287: goto -> 6628
    //   6290: sipush #-20274
    //   6293: sipush #-23265
    //   6296: invokestatic a : (II)Ljava/lang/String;
    //   6299: iconst_1
    //   6300: ldc burp/Zzi_
    //   6302: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   6305: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   6308: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   6311: astore #4
    //   6313: aload #4
    //   6315: arraylength
    //   6316: istore #5
    //   6318: iconst_0
    //   6319: istore #6
    //   6321: iload #6
    //   6323: iload #5
    //   6325: if_icmpge -> 6463
    //   6328: aload #4
    //   6330: iload #6
    //   6332: aaload
    //   6333: astore #7
    //   6335: aload #7
    //   6337: invokevirtual getModifiers : ()I
    //   6340: invokestatic isStatic : (I)Z
    //   6343: ifne -> 6353
    //   6346: goto -> 6456
    //   6349: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6352: athrow
    //   6353: aload #7
    //   6355: invokevirtual getType : ()Ljava/lang/Class;
    //   6358: astore #8
    //   6360: aload #8
    //   6362: ifnull -> 6443
    //   6365: aload #8
    //   6367: invokevirtual isPrimitive : ()Z
    //   6370: ifne -> 6443
    //   6373: goto -> 6380
    //   6376: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6379: athrow
    //   6380: aload #8
    //   6382: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6385: ifnull -> 6443
    //   6388: goto -> 6395
    //   6391: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6394: athrow
    //   6395: aload #8
    //   6397: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6400: invokevirtual getName : ()Ljava/lang/String;
    //   6403: ifnull -> 6443
    //   6406: goto -> 6413
    //   6409: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6412: athrow
    //   6413: aload #8
    //   6415: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6418: invokevirtual getName : ()Ljava/lang/String;
    //   6421: sipush #-20268
    //   6424: sipush #19182
    //   6427: invokestatic a : (II)Ljava/lang/String;
    //   6430: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   6433: ifne -> 6443
    //   6436: goto -> 6443
    //   6439: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6442: athrow
    //   6443: aload #7
    //   6445: iconst_1
    //   6446: invokevirtual setAccessible : (Z)V
    //   6449: aload #7
    //   6451: aconst_null
    //   6452: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   6455: pop
    //   6456: iinc #6, 1
    //   6459: iload_2
    //   6460: ifeq -> 6321
    //   6463: sipush #-20285
    //   6466: sipush #16409
    //   6469: invokestatic a : (II)Ljava/lang/String;
    //   6472: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   6475: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   6478: astore #4
    //   6480: aload #4
    //   6482: arraylength
    //   6483: istore #5
    //   6485: iconst_0
    //   6486: istore #6
    //   6488: iload #6
    //   6490: iload #5
    //   6492: if_icmpge -> 6628
    //   6495: aload #4
    //   6497: iload #6
    //   6499: aaload
    //   6500: astore #7
    //   6502: aload #7
    //   6504: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6507: pop
    //   6508: aload #7
    //   6510: invokevirtual getModifiers : ()I
    //   6513: invokestatic isStatic : (I)Z
    //   6516: ifeq -> 6614
    //   6519: aload #7
    //   6521: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6524: arraylength
    //   6525: iconst_2
    //   6526: if_icmpne -> 6614
    //   6529: goto -> 6536
    //   6532: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6535: athrow
    //   6536: aload #7
    //   6538: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   6541: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   6544: if_acmpne -> 6614
    //   6547: goto -> 6554
    //   6550: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6553: athrow
    //   6554: aload #7
    //   6556: iconst_1
    //   6557: invokevirtual setAccessible : (Z)V
    //   6560: aload #7
    //   6562: aconst_null
    //   6563: iconst_2
    //   6564: anewarray java/lang/Object
    //   6567: dup
    //   6568: iconst_0
    //   6569: aload_0
    //   6570: aastore
    //   6571: dup
    //   6572: iconst_1
    //   6573: aload_1
    //   6574: ifnonnull -> 6592
    //   6577: goto -> 6584
    //   6580: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6583: athrow
    //   6584: aload_1
    //   6585: goto -> 6599
    //   6588: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6591: athrow
    //   6592: aload_1
    //   6593: checkcast [B
    //   6596: invokevirtual clone : ()Ljava/lang/Object;
    //   6599: aastore
    //   6600: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   6603: checkcast java/lang/Boolean
    //   6606: invokevirtual booleanValue : ()Z
    //   6609: istore_3
    //   6610: iload_2
    //   6611: ifeq -> 6628
    //   6614: iinc #6, 1
    //   6617: iload_2
    //   6618: ifeq -> 6488
    //   6621: goto -> 6628
    //   6624: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6627: athrow
    //   6628: iload_3
    //   6629: ifeq -> 6634
    //   6632: iload_3
    //   6633: ireturn
    //   6634: getstatic burp/Zrt9.Zc : Ljava/lang/String;
    //   6637: getstatic burp/Zzoc.Zx : Ljava/lang/Object;
    //   6640: checkcast java/math/BigInteger
    //   6643: invokevirtual intValue : ()I
    //   6646: bipush #32
    //   6648: irem
    //   6649: invokestatic abs : (I)I
    //   6652: invokevirtual charAt : (I)C
    //   6655: getstatic burp/Zzpj.ZR : Ljava/lang/String;
    //   6658: getstatic burp/Zlwi.Zw : Ljava/lang/Object;
    //   6661: checkcast java/math/BigInteger
    //   6664: invokevirtual intValue : ()I
    //   6667: bipush #32
    //   6669: irem
    //   6670: invokestatic abs : (I)I
    //   6673: invokevirtual charAt : (I)C
    //   6676: if_icmple -> 7021
    //   6679: sipush #-20269
    //   6682: sipush #17547
    //   6685: invokestatic a : (II)Ljava/lang/String;
    //   6688: iconst_1
    //   6689: ldc burp/Zlbr
    //   6691: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   6694: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   6697: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   6700: astore #4
    //   6702: aload #4
    //   6704: arraylength
    //   6705: istore #5
    //   6707: iconst_0
    //   6708: istore #6
    //   6710: iload #6
    //   6712: iload #5
    //   6714: if_icmpge -> 6852
    //   6717: aload #4
    //   6719: iload #6
    //   6721: aaload
    //   6722: astore #7
    //   6724: aload #7
    //   6726: invokevirtual getModifiers : ()I
    //   6729: invokestatic isStatic : (I)Z
    //   6732: ifne -> 6742
    //   6735: goto -> 6845
    //   6738: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6741: athrow
    //   6742: aload #7
    //   6744: invokevirtual getType : ()Ljava/lang/Class;
    //   6747: astore #8
    //   6749: aload #8
    //   6751: ifnull -> 6832
    //   6754: aload #8
    //   6756: invokevirtual isPrimitive : ()Z
    //   6759: ifne -> 6832
    //   6762: goto -> 6769
    //   6765: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6768: athrow
    //   6769: aload #8
    //   6771: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6774: ifnull -> 6832
    //   6777: goto -> 6784
    //   6780: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6783: athrow
    //   6784: aload #8
    //   6786: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6789: invokevirtual getName : ()Ljava/lang/String;
    //   6792: ifnull -> 6832
    //   6795: goto -> 6802
    //   6798: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6801: athrow
    //   6802: aload #8
    //   6804: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6807: invokevirtual getName : ()Ljava/lang/String;
    //   6810: sipush #-20268
    //   6813: sipush #19182
    //   6816: invokestatic a : (II)Ljava/lang/String;
    //   6819: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   6822: ifne -> 6832
    //   6825: goto -> 6832
    //   6828: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6831: athrow
    //   6832: aload #7
    //   6834: iconst_1
    //   6835: invokevirtual setAccessible : (Z)V
    //   6838: aload #7
    //   6840: aconst_null
    //   6841: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   6844: pop
    //   6845: iinc #6, 1
    //   6848: iload_2
    //   6849: ifeq -> 6710
    //   6852: sipush #-20258
    //   6855: sipush #22745
    //   6858: invokestatic a : (II)Ljava/lang/String;
    //   6861: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   6864: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   6867: astore #4
    //   6869: aload #4
    //   6871: arraylength
    //   6872: istore #5
    //   6874: iconst_0
    //   6875: istore #6
    //   6877: iload #6
    //   6879: iload #5
    //   6881: if_icmpge -> 7017
    //   6884: aload #4
    //   6886: iload #6
    //   6888: aaload
    //   6889: astore #7
    //   6891: aload #7
    //   6893: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6896: pop
    //   6897: aload #7
    //   6899: invokevirtual getModifiers : ()I
    //   6902: invokestatic isStatic : (I)Z
    //   6905: ifeq -> 7003
    //   6908: aload #7
    //   6910: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6913: arraylength
    //   6914: iconst_2
    //   6915: if_icmpne -> 7003
    //   6918: goto -> 6925
    //   6921: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6924: athrow
    //   6925: aload #7
    //   6927: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   6930: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   6933: if_acmpne -> 7003
    //   6936: goto -> 6943
    //   6939: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6942: athrow
    //   6943: aload #7
    //   6945: iconst_1
    //   6946: invokevirtual setAccessible : (Z)V
    //   6949: aload #7
    //   6951: aconst_null
    //   6952: iconst_2
    //   6953: anewarray java/lang/Object
    //   6956: dup
    //   6957: iconst_0
    //   6958: aload_0
    //   6959: aastore
    //   6960: dup
    //   6961: iconst_1
    //   6962: aload_1
    //   6963: ifnonnull -> 6981
    //   6966: goto -> 6973
    //   6969: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6972: athrow
    //   6973: aload_1
    //   6974: goto -> 6988
    //   6977: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6980: athrow
    //   6981: aload_1
    //   6982: checkcast [B
    //   6985: invokevirtual clone : ()Ljava/lang/Object;
    //   6988: aastore
    //   6989: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   6992: checkcast java/lang/Boolean
    //   6995: invokevirtual booleanValue : ()Z
    //   6998: istore_3
    //   6999: iload_2
    //   7000: ifeq -> 7017
    //   7003: iinc #6, 1
    //   7006: iload_2
    //   7007: ifeq -> 6877
    //   7010: goto -> 7017
    //   7013: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7016: athrow
    //   7017: iload_2
    //   7018: ifeq -> 7359
    //   7021: sipush #-20281
    //   7024: sipush #-24829
    //   7027: invokestatic a : (II)Ljava/lang/String;
    //   7030: iconst_1
    //   7031: ldc burp/Zrxm
    //   7033: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   7036: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   7039: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   7042: astore #4
    //   7044: aload #4
    //   7046: arraylength
    //   7047: istore #5
    //   7049: iconst_0
    //   7050: istore #6
    //   7052: iload #6
    //   7054: iload #5
    //   7056: if_icmpge -> 7194
    //   7059: aload #4
    //   7061: iload #6
    //   7063: aaload
    //   7064: astore #7
    //   7066: aload #7
    //   7068: invokevirtual getModifiers : ()I
    //   7071: invokestatic isStatic : (I)Z
    //   7074: ifne -> 7084
    //   7077: goto -> 7187
    //   7080: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7083: athrow
    //   7084: aload #7
    //   7086: invokevirtual getType : ()Ljava/lang/Class;
    //   7089: astore #8
    //   7091: aload #8
    //   7093: ifnull -> 7174
    //   7096: aload #8
    //   7098: invokevirtual isPrimitive : ()Z
    //   7101: ifne -> 7174
    //   7104: goto -> 7111
    //   7107: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7110: athrow
    //   7111: aload #8
    //   7113: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7116: ifnull -> 7174
    //   7119: goto -> 7126
    //   7122: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7125: athrow
    //   7126: aload #8
    //   7128: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7131: invokevirtual getName : ()Ljava/lang/String;
    //   7134: ifnull -> 7174
    //   7137: goto -> 7144
    //   7140: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7143: athrow
    //   7144: aload #8
    //   7146: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7149: invokevirtual getName : ()Ljava/lang/String;
    //   7152: sipush #-20268
    //   7155: sipush #19182
    //   7158: invokestatic a : (II)Ljava/lang/String;
    //   7161: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   7164: ifne -> 7174
    //   7167: goto -> 7174
    //   7170: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7173: athrow
    //   7174: aload #7
    //   7176: iconst_1
    //   7177: invokevirtual setAccessible : (Z)V
    //   7180: aload #7
    //   7182: aconst_null
    //   7183: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   7186: pop
    //   7187: iinc #6, 1
    //   7190: iload_2
    //   7191: ifeq -> 7052
    //   7194: sipush #-20257
    //   7197: sipush #-2366
    //   7200: invokestatic a : (II)Ljava/lang/String;
    //   7203: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   7206: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   7209: astore #4
    //   7211: aload #4
    //   7213: arraylength
    //   7214: istore #5
    //   7216: iconst_0
    //   7217: istore #6
    //   7219: iload #6
    //   7221: iload #5
    //   7223: if_icmpge -> 7359
    //   7226: aload #4
    //   7228: iload #6
    //   7230: aaload
    //   7231: astore #7
    //   7233: aload #7
    //   7235: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   7238: pop
    //   7239: aload #7
    //   7241: invokevirtual getModifiers : ()I
    //   7244: invokestatic isStatic : (I)Z
    //   7247: ifeq -> 7345
    //   7250: aload #7
    //   7252: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   7255: arraylength
    //   7256: iconst_2
    //   7257: if_icmpne -> 7345
    //   7260: goto -> 7267
    //   7263: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7266: athrow
    //   7267: aload #7
    //   7269: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   7272: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   7275: if_acmpne -> 7345
    //   7278: goto -> 7285
    //   7281: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7284: athrow
    //   7285: aload #7
    //   7287: iconst_1
    //   7288: invokevirtual setAccessible : (Z)V
    //   7291: aload #7
    //   7293: aconst_null
    //   7294: iconst_2
    //   7295: anewarray java/lang/Object
    //   7298: dup
    //   7299: iconst_0
    //   7300: aload_0
    //   7301: aastore
    //   7302: dup
    //   7303: iconst_1
    //   7304: aload_1
    //   7305: ifnonnull -> 7323
    //   7308: goto -> 7315
    //   7311: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7314: athrow
    //   7315: aload_1
    //   7316: goto -> 7330
    //   7319: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7322: athrow
    //   7323: aload_1
    //   7324: checkcast [B
    //   7327: invokevirtual clone : ()Ljava/lang/Object;
    //   7330: aastore
    //   7331: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   7334: checkcast java/lang/Boolean
    //   7337: invokevirtual booleanValue : ()Z
    //   7340: istore_3
    //   7341: iload_2
    //   7342: ifeq -> 7359
    //   7345: iinc #6, 1
    //   7348: iload_2
    //   7349: ifeq -> 7219
    //   7352: goto -> 7359
    //   7355: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7358: athrow
    //   7359: iload_3
    //   7360: ifeq -> 7365
    //   7363: iload_3
    //   7364: ireturn
    //   7365: getstatic burp/Zr9j.Zc : Ljava/lang/String;
    //   7368: getstatic burp/Zktq.Zn : Ljava/lang/Object;
    //   7371: checkcast java/math/BigInteger
    //   7374: invokevirtual intValue : ()I
    //   7377: bipush #32
    //   7379: irem
    //   7380: invokestatic abs : (I)I
    //   7383: invokevirtual charAt : (I)C
    //   7386: getstatic burp/Zrct.ZT : Ljava/lang/String;
    //   7389: getstatic burp/Zl1z.ZV : Ljava/lang/Object;
    //   7392: checkcast java/math/BigInteger
    //   7395: invokevirtual intValue : ()I
    //   7398: bipush #32
    //   7400: irem
    //   7401: invokestatic abs : (I)I
    //   7404: invokevirtual charAt : (I)C
    //   7407: if_icmpgt -> 7752
    //   7410: sipush #-20278
    //   7413: sipush #22042
    //   7416: invokestatic a : (II)Ljava/lang/String;
    //   7419: iconst_1
    //   7420: ldc burp/Zkvr
    //   7422: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   7425: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   7428: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   7431: astore #4
    //   7433: aload #4
    //   7435: arraylength
    //   7436: istore #5
    //   7438: iconst_0
    //   7439: istore #6
    //   7441: iload #6
    //   7443: iload #5
    //   7445: if_icmpge -> 7583
    //   7448: aload #4
    //   7450: iload #6
    //   7452: aaload
    //   7453: astore #7
    //   7455: aload #7
    //   7457: invokevirtual getModifiers : ()I
    //   7460: invokestatic isStatic : (I)Z
    //   7463: ifne -> 7473
    //   7466: goto -> 7576
    //   7469: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7472: athrow
    //   7473: aload #7
    //   7475: invokevirtual getType : ()Ljava/lang/Class;
    //   7478: astore #8
    //   7480: aload #8
    //   7482: ifnull -> 7563
    //   7485: aload #8
    //   7487: invokevirtual isPrimitive : ()Z
    //   7490: ifne -> 7563
    //   7493: goto -> 7500
    //   7496: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7499: athrow
    //   7500: aload #8
    //   7502: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7505: ifnull -> 7563
    //   7508: goto -> 7515
    //   7511: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7514: athrow
    //   7515: aload #8
    //   7517: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7520: invokevirtual getName : ()Ljava/lang/String;
    //   7523: ifnull -> 7563
    //   7526: goto -> 7533
    //   7529: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7532: athrow
    //   7533: aload #8
    //   7535: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7538: invokevirtual getName : ()Ljava/lang/String;
    //   7541: sipush #-20268
    //   7544: sipush #19182
    //   7547: invokestatic a : (II)Ljava/lang/String;
    //   7550: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   7553: ifne -> 7563
    //   7556: goto -> 7563
    //   7559: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7562: athrow
    //   7563: aload #7
    //   7565: iconst_1
    //   7566: invokevirtual setAccessible : (Z)V
    //   7569: aload #7
    //   7571: aconst_null
    //   7572: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   7575: pop
    //   7576: iinc #6, 1
    //   7579: iload_2
    //   7580: ifeq -> 7441
    //   7583: sipush #-20276
    //   7586: sipush #12372
    //   7589: invokestatic a : (II)Ljava/lang/String;
    //   7592: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   7595: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   7598: astore #4
    //   7600: aload #4
    //   7602: arraylength
    //   7603: istore #5
    //   7605: iconst_0
    //   7606: istore #6
    //   7608: iload #6
    //   7610: iload #5
    //   7612: if_icmpge -> 7748
    //   7615: aload #4
    //   7617: iload #6
    //   7619: aaload
    //   7620: astore #7
    //   7622: aload #7
    //   7624: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   7627: pop
    //   7628: aload #7
    //   7630: invokevirtual getModifiers : ()I
    //   7633: invokestatic isStatic : (I)Z
    //   7636: ifeq -> 7734
    //   7639: aload #7
    //   7641: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   7644: arraylength
    //   7645: iconst_2
    //   7646: if_icmpne -> 7734
    //   7649: goto -> 7656
    //   7652: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7655: athrow
    //   7656: aload #7
    //   7658: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   7661: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   7664: if_acmpne -> 7734
    //   7667: goto -> 7674
    //   7670: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7673: athrow
    //   7674: aload #7
    //   7676: iconst_1
    //   7677: invokevirtual setAccessible : (Z)V
    //   7680: aload #7
    //   7682: aconst_null
    //   7683: iconst_2
    //   7684: anewarray java/lang/Object
    //   7687: dup
    //   7688: iconst_0
    //   7689: aload_0
    //   7690: aastore
    //   7691: dup
    //   7692: iconst_1
    //   7693: aload_1
    //   7694: ifnonnull -> 7712
    //   7697: goto -> 7704
    //   7700: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7703: athrow
    //   7704: aload_1
    //   7705: goto -> 7719
    //   7708: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7711: athrow
    //   7712: aload_1
    //   7713: checkcast [B
    //   7716: invokevirtual clone : ()Ljava/lang/Object;
    //   7719: aastore
    //   7720: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   7723: checkcast java/lang/Boolean
    //   7726: invokevirtual booleanValue : ()Z
    //   7729: istore_3
    //   7730: iload_2
    //   7731: ifeq -> 7748
    //   7734: iinc #6, 1
    //   7737: iload_2
    //   7738: ifeq -> 7608
    //   7741: goto -> 7748
    //   7744: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7747: athrow
    //   7748: iload_2
    //   7749: ifeq -> 8090
    //   7752: sipush #-20286
    //   7755: sipush #-4658
    //   7758: invokestatic a : (II)Ljava/lang/String;
    //   7761: iconst_1
    //   7762: ldc burp/Zg8
    //   7764: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   7767: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   7770: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   7773: astore #4
    //   7775: aload #4
    //   7777: arraylength
    //   7778: istore #5
    //   7780: iconst_0
    //   7781: istore #6
    //   7783: iload #6
    //   7785: iload #5
    //   7787: if_icmpge -> 7925
    //   7790: aload #4
    //   7792: iload #6
    //   7794: aaload
    //   7795: astore #7
    //   7797: aload #7
    //   7799: invokevirtual getModifiers : ()I
    //   7802: invokestatic isStatic : (I)Z
    //   7805: ifne -> 7815
    //   7808: goto -> 7918
    //   7811: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7814: athrow
    //   7815: aload #7
    //   7817: invokevirtual getType : ()Ljava/lang/Class;
    //   7820: astore #8
    //   7822: aload #8
    //   7824: ifnull -> 7905
    //   7827: aload #8
    //   7829: invokevirtual isPrimitive : ()Z
    //   7832: ifne -> 7905
    //   7835: goto -> 7842
    //   7838: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7841: athrow
    //   7842: aload #8
    //   7844: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7847: ifnull -> 7905
    //   7850: goto -> 7857
    //   7853: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7856: athrow
    //   7857: aload #8
    //   7859: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7862: invokevirtual getName : ()Ljava/lang/String;
    //   7865: ifnull -> 7905
    //   7868: goto -> 7875
    //   7871: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7874: athrow
    //   7875: aload #8
    //   7877: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7880: invokevirtual getName : ()Ljava/lang/String;
    //   7883: sipush #-20268
    //   7886: sipush #19182
    //   7889: invokestatic a : (II)Ljava/lang/String;
    //   7892: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   7895: ifne -> 7905
    //   7898: goto -> 7905
    //   7901: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7904: athrow
    //   7905: aload #7
    //   7907: iconst_1
    //   7908: invokevirtual setAccessible : (Z)V
    //   7911: aload #7
    //   7913: aconst_null
    //   7914: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   7917: pop
    //   7918: iinc #6, 1
    //   7921: iload_2
    //   7922: ifeq -> 7783
    //   7925: sipush #-20273
    //   7928: sipush #-13803
    //   7931: invokestatic a : (II)Ljava/lang/String;
    //   7934: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   7937: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   7940: astore #4
    //   7942: aload #4
    //   7944: arraylength
    //   7945: istore #5
    //   7947: iconst_0
    //   7948: istore #6
    //   7950: iload #6
    //   7952: iload #5
    //   7954: if_icmpge -> 8090
    //   7957: aload #4
    //   7959: iload #6
    //   7961: aaload
    //   7962: astore #7
    //   7964: aload #7
    //   7966: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   7969: pop
    //   7970: aload #7
    //   7972: invokevirtual getModifiers : ()I
    //   7975: invokestatic isStatic : (I)Z
    //   7978: ifeq -> 8076
    //   7981: aload #7
    //   7983: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   7986: arraylength
    //   7987: iconst_2
    //   7988: if_icmpne -> 8076
    //   7991: goto -> 7998
    //   7994: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7997: athrow
    //   7998: aload #7
    //   8000: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   8003: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   8006: if_acmpne -> 8076
    //   8009: goto -> 8016
    //   8012: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8015: athrow
    //   8016: aload #7
    //   8018: iconst_1
    //   8019: invokevirtual setAccessible : (Z)V
    //   8022: aload #7
    //   8024: aconst_null
    //   8025: iconst_2
    //   8026: anewarray java/lang/Object
    //   8029: dup
    //   8030: iconst_0
    //   8031: aload_0
    //   8032: aastore
    //   8033: dup
    //   8034: iconst_1
    //   8035: aload_1
    //   8036: ifnonnull -> 8054
    //   8039: goto -> 8046
    //   8042: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8045: athrow
    //   8046: aload_1
    //   8047: goto -> 8061
    //   8050: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8053: athrow
    //   8054: aload_1
    //   8055: checkcast [B
    //   8058: invokevirtual clone : ()Ljava/lang/Object;
    //   8061: aastore
    //   8062: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   8065: checkcast java/lang/Boolean
    //   8068: invokevirtual booleanValue : ()Z
    //   8071: istore_3
    //   8072: iload_2
    //   8073: ifeq -> 8090
    //   8076: iinc #6, 1
    //   8079: iload_2
    //   8080: ifeq -> 7950
    //   8083: goto -> 8090
    //   8086: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8089: athrow
    //   8090: iload_3
    //   8091: ifeq -> 8096
    //   8094: iload_3
    //   8095: ireturn
    //   8096: getstatic burp/Zz0.ZX : Ljava/lang/String;
    //   8099: getstatic burp/Zlzs.ZL : Ljava/lang/Object;
    //   8102: checkcast java/math/BigInteger
    //   8105: invokevirtual intValue : ()I
    //   8108: bipush #32
    //   8110: irem
    //   8111: invokestatic abs : (I)I
    //   8114: invokevirtual charAt : (I)C
    //   8117: getstatic burp/Zbzj.Zw : Ljava/lang/String;
    //   8120: getstatic burp/Zspk.ZF : Ljava/lang/Object;
    //   8123: checkcast java/math/BigInteger
    //   8126: invokevirtual intValue : ()I
    //   8129: bipush #32
    //   8131: irem
    //   8132: invokestatic abs : (I)I
    //   8135: invokevirtual charAt : (I)C
    //   8138: if_icmpgt -> 8483
    //   8141: sipush #-20262
    //   8144: sipush #16502
    //   8147: invokestatic a : (II)Ljava/lang/String;
    //   8150: iconst_1
    //   8151: ldc burp/Zlem
    //   8153: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   8156: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   8159: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   8162: astore #4
    //   8164: aload #4
    //   8166: arraylength
    //   8167: istore #5
    //   8169: iconst_0
    //   8170: istore #6
    //   8172: iload #6
    //   8174: iload #5
    //   8176: if_icmpge -> 8314
    //   8179: aload #4
    //   8181: iload #6
    //   8183: aaload
    //   8184: astore #7
    //   8186: aload #7
    //   8188: invokevirtual getModifiers : ()I
    //   8191: invokestatic isStatic : (I)Z
    //   8194: ifne -> 8204
    //   8197: goto -> 8307
    //   8200: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8203: athrow
    //   8204: aload #7
    //   8206: invokevirtual getType : ()Ljava/lang/Class;
    //   8209: astore #8
    //   8211: aload #8
    //   8213: ifnull -> 8294
    //   8216: aload #8
    //   8218: invokevirtual isPrimitive : ()Z
    //   8221: ifne -> 8294
    //   8224: goto -> 8231
    //   8227: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8230: athrow
    //   8231: aload #8
    //   8233: invokevirtual getPackage : ()Ljava/lang/Package;
    //   8236: ifnull -> 8294
    //   8239: goto -> 8246
    //   8242: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8245: athrow
    //   8246: aload #8
    //   8248: invokevirtual getPackage : ()Ljava/lang/Package;
    //   8251: invokevirtual getName : ()Ljava/lang/String;
    //   8254: ifnull -> 8294
    //   8257: goto -> 8264
    //   8260: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8263: athrow
    //   8264: aload #8
    //   8266: invokevirtual getPackage : ()Ljava/lang/Package;
    //   8269: invokevirtual getName : ()Ljava/lang/String;
    //   8272: sipush #-20268
    //   8275: sipush #19182
    //   8278: invokestatic a : (II)Ljava/lang/String;
    //   8281: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   8284: ifne -> 8294
    //   8287: goto -> 8294
    //   8290: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8293: athrow
    //   8294: aload #7
    //   8296: iconst_1
    //   8297: invokevirtual setAccessible : (Z)V
    //   8300: aload #7
    //   8302: aconst_null
    //   8303: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   8306: pop
    //   8307: iinc #6, 1
    //   8310: iload_2
    //   8311: ifeq -> 8172
    //   8314: sipush #-20284
    //   8317: sipush #-19703
    //   8320: invokestatic a : (II)Ljava/lang/String;
    //   8323: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   8326: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   8329: astore #4
    //   8331: aload #4
    //   8333: arraylength
    //   8334: istore #5
    //   8336: iconst_0
    //   8337: istore #6
    //   8339: iload #6
    //   8341: iload #5
    //   8343: if_icmpge -> 8479
    //   8346: aload #4
    //   8348: iload #6
    //   8350: aaload
    //   8351: astore #7
    //   8353: aload #7
    //   8355: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   8358: pop
    //   8359: aload #7
    //   8361: invokevirtual getModifiers : ()I
    //   8364: invokestatic isStatic : (I)Z
    //   8367: ifeq -> 8465
    //   8370: aload #7
    //   8372: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   8375: arraylength
    //   8376: iconst_2
    //   8377: if_icmpne -> 8465
    //   8380: goto -> 8387
    //   8383: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8386: athrow
    //   8387: aload #7
    //   8389: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   8392: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   8395: if_acmpne -> 8465
    //   8398: goto -> 8405
    //   8401: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8404: athrow
    //   8405: aload #7
    //   8407: iconst_1
    //   8408: invokevirtual setAccessible : (Z)V
    //   8411: aload #7
    //   8413: aconst_null
    //   8414: iconst_2
    //   8415: anewarray java/lang/Object
    //   8418: dup
    //   8419: iconst_0
    //   8420: aload_0
    //   8421: aastore
    //   8422: dup
    //   8423: iconst_1
    //   8424: aload_1
    //   8425: ifnonnull -> 8443
    //   8428: goto -> 8435
    //   8431: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8434: athrow
    //   8435: aload_1
    //   8436: goto -> 8450
    //   8439: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8442: athrow
    //   8443: aload_1
    //   8444: checkcast [B
    //   8447: invokevirtual clone : ()Ljava/lang/Object;
    //   8450: aastore
    //   8451: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   8454: checkcast java/lang/Boolean
    //   8457: invokevirtual booleanValue : ()Z
    //   8460: istore_3
    //   8461: iload_2
    //   8462: ifeq -> 8479
    //   8465: iinc #6, 1
    //   8468: iload_2
    //   8469: ifeq -> 8339
    //   8472: goto -> 8479
    //   8475: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8478: athrow
    //   8479: iload_2
    //   8480: ifeq -> 8821
    //   8483: sipush #-20282
    //   8486: sipush #14464
    //   8489: invokestatic a : (II)Ljava/lang/String;
    //   8492: iconst_1
    //   8493: ldc burp/Zx58
    //   8495: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   8498: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   8501: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   8504: astore #4
    //   8506: aload #4
    //   8508: arraylength
    //   8509: istore #5
    //   8511: iconst_0
    //   8512: istore #6
    //   8514: iload #6
    //   8516: iload #5
    //   8518: if_icmpge -> 8656
    //   8521: aload #4
    //   8523: iload #6
    //   8525: aaload
    //   8526: astore #7
    //   8528: aload #7
    //   8530: invokevirtual getModifiers : ()I
    //   8533: invokestatic isStatic : (I)Z
    //   8536: ifne -> 8546
    //   8539: goto -> 8649
    //   8542: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8545: athrow
    //   8546: aload #7
    //   8548: invokevirtual getType : ()Ljava/lang/Class;
    //   8551: astore #8
    //   8553: aload #8
    //   8555: ifnull -> 8636
    //   8558: aload #8
    //   8560: invokevirtual isPrimitive : ()Z
    //   8563: ifne -> 8636
    //   8566: goto -> 8573
    //   8569: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8572: athrow
    //   8573: aload #8
    //   8575: invokevirtual getPackage : ()Ljava/lang/Package;
    //   8578: ifnull -> 8636
    //   8581: goto -> 8588
    //   8584: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8587: athrow
    //   8588: aload #8
    //   8590: invokevirtual getPackage : ()Ljava/lang/Package;
    //   8593: invokevirtual getName : ()Ljava/lang/String;
    //   8596: ifnull -> 8636
    //   8599: goto -> 8606
    //   8602: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8605: athrow
    //   8606: aload #8
    //   8608: invokevirtual getPackage : ()Ljava/lang/Package;
    //   8611: invokevirtual getName : ()Ljava/lang/String;
    //   8614: sipush #-20268
    //   8617: sipush #19182
    //   8620: invokestatic a : (II)Ljava/lang/String;
    //   8623: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   8626: ifne -> 8636
    //   8629: goto -> 8636
    //   8632: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8635: athrow
    //   8636: aload #7
    //   8638: iconst_1
    //   8639: invokevirtual setAccessible : (Z)V
    //   8642: aload #7
    //   8644: aconst_null
    //   8645: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   8648: pop
    //   8649: iinc #6, 1
    //   8652: iload_2
    //   8653: ifeq -> 8514
    //   8656: sipush #-20287
    //   8659: sipush #3776
    //   8662: invokestatic a : (II)Ljava/lang/String;
    //   8665: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   8668: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   8671: astore #4
    //   8673: aload #4
    //   8675: arraylength
    //   8676: istore #5
    //   8678: iconst_0
    //   8679: istore #6
    //   8681: iload #6
    //   8683: iload #5
    //   8685: if_icmpge -> 8821
    //   8688: aload #4
    //   8690: iload #6
    //   8692: aaload
    //   8693: astore #7
    //   8695: aload #7
    //   8697: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   8700: pop
    //   8701: aload #7
    //   8703: invokevirtual getModifiers : ()I
    //   8706: invokestatic isStatic : (I)Z
    //   8709: ifeq -> 8807
    //   8712: aload #7
    //   8714: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   8717: arraylength
    //   8718: iconst_2
    //   8719: if_icmpne -> 8807
    //   8722: goto -> 8729
    //   8725: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8728: athrow
    //   8729: aload #7
    //   8731: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   8734: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   8737: if_acmpne -> 8807
    //   8740: goto -> 8747
    //   8743: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8746: athrow
    //   8747: aload #7
    //   8749: iconst_1
    //   8750: invokevirtual setAccessible : (Z)V
    //   8753: aload #7
    //   8755: aconst_null
    //   8756: iconst_2
    //   8757: anewarray java/lang/Object
    //   8760: dup
    //   8761: iconst_0
    //   8762: aload_0
    //   8763: aastore
    //   8764: dup
    //   8765: iconst_1
    //   8766: aload_1
    //   8767: ifnonnull -> 8785
    //   8770: goto -> 8777
    //   8773: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8776: athrow
    //   8777: aload_1
    //   8778: goto -> 8792
    //   8781: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8784: athrow
    //   8785: aload_1
    //   8786: checkcast [B
    //   8789: invokevirtual clone : ()Ljava/lang/Object;
    //   8792: aastore
    //   8793: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   8796: checkcast java/lang/Boolean
    //   8799: invokevirtual booleanValue : ()Z
    //   8802: istore_3
    //   8803: iload_2
    //   8804: ifeq -> 8821
    //   8807: iinc #6, 1
    //   8810: iload_2
    //   8811: ifeq -> 8681
    //   8814: goto -> 8821
    //   8817: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   8820: athrow
    //   8821: iload_3
    //   8822: ireturn
    //   8823: astore_3
    //   8824: new java/lang/Exception
    //   8827: dup
    //   8828: aload_3
    //   8829: invokevirtual getMessage : ()Ljava/lang/String;
    //   8832: invokespecial <init> : (Ljava/lang/String;)V
    //   8835: athrow
    // Exception table:
    //   from	to	target	type
    //   4	6633	8823	java/lang/Throwable
    //   185	209	212	java/lang/Throwable
    //   283	320	320	java/lang/Throwable
    //   324	345	345	java/lang/Throwable
    //   349	379	379	java/lang/Throwable
    //   4950	4964	4964	java/lang/Throwable
    //   4975	4988	4991	java/lang/Throwable
    //   4980	5003	5006	java/lang/Throwable
    //   4995	5021	5024	java/lang/Throwable
    //   5010	5051	5054	java/lang/Throwable
    //   5114	5141	5144	java/lang/Throwable
    //   5131	5159	5162	java/lang/Throwable
    //   5148	5195	5198	java/lang/Throwable
    //   5166	5209	5212	java/lang/Throwable
    //   5258	5272	5272	java/lang/Throwable
    //   5283	5296	5299	java/lang/Throwable
    //   5288	5311	5314	java/lang/Throwable
    //   5303	5329	5332	java/lang/Throwable
    //   5318	5359	5362	java/lang/Throwable
    //   5422	5449	5452	java/lang/Throwable
    //   5439	5470	5473	java/lang/Throwable
    //   5456	5500	5503	java/lang/Throwable
    //   5477	5511	5511	java/lang/Throwable
    //   5522	5538	5541	java/lang/Throwable
    //   5615	5629	5629	java/lang/Throwable
    //   5640	5653	5656	java/lang/Throwable
    //   5645	5668	5671	java/lang/Throwable
    //   5660	5686	5689	java/lang/Throwable
    //   5675	5716	5719	java/lang/Throwable
    //   5779	5806	5809	java/lang/Throwable
    //   5796	5827	5830	java/lang/Throwable
    //   5813	5857	5860	java/lang/Throwable
    //   5834	5868	5868	java/lang/Throwable
    //   5879	5895	5898	java/lang/Throwable
    //   5994	6008	6008	java/lang/Throwable
    //   6019	6032	6035	java/lang/Throwable
    //   6024	6047	6050	java/lang/Throwable
    //   6039	6065	6068	java/lang/Throwable
    //   6054	6095	6098	java/lang/Throwable
    //   6161	6188	6191	java/lang/Throwable
    //   6178	6206	6209	java/lang/Throwable
    //   6195	6236	6239	java/lang/Throwable
    //   6213	6247	6247	java/lang/Throwable
    //   6269	6280	6283	java/lang/Throwable
    //   6335	6349	6349	java/lang/Throwable
    //   6360	6373	6376	java/lang/Throwable
    //   6365	6388	6391	java/lang/Throwable
    //   6380	6406	6409	java/lang/Throwable
    //   6395	6436	6439	java/lang/Throwable
    //   6502	6529	6532	java/lang/Throwable
    //   6519	6547	6550	java/lang/Throwable
    //   6536	6577	6580	java/lang/Throwable
    //   6554	6588	6588	java/lang/Throwable
    //   6610	6621	6624	java/lang/Throwable
    //   6634	7364	8823	java/lang/Throwable
    //   6724	6738	6738	java/lang/Throwable
    //   6749	6762	6765	java/lang/Throwable
    //   6754	6777	6780	java/lang/Throwable
    //   6769	6795	6798	java/lang/Throwable
    //   6784	6825	6828	java/lang/Throwable
    //   6891	6918	6921	java/lang/Throwable
    //   6908	6936	6939	java/lang/Throwable
    //   6925	6966	6969	java/lang/Throwable
    //   6943	6977	6977	java/lang/Throwable
    //   6999	7010	7013	java/lang/Throwable
    //   7066	7080	7080	java/lang/Throwable
    //   7091	7104	7107	java/lang/Throwable
    //   7096	7119	7122	java/lang/Throwable
    //   7111	7137	7140	java/lang/Throwable
    //   7126	7167	7170	java/lang/Throwable
    //   7233	7260	7263	java/lang/Throwable
    //   7250	7278	7281	java/lang/Throwable
    //   7267	7308	7311	java/lang/Throwable
    //   7285	7319	7319	java/lang/Throwable
    //   7341	7352	7355	java/lang/Throwable
    //   7365	8095	8823	java/lang/Throwable
    //   7455	7469	7469	java/lang/Throwable
    //   7480	7493	7496	java/lang/Throwable
    //   7485	7508	7511	java/lang/Throwable
    //   7500	7526	7529	java/lang/Throwable
    //   7515	7556	7559	java/lang/Throwable
    //   7622	7649	7652	java/lang/Throwable
    //   7639	7667	7670	java/lang/Throwable
    //   7656	7697	7700	java/lang/Throwable
    //   7674	7708	7708	java/lang/Throwable
    //   7730	7741	7744	java/lang/Throwable
    //   7797	7811	7811	java/lang/Throwable
    //   7822	7835	7838	java/lang/Throwable
    //   7827	7850	7853	java/lang/Throwable
    //   7842	7868	7871	java/lang/Throwable
    //   7857	7898	7901	java/lang/Throwable
    //   7964	7991	7994	java/lang/Throwable
    //   7981	8009	8012	java/lang/Throwable
    //   7998	8039	8042	java/lang/Throwable
    //   8016	8050	8050	java/lang/Throwable
    //   8072	8083	8086	java/lang/Throwable
    //   8096	8822	8823	java/lang/Throwable
    //   8186	8200	8200	java/lang/Throwable
    //   8211	8224	8227	java/lang/Throwable
    //   8216	8239	8242	java/lang/Throwable
    //   8231	8257	8260	java/lang/Throwable
    //   8246	8287	8290	java/lang/Throwable
    //   8353	8380	8383	java/lang/Throwable
    //   8370	8398	8401	java/lang/Throwable
    //   8387	8428	8431	java/lang/Throwable
    //   8405	8439	8439	java/lang/Throwable
    //   8461	8472	8475	java/lang/Throwable
    //   8528	8542	8542	java/lang/Throwable
    //   8553	8566	8569	java/lang/Throwable
    //   8558	8581	8584	java/lang/Throwable
    //   8573	8599	8602	java/lang/Throwable
    //   8588	8629	8632	java/lang/Throwable
    //   8695	8722	8725	java/lang/Throwable
    //   8712	8740	8743	java/lang/Throwable
    //   8729	8770	8773	java/lang/Throwable
    //   8747	8781	8781	java/lang/Throwable
    //   8803	8814	8817	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #29
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ð÷ÊÕ=»\\t"«Rá¨C\\tå éÐZBö»\\tÔÞÏÒ¡ÑÙ¯\\té³h¢&U:y\\tw»g\¬~\\t sUº·Ô ÏË\\b5óëÖ /KÂQJxò¡Þ6×,FåRân\\toå¸h<MJ\\b\\t¢D\Ëæ\\r.ô\\t'Ó±®(UÁ\\tái_ þ\\t·¸£Ã_8lº\\t/w°:= K\\t¬?À33&ù8#\\t\\npÚ©«_\\tVÿ+Ø%TÝ\\tQ;Ä'Í\\t\\b=Ts¡.´|~\\t ÈAÍùëæ\\tLTÜ^°. RËè}9+Åqr?Fý\\fÕ1¿]s!ìCÊÃ¾R UT\\t2;I'¸ÝMÙ0øÒ¥åß.mNÛn~NJy¹&¸>Ù]/: AQc·SÅð½ë¥ìeÒp!eú`p\\r|{)Ê0\\täÉw®Âl°\\t aAø_àVï'
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
    //   68: ldc 'ÊÅ\\r\\t\\t~½ÒUÓâC'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_4
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #77
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
    //   128: putstatic burp/Zgs6.a : [Ljava/lang/String;
    //   131: bipush #29
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zgs6.b : [Ljava/lang/String;
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
    //   212: bipush #112
    //   214: goto -> 244
    //   217: bipush #73
    //   219: goto -> 244
    //   222: bipush #42
    //   224: goto -> 244
    //   227: bipush #123
    //   229: goto -> 244
    //   232: bipush #81
    //   234: goto -> 244
    //   237: bipush #38
    //   239: goto -> 244
    //   242: bipush #31
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
    //   300: sipush #-20280
    //   303: sipush #1584
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zgs6.ZD : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: bipush #32
    //   318: newarray byte
    //   320: dup
    //   321: iconst_0
    //   322: bipush #95
    //   324: bastore
    //   325: dup
    //   326: iconst_1
    //   327: bipush #-93
    //   329: bastore
    //   330: dup
    //   331: iconst_2
    //   332: bipush #20
    //   334: bastore
    //   335: dup
    //   336: iconst_3
    //   337: bipush #101
    //   339: bastore
    //   340: dup
    //   341: iconst_4
    //   342: bipush #-2
    //   344: bastore
    //   345: dup
    //   346: iconst_5
    //   347: bipush #-68
    //   349: bastore
    //   350: dup
    //   351: bipush #6
    //   353: bipush #40
    //   355: bastore
    //   356: dup
    //   357: bipush #7
    //   359: bipush #55
    //   361: bastore
    //   362: dup
    //   363: bipush #8
    //   365: bipush #-66
    //   367: bastore
    //   368: dup
    //   369: bipush #9
    //   371: bipush #-40
    //   373: bastore
    //   374: dup
    //   375: bipush #10
    //   377: bipush #-100
    //   379: bastore
    //   380: dup
    //   381: bipush #11
    //   383: iconst_m1
    //   384: bastore
    //   385: dup
    //   386: bipush #12
    //   388: bipush #-37
    //   390: bastore
    //   391: dup
    //   392: bipush #13
    //   394: bipush #64
    //   396: bastore
    //   397: dup
    //   398: bipush #14
    //   400: bipush #-108
    //   402: bastore
    //   403: dup
    //   404: bipush #15
    //   406: bipush #74
    //   408: bastore
    //   409: dup
    //   410: bipush #16
    //   412: bipush #-112
    //   414: bastore
    //   415: dup
    //   416: bipush #17
    //   418: bipush #-43
    //   420: bastore
    //   421: dup
    //   422: bipush #18
    //   424: bipush #-85
    //   426: bastore
    //   427: dup
    //   428: bipush #19
    //   430: bipush #88
    //   432: bastore
    //   433: dup
    //   434: bipush #20
    //   436: bipush #121
    //   438: bastore
    //   439: dup
    //   440: bipush #21
    //   442: bipush #121
    //   444: bastore
    //   445: dup
    //   446: bipush #22
    //   448: bipush #-27
    //   450: bastore
    //   451: dup
    //   452: bipush #23
    //   454: bipush #-78
    //   456: bastore
    //   457: dup
    //   458: bipush #24
    //   460: bipush #47
    //   462: bastore
    //   463: dup
    //   464: bipush #25
    //   466: bipush #-126
    //   468: bastore
    //   469: dup
    //   470: bipush #26
    //   472: bipush #9
    //   474: bastore
    //   475: dup
    //   476: bipush #27
    //   478: bipush #-39
    //   480: bastore
    //   481: dup
    //   482: bipush #28
    //   484: bipush #-110
    //   486: bastore
    //   487: dup
    //   488: bipush #29
    //   490: bipush #-110
    //   492: bastore
    //   493: dup
    //   494: bipush #30
    //   496: bipush #9
    //   498: bastore
    //   499: dup
    //   500: bipush #31
    //   502: bipush #-4
    //   504: bastore
    //   505: invokespecial <init> : ([B)V
    //   508: putstatic burp/Zgs6.Za : Ljava/lang/Object;
    //   511: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFB0CF) & 0xFFFF;
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
      byte b1 = 108;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgs6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */