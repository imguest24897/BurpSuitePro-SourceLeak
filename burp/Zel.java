package burp;

import java.math.BigInteger;

class Zel extends ClassLoader {
  static String Zi;
  
  static Object ZB;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZX(Object paramObject) {
    Ze6d.Zx = a(5868, 28346);
    Ze6d.Zw = new BigInteger(a(5867, 21185));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zs0_.ZH.charAt(Math.abs(((BigInteger)Ze_t.Za).intValue() % 32)) <= Zt9_.Zf.charAt(Math.abs(((BigInteger)Zrva.ZE).intValue() % 32))) {
          try {
            Zkfz.ZP(Class.forName(a(5870, 14690)));
            if (!bool)
              Zgq_.Zv(Class.forName(a(5869, 12216))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zgq_.Zv(Class.forName(a(5869, 12216)));
    } catch (Throwable throwable) {}
  }
  
  static boolean Zv(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zs83.ZT : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zzmw.ZS : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zxo7.Zi : Ljava/lang/Object;
    //   22: sipush #5865
    //   25: sipush #24500
    //   28: invokestatic a : (II)Ljava/lang/String;
    //   31: iconst_1
    //   32: ldc burp/Zzh1
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
    //   150: sipush #5864
    //   153: sipush #-20857
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
    //   192: sipush #5866
    //   195: sipush #-25757
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
    //   351: getstatic burp/Zs8s.ZG : Ljava/lang/Object;
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
    //   1203: getstatic burp/Zr2i.Z_ : Ljava/lang/String;
    //   1206: getstatic burp/Zt3p.ZO : Ljava/lang/Object;
    //   1209: checkcast java/math/BigInteger
    //   1212: invokevirtual intValue : ()I
    //   1215: bipush #32
    //   1217: irem
    //   1218: invokestatic abs : (I)I
    //   1221: invokevirtual charAt : (I)C
    //   1224: getstatic burp/Zt9_.Zf : Ljava/lang/String;
    //   1227: getstatic burp/Zt5j.Zn : Ljava/lang/Object;
    //   1230: checkcast java/math/BigInteger
    //   1233: invokevirtual intValue : ()I
    //   1236: bipush #32
    //   1238: irem
    //   1239: invokestatic abs : (I)I
    //   1242: invokevirtual charAt : (I)C
    //   1245: if_icmpgt -> 1352
    //   1248: getstatic burp/Zgqi.Zv : Ljava/lang/String;
    //   1251: getstatic burp/Zm6h.ZB : Ljava/lang/Object;
    //   1254: checkcast java/math/BigInteger
    //   1257: invokevirtual intValue : ()I
    //   1260: bipush #32
    //   1262: irem
    //   1263: invokestatic abs : (I)I
    //   1266: invokevirtual charAt : (I)C
    //   1269: getstatic burp/Zest.Zd : Ljava/lang/String;
    //   1272: getstatic burp/Zm6h.ZB : Ljava/lang/Object;
    //   1275: checkcast java/math/BigInteger
    //   1278: invokevirtual intValue : ()I
    //   1281: bipush #32
    //   1283: irem
    //   1284: invokestatic abs : (I)I
    //   1287: invokevirtual charAt : (I)C
    //   1290: if_icmple -> 1352
    //   1293: goto -> 1300
    //   1296: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1299: athrow
    //   1300: getstatic burp/Zl50.Zm : Ljava/lang/String;
    //   1303: getstatic burp/Zk12.Zh : Ljava/lang/Object;
    //   1306: checkcast java/math/BigInteger
    //   1309: invokevirtual intValue : ()I
    //   1312: bipush #32
    //   1314: irem
    //   1315: invokestatic abs : (I)I
    //   1318: invokevirtual charAt : (I)C
    //   1321: getstatic burp/Ze5t.ZX : Ljava/lang/String;
    //   1324: getstatic burp/Zxjv.ZY : Ljava/lang/Object;
    //   1327: checkcast java/math/BigInteger
    //   1330: invokevirtual intValue : ()I
    //   1333: bipush #32
    //   1335: irem
    //   1336: invokestatic abs : (I)I
    //   1339: invokevirtual charAt : (I)C
    //   1342: if_icmple -> 1360
    //   1345: goto -> 1352
    //   1348: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1351: athrow
    //   1352: iconst_1
    //   1353: goto -> 1361
    //   1356: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1359: athrow
    //   1360: iconst_0
    //   1361: ireturn
    //   1362: astore_3
    //   1363: new java/lang/Exception
    //   1366: dup
    //   1367: aload_3
    //   1368: invokevirtual getMessage : ()Ljava/lang/String;
    //   1371: invokespecial <init> : (Ljava/lang/String;)V
    //   1374: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1361	1362	java/lang/Throwable
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
    //   1203	1293	1296	java/lang/Throwable
    //   1248	1345	1348	java/lang/Throwable
    //   1300	1356	1356	java/lang/Throwable
  }
  
  static void ZT(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '<ÊAÝÜ^0Að\\b?Ö¼|[6çL£»~}9ö\\tymè2Ð\\tûKÖ,8P Xý¤°¸ÎÖ @ôwv\\t_N$£H¥°=®è|X\\tï+T h7 '
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #32
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #80
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
    //   68: ldc '±`zçXuvMÿB­Ag¡¯ã'|¹îéWdÖí+Tð:1=§¸ªQË|ßdwÒ(ÿô°\\t¶:r¦÷Ïþk^-Ñ\\bnÊ¯'f'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #88
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
    //   129: putstatic burp/Zel.a : [Ljava/lang/String;
    //   132: bipush #8
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zel.b : [Ljava/lang/String;
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
    //   212: bipush #77
    //   214: goto -> 244
    //   217: bipush #53
    //   219: goto -> 244
    //   222: bipush #6
    //   224: goto -> 244
    //   227: bipush #18
    //   229: goto -> 244
    //   232: bipush #106
    //   234: goto -> 244
    //   237: bipush #34
    //   239: goto -> 244
    //   242: bipush #25
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
    //   300: sipush #5871
    //   303: sipush #19196
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zel.Zi : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: bipush #32
    //   318: newarray byte
    //   320: dup
    //   321: iconst_0
    //   322: bipush #126
    //   324: bastore
    //   325: dup
    //   326: iconst_1
    //   327: bipush #62
    //   329: bastore
    //   330: dup
    //   331: iconst_2
    //   332: bipush #-96
    //   334: bastore
    //   335: dup
    //   336: iconst_3
    //   337: bipush #23
    //   339: bastore
    //   340: dup
    //   341: iconst_4
    //   342: bipush #32
    //   344: bastore
    //   345: dup
    //   346: iconst_5
    //   347: bipush #-52
    //   349: bastore
    //   350: dup
    //   351: bipush #6
    //   353: bipush #110
    //   355: bastore
    //   356: dup
    //   357: bipush #7
    //   359: bipush #-112
    //   361: bastore
    //   362: dup
    //   363: bipush #8
    //   365: bipush #122
    //   367: bastore
    //   368: dup
    //   369: bipush #9
    //   371: bipush #-40
    //   373: bastore
    //   374: dup
    //   375: bipush #10
    //   377: bipush #-7
    //   379: bastore
    //   380: dup
    //   381: bipush #11
    //   383: bipush #28
    //   385: bastore
    //   386: dup
    //   387: bipush #12
    //   389: bipush #-101
    //   391: bastore
    //   392: dup
    //   393: bipush #13
    //   395: bipush #-121
    //   397: bastore
    //   398: dup
    //   399: bipush #14
    //   401: bipush #-66
    //   403: bastore
    //   404: dup
    //   405: bipush #15
    //   407: bipush #-31
    //   409: bastore
    //   410: dup
    //   411: bipush #16
    //   413: bipush #-112
    //   415: bastore
    //   416: dup
    //   417: bipush #17
    //   419: bipush #-50
    //   421: bastore
    //   422: dup
    //   423: bipush #18
    //   425: bipush #77
    //   427: bastore
    //   428: dup
    //   429: bipush #19
    //   431: bipush #117
    //   433: bastore
    //   434: dup
    //   435: bipush #20
    //   437: bipush #41
    //   439: bastore
    //   440: dup
    //   441: bipush #21
    //   443: bipush #-82
    //   445: bastore
    //   446: dup
    //   447: bipush #22
    //   449: bipush #-52
    //   451: bastore
    //   452: dup
    //   453: bipush #23
    //   455: bipush #-103
    //   457: bastore
    //   458: dup
    //   459: bipush #24
    //   461: bipush #-5
    //   463: bastore
    //   464: dup
    //   465: bipush #25
    //   467: bipush #36
    //   469: bastore
    //   470: dup
    //   471: bipush #26
    //   473: bipush #75
    //   475: bastore
    //   476: dup
    //   477: bipush #27
    //   479: bipush #-14
    //   481: bastore
    //   482: dup
    //   483: bipush #28
    //   485: bipush #117
    //   487: bastore
    //   488: dup
    //   489: bipush #29
    //   491: bipush #-77
    //   493: bastore
    //   494: dup
    //   495: bipush #30
    //   497: bipush #38
    //   499: bastore
    //   500: dup
    //   501: bipush #31
    //   503: bipush #-100
    //   505: bastore
    //   506: invokespecial <init> : ([B)V
    //   509: putstatic burp/Zel.ZB : Ljava/lang/Object;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x16EC) & 0xFFFF;
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
      char c = 'Î';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zel.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */