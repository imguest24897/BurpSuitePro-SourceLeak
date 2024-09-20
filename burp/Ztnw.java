package burp;

import java.math.BigInteger;

class Ztnw extends ClassLoader {
  static Object Zt;
  
  static String Zr;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZT(Object paramObject) {
    Zzai.Zy = a(19074, -16137);
    Zzai.Z_ = new BigInteger(a(19081, -19383));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zl88.Zd.charAt(Math.abs(((BigInteger)Zrbp.Z_).intValue() % 32)) > Zt4g.Zj.charAt(Math.abs(((BigInteger)Ze3j.Ze).intValue() % 32))) {
          try {
            Zzlg.ZJ(Class.forName(a(19083, 21325)));
            if (!bool)
              Zr3q.ZA(Class.forName(a(19078, -12859))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zr3q.ZA(Class.forName(a(19078, -12859)));
    } catch (Throwable throwable) {}
  }
  
  static void ZS(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean Zb(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zz1k.ZP : Ljava/lang/Object;
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
    //   574: putstatic burp/Zk8b.ZK : Ljava/lang/Object;
    //   577: getstatic burp/Zsde.Zx : Ljava/lang/Object;
    //   580: checkcast java/math/BigInteger
    //   583: getstatic burp/Zedz.Za : Ljava/lang/Object;
    //   586: checkcast java/math/BigInteger
    //   589: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   592: putstatic burp/Zxl5.Zh : Ljava/lang/Object;
    //   595: getstatic burp/Zkfz.Zr : Ljava/lang/Object;
    //   598: checkcast java/math/BigInteger
    //   601: invokevirtual toByteArray : ()[B
    //   604: astore_3
    //   605: new java/lang/StringBuilder
    //   608: dup
    //   609: invokespecial <init> : ()V
    //   612: astore #5
    //   614: aload #5
    //   616: sipush #19087
    //   619: sipush #-26503
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
    //   672: sipush #19080
    //   675: sipush #4760
    //   678: invokestatic a : (II)Ljava/lang/String;
    //   681: ldc ''
    //   683: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   686: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   689: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   692: pop
    //   693: aload #5
    //   695: sipush #19079
    //   698: sipush #-11338
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
    //   1277: sipush #19082
    //   1280: sipush #-17645
    //   1283: invokestatic a : (II)Ljava/lang/String;
    //   1286: iconst_1
    //   1287: ldc burp/Zgny
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
    //   1405: sipush #19076
    //   1408: sipush #-10556
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
    //   1447: sipush #19073
    //   1450: sipush #31068
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
    //   1606: new java/io/ByteArrayOutputStream
    //   1609: dup
    //   1610: invokespecial <init> : ()V
    //   1613: astore_3
    //   1614: getstatic burp/Zkyc.ZK : Ljava/lang/String;
    //   1617: astore #4
    //   1619: iconst_0
    //   1620: istore #5
    //   1622: iload #5
    //   1624: aload #4
    //   1626: invokevirtual length : ()I
    //   1629: if_icmpge -> 1659
    //   1632: aload_3
    //   1633: aload #4
    //   1635: iload #5
    //   1637: iload #5
    //   1639: iconst_2
    //   1640: iadd
    //   1641: invokevirtual substring : (II)Ljava/lang/String;
    //   1644: bipush #16
    //   1646: invokestatic parseInt : (Ljava/lang/String;I)I
    //   1649: invokevirtual write : (I)V
    //   1652: iinc #5, 2
    //   1655: iload_2
    //   1656: ifeq -> 1622
    //   1659: aload_3
    //   1660: invokevirtual toByteArray : ()[B
    //   1663: astore #5
    //   1665: getstatic burp/Zrnu.Zs : Ljava/lang/Object;
    //   1668: checkcast java/math/BigInteger
    //   1671: invokevirtual toByteArray : ()[B
    //   1674: astore #6
    //   1676: sipush #256
    //   1679: newarray byte
    //   1681: astore #8
    //   1683: sipush #256
    //   1686: newarray int
    //   1688: astore #9
    //   1690: sipush #256
    //   1693: newarray int
    //   1695: astore #10
    //   1697: sipush #256
    //   1700: newarray int
    //   1702: astore #11
    //   1704: sipush #256
    //   1707: newarray int
    //   1709: astore #12
    //   1711: bipush #10
    //   1713: newarray int
    //   1715: astore #13
    //   1717: sipush #283
    //   1720: istore #14
    //   1722: iconst_0
    //   1723: istore #16
    //   1725: iload #16
    //   1727: sipush #256
    //   1730: if_icmpge -> 1964
    //   1733: sipush #19072
    //   1736: sipush #561
    //   1739: invokestatic a : (II)Ljava/lang/String;
    //   1742: iload #16
    //   1744: iconst_1
    //   1745: iushr
    //   1746: invokevirtual charAt : (I)C
    //   1749: istore #25
    //   1751: iload #16
    //   1753: iconst_1
    //   1754: iand
    //   1755: ifne -> 1770
    //   1758: iload #25
    //   1760: bipush #8
    //   1762: iushr
    //   1763: goto -> 1772
    //   1766: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1769: athrow
    //   1770: iload #25
    //   1772: i2b
    //   1773: sipush #255
    //   1776: iand
    //   1777: istore #15
    //   1779: iload #16
    //   1781: iconst_1
    //   1782: ishl
    //   1783: istore #17
    //   1785: iload #17
    //   1787: sipush #256
    //   1790: if_icmplt -> 1800
    //   1793: iload #17
    //   1795: iload #14
    //   1797: ixor
    //   1798: istore #17
    //   1800: iload #17
    //   1802: iconst_1
    //   1803: ishl
    //   1804: istore #18
    //   1806: iload #18
    //   1808: sipush #256
    //   1811: if_icmplt -> 1821
    //   1814: iload #18
    //   1816: iload #14
    //   1818: ixor
    //   1819: istore #18
    //   1821: iload #18
    //   1823: iconst_1
    //   1824: ishl
    //   1825: istore #19
    //   1827: iload #19
    //   1829: sipush #256
    //   1832: if_icmplt -> 1842
    //   1835: iload #19
    //   1837: iload #14
    //   1839: ixor
    //   1840: istore #19
    //   1842: iload #19
    //   1844: iload #16
    //   1846: ixor
    //   1847: istore #20
    //   1849: iload #20
    //   1851: iload #17
    //   1853: ixor
    //   1854: istore #21
    //   1856: iload #20
    //   1858: iload #18
    //   1860: ixor
    //   1861: istore #22
    //   1863: iload #19
    //   1865: iload #18
    //   1867: ixor
    //   1868: iload #17
    //   1870: ixor
    //   1871: istore #23
    //   1873: aload #8
    //   1875: iload #16
    //   1877: iload #15
    //   1879: i2b
    //   1880: bastore
    //   1881: aload #9
    //   1883: iload #15
    //   1885: iload #23
    //   1887: bipush #24
    //   1889: ishl
    //   1890: iload #20
    //   1892: bipush #16
    //   1894: ishl
    //   1895: ior
    //   1896: iload #22
    //   1898: bipush #8
    //   1900: ishl
    //   1901: ior
    //   1902: iload #21
    //   1904: ior
    //   1905: dup
    //   1906: istore #24
    //   1908: iastore
    //   1909: aload #10
    //   1911: iload #15
    //   1913: iload #24
    //   1915: bipush #8
    //   1917: iushr
    //   1918: iload #24
    //   1920: bipush #24
    //   1922: ishl
    //   1923: ior
    //   1924: iastore
    //   1925: aload #11
    //   1927: iload #15
    //   1929: iload #24
    //   1931: bipush #16
    //   1933: iushr
    //   1934: iload #24
    //   1936: bipush #16
    //   1938: ishl
    //   1939: ior
    //   1940: iastore
    //   1941: aload #12
    //   1943: iload #15
    //   1945: iload #24
    //   1947: bipush #24
    //   1949: iushr
    //   1950: iload #24
    //   1952: bipush #8
    //   1954: ishl
    //   1955: ior
    //   1956: iastore
    //   1957: iinc #16, 1
    //   1960: iload_2
    //   1961: ifeq -> 1725
    //   1964: iconst_1
    //   1965: istore #25
    //   1967: aload #13
    //   1969: iconst_0
    //   1970: iload #25
    //   1972: bipush #24
    //   1974: ishl
    //   1975: iastore
    //   1976: iconst_1
    //   1977: istore #26
    //   1979: iload #26
    //   1981: bipush #10
    //   1983: if_icmpge -> 2024
    //   1986: iload #25
    //   1988: iconst_1
    //   1989: ishl
    //   1990: istore #25
    //   1992: iload #25
    //   1994: sipush #256
    //   1997: if_icmplt -> 2007
    //   2000: iload #25
    //   2002: iload #14
    //   2004: ixor
    //   2005: istore #25
    //   2007: aload #13
    //   2009: iload #26
    //   2011: iload #25
    //   2013: bipush #24
    //   2015: ishl
    //   2016: iastore
    //   2017: iinc #26, 1
    //   2020: iload_2
    //   2021: ifeq -> 1979
    //   2024: iconst_4
    //   2025: istore #26
    //   2027: iload #26
    //   2029: bipush #6
    //   2031: iadd
    //   2032: istore #27
    //   2034: iconst_4
    //   2035: iload #27
    //   2037: iconst_1
    //   2038: iadd
    //   2039: imul
    //   2040: istore #28
    //   2042: iload #28
    //   2044: newarray int
    //   2046: astore #29
    //   2048: iload #28
    //   2050: newarray int
    //   2052: astore #30
    //   2054: iconst_0
    //   2055: istore #25
    //   2057: iconst_0
    //   2058: istore #32
    //   2060: iconst_0
    //   2061: istore #33
    //   2063: iload #32
    //   2065: iload #26
    //   2067: if_icmpge -> 2135
    //   2070: aload #29
    //   2072: iload #32
    //   2074: aload #5
    //   2076: iload #33
    //   2078: baload
    //   2079: bipush #24
    //   2081: ishl
    //   2082: aload #5
    //   2084: iload #33
    //   2086: iconst_1
    //   2087: iadd
    //   2088: baload
    //   2089: sipush #255
    //   2092: iand
    //   2093: bipush #16
    //   2095: ishl
    //   2096: ior
    //   2097: aload #5
    //   2099: iload #33
    //   2101: iconst_2
    //   2102: iadd
    //   2103: baload
    //   2104: sipush #255
    //   2107: iand
    //   2108: bipush #8
    //   2110: ishl
    //   2111: ior
    //   2112: aload #5
    //   2114: iload #33
    //   2116: iconst_3
    //   2117: iadd
    //   2118: baload
    //   2119: sipush #255
    //   2122: iand
    //   2123: ior
    //   2124: iastore
    //   2125: iinc #32, 1
    //   2128: iinc #33, 4
    //   2131: iload_2
    //   2132: ifeq -> 2063
    //   2135: iload #26
    //   2137: istore #32
    //   2139: iconst_0
    //   2140: istore #33
    //   2142: iload #32
    //   2144: iload #28
    //   2146: if_icmpge -> 2273
    //   2149: aload #29
    //   2151: iload #32
    //   2153: iconst_1
    //   2154: isub
    //   2155: iaload
    //   2156: istore #31
    //   2158: iload #33
    //   2160: ifne -> 2247
    //   2163: iload #26
    //   2165: istore #33
    //   2167: aload #8
    //   2169: iload #31
    //   2171: bipush #16
    //   2173: iushr
    //   2174: sipush #255
    //   2177: iand
    //   2178: baload
    //   2179: bipush #24
    //   2181: ishl
    //   2182: aload #8
    //   2184: iload #31
    //   2186: bipush #8
    //   2188: iushr
    //   2189: sipush #255
    //   2192: iand
    //   2193: baload
    //   2194: sipush #255
    //   2197: iand
    //   2198: bipush #16
    //   2200: ishl
    //   2201: ior
    //   2202: aload #8
    //   2204: iload #31
    //   2206: sipush #255
    //   2209: iand
    //   2210: baload
    //   2211: sipush #255
    //   2214: iand
    //   2215: bipush #8
    //   2217: ishl
    //   2218: ior
    //   2219: aload #8
    //   2221: iload #31
    //   2223: bipush #24
    //   2225: iushr
    //   2226: baload
    //   2227: sipush #255
    //   2230: iand
    //   2231: ior
    //   2232: istore #31
    //   2234: iload #31
    //   2236: aload #13
    //   2238: iload #25
    //   2240: iinc #25, 1
    //   2243: iaload
    //   2244: ixor
    //   2245: istore #31
    //   2247: aload #29
    //   2249: iload #32
    //   2251: aload #29
    //   2253: iload #32
    //   2255: iload #26
    //   2257: isub
    //   2258: iaload
    //   2259: iload #31
    //   2261: ixor
    //   2262: iastore
    //   2263: iinc #32, 1
    //   2266: iinc #33, -1
    //   2269: iload_2
    //   2270: ifeq -> 2142
    //   2273: iconst_0
    //   2274: istore #32
    //   2276: iconst_4
    //   2277: iload #27
    //   2279: imul
    //   2280: istore #33
    //   2282: aload #30
    //   2284: iload #32
    //   2286: aload #29
    //   2288: iload #33
    //   2290: iaload
    //   2291: iastore
    //   2292: aload #30
    //   2294: iload #32
    //   2296: iconst_1
    //   2297: iadd
    //   2298: aload #29
    //   2300: iload #33
    //   2302: iconst_1
    //   2303: iadd
    //   2304: iaload
    //   2305: iastore
    //   2306: aload #30
    //   2308: iload #32
    //   2310: iconst_2
    //   2311: iadd
    //   2312: aload #29
    //   2314: iload #33
    //   2316: iconst_2
    //   2317: iadd
    //   2318: iaload
    //   2319: iastore
    //   2320: aload #30
    //   2322: iload #32
    //   2324: iconst_3
    //   2325: iadd
    //   2326: aload #29
    //   2328: iload #33
    //   2330: iconst_3
    //   2331: iadd
    //   2332: iaload
    //   2333: iastore
    //   2334: iinc #32, 4
    //   2337: iinc #33, -4
    //   2340: iconst_1
    //   2341: istore #35
    //   2343: iload #35
    //   2345: iload #27
    //   2347: if_icmpge -> 2711
    //   2350: aload #29
    //   2352: iload #33
    //   2354: iaload
    //   2355: istore #34
    //   2357: aload #30
    //   2359: iload #32
    //   2361: aload #9
    //   2363: aload #8
    //   2365: iload #34
    //   2367: bipush #24
    //   2369: iushr
    //   2370: baload
    //   2371: sipush #255
    //   2374: iand
    //   2375: iaload
    //   2376: aload #10
    //   2378: aload #8
    //   2380: iload #34
    //   2382: bipush #16
    //   2384: iushr
    //   2385: sipush #255
    //   2388: iand
    //   2389: baload
    //   2390: sipush #255
    //   2393: iand
    //   2394: iaload
    //   2395: ixor
    //   2396: aload #11
    //   2398: aload #8
    //   2400: iload #34
    //   2402: bipush #8
    //   2404: iushr
    //   2405: sipush #255
    //   2408: iand
    //   2409: baload
    //   2410: sipush #255
    //   2413: iand
    //   2414: iaload
    //   2415: ixor
    //   2416: aload #12
    //   2418: aload #8
    //   2420: iload #34
    //   2422: sipush #255
    //   2425: iand
    //   2426: baload
    //   2427: sipush #255
    //   2430: iand
    //   2431: iaload
    //   2432: ixor
    //   2433: iastore
    //   2434: aload #29
    //   2436: iload #33
    //   2438: iconst_1
    //   2439: iadd
    //   2440: iaload
    //   2441: istore #34
    //   2443: aload #30
    //   2445: iload #32
    //   2447: iconst_1
    //   2448: iadd
    //   2449: aload #9
    //   2451: aload #8
    //   2453: iload #34
    //   2455: bipush #24
    //   2457: iushr
    //   2458: baload
    //   2459: sipush #255
    //   2462: iand
    //   2463: iaload
    //   2464: aload #10
    //   2466: aload #8
    //   2468: iload #34
    //   2470: bipush #16
    //   2472: iushr
    //   2473: sipush #255
    //   2476: iand
    //   2477: baload
    //   2478: sipush #255
    //   2481: iand
    //   2482: iaload
    //   2483: ixor
    //   2484: aload #11
    //   2486: aload #8
    //   2488: iload #34
    //   2490: bipush #8
    //   2492: iushr
    //   2493: sipush #255
    //   2496: iand
    //   2497: baload
    //   2498: sipush #255
    //   2501: iand
    //   2502: iaload
    //   2503: ixor
    //   2504: aload #12
    //   2506: aload #8
    //   2508: iload #34
    //   2510: sipush #255
    //   2513: iand
    //   2514: baload
    //   2515: sipush #255
    //   2518: iand
    //   2519: iaload
    //   2520: ixor
    //   2521: iastore
    //   2522: aload #29
    //   2524: iload #33
    //   2526: iconst_2
    //   2527: iadd
    //   2528: iaload
    //   2529: istore #34
    //   2531: aload #30
    //   2533: iload #32
    //   2535: iconst_2
    //   2536: iadd
    //   2537: aload #9
    //   2539: aload #8
    //   2541: iload #34
    //   2543: bipush #24
    //   2545: iushr
    //   2546: baload
    //   2547: sipush #255
    //   2550: iand
    //   2551: iaload
    //   2552: aload #10
    //   2554: aload #8
    //   2556: iload #34
    //   2558: bipush #16
    //   2560: iushr
    //   2561: sipush #255
    //   2564: iand
    //   2565: baload
    //   2566: sipush #255
    //   2569: iand
    //   2570: iaload
    //   2571: ixor
    //   2572: aload #11
    //   2574: aload #8
    //   2576: iload #34
    //   2578: bipush #8
    //   2580: iushr
    //   2581: sipush #255
    //   2584: iand
    //   2585: baload
    //   2586: sipush #255
    //   2589: iand
    //   2590: iaload
    //   2591: ixor
    //   2592: aload #12
    //   2594: aload #8
    //   2596: iload #34
    //   2598: sipush #255
    //   2601: iand
    //   2602: baload
    //   2603: sipush #255
    //   2606: iand
    //   2607: iaload
    //   2608: ixor
    //   2609: iastore
    //   2610: aload #29
    //   2612: iload #33
    //   2614: iconst_3
    //   2615: iadd
    //   2616: iaload
    //   2617: istore #34
    //   2619: aload #30
    //   2621: iload #32
    //   2623: iconst_3
    //   2624: iadd
    //   2625: aload #9
    //   2627: aload #8
    //   2629: iload #34
    //   2631: bipush #24
    //   2633: iushr
    //   2634: baload
    //   2635: sipush #255
    //   2638: iand
    //   2639: iaload
    //   2640: aload #10
    //   2642: aload #8
    //   2644: iload #34
    //   2646: bipush #16
    //   2648: iushr
    //   2649: sipush #255
    //   2652: iand
    //   2653: baload
    //   2654: sipush #255
    //   2657: iand
    //   2658: iaload
    //   2659: ixor
    //   2660: aload #11
    //   2662: aload #8
    //   2664: iload #34
    //   2666: bipush #8
    //   2668: iushr
    //   2669: sipush #255
    //   2672: iand
    //   2673: baload
    //   2674: sipush #255
    //   2677: iand
    //   2678: iaload
    //   2679: ixor
    //   2680: aload #12
    //   2682: aload #8
    //   2684: iload #34
    //   2686: sipush #255
    //   2689: iand
    //   2690: baload
    //   2691: sipush #255
    //   2694: iand
    //   2695: iaload
    //   2696: ixor
    //   2697: iastore
    //   2698: iinc #32, 4
    //   2701: iinc #33, -4
    //   2704: iinc #35, 1
    //   2707: iload_2
    //   2708: ifeq -> 2343
    //   2711: aload #30
    //   2713: iload #32
    //   2715: aload #29
    //   2717: iload #33
    //   2719: iaload
    //   2720: iastore
    //   2721: aload #30
    //   2723: iload #32
    //   2725: iconst_1
    //   2726: iadd
    //   2727: aload #29
    //   2729: iload #33
    //   2731: iconst_1
    //   2732: iadd
    //   2733: iaload
    //   2734: iastore
    //   2735: aload #30
    //   2737: iload #32
    //   2739: iconst_2
    //   2740: iadd
    //   2741: aload #29
    //   2743: iload #33
    //   2745: iconst_2
    //   2746: iadd
    //   2747: iaload
    //   2748: iastore
    //   2749: aload #30
    //   2751: iload #32
    //   2753: iconst_3
    //   2754: iadd
    //   2755: aload #29
    //   2757: iload #33
    //   2759: iconst_3
    //   2760: iadd
    //   2761: iaload
    //   2762: iastore
    //   2763: iconst_0
    //   2764: newarray byte
    //   2766: astore #35
    //   2768: aload #6
    //   2770: arraylength
    //   2771: bipush #16
    //   2773: irem
    //   2774: ifeq -> 2798
    //   2777: new java/lang/Exception
    //   2780: dup
    //   2781: sipush #19084
    //   2784: sipush #22388
    //   2787: invokestatic a : (II)Ljava/lang/String;
    //   2790: invokespecial <init> : (Ljava/lang/String;)V
    //   2793: athrow
    //   2794: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2797: athrow
    //   2798: bipush #10
    //   2800: istore #36
    //   2802: sipush #19077
    //   2805: sipush #256
    //   2808: newarray byte
    //   2810: astore #37
    //   2812: sipush #26151
    //   2815: sipush #256
    //   2818: newarray int
    //   2820: astore #38
    //   2822: sipush #256
    //   2825: newarray int
    //   2827: astore #39
    //   2829: sipush #256
    //   2832: newarray int
    //   2834: astore #40
    //   2836: sipush #256
    //   2839: newarray int
    //   2841: astore #41
    //   2843: sipush #283
    //   2846: istore #14
    //   2848: invokestatic a : (II)Ljava/lang/String;
    //   2851: astore #42
    //   2853: iconst_0
    //   2854: istore #16
    //   2856: iload #16
    //   2858: sipush #256
    //   2861: if_icmpge -> 3088
    //   2864: aload #42
    //   2866: iload #16
    //   2868: iconst_1
    //   2869: iushr
    //   2870: invokevirtual charAt : (I)C
    //   2873: istore #43
    //   2875: iload #16
    //   2877: iconst_1
    //   2878: iand
    //   2879: ifne -> 2894
    //   2882: iload #43
    //   2884: bipush #8
    //   2886: iushr
    //   2887: goto -> 2896
    //   2890: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2893: athrow
    //   2894: iload #43
    //   2896: i2b
    //   2897: sipush #255
    //   2900: iand
    //   2901: istore #15
    //   2903: iload #16
    //   2905: iconst_1
    //   2906: ishl
    //   2907: istore #17
    //   2909: iload #17
    //   2911: sipush #256
    //   2914: if_icmplt -> 2924
    //   2917: iload #17
    //   2919: iload #14
    //   2921: ixor
    //   2922: istore #17
    //   2924: iload #17
    //   2926: iconst_1
    //   2927: ishl
    //   2928: istore #18
    //   2930: iload #18
    //   2932: sipush #256
    //   2935: if_icmplt -> 2945
    //   2938: iload #18
    //   2940: iload #14
    //   2942: ixor
    //   2943: istore #18
    //   2945: iload #18
    //   2947: iconst_1
    //   2948: ishl
    //   2949: istore #19
    //   2951: iload #19
    //   2953: sipush #256
    //   2956: if_icmplt -> 2966
    //   2959: iload #19
    //   2961: iload #14
    //   2963: ixor
    //   2964: istore #19
    //   2966: iload #19
    //   2968: iload #16
    //   2970: ixor
    //   2971: istore #20
    //   2973: iload #20
    //   2975: iload #17
    //   2977: ixor
    //   2978: istore #21
    //   2980: iload #20
    //   2982: iload #18
    //   2984: ixor
    //   2985: istore #22
    //   2987: iload #19
    //   2989: iload #18
    //   2991: ixor
    //   2992: iload #17
    //   2994: ixor
    //   2995: istore #23
    //   2997: aload #37
    //   2999: iload #15
    //   3001: iload #16
    //   3003: i2b
    //   3004: bastore
    //   3005: aload #38
    //   3007: iload #15
    //   3009: iload #23
    //   3011: bipush #24
    //   3013: ishl
    //   3014: iload #20
    //   3016: bipush #16
    //   3018: ishl
    //   3019: ior
    //   3020: iload #22
    //   3022: bipush #8
    //   3024: ishl
    //   3025: ior
    //   3026: iload #21
    //   3028: ior
    //   3029: dup
    //   3030: istore #24
    //   3032: iastore
    //   3033: aload #39
    //   3035: iload #15
    //   3037: iload #24
    //   3039: bipush #8
    //   3041: iushr
    //   3042: iload #24
    //   3044: bipush #24
    //   3046: ishl
    //   3047: ior
    //   3048: iastore
    //   3049: aload #40
    //   3051: iload #15
    //   3053: iload #24
    //   3055: bipush #16
    //   3057: iushr
    //   3058: iload #24
    //   3060: bipush #16
    //   3062: ishl
    //   3063: ior
    //   3064: iastore
    //   3065: aload #41
    //   3067: iload #15
    //   3069: iload #24
    //   3071: bipush #24
    //   3073: iushr
    //   3074: iload #24
    //   3076: bipush #8
    //   3078: ishl
    //   3079: ior
    //   3080: iastore
    //   3081: iinc #16, 1
    //   3084: iload_2
    //   3085: ifeq -> 2856
    //   3088: aload #6
    //   3090: arraylength
    //   3091: newarray byte
    //   3093: astore #43
    //   3095: iconst_0
    //   3096: istore #44
    //   3098: iload #44
    //   3100: aload #6
    //   3102: arraylength
    //   3103: bipush #16
    //   3105: idiv
    //   3106: if_icmpge -> 4020
    //   3109: bipush #16
    //   3111: newarray byte
    //   3113: astore #45
    //   3115: bipush #16
    //   3117: newarray byte
    //   3119: astore #46
    //   3121: iconst_0
    //   3122: istore #47
    //   3124: iload #47
    //   3126: bipush #16
    //   3128: if_icmpge -> 3154
    //   3131: aload #45
    //   3133: iload #47
    //   3135: aload #6
    //   3137: iload #47
    //   3139: iload #44
    //   3141: bipush #16
    //   3143: imul
    //   3144: iadd
    //   3145: baload
    //   3146: bastore
    //   3147: iinc #47, 1
    //   3150: iload_2
    //   3151: ifeq -> 3124
    //   3154: iconst_0
    //   3155: istore #47
    //   3157: aload #45
    //   3159: iconst_0
    //   3160: baload
    //   3161: bipush #24
    //   3163: ishl
    //   3164: aload #45
    //   3166: iconst_1
    //   3167: baload
    //   3168: sipush #255
    //   3171: iand
    //   3172: bipush #16
    //   3174: ishl
    //   3175: ior
    //   3176: aload #45
    //   3178: iconst_2
    //   3179: baload
    //   3180: sipush #255
    //   3183: iand
    //   3184: bipush #8
    //   3186: ishl
    //   3187: ior
    //   3188: aload #45
    //   3190: iconst_3
    //   3191: baload
    //   3192: sipush #255
    //   3195: iand
    //   3196: ior
    //   3197: aload #30
    //   3199: iconst_0
    //   3200: iaload
    //   3201: ixor
    //   3202: istore #49
    //   3204: aload #45
    //   3206: iconst_4
    //   3207: baload
    //   3208: bipush #24
    //   3210: ishl
    //   3211: aload #45
    //   3213: iconst_5
    //   3214: baload
    //   3215: sipush #255
    //   3218: iand
    //   3219: bipush #16
    //   3221: ishl
    //   3222: ior
    //   3223: aload #45
    //   3225: bipush #6
    //   3227: baload
    //   3228: sipush #255
    //   3231: iand
    //   3232: bipush #8
    //   3234: ishl
    //   3235: ior
    //   3236: aload #45
    //   3238: bipush #7
    //   3240: baload
    //   3241: sipush #255
    //   3244: iand
    //   3245: ior
    //   3246: aload #30
    //   3248: iconst_1
    //   3249: iaload
    //   3250: ixor
    //   3251: istore #50
    //   3253: aload #45
    //   3255: bipush #8
    //   3257: baload
    //   3258: bipush #24
    //   3260: ishl
    //   3261: aload #45
    //   3263: bipush #9
    //   3265: baload
    //   3266: sipush #255
    //   3269: iand
    //   3270: bipush #16
    //   3272: ishl
    //   3273: ior
    //   3274: aload #45
    //   3276: bipush #10
    //   3278: baload
    //   3279: sipush #255
    //   3282: iand
    //   3283: bipush #8
    //   3285: ishl
    //   3286: ior
    //   3287: aload #45
    //   3289: bipush #11
    //   3291: baload
    //   3292: sipush #255
    //   3295: iand
    //   3296: ior
    //   3297: aload #30
    //   3299: iconst_2
    //   3300: iaload
    //   3301: ixor
    //   3302: istore #51
    //   3304: aload #45
    //   3306: bipush #12
    //   3308: baload
    //   3309: bipush #24
    //   3311: ishl
    //   3312: aload #45
    //   3314: bipush #13
    //   3316: baload
    //   3317: sipush #255
    //   3320: iand
    //   3321: bipush #16
    //   3323: ishl
    //   3324: ior
    //   3325: aload #45
    //   3327: bipush #14
    //   3329: baload
    //   3330: sipush #255
    //   3333: iand
    //   3334: bipush #8
    //   3336: ishl
    //   3337: ior
    //   3338: aload #45
    //   3340: bipush #15
    //   3342: baload
    //   3343: sipush #255
    //   3346: iand
    //   3347: ior
    //   3348: aload #30
    //   3350: iconst_3
    //   3351: iaload
    //   3352: ixor
    //   3353: istore #52
    //   3355: iconst_1
    //   3356: istore #53
    //   3358: iload #53
    //   3360: iload #36
    //   3362: if_icmpge -> 3605
    //   3365: iinc #47, 4
    //   3368: aload #38
    //   3370: iload #49
    //   3372: bipush #24
    //   3374: iushr
    //   3375: iaload
    //   3376: aload #39
    //   3378: iload #52
    //   3380: bipush #16
    //   3382: iushr
    //   3383: sipush #255
    //   3386: iand
    //   3387: iaload
    //   3388: ixor
    //   3389: aload #40
    //   3391: iload #51
    //   3393: bipush #8
    //   3395: iushr
    //   3396: sipush #255
    //   3399: iand
    //   3400: iaload
    //   3401: ixor
    //   3402: aload #41
    //   3404: iload #50
    //   3406: sipush #255
    //   3409: iand
    //   3410: iaload
    //   3411: ixor
    //   3412: aload #30
    //   3414: iload #47
    //   3416: iaload
    //   3417: ixor
    //   3418: istore #54
    //   3420: aload #38
    //   3422: iload #50
    //   3424: bipush #24
    //   3426: iushr
    //   3427: iaload
    //   3428: aload #39
    //   3430: iload #49
    //   3432: bipush #16
    //   3434: iushr
    //   3435: sipush #255
    //   3438: iand
    //   3439: iaload
    //   3440: ixor
    //   3441: aload #40
    //   3443: iload #52
    //   3445: bipush #8
    //   3447: iushr
    //   3448: sipush #255
    //   3451: iand
    //   3452: iaload
    //   3453: ixor
    //   3454: aload #41
    //   3456: iload #51
    //   3458: sipush #255
    //   3461: iand
    //   3462: iaload
    //   3463: ixor
    //   3464: aload #30
    //   3466: iload #47
    //   3468: iconst_1
    //   3469: iadd
    //   3470: iaload
    //   3471: ixor
    //   3472: istore #55
    //   3474: aload #38
    //   3476: iload #51
    //   3478: bipush #24
    //   3480: iushr
    //   3481: iaload
    //   3482: aload #39
    //   3484: iload #50
    //   3486: bipush #16
    //   3488: iushr
    //   3489: sipush #255
    //   3492: iand
    //   3493: iaload
    //   3494: ixor
    //   3495: aload #40
    //   3497: iload #49
    //   3499: bipush #8
    //   3501: iushr
    //   3502: sipush #255
    //   3505: iand
    //   3506: iaload
    //   3507: ixor
    //   3508: aload #41
    //   3510: iload #52
    //   3512: sipush #255
    //   3515: iand
    //   3516: iaload
    //   3517: ixor
    //   3518: aload #30
    //   3520: iload #47
    //   3522: iconst_2
    //   3523: iadd
    //   3524: iaload
    //   3525: ixor
    //   3526: istore #56
    //   3528: aload #38
    //   3530: iload #52
    //   3532: bipush #24
    //   3534: iushr
    //   3535: iaload
    //   3536: aload #39
    //   3538: iload #51
    //   3540: bipush #16
    //   3542: iushr
    //   3543: sipush #255
    //   3546: iand
    //   3547: iaload
    //   3548: ixor
    //   3549: aload #40
    //   3551: iload #50
    //   3553: bipush #8
    //   3555: iushr
    //   3556: sipush #255
    //   3559: iand
    //   3560: iaload
    //   3561: ixor
    //   3562: aload #41
    //   3564: iload #49
    //   3566: sipush #255
    //   3569: iand
    //   3570: iaload
    //   3571: ixor
    //   3572: aload #30
    //   3574: iload #47
    //   3576: iconst_3
    //   3577: iadd
    //   3578: iaload
    //   3579: ixor
    //   3580: istore #57
    //   3582: iload #54
    //   3584: istore #49
    //   3586: iload #55
    //   3588: istore #50
    //   3590: iload #56
    //   3592: istore #51
    //   3594: iload #57
    //   3596: istore #52
    //   3598: iinc #53, 1
    //   3601: iload_2
    //   3602: ifeq -> 3358
    //   3605: iinc #47, 4
    //   3608: aload #30
    //   3610: iload #47
    //   3612: iaload
    //   3613: istore #48
    //   3615: aload #46
    //   3617: iconst_0
    //   3618: aload #37
    //   3620: iload #49
    //   3622: bipush #24
    //   3624: iushr
    //   3625: baload
    //   3626: iload #48
    //   3628: bipush #24
    //   3630: iushr
    //   3631: ixor
    //   3632: i2b
    //   3633: bastore
    //   3634: aload #46
    //   3636: iconst_1
    //   3637: aload #37
    //   3639: iload #52
    //   3641: bipush #16
    //   3643: iushr
    //   3644: sipush #255
    //   3647: iand
    //   3648: baload
    //   3649: iload #48
    //   3651: bipush #16
    //   3653: iushr
    //   3654: ixor
    //   3655: i2b
    //   3656: bastore
    //   3657: aload #46
    //   3659: iconst_2
    //   3660: aload #37
    //   3662: iload #51
    //   3664: bipush #8
    //   3666: iushr
    //   3667: sipush #255
    //   3670: iand
    //   3671: baload
    //   3672: iload #48
    //   3674: bipush #8
    //   3676: iushr
    //   3677: ixor
    //   3678: i2b
    //   3679: bastore
    //   3680: aload #46
    //   3682: iconst_3
    //   3683: aload #37
    //   3685: iload #50
    //   3687: sipush #255
    //   3690: iand
    //   3691: baload
    //   3692: iload #48
    //   3694: ixor
    //   3695: i2b
    //   3696: bastore
    //   3697: aload #30
    //   3699: iload #47
    //   3701: iconst_1
    //   3702: iadd
    //   3703: iaload
    //   3704: istore #48
    //   3706: aload #46
    //   3708: iconst_4
    //   3709: aload #37
    //   3711: iload #50
    //   3713: bipush #24
    //   3715: iushr
    //   3716: baload
    //   3717: iload #48
    //   3719: bipush #24
    //   3721: iushr
    //   3722: ixor
    //   3723: i2b
    //   3724: bastore
    //   3725: aload #46
    //   3727: iconst_5
    //   3728: aload #37
    //   3730: iload #49
    //   3732: bipush #16
    //   3734: iushr
    //   3735: sipush #255
    //   3738: iand
    //   3739: baload
    //   3740: iload #48
    //   3742: bipush #16
    //   3744: iushr
    //   3745: ixor
    //   3746: i2b
    //   3747: bastore
    //   3748: aload #46
    //   3750: bipush #6
    //   3752: aload #37
    //   3754: iload #52
    //   3756: bipush #8
    //   3758: iushr
    //   3759: sipush #255
    //   3762: iand
    //   3763: baload
    //   3764: iload #48
    //   3766: bipush #8
    //   3768: iushr
    //   3769: ixor
    //   3770: i2b
    //   3771: bastore
    //   3772: aload #46
    //   3774: bipush #7
    //   3776: aload #37
    //   3778: iload #51
    //   3780: sipush #255
    //   3783: iand
    //   3784: baload
    //   3785: iload #48
    //   3787: ixor
    //   3788: i2b
    //   3789: bastore
    //   3790: aload #30
    //   3792: iload #47
    //   3794: iconst_2
    //   3795: iadd
    //   3796: iaload
    //   3797: istore #48
    //   3799: aload #46
    //   3801: bipush #8
    //   3803: aload #37
    //   3805: iload #51
    //   3807: bipush #24
    //   3809: iushr
    //   3810: baload
    //   3811: iload #48
    //   3813: bipush #24
    //   3815: iushr
    //   3816: ixor
    //   3817: i2b
    //   3818: bastore
    //   3819: aload #46
    //   3821: bipush #9
    //   3823: aload #37
    //   3825: iload #50
    //   3827: bipush #16
    //   3829: iushr
    //   3830: sipush #255
    //   3833: iand
    //   3834: baload
    //   3835: iload #48
    //   3837: bipush #16
    //   3839: iushr
    //   3840: ixor
    //   3841: i2b
    //   3842: bastore
    //   3843: aload #46
    //   3845: bipush #10
    //   3847: aload #37
    //   3849: iload #49
    //   3851: bipush #8
    //   3853: iushr
    //   3854: sipush #255
    //   3857: iand
    //   3858: baload
    //   3859: iload #48
    //   3861: bipush #8
    //   3863: iushr
    //   3864: ixor
    //   3865: i2b
    //   3866: bastore
    //   3867: aload #46
    //   3869: bipush #11
    //   3871: aload #37
    //   3873: iload #52
    //   3875: sipush #255
    //   3878: iand
    //   3879: baload
    //   3880: iload #48
    //   3882: ixor
    //   3883: i2b
    //   3884: bastore
    //   3885: aload #30
    //   3887: iload #47
    //   3889: iconst_3
    //   3890: iadd
    //   3891: iaload
    //   3892: istore #48
    //   3894: aload #46
    //   3896: bipush #12
    //   3898: aload #37
    //   3900: iload #52
    //   3902: bipush #24
    //   3904: iushr
    //   3905: baload
    //   3906: iload #48
    //   3908: bipush #24
    //   3910: iushr
    //   3911: ixor
    //   3912: i2b
    //   3913: bastore
    //   3914: aload #46
    //   3916: bipush #13
    //   3918: aload #37
    //   3920: iload #51
    //   3922: bipush #16
    //   3924: iushr
    //   3925: sipush #255
    //   3928: iand
    //   3929: baload
    //   3930: iload #48
    //   3932: bipush #16
    //   3934: iushr
    //   3935: ixor
    //   3936: i2b
    //   3937: bastore
    //   3938: aload #46
    //   3940: bipush #14
    //   3942: aload #37
    //   3944: iload #50
    //   3946: bipush #8
    //   3948: iushr
    //   3949: sipush #255
    //   3952: iand
    //   3953: baload
    //   3954: iload #48
    //   3956: bipush #8
    //   3958: iushr
    //   3959: ixor
    //   3960: i2b
    //   3961: bastore
    //   3962: aload #46
    //   3964: bipush #15
    //   3966: aload #37
    //   3968: iload #49
    //   3970: sipush #255
    //   3973: iand
    //   3974: baload
    //   3975: iload #48
    //   3977: ixor
    //   3978: i2b
    //   3979: bastore
    //   3980: iconst_0
    //   3981: istore #53
    //   3983: iload #53
    //   3985: bipush #16
    //   3987: if_icmpge -> 4013
    //   3990: aload #43
    //   3992: iload #53
    //   3994: iload #44
    //   3996: bipush #16
    //   3998: imul
    //   3999: iadd
    //   4000: aload #46
    //   4002: iload #53
    //   4004: baload
    //   4005: bastore
    //   4006: iinc #53, 1
    //   4009: iload_2
    //   4010: ifeq -> 3983
    //   4013: iinc #44, 1
    //   4016: iload_2
    //   4017: ifeq -> 3098
    //   4020: aload #43
    //   4022: arraylength
    //   4023: ifle -> 4104
    //   4026: aload #43
    //   4028: aload #43
    //   4030: arraylength
    //   4031: iconst_1
    //   4032: isub
    //   4033: baload
    //   4034: istore #44
    //   4036: iload #44
    //   4038: bipush #16
    //   4040: if_icmple -> 4051
    //   4043: aload #43
    //   4045: astore #35
    //   4047: iload_2
    //   4048: ifeq -> 4104
    //   4051: aload #43
    //   4053: arraylength
    //   4054: iload #44
    //   4056: isub
    //   4057: newarray byte
    //   4059: astore #35
    //   4061: iconst_0
    //   4062: istore #45
    //   4064: iload #45
    //   4066: aload #35
    //   4068: arraylength
    //   4069: if_icmpge -> 4104
    //   4072: iload #45
    //   4074: aload #43
    //   4076: arraylength
    //   4077: if_icmpge -> 4104
    //   4080: aload #35
    //   4082: iload #45
    //   4084: aload #43
    //   4086: iload #45
    //   4088: baload
    //   4089: bastore
    //   4090: iinc #45, 1
    //   4093: iload_2
    //   4094: ifeq -> 4064
    //   4097: goto -> 4104
    //   4100: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4103: athrow
    //   4104: aload #35
    //   4106: astore #7
    //   4108: getstatic burp/Zxso.ZH : Ljava/lang/String;
    //   4111: getstatic burp/Zsde.Zx : Ljava/lang/Object;
    //   4114: checkcast java/math/BigInteger
    //   4117: invokevirtual intValue : ()I
    //   4120: bipush #32
    //   4122: irem
    //   4123: invokestatic abs : (I)I
    //   4126: invokevirtual charAt : (I)C
    //   4129: getstatic burp/Zg99.ZH : Ljava/lang/String;
    //   4132: getstatic burp/Zg7p.Zb : Ljava/lang/Object;
    //   4135: checkcast java/math/BigInteger
    //   4138: invokevirtual intValue : ()I
    //   4141: bipush #32
    //   4143: irem
    //   4144: invokestatic abs : (I)I
    //   4147: invokevirtual charAt : (I)C
    //   4150: if_icmple -> 4257
    //   4153: getstatic burp/Zl_u.Zc : Ljava/lang/String;
    //   4156: getstatic burp/Zg0j.ZV : Ljava/lang/Object;
    //   4159: checkcast java/math/BigInteger
    //   4162: invokevirtual intValue : ()I
    //   4165: bipush #32
    //   4167: irem
    //   4168: invokestatic abs : (I)I
    //   4171: invokevirtual charAt : (I)C
    //   4174: getstatic burp/Ze3j.ZI : Ljava/lang/String;
    //   4177: getstatic burp/Zgw0.ZM : Ljava/lang/Object;
    //   4180: checkcast java/math/BigInteger
    //   4183: invokevirtual intValue : ()I
    //   4186: bipush #32
    //   4188: irem
    //   4189: invokestatic abs : (I)I
    //   4192: invokevirtual charAt : (I)C
    //   4195: if_icmpgt -> 4257
    //   4198: goto -> 4205
    //   4201: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4204: athrow
    //   4205: getstatic burp/Zb8v.Zo : Ljava/lang/String;
    //   4208: getstatic burp/Zkbf.Zx : Ljava/lang/Object;
    //   4211: checkcast java/math/BigInteger
    //   4214: invokevirtual intValue : ()I
    //   4217: bipush #32
    //   4219: irem
    //   4220: invokestatic abs : (I)I
    //   4223: invokevirtual charAt : (I)C
    //   4226: getstatic burp/Zg7z.Zf : Ljava/lang/String;
    //   4229: getstatic burp/Zzip.ZW : Ljava/lang/Object;
    //   4232: checkcast java/math/BigInteger
    //   4235: invokevirtual intValue : ()I
    //   4238: bipush #32
    //   4240: irem
    //   4241: invokestatic abs : (I)I
    //   4244: invokevirtual charAt : (I)C
    //   4247: if_icmpgt -> 4265
    //   4250: goto -> 4257
    //   4253: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4256: athrow
    //   4257: iconst_1
    //   4258: goto -> 4266
    //   4261: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4264: athrow
    //   4265: iconst_0
    //   4266: ireturn
    //   4267: astore_3
    //   4268: new java/lang/Exception
    //   4271: dup
    //   4272: aload_3
    //   4273: invokevirtual getMessage : ()Ljava/lang/String;
    //   4276: invokespecial <init> : (Ljava/lang/String;)V
    //   4279: athrow
    // Exception table:
    //   from	to	target	type
    //   4	4266	4267	java/lang/Throwable
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
    //   1751	1766	1766	java/lang/Throwable
    //   2768	2794	2794	java/lang/Throwable
    //   2875	2890	2890	java/lang/Throwable
    //   4072	4097	4100	java/lang/Throwable
    //   4108	4198	4201	java/lang/Throwable
    //   4153	4250	4253	java/lang/Throwable
    //   4205	4261	4261	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #15
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ipO[r7ÁVCbüUÐ4ã?®é¿&æ\\nñ¶Wó[î\[K±hA\\nA#"ãr{¥årHÜrû«ð0ñøè=þ[ä~Ch¡«÷M¥c|\\rAN'\\r¦T%h¹£¶I­-\ïlZþ°:捁眩濘〼柅ﺴꭦ쪋줗𥳐䜮귴ꉁ鲒爀랁鏒㚣㓌燢ㅿѴ⍵᢯Պ݅胐닽খ⳶ᮊ嫁剻혡⧼⾋卙M⃚널櫭븧䪭墽큚ꪜ䎦㎌䗥ȵ僎齛儧䃫銰㣚뱠?ၖ쵴Ꮊ徸䓟쑝绶摃ᦅ态佝≕郬䛮룶?஍㫵䦃⑬슃겊酒㟶趨乑沞攙긙뫦◁ᳫ뒧瓙䮬诅灤뗣䣄懢址蚆ᷝ顕槆踡鯊蝃츔⢅豮覇뾒䋚䅹ⷴ뀷믔\\tþO.¬PG\\tû´=["\\tûßRò:¸Ò2Ý揔着濵な杠ﹾꯒ쫒즁﫽䟼궑ꈛ鰾牋뜔鎻㘑㒚焨㇋Э⏣ᢄ֘ܠ肊늶ःⲟᬸ嫬刭횄⤶⼿匀Û⃱뇂檈빽䨁壶탏ꫵ䌔㎡䖳ʐ倄鿯兾䁽銛㠈밅?ჺ췡Ꮣ弊䓲쐋繓撉ᤱ恘俋≾逾䚋뢬?ெ㪜䤱⑁싕갯醘㝠趃亃泻斵깒멳▨᱙뒊瑼䭦譱瀽땵䣯憇圚蘪ᶖ頼楴踌鮜蟦컞⠱谷褑뾹䈈䄜ⶮ낛뮟\\t+Ä'OF|\\tà¡^³7ÚªÜ`Ö¾³öM&ïXä¦¾T õÓüP§ü\ZÁ*JæNsÐÒ§>Z©ÈrèØjåu\\b¿7ê"}vÉÄQùîje©â·ÿµ.j!ï«0 Ûv¤'h¿;²oßQðîg##V´L%`i@'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #32
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #27
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
    //   68: ldc 'uÆ_\\t%4ÅÆx|¦mGà'Æôw«³Þ<hSÔrMÖ¶0¦K9øÿÿ7I-'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #32
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #120
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
    //   129: putstatic burp/Ztnw.a : [Ljava/lang/String;
    //   132: bipush #15
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Ztnw.b : [Ljava/lang/String;
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
    //   212: bipush #81
    //   214: goto -> 243
    //   217: iconst_1
    //   218: goto -> 243
    //   221: bipush #76
    //   223: goto -> 243
    //   226: bipush #116
    //   228: goto -> 243
    //   231: bipush #31
    //   233: goto -> 243
    //   236: bipush #126
    //   238: goto -> 243
    //   241: bipush #94
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
    //   304: sipush #19075
    //   307: sipush #7594
    //   310: invokestatic a : (II)Ljava/lang/String;
    //   313: invokespecial <init> : (Ljava/lang/String;)V
    //   316: putstatic burp/Ztnw.Zt : Ljava/lang/Object;
    //   319: sipush #19086
    //   322: sipush #-2680
    //   325: invokestatic a : (II)Ljava/lang/String;
    //   328: putstatic burp/Ztnw.Zr : Ljava/lang/String;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x4A82) & 0xFFFF;
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
      byte b1 = 33;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztnw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */