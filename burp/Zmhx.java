package burp;

import java.math.BigInteger;

class Zmhx extends ClassLoader {
  static Object ZQ;
  
  static String ZD;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean ZX(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zoa.ZI : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: invokevirtual toByteArray : ()[B
    //   13: astore_3
    //   14: new java/lang/StringBuilder
    //   17: dup
    //   18: invokespecial <init> : ()V
    //   21: astore #5
    //   23: aload #5
    //   25: sipush #-30464
    //   28: sipush #24959
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
    //   81: sipush #-30461
    //   84: sipush #31925
    //   87: invokestatic a : (II)Ljava/lang/String;
    //   90: ldc ''
    //   92: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   95: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   98: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: pop
    //   102: aload #5
    //   104: sipush #-30462
    //   107: sipush #22085
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
    //   686: sipush #-30463
    //   689: sipush #27131
    //   692: invokestatic a : (II)Ljava/lang/String;
    //   695: iconst_1
    //   696: ldc burp/Zek5
    //   698: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   701: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   704: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   707: astore_3
    //   708: aload_3
    //   709: arraylength
    //   710: istore #4
    //   712: iconst_0
    //   713: istore #5
    //   715: iload #5
    //   717: iload #4
    //   719: if_icmpge -> 856
    //   722: aload_3
    //   723: iload #5
    //   725: aaload
    //   726: astore #6
    //   728: aload #6
    //   730: invokevirtual getModifiers : ()I
    //   733: invokestatic isStatic : (I)Z
    //   736: ifne -> 746
    //   739: goto -> 849
    //   742: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   745: athrow
    //   746: aload #6
    //   748: invokevirtual getType : ()Ljava/lang/Class;
    //   751: astore #7
    //   753: aload #7
    //   755: ifnull -> 836
    //   758: aload #7
    //   760: invokevirtual isPrimitive : ()Z
    //   763: ifne -> 836
    //   766: goto -> 773
    //   769: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   772: athrow
    //   773: aload #7
    //   775: invokevirtual getPackage : ()Ljava/lang/Package;
    //   778: ifnull -> 836
    //   781: goto -> 788
    //   784: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   787: athrow
    //   788: aload #7
    //   790: invokevirtual getPackage : ()Ljava/lang/Package;
    //   793: invokevirtual getName : ()Ljava/lang/String;
    //   796: ifnull -> 836
    //   799: goto -> 806
    //   802: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   805: athrow
    //   806: aload #7
    //   808: invokevirtual getPackage : ()Ljava/lang/Package;
    //   811: invokevirtual getName : ()Ljava/lang/String;
    //   814: sipush #-30460
    //   817: sipush #2284
    //   820: invokestatic a : (II)Ljava/lang/String;
    //   823: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   826: ifne -> 836
    //   829: goto -> 836
    //   832: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   835: athrow
    //   836: aload #6
    //   838: iconst_1
    //   839: invokevirtual setAccessible : (Z)V
    //   842: aload #6
    //   844: aconst_null
    //   845: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   848: pop
    //   849: iinc #5, 1
    //   852: iload_2
    //   853: ifeq -> 715
    //   856: sipush #-30458
    //   859: sipush #11036
    //   862: invokestatic a : (II)Ljava/lang/String;
    //   865: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   868: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   871: astore_3
    //   872: aload_3
    //   873: arraylength
    //   874: istore #4
    //   876: iconst_0
    //   877: istore #5
    //   879: iload #5
    //   881: iload #4
    //   883: if_icmpge -> 1015
    //   886: aload_3
    //   887: iload #5
    //   889: aaload
    //   890: astore #6
    //   892: aload #6
    //   894: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   897: pop
    //   898: aload #6
    //   900: invokevirtual getModifiers : ()I
    //   903: invokestatic isStatic : (I)Z
    //   906: ifeq -> 1001
    //   909: aload #6
    //   911: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   914: arraylength
    //   915: iconst_2
    //   916: if_icmpne -> 1001
    //   919: goto -> 926
    //   922: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   925: athrow
    //   926: aload #6
    //   928: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   931: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   934: invokevirtual equals : (Ljava/lang/Object;)Z
    //   937: ifeq -> 1001
    //   940: goto -> 947
    //   943: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   946: athrow
    //   947: aload #6
    //   949: iconst_1
    //   950: invokevirtual setAccessible : (Z)V
    //   953: aload #6
    //   955: aconst_null
    //   956: iconst_2
    //   957: anewarray java/lang/Object
    //   960: dup
    //   961: iconst_0
    //   962: aload_0
    //   963: aastore
    //   964: dup
    //   965: iconst_1
    //   966: aload_1
    //   967: ifnonnull -> 985
    //   970: goto -> 977
    //   973: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   976: athrow
    //   977: aload_1
    //   978: goto -> 992
    //   981: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   984: athrow
    //   985: aload_1
    //   986: checkcast [B
    //   989: invokevirtual clone : ()Ljava/lang/Object;
    //   992: aastore
    //   993: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   996: pop
    //   997: iload_2
    //   998: ifeq -> 1015
    //   1001: iinc #5, 1
    //   1004: iload_2
    //   1005: ifeq -> 879
    //   1008: goto -> 1015
    //   1011: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1014: athrow
    //   1015: getstatic burp/Zzy5.ZG : Ljava/lang/Object;
    //   1018: checkcast java/math/BigInteger
    //   1021: invokevirtual toByteArray : ()[B
    //   1024: astore_3
    //   1025: bipush #32
    //   1027: newarray int
    //   1029: dup
    //   1030: iconst_0
    //   1031: ldc 876216579
    //   1033: iastore
    //   1034: dup
    //   1035: iconst_1
    //   1036: ldc 455999525
    //   1038: iastore
    //   1039: dup
    //   1040: iconst_2
    //   1041: ldc 1043334948
    //   1043: iastore
    //   1044: dup
    //   1045: iconst_3
    //   1046: ldc 439222784
    //   1048: iastore
    //   1049: dup
    //   1050: iconst_4
    //   1051: ldc 372376604
    //   1053: iastore
    //   1054: dup
    //   1055: iconst_5
    //   1056: ldc 707731490
    //   1058: iastore
    //   1059: dup
    //   1060: bipush #6
    //   1062: ldc 389426184
    //   1064: iastore
    //   1065: dup
    //   1066: bipush #7
    //   1068: ldc 973875457
    //   1070: iastore
    //   1071: dup
    //   1072: bipush #8
    //   1074: ldc 389160971
    //   1076: iastore
    //   1077: dup
    //   1078: bipush #9
    //   1080: ldc 907870729
    //   1082: iastore
    //   1083: dup
    //   1084: bipush #10
    //   1086: ldc 121057538
    //   1088: iastore
    //   1089: dup
    //   1090: bipush #11
    //   1092: ldc 840500228
    //   1094: iastore
    //   1095: dup
    //   1096: bipush #12
    //   1098: ldc 254150144
    //   1100: iastore
    //   1101: dup
    //   1102: bipush #13
    //   1104: ldc 924386310
    //   1106: iastore
    //   1107: dup
    //   1108: bipush #14
    //   1110: ldc 187632156
    //   1112: iastore
    //   1113: dup
    //   1114: bipush #15
    //   1116: ldc 874189824
    //   1118: iastore
    //   1119: dup
    //   1120: bipush #16
    //   1122: ldc 655302664
    //   1124: iastore
    //   1125: dup
    //   1126: bipush #17
    //   1128: ldc 890966315
    //   1130: iastore
    //   1131: dup
    //   1132: bipush #18
    //   1134: ldc 722417666
    //   1136: iastore
    //   1137: dup
    //   1138: bipush #19
    //   1140: ldc 1026621720
    //   1142: iastore
    //   1143: dup
    //   1144: bipush #20
    //   1146: ldc 957157408
    //   1148: iastore
    //   1149: dup
    //   1150: bipush #21
    //   1152: ldc 892536332
    //   1154: iastore
    //   1155: dup
    //   1156: bipush #22
    //   1158: ldc 689771012
    //   1160: iastore
    //   1161: dup
    //   1162: bipush #23
    //   1164: ldc 221709344
    //   1166: iastore
    //   1167: dup
    //   1168: bipush #24
    //   1170: ldc 940377620
    //   1172: iastore
    //   1173: dup
    //   1174: bipush #25
    //   1176: ldc 255209728
    //   1178: iastore
    //   1179: dup
    //   1180: bipush #26
    //   1182: ldc 1010368540
    //   1184: iastore
    //   1185: dup
    //   1186: bipush #27
    //   1188: ldc 220604441
    //   1190: iastore
    //   1191: dup
    //   1192: bipush #28
    //   1194: ldc 1008414755
    //   1196: iastore
    //   1197: dup
    //   1198: bipush #29
    //   1200: ldc 187049985
    //   1202: iastore
    //   1203: dup
    //   1204: bipush #30
    //   1206: ldc 943331329
    //   1208: iastore
    //   1209: dup
    //   1210: bipush #31
    //   1212: ldc 170788368
    //   1214: iastore
    //   1215: astore #5
    //   1217: bipush #64
    //   1219: newarray int
    //   1221: dup
    //   1222: iconst_0
    //   1223: ldc 16843776
    //   1225: iastore
    //   1226: dup
    //   1227: iconst_1
    //   1228: iconst_0
    //   1229: iastore
    //   1230: dup
    //   1231: iconst_2
    //   1232: ldc 65536
    //   1234: iastore
    //   1235: dup
    //   1236: iconst_3
    //   1237: ldc 16843780
    //   1239: iastore
    //   1240: dup
    //   1241: iconst_4
    //   1242: ldc 16842756
    //   1244: iastore
    //   1245: dup
    //   1246: iconst_5
    //   1247: ldc 66564
    //   1249: iastore
    //   1250: dup
    //   1251: bipush #6
    //   1253: iconst_4
    //   1254: iastore
    //   1255: dup
    //   1256: bipush #7
    //   1258: ldc 65536
    //   1260: iastore
    //   1261: dup
    //   1262: bipush #8
    //   1264: sipush #1024
    //   1267: iastore
    //   1268: dup
    //   1269: bipush #9
    //   1271: ldc 16843776
    //   1273: iastore
    //   1274: dup
    //   1275: bipush #10
    //   1277: ldc 16843780
    //   1279: iastore
    //   1280: dup
    //   1281: bipush #11
    //   1283: sipush #1024
    //   1286: iastore
    //   1287: dup
    //   1288: bipush #12
    //   1290: ldc 16778244
    //   1292: iastore
    //   1293: dup
    //   1294: bipush #13
    //   1296: ldc 16842756
    //   1298: iastore
    //   1299: dup
    //   1300: bipush #14
    //   1302: ldc 16777216
    //   1304: iastore
    //   1305: dup
    //   1306: bipush #15
    //   1308: iconst_4
    //   1309: iastore
    //   1310: dup
    //   1311: bipush #16
    //   1313: sipush #1028
    //   1316: iastore
    //   1317: dup
    //   1318: bipush #17
    //   1320: ldc 16778240
    //   1322: iastore
    //   1323: dup
    //   1324: bipush #18
    //   1326: ldc 16778240
    //   1328: iastore
    //   1329: dup
    //   1330: bipush #19
    //   1332: ldc 66560
    //   1334: iastore
    //   1335: dup
    //   1336: bipush #20
    //   1338: ldc 66560
    //   1340: iastore
    //   1341: dup
    //   1342: bipush #21
    //   1344: ldc 16842752
    //   1346: iastore
    //   1347: dup
    //   1348: bipush #22
    //   1350: ldc 16842752
    //   1352: iastore
    //   1353: dup
    //   1354: bipush #23
    //   1356: ldc 16778244
    //   1358: iastore
    //   1359: dup
    //   1360: bipush #24
    //   1362: ldc 65540
    //   1364: iastore
    //   1365: dup
    //   1366: bipush #25
    //   1368: ldc 16777220
    //   1370: iastore
    //   1371: dup
    //   1372: bipush #26
    //   1374: ldc 16777220
    //   1376: iastore
    //   1377: dup
    //   1378: bipush #27
    //   1380: ldc 65540
    //   1382: iastore
    //   1383: dup
    //   1384: bipush #28
    //   1386: iconst_0
    //   1387: iastore
    //   1388: dup
    //   1389: bipush #29
    //   1391: sipush #1028
    //   1394: iastore
    //   1395: dup
    //   1396: bipush #30
    //   1398: ldc 66564
    //   1400: iastore
    //   1401: dup
    //   1402: bipush #31
    //   1404: ldc 16777216
    //   1406: iastore
    //   1407: dup
    //   1408: bipush #32
    //   1410: ldc 65536
    //   1412: iastore
    //   1413: dup
    //   1414: bipush #33
    //   1416: ldc 16843780
    //   1418: iastore
    //   1419: dup
    //   1420: bipush #34
    //   1422: iconst_4
    //   1423: iastore
    //   1424: dup
    //   1425: bipush #35
    //   1427: ldc 16842752
    //   1429: iastore
    //   1430: dup
    //   1431: bipush #36
    //   1433: ldc 16843776
    //   1435: iastore
    //   1436: dup
    //   1437: bipush #37
    //   1439: ldc 16777216
    //   1441: iastore
    //   1442: dup
    //   1443: bipush #38
    //   1445: ldc 16777216
    //   1447: iastore
    //   1448: dup
    //   1449: bipush #39
    //   1451: sipush #1024
    //   1454: iastore
    //   1455: dup
    //   1456: bipush #40
    //   1458: ldc 16842756
    //   1460: iastore
    //   1461: dup
    //   1462: bipush #41
    //   1464: ldc 65536
    //   1466: iastore
    //   1467: dup
    //   1468: bipush #42
    //   1470: ldc 66560
    //   1472: iastore
    //   1473: dup
    //   1474: bipush #43
    //   1476: ldc 16777220
    //   1478: iastore
    //   1479: dup
    //   1480: bipush #44
    //   1482: sipush #1024
    //   1485: iastore
    //   1486: dup
    //   1487: bipush #45
    //   1489: iconst_4
    //   1490: iastore
    //   1491: dup
    //   1492: bipush #46
    //   1494: ldc 16778244
    //   1496: iastore
    //   1497: dup
    //   1498: bipush #47
    //   1500: ldc 66564
    //   1502: iastore
    //   1503: dup
    //   1504: bipush #48
    //   1506: ldc 16843780
    //   1508: iastore
    //   1509: dup
    //   1510: bipush #49
    //   1512: ldc 65540
    //   1514: iastore
    //   1515: dup
    //   1516: bipush #50
    //   1518: ldc 16842752
    //   1520: iastore
    //   1521: dup
    //   1522: bipush #51
    //   1524: ldc 16778244
    //   1526: iastore
    //   1527: dup
    //   1528: bipush #52
    //   1530: ldc 16777220
    //   1532: iastore
    //   1533: dup
    //   1534: bipush #53
    //   1536: sipush #1028
    //   1539: iastore
    //   1540: dup
    //   1541: bipush #54
    //   1543: ldc 66564
    //   1545: iastore
    //   1546: dup
    //   1547: bipush #55
    //   1549: ldc 16843776
    //   1551: iastore
    //   1552: dup
    //   1553: bipush #56
    //   1555: sipush #1028
    //   1558: iastore
    //   1559: dup
    //   1560: bipush #57
    //   1562: ldc 16778240
    //   1564: iastore
    //   1565: dup
    //   1566: bipush #58
    //   1568: ldc 16778240
    //   1570: iastore
    //   1571: dup
    //   1572: bipush #59
    //   1574: iconst_0
    //   1575: iastore
    //   1576: dup
    //   1577: bipush #60
    //   1579: ldc 65540
    //   1581: iastore
    //   1582: dup
    //   1583: bipush #61
    //   1585: ldc 66560
    //   1587: iastore
    //   1588: dup
    //   1589: bipush #62
    //   1591: iconst_0
    //   1592: iastore
    //   1593: dup
    //   1594: bipush #63
    //   1596: ldc 16842756
    //   1598: iastore
    //   1599: astore #6
    //   1601: bipush #64
    //   1603: newarray int
    //   1605: dup
    //   1606: iconst_0
    //   1607: ldc -2146402272
    //   1609: iastore
    //   1610: dup
    //   1611: iconst_1
    //   1612: ldc -2147450880
    //   1614: iastore
    //   1615: dup
    //   1616: iconst_2
    //   1617: ldc 32768
    //   1619: iastore
    //   1620: dup
    //   1621: iconst_3
    //   1622: ldc 1081376
    //   1624: iastore
    //   1625: dup
    //   1626: iconst_4
    //   1627: ldc 1048576
    //   1629: iastore
    //   1630: dup
    //   1631: iconst_5
    //   1632: bipush #32
    //   1634: iastore
    //   1635: dup
    //   1636: bipush #6
    //   1638: ldc -2146435040
    //   1640: iastore
    //   1641: dup
    //   1642: bipush #7
    //   1644: ldc -2147450848
    //   1646: iastore
    //   1647: dup
    //   1648: bipush #8
    //   1650: ldc -2147483616
    //   1652: iastore
    //   1653: dup
    //   1654: bipush #9
    //   1656: ldc -2146402272
    //   1658: iastore
    //   1659: dup
    //   1660: bipush #10
    //   1662: ldc -2146402304
    //   1664: iastore
    //   1665: dup
    //   1666: bipush #11
    //   1668: ldc -2147483648
    //   1670: iastore
    //   1671: dup
    //   1672: bipush #12
    //   1674: ldc -2147450880
    //   1676: iastore
    //   1677: dup
    //   1678: bipush #13
    //   1680: ldc 1048576
    //   1682: iastore
    //   1683: dup
    //   1684: bipush #14
    //   1686: bipush #32
    //   1688: iastore
    //   1689: dup
    //   1690: bipush #15
    //   1692: ldc -2146435040
    //   1694: iastore
    //   1695: dup
    //   1696: bipush #16
    //   1698: ldc 1081344
    //   1700: iastore
    //   1701: dup
    //   1702: bipush #17
    //   1704: ldc 1048608
    //   1706: iastore
    //   1707: dup
    //   1708: bipush #18
    //   1710: ldc -2147450848
    //   1712: iastore
    //   1713: dup
    //   1714: bipush #19
    //   1716: iconst_0
    //   1717: iastore
    //   1718: dup
    //   1719: bipush #20
    //   1721: ldc -2147483648
    //   1723: iastore
    //   1724: dup
    //   1725: bipush #21
    //   1727: ldc 32768
    //   1729: iastore
    //   1730: dup
    //   1731: bipush #22
    //   1733: ldc 1081376
    //   1735: iastore
    //   1736: dup
    //   1737: bipush #23
    //   1739: ldc -2146435072
    //   1741: iastore
    //   1742: dup
    //   1743: bipush #24
    //   1745: ldc 1048608
    //   1747: iastore
    //   1748: dup
    //   1749: bipush #25
    //   1751: ldc -2147483616
    //   1753: iastore
    //   1754: dup
    //   1755: bipush #26
    //   1757: iconst_0
    //   1758: iastore
    //   1759: dup
    //   1760: bipush #27
    //   1762: ldc 1081344
    //   1764: iastore
    //   1765: dup
    //   1766: bipush #28
    //   1768: ldc 32800
    //   1770: iastore
    //   1771: dup
    //   1772: bipush #29
    //   1774: ldc -2146402304
    //   1776: iastore
    //   1777: dup
    //   1778: bipush #30
    //   1780: ldc -2146435072
    //   1782: iastore
    //   1783: dup
    //   1784: bipush #31
    //   1786: ldc 32800
    //   1788: iastore
    //   1789: dup
    //   1790: bipush #32
    //   1792: iconst_0
    //   1793: iastore
    //   1794: dup
    //   1795: bipush #33
    //   1797: ldc 1081376
    //   1799: iastore
    //   1800: dup
    //   1801: bipush #34
    //   1803: ldc -2146435040
    //   1805: iastore
    //   1806: dup
    //   1807: bipush #35
    //   1809: ldc 1048576
    //   1811: iastore
    //   1812: dup
    //   1813: bipush #36
    //   1815: ldc -2147450848
    //   1817: iastore
    //   1818: dup
    //   1819: bipush #37
    //   1821: ldc -2146435072
    //   1823: iastore
    //   1824: dup
    //   1825: bipush #38
    //   1827: ldc -2146402304
    //   1829: iastore
    //   1830: dup
    //   1831: bipush #39
    //   1833: ldc 32768
    //   1835: iastore
    //   1836: dup
    //   1837: bipush #40
    //   1839: ldc -2146435072
    //   1841: iastore
    //   1842: dup
    //   1843: bipush #41
    //   1845: ldc -2147450880
    //   1847: iastore
    //   1848: dup
    //   1849: bipush #42
    //   1851: bipush #32
    //   1853: iastore
    //   1854: dup
    //   1855: bipush #43
    //   1857: ldc -2146402272
    //   1859: iastore
    //   1860: dup
    //   1861: bipush #44
    //   1863: ldc 1081376
    //   1865: iastore
    //   1866: dup
    //   1867: bipush #45
    //   1869: bipush #32
    //   1871: iastore
    //   1872: dup
    //   1873: bipush #46
    //   1875: ldc 32768
    //   1877: iastore
    //   1878: dup
    //   1879: bipush #47
    //   1881: ldc -2147483648
    //   1883: iastore
    //   1884: dup
    //   1885: bipush #48
    //   1887: ldc 32800
    //   1889: iastore
    //   1890: dup
    //   1891: bipush #49
    //   1893: ldc -2146402304
    //   1895: iastore
    //   1896: dup
    //   1897: bipush #50
    //   1899: ldc 1048576
    //   1901: iastore
    //   1902: dup
    //   1903: bipush #51
    //   1905: ldc -2147483616
    //   1907: iastore
    //   1908: dup
    //   1909: bipush #52
    //   1911: ldc 1048608
    //   1913: iastore
    //   1914: dup
    //   1915: bipush #53
    //   1917: ldc -2147450848
    //   1919: iastore
    //   1920: dup
    //   1921: bipush #54
    //   1923: ldc -2147483616
    //   1925: iastore
    //   1926: dup
    //   1927: bipush #55
    //   1929: ldc 1048608
    //   1931: iastore
    //   1932: dup
    //   1933: bipush #56
    //   1935: ldc 1081344
    //   1937: iastore
    //   1938: dup
    //   1939: bipush #57
    //   1941: iconst_0
    //   1942: iastore
    //   1943: dup
    //   1944: bipush #58
    //   1946: ldc -2147450880
    //   1948: iastore
    //   1949: dup
    //   1950: bipush #59
    //   1952: ldc 32800
    //   1954: iastore
    //   1955: dup
    //   1956: bipush #60
    //   1958: ldc -2147483648
    //   1960: iastore
    //   1961: dup
    //   1962: bipush #61
    //   1964: ldc -2146435040
    //   1966: iastore
    //   1967: dup
    //   1968: bipush #62
    //   1970: ldc -2146402272
    //   1972: iastore
    //   1973: dup
    //   1974: bipush #63
    //   1976: ldc 1081344
    //   1978: iastore
    //   1979: astore #7
    //   1981: bipush #64
    //   1983: newarray int
    //   1985: dup
    //   1986: iconst_0
    //   1987: sipush #520
    //   1990: iastore
    //   1991: dup
    //   1992: iconst_1
    //   1993: ldc 134349312
    //   1995: iastore
    //   1996: dup
    //   1997: iconst_2
    //   1998: iconst_0
    //   1999: iastore
    //   2000: dup
    //   2001: iconst_3
    //   2002: ldc 134348808
    //   2004: iastore
    //   2005: dup
    //   2006: iconst_4
    //   2007: ldc 134218240
    //   2009: iastore
    //   2010: dup
    //   2011: iconst_5
    //   2012: iconst_0
    //   2013: iastore
    //   2014: dup
    //   2015: bipush #6
    //   2017: ldc 131592
    //   2019: iastore
    //   2020: dup
    //   2021: bipush #7
    //   2023: ldc 134218240
    //   2025: iastore
    //   2026: dup
    //   2027: bipush #8
    //   2029: ldc 131080
    //   2031: iastore
    //   2032: dup
    //   2033: bipush #9
    //   2035: ldc 134217736
    //   2037: iastore
    //   2038: dup
    //   2039: bipush #10
    //   2041: ldc 134217736
    //   2043: iastore
    //   2044: dup
    //   2045: bipush #11
    //   2047: ldc 131072
    //   2049: iastore
    //   2050: dup
    //   2051: bipush #12
    //   2053: ldc 134349320
    //   2055: iastore
    //   2056: dup
    //   2057: bipush #13
    //   2059: ldc 131080
    //   2061: iastore
    //   2062: dup
    //   2063: bipush #14
    //   2065: ldc 134348800
    //   2067: iastore
    //   2068: dup
    //   2069: bipush #15
    //   2071: sipush #520
    //   2074: iastore
    //   2075: dup
    //   2076: bipush #16
    //   2078: ldc 134217728
    //   2080: iastore
    //   2081: dup
    //   2082: bipush #17
    //   2084: bipush #8
    //   2086: iastore
    //   2087: dup
    //   2088: bipush #18
    //   2090: ldc 134349312
    //   2092: iastore
    //   2093: dup
    //   2094: bipush #19
    //   2096: sipush #512
    //   2099: iastore
    //   2100: dup
    //   2101: bipush #20
    //   2103: ldc 131584
    //   2105: iastore
    //   2106: dup
    //   2107: bipush #21
    //   2109: ldc 134348800
    //   2111: iastore
    //   2112: dup
    //   2113: bipush #22
    //   2115: ldc 134348808
    //   2117: iastore
    //   2118: dup
    //   2119: bipush #23
    //   2121: ldc 131592
    //   2123: iastore
    //   2124: dup
    //   2125: bipush #24
    //   2127: ldc 134218248
    //   2129: iastore
    //   2130: dup
    //   2131: bipush #25
    //   2133: ldc 131584
    //   2135: iastore
    //   2136: dup
    //   2137: bipush #26
    //   2139: ldc 131072
    //   2141: iastore
    //   2142: dup
    //   2143: bipush #27
    //   2145: ldc 134218248
    //   2147: iastore
    //   2148: dup
    //   2149: bipush #28
    //   2151: bipush #8
    //   2153: iastore
    //   2154: dup
    //   2155: bipush #29
    //   2157: ldc 134349320
    //   2159: iastore
    //   2160: dup
    //   2161: bipush #30
    //   2163: sipush #512
    //   2166: iastore
    //   2167: dup
    //   2168: bipush #31
    //   2170: ldc 134217728
    //   2172: iastore
    //   2173: dup
    //   2174: bipush #32
    //   2176: ldc 134349312
    //   2178: iastore
    //   2179: dup
    //   2180: bipush #33
    //   2182: ldc 134217728
    //   2184: iastore
    //   2185: dup
    //   2186: bipush #34
    //   2188: ldc 131080
    //   2190: iastore
    //   2191: dup
    //   2192: bipush #35
    //   2194: sipush #520
    //   2197: iastore
    //   2198: dup
    //   2199: bipush #36
    //   2201: ldc 131072
    //   2203: iastore
    //   2204: dup
    //   2205: bipush #37
    //   2207: ldc 134349312
    //   2209: iastore
    //   2210: dup
    //   2211: bipush #38
    //   2213: ldc 134218240
    //   2215: iastore
    //   2216: dup
    //   2217: bipush #39
    //   2219: iconst_0
    //   2220: iastore
    //   2221: dup
    //   2222: bipush #40
    //   2224: sipush #512
    //   2227: iastore
    //   2228: dup
    //   2229: bipush #41
    //   2231: ldc 131080
    //   2233: iastore
    //   2234: dup
    //   2235: bipush #42
    //   2237: ldc 134349320
    //   2239: iastore
    //   2240: dup
    //   2241: bipush #43
    //   2243: ldc 134218240
    //   2245: iastore
    //   2246: dup
    //   2247: bipush #44
    //   2249: ldc 134217736
    //   2251: iastore
    //   2252: dup
    //   2253: bipush #45
    //   2255: sipush #512
    //   2258: iastore
    //   2259: dup
    //   2260: bipush #46
    //   2262: iconst_0
    //   2263: iastore
    //   2264: dup
    //   2265: bipush #47
    //   2267: ldc 134348808
    //   2269: iastore
    //   2270: dup
    //   2271: bipush #48
    //   2273: ldc 134218248
    //   2275: iastore
    //   2276: dup
    //   2277: bipush #49
    //   2279: ldc 131072
    //   2281: iastore
    //   2282: dup
    //   2283: bipush #50
    //   2285: ldc 134217728
    //   2287: iastore
    //   2288: dup
    //   2289: bipush #51
    //   2291: ldc 134349320
    //   2293: iastore
    //   2294: dup
    //   2295: bipush #52
    //   2297: bipush #8
    //   2299: iastore
    //   2300: dup
    //   2301: bipush #53
    //   2303: ldc 131592
    //   2305: iastore
    //   2306: dup
    //   2307: bipush #54
    //   2309: ldc 131584
    //   2311: iastore
    //   2312: dup
    //   2313: bipush #55
    //   2315: ldc 134217736
    //   2317: iastore
    //   2318: dup
    //   2319: bipush #56
    //   2321: ldc 134348800
    //   2323: iastore
    //   2324: dup
    //   2325: bipush #57
    //   2327: ldc 134218248
    //   2329: iastore
    //   2330: dup
    //   2331: bipush #58
    //   2333: sipush #520
    //   2336: iastore
    //   2337: dup
    //   2338: bipush #59
    //   2340: ldc 134348800
    //   2342: iastore
    //   2343: dup
    //   2344: bipush #60
    //   2346: ldc 131592
    //   2348: iastore
    //   2349: dup
    //   2350: bipush #61
    //   2352: bipush #8
    //   2354: iastore
    //   2355: dup
    //   2356: bipush #62
    //   2358: ldc 134348808
    //   2360: iastore
    //   2361: dup
    //   2362: bipush #63
    //   2364: ldc 131584
    //   2366: iastore
    //   2367: astore #8
    //   2369: bipush #64
    //   2371: newarray int
    //   2373: dup
    //   2374: iconst_0
    //   2375: ldc 8396801
    //   2377: iastore
    //   2378: dup
    //   2379: iconst_1
    //   2380: sipush #8321
    //   2383: iastore
    //   2384: dup
    //   2385: iconst_2
    //   2386: sipush #8321
    //   2389: iastore
    //   2390: dup
    //   2391: iconst_3
    //   2392: sipush #128
    //   2395: iastore
    //   2396: dup
    //   2397: iconst_4
    //   2398: ldc 8396928
    //   2400: iastore
    //   2401: dup
    //   2402: iconst_5
    //   2403: ldc 8388737
    //   2405: iastore
    //   2406: dup
    //   2407: bipush #6
    //   2409: ldc 8388609
    //   2411: iastore
    //   2412: dup
    //   2413: bipush #7
    //   2415: sipush #8193
    //   2418: iastore
    //   2419: dup
    //   2420: bipush #8
    //   2422: iconst_0
    //   2423: iastore
    //   2424: dup
    //   2425: bipush #9
    //   2427: ldc 8396800
    //   2429: iastore
    //   2430: dup
    //   2431: bipush #10
    //   2433: ldc 8396800
    //   2435: iastore
    //   2436: dup
    //   2437: bipush #11
    //   2439: ldc 8396929
    //   2441: iastore
    //   2442: dup
    //   2443: bipush #12
    //   2445: sipush #129
    //   2448: iastore
    //   2449: dup
    //   2450: bipush #13
    //   2452: iconst_0
    //   2453: iastore
    //   2454: dup
    //   2455: bipush #14
    //   2457: ldc 8388736
    //   2459: iastore
    //   2460: dup
    //   2461: bipush #15
    //   2463: ldc 8388609
    //   2465: iastore
    //   2466: dup
    //   2467: bipush #16
    //   2469: iconst_1
    //   2470: iastore
    //   2471: dup
    //   2472: bipush #17
    //   2474: sipush #8192
    //   2477: iastore
    //   2478: dup
    //   2479: bipush #18
    //   2481: ldc 8388608
    //   2483: iastore
    //   2484: dup
    //   2485: bipush #19
    //   2487: ldc 8396801
    //   2489: iastore
    //   2490: dup
    //   2491: bipush #20
    //   2493: sipush #128
    //   2496: iastore
    //   2497: dup
    //   2498: bipush #21
    //   2500: ldc 8388608
    //   2502: iastore
    //   2503: dup
    //   2504: bipush #22
    //   2506: sipush #8193
    //   2509: iastore
    //   2510: dup
    //   2511: bipush #23
    //   2513: sipush #8320
    //   2516: iastore
    //   2517: dup
    //   2518: bipush #24
    //   2520: ldc 8388737
    //   2522: iastore
    //   2523: dup
    //   2524: bipush #25
    //   2526: iconst_1
    //   2527: iastore
    //   2528: dup
    //   2529: bipush #26
    //   2531: sipush #8320
    //   2534: iastore
    //   2535: dup
    //   2536: bipush #27
    //   2538: ldc 8388736
    //   2540: iastore
    //   2541: dup
    //   2542: bipush #28
    //   2544: sipush #8192
    //   2547: iastore
    //   2548: dup
    //   2549: bipush #29
    //   2551: ldc 8396928
    //   2553: iastore
    //   2554: dup
    //   2555: bipush #30
    //   2557: ldc 8396929
    //   2559: iastore
    //   2560: dup
    //   2561: bipush #31
    //   2563: sipush #129
    //   2566: iastore
    //   2567: dup
    //   2568: bipush #32
    //   2570: ldc 8388736
    //   2572: iastore
    //   2573: dup
    //   2574: bipush #33
    //   2576: ldc 8388609
    //   2578: iastore
    //   2579: dup
    //   2580: bipush #34
    //   2582: ldc 8396800
    //   2584: iastore
    //   2585: dup
    //   2586: bipush #35
    //   2588: ldc 8396929
    //   2590: iastore
    //   2591: dup
    //   2592: bipush #36
    //   2594: sipush #129
    //   2597: iastore
    //   2598: dup
    //   2599: bipush #37
    //   2601: iconst_0
    //   2602: iastore
    //   2603: dup
    //   2604: bipush #38
    //   2606: iconst_0
    //   2607: iastore
    //   2608: dup
    //   2609: bipush #39
    //   2611: ldc 8396800
    //   2613: iastore
    //   2614: dup
    //   2615: bipush #40
    //   2617: sipush #8320
    //   2620: iastore
    //   2621: dup
    //   2622: bipush #41
    //   2624: ldc 8388736
    //   2626: iastore
    //   2627: dup
    //   2628: bipush #42
    //   2630: ldc 8388737
    //   2632: iastore
    //   2633: dup
    //   2634: bipush #43
    //   2636: iconst_1
    //   2637: iastore
    //   2638: dup
    //   2639: bipush #44
    //   2641: ldc 8396801
    //   2643: iastore
    //   2644: dup
    //   2645: bipush #45
    //   2647: sipush #8321
    //   2650: iastore
    //   2651: dup
    //   2652: bipush #46
    //   2654: sipush #8321
    //   2657: iastore
    //   2658: dup
    //   2659: bipush #47
    //   2661: sipush #128
    //   2664: iastore
    //   2665: dup
    //   2666: bipush #48
    //   2668: ldc 8396929
    //   2670: iastore
    //   2671: dup
    //   2672: bipush #49
    //   2674: sipush #129
    //   2677: iastore
    //   2678: dup
    //   2679: bipush #50
    //   2681: iconst_1
    //   2682: iastore
    //   2683: dup
    //   2684: bipush #51
    //   2686: sipush #8192
    //   2689: iastore
    //   2690: dup
    //   2691: bipush #52
    //   2693: ldc 8388609
    //   2695: iastore
    //   2696: dup
    //   2697: bipush #53
    //   2699: sipush #8193
    //   2702: iastore
    //   2703: dup
    //   2704: bipush #54
    //   2706: ldc 8396928
    //   2708: iastore
    //   2709: dup
    //   2710: bipush #55
    //   2712: ldc 8388737
    //   2714: iastore
    //   2715: dup
    //   2716: bipush #56
    //   2718: sipush #8193
    //   2721: iastore
    //   2722: dup
    //   2723: bipush #57
    //   2725: sipush #8320
    //   2728: iastore
    //   2729: dup
    //   2730: bipush #58
    //   2732: ldc 8388608
    //   2734: iastore
    //   2735: dup
    //   2736: bipush #59
    //   2738: ldc 8396801
    //   2740: iastore
    //   2741: dup
    //   2742: bipush #60
    //   2744: sipush #128
    //   2747: iastore
    //   2748: dup
    //   2749: bipush #61
    //   2751: ldc 8388608
    //   2753: iastore
    //   2754: dup
    //   2755: bipush #62
    //   2757: sipush #8192
    //   2760: iastore
    //   2761: dup
    //   2762: bipush #63
    //   2764: ldc 8396928
    //   2766: iastore
    //   2767: astore #9
    //   2769: bipush #64
    //   2771: newarray int
    //   2773: dup
    //   2774: iconst_0
    //   2775: sipush #256
    //   2778: iastore
    //   2779: dup
    //   2780: iconst_1
    //   2781: ldc 34078976
    //   2783: iastore
    //   2784: dup
    //   2785: iconst_2
    //   2786: ldc 34078720
    //   2788: iastore
    //   2789: dup
    //   2790: iconst_3
    //   2791: ldc 1107296512
    //   2793: iastore
    //   2794: dup
    //   2795: iconst_4
    //   2796: ldc 524288
    //   2798: iastore
    //   2799: dup
    //   2800: iconst_5
    //   2801: sipush #256
    //   2804: iastore
    //   2805: dup
    //   2806: bipush #6
    //   2808: ldc 1073741824
    //   2810: iastore
    //   2811: dup
    //   2812: bipush #7
    //   2814: ldc 34078720
    //   2816: iastore
    //   2817: dup
    //   2818: bipush #8
    //   2820: ldc 1074266368
    //   2822: iastore
    //   2823: dup
    //   2824: bipush #9
    //   2826: ldc 524288
    //   2828: iastore
    //   2829: dup
    //   2830: bipush #10
    //   2832: ldc 33554688
    //   2834: iastore
    //   2835: dup
    //   2836: bipush #11
    //   2838: ldc 1074266368
    //   2840: iastore
    //   2841: dup
    //   2842: bipush #12
    //   2844: ldc 1107296512
    //   2846: iastore
    //   2847: dup
    //   2848: bipush #13
    //   2850: ldc 1107820544
    //   2852: iastore
    //   2853: dup
    //   2854: bipush #14
    //   2856: ldc 524544
    //   2858: iastore
    //   2859: dup
    //   2860: bipush #15
    //   2862: ldc 1073741824
    //   2864: iastore
    //   2865: dup
    //   2866: bipush #16
    //   2868: ldc 33554432
    //   2870: iastore
    //   2871: dup
    //   2872: bipush #17
    //   2874: ldc 1074266112
    //   2876: iastore
    //   2877: dup
    //   2878: bipush #18
    //   2880: ldc 1074266112
    //   2882: iastore
    //   2883: dup
    //   2884: bipush #19
    //   2886: iconst_0
    //   2887: iastore
    //   2888: dup
    //   2889: bipush #20
    //   2891: ldc 1073742080
    //   2893: iastore
    //   2894: dup
    //   2895: bipush #21
    //   2897: ldc 1107820800
    //   2899: iastore
    //   2900: dup
    //   2901: bipush #22
    //   2903: ldc 1107820800
    //   2905: iastore
    //   2906: dup
    //   2907: bipush #23
    //   2909: ldc 33554688
    //   2911: iastore
    //   2912: dup
    //   2913: bipush #24
    //   2915: ldc 1107820544
    //   2917: iastore
    //   2918: dup
    //   2919: bipush #25
    //   2921: ldc 1073742080
    //   2923: iastore
    //   2924: dup
    //   2925: bipush #26
    //   2927: iconst_0
    //   2928: iastore
    //   2929: dup
    //   2930: bipush #27
    //   2932: ldc 1107296256
    //   2934: iastore
    //   2935: dup
    //   2936: bipush #28
    //   2938: ldc 34078976
    //   2940: iastore
    //   2941: dup
    //   2942: bipush #29
    //   2944: ldc 33554432
    //   2946: iastore
    //   2947: dup
    //   2948: bipush #30
    //   2950: ldc 1107296256
    //   2952: iastore
    //   2953: dup
    //   2954: bipush #31
    //   2956: ldc 524544
    //   2958: iastore
    //   2959: dup
    //   2960: bipush #32
    //   2962: ldc 524288
    //   2964: iastore
    //   2965: dup
    //   2966: bipush #33
    //   2968: ldc 1107296512
    //   2970: iastore
    //   2971: dup
    //   2972: bipush #34
    //   2974: sipush #256
    //   2977: iastore
    //   2978: dup
    //   2979: bipush #35
    //   2981: ldc 33554432
    //   2983: iastore
    //   2984: dup
    //   2985: bipush #36
    //   2987: ldc 1073741824
    //   2989: iastore
    //   2990: dup
    //   2991: bipush #37
    //   2993: ldc 34078720
    //   2995: iastore
    //   2996: dup
    //   2997: bipush #38
    //   2999: ldc 1107296512
    //   3001: iastore
    //   3002: dup
    //   3003: bipush #39
    //   3005: ldc 1074266368
    //   3007: iastore
    //   3008: dup
    //   3009: bipush #40
    //   3011: ldc 33554688
    //   3013: iastore
    //   3014: dup
    //   3015: bipush #41
    //   3017: ldc 1073741824
    //   3019: iastore
    //   3020: dup
    //   3021: bipush #42
    //   3023: ldc 1107820544
    //   3025: iastore
    //   3026: dup
    //   3027: bipush #43
    //   3029: ldc 34078976
    //   3031: iastore
    //   3032: dup
    //   3033: bipush #44
    //   3035: ldc 1074266368
    //   3037: iastore
    //   3038: dup
    //   3039: bipush #45
    //   3041: sipush #256
    //   3044: iastore
    //   3045: dup
    //   3046: bipush #46
    //   3048: ldc 33554432
    //   3050: iastore
    //   3051: dup
    //   3052: bipush #47
    //   3054: ldc 1107820544
    //   3056: iastore
    //   3057: dup
    //   3058: bipush #48
    //   3060: ldc 1107820800
    //   3062: iastore
    //   3063: dup
    //   3064: bipush #49
    //   3066: ldc 524544
    //   3068: iastore
    //   3069: dup
    //   3070: bipush #50
    //   3072: ldc 1107296256
    //   3074: iastore
    //   3075: dup
    //   3076: bipush #51
    //   3078: ldc 1107820800
    //   3080: iastore
    //   3081: dup
    //   3082: bipush #52
    //   3084: ldc 34078720
    //   3086: iastore
    //   3087: dup
    //   3088: bipush #53
    //   3090: iconst_0
    //   3091: iastore
    //   3092: dup
    //   3093: bipush #54
    //   3095: ldc 1074266112
    //   3097: iastore
    //   3098: dup
    //   3099: bipush #55
    //   3101: ldc 1107296256
    //   3103: iastore
    //   3104: dup
    //   3105: bipush #56
    //   3107: ldc 524544
    //   3109: iastore
    //   3110: dup
    //   3111: bipush #57
    //   3113: ldc 33554688
    //   3115: iastore
    //   3116: dup
    //   3117: bipush #58
    //   3119: ldc 1073742080
    //   3121: iastore
    //   3122: dup
    //   3123: bipush #59
    //   3125: ldc 524288
    //   3127: iastore
    //   3128: dup
    //   3129: bipush #60
    //   3131: iconst_0
    //   3132: iastore
    //   3133: dup
    //   3134: bipush #61
    //   3136: ldc 1074266112
    //   3138: iastore
    //   3139: dup
    //   3140: bipush #62
    //   3142: ldc 34078976
    //   3144: iastore
    //   3145: dup
    //   3146: bipush #63
    //   3148: ldc 1073742080
    //   3150: iastore
    //   3151: astore #10
    //   3153: bipush #64
    //   3155: newarray int
    //   3157: dup
    //   3158: iconst_0
    //   3159: ldc 536870928
    //   3161: iastore
    //   3162: dup
    //   3163: iconst_1
    //   3164: ldc 541065216
    //   3166: iastore
    //   3167: dup
    //   3168: iconst_2
    //   3169: sipush #16384
    //   3172: iastore
    //   3173: dup
    //   3174: iconst_3
    //   3175: ldc 541081616
    //   3177: iastore
    //   3178: dup
    //   3179: iconst_4
    //   3180: ldc 541065216
    //   3182: iastore
    //   3183: dup
    //   3184: iconst_5
    //   3185: bipush #16
    //   3187: iastore
    //   3188: dup
    //   3189: bipush #6
    //   3191: ldc 541081616
    //   3193: iastore
    //   3194: dup
    //   3195: bipush #7
    //   3197: ldc 4194304
    //   3199: iastore
    //   3200: dup
    //   3201: bipush #8
    //   3203: ldc 536887296
    //   3205: iastore
    //   3206: dup
    //   3207: bipush #9
    //   3209: ldc 4210704
    //   3211: iastore
    //   3212: dup
    //   3213: bipush #10
    //   3215: ldc 4194304
    //   3217: iastore
    //   3218: dup
    //   3219: bipush #11
    //   3221: ldc 536870928
    //   3223: iastore
    //   3224: dup
    //   3225: bipush #12
    //   3227: ldc 4194320
    //   3229: iastore
    //   3230: dup
    //   3231: bipush #13
    //   3233: ldc 536887296
    //   3235: iastore
    //   3236: dup
    //   3237: bipush #14
    //   3239: ldc 536870912
    //   3241: iastore
    //   3242: dup
    //   3243: bipush #15
    //   3245: sipush #16400
    //   3248: iastore
    //   3249: dup
    //   3250: bipush #16
    //   3252: iconst_0
    //   3253: iastore
    //   3254: dup
    //   3255: bipush #17
    //   3257: ldc 4194320
    //   3259: iastore
    //   3260: dup
    //   3261: bipush #18
    //   3263: ldc 536887312
    //   3265: iastore
    //   3266: dup
    //   3267: bipush #19
    //   3269: sipush #16384
    //   3272: iastore
    //   3273: dup
    //   3274: bipush #20
    //   3276: ldc 4210688
    //   3278: iastore
    //   3279: dup
    //   3280: bipush #21
    //   3282: ldc 536887312
    //   3284: iastore
    //   3285: dup
    //   3286: bipush #22
    //   3288: bipush #16
    //   3290: iastore
    //   3291: dup
    //   3292: bipush #23
    //   3294: ldc 541065232
    //   3296: iastore
    //   3297: dup
    //   3298: bipush #24
    //   3300: ldc 541065232
    //   3302: iastore
    //   3303: dup
    //   3304: bipush #25
    //   3306: iconst_0
    //   3307: iastore
    //   3308: dup
    //   3309: bipush #26
    //   3311: ldc 4210704
    //   3313: iastore
    //   3314: dup
    //   3315: bipush #27
    //   3317: ldc 541081600
    //   3319: iastore
    //   3320: dup
    //   3321: bipush #28
    //   3323: sipush #16400
    //   3326: iastore
    //   3327: dup
    //   3328: bipush #29
    //   3330: ldc 4210688
    //   3332: iastore
    //   3333: dup
    //   3334: bipush #30
    //   3336: ldc 541081600
    //   3338: iastore
    //   3339: dup
    //   3340: bipush #31
    //   3342: ldc 536870912
    //   3344: iastore
    //   3345: dup
    //   3346: bipush #32
    //   3348: ldc 536887296
    //   3350: iastore
    //   3351: dup
    //   3352: bipush #33
    //   3354: bipush #16
    //   3356: iastore
    //   3357: dup
    //   3358: bipush #34
    //   3360: ldc 541065232
    //   3362: iastore
    //   3363: dup
    //   3364: bipush #35
    //   3366: ldc 4210688
    //   3368: iastore
    //   3369: dup
    //   3370: bipush #36
    //   3372: ldc 541081616
    //   3374: iastore
    //   3375: dup
    //   3376: bipush #37
    //   3378: ldc 4194304
    //   3380: iastore
    //   3381: dup
    //   3382: bipush #38
    //   3384: sipush #16400
    //   3387: iastore
    //   3388: dup
    //   3389: bipush #39
    //   3391: ldc 536870928
    //   3393: iastore
    //   3394: dup
    //   3395: bipush #40
    //   3397: ldc 4194304
    //   3399: iastore
    //   3400: dup
    //   3401: bipush #41
    //   3403: ldc 536887296
    //   3405: iastore
    //   3406: dup
    //   3407: bipush #42
    //   3409: ldc 536870912
    //   3411: iastore
    //   3412: dup
    //   3413: bipush #43
    //   3415: sipush #16400
    //   3418: iastore
    //   3419: dup
    //   3420: bipush #44
    //   3422: ldc 536870928
    //   3424: iastore
    //   3425: dup
    //   3426: bipush #45
    //   3428: ldc 541081616
    //   3430: iastore
    //   3431: dup
    //   3432: bipush #46
    //   3434: ldc 4210688
    //   3436: iastore
    //   3437: dup
    //   3438: bipush #47
    //   3440: ldc 541065216
    //   3442: iastore
    //   3443: dup
    //   3444: bipush #48
    //   3446: ldc 4210704
    //   3448: iastore
    //   3449: dup
    //   3450: bipush #49
    //   3452: ldc 541081600
    //   3454: iastore
    //   3455: dup
    //   3456: bipush #50
    //   3458: iconst_0
    //   3459: iastore
    //   3460: dup
    //   3461: bipush #51
    //   3463: ldc 541065232
    //   3465: iastore
    //   3466: dup
    //   3467: bipush #52
    //   3469: bipush #16
    //   3471: iastore
    //   3472: dup
    //   3473: bipush #53
    //   3475: sipush #16384
    //   3478: iastore
    //   3479: dup
    //   3480: bipush #54
    //   3482: ldc 541065216
    //   3484: iastore
    //   3485: dup
    //   3486: bipush #55
    //   3488: ldc 4210704
    //   3490: iastore
    //   3491: dup
    //   3492: bipush #56
    //   3494: sipush #16384
    //   3497: iastore
    //   3498: dup
    //   3499: bipush #57
    //   3501: ldc 4194320
    //   3503: iastore
    //   3504: dup
    //   3505: bipush #58
    //   3507: ldc 536887312
    //   3509: iastore
    //   3510: dup
    //   3511: bipush #59
    //   3513: iconst_0
    //   3514: iastore
    //   3515: dup
    //   3516: bipush #60
    //   3518: ldc 541081600
    //   3520: iastore
    //   3521: dup
    //   3522: bipush #61
    //   3524: ldc 536870912
    //   3526: iastore
    //   3527: dup
    //   3528: bipush #62
    //   3530: ldc 4194320
    //   3532: iastore
    //   3533: dup
    //   3534: bipush #63
    //   3536: ldc 536887312
    //   3538: iastore
    //   3539: astore #11
    //   3541: bipush #64
    //   3543: newarray int
    //   3545: dup
    //   3546: iconst_0
    //   3547: ldc 2097152
    //   3549: iastore
    //   3550: dup
    //   3551: iconst_1
    //   3552: ldc 69206018
    //   3554: iastore
    //   3555: dup
    //   3556: iconst_2
    //   3557: ldc 67110914
    //   3559: iastore
    //   3560: dup
    //   3561: iconst_3
    //   3562: iconst_0
    //   3563: iastore
    //   3564: dup
    //   3565: iconst_4
    //   3566: sipush #2048
    //   3569: iastore
    //   3570: dup
    //   3571: iconst_5
    //   3572: ldc 67110914
    //   3574: iastore
    //   3575: dup
    //   3576: bipush #6
    //   3578: ldc 2099202
    //   3580: iastore
    //   3581: dup
    //   3582: bipush #7
    //   3584: ldc 69208064
    //   3586: iastore
    //   3587: dup
    //   3588: bipush #8
    //   3590: ldc 69208066
    //   3592: iastore
    //   3593: dup
    //   3594: bipush #9
    //   3596: ldc 2097152
    //   3598: iastore
    //   3599: dup
    //   3600: bipush #10
    //   3602: iconst_0
    //   3603: iastore
    //   3604: dup
    //   3605: bipush #11
    //   3607: ldc 67108866
    //   3609: iastore
    //   3610: dup
    //   3611: bipush #12
    //   3613: iconst_2
    //   3614: iastore
    //   3615: dup
    //   3616: bipush #13
    //   3618: ldc 67108864
    //   3620: iastore
    //   3621: dup
    //   3622: bipush #14
    //   3624: ldc 69206018
    //   3626: iastore
    //   3627: dup
    //   3628: bipush #15
    //   3630: sipush #2050
    //   3633: iastore
    //   3634: dup
    //   3635: bipush #16
    //   3637: ldc 67110912
    //   3639: iastore
    //   3640: dup
    //   3641: bipush #17
    //   3643: ldc 2099202
    //   3645: iastore
    //   3646: dup
    //   3647: bipush #18
    //   3649: ldc 2097154
    //   3651: iastore
    //   3652: dup
    //   3653: bipush #19
    //   3655: ldc 67110912
    //   3657: iastore
    //   3658: dup
    //   3659: bipush #20
    //   3661: ldc 67108866
    //   3663: iastore
    //   3664: dup
    //   3665: bipush #21
    //   3667: ldc 69206016
    //   3669: iastore
    //   3670: dup
    //   3671: bipush #22
    //   3673: ldc 69208064
    //   3675: iastore
    //   3676: dup
    //   3677: bipush #23
    //   3679: ldc 2097154
    //   3681: iastore
    //   3682: dup
    //   3683: bipush #24
    //   3685: ldc 69206016
    //   3687: iastore
    //   3688: dup
    //   3689: bipush #25
    //   3691: sipush #2048
    //   3694: iastore
    //   3695: dup
    //   3696: bipush #26
    //   3698: sipush #2050
    //   3701: iastore
    //   3702: dup
    //   3703: bipush #27
    //   3705: ldc 69208066
    //   3707: iastore
    //   3708: dup
    //   3709: bipush #28
    //   3711: ldc 2099200
    //   3713: iastore
    //   3714: dup
    //   3715: bipush #29
    //   3717: iconst_2
    //   3718: iastore
    //   3719: dup
    //   3720: bipush #30
    //   3722: ldc 67108864
    //   3724: iastore
    //   3725: dup
    //   3726: bipush #31
    //   3728: ldc 2099200
    //   3730: iastore
    //   3731: dup
    //   3732: bipush #32
    //   3734: ldc 67108864
    //   3736: iastore
    //   3737: dup
    //   3738: bipush #33
    //   3740: ldc 2099200
    //   3742: iastore
    //   3743: dup
    //   3744: bipush #34
    //   3746: ldc 2097152
    //   3748: iastore
    //   3749: dup
    //   3750: bipush #35
    //   3752: ldc 67110914
    //   3754: iastore
    //   3755: dup
    //   3756: bipush #36
    //   3758: ldc 67110914
    //   3760: iastore
    //   3761: dup
    //   3762: bipush #37
    //   3764: ldc 69206018
    //   3766: iastore
    //   3767: dup
    //   3768: bipush #38
    //   3770: ldc 69206018
    //   3772: iastore
    //   3773: dup
    //   3774: bipush #39
    //   3776: iconst_2
    //   3777: iastore
    //   3778: dup
    //   3779: bipush #40
    //   3781: ldc 2097154
    //   3783: iastore
    //   3784: dup
    //   3785: bipush #41
    //   3787: ldc 67108864
    //   3789: iastore
    //   3790: dup
    //   3791: bipush #42
    //   3793: ldc 67110912
    //   3795: iastore
    //   3796: dup
    //   3797: bipush #43
    //   3799: ldc 2097152
    //   3801: iastore
    //   3802: dup
    //   3803: bipush #44
    //   3805: ldc 69208064
    //   3807: iastore
    //   3808: dup
    //   3809: bipush #45
    //   3811: sipush #2050
    //   3814: iastore
    //   3815: dup
    //   3816: bipush #46
    //   3818: ldc 2099202
    //   3820: iastore
    //   3821: dup
    //   3822: bipush #47
    //   3824: ldc 69208064
    //   3826: iastore
    //   3827: dup
    //   3828: bipush #48
    //   3830: sipush #2050
    //   3833: iastore
    //   3834: dup
    //   3835: bipush #49
    //   3837: ldc 67108866
    //   3839: iastore
    //   3840: dup
    //   3841: bipush #50
    //   3843: ldc 69208066
    //   3845: iastore
    //   3846: dup
    //   3847: bipush #51
    //   3849: ldc 69206016
    //   3851: iastore
    //   3852: dup
    //   3853: bipush #52
    //   3855: ldc 2099200
    //   3857: iastore
    //   3858: dup
    //   3859: bipush #53
    //   3861: iconst_0
    //   3862: iastore
    //   3863: dup
    //   3864: bipush #54
    //   3866: iconst_2
    //   3867: iastore
    //   3868: dup
    //   3869: bipush #55
    //   3871: ldc 69208066
    //   3873: iastore
    //   3874: dup
    //   3875: bipush #56
    //   3877: iconst_0
    //   3878: iastore
    //   3879: dup
    //   3880: bipush #57
    //   3882: ldc 2099202
    //   3884: iastore
    //   3885: dup
    //   3886: bipush #58
    //   3888: ldc 69206016
    //   3890: iastore
    //   3891: dup
    //   3892: bipush #59
    //   3894: sipush #2048
    //   3897: iastore
    //   3898: dup
    //   3899: bipush #60
    //   3901: ldc 67108866
    //   3903: iastore
    //   3904: dup
    //   3905: bipush #61
    //   3907: ldc 67110912
    //   3909: iastore
    //   3910: dup
    //   3911: bipush #62
    //   3913: sipush #2048
    //   3916: iastore
    //   3917: dup
    //   3918: bipush #63
    //   3920: ldc 2097154
    //   3922: iastore
    //   3923: astore #12
    //   3925: bipush #64
    //   3927: newarray int
    //   3929: dup
    //   3930: iconst_0
    //   3931: ldc 268439616
    //   3933: iastore
    //   3934: dup
    //   3935: iconst_1
    //   3936: sipush #4096
    //   3939: iastore
    //   3940: dup
    //   3941: iconst_2
    //   3942: ldc 262144
    //   3944: iastore
    //   3945: dup
    //   3946: iconst_3
    //   3947: ldc 268701760
    //   3949: iastore
    //   3950: dup
    //   3951: iconst_4
    //   3952: ldc 268435456
    //   3954: iastore
    //   3955: dup
    //   3956: iconst_5
    //   3957: ldc 268439616
    //   3959: iastore
    //   3960: dup
    //   3961: bipush #6
    //   3963: bipush #64
    //   3965: iastore
    //   3966: dup
    //   3967: bipush #7
    //   3969: ldc 268435456
    //   3971: iastore
    //   3972: dup
    //   3973: bipush #8
    //   3975: ldc 262208
    //   3977: iastore
    //   3978: dup
    //   3979: bipush #9
    //   3981: ldc 268697600
    //   3983: iastore
    //   3984: dup
    //   3985: bipush #10
    //   3987: ldc 268701760
    //   3989: iastore
    //   3990: dup
    //   3991: bipush #11
    //   3993: ldc 266240
    //   3995: iastore
    //   3996: dup
    //   3997: bipush #12
    //   3999: ldc 268701696
    //   4001: iastore
    //   4002: dup
    //   4003: bipush #13
    //   4005: ldc 266304
    //   4007: iastore
    //   4008: dup
    //   4009: bipush #14
    //   4011: sipush #4096
    //   4014: iastore
    //   4015: dup
    //   4016: bipush #15
    //   4018: bipush #64
    //   4020: iastore
    //   4021: dup
    //   4022: bipush #16
    //   4024: ldc 268697600
    //   4026: iastore
    //   4027: dup
    //   4028: bipush #17
    //   4030: ldc 268435520
    //   4032: iastore
    //   4033: dup
    //   4034: bipush #18
    //   4036: ldc 268439552
    //   4038: iastore
    //   4039: dup
    //   4040: bipush #19
    //   4042: sipush #4160
    //   4045: iastore
    //   4046: dup
    //   4047: bipush #20
    //   4049: ldc 266240
    //   4051: iastore
    //   4052: dup
    //   4053: bipush #21
    //   4055: ldc 262208
    //   4057: iastore
    //   4058: dup
    //   4059: bipush #22
    //   4061: ldc 268697664
    //   4063: iastore
    //   4064: dup
    //   4065: bipush #23
    //   4067: ldc 268701696
    //   4069: iastore
    //   4070: dup
    //   4071: bipush #24
    //   4073: sipush #4160
    //   4076: iastore
    //   4077: dup
    //   4078: bipush #25
    //   4080: iconst_0
    //   4081: iastore
    //   4082: dup
    //   4083: bipush #26
    //   4085: iconst_0
    //   4086: iastore
    //   4087: dup
    //   4088: bipush #27
    //   4090: ldc 268697664
    //   4092: iastore
    //   4093: dup
    //   4094: bipush #28
    //   4096: ldc 268435520
    //   4098: iastore
    //   4099: dup
    //   4100: bipush #29
    //   4102: ldc 268439552
    //   4104: iastore
    //   4105: dup
    //   4106: bipush #30
    //   4108: ldc 266304
    //   4110: iastore
    //   4111: dup
    //   4112: bipush #31
    //   4114: ldc 262144
    //   4116: iastore
    //   4117: dup
    //   4118: bipush #32
    //   4120: ldc 266304
    //   4122: iastore
    //   4123: dup
    //   4124: bipush #33
    //   4126: ldc 262144
    //   4128: iastore
    //   4129: dup
    //   4130: bipush #34
    //   4132: ldc 268701696
    //   4134: iastore
    //   4135: dup
    //   4136: bipush #35
    //   4138: sipush #4096
    //   4141: iastore
    //   4142: dup
    //   4143: bipush #36
    //   4145: bipush #64
    //   4147: iastore
    //   4148: dup
    //   4149: bipush #37
    //   4151: ldc 268697664
    //   4153: iastore
    //   4154: dup
    //   4155: bipush #38
    //   4157: sipush #4096
    //   4160: iastore
    //   4161: dup
    //   4162: bipush #39
    //   4164: ldc 266304
    //   4166: iastore
    //   4167: dup
    //   4168: bipush #40
    //   4170: ldc 268439552
    //   4172: iastore
    //   4173: dup
    //   4174: bipush #41
    //   4176: bipush #64
    //   4178: iastore
    //   4179: dup
    //   4180: bipush #42
    //   4182: ldc 268435520
    //   4184: iastore
    //   4185: dup
    //   4186: bipush #43
    //   4188: ldc 268697600
    //   4190: iastore
    //   4191: dup
    //   4192: bipush #44
    //   4194: ldc 268697664
    //   4196: iastore
    //   4197: dup
    //   4198: bipush #45
    //   4200: ldc 268435456
    //   4202: iastore
    //   4203: dup
    //   4204: bipush #46
    //   4206: ldc 262144
    //   4208: iastore
    //   4209: dup
    //   4210: bipush #47
    //   4212: ldc 268439616
    //   4214: iastore
    //   4215: dup
    //   4216: bipush #48
    //   4218: iconst_0
    //   4219: iastore
    //   4220: dup
    //   4221: bipush #49
    //   4223: ldc 268701760
    //   4225: iastore
    //   4226: dup
    //   4227: bipush #50
    //   4229: ldc 262208
    //   4231: iastore
    //   4232: dup
    //   4233: bipush #51
    //   4235: ldc 268435520
    //   4237: iastore
    //   4238: dup
    //   4239: bipush #52
    //   4241: ldc 268697600
    //   4243: iastore
    //   4244: dup
    //   4245: bipush #53
    //   4247: ldc 268439552
    //   4249: iastore
    //   4250: dup
    //   4251: bipush #54
    //   4253: ldc 268439616
    //   4255: iastore
    //   4256: dup
    //   4257: bipush #55
    //   4259: iconst_0
    //   4260: iastore
    //   4261: dup
    //   4262: bipush #56
    //   4264: ldc 268701760
    //   4266: iastore
    //   4267: dup
    //   4268: bipush #57
    //   4270: ldc 266240
    //   4272: iastore
    //   4273: dup
    //   4274: bipush #58
    //   4276: ldc 266240
    //   4278: iastore
    //   4279: dup
    //   4280: bipush #59
    //   4282: sipush #4160
    //   4285: iastore
    //   4286: dup
    //   4287: bipush #60
    //   4289: sipush #4160
    //   4292: iastore
    //   4293: dup
    //   4294: bipush #61
    //   4296: ldc 262208
    //   4298: iastore
    //   4299: dup
    //   4300: bipush #62
    //   4302: ldc 268435456
    //   4304: iastore
    //   4305: dup
    //   4306: bipush #63
    //   4308: ldc 268701696
    //   4310: iastore
    //   4311: astore #13
    //   4313: aload_3
    //   4314: arraylength
    //   4315: istore #14
    //   4317: iload #14
    //   4319: bipush #8
    //   4321: irem
    //   4322: ifeq -> 4346
    //   4325: new java/lang/Exception
    //   4328: dup
    //   4329: sipush #-30456
    //   4332: sipush #-28142
    //   4335: invokestatic a : (II)Ljava/lang/String;
    //   4338: invokespecial <init> : (Ljava/lang/String;)V
    //   4341: athrow
    //   4342: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4345: athrow
    //   4346: iconst_2
    //   4347: newarray int
    //   4349: astore #15
    //   4351: iload #14
    //   4353: newarray byte
    //   4355: astore #16
    //   4357: iload #14
    //   4359: bipush #8
    //   4361: idiv
    //   4362: istore #17
    //   4364: iconst_0
    //   4365: istore #18
    //   4367: iload #18
    //   4369: iload #17
    //   4371: if_icmpge -> 5285
    //   4374: iload #18
    //   4376: bipush #8
    //   4378: imul
    //   4379: istore #19
    //   4381: iconst_0
    //   4382: istore #20
    //   4384: iload #20
    //   4386: iconst_2
    //   4387: if_icmpge -> 4472
    //   4390: aload #15
    //   4392: iload #20
    //   4394: aload_3
    //   4395: iload #19
    //   4397: iload #20
    //   4399: iconst_4
    //   4400: imul
    //   4401: iadd
    //   4402: baload
    //   4403: sipush #255
    //   4406: iand
    //   4407: bipush #24
    //   4409: ishl
    //   4410: aload_3
    //   4411: iload #19
    //   4413: iload #20
    //   4415: iconst_4
    //   4416: imul
    //   4417: iadd
    //   4418: iconst_1
    //   4419: iadd
    //   4420: baload
    //   4421: sipush #255
    //   4424: iand
    //   4425: bipush #16
    //   4427: ishl
    //   4428: ior
    //   4429: aload_3
    //   4430: iload #19
    //   4432: iload #20
    //   4434: iconst_4
    //   4435: imul
    //   4436: iadd
    //   4437: iconst_2
    //   4438: iadd
    //   4439: baload
    //   4440: sipush #255
    //   4443: iand
    //   4444: bipush #8
    //   4446: ishl
    //   4447: ior
    //   4448: aload_3
    //   4449: iload #19
    //   4451: iload #20
    //   4453: iconst_4
    //   4454: imul
    //   4455: iadd
    //   4456: iconst_3
    //   4457: iadd
    //   4458: baload
    //   4459: sipush #255
    //   4462: iand
    //   4463: ior
    //   4464: iastore
    //   4465: iinc #20, 1
    //   4468: iload_2
    //   4469: ifeq -> 4384
    //   4472: iconst_0
    //   4473: istore #25
    //   4475: aload #15
    //   4477: iconst_0
    //   4478: iaload
    //   4479: istore #23
    //   4481: aload #15
    //   4483: iconst_1
    //   4484: iaload
    //   4485: istore #22
    //   4487: iload #23
    //   4489: iconst_4
    //   4490: iushr
    //   4491: iload #22
    //   4493: ixor
    //   4494: ldc 252645135
    //   4496: iand
    //   4497: istore #21
    //   4499: iload #22
    //   4501: iload #21
    //   4503: ixor
    //   4504: istore #22
    //   4506: iload #23
    //   4508: iload #21
    //   4510: iconst_4
    //   4511: ishl
    //   4512: ixor
    //   4513: istore #23
    //   4515: iload #23
    //   4517: bipush #16
    //   4519: iushr
    //   4520: iload #22
    //   4522: ixor
    //   4523: ldc 65535
    //   4525: iand
    //   4526: istore #21
    //   4528: iload #22
    //   4530: iload #21
    //   4532: ixor
    //   4533: istore #22
    //   4535: iload #23
    //   4537: iload #21
    //   4539: bipush #16
    //   4541: ishl
    //   4542: ixor
    //   4543: istore #23
    //   4545: iload #22
    //   4547: iconst_2
    //   4548: iushr
    //   4549: iload #23
    //   4551: ixor
    //   4552: ldc 858993459
    //   4554: iand
    //   4555: istore #21
    //   4557: iload #23
    //   4559: iload #21
    //   4561: ixor
    //   4562: istore #23
    //   4564: iload #22
    //   4566: iload #21
    //   4568: iconst_2
    //   4569: ishl
    //   4570: ixor
    //   4571: istore #22
    //   4573: iload #22
    //   4575: bipush #8
    //   4577: iushr
    //   4578: iload #23
    //   4580: ixor
    //   4581: ldc 16711935
    //   4583: iand
    //   4584: istore #21
    //   4586: iload #23
    //   4588: iload #21
    //   4590: ixor
    //   4591: istore #23
    //   4593: iload #22
    //   4595: iload #21
    //   4597: bipush #8
    //   4599: ishl
    //   4600: ixor
    //   4601: istore #22
    //   4603: iload #22
    //   4605: iconst_1
    //   4606: ishl
    //   4607: iload #22
    //   4609: bipush #31
    //   4611: iushr
    //   4612: iconst_1
    //   4613: iand
    //   4614: ior
    //   4615: istore #22
    //   4617: iload #23
    //   4619: iload #22
    //   4621: ixor
    //   4622: ldc -1431655766
    //   4624: iand
    //   4625: istore #21
    //   4627: iload #23
    //   4629: iload #21
    //   4631: ixor
    //   4632: istore #23
    //   4634: iload #22
    //   4636: iload #21
    //   4638: ixor
    //   4639: istore #22
    //   4641: iload #23
    //   4643: iconst_1
    //   4644: ishl
    //   4645: iload #23
    //   4647: bipush #31
    //   4649: iushr
    //   4650: iconst_1
    //   4651: iand
    //   4652: ior
    //   4653: istore #23
    //   4655: iconst_0
    //   4656: istore #24
    //   4658: iload #24
    //   4660: bipush #8
    //   4662: if_icmpge -> 5000
    //   4665: iload #22
    //   4667: bipush #28
    //   4669: ishl
    //   4670: iload #22
    //   4672: iconst_4
    //   4673: iushr
    //   4674: ior
    //   4675: istore #21
    //   4677: iload #21
    //   4679: aload #5
    //   4681: iload #25
    //   4683: iinc #25, 1
    //   4686: iaload
    //   4687: ixor
    //   4688: istore #21
    //   4690: aload #12
    //   4692: iload #21
    //   4694: bipush #63
    //   4696: iand
    //   4697: iaload
    //   4698: istore #20
    //   4700: iload #20
    //   4702: aload #10
    //   4704: iload #21
    //   4706: bipush #8
    //   4708: iushr
    //   4709: bipush #63
    //   4711: iand
    //   4712: iaload
    //   4713: ior
    //   4714: istore #20
    //   4716: iload #20
    //   4718: aload #8
    //   4720: iload #21
    //   4722: bipush #16
    //   4724: iushr
    //   4725: bipush #63
    //   4727: iand
    //   4728: iaload
    //   4729: ior
    //   4730: istore #20
    //   4732: iload #20
    //   4734: aload #6
    //   4736: iload #21
    //   4738: bipush #24
    //   4740: iushr
    //   4741: bipush #63
    //   4743: iand
    //   4744: iaload
    //   4745: ior
    //   4746: istore #20
    //   4748: iload #22
    //   4750: aload #5
    //   4752: iload #25
    //   4754: iinc #25, 1
    //   4757: iaload
    //   4758: ixor
    //   4759: istore #21
    //   4761: iload #20
    //   4763: aload #13
    //   4765: iload #21
    //   4767: bipush #63
    //   4769: iand
    //   4770: iaload
    //   4771: ior
    //   4772: istore #20
    //   4774: iload #20
    //   4776: aload #11
    //   4778: iload #21
    //   4780: bipush #8
    //   4782: iushr
    //   4783: bipush #63
    //   4785: iand
    //   4786: iaload
    //   4787: ior
    //   4788: istore #20
    //   4790: iload #20
    //   4792: aload #9
    //   4794: iload #21
    //   4796: bipush #16
    //   4798: iushr
    //   4799: bipush #63
    //   4801: iand
    //   4802: iaload
    //   4803: ior
    //   4804: istore #20
    //   4806: iload #20
    //   4808: aload #7
    //   4810: iload #21
    //   4812: bipush #24
    //   4814: iushr
    //   4815: bipush #63
    //   4817: iand
    //   4818: iaload
    //   4819: ior
    //   4820: istore #20
    //   4822: iload #23
    //   4824: iload #20
    //   4826: ixor
    //   4827: istore #23
    //   4829: iload #23
    //   4831: bipush #28
    //   4833: ishl
    //   4834: iload #23
    //   4836: iconst_4
    //   4837: iushr
    //   4838: ior
    //   4839: istore #21
    //   4841: iload #21
    //   4843: aload #5
    //   4845: iload #25
    //   4847: iinc #25, 1
    //   4850: iaload
    //   4851: ixor
    //   4852: istore #21
    //   4854: aload #12
    //   4856: iload #21
    //   4858: bipush #63
    //   4860: iand
    //   4861: iaload
    //   4862: istore #20
    //   4864: iload #20
    //   4866: aload #10
    //   4868: iload #21
    //   4870: bipush #8
    //   4872: iushr
    //   4873: bipush #63
    //   4875: iand
    //   4876: iaload
    //   4877: ior
    //   4878: istore #20
    //   4880: iload #20
    //   4882: aload #8
    //   4884: iload #21
    //   4886: bipush #16
    //   4888: iushr
    //   4889: bipush #63
    //   4891: iand
    //   4892: iaload
    //   4893: ior
    //   4894: istore #20
    //   4896: iload #20
    //   4898: aload #6
    //   4900: iload #21
    //   4902: bipush #24
    //   4904: iushr
    //   4905: bipush #63
    //   4907: iand
    //   4908: iaload
    //   4909: ior
    //   4910: istore #20
    //   4912: iload #23
    //   4914: aload #5
    //   4916: iload #25
    //   4918: iinc #25, 1
    //   4921: iaload
    //   4922: ixor
    //   4923: istore #21
    //   4925: iload #20
    //   4927: aload #13
    //   4929: iload #21
    //   4931: bipush #63
    //   4933: iand
    //   4934: iaload
    //   4935: ior
    //   4936: istore #20
    //   4938: iload #20
    //   4940: aload #11
    //   4942: iload #21
    //   4944: bipush #8
    //   4946: iushr
    //   4947: bipush #63
    //   4949: iand
    //   4950: iaload
    //   4951: ior
    //   4952: istore #20
    //   4954: iload #20
    //   4956: aload #9
    //   4958: iload #21
    //   4960: bipush #16
    //   4962: iushr
    //   4963: bipush #63
    //   4965: iand
    //   4966: iaload
    //   4967: ior
    //   4968: istore #20
    //   4970: iload #20
    //   4972: aload #7
    //   4974: iload #21
    //   4976: bipush #24
    //   4978: iushr
    //   4979: bipush #63
    //   4981: iand
    //   4982: iaload
    //   4983: ior
    //   4984: istore #20
    //   4986: iload #22
    //   4988: iload #20
    //   4990: ixor
    //   4991: istore #22
    //   4993: iinc #24, 1
    //   4996: iload_2
    //   4997: ifeq -> 4658
    //   5000: iload #22
    //   5002: bipush #31
    //   5004: ishl
    //   5005: iload #22
    //   5007: iconst_1
    //   5008: iushr
    //   5009: ior
    //   5010: istore #22
    //   5012: iload #23
    //   5014: iload #22
    //   5016: ixor
    //   5017: ldc -1431655766
    //   5019: iand
    //   5020: istore #21
    //   5022: iload #23
    //   5024: iload #21
    //   5026: ixor
    //   5027: istore #23
    //   5029: iload #22
    //   5031: iload #21
    //   5033: ixor
    //   5034: istore #22
    //   5036: iload #23
    //   5038: bipush #31
    //   5040: ishl
    //   5041: iload #23
    //   5043: iconst_1
    //   5044: iushr
    //   5045: ior
    //   5046: istore #23
    //   5048: iload #23
    //   5050: bipush #8
    //   5052: iushr
    //   5053: iload #22
    //   5055: ixor
    //   5056: ldc 16711935
    //   5058: iand
    //   5059: istore #21
    //   5061: iload #22
    //   5063: iload #21
    //   5065: ixor
    //   5066: istore #22
    //   5068: iload #23
    //   5070: iload #21
    //   5072: bipush #8
    //   5074: ishl
    //   5075: ixor
    //   5076: istore #23
    //   5078: iload #23
    //   5080: iconst_2
    //   5081: iushr
    //   5082: iload #22
    //   5084: ixor
    //   5085: ldc 858993459
    //   5087: iand
    //   5088: istore #21
    //   5090: iload #22
    //   5092: iload #21
    //   5094: ixor
    //   5095: istore #22
    //   5097: iload #23
    //   5099: iload #21
    //   5101: iconst_2
    //   5102: ishl
    //   5103: ixor
    //   5104: istore #23
    //   5106: iload #22
    //   5108: bipush #16
    //   5110: iushr
    //   5111: iload #23
    //   5113: ixor
    //   5114: ldc 65535
    //   5116: iand
    //   5117: istore #21
    //   5119: iload #23
    //   5121: iload #21
    //   5123: ixor
    //   5124: istore #23
    //   5126: iload #22
    //   5128: iload #21
    //   5130: bipush #16
    //   5132: ishl
    //   5133: ixor
    //   5134: istore #22
    //   5136: iload #22
    //   5138: iconst_4
    //   5139: iushr
    //   5140: iload #23
    //   5142: ixor
    //   5143: ldc 252645135
    //   5145: iand
    //   5146: istore #21
    //   5148: iload #23
    //   5150: iload #21
    //   5152: ixor
    //   5153: istore #23
    //   5155: iload #22
    //   5157: iload #21
    //   5159: iconst_4
    //   5160: ishl
    //   5161: ixor
    //   5162: istore #22
    //   5164: aload #15
    //   5166: iconst_0
    //   5167: iload #22
    //   5169: iastore
    //   5170: aload #15
    //   5172: iconst_1
    //   5173: iload #23
    //   5175: iastore
    //   5176: iload #18
    //   5178: bipush #8
    //   5180: imul
    //   5181: istore #26
    //   5183: iconst_0
    //   5184: istore #27
    //   5186: iload #27
    //   5188: iconst_2
    //   5189: if_icmpge -> 5278
    //   5192: aload #16
    //   5194: iload #26
    //   5196: iload #27
    //   5198: iconst_4
    //   5199: imul
    //   5200: iadd
    //   5201: aload #15
    //   5203: iload #27
    //   5205: iaload
    //   5206: bipush #24
    //   5208: iushr
    //   5209: i2b
    //   5210: bastore
    //   5211: aload #16
    //   5213: iload #26
    //   5215: iload #27
    //   5217: iconst_4
    //   5218: imul
    //   5219: iadd
    //   5220: iconst_1
    //   5221: iadd
    //   5222: aload #15
    //   5224: iload #27
    //   5226: iaload
    //   5227: bipush #16
    //   5229: iushr
    //   5230: i2b
    //   5231: bastore
    //   5232: aload #16
    //   5234: iload #26
    //   5236: iload #27
    //   5238: iconst_4
    //   5239: imul
    //   5240: iadd
    //   5241: iconst_2
    //   5242: iadd
    //   5243: aload #15
    //   5245: iload #27
    //   5247: iaload
    //   5248: bipush #8
    //   5250: iushr
    //   5251: i2b
    //   5252: bastore
    //   5253: aload #16
    //   5255: iload #26
    //   5257: iload #27
    //   5259: iconst_4
    //   5260: imul
    //   5261: iadd
    //   5262: iconst_3
    //   5263: iadd
    //   5264: aload #15
    //   5266: iload #27
    //   5268: iaload
    //   5269: i2b
    //   5270: bastore
    //   5271: iinc #27, 1
    //   5274: iload_2
    //   5275: ifeq -> 5186
    //   5278: iinc #18, 1
    //   5281: iload_2
    //   5282: ifeq -> 4367
    //   5285: aload #16
    //   5287: aload #16
    //   5289: arraylength
    //   5290: iconst_1
    //   5291: isub
    //   5292: baload
    //   5293: istore #18
    //   5295: aload #16
    //   5297: arraylength
    //   5298: iload #18
    //   5300: isub
    //   5301: newarray byte
    //   5303: astore #4
    //   5305: aload #16
    //   5307: arraylength
    //   5308: aload #4
    //   5310: arraylength
    //   5311: if_icmpge -> 5335
    //   5314: new java/lang/Exception
    //   5317: dup
    //   5318: sipush #-30452
    //   5321: sipush #20699
    //   5324: invokestatic a : (II)Ljava/lang/String;
    //   5327: invokespecial <init> : (Ljava/lang/String;)V
    //   5330: athrow
    //   5331: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5334: athrow
    //   5335: iconst_0
    //   5336: istore #19
    //   5338: iload #19
    //   5340: aload #4
    //   5342: arraylength
    //   5343: if_icmpge -> 5363
    //   5346: aload #4
    //   5348: iload #19
    //   5350: aload #16
    //   5352: iload #19
    //   5354: baload
    //   5355: bastore
    //   5356: iinc #19, 1
    //   5359: iload_2
    //   5360: ifeq -> 5338
    //   5363: iconst_0
    //   5364: istore_3
    //   5365: sipush #-30454
    //   5368: sipush #-21858
    //   5371: invokestatic a : (II)Ljava/lang/String;
    //   5374: iconst_1
    //   5375: ldc burp/Zlav
    //   5377: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   5380: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   5383: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   5386: astore #4
    //   5388: aload #4
    //   5390: arraylength
    //   5391: istore #5
    //   5393: iconst_0
    //   5394: istore #6
    //   5396: iload #6
    //   5398: iload #5
    //   5400: if_icmpge -> 5538
    //   5403: aload #4
    //   5405: iload #6
    //   5407: aaload
    //   5408: astore #7
    //   5410: aload #7
    //   5412: invokevirtual getModifiers : ()I
    //   5415: invokestatic isStatic : (I)Z
    //   5418: ifne -> 5428
    //   5421: goto -> 5531
    //   5424: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5427: athrow
    //   5428: aload #7
    //   5430: invokevirtual getType : ()Ljava/lang/Class;
    //   5433: astore #8
    //   5435: aload #8
    //   5437: ifnull -> 5518
    //   5440: aload #8
    //   5442: invokevirtual isPrimitive : ()Z
    //   5445: ifne -> 5518
    //   5448: goto -> 5455
    //   5451: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5454: athrow
    //   5455: aload #8
    //   5457: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5460: ifnull -> 5518
    //   5463: goto -> 5470
    //   5466: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5469: athrow
    //   5470: aload #8
    //   5472: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5475: invokevirtual getName : ()Ljava/lang/String;
    //   5478: ifnull -> 5518
    //   5481: goto -> 5488
    //   5484: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5487: athrow
    //   5488: aload #8
    //   5490: invokevirtual getPackage : ()Ljava/lang/Package;
    //   5493: invokevirtual getName : ()Ljava/lang/String;
    //   5496: sipush #-30451
    //   5499: sipush #23299
    //   5502: invokestatic a : (II)Ljava/lang/String;
    //   5505: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   5508: ifne -> 5518
    //   5511: goto -> 5518
    //   5514: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5517: athrow
    //   5518: aload #7
    //   5520: iconst_1
    //   5521: invokevirtual setAccessible : (Z)V
    //   5524: aload #7
    //   5526: aconst_null
    //   5527: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5530: pop
    //   5531: iinc #6, 1
    //   5534: iload_2
    //   5535: ifeq -> 5396
    //   5538: sipush #-30459
    //   5541: sipush #-31580
    //   5544: invokestatic a : (II)Ljava/lang/String;
    //   5547: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   5550: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   5553: astore #4
    //   5555: aload #4
    //   5557: arraylength
    //   5558: istore #5
    //   5560: iconst_0
    //   5561: istore #6
    //   5563: iload #6
    //   5565: iload #5
    //   5567: if_icmpge -> 5703
    //   5570: aload #4
    //   5572: iload #6
    //   5574: aaload
    //   5575: astore #7
    //   5577: aload #7
    //   5579: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5582: pop
    //   5583: aload #7
    //   5585: invokevirtual getModifiers : ()I
    //   5588: invokestatic isStatic : (I)Z
    //   5591: ifeq -> 5689
    //   5594: aload #7
    //   5596: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   5599: arraylength
    //   5600: iconst_2
    //   5601: if_icmpne -> 5689
    //   5604: goto -> 5611
    //   5607: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5610: athrow
    //   5611: aload #7
    //   5613: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   5616: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   5619: if_acmpne -> 5689
    //   5622: goto -> 5629
    //   5625: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5628: athrow
    //   5629: aload #7
    //   5631: iconst_1
    //   5632: invokevirtual setAccessible : (Z)V
    //   5635: aload #7
    //   5637: aconst_null
    //   5638: iconst_2
    //   5639: anewarray java/lang/Object
    //   5642: dup
    //   5643: iconst_0
    //   5644: aload_0
    //   5645: aastore
    //   5646: dup
    //   5647: iconst_1
    //   5648: aload_1
    //   5649: ifnonnull -> 5667
    //   5652: goto -> 5659
    //   5655: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5658: athrow
    //   5659: aload_1
    //   5660: goto -> 5674
    //   5663: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5666: athrow
    //   5667: aload_1
    //   5668: checkcast [B
    //   5671: invokevirtual clone : ()Ljava/lang/Object;
    //   5674: aastore
    //   5675: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   5678: checkcast java/lang/Boolean
    //   5681: invokevirtual booleanValue : ()Z
    //   5684: istore_3
    //   5685: iload_2
    //   5686: ifeq -> 5703
    //   5689: iinc #6, 1
    //   5692: iload_2
    //   5693: ifeq -> 5563
    //   5696: goto -> 5703
    //   5699: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   5702: athrow
    //   5703: iload_3
    //   5704: ireturn
    //   5705: astore_3
    //   5706: new java/lang/Exception
    //   5709: dup
    //   5710: aload_3
    //   5711: invokevirtual getMessage : ()Ljava/lang/String;
    //   5714: invokespecial <init> : (Ljava/lang/String;)V
    //   5717: athrow
    // Exception table:
    //   from	to	target	type
    //   4	5704	5705	java/lang/Throwable
    //   309	333	336	java/lang/Throwable
    //   407	444	444	java/lang/Throwable
    //   448	469	469	java/lang/Throwable
    //   473	503	503	java/lang/Throwable
    //   728	742	742	java/lang/Throwable
    //   753	766	769	java/lang/Throwable
    //   758	781	784	java/lang/Throwable
    //   773	799	802	java/lang/Throwable
    //   788	829	832	java/lang/Throwable
    //   892	919	922	java/lang/Throwable
    //   909	940	943	java/lang/Throwable
    //   926	970	973	java/lang/Throwable
    //   947	981	981	java/lang/Throwable
    //   992	1008	1011	java/lang/Throwable
    //   4317	4342	4342	java/lang/Throwable
    //   5305	5331	5331	java/lang/Throwable
    //   5410	5424	5424	java/lang/Throwable
    //   5435	5448	5451	java/lang/Throwable
    //   5440	5463	5466	java/lang/Throwable
    //   5455	5481	5484	java/lang/Throwable
    //   5470	5511	5514	java/lang/Throwable
    //   5577	5604	5607	java/lang/Throwable
    //   5594	5622	5625	java/lang/Throwable
    //   5611	5652	5655	java/lang/Throwable
    //   5629	5663	5663	java/lang/Throwable
    //   5685	5696	5699	java/lang/Throwable
  }
  
  static void Zh(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void Zd(Object paramObject) {
    Zmjr.Zc = a(-30453, 22545);
    Zmjr.ZU = new BigInteger(a(-30450, 23736));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zeyt.ZS.charAt(Math.abs(((BigInteger)Zmjr.ZU).intValue() % 32)) > Zeyt.ZS.charAt(Math.abs(((BigInteger)Zmjr.ZU).intValue() % 32))) {
          try {
            Zea8.ZG(Class.forName(a(-30449, -3971)));
            if (bool)
              Zs59.ZM(Class.forName(a(-30455, -30283))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zs59.ZM(Class.forName(a(-30455, -30283)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #16
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'n[¬ÉJëhlÎ ¯öä¯§ÙF¦ÃÌ®éÌèÓµÛÖôêVïKU}\\t½[\\nð0ê\\tcpRqqX ×±'_X F £\\bÁâRÑ>êI;Ì2¾GZB1|âÁ\\töã]T{Å2'¬Òñ1k^xBð¹\\tÃ\\t¥ÕæðïmRM/É{Ø øQ¸\\bm¯¹hô!mNïöº ¹Å×ª¶6,Ç}¬ÆÒøÅüØ?aS\\næ-E¡w9éßüßB· 0.ÞßÁ\\t$måAàI6[HÔuÉéúïPråÇC3ÏFÉ]'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #22
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
    //   68: ldc '­£-=´4ÛÄ9×¾¯_ãq ÐrÄQNpª}ó~ÄÂ\\tûú%ÛSÑÙ¹'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #32
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: iconst_2
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
    //   123: goto -> 82
    //   126: aload #5
    //   128: putstatic burp/Zmhx.a : [Ljava/lang/String;
    //   131: bipush #16
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zmhx.b : [Ljava/lang/String;
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
    //   212: bipush #53
    //   214: goto -> 244
    //   217: bipush #55
    //   219: goto -> 244
    //   222: bipush #79
    //   224: goto -> 244
    //   227: bipush #117
    //   229: goto -> 244
    //   232: bipush #115
    //   234: goto -> 244
    //   237: bipush #63
    //   239: goto -> 244
    //   242: bipush #15
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
    //   310: bipush #122
    //   312: bastore
    //   313: dup
    //   314: iconst_1
    //   315: bipush #-21
    //   317: bastore
    //   318: dup
    //   319: iconst_2
    //   320: bipush #69
    //   322: bastore
    //   323: dup
    //   324: iconst_3
    //   325: bipush #-74
    //   327: bastore
    //   328: dup
    //   329: iconst_4
    //   330: bipush #-96
    //   332: bastore
    //   333: dup
    //   334: iconst_5
    //   335: iconst_3
    //   336: bastore
    //   337: dup
    //   338: bipush #6
    //   340: bipush #57
    //   342: bastore
    //   343: dup
    //   344: bipush #7
    //   346: bipush #115
    //   348: bastore
    //   349: dup
    //   350: bipush #8
    //   352: bipush #-33
    //   354: bastore
    //   355: dup
    //   356: bipush #9
    //   358: bipush #-41
    //   360: bastore
    //   361: dup
    //   362: bipush #10
    //   364: bipush #-115
    //   366: bastore
    //   367: dup
    //   368: bipush #11
    //   370: bipush #37
    //   372: bastore
    //   373: dup
    //   374: bipush #12
    //   376: bipush #82
    //   378: bastore
    //   379: dup
    //   380: bipush #13
    //   382: bipush #16
    //   384: bastore
    //   385: dup
    //   386: bipush #14
    //   388: bipush #-43
    //   390: bastore
    //   391: dup
    //   392: bipush #15
    //   394: bipush #121
    //   396: bastore
    //   397: dup
    //   398: bipush #16
    //   400: bipush #-89
    //   402: bastore
    //   403: dup
    //   404: bipush #17
    //   406: bipush #89
    //   408: bastore
    //   409: dup
    //   410: bipush #18
    //   412: bipush #49
    //   414: bastore
    //   415: dup
    //   416: bipush #19
    //   418: bipush #-119
    //   420: bastore
    //   421: dup
    //   422: bipush #20
    //   424: bipush #-44
    //   426: bastore
    //   427: dup
    //   428: bipush #21
    //   430: bipush #12
    //   432: bastore
    //   433: dup
    //   434: bipush #22
    //   436: bipush #27
    //   438: bastore
    //   439: dup
    //   440: bipush #23
    //   442: bipush #32
    //   444: bastore
    //   445: dup
    //   446: bipush #24
    //   448: bipush #-127
    //   450: bastore
    //   451: dup
    //   452: bipush #25
    //   454: bipush #-113
    //   456: bastore
    //   457: dup
    //   458: bipush #26
    //   460: bipush #90
    //   462: bastore
    //   463: dup
    //   464: bipush #27
    //   466: bipush #110
    //   468: bastore
    //   469: dup
    //   470: bipush #28
    //   472: bipush #-17
    //   474: bastore
    //   475: dup
    //   476: bipush #29
    //   478: bipush #112
    //   480: bastore
    //   481: dup
    //   482: bipush #30
    //   484: bipush #101
    //   486: bastore
    //   487: dup
    //   488: bipush #31
    //   490: bipush #-12
    //   492: bastore
    //   493: invokespecial <init> : ([B)V
    //   496: putstatic burp/Zmhx.ZQ : Ljava/lang/Object;
    //   499: sipush #-30457
    //   502: sipush #15429
    //   505: invokestatic a : (II)Ljava/lang/String;
    //   508: putstatic burp/Zmhx.ZD : Ljava/lang/String;
    //   511: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF8905) & 0xFFFF;
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
      char c = 'ë';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmhx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */