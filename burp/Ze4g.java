package burp;

import java.math.BigInteger;

class Ze4g extends ClassLoader {
  static Object Zz;
  
  static String Zk;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZX(Object paramObject) {
    Zm0d.ZV = a(-2390, -13639);
    Zm0d.Zz = new BigInteger(a(-2392, 29242));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zeig.Zg.charAt(Math.abs(((BigInteger)Zsn3.Zy).intValue() % 32)) <= Ztdl.ZK.charAt(Math.abs(((BigInteger)Zt9f.Zl).intValue() % 32))) {
          try {
            Zl_a.ZL(Class.forName(a(-2396, -24887)));
            if (!bool)
              Zrd3.ZI(Class.forName(a(-2387, 20494))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zrd3.ZI(Class.forName(a(-2387, 20494)));
    } catch (Throwable throwable) {}
  }
  
  static void ZY(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean Zm(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zgtx.Z_ : Ljava/lang/Object;
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
    //   574: putstatic burp/Zgtx.Z_ : Ljava/lang/Object;
    //   577: getstatic burp/Zxcn.Zq : Ljava/lang/Object;
    //   580: checkcast java/math/BigInteger
    //   583: getstatic burp/Zvob.ZX : Ljava/lang/Object;
    //   586: checkcast java/math/BigInteger
    //   589: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   592: putstatic burp/Zrnt.Zh : Ljava/lang/Object;
    //   595: getstatic burp/Zrm6.Z_ : Ljava/lang/Object;
    //   598: checkcast java/math/BigInteger
    //   601: invokevirtual toByteArray : ()[B
    //   604: astore_3
    //   605: new java/lang/StringBuilder
    //   608: dup
    //   609: invokespecial <init> : ()V
    //   612: astore #5
    //   614: aload #5
    //   616: sipush #-2388
    //   619: sipush #-13701
    //   622: invokestatic a : (II)Ljava/lang/String;
    //   625: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   628: pop
    //   629: aload_3
    //   630: astore #6
    //   632: aload #6
    //   634: arraylength
    //   635: istore #7
    //   637: iconst_0
    //   638: istore #8
    //   640: iload #8
    //   642: iload #7
    //   644: if_icmpge -> 670
    //   647: aload #6
    //   649: iload #8
    //   651: baload
    //   652: istore #9
    //   654: aload #5
    //   656: iload #9
    //   658: i2c
    //   659: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   662: pop
    //   663: iinc #8, 1
    //   666: iload_2
    //   667: ifeq -> 640
    //   670: aload #5
    //   672: sipush #-2393
    //   675: sipush #-28768
    //   678: invokestatic a : (II)Ljava/lang/String;
    //   681: ldc ''
    //   683: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   686: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   689: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   692: pop
    //   693: aload #5
    //   695: sipush #-2391
    //   698: sipush #-21369
    //   701: invokestatic a : (II)Ljava/lang/String;
    //   704: ldc ''
    //   706: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   709: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   712: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   715: pop
    //   716: aload #5
    //   718: invokevirtual toString : ()Ljava/lang/String;
    //   721: invokevirtual getBytes : ()[B
    //   724: astore #4
    //   726: aload #4
    //   728: astore_3
    //   729: aload_3
    //   730: arraylength
    //   731: bipush #8
    //   733: iadd
    //   734: bipush #6
    //   736: ishr
    //   737: iconst_1
    //   738: iadd
    //   739: bipush #16
    //   741: imul
    //   742: newarray int
    //   744: astore #5
    //   746: iconst_0
    //   747: istore #6
    //   749: iload #6
    //   751: aload_3
    //   752: arraylength
    //   753: if_icmpge -> 796
    //   756: aload_3
    //   757: iload #6
    //   759: baload
    //   760: sipush #255
    //   763: iand
    //   764: istore #7
    //   766: aload #5
    //   768: iload #6
    //   770: iconst_2
    //   771: ishr
    //   772: dup2
    //   773: iaload
    //   774: iload #7
    //   776: bipush #24
    //   778: iload #6
    //   780: iconst_4
    //   781: irem
    //   782: bipush #8
    //   784: imul
    //   785: isub
    //   786: ishl
    //   787: ior
    //   788: iastore
    //   789: iinc #6, 1
    //   792: iload_2
    //   793: ifeq -> 749
    //   796: aload #5
    //   798: iload #6
    //   800: iconst_2
    //   801: ishr
    //   802: dup2
    //   803: iaload
    //   804: sipush #128
    //   807: bipush #24
    //   809: iload #6
    //   811: iconst_4
    //   812: irem
    //   813: bipush #8
    //   815: imul
    //   816: isub
    //   817: ishl
    //   818: ior
    //   819: iastore
    //   820: aload #5
    //   822: aload #5
    //   824: arraylength
    //   825: iconst_1
    //   826: isub
    //   827: aload_3
    //   828: arraylength
    //   829: bipush #8
    //   831: imul
    //   832: iastore
    //   833: bipush #80
    //   835: newarray int
    //   837: astore #7
    //   839: ldc 1732584193
    //   841: istore #8
    //   843: ldc -271733879
    //   845: istore #9
    //   847: ldc -1732584194
    //   849: istore #10
    //   851: ldc 271733878
    //   853: istore #11
    //   855: ldc -1009589776
    //   857: istore #12
    //   859: iconst_0
    //   860: istore #6
    //   862: iload #6
    //   864: aload #5
    //   866: arraylength
    //   867: if_icmpge -> 1189
    //   870: iload #8
    //   872: istore #13
    //   874: iload #9
    //   876: istore #14
    //   878: iload #10
    //   880: istore #15
    //   882: iload #11
    //   884: istore #16
    //   886: iload #12
    //   888: istore #17
    //   890: iconst_0
    //   891: istore #18
    //   893: iload #18
    //   895: bipush #80
    //   897: if_icmpge -> 1147
    //   900: iload #18
    //   902: bipush #16
    //   904: if_icmpge -> 931
    //   907: aload #7
    //   909: iload #18
    //   911: aload #5
    //   913: iload #6
    //   915: iload #18
    //   917: iadd
    //   918: iaload
    //   919: iastore
    //   920: iload_2
    //   921: ifeq -> 986
    //   924: goto -> 931
    //   927: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   930: athrow
    //   931: aload #7
    //   933: iload #18
    //   935: iconst_3
    //   936: isub
    //   937: iaload
    //   938: aload #7
    //   940: iload #18
    //   942: bipush #8
    //   944: isub
    //   945: iaload
    //   946: ixor
    //   947: aload #7
    //   949: iload #18
    //   951: bipush #14
    //   953: isub
    //   954: iaload
    //   955: ixor
    //   956: aload #7
    //   958: iload #18
    //   960: bipush #16
    //   962: isub
    //   963: iaload
    //   964: ixor
    //   965: istore #19
    //   967: iload #19
    //   969: iconst_1
    //   970: ishl
    //   971: iload #19
    //   973: bipush #31
    //   975: iushr
    //   976: ior
    //   977: istore #20
    //   979: aload #7
    //   981: iload #18
    //   983: iload #20
    //   985: iastore
    //   986: iload #8
    //   988: iconst_5
    //   989: ishl
    //   990: iload #8
    //   992: bipush #27
    //   994: iushr
    //   995: ior
    //   996: istore #19
    //   998: iload #19
    //   1000: iload #12
    //   1002: iadd
    //   1003: aload #7
    //   1005: iload #18
    //   1007: iaload
    //   1008: iadd
    //   1009: iload #18
    //   1011: bipush #20
    //   1013: if_icmpge -> 1039
    //   1016: ldc 1518500249
    //   1018: iload #9
    //   1020: iload #10
    //   1022: iand
    //   1023: iload #9
    //   1025: iconst_m1
    //   1026: ixor
    //   1027: iload #11
    //   1029: iand
    //   1030: ior
    //   1031: iadd
    //   1032: goto -> 1109
    //   1035: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1038: athrow
    //   1039: iload #18
    //   1041: bipush #40
    //   1043: if_icmpge -> 1064
    //   1046: ldc 1859775393
    //   1048: iload #9
    //   1050: iload #10
    //   1052: ixor
    //   1053: iload #11
    //   1055: ixor
    //   1056: iadd
    //   1057: goto -> 1109
    //   1060: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1063: athrow
    //   1064: iload #18
    //   1066: bipush #60
    //   1068: if_icmpge -> 1098
    //   1071: ldc -1894007588
    //   1073: iload #9
    //   1075: iload #10
    //   1077: iand
    //   1078: iload #9
    //   1080: iload #11
    //   1082: iand
    //   1083: ior
    //   1084: iload #10
    //   1086: iload #11
    //   1088: iand
    //   1089: ior
    //   1090: iadd
    //   1091: goto -> 1109
    //   1094: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1097: athrow
    //   1098: ldc -899497514
    //   1100: iload #9
    //   1102: iload #10
    //   1104: ixor
    //   1105: iload #11
    //   1107: ixor
    //   1108: iadd
    //   1109: iadd
    //   1110: istore #20
    //   1112: iload #11
    //   1114: istore #12
    //   1116: iload #10
    //   1118: istore #11
    //   1120: iload #9
    //   1122: bipush #30
    //   1124: ishl
    //   1125: iload #9
    //   1127: iconst_2
    //   1128: iushr
    //   1129: ior
    //   1130: istore #10
    //   1132: iload #8
    //   1134: istore #9
    //   1136: iload #20
    //   1138: istore #8
    //   1140: iinc #18, 1
    //   1143: iload_2
    //   1144: ifeq -> 893
    //   1147: iload #8
    //   1149: iload #13
    //   1151: iadd
    //   1152: istore #8
    //   1154: iload #9
    //   1156: iload #14
    //   1158: iadd
    //   1159: istore #9
    //   1161: iload #10
    //   1163: iload #15
    //   1165: iadd
    //   1166: istore #10
    //   1168: iload #11
    //   1170: iload #16
    //   1172: iadd
    //   1173: istore #11
    //   1175: iload #12
    //   1177: iload #17
    //   1179: iadd
    //   1180: istore #12
    //   1182: iinc #6, 16
    //   1185: iload_2
    //   1186: ifeq -> 862
    //   1189: iconst_5
    //   1190: newarray int
    //   1192: dup
    //   1193: iconst_0
    //   1194: iload #8
    //   1196: iastore
    //   1197: dup
    //   1198: iconst_1
    //   1199: iload #9
    //   1201: iastore
    //   1202: dup
    //   1203: iconst_2
    //   1204: iload #10
    //   1206: iastore
    //   1207: dup
    //   1208: iconst_3
    //   1209: iload #11
    //   1211: iastore
    //   1212: dup
    //   1213: iconst_4
    //   1214: iload #12
    //   1216: iastore
    //   1217: astore #13
    //   1219: bipush #20
    //   1221: newarray byte
    //   1223: astore #14
    //   1225: iconst_0
    //   1226: istore #15
    //   1228: iload #15
    //   1230: bipush #20
    //   1232: if_icmpge -> 1273
    //   1235: aload #13
    //   1237: iload #15
    //   1239: iconst_4
    //   1240: idiv
    //   1241: iaload
    //   1242: istore #16
    //   1244: iconst_3
    //   1245: iload #15
    //   1247: iconst_4
    //   1248: irem
    //   1249: isub
    //   1250: bipush #8
    //   1252: imul
    //   1253: istore #17
    //   1255: aload #14
    //   1257: iload #15
    //   1259: iload #16
    //   1261: iload #17
    //   1263: iushr
    //   1264: i2b
    //   1265: bastore
    //   1266: iinc #15, 1
    //   1269: iload_2
    //   1270: ifeq -> 1228
    //   1273: aload #14
    //   1275: astore #4
    //   1277: sipush #-2389
    //   1280: sipush #-22802
    //   1283: invokestatic a : (II)Ljava/lang/String;
    //   1286: iconst_1
    //   1287: ldc burp/Zsvh
    //   1289: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1292: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1295: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1298: astore_3
    //   1299: aload_3
    //   1300: arraylength
    //   1301: istore #4
    //   1303: iconst_0
    //   1304: istore #5
    //   1306: iload #5
    //   1308: iload #4
    //   1310: if_icmpge -> 1447
    //   1313: aload_3
    //   1314: iload #5
    //   1316: aaload
    //   1317: astore #6
    //   1319: aload #6
    //   1321: invokevirtual getModifiers : ()I
    //   1324: invokestatic isStatic : (I)Z
    //   1327: ifne -> 1337
    //   1330: goto -> 1440
    //   1333: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1336: athrow
    //   1337: aload #6
    //   1339: invokevirtual getType : ()Ljava/lang/Class;
    //   1342: astore #7
    //   1344: aload #7
    //   1346: ifnull -> 1427
    //   1349: aload #7
    //   1351: invokevirtual isPrimitive : ()Z
    //   1354: ifne -> 1427
    //   1357: goto -> 1364
    //   1360: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1363: athrow
    //   1364: aload #7
    //   1366: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1369: ifnull -> 1427
    //   1372: goto -> 1379
    //   1375: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1378: athrow
    //   1379: aload #7
    //   1381: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1384: invokevirtual getName : ()Ljava/lang/String;
    //   1387: ifnull -> 1427
    //   1390: goto -> 1397
    //   1393: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1396: athrow
    //   1397: aload #7
    //   1399: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1402: invokevirtual getName : ()Ljava/lang/String;
    //   1405: sipush #-2385
    //   1408: sipush #6290
    //   1411: invokestatic a : (II)Ljava/lang/String;
    //   1414: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1417: ifne -> 1427
    //   1420: goto -> 1427
    //   1423: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1426: athrow
    //   1427: aload #6
    //   1429: iconst_1
    //   1430: invokevirtual setAccessible : (Z)V
    //   1433: aload #6
    //   1435: aconst_null
    //   1436: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1439: pop
    //   1440: iinc #5, 1
    //   1443: iload_2
    //   1444: ifeq -> 1306
    //   1447: sipush #-2394
    //   1450: sipush #-30360
    //   1453: invokestatic a : (II)Ljava/lang/String;
    //   1456: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1459: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1462: astore_3
    //   1463: aload_3
    //   1464: arraylength
    //   1465: istore #4
    //   1467: iconst_0
    //   1468: istore #5
    //   1470: iload #5
    //   1472: iload #4
    //   1474: if_icmpge -> 1606
    //   1477: aload_3
    //   1478: iload #5
    //   1480: aaload
    //   1481: astore #6
    //   1483: aload #6
    //   1485: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1488: pop
    //   1489: aload #6
    //   1491: invokevirtual getModifiers : ()I
    //   1494: invokestatic isStatic : (I)Z
    //   1497: ifeq -> 1592
    //   1500: aload #6
    //   1502: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1505: arraylength
    //   1506: iconst_2
    //   1507: if_icmpne -> 1592
    //   1510: goto -> 1517
    //   1513: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1516: athrow
    //   1517: aload #6
    //   1519: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1522: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1525: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1528: ifeq -> 1592
    //   1531: goto -> 1538
    //   1534: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1537: athrow
    //   1538: aload #6
    //   1540: iconst_1
    //   1541: invokevirtual setAccessible : (Z)V
    //   1544: aload #6
    //   1546: aconst_null
    //   1547: iconst_2
    //   1548: anewarray java/lang/Object
    //   1551: dup
    //   1552: iconst_0
    //   1553: aload_0
    //   1554: aastore
    //   1555: dup
    //   1556: iconst_1
    //   1557: aload_1
    //   1558: ifnonnull -> 1576
    //   1561: goto -> 1568
    //   1564: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1567: athrow
    //   1568: aload_1
    //   1569: goto -> 1583
    //   1572: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1575: athrow
    //   1576: aload_1
    //   1577: checkcast [B
    //   1580: invokevirtual clone : ()Ljava/lang/Object;
    //   1583: aastore
    //   1584: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1587: pop
    //   1588: iload_2
    //   1589: ifeq -> 1606
    //   1592: iinc #5, 1
    //   1595: iload_2
    //   1596: ifeq -> 1470
    //   1599: goto -> 1606
    //   1602: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1605: athrow
    //   1606: getstatic burp/Zr02.ZG : Ljava/lang/String;
    //   1609: getstatic burp/Zr_x.Zd : Ljava/lang/Object;
    //   1612: checkcast java/math/BigInteger
    //   1615: invokevirtual intValue : ()I
    //   1618: bipush #32
    //   1620: irem
    //   1621: invokestatic abs : (I)I
    //   1624: invokevirtual charAt : (I)C
    //   1627: getstatic burp/Zlo0.ZD : Ljava/lang/String;
    //   1630: getstatic burp/Ztq8.Zm : Ljava/lang/Object;
    //   1633: checkcast java/math/BigInteger
    //   1636: invokevirtual intValue : ()I
    //   1639: bipush #32
    //   1641: irem
    //   1642: invokestatic abs : (I)I
    //   1645: invokevirtual charAt : (I)C
    //   1648: if_icmple -> 1755
    //   1651: getstatic burp/Zrjq.Zx : Ljava/lang/String;
    //   1654: getstatic burp/Zrom.ZF : Ljava/lang/Object;
    //   1657: checkcast java/math/BigInteger
    //   1660: invokevirtual intValue : ()I
    //   1663: bipush #32
    //   1665: irem
    //   1666: invokestatic abs : (I)I
    //   1669: invokevirtual charAt : (I)C
    //   1672: getstatic burp/Ztzj.ZB : Ljava/lang/String;
    //   1675: getstatic burp/Zbnk.Zp : Ljava/lang/Object;
    //   1678: checkcast java/math/BigInteger
    //   1681: invokevirtual intValue : ()I
    //   1684: bipush #32
    //   1686: irem
    //   1687: invokestatic abs : (I)I
    //   1690: invokevirtual charAt : (I)C
    //   1693: if_icmpgt -> 1755
    //   1696: goto -> 1703
    //   1699: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1702: athrow
    //   1703: getstatic burp/Zbow.Zr : Ljava/lang/String;
    //   1706: getstatic burp/Zl7b.ZK : Ljava/lang/Object;
    //   1709: checkcast java/math/BigInteger
    //   1712: invokevirtual intValue : ()I
    //   1715: bipush #32
    //   1717: irem
    //   1718: invokestatic abs : (I)I
    //   1721: invokevirtual charAt : (I)C
    //   1724: getstatic burp/Zsn9.Zp : Ljava/lang/String;
    //   1727: getstatic burp/Zkjj.Zh : Ljava/lang/Object;
    //   1730: checkcast java/math/BigInteger
    //   1733: invokevirtual intValue : ()I
    //   1736: bipush #32
    //   1738: irem
    //   1739: invokestatic abs : (I)I
    //   1742: invokevirtual charAt : (I)C
    //   1745: if_icmple -> 1763
    //   1748: goto -> 1755
    //   1751: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1754: athrow
    //   1755: iconst_1
    //   1756: goto -> 1764
    //   1759: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1762: athrow
    //   1763: iconst_0
    //   1764: ireturn
    //   1765: astore_3
    //   1766: new java/lang/Exception
    //   1769: dup
    //   1770: aload_3
    //   1771: invokevirtual getMessage : ()Ljava/lang/String;
    //   1774: invokespecial <init> : (Ljava/lang/String;)V
    //   1777: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1764	1765	java/lang/Throwable
    //   185	209	212	java/lang/Throwable
    //   283	320	320	java/lang/Throwable
    //   324	345	345	java/lang/Throwable
    //   349	379	379	java/lang/Throwable
    //   900	924	927	java/lang/Throwable
    //   998	1035	1035	java/lang/Throwable
    //   1039	1060	1060	java/lang/Throwable
    //   1064	1094	1094	java/lang/Throwable
    //   1319	1333	1333	java/lang/Throwable
    //   1344	1357	1360	java/lang/Throwable
    //   1349	1372	1375	java/lang/Throwable
    //   1364	1390	1393	java/lang/Throwable
    //   1379	1420	1423	java/lang/Throwable
    //   1483	1510	1513	java/lang/Throwable
    //   1500	1531	1534	java/lang/Throwable
    //   1517	1561	1564	java/lang/Throwable
    //   1538	1572	1572	java/lang/Throwable
    //   1583	1599	1602	java/lang/Throwable
    //   1606	1696	1699	java/lang/Throwable
    //   1651	1748	1751	java/lang/Throwable
    //   1703	1759	1759	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'gã­ñj÷Étøi"lbÛ)^ô|þHyÄ_«8ñ~áWð w¡kwøeg¿ #ý½+ùðÛ0×j+áXé\\tH:0]®+Õ\\t êÂÚÆ÷üÒ¿O+ |þ¥Û8ª|j4­IÜYR\\tùq4hC~Mà,ßLÎSoæ÷°MÆ³¦Èòa²²Éü©gh¤uO'¹WªàøEB\\n0Ò¦mN½ ,Â« ¯\\röoñúF<~Sû¤k(ù\\táýça¡ÚiC;\\tyjWjjó'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #32
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #19
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
    //   68: ldc 'SYG\\r</\\bb)Û~x¤'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #7
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #94
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
    //   129: putstatic burp/Ze4g.a : [Ljava/lang/String;
    //   132: bipush #11
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Ze4g.b : [Ljava/lang/String;
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
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 231, 5 -> 236
    //   212: bipush #9
    //   214: goto -> 243
    //   217: bipush #46
    //   219: goto -> 243
    //   222: bipush #53
    //   224: goto -> 243
    //   227: iconst_5
    //   228: goto -> 243
    //   231: bipush #109
    //   233: goto -> 243
    //   236: bipush #117
    //   238: goto -> 243
    //   241: bipush #11
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
    //   304: bipush #32
    //   306: newarray byte
    //   308: dup
    //   309: iconst_0
    //   310: bipush #51
    //   312: bastore
    //   313: dup
    //   314: iconst_1
    //   315: bipush #-33
    //   317: bastore
    //   318: dup
    //   319: iconst_2
    //   320: bipush #92
    //   322: bastore
    //   323: dup
    //   324: iconst_3
    //   325: bipush #-118
    //   327: bastore
    //   328: dup
    //   329: iconst_4
    //   330: bipush #92
    //   332: bastore
    //   333: dup
    //   334: iconst_5
    //   335: bipush #83
    //   337: bastore
    //   338: dup
    //   339: bipush #6
    //   341: bipush #-5
    //   343: bastore
    //   344: dup
    //   345: bipush #7
    //   347: bipush #22
    //   349: bastore
    //   350: dup
    //   351: bipush #8
    //   353: bipush #121
    //   355: bastore
    //   356: dup
    //   357: bipush #9
    //   359: bipush #114
    //   361: bastore
    //   362: dup
    //   363: bipush #10
    //   365: bipush #-9
    //   367: bastore
    //   368: dup
    //   369: bipush #11
    //   371: bipush #-47
    //   373: bastore
    //   374: dup
    //   375: bipush #12
    //   377: bipush #26
    //   379: bastore
    //   380: dup
    //   381: bipush #13
    //   383: bipush #-4
    //   385: bastore
    //   386: dup
    //   387: bipush #14
    //   389: bipush #-116
    //   391: bastore
    //   392: dup
    //   393: bipush #15
    //   395: bipush #-79
    //   397: bastore
    //   398: dup
    //   399: bipush #16
    //   401: iconst_m1
    //   402: bastore
    //   403: dup
    //   404: bipush #17
    //   406: bipush #-126
    //   408: bastore
    //   409: dup
    //   410: bipush #18
    //   412: bipush #28
    //   414: bastore
    //   415: dup
    //   416: bipush #19
    //   418: iconst_4
    //   419: bastore
    //   420: dup
    //   421: bipush #20
    //   423: iconst_5
    //   424: bastore
    //   425: dup
    //   426: bipush #21
    //   428: bipush #41
    //   430: bastore
    //   431: dup
    //   432: bipush #22
    //   434: bipush #-22
    //   436: bastore
    //   437: dup
    //   438: bipush #23
    //   440: bipush #111
    //   442: bastore
    //   443: dup
    //   444: bipush #24
    //   446: bipush #103
    //   448: bastore
    //   449: dup
    //   450: bipush #25
    //   452: bipush #-10
    //   454: bastore
    //   455: dup
    //   456: bipush #26
    //   458: bipush #-36
    //   460: bastore
    //   461: dup
    //   462: bipush #27
    //   464: bipush #-75
    //   466: bastore
    //   467: dup
    //   468: bipush #28
    //   470: bipush #43
    //   472: bastore
    //   473: dup
    //   474: bipush #29
    //   476: bipush #-3
    //   478: bastore
    //   479: dup
    //   480: bipush #30
    //   482: bipush #120
    //   484: bastore
    //   485: dup
    //   486: bipush #31
    //   488: bipush #67
    //   490: bastore
    //   491: invokespecial <init> : ([B)V
    //   494: putstatic burp/Ze4g.Zz : Ljava/lang/Object;
    //   497: sipush #-2386
    //   500: sipush #7082
    //   503: invokestatic a : (II)Ljava/lang/String;
    //   506: putstatic burp/Ze4g.Zk : Ljava/lang/String;
    //   509: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFF6AE) & 0xFFFF;
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
      byte b1 = 93;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze4g.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */