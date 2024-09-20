package burp;

import java.math.BigInteger;

class Zt9f extends ClassLoader {
  static Object Zl;
  
  static String Zg;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zg(Object paramObject) {
    Zzyb.Zh = a(10674, 18482);
    Zzyb.ZV = new BigInteger(a(10659, 14832));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zgsb.ZM.charAt(Math.abs(((BigInteger)Zscz.ZN).intValue() % 32)) <= Zkdq.ZZ.charAt(Math.abs(((BigInteger)Zlt1.ZH).intValue() % 32))) {
          try {
            Zxoa.Ze(Class.forName(a(10673, -11722)));
            if (bool)
              Zsu2.ZP(Class.forName(a(10682, 12954))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zsu2.ZP(Class.forName(a(10682, 12954)));
    } catch (Throwable throwable) {}
  }
  
  static boolean ZA(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zb6m.ZQ : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zbwj.ZW : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zxxo.ZJ : Ljava/lang/Object;
    //   22: sipush #10672
    //   25: sipush #18844
    //   28: invokestatic a : (II)Ljava/lang/String;
    //   31: iconst_1
    //   32: ldc burp/Zxd0
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
    //   150: sipush #10686
    //   153: sipush #25939
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
    //   192: sipush #10680
    //   195: sipush #-9383
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
    //   351: getstatic burp/Zzmc.Zg : Ljava/lang/Object;
    //   354: checkcast java/math/BigInteger
    //   357: invokevirtual toByteArray : ()[B
    //   360: astore_3
    //   361: bipush #32
    //   363: newarray int
    //   365: dup
    //   366: iconst_0
    //   367: ldc 943331329
    //   369: iastore
    //   370: dup
    //   371: iconst_1
    //   372: ldc 170788368
    //   374: iastore
    //   375: dup
    //   376: iconst_2
    //   377: ldc 1008414755
    //   379: iastore
    //   380: dup
    //   381: iconst_3
    //   382: ldc 187049985
    //   384: iastore
    //   385: dup
    //   386: iconst_4
    //   387: ldc 1010368540
    //   389: iastore
    //   390: dup
    //   391: iconst_5
    //   392: ldc 220604441
    //   394: iastore
    //   395: dup
    //   396: bipush #6
    //   398: ldc 940377620
    //   400: iastore
    //   401: dup
    //   402: bipush #7
    //   404: ldc 255209728
    //   406: iastore
    //   407: dup
    //   408: bipush #8
    //   410: ldc 689771012
    //   412: iastore
    //   413: dup
    //   414: bipush #9
    //   416: ldc 221709344
    //   418: iastore
    //   419: dup
    //   420: bipush #10
    //   422: ldc 957157408
    //   424: iastore
    //   425: dup
    //   426: bipush #11
    //   428: ldc 892536332
    //   430: iastore
    //   431: dup
    //   432: bipush #12
    //   434: ldc 722417666
    //   436: iastore
    //   437: dup
    //   438: bipush #13
    //   440: ldc 1026621720
    //   442: iastore
    //   443: dup
    //   444: bipush #14
    //   446: ldc 655302664
    //   448: iastore
    //   449: dup
    //   450: bipush #15
    //   452: ldc 890966315
    //   454: iastore
    //   455: dup
    //   456: bipush #16
    //   458: ldc 187632156
    //   460: iastore
    //   461: dup
    //   462: bipush #17
    //   464: ldc 874189824
    //   466: iastore
    //   467: dup
    //   468: bipush #18
    //   470: ldc 254150144
    //   472: iastore
    //   473: dup
    //   474: bipush #19
    //   476: ldc 924386310
    //   478: iastore
    //   479: dup
    //   480: bipush #20
    //   482: ldc 121057538
    //   484: iastore
    //   485: dup
    //   486: bipush #21
    //   488: ldc 840500228
    //   490: iastore
    //   491: dup
    //   492: bipush #22
    //   494: ldc 389160971
    //   496: iastore
    //   497: dup
    //   498: bipush #23
    //   500: ldc 907870729
    //   502: iastore
    //   503: dup
    //   504: bipush #24
    //   506: ldc 389426184
    //   508: iastore
    //   509: dup
    //   510: bipush #25
    //   512: ldc 973875457
    //   514: iastore
    //   515: dup
    //   516: bipush #26
    //   518: ldc 372376604
    //   520: iastore
    //   521: dup
    //   522: bipush #27
    //   524: ldc 707731490
    //   526: iastore
    //   527: dup
    //   528: bipush #28
    //   530: ldc 1043334948
    //   532: iastore
    //   533: dup
    //   534: bipush #29
    //   536: ldc 439222784
    //   538: iastore
    //   539: dup
    //   540: bipush #30
    //   542: ldc 876216579
    //   544: iastore
    //   545: dup
    //   546: bipush #31
    //   548: ldc 455999525
    //   550: iastore
    //   551: astore #5
    //   553: bipush #8
    //   555: aload_3
    //   556: arraylength
    //   557: bipush #8
    //   559: irem
    //   560: isub
    //   561: istore #6
    //   563: aload_3
    //   564: arraylength
    //   565: iload #6
    //   567: iadd
    //   568: newarray byte
    //   570: astore #7
    //   572: iconst_0
    //   573: istore #8
    //   575: iload #8
    //   577: aload_3
    //   578: arraylength
    //   579: if_icmpge -> 598
    //   582: aload #7
    //   584: iload #8
    //   586: aload_3
    //   587: iload #8
    //   589: baload
    //   590: bastore
    //   591: iinc #8, 1
    //   594: iload_2
    //   595: ifne -> 575
    //   598: aload_3
    //   599: arraylength
    //   600: istore #8
    //   602: iload #8
    //   604: aload #7
    //   606: arraylength
    //   607: if_icmpge -> 625
    //   610: aload #7
    //   612: iload #8
    //   614: iload #6
    //   616: i2b
    //   617: bastore
    //   618: iinc #8, 1
    //   621: iload_2
    //   622: ifne -> 602
    //   625: aload #7
    //   627: astore_3
    //   628: bipush #64
    //   630: newarray int
    //   632: dup
    //   633: iconst_0
    //   634: ldc 16843776
    //   636: iastore
    //   637: dup
    //   638: iconst_1
    //   639: iconst_0
    //   640: iastore
    //   641: dup
    //   642: iconst_2
    //   643: ldc 65536
    //   645: iastore
    //   646: dup
    //   647: iconst_3
    //   648: ldc 16843780
    //   650: iastore
    //   651: dup
    //   652: iconst_4
    //   653: ldc 16842756
    //   655: iastore
    //   656: dup
    //   657: iconst_5
    //   658: ldc 66564
    //   660: iastore
    //   661: dup
    //   662: bipush #6
    //   664: iconst_4
    //   665: iastore
    //   666: dup
    //   667: bipush #7
    //   669: ldc 65536
    //   671: iastore
    //   672: dup
    //   673: bipush #8
    //   675: sipush #1024
    //   678: iastore
    //   679: dup
    //   680: bipush #9
    //   682: ldc 16843776
    //   684: iastore
    //   685: dup
    //   686: bipush #10
    //   688: ldc 16843780
    //   690: iastore
    //   691: dup
    //   692: bipush #11
    //   694: sipush #1024
    //   697: iastore
    //   698: dup
    //   699: bipush #12
    //   701: ldc 16778244
    //   703: iastore
    //   704: dup
    //   705: bipush #13
    //   707: ldc 16842756
    //   709: iastore
    //   710: dup
    //   711: bipush #14
    //   713: ldc 16777216
    //   715: iastore
    //   716: dup
    //   717: bipush #15
    //   719: iconst_4
    //   720: iastore
    //   721: dup
    //   722: bipush #16
    //   724: sipush #1028
    //   727: iastore
    //   728: dup
    //   729: bipush #17
    //   731: ldc 16778240
    //   733: iastore
    //   734: dup
    //   735: bipush #18
    //   737: ldc 16778240
    //   739: iastore
    //   740: dup
    //   741: bipush #19
    //   743: ldc 66560
    //   745: iastore
    //   746: dup
    //   747: bipush #20
    //   749: ldc 66560
    //   751: iastore
    //   752: dup
    //   753: bipush #21
    //   755: ldc 16842752
    //   757: iastore
    //   758: dup
    //   759: bipush #22
    //   761: ldc 16842752
    //   763: iastore
    //   764: dup
    //   765: bipush #23
    //   767: ldc 16778244
    //   769: iastore
    //   770: dup
    //   771: bipush #24
    //   773: ldc 65540
    //   775: iastore
    //   776: dup
    //   777: bipush #25
    //   779: ldc 16777220
    //   781: iastore
    //   782: dup
    //   783: bipush #26
    //   785: ldc 16777220
    //   787: iastore
    //   788: dup
    //   789: bipush #27
    //   791: ldc 65540
    //   793: iastore
    //   794: dup
    //   795: bipush #28
    //   797: iconst_0
    //   798: iastore
    //   799: dup
    //   800: bipush #29
    //   802: sipush #1028
    //   805: iastore
    //   806: dup
    //   807: bipush #30
    //   809: ldc 66564
    //   811: iastore
    //   812: dup
    //   813: bipush #31
    //   815: ldc 16777216
    //   817: iastore
    //   818: dup
    //   819: bipush #32
    //   821: ldc 65536
    //   823: iastore
    //   824: dup
    //   825: bipush #33
    //   827: ldc 16843780
    //   829: iastore
    //   830: dup
    //   831: bipush #34
    //   833: iconst_4
    //   834: iastore
    //   835: dup
    //   836: bipush #35
    //   838: ldc 16842752
    //   840: iastore
    //   841: dup
    //   842: bipush #36
    //   844: ldc 16843776
    //   846: iastore
    //   847: dup
    //   848: bipush #37
    //   850: ldc 16777216
    //   852: iastore
    //   853: dup
    //   854: bipush #38
    //   856: ldc 16777216
    //   858: iastore
    //   859: dup
    //   860: bipush #39
    //   862: sipush #1024
    //   865: iastore
    //   866: dup
    //   867: bipush #40
    //   869: ldc 16842756
    //   871: iastore
    //   872: dup
    //   873: bipush #41
    //   875: ldc 65536
    //   877: iastore
    //   878: dup
    //   879: bipush #42
    //   881: ldc 66560
    //   883: iastore
    //   884: dup
    //   885: bipush #43
    //   887: ldc 16777220
    //   889: iastore
    //   890: dup
    //   891: bipush #44
    //   893: sipush #1024
    //   896: iastore
    //   897: dup
    //   898: bipush #45
    //   900: iconst_4
    //   901: iastore
    //   902: dup
    //   903: bipush #46
    //   905: ldc 16778244
    //   907: iastore
    //   908: dup
    //   909: bipush #47
    //   911: ldc 66564
    //   913: iastore
    //   914: dup
    //   915: bipush #48
    //   917: ldc 16843780
    //   919: iastore
    //   920: dup
    //   921: bipush #49
    //   923: ldc 65540
    //   925: iastore
    //   926: dup
    //   927: bipush #50
    //   929: ldc 16842752
    //   931: iastore
    //   932: dup
    //   933: bipush #51
    //   935: ldc 16778244
    //   937: iastore
    //   938: dup
    //   939: bipush #52
    //   941: ldc 16777220
    //   943: iastore
    //   944: dup
    //   945: bipush #53
    //   947: sipush #1028
    //   950: iastore
    //   951: dup
    //   952: bipush #54
    //   954: ldc 66564
    //   956: iastore
    //   957: dup
    //   958: bipush #55
    //   960: ldc 16843776
    //   962: iastore
    //   963: dup
    //   964: bipush #56
    //   966: sipush #1028
    //   969: iastore
    //   970: dup
    //   971: bipush #57
    //   973: ldc 16778240
    //   975: iastore
    //   976: dup
    //   977: bipush #58
    //   979: ldc 16778240
    //   981: iastore
    //   982: dup
    //   983: bipush #59
    //   985: iconst_0
    //   986: iastore
    //   987: dup
    //   988: bipush #60
    //   990: ldc 65540
    //   992: iastore
    //   993: dup
    //   994: bipush #61
    //   996: ldc 66560
    //   998: iastore
    //   999: dup
    //   1000: bipush #62
    //   1002: iconst_0
    //   1003: iastore
    //   1004: dup
    //   1005: bipush #63
    //   1007: ldc 16842756
    //   1009: iastore
    //   1010: astore #8
    //   1012: bipush #64
    //   1014: newarray int
    //   1016: dup
    //   1017: iconst_0
    //   1018: ldc -2146402272
    //   1020: iastore
    //   1021: dup
    //   1022: iconst_1
    //   1023: ldc -2147450880
    //   1025: iastore
    //   1026: dup
    //   1027: iconst_2
    //   1028: ldc 32768
    //   1030: iastore
    //   1031: dup
    //   1032: iconst_3
    //   1033: ldc 1081376
    //   1035: iastore
    //   1036: dup
    //   1037: iconst_4
    //   1038: ldc 1048576
    //   1040: iastore
    //   1041: dup
    //   1042: iconst_5
    //   1043: bipush #32
    //   1045: iastore
    //   1046: dup
    //   1047: bipush #6
    //   1049: ldc -2146435040
    //   1051: iastore
    //   1052: dup
    //   1053: bipush #7
    //   1055: ldc -2147450848
    //   1057: iastore
    //   1058: dup
    //   1059: bipush #8
    //   1061: ldc -2147483616
    //   1063: iastore
    //   1064: dup
    //   1065: bipush #9
    //   1067: ldc -2146402272
    //   1069: iastore
    //   1070: dup
    //   1071: bipush #10
    //   1073: ldc -2146402304
    //   1075: iastore
    //   1076: dup
    //   1077: bipush #11
    //   1079: ldc -2147483648
    //   1081: iastore
    //   1082: dup
    //   1083: bipush #12
    //   1085: ldc -2147450880
    //   1087: iastore
    //   1088: dup
    //   1089: bipush #13
    //   1091: ldc 1048576
    //   1093: iastore
    //   1094: dup
    //   1095: bipush #14
    //   1097: bipush #32
    //   1099: iastore
    //   1100: dup
    //   1101: bipush #15
    //   1103: ldc -2146435040
    //   1105: iastore
    //   1106: dup
    //   1107: bipush #16
    //   1109: ldc 1081344
    //   1111: iastore
    //   1112: dup
    //   1113: bipush #17
    //   1115: ldc 1048608
    //   1117: iastore
    //   1118: dup
    //   1119: bipush #18
    //   1121: ldc -2147450848
    //   1123: iastore
    //   1124: dup
    //   1125: bipush #19
    //   1127: iconst_0
    //   1128: iastore
    //   1129: dup
    //   1130: bipush #20
    //   1132: ldc -2147483648
    //   1134: iastore
    //   1135: dup
    //   1136: bipush #21
    //   1138: ldc 32768
    //   1140: iastore
    //   1141: dup
    //   1142: bipush #22
    //   1144: ldc 1081376
    //   1146: iastore
    //   1147: dup
    //   1148: bipush #23
    //   1150: ldc -2146435072
    //   1152: iastore
    //   1153: dup
    //   1154: bipush #24
    //   1156: ldc 1048608
    //   1158: iastore
    //   1159: dup
    //   1160: bipush #25
    //   1162: ldc -2147483616
    //   1164: iastore
    //   1165: dup
    //   1166: bipush #26
    //   1168: iconst_0
    //   1169: iastore
    //   1170: dup
    //   1171: bipush #27
    //   1173: ldc 1081344
    //   1175: iastore
    //   1176: dup
    //   1177: bipush #28
    //   1179: ldc 32800
    //   1181: iastore
    //   1182: dup
    //   1183: bipush #29
    //   1185: ldc -2146402304
    //   1187: iastore
    //   1188: dup
    //   1189: bipush #30
    //   1191: ldc -2146435072
    //   1193: iastore
    //   1194: dup
    //   1195: bipush #31
    //   1197: ldc 32800
    //   1199: iastore
    //   1200: dup
    //   1201: bipush #32
    //   1203: iconst_0
    //   1204: iastore
    //   1205: dup
    //   1206: bipush #33
    //   1208: ldc 1081376
    //   1210: iastore
    //   1211: dup
    //   1212: bipush #34
    //   1214: ldc -2146435040
    //   1216: iastore
    //   1217: dup
    //   1218: bipush #35
    //   1220: ldc 1048576
    //   1222: iastore
    //   1223: dup
    //   1224: bipush #36
    //   1226: ldc -2147450848
    //   1228: iastore
    //   1229: dup
    //   1230: bipush #37
    //   1232: ldc -2146435072
    //   1234: iastore
    //   1235: dup
    //   1236: bipush #38
    //   1238: ldc -2146402304
    //   1240: iastore
    //   1241: dup
    //   1242: bipush #39
    //   1244: ldc 32768
    //   1246: iastore
    //   1247: dup
    //   1248: bipush #40
    //   1250: ldc -2146435072
    //   1252: iastore
    //   1253: dup
    //   1254: bipush #41
    //   1256: ldc -2147450880
    //   1258: iastore
    //   1259: dup
    //   1260: bipush #42
    //   1262: bipush #32
    //   1264: iastore
    //   1265: dup
    //   1266: bipush #43
    //   1268: ldc -2146402272
    //   1270: iastore
    //   1271: dup
    //   1272: bipush #44
    //   1274: ldc 1081376
    //   1276: iastore
    //   1277: dup
    //   1278: bipush #45
    //   1280: bipush #32
    //   1282: iastore
    //   1283: dup
    //   1284: bipush #46
    //   1286: ldc 32768
    //   1288: iastore
    //   1289: dup
    //   1290: bipush #47
    //   1292: ldc -2147483648
    //   1294: iastore
    //   1295: dup
    //   1296: bipush #48
    //   1298: ldc 32800
    //   1300: iastore
    //   1301: dup
    //   1302: bipush #49
    //   1304: ldc -2146402304
    //   1306: iastore
    //   1307: dup
    //   1308: bipush #50
    //   1310: ldc 1048576
    //   1312: iastore
    //   1313: dup
    //   1314: bipush #51
    //   1316: ldc -2147483616
    //   1318: iastore
    //   1319: dup
    //   1320: bipush #52
    //   1322: ldc 1048608
    //   1324: iastore
    //   1325: dup
    //   1326: bipush #53
    //   1328: ldc -2147450848
    //   1330: iastore
    //   1331: dup
    //   1332: bipush #54
    //   1334: ldc -2147483616
    //   1336: iastore
    //   1337: dup
    //   1338: bipush #55
    //   1340: ldc 1048608
    //   1342: iastore
    //   1343: dup
    //   1344: bipush #56
    //   1346: ldc 1081344
    //   1348: iastore
    //   1349: dup
    //   1350: bipush #57
    //   1352: iconst_0
    //   1353: iastore
    //   1354: dup
    //   1355: bipush #58
    //   1357: ldc -2147450880
    //   1359: iastore
    //   1360: dup
    //   1361: bipush #59
    //   1363: ldc 32800
    //   1365: iastore
    //   1366: dup
    //   1367: bipush #60
    //   1369: ldc -2147483648
    //   1371: iastore
    //   1372: dup
    //   1373: bipush #61
    //   1375: ldc -2146435040
    //   1377: iastore
    //   1378: dup
    //   1379: bipush #62
    //   1381: ldc -2146402272
    //   1383: iastore
    //   1384: dup
    //   1385: bipush #63
    //   1387: ldc 1081344
    //   1389: iastore
    //   1390: astore #9
    //   1392: bipush #64
    //   1394: newarray int
    //   1396: dup
    //   1397: iconst_0
    //   1398: sipush #520
    //   1401: iastore
    //   1402: dup
    //   1403: iconst_1
    //   1404: ldc 134349312
    //   1406: iastore
    //   1407: dup
    //   1408: iconst_2
    //   1409: iconst_0
    //   1410: iastore
    //   1411: dup
    //   1412: iconst_3
    //   1413: ldc 134348808
    //   1415: iastore
    //   1416: dup
    //   1417: iconst_4
    //   1418: ldc 134218240
    //   1420: iastore
    //   1421: dup
    //   1422: iconst_5
    //   1423: iconst_0
    //   1424: iastore
    //   1425: dup
    //   1426: bipush #6
    //   1428: ldc 131592
    //   1430: iastore
    //   1431: dup
    //   1432: bipush #7
    //   1434: ldc 134218240
    //   1436: iastore
    //   1437: dup
    //   1438: bipush #8
    //   1440: ldc 131080
    //   1442: iastore
    //   1443: dup
    //   1444: bipush #9
    //   1446: ldc 134217736
    //   1448: iastore
    //   1449: dup
    //   1450: bipush #10
    //   1452: ldc 134217736
    //   1454: iastore
    //   1455: dup
    //   1456: bipush #11
    //   1458: ldc 131072
    //   1460: iastore
    //   1461: dup
    //   1462: bipush #12
    //   1464: ldc 134349320
    //   1466: iastore
    //   1467: dup
    //   1468: bipush #13
    //   1470: ldc 131080
    //   1472: iastore
    //   1473: dup
    //   1474: bipush #14
    //   1476: ldc 134348800
    //   1478: iastore
    //   1479: dup
    //   1480: bipush #15
    //   1482: sipush #520
    //   1485: iastore
    //   1486: dup
    //   1487: bipush #16
    //   1489: ldc 134217728
    //   1491: iastore
    //   1492: dup
    //   1493: bipush #17
    //   1495: bipush #8
    //   1497: iastore
    //   1498: dup
    //   1499: bipush #18
    //   1501: ldc 134349312
    //   1503: iastore
    //   1504: dup
    //   1505: bipush #19
    //   1507: sipush #512
    //   1510: iastore
    //   1511: dup
    //   1512: bipush #20
    //   1514: ldc 131584
    //   1516: iastore
    //   1517: dup
    //   1518: bipush #21
    //   1520: ldc 134348800
    //   1522: iastore
    //   1523: dup
    //   1524: bipush #22
    //   1526: ldc 134348808
    //   1528: iastore
    //   1529: dup
    //   1530: bipush #23
    //   1532: ldc 131592
    //   1534: iastore
    //   1535: dup
    //   1536: bipush #24
    //   1538: ldc 134218248
    //   1540: iastore
    //   1541: dup
    //   1542: bipush #25
    //   1544: ldc 131584
    //   1546: iastore
    //   1547: dup
    //   1548: bipush #26
    //   1550: ldc 131072
    //   1552: iastore
    //   1553: dup
    //   1554: bipush #27
    //   1556: ldc 134218248
    //   1558: iastore
    //   1559: dup
    //   1560: bipush #28
    //   1562: bipush #8
    //   1564: iastore
    //   1565: dup
    //   1566: bipush #29
    //   1568: ldc 134349320
    //   1570: iastore
    //   1571: dup
    //   1572: bipush #30
    //   1574: sipush #512
    //   1577: iastore
    //   1578: dup
    //   1579: bipush #31
    //   1581: ldc 134217728
    //   1583: iastore
    //   1584: dup
    //   1585: bipush #32
    //   1587: ldc 134349312
    //   1589: iastore
    //   1590: dup
    //   1591: bipush #33
    //   1593: ldc 134217728
    //   1595: iastore
    //   1596: dup
    //   1597: bipush #34
    //   1599: ldc 131080
    //   1601: iastore
    //   1602: dup
    //   1603: bipush #35
    //   1605: sipush #520
    //   1608: iastore
    //   1609: dup
    //   1610: bipush #36
    //   1612: ldc 131072
    //   1614: iastore
    //   1615: dup
    //   1616: bipush #37
    //   1618: ldc 134349312
    //   1620: iastore
    //   1621: dup
    //   1622: bipush #38
    //   1624: ldc 134218240
    //   1626: iastore
    //   1627: dup
    //   1628: bipush #39
    //   1630: iconst_0
    //   1631: iastore
    //   1632: dup
    //   1633: bipush #40
    //   1635: sipush #512
    //   1638: iastore
    //   1639: dup
    //   1640: bipush #41
    //   1642: ldc 131080
    //   1644: iastore
    //   1645: dup
    //   1646: bipush #42
    //   1648: ldc 134349320
    //   1650: iastore
    //   1651: dup
    //   1652: bipush #43
    //   1654: ldc 134218240
    //   1656: iastore
    //   1657: dup
    //   1658: bipush #44
    //   1660: ldc 134217736
    //   1662: iastore
    //   1663: dup
    //   1664: bipush #45
    //   1666: sipush #512
    //   1669: iastore
    //   1670: dup
    //   1671: bipush #46
    //   1673: iconst_0
    //   1674: iastore
    //   1675: dup
    //   1676: bipush #47
    //   1678: ldc 134348808
    //   1680: iastore
    //   1681: dup
    //   1682: bipush #48
    //   1684: ldc 134218248
    //   1686: iastore
    //   1687: dup
    //   1688: bipush #49
    //   1690: ldc 131072
    //   1692: iastore
    //   1693: dup
    //   1694: bipush #50
    //   1696: ldc 134217728
    //   1698: iastore
    //   1699: dup
    //   1700: bipush #51
    //   1702: ldc 134349320
    //   1704: iastore
    //   1705: dup
    //   1706: bipush #52
    //   1708: bipush #8
    //   1710: iastore
    //   1711: dup
    //   1712: bipush #53
    //   1714: ldc 131592
    //   1716: iastore
    //   1717: dup
    //   1718: bipush #54
    //   1720: ldc 131584
    //   1722: iastore
    //   1723: dup
    //   1724: bipush #55
    //   1726: ldc 134217736
    //   1728: iastore
    //   1729: dup
    //   1730: bipush #56
    //   1732: ldc 134348800
    //   1734: iastore
    //   1735: dup
    //   1736: bipush #57
    //   1738: ldc 134218248
    //   1740: iastore
    //   1741: dup
    //   1742: bipush #58
    //   1744: sipush #520
    //   1747: iastore
    //   1748: dup
    //   1749: bipush #59
    //   1751: ldc 134348800
    //   1753: iastore
    //   1754: dup
    //   1755: bipush #60
    //   1757: ldc 131592
    //   1759: iastore
    //   1760: dup
    //   1761: bipush #61
    //   1763: bipush #8
    //   1765: iastore
    //   1766: dup
    //   1767: bipush #62
    //   1769: ldc 134348808
    //   1771: iastore
    //   1772: dup
    //   1773: bipush #63
    //   1775: ldc 131584
    //   1777: iastore
    //   1778: astore #10
    //   1780: bipush #64
    //   1782: newarray int
    //   1784: dup
    //   1785: iconst_0
    //   1786: ldc 8396801
    //   1788: iastore
    //   1789: dup
    //   1790: iconst_1
    //   1791: sipush #8321
    //   1794: iastore
    //   1795: dup
    //   1796: iconst_2
    //   1797: sipush #8321
    //   1800: iastore
    //   1801: dup
    //   1802: iconst_3
    //   1803: sipush #128
    //   1806: iastore
    //   1807: dup
    //   1808: iconst_4
    //   1809: ldc 8396928
    //   1811: iastore
    //   1812: dup
    //   1813: iconst_5
    //   1814: ldc 8388737
    //   1816: iastore
    //   1817: dup
    //   1818: bipush #6
    //   1820: ldc 8388609
    //   1822: iastore
    //   1823: dup
    //   1824: bipush #7
    //   1826: sipush #8193
    //   1829: iastore
    //   1830: dup
    //   1831: bipush #8
    //   1833: iconst_0
    //   1834: iastore
    //   1835: dup
    //   1836: bipush #9
    //   1838: ldc 8396800
    //   1840: iastore
    //   1841: dup
    //   1842: bipush #10
    //   1844: ldc 8396800
    //   1846: iastore
    //   1847: dup
    //   1848: bipush #11
    //   1850: ldc 8396929
    //   1852: iastore
    //   1853: dup
    //   1854: bipush #12
    //   1856: sipush #129
    //   1859: iastore
    //   1860: dup
    //   1861: bipush #13
    //   1863: iconst_0
    //   1864: iastore
    //   1865: dup
    //   1866: bipush #14
    //   1868: ldc 8388736
    //   1870: iastore
    //   1871: dup
    //   1872: bipush #15
    //   1874: ldc 8388609
    //   1876: iastore
    //   1877: dup
    //   1878: bipush #16
    //   1880: iconst_1
    //   1881: iastore
    //   1882: dup
    //   1883: bipush #17
    //   1885: sipush #8192
    //   1888: iastore
    //   1889: dup
    //   1890: bipush #18
    //   1892: ldc 8388608
    //   1894: iastore
    //   1895: dup
    //   1896: bipush #19
    //   1898: ldc 8396801
    //   1900: iastore
    //   1901: dup
    //   1902: bipush #20
    //   1904: sipush #128
    //   1907: iastore
    //   1908: dup
    //   1909: bipush #21
    //   1911: ldc 8388608
    //   1913: iastore
    //   1914: dup
    //   1915: bipush #22
    //   1917: sipush #8193
    //   1920: iastore
    //   1921: dup
    //   1922: bipush #23
    //   1924: sipush #8320
    //   1927: iastore
    //   1928: dup
    //   1929: bipush #24
    //   1931: ldc 8388737
    //   1933: iastore
    //   1934: dup
    //   1935: bipush #25
    //   1937: iconst_1
    //   1938: iastore
    //   1939: dup
    //   1940: bipush #26
    //   1942: sipush #8320
    //   1945: iastore
    //   1946: dup
    //   1947: bipush #27
    //   1949: ldc 8388736
    //   1951: iastore
    //   1952: dup
    //   1953: bipush #28
    //   1955: sipush #8192
    //   1958: iastore
    //   1959: dup
    //   1960: bipush #29
    //   1962: ldc 8396928
    //   1964: iastore
    //   1965: dup
    //   1966: bipush #30
    //   1968: ldc 8396929
    //   1970: iastore
    //   1971: dup
    //   1972: bipush #31
    //   1974: sipush #129
    //   1977: iastore
    //   1978: dup
    //   1979: bipush #32
    //   1981: ldc 8388736
    //   1983: iastore
    //   1984: dup
    //   1985: bipush #33
    //   1987: ldc 8388609
    //   1989: iastore
    //   1990: dup
    //   1991: bipush #34
    //   1993: ldc 8396800
    //   1995: iastore
    //   1996: dup
    //   1997: bipush #35
    //   1999: ldc 8396929
    //   2001: iastore
    //   2002: dup
    //   2003: bipush #36
    //   2005: sipush #129
    //   2008: iastore
    //   2009: dup
    //   2010: bipush #37
    //   2012: iconst_0
    //   2013: iastore
    //   2014: dup
    //   2015: bipush #38
    //   2017: iconst_0
    //   2018: iastore
    //   2019: dup
    //   2020: bipush #39
    //   2022: ldc 8396800
    //   2024: iastore
    //   2025: dup
    //   2026: bipush #40
    //   2028: sipush #8320
    //   2031: iastore
    //   2032: dup
    //   2033: bipush #41
    //   2035: ldc 8388736
    //   2037: iastore
    //   2038: dup
    //   2039: bipush #42
    //   2041: ldc 8388737
    //   2043: iastore
    //   2044: dup
    //   2045: bipush #43
    //   2047: iconst_1
    //   2048: iastore
    //   2049: dup
    //   2050: bipush #44
    //   2052: ldc 8396801
    //   2054: iastore
    //   2055: dup
    //   2056: bipush #45
    //   2058: sipush #8321
    //   2061: iastore
    //   2062: dup
    //   2063: bipush #46
    //   2065: sipush #8321
    //   2068: iastore
    //   2069: dup
    //   2070: bipush #47
    //   2072: sipush #128
    //   2075: iastore
    //   2076: dup
    //   2077: bipush #48
    //   2079: ldc 8396929
    //   2081: iastore
    //   2082: dup
    //   2083: bipush #49
    //   2085: sipush #129
    //   2088: iastore
    //   2089: dup
    //   2090: bipush #50
    //   2092: iconst_1
    //   2093: iastore
    //   2094: dup
    //   2095: bipush #51
    //   2097: sipush #8192
    //   2100: iastore
    //   2101: dup
    //   2102: bipush #52
    //   2104: ldc 8388609
    //   2106: iastore
    //   2107: dup
    //   2108: bipush #53
    //   2110: sipush #8193
    //   2113: iastore
    //   2114: dup
    //   2115: bipush #54
    //   2117: ldc 8396928
    //   2119: iastore
    //   2120: dup
    //   2121: bipush #55
    //   2123: ldc 8388737
    //   2125: iastore
    //   2126: dup
    //   2127: bipush #56
    //   2129: sipush #8193
    //   2132: iastore
    //   2133: dup
    //   2134: bipush #57
    //   2136: sipush #8320
    //   2139: iastore
    //   2140: dup
    //   2141: bipush #58
    //   2143: ldc 8388608
    //   2145: iastore
    //   2146: dup
    //   2147: bipush #59
    //   2149: ldc 8396801
    //   2151: iastore
    //   2152: dup
    //   2153: bipush #60
    //   2155: sipush #128
    //   2158: iastore
    //   2159: dup
    //   2160: bipush #61
    //   2162: ldc 8388608
    //   2164: iastore
    //   2165: dup
    //   2166: bipush #62
    //   2168: sipush #8192
    //   2171: iastore
    //   2172: dup
    //   2173: bipush #63
    //   2175: ldc 8396928
    //   2177: iastore
    //   2178: astore #11
    //   2180: bipush #64
    //   2182: newarray int
    //   2184: dup
    //   2185: iconst_0
    //   2186: sipush #256
    //   2189: iastore
    //   2190: dup
    //   2191: iconst_1
    //   2192: ldc 34078976
    //   2194: iastore
    //   2195: dup
    //   2196: iconst_2
    //   2197: ldc 34078720
    //   2199: iastore
    //   2200: dup
    //   2201: iconst_3
    //   2202: ldc 1107296512
    //   2204: iastore
    //   2205: dup
    //   2206: iconst_4
    //   2207: ldc 524288
    //   2209: iastore
    //   2210: dup
    //   2211: iconst_5
    //   2212: sipush #256
    //   2215: iastore
    //   2216: dup
    //   2217: bipush #6
    //   2219: ldc 1073741824
    //   2221: iastore
    //   2222: dup
    //   2223: bipush #7
    //   2225: ldc 34078720
    //   2227: iastore
    //   2228: dup
    //   2229: bipush #8
    //   2231: ldc 1074266368
    //   2233: iastore
    //   2234: dup
    //   2235: bipush #9
    //   2237: ldc 524288
    //   2239: iastore
    //   2240: dup
    //   2241: bipush #10
    //   2243: ldc 33554688
    //   2245: iastore
    //   2246: dup
    //   2247: bipush #11
    //   2249: ldc 1074266368
    //   2251: iastore
    //   2252: dup
    //   2253: bipush #12
    //   2255: ldc 1107296512
    //   2257: iastore
    //   2258: dup
    //   2259: bipush #13
    //   2261: ldc 1107820544
    //   2263: iastore
    //   2264: dup
    //   2265: bipush #14
    //   2267: ldc 524544
    //   2269: iastore
    //   2270: dup
    //   2271: bipush #15
    //   2273: ldc 1073741824
    //   2275: iastore
    //   2276: dup
    //   2277: bipush #16
    //   2279: ldc 33554432
    //   2281: iastore
    //   2282: dup
    //   2283: bipush #17
    //   2285: ldc 1074266112
    //   2287: iastore
    //   2288: dup
    //   2289: bipush #18
    //   2291: ldc 1074266112
    //   2293: iastore
    //   2294: dup
    //   2295: bipush #19
    //   2297: iconst_0
    //   2298: iastore
    //   2299: dup
    //   2300: bipush #20
    //   2302: ldc 1073742080
    //   2304: iastore
    //   2305: dup
    //   2306: bipush #21
    //   2308: ldc 1107820800
    //   2310: iastore
    //   2311: dup
    //   2312: bipush #22
    //   2314: ldc 1107820800
    //   2316: iastore
    //   2317: dup
    //   2318: bipush #23
    //   2320: ldc 33554688
    //   2322: iastore
    //   2323: dup
    //   2324: bipush #24
    //   2326: ldc 1107820544
    //   2328: iastore
    //   2329: dup
    //   2330: bipush #25
    //   2332: ldc 1073742080
    //   2334: iastore
    //   2335: dup
    //   2336: bipush #26
    //   2338: iconst_0
    //   2339: iastore
    //   2340: dup
    //   2341: bipush #27
    //   2343: ldc 1107296256
    //   2345: iastore
    //   2346: dup
    //   2347: bipush #28
    //   2349: ldc 34078976
    //   2351: iastore
    //   2352: dup
    //   2353: bipush #29
    //   2355: ldc 33554432
    //   2357: iastore
    //   2358: dup
    //   2359: bipush #30
    //   2361: ldc 1107296256
    //   2363: iastore
    //   2364: dup
    //   2365: bipush #31
    //   2367: ldc 524544
    //   2369: iastore
    //   2370: dup
    //   2371: bipush #32
    //   2373: ldc 524288
    //   2375: iastore
    //   2376: dup
    //   2377: bipush #33
    //   2379: ldc 1107296512
    //   2381: iastore
    //   2382: dup
    //   2383: bipush #34
    //   2385: sipush #256
    //   2388: iastore
    //   2389: dup
    //   2390: bipush #35
    //   2392: ldc 33554432
    //   2394: iastore
    //   2395: dup
    //   2396: bipush #36
    //   2398: ldc 1073741824
    //   2400: iastore
    //   2401: dup
    //   2402: bipush #37
    //   2404: ldc 34078720
    //   2406: iastore
    //   2407: dup
    //   2408: bipush #38
    //   2410: ldc 1107296512
    //   2412: iastore
    //   2413: dup
    //   2414: bipush #39
    //   2416: ldc 1074266368
    //   2418: iastore
    //   2419: dup
    //   2420: bipush #40
    //   2422: ldc 33554688
    //   2424: iastore
    //   2425: dup
    //   2426: bipush #41
    //   2428: ldc 1073741824
    //   2430: iastore
    //   2431: dup
    //   2432: bipush #42
    //   2434: ldc 1107820544
    //   2436: iastore
    //   2437: dup
    //   2438: bipush #43
    //   2440: ldc 34078976
    //   2442: iastore
    //   2443: dup
    //   2444: bipush #44
    //   2446: ldc 1074266368
    //   2448: iastore
    //   2449: dup
    //   2450: bipush #45
    //   2452: sipush #256
    //   2455: iastore
    //   2456: dup
    //   2457: bipush #46
    //   2459: ldc 33554432
    //   2461: iastore
    //   2462: dup
    //   2463: bipush #47
    //   2465: ldc 1107820544
    //   2467: iastore
    //   2468: dup
    //   2469: bipush #48
    //   2471: ldc 1107820800
    //   2473: iastore
    //   2474: dup
    //   2475: bipush #49
    //   2477: ldc 524544
    //   2479: iastore
    //   2480: dup
    //   2481: bipush #50
    //   2483: ldc 1107296256
    //   2485: iastore
    //   2486: dup
    //   2487: bipush #51
    //   2489: ldc 1107820800
    //   2491: iastore
    //   2492: dup
    //   2493: bipush #52
    //   2495: ldc 34078720
    //   2497: iastore
    //   2498: dup
    //   2499: bipush #53
    //   2501: iconst_0
    //   2502: iastore
    //   2503: dup
    //   2504: bipush #54
    //   2506: ldc 1074266112
    //   2508: iastore
    //   2509: dup
    //   2510: bipush #55
    //   2512: ldc 1107296256
    //   2514: iastore
    //   2515: dup
    //   2516: bipush #56
    //   2518: ldc 524544
    //   2520: iastore
    //   2521: dup
    //   2522: bipush #57
    //   2524: ldc 33554688
    //   2526: iastore
    //   2527: dup
    //   2528: bipush #58
    //   2530: ldc 1073742080
    //   2532: iastore
    //   2533: dup
    //   2534: bipush #59
    //   2536: ldc 524288
    //   2538: iastore
    //   2539: dup
    //   2540: bipush #60
    //   2542: iconst_0
    //   2543: iastore
    //   2544: dup
    //   2545: bipush #61
    //   2547: ldc 1074266112
    //   2549: iastore
    //   2550: dup
    //   2551: bipush #62
    //   2553: ldc 34078976
    //   2555: iastore
    //   2556: dup
    //   2557: bipush #63
    //   2559: ldc 1073742080
    //   2561: iastore
    //   2562: astore #12
    //   2564: bipush #64
    //   2566: newarray int
    //   2568: dup
    //   2569: iconst_0
    //   2570: ldc 536870928
    //   2572: iastore
    //   2573: dup
    //   2574: iconst_1
    //   2575: ldc 541065216
    //   2577: iastore
    //   2578: dup
    //   2579: iconst_2
    //   2580: sipush #16384
    //   2583: iastore
    //   2584: dup
    //   2585: iconst_3
    //   2586: ldc 541081616
    //   2588: iastore
    //   2589: dup
    //   2590: iconst_4
    //   2591: ldc 541065216
    //   2593: iastore
    //   2594: dup
    //   2595: iconst_5
    //   2596: bipush #16
    //   2598: iastore
    //   2599: dup
    //   2600: bipush #6
    //   2602: ldc 541081616
    //   2604: iastore
    //   2605: dup
    //   2606: bipush #7
    //   2608: ldc 4194304
    //   2610: iastore
    //   2611: dup
    //   2612: bipush #8
    //   2614: ldc 536887296
    //   2616: iastore
    //   2617: dup
    //   2618: bipush #9
    //   2620: ldc 4210704
    //   2622: iastore
    //   2623: dup
    //   2624: bipush #10
    //   2626: ldc 4194304
    //   2628: iastore
    //   2629: dup
    //   2630: bipush #11
    //   2632: ldc 536870928
    //   2634: iastore
    //   2635: dup
    //   2636: bipush #12
    //   2638: ldc 4194320
    //   2640: iastore
    //   2641: dup
    //   2642: bipush #13
    //   2644: ldc 536887296
    //   2646: iastore
    //   2647: dup
    //   2648: bipush #14
    //   2650: ldc 536870912
    //   2652: iastore
    //   2653: dup
    //   2654: bipush #15
    //   2656: sipush #16400
    //   2659: iastore
    //   2660: dup
    //   2661: bipush #16
    //   2663: iconst_0
    //   2664: iastore
    //   2665: dup
    //   2666: bipush #17
    //   2668: ldc 4194320
    //   2670: iastore
    //   2671: dup
    //   2672: bipush #18
    //   2674: ldc 536887312
    //   2676: iastore
    //   2677: dup
    //   2678: bipush #19
    //   2680: sipush #16384
    //   2683: iastore
    //   2684: dup
    //   2685: bipush #20
    //   2687: ldc 4210688
    //   2689: iastore
    //   2690: dup
    //   2691: bipush #21
    //   2693: ldc 536887312
    //   2695: iastore
    //   2696: dup
    //   2697: bipush #22
    //   2699: bipush #16
    //   2701: iastore
    //   2702: dup
    //   2703: bipush #23
    //   2705: ldc 541065232
    //   2707: iastore
    //   2708: dup
    //   2709: bipush #24
    //   2711: ldc 541065232
    //   2713: iastore
    //   2714: dup
    //   2715: bipush #25
    //   2717: iconst_0
    //   2718: iastore
    //   2719: dup
    //   2720: bipush #26
    //   2722: ldc 4210704
    //   2724: iastore
    //   2725: dup
    //   2726: bipush #27
    //   2728: ldc 541081600
    //   2730: iastore
    //   2731: dup
    //   2732: bipush #28
    //   2734: sipush #16400
    //   2737: iastore
    //   2738: dup
    //   2739: bipush #29
    //   2741: ldc 4210688
    //   2743: iastore
    //   2744: dup
    //   2745: bipush #30
    //   2747: ldc 541081600
    //   2749: iastore
    //   2750: dup
    //   2751: bipush #31
    //   2753: ldc 536870912
    //   2755: iastore
    //   2756: dup
    //   2757: bipush #32
    //   2759: ldc 536887296
    //   2761: iastore
    //   2762: dup
    //   2763: bipush #33
    //   2765: bipush #16
    //   2767: iastore
    //   2768: dup
    //   2769: bipush #34
    //   2771: ldc 541065232
    //   2773: iastore
    //   2774: dup
    //   2775: bipush #35
    //   2777: ldc 4210688
    //   2779: iastore
    //   2780: dup
    //   2781: bipush #36
    //   2783: ldc 541081616
    //   2785: iastore
    //   2786: dup
    //   2787: bipush #37
    //   2789: ldc 4194304
    //   2791: iastore
    //   2792: dup
    //   2793: bipush #38
    //   2795: sipush #16400
    //   2798: iastore
    //   2799: dup
    //   2800: bipush #39
    //   2802: ldc 536870928
    //   2804: iastore
    //   2805: dup
    //   2806: bipush #40
    //   2808: ldc 4194304
    //   2810: iastore
    //   2811: dup
    //   2812: bipush #41
    //   2814: ldc 536887296
    //   2816: iastore
    //   2817: dup
    //   2818: bipush #42
    //   2820: ldc 536870912
    //   2822: iastore
    //   2823: dup
    //   2824: bipush #43
    //   2826: sipush #16400
    //   2829: iastore
    //   2830: dup
    //   2831: bipush #44
    //   2833: ldc 536870928
    //   2835: iastore
    //   2836: dup
    //   2837: bipush #45
    //   2839: ldc 541081616
    //   2841: iastore
    //   2842: dup
    //   2843: bipush #46
    //   2845: ldc 4210688
    //   2847: iastore
    //   2848: dup
    //   2849: bipush #47
    //   2851: ldc 541065216
    //   2853: iastore
    //   2854: dup
    //   2855: bipush #48
    //   2857: ldc 4210704
    //   2859: iastore
    //   2860: dup
    //   2861: bipush #49
    //   2863: ldc 541081600
    //   2865: iastore
    //   2866: dup
    //   2867: bipush #50
    //   2869: iconst_0
    //   2870: iastore
    //   2871: dup
    //   2872: bipush #51
    //   2874: ldc 541065232
    //   2876: iastore
    //   2877: dup
    //   2878: bipush #52
    //   2880: bipush #16
    //   2882: iastore
    //   2883: dup
    //   2884: bipush #53
    //   2886: sipush #16384
    //   2889: iastore
    //   2890: dup
    //   2891: bipush #54
    //   2893: ldc 541065216
    //   2895: iastore
    //   2896: dup
    //   2897: bipush #55
    //   2899: ldc 4210704
    //   2901: iastore
    //   2902: dup
    //   2903: bipush #56
    //   2905: sipush #16384
    //   2908: iastore
    //   2909: dup
    //   2910: bipush #57
    //   2912: ldc 4194320
    //   2914: iastore
    //   2915: dup
    //   2916: bipush #58
    //   2918: ldc 536887312
    //   2920: iastore
    //   2921: dup
    //   2922: bipush #59
    //   2924: iconst_0
    //   2925: iastore
    //   2926: dup
    //   2927: bipush #60
    //   2929: ldc 541081600
    //   2931: iastore
    //   2932: dup
    //   2933: bipush #61
    //   2935: ldc 536870912
    //   2937: iastore
    //   2938: dup
    //   2939: bipush #62
    //   2941: ldc 4194320
    //   2943: iastore
    //   2944: dup
    //   2945: bipush #63
    //   2947: ldc 536887312
    //   2949: iastore
    //   2950: astore #13
    //   2952: bipush #64
    //   2954: newarray int
    //   2956: dup
    //   2957: iconst_0
    //   2958: ldc 2097152
    //   2960: iastore
    //   2961: dup
    //   2962: iconst_1
    //   2963: ldc 69206018
    //   2965: iastore
    //   2966: dup
    //   2967: iconst_2
    //   2968: ldc 67110914
    //   2970: iastore
    //   2971: dup
    //   2972: iconst_3
    //   2973: iconst_0
    //   2974: iastore
    //   2975: dup
    //   2976: iconst_4
    //   2977: sipush #2048
    //   2980: iastore
    //   2981: dup
    //   2982: iconst_5
    //   2983: ldc 67110914
    //   2985: iastore
    //   2986: dup
    //   2987: bipush #6
    //   2989: ldc 2099202
    //   2991: iastore
    //   2992: dup
    //   2993: bipush #7
    //   2995: ldc 69208064
    //   2997: iastore
    //   2998: dup
    //   2999: bipush #8
    //   3001: ldc 69208066
    //   3003: iastore
    //   3004: dup
    //   3005: bipush #9
    //   3007: ldc 2097152
    //   3009: iastore
    //   3010: dup
    //   3011: bipush #10
    //   3013: iconst_0
    //   3014: iastore
    //   3015: dup
    //   3016: bipush #11
    //   3018: ldc 67108866
    //   3020: iastore
    //   3021: dup
    //   3022: bipush #12
    //   3024: iconst_2
    //   3025: iastore
    //   3026: dup
    //   3027: bipush #13
    //   3029: ldc 67108864
    //   3031: iastore
    //   3032: dup
    //   3033: bipush #14
    //   3035: ldc 69206018
    //   3037: iastore
    //   3038: dup
    //   3039: bipush #15
    //   3041: sipush #2050
    //   3044: iastore
    //   3045: dup
    //   3046: bipush #16
    //   3048: ldc 67110912
    //   3050: iastore
    //   3051: dup
    //   3052: bipush #17
    //   3054: ldc 2099202
    //   3056: iastore
    //   3057: dup
    //   3058: bipush #18
    //   3060: ldc 2097154
    //   3062: iastore
    //   3063: dup
    //   3064: bipush #19
    //   3066: ldc 67110912
    //   3068: iastore
    //   3069: dup
    //   3070: bipush #20
    //   3072: ldc 67108866
    //   3074: iastore
    //   3075: dup
    //   3076: bipush #21
    //   3078: ldc 69206016
    //   3080: iastore
    //   3081: dup
    //   3082: bipush #22
    //   3084: ldc 69208064
    //   3086: iastore
    //   3087: dup
    //   3088: bipush #23
    //   3090: ldc 2097154
    //   3092: iastore
    //   3093: dup
    //   3094: bipush #24
    //   3096: ldc 69206016
    //   3098: iastore
    //   3099: dup
    //   3100: bipush #25
    //   3102: sipush #2048
    //   3105: iastore
    //   3106: dup
    //   3107: bipush #26
    //   3109: sipush #2050
    //   3112: iastore
    //   3113: dup
    //   3114: bipush #27
    //   3116: ldc 69208066
    //   3118: iastore
    //   3119: dup
    //   3120: bipush #28
    //   3122: ldc 2099200
    //   3124: iastore
    //   3125: dup
    //   3126: bipush #29
    //   3128: iconst_2
    //   3129: iastore
    //   3130: dup
    //   3131: bipush #30
    //   3133: ldc 67108864
    //   3135: iastore
    //   3136: dup
    //   3137: bipush #31
    //   3139: ldc 2099200
    //   3141: iastore
    //   3142: dup
    //   3143: bipush #32
    //   3145: ldc 67108864
    //   3147: iastore
    //   3148: dup
    //   3149: bipush #33
    //   3151: ldc 2099200
    //   3153: iastore
    //   3154: dup
    //   3155: bipush #34
    //   3157: ldc 2097152
    //   3159: iastore
    //   3160: dup
    //   3161: bipush #35
    //   3163: ldc 67110914
    //   3165: iastore
    //   3166: dup
    //   3167: bipush #36
    //   3169: ldc 67110914
    //   3171: iastore
    //   3172: dup
    //   3173: bipush #37
    //   3175: ldc 69206018
    //   3177: iastore
    //   3178: dup
    //   3179: bipush #38
    //   3181: ldc 69206018
    //   3183: iastore
    //   3184: dup
    //   3185: bipush #39
    //   3187: iconst_2
    //   3188: iastore
    //   3189: dup
    //   3190: bipush #40
    //   3192: ldc 2097154
    //   3194: iastore
    //   3195: dup
    //   3196: bipush #41
    //   3198: ldc 67108864
    //   3200: iastore
    //   3201: dup
    //   3202: bipush #42
    //   3204: ldc 67110912
    //   3206: iastore
    //   3207: dup
    //   3208: bipush #43
    //   3210: ldc 2097152
    //   3212: iastore
    //   3213: dup
    //   3214: bipush #44
    //   3216: ldc 69208064
    //   3218: iastore
    //   3219: dup
    //   3220: bipush #45
    //   3222: sipush #2050
    //   3225: iastore
    //   3226: dup
    //   3227: bipush #46
    //   3229: ldc 2099202
    //   3231: iastore
    //   3232: dup
    //   3233: bipush #47
    //   3235: ldc 69208064
    //   3237: iastore
    //   3238: dup
    //   3239: bipush #48
    //   3241: sipush #2050
    //   3244: iastore
    //   3245: dup
    //   3246: bipush #49
    //   3248: ldc 67108866
    //   3250: iastore
    //   3251: dup
    //   3252: bipush #50
    //   3254: ldc 69208066
    //   3256: iastore
    //   3257: dup
    //   3258: bipush #51
    //   3260: ldc 69206016
    //   3262: iastore
    //   3263: dup
    //   3264: bipush #52
    //   3266: ldc 2099200
    //   3268: iastore
    //   3269: dup
    //   3270: bipush #53
    //   3272: iconst_0
    //   3273: iastore
    //   3274: dup
    //   3275: bipush #54
    //   3277: iconst_2
    //   3278: iastore
    //   3279: dup
    //   3280: bipush #55
    //   3282: ldc 69208066
    //   3284: iastore
    //   3285: dup
    //   3286: bipush #56
    //   3288: iconst_0
    //   3289: iastore
    //   3290: dup
    //   3291: bipush #57
    //   3293: ldc 2099202
    //   3295: iastore
    //   3296: dup
    //   3297: bipush #58
    //   3299: ldc 69206016
    //   3301: iastore
    //   3302: dup
    //   3303: bipush #59
    //   3305: sipush #2048
    //   3308: iastore
    //   3309: dup
    //   3310: bipush #60
    //   3312: ldc 67108866
    //   3314: iastore
    //   3315: dup
    //   3316: bipush #61
    //   3318: ldc 67110912
    //   3320: iastore
    //   3321: dup
    //   3322: bipush #62
    //   3324: sipush #2048
    //   3327: iastore
    //   3328: dup
    //   3329: bipush #63
    //   3331: ldc 2097154
    //   3333: iastore
    //   3334: astore #14
    //   3336: bipush #64
    //   3338: newarray int
    //   3340: dup
    //   3341: iconst_0
    //   3342: ldc 268439616
    //   3344: iastore
    //   3345: dup
    //   3346: iconst_1
    //   3347: sipush #4096
    //   3350: iastore
    //   3351: dup
    //   3352: iconst_2
    //   3353: ldc 262144
    //   3355: iastore
    //   3356: dup
    //   3357: iconst_3
    //   3358: ldc 268701760
    //   3360: iastore
    //   3361: dup
    //   3362: iconst_4
    //   3363: ldc 268435456
    //   3365: iastore
    //   3366: dup
    //   3367: iconst_5
    //   3368: ldc 268439616
    //   3370: iastore
    //   3371: dup
    //   3372: bipush #6
    //   3374: bipush #64
    //   3376: iastore
    //   3377: dup
    //   3378: bipush #7
    //   3380: ldc 268435456
    //   3382: iastore
    //   3383: dup
    //   3384: bipush #8
    //   3386: ldc 262208
    //   3388: iastore
    //   3389: dup
    //   3390: bipush #9
    //   3392: ldc 268697600
    //   3394: iastore
    //   3395: dup
    //   3396: bipush #10
    //   3398: ldc 268701760
    //   3400: iastore
    //   3401: dup
    //   3402: bipush #11
    //   3404: ldc 266240
    //   3406: iastore
    //   3407: dup
    //   3408: bipush #12
    //   3410: ldc 268701696
    //   3412: iastore
    //   3413: dup
    //   3414: bipush #13
    //   3416: ldc 266304
    //   3418: iastore
    //   3419: dup
    //   3420: bipush #14
    //   3422: sipush #4096
    //   3425: iastore
    //   3426: dup
    //   3427: bipush #15
    //   3429: bipush #64
    //   3431: iastore
    //   3432: dup
    //   3433: bipush #16
    //   3435: ldc 268697600
    //   3437: iastore
    //   3438: dup
    //   3439: bipush #17
    //   3441: ldc 268435520
    //   3443: iastore
    //   3444: dup
    //   3445: bipush #18
    //   3447: ldc 268439552
    //   3449: iastore
    //   3450: dup
    //   3451: bipush #19
    //   3453: sipush #4160
    //   3456: iastore
    //   3457: dup
    //   3458: bipush #20
    //   3460: ldc 266240
    //   3462: iastore
    //   3463: dup
    //   3464: bipush #21
    //   3466: ldc 262208
    //   3468: iastore
    //   3469: dup
    //   3470: bipush #22
    //   3472: ldc 268697664
    //   3474: iastore
    //   3475: dup
    //   3476: bipush #23
    //   3478: ldc 268701696
    //   3480: iastore
    //   3481: dup
    //   3482: bipush #24
    //   3484: sipush #4160
    //   3487: iastore
    //   3488: dup
    //   3489: bipush #25
    //   3491: iconst_0
    //   3492: iastore
    //   3493: dup
    //   3494: bipush #26
    //   3496: iconst_0
    //   3497: iastore
    //   3498: dup
    //   3499: bipush #27
    //   3501: ldc 268697664
    //   3503: iastore
    //   3504: dup
    //   3505: bipush #28
    //   3507: ldc 268435520
    //   3509: iastore
    //   3510: dup
    //   3511: bipush #29
    //   3513: ldc 268439552
    //   3515: iastore
    //   3516: dup
    //   3517: bipush #30
    //   3519: ldc 266304
    //   3521: iastore
    //   3522: dup
    //   3523: bipush #31
    //   3525: ldc 262144
    //   3527: iastore
    //   3528: dup
    //   3529: bipush #32
    //   3531: ldc 266304
    //   3533: iastore
    //   3534: dup
    //   3535: bipush #33
    //   3537: ldc 262144
    //   3539: iastore
    //   3540: dup
    //   3541: bipush #34
    //   3543: ldc 268701696
    //   3545: iastore
    //   3546: dup
    //   3547: bipush #35
    //   3549: sipush #4096
    //   3552: iastore
    //   3553: dup
    //   3554: bipush #36
    //   3556: bipush #64
    //   3558: iastore
    //   3559: dup
    //   3560: bipush #37
    //   3562: ldc 268697664
    //   3564: iastore
    //   3565: dup
    //   3566: bipush #38
    //   3568: sipush #4096
    //   3571: iastore
    //   3572: dup
    //   3573: bipush #39
    //   3575: ldc 266304
    //   3577: iastore
    //   3578: dup
    //   3579: bipush #40
    //   3581: ldc 268439552
    //   3583: iastore
    //   3584: dup
    //   3585: bipush #41
    //   3587: bipush #64
    //   3589: iastore
    //   3590: dup
    //   3591: bipush #42
    //   3593: ldc 268435520
    //   3595: iastore
    //   3596: dup
    //   3597: bipush #43
    //   3599: ldc 268697600
    //   3601: iastore
    //   3602: dup
    //   3603: bipush #44
    //   3605: ldc 268697664
    //   3607: iastore
    //   3608: dup
    //   3609: bipush #45
    //   3611: ldc 268435456
    //   3613: iastore
    //   3614: dup
    //   3615: bipush #46
    //   3617: ldc 262144
    //   3619: iastore
    //   3620: dup
    //   3621: bipush #47
    //   3623: ldc 268439616
    //   3625: iastore
    //   3626: dup
    //   3627: bipush #48
    //   3629: iconst_0
    //   3630: iastore
    //   3631: dup
    //   3632: bipush #49
    //   3634: ldc 268701760
    //   3636: iastore
    //   3637: dup
    //   3638: bipush #50
    //   3640: ldc 262208
    //   3642: iastore
    //   3643: dup
    //   3644: bipush #51
    //   3646: ldc 268435520
    //   3648: iastore
    //   3649: dup
    //   3650: bipush #52
    //   3652: ldc 268697600
    //   3654: iastore
    //   3655: dup
    //   3656: bipush #53
    //   3658: ldc 268439552
    //   3660: iastore
    //   3661: dup
    //   3662: bipush #54
    //   3664: ldc 268439616
    //   3666: iastore
    //   3667: dup
    //   3668: bipush #55
    //   3670: iconst_0
    //   3671: iastore
    //   3672: dup
    //   3673: bipush #56
    //   3675: ldc 268701760
    //   3677: iastore
    //   3678: dup
    //   3679: bipush #57
    //   3681: ldc 266240
    //   3683: iastore
    //   3684: dup
    //   3685: bipush #58
    //   3687: ldc 266240
    //   3689: iastore
    //   3690: dup
    //   3691: bipush #59
    //   3693: sipush #4160
    //   3696: iastore
    //   3697: dup
    //   3698: bipush #60
    //   3700: sipush #4160
    //   3703: iastore
    //   3704: dup
    //   3705: bipush #61
    //   3707: ldc 262208
    //   3709: iastore
    //   3710: dup
    //   3711: bipush #62
    //   3713: ldc 268435456
    //   3715: iastore
    //   3716: dup
    //   3717: bipush #63
    //   3719: ldc 268701696
    //   3721: iastore
    //   3722: astore #15
    //   3724: aload_3
    //   3725: arraylength
    //   3726: istore #16
    //   3728: iconst_2
    //   3729: newarray int
    //   3731: astore #17
    //   3733: iload #16
    //   3735: newarray byte
    //   3737: astore #4
    //   3739: iload #16
    //   3741: bipush #8
    //   3743: idiv
    //   3744: istore #18
    //   3746: iconst_0
    //   3747: istore #19
    //   3749: iload #19
    //   3751: iload #18
    //   3753: if_icmpge -> 4667
    //   3756: iload #19
    //   3758: bipush #8
    //   3760: imul
    //   3761: istore #20
    //   3763: iconst_0
    //   3764: istore #21
    //   3766: iload #21
    //   3768: iconst_2
    //   3769: if_icmpge -> 3854
    //   3772: aload #17
    //   3774: iload #21
    //   3776: aload_3
    //   3777: iload #20
    //   3779: iload #21
    //   3781: iconst_4
    //   3782: imul
    //   3783: iadd
    //   3784: baload
    //   3785: sipush #255
    //   3788: iand
    //   3789: bipush #24
    //   3791: ishl
    //   3792: aload_3
    //   3793: iload #20
    //   3795: iload #21
    //   3797: iconst_4
    //   3798: imul
    //   3799: iadd
    //   3800: iconst_1
    //   3801: iadd
    //   3802: baload
    //   3803: sipush #255
    //   3806: iand
    //   3807: bipush #16
    //   3809: ishl
    //   3810: ior
    //   3811: aload_3
    //   3812: iload #20
    //   3814: iload #21
    //   3816: iconst_4
    //   3817: imul
    //   3818: iadd
    //   3819: iconst_2
    //   3820: iadd
    //   3821: baload
    //   3822: sipush #255
    //   3825: iand
    //   3826: bipush #8
    //   3828: ishl
    //   3829: ior
    //   3830: aload_3
    //   3831: iload #20
    //   3833: iload #21
    //   3835: iconst_4
    //   3836: imul
    //   3837: iadd
    //   3838: iconst_3
    //   3839: iadd
    //   3840: baload
    //   3841: sipush #255
    //   3844: iand
    //   3845: ior
    //   3846: iastore
    //   3847: iinc #21, 1
    //   3850: iload_2
    //   3851: ifne -> 3766
    //   3854: iconst_0
    //   3855: istore #26
    //   3857: aload #17
    //   3859: iconst_0
    //   3860: iaload
    //   3861: istore #24
    //   3863: aload #17
    //   3865: iconst_1
    //   3866: iaload
    //   3867: istore #23
    //   3869: iload #24
    //   3871: iconst_4
    //   3872: iushr
    //   3873: iload #23
    //   3875: ixor
    //   3876: ldc 252645135
    //   3878: iand
    //   3879: istore #22
    //   3881: iload #23
    //   3883: iload #22
    //   3885: ixor
    //   3886: istore #23
    //   3888: iload #24
    //   3890: iload #22
    //   3892: iconst_4
    //   3893: ishl
    //   3894: ixor
    //   3895: istore #24
    //   3897: iload #24
    //   3899: bipush #16
    //   3901: iushr
    //   3902: iload #23
    //   3904: ixor
    //   3905: ldc 65535
    //   3907: iand
    //   3908: istore #22
    //   3910: iload #23
    //   3912: iload #22
    //   3914: ixor
    //   3915: istore #23
    //   3917: iload #24
    //   3919: iload #22
    //   3921: bipush #16
    //   3923: ishl
    //   3924: ixor
    //   3925: istore #24
    //   3927: iload #23
    //   3929: iconst_2
    //   3930: iushr
    //   3931: iload #24
    //   3933: ixor
    //   3934: ldc 858993459
    //   3936: iand
    //   3937: istore #22
    //   3939: iload #24
    //   3941: iload #22
    //   3943: ixor
    //   3944: istore #24
    //   3946: iload #23
    //   3948: iload #22
    //   3950: iconst_2
    //   3951: ishl
    //   3952: ixor
    //   3953: istore #23
    //   3955: iload #23
    //   3957: bipush #8
    //   3959: iushr
    //   3960: iload #24
    //   3962: ixor
    //   3963: ldc 16711935
    //   3965: iand
    //   3966: istore #22
    //   3968: iload #24
    //   3970: iload #22
    //   3972: ixor
    //   3973: istore #24
    //   3975: iload #23
    //   3977: iload #22
    //   3979: bipush #8
    //   3981: ishl
    //   3982: ixor
    //   3983: istore #23
    //   3985: iload #23
    //   3987: iconst_1
    //   3988: ishl
    //   3989: iload #23
    //   3991: bipush #31
    //   3993: iushr
    //   3994: iconst_1
    //   3995: iand
    //   3996: ior
    //   3997: istore #23
    //   3999: iload #24
    //   4001: iload #23
    //   4003: ixor
    //   4004: ldc -1431655766
    //   4006: iand
    //   4007: istore #22
    //   4009: iload #24
    //   4011: iload #22
    //   4013: ixor
    //   4014: istore #24
    //   4016: iload #23
    //   4018: iload #22
    //   4020: ixor
    //   4021: istore #23
    //   4023: iload #24
    //   4025: iconst_1
    //   4026: ishl
    //   4027: iload #24
    //   4029: bipush #31
    //   4031: iushr
    //   4032: iconst_1
    //   4033: iand
    //   4034: ior
    //   4035: istore #24
    //   4037: iconst_0
    //   4038: istore #25
    //   4040: iload #25
    //   4042: bipush #8
    //   4044: if_icmpge -> 4382
    //   4047: iload #23
    //   4049: bipush #28
    //   4051: ishl
    //   4052: iload #23
    //   4054: iconst_4
    //   4055: iushr
    //   4056: ior
    //   4057: istore #22
    //   4059: iload #22
    //   4061: aload #5
    //   4063: iload #26
    //   4065: iinc #26, 1
    //   4068: iaload
    //   4069: ixor
    //   4070: istore #22
    //   4072: aload #14
    //   4074: iload #22
    //   4076: bipush #63
    //   4078: iand
    //   4079: iaload
    //   4080: istore #21
    //   4082: iload #21
    //   4084: aload #12
    //   4086: iload #22
    //   4088: bipush #8
    //   4090: iushr
    //   4091: bipush #63
    //   4093: iand
    //   4094: iaload
    //   4095: ior
    //   4096: istore #21
    //   4098: iload #21
    //   4100: aload #10
    //   4102: iload #22
    //   4104: bipush #16
    //   4106: iushr
    //   4107: bipush #63
    //   4109: iand
    //   4110: iaload
    //   4111: ior
    //   4112: istore #21
    //   4114: iload #21
    //   4116: aload #8
    //   4118: iload #22
    //   4120: bipush #24
    //   4122: iushr
    //   4123: bipush #63
    //   4125: iand
    //   4126: iaload
    //   4127: ior
    //   4128: istore #21
    //   4130: iload #23
    //   4132: aload #5
    //   4134: iload #26
    //   4136: iinc #26, 1
    //   4139: iaload
    //   4140: ixor
    //   4141: istore #22
    //   4143: iload #21
    //   4145: aload #15
    //   4147: iload #22
    //   4149: bipush #63
    //   4151: iand
    //   4152: iaload
    //   4153: ior
    //   4154: istore #21
    //   4156: iload #21
    //   4158: aload #13
    //   4160: iload #22
    //   4162: bipush #8
    //   4164: iushr
    //   4165: bipush #63
    //   4167: iand
    //   4168: iaload
    //   4169: ior
    //   4170: istore #21
    //   4172: iload #21
    //   4174: aload #11
    //   4176: iload #22
    //   4178: bipush #16
    //   4180: iushr
    //   4181: bipush #63
    //   4183: iand
    //   4184: iaload
    //   4185: ior
    //   4186: istore #21
    //   4188: iload #21
    //   4190: aload #9
    //   4192: iload #22
    //   4194: bipush #24
    //   4196: iushr
    //   4197: bipush #63
    //   4199: iand
    //   4200: iaload
    //   4201: ior
    //   4202: istore #21
    //   4204: iload #24
    //   4206: iload #21
    //   4208: ixor
    //   4209: istore #24
    //   4211: iload #24
    //   4213: bipush #28
    //   4215: ishl
    //   4216: iload #24
    //   4218: iconst_4
    //   4219: iushr
    //   4220: ior
    //   4221: istore #22
    //   4223: iload #22
    //   4225: aload #5
    //   4227: iload #26
    //   4229: iinc #26, 1
    //   4232: iaload
    //   4233: ixor
    //   4234: istore #22
    //   4236: aload #14
    //   4238: iload #22
    //   4240: bipush #63
    //   4242: iand
    //   4243: iaload
    //   4244: istore #21
    //   4246: iload #21
    //   4248: aload #12
    //   4250: iload #22
    //   4252: bipush #8
    //   4254: iushr
    //   4255: bipush #63
    //   4257: iand
    //   4258: iaload
    //   4259: ior
    //   4260: istore #21
    //   4262: iload #21
    //   4264: aload #10
    //   4266: iload #22
    //   4268: bipush #16
    //   4270: iushr
    //   4271: bipush #63
    //   4273: iand
    //   4274: iaload
    //   4275: ior
    //   4276: istore #21
    //   4278: iload #21
    //   4280: aload #8
    //   4282: iload #22
    //   4284: bipush #24
    //   4286: iushr
    //   4287: bipush #63
    //   4289: iand
    //   4290: iaload
    //   4291: ior
    //   4292: istore #21
    //   4294: iload #24
    //   4296: aload #5
    //   4298: iload #26
    //   4300: iinc #26, 1
    //   4303: iaload
    //   4304: ixor
    //   4305: istore #22
    //   4307: iload #21
    //   4309: aload #15
    //   4311: iload #22
    //   4313: bipush #63
    //   4315: iand
    //   4316: iaload
    //   4317: ior
    //   4318: istore #21
    //   4320: iload #21
    //   4322: aload #13
    //   4324: iload #22
    //   4326: bipush #8
    //   4328: iushr
    //   4329: bipush #63
    //   4331: iand
    //   4332: iaload
    //   4333: ior
    //   4334: istore #21
    //   4336: iload #21
    //   4338: aload #11
    //   4340: iload #22
    //   4342: bipush #16
    //   4344: iushr
    //   4345: bipush #63
    //   4347: iand
    //   4348: iaload
    //   4349: ior
    //   4350: istore #21
    //   4352: iload #21
    //   4354: aload #9
    //   4356: iload #22
    //   4358: bipush #24
    //   4360: iushr
    //   4361: bipush #63
    //   4363: iand
    //   4364: iaload
    //   4365: ior
    //   4366: istore #21
    //   4368: iload #23
    //   4370: iload #21
    //   4372: ixor
    //   4373: istore #23
    //   4375: iinc #25, 1
    //   4378: iload_2
    //   4379: ifne -> 4040
    //   4382: iload #23
    //   4384: bipush #31
    //   4386: ishl
    //   4387: iload #23
    //   4389: iconst_1
    //   4390: iushr
    //   4391: ior
    //   4392: istore #23
    //   4394: iload #24
    //   4396: iload #23
    //   4398: ixor
    //   4399: ldc -1431655766
    //   4401: iand
    //   4402: istore #22
    //   4404: iload #24
    //   4406: iload #22
    //   4408: ixor
    //   4409: istore #24
    //   4411: iload #23
    //   4413: iload #22
    //   4415: ixor
    //   4416: istore #23
    //   4418: iload #24
    //   4420: bipush #31
    //   4422: ishl
    //   4423: iload #24
    //   4425: iconst_1
    //   4426: iushr
    //   4427: ior
    //   4428: istore #24
    //   4430: iload #24
    //   4432: bipush #8
    //   4434: iushr
    //   4435: iload #23
    //   4437: ixor
    //   4438: ldc 16711935
    //   4440: iand
    //   4441: istore #22
    //   4443: iload #23
    //   4445: iload #22
    //   4447: ixor
    //   4448: istore #23
    //   4450: iload #24
    //   4452: iload #22
    //   4454: bipush #8
    //   4456: ishl
    //   4457: ixor
    //   4458: istore #24
    //   4460: iload #24
    //   4462: iconst_2
    //   4463: iushr
    //   4464: iload #23
    //   4466: ixor
    //   4467: ldc 858993459
    //   4469: iand
    //   4470: istore #22
    //   4472: iload #23
    //   4474: iload #22
    //   4476: ixor
    //   4477: istore #23
    //   4479: iload #24
    //   4481: iload #22
    //   4483: iconst_2
    //   4484: ishl
    //   4485: ixor
    //   4486: istore #24
    //   4488: iload #23
    //   4490: bipush #16
    //   4492: iushr
    //   4493: iload #24
    //   4495: ixor
    //   4496: ldc 65535
    //   4498: iand
    //   4499: istore #22
    //   4501: iload #24
    //   4503: iload #22
    //   4505: ixor
    //   4506: istore #24
    //   4508: iload #23
    //   4510: iload #22
    //   4512: bipush #16
    //   4514: ishl
    //   4515: ixor
    //   4516: istore #23
    //   4518: iload #23
    //   4520: iconst_4
    //   4521: iushr
    //   4522: iload #24
    //   4524: ixor
    //   4525: ldc 252645135
    //   4527: iand
    //   4528: istore #22
    //   4530: iload #24
    //   4532: iload #22
    //   4534: ixor
    //   4535: istore #24
    //   4537: iload #23
    //   4539: iload #22
    //   4541: iconst_4
    //   4542: ishl
    //   4543: ixor
    //   4544: istore #23
    //   4546: aload #17
    //   4548: iconst_0
    //   4549: iload #23
    //   4551: iastore
    //   4552: aload #17
    //   4554: iconst_1
    //   4555: iload #24
    //   4557: iastore
    //   4558: iload #19
    //   4560: bipush #8
    //   4562: imul
    //   4563: istore #27
    //   4565: iconst_0
    //   4566: istore #28
    //   4568: iload #28
    //   4570: iconst_2
    //   4571: if_icmpge -> 4660
    //   4574: aload #4
    //   4576: iload #27
    //   4578: iload #28
    //   4580: iconst_4
    //   4581: imul
    //   4582: iadd
    //   4583: aload #17
    //   4585: iload #28
    //   4587: iaload
    //   4588: bipush #24
    //   4590: iushr
    //   4591: i2b
    //   4592: bastore
    //   4593: aload #4
    //   4595: iload #27
    //   4597: iload #28
    //   4599: iconst_4
    //   4600: imul
    //   4601: iadd
    //   4602: iconst_1
    //   4603: iadd
    //   4604: aload #17
    //   4606: iload #28
    //   4608: iaload
    //   4609: bipush #16
    //   4611: iushr
    //   4612: i2b
    //   4613: bastore
    //   4614: aload #4
    //   4616: iload #27
    //   4618: iload #28
    //   4620: iconst_4
    //   4621: imul
    //   4622: iadd
    //   4623: iconst_2
    //   4624: iadd
    //   4625: aload #17
    //   4627: iload #28
    //   4629: iaload
    //   4630: bipush #8
    //   4632: iushr
    //   4633: i2b
    //   4634: bastore
    //   4635: aload #4
    //   4637: iload #27
    //   4639: iload #28
    //   4641: iconst_4
    //   4642: imul
    //   4643: iadd
    //   4644: iconst_3
    //   4645: iadd
    //   4646: aload #17
    //   4648: iload #28
    //   4650: iaload
    //   4651: i2b
    //   4652: bastore
    //   4653: iinc #28, 1
    //   4656: iload_2
    //   4657: ifne -> 4568
    //   4660: iinc #19, 1
    //   4663: iload_2
    //   4664: ifne -> 3749
    //   4667: iconst_0
    //   4668: istore_3
    //   4669: getstatic burp/Zg0q.Ze : Ljava/lang/String;
    //   4672: getstatic burp/Zld5.ZX : Ljava/lang/Object;
    //   4675: checkcast java/math/BigInteger
    //   4678: invokevirtual intValue : ()I
    //   4681: bipush #32
    //   4683: irem
    //   4684: invokestatic abs : (I)I
    //   4687: invokevirtual charAt : (I)C
    //   4690: getstatic burp/Zsvd.ZB : Ljava/lang/String;
    //   4693: getstatic burp/Zbx5.ZL : Ljava/lang/Object;
    //   4696: checkcast java/math/BigInteger
    //   4699: invokevirtual intValue : ()I
    //   4702: bipush #32
    //   4704: irem
    //   4705: invokestatic abs : (I)I
    //   4708: invokevirtual charAt : (I)C
    //   4711: if_icmpgt -> 5055
    //   4714: sipush #10679
    //   4717: sipush #24218
    //   4720: invokestatic a : (II)Ljava/lang/String;
    //   4723: iconst_1
    //   4724: ldc burp/Ztte
    //   4726: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4729: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4732: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4735: astore #4
    //   4737: aload #4
    //   4739: arraylength
    //   4740: istore #5
    //   4742: iconst_0
    //   4743: istore #6
    //   4745: iload #6
    //   4747: iload #5
    //   4749: if_icmpge -> 4887
    //   4752: aload #4
    //   4754: iload #6
    //   4756: aaload
    //   4757: astore #7
    //   4759: aload #7
    //   4761: invokevirtual getModifiers : ()I
    //   4764: invokestatic isStatic : (I)Z
    //   4767: ifne -> 4777
    //   4770: goto -> 4880
    //   4773: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4776: athrow
    //   4777: aload #7
    //   4779: invokevirtual getType : ()Ljava/lang/Class;
    //   4782: astore #8
    //   4784: aload #8
    //   4786: ifnull -> 4867
    //   4789: aload #8
    //   4791: invokevirtual isPrimitive : ()Z
    //   4794: ifne -> 4867
    //   4797: goto -> 4804
    //   4800: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4803: athrow
    //   4804: aload #8
    //   4806: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4809: ifnull -> 4867
    //   4812: goto -> 4819
    //   4815: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4818: athrow
    //   4819: aload #8
    //   4821: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4824: invokevirtual getName : ()Ljava/lang/String;
    //   4827: ifnull -> 4867
    //   4830: goto -> 4837
    //   4833: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4836: athrow
    //   4837: aload #8
    //   4839: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4842: invokevirtual getName : ()Ljava/lang/String;
    //   4845: sipush #10661
    //   4848: sipush #8903
    //   4851: invokestatic a : (II)Ljava/lang/String;
    //   4854: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4857: ifne -> 4867
    //   4860: goto -> 4867
    //   4863: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4866: athrow
    //   4867: aload #7
    //   4869: iconst_1
    //   4870: invokevirtual setAccessible : (Z)V
    //   4873: aload #7
    //   4875: aconst_null
    //   4876: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4879: pop
    //   4880: iinc #6, 1
    //   4883: iload_2
    //   4884: ifne -> 4745
    //   4887: sipush #10660
    //   4890: sipush #14928
    //   4893: invokestatic a : (II)Ljava/lang/String;
    //   4896: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4899: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4902: astore #4
    //   4904: aload #4
    //   4906: arraylength
    //   4907: istore #5
    //   4909: iconst_0
    //   4910: istore #6
    //   4912: iload #6
    //   4914: iload #5
    //   4916: if_icmpge -> 5052
    //   4919: aload #4
    //   4921: iload #6
    //   4923: aaload
    //   4924: astore #7
    //   4926: aload #7
    //   4928: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4931: pop
    //   4932: aload #7
    //   4934: invokevirtual getModifiers : ()I
    //   4937: invokestatic isStatic : (I)Z
    //   4940: ifeq -> 5038
    //   4943: aload #7
    //   4945: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4948: arraylength
    //   4949: iconst_2
    //   4950: if_icmpne -> 5038
    //   4953: goto -> 4960
    //   4956: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4959: athrow
    //   4960: aload #7
    //   4962: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4965: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4968: if_acmpne -> 5038
    //   4971: goto -> 4978
    //   4974: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4977: athrow
    //   4978: aload #7
    //   4980: iconst_1
    //   4981: invokevirtual setAccessible : (Z)V
    //   4984: aload #7
    //   4986: aconst_null
    //   4987: iconst_2
    //   4988: anewarray java/lang/Object
    //   4991: dup
    //   4992: iconst_0
    //   4993: aload_0
    //   4994: aastore
    //   4995: dup
    //   4996: iconst_1
    //   4997: aload_1
    //   4998: ifnonnull -> 5016
    //   5001: goto -> 5008
    //   5004: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5007: athrow
    //   5008: aload_1
    //   5009: goto -> 5023
    //   5012: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5015: athrow
    //   5016: aload_1
    //   5017: checkcast [B
    //   5020: invokevirtual clone : ()Ljava/lang/Object;
    //   5023: aastore
    //   5024: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5027: checkcast java/lang/Boolean
    //   5030: invokevirtual booleanValue : ()Z
    //   5033: istore_3
    //   5034: iload_2
    //   5035: ifne -> 5052
    //   5038: iinc #6, 1
    //   5041: iload_2
    //   5042: ifne -> 4912
    //   5045: goto -> 5052
    //   5048: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5051: athrow
    //   5052: goto -> 5393
    //   5055: sipush #10677
    //   5058: sipush #-28015
    //   5061: invokestatic a : (II)Ljava/lang/String;
    //   5064: iconst_1
    //   5065: ldc burp/Zvof
    //   5067: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5070: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5073: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5076: astore #4
    //   5078: aload #4
    //   5080: arraylength
    //   5081: istore #5
    //   5083: iconst_0
    //   5084: istore #6
    //   5086: iload #6
    //   5088: iload #5
    //   5090: if_icmpge -> 5228
    //   5093: aload #4
    //   5095: iload #6
    //   5097: aaload
    //   5098: astore #7
    //   5100: aload #7
    //   5102: invokevirtual getModifiers : ()I
    //   5105: invokestatic isStatic : (I)Z
    //   5108: ifne -> 5118
    //   5111: goto -> 5221
    //   5114: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5117: athrow
    //   5118: aload #7
    //   5120: invokevirtual getType : ()Ljava/lang/Class;
    //   5123: astore #8
    //   5125: aload #8
    //   5127: ifnull -> 5208
    //   5130: aload #8
    //   5132: invokevirtual isPrimitive : ()Z
    //   5135: ifne -> 5208
    //   5138: goto -> 5145
    //   5141: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5144: athrow
    //   5145: aload #8
    //   5147: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5150: ifnull -> 5208
    //   5153: goto -> 5160
    //   5156: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5159: athrow
    //   5160: aload #8
    //   5162: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5165: invokevirtual getName : ()Ljava/lang/String;
    //   5168: ifnull -> 5208
    //   5171: goto -> 5178
    //   5174: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5177: athrow
    //   5178: aload #8
    //   5180: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5183: invokevirtual getName : ()Ljava/lang/String;
    //   5186: sipush #10661
    //   5189: sipush #8903
    //   5192: invokestatic a : (II)Ljava/lang/String;
    //   5195: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5198: ifne -> 5208
    //   5201: goto -> 5208
    //   5204: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5207: athrow
    //   5208: aload #7
    //   5210: iconst_1
    //   5211: invokevirtual setAccessible : (Z)V
    //   5214: aload #7
    //   5216: aconst_null
    //   5217: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5220: pop
    //   5221: iinc #6, 1
    //   5224: iload_2
    //   5225: ifne -> 5086
    //   5228: sipush #10663
    //   5231: sipush #8505
    //   5234: invokestatic a : (II)Ljava/lang/String;
    //   5237: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5240: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5243: astore #4
    //   5245: aload #4
    //   5247: arraylength
    //   5248: istore #5
    //   5250: iconst_0
    //   5251: istore #6
    //   5253: iload #6
    //   5255: iload #5
    //   5257: if_icmpge -> 5393
    //   5260: aload #4
    //   5262: iload #6
    //   5264: aaload
    //   5265: astore #7
    //   5267: aload #7
    //   5269: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5272: pop
    //   5273: aload #7
    //   5275: invokevirtual getModifiers : ()I
    //   5278: invokestatic isStatic : (I)Z
    //   5281: ifeq -> 5379
    //   5284: aload #7
    //   5286: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5289: arraylength
    //   5290: iconst_2
    //   5291: if_icmpne -> 5379
    //   5294: goto -> 5301
    //   5297: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5300: athrow
    //   5301: aload #7
    //   5303: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5306: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   5309: if_acmpne -> 5379
    //   5312: goto -> 5319
    //   5315: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5318: athrow
    //   5319: aload #7
    //   5321: iconst_1
    //   5322: invokevirtual setAccessible : (Z)V
    //   5325: aload #7
    //   5327: aconst_null
    //   5328: iconst_2
    //   5329: anewarray java/lang/Object
    //   5332: dup
    //   5333: iconst_0
    //   5334: aload_0
    //   5335: aastore
    //   5336: dup
    //   5337: iconst_1
    //   5338: aload_1
    //   5339: ifnonnull -> 5357
    //   5342: goto -> 5349
    //   5345: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5348: athrow
    //   5349: aload_1
    //   5350: goto -> 5364
    //   5353: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5356: athrow
    //   5357: aload_1
    //   5358: checkcast [B
    //   5361: invokevirtual clone : ()Ljava/lang/Object;
    //   5364: aastore
    //   5365: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5368: checkcast java/lang/Boolean
    //   5371: invokevirtual booleanValue : ()Z
    //   5374: istore_3
    //   5375: iload_2
    //   5376: ifne -> 5393
    //   5379: iinc #6, 1
    //   5382: iload_2
    //   5383: ifne -> 5253
    //   5386: goto -> 5393
    //   5389: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5392: athrow
    //   5393: iload_3
    //   5394: ifeq -> 5399
    //   5397: iload_3
    //   5398: ireturn
    //   5399: getstatic burp/Zr60.ZQ : Ljava/lang/String;
    //   5402: getstatic burp/Zst7.ZI : Ljava/lang/Object;
    //   5405: checkcast java/math/BigInteger
    //   5408: invokevirtual intValue : ()I
    //   5411: bipush #32
    //   5413: irem
    //   5414: invokestatic abs : (I)I
    //   5417: invokevirtual charAt : (I)C
    //   5420: getstatic burp/Zxan.ZJ : Ljava/lang/String;
    //   5423: getstatic burp/Zlxr.Zz : Ljava/lang/Object;
    //   5426: checkcast java/math/BigInteger
    //   5429: invokevirtual intValue : ()I
    //   5432: bipush #32
    //   5434: irem
    //   5435: invokestatic abs : (I)I
    //   5438: invokevirtual charAt : (I)C
    //   5441: if_icmple -> 5786
    //   5444: sipush #10657
    //   5447: sipush #1535
    //   5450: invokestatic a : (II)Ljava/lang/String;
    //   5453: iconst_1
    //   5454: ldc burp/Zsgj
    //   5456: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5459: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5462: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5465: astore #4
    //   5467: aload #4
    //   5469: arraylength
    //   5470: istore #5
    //   5472: iconst_0
    //   5473: istore #6
    //   5475: iload #6
    //   5477: iload #5
    //   5479: if_icmpge -> 5617
    //   5482: aload #4
    //   5484: iload #6
    //   5486: aaload
    //   5487: astore #7
    //   5489: aload #7
    //   5491: invokevirtual getModifiers : ()I
    //   5494: invokestatic isStatic : (I)Z
    //   5497: ifne -> 5507
    //   5500: goto -> 5610
    //   5503: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5506: athrow
    //   5507: aload #7
    //   5509: invokevirtual getType : ()Ljava/lang/Class;
    //   5512: astore #8
    //   5514: aload #8
    //   5516: ifnull -> 5597
    //   5519: aload #8
    //   5521: invokevirtual isPrimitive : ()Z
    //   5524: ifne -> 5597
    //   5527: goto -> 5534
    //   5530: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5533: athrow
    //   5534: aload #8
    //   5536: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5539: ifnull -> 5597
    //   5542: goto -> 5549
    //   5545: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5548: athrow
    //   5549: aload #8
    //   5551: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5554: invokevirtual getName : ()Ljava/lang/String;
    //   5557: ifnull -> 5597
    //   5560: goto -> 5567
    //   5563: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5566: athrow
    //   5567: aload #8
    //   5569: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5572: invokevirtual getName : ()Ljava/lang/String;
    //   5575: sipush #10661
    //   5578: sipush #8903
    //   5581: invokestatic a : (II)Ljava/lang/String;
    //   5584: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5587: ifne -> 5597
    //   5590: goto -> 5597
    //   5593: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5596: athrow
    //   5597: aload #7
    //   5599: iconst_1
    //   5600: invokevirtual setAccessible : (Z)V
    //   5603: aload #7
    //   5605: aconst_null
    //   5606: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5609: pop
    //   5610: iinc #6, 1
    //   5613: iload_2
    //   5614: ifne -> 5475
    //   5617: sipush #10681
    //   5620: sipush #-30384
    //   5623: invokestatic a : (II)Ljava/lang/String;
    //   5626: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5629: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5632: astore #4
    //   5634: aload #4
    //   5636: arraylength
    //   5637: istore #5
    //   5639: iconst_0
    //   5640: istore #6
    //   5642: iload #6
    //   5644: iload #5
    //   5646: if_icmpge -> 5782
    //   5649: aload #4
    //   5651: iload #6
    //   5653: aaload
    //   5654: astore #7
    //   5656: aload #7
    //   5658: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5661: pop
    //   5662: aload #7
    //   5664: invokevirtual getModifiers : ()I
    //   5667: invokestatic isStatic : (I)Z
    //   5670: ifeq -> 5768
    //   5673: aload #7
    //   5675: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5678: arraylength
    //   5679: iconst_2
    //   5680: if_icmpne -> 5768
    //   5683: goto -> 5690
    //   5686: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5689: athrow
    //   5690: aload #7
    //   5692: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5695: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   5698: if_acmpne -> 5768
    //   5701: goto -> 5708
    //   5704: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5707: athrow
    //   5708: aload #7
    //   5710: iconst_1
    //   5711: invokevirtual setAccessible : (Z)V
    //   5714: aload #7
    //   5716: aconst_null
    //   5717: iconst_2
    //   5718: anewarray java/lang/Object
    //   5721: dup
    //   5722: iconst_0
    //   5723: aload_0
    //   5724: aastore
    //   5725: dup
    //   5726: iconst_1
    //   5727: aload_1
    //   5728: ifnonnull -> 5746
    //   5731: goto -> 5738
    //   5734: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5737: athrow
    //   5738: aload_1
    //   5739: goto -> 5753
    //   5742: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5745: athrow
    //   5746: aload_1
    //   5747: checkcast [B
    //   5750: invokevirtual clone : ()Ljava/lang/Object;
    //   5753: aastore
    //   5754: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5757: checkcast java/lang/Boolean
    //   5760: invokevirtual booleanValue : ()Z
    //   5763: istore_3
    //   5764: iload_2
    //   5765: ifne -> 5782
    //   5768: iinc #6, 1
    //   5771: iload_2
    //   5772: ifne -> 5642
    //   5775: goto -> 5782
    //   5778: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5781: athrow
    //   5782: iload_2
    //   5783: ifne -> 6124
    //   5786: sipush #10676
    //   5789: sipush #-14613
    //   5792: invokestatic a : (II)Ljava/lang/String;
    //   5795: iconst_1
    //   5796: ldc burp/Zeuz
    //   5798: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5801: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5804: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5807: astore #4
    //   5809: aload #4
    //   5811: arraylength
    //   5812: istore #5
    //   5814: iconst_0
    //   5815: istore #6
    //   5817: iload #6
    //   5819: iload #5
    //   5821: if_icmpge -> 5959
    //   5824: aload #4
    //   5826: iload #6
    //   5828: aaload
    //   5829: astore #7
    //   5831: aload #7
    //   5833: invokevirtual getModifiers : ()I
    //   5836: invokestatic isStatic : (I)Z
    //   5839: ifne -> 5849
    //   5842: goto -> 5952
    //   5845: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5848: athrow
    //   5849: aload #7
    //   5851: invokevirtual getType : ()Ljava/lang/Class;
    //   5854: astore #8
    //   5856: aload #8
    //   5858: ifnull -> 5939
    //   5861: aload #8
    //   5863: invokevirtual isPrimitive : ()Z
    //   5866: ifne -> 5939
    //   5869: goto -> 5876
    //   5872: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5875: athrow
    //   5876: aload #8
    //   5878: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5881: ifnull -> 5939
    //   5884: goto -> 5891
    //   5887: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5890: athrow
    //   5891: aload #8
    //   5893: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5896: invokevirtual getName : ()Ljava/lang/String;
    //   5899: ifnull -> 5939
    //   5902: goto -> 5909
    //   5905: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5908: athrow
    //   5909: aload #8
    //   5911: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5914: invokevirtual getName : ()Ljava/lang/String;
    //   5917: sipush #10661
    //   5920: sipush #8903
    //   5923: invokestatic a : (II)Ljava/lang/String;
    //   5926: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5929: ifne -> 5939
    //   5932: goto -> 5939
    //   5935: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5938: athrow
    //   5939: aload #7
    //   5941: iconst_1
    //   5942: invokevirtual setAccessible : (Z)V
    //   5945: aload #7
    //   5947: aconst_null
    //   5948: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5951: pop
    //   5952: iinc #6, 1
    //   5955: iload_2
    //   5956: ifne -> 5817
    //   5959: sipush #10662
    //   5962: sipush #13480
    //   5965: invokestatic a : (II)Ljava/lang/String;
    //   5968: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5971: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5974: astore #4
    //   5976: aload #4
    //   5978: arraylength
    //   5979: istore #5
    //   5981: iconst_0
    //   5982: istore #6
    //   5984: iload #6
    //   5986: iload #5
    //   5988: if_icmpge -> 6124
    //   5991: aload #4
    //   5993: iload #6
    //   5995: aaload
    //   5996: astore #7
    //   5998: aload #7
    //   6000: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6003: pop
    //   6004: aload #7
    //   6006: invokevirtual getModifiers : ()I
    //   6009: invokestatic isStatic : (I)Z
    //   6012: ifeq -> 6110
    //   6015: aload #7
    //   6017: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6020: arraylength
    //   6021: iconst_2
    //   6022: if_icmpne -> 6110
    //   6025: goto -> 6032
    //   6028: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6031: athrow
    //   6032: aload #7
    //   6034: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   6037: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   6040: if_acmpne -> 6110
    //   6043: goto -> 6050
    //   6046: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6049: athrow
    //   6050: aload #7
    //   6052: iconst_1
    //   6053: invokevirtual setAccessible : (Z)V
    //   6056: aload #7
    //   6058: aconst_null
    //   6059: iconst_2
    //   6060: anewarray java/lang/Object
    //   6063: dup
    //   6064: iconst_0
    //   6065: aload_0
    //   6066: aastore
    //   6067: dup
    //   6068: iconst_1
    //   6069: aload_1
    //   6070: ifnonnull -> 6088
    //   6073: goto -> 6080
    //   6076: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6079: athrow
    //   6080: aload_1
    //   6081: goto -> 6095
    //   6084: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6087: athrow
    //   6088: aload_1
    //   6089: checkcast [B
    //   6092: invokevirtual clone : ()Ljava/lang/Object;
    //   6095: aastore
    //   6096: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   6099: checkcast java/lang/Boolean
    //   6102: invokevirtual booleanValue : ()Z
    //   6105: istore_3
    //   6106: iload_2
    //   6107: ifne -> 6124
    //   6110: iinc #6, 1
    //   6113: iload_2
    //   6114: ifne -> 5984
    //   6117: goto -> 6124
    //   6120: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6123: athrow
    //   6124: iload_3
    //   6125: ifeq -> 6130
    //   6128: iload_3
    //   6129: ireturn
    //   6130: getstatic burp/Ze7e.Zc : Ljava/lang/String;
    //   6133: getstatic burp/Zlcc.ZP : Ljava/lang/Object;
    //   6136: checkcast java/math/BigInteger
    //   6139: invokevirtual intValue : ()I
    //   6142: bipush #32
    //   6144: irem
    //   6145: invokestatic abs : (I)I
    //   6148: invokevirtual charAt : (I)C
    //   6151: getstatic burp/Zrle.ZG : Ljava/lang/String;
    //   6154: getstatic burp/Zxxo.ZJ : Ljava/lang/Object;
    //   6157: checkcast java/math/BigInteger
    //   6160: invokevirtual intValue : ()I
    //   6163: bipush #32
    //   6165: irem
    //   6166: invokestatic abs : (I)I
    //   6169: invokevirtual charAt : (I)C
    //   6172: if_icmpgt -> 6517
    //   6175: sipush #10683
    //   6178: sipush #-24681
    //   6181: invokestatic a : (II)Ljava/lang/String;
    //   6184: iconst_1
    //   6185: ldc burp/Zty5
    //   6187: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   6190: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   6193: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   6196: astore #4
    //   6198: aload #4
    //   6200: arraylength
    //   6201: istore #5
    //   6203: iconst_0
    //   6204: istore #6
    //   6206: iload #6
    //   6208: iload #5
    //   6210: if_icmpge -> 6348
    //   6213: aload #4
    //   6215: iload #6
    //   6217: aaload
    //   6218: astore #7
    //   6220: aload #7
    //   6222: invokevirtual getModifiers : ()I
    //   6225: invokestatic isStatic : (I)Z
    //   6228: ifne -> 6238
    //   6231: goto -> 6341
    //   6234: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6237: athrow
    //   6238: aload #7
    //   6240: invokevirtual getType : ()Ljava/lang/Class;
    //   6243: astore #8
    //   6245: aload #8
    //   6247: ifnull -> 6328
    //   6250: aload #8
    //   6252: invokevirtual isPrimitive : ()Z
    //   6255: ifne -> 6328
    //   6258: goto -> 6265
    //   6261: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6264: athrow
    //   6265: aload #8
    //   6267: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6270: ifnull -> 6328
    //   6273: goto -> 6280
    //   6276: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6279: athrow
    //   6280: aload #8
    //   6282: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6285: invokevirtual getName : ()Ljava/lang/String;
    //   6288: ifnull -> 6328
    //   6291: goto -> 6298
    //   6294: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6297: athrow
    //   6298: aload #8
    //   6300: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6303: invokevirtual getName : ()Ljava/lang/String;
    //   6306: sipush #10661
    //   6309: sipush #8903
    //   6312: invokestatic a : (II)Ljava/lang/String;
    //   6315: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   6318: ifne -> 6328
    //   6321: goto -> 6328
    //   6324: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6327: athrow
    //   6328: aload #7
    //   6330: iconst_1
    //   6331: invokevirtual setAccessible : (Z)V
    //   6334: aload #7
    //   6336: aconst_null
    //   6337: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   6340: pop
    //   6341: iinc #6, 1
    //   6344: iload_2
    //   6345: ifne -> 6206
    //   6348: sipush #10678
    //   6351: sipush #8991
    //   6354: invokestatic a : (II)Ljava/lang/String;
    //   6357: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   6360: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   6363: astore #4
    //   6365: aload #4
    //   6367: arraylength
    //   6368: istore #5
    //   6370: iconst_0
    //   6371: istore #6
    //   6373: iload #6
    //   6375: iload #5
    //   6377: if_icmpge -> 6513
    //   6380: aload #4
    //   6382: iload #6
    //   6384: aaload
    //   6385: astore #7
    //   6387: aload #7
    //   6389: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6392: pop
    //   6393: aload #7
    //   6395: invokevirtual getModifiers : ()I
    //   6398: invokestatic isStatic : (I)Z
    //   6401: ifeq -> 6499
    //   6404: aload #7
    //   6406: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6409: arraylength
    //   6410: iconst_2
    //   6411: if_icmpne -> 6499
    //   6414: goto -> 6421
    //   6417: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6420: athrow
    //   6421: aload #7
    //   6423: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   6426: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   6429: if_acmpne -> 6499
    //   6432: goto -> 6439
    //   6435: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6438: athrow
    //   6439: aload #7
    //   6441: iconst_1
    //   6442: invokevirtual setAccessible : (Z)V
    //   6445: aload #7
    //   6447: aconst_null
    //   6448: iconst_2
    //   6449: anewarray java/lang/Object
    //   6452: dup
    //   6453: iconst_0
    //   6454: aload_0
    //   6455: aastore
    //   6456: dup
    //   6457: iconst_1
    //   6458: aload_1
    //   6459: ifnonnull -> 6477
    //   6462: goto -> 6469
    //   6465: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6468: athrow
    //   6469: aload_1
    //   6470: goto -> 6484
    //   6473: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6476: athrow
    //   6477: aload_1
    //   6478: checkcast [B
    //   6481: invokevirtual clone : ()Ljava/lang/Object;
    //   6484: aastore
    //   6485: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   6488: checkcast java/lang/Boolean
    //   6491: invokevirtual booleanValue : ()Z
    //   6494: istore_3
    //   6495: iload_2
    //   6496: ifne -> 6513
    //   6499: iinc #6, 1
    //   6502: iload_2
    //   6503: ifne -> 6373
    //   6506: goto -> 6513
    //   6509: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6512: athrow
    //   6513: iload_2
    //   6514: ifne -> 6855
    //   6517: sipush #10687
    //   6520: sipush #-2575
    //   6523: invokestatic a : (II)Ljava/lang/String;
    //   6526: iconst_1
    //   6527: ldc burp/Zg0j
    //   6529: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   6532: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   6535: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   6538: astore #4
    //   6540: aload #4
    //   6542: arraylength
    //   6543: istore #5
    //   6545: iconst_0
    //   6546: istore #6
    //   6548: iload #6
    //   6550: iload #5
    //   6552: if_icmpge -> 6690
    //   6555: aload #4
    //   6557: iload #6
    //   6559: aaload
    //   6560: astore #7
    //   6562: aload #7
    //   6564: invokevirtual getModifiers : ()I
    //   6567: invokestatic isStatic : (I)Z
    //   6570: ifne -> 6580
    //   6573: goto -> 6683
    //   6576: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6579: athrow
    //   6580: aload #7
    //   6582: invokevirtual getType : ()Ljava/lang/Class;
    //   6585: astore #8
    //   6587: aload #8
    //   6589: ifnull -> 6670
    //   6592: aload #8
    //   6594: invokevirtual isPrimitive : ()Z
    //   6597: ifne -> 6670
    //   6600: goto -> 6607
    //   6603: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6606: athrow
    //   6607: aload #8
    //   6609: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6612: ifnull -> 6670
    //   6615: goto -> 6622
    //   6618: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6621: athrow
    //   6622: aload #8
    //   6624: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6627: invokevirtual getName : ()Ljava/lang/String;
    //   6630: ifnull -> 6670
    //   6633: goto -> 6640
    //   6636: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6639: athrow
    //   6640: aload #8
    //   6642: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6645: invokevirtual getName : ()Ljava/lang/String;
    //   6648: sipush #10661
    //   6651: sipush #8903
    //   6654: invokestatic a : (II)Ljava/lang/String;
    //   6657: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   6660: ifne -> 6670
    //   6663: goto -> 6670
    //   6666: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6669: athrow
    //   6670: aload #7
    //   6672: iconst_1
    //   6673: invokevirtual setAccessible : (Z)V
    //   6676: aload #7
    //   6678: aconst_null
    //   6679: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   6682: pop
    //   6683: iinc #6, 1
    //   6686: iload_2
    //   6687: ifne -> 6548
    //   6690: sipush #10658
    //   6693: sipush #-13167
    //   6696: invokestatic a : (II)Ljava/lang/String;
    //   6699: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   6702: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   6705: astore #4
    //   6707: aload #4
    //   6709: arraylength
    //   6710: istore #5
    //   6712: iconst_0
    //   6713: istore #6
    //   6715: iload #6
    //   6717: iload #5
    //   6719: if_icmpge -> 6855
    //   6722: aload #4
    //   6724: iload #6
    //   6726: aaload
    //   6727: astore #7
    //   6729: aload #7
    //   6731: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6734: pop
    //   6735: aload #7
    //   6737: invokevirtual getModifiers : ()I
    //   6740: invokestatic isStatic : (I)Z
    //   6743: ifeq -> 6841
    //   6746: aload #7
    //   6748: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6751: arraylength
    //   6752: iconst_2
    //   6753: if_icmpne -> 6841
    //   6756: goto -> 6763
    //   6759: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6762: athrow
    //   6763: aload #7
    //   6765: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   6768: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   6771: if_acmpne -> 6841
    //   6774: goto -> 6781
    //   6777: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6780: athrow
    //   6781: aload #7
    //   6783: iconst_1
    //   6784: invokevirtual setAccessible : (Z)V
    //   6787: aload #7
    //   6789: aconst_null
    //   6790: iconst_2
    //   6791: anewarray java/lang/Object
    //   6794: dup
    //   6795: iconst_0
    //   6796: aload_0
    //   6797: aastore
    //   6798: dup
    //   6799: iconst_1
    //   6800: aload_1
    //   6801: ifnonnull -> 6819
    //   6804: goto -> 6811
    //   6807: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6810: athrow
    //   6811: aload_1
    //   6812: goto -> 6826
    //   6815: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6818: athrow
    //   6819: aload_1
    //   6820: checkcast [B
    //   6823: invokevirtual clone : ()Ljava/lang/Object;
    //   6826: aastore
    //   6827: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   6830: checkcast java/lang/Boolean
    //   6833: invokevirtual booleanValue : ()Z
    //   6836: istore_3
    //   6837: iload_2
    //   6838: ifne -> 6855
    //   6841: iinc #6, 1
    //   6844: iload_2
    //   6845: ifne -> 6715
    //   6848: goto -> 6855
    //   6851: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6854: athrow
    //   6855: iload_3
    //   6856: ifeq -> 6861
    //   6859: iload_3
    //   6860: ireturn
    //   6861: getstatic burp/Zmll.Zu : Ljava/lang/String;
    //   6864: getstatic burp/Ztgv.Zg : Ljava/lang/Object;
    //   6867: checkcast java/math/BigInteger
    //   6870: invokevirtual intValue : ()I
    //   6873: bipush #32
    //   6875: irem
    //   6876: invokestatic abs : (I)I
    //   6879: invokevirtual charAt : (I)C
    //   6882: getstatic burp/Zg1l.Zl : Ljava/lang/String;
    //   6885: getstatic burp/Zxy6.Zd : Ljava/lang/Object;
    //   6888: checkcast java/math/BigInteger
    //   6891: invokevirtual intValue : ()I
    //   6894: bipush #32
    //   6896: irem
    //   6897: invokestatic abs : (I)I
    //   6900: invokevirtual charAt : (I)C
    //   6903: if_icmpgt -> 7248
    //   6906: sipush #10684
    //   6909: sipush #-11996
    //   6912: invokestatic a : (II)Ljava/lang/String;
    //   6915: iconst_1
    //   6916: ldc burp/Zmh5
    //   6918: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   6921: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   6924: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   6927: astore #4
    //   6929: aload #4
    //   6931: arraylength
    //   6932: istore #5
    //   6934: iconst_0
    //   6935: istore #6
    //   6937: iload #6
    //   6939: iload #5
    //   6941: if_icmpge -> 7079
    //   6944: aload #4
    //   6946: iload #6
    //   6948: aaload
    //   6949: astore #7
    //   6951: aload #7
    //   6953: invokevirtual getModifiers : ()I
    //   6956: invokestatic isStatic : (I)Z
    //   6959: ifne -> 6969
    //   6962: goto -> 7072
    //   6965: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6968: athrow
    //   6969: aload #7
    //   6971: invokevirtual getType : ()Ljava/lang/Class;
    //   6974: astore #8
    //   6976: aload #8
    //   6978: ifnull -> 7059
    //   6981: aload #8
    //   6983: invokevirtual isPrimitive : ()Z
    //   6986: ifne -> 7059
    //   6989: goto -> 6996
    //   6992: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6995: athrow
    //   6996: aload #8
    //   6998: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7001: ifnull -> 7059
    //   7004: goto -> 7011
    //   7007: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7010: athrow
    //   7011: aload #8
    //   7013: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7016: invokevirtual getName : ()Ljava/lang/String;
    //   7019: ifnull -> 7059
    //   7022: goto -> 7029
    //   7025: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7028: athrow
    //   7029: aload #8
    //   7031: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7034: invokevirtual getName : ()Ljava/lang/String;
    //   7037: sipush #10661
    //   7040: sipush #8903
    //   7043: invokestatic a : (II)Ljava/lang/String;
    //   7046: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   7049: ifne -> 7059
    //   7052: goto -> 7059
    //   7055: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7058: athrow
    //   7059: aload #7
    //   7061: iconst_1
    //   7062: invokevirtual setAccessible : (Z)V
    //   7065: aload #7
    //   7067: aconst_null
    //   7068: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   7071: pop
    //   7072: iinc #6, 1
    //   7075: iload_2
    //   7076: ifne -> 6937
    //   7079: sipush #10664
    //   7082: sipush #-14831
    //   7085: invokestatic a : (II)Ljava/lang/String;
    //   7088: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   7091: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   7094: astore #4
    //   7096: aload #4
    //   7098: arraylength
    //   7099: istore #5
    //   7101: iconst_0
    //   7102: istore #6
    //   7104: iload #6
    //   7106: iload #5
    //   7108: if_icmpge -> 7244
    //   7111: aload #4
    //   7113: iload #6
    //   7115: aaload
    //   7116: astore #7
    //   7118: aload #7
    //   7120: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   7123: pop
    //   7124: aload #7
    //   7126: invokevirtual getModifiers : ()I
    //   7129: invokestatic isStatic : (I)Z
    //   7132: ifeq -> 7230
    //   7135: aload #7
    //   7137: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   7140: arraylength
    //   7141: iconst_2
    //   7142: if_icmpne -> 7230
    //   7145: goto -> 7152
    //   7148: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7151: athrow
    //   7152: aload #7
    //   7154: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   7157: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   7160: if_acmpne -> 7230
    //   7163: goto -> 7170
    //   7166: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7169: athrow
    //   7170: aload #7
    //   7172: iconst_1
    //   7173: invokevirtual setAccessible : (Z)V
    //   7176: aload #7
    //   7178: aconst_null
    //   7179: iconst_2
    //   7180: anewarray java/lang/Object
    //   7183: dup
    //   7184: iconst_0
    //   7185: aload_0
    //   7186: aastore
    //   7187: dup
    //   7188: iconst_1
    //   7189: aload_1
    //   7190: ifnonnull -> 7208
    //   7193: goto -> 7200
    //   7196: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7199: athrow
    //   7200: aload_1
    //   7201: goto -> 7215
    //   7204: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7207: athrow
    //   7208: aload_1
    //   7209: checkcast [B
    //   7212: invokevirtual clone : ()Ljava/lang/Object;
    //   7215: aastore
    //   7216: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   7219: checkcast java/lang/Boolean
    //   7222: invokevirtual booleanValue : ()Z
    //   7225: istore_3
    //   7226: iload_2
    //   7227: ifne -> 7244
    //   7230: iinc #6, 1
    //   7233: iload_2
    //   7234: ifne -> 7104
    //   7237: goto -> 7244
    //   7240: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7243: athrow
    //   7244: iload_2
    //   7245: ifne -> 7586
    //   7248: sipush #10675
    //   7251: sipush #17924
    //   7254: invokestatic a : (II)Ljava/lang/String;
    //   7257: iconst_1
    //   7258: ldc burp/Zrye
    //   7260: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   7263: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   7266: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   7269: astore #4
    //   7271: aload #4
    //   7273: arraylength
    //   7274: istore #5
    //   7276: iconst_0
    //   7277: istore #6
    //   7279: iload #6
    //   7281: iload #5
    //   7283: if_icmpge -> 7421
    //   7286: aload #4
    //   7288: iload #6
    //   7290: aaload
    //   7291: astore #7
    //   7293: aload #7
    //   7295: invokevirtual getModifiers : ()I
    //   7298: invokestatic isStatic : (I)Z
    //   7301: ifne -> 7311
    //   7304: goto -> 7414
    //   7307: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7310: athrow
    //   7311: aload #7
    //   7313: invokevirtual getType : ()Ljava/lang/Class;
    //   7316: astore #8
    //   7318: aload #8
    //   7320: ifnull -> 7401
    //   7323: aload #8
    //   7325: invokevirtual isPrimitive : ()Z
    //   7328: ifne -> 7401
    //   7331: goto -> 7338
    //   7334: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7337: athrow
    //   7338: aload #8
    //   7340: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7343: ifnull -> 7401
    //   7346: goto -> 7353
    //   7349: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7352: athrow
    //   7353: aload #8
    //   7355: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7358: invokevirtual getName : ()Ljava/lang/String;
    //   7361: ifnull -> 7401
    //   7364: goto -> 7371
    //   7367: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7370: athrow
    //   7371: aload #8
    //   7373: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7376: invokevirtual getName : ()Ljava/lang/String;
    //   7379: sipush #10661
    //   7382: sipush #8903
    //   7385: invokestatic a : (II)Ljava/lang/String;
    //   7388: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   7391: ifne -> 7401
    //   7394: goto -> 7401
    //   7397: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7400: athrow
    //   7401: aload #7
    //   7403: iconst_1
    //   7404: invokevirtual setAccessible : (Z)V
    //   7407: aload #7
    //   7409: aconst_null
    //   7410: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   7413: pop
    //   7414: iinc #6, 1
    //   7417: iload_2
    //   7418: ifne -> 7279
    //   7421: sipush #10685
    //   7424: sipush #-18649
    //   7427: invokestatic a : (II)Ljava/lang/String;
    //   7430: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   7433: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   7436: astore #4
    //   7438: aload #4
    //   7440: arraylength
    //   7441: istore #5
    //   7443: iconst_0
    //   7444: istore #6
    //   7446: iload #6
    //   7448: iload #5
    //   7450: if_icmpge -> 7586
    //   7453: aload #4
    //   7455: iload #6
    //   7457: aaload
    //   7458: astore #7
    //   7460: aload #7
    //   7462: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   7465: pop
    //   7466: aload #7
    //   7468: invokevirtual getModifiers : ()I
    //   7471: invokestatic isStatic : (I)Z
    //   7474: ifeq -> 7572
    //   7477: aload #7
    //   7479: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   7482: arraylength
    //   7483: iconst_2
    //   7484: if_icmpne -> 7572
    //   7487: goto -> 7494
    //   7490: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7493: athrow
    //   7494: aload #7
    //   7496: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   7499: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   7502: if_acmpne -> 7572
    //   7505: goto -> 7512
    //   7508: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7511: athrow
    //   7512: aload #7
    //   7514: iconst_1
    //   7515: invokevirtual setAccessible : (Z)V
    //   7518: aload #7
    //   7520: aconst_null
    //   7521: iconst_2
    //   7522: anewarray java/lang/Object
    //   7525: dup
    //   7526: iconst_0
    //   7527: aload_0
    //   7528: aastore
    //   7529: dup
    //   7530: iconst_1
    //   7531: aload_1
    //   7532: ifnonnull -> 7550
    //   7535: goto -> 7542
    //   7538: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7541: athrow
    //   7542: aload_1
    //   7543: goto -> 7557
    //   7546: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7549: athrow
    //   7550: aload_1
    //   7551: checkcast [B
    //   7554: invokevirtual clone : ()Ljava/lang/Object;
    //   7557: aastore
    //   7558: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   7561: checkcast java/lang/Boolean
    //   7564: invokevirtual booleanValue : ()Z
    //   7567: istore_3
    //   7568: iload_2
    //   7569: ifne -> 7586
    //   7572: iinc #6, 1
    //   7575: iload_2
    //   7576: ifne -> 7446
    //   7579: goto -> 7586
    //   7582: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7585: athrow
    //   7586: iload_3
    //   7587: ireturn
    //   7588: astore_3
    //   7589: new java/lang/Exception
    //   7592: dup
    //   7593: aload_3
    //   7594: invokevirtual getMessage : ()Ljava/lang/String;
    //   7597: invokespecial <init> : (Ljava/lang/String;)V
    //   7600: athrow
    // Exception table:
    //   from	to	target	type
    //   4	5398	7588	java/lang/Throwable
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
    //   4759	4773	4773	java/lang/Throwable
    //   4784	4797	4800	java/lang/Throwable
    //   4789	4812	4815	java/lang/Throwable
    //   4804	4830	4833	java/lang/Throwable
    //   4819	4860	4863	java/lang/Throwable
    //   4926	4953	4956	java/lang/Throwable
    //   4943	4971	4974	java/lang/Throwable
    //   4960	5001	5004	java/lang/Throwable
    //   4978	5012	5012	java/lang/Throwable
    //   5034	5045	5048	java/lang/Throwable
    //   5100	5114	5114	java/lang/Throwable
    //   5125	5138	5141	java/lang/Throwable
    //   5130	5153	5156	java/lang/Throwable
    //   5145	5171	5174	java/lang/Throwable
    //   5160	5201	5204	java/lang/Throwable
    //   5267	5294	5297	java/lang/Throwable
    //   5284	5312	5315	java/lang/Throwable
    //   5301	5342	5345	java/lang/Throwable
    //   5319	5353	5353	java/lang/Throwable
    //   5375	5386	5389	java/lang/Throwable
    //   5399	6129	7588	java/lang/Throwable
    //   5489	5503	5503	java/lang/Throwable
    //   5514	5527	5530	java/lang/Throwable
    //   5519	5542	5545	java/lang/Throwable
    //   5534	5560	5563	java/lang/Throwable
    //   5549	5590	5593	java/lang/Throwable
    //   5656	5683	5686	java/lang/Throwable
    //   5673	5701	5704	java/lang/Throwable
    //   5690	5731	5734	java/lang/Throwable
    //   5708	5742	5742	java/lang/Throwable
    //   5764	5775	5778	java/lang/Throwable
    //   5831	5845	5845	java/lang/Throwable
    //   5856	5869	5872	java/lang/Throwable
    //   5861	5884	5887	java/lang/Throwable
    //   5876	5902	5905	java/lang/Throwable
    //   5891	5932	5935	java/lang/Throwable
    //   5998	6025	6028	java/lang/Throwable
    //   6015	6043	6046	java/lang/Throwable
    //   6032	6073	6076	java/lang/Throwable
    //   6050	6084	6084	java/lang/Throwable
    //   6106	6117	6120	java/lang/Throwable
    //   6130	6860	7588	java/lang/Throwable
    //   6220	6234	6234	java/lang/Throwable
    //   6245	6258	6261	java/lang/Throwable
    //   6250	6273	6276	java/lang/Throwable
    //   6265	6291	6294	java/lang/Throwable
    //   6280	6321	6324	java/lang/Throwable
    //   6387	6414	6417	java/lang/Throwable
    //   6404	6432	6435	java/lang/Throwable
    //   6421	6462	6465	java/lang/Throwable
    //   6439	6473	6473	java/lang/Throwable
    //   6495	6506	6509	java/lang/Throwable
    //   6562	6576	6576	java/lang/Throwable
    //   6587	6600	6603	java/lang/Throwable
    //   6592	6615	6618	java/lang/Throwable
    //   6607	6633	6636	java/lang/Throwable
    //   6622	6663	6666	java/lang/Throwable
    //   6729	6756	6759	java/lang/Throwable
    //   6746	6774	6777	java/lang/Throwable
    //   6763	6804	6807	java/lang/Throwable
    //   6781	6815	6815	java/lang/Throwable
    //   6837	6848	6851	java/lang/Throwable
    //   6861	7587	7588	java/lang/Throwable
    //   6951	6965	6965	java/lang/Throwable
    //   6976	6989	6992	java/lang/Throwable
    //   6981	7004	7007	java/lang/Throwable
    //   6996	7022	7025	java/lang/Throwable
    //   7011	7052	7055	java/lang/Throwable
    //   7118	7145	7148	java/lang/Throwable
    //   7135	7163	7166	java/lang/Throwable
    //   7152	7193	7196	java/lang/Throwable
    //   7170	7204	7204	java/lang/Throwable
    //   7226	7237	7240	java/lang/Throwable
    //   7293	7307	7307	java/lang/Throwable
    //   7318	7331	7334	java/lang/Throwable
    //   7323	7346	7349	java/lang/Throwable
    //   7338	7364	7367	java/lang/Throwable
    //   7353	7394	7397	java/lang/Throwable
    //   7460	7487	7490	java/lang/Throwable
    //   7477	7505	7508	java/lang/Throwable
    //   7494	7535	7538	java/lang/Throwable
    //   7512	7546	7546	java/lang/Throwable
    //   7568	7579	7582	java/lang/Throwable
  }
  
  static void Zg(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #25
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '.¯x®H\\t\\t\\f=Üçæ>  Î§·¤Xÿ¢\\fí=&?ø;d7(óöb¶q¿\\t"-å^cvÕ\\tE\\t´|Öò\\rì \\tm±½vÊ\\f¥Þ\\tí¸¡Jt4Y \\tàM ô@ã×ÐK\\t7ÐúG+\\r"\\t.Íùnøy·\\tÄU÷ÐËÏ\\tòngo\\tlÐGr\\t»Bk-ßrG¦g±\\t%@¸UW×(ZQ \üÞ"vnIRÌD´áÊ5§eó½ä?Wf"ØHé\\tØ·« \\bÂµ\\tmA±uvÓ\\fÚÕMoÏ\\rM5Ù¾pÇÝAÜð?Í­OÐ¦æ $\JÊø $ïµÒvìÞFRC5Ôø0ÄLØÿåz"põ%ÔÍêí·)óî¦¥p\\t £\\b)AX÷§Oocñ1\\t®sÉ3yøÑ¾'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #48
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
    //   68: ldc 'ÆôÆÖ\\tsO\\t]¯ª­0{½à'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #98
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
    //   129: putstatic burp/Zt9f.a : [Ljava/lang/String;
    //   132: bipush #25
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zt9f.b : [Ljava/lang/String;
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
    //   212: bipush #34
    //   214: goto -> 244
    //   217: bipush #92
    //   219: goto -> 244
    //   222: bipush #50
    //   224: goto -> 244
    //   227: bipush #75
    //   229: goto -> 244
    //   232: bipush #34
    //   234: goto -> 244
    //   237: bipush #6
    //   239: goto -> 244
    //   242: bipush #60
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
    //   310: bipush #55
    //   312: bastore
    //   313: dup
    //   314: iconst_1
    //   315: bipush #50
    //   317: bastore
    //   318: dup
    //   319: iconst_2
    //   320: bipush #95
    //   322: bastore
    //   323: dup
    //   324: iconst_3
    //   325: bipush #14
    //   327: bastore
    //   328: dup
    //   329: iconst_4
    //   330: bipush #-23
    //   332: bastore
    //   333: dup
    //   334: iconst_5
    //   335: bipush #63
    //   337: bastore
    //   338: dup
    //   339: bipush #6
    //   341: bipush #98
    //   343: bastore
    //   344: dup
    //   345: bipush #7
    //   347: bipush #-102
    //   349: bastore
    //   350: dup
    //   351: bipush #8
    //   353: bipush #110
    //   355: bastore
    //   356: dup
    //   357: bipush #9
    //   359: bipush #30
    //   361: bastore
    //   362: dup
    //   363: bipush #10
    //   365: bipush #64
    //   367: bastore
    //   368: dup
    //   369: bipush #11
    //   371: bipush #-103
    //   373: bastore
    //   374: dup
    //   375: bipush #12
    //   377: bipush #-128
    //   379: bastore
    //   380: dup
    //   381: bipush #13
    //   383: bipush #88
    //   385: bastore
    //   386: dup
    //   387: bipush #14
    //   389: bipush #-85
    //   391: bastore
    //   392: dup
    //   393: bipush #15
    //   395: bipush #39
    //   397: bastore
    //   398: dup
    //   399: bipush #16
    //   401: bipush #66
    //   403: bastore
    //   404: dup
    //   405: bipush #17
    //   407: bipush #-126
    //   409: bastore
    //   410: dup
    //   411: bipush #18
    //   413: bipush #83
    //   415: bastore
    //   416: dup
    //   417: bipush #19
    //   419: bipush #70
    //   421: bastore
    //   422: dup
    //   423: bipush #20
    //   425: bipush #-109
    //   427: bastore
    //   428: dup
    //   429: bipush #21
    //   431: bipush #51
    //   433: bastore
    //   434: dup
    //   435: bipush #22
    //   437: bipush #61
    //   439: bastore
    //   440: dup
    //   441: bipush #23
    //   443: bipush #-69
    //   445: bastore
    //   446: dup
    //   447: bipush #24
    //   449: bipush #-38
    //   451: bastore
    //   452: dup
    //   453: bipush #25
    //   455: bipush #95
    //   457: bastore
    //   458: dup
    //   459: bipush #26
    //   461: bipush #-59
    //   463: bastore
    //   464: dup
    //   465: bipush #27
    //   467: bipush #-6
    //   469: bastore
    //   470: dup
    //   471: bipush #28
    //   473: bipush #65
    //   475: bastore
    //   476: dup
    //   477: bipush #29
    //   479: bipush #82
    //   481: bastore
    //   482: dup
    //   483: bipush #30
    //   485: bipush #-35
    //   487: bastore
    //   488: dup
    //   489: bipush #31
    //   491: bipush #108
    //   493: bastore
    //   494: invokespecial <init> : ([B)V
    //   497: putstatic burp/Zt9f.Zl : Ljava/lang/Object;
    //   500: sipush #10656
    //   503: sipush #7582
    //   506: invokestatic a : (II)Ljava/lang/String;
    //   509: putstatic burp/Zt9f.Zg : Ljava/lang/String;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x29B0) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt9f.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */