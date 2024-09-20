package burp;

import java.math.BigInteger;

class Zxci extends ClassLoader {
  static String Zw;
  
  static Object Zx;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZJ(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean ZC(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zbow.ZS : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: invokevirtual toByteArray : ()[B
    //   13: astore_3
    //   14: aload_3
    //   15: arraylength
    //   16: iconst_2
    //   17: iadd
    //   18: newarray byte
    //   20: astore #5
    //   22: iconst_0
    //   23: istore #6
    //   25: iload #6
    //   27: aload_3
    //   28: arraylength
    //   29: if_icmpge -> 48
    //   32: aload #5
    //   34: iload #6
    //   36: aload_3
    //   37: iload #6
    //   39: baload
    //   40: bastore
    //   41: iinc #6, 1
    //   44: iload_2
    //   45: ifeq -> 25
    //   48: aload #5
    //   50: arraylength
    //   51: iconst_3
    //   52: idiv
    //   53: iconst_4
    //   54: imul
    //   55: newarray byte
    //   57: astore #4
    //   59: iconst_0
    //   60: istore #6
    //   62: iconst_0
    //   63: istore #7
    //   65: iload #6
    //   67: aload_3
    //   68: arraylength
    //   69: if_icmpge -> 180
    //   72: aload #4
    //   74: iload #7
    //   76: aload #5
    //   78: iload #6
    //   80: baload
    //   81: iconst_2
    //   82: iushr
    //   83: bipush #63
    //   85: iand
    //   86: i2b
    //   87: bastore
    //   88: aload #4
    //   90: iload #7
    //   92: iconst_1
    //   93: iadd
    //   94: aload #5
    //   96: iload #6
    //   98: iconst_1
    //   99: iadd
    //   100: baload
    //   101: iconst_4
    //   102: iushr
    //   103: bipush #15
    //   105: iand
    //   106: aload #5
    //   108: iload #6
    //   110: baload
    //   111: iconst_4
    //   112: ishl
    //   113: bipush #63
    //   115: iand
    //   116: ior
    //   117: i2b
    //   118: bastore
    //   119: aload #4
    //   121: iload #7
    //   123: iconst_2
    //   124: iadd
    //   125: aload #5
    //   127: iload #6
    //   129: iconst_2
    //   130: iadd
    //   131: baload
    //   132: bipush #6
    //   134: iushr
    //   135: iconst_3
    //   136: iand
    //   137: aload #5
    //   139: iload #6
    //   141: iconst_1
    //   142: iadd
    //   143: baload
    //   144: iconst_2
    //   145: ishl
    //   146: bipush #63
    //   148: iand
    //   149: ior
    //   150: i2b
    //   151: bastore
    //   152: aload #4
    //   154: iload #7
    //   156: iconst_3
    //   157: iadd
    //   158: aload #5
    //   160: iload #6
    //   162: iconst_2
    //   163: iadd
    //   164: baload
    //   165: bipush #63
    //   167: iand
    //   168: i2b
    //   169: bastore
    //   170: iinc #6, 3
    //   173: iinc #7, 4
    //   176: iload_2
    //   177: ifeq -> 65
    //   180: iconst_0
    //   181: istore #6
    //   183: iload #6
    //   185: aload #4
    //   187: arraylength
    //   188: if_icmpge -> 372
    //   191: aload #4
    //   193: iload #6
    //   195: baload
    //   196: bipush #26
    //   198: if_icmpge -> 226
    //   201: aload #4
    //   203: iload #6
    //   205: aload #4
    //   207: iload #6
    //   209: baload
    //   210: bipush #65
    //   212: iadd
    //   213: i2b
    //   214: bastore
    //   215: iload_2
    //   216: ifeq -> 365
    //   219: goto -> 226
    //   222: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   225: athrow
    //   226: aload #4
    //   228: iload #6
    //   230: baload
    //   231: bipush #52
    //   233: if_icmpge -> 271
    //   236: goto -> 243
    //   239: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   242: athrow
    //   243: aload #4
    //   245: iload #6
    //   247: aload #4
    //   249: iload #6
    //   251: baload
    //   252: bipush #97
    //   254: iadd
    //   255: bipush #26
    //   257: isub
    //   258: i2b
    //   259: bastore
    //   260: iload_2
    //   261: ifeq -> 365
    //   264: goto -> 271
    //   267: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   270: athrow
    //   271: aload #4
    //   273: iload #6
    //   275: baload
    //   276: bipush #62
    //   278: if_icmpge -> 316
    //   281: goto -> 288
    //   284: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   287: athrow
    //   288: aload #4
    //   290: iload #6
    //   292: aload #4
    //   294: iload #6
    //   296: baload
    //   297: bipush #48
    //   299: iadd
    //   300: bipush #52
    //   302: isub
    //   303: i2b
    //   304: bastore
    //   305: iload_2
    //   306: ifeq -> 365
    //   309: goto -> 316
    //   312: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   315: athrow
    //   316: aload #4
    //   318: iload #6
    //   320: baload
    //   321: bipush #63
    //   323: if_icmpge -> 351
    //   326: goto -> 333
    //   329: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   332: athrow
    //   333: aload #4
    //   335: iload #6
    //   337: bipush #43
    //   339: bastore
    //   340: iload_2
    //   341: ifeq -> 365
    //   344: goto -> 351
    //   347: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   350: athrow
    //   351: aload #4
    //   353: iload #6
    //   355: bipush #47
    //   357: bastore
    //   358: goto -> 365
    //   361: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   364: athrow
    //   365: iinc #6, 1
    //   368: iload_2
    //   369: ifeq -> 183
    //   372: aload #4
    //   374: arraylength
    //   375: iconst_1
    //   376: isub
    //   377: istore #6
    //   379: iload #6
    //   381: aload_3
    //   382: arraylength
    //   383: iconst_4
    //   384: imul
    //   385: iconst_3
    //   386: idiv
    //   387: if_icmple -> 404
    //   390: aload #4
    //   392: iload #6
    //   394: bipush #61
    //   396: bastore
    //   397: iinc #6, -1
    //   400: iload_2
    //   401: ifeq -> 379
    //   404: new java/math/BigInteger
    //   407: dup
    //   408: aload #4
    //   410: invokespecial <init> : ([B)V
    //   413: invokevirtual abs : ()Ljava/math/BigInteger;
    //   416: putstatic burp/Zt7x.ZE : Ljava/lang/Object;
    //   419: sipush #17960
    //   422: sipush #31085
    //   425: invokestatic a : (II)Ljava/lang/String;
    //   428: iconst_1
    //   429: ldc burp/Zmji
    //   431: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   434: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   437: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   440: astore_3
    //   441: aload_3
    //   442: arraylength
    //   443: istore #4
    //   445: iconst_0
    //   446: istore #5
    //   448: iload #5
    //   450: iload #4
    //   452: if_icmpge -> 589
    //   455: aload_3
    //   456: iload #5
    //   458: aaload
    //   459: astore #6
    //   461: aload #6
    //   463: invokevirtual getModifiers : ()I
    //   466: invokestatic isStatic : (I)Z
    //   469: ifne -> 479
    //   472: goto -> 582
    //   475: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   478: athrow
    //   479: aload #6
    //   481: invokevirtual getType : ()Ljava/lang/Class;
    //   484: astore #7
    //   486: aload #7
    //   488: ifnull -> 569
    //   491: aload #7
    //   493: invokevirtual isPrimitive : ()Z
    //   496: ifne -> 569
    //   499: goto -> 506
    //   502: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   505: athrow
    //   506: aload #7
    //   508: invokevirtual getPackage : ()Ljava/lang/Package;
    //   511: ifnull -> 569
    //   514: goto -> 521
    //   517: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   520: athrow
    //   521: aload #7
    //   523: invokevirtual getPackage : ()Ljava/lang/Package;
    //   526: invokevirtual getName : ()Ljava/lang/String;
    //   529: ifnull -> 569
    //   532: goto -> 539
    //   535: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   538: athrow
    //   539: aload #7
    //   541: invokevirtual getPackage : ()Ljava/lang/Package;
    //   544: invokevirtual getName : ()Ljava/lang/String;
    //   547: sipush #17965
    //   550: sipush #-7693
    //   553: invokestatic a : (II)Ljava/lang/String;
    //   556: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   559: ifne -> 569
    //   562: goto -> 569
    //   565: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   568: athrow
    //   569: aload #6
    //   571: iconst_1
    //   572: invokevirtual setAccessible : (Z)V
    //   575: aload #6
    //   577: aconst_null
    //   578: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   581: pop
    //   582: iinc #5, 1
    //   585: iload_2
    //   586: ifeq -> 448
    //   589: sipush #17967
    //   592: sipush #31665
    //   595: invokestatic a : (II)Ljava/lang/String;
    //   598: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   601: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   604: astore_3
    //   605: aload_3
    //   606: arraylength
    //   607: istore #4
    //   609: iconst_0
    //   610: istore #5
    //   612: iload #5
    //   614: iload #4
    //   616: if_icmpge -> 748
    //   619: aload_3
    //   620: iload #5
    //   622: aaload
    //   623: astore #6
    //   625: aload #6
    //   627: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   630: pop
    //   631: aload #6
    //   633: invokevirtual getModifiers : ()I
    //   636: invokestatic isStatic : (I)Z
    //   639: ifeq -> 734
    //   642: aload #6
    //   644: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   647: arraylength
    //   648: iconst_2
    //   649: if_icmpne -> 734
    //   652: goto -> 659
    //   655: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   658: athrow
    //   659: aload #6
    //   661: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   664: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   667: invokevirtual equals : (Ljava/lang/Object;)Z
    //   670: ifeq -> 734
    //   673: goto -> 680
    //   676: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   679: athrow
    //   680: aload #6
    //   682: iconst_1
    //   683: invokevirtual setAccessible : (Z)V
    //   686: aload #6
    //   688: aconst_null
    //   689: iconst_2
    //   690: anewarray java/lang/Object
    //   693: dup
    //   694: iconst_0
    //   695: aload_0
    //   696: aastore
    //   697: dup
    //   698: iconst_1
    //   699: aload_1
    //   700: ifnonnull -> 718
    //   703: goto -> 710
    //   706: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   709: athrow
    //   710: aload_1
    //   711: goto -> 725
    //   714: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   717: athrow
    //   718: aload_1
    //   719: checkcast [B
    //   722: invokevirtual clone : ()Ljava/lang/Object;
    //   725: aastore
    //   726: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   729: pop
    //   730: iload_2
    //   731: ifeq -> 748
    //   734: iinc #5, 1
    //   737: iload_2
    //   738: ifeq -> 612
    //   741: goto -> 748
    //   744: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   747: athrow
    //   748: getstatic burp/Zbx4.Zw : Ljava/lang/Object;
    //   751: checkcast java/math/BigInteger
    //   754: invokevirtual toByteArray : ()[B
    //   757: astore_3
    //   758: aload_3
    //   759: arraylength
    //   760: iconst_2
    //   761: iadd
    //   762: newarray byte
    //   764: astore #5
    //   766: iconst_0
    //   767: istore #6
    //   769: iload #6
    //   771: aload_3
    //   772: arraylength
    //   773: if_icmpge -> 792
    //   776: aload #5
    //   778: iload #6
    //   780: aload_3
    //   781: iload #6
    //   783: baload
    //   784: bastore
    //   785: iinc #6, 1
    //   788: iload_2
    //   789: ifeq -> 769
    //   792: aload #5
    //   794: arraylength
    //   795: iconst_3
    //   796: idiv
    //   797: iconst_4
    //   798: imul
    //   799: newarray byte
    //   801: astore #4
    //   803: iconst_0
    //   804: istore #6
    //   806: iconst_0
    //   807: istore #7
    //   809: iload #6
    //   811: aload_3
    //   812: arraylength
    //   813: if_icmpge -> 924
    //   816: aload #4
    //   818: iload #7
    //   820: aload #5
    //   822: iload #6
    //   824: baload
    //   825: iconst_2
    //   826: iushr
    //   827: bipush #63
    //   829: iand
    //   830: i2b
    //   831: bastore
    //   832: aload #4
    //   834: iload #7
    //   836: iconst_1
    //   837: iadd
    //   838: aload #5
    //   840: iload #6
    //   842: iconst_1
    //   843: iadd
    //   844: baload
    //   845: iconst_4
    //   846: iushr
    //   847: bipush #15
    //   849: iand
    //   850: aload #5
    //   852: iload #6
    //   854: baload
    //   855: iconst_4
    //   856: ishl
    //   857: bipush #63
    //   859: iand
    //   860: ior
    //   861: i2b
    //   862: bastore
    //   863: aload #4
    //   865: iload #7
    //   867: iconst_2
    //   868: iadd
    //   869: aload #5
    //   871: iload #6
    //   873: iconst_2
    //   874: iadd
    //   875: baload
    //   876: bipush #6
    //   878: iushr
    //   879: iconst_3
    //   880: iand
    //   881: aload #5
    //   883: iload #6
    //   885: iconst_1
    //   886: iadd
    //   887: baload
    //   888: iconst_2
    //   889: ishl
    //   890: bipush #63
    //   892: iand
    //   893: ior
    //   894: i2b
    //   895: bastore
    //   896: aload #4
    //   898: iload #7
    //   900: iconst_3
    //   901: iadd
    //   902: aload #5
    //   904: iload #6
    //   906: iconst_2
    //   907: iadd
    //   908: baload
    //   909: bipush #63
    //   911: iand
    //   912: i2b
    //   913: bastore
    //   914: iinc #6, 3
    //   917: iinc #7, 4
    //   920: iload_2
    //   921: ifeq -> 809
    //   924: iconst_0
    //   925: istore #6
    //   927: iload #6
    //   929: aload #4
    //   931: arraylength
    //   932: if_icmpge -> 1116
    //   935: aload #4
    //   937: iload #6
    //   939: baload
    //   940: bipush #26
    //   942: if_icmpge -> 970
    //   945: aload #4
    //   947: iload #6
    //   949: aload #4
    //   951: iload #6
    //   953: baload
    //   954: bipush #65
    //   956: iadd
    //   957: i2b
    //   958: bastore
    //   959: iload_2
    //   960: ifeq -> 1109
    //   963: goto -> 970
    //   966: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   969: athrow
    //   970: aload #4
    //   972: iload #6
    //   974: baload
    //   975: bipush #52
    //   977: if_icmpge -> 1015
    //   980: goto -> 987
    //   983: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   986: athrow
    //   987: aload #4
    //   989: iload #6
    //   991: aload #4
    //   993: iload #6
    //   995: baload
    //   996: bipush #97
    //   998: iadd
    //   999: bipush #26
    //   1001: isub
    //   1002: i2b
    //   1003: bastore
    //   1004: iload_2
    //   1005: ifeq -> 1109
    //   1008: goto -> 1015
    //   1011: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1014: athrow
    //   1015: aload #4
    //   1017: iload #6
    //   1019: baload
    //   1020: bipush #62
    //   1022: if_icmpge -> 1060
    //   1025: goto -> 1032
    //   1028: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1031: athrow
    //   1032: aload #4
    //   1034: iload #6
    //   1036: aload #4
    //   1038: iload #6
    //   1040: baload
    //   1041: bipush #48
    //   1043: iadd
    //   1044: bipush #52
    //   1046: isub
    //   1047: i2b
    //   1048: bastore
    //   1049: iload_2
    //   1050: ifeq -> 1109
    //   1053: goto -> 1060
    //   1056: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1059: athrow
    //   1060: aload #4
    //   1062: iload #6
    //   1064: baload
    //   1065: bipush #63
    //   1067: if_icmpge -> 1095
    //   1070: goto -> 1077
    //   1073: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1076: athrow
    //   1077: aload #4
    //   1079: iload #6
    //   1081: bipush #43
    //   1083: bastore
    //   1084: iload_2
    //   1085: ifeq -> 1109
    //   1088: goto -> 1095
    //   1091: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1094: athrow
    //   1095: aload #4
    //   1097: iload #6
    //   1099: bipush #47
    //   1101: bastore
    //   1102: goto -> 1109
    //   1105: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1108: athrow
    //   1109: iinc #6, 1
    //   1112: iload_2
    //   1113: ifeq -> 927
    //   1116: aload #4
    //   1118: arraylength
    //   1119: iconst_1
    //   1120: isub
    //   1121: istore #6
    //   1123: iload #6
    //   1125: aload_3
    //   1126: arraylength
    //   1127: iconst_4
    //   1128: imul
    //   1129: iconst_3
    //   1130: idiv
    //   1131: if_icmple -> 1148
    //   1134: aload #4
    //   1136: iload #6
    //   1138: bipush #61
    //   1140: bastore
    //   1141: iinc #6, -1
    //   1144: iload_2
    //   1145: ifeq -> 1123
    //   1148: getstatic burp/Zb4d.ZS : Ljava/lang/String;
    //   1151: getstatic burp/Zlc2.ZQ : Ljava/lang/Object;
    //   1154: checkcast java/math/BigInteger
    //   1157: invokevirtual intValue : ()I
    //   1160: bipush #32
    //   1162: irem
    //   1163: invokestatic abs : (I)I
    //   1166: invokevirtual charAt : (I)C
    //   1169: getstatic burp/Zz91.Zx : Ljava/lang/String;
    //   1172: getstatic burp/Zzmc.Zg : Ljava/lang/Object;
    //   1175: checkcast java/math/BigInteger
    //   1178: invokevirtual intValue : ()I
    //   1181: bipush #32
    //   1183: irem
    //   1184: invokestatic abs : (I)I
    //   1187: invokevirtual charAt : (I)C
    //   1190: if_icmpgt -> 1305
    //   1193: getstatic burp/Zzts.Zk : Ljava/lang/String;
    //   1196: getstatic burp/Zrb6.ZQ : Ljava/lang/Object;
    //   1199: checkcast java/math/BigInteger
    //   1202: invokevirtual intValue : ()I
    //   1205: bipush #32
    //   1207: irem
    //   1208: invokestatic abs : (I)I
    //   1211: invokevirtual charAt : (I)C
    //   1214: getstatic burp/Zld5.ZO : Ljava/lang/String;
    //   1217: getstatic burp/Zbjx.ZT : Ljava/lang/Object;
    //   1220: checkcast java/math/BigInteger
    //   1223: invokevirtual intValue : ()I
    //   1226: bipush #32
    //   1228: irem
    //   1229: invokestatic abs : (I)I
    //   1232: invokevirtual charAt : (I)C
    //   1235: if_icmpgt -> 1305
    //   1238: goto -> 1245
    //   1241: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1244: athrow
    //   1245: getstatic burp/Zrww.ZV : Ljava/lang/String;
    //   1248: getstatic burp/Zlwm.Ze : Ljava/lang/Object;
    //   1251: checkcast java/math/BigInteger
    //   1254: invokevirtual intValue : ()I
    //   1257: bipush #32
    //   1259: irem
    //   1260: invokestatic abs : (I)I
    //   1263: invokevirtual charAt : (I)C
    //   1266: getstatic burp/Zlw8.Zs : Ljava/lang/String;
    //   1269: getstatic burp/Zg7e.Zr : Ljava/lang/Object;
    //   1272: checkcast java/math/BigInteger
    //   1275: invokevirtual intValue : ()I
    //   1278: bipush #32
    //   1280: irem
    //   1281: invokestatic abs : (I)I
    //   1284: invokevirtual charAt : (I)C
    //   1287: if_icmple -> 1305
    //   1290: goto -> 1297
    //   1293: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1296: athrow
    //   1297: iconst_1
    //   1298: goto -> 1306
    //   1301: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1304: athrow
    //   1305: iconst_0
    //   1306: ireturn
    //   1307: astore_3
    //   1308: new java/lang/Exception
    //   1311: dup
    //   1312: aload_3
    //   1313: invokevirtual getMessage : ()Ljava/lang/String;
    //   1316: invokespecial <init> : (Ljava/lang/String;)V
    //   1319: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1306	1307	java/lang/Throwable
    //   191	219	222	java/lang/Throwable
    //   201	236	239	java/lang/Throwable
    //   226	264	267	java/lang/Throwable
    //   243	281	284	java/lang/Throwable
    //   271	309	312	java/lang/Throwable
    //   288	326	329	java/lang/Throwable
    //   316	344	347	java/lang/Throwable
    //   333	358	361	java/lang/Throwable
    //   461	475	475	java/lang/Throwable
    //   486	499	502	java/lang/Throwable
    //   491	514	517	java/lang/Throwable
    //   506	532	535	java/lang/Throwable
    //   521	562	565	java/lang/Throwable
    //   625	652	655	java/lang/Throwable
    //   642	673	676	java/lang/Throwable
    //   659	703	706	java/lang/Throwable
    //   680	714	714	java/lang/Throwable
    //   725	741	744	java/lang/Throwable
    //   935	963	966	java/lang/Throwable
    //   945	980	983	java/lang/Throwable
    //   970	1008	1011	java/lang/Throwable
    //   987	1025	1028	java/lang/Throwable
    //   1015	1053	1056	java/lang/Throwable
    //   1032	1070	1073	java/lang/Throwable
    //   1060	1088	1091	java/lang/Throwable
    //   1077	1102	1105	java/lang/Throwable
    //   1148	1238	1241	java/lang/Throwable
    //   1193	1290	1293	java/lang/Throwable
    //   1245	1301	1301	java/lang/Throwable
  }
  
  static void Zj(Object paramObject) {
    Zssc.ZR = a(17964, 2450);
    Zssc.Zr = new BigInteger(a(17961, -25874));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zthx.Ze.charAt(Math.abs(((BigInteger)Ztq8.Zm).intValue() % 32)) > Zmkq.Zr.charAt(Math.abs(((BigInteger)Zlo0.Zu).intValue() % 32))) {
          try {
            Zr2q.Zr(Class.forName(a(17963, 3492)));
            if (bool)
              Ztvp.Zc(Class.forName(a(17962, -15405))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Ztvp.Zc(Class.forName(a(17962, -15405)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'YµWó I÷q ·9*1Jk\\bªl^H_!þÏ^ùh éµ{°ä[~TÑ\\fkxÉÖ±ã@Ìñvhaç]¥´\\tè(¾OÍ]\\tZMÓ\\n0[dZ LÓVFl1Fzm?5ÎO "ú4¨\.ê Qú¢R `ïúPJé¨å××|ÂºÍ#àÌè?õ^¡%»ó~^ÀH/¦ßì'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #32
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #124
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
    //   68: ldc 'ë8d%G?\\t%ñ½|eïk'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #89
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
    //   129: putstatic burp/Zxci.a : [Ljava/lang/String;
    //   132: bipush #8
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zxci.b : [Ljava/lang/String;
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
    //   212: bipush #89
    //   214: goto -> 244
    //   217: bipush #109
    //   219: goto -> 244
    //   222: bipush #28
    //   224: goto -> 244
    //   227: bipush #86
    //   229: goto -> 244
    //   232: bipush #40
    //   234: goto -> 244
    //   237: bipush #7
    //   239: goto -> 244
    //   242: bipush #26
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
    //   300: sipush #17966
    //   303: sipush #-12003
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zxci.Zw : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: iconst_1
    //   317: bipush #32
    //   319: newarray byte
    //   321: dup
    //   322: iconst_0
    //   323: bipush #21
    //   325: bastore
    //   326: dup
    //   327: iconst_1
    //   328: bipush #72
    //   330: bastore
    //   331: dup
    //   332: iconst_2
    //   333: bipush #103
    //   335: bastore
    //   336: dup
    //   337: iconst_3
    //   338: bipush #-57
    //   340: bastore
    //   341: dup
    //   342: iconst_4
    //   343: bipush #115
    //   345: bastore
    //   346: dup
    //   347: iconst_5
    //   348: bipush #73
    //   350: bastore
    //   351: dup
    //   352: bipush #6
    //   354: bipush #-42
    //   356: bastore
    //   357: dup
    //   358: bipush #7
    //   360: bipush #33
    //   362: bastore
    //   363: dup
    //   364: bipush #8
    //   366: bipush #-33
    //   368: bastore
    //   369: dup
    //   370: bipush #9
    //   372: bipush #55
    //   374: bastore
    //   375: dup
    //   376: bipush #10
    //   378: bipush #-19
    //   380: bastore
    //   381: dup
    //   382: bipush #11
    //   384: bipush #-85
    //   386: bastore
    //   387: dup
    //   388: bipush #12
    //   390: bipush #82
    //   392: bastore
    //   393: dup
    //   394: bipush #13
    //   396: bipush #123
    //   398: bastore
    //   399: dup
    //   400: bipush #14
    //   402: bipush #38
    //   404: bastore
    //   405: dup
    //   406: bipush #15
    //   408: bipush #118
    //   410: bastore
    //   411: dup
    //   412: bipush #16
    //   414: bipush #45
    //   416: bastore
    //   417: dup
    //   418: bipush #17
    //   420: bipush #-23
    //   422: bastore
    //   423: dup
    //   424: bipush #18
    //   426: bipush #-8
    //   428: bastore
    //   429: dup
    //   430: bipush #19
    //   432: bipush #64
    //   434: bastore
    //   435: dup
    //   436: bipush #20
    //   438: bipush #121
    //   440: bastore
    //   441: dup
    //   442: bipush #21
    //   444: bipush #-53
    //   446: bastore
    //   447: dup
    //   448: bipush #22
    //   450: bipush #105
    //   452: bastore
    //   453: dup
    //   454: bipush #23
    //   456: bipush #30
    //   458: bastore
    //   459: dup
    //   460: bipush #24
    //   462: bipush #58
    //   464: bastore
    //   465: dup
    //   466: bipush #25
    //   468: bipush #8
    //   470: bastore
    //   471: dup
    //   472: bipush #26
    //   474: bipush #-90
    //   476: bastore
    //   477: dup
    //   478: bipush #27
    //   480: bipush #-69
    //   482: bastore
    //   483: dup
    //   484: bipush #28
    //   486: bipush #-23
    //   488: bastore
    //   489: dup
    //   490: bipush #29
    //   492: bipush #-29
    //   494: bastore
    //   495: dup
    //   496: bipush #30
    //   498: bipush #100
    //   500: bastore
    //   501: dup
    //   502: bipush #31
    //   504: bipush #-58
    //   506: bastore
    //   507: invokespecial <init> : (I[B)V
    //   510: putstatic burp/Zxci.Zx : Ljava/lang/Object;
    //   513: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x462C) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxci.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */