package burp;

import java.math.BigInteger;

class Zskf extends ClassLoader {
  static Object ZQ;
  
  static String ZV;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean ZA(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zt6z.Zl : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Ztvg.ZO : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Ztwp.Ze : Ljava/lang/Object;
    //   22: ldc2_w 8682522807148012
    //   25: invokestatic currentTimeMillis : ()J
    //   28: lxor
    //   29: lstore #4
    //   31: lload #4
    //   33: ldc2_w 25214903917
    //   36: lmul
    //   37: ldc2_w 11
    //   40: ladd
    //   41: ldc2_w 281474976710655
    //   44: land
    //   45: lstore #4
    //   47: lload #4
    //   49: bipush #32
    //   51: lshl
    //   52: lstore #6
    //   54: lload #4
    //   56: ldc2_w 25214903917
    //   59: lmul
    //   60: ldc2_w 11
    //   63: ladd
    //   64: ldc2_w 281474976710655
    //   67: land
    //   68: lstore #4
    //   70: lload #6
    //   72: lload #4
    //   74: ladd
    //   75: lstore #6
    //   77: bipush #16
    //   79: newarray byte
    //   81: dup
    //   82: iconst_0
    //   83: bipush #48
    //   85: bastore
    //   86: dup
    //   87: iconst_1
    //   88: bipush #49
    //   90: bastore
    //   91: dup
    //   92: iconst_2
    //   93: bipush #50
    //   95: bastore
    //   96: dup
    //   97: iconst_3
    //   98: bipush #51
    //   100: bastore
    //   101: dup
    //   102: iconst_4
    //   103: bipush #52
    //   105: bastore
    //   106: dup
    //   107: iconst_5
    //   108: bipush #53
    //   110: bastore
    //   111: dup
    //   112: bipush #6
    //   114: bipush #54
    //   116: bastore
    //   117: dup
    //   118: bipush #7
    //   120: bipush #55
    //   122: bastore
    //   123: dup
    //   124: bipush #8
    //   126: bipush #56
    //   128: bastore
    //   129: dup
    //   130: bipush #9
    //   132: bipush #57
    //   134: bastore
    //   135: dup
    //   136: bipush #10
    //   138: bipush #97
    //   140: bastore
    //   141: dup
    //   142: bipush #11
    //   144: bipush #98
    //   146: bastore
    //   147: dup
    //   148: bipush #12
    //   150: bipush #99
    //   152: bastore
    //   153: dup
    //   154: bipush #13
    //   156: bipush #100
    //   158: bastore
    //   159: dup
    //   160: bipush #14
    //   162: bipush #101
    //   164: bastore
    //   165: dup
    //   166: bipush #15
    //   168: bipush #102
    //   170: bastore
    //   171: astore #8
    //   173: bipush #64
    //   175: newarray byte
    //   177: astore #9
    //   179: bipush #64
    //   181: istore #10
    //   183: bipush #16
    //   185: istore #11
    //   187: iload #11
    //   189: iconst_1
    //   190: isub
    //   191: i2l
    //   192: lstore #12
    //   194: aload #9
    //   196: iinc #10, -1
    //   199: iload #10
    //   201: aload #8
    //   203: lload #6
    //   205: lload #12
    //   207: land
    //   208: l2i
    //   209: baload
    //   210: bastore
    //   211: lload #6
    //   213: iconst_4
    //   214: lushr
    //   215: lstore #6
    //   217: lload #6
    //   219: lconst_0
    //   220: lcmp
    //   221: ifne -> 194
    //   224: bipush #64
    //   226: iload #10
    //   228: isub
    //   229: newarray byte
    //   231: astore_3
    //   232: iconst_0
    //   233: istore #14
    //   235: iload #14
    //   237: aload_3
    //   238: arraylength
    //   239: if_icmpge -> 261
    //   242: aload_3
    //   243: iload #14
    //   245: aload #9
    //   247: iload #10
    //   249: iload #14
    //   251: iadd
    //   252: baload
    //   253: bastore
    //   254: iinc #14, 1
    //   257: iload_2
    //   258: ifne -> 235
    //   261: aload_3
    //   262: arraylength
    //   263: bipush #10
    //   265: if_icmplt -> 31
    //   268: sipush #-11121
    //   271: sipush #13726
    //   274: invokestatic a : (II)Ljava/lang/String;
    //   277: iconst_1
    //   278: ldc burp/Zbsr
    //   280: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   283: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   286: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   289: astore_3
    //   290: aload_3
    //   291: arraylength
    //   292: istore #4
    //   294: iconst_0
    //   295: istore #5
    //   297: iload #5
    //   299: iload #4
    //   301: if_icmpge -> 438
    //   304: aload_3
    //   305: iload #5
    //   307: aaload
    //   308: astore #6
    //   310: aload #6
    //   312: invokevirtual getModifiers : ()I
    //   315: invokestatic isStatic : (I)Z
    //   318: ifne -> 328
    //   321: goto -> 431
    //   324: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   327: athrow
    //   328: aload #6
    //   330: invokevirtual getType : ()Ljava/lang/Class;
    //   333: astore #7
    //   335: aload #7
    //   337: ifnull -> 418
    //   340: aload #7
    //   342: invokevirtual isPrimitive : ()Z
    //   345: ifne -> 418
    //   348: goto -> 355
    //   351: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   354: athrow
    //   355: aload #7
    //   357: invokevirtual getPackage : ()Ljava/lang/Package;
    //   360: ifnull -> 418
    //   363: goto -> 370
    //   366: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   369: athrow
    //   370: aload #7
    //   372: invokevirtual getPackage : ()Ljava/lang/Package;
    //   375: invokevirtual getName : ()Ljava/lang/String;
    //   378: ifnull -> 418
    //   381: goto -> 388
    //   384: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   387: athrow
    //   388: aload #7
    //   390: invokevirtual getPackage : ()Ljava/lang/Package;
    //   393: invokevirtual getName : ()Ljava/lang/String;
    //   396: sipush #-11122
    //   399: sipush #-26437
    //   402: invokestatic a : (II)Ljava/lang/String;
    //   405: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   408: ifne -> 418
    //   411: goto -> 418
    //   414: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   417: athrow
    //   418: aload #6
    //   420: iconst_1
    //   421: invokevirtual setAccessible : (Z)V
    //   424: aload #6
    //   426: aconst_null
    //   427: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   430: pop
    //   431: iinc #5, 1
    //   434: iload_2
    //   435: ifne -> 297
    //   438: sipush #-11128
    //   441: sipush #5840
    //   444: invokestatic a : (II)Ljava/lang/String;
    //   447: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   450: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   453: astore_3
    //   454: aload_3
    //   455: arraylength
    //   456: istore #4
    //   458: iconst_0
    //   459: istore #5
    //   461: iload #5
    //   463: iload #4
    //   465: if_icmpge -> 597
    //   468: aload_3
    //   469: iload #5
    //   471: aaload
    //   472: astore #6
    //   474: aload #6
    //   476: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   479: pop
    //   480: aload #6
    //   482: invokevirtual getModifiers : ()I
    //   485: invokestatic isStatic : (I)Z
    //   488: ifeq -> 583
    //   491: aload #6
    //   493: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   496: arraylength
    //   497: iconst_2
    //   498: if_icmpne -> 583
    //   501: goto -> 508
    //   504: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   507: athrow
    //   508: aload #6
    //   510: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   513: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   516: invokevirtual equals : (Ljava/lang/Object;)Z
    //   519: ifeq -> 583
    //   522: goto -> 529
    //   525: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   528: athrow
    //   529: aload #6
    //   531: iconst_1
    //   532: invokevirtual setAccessible : (Z)V
    //   535: aload #6
    //   537: aconst_null
    //   538: iconst_2
    //   539: anewarray java/lang/Object
    //   542: dup
    //   543: iconst_0
    //   544: aload_0
    //   545: aastore
    //   546: dup
    //   547: iconst_1
    //   548: aload_1
    //   549: ifnonnull -> 567
    //   552: goto -> 559
    //   555: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   558: athrow
    //   559: aload_1
    //   560: goto -> 574
    //   563: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   566: athrow
    //   567: aload_1
    //   568: checkcast [B
    //   571: invokevirtual clone : ()Ljava/lang/Object;
    //   574: aastore
    //   575: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   578: pop
    //   579: iload_2
    //   580: ifne -> 597
    //   583: iinc #5, 1
    //   586: iload_2
    //   587: ifne -> 461
    //   590: goto -> 597
    //   593: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   596: athrow
    //   597: getstatic burp/Zexl.ZG : Ljava/lang/Object;
    //   600: checkcast java/math/BigInteger
    //   603: invokevirtual toByteArray : ()[B
    //   606: astore_3
    //   607: aload_3
    //   608: arraylength
    //   609: bipush #8
    //   611: iadd
    //   612: bipush #6
    //   614: ishr
    //   615: iconst_1
    //   616: iadd
    //   617: bipush #16
    //   619: imul
    //   620: newarray int
    //   622: astore #5
    //   624: iconst_0
    //   625: istore #6
    //   627: iload #6
    //   629: aload_3
    //   630: arraylength
    //   631: if_icmpge -> 674
    //   634: aload_3
    //   635: iload #6
    //   637: baload
    //   638: sipush #255
    //   641: iand
    //   642: istore #7
    //   644: aload #5
    //   646: iload #6
    //   648: iconst_2
    //   649: ishr
    //   650: dup2
    //   651: iaload
    //   652: iload #7
    //   654: bipush #24
    //   656: iload #6
    //   658: iconst_4
    //   659: irem
    //   660: bipush #8
    //   662: imul
    //   663: isub
    //   664: ishl
    //   665: ior
    //   666: iastore
    //   667: iinc #6, 1
    //   670: iload_2
    //   671: ifne -> 627
    //   674: aload #5
    //   676: iload #6
    //   678: iconst_2
    //   679: ishr
    //   680: dup2
    //   681: iaload
    //   682: sipush #128
    //   685: bipush #24
    //   687: iload #6
    //   689: iconst_4
    //   690: irem
    //   691: bipush #8
    //   693: imul
    //   694: isub
    //   695: ishl
    //   696: ior
    //   697: iastore
    //   698: aload #5
    //   700: aload #5
    //   702: arraylength
    //   703: iconst_1
    //   704: isub
    //   705: aload_3
    //   706: arraylength
    //   707: bipush #8
    //   709: imul
    //   710: iastore
    //   711: bipush #80
    //   713: newarray int
    //   715: astore #7
    //   717: ldc 1732584193
    //   719: istore #8
    //   721: ldc -271733879
    //   723: istore #9
    //   725: ldc -1732584194
    //   727: istore #10
    //   729: ldc 271733878
    //   731: istore #11
    //   733: ldc -1009589776
    //   735: istore #12
    //   737: iconst_0
    //   738: istore #6
    //   740: iload #6
    //   742: aload #5
    //   744: arraylength
    //   745: if_icmpge -> 1067
    //   748: iload #8
    //   750: istore #13
    //   752: iload #9
    //   754: istore #14
    //   756: iload #10
    //   758: istore #15
    //   760: iload #11
    //   762: istore #16
    //   764: iload #12
    //   766: istore #17
    //   768: iconst_0
    //   769: istore #18
    //   771: iload #18
    //   773: bipush #80
    //   775: if_icmpge -> 1025
    //   778: iload #18
    //   780: bipush #16
    //   782: if_icmpge -> 809
    //   785: aload #7
    //   787: iload #18
    //   789: aload #5
    //   791: iload #6
    //   793: iload #18
    //   795: iadd
    //   796: iaload
    //   797: iastore
    //   798: iload_2
    //   799: ifne -> 864
    //   802: goto -> 809
    //   805: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   808: athrow
    //   809: aload #7
    //   811: iload #18
    //   813: iconst_3
    //   814: isub
    //   815: iaload
    //   816: aload #7
    //   818: iload #18
    //   820: bipush #8
    //   822: isub
    //   823: iaload
    //   824: ixor
    //   825: aload #7
    //   827: iload #18
    //   829: bipush #14
    //   831: isub
    //   832: iaload
    //   833: ixor
    //   834: aload #7
    //   836: iload #18
    //   838: bipush #16
    //   840: isub
    //   841: iaload
    //   842: ixor
    //   843: istore #19
    //   845: iload #19
    //   847: iconst_1
    //   848: ishl
    //   849: iload #19
    //   851: bipush #31
    //   853: iushr
    //   854: ior
    //   855: istore #20
    //   857: aload #7
    //   859: iload #18
    //   861: iload #20
    //   863: iastore
    //   864: iload #8
    //   866: iconst_5
    //   867: ishl
    //   868: iload #8
    //   870: bipush #27
    //   872: iushr
    //   873: ior
    //   874: istore #19
    //   876: iload #19
    //   878: iload #12
    //   880: iadd
    //   881: aload #7
    //   883: iload #18
    //   885: iaload
    //   886: iadd
    //   887: iload #18
    //   889: bipush #20
    //   891: if_icmpge -> 917
    //   894: ldc 1518500249
    //   896: iload #9
    //   898: iload #10
    //   900: iand
    //   901: iload #9
    //   903: iconst_m1
    //   904: ixor
    //   905: iload #11
    //   907: iand
    //   908: ior
    //   909: iadd
    //   910: goto -> 987
    //   913: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   916: athrow
    //   917: iload #18
    //   919: bipush #40
    //   921: if_icmpge -> 942
    //   924: ldc 1859775393
    //   926: iload #9
    //   928: iload #10
    //   930: ixor
    //   931: iload #11
    //   933: ixor
    //   934: iadd
    //   935: goto -> 987
    //   938: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   941: athrow
    //   942: iload #18
    //   944: bipush #60
    //   946: if_icmpge -> 976
    //   949: ldc -1894007588
    //   951: iload #9
    //   953: iload #10
    //   955: iand
    //   956: iload #9
    //   958: iload #11
    //   960: iand
    //   961: ior
    //   962: iload #10
    //   964: iload #11
    //   966: iand
    //   967: ior
    //   968: iadd
    //   969: goto -> 987
    //   972: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   975: athrow
    //   976: ldc -899497514
    //   978: iload #9
    //   980: iload #10
    //   982: ixor
    //   983: iload #11
    //   985: ixor
    //   986: iadd
    //   987: iadd
    //   988: istore #20
    //   990: iload #11
    //   992: istore #12
    //   994: iload #10
    //   996: istore #11
    //   998: iload #9
    //   1000: bipush #30
    //   1002: ishl
    //   1003: iload #9
    //   1005: iconst_2
    //   1006: iushr
    //   1007: ior
    //   1008: istore #10
    //   1010: iload #8
    //   1012: istore #9
    //   1014: iload #20
    //   1016: istore #8
    //   1018: iinc #18, 1
    //   1021: iload_2
    //   1022: ifne -> 771
    //   1025: iload #8
    //   1027: iload #13
    //   1029: iadd
    //   1030: istore #8
    //   1032: iload #9
    //   1034: iload #14
    //   1036: iadd
    //   1037: istore #9
    //   1039: iload #10
    //   1041: iload #15
    //   1043: iadd
    //   1044: istore #10
    //   1046: iload #11
    //   1048: iload #16
    //   1050: iadd
    //   1051: istore #11
    //   1053: iload #12
    //   1055: iload #17
    //   1057: iadd
    //   1058: istore #12
    //   1060: iinc #6, 16
    //   1063: iload_2
    //   1064: ifne -> 740
    //   1067: iconst_5
    //   1068: newarray int
    //   1070: dup
    //   1071: iconst_0
    //   1072: iload #8
    //   1074: iastore
    //   1075: dup
    //   1076: iconst_1
    //   1077: iload #9
    //   1079: iastore
    //   1080: dup
    //   1081: iconst_2
    //   1082: iload #10
    //   1084: iastore
    //   1085: dup
    //   1086: iconst_3
    //   1087: iload #11
    //   1089: iastore
    //   1090: dup
    //   1091: iconst_4
    //   1092: iload #12
    //   1094: iastore
    //   1095: astore #13
    //   1097: bipush #20
    //   1099: newarray byte
    //   1101: astore #14
    //   1103: iconst_0
    //   1104: istore #15
    //   1106: iload #15
    //   1108: bipush #20
    //   1110: if_icmpge -> 1151
    //   1113: aload #13
    //   1115: iload #15
    //   1117: iconst_4
    //   1118: idiv
    //   1119: iaload
    //   1120: istore #16
    //   1122: iconst_3
    //   1123: iload #15
    //   1125: iconst_4
    //   1126: irem
    //   1127: isub
    //   1128: bipush #8
    //   1130: imul
    //   1131: istore #17
    //   1133: aload #14
    //   1135: iload #15
    //   1137: iload #16
    //   1139: iload #17
    //   1141: iushr
    //   1142: i2b
    //   1143: bastore
    //   1144: iinc #15, 1
    //   1147: iload_2
    //   1148: ifne -> 1106
    //   1151: aload #14
    //   1153: astore #4
    //   1155: getstatic burp/Zr02.ZG : Ljava/lang/String;
    //   1158: getstatic burp/Zm3x.ZM : Ljava/lang/Object;
    //   1161: checkcast java/math/BigInteger
    //   1164: invokevirtual intValue : ()I
    //   1167: bipush #32
    //   1169: irem
    //   1170: invokestatic abs : (I)I
    //   1173: invokevirtual charAt : (I)C
    //   1176: getstatic burp/Zbjx.ZA : Ljava/lang/String;
    //   1179: getstatic burp/Ze25.ZW : Ljava/lang/Object;
    //   1182: checkcast java/math/BigInteger
    //   1185: invokevirtual intValue : ()I
    //   1188: bipush #32
    //   1190: irem
    //   1191: invokestatic abs : (I)I
    //   1194: invokevirtual charAt : (I)C
    //   1197: if_icmpgt -> 1312
    //   1200: getstatic burp/Zst7.Zi : Ljava/lang/String;
    //   1203: getstatic burp/Ze6w.Ze : Ljava/lang/Object;
    //   1206: checkcast java/math/BigInteger
    //   1209: invokevirtual intValue : ()I
    //   1212: bipush #32
    //   1214: irem
    //   1215: invokestatic abs : (I)I
    //   1218: invokevirtual charAt : (I)C
    //   1221: getstatic burp/Zg4l.Z_ : Ljava/lang/String;
    //   1224: getstatic burp/Zr36.Za : Ljava/lang/Object;
    //   1227: checkcast java/math/BigInteger
    //   1230: invokevirtual intValue : ()I
    //   1233: bipush #32
    //   1235: irem
    //   1236: invokestatic abs : (I)I
    //   1239: invokevirtual charAt : (I)C
    //   1242: if_icmple -> 1312
    //   1245: goto -> 1252
    //   1248: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1251: athrow
    //   1252: getstatic burp/Zr6c.Zf : Ljava/lang/String;
    //   1255: getstatic burp/Zrn4.Zq : Ljava/lang/Object;
    //   1258: checkcast java/math/BigInteger
    //   1261: invokevirtual intValue : ()I
    //   1264: bipush #32
    //   1266: irem
    //   1267: invokestatic abs : (I)I
    //   1270: invokevirtual charAt : (I)C
    //   1273: getstatic burp/Zs5y.ZO : Ljava/lang/String;
    //   1276: getstatic burp/Zm7v.ZP : Ljava/lang/Object;
    //   1279: checkcast java/math/BigInteger
    //   1282: invokevirtual intValue : ()I
    //   1285: bipush #32
    //   1287: irem
    //   1288: invokestatic abs : (I)I
    //   1291: invokevirtual charAt : (I)C
    //   1294: if_icmple -> 1312
    //   1297: goto -> 1304
    //   1300: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1303: athrow
    //   1304: iconst_1
    //   1305: goto -> 1313
    //   1308: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1311: athrow
    //   1312: iconst_0
    //   1313: ireturn
    //   1314: astore_3
    //   1315: new java/lang/Exception
    //   1318: dup
    //   1319: aload_3
    //   1320: invokevirtual getMessage : ()Ljava/lang/String;
    //   1323: invokespecial <init> : (Ljava/lang/String;)V
    //   1326: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1313	1314	java/lang/Throwable
    //   310	324	324	java/lang/Throwable
    //   335	348	351	java/lang/Throwable
    //   340	363	366	java/lang/Throwable
    //   355	381	384	java/lang/Throwable
    //   370	411	414	java/lang/Throwable
    //   474	501	504	java/lang/Throwable
    //   491	522	525	java/lang/Throwable
    //   508	552	555	java/lang/Throwable
    //   529	563	563	java/lang/Throwable
    //   574	590	593	java/lang/Throwable
    //   778	802	805	java/lang/Throwable
    //   876	913	913	java/lang/Throwable
    //   917	938	938	java/lang/Throwable
    //   942	972	972	java/lang/Throwable
    //   1155	1245	1248	java/lang/Throwable
    //   1200	1297	1300	java/lang/Throwable
    //   1252	1308	1308	java/lang/Throwable
  }
  
  static void Zg(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void Ze(Object paramObject) {
    Zea9.Zd = a(-11127, 16947);
    Zea9.Zt = new BigInteger(a(-11123, -32036));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zrqe.ZB.charAt(Math.abs(((BigInteger)Zxy6.Zd).intValue() % 32)) > Zdv.Zz.charAt(Math.abs(((BigInteger)Zz0y.Zp).intValue() % 32))) {
          try {
            Zec0.ZY(Class.forName(a(-11126, -28762)));
            if (bool)
              Zos.ZU(Class.forName(a(-11125, -9438))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zos.ZU(Class.forName(a(-11125, -9438)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'YU©0Ïò±=IòíXzê¬ñì¿ßhLqåÅ÷ácc¦Í>övÍV?CåìøçßüWùbr³o,¶¶#¶Ïràe BÛùMCKþØî«"Ã]¢7 èìEÈÊÃUÉÞ¸\\n\\tLr_9V8ã.QRÑg C&üÓ3ú{W³&é«Ã#¿æüý­sóÙ¡J\\tÈ`â!+zf\\t¡Ïì Ï|¤'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #77
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #91
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
    //   68: ldc '¥ÔàÄ<MYvC`\\tÏ%ñ4B¶µúyiO§&,`H¢gÈ3ÀJ8EÙ¦Ò\O´<¯éOUñ5g]ñ6cìcVÎÃT¡\\r'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #28
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
    //   129: putstatic burp/Zskf.a : [Ljava/lang/String;
    //   132: bipush #9
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zskf.b : [Ljava/lang/String;
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
    //   212: bipush #36
    //   214: goto -> 244
    //   217: bipush #85
    //   219: goto -> 244
    //   222: bipush #19
    //   224: goto -> 244
    //   227: bipush #28
    //   229: goto -> 244
    //   232: bipush #55
    //   234: goto -> 244
    //   237: bipush #42
    //   239: goto -> 244
    //   242: bipush #78
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
    //   304: sipush #-11131
    //   307: sipush #30140
    //   310: invokestatic a : (II)Ljava/lang/String;
    //   313: invokespecial <init> : (Ljava/lang/String;)V
    //   316: putstatic burp/Zskf.ZQ : Ljava/lang/Object;
    //   319: sipush #-11124
    //   322: sipush #5956
    //   325: invokestatic a : (II)Ljava/lang/String;
    //   328: putstatic burp/Zskf.ZV : Ljava/lang/String;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFD48D) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zskf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */