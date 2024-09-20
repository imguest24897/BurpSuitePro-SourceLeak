package burp;

import java.math.BigInteger;

class Zb3z extends ClassLoader {
  static Object ZR;
  
  static String Zi;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zp(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean ZY(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZK : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zeh9.ZY : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zr8h.ZH : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zlos.Zk : Ljava/lang/Object;
    //   22: sipush #-10110
    //   25: sipush #13266
    //   28: invokestatic a : (II)Ljava/lang/String;
    //   31: iconst_1
    //   32: ldc burp/Zz35
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
    //   150: sipush #-10105
    //   153: sipush #9936
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
    //   189: ifeq -> 51
    //   192: sipush #-10103
    //   195: sipush #-30201
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
    //   334: ifeq -> 351
    //   337: iinc #5, 1
    //   340: iload_2
    //   341: ifeq -> 215
    //   344: goto -> 351
    //   347: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   350: athrow
    //   351: getstatic burp/Zxfu.ZA : Ljava/lang/Object;
    //   354: checkcast java/math/BigInteger
    //   357: invokevirtual intValue : ()I
    //   360: i2l
    //   361: invokestatic currentTimeMillis : ()J
    //   364: ladd
    //   365: getstatic burp/Zm0s.Zl : Ljava/lang/Object;
    //   368: checkcast java/math/BigInteger
    //   371: invokevirtual intValue : ()I
    //   374: i2l
    //   375: lcmp
    //   376: ifge -> 708
    //   379: sipush #-10112
    //   382: sipush #-28595
    //   385: invokestatic a : (II)Ljava/lang/String;
    //   388: iconst_1
    //   389: ldc burp/Zzi3
    //   391: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   394: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   397: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   400: astore_3
    //   401: aload_3
    //   402: arraylength
    //   403: istore #4
    //   405: iconst_0
    //   406: istore #5
    //   408: iload #5
    //   410: iload #4
    //   412: if_icmpge -> 549
    //   415: aload_3
    //   416: iload #5
    //   418: aaload
    //   419: astore #6
    //   421: aload #6
    //   423: invokevirtual getModifiers : ()I
    //   426: invokestatic isStatic : (I)Z
    //   429: ifne -> 439
    //   432: goto -> 542
    //   435: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   438: athrow
    //   439: aload #6
    //   441: invokevirtual getType : ()Ljava/lang/Class;
    //   444: astore #7
    //   446: aload #7
    //   448: ifnull -> 529
    //   451: aload #7
    //   453: invokevirtual isPrimitive : ()Z
    //   456: ifne -> 529
    //   459: goto -> 466
    //   462: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   465: athrow
    //   466: aload #7
    //   468: invokevirtual getPackage : ()Ljava/lang/Package;
    //   471: ifnull -> 529
    //   474: goto -> 481
    //   477: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   480: athrow
    //   481: aload #7
    //   483: invokevirtual getPackage : ()Ljava/lang/Package;
    //   486: invokevirtual getName : ()Ljava/lang/String;
    //   489: ifnull -> 529
    //   492: goto -> 499
    //   495: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   498: athrow
    //   499: aload #7
    //   501: invokevirtual getPackage : ()Ljava/lang/Package;
    //   504: invokevirtual getName : ()Ljava/lang/String;
    //   507: sipush #-10101
    //   510: sipush #-20849
    //   513: invokestatic a : (II)Ljava/lang/String;
    //   516: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   519: ifne -> 529
    //   522: goto -> 529
    //   525: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   528: athrow
    //   529: aload #6
    //   531: iconst_1
    //   532: invokevirtual setAccessible : (Z)V
    //   535: aload #6
    //   537: aconst_null
    //   538: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   541: pop
    //   542: iinc #5, 1
    //   545: iload_2
    //   546: ifeq -> 408
    //   549: sipush #-10107
    //   552: sipush #2425
    //   555: invokestatic a : (II)Ljava/lang/String;
    //   558: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   561: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   564: astore_3
    //   565: aload_3
    //   566: arraylength
    //   567: istore #4
    //   569: iconst_0
    //   570: istore #5
    //   572: iload #5
    //   574: iload #4
    //   576: if_icmpge -> 708
    //   579: aload_3
    //   580: iload #5
    //   582: aaload
    //   583: astore #6
    //   585: aload #6
    //   587: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   590: pop
    //   591: aload #6
    //   593: invokevirtual getModifiers : ()I
    //   596: invokestatic isStatic : (I)Z
    //   599: ifeq -> 694
    //   602: aload #6
    //   604: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   607: arraylength
    //   608: iconst_2
    //   609: if_icmpne -> 694
    //   612: goto -> 619
    //   615: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   618: athrow
    //   619: aload #6
    //   621: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   624: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   627: invokevirtual equals : (Ljava/lang/Object;)Z
    //   630: ifeq -> 694
    //   633: goto -> 640
    //   636: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   639: athrow
    //   640: aload #6
    //   642: iconst_1
    //   643: invokevirtual setAccessible : (Z)V
    //   646: aload #6
    //   648: aconst_null
    //   649: iconst_2
    //   650: anewarray java/lang/Object
    //   653: dup
    //   654: iconst_0
    //   655: aload_0
    //   656: aastore
    //   657: dup
    //   658: iconst_1
    //   659: aload_1
    //   660: ifnonnull -> 678
    //   663: goto -> 670
    //   666: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   669: athrow
    //   670: aload_1
    //   671: goto -> 685
    //   674: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   677: athrow
    //   678: aload_1
    //   679: checkcast [B
    //   682: invokevirtual clone : ()Ljava/lang/Object;
    //   685: aastore
    //   686: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   689: pop
    //   690: iload_2
    //   691: ifeq -> 708
    //   694: iinc #5, 1
    //   697: iload_2
    //   698: ifeq -> 572
    //   701: goto -> 708
    //   704: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   707: athrow
    //   708: getstatic burp/Zxo6.Zw : Ljava/lang/Object;
    //   711: checkcast java/math/BigInteger
    //   714: invokevirtual toByteArray : ()[B
    //   717: astore_3
    //   718: aload_3
    //   719: arraylength
    //   720: bipush #8
    //   722: iadd
    //   723: bipush #6
    //   725: ishr
    //   726: iconst_1
    //   727: iadd
    //   728: bipush #16
    //   730: imul
    //   731: newarray int
    //   733: astore #5
    //   735: iconst_0
    //   736: istore #6
    //   738: iload #6
    //   740: aload_3
    //   741: arraylength
    //   742: if_icmpge -> 785
    //   745: aload_3
    //   746: iload #6
    //   748: baload
    //   749: sipush #255
    //   752: iand
    //   753: istore #7
    //   755: aload #5
    //   757: iload #6
    //   759: iconst_2
    //   760: ishr
    //   761: dup2
    //   762: iaload
    //   763: iload #7
    //   765: bipush #24
    //   767: iload #6
    //   769: iconst_4
    //   770: irem
    //   771: bipush #8
    //   773: imul
    //   774: isub
    //   775: ishl
    //   776: ior
    //   777: iastore
    //   778: iinc #6, 1
    //   781: iload_2
    //   782: ifeq -> 738
    //   785: aload #5
    //   787: iload #6
    //   789: iconst_2
    //   790: ishr
    //   791: dup2
    //   792: iaload
    //   793: sipush #128
    //   796: bipush #24
    //   798: iload #6
    //   800: iconst_4
    //   801: irem
    //   802: bipush #8
    //   804: imul
    //   805: isub
    //   806: ishl
    //   807: ior
    //   808: iastore
    //   809: aload #5
    //   811: aload #5
    //   813: arraylength
    //   814: iconst_1
    //   815: isub
    //   816: aload_3
    //   817: arraylength
    //   818: bipush #8
    //   820: imul
    //   821: iastore
    //   822: bipush #80
    //   824: newarray int
    //   826: astore #7
    //   828: ldc 1732584193
    //   830: istore #8
    //   832: ldc -271733879
    //   834: istore #9
    //   836: ldc -1732584194
    //   838: istore #10
    //   840: ldc 271733878
    //   842: istore #11
    //   844: ldc -1009589776
    //   846: istore #12
    //   848: iconst_0
    //   849: istore #6
    //   851: iload #6
    //   853: aload #5
    //   855: arraylength
    //   856: if_icmpge -> 1178
    //   859: iload #8
    //   861: istore #13
    //   863: iload #9
    //   865: istore #14
    //   867: iload #10
    //   869: istore #15
    //   871: iload #11
    //   873: istore #16
    //   875: iload #12
    //   877: istore #17
    //   879: iconst_0
    //   880: istore #18
    //   882: iload #18
    //   884: bipush #80
    //   886: if_icmpge -> 1136
    //   889: iload #18
    //   891: bipush #16
    //   893: if_icmpge -> 920
    //   896: aload #7
    //   898: iload #18
    //   900: aload #5
    //   902: iload #6
    //   904: iload #18
    //   906: iadd
    //   907: iaload
    //   908: iastore
    //   909: iload_2
    //   910: ifeq -> 975
    //   913: goto -> 920
    //   916: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   919: athrow
    //   920: aload #7
    //   922: iload #18
    //   924: iconst_3
    //   925: isub
    //   926: iaload
    //   927: aload #7
    //   929: iload #18
    //   931: bipush #8
    //   933: isub
    //   934: iaload
    //   935: ixor
    //   936: aload #7
    //   938: iload #18
    //   940: bipush #14
    //   942: isub
    //   943: iaload
    //   944: ixor
    //   945: aload #7
    //   947: iload #18
    //   949: bipush #16
    //   951: isub
    //   952: iaload
    //   953: ixor
    //   954: istore #19
    //   956: iload #19
    //   958: iconst_1
    //   959: ishl
    //   960: iload #19
    //   962: bipush #31
    //   964: iushr
    //   965: ior
    //   966: istore #20
    //   968: aload #7
    //   970: iload #18
    //   972: iload #20
    //   974: iastore
    //   975: iload #8
    //   977: iconst_5
    //   978: ishl
    //   979: iload #8
    //   981: bipush #27
    //   983: iushr
    //   984: ior
    //   985: istore #19
    //   987: iload #19
    //   989: iload #12
    //   991: iadd
    //   992: aload #7
    //   994: iload #18
    //   996: iaload
    //   997: iadd
    //   998: iload #18
    //   1000: bipush #20
    //   1002: if_icmpge -> 1028
    //   1005: ldc 1518500249
    //   1007: iload #9
    //   1009: iload #10
    //   1011: iand
    //   1012: iload #9
    //   1014: iconst_m1
    //   1015: ixor
    //   1016: iload #11
    //   1018: iand
    //   1019: ior
    //   1020: iadd
    //   1021: goto -> 1098
    //   1024: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1027: athrow
    //   1028: iload #18
    //   1030: bipush #40
    //   1032: if_icmpge -> 1053
    //   1035: ldc 1859775393
    //   1037: iload #9
    //   1039: iload #10
    //   1041: ixor
    //   1042: iload #11
    //   1044: ixor
    //   1045: iadd
    //   1046: goto -> 1098
    //   1049: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1052: athrow
    //   1053: iload #18
    //   1055: bipush #60
    //   1057: if_icmpge -> 1087
    //   1060: ldc -1894007588
    //   1062: iload #9
    //   1064: iload #10
    //   1066: iand
    //   1067: iload #9
    //   1069: iload #11
    //   1071: iand
    //   1072: ior
    //   1073: iload #10
    //   1075: iload #11
    //   1077: iand
    //   1078: ior
    //   1079: iadd
    //   1080: goto -> 1098
    //   1083: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1086: athrow
    //   1087: ldc -899497514
    //   1089: iload #9
    //   1091: iload #10
    //   1093: ixor
    //   1094: iload #11
    //   1096: ixor
    //   1097: iadd
    //   1098: iadd
    //   1099: istore #20
    //   1101: iload #11
    //   1103: istore #12
    //   1105: iload #10
    //   1107: istore #11
    //   1109: iload #9
    //   1111: bipush #30
    //   1113: ishl
    //   1114: iload #9
    //   1116: iconst_2
    //   1117: iushr
    //   1118: ior
    //   1119: istore #10
    //   1121: iload #8
    //   1123: istore #9
    //   1125: iload #20
    //   1127: istore #8
    //   1129: iinc #18, 1
    //   1132: iload_2
    //   1133: ifeq -> 882
    //   1136: iload #8
    //   1138: iload #13
    //   1140: iadd
    //   1141: istore #8
    //   1143: iload #9
    //   1145: iload #14
    //   1147: iadd
    //   1148: istore #9
    //   1150: iload #10
    //   1152: iload #15
    //   1154: iadd
    //   1155: istore #10
    //   1157: iload #11
    //   1159: iload #16
    //   1161: iadd
    //   1162: istore #11
    //   1164: iload #12
    //   1166: iload #17
    //   1168: iadd
    //   1169: istore #12
    //   1171: iinc #6, 16
    //   1174: iload_2
    //   1175: ifeq -> 851
    //   1178: iconst_5
    //   1179: newarray int
    //   1181: dup
    //   1182: iconst_0
    //   1183: iload #8
    //   1185: iastore
    //   1186: dup
    //   1187: iconst_1
    //   1188: iload #9
    //   1190: iastore
    //   1191: dup
    //   1192: iconst_2
    //   1193: iload #10
    //   1195: iastore
    //   1196: dup
    //   1197: iconst_3
    //   1198: iload #11
    //   1200: iastore
    //   1201: dup
    //   1202: iconst_4
    //   1203: iload #12
    //   1205: iastore
    //   1206: astore #13
    //   1208: bipush #20
    //   1210: newarray byte
    //   1212: astore #14
    //   1214: iconst_0
    //   1215: istore #15
    //   1217: iload #15
    //   1219: bipush #20
    //   1221: if_icmpge -> 1262
    //   1224: aload #13
    //   1226: iload #15
    //   1228: iconst_4
    //   1229: idiv
    //   1230: iaload
    //   1231: istore #16
    //   1233: iconst_3
    //   1234: iload #15
    //   1236: iconst_4
    //   1237: irem
    //   1238: isub
    //   1239: bipush #8
    //   1241: imul
    //   1242: istore #17
    //   1244: aload #14
    //   1246: iload #15
    //   1248: iload #16
    //   1250: iload #17
    //   1252: iushr
    //   1253: i2b
    //   1254: bastore
    //   1255: iinc #15, 1
    //   1258: iload_2
    //   1259: ifeq -> 1217
    //   1262: aload #14
    //   1264: astore #4
    //   1266: getstatic burp/Zgss.Zc : Ljava/lang/String;
    //   1269: getstatic burp/Zxo6.Zw : Ljava/lang/Object;
    //   1272: checkcast java/math/BigInteger
    //   1275: invokevirtual intValue : ()I
    //   1278: bipush #32
    //   1280: irem
    //   1281: invokestatic abs : (I)I
    //   1284: invokevirtual charAt : (I)C
    //   1287: getstatic burp/Zedz.Zh : Ljava/lang/String;
    //   1290: getstatic burp/Zein.Zb : Ljava/lang/Object;
    //   1293: checkcast java/math/BigInteger
    //   1296: invokevirtual intValue : ()I
    //   1299: bipush #32
    //   1301: irem
    //   1302: invokestatic abs : (I)I
    //   1305: invokevirtual charAt : (I)C
    //   1308: if_icmpgt -> 1415
    //   1311: getstatic burp/Zxfu.Zo : Ljava/lang/String;
    //   1314: getstatic burp/Zb3z.ZR : Ljava/lang/Object;
    //   1317: checkcast java/math/BigInteger
    //   1320: invokevirtual intValue : ()I
    //   1323: bipush #32
    //   1325: irem
    //   1326: invokestatic abs : (I)I
    //   1329: invokevirtual charAt : (I)C
    //   1332: getstatic burp/Zx4l.Zy : Ljava/lang/String;
    //   1335: getstatic burp/Zkmx.Zu : Ljava/lang/Object;
    //   1338: checkcast java/math/BigInteger
    //   1341: invokevirtual intValue : ()I
    //   1344: bipush #32
    //   1346: irem
    //   1347: invokestatic abs : (I)I
    //   1350: invokevirtual charAt : (I)C
    //   1353: if_icmple -> 1415
    //   1356: goto -> 1363
    //   1359: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1362: athrow
    //   1363: getstatic burp/Zx4w.Zo : Ljava/lang/String;
    //   1366: getstatic burp/Zgss.Zl : Ljava/lang/Object;
    //   1369: checkcast java/math/BigInteger
    //   1372: invokevirtual intValue : ()I
    //   1375: bipush #32
    //   1377: irem
    //   1378: invokestatic abs : (I)I
    //   1381: invokevirtual charAt : (I)C
    //   1384: getstatic burp/Zr0g.Zf : Ljava/lang/String;
    //   1387: getstatic burp/Zr8h.ZH : Ljava/lang/Object;
    //   1390: checkcast java/math/BigInteger
    //   1393: invokevirtual intValue : ()I
    //   1396: bipush #32
    //   1398: irem
    //   1399: invokestatic abs : (I)I
    //   1402: invokevirtual charAt : (I)C
    //   1405: if_icmple -> 1423
    //   1408: goto -> 1415
    //   1411: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1414: athrow
    //   1415: iconst_1
    //   1416: goto -> 1424
    //   1419: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1422: athrow
    //   1423: iconst_0
    //   1424: ireturn
    //   1425: astore_3
    //   1426: new java/lang/Exception
    //   1429: dup
    //   1430: aload_3
    //   1431: invokevirtual getMessage : ()Ljava/lang/String;
    //   1434: invokespecial <init> : (Ljava/lang/String;)V
    //   1437: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1424	1425	java/lang/Throwable
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
    //   421	435	435	java/lang/Throwable
    //   446	459	462	java/lang/Throwable
    //   451	474	477	java/lang/Throwable
    //   466	492	495	java/lang/Throwable
    //   481	522	525	java/lang/Throwable
    //   585	612	615	java/lang/Throwable
    //   602	633	636	java/lang/Throwable
    //   619	663	666	java/lang/Throwable
    //   640	674	674	java/lang/Throwable
    //   685	701	704	java/lang/Throwable
    //   889	913	916	java/lang/Throwable
    //   987	1024	1024	java/lang/Throwable
    //   1028	1049	1049	java/lang/Throwable
    //   1053	1083	1083	java/lang/Throwable
    //   1266	1356	1359	java/lang/Throwable
    //   1311	1408	1411	java/lang/Throwable
    //   1363	1419	1419	java/lang/Throwable
  }
  
  static void ZY(Object paramObject) {
    Zg7p.ZA = a(-10111, -328);
    Zg7p.Zb = new BigInteger(a(-10108, -15544));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zk8b.ZT.charAt(Math.abs(((BigInteger)Zg_p.Zx).intValue() % 32)) > Zxzj.ZZ.charAt(Math.abs(((BigInteger)Zr0g.Zj).intValue() % 32))) {
          try {
            Zs5y.ZX(Class.forName(a(-10109, -31077)));
            if (bool)
              Zrdy.Zn(Class.forName(a(-10106, 4986))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zrdy.Zn(Class.forName(a(-10106, 4986)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc ']\\bð\\nN¢]\\t~âvÅ°ùm  Eáw-ÕCý¾(äáØ#´¬8ý6Bo½átßa&×\\t¾ÀnCÆ8|rÙê`\\têNäºe#\\tÚPa]W(Mí]~[ôÚ÷ù´»®è®XØãÒ/\\b_qþ}ÍO<:a[Ä\\fnóG}>U¼#ÉRo*åD4íVÑ#æíÅþ\\nÀüùÒÈãB'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #12
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
    //   68: ldc '½ä¥jé§ ÈH.ãw¨Å©\\fç6þ,\\ræ\\t Ølu¸\\t+'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #32
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #100
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
    //   129: putstatic burp/Zb3z.a : [Ljava/lang/String;
    //   132: bipush #11
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zb3z.b : [Ljava/lang/String;
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
    //   212: bipush #96
    //   214: goto -> 244
    //   217: bipush #74
    //   219: goto -> 244
    //   222: bipush #100
    //   224: goto -> 244
    //   227: bipush #52
    //   229: goto -> 244
    //   232: bipush #24
    //   234: goto -> 244
    //   237: bipush #127
    //   239: goto -> 244
    //   242: bipush #65
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
    //   310: bipush #92
    //   312: bastore
    //   313: dup
    //   314: iconst_1
    //   315: bipush #-63
    //   317: bastore
    //   318: dup
    //   319: iconst_2
    //   320: bipush #-99
    //   322: bastore
    //   323: dup
    //   324: iconst_3
    //   325: bipush #-102
    //   327: bastore
    //   328: dup
    //   329: iconst_4
    //   330: bipush #50
    //   332: bastore
    //   333: dup
    //   334: iconst_5
    //   335: bipush #54
    //   337: bastore
    //   338: dup
    //   339: bipush #6
    //   341: bipush #64
    //   343: bastore
    //   344: dup
    //   345: bipush #7
    //   347: bipush #45
    //   349: bastore
    //   350: dup
    //   351: bipush #8
    //   353: bipush #-55
    //   355: bastore
    //   356: dup
    //   357: bipush #9
    //   359: bipush #50
    //   361: bastore
    //   362: dup
    //   363: bipush #10
    //   365: bipush #121
    //   367: bastore
    //   368: dup
    //   369: bipush #11
    //   371: bipush #-49
    //   373: bastore
    //   374: dup
    //   375: bipush #12
    //   377: bipush #-114
    //   379: bastore
    //   380: dup
    //   381: bipush #13
    //   383: iconst_0
    //   384: bastore
    //   385: dup
    //   386: bipush #14
    //   388: bipush #-112
    //   390: bastore
    //   391: dup
    //   392: bipush #15
    //   394: bipush #47
    //   396: bastore
    //   397: dup
    //   398: bipush #16
    //   400: bipush #-26
    //   402: bastore
    //   403: dup
    //   404: bipush #17
    //   406: bipush #41
    //   408: bastore
    //   409: dup
    //   410: bipush #18
    //   412: bipush #116
    //   414: bastore
    //   415: dup
    //   416: bipush #19
    //   418: bipush #40
    //   420: bastore
    //   421: dup
    //   422: bipush #20
    //   424: iconst_4
    //   425: bastore
    //   426: dup
    //   427: bipush #21
    //   429: bipush #-26
    //   431: bastore
    //   432: dup
    //   433: bipush #22
    //   435: bipush #80
    //   437: bastore
    //   438: dup
    //   439: bipush #23
    //   441: bipush #110
    //   443: bastore
    //   444: dup
    //   445: bipush #24
    //   447: bipush #-7
    //   449: bastore
    //   450: dup
    //   451: bipush #25
    //   453: bipush #-122
    //   455: bastore
    //   456: dup
    //   457: bipush #26
    //   459: bipush #46
    //   461: bastore
    //   462: dup
    //   463: bipush #27
    //   465: bipush #-30
    //   467: bastore
    //   468: dup
    //   469: bipush #28
    //   471: bipush #78
    //   473: bastore
    //   474: dup
    //   475: bipush #29
    //   477: bipush #97
    //   479: bastore
    //   480: dup
    //   481: bipush #30
    //   483: bipush #-60
    //   485: bastore
    //   486: dup
    //   487: bipush #31
    //   489: bipush #85
    //   491: bastore
    //   492: invokespecial <init> : ([B)V
    //   495: putstatic burp/Zb3z.ZR : Ljava/lang/Object;
    //   498: sipush #-10102
    //   501: sipush #-6377
    //   504: invokestatic a : (II)Ljava/lang/String;
    //   507: putstatic burp/Zb3z.Zi : Ljava/lang/String;
    //   510: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFD883) & 0xFFFF;
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
      byte b1 = 73;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb3z.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */