package burp;

import java.math.BigInteger;

class Ze6t extends ClassLoader {
  static Object Zu;
  
  static String ZR;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZK(Object paramObject) {
    Zrqd.Zk = a(-24504, -15553);
    Zrqd.Zi = new BigInteger(a(-24500, -13816));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zgk1.Zv.charAt(Math.abs(((BigInteger)Zgh3.ZZ).intValue() % 32)) > Zxz_.Zb.charAt(Math.abs(((BigInteger)Zs4v.ZB).intValue() % 32))) {
          try {
            Zl55.Zv(Class.forName(a(-24497, -23740)));
            if (!bool)
              Zl22.Zd(Class.forName(a(-24499, -14))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zl22.Zd(Class.forName(a(-24499, -14)));
    } catch (Throwable throwable) {}
  }
  
  static void Zt(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean Zq(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zgb9.Zb : Ljava/lang/Object;
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
    //   78: ifne -> 34
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
    //   206: ifne -> 271
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
    //   429: ifne -> 178
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
    //   471: ifne -> 147
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
    //   555: ifne -> 513
    //   558: aload #14
    //   560: astore #4
    //   562: new java/math/BigInteger
    //   565: dup
    //   566: aload #4
    //   568: invokespecial <init> : ([B)V
    //   571: invokevirtual abs : ()Ljava/math/BigInteger;
    //   574: putstatic burp/Zsvh.Zv : Ljava/lang/Object;
    //   577: getstatic burp/Ztvn.Zl : Ljava/lang/Object;
    //   580: checkcast java/math/BigInteger
    //   583: getstatic burp/Zkup.Zf : Ljava/lang/Object;
    //   586: checkcast java/math/BigInteger
    //   589: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   592: putstatic burp/Zkor.Ze : Ljava/lang/Object;
    //   595: getstatic burp/Zlqy.ZP : Ljava/lang/Object;
    //   598: checkcast java/math/BigInteger
    //   601: invokevirtual toByteArray : ()[B
    //   604: astore_3
    //   605: aload_3
    //   606: arraylength
    //   607: bipush #8
    //   609: iadd
    //   610: bipush #6
    //   612: ishr
    //   613: iconst_1
    //   614: iadd
    //   615: bipush #16
    //   617: imul
    //   618: newarray int
    //   620: astore #5
    //   622: iconst_0
    //   623: istore #6
    //   625: iload #6
    //   627: aload_3
    //   628: arraylength
    //   629: if_icmpge -> 672
    //   632: aload_3
    //   633: iload #6
    //   635: baload
    //   636: sipush #255
    //   639: iand
    //   640: istore #7
    //   642: aload #5
    //   644: iload #6
    //   646: iconst_2
    //   647: ishr
    //   648: dup2
    //   649: iaload
    //   650: iload #7
    //   652: bipush #24
    //   654: iload #6
    //   656: iconst_4
    //   657: irem
    //   658: bipush #8
    //   660: imul
    //   661: isub
    //   662: ishl
    //   663: ior
    //   664: iastore
    //   665: iinc #6, 1
    //   668: iload_2
    //   669: ifne -> 625
    //   672: aload #5
    //   674: iload #6
    //   676: iconst_2
    //   677: ishr
    //   678: dup2
    //   679: iaload
    //   680: sipush #128
    //   683: bipush #24
    //   685: iload #6
    //   687: iconst_4
    //   688: irem
    //   689: bipush #8
    //   691: imul
    //   692: isub
    //   693: ishl
    //   694: ior
    //   695: iastore
    //   696: aload #5
    //   698: aload #5
    //   700: arraylength
    //   701: iconst_1
    //   702: isub
    //   703: aload_3
    //   704: arraylength
    //   705: bipush #8
    //   707: imul
    //   708: iastore
    //   709: bipush #80
    //   711: newarray int
    //   713: astore #7
    //   715: ldc 1732584193
    //   717: istore #8
    //   719: ldc -271733879
    //   721: istore #9
    //   723: ldc -1732584194
    //   725: istore #10
    //   727: ldc 271733878
    //   729: istore #11
    //   731: ldc -1009589776
    //   733: istore #12
    //   735: iconst_0
    //   736: istore #6
    //   738: iload #6
    //   740: aload #5
    //   742: arraylength
    //   743: if_icmpge -> 1065
    //   746: iload #8
    //   748: istore #13
    //   750: iload #9
    //   752: istore #14
    //   754: iload #10
    //   756: istore #15
    //   758: iload #11
    //   760: istore #16
    //   762: iload #12
    //   764: istore #17
    //   766: iconst_0
    //   767: istore #18
    //   769: iload #18
    //   771: bipush #80
    //   773: if_icmpge -> 1023
    //   776: iload #18
    //   778: bipush #16
    //   780: if_icmpge -> 807
    //   783: aload #7
    //   785: iload #18
    //   787: aload #5
    //   789: iload #6
    //   791: iload #18
    //   793: iadd
    //   794: iaload
    //   795: iastore
    //   796: iload_2
    //   797: ifne -> 862
    //   800: goto -> 807
    //   803: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   806: athrow
    //   807: aload #7
    //   809: iload #18
    //   811: iconst_3
    //   812: isub
    //   813: iaload
    //   814: aload #7
    //   816: iload #18
    //   818: bipush #8
    //   820: isub
    //   821: iaload
    //   822: ixor
    //   823: aload #7
    //   825: iload #18
    //   827: bipush #14
    //   829: isub
    //   830: iaload
    //   831: ixor
    //   832: aload #7
    //   834: iload #18
    //   836: bipush #16
    //   838: isub
    //   839: iaload
    //   840: ixor
    //   841: istore #19
    //   843: iload #19
    //   845: iconst_1
    //   846: ishl
    //   847: iload #19
    //   849: bipush #31
    //   851: iushr
    //   852: ior
    //   853: istore #20
    //   855: aload #7
    //   857: iload #18
    //   859: iload #20
    //   861: iastore
    //   862: iload #8
    //   864: iconst_5
    //   865: ishl
    //   866: iload #8
    //   868: bipush #27
    //   870: iushr
    //   871: ior
    //   872: istore #19
    //   874: iload #19
    //   876: iload #12
    //   878: iadd
    //   879: aload #7
    //   881: iload #18
    //   883: iaload
    //   884: iadd
    //   885: iload #18
    //   887: bipush #20
    //   889: if_icmpge -> 915
    //   892: ldc 1518500249
    //   894: iload #9
    //   896: iload #10
    //   898: iand
    //   899: iload #9
    //   901: iconst_m1
    //   902: ixor
    //   903: iload #11
    //   905: iand
    //   906: ior
    //   907: iadd
    //   908: goto -> 985
    //   911: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   914: athrow
    //   915: iload #18
    //   917: bipush #40
    //   919: if_icmpge -> 940
    //   922: ldc 1859775393
    //   924: iload #9
    //   926: iload #10
    //   928: ixor
    //   929: iload #11
    //   931: ixor
    //   932: iadd
    //   933: goto -> 985
    //   936: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   939: athrow
    //   940: iload #18
    //   942: bipush #60
    //   944: if_icmpge -> 974
    //   947: ldc -1894007588
    //   949: iload #9
    //   951: iload #10
    //   953: iand
    //   954: iload #9
    //   956: iload #11
    //   958: iand
    //   959: ior
    //   960: iload #10
    //   962: iload #11
    //   964: iand
    //   965: ior
    //   966: iadd
    //   967: goto -> 985
    //   970: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   973: athrow
    //   974: ldc -899497514
    //   976: iload #9
    //   978: iload #10
    //   980: ixor
    //   981: iload #11
    //   983: ixor
    //   984: iadd
    //   985: iadd
    //   986: istore #20
    //   988: iload #11
    //   990: istore #12
    //   992: iload #10
    //   994: istore #11
    //   996: iload #9
    //   998: bipush #30
    //   1000: ishl
    //   1001: iload #9
    //   1003: iconst_2
    //   1004: iushr
    //   1005: ior
    //   1006: istore #10
    //   1008: iload #8
    //   1010: istore #9
    //   1012: iload #20
    //   1014: istore #8
    //   1016: iinc #18, 1
    //   1019: iload_2
    //   1020: ifne -> 769
    //   1023: iload #8
    //   1025: iload #13
    //   1027: iadd
    //   1028: istore #8
    //   1030: iload #9
    //   1032: iload #14
    //   1034: iadd
    //   1035: istore #9
    //   1037: iload #10
    //   1039: iload #15
    //   1041: iadd
    //   1042: istore #10
    //   1044: iload #11
    //   1046: iload #16
    //   1048: iadd
    //   1049: istore #11
    //   1051: iload #12
    //   1053: iload #17
    //   1055: iadd
    //   1056: istore #12
    //   1058: iinc #6, 16
    //   1061: iload_2
    //   1062: ifne -> 738
    //   1065: iconst_5
    //   1066: newarray int
    //   1068: dup
    //   1069: iconst_0
    //   1070: iload #8
    //   1072: iastore
    //   1073: dup
    //   1074: iconst_1
    //   1075: iload #9
    //   1077: iastore
    //   1078: dup
    //   1079: iconst_2
    //   1080: iload #10
    //   1082: iastore
    //   1083: dup
    //   1084: iconst_3
    //   1085: iload #11
    //   1087: iastore
    //   1088: dup
    //   1089: iconst_4
    //   1090: iload #12
    //   1092: iastore
    //   1093: astore #13
    //   1095: bipush #20
    //   1097: newarray byte
    //   1099: astore #14
    //   1101: iconst_0
    //   1102: istore #15
    //   1104: iload #15
    //   1106: bipush #20
    //   1108: if_icmpge -> 1149
    //   1111: aload #13
    //   1113: iload #15
    //   1115: iconst_4
    //   1116: idiv
    //   1117: iaload
    //   1118: istore #16
    //   1120: iconst_3
    //   1121: iload #15
    //   1123: iconst_4
    //   1124: irem
    //   1125: isub
    //   1126: bipush #8
    //   1128: imul
    //   1129: istore #17
    //   1131: aload #14
    //   1133: iload #15
    //   1135: iload #16
    //   1137: iload #17
    //   1139: iushr
    //   1140: i2b
    //   1141: bastore
    //   1142: iinc #15, 1
    //   1145: iload_2
    //   1146: ifne -> 1104
    //   1149: aload #14
    //   1151: astore #4
    //   1153: sipush #-24498
    //   1156: new java/math/BigInteger
    //   1159: dup
    //   1160: aload #4
    //   1162: invokespecial <init> : ([B)V
    //   1165: invokevirtual abs : ()Ljava/math/BigInteger;
    //   1168: putstatic burp/Zmpv.ZI : Ljava/lang/Object;
    //   1171: sipush #-19947
    //   1174: invokestatic a : (II)Ljava/lang/String;
    //   1177: iconst_1
    //   1178: ldc burp/Zr_k
    //   1180: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1183: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1186: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1189: astore_3
    //   1190: aload_3
    //   1191: arraylength
    //   1192: istore #4
    //   1194: iconst_0
    //   1195: istore #5
    //   1197: iload #5
    //   1199: iload #4
    //   1201: if_icmpge -> 1338
    //   1204: aload_3
    //   1205: iload #5
    //   1207: aaload
    //   1208: astore #6
    //   1210: aload #6
    //   1212: invokevirtual getModifiers : ()I
    //   1215: invokestatic isStatic : (I)Z
    //   1218: ifne -> 1228
    //   1221: goto -> 1331
    //   1224: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1227: athrow
    //   1228: aload #6
    //   1230: invokevirtual getType : ()Ljava/lang/Class;
    //   1233: astore #7
    //   1235: aload #7
    //   1237: ifnull -> 1318
    //   1240: aload #7
    //   1242: invokevirtual isPrimitive : ()Z
    //   1245: ifne -> 1318
    //   1248: goto -> 1255
    //   1251: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1254: athrow
    //   1255: aload #7
    //   1257: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1260: ifnull -> 1318
    //   1263: goto -> 1270
    //   1266: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1269: athrow
    //   1270: aload #7
    //   1272: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1275: invokevirtual getName : ()Ljava/lang/String;
    //   1278: ifnull -> 1318
    //   1281: goto -> 1288
    //   1284: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1287: athrow
    //   1288: aload #7
    //   1290: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1293: invokevirtual getName : ()Ljava/lang/String;
    //   1296: sipush #-24503
    //   1299: sipush #16793
    //   1302: invokestatic a : (II)Ljava/lang/String;
    //   1305: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1308: ifne -> 1318
    //   1311: goto -> 1318
    //   1314: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1317: athrow
    //   1318: aload #6
    //   1320: iconst_1
    //   1321: invokevirtual setAccessible : (Z)V
    //   1324: aload #6
    //   1326: aconst_null
    //   1327: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1330: pop
    //   1331: iinc #5, 1
    //   1334: iload_2
    //   1335: ifne -> 1197
    //   1338: sipush #-24502
    //   1341: sipush #-29576
    //   1344: invokestatic a : (II)Ljava/lang/String;
    //   1347: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1350: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1353: astore_3
    //   1354: aload_3
    //   1355: arraylength
    //   1356: istore #4
    //   1358: iconst_0
    //   1359: istore #5
    //   1361: iload #5
    //   1363: iload #4
    //   1365: if_icmpge -> 1497
    //   1368: aload_3
    //   1369: iload #5
    //   1371: aaload
    //   1372: astore #6
    //   1374: aload #6
    //   1376: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1379: pop
    //   1380: aload #6
    //   1382: invokevirtual getModifiers : ()I
    //   1385: invokestatic isStatic : (I)Z
    //   1388: ifeq -> 1483
    //   1391: aload #6
    //   1393: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1396: arraylength
    //   1397: iconst_2
    //   1398: if_icmpne -> 1483
    //   1401: goto -> 1408
    //   1404: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1407: athrow
    //   1408: aload #6
    //   1410: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1413: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1416: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1419: ifeq -> 1483
    //   1422: goto -> 1429
    //   1425: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1428: athrow
    //   1429: aload #6
    //   1431: iconst_1
    //   1432: invokevirtual setAccessible : (Z)V
    //   1435: aload #6
    //   1437: aconst_null
    //   1438: iconst_2
    //   1439: anewarray java/lang/Object
    //   1442: dup
    //   1443: iconst_0
    //   1444: aload_0
    //   1445: aastore
    //   1446: dup
    //   1447: iconst_1
    //   1448: aload_1
    //   1449: ifnonnull -> 1467
    //   1452: goto -> 1459
    //   1455: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1458: athrow
    //   1459: aload_1
    //   1460: goto -> 1474
    //   1463: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1466: athrow
    //   1467: aload_1
    //   1468: checkcast [B
    //   1471: invokevirtual clone : ()Ljava/lang/Object;
    //   1474: aastore
    //   1475: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1478: pop
    //   1479: iload_2
    //   1480: ifne -> 1497
    //   1483: iinc #5, 1
    //   1486: iload_2
    //   1487: ifne -> 1361
    //   1490: goto -> 1497
    //   1493: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1496: athrow
    //   1497: getstatic burp/Zlfg.Zb : Ljava/lang/String;
    //   1500: getstatic burp/Zeyd.Zl : Ljava/lang/Object;
    //   1503: checkcast java/math/BigInteger
    //   1506: invokevirtual intValue : ()I
    //   1509: bipush #32
    //   1511: irem
    //   1512: invokestatic abs : (I)I
    //   1515: invokevirtual charAt : (I)C
    //   1518: getstatic burp/Zeyd.Zr : Ljava/lang/String;
    //   1521: getstatic burp/Zssb.ZW : Ljava/lang/Object;
    //   1524: checkcast java/math/BigInteger
    //   1527: invokevirtual intValue : ()I
    //   1530: bipush #32
    //   1532: irem
    //   1533: invokestatic abs : (I)I
    //   1536: invokevirtual charAt : (I)C
    //   1539: if_icmple -> 1646
    //   1542: getstatic burp/Zlfg.Zb : Ljava/lang/String;
    //   1545: getstatic burp/Zxz_.Zv : Ljava/lang/Object;
    //   1548: checkcast java/math/BigInteger
    //   1551: invokevirtual intValue : ()I
    //   1554: bipush #32
    //   1556: irem
    //   1557: invokestatic abs : (I)I
    //   1560: invokevirtual charAt : (I)C
    //   1563: getstatic burp/Zgh3.ZR : Ljava/lang/String;
    //   1566: getstatic burp/Ztvn.Zl : Ljava/lang/Object;
    //   1569: checkcast java/math/BigInteger
    //   1572: invokevirtual intValue : ()I
    //   1575: bipush #32
    //   1577: irem
    //   1578: invokestatic abs : (I)I
    //   1581: invokevirtual charAt : (I)C
    //   1584: if_icmpgt -> 1646
    //   1587: goto -> 1594
    //   1590: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1593: athrow
    //   1594: getstatic burp/Zts_.Zx : Ljava/lang/String;
    //   1597: getstatic burp/Zm6g.ZO : Ljava/lang/Object;
    //   1600: checkcast java/math/BigInteger
    //   1603: invokevirtual intValue : ()I
    //   1606: bipush #32
    //   1608: irem
    //   1609: invokestatic abs : (I)I
    //   1612: invokevirtual charAt : (I)C
    //   1615: getstatic burp/Zb1.Z_ : Ljava/lang/String;
    //   1618: getstatic burp/Zr_w.ZK : Ljava/lang/Object;
    //   1621: checkcast java/math/BigInteger
    //   1624: invokevirtual intValue : ()I
    //   1627: bipush #32
    //   1629: irem
    //   1630: invokestatic abs : (I)I
    //   1633: invokevirtual charAt : (I)C
    //   1636: if_icmple -> 1654
    //   1639: goto -> 1646
    //   1642: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1645: athrow
    //   1646: iconst_1
    //   1647: goto -> 1655
    //   1650: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1653: athrow
    //   1654: iconst_0
    //   1655: ireturn
    //   1656: astore_3
    //   1657: new java/lang/Exception
    //   1660: dup
    //   1661: aload_3
    //   1662: invokevirtual getMessage : ()Ljava/lang/String;
    //   1665: invokespecial <init> : (Ljava/lang/String;)V
    //   1668: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1655	1656	java/lang/Throwable
    //   185	209	212	java/lang/Throwable
    //   283	320	320	java/lang/Throwable
    //   324	345	345	java/lang/Throwable
    //   349	379	379	java/lang/Throwable
    //   776	800	803	java/lang/Throwable
    //   874	911	911	java/lang/Throwable
    //   915	936	936	java/lang/Throwable
    //   940	970	970	java/lang/Throwable
    //   1210	1224	1224	java/lang/Throwable
    //   1235	1248	1251	java/lang/Throwable
    //   1240	1263	1266	java/lang/Throwable
    //   1255	1281	1284	java/lang/Throwable
    //   1270	1311	1314	java/lang/Throwable
    //   1374	1401	1404	java/lang/Throwable
    //   1391	1422	1425	java/lang/Throwable
    //   1408	1452	1455	java/lang/Throwable
    //   1429	1463	1463	java/lang/Throwable
    //   1474	1490	1493	java/lang/Throwable
    //   1497	1587	1590	java/lang/Throwable
    //   1542	1639	1642	java/lang/Throwable
    //   1594	1650	1650	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¸r¸´r¬:Ls¯GÓZ ÃCøMçÝ2t|À\\rè§7¿·Ò÷øÆ/ÝÍ)Ð¤gÍ\\r÷U67 Ú6rKsÌ÷Hû¯åk{T­!£¼$\\tGµ¢LAhÇÕ\\t%`ÁFÂÝ¯Içî· Âq\\f­o1¨{¾'+8¿¨ÌÛ¨C>^À{S ~\\rÂ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #33
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
    //   68: ldc 'G'·­_ÔS½ôT]=\\bÇp+ÓÃõW",\\t¿ë°ßåä'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #32
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #111
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
    //   129: putstatic burp/Ze6t.a : [Ljava/lang/String;
    //   132: bipush #8
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Ze6t.b : [Ljava/lang/String;
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
    //   212: bipush #10
    //   214: goto -> 244
    //   217: bipush #61
    //   219: goto -> 244
    //   222: bipush #125
    //   224: goto -> 244
    //   227: bipush #67
    //   229: goto -> 244
    //   232: bipush #66
    //   234: goto -> 244
    //   237: bipush #92
    //   239: goto -> 244
    //   242: bipush #37
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
    //   304: bipush #32
    //   306: newarray byte
    //   308: dup
    //   309: iconst_0
    //   310: bipush #100
    //   312: bastore
    //   313: dup
    //   314: iconst_1
    //   315: bipush #122
    //   317: bastore
    //   318: dup
    //   319: iconst_2
    //   320: bipush #-25
    //   322: bastore
    //   323: dup
    //   324: iconst_3
    //   325: bipush #-44
    //   327: bastore
    //   328: dup
    //   329: iconst_4
    //   330: bipush #-75
    //   332: bastore
    //   333: dup
    //   334: iconst_5
    //   335: bipush #-88
    //   337: bastore
    //   338: dup
    //   339: bipush #6
    //   341: bipush #-111
    //   343: bastore
    //   344: dup
    //   345: bipush #7
    //   347: bipush #-74
    //   349: bastore
    //   350: dup
    //   351: bipush #8
    //   353: bipush #27
    //   355: bastore
    //   356: dup
    //   357: bipush #9
    //   359: bipush #72
    //   361: bastore
    //   362: dup
    //   363: bipush #10
    //   365: bipush #-97
    //   367: bastore
    //   368: dup
    //   369: bipush #11
    //   371: bipush #-120
    //   373: bastore
    //   374: dup
    //   375: bipush #12
    //   377: bipush #88
    //   379: bastore
    //   380: dup
    //   381: bipush #13
    //   383: bipush #-91
    //   385: bastore
    //   386: dup
    //   387: bipush #14
    //   389: bipush #-21
    //   391: bastore
    //   392: dup
    //   393: bipush #15
    //   395: bipush #97
    //   397: bastore
    //   398: dup
    //   399: bipush #16
    //   401: iconst_4
    //   402: bastore
    //   403: dup
    //   404: bipush #17
    //   406: bipush #-14
    //   408: bastore
    //   409: dup
    //   410: bipush #18
    //   412: bipush #51
    //   414: bastore
    //   415: dup
    //   416: bipush #19
    //   418: bipush #-108
    //   420: bastore
    //   421: dup
    //   422: bipush #20
    //   424: bipush #-102
    //   426: bastore
    //   427: dup
    //   428: bipush #21
    //   430: bipush #-126
    //   432: bastore
    //   433: dup
    //   434: bipush #22
    //   436: bipush #-113
    //   438: bastore
    //   439: dup
    //   440: bipush #23
    //   442: bipush #-20
    //   444: bastore
    //   445: dup
    //   446: bipush #24
    //   448: bipush #-67
    //   450: bastore
    //   451: dup
    //   452: bipush #25
    //   454: bipush #-49
    //   456: bastore
    //   457: dup
    //   458: bipush #26
    //   460: bipush #56
    //   462: bastore
    //   463: dup
    //   464: bipush #27
    //   466: bipush #-109
    //   468: bastore
    //   469: dup
    //   470: bipush #28
    //   472: bipush #-29
    //   474: bastore
    //   475: dup
    //   476: bipush #29
    //   478: bipush #-93
    //   480: bastore
    //   481: dup
    //   482: bipush #30
    //   484: bipush #48
    //   486: bastore
    //   487: dup
    //   488: bipush #31
    //   490: bipush #118
    //   492: bastore
    //   493: invokespecial <init> : ([B)V
    //   496: putstatic burp/Ze6t.Zu : Ljava/lang/Object;
    //   499: sipush #-24501
    //   502: sipush #25911
    //   505: invokestatic a : (II)Ljava/lang/String;
    //   508: putstatic burp/Ze6t.ZR : Ljava/lang/String;
    //   511: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFA04D) & 0xFFFF;
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
      char c = 'Æ';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze6t.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */