package burp;

import java.math.BigInteger;

class Zt85 extends ClassLoader {
  static Object Zl;
  
  static String ZR;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZO(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void Zx(Object paramObject) {
    Zmpx.ZC = a(-31474, -10193);
    Zmpx.ZZ = new BigInteger(a(-31478, 2242));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zgsb.ZM.charAt(Math.abs(((BigInteger)Zedu.ZL).intValue() % 32)) > Ztq4.Zb.charAt(Math.abs(((BigInteger)Zrl5.ZI).intValue() % 32))) {
          try {
            Ztzj.Zy(Class.forName(a(-31475, -16276)));
            if (bool)
              Zle9.ZE(Class.forName(a(-31484, -17477))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zle9.ZE(Class.forName(a(-31484, -17477)));
    } catch (Throwable throwable) {}
  }
  
  static boolean ZN(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zrqe.ZX : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: invokevirtual toByteArray : ()[B
    //   13: astore_3
    //   14: new java/lang/StringBuilder
    //   17: dup
    //   18: invokespecial <init> : ()V
    //   21: astore #5
    //   23: aload #5
    //   25: sipush #-31476
    //   28: sipush #687
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
    //   81: sipush #-31473
    //   84: sipush #-29929
    //   87: invokestatic a : (II)Ljava/lang/String;
    //   90: ldc ''
    //   92: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   95: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   98: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: pop
    //   102: aload #5
    //   104: sipush #-31477
    //   107: sipush #11517
    //   110: invokestatic a : (II)Ljava/lang/String;
    //   113: ldc ''
    //   115: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   118: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   121: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   124: pop
    //   125: aload #5
    //   127: invokevirtual toString : ()Ljava/lang/String;
    //   130: invokevirtual getBytes : ()[B
    //   133: astore #4
    //   135: aload #4
    //   137: astore_3
    //   138: aload_3
    //   139: arraylength
    //   140: bipush #8
    //   142: iadd
    //   143: bipush #6
    //   145: ishr
    //   146: iconst_1
    //   147: iadd
    //   148: bipush #16
    //   150: imul
    //   151: newarray int
    //   153: astore #5
    //   155: iconst_0
    //   156: istore #6
    //   158: iload #6
    //   160: aload_3
    //   161: arraylength
    //   162: if_icmpge -> 205
    //   165: aload_3
    //   166: iload #6
    //   168: baload
    //   169: sipush #255
    //   172: iand
    //   173: istore #7
    //   175: aload #5
    //   177: iload #6
    //   179: iconst_2
    //   180: ishr
    //   181: dup2
    //   182: iaload
    //   183: iload #7
    //   185: bipush #24
    //   187: iload #6
    //   189: iconst_4
    //   190: irem
    //   191: bipush #8
    //   193: imul
    //   194: isub
    //   195: ishl
    //   196: ior
    //   197: iastore
    //   198: iinc #6, 1
    //   201: iload_2
    //   202: ifeq -> 158
    //   205: aload #5
    //   207: iload #6
    //   209: iconst_2
    //   210: ishr
    //   211: dup2
    //   212: iaload
    //   213: sipush #128
    //   216: bipush #24
    //   218: iload #6
    //   220: iconst_4
    //   221: irem
    //   222: bipush #8
    //   224: imul
    //   225: isub
    //   226: ishl
    //   227: ior
    //   228: iastore
    //   229: aload #5
    //   231: aload #5
    //   233: arraylength
    //   234: iconst_1
    //   235: isub
    //   236: aload_3
    //   237: arraylength
    //   238: bipush #8
    //   240: imul
    //   241: iastore
    //   242: bipush #80
    //   244: newarray int
    //   246: astore #7
    //   248: ldc 1732584193
    //   250: istore #8
    //   252: ldc -271733879
    //   254: istore #9
    //   256: ldc -1732584194
    //   258: istore #10
    //   260: ldc 271733878
    //   262: istore #11
    //   264: ldc -1009589776
    //   266: istore #12
    //   268: iconst_0
    //   269: istore #6
    //   271: iload #6
    //   273: aload #5
    //   275: arraylength
    //   276: if_icmpge -> 598
    //   279: iload #8
    //   281: istore #13
    //   283: iload #9
    //   285: istore #14
    //   287: iload #10
    //   289: istore #15
    //   291: iload #11
    //   293: istore #16
    //   295: iload #12
    //   297: istore #17
    //   299: iconst_0
    //   300: istore #18
    //   302: iload #18
    //   304: bipush #80
    //   306: if_icmpge -> 556
    //   309: iload #18
    //   311: bipush #16
    //   313: if_icmpge -> 340
    //   316: aload #7
    //   318: iload #18
    //   320: aload #5
    //   322: iload #6
    //   324: iload #18
    //   326: iadd
    //   327: iaload
    //   328: iastore
    //   329: iload_2
    //   330: ifeq -> 395
    //   333: goto -> 340
    //   336: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   339: athrow
    //   340: aload #7
    //   342: iload #18
    //   344: iconst_3
    //   345: isub
    //   346: iaload
    //   347: aload #7
    //   349: iload #18
    //   351: bipush #8
    //   353: isub
    //   354: iaload
    //   355: ixor
    //   356: aload #7
    //   358: iload #18
    //   360: bipush #14
    //   362: isub
    //   363: iaload
    //   364: ixor
    //   365: aload #7
    //   367: iload #18
    //   369: bipush #16
    //   371: isub
    //   372: iaload
    //   373: ixor
    //   374: istore #19
    //   376: iload #19
    //   378: iconst_1
    //   379: ishl
    //   380: iload #19
    //   382: bipush #31
    //   384: iushr
    //   385: ior
    //   386: istore #20
    //   388: aload #7
    //   390: iload #18
    //   392: iload #20
    //   394: iastore
    //   395: iload #8
    //   397: iconst_5
    //   398: ishl
    //   399: iload #8
    //   401: bipush #27
    //   403: iushr
    //   404: ior
    //   405: istore #19
    //   407: iload #19
    //   409: iload #12
    //   411: iadd
    //   412: aload #7
    //   414: iload #18
    //   416: iaload
    //   417: iadd
    //   418: iload #18
    //   420: bipush #20
    //   422: if_icmpge -> 448
    //   425: ldc 1518500249
    //   427: iload #9
    //   429: iload #10
    //   431: iand
    //   432: iload #9
    //   434: iconst_m1
    //   435: ixor
    //   436: iload #11
    //   438: iand
    //   439: ior
    //   440: iadd
    //   441: goto -> 518
    //   444: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   447: athrow
    //   448: iload #18
    //   450: bipush #40
    //   452: if_icmpge -> 473
    //   455: ldc 1859775393
    //   457: iload #9
    //   459: iload #10
    //   461: ixor
    //   462: iload #11
    //   464: ixor
    //   465: iadd
    //   466: goto -> 518
    //   469: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   472: athrow
    //   473: iload #18
    //   475: bipush #60
    //   477: if_icmpge -> 507
    //   480: ldc -1894007588
    //   482: iload #9
    //   484: iload #10
    //   486: iand
    //   487: iload #9
    //   489: iload #11
    //   491: iand
    //   492: ior
    //   493: iload #10
    //   495: iload #11
    //   497: iand
    //   498: ior
    //   499: iadd
    //   500: goto -> 518
    //   503: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   506: athrow
    //   507: ldc -899497514
    //   509: iload #9
    //   511: iload #10
    //   513: ixor
    //   514: iload #11
    //   516: ixor
    //   517: iadd
    //   518: iadd
    //   519: istore #20
    //   521: iload #11
    //   523: istore #12
    //   525: iload #10
    //   527: istore #11
    //   529: iload #9
    //   531: bipush #30
    //   533: ishl
    //   534: iload #9
    //   536: iconst_2
    //   537: iushr
    //   538: ior
    //   539: istore #10
    //   541: iload #8
    //   543: istore #9
    //   545: iload #20
    //   547: istore #8
    //   549: iinc #18, 1
    //   552: iload_2
    //   553: ifeq -> 302
    //   556: iload #8
    //   558: iload #13
    //   560: iadd
    //   561: istore #8
    //   563: iload #9
    //   565: iload #14
    //   567: iadd
    //   568: istore #9
    //   570: iload #10
    //   572: iload #15
    //   574: iadd
    //   575: istore #10
    //   577: iload #11
    //   579: iload #16
    //   581: iadd
    //   582: istore #11
    //   584: iload #12
    //   586: iload #17
    //   588: iadd
    //   589: istore #12
    //   591: iinc #6, 16
    //   594: iload_2
    //   595: ifeq -> 271
    //   598: iconst_5
    //   599: newarray int
    //   601: dup
    //   602: iconst_0
    //   603: iload #8
    //   605: iastore
    //   606: dup
    //   607: iconst_1
    //   608: iload #9
    //   610: iastore
    //   611: dup
    //   612: iconst_2
    //   613: iload #10
    //   615: iastore
    //   616: dup
    //   617: iconst_3
    //   618: iload #11
    //   620: iastore
    //   621: dup
    //   622: iconst_4
    //   623: iload #12
    //   625: iastore
    //   626: astore #13
    //   628: bipush #20
    //   630: newarray byte
    //   632: astore #14
    //   634: iconst_0
    //   635: istore #15
    //   637: iload #15
    //   639: bipush #20
    //   641: if_icmpge -> 682
    //   644: aload #13
    //   646: iload #15
    //   648: iconst_4
    //   649: idiv
    //   650: iaload
    //   651: istore #16
    //   653: iconst_3
    //   654: iload #15
    //   656: iconst_4
    //   657: irem
    //   658: isub
    //   659: bipush #8
    //   661: imul
    //   662: istore #17
    //   664: aload #14
    //   666: iload #15
    //   668: iload #16
    //   670: iload #17
    //   672: iushr
    //   673: i2b
    //   674: bastore
    //   675: iinc #15, 1
    //   678: iload_2
    //   679: ifeq -> 637
    //   682: aload #14
    //   684: astore #4
    //   686: getstatic burp/Ztgv.Zg : Ljava/lang/Object;
    //   689: checkcast java/math/BigInteger
    //   692: invokevirtual toByteArray : ()[B
    //   695: astore_3
    //   696: bipush #32
    //   698: newarray int
    //   700: dup
    //   701: iconst_0
    //   702: ldc 943331329
    //   704: iastore
    //   705: dup
    //   706: iconst_1
    //   707: ldc 170788368
    //   709: iastore
    //   710: dup
    //   711: iconst_2
    //   712: ldc 1008414755
    //   714: iastore
    //   715: dup
    //   716: iconst_3
    //   717: ldc 187049985
    //   719: iastore
    //   720: dup
    //   721: iconst_4
    //   722: ldc 1010368540
    //   724: iastore
    //   725: dup
    //   726: iconst_5
    //   727: ldc 220604441
    //   729: iastore
    //   730: dup
    //   731: bipush #6
    //   733: ldc 940377620
    //   735: iastore
    //   736: dup
    //   737: bipush #7
    //   739: ldc 255209728
    //   741: iastore
    //   742: dup
    //   743: bipush #8
    //   745: ldc 689771012
    //   747: iastore
    //   748: dup
    //   749: bipush #9
    //   751: ldc 221709344
    //   753: iastore
    //   754: dup
    //   755: bipush #10
    //   757: ldc 957157408
    //   759: iastore
    //   760: dup
    //   761: bipush #11
    //   763: ldc 892536332
    //   765: iastore
    //   766: dup
    //   767: bipush #12
    //   769: ldc 722417666
    //   771: iastore
    //   772: dup
    //   773: bipush #13
    //   775: ldc 1026621720
    //   777: iastore
    //   778: dup
    //   779: bipush #14
    //   781: ldc 655302664
    //   783: iastore
    //   784: dup
    //   785: bipush #15
    //   787: ldc 890966315
    //   789: iastore
    //   790: dup
    //   791: bipush #16
    //   793: ldc 187632156
    //   795: iastore
    //   796: dup
    //   797: bipush #17
    //   799: ldc 874189824
    //   801: iastore
    //   802: dup
    //   803: bipush #18
    //   805: ldc 254150144
    //   807: iastore
    //   808: dup
    //   809: bipush #19
    //   811: ldc 924386310
    //   813: iastore
    //   814: dup
    //   815: bipush #20
    //   817: ldc 121057538
    //   819: iastore
    //   820: dup
    //   821: bipush #21
    //   823: ldc 840500228
    //   825: iastore
    //   826: dup
    //   827: bipush #22
    //   829: ldc 389160971
    //   831: iastore
    //   832: dup
    //   833: bipush #23
    //   835: ldc 907870729
    //   837: iastore
    //   838: dup
    //   839: bipush #24
    //   841: ldc 389426184
    //   843: iastore
    //   844: dup
    //   845: bipush #25
    //   847: ldc 973875457
    //   849: iastore
    //   850: dup
    //   851: bipush #26
    //   853: ldc 372376604
    //   855: iastore
    //   856: dup
    //   857: bipush #27
    //   859: ldc 707731490
    //   861: iastore
    //   862: dup
    //   863: bipush #28
    //   865: ldc 1043334948
    //   867: iastore
    //   868: dup
    //   869: bipush #29
    //   871: ldc 439222784
    //   873: iastore
    //   874: dup
    //   875: bipush #30
    //   877: ldc 876216579
    //   879: iastore
    //   880: dup
    //   881: bipush #31
    //   883: ldc 455999525
    //   885: iastore
    //   886: astore #5
    //   888: bipush #8
    //   890: aload_3
    //   891: arraylength
    //   892: bipush #8
    //   894: irem
    //   895: isub
    //   896: istore #6
    //   898: aload_3
    //   899: arraylength
    //   900: iload #6
    //   902: iadd
    //   903: newarray byte
    //   905: astore #7
    //   907: iconst_0
    //   908: istore #8
    //   910: iload #8
    //   912: aload_3
    //   913: arraylength
    //   914: if_icmpge -> 933
    //   917: aload #7
    //   919: iload #8
    //   921: aload_3
    //   922: iload #8
    //   924: baload
    //   925: bastore
    //   926: iinc #8, 1
    //   929: iload_2
    //   930: ifeq -> 910
    //   933: aload_3
    //   934: arraylength
    //   935: istore #8
    //   937: iload #8
    //   939: aload #7
    //   941: arraylength
    //   942: if_icmpge -> 960
    //   945: aload #7
    //   947: iload #8
    //   949: iload #6
    //   951: i2b
    //   952: bastore
    //   953: iinc #8, 1
    //   956: iload_2
    //   957: ifeq -> 937
    //   960: aload #7
    //   962: astore_3
    //   963: bipush #64
    //   965: newarray int
    //   967: dup
    //   968: iconst_0
    //   969: ldc 16843776
    //   971: iastore
    //   972: dup
    //   973: iconst_1
    //   974: iconst_0
    //   975: iastore
    //   976: dup
    //   977: iconst_2
    //   978: ldc 65536
    //   980: iastore
    //   981: dup
    //   982: iconst_3
    //   983: ldc 16843780
    //   985: iastore
    //   986: dup
    //   987: iconst_4
    //   988: ldc 16842756
    //   990: iastore
    //   991: dup
    //   992: iconst_5
    //   993: ldc 66564
    //   995: iastore
    //   996: dup
    //   997: bipush #6
    //   999: iconst_4
    //   1000: iastore
    //   1001: dup
    //   1002: bipush #7
    //   1004: ldc 65536
    //   1006: iastore
    //   1007: dup
    //   1008: bipush #8
    //   1010: sipush #1024
    //   1013: iastore
    //   1014: dup
    //   1015: bipush #9
    //   1017: ldc 16843776
    //   1019: iastore
    //   1020: dup
    //   1021: bipush #10
    //   1023: ldc 16843780
    //   1025: iastore
    //   1026: dup
    //   1027: bipush #11
    //   1029: sipush #1024
    //   1032: iastore
    //   1033: dup
    //   1034: bipush #12
    //   1036: ldc 16778244
    //   1038: iastore
    //   1039: dup
    //   1040: bipush #13
    //   1042: ldc 16842756
    //   1044: iastore
    //   1045: dup
    //   1046: bipush #14
    //   1048: ldc 16777216
    //   1050: iastore
    //   1051: dup
    //   1052: bipush #15
    //   1054: iconst_4
    //   1055: iastore
    //   1056: dup
    //   1057: bipush #16
    //   1059: sipush #1028
    //   1062: iastore
    //   1063: dup
    //   1064: bipush #17
    //   1066: ldc 16778240
    //   1068: iastore
    //   1069: dup
    //   1070: bipush #18
    //   1072: ldc 16778240
    //   1074: iastore
    //   1075: dup
    //   1076: bipush #19
    //   1078: ldc 66560
    //   1080: iastore
    //   1081: dup
    //   1082: bipush #20
    //   1084: ldc 66560
    //   1086: iastore
    //   1087: dup
    //   1088: bipush #21
    //   1090: ldc 16842752
    //   1092: iastore
    //   1093: dup
    //   1094: bipush #22
    //   1096: ldc 16842752
    //   1098: iastore
    //   1099: dup
    //   1100: bipush #23
    //   1102: ldc 16778244
    //   1104: iastore
    //   1105: dup
    //   1106: bipush #24
    //   1108: ldc 65540
    //   1110: iastore
    //   1111: dup
    //   1112: bipush #25
    //   1114: ldc 16777220
    //   1116: iastore
    //   1117: dup
    //   1118: bipush #26
    //   1120: ldc 16777220
    //   1122: iastore
    //   1123: dup
    //   1124: bipush #27
    //   1126: ldc 65540
    //   1128: iastore
    //   1129: dup
    //   1130: bipush #28
    //   1132: iconst_0
    //   1133: iastore
    //   1134: dup
    //   1135: bipush #29
    //   1137: sipush #1028
    //   1140: iastore
    //   1141: dup
    //   1142: bipush #30
    //   1144: ldc 66564
    //   1146: iastore
    //   1147: dup
    //   1148: bipush #31
    //   1150: ldc 16777216
    //   1152: iastore
    //   1153: dup
    //   1154: bipush #32
    //   1156: ldc 65536
    //   1158: iastore
    //   1159: dup
    //   1160: bipush #33
    //   1162: ldc 16843780
    //   1164: iastore
    //   1165: dup
    //   1166: bipush #34
    //   1168: iconst_4
    //   1169: iastore
    //   1170: dup
    //   1171: bipush #35
    //   1173: ldc 16842752
    //   1175: iastore
    //   1176: dup
    //   1177: bipush #36
    //   1179: ldc 16843776
    //   1181: iastore
    //   1182: dup
    //   1183: bipush #37
    //   1185: ldc 16777216
    //   1187: iastore
    //   1188: dup
    //   1189: bipush #38
    //   1191: ldc 16777216
    //   1193: iastore
    //   1194: dup
    //   1195: bipush #39
    //   1197: sipush #1024
    //   1200: iastore
    //   1201: dup
    //   1202: bipush #40
    //   1204: ldc 16842756
    //   1206: iastore
    //   1207: dup
    //   1208: bipush #41
    //   1210: ldc 65536
    //   1212: iastore
    //   1213: dup
    //   1214: bipush #42
    //   1216: ldc 66560
    //   1218: iastore
    //   1219: dup
    //   1220: bipush #43
    //   1222: ldc 16777220
    //   1224: iastore
    //   1225: dup
    //   1226: bipush #44
    //   1228: sipush #1024
    //   1231: iastore
    //   1232: dup
    //   1233: bipush #45
    //   1235: iconst_4
    //   1236: iastore
    //   1237: dup
    //   1238: bipush #46
    //   1240: ldc 16778244
    //   1242: iastore
    //   1243: dup
    //   1244: bipush #47
    //   1246: ldc 66564
    //   1248: iastore
    //   1249: dup
    //   1250: bipush #48
    //   1252: ldc 16843780
    //   1254: iastore
    //   1255: dup
    //   1256: bipush #49
    //   1258: ldc 65540
    //   1260: iastore
    //   1261: dup
    //   1262: bipush #50
    //   1264: ldc 16842752
    //   1266: iastore
    //   1267: dup
    //   1268: bipush #51
    //   1270: ldc 16778244
    //   1272: iastore
    //   1273: dup
    //   1274: bipush #52
    //   1276: ldc 16777220
    //   1278: iastore
    //   1279: dup
    //   1280: bipush #53
    //   1282: sipush #1028
    //   1285: iastore
    //   1286: dup
    //   1287: bipush #54
    //   1289: ldc 66564
    //   1291: iastore
    //   1292: dup
    //   1293: bipush #55
    //   1295: ldc 16843776
    //   1297: iastore
    //   1298: dup
    //   1299: bipush #56
    //   1301: sipush #1028
    //   1304: iastore
    //   1305: dup
    //   1306: bipush #57
    //   1308: ldc 16778240
    //   1310: iastore
    //   1311: dup
    //   1312: bipush #58
    //   1314: ldc 16778240
    //   1316: iastore
    //   1317: dup
    //   1318: bipush #59
    //   1320: iconst_0
    //   1321: iastore
    //   1322: dup
    //   1323: bipush #60
    //   1325: ldc 65540
    //   1327: iastore
    //   1328: dup
    //   1329: bipush #61
    //   1331: ldc 66560
    //   1333: iastore
    //   1334: dup
    //   1335: bipush #62
    //   1337: iconst_0
    //   1338: iastore
    //   1339: dup
    //   1340: bipush #63
    //   1342: ldc 16842756
    //   1344: iastore
    //   1345: astore #8
    //   1347: bipush #64
    //   1349: newarray int
    //   1351: dup
    //   1352: iconst_0
    //   1353: ldc -2146402272
    //   1355: iastore
    //   1356: dup
    //   1357: iconst_1
    //   1358: ldc -2147450880
    //   1360: iastore
    //   1361: dup
    //   1362: iconst_2
    //   1363: ldc 32768
    //   1365: iastore
    //   1366: dup
    //   1367: iconst_3
    //   1368: ldc 1081376
    //   1370: iastore
    //   1371: dup
    //   1372: iconst_4
    //   1373: ldc 1048576
    //   1375: iastore
    //   1376: dup
    //   1377: iconst_5
    //   1378: bipush #32
    //   1380: iastore
    //   1381: dup
    //   1382: bipush #6
    //   1384: ldc -2146435040
    //   1386: iastore
    //   1387: dup
    //   1388: bipush #7
    //   1390: ldc -2147450848
    //   1392: iastore
    //   1393: dup
    //   1394: bipush #8
    //   1396: ldc -2147483616
    //   1398: iastore
    //   1399: dup
    //   1400: bipush #9
    //   1402: ldc -2146402272
    //   1404: iastore
    //   1405: dup
    //   1406: bipush #10
    //   1408: ldc -2146402304
    //   1410: iastore
    //   1411: dup
    //   1412: bipush #11
    //   1414: ldc -2147483648
    //   1416: iastore
    //   1417: dup
    //   1418: bipush #12
    //   1420: ldc -2147450880
    //   1422: iastore
    //   1423: dup
    //   1424: bipush #13
    //   1426: ldc 1048576
    //   1428: iastore
    //   1429: dup
    //   1430: bipush #14
    //   1432: bipush #32
    //   1434: iastore
    //   1435: dup
    //   1436: bipush #15
    //   1438: ldc -2146435040
    //   1440: iastore
    //   1441: dup
    //   1442: bipush #16
    //   1444: ldc 1081344
    //   1446: iastore
    //   1447: dup
    //   1448: bipush #17
    //   1450: ldc 1048608
    //   1452: iastore
    //   1453: dup
    //   1454: bipush #18
    //   1456: ldc -2147450848
    //   1458: iastore
    //   1459: dup
    //   1460: bipush #19
    //   1462: iconst_0
    //   1463: iastore
    //   1464: dup
    //   1465: bipush #20
    //   1467: ldc -2147483648
    //   1469: iastore
    //   1470: dup
    //   1471: bipush #21
    //   1473: ldc 32768
    //   1475: iastore
    //   1476: dup
    //   1477: bipush #22
    //   1479: ldc 1081376
    //   1481: iastore
    //   1482: dup
    //   1483: bipush #23
    //   1485: ldc -2146435072
    //   1487: iastore
    //   1488: dup
    //   1489: bipush #24
    //   1491: ldc 1048608
    //   1493: iastore
    //   1494: dup
    //   1495: bipush #25
    //   1497: ldc -2147483616
    //   1499: iastore
    //   1500: dup
    //   1501: bipush #26
    //   1503: iconst_0
    //   1504: iastore
    //   1505: dup
    //   1506: bipush #27
    //   1508: ldc 1081344
    //   1510: iastore
    //   1511: dup
    //   1512: bipush #28
    //   1514: ldc 32800
    //   1516: iastore
    //   1517: dup
    //   1518: bipush #29
    //   1520: ldc -2146402304
    //   1522: iastore
    //   1523: dup
    //   1524: bipush #30
    //   1526: ldc -2146435072
    //   1528: iastore
    //   1529: dup
    //   1530: bipush #31
    //   1532: ldc 32800
    //   1534: iastore
    //   1535: dup
    //   1536: bipush #32
    //   1538: iconst_0
    //   1539: iastore
    //   1540: dup
    //   1541: bipush #33
    //   1543: ldc 1081376
    //   1545: iastore
    //   1546: dup
    //   1547: bipush #34
    //   1549: ldc -2146435040
    //   1551: iastore
    //   1552: dup
    //   1553: bipush #35
    //   1555: ldc 1048576
    //   1557: iastore
    //   1558: dup
    //   1559: bipush #36
    //   1561: ldc -2147450848
    //   1563: iastore
    //   1564: dup
    //   1565: bipush #37
    //   1567: ldc -2146435072
    //   1569: iastore
    //   1570: dup
    //   1571: bipush #38
    //   1573: ldc -2146402304
    //   1575: iastore
    //   1576: dup
    //   1577: bipush #39
    //   1579: ldc 32768
    //   1581: iastore
    //   1582: dup
    //   1583: bipush #40
    //   1585: ldc -2146435072
    //   1587: iastore
    //   1588: dup
    //   1589: bipush #41
    //   1591: ldc -2147450880
    //   1593: iastore
    //   1594: dup
    //   1595: bipush #42
    //   1597: bipush #32
    //   1599: iastore
    //   1600: dup
    //   1601: bipush #43
    //   1603: ldc -2146402272
    //   1605: iastore
    //   1606: dup
    //   1607: bipush #44
    //   1609: ldc 1081376
    //   1611: iastore
    //   1612: dup
    //   1613: bipush #45
    //   1615: bipush #32
    //   1617: iastore
    //   1618: dup
    //   1619: bipush #46
    //   1621: ldc 32768
    //   1623: iastore
    //   1624: dup
    //   1625: bipush #47
    //   1627: ldc -2147483648
    //   1629: iastore
    //   1630: dup
    //   1631: bipush #48
    //   1633: ldc 32800
    //   1635: iastore
    //   1636: dup
    //   1637: bipush #49
    //   1639: ldc -2146402304
    //   1641: iastore
    //   1642: dup
    //   1643: bipush #50
    //   1645: ldc 1048576
    //   1647: iastore
    //   1648: dup
    //   1649: bipush #51
    //   1651: ldc -2147483616
    //   1653: iastore
    //   1654: dup
    //   1655: bipush #52
    //   1657: ldc 1048608
    //   1659: iastore
    //   1660: dup
    //   1661: bipush #53
    //   1663: ldc -2147450848
    //   1665: iastore
    //   1666: dup
    //   1667: bipush #54
    //   1669: ldc -2147483616
    //   1671: iastore
    //   1672: dup
    //   1673: bipush #55
    //   1675: ldc 1048608
    //   1677: iastore
    //   1678: dup
    //   1679: bipush #56
    //   1681: ldc 1081344
    //   1683: iastore
    //   1684: dup
    //   1685: bipush #57
    //   1687: iconst_0
    //   1688: iastore
    //   1689: dup
    //   1690: bipush #58
    //   1692: ldc -2147450880
    //   1694: iastore
    //   1695: dup
    //   1696: bipush #59
    //   1698: ldc 32800
    //   1700: iastore
    //   1701: dup
    //   1702: bipush #60
    //   1704: ldc -2147483648
    //   1706: iastore
    //   1707: dup
    //   1708: bipush #61
    //   1710: ldc -2146435040
    //   1712: iastore
    //   1713: dup
    //   1714: bipush #62
    //   1716: ldc -2146402272
    //   1718: iastore
    //   1719: dup
    //   1720: bipush #63
    //   1722: ldc 1081344
    //   1724: iastore
    //   1725: astore #9
    //   1727: bipush #64
    //   1729: newarray int
    //   1731: dup
    //   1732: iconst_0
    //   1733: sipush #520
    //   1736: iastore
    //   1737: dup
    //   1738: iconst_1
    //   1739: ldc 134349312
    //   1741: iastore
    //   1742: dup
    //   1743: iconst_2
    //   1744: iconst_0
    //   1745: iastore
    //   1746: dup
    //   1747: iconst_3
    //   1748: ldc 134348808
    //   1750: iastore
    //   1751: dup
    //   1752: iconst_4
    //   1753: ldc 134218240
    //   1755: iastore
    //   1756: dup
    //   1757: iconst_5
    //   1758: iconst_0
    //   1759: iastore
    //   1760: dup
    //   1761: bipush #6
    //   1763: ldc 131592
    //   1765: iastore
    //   1766: dup
    //   1767: bipush #7
    //   1769: ldc 134218240
    //   1771: iastore
    //   1772: dup
    //   1773: bipush #8
    //   1775: ldc 131080
    //   1777: iastore
    //   1778: dup
    //   1779: bipush #9
    //   1781: ldc 134217736
    //   1783: iastore
    //   1784: dup
    //   1785: bipush #10
    //   1787: ldc 134217736
    //   1789: iastore
    //   1790: dup
    //   1791: bipush #11
    //   1793: ldc 131072
    //   1795: iastore
    //   1796: dup
    //   1797: bipush #12
    //   1799: ldc 134349320
    //   1801: iastore
    //   1802: dup
    //   1803: bipush #13
    //   1805: ldc 131080
    //   1807: iastore
    //   1808: dup
    //   1809: bipush #14
    //   1811: ldc 134348800
    //   1813: iastore
    //   1814: dup
    //   1815: bipush #15
    //   1817: sipush #520
    //   1820: iastore
    //   1821: dup
    //   1822: bipush #16
    //   1824: ldc 134217728
    //   1826: iastore
    //   1827: dup
    //   1828: bipush #17
    //   1830: bipush #8
    //   1832: iastore
    //   1833: dup
    //   1834: bipush #18
    //   1836: ldc 134349312
    //   1838: iastore
    //   1839: dup
    //   1840: bipush #19
    //   1842: sipush #512
    //   1845: iastore
    //   1846: dup
    //   1847: bipush #20
    //   1849: ldc 131584
    //   1851: iastore
    //   1852: dup
    //   1853: bipush #21
    //   1855: ldc 134348800
    //   1857: iastore
    //   1858: dup
    //   1859: bipush #22
    //   1861: ldc 134348808
    //   1863: iastore
    //   1864: dup
    //   1865: bipush #23
    //   1867: ldc 131592
    //   1869: iastore
    //   1870: dup
    //   1871: bipush #24
    //   1873: ldc 134218248
    //   1875: iastore
    //   1876: dup
    //   1877: bipush #25
    //   1879: ldc 131584
    //   1881: iastore
    //   1882: dup
    //   1883: bipush #26
    //   1885: ldc 131072
    //   1887: iastore
    //   1888: dup
    //   1889: bipush #27
    //   1891: ldc 134218248
    //   1893: iastore
    //   1894: dup
    //   1895: bipush #28
    //   1897: bipush #8
    //   1899: iastore
    //   1900: dup
    //   1901: bipush #29
    //   1903: ldc 134349320
    //   1905: iastore
    //   1906: dup
    //   1907: bipush #30
    //   1909: sipush #512
    //   1912: iastore
    //   1913: dup
    //   1914: bipush #31
    //   1916: ldc 134217728
    //   1918: iastore
    //   1919: dup
    //   1920: bipush #32
    //   1922: ldc 134349312
    //   1924: iastore
    //   1925: dup
    //   1926: bipush #33
    //   1928: ldc 134217728
    //   1930: iastore
    //   1931: dup
    //   1932: bipush #34
    //   1934: ldc 131080
    //   1936: iastore
    //   1937: dup
    //   1938: bipush #35
    //   1940: sipush #520
    //   1943: iastore
    //   1944: dup
    //   1945: bipush #36
    //   1947: ldc 131072
    //   1949: iastore
    //   1950: dup
    //   1951: bipush #37
    //   1953: ldc 134349312
    //   1955: iastore
    //   1956: dup
    //   1957: bipush #38
    //   1959: ldc 134218240
    //   1961: iastore
    //   1962: dup
    //   1963: bipush #39
    //   1965: iconst_0
    //   1966: iastore
    //   1967: dup
    //   1968: bipush #40
    //   1970: sipush #512
    //   1973: iastore
    //   1974: dup
    //   1975: bipush #41
    //   1977: ldc 131080
    //   1979: iastore
    //   1980: dup
    //   1981: bipush #42
    //   1983: ldc 134349320
    //   1985: iastore
    //   1986: dup
    //   1987: bipush #43
    //   1989: ldc 134218240
    //   1991: iastore
    //   1992: dup
    //   1993: bipush #44
    //   1995: ldc 134217736
    //   1997: iastore
    //   1998: dup
    //   1999: bipush #45
    //   2001: sipush #512
    //   2004: iastore
    //   2005: dup
    //   2006: bipush #46
    //   2008: iconst_0
    //   2009: iastore
    //   2010: dup
    //   2011: bipush #47
    //   2013: ldc 134348808
    //   2015: iastore
    //   2016: dup
    //   2017: bipush #48
    //   2019: ldc 134218248
    //   2021: iastore
    //   2022: dup
    //   2023: bipush #49
    //   2025: ldc 131072
    //   2027: iastore
    //   2028: dup
    //   2029: bipush #50
    //   2031: ldc 134217728
    //   2033: iastore
    //   2034: dup
    //   2035: bipush #51
    //   2037: ldc 134349320
    //   2039: iastore
    //   2040: dup
    //   2041: bipush #52
    //   2043: bipush #8
    //   2045: iastore
    //   2046: dup
    //   2047: bipush #53
    //   2049: ldc 131592
    //   2051: iastore
    //   2052: dup
    //   2053: bipush #54
    //   2055: ldc 131584
    //   2057: iastore
    //   2058: dup
    //   2059: bipush #55
    //   2061: ldc 134217736
    //   2063: iastore
    //   2064: dup
    //   2065: bipush #56
    //   2067: ldc 134348800
    //   2069: iastore
    //   2070: dup
    //   2071: bipush #57
    //   2073: ldc 134218248
    //   2075: iastore
    //   2076: dup
    //   2077: bipush #58
    //   2079: sipush #520
    //   2082: iastore
    //   2083: dup
    //   2084: bipush #59
    //   2086: ldc 134348800
    //   2088: iastore
    //   2089: dup
    //   2090: bipush #60
    //   2092: ldc 131592
    //   2094: iastore
    //   2095: dup
    //   2096: bipush #61
    //   2098: bipush #8
    //   2100: iastore
    //   2101: dup
    //   2102: bipush #62
    //   2104: ldc 134348808
    //   2106: iastore
    //   2107: dup
    //   2108: bipush #63
    //   2110: ldc 131584
    //   2112: iastore
    //   2113: astore #10
    //   2115: bipush #64
    //   2117: newarray int
    //   2119: dup
    //   2120: iconst_0
    //   2121: ldc 8396801
    //   2123: iastore
    //   2124: dup
    //   2125: iconst_1
    //   2126: sipush #8321
    //   2129: iastore
    //   2130: dup
    //   2131: iconst_2
    //   2132: sipush #8321
    //   2135: iastore
    //   2136: dup
    //   2137: iconst_3
    //   2138: sipush #128
    //   2141: iastore
    //   2142: dup
    //   2143: iconst_4
    //   2144: ldc 8396928
    //   2146: iastore
    //   2147: dup
    //   2148: iconst_5
    //   2149: ldc 8388737
    //   2151: iastore
    //   2152: dup
    //   2153: bipush #6
    //   2155: ldc 8388609
    //   2157: iastore
    //   2158: dup
    //   2159: bipush #7
    //   2161: sipush #8193
    //   2164: iastore
    //   2165: dup
    //   2166: bipush #8
    //   2168: iconst_0
    //   2169: iastore
    //   2170: dup
    //   2171: bipush #9
    //   2173: ldc 8396800
    //   2175: iastore
    //   2176: dup
    //   2177: bipush #10
    //   2179: ldc 8396800
    //   2181: iastore
    //   2182: dup
    //   2183: bipush #11
    //   2185: ldc 8396929
    //   2187: iastore
    //   2188: dup
    //   2189: bipush #12
    //   2191: sipush #129
    //   2194: iastore
    //   2195: dup
    //   2196: bipush #13
    //   2198: iconst_0
    //   2199: iastore
    //   2200: dup
    //   2201: bipush #14
    //   2203: ldc 8388736
    //   2205: iastore
    //   2206: dup
    //   2207: bipush #15
    //   2209: ldc 8388609
    //   2211: iastore
    //   2212: dup
    //   2213: bipush #16
    //   2215: iconst_1
    //   2216: iastore
    //   2217: dup
    //   2218: bipush #17
    //   2220: sipush #8192
    //   2223: iastore
    //   2224: dup
    //   2225: bipush #18
    //   2227: ldc 8388608
    //   2229: iastore
    //   2230: dup
    //   2231: bipush #19
    //   2233: ldc 8396801
    //   2235: iastore
    //   2236: dup
    //   2237: bipush #20
    //   2239: sipush #128
    //   2242: iastore
    //   2243: dup
    //   2244: bipush #21
    //   2246: ldc 8388608
    //   2248: iastore
    //   2249: dup
    //   2250: bipush #22
    //   2252: sipush #8193
    //   2255: iastore
    //   2256: dup
    //   2257: bipush #23
    //   2259: sipush #8320
    //   2262: iastore
    //   2263: dup
    //   2264: bipush #24
    //   2266: ldc 8388737
    //   2268: iastore
    //   2269: dup
    //   2270: bipush #25
    //   2272: iconst_1
    //   2273: iastore
    //   2274: dup
    //   2275: bipush #26
    //   2277: sipush #8320
    //   2280: iastore
    //   2281: dup
    //   2282: bipush #27
    //   2284: ldc 8388736
    //   2286: iastore
    //   2287: dup
    //   2288: bipush #28
    //   2290: sipush #8192
    //   2293: iastore
    //   2294: dup
    //   2295: bipush #29
    //   2297: ldc 8396928
    //   2299: iastore
    //   2300: dup
    //   2301: bipush #30
    //   2303: ldc 8396929
    //   2305: iastore
    //   2306: dup
    //   2307: bipush #31
    //   2309: sipush #129
    //   2312: iastore
    //   2313: dup
    //   2314: bipush #32
    //   2316: ldc 8388736
    //   2318: iastore
    //   2319: dup
    //   2320: bipush #33
    //   2322: ldc 8388609
    //   2324: iastore
    //   2325: dup
    //   2326: bipush #34
    //   2328: ldc 8396800
    //   2330: iastore
    //   2331: dup
    //   2332: bipush #35
    //   2334: ldc 8396929
    //   2336: iastore
    //   2337: dup
    //   2338: bipush #36
    //   2340: sipush #129
    //   2343: iastore
    //   2344: dup
    //   2345: bipush #37
    //   2347: iconst_0
    //   2348: iastore
    //   2349: dup
    //   2350: bipush #38
    //   2352: iconst_0
    //   2353: iastore
    //   2354: dup
    //   2355: bipush #39
    //   2357: ldc 8396800
    //   2359: iastore
    //   2360: dup
    //   2361: bipush #40
    //   2363: sipush #8320
    //   2366: iastore
    //   2367: dup
    //   2368: bipush #41
    //   2370: ldc 8388736
    //   2372: iastore
    //   2373: dup
    //   2374: bipush #42
    //   2376: ldc 8388737
    //   2378: iastore
    //   2379: dup
    //   2380: bipush #43
    //   2382: iconst_1
    //   2383: iastore
    //   2384: dup
    //   2385: bipush #44
    //   2387: ldc 8396801
    //   2389: iastore
    //   2390: dup
    //   2391: bipush #45
    //   2393: sipush #8321
    //   2396: iastore
    //   2397: dup
    //   2398: bipush #46
    //   2400: sipush #8321
    //   2403: iastore
    //   2404: dup
    //   2405: bipush #47
    //   2407: sipush #128
    //   2410: iastore
    //   2411: dup
    //   2412: bipush #48
    //   2414: ldc 8396929
    //   2416: iastore
    //   2417: dup
    //   2418: bipush #49
    //   2420: sipush #129
    //   2423: iastore
    //   2424: dup
    //   2425: bipush #50
    //   2427: iconst_1
    //   2428: iastore
    //   2429: dup
    //   2430: bipush #51
    //   2432: sipush #8192
    //   2435: iastore
    //   2436: dup
    //   2437: bipush #52
    //   2439: ldc 8388609
    //   2441: iastore
    //   2442: dup
    //   2443: bipush #53
    //   2445: sipush #8193
    //   2448: iastore
    //   2449: dup
    //   2450: bipush #54
    //   2452: ldc 8396928
    //   2454: iastore
    //   2455: dup
    //   2456: bipush #55
    //   2458: ldc 8388737
    //   2460: iastore
    //   2461: dup
    //   2462: bipush #56
    //   2464: sipush #8193
    //   2467: iastore
    //   2468: dup
    //   2469: bipush #57
    //   2471: sipush #8320
    //   2474: iastore
    //   2475: dup
    //   2476: bipush #58
    //   2478: ldc 8388608
    //   2480: iastore
    //   2481: dup
    //   2482: bipush #59
    //   2484: ldc 8396801
    //   2486: iastore
    //   2487: dup
    //   2488: bipush #60
    //   2490: sipush #128
    //   2493: iastore
    //   2494: dup
    //   2495: bipush #61
    //   2497: ldc 8388608
    //   2499: iastore
    //   2500: dup
    //   2501: bipush #62
    //   2503: sipush #8192
    //   2506: iastore
    //   2507: dup
    //   2508: bipush #63
    //   2510: ldc 8396928
    //   2512: iastore
    //   2513: astore #11
    //   2515: bipush #64
    //   2517: newarray int
    //   2519: dup
    //   2520: iconst_0
    //   2521: sipush #256
    //   2524: iastore
    //   2525: dup
    //   2526: iconst_1
    //   2527: ldc 34078976
    //   2529: iastore
    //   2530: dup
    //   2531: iconst_2
    //   2532: ldc 34078720
    //   2534: iastore
    //   2535: dup
    //   2536: iconst_3
    //   2537: ldc 1107296512
    //   2539: iastore
    //   2540: dup
    //   2541: iconst_4
    //   2542: ldc 524288
    //   2544: iastore
    //   2545: dup
    //   2546: iconst_5
    //   2547: sipush #256
    //   2550: iastore
    //   2551: dup
    //   2552: bipush #6
    //   2554: ldc 1073741824
    //   2556: iastore
    //   2557: dup
    //   2558: bipush #7
    //   2560: ldc 34078720
    //   2562: iastore
    //   2563: dup
    //   2564: bipush #8
    //   2566: ldc 1074266368
    //   2568: iastore
    //   2569: dup
    //   2570: bipush #9
    //   2572: ldc 524288
    //   2574: iastore
    //   2575: dup
    //   2576: bipush #10
    //   2578: ldc 33554688
    //   2580: iastore
    //   2581: dup
    //   2582: bipush #11
    //   2584: ldc 1074266368
    //   2586: iastore
    //   2587: dup
    //   2588: bipush #12
    //   2590: ldc 1107296512
    //   2592: iastore
    //   2593: dup
    //   2594: bipush #13
    //   2596: ldc 1107820544
    //   2598: iastore
    //   2599: dup
    //   2600: bipush #14
    //   2602: ldc 524544
    //   2604: iastore
    //   2605: dup
    //   2606: bipush #15
    //   2608: ldc 1073741824
    //   2610: iastore
    //   2611: dup
    //   2612: bipush #16
    //   2614: ldc 33554432
    //   2616: iastore
    //   2617: dup
    //   2618: bipush #17
    //   2620: ldc 1074266112
    //   2622: iastore
    //   2623: dup
    //   2624: bipush #18
    //   2626: ldc 1074266112
    //   2628: iastore
    //   2629: dup
    //   2630: bipush #19
    //   2632: iconst_0
    //   2633: iastore
    //   2634: dup
    //   2635: bipush #20
    //   2637: ldc 1073742080
    //   2639: iastore
    //   2640: dup
    //   2641: bipush #21
    //   2643: ldc 1107820800
    //   2645: iastore
    //   2646: dup
    //   2647: bipush #22
    //   2649: ldc 1107820800
    //   2651: iastore
    //   2652: dup
    //   2653: bipush #23
    //   2655: ldc 33554688
    //   2657: iastore
    //   2658: dup
    //   2659: bipush #24
    //   2661: ldc 1107820544
    //   2663: iastore
    //   2664: dup
    //   2665: bipush #25
    //   2667: ldc 1073742080
    //   2669: iastore
    //   2670: dup
    //   2671: bipush #26
    //   2673: iconst_0
    //   2674: iastore
    //   2675: dup
    //   2676: bipush #27
    //   2678: ldc 1107296256
    //   2680: iastore
    //   2681: dup
    //   2682: bipush #28
    //   2684: ldc 34078976
    //   2686: iastore
    //   2687: dup
    //   2688: bipush #29
    //   2690: ldc 33554432
    //   2692: iastore
    //   2693: dup
    //   2694: bipush #30
    //   2696: ldc 1107296256
    //   2698: iastore
    //   2699: dup
    //   2700: bipush #31
    //   2702: ldc 524544
    //   2704: iastore
    //   2705: dup
    //   2706: bipush #32
    //   2708: ldc 524288
    //   2710: iastore
    //   2711: dup
    //   2712: bipush #33
    //   2714: ldc 1107296512
    //   2716: iastore
    //   2717: dup
    //   2718: bipush #34
    //   2720: sipush #256
    //   2723: iastore
    //   2724: dup
    //   2725: bipush #35
    //   2727: ldc 33554432
    //   2729: iastore
    //   2730: dup
    //   2731: bipush #36
    //   2733: ldc 1073741824
    //   2735: iastore
    //   2736: dup
    //   2737: bipush #37
    //   2739: ldc 34078720
    //   2741: iastore
    //   2742: dup
    //   2743: bipush #38
    //   2745: ldc 1107296512
    //   2747: iastore
    //   2748: dup
    //   2749: bipush #39
    //   2751: ldc 1074266368
    //   2753: iastore
    //   2754: dup
    //   2755: bipush #40
    //   2757: ldc 33554688
    //   2759: iastore
    //   2760: dup
    //   2761: bipush #41
    //   2763: ldc 1073741824
    //   2765: iastore
    //   2766: dup
    //   2767: bipush #42
    //   2769: ldc 1107820544
    //   2771: iastore
    //   2772: dup
    //   2773: bipush #43
    //   2775: ldc 34078976
    //   2777: iastore
    //   2778: dup
    //   2779: bipush #44
    //   2781: ldc 1074266368
    //   2783: iastore
    //   2784: dup
    //   2785: bipush #45
    //   2787: sipush #256
    //   2790: iastore
    //   2791: dup
    //   2792: bipush #46
    //   2794: ldc 33554432
    //   2796: iastore
    //   2797: dup
    //   2798: bipush #47
    //   2800: ldc 1107820544
    //   2802: iastore
    //   2803: dup
    //   2804: bipush #48
    //   2806: ldc 1107820800
    //   2808: iastore
    //   2809: dup
    //   2810: bipush #49
    //   2812: ldc 524544
    //   2814: iastore
    //   2815: dup
    //   2816: bipush #50
    //   2818: ldc 1107296256
    //   2820: iastore
    //   2821: dup
    //   2822: bipush #51
    //   2824: ldc 1107820800
    //   2826: iastore
    //   2827: dup
    //   2828: bipush #52
    //   2830: ldc 34078720
    //   2832: iastore
    //   2833: dup
    //   2834: bipush #53
    //   2836: iconst_0
    //   2837: iastore
    //   2838: dup
    //   2839: bipush #54
    //   2841: ldc 1074266112
    //   2843: iastore
    //   2844: dup
    //   2845: bipush #55
    //   2847: ldc 1107296256
    //   2849: iastore
    //   2850: dup
    //   2851: bipush #56
    //   2853: ldc 524544
    //   2855: iastore
    //   2856: dup
    //   2857: bipush #57
    //   2859: ldc 33554688
    //   2861: iastore
    //   2862: dup
    //   2863: bipush #58
    //   2865: ldc 1073742080
    //   2867: iastore
    //   2868: dup
    //   2869: bipush #59
    //   2871: ldc 524288
    //   2873: iastore
    //   2874: dup
    //   2875: bipush #60
    //   2877: iconst_0
    //   2878: iastore
    //   2879: dup
    //   2880: bipush #61
    //   2882: ldc 1074266112
    //   2884: iastore
    //   2885: dup
    //   2886: bipush #62
    //   2888: ldc 34078976
    //   2890: iastore
    //   2891: dup
    //   2892: bipush #63
    //   2894: ldc 1073742080
    //   2896: iastore
    //   2897: astore #12
    //   2899: bipush #64
    //   2901: newarray int
    //   2903: dup
    //   2904: iconst_0
    //   2905: ldc 536870928
    //   2907: iastore
    //   2908: dup
    //   2909: iconst_1
    //   2910: ldc 541065216
    //   2912: iastore
    //   2913: dup
    //   2914: iconst_2
    //   2915: sipush #16384
    //   2918: iastore
    //   2919: dup
    //   2920: iconst_3
    //   2921: ldc 541081616
    //   2923: iastore
    //   2924: dup
    //   2925: iconst_4
    //   2926: ldc 541065216
    //   2928: iastore
    //   2929: dup
    //   2930: iconst_5
    //   2931: bipush #16
    //   2933: iastore
    //   2934: dup
    //   2935: bipush #6
    //   2937: ldc 541081616
    //   2939: iastore
    //   2940: dup
    //   2941: bipush #7
    //   2943: ldc 4194304
    //   2945: iastore
    //   2946: dup
    //   2947: bipush #8
    //   2949: ldc 536887296
    //   2951: iastore
    //   2952: dup
    //   2953: bipush #9
    //   2955: ldc 4210704
    //   2957: iastore
    //   2958: dup
    //   2959: bipush #10
    //   2961: ldc 4194304
    //   2963: iastore
    //   2964: dup
    //   2965: bipush #11
    //   2967: ldc 536870928
    //   2969: iastore
    //   2970: dup
    //   2971: bipush #12
    //   2973: ldc 4194320
    //   2975: iastore
    //   2976: dup
    //   2977: bipush #13
    //   2979: ldc 536887296
    //   2981: iastore
    //   2982: dup
    //   2983: bipush #14
    //   2985: ldc 536870912
    //   2987: iastore
    //   2988: dup
    //   2989: bipush #15
    //   2991: sipush #16400
    //   2994: iastore
    //   2995: dup
    //   2996: bipush #16
    //   2998: iconst_0
    //   2999: iastore
    //   3000: dup
    //   3001: bipush #17
    //   3003: ldc 4194320
    //   3005: iastore
    //   3006: dup
    //   3007: bipush #18
    //   3009: ldc 536887312
    //   3011: iastore
    //   3012: dup
    //   3013: bipush #19
    //   3015: sipush #16384
    //   3018: iastore
    //   3019: dup
    //   3020: bipush #20
    //   3022: ldc 4210688
    //   3024: iastore
    //   3025: dup
    //   3026: bipush #21
    //   3028: ldc 536887312
    //   3030: iastore
    //   3031: dup
    //   3032: bipush #22
    //   3034: bipush #16
    //   3036: iastore
    //   3037: dup
    //   3038: bipush #23
    //   3040: ldc 541065232
    //   3042: iastore
    //   3043: dup
    //   3044: bipush #24
    //   3046: ldc 541065232
    //   3048: iastore
    //   3049: dup
    //   3050: bipush #25
    //   3052: iconst_0
    //   3053: iastore
    //   3054: dup
    //   3055: bipush #26
    //   3057: ldc 4210704
    //   3059: iastore
    //   3060: dup
    //   3061: bipush #27
    //   3063: ldc 541081600
    //   3065: iastore
    //   3066: dup
    //   3067: bipush #28
    //   3069: sipush #16400
    //   3072: iastore
    //   3073: dup
    //   3074: bipush #29
    //   3076: ldc 4210688
    //   3078: iastore
    //   3079: dup
    //   3080: bipush #30
    //   3082: ldc 541081600
    //   3084: iastore
    //   3085: dup
    //   3086: bipush #31
    //   3088: ldc 536870912
    //   3090: iastore
    //   3091: dup
    //   3092: bipush #32
    //   3094: ldc 536887296
    //   3096: iastore
    //   3097: dup
    //   3098: bipush #33
    //   3100: bipush #16
    //   3102: iastore
    //   3103: dup
    //   3104: bipush #34
    //   3106: ldc 541065232
    //   3108: iastore
    //   3109: dup
    //   3110: bipush #35
    //   3112: ldc 4210688
    //   3114: iastore
    //   3115: dup
    //   3116: bipush #36
    //   3118: ldc 541081616
    //   3120: iastore
    //   3121: dup
    //   3122: bipush #37
    //   3124: ldc 4194304
    //   3126: iastore
    //   3127: dup
    //   3128: bipush #38
    //   3130: sipush #16400
    //   3133: iastore
    //   3134: dup
    //   3135: bipush #39
    //   3137: ldc 536870928
    //   3139: iastore
    //   3140: dup
    //   3141: bipush #40
    //   3143: ldc 4194304
    //   3145: iastore
    //   3146: dup
    //   3147: bipush #41
    //   3149: ldc 536887296
    //   3151: iastore
    //   3152: dup
    //   3153: bipush #42
    //   3155: ldc 536870912
    //   3157: iastore
    //   3158: dup
    //   3159: bipush #43
    //   3161: sipush #16400
    //   3164: iastore
    //   3165: dup
    //   3166: bipush #44
    //   3168: ldc 536870928
    //   3170: iastore
    //   3171: dup
    //   3172: bipush #45
    //   3174: ldc 541081616
    //   3176: iastore
    //   3177: dup
    //   3178: bipush #46
    //   3180: ldc 4210688
    //   3182: iastore
    //   3183: dup
    //   3184: bipush #47
    //   3186: ldc 541065216
    //   3188: iastore
    //   3189: dup
    //   3190: bipush #48
    //   3192: ldc 4210704
    //   3194: iastore
    //   3195: dup
    //   3196: bipush #49
    //   3198: ldc 541081600
    //   3200: iastore
    //   3201: dup
    //   3202: bipush #50
    //   3204: iconst_0
    //   3205: iastore
    //   3206: dup
    //   3207: bipush #51
    //   3209: ldc 541065232
    //   3211: iastore
    //   3212: dup
    //   3213: bipush #52
    //   3215: bipush #16
    //   3217: iastore
    //   3218: dup
    //   3219: bipush #53
    //   3221: sipush #16384
    //   3224: iastore
    //   3225: dup
    //   3226: bipush #54
    //   3228: ldc 541065216
    //   3230: iastore
    //   3231: dup
    //   3232: bipush #55
    //   3234: ldc 4210704
    //   3236: iastore
    //   3237: dup
    //   3238: bipush #56
    //   3240: sipush #16384
    //   3243: iastore
    //   3244: dup
    //   3245: bipush #57
    //   3247: ldc 4194320
    //   3249: iastore
    //   3250: dup
    //   3251: bipush #58
    //   3253: ldc 536887312
    //   3255: iastore
    //   3256: dup
    //   3257: bipush #59
    //   3259: iconst_0
    //   3260: iastore
    //   3261: dup
    //   3262: bipush #60
    //   3264: ldc 541081600
    //   3266: iastore
    //   3267: dup
    //   3268: bipush #61
    //   3270: ldc 536870912
    //   3272: iastore
    //   3273: dup
    //   3274: bipush #62
    //   3276: ldc 4194320
    //   3278: iastore
    //   3279: dup
    //   3280: bipush #63
    //   3282: ldc 536887312
    //   3284: iastore
    //   3285: astore #13
    //   3287: bipush #64
    //   3289: newarray int
    //   3291: dup
    //   3292: iconst_0
    //   3293: ldc 2097152
    //   3295: iastore
    //   3296: dup
    //   3297: iconst_1
    //   3298: ldc 69206018
    //   3300: iastore
    //   3301: dup
    //   3302: iconst_2
    //   3303: ldc 67110914
    //   3305: iastore
    //   3306: dup
    //   3307: iconst_3
    //   3308: iconst_0
    //   3309: iastore
    //   3310: dup
    //   3311: iconst_4
    //   3312: sipush #2048
    //   3315: iastore
    //   3316: dup
    //   3317: iconst_5
    //   3318: ldc 67110914
    //   3320: iastore
    //   3321: dup
    //   3322: bipush #6
    //   3324: ldc 2099202
    //   3326: iastore
    //   3327: dup
    //   3328: bipush #7
    //   3330: ldc 69208064
    //   3332: iastore
    //   3333: dup
    //   3334: bipush #8
    //   3336: ldc 69208066
    //   3338: iastore
    //   3339: dup
    //   3340: bipush #9
    //   3342: ldc 2097152
    //   3344: iastore
    //   3345: dup
    //   3346: bipush #10
    //   3348: iconst_0
    //   3349: iastore
    //   3350: dup
    //   3351: bipush #11
    //   3353: ldc 67108866
    //   3355: iastore
    //   3356: dup
    //   3357: bipush #12
    //   3359: iconst_2
    //   3360: iastore
    //   3361: dup
    //   3362: bipush #13
    //   3364: ldc 67108864
    //   3366: iastore
    //   3367: dup
    //   3368: bipush #14
    //   3370: ldc 69206018
    //   3372: iastore
    //   3373: dup
    //   3374: bipush #15
    //   3376: sipush #2050
    //   3379: iastore
    //   3380: dup
    //   3381: bipush #16
    //   3383: ldc 67110912
    //   3385: iastore
    //   3386: dup
    //   3387: bipush #17
    //   3389: ldc 2099202
    //   3391: iastore
    //   3392: dup
    //   3393: bipush #18
    //   3395: ldc 2097154
    //   3397: iastore
    //   3398: dup
    //   3399: bipush #19
    //   3401: ldc 67110912
    //   3403: iastore
    //   3404: dup
    //   3405: bipush #20
    //   3407: ldc 67108866
    //   3409: iastore
    //   3410: dup
    //   3411: bipush #21
    //   3413: ldc 69206016
    //   3415: iastore
    //   3416: dup
    //   3417: bipush #22
    //   3419: ldc 69208064
    //   3421: iastore
    //   3422: dup
    //   3423: bipush #23
    //   3425: ldc 2097154
    //   3427: iastore
    //   3428: dup
    //   3429: bipush #24
    //   3431: ldc 69206016
    //   3433: iastore
    //   3434: dup
    //   3435: bipush #25
    //   3437: sipush #2048
    //   3440: iastore
    //   3441: dup
    //   3442: bipush #26
    //   3444: sipush #2050
    //   3447: iastore
    //   3448: dup
    //   3449: bipush #27
    //   3451: ldc 69208066
    //   3453: iastore
    //   3454: dup
    //   3455: bipush #28
    //   3457: ldc 2099200
    //   3459: iastore
    //   3460: dup
    //   3461: bipush #29
    //   3463: iconst_2
    //   3464: iastore
    //   3465: dup
    //   3466: bipush #30
    //   3468: ldc 67108864
    //   3470: iastore
    //   3471: dup
    //   3472: bipush #31
    //   3474: ldc 2099200
    //   3476: iastore
    //   3477: dup
    //   3478: bipush #32
    //   3480: ldc 67108864
    //   3482: iastore
    //   3483: dup
    //   3484: bipush #33
    //   3486: ldc 2099200
    //   3488: iastore
    //   3489: dup
    //   3490: bipush #34
    //   3492: ldc 2097152
    //   3494: iastore
    //   3495: dup
    //   3496: bipush #35
    //   3498: ldc 67110914
    //   3500: iastore
    //   3501: dup
    //   3502: bipush #36
    //   3504: ldc 67110914
    //   3506: iastore
    //   3507: dup
    //   3508: bipush #37
    //   3510: ldc 69206018
    //   3512: iastore
    //   3513: dup
    //   3514: bipush #38
    //   3516: ldc 69206018
    //   3518: iastore
    //   3519: dup
    //   3520: bipush #39
    //   3522: iconst_2
    //   3523: iastore
    //   3524: dup
    //   3525: bipush #40
    //   3527: ldc 2097154
    //   3529: iastore
    //   3530: dup
    //   3531: bipush #41
    //   3533: ldc 67108864
    //   3535: iastore
    //   3536: dup
    //   3537: bipush #42
    //   3539: ldc 67110912
    //   3541: iastore
    //   3542: dup
    //   3543: bipush #43
    //   3545: ldc 2097152
    //   3547: iastore
    //   3548: dup
    //   3549: bipush #44
    //   3551: ldc 69208064
    //   3553: iastore
    //   3554: dup
    //   3555: bipush #45
    //   3557: sipush #2050
    //   3560: iastore
    //   3561: dup
    //   3562: bipush #46
    //   3564: ldc 2099202
    //   3566: iastore
    //   3567: dup
    //   3568: bipush #47
    //   3570: ldc 69208064
    //   3572: iastore
    //   3573: dup
    //   3574: bipush #48
    //   3576: sipush #2050
    //   3579: iastore
    //   3580: dup
    //   3581: bipush #49
    //   3583: ldc 67108866
    //   3585: iastore
    //   3586: dup
    //   3587: bipush #50
    //   3589: ldc 69208066
    //   3591: iastore
    //   3592: dup
    //   3593: bipush #51
    //   3595: ldc 69206016
    //   3597: iastore
    //   3598: dup
    //   3599: bipush #52
    //   3601: ldc 2099200
    //   3603: iastore
    //   3604: dup
    //   3605: bipush #53
    //   3607: iconst_0
    //   3608: iastore
    //   3609: dup
    //   3610: bipush #54
    //   3612: iconst_2
    //   3613: iastore
    //   3614: dup
    //   3615: bipush #55
    //   3617: ldc 69208066
    //   3619: iastore
    //   3620: dup
    //   3621: bipush #56
    //   3623: iconst_0
    //   3624: iastore
    //   3625: dup
    //   3626: bipush #57
    //   3628: ldc 2099202
    //   3630: iastore
    //   3631: dup
    //   3632: bipush #58
    //   3634: ldc 69206016
    //   3636: iastore
    //   3637: dup
    //   3638: bipush #59
    //   3640: sipush #2048
    //   3643: iastore
    //   3644: dup
    //   3645: bipush #60
    //   3647: ldc 67108866
    //   3649: iastore
    //   3650: dup
    //   3651: bipush #61
    //   3653: ldc 67110912
    //   3655: iastore
    //   3656: dup
    //   3657: bipush #62
    //   3659: sipush #2048
    //   3662: iastore
    //   3663: dup
    //   3664: bipush #63
    //   3666: ldc 2097154
    //   3668: iastore
    //   3669: astore #14
    //   3671: bipush #64
    //   3673: newarray int
    //   3675: dup
    //   3676: iconst_0
    //   3677: ldc 268439616
    //   3679: iastore
    //   3680: dup
    //   3681: iconst_1
    //   3682: sipush #4096
    //   3685: iastore
    //   3686: dup
    //   3687: iconst_2
    //   3688: ldc 262144
    //   3690: iastore
    //   3691: dup
    //   3692: iconst_3
    //   3693: ldc 268701760
    //   3695: iastore
    //   3696: dup
    //   3697: iconst_4
    //   3698: ldc 268435456
    //   3700: iastore
    //   3701: dup
    //   3702: iconst_5
    //   3703: ldc 268439616
    //   3705: iastore
    //   3706: dup
    //   3707: bipush #6
    //   3709: bipush #64
    //   3711: iastore
    //   3712: dup
    //   3713: bipush #7
    //   3715: ldc 268435456
    //   3717: iastore
    //   3718: dup
    //   3719: bipush #8
    //   3721: ldc 262208
    //   3723: iastore
    //   3724: dup
    //   3725: bipush #9
    //   3727: ldc 268697600
    //   3729: iastore
    //   3730: dup
    //   3731: bipush #10
    //   3733: ldc 268701760
    //   3735: iastore
    //   3736: dup
    //   3737: bipush #11
    //   3739: ldc 266240
    //   3741: iastore
    //   3742: dup
    //   3743: bipush #12
    //   3745: ldc 268701696
    //   3747: iastore
    //   3748: dup
    //   3749: bipush #13
    //   3751: ldc 266304
    //   3753: iastore
    //   3754: dup
    //   3755: bipush #14
    //   3757: sipush #4096
    //   3760: iastore
    //   3761: dup
    //   3762: bipush #15
    //   3764: bipush #64
    //   3766: iastore
    //   3767: dup
    //   3768: bipush #16
    //   3770: ldc 268697600
    //   3772: iastore
    //   3773: dup
    //   3774: bipush #17
    //   3776: ldc 268435520
    //   3778: iastore
    //   3779: dup
    //   3780: bipush #18
    //   3782: ldc 268439552
    //   3784: iastore
    //   3785: dup
    //   3786: bipush #19
    //   3788: sipush #4160
    //   3791: iastore
    //   3792: dup
    //   3793: bipush #20
    //   3795: ldc 266240
    //   3797: iastore
    //   3798: dup
    //   3799: bipush #21
    //   3801: ldc 262208
    //   3803: iastore
    //   3804: dup
    //   3805: bipush #22
    //   3807: ldc 268697664
    //   3809: iastore
    //   3810: dup
    //   3811: bipush #23
    //   3813: ldc 268701696
    //   3815: iastore
    //   3816: dup
    //   3817: bipush #24
    //   3819: sipush #4160
    //   3822: iastore
    //   3823: dup
    //   3824: bipush #25
    //   3826: iconst_0
    //   3827: iastore
    //   3828: dup
    //   3829: bipush #26
    //   3831: iconst_0
    //   3832: iastore
    //   3833: dup
    //   3834: bipush #27
    //   3836: ldc 268697664
    //   3838: iastore
    //   3839: dup
    //   3840: bipush #28
    //   3842: ldc 268435520
    //   3844: iastore
    //   3845: dup
    //   3846: bipush #29
    //   3848: ldc 268439552
    //   3850: iastore
    //   3851: dup
    //   3852: bipush #30
    //   3854: ldc 266304
    //   3856: iastore
    //   3857: dup
    //   3858: bipush #31
    //   3860: ldc 262144
    //   3862: iastore
    //   3863: dup
    //   3864: bipush #32
    //   3866: ldc 266304
    //   3868: iastore
    //   3869: dup
    //   3870: bipush #33
    //   3872: ldc 262144
    //   3874: iastore
    //   3875: dup
    //   3876: bipush #34
    //   3878: ldc 268701696
    //   3880: iastore
    //   3881: dup
    //   3882: bipush #35
    //   3884: sipush #4096
    //   3887: iastore
    //   3888: dup
    //   3889: bipush #36
    //   3891: bipush #64
    //   3893: iastore
    //   3894: dup
    //   3895: bipush #37
    //   3897: ldc 268697664
    //   3899: iastore
    //   3900: dup
    //   3901: bipush #38
    //   3903: sipush #4096
    //   3906: iastore
    //   3907: dup
    //   3908: bipush #39
    //   3910: ldc 266304
    //   3912: iastore
    //   3913: dup
    //   3914: bipush #40
    //   3916: ldc 268439552
    //   3918: iastore
    //   3919: dup
    //   3920: bipush #41
    //   3922: bipush #64
    //   3924: iastore
    //   3925: dup
    //   3926: bipush #42
    //   3928: ldc 268435520
    //   3930: iastore
    //   3931: dup
    //   3932: bipush #43
    //   3934: ldc 268697600
    //   3936: iastore
    //   3937: dup
    //   3938: bipush #44
    //   3940: ldc 268697664
    //   3942: iastore
    //   3943: dup
    //   3944: bipush #45
    //   3946: ldc 268435456
    //   3948: iastore
    //   3949: dup
    //   3950: bipush #46
    //   3952: ldc 262144
    //   3954: iastore
    //   3955: dup
    //   3956: bipush #47
    //   3958: ldc 268439616
    //   3960: iastore
    //   3961: dup
    //   3962: bipush #48
    //   3964: iconst_0
    //   3965: iastore
    //   3966: dup
    //   3967: bipush #49
    //   3969: ldc 268701760
    //   3971: iastore
    //   3972: dup
    //   3973: bipush #50
    //   3975: ldc 262208
    //   3977: iastore
    //   3978: dup
    //   3979: bipush #51
    //   3981: ldc 268435520
    //   3983: iastore
    //   3984: dup
    //   3985: bipush #52
    //   3987: ldc 268697600
    //   3989: iastore
    //   3990: dup
    //   3991: bipush #53
    //   3993: ldc 268439552
    //   3995: iastore
    //   3996: dup
    //   3997: bipush #54
    //   3999: ldc 268439616
    //   4001: iastore
    //   4002: dup
    //   4003: bipush #55
    //   4005: iconst_0
    //   4006: iastore
    //   4007: dup
    //   4008: bipush #56
    //   4010: ldc 268701760
    //   4012: iastore
    //   4013: dup
    //   4014: bipush #57
    //   4016: ldc 266240
    //   4018: iastore
    //   4019: dup
    //   4020: bipush #58
    //   4022: ldc 266240
    //   4024: iastore
    //   4025: dup
    //   4026: bipush #59
    //   4028: sipush #4160
    //   4031: iastore
    //   4032: dup
    //   4033: bipush #60
    //   4035: sipush #4160
    //   4038: iastore
    //   4039: dup
    //   4040: bipush #61
    //   4042: ldc 262208
    //   4044: iastore
    //   4045: dup
    //   4046: bipush #62
    //   4048: ldc 268435456
    //   4050: iastore
    //   4051: dup
    //   4052: bipush #63
    //   4054: ldc 268701696
    //   4056: iastore
    //   4057: astore #15
    //   4059: aload_3
    //   4060: arraylength
    //   4061: istore #16
    //   4063: iconst_2
    //   4064: newarray int
    //   4066: astore #17
    //   4068: iload #16
    //   4070: newarray byte
    //   4072: astore #4
    //   4074: iload #16
    //   4076: bipush #8
    //   4078: idiv
    //   4079: istore #18
    //   4081: iconst_0
    //   4082: istore #19
    //   4084: iload #19
    //   4086: iload #18
    //   4088: if_icmpge -> 5002
    //   4091: iload #19
    //   4093: bipush #8
    //   4095: imul
    //   4096: istore #20
    //   4098: iconst_0
    //   4099: istore #21
    //   4101: iload #21
    //   4103: iconst_2
    //   4104: if_icmpge -> 4189
    //   4107: aload #17
    //   4109: iload #21
    //   4111: aload_3
    //   4112: iload #20
    //   4114: iload #21
    //   4116: iconst_4
    //   4117: imul
    //   4118: iadd
    //   4119: baload
    //   4120: sipush #255
    //   4123: iand
    //   4124: bipush #24
    //   4126: ishl
    //   4127: aload_3
    //   4128: iload #20
    //   4130: iload #21
    //   4132: iconst_4
    //   4133: imul
    //   4134: iadd
    //   4135: iconst_1
    //   4136: iadd
    //   4137: baload
    //   4138: sipush #255
    //   4141: iand
    //   4142: bipush #16
    //   4144: ishl
    //   4145: ior
    //   4146: aload_3
    //   4147: iload #20
    //   4149: iload #21
    //   4151: iconst_4
    //   4152: imul
    //   4153: iadd
    //   4154: iconst_2
    //   4155: iadd
    //   4156: baload
    //   4157: sipush #255
    //   4160: iand
    //   4161: bipush #8
    //   4163: ishl
    //   4164: ior
    //   4165: aload_3
    //   4166: iload #20
    //   4168: iload #21
    //   4170: iconst_4
    //   4171: imul
    //   4172: iadd
    //   4173: iconst_3
    //   4174: iadd
    //   4175: baload
    //   4176: sipush #255
    //   4179: iand
    //   4180: ior
    //   4181: iastore
    //   4182: iinc #21, 1
    //   4185: iload_2
    //   4186: ifeq -> 4101
    //   4189: iconst_0
    //   4190: istore #26
    //   4192: aload #17
    //   4194: iconst_0
    //   4195: iaload
    //   4196: istore #24
    //   4198: aload #17
    //   4200: iconst_1
    //   4201: iaload
    //   4202: istore #23
    //   4204: iload #24
    //   4206: iconst_4
    //   4207: iushr
    //   4208: iload #23
    //   4210: ixor
    //   4211: ldc 252645135
    //   4213: iand
    //   4214: istore #22
    //   4216: iload #23
    //   4218: iload #22
    //   4220: ixor
    //   4221: istore #23
    //   4223: iload #24
    //   4225: iload #22
    //   4227: iconst_4
    //   4228: ishl
    //   4229: ixor
    //   4230: istore #24
    //   4232: iload #24
    //   4234: bipush #16
    //   4236: iushr
    //   4237: iload #23
    //   4239: ixor
    //   4240: ldc 65535
    //   4242: iand
    //   4243: istore #22
    //   4245: iload #23
    //   4247: iload #22
    //   4249: ixor
    //   4250: istore #23
    //   4252: iload #24
    //   4254: iload #22
    //   4256: bipush #16
    //   4258: ishl
    //   4259: ixor
    //   4260: istore #24
    //   4262: iload #23
    //   4264: iconst_2
    //   4265: iushr
    //   4266: iload #24
    //   4268: ixor
    //   4269: ldc 858993459
    //   4271: iand
    //   4272: istore #22
    //   4274: iload #24
    //   4276: iload #22
    //   4278: ixor
    //   4279: istore #24
    //   4281: iload #23
    //   4283: iload #22
    //   4285: iconst_2
    //   4286: ishl
    //   4287: ixor
    //   4288: istore #23
    //   4290: iload #23
    //   4292: bipush #8
    //   4294: iushr
    //   4295: iload #24
    //   4297: ixor
    //   4298: ldc 16711935
    //   4300: iand
    //   4301: istore #22
    //   4303: iload #24
    //   4305: iload #22
    //   4307: ixor
    //   4308: istore #24
    //   4310: iload #23
    //   4312: iload #22
    //   4314: bipush #8
    //   4316: ishl
    //   4317: ixor
    //   4318: istore #23
    //   4320: iload #23
    //   4322: iconst_1
    //   4323: ishl
    //   4324: iload #23
    //   4326: bipush #31
    //   4328: iushr
    //   4329: iconst_1
    //   4330: iand
    //   4331: ior
    //   4332: istore #23
    //   4334: iload #24
    //   4336: iload #23
    //   4338: ixor
    //   4339: ldc -1431655766
    //   4341: iand
    //   4342: istore #22
    //   4344: iload #24
    //   4346: iload #22
    //   4348: ixor
    //   4349: istore #24
    //   4351: iload #23
    //   4353: iload #22
    //   4355: ixor
    //   4356: istore #23
    //   4358: iload #24
    //   4360: iconst_1
    //   4361: ishl
    //   4362: iload #24
    //   4364: bipush #31
    //   4366: iushr
    //   4367: iconst_1
    //   4368: iand
    //   4369: ior
    //   4370: istore #24
    //   4372: iconst_0
    //   4373: istore #25
    //   4375: iload #25
    //   4377: bipush #8
    //   4379: if_icmpge -> 4717
    //   4382: iload #23
    //   4384: bipush #28
    //   4386: ishl
    //   4387: iload #23
    //   4389: iconst_4
    //   4390: iushr
    //   4391: ior
    //   4392: istore #22
    //   4394: iload #22
    //   4396: aload #5
    //   4398: iload #26
    //   4400: iinc #26, 1
    //   4403: iaload
    //   4404: ixor
    //   4405: istore #22
    //   4407: aload #14
    //   4409: iload #22
    //   4411: bipush #63
    //   4413: iand
    //   4414: iaload
    //   4415: istore #21
    //   4417: iload #21
    //   4419: aload #12
    //   4421: iload #22
    //   4423: bipush #8
    //   4425: iushr
    //   4426: bipush #63
    //   4428: iand
    //   4429: iaload
    //   4430: ior
    //   4431: istore #21
    //   4433: iload #21
    //   4435: aload #10
    //   4437: iload #22
    //   4439: bipush #16
    //   4441: iushr
    //   4442: bipush #63
    //   4444: iand
    //   4445: iaload
    //   4446: ior
    //   4447: istore #21
    //   4449: iload #21
    //   4451: aload #8
    //   4453: iload #22
    //   4455: bipush #24
    //   4457: iushr
    //   4458: bipush #63
    //   4460: iand
    //   4461: iaload
    //   4462: ior
    //   4463: istore #21
    //   4465: iload #23
    //   4467: aload #5
    //   4469: iload #26
    //   4471: iinc #26, 1
    //   4474: iaload
    //   4475: ixor
    //   4476: istore #22
    //   4478: iload #21
    //   4480: aload #15
    //   4482: iload #22
    //   4484: bipush #63
    //   4486: iand
    //   4487: iaload
    //   4488: ior
    //   4489: istore #21
    //   4491: iload #21
    //   4493: aload #13
    //   4495: iload #22
    //   4497: bipush #8
    //   4499: iushr
    //   4500: bipush #63
    //   4502: iand
    //   4503: iaload
    //   4504: ior
    //   4505: istore #21
    //   4507: iload #21
    //   4509: aload #11
    //   4511: iload #22
    //   4513: bipush #16
    //   4515: iushr
    //   4516: bipush #63
    //   4518: iand
    //   4519: iaload
    //   4520: ior
    //   4521: istore #21
    //   4523: iload #21
    //   4525: aload #9
    //   4527: iload #22
    //   4529: bipush #24
    //   4531: iushr
    //   4532: bipush #63
    //   4534: iand
    //   4535: iaload
    //   4536: ior
    //   4537: istore #21
    //   4539: iload #24
    //   4541: iload #21
    //   4543: ixor
    //   4544: istore #24
    //   4546: iload #24
    //   4548: bipush #28
    //   4550: ishl
    //   4551: iload #24
    //   4553: iconst_4
    //   4554: iushr
    //   4555: ior
    //   4556: istore #22
    //   4558: iload #22
    //   4560: aload #5
    //   4562: iload #26
    //   4564: iinc #26, 1
    //   4567: iaload
    //   4568: ixor
    //   4569: istore #22
    //   4571: aload #14
    //   4573: iload #22
    //   4575: bipush #63
    //   4577: iand
    //   4578: iaload
    //   4579: istore #21
    //   4581: iload #21
    //   4583: aload #12
    //   4585: iload #22
    //   4587: bipush #8
    //   4589: iushr
    //   4590: bipush #63
    //   4592: iand
    //   4593: iaload
    //   4594: ior
    //   4595: istore #21
    //   4597: iload #21
    //   4599: aload #10
    //   4601: iload #22
    //   4603: bipush #16
    //   4605: iushr
    //   4606: bipush #63
    //   4608: iand
    //   4609: iaload
    //   4610: ior
    //   4611: istore #21
    //   4613: iload #21
    //   4615: aload #8
    //   4617: iload #22
    //   4619: bipush #24
    //   4621: iushr
    //   4622: bipush #63
    //   4624: iand
    //   4625: iaload
    //   4626: ior
    //   4627: istore #21
    //   4629: iload #24
    //   4631: aload #5
    //   4633: iload #26
    //   4635: iinc #26, 1
    //   4638: iaload
    //   4639: ixor
    //   4640: istore #22
    //   4642: iload #21
    //   4644: aload #15
    //   4646: iload #22
    //   4648: bipush #63
    //   4650: iand
    //   4651: iaload
    //   4652: ior
    //   4653: istore #21
    //   4655: iload #21
    //   4657: aload #13
    //   4659: iload #22
    //   4661: bipush #8
    //   4663: iushr
    //   4664: bipush #63
    //   4666: iand
    //   4667: iaload
    //   4668: ior
    //   4669: istore #21
    //   4671: iload #21
    //   4673: aload #11
    //   4675: iload #22
    //   4677: bipush #16
    //   4679: iushr
    //   4680: bipush #63
    //   4682: iand
    //   4683: iaload
    //   4684: ior
    //   4685: istore #21
    //   4687: iload #21
    //   4689: aload #9
    //   4691: iload #22
    //   4693: bipush #24
    //   4695: iushr
    //   4696: bipush #63
    //   4698: iand
    //   4699: iaload
    //   4700: ior
    //   4701: istore #21
    //   4703: iload #23
    //   4705: iload #21
    //   4707: ixor
    //   4708: istore #23
    //   4710: iinc #25, 1
    //   4713: iload_2
    //   4714: ifeq -> 4375
    //   4717: iload #23
    //   4719: bipush #31
    //   4721: ishl
    //   4722: iload #23
    //   4724: iconst_1
    //   4725: iushr
    //   4726: ior
    //   4727: istore #23
    //   4729: iload #24
    //   4731: iload #23
    //   4733: ixor
    //   4734: ldc -1431655766
    //   4736: iand
    //   4737: istore #22
    //   4739: iload #24
    //   4741: iload #22
    //   4743: ixor
    //   4744: istore #24
    //   4746: iload #23
    //   4748: iload #22
    //   4750: ixor
    //   4751: istore #23
    //   4753: iload #24
    //   4755: bipush #31
    //   4757: ishl
    //   4758: iload #24
    //   4760: iconst_1
    //   4761: iushr
    //   4762: ior
    //   4763: istore #24
    //   4765: iload #24
    //   4767: bipush #8
    //   4769: iushr
    //   4770: iload #23
    //   4772: ixor
    //   4773: ldc 16711935
    //   4775: iand
    //   4776: istore #22
    //   4778: iload #23
    //   4780: iload #22
    //   4782: ixor
    //   4783: istore #23
    //   4785: iload #24
    //   4787: iload #22
    //   4789: bipush #8
    //   4791: ishl
    //   4792: ixor
    //   4793: istore #24
    //   4795: iload #24
    //   4797: iconst_2
    //   4798: iushr
    //   4799: iload #23
    //   4801: ixor
    //   4802: ldc 858993459
    //   4804: iand
    //   4805: istore #22
    //   4807: iload #23
    //   4809: iload #22
    //   4811: ixor
    //   4812: istore #23
    //   4814: iload #24
    //   4816: iload #22
    //   4818: iconst_2
    //   4819: ishl
    //   4820: ixor
    //   4821: istore #24
    //   4823: iload #23
    //   4825: bipush #16
    //   4827: iushr
    //   4828: iload #24
    //   4830: ixor
    //   4831: ldc 65535
    //   4833: iand
    //   4834: istore #22
    //   4836: iload #24
    //   4838: iload #22
    //   4840: ixor
    //   4841: istore #24
    //   4843: iload #23
    //   4845: iload #22
    //   4847: bipush #16
    //   4849: ishl
    //   4850: ixor
    //   4851: istore #23
    //   4853: iload #23
    //   4855: iconst_4
    //   4856: iushr
    //   4857: iload #24
    //   4859: ixor
    //   4860: ldc 252645135
    //   4862: iand
    //   4863: istore #22
    //   4865: iload #24
    //   4867: iload #22
    //   4869: ixor
    //   4870: istore #24
    //   4872: iload #23
    //   4874: iload #22
    //   4876: iconst_4
    //   4877: ishl
    //   4878: ixor
    //   4879: istore #23
    //   4881: aload #17
    //   4883: iconst_0
    //   4884: iload #23
    //   4886: iastore
    //   4887: aload #17
    //   4889: iconst_1
    //   4890: iload #24
    //   4892: iastore
    //   4893: iload #19
    //   4895: bipush #8
    //   4897: imul
    //   4898: istore #27
    //   4900: iconst_0
    //   4901: istore #28
    //   4903: iload #28
    //   4905: iconst_2
    //   4906: if_icmpge -> 4995
    //   4909: aload #4
    //   4911: iload #27
    //   4913: iload #28
    //   4915: iconst_4
    //   4916: imul
    //   4917: iadd
    //   4918: aload #17
    //   4920: iload #28
    //   4922: iaload
    //   4923: bipush #24
    //   4925: iushr
    //   4926: i2b
    //   4927: bastore
    //   4928: aload #4
    //   4930: iload #27
    //   4932: iload #28
    //   4934: iconst_4
    //   4935: imul
    //   4936: iadd
    //   4937: iconst_1
    //   4938: iadd
    //   4939: aload #17
    //   4941: iload #28
    //   4943: iaload
    //   4944: bipush #16
    //   4946: iushr
    //   4947: i2b
    //   4948: bastore
    //   4949: aload #4
    //   4951: iload #27
    //   4953: iload #28
    //   4955: iconst_4
    //   4956: imul
    //   4957: iadd
    //   4958: iconst_2
    //   4959: iadd
    //   4960: aload #17
    //   4962: iload #28
    //   4964: iaload
    //   4965: bipush #8
    //   4967: iushr
    //   4968: i2b
    //   4969: bastore
    //   4970: aload #4
    //   4972: iload #27
    //   4974: iload #28
    //   4976: iconst_4
    //   4977: imul
    //   4978: iadd
    //   4979: iconst_3
    //   4980: iadd
    //   4981: aload #17
    //   4983: iload #28
    //   4985: iaload
    //   4986: i2b
    //   4987: bastore
    //   4988: iinc #28, 1
    //   4991: iload_2
    //   4992: ifeq -> 4903
    //   4995: iinc #19, 1
    //   4998: iload_2
    //   4999: ifeq -> 4084
    //   5002: new java/math/BigInteger
    //   5005: dup
    //   5006: aload #4
    //   5008: invokespecial <init> : ([B)V
    //   5011: invokevirtual abs : ()Ljava/math/BigInteger;
    //   5014: putstatic burp/Zmz.ZW : Ljava/lang/Object;
    //   5017: getstatic burp/Zbnk.Zp : Ljava/lang/Object;
    //   5020: checkcast java/math/BigInteger
    //   5023: invokevirtual toByteArray : ()[B
    //   5026: astore_3
    //   5027: new java/lang/StringBuilder
    //   5030: dup
    //   5031: invokespecial <init> : ()V
    //   5034: astore #5
    //   5036: aload #5
    //   5038: sipush #-31483
    //   5041: sipush #30623
    //   5044: invokestatic a : (II)Ljava/lang/String;
    //   5047: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5050: pop
    //   5051: aload_3
    //   5052: astore #6
    //   5054: aload #6
    //   5056: arraylength
    //   5057: istore #7
    //   5059: iconst_0
    //   5060: istore #8
    //   5062: iload #8
    //   5064: iload #7
    //   5066: if_icmpge -> 5092
    //   5069: aload #6
    //   5071: iload #8
    //   5073: baload
    //   5074: istore #9
    //   5076: aload #5
    //   5078: iload #9
    //   5080: i2c
    //   5081: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   5084: pop
    //   5085: iinc #8, 1
    //   5088: iload_2
    //   5089: ifeq -> 5062
    //   5092: aload #5
    //   5094: sipush #-31486
    //   5097: sipush #25623
    //   5100: invokestatic a : (II)Ljava/lang/String;
    //   5103: ldc ''
    //   5105: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   5108: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   5111: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5114: pop
    //   5115: aload #5
    //   5117: sipush #-31481
    //   5120: sipush #20884
    //   5123: invokestatic a : (II)Ljava/lang/String;
    //   5126: ldc ''
    //   5128: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   5131: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   5134: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5137: pop
    //   5138: aload #5
    //   5140: invokevirtual toString : ()Ljava/lang/String;
    //   5143: invokevirtual getBytes : ()[B
    //   5146: astore #4
    //   5148: aload #4
    //   5150: astore_3
    //   5151: aload_3
    //   5152: arraylength
    //   5153: bipush #8
    //   5155: iadd
    //   5156: bipush #6
    //   5158: ishr
    //   5159: iconst_1
    //   5160: iadd
    //   5161: bipush #16
    //   5163: imul
    //   5164: newarray int
    //   5166: astore #5
    //   5168: iconst_0
    //   5169: istore #6
    //   5171: iload #6
    //   5173: aload_3
    //   5174: arraylength
    //   5175: if_icmpge -> 5218
    //   5178: aload_3
    //   5179: iload #6
    //   5181: baload
    //   5182: sipush #255
    //   5185: iand
    //   5186: istore #7
    //   5188: aload #5
    //   5190: iload #6
    //   5192: iconst_2
    //   5193: ishr
    //   5194: dup2
    //   5195: iaload
    //   5196: iload #7
    //   5198: bipush #24
    //   5200: iload #6
    //   5202: iconst_4
    //   5203: irem
    //   5204: bipush #8
    //   5206: imul
    //   5207: isub
    //   5208: ishl
    //   5209: ior
    //   5210: iastore
    //   5211: iinc #6, 1
    //   5214: iload_2
    //   5215: ifeq -> 5171
    //   5218: aload #5
    //   5220: iload #6
    //   5222: iconst_2
    //   5223: ishr
    //   5224: dup2
    //   5225: iaload
    //   5226: sipush #128
    //   5229: bipush #24
    //   5231: iload #6
    //   5233: iconst_4
    //   5234: irem
    //   5235: bipush #8
    //   5237: imul
    //   5238: isub
    //   5239: ishl
    //   5240: ior
    //   5241: iastore
    //   5242: aload #5
    //   5244: aload #5
    //   5246: arraylength
    //   5247: iconst_1
    //   5248: isub
    //   5249: aload_3
    //   5250: arraylength
    //   5251: bipush #8
    //   5253: imul
    //   5254: iastore
    //   5255: bipush #80
    //   5257: newarray int
    //   5259: astore #7
    //   5261: ldc 1732584193
    //   5263: istore #8
    //   5265: ldc -271733879
    //   5267: istore #9
    //   5269: ldc -1732584194
    //   5271: istore #10
    //   5273: ldc 271733878
    //   5275: istore #11
    //   5277: ldc -1009589776
    //   5279: istore #12
    //   5281: iconst_0
    //   5282: istore #6
    //   5284: iload #6
    //   5286: aload #5
    //   5288: arraylength
    //   5289: if_icmpge -> 5611
    //   5292: iload #8
    //   5294: istore #13
    //   5296: iload #9
    //   5298: istore #14
    //   5300: iload #10
    //   5302: istore #15
    //   5304: iload #11
    //   5306: istore #16
    //   5308: iload #12
    //   5310: istore #17
    //   5312: iconst_0
    //   5313: istore #18
    //   5315: iload #18
    //   5317: bipush #80
    //   5319: if_icmpge -> 5569
    //   5322: iload #18
    //   5324: bipush #16
    //   5326: if_icmpge -> 5353
    //   5329: aload #7
    //   5331: iload #18
    //   5333: aload #5
    //   5335: iload #6
    //   5337: iload #18
    //   5339: iadd
    //   5340: iaload
    //   5341: iastore
    //   5342: iload_2
    //   5343: ifeq -> 5408
    //   5346: goto -> 5353
    //   5349: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5352: athrow
    //   5353: aload #7
    //   5355: iload #18
    //   5357: iconst_3
    //   5358: isub
    //   5359: iaload
    //   5360: aload #7
    //   5362: iload #18
    //   5364: bipush #8
    //   5366: isub
    //   5367: iaload
    //   5368: ixor
    //   5369: aload #7
    //   5371: iload #18
    //   5373: bipush #14
    //   5375: isub
    //   5376: iaload
    //   5377: ixor
    //   5378: aload #7
    //   5380: iload #18
    //   5382: bipush #16
    //   5384: isub
    //   5385: iaload
    //   5386: ixor
    //   5387: istore #19
    //   5389: iload #19
    //   5391: iconst_1
    //   5392: ishl
    //   5393: iload #19
    //   5395: bipush #31
    //   5397: iushr
    //   5398: ior
    //   5399: istore #20
    //   5401: aload #7
    //   5403: iload #18
    //   5405: iload #20
    //   5407: iastore
    //   5408: iload #8
    //   5410: iconst_5
    //   5411: ishl
    //   5412: iload #8
    //   5414: bipush #27
    //   5416: iushr
    //   5417: ior
    //   5418: istore #19
    //   5420: iload #19
    //   5422: iload #12
    //   5424: iadd
    //   5425: aload #7
    //   5427: iload #18
    //   5429: iaload
    //   5430: iadd
    //   5431: iload #18
    //   5433: bipush #20
    //   5435: if_icmpge -> 5461
    //   5438: ldc 1518500249
    //   5440: iload #9
    //   5442: iload #10
    //   5444: iand
    //   5445: iload #9
    //   5447: iconst_m1
    //   5448: ixor
    //   5449: iload #11
    //   5451: iand
    //   5452: ior
    //   5453: iadd
    //   5454: goto -> 5531
    //   5457: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5460: athrow
    //   5461: iload #18
    //   5463: bipush #40
    //   5465: if_icmpge -> 5486
    //   5468: ldc 1859775393
    //   5470: iload #9
    //   5472: iload #10
    //   5474: ixor
    //   5475: iload #11
    //   5477: ixor
    //   5478: iadd
    //   5479: goto -> 5531
    //   5482: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5485: athrow
    //   5486: iload #18
    //   5488: bipush #60
    //   5490: if_icmpge -> 5520
    //   5493: ldc -1894007588
    //   5495: iload #9
    //   5497: iload #10
    //   5499: iand
    //   5500: iload #9
    //   5502: iload #11
    //   5504: iand
    //   5505: ior
    //   5506: iload #10
    //   5508: iload #11
    //   5510: iand
    //   5511: ior
    //   5512: iadd
    //   5513: goto -> 5531
    //   5516: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5519: athrow
    //   5520: ldc -899497514
    //   5522: iload #9
    //   5524: iload #10
    //   5526: ixor
    //   5527: iload #11
    //   5529: ixor
    //   5530: iadd
    //   5531: iadd
    //   5532: istore #20
    //   5534: iload #11
    //   5536: istore #12
    //   5538: iload #10
    //   5540: istore #11
    //   5542: iload #9
    //   5544: bipush #30
    //   5546: ishl
    //   5547: iload #9
    //   5549: iconst_2
    //   5550: iushr
    //   5551: ior
    //   5552: istore #10
    //   5554: iload #8
    //   5556: istore #9
    //   5558: iload #20
    //   5560: istore #8
    //   5562: iinc #18, 1
    //   5565: iload_2
    //   5566: ifeq -> 5315
    //   5569: iload #8
    //   5571: iload #13
    //   5573: iadd
    //   5574: istore #8
    //   5576: iload #9
    //   5578: iload #14
    //   5580: iadd
    //   5581: istore #9
    //   5583: iload #10
    //   5585: iload #15
    //   5587: iadd
    //   5588: istore #10
    //   5590: iload #11
    //   5592: iload #16
    //   5594: iadd
    //   5595: istore #11
    //   5597: iload #12
    //   5599: iload #17
    //   5601: iadd
    //   5602: istore #12
    //   5604: iinc #6, 16
    //   5607: iload_2
    //   5608: ifeq -> 5284
    //   5611: iconst_5
    //   5612: newarray int
    //   5614: dup
    //   5615: iconst_0
    //   5616: iload #8
    //   5618: iastore
    //   5619: dup
    //   5620: iconst_1
    //   5621: iload #9
    //   5623: iastore
    //   5624: dup
    //   5625: iconst_2
    //   5626: iload #10
    //   5628: iastore
    //   5629: dup
    //   5630: iconst_3
    //   5631: iload #11
    //   5633: iastore
    //   5634: dup
    //   5635: iconst_4
    //   5636: iload #12
    //   5638: iastore
    //   5639: astore #13
    //   5641: bipush #20
    //   5643: newarray byte
    //   5645: astore #14
    //   5647: iconst_0
    //   5648: istore #15
    //   5650: iload #15
    //   5652: bipush #20
    //   5654: if_icmpge -> 5695
    //   5657: aload #13
    //   5659: iload #15
    //   5661: iconst_4
    //   5662: idiv
    //   5663: iaload
    //   5664: istore #16
    //   5666: iconst_3
    //   5667: iload #15
    //   5669: iconst_4
    //   5670: irem
    //   5671: isub
    //   5672: bipush #8
    //   5674: imul
    //   5675: istore #17
    //   5677: aload #14
    //   5679: iload #15
    //   5681: iload #16
    //   5683: iload #17
    //   5685: iushr
    //   5686: i2b
    //   5687: bastore
    //   5688: iinc #15, 1
    //   5691: iload_2
    //   5692: ifeq -> 5650
    //   5695: aload #14
    //   5697: astore #4
    //   5699: sipush #-31479
    //   5702: sipush #-13436
    //   5705: invokestatic a : (II)Ljava/lang/String;
    //   5708: iconst_1
    //   5709: ldc burp/Zs8y
    //   5711: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5714: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5717: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5720: astore_3
    //   5721: aload_3
    //   5722: arraylength
    //   5723: istore #4
    //   5725: iconst_0
    //   5726: istore #5
    //   5728: iload #5
    //   5730: iload #4
    //   5732: if_icmpge -> 5869
    //   5735: aload_3
    //   5736: iload #5
    //   5738: aaload
    //   5739: astore #6
    //   5741: aload #6
    //   5743: invokevirtual getModifiers : ()I
    //   5746: invokestatic isStatic : (I)Z
    //   5749: ifne -> 5759
    //   5752: goto -> 5862
    //   5755: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5758: athrow
    //   5759: aload #6
    //   5761: invokevirtual getType : ()Ljava/lang/Class;
    //   5764: astore #7
    //   5766: aload #7
    //   5768: ifnull -> 5849
    //   5771: aload #7
    //   5773: invokevirtual isPrimitive : ()Z
    //   5776: ifne -> 5849
    //   5779: goto -> 5786
    //   5782: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5785: athrow
    //   5786: aload #7
    //   5788: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5791: ifnull -> 5849
    //   5794: goto -> 5801
    //   5797: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5800: athrow
    //   5801: aload #7
    //   5803: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5806: invokevirtual getName : ()Ljava/lang/String;
    //   5809: ifnull -> 5849
    //   5812: goto -> 5819
    //   5815: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5818: athrow
    //   5819: aload #7
    //   5821: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5824: invokevirtual getName : ()Ljava/lang/String;
    //   5827: sipush #-31485
    //   5830: sipush #-20910
    //   5833: invokestatic a : (II)Ljava/lang/String;
    //   5836: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5839: ifne -> 5849
    //   5842: goto -> 5849
    //   5845: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5848: athrow
    //   5849: aload #6
    //   5851: iconst_1
    //   5852: invokevirtual setAccessible : (Z)V
    //   5855: aload #6
    //   5857: aconst_null
    //   5858: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5861: pop
    //   5862: iinc #5, 1
    //   5865: iload_2
    //   5866: ifeq -> 5728
    //   5869: sipush #-31482
    //   5872: sipush #5803
    //   5875: invokestatic a : (II)Ljava/lang/String;
    //   5878: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5881: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5884: astore_3
    //   5885: aload_3
    //   5886: arraylength
    //   5887: istore #4
    //   5889: iconst_0
    //   5890: istore #5
    //   5892: iload #5
    //   5894: iload #4
    //   5896: if_icmpge -> 6028
    //   5899: aload_3
    //   5900: iload #5
    //   5902: aaload
    //   5903: astore #6
    //   5905: aload #6
    //   5907: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5910: pop
    //   5911: aload #6
    //   5913: invokevirtual getModifiers : ()I
    //   5916: invokestatic isStatic : (I)Z
    //   5919: ifeq -> 6014
    //   5922: aload #6
    //   5924: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5927: arraylength
    //   5928: iconst_2
    //   5929: if_icmpne -> 6014
    //   5932: goto -> 5939
    //   5935: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5938: athrow
    //   5939: aload #6
    //   5941: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5944: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   5947: invokevirtual equals : (Ljava/lang/Object;)Z
    //   5950: ifeq -> 6014
    //   5953: goto -> 5960
    //   5956: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5959: athrow
    //   5960: aload #6
    //   5962: iconst_1
    //   5963: invokevirtual setAccessible : (Z)V
    //   5966: aload #6
    //   5968: aconst_null
    //   5969: iconst_2
    //   5970: anewarray java/lang/Object
    //   5973: dup
    //   5974: iconst_0
    //   5975: aload_0
    //   5976: aastore
    //   5977: dup
    //   5978: iconst_1
    //   5979: aload_1
    //   5980: ifnonnull -> 5998
    //   5983: goto -> 5990
    //   5986: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5989: athrow
    //   5990: aload_1
    //   5991: goto -> 6005
    //   5994: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5997: athrow
    //   5998: aload_1
    //   5999: checkcast [B
    //   6002: invokevirtual clone : ()Ljava/lang/Object;
    //   6005: aastore
    //   6006: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   6009: pop
    //   6010: iload_2
    //   6011: ifeq -> 6028
    //   6014: iinc #5, 1
    //   6017: iload_2
    //   6018: ifeq -> 5892
    //   6021: goto -> 6028
    //   6024: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6027: athrow
    //   6028: getstatic burp/Zmz.Zp : Ljava/lang/String;
    //   6031: getstatic burp/Zzre.ZE : Ljava/lang/Object;
    //   6034: checkcast java/math/BigInteger
    //   6037: invokevirtual intValue : ()I
    //   6040: bipush #32
    //   6042: irem
    //   6043: invokestatic abs : (I)I
    //   6046: invokevirtual charAt : (I)C
    //   6049: getstatic burp/Zm_u.Zi : Ljava/lang/String;
    //   6052: getstatic burp/Zt0m.Zt : Ljava/lang/Object;
    //   6055: checkcast java/math/BigInteger
    //   6058: invokevirtual intValue : ()I
    //   6061: bipush #32
    //   6063: irem
    //   6064: invokestatic abs : (I)I
    //   6067: invokevirtual charAt : (I)C
    //   6070: if_icmple -> 6185
    //   6073: getstatic burp/Zzpm.Za : Ljava/lang/String;
    //   6076: getstatic burp/Zk1.Z_ : Ljava/lang/Object;
    //   6079: checkcast java/math/BigInteger
    //   6082: invokevirtual intValue : ()I
    //   6085: bipush #32
    //   6087: irem
    //   6088: invokestatic abs : (I)I
    //   6091: invokevirtual charAt : (I)C
    //   6094: getstatic burp/Zepy.Zg : Ljava/lang/String;
    //   6097: getstatic burp/Zzyb.ZV : Ljava/lang/Object;
    //   6100: checkcast java/math/BigInteger
    //   6103: invokevirtual intValue : ()I
    //   6106: bipush #32
    //   6108: irem
    //   6109: invokestatic abs : (I)I
    //   6112: invokevirtual charAt : (I)C
    //   6115: if_icmpgt -> 6185
    //   6118: goto -> 6125
    //   6121: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6124: athrow
    //   6125: getstatic burp/Zg6z.ZY : Ljava/lang/String;
    //   6128: getstatic burp/Zz0f.ZL : Ljava/lang/Object;
    //   6131: checkcast java/math/BigInteger
    //   6134: invokevirtual intValue : ()I
    //   6137: bipush #32
    //   6139: irem
    //   6140: invokestatic abs : (I)I
    //   6143: invokevirtual charAt : (I)C
    //   6146: getstatic burp/Zmhq.Zy : Ljava/lang/String;
    //   6149: getstatic burp/Zsbo.ZG : Ljava/lang/Object;
    //   6152: checkcast java/math/BigInteger
    //   6155: invokevirtual intValue : ()I
    //   6158: bipush #32
    //   6160: irem
    //   6161: invokestatic abs : (I)I
    //   6164: invokevirtual charAt : (I)C
    //   6167: if_icmpgt -> 6185
    //   6170: goto -> 6177
    //   6173: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6176: athrow
    //   6177: iconst_1
    //   6178: goto -> 6186
    //   6181: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6184: athrow
    //   6185: iconst_0
    //   6186: ireturn
    //   6187: astore_3
    //   6188: new java/lang/Exception
    //   6191: dup
    //   6192: aload_3
    //   6193: invokevirtual getMessage : ()Ljava/lang/String;
    //   6196: invokespecial <init> : (Ljava/lang/String;)V
    //   6199: athrow
    // Exception table:
    //   from	to	target	type
    //   4	6186	6187	java/lang/Throwable
    //   309	333	336	java/lang/Throwable
    //   407	444	444	java/lang/Throwable
    //   448	469	469	java/lang/Throwable
    //   473	503	503	java/lang/Throwable
    //   5322	5346	5349	java/lang/Throwable
    //   5420	5457	5457	java/lang/Throwable
    //   5461	5482	5482	java/lang/Throwable
    //   5486	5516	5516	java/lang/Throwable
    //   5741	5755	5755	java/lang/Throwable
    //   5766	5779	5782	java/lang/Throwable
    //   5771	5794	5797	java/lang/Throwable
    //   5786	5812	5815	java/lang/Throwable
    //   5801	5842	5845	java/lang/Throwable
    //   5905	5932	5935	java/lang/Throwable
    //   5922	5953	5956	java/lang/Throwable
    //   5939	5983	5986	java/lang/Throwable
    //   5960	5994	5994	java/lang/Throwable
    //   6005	6021	6024	java/lang/Throwable
    //   6028	6118	6121	java/lang/Throwable
    //   6073	6170	6173	java/lang/Throwable
    //   6125	6181	6181	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #14
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'z°DdÐk '´;>Aª"µ§BÈÐPþ$÷SªW#ÂhéÌ<7\\t°{£ÉÆ\Ý ùÎLF0]½rÒªÌí~a¡)K*ÁYk¼í°^Õ\\t½¢Z\TOÏõM\\r£Ô8C4bçÎK60Q£ª(*ÂO­¥ïo4Ö­f({Ï±y{px@ÊKËI¢Òñ.`Ù8TÏ«ÞâÚzC-\\tÜjxIÑN 1ÈoVÃg2ÍW.LÐc¹µMæ2{¦Ú0\\t¸új@MY¥\\t4ÞÛP=À g%_1<HlJD?ÂÜÿ1V4°Õ´kJJª\\t¦ÙÛ÷LdPã'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #7
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #110
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
    //   68: ldc 'Ý\ç*¦¹NÆ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_4
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #10
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
    //   128: putstatic burp/Zt85.a : [Ljava/lang/String;
    //   131: bipush #14
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zt85.b : [Ljava/lang/String;
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
    //   212: bipush #7
    //   214: goto -> 244
    //   217: bipush #111
    //   219: goto -> 244
    //   222: bipush #16
    //   224: goto -> 244
    //   227: bipush #41
    //   229: goto -> 244
    //   232: bipush #89
    //   234: goto -> 244
    //   237: bipush #16
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
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: bipush #32
    //   306: newarray byte
    //   308: dup
    //   309: iconst_0
    //   310: bipush #16
    //   312: bastore
    //   313: dup
    //   314: iconst_1
    //   315: bipush #43
    //   317: bastore
    //   318: dup
    //   319: iconst_2
    //   320: bipush #-7
    //   322: bastore
    //   323: dup
    //   324: iconst_3
    //   325: bipush #-89
    //   327: bastore
    //   328: dup
    //   329: iconst_4
    //   330: bipush #-103
    //   332: bastore
    //   333: dup
    //   334: iconst_5
    //   335: bipush #-53
    //   337: bastore
    //   338: dup
    //   339: bipush #6
    //   341: bipush #-48
    //   343: bastore
    //   344: dup
    //   345: bipush #7
    //   347: iconst_1
    //   348: bastore
    //   349: dup
    //   350: bipush #8
    //   352: bipush #-103
    //   354: bastore
    //   355: dup
    //   356: bipush #9
    //   358: bipush #-37
    //   360: bastore
    //   361: dup
    //   362: bipush #10
    //   364: bipush #77
    //   366: bastore
    //   367: dup
    //   368: bipush #11
    //   370: bipush #46
    //   372: bastore
    //   373: dup
    //   374: bipush #12
    //   376: bipush #-46
    //   378: bastore
    //   379: dup
    //   380: bipush #13
    //   382: bipush #-47
    //   384: bastore
    //   385: dup
    //   386: bipush #14
    //   388: bipush #-63
    //   390: bastore
    //   391: dup
    //   392: bipush #15
    //   394: bipush #-106
    //   396: bastore
    //   397: dup
    //   398: bipush #16
    //   400: bipush #-55
    //   402: bastore
    //   403: dup
    //   404: bipush #17
    //   406: bipush #76
    //   408: bastore
    //   409: dup
    //   410: bipush #18
    //   412: bipush #118
    //   414: bastore
    //   415: dup
    //   416: bipush #19
    //   418: bipush #-71
    //   420: bastore
    //   421: dup
    //   422: bipush #20
    //   424: bipush #63
    //   426: bastore
    //   427: dup
    //   428: bipush #21
    //   430: bipush #61
    //   432: bastore
    //   433: dup
    //   434: bipush #22
    //   436: bipush #-128
    //   438: bastore
    //   439: dup
    //   440: bipush #23
    //   442: bipush #-81
    //   444: bastore
    //   445: dup
    //   446: bipush #24
    //   448: bipush #80
    //   450: bastore
    //   451: dup
    //   452: bipush #25
    //   454: bipush #53
    //   456: bastore
    //   457: dup
    //   458: bipush #26
    //   460: bipush #112
    //   462: bastore
    //   463: dup
    //   464: bipush #27
    //   466: bipush #-95
    //   468: bastore
    //   469: dup
    //   470: bipush #28
    //   472: bipush #31
    //   474: bastore
    //   475: dup
    //   476: bipush #29
    //   478: bipush #31
    //   480: bastore
    //   481: dup
    //   482: bipush #30
    //   484: bipush #-122
    //   486: bastore
    //   487: dup
    //   488: bipush #31
    //   490: bipush #-36
    //   492: bastore
    //   493: invokespecial <init> : ([B)V
    //   496: putstatic burp/Zt85.Zl : Ljava/lang/Object;
    //   499: sipush #-31480
    //   502: sipush #-27426
    //   505: invokestatic a : (II)Ljava/lang/String;
    //   508: putstatic burp/Zt85.ZR : Ljava/lang/String;
    //   511: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF850F) & 0xFFFF;
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
      char c = 'í';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt85.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */