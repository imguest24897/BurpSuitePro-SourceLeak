package burp;

import java.math.BigInteger;

class Zstf extends ClassLoader {
  static Object ZA;
  
  static String ZZ;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZM(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean ZT(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: sipush #22861
    //   7: sipush #-19913
    //   10: invokestatic a : (II)Ljava/lang/String;
    //   13: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   16: invokestatic ZE : (Ljava/lang/Object;)V
    //   19: sipush #22848
    //   22: getstatic burp/Zl1q.Zh : Ljava/lang/Object;
    //   25: checkcast java/math/BigInteger
    //   28: getstatic burp/Zoa.ZI : Ljava/lang/Object;
    //   31: checkcast java/math/BigInteger
    //   34: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   37: putstatic burp/Zxxd.Zn : Ljava/lang/Object;
    //   40: sipush #-32153
    //   43: invokestatic a : (II)Ljava/lang/String;
    //   46: iconst_1
    //   47: ldc burp/Zb9q
    //   49: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   52: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   55: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   58: astore_3
    //   59: aload_3
    //   60: arraylength
    //   61: istore #4
    //   63: iconst_0
    //   64: istore #5
    //   66: iload #5
    //   68: iload #4
    //   70: if_icmpge -> 207
    //   73: aload_3
    //   74: iload #5
    //   76: aaload
    //   77: astore #6
    //   79: aload #6
    //   81: invokevirtual getModifiers : ()I
    //   84: invokestatic isStatic : (I)Z
    //   87: ifne -> 97
    //   90: goto -> 200
    //   93: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   96: athrow
    //   97: aload #6
    //   99: invokevirtual getType : ()Ljava/lang/Class;
    //   102: astore #7
    //   104: aload #7
    //   106: ifnull -> 187
    //   109: aload #7
    //   111: invokevirtual isPrimitive : ()Z
    //   114: ifne -> 187
    //   117: goto -> 124
    //   120: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   123: athrow
    //   124: aload #7
    //   126: invokevirtual getPackage : ()Ljava/lang/Package;
    //   129: ifnull -> 187
    //   132: goto -> 139
    //   135: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   138: athrow
    //   139: aload #7
    //   141: invokevirtual getPackage : ()Ljava/lang/Package;
    //   144: invokevirtual getName : ()Ljava/lang/String;
    //   147: ifnull -> 187
    //   150: goto -> 157
    //   153: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   156: athrow
    //   157: aload #7
    //   159: invokevirtual getPackage : ()Ljava/lang/Package;
    //   162: invokevirtual getName : ()Ljava/lang/String;
    //   165: sipush #22867
    //   168: sipush #8295
    //   171: invokestatic a : (II)Ljava/lang/String;
    //   174: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   177: ifne -> 187
    //   180: goto -> 187
    //   183: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   186: athrow
    //   187: aload #6
    //   189: iconst_1
    //   190: invokevirtual setAccessible : (Z)V
    //   193: aload #6
    //   195: aconst_null
    //   196: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   199: pop
    //   200: iinc #5, 1
    //   203: iload_2
    //   204: ifeq -> 66
    //   207: sipush #22849
    //   210: sipush #11182
    //   213: invokestatic a : (II)Ljava/lang/String;
    //   216: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   219: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   222: astore_3
    //   223: aload_3
    //   224: arraylength
    //   225: istore #4
    //   227: iconst_0
    //   228: istore #5
    //   230: iload #5
    //   232: iload #4
    //   234: if_icmpge -> 366
    //   237: aload_3
    //   238: iload #5
    //   240: aaload
    //   241: astore #6
    //   243: aload #6
    //   245: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   248: pop
    //   249: aload #6
    //   251: invokevirtual getModifiers : ()I
    //   254: invokestatic isStatic : (I)Z
    //   257: ifeq -> 352
    //   260: aload #6
    //   262: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   265: arraylength
    //   266: iconst_2
    //   267: if_icmpne -> 352
    //   270: goto -> 277
    //   273: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   276: athrow
    //   277: aload #6
    //   279: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   282: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   285: invokevirtual equals : (Ljava/lang/Object;)Z
    //   288: ifeq -> 352
    //   291: goto -> 298
    //   294: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   297: athrow
    //   298: aload #6
    //   300: iconst_1
    //   301: invokevirtual setAccessible : (Z)V
    //   304: aload #6
    //   306: aconst_null
    //   307: iconst_2
    //   308: anewarray java/lang/Object
    //   311: dup
    //   312: iconst_0
    //   313: aload_0
    //   314: aastore
    //   315: dup
    //   316: iconst_1
    //   317: aload_1
    //   318: ifnonnull -> 336
    //   321: goto -> 328
    //   324: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   327: athrow
    //   328: aload_1
    //   329: goto -> 343
    //   332: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   335: athrow
    //   336: aload_1
    //   337: checkcast [B
    //   340: invokevirtual clone : ()Ljava/lang/Object;
    //   343: aastore
    //   344: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   347: pop
    //   348: iload_2
    //   349: ifeq -> 366
    //   352: iinc #5, 1
    //   355: iload_2
    //   356: ifeq -> 230
    //   359: goto -> 366
    //   362: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   365: athrow
    //   366: getstatic burp/Zgds.Z_ : Ljava/lang/Object;
    //   369: checkcast java/math/BigInteger
    //   372: invokevirtual toByteArray : ()[B
    //   375: astore_3
    //   376: bipush #32
    //   378: newarray int
    //   380: dup
    //   381: iconst_0
    //   382: ldc 943331329
    //   384: iastore
    //   385: dup
    //   386: iconst_1
    //   387: ldc 170788368
    //   389: iastore
    //   390: dup
    //   391: iconst_2
    //   392: ldc 1008414755
    //   394: iastore
    //   395: dup
    //   396: iconst_3
    //   397: ldc 187049985
    //   399: iastore
    //   400: dup
    //   401: iconst_4
    //   402: ldc 1010368540
    //   404: iastore
    //   405: dup
    //   406: iconst_5
    //   407: ldc 220604441
    //   409: iastore
    //   410: dup
    //   411: bipush #6
    //   413: ldc 940377620
    //   415: iastore
    //   416: dup
    //   417: bipush #7
    //   419: ldc 255209728
    //   421: iastore
    //   422: dup
    //   423: bipush #8
    //   425: ldc 689771012
    //   427: iastore
    //   428: dup
    //   429: bipush #9
    //   431: ldc 221709344
    //   433: iastore
    //   434: dup
    //   435: bipush #10
    //   437: ldc 957157408
    //   439: iastore
    //   440: dup
    //   441: bipush #11
    //   443: ldc 892536332
    //   445: iastore
    //   446: dup
    //   447: bipush #12
    //   449: ldc 722417666
    //   451: iastore
    //   452: dup
    //   453: bipush #13
    //   455: ldc 1026621720
    //   457: iastore
    //   458: dup
    //   459: bipush #14
    //   461: ldc 655302664
    //   463: iastore
    //   464: dup
    //   465: bipush #15
    //   467: ldc 890966315
    //   469: iastore
    //   470: dup
    //   471: bipush #16
    //   473: ldc 187632156
    //   475: iastore
    //   476: dup
    //   477: bipush #17
    //   479: ldc 874189824
    //   481: iastore
    //   482: dup
    //   483: bipush #18
    //   485: ldc 254150144
    //   487: iastore
    //   488: dup
    //   489: bipush #19
    //   491: ldc 924386310
    //   493: iastore
    //   494: dup
    //   495: bipush #20
    //   497: ldc 121057538
    //   499: iastore
    //   500: dup
    //   501: bipush #21
    //   503: ldc 840500228
    //   505: iastore
    //   506: dup
    //   507: bipush #22
    //   509: ldc 389160971
    //   511: iastore
    //   512: dup
    //   513: bipush #23
    //   515: ldc 907870729
    //   517: iastore
    //   518: dup
    //   519: bipush #24
    //   521: ldc 389426184
    //   523: iastore
    //   524: dup
    //   525: bipush #25
    //   527: ldc 973875457
    //   529: iastore
    //   530: dup
    //   531: bipush #26
    //   533: ldc 372376604
    //   535: iastore
    //   536: dup
    //   537: bipush #27
    //   539: ldc 707731490
    //   541: iastore
    //   542: dup
    //   543: bipush #28
    //   545: ldc 1043334948
    //   547: iastore
    //   548: dup
    //   549: bipush #29
    //   551: ldc 439222784
    //   553: iastore
    //   554: dup
    //   555: bipush #30
    //   557: ldc 876216579
    //   559: iastore
    //   560: dup
    //   561: bipush #31
    //   563: ldc 455999525
    //   565: iastore
    //   566: astore #5
    //   568: bipush #8
    //   570: aload_3
    //   571: arraylength
    //   572: bipush #8
    //   574: irem
    //   575: isub
    //   576: istore #6
    //   578: aload_3
    //   579: arraylength
    //   580: iload #6
    //   582: iadd
    //   583: newarray byte
    //   585: astore #7
    //   587: iconst_0
    //   588: istore #8
    //   590: iload #8
    //   592: aload_3
    //   593: arraylength
    //   594: if_icmpge -> 613
    //   597: aload #7
    //   599: iload #8
    //   601: aload_3
    //   602: iload #8
    //   604: baload
    //   605: bastore
    //   606: iinc #8, 1
    //   609: iload_2
    //   610: ifeq -> 590
    //   613: aload_3
    //   614: arraylength
    //   615: istore #8
    //   617: iload #8
    //   619: aload #7
    //   621: arraylength
    //   622: if_icmpge -> 640
    //   625: aload #7
    //   627: iload #8
    //   629: iload #6
    //   631: i2b
    //   632: bastore
    //   633: iinc #8, 1
    //   636: iload_2
    //   637: ifeq -> 617
    //   640: aload #7
    //   642: astore_3
    //   643: bipush #64
    //   645: newarray int
    //   647: dup
    //   648: iconst_0
    //   649: ldc 16843776
    //   651: iastore
    //   652: dup
    //   653: iconst_1
    //   654: iconst_0
    //   655: iastore
    //   656: dup
    //   657: iconst_2
    //   658: ldc 65536
    //   660: iastore
    //   661: dup
    //   662: iconst_3
    //   663: ldc 16843780
    //   665: iastore
    //   666: dup
    //   667: iconst_4
    //   668: ldc 16842756
    //   670: iastore
    //   671: dup
    //   672: iconst_5
    //   673: ldc 66564
    //   675: iastore
    //   676: dup
    //   677: bipush #6
    //   679: iconst_4
    //   680: iastore
    //   681: dup
    //   682: bipush #7
    //   684: ldc 65536
    //   686: iastore
    //   687: dup
    //   688: bipush #8
    //   690: sipush #1024
    //   693: iastore
    //   694: dup
    //   695: bipush #9
    //   697: ldc 16843776
    //   699: iastore
    //   700: dup
    //   701: bipush #10
    //   703: ldc 16843780
    //   705: iastore
    //   706: dup
    //   707: bipush #11
    //   709: sipush #1024
    //   712: iastore
    //   713: dup
    //   714: bipush #12
    //   716: ldc 16778244
    //   718: iastore
    //   719: dup
    //   720: bipush #13
    //   722: ldc 16842756
    //   724: iastore
    //   725: dup
    //   726: bipush #14
    //   728: ldc 16777216
    //   730: iastore
    //   731: dup
    //   732: bipush #15
    //   734: iconst_4
    //   735: iastore
    //   736: dup
    //   737: bipush #16
    //   739: sipush #1028
    //   742: iastore
    //   743: dup
    //   744: bipush #17
    //   746: ldc 16778240
    //   748: iastore
    //   749: dup
    //   750: bipush #18
    //   752: ldc 16778240
    //   754: iastore
    //   755: dup
    //   756: bipush #19
    //   758: ldc 66560
    //   760: iastore
    //   761: dup
    //   762: bipush #20
    //   764: ldc 66560
    //   766: iastore
    //   767: dup
    //   768: bipush #21
    //   770: ldc 16842752
    //   772: iastore
    //   773: dup
    //   774: bipush #22
    //   776: ldc 16842752
    //   778: iastore
    //   779: dup
    //   780: bipush #23
    //   782: ldc 16778244
    //   784: iastore
    //   785: dup
    //   786: bipush #24
    //   788: ldc 65540
    //   790: iastore
    //   791: dup
    //   792: bipush #25
    //   794: ldc 16777220
    //   796: iastore
    //   797: dup
    //   798: bipush #26
    //   800: ldc 16777220
    //   802: iastore
    //   803: dup
    //   804: bipush #27
    //   806: ldc 65540
    //   808: iastore
    //   809: dup
    //   810: bipush #28
    //   812: iconst_0
    //   813: iastore
    //   814: dup
    //   815: bipush #29
    //   817: sipush #1028
    //   820: iastore
    //   821: dup
    //   822: bipush #30
    //   824: ldc 66564
    //   826: iastore
    //   827: dup
    //   828: bipush #31
    //   830: ldc 16777216
    //   832: iastore
    //   833: dup
    //   834: bipush #32
    //   836: ldc 65536
    //   838: iastore
    //   839: dup
    //   840: bipush #33
    //   842: ldc 16843780
    //   844: iastore
    //   845: dup
    //   846: bipush #34
    //   848: iconst_4
    //   849: iastore
    //   850: dup
    //   851: bipush #35
    //   853: ldc 16842752
    //   855: iastore
    //   856: dup
    //   857: bipush #36
    //   859: ldc 16843776
    //   861: iastore
    //   862: dup
    //   863: bipush #37
    //   865: ldc 16777216
    //   867: iastore
    //   868: dup
    //   869: bipush #38
    //   871: ldc 16777216
    //   873: iastore
    //   874: dup
    //   875: bipush #39
    //   877: sipush #1024
    //   880: iastore
    //   881: dup
    //   882: bipush #40
    //   884: ldc 16842756
    //   886: iastore
    //   887: dup
    //   888: bipush #41
    //   890: ldc 65536
    //   892: iastore
    //   893: dup
    //   894: bipush #42
    //   896: ldc 66560
    //   898: iastore
    //   899: dup
    //   900: bipush #43
    //   902: ldc 16777220
    //   904: iastore
    //   905: dup
    //   906: bipush #44
    //   908: sipush #1024
    //   911: iastore
    //   912: dup
    //   913: bipush #45
    //   915: iconst_4
    //   916: iastore
    //   917: dup
    //   918: bipush #46
    //   920: ldc 16778244
    //   922: iastore
    //   923: dup
    //   924: bipush #47
    //   926: ldc 66564
    //   928: iastore
    //   929: dup
    //   930: bipush #48
    //   932: ldc 16843780
    //   934: iastore
    //   935: dup
    //   936: bipush #49
    //   938: ldc 65540
    //   940: iastore
    //   941: dup
    //   942: bipush #50
    //   944: ldc 16842752
    //   946: iastore
    //   947: dup
    //   948: bipush #51
    //   950: ldc 16778244
    //   952: iastore
    //   953: dup
    //   954: bipush #52
    //   956: ldc 16777220
    //   958: iastore
    //   959: dup
    //   960: bipush #53
    //   962: sipush #1028
    //   965: iastore
    //   966: dup
    //   967: bipush #54
    //   969: ldc 66564
    //   971: iastore
    //   972: dup
    //   973: bipush #55
    //   975: ldc 16843776
    //   977: iastore
    //   978: dup
    //   979: bipush #56
    //   981: sipush #1028
    //   984: iastore
    //   985: dup
    //   986: bipush #57
    //   988: ldc 16778240
    //   990: iastore
    //   991: dup
    //   992: bipush #58
    //   994: ldc 16778240
    //   996: iastore
    //   997: dup
    //   998: bipush #59
    //   1000: iconst_0
    //   1001: iastore
    //   1002: dup
    //   1003: bipush #60
    //   1005: ldc 65540
    //   1007: iastore
    //   1008: dup
    //   1009: bipush #61
    //   1011: ldc 66560
    //   1013: iastore
    //   1014: dup
    //   1015: bipush #62
    //   1017: iconst_0
    //   1018: iastore
    //   1019: dup
    //   1020: bipush #63
    //   1022: ldc 16842756
    //   1024: iastore
    //   1025: astore #8
    //   1027: bipush #64
    //   1029: newarray int
    //   1031: dup
    //   1032: iconst_0
    //   1033: ldc -2146402272
    //   1035: iastore
    //   1036: dup
    //   1037: iconst_1
    //   1038: ldc -2147450880
    //   1040: iastore
    //   1041: dup
    //   1042: iconst_2
    //   1043: ldc 32768
    //   1045: iastore
    //   1046: dup
    //   1047: iconst_3
    //   1048: ldc 1081376
    //   1050: iastore
    //   1051: dup
    //   1052: iconst_4
    //   1053: ldc 1048576
    //   1055: iastore
    //   1056: dup
    //   1057: iconst_5
    //   1058: bipush #32
    //   1060: iastore
    //   1061: dup
    //   1062: bipush #6
    //   1064: ldc -2146435040
    //   1066: iastore
    //   1067: dup
    //   1068: bipush #7
    //   1070: ldc -2147450848
    //   1072: iastore
    //   1073: dup
    //   1074: bipush #8
    //   1076: ldc -2147483616
    //   1078: iastore
    //   1079: dup
    //   1080: bipush #9
    //   1082: ldc -2146402272
    //   1084: iastore
    //   1085: dup
    //   1086: bipush #10
    //   1088: ldc -2146402304
    //   1090: iastore
    //   1091: dup
    //   1092: bipush #11
    //   1094: ldc -2147483648
    //   1096: iastore
    //   1097: dup
    //   1098: bipush #12
    //   1100: ldc -2147450880
    //   1102: iastore
    //   1103: dup
    //   1104: bipush #13
    //   1106: ldc 1048576
    //   1108: iastore
    //   1109: dup
    //   1110: bipush #14
    //   1112: bipush #32
    //   1114: iastore
    //   1115: dup
    //   1116: bipush #15
    //   1118: ldc -2146435040
    //   1120: iastore
    //   1121: dup
    //   1122: bipush #16
    //   1124: ldc 1081344
    //   1126: iastore
    //   1127: dup
    //   1128: bipush #17
    //   1130: ldc 1048608
    //   1132: iastore
    //   1133: dup
    //   1134: bipush #18
    //   1136: ldc -2147450848
    //   1138: iastore
    //   1139: dup
    //   1140: bipush #19
    //   1142: iconst_0
    //   1143: iastore
    //   1144: dup
    //   1145: bipush #20
    //   1147: ldc -2147483648
    //   1149: iastore
    //   1150: dup
    //   1151: bipush #21
    //   1153: ldc 32768
    //   1155: iastore
    //   1156: dup
    //   1157: bipush #22
    //   1159: ldc 1081376
    //   1161: iastore
    //   1162: dup
    //   1163: bipush #23
    //   1165: ldc -2146435072
    //   1167: iastore
    //   1168: dup
    //   1169: bipush #24
    //   1171: ldc 1048608
    //   1173: iastore
    //   1174: dup
    //   1175: bipush #25
    //   1177: ldc -2147483616
    //   1179: iastore
    //   1180: dup
    //   1181: bipush #26
    //   1183: iconst_0
    //   1184: iastore
    //   1185: dup
    //   1186: bipush #27
    //   1188: ldc 1081344
    //   1190: iastore
    //   1191: dup
    //   1192: bipush #28
    //   1194: ldc 32800
    //   1196: iastore
    //   1197: dup
    //   1198: bipush #29
    //   1200: ldc -2146402304
    //   1202: iastore
    //   1203: dup
    //   1204: bipush #30
    //   1206: ldc -2146435072
    //   1208: iastore
    //   1209: dup
    //   1210: bipush #31
    //   1212: ldc 32800
    //   1214: iastore
    //   1215: dup
    //   1216: bipush #32
    //   1218: iconst_0
    //   1219: iastore
    //   1220: dup
    //   1221: bipush #33
    //   1223: ldc 1081376
    //   1225: iastore
    //   1226: dup
    //   1227: bipush #34
    //   1229: ldc -2146435040
    //   1231: iastore
    //   1232: dup
    //   1233: bipush #35
    //   1235: ldc 1048576
    //   1237: iastore
    //   1238: dup
    //   1239: bipush #36
    //   1241: ldc -2147450848
    //   1243: iastore
    //   1244: dup
    //   1245: bipush #37
    //   1247: ldc -2146435072
    //   1249: iastore
    //   1250: dup
    //   1251: bipush #38
    //   1253: ldc -2146402304
    //   1255: iastore
    //   1256: dup
    //   1257: bipush #39
    //   1259: ldc 32768
    //   1261: iastore
    //   1262: dup
    //   1263: bipush #40
    //   1265: ldc -2146435072
    //   1267: iastore
    //   1268: dup
    //   1269: bipush #41
    //   1271: ldc -2147450880
    //   1273: iastore
    //   1274: dup
    //   1275: bipush #42
    //   1277: bipush #32
    //   1279: iastore
    //   1280: dup
    //   1281: bipush #43
    //   1283: ldc -2146402272
    //   1285: iastore
    //   1286: dup
    //   1287: bipush #44
    //   1289: ldc 1081376
    //   1291: iastore
    //   1292: dup
    //   1293: bipush #45
    //   1295: bipush #32
    //   1297: iastore
    //   1298: dup
    //   1299: bipush #46
    //   1301: ldc 32768
    //   1303: iastore
    //   1304: dup
    //   1305: bipush #47
    //   1307: ldc -2147483648
    //   1309: iastore
    //   1310: dup
    //   1311: bipush #48
    //   1313: ldc 32800
    //   1315: iastore
    //   1316: dup
    //   1317: bipush #49
    //   1319: ldc -2146402304
    //   1321: iastore
    //   1322: dup
    //   1323: bipush #50
    //   1325: ldc 1048576
    //   1327: iastore
    //   1328: dup
    //   1329: bipush #51
    //   1331: ldc -2147483616
    //   1333: iastore
    //   1334: dup
    //   1335: bipush #52
    //   1337: ldc 1048608
    //   1339: iastore
    //   1340: dup
    //   1341: bipush #53
    //   1343: ldc -2147450848
    //   1345: iastore
    //   1346: dup
    //   1347: bipush #54
    //   1349: ldc -2147483616
    //   1351: iastore
    //   1352: dup
    //   1353: bipush #55
    //   1355: ldc 1048608
    //   1357: iastore
    //   1358: dup
    //   1359: bipush #56
    //   1361: ldc 1081344
    //   1363: iastore
    //   1364: dup
    //   1365: bipush #57
    //   1367: iconst_0
    //   1368: iastore
    //   1369: dup
    //   1370: bipush #58
    //   1372: ldc -2147450880
    //   1374: iastore
    //   1375: dup
    //   1376: bipush #59
    //   1378: ldc 32800
    //   1380: iastore
    //   1381: dup
    //   1382: bipush #60
    //   1384: ldc -2147483648
    //   1386: iastore
    //   1387: dup
    //   1388: bipush #61
    //   1390: ldc -2146435040
    //   1392: iastore
    //   1393: dup
    //   1394: bipush #62
    //   1396: ldc -2146402272
    //   1398: iastore
    //   1399: dup
    //   1400: bipush #63
    //   1402: ldc 1081344
    //   1404: iastore
    //   1405: astore #9
    //   1407: bipush #64
    //   1409: newarray int
    //   1411: dup
    //   1412: iconst_0
    //   1413: sipush #520
    //   1416: iastore
    //   1417: dup
    //   1418: iconst_1
    //   1419: ldc 134349312
    //   1421: iastore
    //   1422: dup
    //   1423: iconst_2
    //   1424: iconst_0
    //   1425: iastore
    //   1426: dup
    //   1427: iconst_3
    //   1428: ldc 134348808
    //   1430: iastore
    //   1431: dup
    //   1432: iconst_4
    //   1433: ldc 134218240
    //   1435: iastore
    //   1436: dup
    //   1437: iconst_5
    //   1438: iconst_0
    //   1439: iastore
    //   1440: dup
    //   1441: bipush #6
    //   1443: ldc 131592
    //   1445: iastore
    //   1446: dup
    //   1447: bipush #7
    //   1449: ldc 134218240
    //   1451: iastore
    //   1452: dup
    //   1453: bipush #8
    //   1455: ldc 131080
    //   1457: iastore
    //   1458: dup
    //   1459: bipush #9
    //   1461: ldc 134217736
    //   1463: iastore
    //   1464: dup
    //   1465: bipush #10
    //   1467: ldc 134217736
    //   1469: iastore
    //   1470: dup
    //   1471: bipush #11
    //   1473: ldc 131072
    //   1475: iastore
    //   1476: dup
    //   1477: bipush #12
    //   1479: ldc 134349320
    //   1481: iastore
    //   1482: dup
    //   1483: bipush #13
    //   1485: ldc 131080
    //   1487: iastore
    //   1488: dup
    //   1489: bipush #14
    //   1491: ldc 134348800
    //   1493: iastore
    //   1494: dup
    //   1495: bipush #15
    //   1497: sipush #520
    //   1500: iastore
    //   1501: dup
    //   1502: bipush #16
    //   1504: ldc 134217728
    //   1506: iastore
    //   1507: dup
    //   1508: bipush #17
    //   1510: bipush #8
    //   1512: iastore
    //   1513: dup
    //   1514: bipush #18
    //   1516: ldc 134349312
    //   1518: iastore
    //   1519: dup
    //   1520: bipush #19
    //   1522: sipush #512
    //   1525: iastore
    //   1526: dup
    //   1527: bipush #20
    //   1529: ldc 131584
    //   1531: iastore
    //   1532: dup
    //   1533: bipush #21
    //   1535: ldc 134348800
    //   1537: iastore
    //   1538: dup
    //   1539: bipush #22
    //   1541: ldc 134348808
    //   1543: iastore
    //   1544: dup
    //   1545: bipush #23
    //   1547: ldc 131592
    //   1549: iastore
    //   1550: dup
    //   1551: bipush #24
    //   1553: ldc 134218248
    //   1555: iastore
    //   1556: dup
    //   1557: bipush #25
    //   1559: ldc 131584
    //   1561: iastore
    //   1562: dup
    //   1563: bipush #26
    //   1565: ldc 131072
    //   1567: iastore
    //   1568: dup
    //   1569: bipush #27
    //   1571: ldc 134218248
    //   1573: iastore
    //   1574: dup
    //   1575: bipush #28
    //   1577: bipush #8
    //   1579: iastore
    //   1580: dup
    //   1581: bipush #29
    //   1583: ldc 134349320
    //   1585: iastore
    //   1586: dup
    //   1587: bipush #30
    //   1589: sipush #512
    //   1592: iastore
    //   1593: dup
    //   1594: bipush #31
    //   1596: ldc 134217728
    //   1598: iastore
    //   1599: dup
    //   1600: bipush #32
    //   1602: ldc 134349312
    //   1604: iastore
    //   1605: dup
    //   1606: bipush #33
    //   1608: ldc 134217728
    //   1610: iastore
    //   1611: dup
    //   1612: bipush #34
    //   1614: ldc 131080
    //   1616: iastore
    //   1617: dup
    //   1618: bipush #35
    //   1620: sipush #520
    //   1623: iastore
    //   1624: dup
    //   1625: bipush #36
    //   1627: ldc 131072
    //   1629: iastore
    //   1630: dup
    //   1631: bipush #37
    //   1633: ldc 134349312
    //   1635: iastore
    //   1636: dup
    //   1637: bipush #38
    //   1639: ldc 134218240
    //   1641: iastore
    //   1642: dup
    //   1643: bipush #39
    //   1645: iconst_0
    //   1646: iastore
    //   1647: dup
    //   1648: bipush #40
    //   1650: sipush #512
    //   1653: iastore
    //   1654: dup
    //   1655: bipush #41
    //   1657: ldc 131080
    //   1659: iastore
    //   1660: dup
    //   1661: bipush #42
    //   1663: ldc 134349320
    //   1665: iastore
    //   1666: dup
    //   1667: bipush #43
    //   1669: ldc 134218240
    //   1671: iastore
    //   1672: dup
    //   1673: bipush #44
    //   1675: ldc 134217736
    //   1677: iastore
    //   1678: dup
    //   1679: bipush #45
    //   1681: sipush #512
    //   1684: iastore
    //   1685: dup
    //   1686: bipush #46
    //   1688: iconst_0
    //   1689: iastore
    //   1690: dup
    //   1691: bipush #47
    //   1693: ldc 134348808
    //   1695: iastore
    //   1696: dup
    //   1697: bipush #48
    //   1699: ldc 134218248
    //   1701: iastore
    //   1702: dup
    //   1703: bipush #49
    //   1705: ldc 131072
    //   1707: iastore
    //   1708: dup
    //   1709: bipush #50
    //   1711: ldc 134217728
    //   1713: iastore
    //   1714: dup
    //   1715: bipush #51
    //   1717: ldc 134349320
    //   1719: iastore
    //   1720: dup
    //   1721: bipush #52
    //   1723: bipush #8
    //   1725: iastore
    //   1726: dup
    //   1727: bipush #53
    //   1729: ldc 131592
    //   1731: iastore
    //   1732: dup
    //   1733: bipush #54
    //   1735: ldc 131584
    //   1737: iastore
    //   1738: dup
    //   1739: bipush #55
    //   1741: ldc 134217736
    //   1743: iastore
    //   1744: dup
    //   1745: bipush #56
    //   1747: ldc 134348800
    //   1749: iastore
    //   1750: dup
    //   1751: bipush #57
    //   1753: ldc 134218248
    //   1755: iastore
    //   1756: dup
    //   1757: bipush #58
    //   1759: sipush #520
    //   1762: iastore
    //   1763: dup
    //   1764: bipush #59
    //   1766: ldc 134348800
    //   1768: iastore
    //   1769: dup
    //   1770: bipush #60
    //   1772: ldc 131592
    //   1774: iastore
    //   1775: dup
    //   1776: bipush #61
    //   1778: bipush #8
    //   1780: iastore
    //   1781: dup
    //   1782: bipush #62
    //   1784: ldc 134348808
    //   1786: iastore
    //   1787: dup
    //   1788: bipush #63
    //   1790: ldc 131584
    //   1792: iastore
    //   1793: astore #10
    //   1795: bipush #64
    //   1797: newarray int
    //   1799: dup
    //   1800: iconst_0
    //   1801: ldc 8396801
    //   1803: iastore
    //   1804: dup
    //   1805: iconst_1
    //   1806: sipush #8321
    //   1809: iastore
    //   1810: dup
    //   1811: iconst_2
    //   1812: sipush #8321
    //   1815: iastore
    //   1816: dup
    //   1817: iconst_3
    //   1818: sipush #128
    //   1821: iastore
    //   1822: dup
    //   1823: iconst_4
    //   1824: ldc 8396928
    //   1826: iastore
    //   1827: dup
    //   1828: iconst_5
    //   1829: ldc 8388737
    //   1831: iastore
    //   1832: dup
    //   1833: bipush #6
    //   1835: ldc 8388609
    //   1837: iastore
    //   1838: dup
    //   1839: bipush #7
    //   1841: sipush #8193
    //   1844: iastore
    //   1845: dup
    //   1846: bipush #8
    //   1848: iconst_0
    //   1849: iastore
    //   1850: dup
    //   1851: bipush #9
    //   1853: ldc 8396800
    //   1855: iastore
    //   1856: dup
    //   1857: bipush #10
    //   1859: ldc 8396800
    //   1861: iastore
    //   1862: dup
    //   1863: bipush #11
    //   1865: ldc 8396929
    //   1867: iastore
    //   1868: dup
    //   1869: bipush #12
    //   1871: sipush #129
    //   1874: iastore
    //   1875: dup
    //   1876: bipush #13
    //   1878: iconst_0
    //   1879: iastore
    //   1880: dup
    //   1881: bipush #14
    //   1883: ldc 8388736
    //   1885: iastore
    //   1886: dup
    //   1887: bipush #15
    //   1889: ldc 8388609
    //   1891: iastore
    //   1892: dup
    //   1893: bipush #16
    //   1895: iconst_1
    //   1896: iastore
    //   1897: dup
    //   1898: bipush #17
    //   1900: sipush #8192
    //   1903: iastore
    //   1904: dup
    //   1905: bipush #18
    //   1907: ldc 8388608
    //   1909: iastore
    //   1910: dup
    //   1911: bipush #19
    //   1913: ldc 8396801
    //   1915: iastore
    //   1916: dup
    //   1917: bipush #20
    //   1919: sipush #128
    //   1922: iastore
    //   1923: dup
    //   1924: bipush #21
    //   1926: ldc 8388608
    //   1928: iastore
    //   1929: dup
    //   1930: bipush #22
    //   1932: sipush #8193
    //   1935: iastore
    //   1936: dup
    //   1937: bipush #23
    //   1939: sipush #8320
    //   1942: iastore
    //   1943: dup
    //   1944: bipush #24
    //   1946: ldc 8388737
    //   1948: iastore
    //   1949: dup
    //   1950: bipush #25
    //   1952: iconst_1
    //   1953: iastore
    //   1954: dup
    //   1955: bipush #26
    //   1957: sipush #8320
    //   1960: iastore
    //   1961: dup
    //   1962: bipush #27
    //   1964: ldc 8388736
    //   1966: iastore
    //   1967: dup
    //   1968: bipush #28
    //   1970: sipush #8192
    //   1973: iastore
    //   1974: dup
    //   1975: bipush #29
    //   1977: ldc 8396928
    //   1979: iastore
    //   1980: dup
    //   1981: bipush #30
    //   1983: ldc 8396929
    //   1985: iastore
    //   1986: dup
    //   1987: bipush #31
    //   1989: sipush #129
    //   1992: iastore
    //   1993: dup
    //   1994: bipush #32
    //   1996: ldc 8388736
    //   1998: iastore
    //   1999: dup
    //   2000: bipush #33
    //   2002: ldc 8388609
    //   2004: iastore
    //   2005: dup
    //   2006: bipush #34
    //   2008: ldc 8396800
    //   2010: iastore
    //   2011: dup
    //   2012: bipush #35
    //   2014: ldc 8396929
    //   2016: iastore
    //   2017: dup
    //   2018: bipush #36
    //   2020: sipush #129
    //   2023: iastore
    //   2024: dup
    //   2025: bipush #37
    //   2027: iconst_0
    //   2028: iastore
    //   2029: dup
    //   2030: bipush #38
    //   2032: iconst_0
    //   2033: iastore
    //   2034: dup
    //   2035: bipush #39
    //   2037: ldc 8396800
    //   2039: iastore
    //   2040: dup
    //   2041: bipush #40
    //   2043: sipush #8320
    //   2046: iastore
    //   2047: dup
    //   2048: bipush #41
    //   2050: ldc 8388736
    //   2052: iastore
    //   2053: dup
    //   2054: bipush #42
    //   2056: ldc 8388737
    //   2058: iastore
    //   2059: dup
    //   2060: bipush #43
    //   2062: iconst_1
    //   2063: iastore
    //   2064: dup
    //   2065: bipush #44
    //   2067: ldc 8396801
    //   2069: iastore
    //   2070: dup
    //   2071: bipush #45
    //   2073: sipush #8321
    //   2076: iastore
    //   2077: dup
    //   2078: bipush #46
    //   2080: sipush #8321
    //   2083: iastore
    //   2084: dup
    //   2085: bipush #47
    //   2087: sipush #128
    //   2090: iastore
    //   2091: dup
    //   2092: bipush #48
    //   2094: ldc 8396929
    //   2096: iastore
    //   2097: dup
    //   2098: bipush #49
    //   2100: sipush #129
    //   2103: iastore
    //   2104: dup
    //   2105: bipush #50
    //   2107: iconst_1
    //   2108: iastore
    //   2109: dup
    //   2110: bipush #51
    //   2112: sipush #8192
    //   2115: iastore
    //   2116: dup
    //   2117: bipush #52
    //   2119: ldc 8388609
    //   2121: iastore
    //   2122: dup
    //   2123: bipush #53
    //   2125: sipush #8193
    //   2128: iastore
    //   2129: dup
    //   2130: bipush #54
    //   2132: ldc 8396928
    //   2134: iastore
    //   2135: dup
    //   2136: bipush #55
    //   2138: ldc 8388737
    //   2140: iastore
    //   2141: dup
    //   2142: bipush #56
    //   2144: sipush #8193
    //   2147: iastore
    //   2148: dup
    //   2149: bipush #57
    //   2151: sipush #8320
    //   2154: iastore
    //   2155: dup
    //   2156: bipush #58
    //   2158: ldc 8388608
    //   2160: iastore
    //   2161: dup
    //   2162: bipush #59
    //   2164: ldc 8396801
    //   2166: iastore
    //   2167: dup
    //   2168: bipush #60
    //   2170: sipush #128
    //   2173: iastore
    //   2174: dup
    //   2175: bipush #61
    //   2177: ldc 8388608
    //   2179: iastore
    //   2180: dup
    //   2181: bipush #62
    //   2183: sipush #8192
    //   2186: iastore
    //   2187: dup
    //   2188: bipush #63
    //   2190: ldc 8396928
    //   2192: iastore
    //   2193: astore #11
    //   2195: bipush #64
    //   2197: newarray int
    //   2199: dup
    //   2200: iconst_0
    //   2201: sipush #256
    //   2204: iastore
    //   2205: dup
    //   2206: iconst_1
    //   2207: ldc 34078976
    //   2209: iastore
    //   2210: dup
    //   2211: iconst_2
    //   2212: ldc 34078720
    //   2214: iastore
    //   2215: dup
    //   2216: iconst_3
    //   2217: ldc 1107296512
    //   2219: iastore
    //   2220: dup
    //   2221: iconst_4
    //   2222: ldc 524288
    //   2224: iastore
    //   2225: dup
    //   2226: iconst_5
    //   2227: sipush #256
    //   2230: iastore
    //   2231: dup
    //   2232: bipush #6
    //   2234: ldc 1073741824
    //   2236: iastore
    //   2237: dup
    //   2238: bipush #7
    //   2240: ldc 34078720
    //   2242: iastore
    //   2243: dup
    //   2244: bipush #8
    //   2246: ldc 1074266368
    //   2248: iastore
    //   2249: dup
    //   2250: bipush #9
    //   2252: ldc 524288
    //   2254: iastore
    //   2255: dup
    //   2256: bipush #10
    //   2258: ldc 33554688
    //   2260: iastore
    //   2261: dup
    //   2262: bipush #11
    //   2264: ldc 1074266368
    //   2266: iastore
    //   2267: dup
    //   2268: bipush #12
    //   2270: ldc 1107296512
    //   2272: iastore
    //   2273: dup
    //   2274: bipush #13
    //   2276: ldc 1107820544
    //   2278: iastore
    //   2279: dup
    //   2280: bipush #14
    //   2282: ldc 524544
    //   2284: iastore
    //   2285: dup
    //   2286: bipush #15
    //   2288: ldc 1073741824
    //   2290: iastore
    //   2291: dup
    //   2292: bipush #16
    //   2294: ldc 33554432
    //   2296: iastore
    //   2297: dup
    //   2298: bipush #17
    //   2300: ldc 1074266112
    //   2302: iastore
    //   2303: dup
    //   2304: bipush #18
    //   2306: ldc 1074266112
    //   2308: iastore
    //   2309: dup
    //   2310: bipush #19
    //   2312: iconst_0
    //   2313: iastore
    //   2314: dup
    //   2315: bipush #20
    //   2317: ldc 1073742080
    //   2319: iastore
    //   2320: dup
    //   2321: bipush #21
    //   2323: ldc 1107820800
    //   2325: iastore
    //   2326: dup
    //   2327: bipush #22
    //   2329: ldc 1107820800
    //   2331: iastore
    //   2332: dup
    //   2333: bipush #23
    //   2335: ldc 33554688
    //   2337: iastore
    //   2338: dup
    //   2339: bipush #24
    //   2341: ldc 1107820544
    //   2343: iastore
    //   2344: dup
    //   2345: bipush #25
    //   2347: ldc 1073742080
    //   2349: iastore
    //   2350: dup
    //   2351: bipush #26
    //   2353: iconst_0
    //   2354: iastore
    //   2355: dup
    //   2356: bipush #27
    //   2358: ldc 1107296256
    //   2360: iastore
    //   2361: dup
    //   2362: bipush #28
    //   2364: ldc 34078976
    //   2366: iastore
    //   2367: dup
    //   2368: bipush #29
    //   2370: ldc 33554432
    //   2372: iastore
    //   2373: dup
    //   2374: bipush #30
    //   2376: ldc 1107296256
    //   2378: iastore
    //   2379: dup
    //   2380: bipush #31
    //   2382: ldc 524544
    //   2384: iastore
    //   2385: dup
    //   2386: bipush #32
    //   2388: ldc 524288
    //   2390: iastore
    //   2391: dup
    //   2392: bipush #33
    //   2394: ldc 1107296512
    //   2396: iastore
    //   2397: dup
    //   2398: bipush #34
    //   2400: sipush #256
    //   2403: iastore
    //   2404: dup
    //   2405: bipush #35
    //   2407: ldc 33554432
    //   2409: iastore
    //   2410: dup
    //   2411: bipush #36
    //   2413: ldc 1073741824
    //   2415: iastore
    //   2416: dup
    //   2417: bipush #37
    //   2419: ldc 34078720
    //   2421: iastore
    //   2422: dup
    //   2423: bipush #38
    //   2425: ldc 1107296512
    //   2427: iastore
    //   2428: dup
    //   2429: bipush #39
    //   2431: ldc 1074266368
    //   2433: iastore
    //   2434: dup
    //   2435: bipush #40
    //   2437: ldc 33554688
    //   2439: iastore
    //   2440: dup
    //   2441: bipush #41
    //   2443: ldc 1073741824
    //   2445: iastore
    //   2446: dup
    //   2447: bipush #42
    //   2449: ldc 1107820544
    //   2451: iastore
    //   2452: dup
    //   2453: bipush #43
    //   2455: ldc 34078976
    //   2457: iastore
    //   2458: dup
    //   2459: bipush #44
    //   2461: ldc 1074266368
    //   2463: iastore
    //   2464: dup
    //   2465: bipush #45
    //   2467: sipush #256
    //   2470: iastore
    //   2471: dup
    //   2472: bipush #46
    //   2474: ldc 33554432
    //   2476: iastore
    //   2477: dup
    //   2478: bipush #47
    //   2480: ldc 1107820544
    //   2482: iastore
    //   2483: dup
    //   2484: bipush #48
    //   2486: ldc 1107820800
    //   2488: iastore
    //   2489: dup
    //   2490: bipush #49
    //   2492: ldc 524544
    //   2494: iastore
    //   2495: dup
    //   2496: bipush #50
    //   2498: ldc 1107296256
    //   2500: iastore
    //   2501: dup
    //   2502: bipush #51
    //   2504: ldc 1107820800
    //   2506: iastore
    //   2507: dup
    //   2508: bipush #52
    //   2510: ldc 34078720
    //   2512: iastore
    //   2513: dup
    //   2514: bipush #53
    //   2516: iconst_0
    //   2517: iastore
    //   2518: dup
    //   2519: bipush #54
    //   2521: ldc 1074266112
    //   2523: iastore
    //   2524: dup
    //   2525: bipush #55
    //   2527: ldc 1107296256
    //   2529: iastore
    //   2530: dup
    //   2531: bipush #56
    //   2533: ldc 524544
    //   2535: iastore
    //   2536: dup
    //   2537: bipush #57
    //   2539: ldc 33554688
    //   2541: iastore
    //   2542: dup
    //   2543: bipush #58
    //   2545: ldc 1073742080
    //   2547: iastore
    //   2548: dup
    //   2549: bipush #59
    //   2551: ldc 524288
    //   2553: iastore
    //   2554: dup
    //   2555: bipush #60
    //   2557: iconst_0
    //   2558: iastore
    //   2559: dup
    //   2560: bipush #61
    //   2562: ldc 1074266112
    //   2564: iastore
    //   2565: dup
    //   2566: bipush #62
    //   2568: ldc 34078976
    //   2570: iastore
    //   2571: dup
    //   2572: bipush #63
    //   2574: ldc 1073742080
    //   2576: iastore
    //   2577: astore #12
    //   2579: bipush #64
    //   2581: newarray int
    //   2583: dup
    //   2584: iconst_0
    //   2585: ldc 536870928
    //   2587: iastore
    //   2588: dup
    //   2589: iconst_1
    //   2590: ldc 541065216
    //   2592: iastore
    //   2593: dup
    //   2594: iconst_2
    //   2595: sipush #16384
    //   2598: iastore
    //   2599: dup
    //   2600: iconst_3
    //   2601: ldc 541081616
    //   2603: iastore
    //   2604: dup
    //   2605: iconst_4
    //   2606: ldc 541065216
    //   2608: iastore
    //   2609: dup
    //   2610: iconst_5
    //   2611: bipush #16
    //   2613: iastore
    //   2614: dup
    //   2615: bipush #6
    //   2617: ldc 541081616
    //   2619: iastore
    //   2620: dup
    //   2621: bipush #7
    //   2623: ldc 4194304
    //   2625: iastore
    //   2626: dup
    //   2627: bipush #8
    //   2629: ldc 536887296
    //   2631: iastore
    //   2632: dup
    //   2633: bipush #9
    //   2635: ldc 4210704
    //   2637: iastore
    //   2638: dup
    //   2639: bipush #10
    //   2641: ldc 4194304
    //   2643: iastore
    //   2644: dup
    //   2645: bipush #11
    //   2647: ldc 536870928
    //   2649: iastore
    //   2650: dup
    //   2651: bipush #12
    //   2653: ldc 4194320
    //   2655: iastore
    //   2656: dup
    //   2657: bipush #13
    //   2659: ldc 536887296
    //   2661: iastore
    //   2662: dup
    //   2663: bipush #14
    //   2665: ldc 536870912
    //   2667: iastore
    //   2668: dup
    //   2669: bipush #15
    //   2671: sipush #16400
    //   2674: iastore
    //   2675: dup
    //   2676: bipush #16
    //   2678: iconst_0
    //   2679: iastore
    //   2680: dup
    //   2681: bipush #17
    //   2683: ldc 4194320
    //   2685: iastore
    //   2686: dup
    //   2687: bipush #18
    //   2689: ldc 536887312
    //   2691: iastore
    //   2692: dup
    //   2693: bipush #19
    //   2695: sipush #16384
    //   2698: iastore
    //   2699: dup
    //   2700: bipush #20
    //   2702: ldc 4210688
    //   2704: iastore
    //   2705: dup
    //   2706: bipush #21
    //   2708: ldc 536887312
    //   2710: iastore
    //   2711: dup
    //   2712: bipush #22
    //   2714: bipush #16
    //   2716: iastore
    //   2717: dup
    //   2718: bipush #23
    //   2720: ldc 541065232
    //   2722: iastore
    //   2723: dup
    //   2724: bipush #24
    //   2726: ldc 541065232
    //   2728: iastore
    //   2729: dup
    //   2730: bipush #25
    //   2732: iconst_0
    //   2733: iastore
    //   2734: dup
    //   2735: bipush #26
    //   2737: ldc 4210704
    //   2739: iastore
    //   2740: dup
    //   2741: bipush #27
    //   2743: ldc 541081600
    //   2745: iastore
    //   2746: dup
    //   2747: bipush #28
    //   2749: sipush #16400
    //   2752: iastore
    //   2753: dup
    //   2754: bipush #29
    //   2756: ldc 4210688
    //   2758: iastore
    //   2759: dup
    //   2760: bipush #30
    //   2762: ldc 541081600
    //   2764: iastore
    //   2765: dup
    //   2766: bipush #31
    //   2768: ldc 536870912
    //   2770: iastore
    //   2771: dup
    //   2772: bipush #32
    //   2774: ldc 536887296
    //   2776: iastore
    //   2777: dup
    //   2778: bipush #33
    //   2780: bipush #16
    //   2782: iastore
    //   2783: dup
    //   2784: bipush #34
    //   2786: ldc 541065232
    //   2788: iastore
    //   2789: dup
    //   2790: bipush #35
    //   2792: ldc 4210688
    //   2794: iastore
    //   2795: dup
    //   2796: bipush #36
    //   2798: ldc 541081616
    //   2800: iastore
    //   2801: dup
    //   2802: bipush #37
    //   2804: ldc 4194304
    //   2806: iastore
    //   2807: dup
    //   2808: bipush #38
    //   2810: sipush #16400
    //   2813: iastore
    //   2814: dup
    //   2815: bipush #39
    //   2817: ldc 536870928
    //   2819: iastore
    //   2820: dup
    //   2821: bipush #40
    //   2823: ldc 4194304
    //   2825: iastore
    //   2826: dup
    //   2827: bipush #41
    //   2829: ldc 536887296
    //   2831: iastore
    //   2832: dup
    //   2833: bipush #42
    //   2835: ldc 536870912
    //   2837: iastore
    //   2838: dup
    //   2839: bipush #43
    //   2841: sipush #16400
    //   2844: iastore
    //   2845: dup
    //   2846: bipush #44
    //   2848: ldc 536870928
    //   2850: iastore
    //   2851: dup
    //   2852: bipush #45
    //   2854: ldc 541081616
    //   2856: iastore
    //   2857: dup
    //   2858: bipush #46
    //   2860: ldc 4210688
    //   2862: iastore
    //   2863: dup
    //   2864: bipush #47
    //   2866: ldc 541065216
    //   2868: iastore
    //   2869: dup
    //   2870: bipush #48
    //   2872: ldc 4210704
    //   2874: iastore
    //   2875: dup
    //   2876: bipush #49
    //   2878: ldc 541081600
    //   2880: iastore
    //   2881: dup
    //   2882: bipush #50
    //   2884: iconst_0
    //   2885: iastore
    //   2886: dup
    //   2887: bipush #51
    //   2889: ldc 541065232
    //   2891: iastore
    //   2892: dup
    //   2893: bipush #52
    //   2895: bipush #16
    //   2897: iastore
    //   2898: dup
    //   2899: bipush #53
    //   2901: sipush #16384
    //   2904: iastore
    //   2905: dup
    //   2906: bipush #54
    //   2908: ldc 541065216
    //   2910: iastore
    //   2911: dup
    //   2912: bipush #55
    //   2914: ldc 4210704
    //   2916: iastore
    //   2917: dup
    //   2918: bipush #56
    //   2920: sipush #16384
    //   2923: iastore
    //   2924: dup
    //   2925: bipush #57
    //   2927: ldc 4194320
    //   2929: iastore
    //   2930: dup
    //   2931: bipush #58
    //   2933: ldc 536887312
    //   2935: iastore
    //   2936: dup
    //   2937: bipush #59
    //   2939: iconst_0
    //   2940: iastore
    //   2941: dup
    //   2942: bipush #60
    //   2944: ldc 541081600
    //   2946: iastore
    //   2947: dup
    //   2948: bipush #61
    //   2950: ldc 536870912
    //   2952: iastore
    //   2953: dup
    //   2954: bipush #62
    //   2956: ldc 4194320
    //   2958: iastore
    //   2959: dup
    //   2960: bipush #63
    //   2962: ldc 536887312
    //   2964: iastore
    //   2965: astore #13
    //   2967: bipush #64
    //   2969: newarray int
    //   2971: dup
    //   2972: iconst_0
    //   2973: ldc 2097152
    //   2975: iastore
    //   2976: dup
    //   2977: iconst_1
    //   2978: ldc 69206018
    //   2980: iastore
    //   2981: dup
    //   2982: iconst_2
    //   2983: ldc 67110914
    //   2985: iastore
    //   2986: dup
    //   2987: iconst_3
    //   2988: iconst_0
    //   2989: iastore
    //   2990: dup
    //   2991: iconst_4
    //   2992: sipush #2048
    //   2995: iastore
    //   2996: dup
    //   2997: iconst_5
    //   2998: ldc 67110914
    //   3000: iastore
    //   3001: dup
    //   3002: bipush #6
    //   3004: ldc 2099202
    //   3006: iastore
    //   3007: dup
    //   3008: bipush #7
    //   3010: ldc 69208064
    //   3012: iastore
    //   3013: dup
    //   3014: bipush #8
    //   3016: ldc 69208066
    //   3018: iastore
    //   3019: dup
    //   3020: bipush #9
    //   3022: ldc 2097152
    //   3024: iastore
    //   3025: dup
    //   3026: bipush #10
    //   3028: iconst_0
    //   3029: iastore
    //   3030: dup
    //   3031: bipush #11
    //   3033: ldc 67108866
    //   3035: iastore
    //   3036: dup
    //   3037: bipush #12
    //   3039: iconst_2
    //   3040: iastore
    //   3041: dup
    //   3042: bipush #13
    //   3044: ldc 67108864
    //   3046: iastore
    //   3047: dup
    //   3048: bipush #14
    //   3050: ldc 69206018
    //   3052: iastore
    //   3053: dup
    //   3054: bipush #15
    //   3056: sipush #2050
    //   3059: iastore
    //   3060: dup
    //   3061: bipush #16
    //   3063: ldc 67110912
    //   3065: iastore
    //   3066: dup
    //   3067: bipush #17
    //   3069: ldc 2099202
    //   3071: iastore
    //   3072: dup
    //   3073: bipush #18
    //   3075: ldc 2097154
    //   3077: iastore
    //   3078: dup
    //   3079: bipush #19
    //   3081: ldc 67110912
    //   3083: iastore
    //   3084: dup
    //   3085: bipush #20
    //   3087: ldc 67108866
    //   3089: iastore
    //   3090: dup
    //   3091: bipush #21
    //   3093: ldc 69206016
    //   3095: iastore
    //   3096: dup
    //   3097: bipush #22
    //   3099: ldc 69208064
    //   3101: iastore
    //   3102: dup
    //   3103: bipush #23
    //   3105: ldc 2097154
    //   3107: iastore
    //   3108: dup
    //   3109: bipush #24
    //   3111: ldc 69206016
    //   3113: iastore
    //   3114: dup
    //   3115: bipush #25
    //   3117: sipush #2048
    //   3120: iastore
    //   3121: dup
    //   3122: bipush #26
    //   3124: sipush #2050
    //   3127: iastore
    //   3128: dup
    //   3129: bipush #27
    //   3131: ldc 69208066
    //   3133: iastore
    //   3134: dup
    //   3135: bipush #28
    //   3137: ldc 2099200
    //   3139: iastore
    //   3140: dup
    //   3141: bipush #29
    //   3143: iconst_2
    //   3144: iastore
    //   3145: dup
    //   3146: bipush #30
    //   3148: ldc 67108864
    //   3150: iastore
    //   3151: dup
    //   3152: bipush #31
    //   3154: ldc 2099200
    //   3156: iastore
    //   3157: dup
    //   3158: bipush #32
    //   3160: ldc 67108864
    //   3162: iastore
    //   3163: dup
    //   3164: bipush #33
    //   3166: ldc 2099200
    //   3168: iastore
    //   3169: dup
    //   3170: bipush #34
    //   3172: ldc 2097152
    //   3174: iastore
    //   3175: dup
    //   3176: bipush #35
    //   3178: ldc 67110914
    //   3180: iastore
    //   3181: dup
    //   3182: bipush #36
    //   3184: ldc 67110914
    //   3186: iastore
    //   3187: dup
    //   3188: bipush #37
    //   3190: ldc 69206018
    //   3192: iastore
    //   3193: dup
    //   3194: bipush #38
    //   3196: ldc 69206018
    //   3198: iastore
    //   3199: dup
    //   3200: bipush #39
    //   3202: iconst_2
    //   3203: iastore
    //   3204: dup
    //   3205: bipush #40
    //   3207: ldc 2097154
    //   3209: iastore
    //   3210: dup
    //   3211: bipush #41
    //   3213: ldc 67108864
    //   3215: iastore
    //   3216: dup
    //   3217: bipush #42
    //   3219: ldc 67110912
    //   3221: iastore
    //   3222: dup
    //   3223: bipush #43
    //   3225: ldc 2097152
    //   3227: iastore
    //   3228: dup
    //   3229: bipush #44
    //   3231: ldc 69208064
    //   3233: iastore
    //   3234: dup
    //   3235: bipush #45
    //   3237: sipush #2050
    //   3240: iastore
    //   3241: dup
    //   3242: bipush #46
    //   3244: ldc 2099202
    //   3246: iastore
    //   3247: dup
    //   3248: bipush #47
    //   3250: ldc 69208064
    //   3252: iastore
    //   3253: dup
    //   3254: bipush #48
    //   3256: sipush #2050
    //   3259: iastore
    //   3260: dup
    //   3261: bipush #49
    //   3263: ldc 67108866
    //   3265: iastore
    //   3266: dup
    //   3267: bipush #50
    //   3269: ldc 69208066
    //   3271: iastore
    //   3272: dup
    //   3273: bipush #51
    //   3275: ldc 69206016
    //   3277: iastore
    //   3278: dup
    //   3279: bipush #52
    //   3281: ldc 2099200
    //   3283: iastore
    //   3284: dup
    //   3285: bipush #53
    //   3287: iconst_0
    //   3288: iastore
    //   3289: dup
    //   3290: bipush #54
    //   3292: iconst_2
    //   3293: iastore
    //   3294: dup
    //   3295: bipush #55
    //   3297: ldc 69208066
    //   3299: iastore
    //   3300: dup
    //   3301: bipush #56
    //   3303: iconst_0
    //   3304: iastore
    //   3305: dup
    //   3306: bipush #57
    //   3308: ldc 2099202
    //   3310: iastore
    //   3311: dup
    //   3312: bipush #58
    //   3314: ldc 69206016
    //   3316: iastore
    //   3317: dup
    //   3318: bipush #59
    //   3320: sipush #2048
    //   3323: iastore
    //   3324: dup
    //   3325: bipush #60
    //   3327: ldc 67108866
    //   3329: iastore
    //   3330: dup
    //   3331: bipush #61
    //   3333: ldc 67110912
    //   3335: iastore
    //   3336: dup
    //   3337: bipush #62
    //   3339: sipush #2048
    //   3342: iastore
    //   3343: dup
    //   3344: bipush #63
    //   3346: ldc 2097154
    //   3348: iastore
    //   3349: astore #14
    //   3351: bipush #64
    //   3353: newarray int
    //   3355: dup
    //   3356: iconst_0
    //   3357: ldc 268439616
    //   3359: iastore
    //   3360: dup
    //   3361: iconst_1
    //   3362: sipush #4096
    //   3365: iastore
    //   3366: dup
    //   3367: iconst_2
    //   3368: ldc 262144
    //   3370: iastore
    //   3371: dup
    //   3372: iconst_3
    //   3373: ldc 268701760
    //   3375: iastore
    //   3376: dup
    //   3377: iconst_4
    //   3378: ldc 268435456
    //   3380: iastore
    //   3381: dup
    //   3382: iconst_5
    //   3383: ldc 268439616
    //   3385: iastore
    //   3386: dup
    //   3387: bipush #6
    //   3389: bipush #64
    //   3391: iastore
    //   3392: dup
    //   3393: bipush #7
    //   3395: ldc 268435456
    //   3397: iastore
    //   3398: dup
    //   3399: bipush #8
    //   3401: ldc 262208
    //   3403: iastore
    //   3404: dup
    //   3405: bipush #9
    //   3407: ldc 268697600
    //   3409: iastore
    //   3410: dup
    //   3411: bipush #10
    //   3413: ldc 268701760
    //   3415: iastore
    //   3416: dup
    //   3417: bipush #11
    //   3419: ldc 266240
    //   3421: iastore
    //   3422: dup
    //   3423: bipush #12
    //   3425: ldc 268701696
    //   3427: iastore
    //   3428: dup
    //   3429: bipush #13
    //   3431: ldc 266304
    //   3433: iastore
    //   3434: dup
    //   3435: bipush #14
    //   3437: sipush #4096
    //   3440: iastore
    //   3441: dup
    //   3442: bipush #15
    //   3444: bipush #64
    //   3446: iastore
    //   3447: dup
    //   3448: bipush #16
    //   3450: ldc 268697600
    //   3452: iastore
    //   3453: dup
    //   3454: bipush #17
    //   3456: ldc 268435520
    //   3458: iastore
    //   3459: dup
    //   3460: bipush #18
    //   3462: ldc 268439552
    //   3464: iastore
    //   3465: dup
    //   3466: bipush #19
    //   3468: sipush #4160
    //   3471: iastore
    //   3472: dup
    //   3473: bipush #20
    //   3475: ldc 266240
    //   3477: iastore
    //   3478: dup
    //   3479: bipush #21
    //   3481: ldc 262208
    //   3483: iastore
    //   3484: dup
    //   3485: bipush #22
    //   3487: ldc 268697664
    //   3489: iastore
    //   3490: dup
    //   3491: bipush #23
    //   3493: ldc 268701696
    //   3495: iastore
    //   3496: dup
    //   3497: bipush #24
    //   3499: sipush #4160
    //   3502: iastore
    //   3503: dup
    //   3504: bipush #25
    //   3506: iconst_0
    //   3507: iastore
    //   3508: dup
    //   3509: bipush #26
    //   3511: iconst_0
    //   3512: iastore
    //   3513: dup
    //   3514: bipush #27
    //   3516: ldc 268697664
    //   3518: iastore
    //   3519: dup
    //   3520: bipush #28
    //   3522: ldc 268435520
    //   3524: iastore
    //   3525: dup
    //   3526: bipush #29
    //   3528: ldc 268439552
    //   3530: iastore
    //   3531: dup
    //   3532: bipush #30
    //   3534: ldc 266304
    //   3536: iastore
    //   3537: dup
    //   3538: bipush #31
    //   3540: ldc 262144
    //   3542: iastore
    //   3543: dup
    //   3544: bipush #32
    //   3546: ldc 266304
    //   3548: iastore
    //   3549: dup
    //   3550: bipush #33
    //   3552: ldc 262144
    //   3554: iastore
    //   3555: dup
    //   3556: bipush #34
    //   3558: ldc 268701696
    //   3560: iastore
    //   3561: dup
    //   3562: bipush #35
    //   3564: sipush #4096
    //   3567: iastore
    //   3568: dup
    //   3569: bipush #36
    //   3571: bipush #64
    //   3573: iastore
    //   3574: dup
    //   3575: bipush #37
    //   3577: ldc 268697664
    //   3579: iastore
    //   3580: dup
    //   3581: bipush #38
    //   3583: sipush #4096
    //   3586: iastore
    //   3587: dup
    //   3588: bipush #39
    //   3590: ldc 266304
    //   3592: iastore
    //   3593: dup
    //   3594: bipush #40
    //   3596: ldc 268439552
    //   3598: iastore
    //   3599: dup
    //   3600: bipush #41
    //   3602: bipush #64
    //   3604: iastore
    //   3605: dup
    //   3606: bipush #42
    //   3608: ldc 268435520
    //   3610: iastore
    //   3611: dup
    //   3612: bipush #43
    //   3614: ldc 268697600
    //   3616: iastore
    //   3617: dup
    //   3618: bipush #44
    //   3620: ldc 268697664
    //   3622: iastore
    //   3623: dup
    //   3624: bipush #45
    //   3626: ldc 268435456
    //   3628: iastore
    //   3629: dup
    //   3630: bipush #46
    //   3632: ldc 262144
    //   3634: iastore
    //   3635: dup
    //   3636: bipush #47
    //   3638: ldc 268439616
    //   3640: iastore
    //   3641: dup
    //   3642: bipush #48
    //   3644: iconst_0
    //   3645: iastore
    //   3646: dup
    //   3647: bipush #49
    //   3649: ldc 268701760
    //   3651: iastore
    //   3652: dup
    //   3653: bipush #50
    //   3655: ldc 262208
    //   3657: iastore
    //   3658: dup
    //   3659: bipush #51
    //   3661: ldc 268435520
    //   3663: iastore
    //   3664: dup
    //   3665: bipush #52
    //   3667: ldc 268697600
    //   3669: iastore
    //   3670: dup
    //   3671: bipush #53
    //   3673: ldc 268439552
    //   3675: iastore
    //   3676: dup
    //   3677: bipush #54
    //   3679: ldc 268439616
    //   3681: iastore
    //   3682: dup
    //   3683: bipush #55
    //   3685: iconst_0
    //   3686: iastore
    //   3687: dup
    //   3688: bipush #56
    //   3690: ldc 268701760
    //   3692: iastore
    //   3693: dup
    //   3694: bipush #57
    //   3696: ldc 266240
    //   3698: iastore
    //   3699: dup
    //   3700: bipush #58
    //   3702: ldc 266240
    //   3704: iastore
    //   3705: dup
    //   3706: bipush #59
    //   3708: sipush #4160
    //   3711: iastore
    //   3712: dup
    //   3713: bipush #60
    //   3715: sipush #4160
    //   3718: iastore
    //   3719: dup
    //   3720: bipush #61
    //   3722: ldc 262208
    //   3724: iastore
    //   3725: dup
    //   3726: bipush #62
    //   3728: ldc 268435456
    //   3730: iastore
    //   3731: dup
    //   3732: bipush #63
    //   3734: ldc 268701696
    //   3736: iastore
    //   3737: astore #15
    //   3739: aload_3
    //   3740: arraylength
    //   3741: istore #16
    //   3743: iconst_2
    //   3744: newarray int
    //   3746: astore #17
    //   3748: iload #16
    //   3750: newarray byte
    //   3752: astore #4
    //   3754: iload #16
    //   3756: bipush #8
    //   3758: idiv
    //   3759: istore #18
    //   3761: iconst_0
    //   3762: istore #19
    //   3764: iload #19
    //   3766: iload #18
    //   3768: if_icmpge -> 4682
    //   3771: iload #19
    //   3773: bipush #8
    //   3775: imul
    //   3776: istore #20
    //   3778: iconst_0
    //   3779: istore #21
    //   3781: iload #21
    //   3783: iconst_2
    //   3784: if_icmpge -> 3869
    //   3787: aload #17
    //   3789: iload #21
    //   3791: aload_3
    //   3792: iload #20
    //   3794: iload #21
    //   3796: iconst_4
    //   3797: imul
    //   3798: iadd
    //   3799: baload
    //   3800: sipush #255
    //   3803: iand
    //   3804: bipush #24
    //   3806: ishl
    //   3807: aload_3
    //   3808: iload #20
    //   3810: iload #21
    //   3812: iconst_4
    //   3813: imul
    //   3814: iadd
    //   3815: iconst_1
    //   3816: iadd
    //   3817: baload
    //   3818: sipush #255
    //   3821: iand
    //   3822: bipush #16
    //   3824: ishl
    //   3825: ior
    //   3826: aload_3
    //   3827: iload #20
    //   3829: iload #21
    //   3831: iconst_4
    //   3832: imul
    //   3833: iadd
    //   3834: iconst_2
    //   3835: iadd
    //   3836: baload
    //   3837: sipush #255
    //   3840: iand
    //   3841: bipush #8
    //   3843: ishl
    //   3844: ior
    //   3845: aload_3
    //   3846: iload #20
    //   3848: iload #21
    //   3850: iconst_4
    //   3851: imul
    //   3852: iadd
    //   3853: iconst_3
    //   3854: iadd
    //   3855: baload
    //   3856: sipush #255
    //   3859: iand
    //   3860: ior
    //   3861: iastore
    //   3862: iinc #21, 1
    //   3865: iload_2
    //   3866: ifeq -> 3781
    //   3869: iconst_0
    //   3870: istore #26
    //   3872: aload #17
    //   3874: iconst_0
    //   3875: iaload
    //   3876: istore #24
    //   3878: aload #17
    //   3880: iconst_1
    //   3881: iaload
    //   3882: istore #23
    //   3884: iload #24
    //   3886: iconst_4
    //   3887: iushr
    //   3888: iload #23
    //   3890: ixor
    //   3891: ldc 252645135
    //   3893: iand
    //   3894: istore #22
    //   3896: iload #23
    //   3898: iload #22
    //   3900: ixor
    //   3901: istore #23
    //   3903: iload #24
    //   3905: iload #22
    //   3907: iconst_4
    //   3908: ishl
    //   3909: ixor
    //   3910: istore #24
    //   3912: iload #24
    //   3914: bipush #16
    //   3916: iushr
    //   3917: iload #23
    //   3919: ixor
    //   3920: ldc 65535
    //   3922: iand
    //   3923: istore #22
    //   3925: iload #23
    //   3927: iload #22
    //   3929: ixor
    //   3930: istore #23
    //   3932: iload #24
    //   3934: iload #22
    //   3936: bipush #16
    //   3938: ishl
    //   3939: ixor
    //   3940: istore #24
    //   3942: iload #23
    //   3944: iconst_2
    //   3945: iushr
    //   3946: iload #24
    //   3948: ixor
    //   3949: ldc 858993459
    //   3951: iand
    //   3952: istore #22
    //   3954: iload #24
    //   3956: iload #22
    //   3958: ixor
    //   3959: istore #24
    //   3961: iload #23
    //   3963: iload #22
    //   3965: iconst_2
    //   3966: ishl
    //   3967: ixor
    //   3968: istore #23
    //   3970: iload #23
    //   3972: bipush #8
    //   3974: iushr
    //   3975: iload #24
    //   3977: ixor
    //   3978: ldc 16711935
    //   3980: iand
    //   3981: istore #22
    //   3983: iload #24
    //   3985: iload #22
    //   3987: ixor
    //   3988: istore #24
    //   3990: iload #23
    //   3992: iload #22
    //   3994: bipush #8
    //   3996: ishl
    //   3997: ixor
    //   3998: istore #23
    //   4000: iload #23
    //   4002: iconst_1
    //   4003: ishl
    //   4004: iload #23
    //   4006: bipush #31
    //   4008: iushr
    //   4009: iconst_1
    //   4010: iand
    //   4011: ior
    //   4012: istore #23
    //   4014: iload #24
    //   4016: iload #23
    //   4018: ixor
    //   4019: ldc -1431655766
    //   4021: iand
    //   4022: istore #22
    //   4024: iload #24
    //   4026: iload #22
    //   4028: ixor
    //   4029: istore #24
    //   4031: iload #23
    //   4033: iload #22
    //   4035: ixor
    //   4036: istore #23
    //   4038: iload #24
    //   4040: iconst_1
    //   4041: ishl
    //   4042: iload #24
    //   4044: bipush #31
    //   4046: iushr
    //   4047: iconst_1
    //   4048: iand
    //   4049: ior
    //   4050: istore #24
    //   4052: iconst_0
    //   4053: istore #25
    //   4055: iload #25
    //   4057: bipush #8
    //   4059: if_icmpge -> 4397
    //   4062: iload #23
    //   4064: bipush #28
    //   4066: ishl
    //   4067: iload #23
    //   4069: iconst_4
    //   4070: iushr
    //   4071: ior
    //   4072: istore #22
    //   4074: iload #22
    //   4076: aload #5
    //   4078: iload #26
    //   4080: iinc #26, 1
    //   4083: iaload
    //   4084: ixor
    //   4085: istore #22
    //   4087: aload #14
    //   4089: iload #22
    //   4091: bipush #63
    //   4093: iand
    //   4094: iaload
    //   4095: istore #21
    //   4097: iload #21
    //   4099: aload #12
    //   4101: iload #22
    //   4103: bipush #8
    //   4105: iushr
    //   4106: bipush #63
    //   4108: iand
    //   4109: iaload
    //   4110: ior
    //   4111: istore #21
    //   4113: iload #21
    //   4115: aload #10
    //   4117: iload #22
    //   4119: bipush #16
    //   4121: iushr
    //   4122: bipush #63
    //   4124: iand
    //   4125: iaload
    //   4126: ior
    //   4127: istore #21
    //   4129: iload #21
    //   4131: aload #8
    //   4133: iload #22
    //   4135: bipush #24
    //   4137: iushr
    //   4138: bipush #63
    //   4140: iand
    //   4141: iaload
    //   4142: ior
    //   4143: istore #21
    //   4145: iload #23
    //   4147: aload #5
    //   4149: iload #26
    //   4151: iinc #26, 1
    //   4154: iaload
    //   4155: ixor
    //   4156: istore #22
    //   4158: iload #21
    //   4160: aload #15
    //   4162: iload #22
    //   4164: bipush #63
    //   4166: iand
    //   4167: iaload
    //   4168: ior
    //   4169: istore #21
    //   4171: iload #21
    //   4173: aload #13
    //   4175: iload #22
    //   4177: bipush #8
    //   4179: iushr
    //   4180: bipush #63
    //   4182: iand
    //   4183: iaload
    //   4184: ior
    //   4185: istore #21
    //   4187: iload #21
    //   4189: aload #11
    //   4191: iload #22
    //   4193: bipush #16
    //   4195: iushr
    //   4196: bipush #63
    //   4198: iand
    //   4199: iaload
    //   4200: ior
    //   4201: istore #21
    //   4203: iload #21
    //   4205: aload #9
    //   4207: iload #22
    //   4209: bipush #24
    //   4211: iushr
    //   4212: bipush #63
    //   4214: iand
    //   4215: iaload
    //   4216: ior
    //   4217: istore #21
    //   4219: iload #24
    //   4221: iload #21
    //   4223: ixor
    //   4224: istore #24
    //   4226: iload #24
    //   4228: bipush #28
    //   4230: ishl
    //   4231: iload #24
    //   4233: iconst_4
    //   4234: iushr
    //   4235: ior
    //   4236: istore #22
    //   4238: iload #22
    //   4240: aload #5
    //   4242: iload #26
    //   4244: iinc #26, 1
    //   4247: iaload
    //   4248: ixor
    //   4249: istore #22
    //   4251: aload #14
    //   4253: iload #22
    //   4255: bipush #63
    //   4257: iand
    //   4258: iaload
    //   4259: istore #21
    //   4261: iload #21
    //   4263: aload #12
    //   4265: iload #22
    //   4267: bipush #8
    //   4269: iushr
    //   4270: bipush #63
    //   4272: iand
    //   4273: iaload
    //   4274: ior
    //   4275: istore #21
    //   4277: iload #21
    //   4279: aload #10
    //   4281: iload #22
    //   4283: bipush #16
    //   4285: iushr
    //   4286: bipush #63
    //   4288: iand
    //   4289: iaload
    //   4290: ior
    //   4291: istore #21
    //   4293: iload #21
    //   4295: aload #8
    //   4297: iload #22
    //   4299: bipush #24
    //   4301: iushr
    //   4302: bipush #63
    //   4304: iand
    //   4305: iaload
    //   4306: ior
    //   4307: istore #21
    //   4309: iload #24
    //   4311: aload #5
    //   4313: iload #26
    //   4315: iinc #26, 1
    //   4318: iaload
    //   4319: ixor
    //   4320: istore #22
    //   4322: iload #21
    //   4324: aload #15
    //   4326: iload #22
    //   4328: bipush #63
    //   4330: iand
    //   4331: iaload
    //   4332: ior
    //   4333: istore #21
    //   4335: iload #21
    //   4337: aload #13
    //   4339: iload #22
    //   4341: bipush #8
    //   4343: iushr
    //   4344: bipush #63
    //   4346: iand
    //   4347: iaload
    //   4348: ior
    //   4349: istore #21
    //   4351: iload #21
    //   4353: aload #11
    //   4355: iload #22
    //   4357: bipush #16
    //   4359: iushr
    //   4360: bipush #63
    //   4362: iand
    //   4363: iaload
    //   4364: ior
    //   4365: istore #21
    //   4367: iload #21
    //   4369: aload #9
    //   4371: iload #22
    //   4373: bipush #24
    //   4375: iushr
    //   4376: bipush #63
    //   4378: iand
    //   4379: iaload
    //   4380: ior
    //   4381: istore #21
    //   4383: iload #23
    //   4385: iload #21
    //   4387: ixor
    //   4388: istore #23
    //   4390: iinc #25, 1
    //   4393: iload_2
    //   4394: ifeq -> 4055
    //   4397: iload #23
    //   4399: bipush #31
    //   4401: ishl
    //   4402: iload #23
    //   4404: iconst_1
    //   4405: iushr
    //   4406: ior
    //   4407: istore #23
    //   4409: iload #24
    //   4411: iload #23
    //   4413: ixor
    //   4414: ldc -1431655766
    //   4416: iand
    //   4417: istore #22
    //   4419: iload #24
    //   4421: iload #22
    //   4423: ixor
    //   4424: istore #24
    //   4426: iload #23
    //   4428: iload #22
    //   4430: ixor
    //   4431: istore #23
    //   4433: iload #24
    //   4435: bipush #31
    //   4437: ishl
    //   4438: iload #24
    //   4440: iconst_1
    //   4441: iushr
    //   4442: ior
    //   4443: istore #24
    //   4445: iload #24
    //   4447: bipush #8
    //   4449: iushr
    //   4450: iload #23
    //   4452: ixor
    //   4453: ldc 16711935
    //   4455: iand
    //   4456: istore #22
    //   4458: iload #23
    //   4460: iload #22
    //   4462: ixor
    //   4463: istore #23
    //   4465: iload #24
    //   4467: iload #22
    //   4469: bipush #8
    //   4471: ishl
    //   4472: ixor
    //   4473: istore #24
    //   4475: iload #24
    //   4477: iconst_2
    //   4478: iushr
    //   4479: iload #23
    //   4481: ixor
    //   4482: ldc 858993459
    //   4484: iand
    //   4485: istore #22
    //   4487: iload #23
    //   4489: iload #22
    //   4491: ixor
    //   4492: istore #23
    //   4494: iload #24
    //   4496: iload #22
    //   4498: iconst_2
    //   4499: ishl
    //   4500: ixor
    //   4501: istore #24
    //   4503: iload #23
    //   4505: bipush #16
    //   4507: iushr
    //   4508: iload #24
    //   4510: ixor
    //   4511: ldc 65535
    //   4513: iand
    //   4514: istore #22
    //   4516: iload #24
    //   4518: iload #22
    //   4520: ixor
    //   4521: istore #24
    //   4523: iload #23
    //   4525: iload #22
    //   4527: bipush #16
    //   4529: ishl
    //   4530: ixor
    //   4531: istore #23
    //   4533: iload #23
    //   4535: iconst_4
    //   4536: iushr
    //   4537: iload #24
    //   4539: ixor
    //   4540: ldc 252645135
    //   4542: iand
    //   4543: istore #22
    //   4545: iload #24
    //   4547: iload #22
    //   4549: ixor
    //   4550: istore #24
    //   4552: iload #23
    //   4554: iload #22
    //   4556: iconst_4
    //   4557: ishl
    //   4558: ixor
    //   4559: istore #23
    //   4561: aload #17
    //   4563: iconst_0
    //   4564: iload #23
    //   4566: iastore
    //   4567: aload #17
    //   4569: iconst_1
    //   4570: iload #24
    //   4572: iastore
    //   4573: iload #19
    //   4575: bipush #8
    //   4577: imul
    //   4578: istore #27
    //   4580: iconst_0
    //   4581: istore #28
    //   4583: iload #28
    //   4585: iconst_2
    //   4586: if_icmpge -> 4675
    //   4589: aload #4
    //   4591: iload #27
    //   4593: iload #28
    //   4595: iconst_4
    //   4596: imul
    //   4597: iadd
    //   4598: aload #17
    //   4600: iload #28
    //   4602: iaload
    //   4603: bipush #24
    //   4605: iushr
    //   4606: i2b
    //   4607: bastore
    //   4608: aload #4
    //   4610: iload #27
    //   4612: iload #28
    //   4614: iconst_4
    //   4615: imul
    //   4616: iadd
    //   4617: iconst_1
    //   4618: iadd
    //   4619: aload #17
    //   4621: iload #28
    //   4623: iaload
    //   4624: bipush #16
    //   4626: iushr
    //   4627: i2b
    //   4628: bastore
    //   4629: aload #4
    //   4631: iload #27
    //   4633: iload #28
    //   4635: iconst_4
    //   4636: imul
    //   4637: iadd
    //   4638: iconst_2
    //   4639: iadd
    //   4640: aload #17
    //   4642: iload #28
    //   4644: iaload
    //   4645: bipush #8
    //   4647: iushr
    //   4648: i2b
    //   4649: bastore
    //   4650: aload #4
    //   4652: iload #27
    //   4654: iload #28
    //   4656: iconst_4
    //   4657: imul
    //   4658: iadd
    //   4659: iconst_3
    //   4660: iadd
    //   4661: aload #17
    //   4663: iload #28
    //   4665: iaload
    //   4666: i2b
    //   4667: bastore
    //   4668: iinc #28, 1
    //   4671: iload_2
    //   4672: ifeq -> 4583
    //   4675: iinc #19, 1
    //   4678: iload_2
    //   4679: ifeq -> 3764
    //   4682: iconst_0
    //   4683: istore_3
    //   4684: getstatic burp/Zmgl.Zh : Ljava/lang/String;
    //   4687: getstatic burp/Ze57.ZR : Ljava/lang/Object;
    //   4690: checkcast java/math/BigInteger
    //   4693: invokevirtual intValue : ()I
    //   4696: bipush #32
    //   4698: irem
    //   4699: invokestatic abs : (I)I
    //   4702: invokevirtual charAt : (I)C
    //   4705: getstatic burp/Zb6a.ZY : Ljava/lang/String;
    //   4708: getstatic burp/Zeuz.Zp : Ljava/lang/Object;
    //   4711: checkcast java/math/BigInteger
    //   4714: invokevirtual intValue : ()I
    //   4717: bipush #32
    //   4719: irem
    //   4720: invokestatic abs : (I)I
    //   4723: invokevirtual charAt : (I)C
    //   4726: if_icmpgt -> 5070
    //   4729: sipush #22863
    //   4732: sipush #-5063
    //   4735: invokestatic a : (II)Ljava/lang/String;
    //   4738: iconst_1
    //   4739: ldc burp/Zxti
    //   4741: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4744: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4747: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4750: astore #4
    //   4752: aload #4
    //   4754: arraylength
    //   4755: istore #5
    //   4757: iconst_0
    //   4758: istore #6
    //   4760: iload #6
    //   4762: iload #5
    //   4764: if_icmpge -> 4902
    //   4767: aload #4
    //   4769: iload #6
    //   4771: aaload
    //   4772: astore #7
    //   4774: aload #7
    //   4776: invokevirtual getModifiers : ()I
    //   4779: invokestatic isStatic : (I)Z
    //   4782: ifne -> 4792
    //   4785: goto -> 4895
    //   4788: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4791: athrow
    //   4792: aload #7
    //   4794: invokevirtual getType : ()Ljava/lang/Class;
    //   4797: astore #8
    //   4799: aload #8
    //   4801: ifnull -> 4882
    //   4804: aload #8
    //   4806: invokevirtual isPrimitive : ()Z
    //   4809: ifne -> 4882
    //   4812: goto -> 4819
    //   4815: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4818: athrow
    //   4819: aload #8
    //   4821: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4824: ifnull -> 4882
    //   4827: goto -> 4834
    //   4830: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4833: athrow
    //   4834: aload #8
    //   4836: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4839: invokevirtual getName : ()Ljava/lang/String;
    //   4842: ifnull -> 4882
    //   4845: goto -> 4852
    //   4848: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4851: athrow
    //   4852: aload #8
    //   4854: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4857: invokevirtual getName : ()Ljava/lang/String;
    //   4860: sipush #22856
    //   4863: sipush #28683
    //   4866: invokestatic a : (II)Ljava/lang/String;
    //   4869: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4872: ifne -> 4882
    //   4875: goto -> 4882
    //   4878: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4881: athrow
    //   4882: aload #7
    //   4884: iconst_1
    //   4885: invokevirtual setAccessible : (Z)V
    //   4888: aload #7
    //   4890: aconst_null
    //   4891: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4894: pop
    //   4895: iinc #6, 1
    //   4898: iload_2
    //   4899: ifeq -> 4760
    //   4902: sipush #22862
    //   4905: sipush #1770
    //   4908: invokestatic a : (II)Ljava/lang/String;
    //   4911: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4914: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4917: astore #4
    //   4919: aload #4
    //   4921: arraylength
    //   4922: istore #5
    //   4924: iconst_0
    //   4925: istore #6
    //   4927: iload #6
    //   4929: iload #5
    //   4931: if_icmpge -> 5067
    //   4934: aload #4
    //   4936: iload #6
    //   4938: aaload
    //   4939: astore #7
    //   4941: aload #7
    //   4943: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4946: pop
    //   4947: aload #7
    //   4949: invokevirtual getModifiers : ()I
    //   4952: invokestatic isStatic : (I)Z
    //   4955: ifeq -> 5053
    //   4958: aload #7
    //   4960: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4963: arraylength
    //   4964: iconst_2
    //   4965: if_icmpne -> 5053
    //   4968: goto -> 4975
    //   4971: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4974: athrow
    //   4975: aload #7
    //   4977: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4980: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4983: if_acmpne -> 5053
    //   4986: goto -> 4993
    //   4989: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4992: athrow
    //   4993: aload #7
    //   4995: iconst_1
    //   4996: invokevirtual setAccessible : (Z)V
    //   4999: aload #7
    //   5001: aconst_null
    //   5002: iconst_2
    //   5003: anewarray java/lang/Object
    //   5006: dup
    //   5007: iconst_0
    //   5008: aload_0
    //   5009: aastore
    //   5010: dup
    //   5011: iconst_1
    //   5012: aload_1
    //   5013: ifnonnull -> 5031
    //   5016: goto -> 5023
    //   5019: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5022: athrow
    //   5023: aload_1
    //   5024: goto -> 5038
    //   5027: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5030: athrow
    //   5031: aload_1
    //   5032: checkcast [B
    //   5035: invokevirtual clone : ()Ljava/lang/Object;
    //   5038: aastore
    //   5039: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5042: checkcast java/lang/Boolean
    //   5045: invokevirtual booleanValue : ()Z
    //   5048: istore_3
    //   5049: iload_2
    //   5050: ifeq -> 5067
    //   5053: iinc #6, 1
    //   5056: iload_2
    //   5057: ifeq -> 4927
    //   5060: goto -> 5067
    //   5063: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5066: athrow
    //   5067: goto -> 5408
    //   5070: sipush #22855
    //   5073: sipush #-14233
    //   5076: invokestatic a : (II)Ljava/lang/String;
    //   5079: iconst_1
    //   5080: ldc burp/Zmjw
    //   5082: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5085: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5088: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5091: astore #4
    //   5093: aload #4
    //   5095: arraylength
    //   5096: istore #5
    //   5098: iconst_0
    //   5099: istore #6
    //   5101: iload #6
    //   5103: iload #5
    //   5105: if_icmpge -> 5243
    //   5108: aload #4
    //   5110: iload #6
    //   5112: aaload
    //   5113: astore #7
    //   5115: aload #7
    //   5117: invokevirtual getModifiers : ()I
    //   5120: invokestatic isStatic : (I)Z
    //   5123: ifne -> 5133
    //   5126: goto -> 5236
    //   5129: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5132: athrow
    //   5133: aload #7
    //   5135: invokevirtual getType : ()Ljava/lang/Class;
    //   5138: astore #8
    //   5140: aload #8
    //   5142: ifnull -> 5223
    //   5145: aload #8
    //   5147: invokevirtual isPrimitive : ()Z
    //   5150: ifne -> 5223
    //   5153: goto -> 5160
    //   5156: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5159: athrow
    //   5160: aload #8
    //   5162: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5165: ifnull -> 5223
    //   5168: goto -> 5175
    //   5171: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5174: athrow
    //   5175: aload #8
    //   5177: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5180: invokevirtual getName : ()Ljava/lang/String;
    //   5183: ifnull -> 5223
    //   5186: goto -> 5193
    //   5189: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5192: athrow
    //   5193: aload #8
    //   5195: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5198: invokevirtual getName : ()Ljava/lang/String;
    //   5201: sipush #22856
    //   5204: sipush #28683
    //   5207: invokestatic a : (II)Ljava/lang/String;
    //   5210: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5213: ifne -> 5223
    //   5216: goto -> 5223
    //   5219: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5222: athrow
    //   5223: aload #7
    //   5225: iconst_1
    //   5226: invokevirtual setAccessible : (Z)V
    //   5229: aload #7
    //   5231: aconst_null
    //   5232: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5235: pop
    //   5236: iinc #6, 1
    //   5239: iload_2
    //   5240: ifeq -> 5101
    //   5243: sipush #22876
    //   5246: sipush #20042
    //   5249: invokestatic a : (II)Ljava/lang/String;
    //   5252: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5255: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5258: astore #4
    //   5260: aload #4
    //   5262: arraylength
    //   5263: istore #5
    //   5265: iconst_0
    //   5266: istore #6
    //   5268: iload #6
    //   5270: iload #5
    //   5272: if_icmpge -> 5408
    //   5275: aload #4
    //   5277: iload #6
    //   5279: aaload
    //   5280: astore #7
    //   5282: aload #7
    //   5284: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5287: pop
    //   5288: aload #7
    //   5290: invokevirtual getModifiers : ()I
    //   5293: invokestatic isStatic : (I)Z
    //   5296: ifeq -> 5394
    //   5299: aload #7
    //   5301: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5304: arraylength
    //   5305: iconst_2
    //   5306: if_icmpne -> 5394
    //   5309: goto -> 5316
    //   5312: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5315: athrow
    //   5316: aload #7
    //   5318: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5321: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   5324: if_acmpne -> 5394
    //   5327: goto -> 5334
    //   5330: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5333: athrow
    //   5334: aload #7
    //   5336: iconst_1
    //   5337: invokevirtual setAccessible : (Z)V
    //   5340: aload #7
    //   5342: aconst_null
    //   5343: iconst_2
    //   5344: anewarray java/lang/Object
    //   5347: dup
    //   5348: iconst_0
    //   5349: aload_0
    //   5350: aastore
    //   5351: dup
    //   5352: iconst_1
    //   5353: aload_1
    //   5354: ifnonnull -> 5372
    //   5357: goto -> 5364
    //   5360: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5363: athrow
    //   5364: aload_1
    //   5365: goto -> 5379
    //   5368: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5371: athrow
    //   5372: aload_1
    //   5373: checkcast [B
    //   5376: invokevirtual clone : ()Ljava/lang/Object;
    //   5379: aastore
    //   5380: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5383: checkcast java/lang/Boolean
    //   5386: invokevirtual booleanValue : ()Z
    //   5389: istore_3
    //   5390: iload_2
    //   5391: ifeq -> 5408
    //   5394: iinc #6, 1
    //   5397: iload_2
    //   5398: ifeq -> 5268
    //   5401: goto -> 5408
    //   5404: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5407: athrow
    //   5408: iload_3
    //   5409: ifeq -> 5414
    //   5412: iload_3
    //   5413: ireturn
    //   5414: getstatic burp/Zk88.ZZ : Ljava/lang/String;
    //   5417: getstatic burp/Ztv8.ZS : Ljava/lang/Object;
    //   5420: checkcast java/math/BigInteger
    //   5423: invokevirtual intValue : ()I
    //   5426: bipush #32
    //   5428: irem
    //   5429: invokestatic abs : (I)I
    //   5432: invokevirtual charAt : (I)C
    //   5435: getstatic burp/Zmgl.Zh : Ljava/lang/String;
    //   5438: getstatic burp/Ztsj.Zc : Ljava/lang/Object;
    //   5441: checkcast java/math/BigInteger
    //   5444: invokevirtual intValue : ()I
    //   5447: bipush #32
    //   5449: irem
    //   5450: invokestatic abs : (I)I
    //   5453: invokevirtual charAt : (I)C
    //   5456: if_icmple -> 5801
    //   5459: sipush #22860
    //   5462: sipush #-9160
    //   5465: invokestatic a : (II)Ljava/lang/String;
    //   5468: iconst_1
    //   5469: ldc burp/Zxpb
    //   5471: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5474: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5477: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5480: astore #4
    //   5482: aload #4
    //   5484: arraylength
    //   5485: istore #5
    //   5487: iconst_0
    //   5488: istore #6
    //   5490: iload #6
    //   5492: iload #5
    //   5494: if_icmpge -> 5632
    //   5497: aload #4
    //   5499: iload #6
    //   5501: aaload
    //   5502: astore #7
    //   5504: aload #7
    //   5506: invokevirtual getModifiers : ()I
    //   5509: invokestatic isStatic : (I)Z
    //   5512: ifne -> 5522
    //   5515: goto -> 5625
    //   5518: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5521: athrow
    //   5522: aload #7
    //   5524: invokevirtual getType : ()Ljava/lang/Class;
    //   5527: astore #8
    //   5529: aload #8
    //   5531: ifnull -> 5612
    //   5534: aload #8
    //   5536: invokevirtual isPrimitive : ()Z
    //   5539: ifne -> 5612
    //   5542: goto -> 5549
    //   5545: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5548: athrow
    //   5549: aload #8
    //   5551: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5554: ifnull -> 5612
    //   5557: goto -> 5564
    //   5560: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5563: athrow
    //   5564: aload #8
    //   5566: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5569: invokevirtual getName : ()Ljava/lang/String;
    //   5572: ifnull -> 5612
    //   5575: goto -> 5582
    //   5578: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5581: athrow
    //   5582: aload #8
    //   5584: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5587: invokevirtual getName : ()Ljava/lang/String;
    //   5590: sipush #22856
    //   5593: sipush #28683
    //   5596: invokestatic a : (II)Ljava/lang/String;
    //   5599: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5602: ifne -> 5612
    //   5605: goto -> 5612
    //   5608: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5611: athrow
    //   5612: aload #7
    //   5614: iconst_1
    //   5615: invokevirtual setAccessible : (Z)V
    //   5618: aload #7
    //   5620: aconst_null
    //   5621: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5624: pop
    //   5625: iinc #6, 1
    //   5628: iload_2
    //   5629: ifeq -> 5490
    //   5632: sipush #22866
    //   5635: sipush #-16965
    //   5638: invokestatic a : (II)Ljava/lang/String;
    //   5641: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5644: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5647: astore #4
    //   5649: aload #4
    //   5651: arraylength
    //   5652: istore #5
    //   5654: iconst_0
    //   5655: istore #6
    //   5657: iload #6
    //   5659: iload #5
    //   5661: if_icmpge -> 5797
    //   5664: aload #4
    //   5666: iload #6
    //   5668: aaload
    //   5669: astore #7
    //   5671: aload #7
    //   5673: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5676: pop
    //   5677: aload #7
    //   5679: invokevirtual getModifiers : ()I
    //   5682: invokestatic isStatic : (I)Z
    //   5685: ifeq -> 5783
    //   5688: aload #7
    //   5690: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5693: arraylength
    //   5694: iconst_2
    //   5695: if_icmpne -> 5783
    //   5698: goto -> 5705
    //   5701: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5704: athrow
    //   5705: aload #7
    //   5707: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5710: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   5713: if_acmpne -> 5783
    //   5716: goto -> 5723
    //   5719: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5722: athrow
    //   5723: aload #7
    //   5725: iconst_1
    //   5726: invokevirtual setAccessible : (Z)V
    //   5729: aload #7
    //   5731: aconst_null
    //   5732: iconst_2
    //   5733: anewarray java/lang/Object
    //   5736: dup
    //   5737: iconst_0
    //   5738: aload_0
    //   5739: aastore
    //   5740: dup
    //   5741: iconst_1
    //   5742: aload_1
    //   5743: ifnonnull -> 5761
    //   5746: goto -> 5753
    //   5749: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5752: athrow
    //   5753: aload_1
    //   5754: goto -> 5768
    //   5757: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5760: athrow
    //   5761: aload_1
    //   5762: checkcast [B
    //   5765: invokevirtual clone : ()Ljava/lang/Object;
    //   5768: aastore
    //   5769: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5772: checkcast java/lang/Boolean
    //   5775: invokevirtual booleanValue : ()Z
    //   5778: istore_3
    //   5779: iload_2
    //   5780: ifeq -> 5797
    //   5783: iinc #6, 1
    //   5786: iload_2
    //   5787: ifeq -> 5657
    //   5790: goto -> 5797
    //   5793: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5796: athrow
    //   5797: iload_2
    //   5798: ifeq -> 6139
    //   5801: sipush #22865
    //   5804: sipush #8466
    //   5807: invokestatic a : (II)Ljava/lang/String;
    //   5810: iconst_1
    //   5811: ldc burp/Zgwu
    //   5813: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5816: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5819: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5822: astore #4
    //   5824: aload #4
    //   5826: arraylength
    //   5827: istore #5
    //   5829: iconst_0
    //   5830: istore #6
    //   5832: iload #6
    //   5834: iload #5
    //   5836: if_icmpge -> 5974
    //   5839: aload #4
    //   5841: iload #6
    //   5843: aaload
    //   5844: astore #7
    //   5846: aload #7
    //   5848: invokevirtual getModifiers : ()I
    //   5851: invokestatic isStatic : (I)Z
    //   5854: ifne -> 5864
    //   5857: goto -> 5967
    //   5860: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5863: athrow
    //   5864: aload #7
    //   5866: invokevirtual getType : ()Ljava/lang/Class;
    //   5869: astore #8
    //   5871: aload #8
    //   5873: ifnull -> 5954
    //   5876: aload #8
    //   5878: invokevirtual isPrimitive : ()Z
    //   5881: ifne -> 5954
    //   5884: goto -> 5891
    //   5887: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5890: athrow
    //   5891: aload #8
    //   5893: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5896: ifnull -> 5954
    //   5899: goto -> 5906
    //   5902: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5905: athrow
    //   5906: aload #8
    //   5908: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5911: invokevirtual getName : ()Ljava/lang/String;
    //   5914: ifnull -> 5954
    //   5917: goto -> 5924
    //   5920: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5923: athrow
    //   5924: aload #8
    //   5926: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5929: invokevirtual getName : ()Ljava/lang/String;
    //   5932: sipush #22856
    //   5935: sipush #28683
    //   5938: invokestatic a : (II)Ljava/lang/String;
    //   5941: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5944: ifne -> 5954
    //   5947: goto -> 5954
    //   5950: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5953: athrow
    //   5954: aload #7
    //   5956: iconst_1
    //   5957: invokevirtual setAccessible : (Z)V
    //   5960: aload #7
    //   5962: aconst_null
    //   5963: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5966: pop
    //   5967: iinc #6, 1
    //   5970: iload_2
    //   5971: ifeq -> 5832
    //   5974: sipush #22869
    //   5977: sipush #-2274
    //   5980: invokestatic a : (II)Ljava/lang/String;
    //   5983: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5986: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5989: astore #4
    //   5991: aload #4
    //   5993: arraylength
    //   5994: istore #5
    //   5996: iconst_0
    //   5997: istore #6
    //   5999: iload #6
    //   6001: iload #5
    //   6003: if_icmpge -> 6139
    //   6006: aload #4
    //   6008: iload #6
    //   6010: aaload
    //   6011: astore #7
    //   6013: aload #7
    //   6015: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6018: pop
    //   6019: aload #7
    //   6021: invokevirtual getModifiers : ()I
    //   6024: invokestatic isStatic : (I)Z
    //   6027: ifeq -> 6125
    //   6030: aload #7
    //   6032: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6035: arraylength
    //   6036: iconst_2
    //   6037: if_icmpne -> 6125
    //   6040: goto -> 6047
    //   6043: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6046: athrow
    //   6047: aload #7
    //   6049: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   6052: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   6055: if_acmpne -> 6125
    //   6058: goto -> 6065
    //   6061: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6064: athrow
    //   6065: aload #7
    //   6067: iconst_1
    //   6068: invokevirtual setAccessible : (Z)V
    //   6071: aload #7
    //   6073: aconst_null
    //   6074: iconst_2
    //   6075: anewarray java/lang/Object
    //   6078: dup
    //   6079: iconst_0
    //   6080: aload_0
    //   6081: aastore
    //   6082: dup
    //   6083: iconst_1
    //   6084: aload_1
    //   6085: ifnonnull -> 6103
    //   6088: goto -> 6095
    //   6091: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6094: athrow
    //   6095: aload_1
    //   6096: goto -> 6110
    //   6099: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6102: athrow
    //   6103: aload_1
    //   6104: checkcast [B
    //   6107: invokevirtual clone : ()Ljava/lang/Object;
    //   6110: aastore
    //   6111: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   6114: checkcast java/lang/Boolean
    //   6117: invokevirtual booleanValue : ()Z
    //   6120: istore_3
    //   6121: iload_2
    //   6122: ifeq -> 6139
    //   6125: iinc #6, 1
    //   6128: iload_2
    //   6129: ifeq -> 5999
    //   6132: goto -> 6139
    //   6135: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6138: athrow
    //   6139: iload_3
    //   6140: ifeq -> 6145
    //   6143: iload_3
    //   6144: ireturn
    //   6145: getstatic burp/Zll8.ZZ : Ljava/lang/String;
    //   6148: getstatic burp/Zls0.ZZ : Ljava/lang/Object;
    //   6151: checkcast java/math/BigInteger
    //   6154: invokevirtual intValue : ()I
    //   6157: bipush #32
    //   6159: irem
    //   6160: invokestatic abs : (I)I
    //   6163: invokevirtual charAt : (I)C
    //   6166: getstatic burp/Zxd4.Zf : Ljava/lang/String;
    //   6169: getstatic burp/Zk88.ZX : Ljava/lang/Object;
    //   6172: checkcast java/math/BigInteger
    //   6175: invokevirtual intValue : ()I
    //   6178: bipush #32
    //   6180: irem
    //   6181: invokestatic abs : (I)I
    //   6184: invokevirtual charAt : (I)C
    //   6187: if_icmpgt -> 6532
    //   6190: sipush #22854
    //   6193: sipush #13748
    //   6196: invokestatic a : (II)Ljava/lang/String;
    //   6199: iconst_1
    //   6200: ldc burp/Zkde
    //   6202: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   6205: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   6208: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   6211: astore #4
    //   6213: aload #4
    //   6215: arraylength
    //   6216: istore #5
    //   6218: iconst_0
    //   6219: istore #6
    //   6221: iload #6
    //   6223: iload #5
    //   6225: if_icmpge -> 6363
    //   6228: aload #4
    //   6230: iload #6
    //   6232: aaload
    //   6233: astore #7
    //   6235: aload #7
    //   6237: invokevirtual getModifiers : ()I
    //   6240: invokestatic isStatic : (I)Z
    //   6243: ifne -> 6253
    //   6246: goto -> 6356
    //   6249: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6252: athrow
    //   6253: aload #7
    //   6255: invokevirtual getType : ()Ljava/lang/Class;
    //   6258: astore #8
    //   6260: aload #8
    //   6262: ifnull -> 6343
    //   6265: aload #8
    //   6267: invokevirtual isPrimitive : ()Z
    //   6270: ifne -> 6343
    //   6273: goto -> 6280
    //   6276: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6279: athrow
    //   6280: aload #8
    //   6282: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6285: ifnull -> 6343
    //   6288: goto -> 6295
    //   6291: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6294: athrow
    //   6295: aload #8
    //   6297: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6300: invokevirtual getName : ()Ljava/lang/String;
    //   6303: ifnull -> 6343
    //   6306: goto -> 6313
    //   6309: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6312: athrow
    //   6313: aload #8
    //   6315: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6318: invokevirtual getName : ()Ljava/lang/String;
    //   6321: sipush #22856
    //   6324: sipush #28683
    //   6327: invokestatic a : (II)Ljava/lang/String;
    //   6330: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   6333: ifne -> 6343
    //   6336: goto -> 6343
    //   6339: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6342: athrow
    //   6343: aload #7
    //   6345: iconst_1
    //   6346: invokevirtual setAccessible : (Z)V
    //   6349: aload #7
    //   6351: aconst_null
    //   6352: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   6355: pop
    //   6356: iinc #6, 1
    //   6359: iload_2
    //   6360: ifeq -> 6221
    //   6363: sipush #22877
    //   6366: sipush #18190
    //   6369: invokestatic a : (II)Ljava/lang/String;
    //   6372: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   6375: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   6378: astore #4
    //   6380: aload #4
    //   6382: arraylength
    //   6383: istore #5
    //   6385: iconst_0
    //   6386: istore #6
    //   6388: iload #6
    //   6390: iload #5
    //   6392: if_icmpge -> 6528
    //   6395: aload #4
    //   6397: iload #6
    //   6399: aaload
    //   6400: astore #7
    //   6402: aload #7
    //   6404: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6407: pop
    //   6408: aload #7
    //   6410: invokevirtual getModifiers : ()I
    //   6413: invokestatic isStatic : (I)Z
    //   6416: ifeq -> 6514
    //   6419: aload #7
    //   6421: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6424: arraylength
    //   6425: iconst_2
    //   6426: if_icmpne -> 6514
    //   6429: goto -> 6436
    //   6432: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6435: athrow
    //   6436: aload #7
    //   6438: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   6441: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   6444: if_acmpne -> 6514
    //   6447: goto -> 6454
    //   6450: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6453: athrow
    //   6454: aload #7
    //   6456: iconst_1
    //   6457: invokevirtual setAccessible : (Z)V
    //   6460: aload #7
    //   6462: aconst_null
    //   6463: iconst_2
    //   6464: anewarray java/lang/Object
    //   6467: dup
    //   6468: iconst_0
    //   6469: aload_0
    //   6470: aastore
    //   6471: dup
    //   6472: iconst_1
    //   6473: aload_1
    //   6474: ifnonnull -> 6492
    //   6477: goto -> 6484
    //   6480: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6483: athrow
    //   6484: aload_1
    //   6485: goto -> 6499
    //   6488: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6491: athrow
    //   6492: aload_1
    //   6493: checkcast [B
    //   6496: invokevirtual clone : ()Ljava/lang/Object;
    //   6499: aastore
    //   6500: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   6503: checkcast java/lang/Boolean
    //   6506: invokevirtual booleanValue : ()Z
    //   6509: istore_3
    //   6510: iload_2
    //   6511: ifeq -> 6528
    //   6514: iinc #6, 1
    //   6517: iload_2
    //   6518: ifeq -> 6388
    //   6521: goto -> 6528
    //   6524: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6527: athrow
    //   6528: iload_2
    //   6529: ifeq -> 6870
    //   6532: sipush #22853
    //   6535: sipush #-3115
    //   6538: invokestatic a : (II)Ljava/lang/String;
    //   6541: iconst_1
    //   6542: ldc burp/Zxd4
    //   6544: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   6547: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   6550: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   6553: astore #4
    //   6555: aload #4
    //   6557: arraylength
    //   6558: istore #5
    //   6560: iconst_0
    //   6561: istore #6
    //   6563: iload #6
    //   6565: iload #5
    //   6567: if_icmpge -> 6705
    //   6570: aload #4
    //   6572: iload #6
    //   6574: aaload
    //   6575: astore #7
    //   6577: aload #7
    //   6579: invokevirtual getModifiers : ()I
    //   6582: invokestatic isStatic : (I)Z
    //   6585: ifne -> 6595
    //   6588: goto -> 6698
    //   6591: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6594: athrow
    //   6595: aload #7
    //   6597: invokevirtual getType : ()Ljava/lang/Class;
    //   6600: astore #8
    //   6602: aload #8
    //   6604: ifnull -> 6685
    //   6607: aload #8
    //   6609: invokevirtual isPrimitive : ()Z
    //   6612: ifne -> 6685
    //   6615: goto -> 6622
    //   6618: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6621: athrow
    //   6622: aload #8
    //   6624: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6627: ifnull -> 6685
    //   6630: goto -> 6637
    //   6633: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6636: athrow
    //   6637: aload #8
    //   6639: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6642: invokevirtual getName : ()Ljava/lang/String;
    //   6645: ifnull -> 6685
    //   6648: goto -> 6655
    //   6651: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6654: athrow
    //   6655: aload #8
    //   6657: invokevirtual getPackage : ()Ljava/lang/Package;
    //   6660: invokevirtual getName : ()Ljava/lang/String;
    //   6663: sipush #22856
    //   6666: sipush #28683
    //   6669: invokestatic a : (II)Ljava/lang/String;
    //   6672: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   6675: ifne -> 6685
    //   6678: goto -> 6685
    //   6681: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6684: athrow
    //   6685: aload #7
    //   6687: iconst_1
    //   6688: invokevirtual setAccessible : (Z)V
    //   6691: aload #7
    //   6693: aconst_null
    //   6694: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   6697: pop
    //   6698: iinc #6, 1
    //   6701: iload_2
    //   6702: ifeq -> 6563
    //   6705: sipush #22850
    //   6708: sipush #21390
    //   6711: invokestatic a : (II)Ljava/lang/String;
    //   6714: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   6717: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   6720: astore #4
    //   6722: aload #4
    //   6724: arraylength
    //   6725: istore #5
    //   6727: iconst_0
    //   6728: istore #6
    //   6730: iload #6
    //   6732: iload #5
    //   6734: if_icmpge -> 6870
    //   6737: aload #4
    //   6739: iload #6
    //   6741: aaload
    //   6742: astore #7
    //   6744: aload #7
    //   6746: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6749: pop
    //   6750: aload #7
    //   6752: invokevirtual getModifiers : ()I
    //   6755: invokestatic isStatic : (I)Z
    //   6758: ifeq -> 6856
    //   6761: aload #7
    //   6763: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   6766: arraylength
    //   6767: iconst_2
    //   6768: if_icmpne -> 6856
    //   6771: goto -> 6778
    //   6774: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6777: athrow
    //   6778: aload #7
    //   6780: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   6783: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   6786: if_acmpne -> 6856
    //   6789: goto -> 6796
    //   6792: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6795: athrow
    //   6796: aload #7
    //   6798: iconst_1
    //   6799: invokevirtual setAccessible : (Z)V
    //   6802: aload #7
    //   6804: aconst_null
    //   6805: iconst_2
    //   6806: anewarray java/lang/Object
    //   6809: dup
    //   6810: iconst_0
    //   6811: aload_0
    //   6812: aastore
    //   6813: dup
    //   6814: iconst_1
    //   6815: aload_1
    //   6816: ifnonnull -> 6834
    //   6819: goto -> 6826
    //   6822: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6825: athrow
    //   6826: aload_1
    //   6827: goto -> 6841
    //   6830: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6833: athrow
    //   6834: aload_1
    //   6835: checkcast [B
    //   6838: invokevirtual clone : ()Ljava/lang/Object;
    //   6841: aastore
    //   6842: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   6845: checkcast java/lang/Boolean
    //   6848: invokevirtual booleanValue : ()Z
    //   6851: istore_3
    //   6852: iload_2
    //   6853: ifeq -> 6870
    //   6856: iinc #6, 1
    //   6859: iload_2
    //   6860: ifeq -> 6730
    //   6863: goto -> 6870
    //   6866: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6869: athrow
    //   6870: iload_3
    //   6871: ifeq -> 6876
    //   6874: iload_3
    //   6875: ireturn
    //   6876: getstatic burp/Ze_0.Zi : Ljava/lang/String;
    //   6879: getstatic burp/Zmgl.ZI : Ljava/lang/Object;
    //   6882: checkcast java/math/BigInteger
    //   6885: invokevirtual intValue : ()I
    //   6888: bipush #32
    //   6890: irem
    //   6891: invokestatic abs : (I)I
    //   6894: invokevirtual charAt : (I)C
    //   6897: getstatic burp/Zlp8.ZW : Ljava/lang/String;
    //   6900: getstatic burp/Zgp_.Zm : Ljava/lang/Object;
    //   6903: checkcast java/math/BigInteger
    //   6906: invokevirtual intValue : ()I
    //   6909: bipush #32
    //   6911: irem
    //   6912: invokestatic abs : (I)I
    //   6915: invokevirtual charAt : (I)C
    //   6918: if_icmpgt -> 7263
    //   6921: sipush #22852
    //   6924: sipush #6555
    //   6927: invokestatic a : (II)Ljava/lang/String;
    //   6930: iconst_1
    //   6931: ldc burp/Zb14
    //   6933: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   6936: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   6939: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   6942: astore #4
    //   6944: aload #4
    //   6946: arraylength
    //   6947: istore #5
    //   6949: iconst_0
    //   6950: istore #6
    //   6952: iload #6
    //   6954: iload #5
    //   6956: if_icmpge -> 7094
    //   6959: aload #4
    //   6961: iload #6
    //   6963: aaload
    //   6964: astore #7
    //   6966: aload #7
    //   6968: invokevirtual getModifiers : ()I
    //   6971: invokestatic isStatic : (I)Z
    //   6974: ifne -> 6984
    //   6977: goto -> 7087
    //   6980: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   6983: athrow
    //   6984: aload #7
    //   6986: invokevirtual getType : ()Ljava/lang/Class;
    //   6989: astore #8
    //   6991: aload #8
    //   6993: ifnull -> 7074
    //   6996: aload #8
    //   6998: invokevirtual isPrimitive : ()Z
    //   7001: ifne -> 7074
    //   7004: goto -> 7011
    //   7007: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7010: athrow
    //   7011: aload #8
    //   7013: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7016: ifnull -> 7074
    //   7019: goto -> 7026
    //   7022: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7025: athrow
    //   7026: aload #8
    //   7028: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7031: invokevirtual getName : ()Ljava/lang/String;
    //   7034: ifnull -> 7074
    //   7037: goto -> 7044
    //   7040: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7043: athrow
    //   7044: aload #8
    //   7046: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7049: invokevirtual getName : ()Ljava/lang/String;
    //   7052: sipush #22856
    //   7055: sipush #28683
    //   7058: invokestatic a : (II)Ljava/lang/String;
    //   7061: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   7064: ifne -> 7074
    //   7067: goto -> 7074
    //   7070: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7073: athrow
    //   7074: aload #7
    //   7076: iconst_1
    //   7077: invokevirtual setAccessible : (Z)V
    //   7080: aload #7
    //   7082: aconst_null
    //   7083: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   7086: pop
    //   7087: iinc #6, 1
    //   7090: iload_2
    //   7091: ifeq -> 6952
    //   7094: sipush #22857
    //   7097: sipush #-20996
    //   7100: invokestatic a : (II)Ljava/lang/String;
    //   7103: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   7106: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   7109: astore #4
    //   7111: aload #4
    //   7113: arraylength
    //   7114: istore #5
    //   7116: iconst_0
    //   7117: istore #6
    //   7119: iload #6
    //   7121: iload #5
    //   7123: if_icmpge -> 7259
    //   7126: aload #4
    //   7128: iload #6
    //   7130: aaload
    //   7131: astore #7
    //   7133: aload #7
    //   7135: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   7138: pop
    //   7139: aload #7
    //   7141: invokevirtual getModifiers : ()I
    //   7144: invokestatic isStatic : (I)Z
    //   7147: ifeq -> 7245
    //   7150: aload #7
    //   7152: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   7155: arraylength
    //   7156: iconst_2
    //   7157: if_icmpne -> 7245
    //   7160: goto -> 7167
    //   7163: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7166: athrow
    //   7167: aload #7
    //   7169: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   7172: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   7175: if_acmpne -> 7245
    //   7178: goto -> 7185
    //   7181: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7184: athrow
    //   7185: aload #7
    //   7187: iconst_1
    //   7188: invokevirtual setAccessible : (Z)V
    //   7191: aload #7
    //   7193: aconst_null
    //   7194: iconst_2
    //   7195: anewarray java/lang/Object
    //   7198: dup
    //   7199: iconst_0
    //   7200: aload_0
    //   7201: aastore
    //   7202: dup
    //   7203: iconst_1
    //   7204: aload_1
    //   7205: ifnonnull -> 7223
    //   7208: goto -> 7215
    //   7211: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7214: athrow
    //   7215: aload_1
    //   7216: goto -> 7230
    //   7219: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7222: athrow
    //   7223: aload_1
    //   7224: checkcast [B
    //   7227: invokevirtual clone : ()Ljava/lang/Object;
    //   7230: aastore
    //   7231: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   7234: checkcast java/lang/Boolean
    //   7237: invokevirtual booleanValue : ()Z
    //   7240: istore_3
    //   7241: iload_2
    //   7242: ifeq -> 7259
    //   7245: iinc #6, 1
    //   7248: iload_2
    //   7249: ifeq -> 7119
    //   7252: goto -> 7259
    //   7255: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7258: athrow
    //   7259: iload_2
    //   7260: ifeq -> 7601
    //   7263: sipush #22859
    //   7266: sipush #-13209
    //   7269: invokestatic a : (II)Ljava/lang/String;
    //   7272: iconst_1
    //   7273: ldc burp/Zlo0
    //   7275: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   7278: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   7281: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   7284: astore #4
    //   7286: aload #4
    //   7288: arraylength
    //   7289: istore #5
    //   7291: iconst_0
    //   7292: istore #6
    //   7294: iload #6
    //   7296: iload #5
    //   7298: if_icmpge -> 7436
    //   7301: aload #4
    //   7303: iload #6
    //   7305: aaload
    //   7306: astore #7
    //   7308: aload #7
    //   7310: invokevirtual getModifiers : ()I
    //   7313: invokestatic isStatic : (I)Z
    //   7316: ifne -> 7326
    //   7319: goto -> 7429
    //   7322: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7325: athrow
    //   7326: aload #7
    //   7328: invokevirtual getType : ()Ljava/lang/Class;
    //   7331: astore #8
    //   7333: aload #8
    //   7335: ifnull -> 7416
    //   7338: aload #8
    //   7340: invokevirtual isPrimitive : ()Z
    //   7343: ifne -> 7416
    //   7346: goto -> 7353
    //   7349: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7352: athrow
    //   7353: aload #8
    //   7355: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7358: ifnull -> 7416
    //   7361: goto -> 7368
    //   7364: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7367: athrow
    //   7368: aload #8
    //   7370: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7373: invokevirtual getName : ()Ljava/lang/String;
    //   7376: ifnull -> 7416
    //   7379: goto -> 7386
    //   7382: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7385: athrow
    //   7386: aload #8
    //   7388: invokevirtual getPackage : ()Ljava/lang/Package;
    //   7391: invokevirtual getName : ()Ljava/lang/String;
    //   7394: sipush #22856
    //   7397: sipush #28683
    //   7400: invokestatic a : (II)Ljava/lang/String;
    //   7403: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   7406: ifne -> 7416
    //   7409: goto -> 7416
    //   7412: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7415: athrow
    //   7416: aload #7
    //   7418: iconst_1
    //   7419: invokevirtual setAccessible : (Z)V
    //   7422: aload #7
    //   7424: aconst_null
    //   7425: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   7428: pop
    //   7429: iinc #6, 1
    //   7432: iload_2
    //   7433: ifeq -> 7294
    //   7436: sipush #22851
    //   7439: sipush #-19690
    //   7442: invokestatic a : (II)Ljava/lang/String;
    //   7445: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   7448: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   7451: astore #4
    //   7453: aload #4
    //   7455: arraylength
    //   7456: istore #5
    //   7458: iconst_0
    //   7459: istore #6
    //   7461: iload #6
    //   7463: iload #5
    //   7465: if_icmpge -> 7601
    //   7468: aload #4
    //   7470: iload #6
    //   7472: aaload
    //   7473: astore #7
    //   7475: aload #7
    //   7477: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   7480: pop
    //   7481: aload #7
    //   7483: invokevirtual getModifiers : ()I
    //   7486: invokestatic isStatic : (I)Z
    //   7489: ifeq -> 7587
    //   7492: aload #7
    //   7494: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   7497: arraylength
    //   7498: iconst_2
    //   7499: if_icmpne -> 7587
    //   7502: goto -> 7509
    //   7505: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7508: athrow
    //   7509: aload #7
    //   7511: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   7514: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   7517: if_acmpne -> 7587
    //   7520: goto -> 7527
    //   7523: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7526: athrow
    //   7527: aload #7
    //   7529: iconst_1
    //   7530: invokevirtual setAccessible : (Z)V
    //   7533: aload #7
    //   7535: aconst_null
    //   7536: iconst_2
    //   7537: anewarray java/lang/Object
    //   7540: dup
    //   7541: iconst_0
    //   7542: aload_0
    //   7543: aastore
    //   7544: dup
    //   7545: iconst_1
    //   7546: aload_1
    //   7547: ifnonnull -> 7565
    //   7550: goto -> 7557
    //   7553: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7556: athrow
    //   7557: aload_1
    //   7558: goto -> 7572
    //   7561: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7564: athrow
    //   7565: aload_1
    //   7566: checkcast [B
    //   7569: invokevirtual clone : ()Ljava/lang/Object;
    //   7572: aastore
    //   7573: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   7576: checkcast java/lang/Boolean
    //   7579: invokevirtual booleanValue : ()Z
    //   7582: istore_3
    //   7583: iload_2
    //   7584: ifeq -> 7601
    //   7587: iinc #6, 1
    //   7590: iload_2
    //   7591: ifeq -> 7461
    //   7594: goto -> 7601
    //   7597: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   7600: athrow
    //   7601: iload_3
    //   7602: ireturn
    //   7603: astore_3
    //   7604: new java/lang/Exception
    //   7607: dup
    //   7608: aload_3
    //   7609: invokevirtual getMessage : ()Ljava/lang/String;
    //   7612: invokespecial <init> : (Ljava/lang/String;)V
    //   7615: athrow
    // Exception table:
    //   from	to	target	type
    //   4	5413	7603	java/lang/Throwable
    //   79	93	93	java/lang/Throwable
    //   104	117	120	java/lang/Throwable
    //   109	132	135	java/lang/Throwable
    //   124	150	153	java/lang/Throwable
    //   139	180	183	java/lang/Throwable
    //   243	270	273	java/lang/Throwable
    //   260	291	294	java/lang/Throwable
    //   277	321	324	java/lang/Throwable
    //   298	332	332	java/lang/Throwable
    //   343	359	362	java/lang/Throwable
    //   4774	4788	4788	java/lang/Throwable
    //   4799	4812	4815	java/lang/Throwable
    //   4804	4827	4830	java/lang/Throwable
    //   4819	4845	4848	java/lang/Throwable
    //   4834	4875	4878	java/lang/Throwable
    //   4941	4968	4971	java/lang/Throwable
    //   4958	4986	4989	java/lang/Throwable
    //   4975	5016	5019	java/lang/Throwable
    //   4993	5027	5027	java/lang/Throwable
    //   5049	5060	5063	java/lang/Throwable
    //   5115	5129	5129	java/lang/Throwable
    //   5140	5153	5156	java/lang/Throwable
    //   5145	5168	5171	java/lang/Throwable
    //   5160	5186	5189	java/lang/Throwable
    //   5175	5216	5219	java/lang/Throwable
    //   5282	5309	5312	java/lang/Throwable
    //   5299	5327	5330	java/lang/Throwable
    //   5316	5357	5360	java/lang/Throwable
    //   5334	5368	5368	java/lang/Throwable
    //   5390	5401	5404	java/lang/Throwable
    //   5414	6144	7603	java/lang/Throwable
    //   5504	5518	5518	java/lang/Throwable
    //   5529	5542	5545	java/lang/Throwable
    //   5534	5557	5560	java/lang/Throwable
    //   5549	5575	5578	java/lang/Throwable
    //   5564	5605	5608	java/lang/Throwable
    //   5671	5698	5701	java/lang/Throwable
    //   5688	5716	5719	java/lang/Throwable
    //   5705	5746	5749	java/lang/Throwable
    //   5723	5757	5757	java/lang/Throwable
    //   5779	5790	5793	java/lang/Throwable
    //   5846	5860	5860	java/lang/Throwable
    //   5871	5884	5887	java/lang/Throwable
    //   5876	5899	5902	java/lang/Throwable
    //   5891	5917	5920	java/lang/Throwable
    //   5906	5947	5950	java/lang/Throwable
    //   6013	6040	6043	java/lang/Throwable
    //   6030	6058	6061	java/lang/Throwable
    //   6047	6088	6091	java/lang/Throwable
    //   6065	6099	6099	java/lang/Throwable
    //   6121	6132	6135	java/lang/Throwable
    //   6145	6875	7603	java/lang/Throwable
    //   6235	6249	6249	java/lang/Throwable
    //   6260	6273	6276	java/lang/Throwable
    //   6265	6288	6291	java/lang/Throwable
    //   6280	6306	6309	java/lang/Throwable
    //   6295	6336	6339	java/lang/Throwable
    //   6402	6429	6432	java/lang/Throwable
    //   6419	6447	6450	java/lang/Throwable
    //   6436	6477	6480	java/lang/Throwable
    //   6454	6488	6488	java/lang/Throwable
    //   6510	6521	6524	java/lang/Throwable
    //   6577	6591	6591	java/lang/Throwable
    //   6602	6615	6618	java/lang/Throwable
    //   6607	6630	6633	java/lang/Throwable
    //   6622	6648	6651	java/lang/Throwable
    //   6637	6678	6681	java/lang/Throwable
    //   6744	6771	6774	java/lang/Throwable
    //   6761	6789	6792	java/lang/Throwable
    //   6778	6819	6822	java/lang/Throwable
    //   6796	6830	6830	java/lang/Throwable
    //   6852	6863	6866	java/lang/Throwable
    //   6876	7602	7603	java/lang/Throwable
    //   6966	6980	6980	java/lang/Throwable
    //   6991	7004	7007	java/lang/Throwable
    //   6996	7019	7022	java/lang/Throwable
    //   7011	7037	7040	java/lang/Throwable
    //   7026	7067	7070	java/lang/Throwable
    //   7133	7160	7163	java/lang/Throwable
    //   7150	7178	7181	java/lang/Throwable
    //   7167	7208	7211	java/lang/Throwable
    //   7185	7219	7219	java/lang/Throwable
    //   7241	7252	7255	java/lang/Throwable
    //   7308	7322	7322	java/lang/Throwable
    //   7333	7346	7349	java/lang/Throwable
    //   7338	7361	7364	java/lang/Throwable
    //   7353	7379	7382	java/lang/Throwable
    //   7368	7409	7412	java/lang/Throwable
    //   7475	7502	7505	java/lang/Throwable
    //   7492	7520	7523	java/lang/Throwable
    //   7509	7550	7553	java/lang/Throwable
    //   7527	7561	7561	java/lang/Throwable
    //   7583	7594	7597	java/lang/Throwable
  }
  
  static void Zz(Object paramObject) {
    Zkqx.Ze = a(22870, -28878);
    Zkqx.ZW = new BigInteger(a(22868, 6073));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zbqk.ZZ.charAt(Math.abs(((BigInteger)Ztzh.ZT).intValue() % 32)) <= Zrka.Zy.charAt(Math.abs(((BigInteger)Zml.ZR).intValue() % 32))) {
          try {
            Zsts.Zo(Class.forName(a(22864, -9588)));
            if (!bool)
              Zl_k.Zj(Class.forName(a(22858, -14353))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zl_k.Zj(Class.forName(a(22858, -14353)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #26
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'à601GÏï\\t6êgÞûÑÓ\\tU¾ SeC£\\tñ·ÁÄå\\túÕsMíÈ+F\\tRfO±ÖTÃ\\bVÿæ\\b_`Öl\\tº{ìÑµI\\t£XÑ'WÍ\\têqW­JG\\ti!Ó£Z@(\\t¿¶Û!øE1E)?Ò\\tösòÝRm\\t/#Éºf_\\tñ>0ÁgÞóMrµ¡\\f~ÑÆ¢/40Îiºûd¬úÕÕLAæX:åÚJU}86°À·«jp\\r°=7QèÅxJÁ±È(\\tòrÍ¡à BeB?<^æ*5ü`(ºýÐgclõj×m¯¢&3Ma¹ .\\fnäÂ¯ÆéDRpQåtªéXûô\\t?`c,\\bz\\t/fbýql\\tì¶±!µEÅ9uæ+'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #56
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
    //   68: ldc '_´dm÷«%\\twúóÍ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #35
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
    //   129: putstatic burp/Zstf.a : [Ljava/lang/String;
    //   132: bipush #26
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zstf.b : [Ljava/lang/String;
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
    //   212: bipush #16
    //   214: goto -> 244
    //   217: bipush #83
    //   219: goto -> 244
    //   222: bipush #77
    //   224: goto -> 244
    //   227: bipush #9
    //   229: goto -> 244
    //   232: bipush #7
    //   234: goto -> 244
    //   237: bipush #91
    //   239: goto -> 244
    //   242: bipush #110
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
    //   304: iconst_1
    //   305: bipush #32
    //   307: newarray byte
    //   309: dup
    //   310: iconst_0
    //   311: bipush #88
    //   313: bastore
    //   314: dup
    //   315: iconst_1
    //   316: bipush #-20
    //   318: bastore
    //   319: dup
    //   320: iconst_2
    //   321: bipush #-111
    //   323: bastore
    //   324: dup
    //   325: iconst_3
    //   326: bipush #-52
    //   328: bastore
    //   329: dup
    //   330: iconst_4
    //   331: bipush #12
    //   333: bastore
    //   334: dup
    //   335: iconst_5
    //   336: bipush #-106
    //   338: bastore
    //   339: dup
    //   340: bipush #6
    //   342: bipush #-113
    //   344: bastore
    //   345: dup
    //   346: bipush #7
    //   348: bipush #73
    //   350: bastore
    //   351: dup
    //   352: bipush #8
    //   354: bipush #25
    //   356: bastore
    //   357: dup
    //   358: bipush #9
    //   360: bipush #80
    //   362: bastore
    //   363: dup
    //   364: bipush #10
    //   366: bipush #96
    //   368: bastore
    //   369: dup
    //   370: bipush #11
    //   372: bipush #81
    //   374: bastore
    //   375: dup
    //   376: bipush #12
    //   378: bipush #-17
    //   380: bastore
    //   381: dup
    //   382: bipush #13
    //   384: bipush #106
    //   386: bastore
    //   387: dup
    //   388: bipush #14
    //   390: bipush #97
    //   392: bastore
    //   393: dup
    //   394: bipush #15
    //   396: bipush #104
    //   398: bastore
    //   399: dup
    //   400: bipush #16
    //   402: bipush #-68
    //   404: bastore
    //   405: dup
    //   406: bipush #17
    //   408: bipush #-91
    //   410: bastore
    //   411: dup
    //   412: bipush #18
    //   414: bipush #-35
    //   416: bastore
    //   417: dup
    //   418: bipush #19
    //   420: bipush #-16
    //   422: bastore
    //   423: dup
    //   424: bipush #20
    //   426: bipush #-114
    //   428: bastore
    //   429: dup
    //   430: bipush #21
    //   432: bipush #88
    //   434: bastore
    //   435: dup
    //   436: bipush #22
    //   438: bipush #-32
    //   440: bastore
    //   441: dup
    //   442: bipush #23
    //   444: bipush #109
    //   446: bastore
    //   447: dup
    //   448: bipush #24
    //   450: bipush #-102
    //   452: bastore
    //   453: dup
    //   454: bipush #25
    //   456: bipush #-92
    //   458: bastore
    //   459: dup
    //   460: bipush #26
    //   462: bipush #-79
    //   464: bastore
    //   465: dup
    //   466: bipush #27
    //   468: bipush #44
    //   470: bastore
    //   471: dup
    //   472: bipush #28
    //   474: bipush #-120
    //   476: bastore
    //   477: dup
    //   478: bipush #29
    //   480: bipush #-29
    //   482: bastore
    //   483: dup
    //   484: bipush #30
    //   486: bipush #-6
    //   488: bastore
    //   489: dup
    //   490: bipush #31
    //   492: bipush #-117
    //   494: bastore
    //   495: invokespecial <init> : (I[B)V
    //   498: putstatic burp/Zstf.ZA : Ljava/lang/Object;
    //   501: sipush #22871
    //   504: sipush #13347
    //   507: invokestatic a : (II)Ljava/lang/String;
    //   510: putstatic burp/Zstf.ZZ : Ljava/lang/String;
    //   513: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5944) & 0xFFFF;
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
      char c = 'ò';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zstf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */