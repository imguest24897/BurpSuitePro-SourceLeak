package burp;

import java.math.BigInteger;

class Zb2n extends ClassLoader {
  static String Za;
  
  static Object ZR;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean Zr(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zegv.ZL : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zelt.ZC : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zti7.Zw : Ljava/lang/Object;
    //   22: getstatic burp/Zm1d.ZS : Ljava/lang/Object;
    //   25: checkcast java/math/BigInteger
    //   28: invokevirtual toByteArray : ()[B
    //   31: astore_3
    //   32: iconst_0
    //   33: istore #5
    //   35: iconst_0
    //   36: istore #6
    //   38: iload #6
    //   40: aload_3
    //   41: arraylength
    //   42: if_icmpge -> 187
    //   45: aload_3
    //   46: iload #6
    //   48: baload
    //   49: istore #7
    //   51: iload #7
    //   53: bipush #48
    //   55: if_icmplt -> 72
    //   58: iload #7
    //   60: bipush #57
    //   62: if_icmple -> 170
    //   65: goto -> 72
    //   68: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   71: athrow
    //   72: iload #7
    //   74: bipush #65
    //   76: if_icmplt -> 100
    //   79: goto -> 86
    //   82: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   85: athrow
    //   86: iload #7
    //   88: bipush #90
    //   90: if_icmple -> 170
    //   93: goto -> 100
    //   96: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   99: athrow
    //   100: iload #7
    //   102: bipush #97
    //   104: if_icmplt -> 128
    //   107: goto -> 114
    //   110: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   113: athrow
    //   114: iload #7
    //   116: bipush #122
    //   118: if_icmple -> 170
    //   121: goto -> 128
    //   124: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   127: athrow
    //   128: iload #7
    //   130: bipush #43
    //   132: if_icmpeq -> 170
    //   135: goto -> 142
    //   138: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   141: athrow
    //   142: iload #7
    //   144: bipush #47
    //   146: if_icmpeq -> 170
    //   149: goto -> 156
    //   152: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   155: athrow
    //   156: iload #7
    //   158: bipush #61
    //   160: if_icmpne -> 180
    //   163: goto -> 170
    //   166: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   169: athrow
    //   170: iinc #5, 1
    //   173: goto -> 180
    //   176: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   179: athrow
    //   180: iinc #6, 1
    //   183: iload_2
    //   184: ifeq -> 38
    //   187: iload #5
    //   189: newarray byte
    //   191: astore #6
    //   193: iconst_0
    //   194: istore #7
    //   196: iconst_0
    //   197: istore #8
    //   199: iload #8
    //   201: aload_3
    //   202: arraylength
    //   203: if_icmpge -> 355
    //   206: aload_3
    //   207: iload #8
    //   209: baload
    //   210: istore #9
    //   212: iload #9
    //   214: bipush #48
    //   216: if_icmplt -> 233
    //   219: iload #9
    //   221: bipush #57
    //   223: if_icmple -> 331
    //   226: goto -> 233
    //   229: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   232: athrow
    //   233: iload #9
    //   235: bipush #65
    //   237: if_icmplt -> 261
    //   240: goto -> 247
    //   243: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   246: athrow
    //   247: iload #9
    //   249: bipush #90
    //   251: if_icmple -> 331
    //   254: goto -> 261
    //   257: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   260: athrow
    //   261: iload #9
    //   263: bipush #97
    //   265: if_icmplt -> 289
    //   268: goto -> 275
    //   271: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   274: athrow
    //   275: iload #9
    //   277: bipush #122
    //   279: if_icmple -> 331
    //   282: goto -> 289
    //   285: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   288: athrow
    //   289: iload #9
    //   291: bipush #43
    //   293: if_icmpeq -> 331
    //   296: goto -> 303
    //   299: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   302: athrow
    //   303: iload #9
    //   305: bipush #47
    //   307: if_icmpeq -> 331
    //   310: goto -> 317
    //   313: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   316: athrow
    //   317: iload #9
    //   319: bipush #61
    //   321: if_icmpne -> 348
    //   324: goto -> 331
    //   327: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   330: athrow
    //   331: aload #6
    //   333: iload #7
    //   335: iload #9
    //   337: bastore
    //   338: iinc #7, 1
    //   341: goto -> 348
    //   344: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   347: athrow
    //   348: iinc #8, 1
    //   351: iload_2
    //   352: ifeq -> 199
    //   355: aload #6
    //   357: astore #4
    //   359: aload #4
    //   361: astore_3
    //   362: aload_3
    //   363: arraylength
    //   364: istore #5
    //   366: aload_3
    //   367: iload #5
    //   369: iconst_1
    //   370: isub
    //   371: baload
    //   372: bipush #61
    //   374: if_icmpne -> 384
    //   377: iinc #5, -1
    //   380: iload_2
    //   381: ifeq -> 366
    //   384: iload #5
    //   386: aload_3
    //   387: arraylength
    //   388: iconst_4
    //   389: idiv
    //   390: isub
    //   391: newarray byte
    //   393: astore #6
    //   395: iconst_0
    //   396: istore #7
    //   398: iload #7
    //   400: aload_3
    //   401: arraylength
    //   402: if_icmpge -> 664
    //   405: aload_3
    //   406: iload #7
    //   408: baload
    //   409: bipush #61
    //   411: if_icmpne -> 430
    //   414: aload_3
    //   415: iload #7
    //   417: iconst_0
    //   418: bastore
    //   419: iload_2
    //   420: ifeq -> 657
    //   423: goto -> 430
    //   426: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   429: athrow
    //   430: aload_3
    //   431: iload #7
    //   433: baload
    //   434: bipush #47
    //   436: if_icmpne -> 463
    //   439: goto -> 446
    //   442: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   445: athrow
    //   446: aload_3
    //   447: iload #7
    //   449: bipush #63
    //   451: bastore
    //   452: iload_2
    //   453: ifeq -> 657
    //   456: goto -> 463
    //   459: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   462: athrow
    //   463: aload_3
    //   464: iload #7
    //   466: baload
    //   467: bipush #43
    //   469: if_icmpne -> 496
    //   472: goto -> 479
    //   475: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   478: athrow
    //   479: aload_3
    //   480: iload #7
    //   482: bipush #62
    //   484: bastore
    //   485: iload_2
    //   486: ifeq -> 657
    //   489: goto -> 496
    //   492: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   495: athrow
    //   496: aload_3
    //   497: iload #7
    //   499: baload
    //   500: bipush #48
    //   502: if_icmplt -> 551
    //   505: goto -> 512
    //   508: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   511: athrow
    //   512: aload_3
    //   513: iload #7
    //   515: baload
    //   516: bipush #57
    //   518: if_icmpgt -> 551
    //   521: goto -> 528
    //   524: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   527: athrow
    //   528: aload_3
    //   529: iload #7
    //   531: aload_3
    //   532: iload #7
    //   534: baload
    //   535: bipush #-4
    //   537: isub
    //   538: i2b
    //   539: bastore
    //   540: iload_2
    //   541: ifeq -> 657
    //   544: goto -> 551
    //   547: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   550: athrow
    //   551: aload_3
    //   552: iload #7
    //   554: baload
    //   555: bipush #97
    //   557: if_icmplt -> 606
    //   560: goto -> 567
    //   563: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   566: athrow
    //   567: aload_3
    //   568: iload #7
    //   570: baload
    //   571: bipush #122
    //   573: if_icmpgt -> 606
    //   576: goto -> 583
    //   579: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   582: athrow
    //   583: aload_3
    //   584: iload #7
    //   586: aload_3
    //   587: iload #7
    //   589: baload
    //   590: bipush #71
    //   592: isub
    //   593: i2b
    //   594: bastore
    //   595: iload_2
    //   596: ifeq -> 657
    //   599: goto -> 606
    //   602: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   605: athrow
    //   606: aload_3
    //   607: iload #7
    //   609: baload
    //   610: bipush #65
    //   612: if_icmplt -> 657
    //   615: goto -> 622
    //   618: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   621: athrow
    //   622: aload_3
    //   623: iload #7
    //   625: baload
    //   626: bipush #90
    //   628: if_icmpgt -> 657
    //   631: goto -> 638
    //   634: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   637: athrow
    //   638: aload_3
    //   639: iload #7
    //   641: aload_3
    //   642: iload #7
    //   644: baload
    //   645: bipush #65
    //   647: isub
    //   648: i2b
    //   649: bastore
    //   650: goto -> 657
    //   653: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   656: athrow
    //   657: iinc #7, 1
    //   660: iload_2
    //   661: ifeq -> 398
    //   664: iconst_0
    //   665: istore #7
    //   667: iconst_0
    //   668: istore #8
    //   670: iload #8
    //   672: aload #6
    //   674: arraylength
    //   675: iconst_2
    //   676: isub
    //   677: if_icmpge -> 780
    //   680: aload #6
    //   682: iload #8
    //   684: aload_3
    //   685: iload #7
    //   687: baload
    //   688: iconst_2
    //   689: ishl
    //   690: sipush #255
    //   693: iand
    //   694: aload_3
    //   695: iload #7
    //   697: iconst_1
    //   698: iadd
    //   699: baload
    //   700: iconst_4
    //   701: iushr
    //   702: iconst_3
    //   703: iand
    //   704: ior
    //   705: i2b
    //   706: bastore
    //   707: aload #6
    //   709: iload #8
    //   711: iconst_1
    //   712: iadd
    //   713: aload_3
    //   714: iload #7
    //   716: iconst_1
    //   717: iadd
    //   718: baload
    //   719: iconst_4
    //   720: ishl
    //   721: sipush #255
    //   724: iand
    //   725: aload_3
    //   726: iload #7
    //   728: iconst_2
    //   729: iadd
    //   730: baload
    //   731: iconst_2
    //   732: iushr
    //   733: bipush #15
    //   735: iand
    //   736: ior
    //   737: i2b
    //   738: bastore
    //   739: aload #6
    //   741: iload #8
    //   743: iconst_2
    //   744: iadd
    //   745: aload_3
    //   746: iload #7
    //   748: iconst_2
    //   749: iadd
    //   750: baload
    //   751: bipush #6
    //   753: ishl
    //   754: sipush #255
    //   757: iand
    //   758: aload_3
    //   759: iload #7
    //   761: iconst_3
    //   762: iadd
    //   763: baload
    //   764: bipush #63
    //   766: iand
    //   767: ior
    //   768: i2b
    //   769: bastore
    //   770: iinc #7, 4
    //   773: iinc #8, 3
    //   776: iload_2
    //   777: ifeq -> 670
    //   780: iload #8
    //   782: aload #6
    //   784: arraylength
    //   785: if_icmpge -> 822
    //   788: aload #6
    //   790: iload #8
    //   792: aload_3
    //   793: iload #7
    //   795: baload
    //   796: iconst_2
    //   797: ishl
    //   798: sipush #255
    //   801: iand
    //   802: aload_3
    //   803: iload #7
    //   805: iconst_1
    //   806: iadd
    //   807: baload
    //   808: iconst_4
    //   809: iushr
    //   810: iconst_3
    //   811: iand
    //   812: ior
    //   813: i2b
    //   814: bastore
    //   815: goto -> 822
    //   818: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   821: athrow
    //   822: iinc #8, 1
    //   825: iload #8
    //   827: aload #6
    //   829: arraylength
    //   830: if_icmpge -> 870
    //   833: aload #6
    //   835: iload #8
    //   837: aload_3
    //   838: iload #7
    //   840: iconst_1
    //   841: iadd
    //   842: baload
    //   843: iconst_4
    //   844: ishl
    //   845: sipush #255
    //   848: iand
    //   849: aload_3
    //   850: iload #7
    //   852: iconst_2
    //   853: iadd
    //   854: baload
    //   855: iconst_2
    //   856: iushr
    //   857: bipush #15
    //   859: iand
    //   860: ior
    //   861: i2b
    //   862: bastore
    //   863: goto -> 870
    //   866: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   869: athrow
    //   870: aload #6
    //   872: astore #4
    //   874: sipush #-9418
    //   877: new java/math/BigInteger
    //   880: dup
    //   881: aload #4
    //   883: invokespecial <init> : ([B)V
    //   886: invokevirtual abs : ()Ljava/math/BigInteger;
    //   889: putstatic burp/Zbjx.ZT : Ljava/lang/Object;
    //   892: sipush #-9595
    //   895: invokestatic a : (II)Ljava/lang/String;
    //   898: iconst_1
    //   899: ldc burp/Zrm4
    //   901: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   904: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   907: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   910: astore_3
    //   911: aload_3
    //   912: arraylength
    //   913: istore #4
    //   915: iconst_0
    //   916: istore #5
    //   918: iload #5
    //   920: iload #4
    //   922: if_icmpge -> 1059
    //   925: aload_3
    //   926: iload #5
    //   928: aaload
    //   929: astore #6
    //   931: aload #6
    //   933: invokevirtual getModifiers : ()I
    //   936: invokestatic isStatic : (I)Z
    //   939: ifne -> 949
    //   942: goto -> 1052
    //   945: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   948: athrow
    //   949: aload #6
    //   951: invokevirtual getType : ()Ljava/lang/Class;
    //   954: astore #7
    //   956: aload #7
    //   958: ifnull -> 1039
    //   961: aload #7
    //   963: invokevirtual isPrimitive : ()Z
    //   966: ifne -> 1039
    //   969: goto -> 976
    //   972: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   975: athrow
    //   976: aload #7
    //   978: invokevirtual getPackage : ()Ljava/lang/Package;
    //   981: ifnull -> 1039
    //   984: goto -> 991
    //   987: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   990: athrow
    //   991: aload #7
    //   993: invokevirtual getPackage : ()Ljava/lang/Package;
    //   996: invokevirtual getName : ()Ljava/lang/String;
    //   999: ifnull -> 1039
    //   1002: goto -> 1009
    //   1005: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1008: athrow
    //   1009: aload #7
    //   1011: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1014: invokevirtual getName : ()Ljava/lang/String;
    //   1017: sipush #-9428
    //   1020: sipush #-19874
    //   1023: invokestatic a : (II)Ljava/lang/String;
    //   1026: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1029: ifne -> 1039
    //   1032: goto -> 1039
    //   1035: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1038: athrow
    //   1039: aload #6
    //   1041: iconst_1
    //   1042: invokevirtual setAccessible : (Z)V
    //   1045: aload #6
    //   1047: aconst_null
    //   1048: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1051: pop
    //   1052: iinc #5, 1
    //   1055: iload_2
    //   1056: ifeq -> 918
    //   1059: sipush #-9438
    //   1062: sipush #-2143
    //   1065: invokestatic a : (II)Ljava/lang/String;
    //   1068: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1071: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1074: astore_3
    //   1075: aload_3
    //   1076: arraylength
    //   1077: istore #4
    //   1079: iconst_0
    //   1080: istore #5
    //   1082: iload #5
    //   1084: iload #4
    //   1086: if_icmpge -> 1218
    //   1089: aload_3
    //   1090: iload #5
    //   1092: aaload
    //   1093: astore #6
    //   1095: aload #6
    //   1097: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1100: pop
    //   1101: aload #6
    //   1103: invokevirtual getModifiers : ()I
    //   1106: invokestatic isStatic : (I)Z
    //   1109: ifeq -> 1204
    //   1112: aload #6
    //   1114: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1117: arraylength
    //   1118: iconst_2
    //   1119: if_icmpne -> 1204
    //   1122: goto -> 1129
    //   1125: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1128: athrow
    //   1129: aload #6
    //   1131: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1134: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1137: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1140: ifeq -> 1204
    //   1143: goto -> 1150
    //   1146: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1149: athrow
    //   1150: aload #6
    //   1152: iconst_1
    //   1153: invokevirtual setAccessible : (Z)V
    //   1156: aload #6
    //   1158: aconst_null
    //   1159: iconst_2
    //   1160: anewarray java/lang/Object
    //   1163: dup
    //   1164: iconst_0
    //   1165: aload_0
    //   1166: aastore
    //   1167: dup
    //   1168: iconst_1
    //   1169: aload_1
    //   1170: ifnonnull -> 1188
    //   1173: goto -> 1180
    //   1176: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1179: athrow
    //   1180: aload_1
    //   1181: goto -> 1195
    //   1184: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1187: athrow
    //   1188: aload_1
    //   1189: checkcast [B
    //   1192: invokevirtual clone : ()Ljava/lang/Object;
    //   1195: aastore
    //   1196: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1199: pop
    //   1200: iload_2
    //   1201: ifeq -> 1218
    //   1204: iinc #5, 1
    //   1207: iload_2
    //   1208: ifeq -> 1082
    //   1211: goto -> 1218
    //   1214: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1217: athrow
    //   1218: iconst_0
    //   1219: istore_3
    //   1220: getstatic burp/Zr1h.ZS : Ljava/lang/String;
    //   1223: getstatic burp/Zm83.Zl : Ljava/lang/Object;
    //   1226: checkcast java/math/BigInteger
    //   1229: invokevirtual intValue : ()I
    //   1232: bipush #32
    //   1234: irem
    //   1235: invokestatic abs : (I)I
    //   1238: invokevirtual charAt : (I)C
    //   1241: getstatic burp/Ze5h.Zk : Ljava/lang/String;
    //   1244: getstatic burp/Zreu.Zi : Ljava/lang/Object;
    //   1247: checkcast java/math/BigInteger
    //   1250: invokevirtual intValue : ()I
    //   1253: bipush #32
    //   1255: irem
    //   1256: invokestatic abs : (I)I
    //   1259: invokevirtual charAt : (I)C
    //   1262: if_icmpgt -> 1606
    //   1265: sipush #-9430
    //   1268: sipush #31166
    //   1271: invokestatic a : (II)Ljava/lang/String;
    //   1274: iconst_1
    //   1275: ldc burp/Zml2
    //   1277: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1280: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1283: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1286: astore #4
    //   1288: aload #4
    //   1290: arraylength
    //   1291: istore #5
    //   1293: iconst_0
    //   1294: istore #6
    //   1296: iload #6
    //   1298: iload #5
    //   1300: if_icmpge -> 1438
    //   1303: aload #4
    //   1305: iload #6
    //   1307: aaload
    //   1308: astore #7
    //   1310: aload #7
    //   1312: invokevirtual getModifiers : ()I
    //   1315: invokestatic isStatic : (I)Z
    //   1318: ifne -> 1328
    //   1321: goto -> 1431
    //   1324: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1327: athrow
    //   1328: aload #7
    //   1330: invokevirtual getType : ()Ljava/lang/Class;
    //   1333: astore #8
    //   1335: aload #8
    //   1337: ifnull -> 1418
    //   1340: aload #8
    //   1342: invokevirtual isPrimitive : ()Z
    //   1345: ifne -> 1418
    //   1348: goto -> 1355
    //   1351: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1354: athrow
    //   1355: aload #8
    //   1357: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1360: ifnull -> 1418
    //   1363: goto -> 1370
    //   1366: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1369: athrow
    //   1370: aload #8
    //   1372: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1375: invokevirtual getName : ()Ljava/lang/String;
    //   1378: ifnull -> 1418
    //   1381: goto -> 1388
    //   1384: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1387: athrow
    //   1388: aload #8
    //   1390: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1393: invokevirtual getName : ()Ljava/lang/String;
    //   1396: sipush #-9426
    //   1399: sipush #-15001
    //   1402: invokestatic a : (II)Ljava/lang/String;
    //   1405: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1408: ifne -> 1418
    //   1411: goto -> 1418
    //   1414: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1417: athrow
    //   1418: aload #7
    //   1420: iconst_1
    //   1421: invokevirtual setAccessible : (Z)V
    //   1424: aload #7
    //   1426: aconst_null
    //   1427: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1430: pop
    //   1431: iinc #6, 1
    //   1434: iload_2
    //   1435: ifeq -> 1296
    //   1438: sipush #-9414
    //   1441: sipush #-28930
    //   1444: invokestatic a : (II)Ljava/lang/String;
    //   1447: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1450: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1453: astore #4
    //   1455: aload #4
    //   1457: arraylength
    //   1458: istore #5
    //   1460: iconst_0
    //   1461: istore #6
    //   1463: iload #6
    //   1465: iload #5
    //   1467: if_icmpge -> 1603
    //   1470: aload #4
    //   1472: iload #6
    //   1474: aaload
    //   1475: astore #7
    //   1477: aload #7
    //   1479: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1482: pop
    //   1483: aload #7
    //   1485: invokevirtual getModifiers : ()I
    //   1488: invokestatic isStatic : (I)Z
    //   1491: ifeq -> 1589
    //   1494: aload #7
    //   1496: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1499: arraylength
    //   1500: iconst_2
    //   1501: if_icmpne -> 1589
    //   1504: goto -> 1511
    //   1507: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1510: athrow
    //   1511: aload #7
    //   1513: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1516: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1519: if_acmpne -> 1589
    //   1522: goto -> 1529
    //   1525: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1528: athrow
    //   1529: aload #7
    //   1531: iconst_1
    //   1532: invokevirtual setAccessible : (Z)V
    //   1535: aload #7
    //   1537: aconst_null
    //   1538: iconst_2
    //   1539: anewarray java/lang/Object
    //   1542: dup
    //   1543: iconst_0
    //   1544: aload_0
    //   1545: aastore
    //   1546: dup
    //   1547: iconst_1
    //   1548: aload_1
    //   1549: ifnonnull -> 1567
    //   1552: goto -> 1559
    //   1555: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1558: athrow
    //   1559: aload_1
    //   1560: goto -> 1574
    //   1563: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1566: athrow
    //   1567: aload_1
    //   1568: checkcast [B
    //   1571: invokevirtual clone : ()Ljava/lang/Object;
    //   1574: aastore
    //   1575: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1578: checkcast java/lang/Boolean
    //   1581: invokevirtual booleanValue : ()Z
    //   1584: istore_3
    //   1585: iload_2
    //   1586: ifeq -> 1603
    //   1589: iinc #6, 1
    //   1592: iload_2
    //   1593: ifeq -> 1463
    //   1596: goto -> 1603
    //   1599: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1602: athrow
    //   1603: goto -> 1944
    //   1606: sipush #-9440
    //   1609: sipush #13222
    //   1612: invokestatic a : (II)Ljava/lang/String;
    //   1615: iconst_1
    //   1616: ldc burp/Zx4l
    //   1618: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1621: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1624: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1627: astore #4
    //   1629: aload #4
    //   1631: arraylength
    //   1632: istore #5
    //   1634: iconst_0
    //   1635: istore #6
    //   1637: iload #6
    //   1639: iload #5
    //   1641: if_icmpge -> 1779
    //   1644: aload #4
    //   1646: iload #6
    //   1648: aaload
    //   1649: astore #7
    //   1651: aload #7
    //   1653: invokevirtual getModifiers : ()I
    //   1656: invokestatic isStatic : (I)Z
    //   1659: ifne -> 1669
    //   1662: goto -> 1772
    //   1665: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1668: athrow
    //   1669: aload #7
    //   1671: invokevirtual getType : ()Ljava/lang/Class;
    //   1674: astore #8
    //   1676: aload #8
    //   1678: ifnull -> 1759
    //   1681: aload #8
    //   1683: invokevirtual isPrimitive : ()Z
    //   1686: ifne -> 1759
    //   1689: goto -> 1696
    //   1692: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1695: athrow
    //   1696: aload #8
    //   1698: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1701: ifnull -> 1759
    //   1704: goto -> 1711
    //   1707: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1710: athrow
    //   1711: aload #8
    //   1713: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1716: invokevirtual getName : ()Ljava/lang/String;
    //   1719: ifnull -> 1759
    //   1722: goto -> 1729
    //   1725: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1728: athrow
    //   1729: aload #8
    //   1731: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1734: invokevirtual getName : ()Ljava/lang/String;
    //   1737: sipush #-9426
    //   1740: sipush #-15001
    //   1743: invokestatic a : (II)Ljava/lang/String;
    //   1746: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1749: ifne -> 1759
    //   1752: goto -> 1759
    //   1755: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1758: athrow
    //   1759: aload #7
    //   1761: iconst_1
    //   1762: invokevirtual setAccessible : (Z)V
    //   1765: aload #7
    //   1767: aconst_null
    //   1768: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1771: pop
    //   1772: iinc #6, 1
    //   1775: iload_2
    //   1776: ifeq -> 1637
    //   1779: sipush #-9436
    //   1782: sipush #16005
    //   1785: invokestatic a : (II)Ljava/lang/String;
    //   1788: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1791: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1794: astore #4
    //   1796: aload #4
    //   1798: arraylength
    //   1799: istore #5
    //   1801: iconst_0
    //   1802: istore #6
    //   1804: iload #6
    //   1806: iload #5
    //   1808: if_icmpge -> 1944
    //   1811: aload #4
    //   1813: iload #6
    //   1815: aaload
    //   1816: astore #7
    //   1818: aload #7
    //   1820: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1823: pop
    //   1824: aload #7
    //   1826: invokevirtual getModifiers : ()I
    //   1829: invokestatic isStatic : (I)Z
    //   1832: ifeq -> 1930
    //   1835: aload #7
    //   1837: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1840: arraylength
    //   1841: iconst_2
    //   1842: if_icmpne -> 1930
    //   1845: goto -> 1852
    //   1848: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1851: athrow
    //   1852: aload #7
    //   1854: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1857: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   1860: if_acmpne -> 1930
    //   1863: goto -> 1870
    //   1866: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1869: athrow
    //   1870: aload #7
    //   1872: iconst_1
    //   1873: invokevirtual setAccessible : (Z)V
    //   1876: aload #7
    //   1878: aconst_null
    //   1879: iconst_2
    //   1880: anewarray java/lang/Object
    //   1883: dup
    //   1884: iconst_0
    //   1885: aload_0
    //   1886: aastore
    //   1887: dup
    //   1888: iconst_1
    //   1889: aload_1
    //   1890: ifnonnull -> 1908
    //   1893: goto -> 1900
    //   1896: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1899: athrow
    //   1900: aload_1
    //   1901: goto -> 1915
    //   1904: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1907: athrow
    //   1908: aload_1
    //   1909: checkcast [B
    //   1912: invokevirtual clone : ()Ljava/lang/Object;
    //   1915: aastore
    //   1916: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1919: checkcast java/lang/Boolean
    //   1922: invokevirtual booleanValue : ()Z
    //   1925: istore_3
    //   1926: iload_2
    //   1927: ifeq -> 1944
    //   1930: iinc #6, 1
    //   1933: iload_2
    //   1934: ifeq -> 1804
    //   1937: goto -> 1944
    //   1940: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1943: athrow
    //   1944: iload_3
    //   1945: ifeq -> 1950
    //   1948: iload_3
    //   1949: ireturn
    //   1950: getstatic burp/Zxn9.ZU : Ljava/lang/String;
    //   1953: getstatic burp/Zly9.Zz : Ljava/lang/Object;
    //   1956: checkcast java/math/BigInteger
    //   1959: invokevirtual intValue : ()I
    //   1962: bipush #32
    //   1964: irem
    //   1965: invokestatic abs : (I)I
    //   1968: invokevirtual charAt : (I)C
    //   1971: getstatic burp/Zzh5.Zc : Ljava/lang/String;
    //   1974: getstatic burp/Zb2u.ZY : Ljava/lang/Object;
    //   1977: checkcast java/math/BigInteger
    //   1980: invokevirtual intValue : ()I
    //   1983: bipush #32
    //   1985: irem
    //   1986: invokestatic abs : (I)I
    //   1989: invokevirtual charAt : (I)C
    //   1992: if_icmple -> 2337
    //   1995: sipush #-9432
    //   1998: sipush #23949
    //   2001: invokestatic a : (II)Ljava/lang/String;
    //   2004: iconst_1
    //   2005: ldc burp/Zkco
    //   2007: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2010: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2013: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2016: astore #4
    //   2018: aload #4
    //   2020: arraylength
    //   2021: istore #5
    //   2023: iconst_0
    //   2024: istore #6
    //   2026: iload #6
    //   2028: iload #5
    //   2030: if_icmpge -> 2168
    //   2033: aload #4
    //   2035: iload #6
    //   2037: aaload
    //   2038: astore #7
    //   2040: aload #7
    //   2042: invokevirtual getModifiers : ()I
    //   2045: invokestatic isStatic : (I)Z
    //   2048: ifne -> 2058
    //   2051: goto -> 2161
    //   2054: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2057: athrow
    //   2058: aload #7
    //   2060: invokevirtual getType : ()Ljava/lang/Class;
    //   2063: astore #8
    //   2065: aload #8
    //   2067: ifnull -> 2148
    //   2070: aload #8
    //   2072: invokevirtual isPrimitive : ()Z
    //   2075: ifne -> 2148
    //   2078: goto -> 2085
    //   2081: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2084: athrow
    //   2085: aload #8
    //   2087: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2090: ifnull -> 2148
    //   2093: goto -> 2100
    //   2096: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2099: athrow
    //   2100: aload #8
    //   2102: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2105: invokevirtual getName : ()Ljava/lang/String;
    //   2108: ifnull -> 2148
    //   2111: goto -> 2118
    //   2114: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2117: athrow
    //   2118: aload #8
    //   2120: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2123: invokevirtual getName : ()Ljava/lang/String;
    //   2126: sipush #-9426
    //   2129: sipush #-15001
    //   2132: invokestatic a : (II)Ljava/lang/String;
    //   2135: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2138: ifne -> 2148
    //   2141: goto -> 2148
    //   2144: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2147: athrow
    //   2148: aload #7
    //   2150: iconst_1
    //   2151: invokevirtual setAccessible : (Z)V
    //   2154: aload #7
    //   2156: aconst_null
    //   2157: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2160: pop
    //   2161: iinc #6, 1
    //   2164: iload_2
    //   2165: ifeq -> 2026
    //   2168: sipush #-9431
    //   2171: sipush #-1423
    //   2174: invokestatic a : (II)Ljava/lang/String;
    //   2177: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2180: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2183: astore #4
    //   2185: aload #4
    //   2187: arraylength
    //   2188: istore #5
    //   2190: iconst_0
    //   2191: istore #6
    //   2193: iload #6
    //   2195: iload #5
    //   2197: if_icmpge -> 2333
    //   2200: aload #4
    //   2202: iload #6
    //   2204: aaload
    //   2205: astore #7
    //   2207: aload #7
    //   2209: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2212: pop
    //   2213: aload #7
    //   2215: invokevirtual getModifiers : ()I
    //   2218: invokestatic isStatic : (I)Z
    //   2221: ifeq -> 2319
    //   2224: aload #7
    //   2226: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2229: arraylength
    //   2230: iconst_2
    //   2231: if_icmpne -> 2319
    //   2234: goto -> 2241
    //   2237: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2240: athrow
    //   2241: aload #7
    //   2243: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2246: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2249: if_acmpne -> 2319
    //   2252: goto -> 2259
    //   2255: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2258: athrow
    //   2259: aload #7
    //   2261: iconst_1
    //   2262: invokevirtual setAccessible : (Z)V
    //   2265: aload #7
    //   2267: aconst_null
    //   2268: iconst_2
    //   2269: anewarray java/lang/Object
    //   2272: dup
    //   2273: iconst_0
    //   2274: aload_0
    //   2275: aastore
    //   2276: dup
    //   2277: iconst_1
    //   2278: aload_1
    //   2279: ifnonnull -> 2297
    //   2282: goto -> 2289
    //   2285: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2288: athrow
    //   2289: aload_1
    //   2290: goto -> 2304
    //   2293: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2296: athrow
    //   2297: aload_1
    //   2298: checkcast [B
    //   2301: invokevirtual clone : ()Ljava/lang/Object;
    //   2304: aastore
    //   2305: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2308: checkcast java/lang/Boolean
    //   2311: invokevirtual booleanValue : ()Z
    //   2314: istore_3
    //   2315: iload_2
    //   2316: ifeq -> 2333
    //   2319: iinc #6, 1
    //   2322: iload_2
    //   2323: ifeq -> 2193
    //   2326: goto -> 2333
    //   2329: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2332: athrow
    //   2333: iload_2
    //   2334: ifeq -> 2675
    //   2337: sipush #-9411
    //   2340: sipush #-3397
    //   2343: invokestatic a : (II)Ljava/lang/String;
    //   2346: iconst_1
    //   2347: ldc burp/Ze54
    //   2349: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2352: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2355: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2358: astore #4
    //   2360: aload #4
    //   2362: arraylength
    //   2363: istore #5
    //   2365: iconst_0
    //   2366: istore #6
    //   2368: iload #6
    //   2370: iload #5
    //   2372: if_icmpge -> 2510
    //   2375: aload #4
    //   2377: iload #6
    //   2379: aaload
    //   2380: astore #7
    //   2382: aload #7
    //   2384: invokevirtual getModifiers : ()I
    //   2387: invokestatic isStatic : (I)Z
    //   2390: ifne -> 2400
    //   2393: goto -> 2503
    //   2396: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2399: athrow
    //   2400: aload #7
    //   2402: invokevirtual getType : ()Ljava/lang/Class;
    //   2405: astore #8
    //   2407: aload #8
    //   2409: ifnull -> 2490
    //   2412: aload #8
    //   2414: invokevirtual isPrimitive : ()Z
    //   2417: ifne -> 2490
    //   2420: goto -> 2427
    //   2423: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2426: athrow
    //   2427: aload #8
    //   2429: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2432: ifnull -> 2490
    //   2435: goto -> 2442
    //   2438: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2441: athrow
    //   2442: aload #8
    //   2444: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2447: invokevirtual getName : ()Ljava/lang/String;
    //   2450: ifnull -> 2490
    //   2453: goto -> 2460
    //   2456: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2459: athrow
    //   2460: aload #8
    //   2462: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2465: invokevirtual getName : ()Ljava/lang/String;
    //   2468: sipush #-9426
    //   2471: sipush #-15001
    //   2474: invokestatic a : (II)Ljava/lang/String;
    //   2477: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2480: ifne -> 2490
    //   2483: goto -> 2490
    //   2486: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2489: athrow
    //   2490: aload #7
    //   2492: iconst_1
    //   2493: invokevirtual setAccessible : (Z)V
    //   2496: aload #7
    //   2498: aconst_null
    //   2499: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2502: pop
    //   2503: iinc #6, 1
    //   2506: iload_2
    //   2507: ifeq -> 2368
    //   2510: sipush #-9415
    //   2513: sipush #-25581
    //   2516: invokestatic a : (II)Ljava/lang/String;
    //   2519: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2522: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2525: astore #4
    //   2527: aload #4
    //   2529: arraylength
    //   2530: istore #5
    //   2532: iconst_0
    //   2533: istore #6
    //   2535: iload #6
    //   2537: iload #5
    //   2539: if_icmpge -> 2675
    //   2542: aload #4
    //   2544: iload #6
    //   2546: aaload
    //   2547: astore #7
    //   2549: aload #7
    //   2551: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2554: pop
    //   2555: aload #7
    //   2557: invokevirtual getModifiers : ()I
    //   2560: invokestatic isStatic : (I)Z
    //   2563: ifeq -> 2661
    //   2566: aload #7
    //   2568: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2571: arraylength
    //   2572: iconst_2
    //   2573: if_icmpne -> 2661
    //   2576: goto -> 2583
    //   2579: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2582: athrow
    //   2583: aload #7
    //   2585: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2588: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2591: if_acmpne -> 2661
    //   2594: goto -> 2601
    //   2597: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2600: athrow
    //   2601: aload #7
    //   2603: iconst_1
    //   2604: invokevirtual setAccessible : (Z)V
    //   2607: aload #7
    //   2609: aconst_null
    //   2610: iconst_2
    //   2611: anewarray java/lang/Object
    //   2614: dup
    //   2615: iconst_0
    //   2616: aload_0
    //   2617: aastore
    //   2618: dup
    //   2619: iconst_1
    //   2620: aload_1
    //   2621: ifnonnull -> 2639
    //   2624: goto -> 2631
    //   2627: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2630: athrow
    //   2631: aload_1
    //   2632: goto -> 2646
    //   2635: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2638: athrow
    //   2639: aload_1
    //   2640: checkcast [B
    //   2643: invokevirtual clone : ()Ljava/lang/Object;
    //   2646: aastore
    //   2647: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2650: checkcast java/lang/Boolean
    //   2653: invokevirtual booleanValue : ()Z
    //   2656: istore_3
    //   2657: iload_2
    //   2658: ifeq -> 2675
    //   2661: iinc #6, 1
    //   2664: iload_2
    //   2665: ifeq -> 2535
    //   2668: goto -> 2675
    //   2671: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2674: athrow
    //   2675: iload_3
    //   2676: ifeq -> 2681
    //   2679: iload_3
    //   2680: ireturn
    //   2681: getstatic burp/Zr14.ZL : Ljava/lang/String;
    //   2684: getstatic burp/Ztle.ZP : Ljava/lang/Object;
    //   2687: checkcast java/math/BigInteger
    //   2690: invokevirtual intValue : ()I
    //   2693: bipush #32
    //   2695: irem
    //   2696: invokestatic abs : (I)I
    //   2699: invokevirtual charAt : (I)C
    //   2702: getstatic burp/Zer1.ZV : Ljava/lang/String;
    //   2705: getstatic burp/Zej8.Zu : Ljava/lang/Object;
    //   2708: checkcast java/math/BigInteger
    //   2711: invokevirtual intValue : ()I
    //   2714: bipush #32
    //   2716: irem
    //   2717: invokestatic abs : (I)I
    //   2720: invokevirtual charAt : (I)C
    //   2723: if_icmpgt -> 3068
    //   2726: sipush #-9425
    //   2729: sipush #-534
    //   2732: invokestatic a : (II)Ljava/lang/String;
    //   2735: iconst_1
    //   2736: ldc burp/Zz3k
    //   2738: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2741: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2744: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2747: astore #4
    //   2749: aload #4
    //   2751: arraylength
    //   2752: istore #5
    //   2754: iconst_0
    //   2755: istore #6
    //   2757: iload #6
    //   2759: iload #5
    //   2761: if_icmpge -> 2899
    //   2764: aload #4
    //   2766: iload #6
    //   2768: aaload
    //   2769: astore #7
    //   2771: aload #7
    //   2773: invokevirtual getModifiers : ()I
    //   2776: invokestatic isStatic : (I)Z
    //   2779: ifne -> 2789
    //   2782: goto -> 2892
    //   2785: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2788: athrow
    //   2789: aload #7
    //   2791: invokevirtual getType : ()Ljava/lang/Class;
    //   2794: astore #8
    //   2796: aload #8
    //   2798: ifnull -> 2879
    //   2801: aload #8
    //   2803: invokevirtual isPrimitive : ()Z
    //   2806: ifne -> 2879
    //   2809: goto -> 2816
    //   2812: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2815: athrow
    //   2816: aload #8
    //   2818: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2821: ifnull -> 2879
    //   2824: goto -> 2831
    //   2827: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2830: athrow
    //   2831: aload #8
    //   2833: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2836: invokevirtual getName : ()Ljava/lang/String;
    //   2839: ifnull -> 2879
    //   2842: goto -> 2849
    //   2845: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2848: athrow
    //   2849: aload #8
    //   2851: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2854: invokevirtual getName : ()Ljava/lang/String;
    //   2857: sipush #-9426
    //   2860: sipush #-15001
    //   2863: invokestatic a : (II)Ljava/lang/String;
    //   2866: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2869: ifne -> 2879
    //   2872: goto -> 2879
    //   2875: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2878: athrow
    //   2879: aload #7
    //   2881: iconst_1
    //   2882: invokevirtual setAccessible : (Z)V
    //   2885: aload #7
    //   2887: aconst_null
    //   2888: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2891: pop
    //   2892: iinc #6, 1
    //   2895: iload_2
    //   2896: ifeq -> 2757
    //   2899: sipush #-9409
    //   2902: sipush #-7449
    //   2905: invokestatic a : (II)Ljava/lang/String;
    //   2908: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2911: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2914: astore #4
    //   2916: aload #4
    //   2918: arraylength
    //   2919: istore #5
    //   2921: iconst_0
    //   2922: istore #6
    //   2924: iload #6
    //   2926: iload #5
    //   2928: if_icmpge -> 3064
    //   2931: aload #4
    //   2933: iload #6
    //   2935: aaload
    //   2936: astore #7
    //   2938: aload #7
    //   2940: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2943: pop
    //   2944: aload #7
    //   2946: invokevirtual getModifiers : ()I
    //   2949: invokestatic isStatic : (I)Z
    //   2952: ifeq -> 3050
    //   2955: aload #7
    //   2957: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2960: arraylength
    //   2961: iconst_2
    //   2962: if_icmpne -> 3050
    //   2965: goto -> 2972
    //   2968: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2971: athrow
    //   2972: aload #7
    //   2974: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2977: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2980: if_acmpne -> 3050
    //   2983: goto -> 2990
    //   2986: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2989: athrow
    //   2990: aload #7
    //   2992: iconst_1
    //   2993: invokevirtual setAccessible : (Z)V
    //   2996: aload #7
    //   2998: aconst_null
    //   2999: iconst_2
    //   3000: anewarray java/lang/Object
    //   3003: dup
    //   3004: iconst_0
    //   3005: aload_0
    //   3006: aastore
    //   3007: dup
    //   3008: iconst_1
    //   3009: aload_1
    //   3010: ifnonnull -> 3028
    //   3013: goto -> 3020
    //   3016: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3019: athrow
    //   3020: aload_1
    //   3021: goto -> 3035
    //   3024: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3027: athrow
    //   3028: aload_1
    //   3029: checkcast [B
    //   3032: invokevirtual clone : ()Ljava/lang/Object;
    //   3035: aastore
    //   3036: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3039: checkcast java/lang/Boolean
    //   3042: invokevirtual booleanValue : ()Z
    //   3045: istore_3
    //   3046: iload_2
    //   3047: ifeq -> 3064
    //   3050: iinc #6, 1
    //   3053: iload_2
    //   3054: ifeq -> 2924
    //   3057: goto -> 3064
    //   3060: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3063: athrow
    //   3064: iload_2
    //   3065: ifeq -> 3406
    //   3068: sipush #-9439
    //   3071: sipush #27970
    //   3074: invokestatic a : (II)Ljava/lang/String;
    //   3077: iconst_1
    //   3078: ldc burp/Zxf8
    //   3080: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3083: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3086: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3089: astore #4
    //   3091: aload #4
    //   3093: arraylength
    //   3094: istore #5
    //   3096: iconst_0
    //   3097: istore #6
    //   3099: iload #6
    //   3101: iload #5
    //   3103: if_icmpge -> 3241
    //   3106: aload #4
    //   3108: iload #6
    //   3110: aaload
    //   3111: astore #7
    //   3113: aload #7
    //   3115: invokevirtual getModifiers : ()I
    //   3118: invokestatic isStatic : (I)Z
    //   3121: ifne -> 3131
    //   3124: goto -> 3234
    //   3127: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3130: athrow
    //   3131: aload #7
    //   3133: invokevirtual getType : ()Ljava/lang/Class;
    //   3136: astore #8
    //   3138: aload #8
    //   3140: ifnull -> 3221
    //   3143: aload #8
    //   3145: invokevirtual isPrimitive : ()Z
    //   3148: ifne -> 3221
    //   3151: goto -> 3158
    //   3154: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3157: athrow
    //   3158: aload #8
    //   3160: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3163: ifnull -> 3221
    //   3166: goto -> 3173
    //   3169: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3172: athrow
    //   3173: aload #8
    //   3175: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3178: invokevirtual getName : ()Ljava/lang/String;
    //   3181: ifnull -> 3221
    //   3184: goto -> 3191
    //   3187: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3190: athrow
    //   3191: aload #8
    //   3193: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3196: invokevirtual getName : ()Ljava/lang/String;
    //   3199: sipush #-9426
    //   3202: sipush #-15001
    //   3205: invokestatic a : (II)Ljava/lang/String;
    //   3208: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3211: ifne -> 3221
    //   3214: goto -> 3221
    //   3217: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3220: athrow
    //   3221: aload #7
    //   3223: iconst_1
    //   3224: invokevirtual setAccessible : (Z)V
    //   3227: aload #7
    //   3229: aconst_null
    //   3230: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3233: pop
    //   3234: iinc #6, 1
    //   3237: iload_2
    //   3238: ifeq -> 3099
    //   3241: sipush #-9410
    //   3244: sipush #-3395
    //   3247: invokestatic a : (II)Ljava/lang/String;
    //   3250: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3253: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3256: astore #4
    //   3258: aload #4
    //   3260: arraylength
    //   3261: istore #5
    //   3263: iconst_0
    //   3264: istore #6
    //   3266: iload #6
    //   3268: iload #5
    //   3270: if_icmpge -> 3406
    //   3273: aload #4
    //   3275: iload #6
    //   3277: aaload
    //   3278: astore #7
    //   3280: aload #7
    //   3282: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3285: pop
    //   3286: aload #7
    //   3288: invokevirtual getModifiers : ()I
    //   3291: invokestatic isStatic : (I)Z
    //   3294: ifeq -> 3392
    //   3297: aload #7
    //   3299: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3302: arraylength
    //   3303: iconst_2
    //   3304: if_icmpne -> 3392
    //   3307: goto -> 3314
    //   3310: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3313: athrow
    //   3314: aload #7
    //   3316: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3319: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3322: if_acmpne -> 3392
    //   3325: goto -> 3332
    //   3328: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3331: athrow
    //   3332: aload #7
    //   3334: iconst_1
    //   3335: invokevirtual setAccessible : (Z)V
    //   3338: aload #7
    //   3340: aconst_null
    //   3341: iconst_2
    //   3342: anewarray java/lang/Object
    //   3345: dup
    //   3346: iconst_0
    //   3347: aload_0
    //   3348: aastore
    //   3349: dup
    //   3350: iconst_1
    //   3351: aload_1
    //   3352: ifnonnull -> 3370
    //   3355: goto -> 3362
    //   3358: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3361: athrow
    //   3362: aload_1
    //   3363: goto -> 3377
    //   3366: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3369: athrow
    //   3370: aload_1
    //   3371: checkcast [B
    //   3374: invokevirtual clone : ()Ljava/lang/Object;
    //   3377: aastore
    //   3378: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3381: checkcast java/lang/Boolean
    //   3384: invokevirtual booleanValue : ()Z
    //   3387: istore_3
    //   3388: iload_2
    //   3389: ifeq -> 3406
    //   3392: iinc #6, 1
    //   3395: iload_2
    //   3396: ifeq -> 3266
    //   3399: goto -> 3406
    //   3402: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3405: athrow
    //   3406: iload_3
    //   3407: ifeq -> 3412
    //   3410: iload_3
    //   3411: ireturn
    //   3412: getstatic burp/Zrt3.Zu : Ljava/lang/String;
    //   3415: getstatic burp/Zr1t.ZP : Ljava/lang/Object;
    //   3418: checkcast java/math/BigInteger
    //   3421: invokevirtual intValue : ()I
    //   3424: bipush #32
    //   3426: irem
    //   3427: invokestatic abs : (I)I
    //   3430: invokevirtual charAt : (I)C
    //   3433: getstatic burp/Zz7j.ZP : Ljava/lang/String;
    //   3436: getstatic burp/Zebc.Zr : Ljava/lang/Object;
    //   3439: checkcast java/math/BigInteger
    //   3442: invokevirtual intValue : ()I
    //   3445: bipush #32
    //   3447: irem
    //   3448: invokestatic abs : (I)I
    //   3451: invokevirtual charAt : (I)C
    //   3454: if_icmple -> 3799
    //   3457: sipush #-9434
    //   3460: sipush #17320
    //   3463: invokestatic a : (II)Ljava/lang/String;
    //   3466: iconst_1
    //   3467: ldc burp/Zs75
    //   3469: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3472: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3475: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3478: astore #4
    //   3480: aload #4
    //   3482: arraylength
    //   3483: istore #5
    //   3485: iconst_0
    //   3486: istore #6
    //   3488: iload #6
    //   3490: iload #5
    //   3492: if_icmpge -> 3630
    //   3495: aload #4
    //   3497: iload #6
    //   3499: aaload
    //   3500: astore #7
    //   3502: aload #7
    //   3504: invokevirtual getModifiers : ()I
    //   3507: invokestatic isStatic : (I)Z
    //   3510: ifne -> 3520
    //   3513: goto -> 3623
    //   3516: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3519: athrow
    //   3520: aload #7
    //   3522: invokevirtual getType : ()Ljava/lang/Class;
    //   3525: astore #8
    //   3527: aload #8
    //   3529: ifnull -> 3610
    //   3532: aload #8
    //   3534: invokevirtual isPrimitive : ()Z
    //   3537: ifne -> 3610
    //   3540: goto -> 3547
    //   3543: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3546: athrow
    //   3547: aload #8
    //   3549: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3552: ifnull -> 3610
    //   3555: goto -> 3562
    //   3558: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3561: athrow
    //   3562: aload #8
    //   3564: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3567: invokevirtual getName : ()Ljava/lang/String;
    //   3570: ifnull -> 3610
    //   3573: goto -> 3580
    //   3576: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3579: athrow
    //   3580: aload #8
    //   3582: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3585: invokevirtual getName : ()Ljava/lang/String;
    //   3588: sipush #-9426
    //   3591: sipush #-15001
    //   3594: invokestatic a : (II)Ljava/lang/String;
    //   3597: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3600: ifne -> 3610
    //   3603: goto -> 3610
    //   3606: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3609: athrow
    //   3610: aload #7
    //   3612: iconst_1
    //   3613: invokevirtual setAccessible : (Z)V
    //   3616: aload #7
    //   3618: aconst_null
    //   3619: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3622: pop
    //   3623: iinc #6, 1
    //   3626: iload_2
    //   3627: ifeq -> 3488
    //   3630: sipush #-9413
    //   3633: sipush #-30360
    //   3636: invokestatic a : (II)Ljava/lang/String;
    //   3639: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3642: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3645: astore #4
    //   3647: aload #4
    //   3649: arraylength
    //   3650: istore #5
    //   3652: iconst_0
    //   3653: istore #6
    //   3655: iload #6
    //   3657: iload #5
    //   3659: if_icmpge -> 3795
    //   3662: aload #4
    //   3664: iload #6
    //   3666: aaload
    //   3667: astore #7
    //   3669: aload #7
    //   3671: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3674: pop
    //   3675: aload #7
    //   3677: invokevirtual getModifiers : ()I
    //   3680: invokestatic isStatic : (I)Z
    //   3683: ifeq -> 3781
    //   3686: aload #7
    //   3688: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3691: arraylength
    //   3692: iconst_2
    //   3693: if_icmpne -> 3781
    //   3696: goto -> 3703
    //   3699: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3702: athrow
    //   3703: aload #7
    //   3705: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3708: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3711: if_acmpne -> 3781
    //   3714: goto -> 3721
    //   3717: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3720: athrow
    //   3721: aload #7
    //   3723: iconst_1
    //   3724: invokevirtual setAccessible : (Z)V
    //   3727: aload #7
    //   3729: aconst_null
    //   3730: iconst_2
    //   3731: anewarray java/lang/Object
    //   3734: dup
    //   3735: iconst_0
    //   3736: aload_0
    //   3737: aastore
    //   3738: dup
    //   3739: iconst_1
    //   3740: aload_1
    //   3741: ifnonnull -> 3759
    //   3744: goto -> 3751
    //   3747: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3750: athrow
    //   3751: aload_1
    //   3752: goto -> 3766
    //   3755: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3758: athrow
    //   3759: aload_1
    //   3760: checkcast [B
    //   3763: invokevirtual clone : ()Ljava/lang/Object;
    //   3766: aastore
    //   3767: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3770: checkcast java/lang/Boolean
    //   3773: invokevirtual booleanValue : ()Z
    //   3776: istore_3
    //   3777: iload_2
    //   3778: ifeq -> 3795
    //   3781: iinc #6, 1
    //   3784: iload_2
    //   3785: ifeq -> 3655
    //   3788: goto -> 3795
    //   3791: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3794: athrow
    //   3795: iload_2
    //   3796: ifeq -> 4137
    //   3799: sipush #-9437
    //   3802: sipush #27721
    //   3805: invokestatic a : (II)Ljava/lang/String;
    //   3808: iconst_1
    //   3809: ldc burp/Zegk
    //   3811: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3814: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3817: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3820: astore #4
    //   3822: aload #4
    //   3824: arraylength
    //   3825: istore #5
    //   3827: iconst_0
    //   3828: istore #6
    //   3830: iload #6
    //   3832: iload #5
    //   3834: if_icmpge -> 3972
    //   3837: aload #4
    //   3839: iload #6
    //   3841: aaload
    //   3842: astore #7
    //   3844: aload #7
    //   3846: invokevirtual getModifiers : ()I
    //   3849: invokestatic isStatic : (I)Z
    //   3852: ifne -> 3862
    //   3855: goto -> 3965
    //   3858: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3861: athrow
    //   3862: aload #7
    //   3864: invokevirtual getType : ()Ljava/lang/Class;
    //   3867: astore #8
    //   3869: aload #8
    //   3871: ifnull -> 3952
    //   3874: aload #8
    //   3876: invokevirtual isPrimitive : ()Z
    //   3879: ifne -> 3952
    //   3882: goto -> 3889
    //   3885: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3888: athrow
    //   3889: aload #8
    //   3891: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3894: ifnull -> 3952
    //   3897: goto -> 3904
    //   3900: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3903: athrow
    //   3904: aload #8
    //   3906: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3909: invokevirtual getName : ()Ljava/lang/String;
    //   3912: ifnull -> 3952
    //   3915: goto -> 3922
    //   3918: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3921: athrow
    //   3922: aload #8
    //   3924: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3927: invokevirtual getName : ()Ljava/lang/String;
    //   3930: sipush #-9426
    //   3933: sipush #-15001
    //   3936: invokestatic a : (II)Ljava/lang/String;
    //   3939: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3942: ifne -> 3952
    //   3945: goto -> 3952
    //   3948: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3951: athrow
    //   3952: aload #7
    //   3954: iconst_1
    //   3955: invokevirtual setAccessible : (Z)V
    //   3958: aload #7
    //   3960: aconst_null
    //   3961: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3964: pop
    //   3965: iinc #6, 1
    //   3968: iload_2
    //   3969: ifeq -> 3830
    //   3972: sipush #-9429
    //   3975: sipush #27809
    //   3978: invokestatic a : (II)Ljava/lang/String;
    //   3981: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3984: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3987: astore #4
    //   3989: aload #4
    //   3991: arraylength
    //   3992: istore #5
    //   3994: iconst_0
    //   3995: istore #6
    //   3997: iload #6
    //   3999: iload #5
    //   4001: if_icmpge -> 4137
    //   4004: aload #4
    //   4006: iload #6
    //   4008: aaload
    //   4009: astore #7
    //   4011: aload #7
    //   4013: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4016: pop
    //   4017: aload #7
    //   4019: invokevirtual getModifiers : ()I
    //   4022: invokestatic isStatic : (I)Z
    //   4025: ifeq -> 4123
    //   4028: aload #7
    //   4030: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4033: arraylength
    //   4034: iconst_2
    //   4035: if_icmpne -> 4123
    //   4038: goto -> 4045
    //   4041: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4044: athrow
    //   4045: aload #7
    //   4047: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4050: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4053: if_acmpne -> 4123
    //   4056: goto -> 4063
    //   4059: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4062: athrow
    //   4063: aload #7
    //   4065: iconst_1
    //   4066: invokevirtual setAccessible : (Z)V
    //   4069: aload #7
    //   4071: aconst_null
    //   4072: iconst_2
    //   4073: anewarray java/lang/Object
    //   4076: dup
    //   4077: iconst_0
    //   4078: aload_0
    //   4079: aastore
    //   4080: dup
    //   4081: iconst_1
    //   4082: aload_1
    //   4083: ifnonnull -> 4101
    //   4086: goto -> 4093
    //   4089: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4092: athrow
    //   4093: aload_1
    //   4094: goto -> 4108
    //   4097: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4100: athrow
    //   4101: aload_1
    //   4102: checkcast [B
    //   4105: invokevirtual clone : ()Ljava/lang/Object;
    //   4108: aastore
    //   4109: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4112: checkcast java/lang/Boolean
    //   4115: invokevirtual booleanValue : ()Z
    //   4118: istore_3
    //   4119: iload_2
    //   4120: ifeq -> 4137
    //   4123: iinc #6, 1
    //   4126: iload_2
    //   4127: ifeq -> 3997
    //   4130: goto -> 4137
    //   4133: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4136: athrow
    //   4137: iload_3
    //   4138: ireturn
    //   4139: astore_3
    //   4140: new java/lang/Exception
    //   4143: dup
    //   4144: aload_3
    //   4145: invokevirtual getMessage : ()Ljava/lang/String;
    //   4148: invokespecial <init> : (Ljava/lang/String;)V
    //   4151: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1949	4139	java/lang/Throwable
    //   51	65	68	java/lang/Throwable
    //   58	79	82	java/lang/Throwable
    //   72	93	96	java/lang/Throwable
    //   86	107	110	java/lang/Throwable
    //   100	121	124	java/lang/Throwable
    //   114	135	138	java/lang/Throwable
    //   128	149	152	java/lang/Throwable
    //   142	163	166	java/lang/Throwable
    //   156	173	176	java/lang/Throwable
    //   212	226	229	java/lang/Throwable
    //   219	240	243	java/lang/Throwable
    //   233	254	257	java/lang/Throwable
    //   247	268	271	java/lang/Throwable
    //   261	282	285	java/lang/Throwable
    //   275	296	299	java/lang/Throwable
    //   289	310	313	java/lang/Throwable
    //   303	324	327	java/lang/Throwable
    //   317	341	344	java/lang/Throwable
    //   405	423	426	java/lang/Throwable
    //   414	439	442	java/lang/Throwable
    //   430	456	459	java/lang/Throwable
    //   446	472	475	java/lang/Throwable
    //   463	489	492	java/lang/Throwable
    //   479	505	508	java/lang/Throwable
    //   496	521	524	java/lang/Throwable
    //   512	544	547	java/lang/Throwable
    //   528	560	563	java/lang/Throwable
    //   551	576	579	java/lang/Throwable
    //   567	599	602	java/lang/Throwable
    //   583	615	618	java/lang/Throwable
    //   606	631	634	java/lang/Throwable
    //   622	650	653	java/lang/Throwable
    //   780	815	818	java/lang/Throwable
    //   822	863	866	java/lang/Throwable
    //   931	945	945	java/lang/Throwable
    //   956	969	972	java/lang/Throwable
    //   961	984	987	java/lang/Throwable
    //   976	1002	1005	java/lang/Throwable
    //   991	1032	1035	java/lang/Throwable
    //   1095	1122	1125	java/lang/Throwable
    //   1112	1143	1146	java/lang/Throwable
    //   1129	1173	1176	java/lang/Throwable
    //   1150	1184	1184	java/lang/Throwable
    //   1195	1211	1214	java/lang/Throwable
    //   1310	1324	1324	java/lang/Throwable
    //   1335	1348	1351	java/lang/Throwable
    //   1340	1363	1366	java/lang/Throwable
    //   1355	1381	1384	java/lang/Throwable
    //   1370	1411	1414	java/lang/Throwable
    //   1477	1504	1507	java/lang/Throwable
    //   1494	1522	1525	java/lang/Throwable
    //   1511	1552	1555	java/lang/Throwable
    //   1529	1563	1563	java/lang/Throwable
    //   1585	1596	1599	java/lang/Throwable
    //   1651	1665	1665	java/lang/Throwable
    //   1676	1689	1692	java/lang/Throwable
    //   1681	1704	1707	java/lang/Throwable
    //   1696	1722	1725	java/lang/Throwable
    //   1711	1752	1755	java/lang/Throwable
    //   1818	1845	1848	java/lang/Throwable
    //   1835	1863	1866	java/lang/Throwable
    //   1852	1893	1896	java/lang/Throwable
    //   1870	1904	1904	java/lang/Throwable
    //   1926	1937	1940	java/lang/Throwable
    //   1950	2680	4139	java/lang/Throwable
    //   2040	2054	2054	java/lang/Throwable
    //   2065	2078	2081	java/lang/Throwable
    //   2070	2093	2096	java/lang/Throwable
    //   2085	2111	2114	java/lang/Throwable
    //   2100	2141	2144	java/lang/Throwable
    //   2207	2234	2237	java/lang/Throwable
    //   2224	2252	2255	java/lang/Throwable
    //   2241	2282	2285	java/lang/Throwable
    //   2259	2293	2293	java/lang/Throwable
    //   2315	2326	2329	java/lang/Throwable
    //   2382	2396	2396	java/lang/Throwable
    //   2407	2420	2423	java/lang/Throwable
    //   2412	2435	2438	java/lang/Throwable
    //   2427	2453	2456	java/lang/Throwable
    //   2442	2483	2486	java/lang/Throwable
    //   2549	2576	2579	java/lang/Throwable
    //   2566	2594	2597	java/lang/Throwable
    //   2583	2624	2627	java/lang/Throwable
    //   2601	2635	2635	java/lang/Throwable
    //   2657	2668	2671	java/lang/Throwable
    //   2681	3411	4139	java/lang/Throwable
    //   2771	2785	2785	java/lang/Throwable
    //   2796	2809	2812	java/lang/Throwable
    //   2801	2824	2827	java/lang/Throwable
    //   2816	2842	2845	java/lang/Throwable
    //   2831	2872	2875	java/lang/Throwable
    //   2938	2965	2968	java/lang/Throwable
    //   2955	2983	2986	java/lang/Throwable
    //   2972	3013	3016	java/lang/Throwable
    //   2990	3024	3024	java/lang/Throwable
    //   3046	3057	3060	java/lang/Throwable
    //   3113	3127	3127	java/lang/Throwable
    //   3138	3151	3154	java/lang/Throwable
    //   3143	3166	3169	java/lang/Throwable
    //   3158	3184	3187	java/lang/Throwable
    //   3173	3214	3217	java/lang/Throwable
    //   3280	3307	3310	java/lang/Throwable
    //   3297	3325	3328	java/lang/Throwable
    //   3314	3355	3358	java/lang/Throwable
    //   3332	3366	3366	java/lang/Throwable
    //   3388	3399	3402	java/lang/Throwable
    //   3412	4138	4139	java/lang/Throwable
    //   3502	3516	3516	java/lang/Throwable
    //   3527	3540	3543	java/lang/Throwable
    //   3532	3555	3558	java/lang/Throwable
    //   3547	3573	3576	java/lang/Throwable
    //   3562	3603	3606	java/lang/Throwable
    //   3669	3696	3699	java/lang/Throwable
    //   3686	3714	3717	java/lang/Throwable
    //   3703	3744	3747	java/lang/Throwable
    //   3721	3755	3755	java/lang/Throwable
    //   3777	3788	3791	java/lang/Throwable
    //   3844	3858	3858	java/lang/Throwable
    //   3869	3882	3885	java/lang/Throwable
    //   3874	3897	3900	java/lang/Throwable
    //   3889	3915	3918	java/lang/Throwable
    //   3904	3945	3948	java/lang/Throwable
    //   4011	4038	4041	java/lang/Throwable
    //   4028	4056	4059	java/lang/Throwable
    //   4045	4086	4089	java/lang/Throwable
    //   4063	4097	4097	java/lang/Throwable
    //   4119	4130	4133	java/lang/Throwable
  }
  
  static void ZK(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void Zt(Object paramObject) {
    Zspg.ZG = a(-9435, -10033);
    Zspg.ZJ = new BigInteger(a(-9416, 22972));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zxci.Zw.charAt(Math.abs(((BigInteger)Zrkw.ZV).intValue() % 32)) <= Zrfa.ZT.charAt(Math.abs(((BigInteger)Zb3l.Zl).intValue() % 32))) {
          try {
            Zmdf.ZO(Class.forName(a(-9427, -18637)));
            if (!bool)
              Zl88.ZI(Class.forName(a(-9433, -15415))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zl88.ZI(Class.forName(a(-9433, -15415)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #25
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÄÉ!E\\tì$îí"øÑª\\txÈspLyù\\trÆ÷¤k®e9\\t9cºý¶\\tTË3_ªâ\\f\\t#ÇÝÒoä{\\tvé²T©×lv\\t9ÞN$Ê\\toËTã_(âý oBÐí«ì¯=eýA£1îÍZæ^bk8Gø8RÂýtn,\\t9üãº\\r'\\t¦*m9ÄØÛK/\\tÉ5Úy¤fÅØ\\tOPßc?ê\\tñÅÄggª\\tð§oö °vÚ@úÆRd]¾ª<­Ê¦!ÍÚG;s"Á¸¸6\\t®{©Ê9o\\t&Ù}GÆê|\\tÔ#/\\rüM<¢çfdµVÂ³­wÊÉÿ#Ñ9ÐÑH);j³îÐl£eìôÂÓ¨õn÷èÒå8LÞU ¡ÏÛp'6û'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #117
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
    //   67: ldc 'û+l³N#*Å©\\t\\t12ðK@'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #9
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #19
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
    //   128: putstatic burp/Zb2n.a : [Ljava/lang/String;
    //   131: bipush #25
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zb2n.b : [Ljava/lang/String;
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
    //   212: bipush #81
    //   214: goto -> 244
    //   217: bipush #41
    //   219: goto -> 244
    //   222: bipush #20
    //   224: goto -> 244
    //   227: bipush #41
    //   229: goto -> 244
    //   232: bipush #34
    //   234: goto -> 244
    //   237: bipush #37
    //   239: goto -> 244
    //   242: bipush #69
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
    //   300: sipush #-9412
    //   303: sipush #-27272
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zb2n.Za : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: bipush #32
    //   318: newarray byte
    //   320: dup
    //   321: iconst_0
    //   322: bipush #24
    //   324: bastore
    //   325: dup
    //   326: iconst_1
    //   327: iconst_m1
    //   328: bastore
    //   329: dup
    //   330: iconst_2
    //   331: bipush #41
    //   333: bastore
    //   334: dup
    //   335: iconst_3
    //   336: bipush #-19
    //   338: bastore
    //   339: dup
    //   340: iconst_4
    //   341: bipush #50
    //   343: bastore
    //   344: dup
    //   345: iconst_5
    //   346: bipush #-108
    //   348: bastore
    //   349: dup
    //   350: bipush #6
    //   352: iconst_m1
    //   353: bastore
    //   354: dup
    //   355: bipush #7
    //   357: bipush #16
    //   359: bastore
    //   360: dup
    //   361: bipush #8
    //   363: bipush #-68
    //   365: bastore
    //   366: dup
    //   367: bipush #9
    //   369: bipush #-44
    //   371: bastore
    //   372: dup
    //   373: bipush #10
    //   375: bipush #-49
    //   377: bastore
    //   378: dup
    //   379: bipush #11
    //   381: bipush #113
    //   383: bastore
    //   384: dup
    //   385: bipush #12
    //   387: bipush #61
    //   389: bastore
    //   390: dup
    //   391: bipush #13
    //   393: bipush #-127
    //   395: bastore
    //   396: dup
    //   397: bipush #14
    //   399: bipush #-58
    //   401: bastore
    //   402: dup
    //   403: bipush #15
    //   405: bipush #25
    //   407: bastore
    //   408: dup
    //   409: bipush #16
    //   411: bipush #95
    //   413: bastore
    //   414: dup
    //   415: bipush #17
    //   417: bipush #-123
    //   419: bastore
    //   420: dup
    //   421: bipush #18
    //   423: bipush #105
    //   425: bastore
    //   426: dup
    //   427: bipush #19
    //   429: bipush #-91
    //   431: bastore
    //   432: dup
    //   433: bipush #20
    //   435: bipush #-85
    //   437: bastore
    //   438: dup
    //   439: bipush #21
    //   441: bipush #84
    //   443: bastore
    //   444: dup
    //   445: bipush #22
    //   447: bipush #-43
    //   449: bastore
    //   450: dup
    //   451: bipush #23
    //   453: bipush #-66
    //   455: bastore
    //   456: dup
    //   457: bipush #24
    //   459: bipush #-102
    //   461: bastore
    //   462: dup
    //   463: bipush #25
    //   465: bipush #85
    //   467: bastore
    //   468: dup
    //   469: bipush #26
    //   471: bipush #12
    //   473: bastore
    //   474: dup
    //   475: bipush #27
    //   477: bipush #-60
    //   479: bastore
    //   480: dup
    //   481: bipush #28
    //   483: bipush #8
    //   485: bastore
    //   486: dup
    //   487: bipush #29
    //   489: iconst_1
    //   490: bastore
    //   491: dup
    //   492: bipush #30
    //   494: bipush #-32
    //   496: bastore
    //   497: dup
    //   498: bipush #31
    //   500: iconst_3
    //   501: bastore
    //   502: invokespecial <init> : ([B)V
    //   505: putstatic burp/Zb2n.ZR : Ljava/lang/Object;
    //   508: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFDB2E) & 0xFFFF;
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
      byte b1 = 59;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb2n.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */