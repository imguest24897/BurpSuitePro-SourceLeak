package burp;

import java.math.BigInteger;

class Zsgl extends ClassLoader {
  static String ZG;
  
  static Object Zn;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean ZU(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zes_.ZJ : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zein.Zb : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Zedz.Za : Ljava/lang/Object;
    //   22: getstatic burp/Zr8h.ZH : Ljava/lang/Object;
    //   25: checkcast java/math/BigInteger
    //   28: getstatic burp/Zg7z.ZV : Ljava/lang/Object;
    //   31: checkcast java/math/BigInteger
    //   34: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   37: putstatic burp/Zl2g.ZG : Ljava/lang/Object;
    //   40: getstatic burp/Zzsq.Zh : Ljava/lang/Object;
    //   43: checkcast java/math/BigInteger
    //   46: invokevirtual toByteArray : ()[B
    //   49: astore_3
    //   50: aload_3
    //   51: arraylength
    //   52: bipush #8
    //   54: iadd
    //   55: bipush #6
    //   57: ishr
    //   58: iconst_1
    //   59: iadd
    //   60: bipush #16
    //   62: imul
    //   63: newarray int
    //   65: astore #5
    //   67: iconst_0
    //   68: istore #6
    //   70: iload #6
    //   72: aload_3
    //   73: arraylength
    //   74: if_icmpge -> 117
    //   77: aload_3
    //   78: iload #6
    //   80: baload
    //   81: sipush #255
    //   84: iand
    //   85: istore #7
    //   87: aload #5
    //   89: iload #6
    //   91: iconst_2
    //   92: ishr
    //   93: dup2
    //   94: iaload
    //   95: iload #7
    //   97: bipush #24
    //   99: iload #6
    //   101: iconst_4
    //   102: irem
    //   103: bipush #8
    //   105: imul
    //   106: isub
    //   107: ishl
    //   108: ior
    //   109: iastore
    //   110: iinc #6, 1
    //   113: iload_2
    //   114: ifne -> 70
    //   117: aload #5
    //   119: iload #6
    //   121: iconst_2
    //   122: ishr
    //   123: dup2
    //   124: iaload
    //   125: sipush #128
    //   128: bipush #24
    //   130: iload #6
    //   132: iconst_4
    //   133: irem
    //   134: bipush #8
    //   136: imul
    //   137: isub
    //   138: ishl
    //   139: ior
    //   140: iastore
    //   141: aload #5
    //   143: aload #5
    //   145: arraylength
    //   146: iconst_1
    //   147: isub
    //   148: aload_3
    //   149: arraylength
    //   150: bipush #8
    //   152: imul
    //   153: iastore
    //   154: bipush #80
    //   156: newarray int
    //   158: astore #7
    //   160: ldc 1732584193
    //   162: istore #8
    //   164: ldc -271733879
    //   166: istore #9
    //   168: ldc -1732584194
    //   170: istore #10
    //   172: ldc 271733878
    //   174: istore #11
    //   176: ldc -1009589776
    //   178: istore #12
    //   180: iconst_0
    //   181: istore #6
    //   183: iload #6
    //   185: aload #5
    //   187: arraylength
    //   188: if_icmpge -> 510
    //   191: iload #8
    //   193: istore #13
    //   195: iload #9
    //   197: istore #14
    //   199: iload #10
    //   201: istore #15
    //   203: iload #11
    //   205: istore #16
    //   207: iload #12
    //   209: istore #17
    //   211: iconst_0
    //   212: istore #18
    //   214: iload #18
    //   216: bipush #80
    //   218: if_icmpge -> 468
    //   221: iload #18
    //   223: bipush #16
    //   225: if_icmpge -> 252
    //   228: aload #7
    //   230: iload #18
    //   232: aload #5
    //   234: iload #6
    //   236: iload #18
    //   238: iadd
    //   239: iaload
    //   240: iastore
    //   241: iload_2
    //   242: ifne -> 307
    //   245: goto -> 252
    //   248: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   251: athrow
    //   252: aload #7
    //   254: iload #18
    //   256: iconst_3
    //   257: isub
    //   258: iaload
    //   259: aload #7
    //   261: iload #18
    //   263: bipush #8
    //   265: isub
    //   266: iaload
    //   267: ixor
    //   268: aload #7
    //   270: iload #18
    //   272: bipush #14
    //   274: isub
    //   275: iaload
    //   276: ixor
    //   277: aload #7
    //   279: iload #18
    //   281: bipush #16
    //   283: isub
    //   284: iaload
    //   285: ixor
    //   286: istore #19
    //   288: iload #19
    //   290: iconst_1
    //   291: ishl
    //   292: iload #19
    //   294: bipush #31
    //   296: iushr
    //   297: ior
    //   298: istore #20
    //   300: aload #7
    //   302: iload #18
    //   304: iload #20
    //   306: iastore
    //   307: iload #8
    //   309: iconst_5
    //   310: ishl
    //   311: iload #8
    //   313: bipush #27
    //   315: iushr
    //   316: ior
    //   317: istore #19
    //   319: iload #19
    //   321: iload #12
    //   323: iadd
    //   324: aload #7
    //   326: iload #18
    //   328: iaload
    //   329: iadd
    //   330: iload #18
    //   332: bipush #20
    //   334: if_icmpge -> 360
    //   337: ldc 1518500249
    //   339: iload #9
    //   341: iload #10
    //   343: iand
    //   344: iload #9
    //   346: iconst_m1
    //   347: ixor
    //   348: iload #11
    //   350: iand
    //   351: ior
    //   352: iadd
    //   353: goto -> 430
    //   356: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   359: athrow
    //   360: iload #18
    //   362: bipush #40
    //   364: if_icmpge -> 385
    //   367: ldc 1859775393
    //   369: iload #9
    //   371: iload #10
    //   373: ixor
    //   374: iload #11
    //   376: ixor
    //   377: iadd
    //   378: goto -> 430
    //   381: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   384: athrow
    //   385: iload #18
    //   387: bipush #60
    //   389: if_icmpge -> 419
    //   392: ldc -1894007588
    //   394: iload #9
    //   396: iload #10
    //   398: iand
    //   399: iload #9
    //   401: iload #11
    //   403: iand
    //   404: ior
    //   405: iload #10
    //   407: iload #11
    //   409: iand
    //   410: ior
    //   411: iadd
    //   412: goto -> 430
    //   415: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   418: athrow
    //   419: ldc -899497514
    //   421: iload #9
    //   423: iload #10
    //   425: ixor
    //   426: iload #11
    //   428: ixor
    //   429: iadd
    //   430: iadd
    //   431: istore #20
    //   433: iload #11
    //   435: istore #12
    //   437: iload #10
    //   439: istore #11
    //   441: iload #9
    //   443: bipush #30
    //   445: ishl
    //   446: iload #9
    //   448: iconst_2
    //   449: iushr
    //   450: ior
    //   451: istore #10
    //   453: iload #8
    //   455: istore #9
    //   457: iload #20
    //   459: istore #8
    //   461: iinc #18, 1
    //   464: iload_2
    //   465: ifne -> 214
    //   468: iload #8
    //   470: iload #13
    //   472: iadd
    //   473: istore #8
    //   475: iload #9
    //   477: iload #14
    //   479: iadd
    //   480: istore #9
    //   482: iload #10
    //   484: iload #15
    //   486: iadd
    //   487: istore #10
    //   489: iload #11
    //   491: iload #16
    //   493: iadd
    //   494: istore #11
    //   496: iload #12
    //   498: iload #17
    //   500: iadd
    //   501: istore #12
    //   503: iinc #6, 16
    //   506: iload_2
    //   507: ifne -> 183
    //   510: iconst_5
    //   511: newarray int
    //   513: dup
    //   514: iconst_0
    //   515: iload #8
    //   517: iastore
    //   518: dup
    //   519: iconst_1
    //   520: iload #9
    //   522: iastore
    //   523: dup
    //   524: iconst_2
    //   525: iload #10
    //   527: iastore
    //   528: dup
    //   529: iconst_3
    //   530: iload #11
    //   532: iastore
    //   533: dup
    //   534: iconst_4
    //   535: iload #12
    //   537: iastore
    //   538: astore #13
    //   540: bipush #20
    //   542: newarray byte
    //   544: astore #14
    //   546: iconst_0
    //   547: istore #15
    //   549: iload #15
    //   551: bipush #20
    //   553: if_icmpge -> 594
    //   556: aload #13
    //   558: iload #15
    //   560: iconst_4
    //   561: idiv
    //   562: iaload
    //   563: istore #16
    //   565: iconst_3
    //   566: iload #15
    //   568: iconst_4
    //   569: irem
    //   570: isub
    //   571: bipush #8
    //   573: imul
    //   574: istore #17
    //   576: aload #14
    //   578: iload #15
    //   580: iload #16
    //   582: iload #17
    //   584: iushr
    //   585: i2b
    //   586: bastore
    //   587: iinc #15, 1
    //   590: iload_2
    //   591: ifne -> 549
    //   594: aload #14
    //   596: astore #4
    //   598: sipush #28947
    //   601: new java/math/BigInteger
    //   604: dup
    //   605: aload #4
    //   607: invokespecial <init> : ([B)V
    //   610: invokevirtual abs : ()Ljava/math/BigInteger;
    //   613: putstatic burp/Zg7z.ZV : Ljava/lang/Object;
    //   616: sipush #7328
    //   619: invokestatic a : (II)Ljava/lang/String;
    //   622: iconst_1
    //   623: ldc burp/Zz5s
    //   625: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   628: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   631: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   634: astore_3
    //   635: aload_3
    //   636: arraylength
    //   637: istore #4
    //   639: iconst_0
    //   640: istore #5
    //   642: iload #5
    //   644: iload #4
    //   646: if_icmpge -> 783
    //   649: aload_3
    //   650: iload #5
    //   652: aaload
    //   653: astore #6
    //   655: aload #6
    //   657: invokevirtual getModifiers : ()I
    //   660: invokestatic isStatic : (I)Z
    //   663: ifne -> 673
    //   666: goto -> 776
    //   669: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   672: athrow
    //   673: aload #6
    //   675: invokevirtual getType : ()Ljava/lang/Class;
    //   678: astore #7
    //   680: aload #7
    //   682: ifnull -> 763
    //   685: aload #7
    //   687: invokevirtual isPrimitive : ()Z
    //   690: ifne -> 763
    //   693: goto -> 700
    //   696: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   699: athrow
    //   700: aload #7
    //   702: invokevirtual getPackage : ()Ljava/lang/Package;
    //   705: ifnull -> 763
    //   708: goto -> 715
    //   711: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   714: athrow
    //   715: aload #7
    //   717: invokevirtual getPackage : ()Ljava/lang/Package;
    //   720: invokevirtual getName : ()Ljava/lang/String;
    //   723: ifnull -> 763
    //   726: goto -> 733
    //   729: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   732: athrow
    //   733: aload #7
    //   735: invokevirtual getPackage : ()Ljava/lang/Package;
    //   738: invokevirtual getName : ()Ljava/lang/String;
    //   741: sipush #28958
    //   744: sipush #-20851
    //   747: invokestatic a : (II)Ljava/lang/String;
    //   750: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   753: ifne -> 763
    //   756: goto -> 763
    //   759: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   762: athrow
    //   763: aload #6
    //   765: iconst_1
    //   766: invokevirtual setAccessible : (Z)V
    //   769: aload #6
    //   771: aconst_null
    //   772: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   775: pop
    //   776: iinc #5, 1
    //   779: iload_2
    //   780: ifne -> 642
    //   783: sipush #28944
    //   786: sipush #-14586
    //   789: invokestatic a : (II)Ljava/lang/String;
    //   792: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   795: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   798: astore_3
    //   799: aload_3
    //   800: arraylength
    //   801: istore #4
    //   803: iconst_0
    //   804: istore #5
    //   806: iload #5
    //   808: iload #4
    //   810: if_icmpge -> 942
    //   813: aload_3
    //   814: iload #5
    //   816: aaload
    //   817: astore #6
    //   819: aload #6
    //   821: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   824: pop
    //   825: aload #6
    //   827: invokevirtual getModifiers : ()I
    //   830: invokestatic isStatic : (I)Z
    //   833: ifeq -> 928
    //   836: aload #6
    //   838: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   841: arraylength
    //   842: iconst_2
    //   843: if_icmpne -> 928
    //   846: goto -> 853
    //   849: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   852: athrow
    //   853: aload #6
    //   855: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   858: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   861: invokevirtual equals : (Ljava/lang/Object;)Z
    //   864: ifeq -> 928
    //   867: goto -> 874
    //   870: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   873: athrow
    //   874: aload #6
    //   876: iconst_1
    //   877: invokevirtual setAccessible : (Z)V
    //   880: aload #6
    //   882: aconst_null
    //   883: iconst_2
    //   884: anewarray java/lang/Object
    //   887: dup
    //   888: iconst_0
    //   889: aload_0
    //   890: aastore
    //   891: dup
    //   892: iconst_1
    //   893: aload_1
    //   894: ifnonnull -> 912
    //   897: goto -> 904
    //   900: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   903: athrow
    //   904: aload_1
    //   905: goto -> 919
    //   908: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   911: athrow
    //   912: aload_1
    //   913: checkcast [B
    //   916: invokevirtual clone : ()Ljava/lang/Object;
    //   919: aastore
    //   920: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   923: pop
    //   924: iload_2
    //   925: ifne -> 942
    //   928: iinc #5, 1
    //   931: iload_2
    //   932: ifne -> 806
    //   935: goto -> 942
    //   938: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   941: athrow
    //   942: new java/io/ByteArrayOutputStream
    //   945: dup
    //   946: invokespecial <init> : ()V
    //   949: astore_3
    //   950: sipush #28945
    //   953: aload_3
    //   954: sipush #202
    //   957: invokevirtual write : (I)V
    //   960: sipush #7064
    //   963: aload_3
    //   964: sipush #254
    //   967: invokevirtual write : (I)V
    //   970: aload_3
    //   971: sipush #186
    //   974: invokevirtual write : (I)V
    //   977: aload_3
    //   978: sipush #190
    //   981: invokevirtual write : (I)V
    //   984: aload_3
    //   985: iconst_0
    //   986: invokevirtual write : (I)V
    //   989: aload_3
    //   990: iconst_1
    //   991: invokevirtual write : (I)V
    //   994: aload_3
    //   995: iconst_0
    //   996: invokevirtual write : (I)V
    //   999: aload_3
    //   1000: bipush #50
    //   1002: invokevirtual write : (I)V
    //   1005: aload_3
    //   1006: getstatic burp/Zro_.ZP : Ljava/lang/Object;
    //   1009: checkcast java/math/BigInteger
    //   1012: invokevirtual toByteArray : ()[B
    //   1015: invokevirtual write : ([B)V
    //   1018: aload_3
    //   1019: getstatic burp/Zszm.ZI : Ljava/lang/Object;
    //   1022: checkcast java/math/BigInteger
    //   1025: invokevirtual toByteArray : ()[B
    //   1028: invokevirtual write : ([B)V
    //   1031: aload_3
    //   1032: getstatic burp/Zxxf.ZZ : Ljava/lang/Object;
    //   1035: checkcast java/math/BigInteger
    //   1038: invokevirtual toByteArray : ()[B
    //   1041: invokevirtual write : ([B)V
    //   1044: aload_3
    //   1045: invokevirtual toByteArray : ()[B
    //   1048: astore #4
    //   1050: aconst_null
    //   1051: astore #5
    //   1053: invokestatic a : (II)Ljava/lang/String;
    //   1056: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1059: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1062: astore #6
    //   1064: aload #6
    //   1066: arraylength
    //   1067: istore #7
    //   1069: iconst_0
    //   1070: istore #8
    //   1072: iload #8
    //   1074: iload #7
    //   1076: if_icmpge -> 1204
    //   1079: aload #6
    //   1081: iload #8
    //   1083: aaload
    //   1084: astore #9
    //   1086: aload #9
    //   1088: invokevirtual getName : ()Ljava/lang/String;
    //   1091: sipush #28956
    //   1094: sipush #-10645
    //   1097: invokestatic a : (II)Ljava/lang/String;
    //   1100: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1103: ifeq -> 1197
    //   1106: aload #9
    //   1108: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1111: astore #10
    //   1113: aload #10
    //   1115: arraylength
    //   1116: iconst_4
    //   1117: if_icmpeq -> 1127
    //   1120: goto -> 1197
    //   1123: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1126: athrow
    //   1127: aload #10
    //   1129: iconst_0
    //   1130: aaload
    //   1131: ldc java/lang/String
    //   1133: if_acmpeq -> 1143
    //   1136: goto -> 1197
    //   1139: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1142: athrow
    //   1143: aload #10
    //   1145: iconst_1
    //   1146: aaload
    //   1147: ldc [B
    //   1149: if_acmpeq -> 1159
    //   1152: goto -> 1197
    //   1155: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1158: athrow
    //   1159: aload #10
    //   1161: iconst_2
    //   1162: aaload
    //   1163: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   1166: if_acmpeq -> 1176
    //   1169: goto -> 1197
    //   1172: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1175: athrow
    //   1176: aload #10
    //   1178: iconst_3
    //   1179: aaload
    //   1180: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   1183: if_acmpeq -> 1193
    //   1186: goto -> 1197
    //   1189: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1192: athrow
    //   1193: aload #9
    //   1195: astore #5
    //   1197: iinc #8, 1
    //   1200: iload_2
    //   1201: ifne -> 1072
    //   1204: aload #5
    //   1206: iconst_1
    //   1207: invokevirtual setAccessible : (Z)V
    //   1210: ldc burp/Zs5i
    //   1212: iconst_0
    //   1213: anewarray java/lang/Class
    //   1216: invokevirtual getDeclaredConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   1219: astore #6
    //   1221: aload #6
    //   1223: iconst_1
    //   1224: invokevirtual setAccessible : (Z)V
    //   1227: aload #5
    //   1229: aload #6
    //   1231: iconst_0
    //   1232: anewarray java/lang/Object
    //   1235: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   1238: iconst_4
    //   1239: anewarray java/lang/Object
    //   1242: dup
    //   1243: iconst_0
    //   1244: sipush #28957
    //   1247: sipush #1105
    //   1250: invokestatic a : (II)Ljava/lang/String;
    //   1253: aastore
    //   1254: dup
    //   1255: iconst_1
    //   1256: aload #4
    //   1258: aastore
    //   1259: dup
    //   1260: iconst_2
    //   1261: iconst_0
    //   1262: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1265: aastore
    //   1266: dup
    //   1267: iconst_3
    //   1268: aload #4
    //   1270: arraylength
    //   1271: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1274: aastore
    //   1275: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1278: pop
    //   1279: goto -> 1283
    //   1282: astore_3
    //   1283: getstatic burp/Zer.Zp : Ljava/lang/String;
    //   1286: getstatic burp/Ze3d.Ze : Ljava/lang/Object;
    //   1289: checkcast java/math/BigInteger
    //   1292: invokevirtual intValue : ()I
    //   1295: bipush #32
    //   1297: irem
    //   1298: invokestatic abs : (I)I
    //   1301: invokevirtual charAt : (I)C
    //   1304: getstatic burp/Zd1.ZN : Ljava/lang/String;
    //   1307: getstatic burp/Zer.Zk : Ljava/lang/Object;
    //   1310: checkcast java/math/BigInteger
    //   1313: invokevirtual intValue : ()I
    //   1316: bipush #32
    //   1318: irem
    //   1319: invokestatic abs : (I)I
    //   1322: invokevirtual charAt : (I)C
    //   1325: if_icmpgt -> 1440
    //   1328: getstatic burp/Zzk9.Zb : Ljava/lang/String;
    //   1331: getstatic burp/Zx4l.Zt : Ljava/lang/Object;
    //   1334: checkcast java/math/BigInteger
    //   1337: invokevirtual intValue : ()I
    //   1340: bipush #32
    //   1342: irem
    //   1343: invokestatic abs : (I)I
    //   1346: invokevirtual charAt : (I)C
    //   1349: getstatic burp/Zxyp.Z_ : Ljava/lang/String;
    //   1352: getstatic burp/Zsxj.Zi : Ljava/lang/Object;
    //   1355: checkcast java/math/BigInteger
    //   1358: invokevirtual intValue : ()I
    //   1361: bipush #32
    //   1363: irem
    //   1364: invokestatic abs : (I)I
    //   1367: invokevirtual charAt : (I)C
    //   1370: if_icmple -> 1440
    //   1373: goto -> 1380
    //   1376: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1379: athrow
    //   1380: getstatic burp/Zxfu.Zo : Ljava/lang/String;
    //   1383: getstatic burp/Ze3d.Ze : Ljava/lang/Object;
    //   1386: checkcast java/math/BigInteger
    //   1389: invokevirtual intValue : ()I
    //   1392: bipush #32
    //   1394: irem
    //   1395: invokestatic abs : (I)I
    //   1398: invokevirtual charAt : (I)C
    //   1401: getstatic burp/Ze3j.ZI : Ljava/lang/String;
    //   1404: getstatic burp/Zsxj.Zi : Ljava/lang/Object;
    //   1407: checkcast java/math/BigInteger
    //   1410: invokevirtual intValue : ()I
    //   1413: bipush #32
    //   1415: irem
    //   1416: invokestatic abs : (I)I
    //   1419: invokevirtual charAt : (I)C
    //   1422: if_icmpgt -> 1440
    //   1425: goto -> 1432
    //   1428: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1431: athrow
    //   1432: iconst_1
    //   1433: goto -> 1441
    //   1436: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1439: athrow
    //   1440: iconst_0
    //   1441: ireturn
    //   1442: astore_3
    //   1443: new java/lang/Exception
    //   1446: dup
    //   1447: aload_3
    //   1448: invokevirtual getMessage : ()Ljava/lang/String;
    //   1451: invokespecial <init> : (Ljava/lang/String;)V
    //   1454: athrow
    // Exception table:
    //   from	to	target	type
    //   4	1441	1442	java/lang/Throwable
    //   221	245	248	java/lang/Throwable
    //   319	356	356	java/lang/Throwable
    //   360	381	381	java/lang/Throwable
    //   385	415	415	java/lang/Throwable
    //   655	669	669	java/lang/Throwable
    //   680	693	696	java/lang/Throwable
    //   685	708	711	java/lang/Throwable
    //   700	726	729	java/lang/Throwable
    //   715	756	759	java/lang/Throwable
    //   819	846	849	java/lang/Throwable
    //   836	867	870	java/lang/Throwable
    //   853	897	900	java/lang/Throwable
    //   874	908	908	java/lang/Throwable
    //   919	935	938	java/lang/Throwable
    //   942	1279	1282	java/lang/Throwable
    //   1113	1123	1123	java/lang/Throwable
    //   1127	1139	1139	java/lang/Throwable
    //   1143	1155	1155	java/lang/Throwable
    //   1159	1172	1172	java/lang/Throwable
    //   1176	1189	1189	java/lang/Throwable
    //   1283	1373	1376	java/lang/Throwable
    //   1328	1425	1428	java/lang/Throwable
    //   1380	1436	1436	java/lang/Throwable
  }
  
  static void Ze(Object paramObject) {
    Zxzd.ZM = a(28949, 9248);
    Zxzd.ZD = new BigInteger(a(28959, -4130));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zgss.Zc.charAt(Math.abs(((BigInteger)Zgss.Zl).intValue() % 32)) > Zgss.Zc.charAt(Math.abs(((BigInteger)Zgss.Zl).intValue() % 32))) {
          try {
            Zxdh.ZY(Class.forName(a(28948, 27359)));
            if (!bool)
              Zter.Zj(Class.forName(a(28946, -17849))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zter.Zj(Class.forName(a(28946, -17849)));
    } catch (Throwable throwable) {}
  }
  
  static void ZJ(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'SZ+×øÈW #ðE#)Ï\\f^.%zkù\\t²¦dËnLMI\±Ä£Èèa{mY®RB+!=¶°ÚMvT±'}ÿàïþòâÚ¾8Ñ^Q·âðo²qv¨©Ûì&$\\n³âbÇQy |¤ÚÌ&ÿ×²à|ø&gÎ¡Õ5ÚàÍZ0c_ó¤4úgéö?/lWM`³LÄ¹^$Ù\\tã#Ñ_4îÓ\\täp uU\\tÉ_Zy®+È*\\b_áZ#wa¨W?[K²Øûè'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #32
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #55
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
    //   68: ldc 'lK`r@ÁcrsàVde?Å¹ñ¥üÇJôSä¾ß\\bÚ2Ôz(|:ÛêÎ¾íyâëâõ¬2Mç£Ån·Aº02(¾ZW8R'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #77
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #79
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
    //   129: putstatic burp/Zsgl.a : [Ljava/lang/String;
    //   132: bipush #12
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zsgl.b : [Ljava/lang/String;
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
    //   159: if_icmpgt -> 259
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #15
    //   214: goto -> 243
    //   217: bipush #27
    //   219: goto -> 243
    //   222: bipush #15
    //   224: goto -> 243
    //   227: bipush #127
    //   229: goto -> 243
    //   232: bipush #16
    //   234: goto -> 243
    //   237: iconst_5
    //   238: goto -> 243
    //   241: bipush #91
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 166
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 162
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 99
    //   300: sipush #28950
    //   303: sipush #-17655
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: putstatic burp/Zsgl.ZG : Ljava/lang/String;
    //   312: new java/math/BigInteger
    //   315: dup
    //   316: sipush #28951
    //   319: sipush #-28785
    //   322: invokestatic a : (II)Ljava/lang/String;
    //   325: invokespecial <init> : (Ljava/lang/String;)V
    //   328: putstatic burp/Zsgl.Zn : Ljava/lang/Object;
    //   331: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x7115) & 0xFFFF;
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
      char c = '¨';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsgl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */