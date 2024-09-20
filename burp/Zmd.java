package burp;

import java.math.BigInteger;

class Zmd extends ClassLoader {
  static String Zf;
  
  static Object ZU;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zw(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void Zq(Object paramObject) {
    Ze7y.Zm = a(-10414, -1458);
    Ze7y.Zh = new BigInteger(a(-10421, -30904));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zm81.ZY.charAt(Math.abs(((BigInteger)Zz16.ZK).intValue() % 32)) <= Zgr4.Zi.charAt(Math.abs(((BigInteger)Zm81.Zy).intValue() % 32))) {
          try {
            Zb6e.ZI(Class.forName(a(-10432, -20871)));
            if (bool)
              Zeb7.ZG(Class.forName(a(-10424, -3386))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zeb7.ZG(Class.forName(a(-10424, -3386)));
    } catch (Throwable throwable) {}
  }
  
  static boolean ZR(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zm1l.Za : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zx_u.Zy : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zsbd.Zh : Ljava/lang/Object;
    //   22: sipush #-10430
    //   25: sipush #22452
    //   28: invokestatic a : (II)Ljava/lang/String;
    //   31: iconst_1
    //   32: ldc burp/Zkca
    //   34: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   37: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   40: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   43: astore_3
    //   44: aload_3
    //   45: arraylength
    //   46: istore #4
    //   48: iconst_0
    //   49: istore #5
    //   51: iload #5
    //   53: iload #4
    //   55: if_icmpge -> 192
    //   58: aload_3
    //   59: iload #5
    //   61: aaload
    //   62: astore #6
    //   64: aload #6
    //   66: invokevirtual getModifiers : ()I
    //   69: invokestatic isStatic : (I)Z
    //   72: ifne -> 82
    //   75: goto -> 185
    //   78: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   81: athrow
    //   82: aload #6
    //   84: invokevirtual getType : ()Ljava/lang/Class;
    //   87: astore #7
    //   89: aload #7
    //   91: ifnull -> 172
    //   94: aload #7
    //   96: invokevirtual isPrimitive : ()Z
    //   99: ifne -> 172
    //   102: goto -> 109
    //   105: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   108: athrow
    //   109: aload #7
    //   111: invokevirtual getPackage : ()Ljava/lang/Package;
    //   114: ifnull -> 172
    //   117: goto -> 124
    //   120: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   123: athrow
    //   124: aload #7
    //   126: invokevirtual getPackage : ()Ljava/lang/Package;
    //   129: invokevirtual getName : ()Ljava/lang/String;
    //   132: ifnull -> 172
    //   135: goto -> 142
    //   138: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   141: athrow
    //   142: aload #7
    //   144: invokevirtual getPackage : ()Ljava/lang/Package;
    //   147: invokevirtual getName : ()Ljava/lang/String;
    //   150: sipush #-10426
    //   153: sipush #-25341
    //   156: invokestatic a : (II)Ljava/lang/String;
    //   159: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   162: ifne -> 172
    //   165: goto -> 172
    //   168: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   171: athrow
    //   172: aload #6
    //   174: iconst_1
    //   175: invokevirtual setAccessible : (Z)V
    //   178: aload #6
    //   180: aconst_null
    //   181: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   184: pop
    //   185: iinc #5, 1
    //   188: iload_2
    //   189: ifne -> 51
    //   192: sipush #-10412
    //   195: sipush #30483
    //   198: invokestatic a : (II)Ljava/lang/String;
    //   201: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   204: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   207: astore_3
    //   208: aload_3
    //   209: arraylength
    //   210: istore #4
    //   212: iconst_0
    //   213: istore #5
    //   215: iload #5
    //   217: iload #4
    //   219: if_icmpge -> 351
    //   222: aload_3
    //   223: iload #5
    //   225: aaload
    //   226: astore #6
    //   228: aload #6
    //   230: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   233: pop
    //   234: aload #6
    //   236: invokevirtual getModifiers : ()I
    //   239: invokestatic isStatic : (I)Z
    //   242: ifeq -> 337
    //   245: aload #6
    //   247: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   250: arraylength
    //   251: iconst_2
    //   252: if_icmpne -> 337
    //   255: goto -> 262
    //   258: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   261: athrow
    //   262: aload #6
    //   264: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   267: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   270: invokevirtual equals : (Ljava/lang/Object;)Z
    //   273: ifeq -> 337
    //   276: goto -> 283
    //   279: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   282: athrow
    //   283: aload #6
    //   285: iconst_1
    //   286: invokevirtual setAccessible : (Z)V
    //   289: aload #6
    //   291: aconst_null
    //   292: iconst_2
    //   293: anewarray java/lang/Object
    //   296: dup
    //   297: iconst_0
    //   298: aload_0
    //   299: aastore
    //   300: dup
    //   301: iconst_1
    //   302: aload_1
    //   303: ifnonnull -> 321
    //   306: goto -> 313
    //   309: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   312: athrow
    //   313: aload_1
    //   314: goto -> 328
    //   317: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   320: athrow
    //   321: aload_1
    //   322: checkcast [B
    //   325: invokevirtual clone : ()Ljava/lang/Object;
    //   328: aastore
    //   329: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   332: pop
    //   333: iload_2
    //   334: ifne -> 351
    //   337: iinc #5, 1
    //   340: iload_2
    //   341: ifne -> 215
    //   344: goto -> 351
    //   347: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   350: athrow
    //   351: getstatic burp/Zl1n.ZM : Ljava/lang/Object;
    //   354: checkcast java/math/BigInteger
    //   357: invokevirtual toByteArray : ()[B
    //   360: astore_3
    //   361: iconst_0
    //   362: istore #5
    //   364: iconst_0
    //   365: istore #6
    //   367: iload #6
    //   369: aload_3
    //   370: arraylength
    //   371: if_icmpge -> 516
    //   374: aload_3
    //   375: iload #6
    //   377: baload
    //   378: istore #7
    //   380: iload #7
    //   382: bipush #48
    //   384: if_icmplt -> 401
    //   387: iload #7
    //   389: bipush #57
    //   391: if_icmple -> 499
    //   394: goto -> 401
    //   397: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   400: athrow
    //   401: iload #7
    //   403: bipush #65
    //   405: if_icmplt -> 429
    //   408: goto -> 415
    //   411: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   414: athrow
    //   415: iload #7
    //   417: bipush #90
    //   419: if_icmple -> 499
    //   422: goto -> 429
    //   425: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   428: athrow
    //   429: iload #7
    //   431: bipush #97
    //   433: if_icmplt -> 457
    //   436: goto -> 443
    //   439: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   442: athrow
    //   443: iload #7
    //   445: bipush #122
    //   447: if_icmple -> 499
    //   450: goto -> 457
    //   453: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   456: athrow
    //   457: iload #7
    //   459: bipush #43
    //   461: if_icmpeq -> 499
    //   464: goto -> 471
    //   467: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   470: athrow
    //   471: iload #7
    //   473: bipush #47
    //   475: if_icmpeq -> 499
    //   478: goto -> 485
    //   481: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   484: athrow
    //   485: iload #7
    //   487: bipush #61
    //   489: if_icmpne -> 509
    //   492: goto -> 499
    //   495: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   498: athrow
    //   499: iinc #5, 1
    //   502: goto -> 509
    //   505: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   508: athrow
    //   509: iinc #6, 1
    //   512: iload_2
    //   513: ifne -> 367
    //   516: iload #5
    //   518: newarray byte
    //   520: astore #6
    //   522: iconst_0
    //   523: istore #7
    //   525: iconst_0
    //   526: istore #8
    //   528: iload #8
    //   530: aload_3
    //   531: arraylength
    //   532: if_icmpge -> 684
    //   535: aload_3
    //   536: iload #8
    //   538: baload
    //   539: istore #9
    //   541: iload #9
    //   543: bipush #48
    //   545: if_icmplt -> 562
    //   548: iload #9
    //   550: bipush #57
    //   552: if_icmple -> 660
    //   555: goto -> 562
    //   558: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   561: athrow
    //   562: iload #9
    //   564: bipush #65
    //   566: if_icmplt -> 590
    //   569: goto -> 576
    //   572: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   575: athrow
    //   576: iload #9
    //   578: bipush #90
    //   580: if_icmple -> 660
    //   583: goto -> 590
    //   586: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   589: athrow
    //   590: iload #9
    //   592: bipush #97
    //   594: if_icmplt -> 618
    //   597: goto -> 604
    //   600: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   603: athrow
    //   604: iload #9
    //   606: bipush #122
    //   608: if_icmple -> 660
    //   611: goto -> 618
    //   614: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   617: athrow
    //   618: iload #9
    //   620: bipush #43
    //   622: if_icmpeq -> 660
    //   625: goto -> 632
    //   628: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   631: athrow
    //   632: iload #9
    //   634: bipush #47
    //   636: if_icmpeq -> 660
    //   639: goto -> 646
    //   642: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   645: athrow
    //   646: iload #9
    //   648: bipush #61
    //   650: if_icmpne -> 677
    //   653: goto -> 660
    //   656: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   659: athrow
    //   660: aload #6
    //   662: iload #7
    //   664: iload #9
    //   666: bastore
    //   667: iinc #7, 1
    //   670: goto -> 677
    //   673: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   676: athrow
    //   677: iinc #8, 1
    //   680: iload_2
    //   681: ifne -> 528
    //   684: aload #6
    //   686: astore #4
    //   688: aload #4
    //   690: astore_3
    //   691: aload_3
    //   692: arraylength
    //   693: istore #5
    //   695: aload_3
    //   696: iload #5
    //   698: iconst_1
    //   699: isub
    //   700: baload
    //   701: bipush #61
    //   703: if_icmpne -> 713
    //   706: iinc #5, -1
    //   709: iload_2
    //   710: ifne -> 695
    //   713: iload #5
    //   715: aload_3
    //   716: arraylength
    //   717: iconst_4
    //   718: idiv
    //   719: isub
    //   720: newarray byte
    //   722: astore #6
    //   724: iconst_0
    //   725: istore #7
    //   727: iload #7
    //   729: aload_3
    //   730: arraylength
    //   731: if_icmpge -> 993
    //   734: aload_3
    //   735: iload #7
    //   737: baload
    //   738: bipush #61
    //   740: if_icmpne -> 759
    //   743: aload_3
    //   744: iload #7
    //   746: iconst_0
    //   747: bastore
    //   748: iload_2
    //   749: ifne -> 986
    //   752: goto -> 759
    //   755: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   758: athrow
    //   759: aload_3
    //   760: iload #7
    //   762: baload
    //   763: bipush #47
    //   765: if_icmpne -> 792
    //   768: goto -> 775
    //   771: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   774: athrow
    //   775: aload_3
    //   776: iload #7
    //   778: bipush #63
    //   780: bastore
    //   781: iload_2
    //   782: ifne -> 986
    //   785: goto -> 792
    //   788: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   791: athrow
    //   792: aload_3
    //   793: iload #7
    //   795: baload
    //   796: bipush #43
    //   798: if_icmpne -> 825
    //   801: goto -> 808
    //   804: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   807: athrow
    //   808: aload_3
    //   809: iload #7
    //   811: bipush #62
    //   813: bastore
    //   814: iload_2
    //   815: ifne -> 986
    //   818: goto -> 825
    //   821: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   824: athrow
    //   825: aload_3
    //   826: iload #7
    //   828: baload
    //   829: bipush #48
    //   831: if_icmplt -> 880
    //   834: goto -> 841
    //   837: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   840: athrow
    //   841: aload_3
    //   842: iload #7
    //   844: baload
    //   845: bipush #57
    //   847: if_icmpgt -> 880
    //   850: goto -> 857
    //   853: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   856: athrow
    //   857: aload_3
    //   858: iload #7
    //   860: aload_3
    //   861: iload #7
    //   863: baload
    //   864: bipush #-4
    //   866: isub
    //   867: i2b
    //   868: bastore
    //   869: iload_2
    //   870: ifne -> 986
    //   873: goto -> 880
    //   876: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   879: athrow
    //   880: aload_3
    //   881: iload #7
    //   883: baload
    //   884: bipush #97
    //   886: if_icmplt -> 935
    //   889: goto -> 896
    //   892: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   895: athrow
    //   896: aload_3
    //   897: iload #7
    //   899: baload
    //   900: bipush #122
    //   902: if_icmpgt -> 935
    //   905: goto -> 912
    //   908: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   911: athrow
    //   912: aload_3
    //   913: iload #7
    //   915: aload_3
    //   916: iload #7
    //   918: baload
    //   919: bipush #71
    //   921: isub
    //   922: i2b
    //   923: bastore
    //   924: iload_2
    //   925: ifne -> 986
    //   928: goto -> 935
    //   931: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   934: athrow
    //   935: aload_3
    //   936: iload #7
    //   938: baload
    //   939: bipush #65
    //   941: if_icmplt -> 986
    //   944: goto -> 951
    //   947: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   950: athrow
    //   951: aload_3
    //   952: iload #7
    //   954: baload
    //   955: bipush #90
    //   957: if_icmpgt -> 986
    //   960: goto -> 967
    //   963: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   966: athrow
    //   967: aload_3
    //   968: iload #7
    //   970: aload_3
    //   971: iload #7
    //   973: baload
    //   974: bipush #65
    //   976: isub
    //   977: i2b
    //   978: bastore
    //   979: goto -> 986
    //   982: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   985: athrow
    //   986: iinc #7, 1
    //   989: iload_2
    //   990: ifne -> 727
    //   993: iconst_0
    //   994: istore #7
    //   996: iconst_0
    //   997: istore #8
    //   999: iload #8
    //   1001: aload #6
    //   1003: arraylength
    //   1004: iconst_2
    //   1005: isub
    //   1006: if_icmpge -> 1109
    //   1009: aload #6
    //   1011: iload #8
    //   1013: aload_3
    //   1014: iload #7
    //   1016: baload
    //   1017: iconst_2
    //   1018: ishl
    //   1019: sipush #255
    //   1022: iand
    //   1023: aload_3
    //   1024: iload #7
    //   1026: iconst_1
    //   1027: iadd
    //   1028: baload
    //   1029: iconst_4
    //   1030: iushr
    //   1031: iconst_3
    //   1032: iand
    //   1033: ior
    //   1034: i2b
    //   1035: bastore
    //   1036: aload #6
    //   1038: iload #8
    //   1040: iconst_1
    //   1041: iadd
    //   1042: aload_3
    //   1043: iload #7
    //   1045: iconst_1
    //   1046: iadd
    //   1047: baload
    //   1048: iconst_4
    //   1049: ishl
    //   1050: sipush #255
    //   1053: iand
    //   1054: aload_3
    //   1055: iload #7
    //   1057: iconst_2
    //   1058: iadd
    //   1059: baload
    //   1060: iconst_2
    //   1061: iushr
    //   1062: bipush #15
    //   1064: iand
    //   1065: ior
    //   1066: i2b
    //   1067: bastore
    //   1068: aload #6
    //   1070: iload #8
    //   1072: iconst_2
    //   1073: iadd
    //   1074: aload_3
    //   1075: iload #7
    //   1077: iconst_2
    //   1078: iadd
    //   1079: baload
    //   1080: bipush #6
    //   1082: ishl
    //   1083: sipush #255
    //   1086: iand
    //   1087: aload_3
    //   1088: iload #7
    //   1090: iconst_3
    //   1091: iadd
    //   1092: baload
    //   1093: bipush #63
    //   1095: iand
    //   1096: ior
    //   1097: i2b
    //   1098: bastore
    //   1099: iinc #7, 4
    //   1102: iinc #8, 3
    //   1105: iload_2
    //   1106: ifne -> 999
    //   1109: iload #8
    //   1111: aload #6
    //   1113: arraylength
    //   1114: if_icmpge -> 1151
    //   1117: aload #6
    //   1119: iload #8
    //   1121: aload_3
    //   1122: iload #7
    //   1124: baload
    //   1125: iconst_2
    //   1126: ishl
    //   1127: sipush #255
    //   1130: iand
    //   1131: aload_3
    //   1132: iload #7
    //   1134: iconst_1
    //   1135: iadd
    //   1136: baload
    //   1137: iconst_4
    //   1138: iushr
    //   1139: iconst_3
    //   1140: iand
    //   1141: ior
    //   1142: i2b
    //   1143: bastore
    //   1144: goto -> 1151
    //   1147: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1150: athrow
    //   1151: iinc #8, 1
    //   1154: iload #8
    //   1156: aload #6
    //   1158: arraylength
    //   1159: if_icmpge -> 1199
    //   1162: aload #6
    //   1164: iload #8
    //   1166: aload_3
    //   1167: iload #7
    //   1169: iconst_1
    //   1170: iadd
    //   1171: baload
    //   1172: iconst_4
    //   1173: ishl
    //   1174: sipush #255
    //   1177: iand
    //   1178: aload_3
    //   1179: iload #7
    //   1181: iconst_2
    //   1182: iadd
    //   1183: baload
    //   1184: iconst_2
    //   1185: iushr
    //   1186: bipush #15
    //   1188: iand
    //   1189: ior
    //   1190: i2b
    //   1191: bastore
    //   1192: goto -> 1199
    //   1195: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1198: athrow
    //   1199: aload #6
    //   1201: astore #4
    //   1203: iconst_0
    //   1204: istore_3
    //   1205: getstatic burp/Ze40.Zr : Ljava/lang/String;
    //   1208: getstatic burp/Zly7.Zt : Ljava/lang/Object;
    //   1211: checkcast java/math/BigInteger
    //   1214: invokevirtual intValue : ()I
    //   1217: bipush #32
    //   1219: irem
    //   1220: invokestatic abs : (I)I
    //   1223: invokevirtual charAt : (I)C
    //   1226: getstatic burp/Zgco.Zh : Ljava/lang/String;
    //   1229: getstatic burp/Zm1l.Za : Ljava/lang/Object;
    //   1232: checkcast java/math/BigInteger
    //   1235: invokevirtual intValue : ()I
    //   1238: bipush #32
    //   1240: irem
    //   1241: invokestatic abs : (I)I
    //   1244: invokevirtual charAt : (I)C
    //   1247: if_icmple -> 1591
    //   1250: sipush #-10431
    //   1253: sipush #-23207
    //   1256: invokestatic a : (II)Ljava/lang/String;
    //   1259: iconst_1
    //   1260: ldc burp/Zter
    //   1262: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1265: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1268: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1271: astore #4
    //   1273: aload #4
    //   1275: arraylength
    //   1276: istore #5
    //   1278: iconst_0
    //   1279: istore #6
    //   1281: iload #6
    //   1283: iload #5
    //   1285: if_icmpge -> 1423
    //   1288: aload #4
    //   1290: iload #6
    //   1292: aaload
    //   1293: astore #7
    //   1295: aload #7
    //   1297: invokevirtual getModifiers : ()I
    //   1300: invokestatic isStatic : (I)Z
    //   1303: ifne -> 1313
    //   1306: goto -> 1416
    //   1309: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1312: athrow
    //   1313: aload #7
    //   1315: invokevirtual getType : ()Ljava/lang/Class;
    //   1318: astore #8
    //   1320: aload #8
    //   1322: ifnull -> 1403
    //   1325: aload #8
    //   1327: invokevirtual isPrimitive : ()Z
    //   1330: ifne -> 1403
    //   1333: goto -> 1340
    //   1336: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1339: athrow
    //   1340: aload #8
    //   1342: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1345: ifnull -> 1403
    //   1348: goto -> 1355
    //   1351: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1354: athrow
    //   1355: aload #8
    //   1357: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1360: invokevirtual getName : ()Ljava/lang/String;
    //   1363: ifnull -> 1403
    //   1366: goto -> 1373
    //   1369: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1372: athrow
    //   1373: aload #8
    //   1375: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1378: invokevirtual getName : ()Ljava/lang/String;
    //   1381: sipush #-10425
    //   1384: sipush #24588
    //   1387: invokestatic a : (II)Ljava/lang/String;
    //   1390: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1393: ifne -> 1403
    //   1396: goto -> 1403
    //   1399: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1402: athrow
    //   1403: aload #7
    //   1405: iconst_1
    //   1406: invokevirtual setAccessible : (Z)V
    //   1409: aload #7
    //   1411: aconst_null
    //   1412: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1415: pop
    //   1416: iinc #6, 1
    //   1419: iload_2
    //   1420: ifne -> 1281
    //   1423: sipush #-10419
    //   1426: sipush #-29848
    //   1429: invokestatic a : (II)Ljava/lang/String;
    //   1432: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1435: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1438: astore #4
    //   1440: aload #4
    //   1442: arraylength
    //   1443: istore #5
    //   1445: iconst_0
    //   1446: istore #6
    //   1448: iload #6
    //   1450: iload #5
    //   1452: if_icmpge -> 1588
    //   1455: aload #4
    //   1457: iload #6
    //   1459: aaload
    //   1460: astore #7
    //   1462: aload #7
    //   1464: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1467: pop
    //   1468: aload #7
    //   1470: invokevirtual getModifiers : ()I
    //   1473: invokestatic isStatic : (I)Z
    //   1476: ifeq -> 1574
    //   1479: aload #7
    //   1481: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1484: arraylength
    //   1485: iconst_2
    //   1486: if_icmpne -> 1574
    //   1489: goto -> 1496
    //   1492: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1495: athrow
    //   1496: aload #7
    //   1498: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1501: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1504: if_acmpne -> 1574
    //   1507: goto -> 1514
    //   1510: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1513: athrow
    //   1514: aload #7
    //   1516: iconst_1
    //   1517: invokevirtual setAccessible : (Z)V
    //   1520: aload #7
    //   1522: aconst_null
    //   1523: iconst_2
    //   1524: anewarray java/lang/Object
    //   1527: dup
    //   1528: iconst_0
    //   1529: aload_0
    //   1530: aastore
    //   1531: dup
    //   1532: iconst_1
    //   1533: aload_1
    //   1534: ifnonnull -> 1552
    //   1537: goto -> 1544
    //   1540: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1543: athrow
    //   1544: aload_1
    //   1545: goto -> 1559
    //   1548: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1551: athrow
    //   1552: aload_1
    //   1553: checkcast [B
    //   1556: invokevirtual clone : ()Ljava/lang/Object;
    //   1559: aastore
    //   1560: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1563: checkcast java/lang/Boolean
    //   1566: invokevirtual booleanValue : ()Z
    //   1569: istore_3
    //   1570: iload_2
    //   1571: ifne -> 1588
    //   1574: iinc #6, 1
    //   1577: iload_2
    //   1578: ifne -> 1448
    //   1581: goto -> 1588
    //   1584: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1587: athrow
    //   1588: goto -> 1929
    //   1591: sipush #-10409
    //   1594: sipush #7002
    //   1597: invokestatic a : (II)Ljava/lang/String;
    //   1600: iconst_1
    //   1601: ldc burp/Zg7j
    //   1603: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1606: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1609: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1612: astore #4
    //   1614: aload #4
    //   1616: arraylength
    //   1617: istore #5
    //   1619: iconst_0
    //   1620: istore #6
    //   1622: iload #6
    //   1624: iload #5
    //   1626: if_icmpge -> 1764
    //   1629: aload #4
    //   1631: iload #6
    //   1633: aaload
    //   1634: astore #7
    //   1636: aload #7
    //   1638: invokevirtual getModifiers : ()I
    //   1641: invokestatic isStatic : (I)Z
    //   1644: ifne -> 1654
    //   1647: goto -> 1757
    //   1650: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1653: athrow
    //   1654: aload #7
    //   1656: invokevirtual getType : ()Ljava/lang/Class;
    //   1659: astore #8
    //   1661: aload #8
    //   1663: ifnull -> 1744
    //   1666: aload #8
    //   1668: invokevirtual isPrimitive : ()Z
    //   1671: ifne -> 1744
    //   1674: goto -> 1681
    //   1677: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1680: athrow
    //   1681: aload #8
    //   1683: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1686: ifnull -> 1744
    //   1689: goto -> 1696
    //   1692: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1695: athrow
    //   1696: aload #8
    //   1698: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1701: invokevirtual getName : ()Ljava/lang/String;
    //   1704: ifnull -> 1744
    //   1707: goto -> 1714
    //   1710: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1713: athrow
    //   1714: aload #8
    //   1716: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1719: invokevirtual getName : ()Ljava/lang/String;
    //   1722: sipush #-10425
    //   1725: sipush #24588
    //   1728: invokestatic a : (II)Ljava/lang/String;
    //   1731: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1734: ifne -> 1744
    //   1737: goto -> 1744
    //   1740: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1743: athrow
    //   1744: aload #7
    //   1746: iconst_1
    //   1747: invokevirtual setAccessible : (Z)V
    //   1750: aload #7
    //   1752: aconst_null
    //   1753: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1756: pop
    //   1757: iinc #6, 1
    //   1760: iload_2
    //   1761: ifne -> 1622
    //   1764: sipush #-10423
    //   1767: sipush #7078
    //   1770: invokestatic a : (II)Ljava/lang/String;
    //   1773: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1776: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1779: astore #4
    //   1781: aload #4
    //   1783: arraylength
    //   1784: istore #5
    //   1786: iconst_0
    //   1787: istore #6
    //   1789: iload #6
    //   1791: iload #5
    //   1793: if_icmpge -> 1929
    //   1796: aload #4
    //   1798: iload #6
    //   1800: aaload
    //   1801: astore #7
    //   1803: aload #7
    //   1805: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1808: pop
    //   1809: aload #7
    //   1811: invokevirtual getModifiers : ()I
    //   1814: invokestatic isStatic : (I)Z
    //   1817: ifeq -> 1915
    //   1820: aload #7
    //   1822: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1825: arraylength
    //   1826: iconst_2
    //   1827: if_icmpne -> 1915
    //   1830: goto -> 1837
    //   1833: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1836: athrow
    //   1837: aload #7
    //   1839: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1842: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1845: if_acmpne -> 1915
    //   1848: goto -> 1855
    //   1851: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1854: athrow
    //   1855: aload #7
    //   1857: iconst_1
    //   1858: invokevirtual setAccessible : (Z)V
    //   1861: aload #7
    //   1863: aconst_null
    //   1864: iconst_2
    //   1865: anewarray java/lang/Object
    //   1868: dup
    //   1869: iconst_0
    //   1870: aload_0
    //   1871: aastore
    //   1872: dup
    //   1873: iconst_1
    //   1874: aload_1
    //   1875: ifnonnull -> 1893
    //   1878: goto -> 1885
    //   1881: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1884: athrow
    //   1885: aload_1
    //   1886: goto -> 1900
    //   1889: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1892: athrow
    //   1893: aload_1
    //   1894: checkcast [B
    //   1897: invokevirtual clone : ()Ljava/lang/Object;
    //   1900: aastore
    //   1901: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1904: checkcast java/lang/Boolean
    //   1907: invokevirtual booleanValue : ()Z
    //   1910: istore_3
    //   1911: iload_2
    //   1912: ifne -> 1929
    //   1915: iinc #6, 1
    //   1918: iload_2
    //   1919: ifne -> 1789
    //   1922: goto -> 1929
    //   1925: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1928: athrow
    //   1929: iload_3
    //   1930: ifeq -> 1935
    //   1933: iload_3
    //   1934: ireturn
    //   1935: getstatic burp/Zmir.ZI : Ljava/lang/String;
    //   1938: getstatic burp/Zeqr.ZM : Ljava/lang/Object;
    //   1941: checkcast java/math/BigInteger
    //   1944: invokevirtual intValue : ()I
    //   1947: bipush #32
    //   1949: irem
    //   1950: invokestatic abs : (I)I
    //   1953: invokevirtual charAt : (I)C
    //   1956: getstatic burp/Zxxd.Za : Ljava/lang/String;
    //   1959: getstatic burp/Zsdn.ZE : Ljava/lang/Object;
    //   1962: checkcast java/math/BigInteger
    //   1965: invokevirtual intValue : ()I
    //   1968: bipush #32
    //   1970: irem
    //   1971: invokestatic abs : (I)I
    //   1974: invokevirtual charAt : (I)C
    //   1977: if_icmpgt -> 2322
    //   1980: sipush #-10428
    //   1983: sipush #1345
    //   1986: invokestatic a : (II)Ljava/lang/String;
    //   1989: iconst_1
    //   1990: ldc burp/Zkgp
    //   1992: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1995: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1998: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2001: astore #4
    //   2003: aload #4
    //   2005: arraylength
    //   2006: istore #5
    //   2008: iconst_0
    //   2009: istore #6
    //   2011: iload #6
    //   2013: iload #5
    //   2015: if_icmpge -> 2153
    //   2018: aload #4
    //   2020: iload #6
    //   2022: aaload
    //   2023: astore #7
    //   2025: aload #7
    //   2027: invokevirtual getModifiers : ()I
    //   2030: invokestatic isStatic : (I)Z
    //   2033: ifne -> 2043
    //   2036: goto -> 2146
    //   2039: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2042: athrow
    //   2043: aload #7
    //   2045: invokevirtual getType : ()Ljava/lang/Class;
    //   2048: astore #8
    //   2050: aload #8
    //   2052: ifnull -> 2133
    //   2055: aload #8
    //   2057: invokevirtual isPrimitive : ()Z
    //   2060: ifne -> 2133
    //   2063: goto -> 2070
    //   2066: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2069: athrow
    //   2070: aload #8
    //   2072: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2075: ifnull -> 2133
    //   2078: goto -> 2085
    //   2081: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2084: athrow
    //   2085: aload #8
    //   2087: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2090: invokevirtual getName : ()Ljava/lang/String;
    //   2093: ifnull -> 2133
    //   2096: goto -> 2103
    //   2099: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2102: athrow
    //   2103: aload #8
    //   2105: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2108: invokevirtual getName : ()Ljava/lang/String;
    //   2111: sipush #-10425
    //   2114: sipush #24588
    //   2117: invokestatic a : (II)Ljava/lang/String;
    //   2120: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2123: ifne -> 2133
    //   2126: goto -> 2133
    //   2129: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2132: athrow
    //   2133: aload #7
    //   2135: iconst_1
    //   2136: invokevirtual setAccessible : (Z)V
    //   2139: aload #7
    //   2141: aconst_null
    //   2142: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2145: pop
    //   2146: iinc #6, 1
    //   2149: iload_2
    //   2150: ifne -> 2011
    //   2153: sipush #-10427
    //   2156: sipush #-2989
    //   2159: invokestatic a : (II)Ljava/lang/String;
    //   2162: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2165: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2168: astore #4
    //   2170: aload #4
    //   2172: arraylength
    //   2173: istore #5
    //   2175: iconst_0
    //   2176: istore #6
    //   2178: iload #6
    //   2180: iload #5
    //   2182: if_icmpge -> 2318
    //   2185: aload #4
    //   2187: iload #6
    //   2189: aaload
    //   2190: astore #7
    //   2192: aload #7
    //   2194: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2197: pop
    //   2198: aload #7
    //   2200: invokevirtual getModifiers : ()I
    //   2203: invokestatic isStatic : (I)Z
    //   2206: ifeq -> 2304
    //   2209: aload #7
    //   2211: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2214: arraylength
    //   2215: iconst_2
    //   2216: if_icmpne -> 2304
    //   2219: goto -> 2226
    //   2222: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2225: athrow
    //   2226: aload #7
    //   2228: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2231: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2234: if_acmpne -> 2304
    //   2237: goto -> 2244
    //   2240: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2243: athrow
    //   2244: aload #7
    //   2246: iconst_1
    //   2247: invokevirtual setAccessible : (Z)V
    //   2250: aload #7
    //   2252: aconst_null
    //   2253: iconst_2
    //   2254: anewarray java/lang/Object
    //   2257: dup
    //   2258: iconst_0
    //   2259: aload_0
    //   2260: aastore
    //   2261: dup
    //   2262: iconst_1
    //   2263: aload_1
    //   2264: ifnonnull -> 2282
    //   2267: goto -> 2274
    //   2270: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2273: athrow
    //   2274: aload_1
    //   2275: goto -> 2289
    //   2278: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2281: athrow
    //   2282: aload_1
    //   2283: checkcast [B
    //   2286: invokevirtual clone : ()Ljava/lang/Object;
    //   2289: aastore
    //   2290: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2293: checkcast java/lang/Boolean
    //   2296: invokevirtual booleanValue : ()Z
    //   2299: istore_3
    //   2300: iload_2
    //   2301: ifne -> 2318
    //   2304: iinc #6, 1
    //   2307: iload_2
    //   2308: ifne -> 2178
    //   2311: goto -> 2318
    //   2314: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2317: athrow
    //   2318: iload_2
    //   2319: ifne -> 2660
    //   2322: sipush #-10422
    //   2325: sipush #4187
    //   2328: invokestatic a : (II)Ljava/lang/String;
    //   2331: iconst_1
    //   2332: ldc burp/Zb38
    //   2334: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2337: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2340: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2343: astore #4
    //   2345: aload #4
    //   2347: arraylength
    //   2348: istore #5
    //   2350: iconst_0
    //   2351: istore #6
    //   2353: iload #6
    //   2355: iload #5
    //   2357: if_icmpge -> 2495
    //   2360: aload #4
    //   2362: iload #6
    //   2364: aaload
    //   2365: astore #7
    //   2367: aload #7
    //   2369: invokevirtual getModifiers : ()I
    //   2372: invokestatic isStatic : (I)Z
    //   2375: ifne -> 2385
    //   2378: goto -> 2488
    //   2381: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2384: athrow
    //   2385: aload #7
    //   2387: invokevirtual getType : ()Ljava/lang/Class;
    //   2390: astore #8
    //   2392: aload #8
    //   2394: ifnull -> 2475
    //   2397: aload #8
    //   2399: invokevirtual isPrimitive : ()Z
    //   2402: ifne -> 2475
    //   2405: goto -> 2412
    //   2408: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2411: athrow
    //   2412: aload #8
    //   2414: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2417: ifnull -> 2475
    //   2420: goto -> 2427
    //   2423: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2426: athrow
    //   2427: aload #8
    //   2429: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2432: invokevirtual getName : ()Ljava/lang/String;
    //   2435: ifnull -> 2475
    //   2438: goto -> 2445
    //   2441: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2444: athrow
    //   2445: aload #8
    //   2447: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2450: invokevirtual getName : ()Ljava/lang/String;
    //   2453: sipush #-10425
    //   2456: sipush #24588
    //   2459: invokestatic a : (II)Ljava/lang/String;
    //   2462: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2465: ifne -> 2475
    //   2468: goto -> 2475
    //   2471: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2474: athrow
    //   2475: aload #7
    //   2477: iconst_1
    //   2478: invokevirtual setAccessible : (Z)V
    //   2481: aload #7
    //   2483: aconst_null
    //   2484: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2487: pop
    //   2488: iinc #6, 1
    //   2491: iload_2
    //   2492: ifne -> 2353
    //   2495: sipush #-10413
    //   2498: sipush #-30505
    //   2501: invokestatic a : (II)Ljava/lang/String;
    //   2504: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2507: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2510: astore #4
    //   2512: aload #4
    //   2514: arraylength
    //   2515: istore #5
    //   2517: iconst_0
    //   2518: istore #6
    //   2520: iload #6
    //   2522: iload #5
    //   2524: if_icmpge -> 2660
    //   2527: aload #4
    //   2529: iload #6
    //   2531: aaload
    //   2532: astore #7
    //   2534: aload #7
    //   2536: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2539: pop
    //   2540: aload #7
    //   2542: invokevirtual getModifiers : ()I
    //   2545: invokestatic isStatic : (I)Z
    //   2548: ifeq -> 2646
    //   2551: aload #7
    //   2553: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2556: arraylength
    //   2557: iconst_2
    //   2558: if_icmpne -> 2646
    //   2561: goto -> 2568
    //   2564: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2567: athrow
    //   2568: aload #7
    //   2570: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2573: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2576: if_acmpne -> 2646
    //   2579: goto -> 2586
    //   2582: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2585: athrow
    //   2586: aload #7
    //   2588: iconst_1
    //   2589: invokevirtual setAccessible : (Z)V
    //   2592: aload #7
    //   2594: aconst_null
    //   2595: iconst_2
    //   2596: anewarray java/lang/Object
    //   2599: dup
    //   2600: iconst_0
    //   2601: aload_0
    //   2602: aastore
    //   2603: dup
    //   2604: iconst_1
    //   2605: aload_1
    //   2606: ifnonnull -> 2624
    //   2609: goto -> 2616
    //   2612: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2615: athrow
    //   2616: aload_1
    //   2617: goto -> 2631
    //   2620: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2623: athrow
    //   2624: aload_1
    //   2625: checkcast [B
    //   2628: invokevirtual clone : ()Ljava/lang/Object;
    //   2631: aastore
    //   2632: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2635: checkcast java/lang/Boolean
    //   2638: invokevirtual booleanValue : ()Z
    //   2641: istore_3
    //   2642: iload_2
    //   2643: ifne -> 2660
    //   2646: iinc #6, 1
    //   2649: iload_2
    //   2650: ifne -> 2520
    //   2653: goto -> 2660
    //   2656: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2659: athrow
    //   2660: iload_3
    //   2661: ifeq -> 2666
    //   2664: iload_3
    //   2665: ireturn
    //   2666: getstatic burp/Zm1l.Zp : Ljava/lang/String;
    //   2669: getstatic burp/Zl1n.ZM : Ljava/lang/Object;
    //   2672: checkcast java/math/BigInteger
    //   2675: invokevirtual intValue : ()I
    //   2678: bipush #32
    //   2680: irem
    //   2681: invokestatic abs : (I)I
    //   2684: invokevirtual charAt : (I)C
    //   2687: getstatic burp/Zboa.Zq : Ljava/lang/String;
    //   2690: getstatic burp/Zsuw.ZB : Ljava/lang/Object;
    //   2693: checkcast java/math/BigInteger
    //   2696: invokevirtual intValue : ()I
    //   2699: bipush #32
    //   2701: irem
    //   2702: invokestatic abs : (I)I
    //   2705: invokevirtual charAt : (I)C
    //   2708: if_icmpgt -> 3053
    //   2711: sipush #-10410
    //   2714: sipush #-23665
    //   2717: invokestatic a : (II)Ljava/lang/String;
    //   2720: iconst_1
    //   2721: ldc burp/Zg7z
    //   2723: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2726: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2729: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2732: astore #4
    //   2734: aload #4
    //   2736: arraylength
    //   2737: istore #5
    //   2739: iconst_0
    //   2740: istore #6
    //   2742: iload #6
    //   2744: iload #5
    //   2746: if_icmpge -> 2884
    //   2749: aload #4
    //   2751: iload #6
    //   2753: aaload
    //   2754: astore #7
    //   2756: aload #7
    //   2758: invokevirtual getModifiers : ()I
    //   2761: invokestatic isStatic : (I)Z
    //   2764: ifne -> 2774
    //   2767: goto -> 2877
    //   2770: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2773: athrow
    //   2774: aload #7
    //   2776: invokevirtual getType : ()Ljava/lang/Class;
    //   2779: astore #8
    //   2781: aload #8
    //   2783: ifnull -> 2864
    //   2786: aload #8
    //   2788: invokevirtual isPrimitive : ()Z
    //   2791: ifne -> 2864
    //   2794: goto -> 2801
    //   2797: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2800: athrow
    //   2801: aload #8
    //   2803: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2806: ifnull -> 2864
    //   2809: goto -> 2816
    //   2812: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2815: athrow
    //   2816: aload #8
    //   2818: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2821: invokevirtual getName : ()Ljava/lang/String;
    //   2824: ifnull -> 2864
    //   2827: goto -> 2834
    //   2830: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2833: athrow
    //   2834: aload #8
    //   2836: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2839: invokevirtual getName : ()Ljava/lang/String;
    //   2842: sipush #-10425
    //   2845: sipush #24588
    //   2848: invokestatic a : (II)Ljava/lang/String;
    //   2851: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2854: ifne -> 2864
    //   2857: goto -> 2864
    //   2860: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2863: athrow
    //   2864: aload #7
    //   2866: iconst_1
    //   2867: invokevirtual setAccessible : (Z)V
    //   2870: aload #7
    //   2872: aconst_null
    //   2873: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2876: pop
    //   2877: iinc #6, 1
    //   2880: iload_2
    //   2881: ifne -> 2742
    //   2884: sipush #-10418
    //   2887: sipush #23388
    //   2890: invokestatic a : (II)Ljava/lang/String;
    //   2893: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2896: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2899: astore #4
    //   2901: aload #4
    //   2903: arraylength
    //   2904: istore #5
    //   2906: iconst_0
    //   2907: istore #6
    //   2909: iload #6
    //   2911: iload #5
    //   2913: if_icmpge -> 3049
    //   2916: aload #4
    //   2918: iload #6
    //   2920: aaload
    //   2921: astore #7
    //   2923: aload #7
    //   2925: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2928: pop
    //   2929: aload #7
    //   2931: invokevirtual getModifiers : ()I
    //   2934: invokestatic isStatic : (I)Z
    //   2937: ifeq -> 3035
    //   2940: aload #7
    //   2942: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2945: arraylength
    //   2946: iconst_2
    //   2947: if_icmpne -> 3035
    //   2950: goto -> 2957
    //   2953: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2956: athrow
    //   2957: aload #7
    //   2959: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2962: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2965: if_acmpne -> 3035
    //   2968: goto -> 2975
    //   2971: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2974: athrow
    //   2975: aload #7
    //   2977: iconst_1
    //   2978: invokevirtual setAccessible : (Z)V
    //   2981: aload #7
    //   2983: aconst_null
    //   2984: iconst_2
    //   2985: anewarray java/lang/Object
    //   2988: dup
    //   2989: iconst_0
    //   2990: aload_0
    //   2991: aastore
    //   2992: dup
    //   2993: iconst_1
    //   2994: aload_1
    //   2995: ifnonnull -> 3013
    //   2998: goto -> 3005
    //   3001: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3004: athrow
    //   3005: aload_1
    //   3006: goto -> 3020
    //   3009: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3012: athrow
    //   3013: aload_1
    //   3014: checkcast [B
    //   3017: invokevirtual clone : ()Ljava/lang/Object;
    //   3020: aastore
    //   3021: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3024: checkcast java/lang/Boolean
    //   3027: invokevirtual booleanValue : ()Z
    //   3030: istore_3
    //   3031: iload_2
    //   3032: ifne -> 3049
    //   3035: iinc #6, 1
    //   3038: iload_2
    //   3039: ifne -> 2909
    //   3042: goto -> 3049
    //   3045: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3048: athrow
    //   3049: iload_2
    //   3050: ifne -> 3391
    //   3053: sipush #-10416
    //   3056: sipush #-19723
    //   3059: invokestatic a : (II)Ljava/lang/String;
    //   3062: iconst_1
    //   3063: ldc burp/Zx_b
    //   3065: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3068: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3071: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3074: astore #4
    //   3076: aload #4
    //   3078: arraylength
    //   3079: istore #5
    //   3081: iconst_0
    //   3082: istore #6
    //   3084: iload #6
    //   3086: iload #5
    //   3088: if_icmpge -> 3226
    //   3091: aload #4
    //   3093: iload #6
    //   3095: aaload
    //   3096: astore #7
    //   3098: aload #7
    //   3100: invokevirtual getModifiers : ()I
    //   3103: invokestatic isStatic : (I)Z
    //   3106: ifne -> 3116
    //   3109: goto -> 3219
    //   3112: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3115: athrow
    //   3116: aload #7
    //   3118: invokevirtual getType : ()Ljava/lang/Class;
    //   3121: astore #8
    //   3123: aload #8
    //   3125: ifnull -> 3206
    //   3128: aload #8
    //   3130: invokevirtual isPrimitive : ()Z
    //   3133: ifne -> 3206
    //   3136: goto -> 3143
    //   3139: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3142: athrow
    //   3143: aload #8
    //   3145: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3148: ifnull -> 3206
    //   3151: goto -> 3158
    //   3154: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3157: athrow
    //   3158: aload #8
    //   3160: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3163: invokevirtual getName : ()Ljava/lang/String;
    //   3166: ifnull -> 3206
    //   3169: goto -> 3176
    //   3172: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3175: athrow
    //   3176: aload #8
    //   3178: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3181: invokevirtual getName : ()Ljava/lang/String;
    //   3184: sipush #-10425
    //   3187: sipush #24588
    //   3190: invokestatic a : (II)Ljava/lang/String;
    //   3193: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3196: ifne -> 3206
    //   3199: goto -> 3206
    //   3202: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3205: athrow
    //   3206: aload #7
    //   3208: iconst_1
    //   3209: invokevirtual setAccessible : (Z)V
    //   3212: aload #7
    //   3214: aconst_null
    //   3215: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3218: pop
    //   3219: iinc #6, 1
    //   3222: iload_2
    //   3223: ifne -> 3084
    //   3226: sipush #-10411
    //   3229: sipush #-16216
    //   3232: invokestatic a : (II)Ljava/lang/String;
    //   3235: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3238: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3241: astore #4
    //   3243: aload #4
    //   3245: arraylength
    //   3246: istore #5
    //   3248: iconst_0
    //   3249: istore #6
    //   3251: iload #6
    //   3253: iload #5
    //   3255: if_icmpge -> 3391
    //   3258: aload #4
    //   3260: iload #6
    //   3262: aaload
    //   3263: astore #7
    //   3265: aload #7
    //   3267: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3270: pop
    //   3271: aload #7
    //   3273: invokevirtual getModifiers : ()I
    //   3276: invokestatic isStatic : (I)Z
    //   3279: ifeq -> 3377
    //   3282: aload #7
    //   3284: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3287: arraylength
    //   3288: iconst_2
    //   3289: if_icmpne -> 3377
    //   3292: goto -> 3299
    //   3295: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3298: athrow
    //   3299: aload #7
    //   3301: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3304: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3307: if_acmpne -> 3377
    //   3310: goto -> 3317
    //   3313: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3316: athrow
    //   3317: aload #7
    //   3319: iconst_1
    //   3320: invokevirtual setAccessible : (Z)V
    //   3323: aload #7
    //   3325: aconst_null
    //   3326: iconst_2
    //   3327: anewarray java/lang/Object
    //   3330: dup
    //   3331: iconst_0
    //   3332: aload_0
    //   3333: aastore
    //   3334: dup
    //   3335: iconst_1
    //   3336: aload_1
    //   3337: ifnonnull -> 3355
    //   3340: goto -> 3347
    //   3343: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3346: athrow
    //   3347: aload_1
    //   3348: goto -> 3362
    //   3351: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3354: athrow
    //   3355: aload_1
    //   3356: checkcast [B
    //   3359: invokevirtual clone : ()Ljava/lang/Object;
    //   3362: aastore
    //   3363: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3366: checkcast java/lang/Boolean
    //   3369: invokevirtual booleanValue : ()Z
    //   3372: istore_3
    //   3373: iload_2
    //   3374: ifne -> 3391
    //   3377: iinc #6, 1
    //   3380: iload_2
    //   3381: ifne -> 3251
    //   3384: goto -> 3391
    //   3387: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3390: athrow
    //   3391: iload_3
    //   3392: ifeq -> 3397
    //   3395: iload_3
    //   3396: ireturn
    //   3397: getstatic burp/Zxxd.Za : Ljava/lang/String;
    //   3400: getstatic burp/Zgr4.ZL : Ljava/lang/Object;
    //   3403: checkcast java/math/BigInteger
    //   3406: invokevirtual intValue : ()I
    //   3409: bipush #32
    //   3411: irem
    //   3412: invokestatic abs : (I)I
    //   3415: invokevirtual charAt : (I)C
    //   3418: getstatic burp/Zlbr.Zr : Ljava/lang/String;
    //   3421: getstatic burp/Zm4k.Zm : Ljava/lang/Object;
    //   3424: checkcast java/math/BigInteger
    //   3427: invokevirtual intValue : ()I
    //   3430: bipush #32
    //   3432: irem
    //   3433: invokestatic abs : (I)I
    //   3436: invokevirtual charAt : (I)C
    //   3439: if_icmpgt -> 3784
    //   3442: sipush #-10402
    //   3445: sipush #-2042
    //   3448: invokestatic a : (II)Ljava/lang/String;
    //   3451: iconst_1
    //   3452: ldc burp/Zb0z
    //   3454: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3457: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3460: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3463: astore #4
    //   3465: aload #4
    //   3467: arraylength
    //   3468: istore #5
    //   3470: iconst_0
    //   3471: istore #6
    //   3473: iload #6
    //   3475: iload #5
    //   3477: if_icmpge -> 3615
    //   3480: aload #4
    //   3482: iload #6
    //   3484: aaload
    //   3485: astore #7
    //   3487: aload #7
    //   3489: invokevirtual getModifiers : ()I
    //   3492: invokestatic isStatic : (I)Z
    //   3495: ifne -> 3505
    //   3498: goto -> 3608
    //   3501: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3504: athrow
    //   3505: aload #7
    //   3507: invokevirtual getType : ()Ljava/lang/Class;
    //   3510: astore #8
    //   3512: aload #8
    //   3514: ifnull -> 3595
    //   3517: aload #8
    //   3519: invokevirtual isPrimitive : ()Z
    //   3522: ifne -> 3595
    //   3525: goto -> 3532
    //   3528: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3531: athrow
    //   3532: aload #8
    //   3534: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3537: ifnull -> 3595
    //   3540: goto -> 3547
    //   3543: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3546: athrow
    //   3547: aload #8
    //   3549: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3552: invokevirtual getName : ()Ljava/lang/String;
    //   3555: ifnull -> 3595
    //   3558: goto -> 3565
    //   3561: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3564: athrow
    //   3565: aload #8
    //   3567: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3570: invokevirtual getName : ()Ljava/lang/String;
    //   3573: sipush #-10425
    //   3576: sipush #24588
    //   3579: invokestatic a : (II)Ljava/lang/String;
    //   3582: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3585: ifne -> 3595
    //   3588: goto -> 3595
    //   3591: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3594: athrow
    //   3595: aload #7
    //   3597: iconst_1
    //   3598: invokevirtual setAccessible : (Z)V
    //   3601: aload #7
    //   3603: aconst_null
    //   3604: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3607: pop
    //   3608: iinc #6, 1
    //   3611: iload_2
    //   3612: ifne -> 3473
    //   3615: sipush #-10415
    //   3618: sipush #-32507
    //   3621: invokestatic a : (II)Ljava/lang/String;
    //   3624: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3627: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3630: astore #4
    //   3632: aload #4
    //   3634: arraylength
    //   3635: istore #5
    //   3637: iconst_0
    //   3638: istore #6
    //   3640: iload #6
    //   3642: iload #5
    //   3644: if_icmpge -> 3780
    //   3647: aload #4
    //   3649: iload #6
    //   3651: aaload
    //   3652: astore #7
    //   3654: aload #7
    //   3656: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3659: pop
    //   3660: aload #7
    //   3662: invokevirtual getModifiers : ()I
    //   3665: invokestatic isStatic : (I)Z
    //   3668: ifeq -> 3766
    //   3671: aload #7
    //   3673: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3676: arraylength
    //   3677: iconst_2
    //   3678: if_icmpne -> 3766
    //   3681: goto -> 3688
    //   3684: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3687: athrow
    //   3688: aload #7
    //   3690: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3693: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3696: if_acmpne -> 3766
    //   3699: goto -> 3706
    //   3702: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3705: athrow
    //   3706: aload #7
    //   3708: iconst_1
    //   3709: invokevirtual setAccessible : (Z)V
    //   3712: aload #7
    //   3714: aconst_null
    //   3715: iconst_2
    //   3716: anewarray java/lang/Object
    //   3719: dup
    //   3720: iconst_0
    //   3721: aload_0
    //   3722: aastore
    //   3723: dup
    //   3724: iconst_1
    //   3725: aload_1
    //   3726: ifnonnull -> 3744
    //   3729: goto -> 3736
    //   3732: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3735: athrow
    //   3736: aload_1
    //   3737: goto -> 3751
    //   3740: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3743: athrow
    //   3744: aload_1
    //   3745: checkcast [B
    //   3748: invokevirtual clone : ()Ljava/lang/Object;
    //   3751: aastore
    //   3752: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3755: checkcast java/lang/Boolean
    //   3758: invokevirtual booleanValue : ()Z
    //   3761: istore_3
    //   3762: iload_2
    //   3763: ifne -> 3780
    //   3766: iinc #6, 1
    //   3769: iload_2
    //   3770: ifne -> 3640
    //   3773: goto -> 3780
    //   3776: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3779: athrow
    //   3780: iload_2
    //   3781: ifne -> 4122
    //   3784: sipush #-10417
    //   3787: sipush #-7095
    //   3790: invokestatic a : (II)Ljava/lang/String;
    //   3793: iconst_1
    //   3794: ldc burp/Zzpj
    //   3796: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3799: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3802: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3805: astore #4
    //   3807: aload #4
    //   3809: arraylength
    //   3810: istore #5
    //   3812: iconst_0
    //   3813: istore #6
    //   3815: iload #6
    //   3817: iload #5
    //   3819: if_icmpge -> 3957
    //   3822: aload #4
    //   3824: iload #6
    //   3826: aaload
    //   3827: astore #7
    //   3829: aload #7
    //   3831: invokevirtual getModifiers : ()I
    //   3834: invokestatic isStatic : (I)Z
    //   3837: ifne -> 3847
    //   3840: goto -> 3950
    //   3843: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3846: athrow
    //   3847: aload #7
    //   3849: invokevirtual getType : ()Ljava/lang/Class;
    //   3852: astore #8
    //   3854: aload #8
    //   3856: ifnull -> 3937
    //   3859: aload #8
    //   3861: invokevirtual isPrimitive : ()Z
    //   3864: ifne -> 3937
    //   3867: goto -> 3874
    //   3870: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3873: athrow
    //   3874: aload #8
    //   3876: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3879: ifnull -> 3937
    //   3882: goto -> 3889
    //   3885: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3888: athrow
    //   3889: aload #8
    //   3891: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3894: invokevirtual getName : ()Ljava/lang/String;
    //   3897: ifnull -> 3937
    //   3900: goto -> 3907
    //   3903: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3906: athrow
    //   3907: aload #8
    //   3909: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3912: invokevirtual getName : ()Ljava/lang/String;
    //   3915: sipush #-10425
    //   3918: sipush #24588
    //   3921: invokestatic a : (II)Ljava/lang/String;
    //   3924: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3927: ifne -> 3937
    //   3930: goto -> 3937
    //   3933: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3936: athrow
    //   3937: aload #7
    //   3939: iconst_1
    //   3940: invokevirtual setAccessible : (Z)V
    //   3943: aload #7
    //   3945: aconst_null
    //   3946: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3949: pop
    //   3950: iinc #6, 1
    //   3953: iload_2
    //   3954: ifne -> 3815
    //   3957: sipush #-10420
    //   3960: sipush #-17931
    //   3963: invokestatic a : (II)Ljava/lang/String;
    //   3966: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3969: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3972: astore #4
    //   3974: aload #4
    //   3976: arraylength
    //   3977: istore #5
    //   3979: iconst_0
    //   3980: istore #6
    //   3982: iload #6
    //   3984: iload #5
    //   3986: if_icmpge -> 4122
    //   3989: aload #4
    //   3991: iload #6
    //   3993: aaload
    //   3994: astore #7
    //   3996: aload #7
    //   3998: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4001: pop
    //   4002: aload #7
    //   4004: invokevirtual getModifiers : ()I
    //   4007: invokestatic isStatic : (I)Z
    //   4010: ifeq -> 4108
    //   4013: aload #7
    //   4015: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4018: arraylength
    //   4019: iconst_2
    //   4020: if_icmpne -> 4108
    //   4023: goto -> 4030
    //   4026: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4029: athrow
    //   4030: aload #7
    //   4032: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4035: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4038: if_acmpne -> 4108
    //   4041: goto -> 4048
    //   4044: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4047: athrow
    //   4048: aload #7
    //   4050: iconst_1
    //   4051: invokevirtual setAccessible : (Z)V
    //   4054: aload #7
    //   4056: aconst_null
    //   4057: iconst_2
    //   4058: anewarray java/lang/Object
    //   4061: dup
    //   4062: iconst_0
    //   4063: aload_0
    //   4064: aastore
    //   4065: dup
    //   4066: iconst_1
    //   4067: aload_1
    //   4068: ifnonnull -> 4086
    //   4071: goto -> 4078
    //   4074: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4077: athrow
    //   4078: aload_1
    //   4079: goto -> 4093
    //   4082: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4085: athrow
    //   4086: aload_1
    //   4087: checkcast [B
    //   4090: invokevirtual clone : ()Ljava/lang/Object;
    //   4093: aastore
    //   4094: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4097: checkcast java/lang/Boolean
    //   4100: invokevirtual booleanValue : ()Z
    //   4103: istore_3
    //   4104: iload_2
    //   4105: ifne -> 4122
    //   4108: iinc #6, 1
    //   4111: iload_2
    //   4112: ifne -> 3982
    //   4115: goto -> 4122
    //   4118: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4121: athrow
    //   4122: iload_3
    //   4123: ireturn
    //   4124: astore_3
    //   4125: new java/lang/Exception
    //   4128: dup
    //   4129: aload_3
    //   4130: invokevirtual getMessage : ()Ljava/lang/String;
    //   4133: invokespecial <init> : (Ljava/lang/String;)V
    //   4136: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1934	4124	java/lang/Throwable
    //   64	78	78	java/lang/Throwable
    //   89	102	105	java/lang/Throwable
    //   94	117	120	java/lang/Throwable
    //   109	135	138	java/lang/Throwable
    //   124	165	168	java/lang/Throwable
    //   228	255	258	java/lang/Throwable
    //   245	276	279	java/lang/Throwable
    //   262	306	309	java/lang/Throwable
    //   283	317	317	java/lang/Throwable
    //   328	344	347	java/lang/Throwable
    //   380	394	397	java/lang/Throwable
    //   387	408	411	java/lang/Throwable
    //   401	422	425	java/lang/Throwable
    //   415	436	439	java/lang/Throwable
    //   429	450	453	java/lang/Throwable
    //   443	464	467	java/lang/Throwable
    //   457	478	481	java/lang/Throwable
    //   471	492	495	java/lang/Throwable
    //   485	502	505	java/lang/Throwable
    //   541	555	558	java/lang/Throwable
    //   548	569	572	java/lang/Throwable
    //   562	583	586	java/lang/Throwable
    //   576	597	600	java/lang/Throwable
    //   590	611	614	java/lang/Throwable
    //   604	625	628	java/lang/Throwable
    //   618	639	642	java/lang/Throwable
    //   632	653	656	java/lang/Throwable
    //   646	670	673	java/lang/Throwable
    //   734	752	755	java/lang/Throwable
    //   743	768	771	java/lang/Throwable
    //   759	785	788	java/lang/Throwable
    //   775	801	804	java/lang/Throwable
    //   792	818	821	java/lang/Throwable
    //   808	834	837	java/lang/Throwable
    //   825	850	853	java/lang/Throwable
    //   841	873	876	java/lang/Throwable
    //   857	889	892	java/lang/Throwable
    //   880	905	908	java/lang/Throwable
    //   896	928	931	java/lang/Throwable
    //   912	944	947	java/lang/Throwable
    //   935	960	963	java/lang/Throwable
    //   951	979	982	java/lang/Throwable
    //   1109	1144	1147	java/lang/Throwable
    //   1151	1192	1195	java/lang/Throwable
    //   1295	1309	1309	java/lang/Throwable
    //   1320	1333	1336	java/lang/Throwable
    //   1325	1348	1351	java/lang/Throwable
    //   1340	1366	1369	java/lang/Throwable
    //   1355	1396	1399	java/lang/Throwable
    //   1462	1489	1492	java/lang/Throwable
    //   1479	1507	1510	java/lang/Throwable
    //   1496	1537	1540	java/lang/Throwable
    //   1514	1548	1548	java/lang/Throwable
    //   1570	1581	1584	java/lang/Throwable
    //   1636	1650	1650	java/lang/Throwable
    //   1661	1674	1677	java/lang/Throwable
    //   1666	1689	1692	java/lang/Throwable
    //   1681	1707	1710	java/lang/Throwable
    //   1696	1737	1740	java/lang/Throwable
    //   1803	1830	1833	java/lang/Throwable
    //   1820	1848	1851	java/lang/Throwable
    //   1837	1878	1881	java/lang/Throwable
    //   1855	1889	1889	java/lang/Throwable
    //   1911	1922	1925	java/lang/Throwable
    //   1935	2665	4124	java/lang/Throwable
    //   2025	2039	2039	java/lang/Throwable
    //   2050	2063	2066	java/lang/Throwable
    //   2055	2078	2081	java/lang/Throwable
    //   2070	2096	2099	java/lang/Throwable
    //   2085	2126	2129	java/lang/Throwable
    //   2192	2219	2222	java/lang/Throwable
    //   2209	2237	2240	java/lang/Throwable
    //   2226	2267	2270	java/lang/Throwable
    //   2244	2278	2278	java/lang/Throwable
    //   2300	2311	2314	java/lang/Throwable
    //   2367	2381	2381	java/lang/Throwable
    //   2392	2405	2408	java/lang/Throwable
    //   2397	2420	2423	java/lang/Throwable
    //   2412	2438	2441	java/lang/Throwable
    //   2427	2468	2471	java/lang/Throwable
    //   2534	2561	2564	java/lang/Throwable
    //   2551	2579	2582	java/lang/Throwable
    //   2568	2609	2612	java/lang/Throwable
    //   2586	2620	2620	java/lang/Throwable
    //   2642	2653	2656	java/lang/Throwable
    //   2666	3396	4124	java/lang/Throwable
    //   2756	2770	2770	java/lang/Throwable
    //   2781	2794	2797	java/lang/Throwable
    //   2786	2809	2812	java/lang/Throwable
    //   2801	2827	2830	java/lang/Throwable
    //   2816	2857	2860	java/lang/Throwable
    //   2923	2950	2953	java/lang/Throwable
    //   2940	2968	2971	java/lang/Throwable
    //   2957	2998	3001	java/lang/Throwable
    //   2975	3009	3009	java/lang/Throwable
    //   3031	3042	3045	java/lang/Throwable
    //   3098	3112	3112	java/lang/Throwable
    //   3123	3136	3139	java/lang/Throwable
    //   3128	3151	3154	java/lang/Throwable
    //   3143	3169	3172	java/lang/Throwable
    //   3158	3199	3202	java/lang/Throwable
    //   3265	3292	3295	java/lang/Throwable
    //   3282	3310	3313	java/lang/Throwable
    //   3299	3340	3343	java/lang/Throwable
    //   3317	3351	3351	java/lang/Throwable
    //   3373	3384	3387	java/lang/Throwable
    //   3397	4123	4124	java/lang/Throwable
    //   3487	3501	3501	java/lang/Throwable
    //   3512	3525	3528	java/lang/Throwable
    //   3517	3540	3543	java/lang/Throwable
    //   3532	3558	3561	java/lang/Throwable
    //   3547	3588	3591	java/lang/Throwable
    //   3654	3681	3684	java/lang/Throwable
    //   3671	3699	3702	java/lang/Throwable
    //   3688	3729	3732	java/lang/Throwable
    //   3706	3740	3740	java/lang/Throwable
    //   3762	3773	3776	java/lang/Throwable
    //   3829	3843	3843	java/lang/Throwable
    //   3854	3867	3870	java/lang/Throwable
    //   3859	3882	3885	java/lang/Throwable
    //   3874	3900	3903	java/lang/Throwable
    //   3889	3930	3933	java/lang/Throwable
    //   3996	4023	4026	java/lang/Throwable
    //   4013	4041	4044	java/lang/Throwable
    //   4030	4071	4074	java/lang/Throwable
    //   4048	4082	4082	java/lang/Throwable
    //   4104	4115	4118	java/lang/Throwable
  }
  
  static {
    // Byte code:
    //   0: bipush #25
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'L&.( ï\\tÝ³Q¤5Hã\\tC\\fùkíPþ\\tÆ±IÜû¦Ù! ¤ÈÄª½4K£®õæ2?ySé¾Î\\fÊgcäf:U\\tÖ3K»¬À8Æ\\tx¼}¢>\\tü.Æc`\\t"ÕXh6£iÐ\\tÓë¯SsÍ\\t¢íÅWj×ôK\\tÄprÜs ôMLÊ¶ú¶Kø ñgzW®¢í·È¶Âæ¹¶µkZ^Ä÷g¯u+H*hUi·{`¦E$w*@3'/Uðd¨0?hàÓ°â«ï\\t®D¸Z*êúD\\tIÆ¸2Å{\\tÝv\\t0\\fk P ¬¬\\tX`áÞj\\tOûxÝ\\t/t\\n\|-{ 6gßm¨äFÔdá0h¡`jk¦\ç²@s=>\\r<@\\tH\\tËÁD9\\tú¯ÎÞÑj'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #52
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 142
    //   39: aload #5
    //   41: swap
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: swap
    //   47: aastore
    //   48: iload_0
    //   49: iload_1
    //   50: iadd
    //   51: dup
    //   52: istore_0
    //   53: iload #4
    //   55: if_icmpge -> 67
    //   58: aload_2
    //   59: iload_0
    //   60: invokevirtual charAt : (I)C
    //   63: istore_1
    //   64: goto -> 22
    //   67: ldc 'Î'd¶GK:\\t7'¾¶KQ'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #9
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #30
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
    //   128: putstatic burp/Zmd.a : [Ljava/lang/String;
    //   131: bipush #25
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zmd.b : [Ljava/lang/String;
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
    //   212: bipush #106
    //   214: goto -> 244
    //   217: bipush #109
    //   219: goto -> 244
    //   222: bipush #50
    //   224: goto -> 244
    //   227: bipush #94
    //   229: goto -> 244
    //   232: bipush #52
    //   234: goto -> 244
    //   237: bipush #96
    //   239: goto -> 244
    //   242: bipush #28
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
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: sipush #-10429
    //   303: sipush #23379
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zmd.Zf : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: bipush #32
    //   318: newarray byte
    //   320: dup
    //   321: iconst_0
    //   322: bipush #22
    //   324: bastore
    //   325: dup
    //   326: iconst_1
    //   327: iconst_5
    //   328: bastore
    //   329: dup
    //   330: iconst_2
    //   331: bipush #17
    //   333: bastore
    //   334: dup
    //   335: iconst_3
    //   336: bipush #122
    //   338: bastore
    //   339: dup
    //   340: iconst_4
    //   341: bipush #-7
    //   343: bastore
    //   344: dup
    //   345: iconst_5
    //   346: bipush #58
    //   348: bastore
    //   349: dup
    //   350: bipush #6
    //   352: bipush #-30
    //   354: bastore
    //   355: dup
    //   356: bipush #7
    //   358: bipush #90
    //   360: bastore
    //   361: dup
    //   362: bipush #8
    //   364: bipush #-57
    //   366: bastore
    //   367: dup
    //   368: bipush #9
    //   370: bipush #-120
    //   372: bastore
    //   373: dup
    //   374: bipush #10
    //   376: bipush #-26
    //   378: bastore
    //   379: dup
    //   380: bipush #11
    //   382: bipush #-43
    //   384: bastore
    //   385: dup
    //   386: bipush #12
    //   388: bipush #-7
    //   390: bastore
    //   391: dup
    //   392: bipush #13
    //   394: bipush #-48
    //   396: bastore
    //   397: dup
    //   398: bipush #14
    //   400: bipush #27
    //   402: bastore
    //   403: dup
    //   404: bipush #15
    //   406: bipush #6
    //   408: bastore
    //   409: dup
    //   410: bipush #16
    //   412: bipush #-117
    //   414: bastore
    //   415: dup
    //   416: bipush #17
    //   418: bipush #-37
    //   420: bastore
    //   421: dup
    //   422: bipush #18
    //   424: bipush #63
    //   426: bastore
    //   427: dup
    //   428: bipush #19
    //   430: bipush #-36
    //   432: bastore
    //   433: dup
    //   434: bipush #20
    //   436: bipush #78
    //   438: bastore
    //   439: dup
    //   440: bipush #21
    //   442: bipush #-79
    //   444: bastore
    //   445: dup
    //   446: bipush #22
    //   448: bipush #-88
    //   450: bastore
    //   451: dup
    //   452: bipush #23
    //   454: bipush #-69
    //   456: bastore
    //   457: dup
    //   458: bipush #24
    //   460: bipush #-32
    //   462: bastore
    //   463: dup
    //   464: bipush #25
    //   466: bipush #8
    //   468: bastore
    //   469: dup
    //   470: bipush #26
    //   472: bipush #80
    //   474: bastore
    //   475: dup
    //   476: bipush #27
    //   478: bipush #53
    //   480: bastore
    //   481: dup
    //   482: bipush #28
    //   484: bipush #37
    //   486: bastore
    //   487: dup
    //   488: bipush #29
    //   490: bipush #-121
    //   492: bastore
    //   493: dup
    //   494: bipush #30
    //   496: bipush #-48
    //   498: bastore
    //   499: dup
    //   500: bipush #31
    //   502: bipush #18
    //   504: bastore
    //   505: invokespecial <init> : ([B)V
    //   508: putstatic burp/Zmd.ZU : Ljava/lang/Object;
    //   511: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFD746) & 0xFFFF;
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
      byte b1 = 118;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */