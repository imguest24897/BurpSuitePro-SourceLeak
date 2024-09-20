package burp;

import java.math.BigInteger;

class Zzpm extends ClassLoader {
  static Object Ze;
  
  static String Za;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static void Zi(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static boolean ZK(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: getstatic burp/Zrd2.Zt : Ljava/lang/Object;
    //   7: checkcast java/math/BigInteger
    //   10: getstatic burp/Zr6c.ZG : Ljava/lang/Object;
    //   13: checkcast java/math/BigInteger
    //   16: invokevirtual add : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   19: putstatic burp/Ze2w.ZA : Ljava/lang/Object;
    //   22: getstatic burp/Zzl4.ZX : Ljava/lang/Object;
    //   25: checkcast java/math/BigInteger
    //   28: getstatic burp/Zek4.ZR : Ljava/lang/Object;
    //   31: checkcast java/math/BigInteger
    //   34: invokevirtual subtract : (Ljava/math/BigInteger;)Ljava/math/BigInteger;
    //   37: putstatic burp/Zea.ZO : Ljava/lang/Object;
    //   40: getstatic burp/Ztnn.ZA : Ljava/lang/Object;
    //   43: checkcast java/math/BigInteger
    //   46: invokevirtual toByteArray : ()[B
    //   49: astore_3
    //   50: new java/lang/StringBuilder
    //   53: dup
    //   54: invokespecial <init> : ()V
    //   57: astore #5
    //   59: aload #5
    //   61: sipush #-10714
    //   64: sipush #8705
    //   67: invokestatic a : (II)Ljava/lang/String;
    //   70: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   73: pop
    //   74: aload_3
    //   75: astore #6
    //   77: aload #6
    //   79: arraylength
    //   80: istore #7
    //   82: iconst_0
    //   83: istore #8
    //   85: iload #8
    //   87: iload #7
    //   89: if_icmpge -> 115
    //   92: aload #6
    //   94: iload #8
    //   96: baload
    //   97: istore #9
    //   99: aload #5
    //   101: iload #9
    //   103: i2c
    //   104: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   107: pop
    //   108: iinc #8, 1
    //   111: iload_2
    //   112: ifne -> 85
    //   115: aload #5
    //   117: sipush #-10699
    //   120: sipush #-8353
    //   123: invokestatic a : (II)Ljava/lang/String;
    //   126: ldc ''
    //   128: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   131: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   134: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   137: pop
    //   138: aload #5
    //   140: sipush #-10694
    //   143: sipush #4738
    //   146: invokestatic a : (II)Ljava/lang/String;
    //   149: ldc ''
    //   151: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   154: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   157: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   160: pop
    //   161: aload #5
    //   163: invokevirtual toString : ()Ljava/lang/String;
    //   166: invokevirtual getBytes : ()[B
    //   169: astore #4
    //   171: aload #4
    //   173: astore_3
    //   174: aload_3
    //   175: arraylength
    //   176: bipush #8
    //   178: iadd
    //   179: bipush #6
    //   181: ishr
    //   182: iconst_1
    //   183: iadd
    //   184: bipush #16
    //   186: imul
    //   187: newarray int
    //   189: astore #5
    //   191: iconst_0
    //   192: istore #6
    //   194: iload #6
    //   196: aload_3
    //   197: arraylength
    //   198: if_icmpge -> 241
    //   201: aload_3
    //   202: iload #6
    //   204: baload
    //   205: sipush #255
    //   208: iand
    //   209: istore #7
    //   211: aload #5
    //   213: iload #6
    //   215: iconst_2
    //   216: ishr
    //   217: dup2
    //   218: iaload
    //   219: iload #7
    //   221: bipush #24
    //   223: iload #6
    //   225: iconst_4
    //   226: irem
    //   227: bipush #8
    //   229: imul
    //   230: isub
    //   231: ishl
    //   232: ior
    //   233: iastore
    //   234: iinc #6, 1
    //   237: iload_2
    //   238: ifne -> 194
    //   241: aload #5
    //   243: iload #6
    //   245: iconst_2
    //   246: ishr
    //   247: dup2
    //   248: iaload
    //   249: sipush #128
    //   252: bipush #24
    //   254: iload #6
    //   256: iconst_4
    //   257: irem
    //   258: bipush #8
    //   260: imul
    //   261: isub
    //   262: ishl
    //   263: ior
    //   264: iastore
    //   265: aload #5
    //   267: aload #5
    //   269: arraylength
    //   270: iconst_1
    //   271: isub
    //   272: aload_3
    //   273: arraylength
    //   274: bipush #8
    //   276: imul
    //   277: iastore
    //   278: bipush #80
    //   280: newarray int
    //   282: astore #7
    //   284: ldc 1732584193
    //   286: istore #8
    //   288: ldc -271733879
    //   290: istore #9
    //   292: ldc -1732584194
    //   294: istore #10
    //   296: ldc 271733878
    //   298: istore #11
    //   300: ldc -1009589776
    //   302: istore #12
    //   304: iconst_0
    //   305: istore #6
    //   307: iload #6
    //   309: aload #5
    //   311: arraylength
    //   312: if_icmpge -> 634
    //   315: iload #8
    //   317: istore #13
    //   319: iload #9
    //   321: istore #14
    //   323: iload #10
    //   325: istore #15
    //   327: iload #11
    //   329: istore #16
    //   331: iload #12
    //   333: istore #17
    //   335: iconst_0
    //   336: istore #18
    //   338: iload #18
    //   340: bipush #80
    //   342: if_icmpge -> 592
    //   345: iload #18
    //   347: bipush #16
    //   349: if_icmpge -> 376
    //   352: aload #7
    //   354: iload #18
    //   356: aload #5
    //   358: iload #6
    //   360: iload #18
    //   362: iadd
    //   363: iaload
    //   364: iastore
    //   365: iload_2
    //   366: ifne -> 431
    //   369: goto -> 376
    //   372: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   375: athrow
    //   376: aload #7
    //   378: iload #18
    //   380: iconst_3
    //   381: isub
    //   382: iaload
    //   383: aload #7
    //   385: iload #18
    //   387: bipush #8
    //   389: isub
    //   390: iaload
    //   391: ixor
    //   392: aload #7
    //   394: iload #18
    //   396: bipush #14
    //   398: isub
    //   399: iaload
    //   400: ixor
    //   401: aload #7
    //   403: iload #18
    //   405: bipush #16
    //   407: isub
    //   408: iaload
    //   409: ixor
    //   410: istore #19
    //   412: iload #19
    //   414: iconst_1
    //   415: ishl
    //   416: iload #19
    //   418: bipush #31
    //   420: iushr
    //   421: ior
    //   422: istore #20
    //   424: aload #7
    //   426: iload #18
    //   428: iload #20
    //   430: iastore
    //   431: iload #8
    //   433: iconst_5
    //   434: ishl
    //   435: iload #8
    //   437: bipush #27
    //   439: iushr
    //   440: ior
    //   441: istore #19
    //   443: iload #19
    //   445: iload #12
    //   447: iadd
    //   448: aload #7
    //   450: iload #18
    //   452: iaload
    //   453: iadd
    //   454: iload #18
    //   456: bipush #20
    //   458: if_icmpge -> 484
    //   461: ldc 1518500249
    //   463: iload #9
    //   465: iload #10
    //   467: iand
    //   468: iload #9
    //   470: iconst_m1
    //   471: ixor
    //   472: iload #11
    //   474: iand
    //   475: ior
    //   476: iadd
    //   477: goto -> 554
    //   480: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   483: athrow
    //   484: iload #18
    //   486: bipush #40
    //   488: if_icmpge -> 509
    //   491: ldc 1859775393
    //   493: iload #9
    //   495: iload #10
    //   497: ixor
    //   498: iload #11
    //   500: ixor
    //   501: iadd
    //   502: goto -> 554
    //   505: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   508: athrow
    //   509: iload #18
    //   511: bipush #60
    //   513: if_icmpge -> 543
    //   516: ldc -1894007588
    //   518: iload #9
    //   520: iload #10
    //   522: iand
    //   523: iload #9
    //   525: iload #11
    //   527: iand
    //   528: ior
    //   529: iload #10
    //   531: iload #11
    //   533: iand
    //   534: ior
    //   535: iadd
    //   536: goto -> 554
    //   539: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   542: athrow
    //   543: ldc -899497514
    //   545: iload #9
    //   547: iload #10
    //   549: ixor
    //   550: iload #11
    //   552: ixor
    //   553: iadd
    //   554: iadd
    //   555: istore #20
    //   557: iload #11
    //   559: istore #12
    //   561: iload #10
    //   563: istore #11
    //   565: iload #9
    //   567: bipush #30
    //   569: ishl
    //   570: iload #9
    //   572: iconst_2
    //   573: iushr
    //   574: ior
    //   575: istore #10
    //   577: iload #8
    //   579: istore #9
    //   581: iload #20
    //   583: istore #8
    //   585: iinc #18, 1
    //   588: iload_2
    //   589: ifne -> 338
    //   592: iload #8
    //   594: iload #13
    //   596: iadd
    //   597: istore #8
    //   599: iload #9
    //   601: iload #14
    //   603: iadd
    //   604: istore #9
    //   606: iload #10
    //   608: iload #15
    //   610: iadd
    //   611: istore #10
    //   613: iload #11
    //   615: iload #16
    //   617: iadd
    //   618: istore #11
    //   620: iload #12
    //   622: iload #17
    //   624: iadd
    //   625: istore #12
    //   627: iinc #6, 16
    //   630: iload_2
    //   631: ifne -> 307
    //   634: iconst_5
    //   635: newarray int
    //   637: dup
    //   638: iconst_0
    //   639: iload #8
    //   641: iastore
    //   642: dup
    //   643: iconst_1
    //   644: iload #9
    //   646: iastore
    //   647: dup
    //   648: iconst_2
    //   649: iload #10
    //   651: iastore
    //   652: dup
    //   653: iconst_3
    //   654: iload #11
    //   656: iastore
    //   657: dup
    //   658: iconst_4
    //   659: iload #12
    //   661: iastore
    //   662: astore #13
    //   664: bipush #20
    //   666: newarray byte
    //   668: astore #14
    //   670: iconst_0
    //   671: istore #15
    //   673: iload #15
    //   675: bipush #20
    //   677: if_icmpge -> 718
    //   680: aload #13
    //   682: iload #15
    //   684: iconst_4
    //   685: idiv
    //   686: iaload
    //   687: istore #16
    //   689: iconst_3
    //   690: iload #15
    //   692: iconst_4
    //   693: irem
    //   694: isub
    //   695: bipush #8
    //   697: imul
    //   698: istore #17
    //   700: aload #14
    //   702: iload #15
    //   704: iload #16
    //   706: iload #17
    //   708: iushr
    //   709: i2b
    //   710: bastore
    //   711: iinc #15, 1
    //   714: iload_2
    //   715: ifne -> 673
    //   718: aload #14
    //   720: astore #4
    //   722: sipush #-10745
    //   725: sipush #8650
    //   728: invokestatic a : (II)Ljava/lang/String;
    //   731: iconst_1
    //   732: ldc burp/Zsn6
    //   734: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   737: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   740: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   743: astore_3
    //   744: aload_3
    //   745: arraylength
    //   746: istore #4
    //   748: iconst_0
    //   749: istore #5
    //   751: iload #5
    //   753: iload #4
    //   755: if_icmpge -> 892
    //   758: aload_3
    //   759: iload #5
    //   761: aaload
    //   762: astore #6
    //   764: aload #6
    //   766: invokevirtual getModifiers : ()I
    //   769: invokestatic isStatic : (I)Z
    //   772: ifne -> 782
    //   775: goto -> 885
    //   778: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   781: athrow
    //   782: aload #6
    //   784: invokevirtual getType : ()Ljava/lang/Class;
    //   787: astore #7
    //   789: aload #7
    //   791: ifnull -> 872
    //   794: aload #7
    //   796: invokevirtual isPrimitive : ()Z
    //   799: ifne -> 872
    //   802: goto -> 809
    //   805: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   808: athrow
    //   809: aload #7
    //   811: invokevirtual getPackage : ()Ljava/lang/Package;
    //   814: ifnull -> 872
    //   817: goto -> 824
    //   820: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   823: athrow
    //   824: aload #7
    //   826: invokevirtual getPackage : ()Ljava/lang/Package;
    //   829: invokevirtual getName : ()Ljava/lang/String;
    //   832: ifnull -> 872
    //   835: goto -> 842
    //   838: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   841: athrow
    //   842: aload #7
    //   844: invokevirtual getPackage : ()Ljava/lang/Package;
    //   847: invokevirtual getName : ()Ljava/lang/String;
    //   850: sipush #-10717
    //   853: sipush #26686
    //   856: invokestatic a : (II)Ljava/lang/String;
    //   859: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   862: ifne -> 872
    //   865: goto -> 872
    //   868: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   871: athrow
    //   872: aload #6
    //   874: iconst_1
    //   875: invokevirtual setAccessible : (Z)V
    //   878: aload #6
    //   880: aconst_null
    //   881: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   884: pop
    //   885: iinc #5, 1
    //   888: iload_2
    //   889: ifne -> 751
    //   892: sipush #-10719
    //   895: sipush #11764
    //   898: invokestatic a : (II)Ljava/lang/String;
    //   901: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   904: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   907: astore_3
    //   908: aload_3
    //   909: arraylength
    //   910: istore #4
    //   912: iconst_0
    //   913: istore #5
    //   915: iload #5
    //   917: iload #4
    //   919: if_icmpge -> 1051
    //   922: aload_3
    //   923: iload #5
    //   925: aaload
    //   926: astore #6
    //   928: aload #6
    //   930: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   933: pop
    //   934: aload #6
    //   936: invokevirtual getModifiers : ()I
    //   939: invokestatic isStatic : (I)Z
    //   942: ifeq -> 1037
    //   945: aload #6
    //   947: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   950: arraylength
    //   951: iconst_2
    //   952: if_icmpne -> 1037
    //   955: goto -> 962
    //   958: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   961: athrow
    //   962: aload #6
    //   964: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   967: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   970: invokevirtual equals : (Ljava/lang/Object;)Z
    //   973: ifeq -> 1037
    //   976: goto -> 983
    //   979: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   982: athrow
    //   983: aload #6
    //   985: iconst_1
    //   986: invokevirtual setAccessible : (Z)V
    //   989: aload #6
    //   991: aconst_null
    //   992: iconst_2
    //   993: anewarray java/lang/Object
    //   996: dup
    //   997: iconst_0
    //   998: aload_0
    //   999: aastore
    //   1000: dup
    //   1001: iconst_1
    //   1002: aload_1
    //   1003: ifnonnull -> 1021
    //   1006: goto -> 1013
    //   1009: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1012: athrow
    //   1013: aload_1
    //   1014: goto -> 1028
    //   1017: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1020: athrow
    //   1021: aload_1
    //   1022: checkcast [B
    //   1025: invokevirtual clone : ()Ljava/lang/Object;
    //   1028: aastore
    //   1029: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1032: pop
    //   1033: iload_2
    //   1034: ifne -> 1051
    //   1037: iinc #5, 1
    //   1040: iload_2
    //   1041: ifne -> 915
    //   1044: goto -> 1051
    //   1047: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1050: athrow
    //   1051: getstatic burp/Zm8j.Zj : Ljava/lang/Object;
    //   1054: checkcast java/math/BigInteger
    //   1057: invokevirtual intValue : ()I
    //   1060: i2l
    //   1061: invokestatic currentTimeMillis : ()J
    //   1064: ladd
    //   1065: getstatic burp/Zxcn.Zq : Ljava/lang/Object;
    //   1068: checkcast java/math/BigInteger
    //   1071: invokevirtual intValue : ()I
    //   1074: i2l
    //   1075: lcmp
    //   1076: ifge -> 1408
    //   1079: sipush #-10690
    //   1082: sipush #24860
    //   1085: invokestatic a : (II)Ljava/lang/String;
    //   1088: iconst_1
    //   1089: ldc burp/Zrcu
    //   1091: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1094: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1097: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1100: astore_3
    //   1101: aload_3
    //   1102: arraylength
    //   1103: istore #4
    //   1105: iconst_0
    //   1106: istore #5
    //   1108: iload #5
    //   1110: iload #4
    //   1112: if_icmpge -> 1249
    //   1115: aload_3
    //   1116: iload #5
    //   1118: aaload
    //   1119: astore #6
    //   1121: aload #6
    //   1123: invokevirtual getModifiers : ()I
    //   1126: invokestatic isStatic : (I)Z
    //   1129: ifne -> 1139
    //   1132: goto -> 1242
    //   1135: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1138: athrow
    //   1139: aload #6
    //   1141: invokevirtual getType : ()Ljava/lang/Class;
    //   1144: astore #7
    //   1146: aload #7
    //   1148: ifnull -> 1229
    //   1151: aload #7
    //   1153: invokevirtual isPrimitive : ()Z
    //   1156: ifne -> 1229
    //   1159: goto -> 1166
    //   1162: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1165: athrow
    //   1166: aload #7
    //   1168: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1171: ifnull -> 1229
    //   1174: goto -> 1181
    //   1177: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1180: athrow
    //   1181: aload #7
    //   1183: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1186: invokevirtual getName : ()Ljava/lang/String;
    //   1189: ifnull -> 1229
    //   1192: goto -> 1199
    //   1195: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1198: athrow
    //   1199: aload #7
    //   1201: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1204: invokevirtual getName : ()Ljava/lang/String;
    //   1207: sipush #-10705
    //   1210: sipush #28891
    //   1213: invokestatic a : (II)Ljava/lang/String;
    //   1216: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1219: ifne -> 1229
    //   1222: goto -> 1229
    //   1225: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1228: athrow
    //   1229: aload #6
    //   1231: iconst_1
    //   1232: invokevirtual setAccessible : (Z)V
    //   1235: aload #6
    //   1237: aconst_null
    //   1238: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1241: pop
    //   1242: iinc #5, 1
    //   1245: iload_2
    //   1246: ifne -> 1108
    //   1249: sipush #-10716
    //   1252: sipush #32225
    //   1255: invokestatic a : (II)Ljava/lang/String;
    //   1258: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1261: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1264: astore_3
    //   1265: aload_3
    //   1266: arraylength
    //   1267: istore #4
    //   1269: iconst_0
    //   1270: istore #5
    //   1272: iload #5
    //   1274: iload #4
    //   1276: if_icmpge -> 1408
    //   1279: aload_3
    //   1280: iload #5
    //   1282: aaload
    //   1283: astore #6
    //   1285: aload #6
    //   1287: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1290: pop
    //   1291: aload #6
    //   1293: invokevirtual getModifiers : ()I
    //   1296: invokestatic isStatic : (I)Z
    //   1299: ifeq -> 1394
    //   1302: aload #6
    //   1304: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1307: arraylength
    //   1308: iconst_2
    //   1309: if_icmpne -> 1394
    //   1312: goto -> 1319
    //   1315: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1318: athrow
    //   1319: aload #6
    //   1321: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   1324: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   1327: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1330: ifeq -> 1394
    //   1333: goto -> 1340
    //   1336: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1339: athrow
    //   1340: aload #6
    //   1342: iconst_1
    //   1343: invokevirtual setAccessible : (Z)V
    //   1346: aload #6
    //   1348: aconst_null
    //   1349: iconst_2
    //   1350: anewarray java/lang/Object
    //   1353: dup
    //   1354: iconst_0
    //   1355: aload_0
    //   1356: aastore
    //   1357: dup
    //   1358: iconst_1
    //   1359: aload_1
    //   1360: ifnonnull -> 1378
    //   1363: goto -> 1370
    //   1366: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1369: athrow
    //   1370: aload_1
    //   1371: goto -> 1385
    //   1374: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1377: athrow
    //   1378: aload_1
    //   1379: checkcast [B
    //   1382: invokevirtual clone : ()Ljava/lang/Object;
    //   1385: aastore
    //   1386: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1389: pop
    //   1390: iload_2
    //   1391: ifne -> 1408
    //   1394: iinc #5, 1
    //   1397: iload_2
    //   1398: ifne -> 1272
    //   1401: goto -> 1408
    //   1404: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1407: athrow
    //   1408: new java/io/ByteArrayOutputStream
    //   1411: dup
    //   1412: invokespecial <init> : ()V
    //   1415: astore_3
    //   1416: sipush #-10693
    //   1419: aload_3
    //   1420: sipush #202
    //   1423: invokevirtual write : (I)V
    //   1426: sipush #-21028
    //   1429: aload_3
    //   1430: sipush #254
    //   1433: invokevirtual write : (I)V
    //   1436: aload_3
    //   1437: sipush #186
    //   1440: invokevirtual write : (I)V
    //   1443: aload_3
    //   1444: sipush #190
    //   1447: invokevirtual write : (I)V
    //   1450: aload_3
    //   1451: iconst_0
    //   1452: invokevirtual write : (I)V
    //   1455: aload_3
    //   1456: iconst_1
    //   1457: invokevirtual write : (I)V
    //   1460: aload_3
    //   1461: iconst_0
    //   1462: invokevirtual write : (I)V
    //   1465: aload_3
    //   1466: bipush #50
    //   1468: invokevirtual write : (I)V
    //   1471: aload_3
    //   1472: getstatic burp/Zlpl.Ze : Ljava/lang/Object;
    //   1475: checkcast java/math/BigInteger
    //   1478: invokevirtual toByteArray : ()[B
    //   1481: invokevirtual write : ([B)V
    //   1484: aload_3
    //   1485: getstatic burp/Zcc.Zd : Ljava/lang/Object;
    //   1488: checkcast java/math/BigInteger
    //   1491: invokevirtual toByteArray : ()[B
    //   1494: invokevirtual write : ([B)V
    //   1497: aload_3
    //   1498: getstatic burp/Zxxf.ZZ : Ljava/lang/Object;
    //   1501: checkcast java/math/BigInteger
    //   1504: invokevirtual toByteArray : ()[B
    //   1507: invokevirtual write : ([B)V
    //   1510: aload_3
    //   1511: invokevirtual toByteArray : ()[B
    //   1514: astore #4
    //   1516: aconst_null
    //   1517: astore #5
    //   1519: invokestatic a : (II)Ljava/lang/String;
    //   1522: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1525: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1528: astore #6
    //   1530: aload #6
    //   1532: arraylength
    //   1533: istore #7
    //   1535: iconst_0
    //   1536: istore #8
    //   1538: iload #8
    //   1540: iload #7
    //   1542: if_icmpge -> 1670
    //   1545: aload #6
    //   1547: iload #8
    //   1549: aaload
    //   1550: astore #9
    //   1552: aload #9
    //   1554: invokevirtual getName : ()Ljava/lang/String;
    //   1557: sipush #-10720
    //   1560: sipush #-10809
    //   1563: invokestatic a : (II)Ljava/lang/String;
    //   1566: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1569: ifeq -> 1663
    //   1572: aload #9
    //   1574: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   1577: astore #10
    //   1579: aload #10
    //   1581: arraylength
    //   1582: iconst_4
    //   1583: if_icmpeq -> 1593
    //   1586: goto -> 1663
    //   1589: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1592: athrow
    //   1593: aload #10
    //   1595: iconst_0
    //   1596: aaload
    //   1597: ldc java/lang/String
    //   1599: if_acmpeq -> 1609
    //   1602: goto -> 1663
    //   1605: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1608: athrow
    //   1609: aload #10
    //   1611: iconst_1
    //   1612: aaload
    //   1613: ldc [B
    //   1615: if_acmpeq -> 1625
    //   1618: goto -> 1663
    //   1621: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1624: athrow
    //   1625: aload #10
    //   1627: iconst_2
    //   1628: aaload
    //   1629: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   1632: if_acmpeq -> 1642
    //   1635: goto -> 1663
    //   1638: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1641: athrow
    //   1642: aload #10
    //   1644: iconst_3
    //   1645: aaload
    //   1646: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   1649: if_acmpeq -> 1659
    //   1652: goto -> 1663
    //   1655: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1658: athrow
    //   1659: aload #9
    //   1661: astore #5
    //   1663: iinc #8, 1
    //   1666: iload_2
    //   1667: ifne -> 1538
    //   1670: aload #5
    //   1672: iconst_1
    //   1673: invokevirtual setAccessible : (Z)V
    //   1676: ldc burp/Zz5h
    //   1678: iconst_0
    //   1679: anewarray java/lang/Class
    //   1682: invokevirtual getDeclaredConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   1685: astore #6
    //   1687: aload #6
    //   1689: iconst_1
    //   1690: invokevirtual setAccessible : (Z)V
    //   1693: aload #5
    //   1695: aload #6
    //   1697: iconst_0
    //   1698: anewarray java/lang/Object
    //   1701: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   1704: iconst_4
    //   1705: anewarray java/lang/Object
    //   1708: dup
    //   1709: iconst_0
    //   1710: sipush #-10689
    //   1713: sipush #21236
    //   1716: invokestatic a : (II)Ljava/lang/String;
    //   1719: aastore
    //   1720: dup
    //   1721: iconst_1
    //   1722: aload #4
    //   1724: aastore
    //   1725: dup
    //   1726: iconst_2
    //   1727: iconst_0
    //   1728: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1731: aastore
    //   1732: dup
    //   1733: iconst_3
    //   1734: aload #4
    //   1736: arraylength
    //   1737: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1740: aastore
    //   1741: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1744: pop
    //   1745: goto -> 1749
    //   1748: astore_3
    //   1749: iconst_0
    //   1750: istore_3
    //   1751: getstatic burp/Zmig.ZR : Ljava/lang/String;
    //   1754: getstatic burp/Zreu.Zi : Ljava/lang/Object;
    //   1757: checkcast java/math/BigInteger
    //   1760: invokevirtual intValue : ()I
    //   1763: bipush #32
    //   1765: irem
    //   1766: invokestatic abs : (I)I
    //   1769: invokevirtual charAt : (I)C
    //   1772: getstatic burp/Zsbo.Zg : Ljava/lang/String;
    //   1775: getstatic burp/Zbwj.ZW : Ljava/lang/Object;
    //   1778: checkcast java/math/BigInteger
    //   1781: invokevirtual intValue : ()I
    //   1784: bipush #32
    //   1786: irem
    //   1787: invokestatic abs : (I)I
    //   1790: invokevirtual charAt : (I)C
    //   1793: if_icmple -> 2137
    //   1796: sipush #-10710
    //   1799: sipush #-4819
    //   1802: invokestatic a : (II)Ljava/lang/String;
    //   1805: iconst_1
    //   1806: ldc burp/Zzef
    //   1808: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   1811: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   1814: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   1817: astore #4
    //   1819: aload #4
    //   1821: arraylength
    //   1822: istore #5
    //   1824: iconst_0
    //   1825: istore #6
    //   1827: iload #6
    //   1829: iload #5
    //   1831: if_icmpge -> 1969
    //   1834: aload #4
    //   1836: iload #6
    //   1838: aaload
    //   1839: astore #7
    //   1841: aload #7
    //   1843: invokevirtual getModifiers : ()I
    //   1846: invokestatic isStatic : (I)Z
    //   1849: ifne -> 1859
    //   1852: goto -> 1962
    //   1855: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1858: athrow
    //   1859: aload #7
    //   1861: invokevirtual getType : ()Ljava/lang/Class;
    //   1864: astore #8
    //   1866: aload #8
    //   1868: ifnull -> 1949
    //   1871: aload #8
    //   1873: invokevirtual isPrimitive : ()Z
    //   1876: ifne -> 1949
    //   1879: goto -> 1886
    //   1882: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1885: athrow
    //   1886: aload #8
    //   1888: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1891: ifnull -> 1949
    //   1894: goto -> 1901
    //   1897: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1900: athrow
    //   1901: aload #8
    //   1903: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1906: invokevirtual getName : ()Ljava/lang/String;
    //   1909: ifnull -> 1949
    //   1912: goto -> 1919
    //   1915: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1918: athrow
    //   1919: aload #8
    //   1921: invokevirtual getPackage : ()Ljava/lang/Package;
    //   1924: invokevirtual getName : ()Ljava/lang/String;
    //   1927: sipush #-10705
    //   1930: sipush #28891
    //   1933: invokestatic a : (II)Ljava/lang/String;
    //   1936: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1939: ifne -> 1949
    //   1942: goto -> 1949
    //   1945: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1948: athrow
    //   1949: aload #7
    //   1951: iconst_1
    //   1952: invokevirtual setAccessible : (Z)V
    //   1955: aload #7
    //   1957: aconst_null
    //   1958: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1961: pop
    //   1962: iinc #6, 1
    //   1965: iload_2
    //   1966: ifne -> 1827
    //   1969: sipush #-10696
    //   1972: sipush #5155
    //   1975: invokestatic a : (II)Ljava/lang/String;
    //   1978: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   1981: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   1984: astore #4
    //   1986: aload #4
    //   1988: arraylength
    //   1989: istore #5
    //   1991: iconst_0
    //   1992: istore #6
    //   1994: iload #6
    //   1996: iload #5
    //   1998: if_icmpge -> 2134
    //   2001: aload #4
    //   2003: iload #6
    //   2005: aaload
    //   2006: astore #7
    //   2008: aload #7
    //   2010: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2013: pop
    //   2014: aload #7
    //   2016: invokevirtual getModifiers : ()I
    //   2019: invokestatic isStatic : (I)Z
    //   2022: ifeq -> 2120
    //   2025: aload #7
    //   2027: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2030: arraylength
    //   2031: iconst_2
    //   2032: if_icmpne -> 2120
    //   2035: goto -> 2042
    //   2038: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2041: athrow
    //   2042: aload #7
    //   2044: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2047: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2050: if_acmpne -> 2120
    //   2053: goto -> 2060
    //   2056: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2059: athrow
    //   2060: aload #7
    //   2062: iconst_1
    //   2063: invokevirtual setAccessible : (Z)V
    //   2066: aload #7
    //   2068: aconst_null
    //   2069: iconst_2
    //   2070: anewarray java/lang/Object
    //   2073: dup
    //   2074: iconst_0
    //   2075: aload_0
    //   2076: aastore
    //   2077: dup
    //   2078: iconst_1
    //   2079: aload_1
    //   2080: ifnonnull -> 2098
    //   2083: goto -> 2090
    //   2086: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2089: athrow
    //   2090: aload_1
    //   2091: goto -> 2105
    //   2094: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2097: athrow
    //   2098: aload_1
    //   2099: checkcast [B
    //   2102: invokevirtual clone : ()Ljava/lang/Object;
    //   2105: aastore
    //   2106: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2109: checkcast java/lang/Boolean
    //   2112: invokevirtual booleanValue : ()Z
    //   2115: istore_3
    //   2116: iload_2
    //   2117: ifne -> 2134
    //   2120: iinc #6, 1
    //   2123: iload_2
    //   2124: ifne -> 1994
    //   2127: goto -> 2134
    //   2130: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2133: athrow
    //   2134: goto -> 2475
    //   2137: sipush #-10702
    //   2140: sipush #-8106
    //   2143: invokestatic a : (II)Ljava/lang/String;
    //   2146: iconst_1
    //   2147: ldc burp/Zzc_
    //   2149: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2152: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2155: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2158: astore #4
    //   2160: aload #4
    //   2162: arraylength
    //   2163: istore #5
    //   2165: iconst_0
    //   2166: istore #6
    //   2168: iload #6
    //   2170: iload #5
    //   2172: if_icmpge -> 2310
    //   2175: aload #4
    //   2177: iload #6
    //   2179: aaload
    //   2180: astore #7
    //   2182: aload #7
    //   2184: invokevirtual getModifiers : ()I
    //   2187: invokestatic isStatic : (I)Z
    //   2190: ifne -> 2200
    //   2193: goto -> 2303
    //   2196: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2199: athrow
    //   2200: aload #7
    //   2202: invokevirtual getType : ()Ljava/lang/Class;
    //   2205: astore #8
    //   2207: aload #8
    //   2209: ifnull -> 2290
    //   2212: aload #8
    //   2214: invokevirtual isPrimitive : ()Z
    //   2217: ifne -> 2290
    //   2220: goto -> 2227
    //   2223: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2226: athrow
    //   2227: aload #8
    //   2229: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2232: ifnull -> 2290
    //   2235: goto -> 2242
    //   2238: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2241: athrow
    //   2242: aload #8
    //   2244: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2247: invokevirtual getName : ()Ljava/lang/String;
    //   2250: ifnull -> 2290
    //   2253: goto -> 2260
    //   2256: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2259: athrow
    //   2260: aload #8
    //   2262: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2265: invokevirtual getName : ()Ljava/lang/String;
    //   2268: sipush #-10705
    //   2271: sipush #28891
    //   2274: invokestatic a : (II)Ljava/lang/String;
    //   2277: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2280: ifne -> 2290
    //   2283: goto -> 2290
    //   2286: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2289: athrow
    //   2290: aload #7
    //   2292: iconst_1
    //   2293: invokevirtual setAccessible : (Z)V
    //   2296: aload #7
    //   2298: aconst_null
    //   2299: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2302: pop
    //   2303: iinc #6, 1
    //   2306: iload_2
    //   2307: ifne -> 2168
    //   2310: sipush #-10695
    //   2313: sipush #14555
    //   2316: invokestatic a : (II)Ljava/lang/String;
    //   2319: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2322: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2325: astore #4
    //   2327: aload #4
    //   2329: arraylength
    //   2330: istore #5
    //   2332: iconst_0
    //   2333: istore #6
    //   2335: iload #6
    //   2337: iload #5
    //   2339: if_icmpge -> 2475
    //   2342: aload #4
    //   2344: iload #6
    //   2346: aaload
    //   2347: astore #7
    //   2349: aload #7
    //   2351: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2354: pop
    //   2355: aload #7
    //   2357: invokevirtual getModifiers : ()I
    //   2360: invokestatic isStatic : (I)Z
    //   2363: ifeq -> 2461
    //   2366: aload #7
    //   2368: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2371: arraylength
    //   2372: iconst_2
    //   2373: if_icmpne -> 2461
    //   2376: goto -> 2383
    //   2379: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2382: athrow
    //   2383: aload #7
    //   2385: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2388: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2391: if_acmpne -> 2461
    //   2394: goto -> 2401
    //   2397: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2400: athrow
    //   2401: aload #7
    //   2403: iconst_1
    //   2404: invokevirtual setAccessible : (Z)V
    //   2407: aload #7
    //   2409: aconst_null
    //   2410: iconst_2
    //   2411: anewarray java/lang/Object
    //   2414: dup
    //   2415: iconst_0
    //   2416: aload_0
    //   2417: aastore
    //   2418: dup
    //   2419: iconst_1
    //   2420: aload_1
    //   2421: ifnonnull -> 2439
    //   2424: goto -> 2431
    //   2427: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2430: athrow
    //   2431: aload_1
    //   2432: goto -> 2446
    //   2435: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2438: athrow
    //   2439: aload_1
    //   2440: checkcast [B
    //   2443: invokevirtual clone : ()Ljava/lang/Object;
    //   2446: aastore
    //   2447: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2450: checkcast java/lang/Boolean
    //   2453: invokevirtual booleanValue : ()Z
    //   2456: istore_3
    //   2457: iload_2
    //   2458: ifne -> 2475
    //   2461: iinc #6, 1
    //   2464: iload_2
    //   2465: ifne -> 2335
    //   2468: goto -> 2475
    //   2471: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2474: athrow
    //   2475: iload_3
    //   2476: ifeq -> 2481
    //   2479: iload_3
    //   2480: ireturn
    //   2481: getstatic burp/Zge2.ZT : Ljava/lang/String;
    //   2484: getstatic burp/Zbx4.Zw : Ljava/lang/Object;
    //   2487: checkcast java/math/BigInteger
    //   2490: invokevirtual intValue : ()I
    //   2493: bipush #32
    //   2495: irem
    //   2496: invokestatic abs : (I)I
    //   2499: invokevirtual charAt : (I)C
    //   2502: getstatic burp/Zz0f.ZW : Ljava/lang/String;
    //   2505: getstatic burp/Zkql.Zl : Ljava/lang/Object;
    //   2508: checkcast java/math/BigInteger
    //   2511: invokevirtual intValue : ()I
    //   2514: bipush #32
    //   2516: irem
    //   2517: invokestatic abs : (I)I
    //   2520: invokevirtual charAt : (I)C
    //   2523: if_icmple -> 2868
    //   2526: sipush #-10704
    //   2529: sipush #15928
    //   2532: invokestatic a : (II)Ljava/lang/String;
    //   2535: iconst_1
    //   2536: ldc burp/Zm0s
    //   2538: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2541: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2544: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2547: astore #4
    //   2549: aload #4
    //   2551: arraylength
    //   2552: istore #5
    //   2554: iconst_0
    //   2555: istore #6
    //   2557: iload #6
    //   2559: iload #5
    //   2561: if_icmpge -> 2699
    //   2564: aload #4
    //   2566: iload #6
    //   2568: aaload
    //   2569: astore #7
    //   2571: aload #7
    //   2573: invokevirtual getModifiers : ()I
    //   2576: invokestatic isStatic : (I)Z
    //   2579: ifne -> 2589
    //   2582: goto -> 2692
    //   2585: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2588: athrow
    //   2589: aload #7
    //   2591: invokevirtual getType : ()Ljava/lang/Class;
    //   2594: astore #8
    //   2596: aload #8
    //   2598: ifnull -> 2679
    //   2601: aload #8
    //   2603: invokevirtual isPrimitive : ()Z
    //   2606: ifne -> 2679
    //   2609: goto -> 2616
    //   2612: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2615: athrow
    //   2616: aload #8
    //   2618: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2621: ifnull -> 2679
    //   2624: goto -> 2631
    //   2627: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2630: athrow
    //   2631: aload #8
    //   2633: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2636: invokevirtual getName : ()Ljava/lang/String;
    //   2639: ifnull -> 2679
    //   2642: goto -> 2649
    //   2645: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2648: athrow
    //   2649: aload #8
    //   2651: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2654: invokevirtual getName : ()Ljava/lang/String;
    //   2657: sipush #-10705
    //   2660: sipush #28891
    //   2663: invokestatic a : (II)Ljava/lang/String;
    //   2666: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   2669: ifne -> 2679
    //   2672: goto -> 2679
    //   2675: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2678: athrow
    //   2679: aload #7
    //   2681: iconst_1
    //   2682: invokevirtual setAccessible : (Z)V
    //   2685: aload #7
    //   2687: aconst_null
    //   2688: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   2691: pop
    //   2692: iinc #6, 1
    //   2695: iload_2
    //   2696: ifne -> 2557
    //   2699: sipush #-10718
    //   2702: sipush #-21681
    //   2705: invokestatic a : (II)Ljava/lang/String;
    //   2708: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   2711: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   2714: astore #4
    //   2716: aload #4
    //   2718: arraylength
    //   2719: istore #5
    //   2721: iconst_0
    //   2722: istore #6
    //   2724: iload #6
    //   2726: iload #5
    //   2728: if_icmpge -> 2864
    //   2731: aload #4
    //   2733: iload #6
    //   2735: aaload
    //   2736: astore #7
    //   2738: aload #7
    //   2740: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2743: pop
    //   2744: aload #7
    //   2746: invokevirtual getModifiers : ()I
    //   2749: invokestatic isStatic : (I)Z
    //   2752: ifeq -> 2850
    //   2755: aload #7
    //   2757: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   2760: arraylength
    //   2761: iconst_2
    //   2762: if_icmpne -> 2850
    //   2765: goto -> 2772
    //   2768: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2771: athrow
    //   2772: aload #7
    //   2774: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   2777: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   2780: if_acmpne -> 2850
    //   2783: goto -> 2790
    //   2786: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2789: athrow
    //   2790: aload #7
    //   2792: iconst_1
    //   2793: invokevirtual setAccessible : (Z)V
    //   2796: aload #7
    //   2798: aconst_null
    //   2799: iconst_2
    //   2800: anewarray java/lang/Object
    //   2803: dup
    //   2804: iconst_0
    //   2805: aload_0
    //   2806: aastore
    //   2807: dup
    //   2808: iconst_1
    //   2809: aload_1
    //   2810: ifnonnull -> 2828
    //   2813: goto -> 2820
    //   2816: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2819: athrow
    //   2820: aload_1
    //   2821: goto -> 2835
    //   2824: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2827: athrow
    //   2828: aload_1
    //   2829: checkcast [B
    //   2832: invokevirtual clone : ()Ljava/lang/Object;
    //   2835: aastore
    //   2836: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2839: checkcast java/lang/Boolean
    //   2842: invokevirtual booleanValue : ()Z
    //   2845: istore_3
    //   2846: iload_2
    //   2847: ifne -> 2864
    //   2850: iinc #6, 1
    //   2853: iload_2
    //   2854: ifne -> 2724
    //   2857: goto -> 2864
    //   2860: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2863: athrow
    //   2864: iload_2
    //   2865: ifne -> 3206
    //   2868: sipush #-10713
    //   2871: sipush #-26789
    //   2874: invokestatic a : (II)Ljava/lang/String;
    //   2877: iconst_1
    //   2878: ldc burp/Zz5l
    //   2880: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   2883: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   2886: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   2889: astore #4
    //   2891: aload #4
    //   2893: arraylength
    //   2894: istore #5
    //   2896: iconst_0
    //   2897: istore #6
    //   2899: iload #6
    //   2901: iload #5
    //   2903: if_icmpge -> 3041
    //   2906: aload #4
    //   2908: iload #6
    //   2910: aaload
    //   2911: astore #7
    //   2913: aload #7
    //   2915: invokevirtual getModifiers : ()I
    //   2918: invokestatic isStatic : (I)Z
    //   2921: ifne -> 2931
    //   2924: goto -> 3034
    //   2927: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2930: athrow
    //   2931: aload #7
    //   2933: invokevirtual getType : ()Ljava/lang/Class;
    //   2936: astore #8
    //   2938: aload #8
    //   2940: ifnull -> 3021
    //   2943: aload #8
    //   2945: invokevirtual isPrimitive : ()Z
    //   2948: ifne -> 3021
    //   2951: goto -> 2958
    //   2954: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2957: athrow
    //   2958: aload #8
    //   2960: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2963: ifnull -> 3021
    //   2966: goto -> 2973
    //   2969: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2972: athrow
    //   2973: aload #8
    //   2975: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2978: invokevirtual getName : ()Ljava/lang/String;
    //   2981: ifnull -> 3021
    //   2984: goto -> 2991
    //   2987: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2990: athrow
    //   2991: aload #8
    //   2993: invokevirtual getPackage : ()Ljava/lang/Package;
    //   2996: invokevirtual getName : ()Ljava/lang/String;
    //   2999: sipush #-10705
    //   3002: sipush #28891
    //   3005: invokestatic a : (II)Ljava/lang/String;
    //   3008: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3011: ifne -> 3021
    //   3014: goto -> 3021
    //   3017: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3020: athrow
    //   3021: aload #7
    //   3023: iconst_1
    //   3024: invokevirtual setAccessible : (Z)V
    //   3027: aload #7
    //   3029: aconst_null
    //   3030: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3033: pop
    //   3034: iinc #6, 1
    //   3037: iload_2
    //   3038: ifne -> 2899
    //   3041: sipush #-10712
    //   3044: sipush #-2051
    //   3047: invokestatic a : (II)Ljava/lang/String;
    //   3050: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3053: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3056: astore #4
    //   3058: aload #4
    //   3060: arraylength
    //   3061: istore #5
    //   3063: iconst_0
    //   3064: istore #6
    //   3066: iload #6
    //   3068: iload #5
    //   3070: if_icmpge -> 3206
    //   3073: aload #4
    //   3075: iload #6
    //   3077: aaload
    //   3078: astore #7
    //   3080: aload #7
    //   3082: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3085: pop
    //   3086: aload #7
    //   3088: invokevirtual getModifiers : ()I
    //   3091: invokestatic isStatic : (I)Z
    //   3094: ifeq -> 3192
    //   3097: aload #7
    //   3099: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3102: arraylength
    //   3103: iconst_2
    //   3104: if_icmpne -> 3192
    //   3107: goto -> 3114
    //   3110: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3113: athrow
    //   3114: aload #7
    //   3116: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3119: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3122: if_acmpne -> 3192
    //   3125: goto -> 3132
    //   3128: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3131: athrow
    //   3132: aload #7
    //   3134: iconst_1
    //   3135: invokevirtual setAccessible : (Z)V
    //   3138: aload #7
    //   3140: aconst_null
    //   3141: iconst_2
    //   3142: anewarray java/lang/Object
    //   3145: dup
    //   3146: iconst_0
    //   3147: aload_0
    //   3148: aastore
    //   3149: dup
    //   3150: iconst_1
    //   3151: aload_1
    //   3152: ifnonnull -> 3170
    //   3155: goto -> 3162
    //   3158: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3161: athrow
    //   3162: aload_1
    //   3163: goto -> 3177
    //   3166: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3169: athrow
    //   3170: aload_1
    //   3171: checkcast [B
    //   3174: invokevirtual clone : ()Ljava/lang/Object;
    //   3177: aastore
    //   3178: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3181: checkcast java/lang/Boolean
    //   3184: invokevirtual booleanValue : ()Z
    //   3187: istore_3
    //   3188: iload_2
    //   3189: ifne -> 3206
    //   3192: iinc #6, 1
    //   3195: iload_2
    //   3196: ifne -> 3066
    //   3199: goto -> 3206
    //   3202: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3205: athrow
    //   3206: iload_3
    //   3207: ifeq -> 3212
    //   3210: iload_3
    //   3211: ireturn
    //   3212: getstatic burp/Zbw5.ZC : Ljava/lang/String;
    //   3215: getstatic burp/Zmkq.Zg : Ljava/lang/Object;
    //   3218: checkcast java/math/BigInteger
    //   3221: invokevirtual intValue : ()I
    //   3224: bipush #32
    //   3226: irem
    //   3227: invokestatic abs : (I)I
    //   3230: invokevirtual charAt : (I)C
    //   3233: getstatic burp/Zzef.Za : Ljava/lang/String;
    //   3236: getstatic burp/Zb3l.Zl : Ljava/lang/Object;
    //   3239: checkcast java/math/BigInteger
    //   3242: invokevirtual intValue : ()I
    //   3245: bipush #32
    //   3247: irem
    //   3248: invokestatic abs : (I)I
    //   3251: invokevirtual charAt : (I)C
    //   3254: if_icmpgt -> 3599
    //   3257: sipush #-10715
    //   3260: sipush #6575
    //   3263: invokestatic a : (II)Ljava/lang/String;
    //   3266: iconst_1
    //   3267: ldc burp/Zb38
    //   3269: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3272: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3275: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3278: astore #4
    //   3280: aload #4
    //   3282: arraylength
    //   3283: istore #5
    //   3285: iconst_0
    //   3286: istore #6
    //   3288: iload #6
    //   3290: iload #5
    //   3292: if_icmpge -> 3430
    //   3295: aload #4
    //   3297: iload #6
    //   3299: aaload
    //   3300: astore #7
    //   3302: aload #7
    //   3304: invokevirtual getModifiers : ()I
    //   3307: invokestatic isStatic : (I)Z
    //   3310: ifne -> 3320
    //   3313: goto -> 3423
    //   3316: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3319: athrow
    //   3320: aload #7
    //   3322: invokevirtual getType : ()Ljava/lang/Class;
    //   3325: astore #8
    //   3327: aload #8
    //   3329: ifnull -> 3410
    //   3332: aload #8
    //   3334: invokevirtual isPrimitive : ()Z
    //   3337: ifne -> 3410
    //   3340: goto -> 3347
    //   3343: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3346: athrow
    //   3347: aload #8
    //   3349: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3352: ifnull -> 3410
    //   3355: goto -> 3362
    //   3358: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3361: athrow
    //   3362: aload #8
    //   3364: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3367: invokevirtual getName : ()Ljava/lang/String;
    //   3370: ifnull -> 3410
    //   3373: goto -> 3380
    //   3376: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3379: athrow
    //   3380: aload #8
    //   3382: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3385: invokevirtual getName : ()Ljava/lang/String;
    //   3388: sipush #-10705
    //   3391: sipush #28891
    //   3394: invokestatic a : (II)Ljava/lang/String;
    //   3397: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3400: ifne -> 3410
    //   3403: goto -> 3410
    //   3406: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3409: athrow
    //   3410: aload #7
    //   3412: iconst_1
    //   3413: invokevirtual setAccessible : (Z)V
    //   3416: aload #7
    //   3418: aconst_null
    //   3419: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3422: pop
    //   3423: iinc #6, 1
    //   3426: iload_2
    //   3427: ifne -> 3288
    //   3430: sipush #-10697
    //   3433: sipush #-23524
    //   3436: invokestatic a : (II)Ljava/lang/String;
    //   3439: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3442: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3445: astore #4
    //   3447: aload #4
    //   3449: arraylength
    //   3450: istore #5
    //   3452: iconst_0
    //   3453: istore #6
    //   3455: iload #6
    //   3457: iload #5
    //   3459: if_icmpge -> 3595
    //   3462: aload #4
    //   3464: iload #6
    //   3466: aaload
    //   3467: astore #7
    //   3469: aload #7
    //   3471: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3474: pop
    //   3475: aload #7
    //   3477: invokevirtual getModifiers : ()I
    //   3480: invokestatic isStatic : (I)Z
    //   3483: ifeq -> 3581
    //   3486: aload #7
    //   3488: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3491: arraylength
    //   3492: iconst_2
    //   3493: if_icmpne -> 3581
    //   3496: goto -> 3503
    //   3499: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3502: athrow
    //   3503: aload #7
    //   3505: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3508: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3511: if_acmpne -> 3581
    //   3514: goto -> 3521
    //   3517: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3520: athrow
    //   3521: aload #7
    //   3523: iconst_1
    //   3524: invokevirtual setAccessible : (Z)V
    //   3527: aload #7
    //   3529: aconst_null
    //   3530: iconst_2
    //   3531: anewarray java/lang/Object
    //   3534: dup
    //   3535: iconst_0
    //   3536: aload_0
    //   3537: aastore
    //   3538: dup
    //   3539: iconst_1
    //   3540: aload_1
    //   3541: ifnonnull -> 3559
    //   3544: goto -> 3551
    //   3547: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3550: athrow
    //   3551: aload_1
    //   3552: goto -> 3566
    //   3555: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3558: athrow
    //   3559: aload_1
    //   3560: checkcast [B
    //   3563: invokevirtual clone : ()Ljava/lang/Object;
    //   3566: aastore
    //   3567: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3570: checkcast java/lang/Boolean
    //   3573: invokevirtual booleanValue : ()Z
    //   3576: istore_3
    //   3577: iload_2
    //   3578: ifne -> 3595
    //   3581: iinc #6, 1
    //   3584: iload_2
    //   3585: ifne -> 3455
    //   3588: goto -> 3595
    //   3591: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3594: athrow
    //   3595: iload_2
    //   3596: ifne -> 3937
    //   3599: sipush #-10703
    //   3602: sipush #20068
    //   3605: invokestatic a : (II)Ljava/lang/String;
    //   3608: iconst_1
    //   3609: ldc burp/Ztfh
    //   3611: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   3614: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   3617: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   3620: astore #4
    //   3622: aload #4
    //   3624: arraylength
    //   3625: istore #5
    //   3627: iconst_0
    //   3628: istore #6
    //   3630: iload #6
    //   3632: iload #5
    //   3634: if_icmpge -> 3772
    //   3637: aload #4
    //   3639: iload #6
    //   3641: aaload
    //   3642: astore #7
    //   3644: aload #7
    //   3646: invokevirtual getModifiers : ()I
    //   3649: invokestatic isStatic : (I)Z
    //   3652: ifne -> 3662
    //   3655: goto -> 3765
    //   3658: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3661: athrow
    //   3662: aload #7
    //   3664: invokevirtual getType : ()Ljava/lang/Class;
    //   3667: astore #8
    //   3669: aload #8
    //   3671: ifnull -> 3752
    //   3674: aload #8
    //   3676: invokevirtual isPrimitive : ()Z
    //   3679: ifne -> 3752
    //   3682: goto -> 3689
    //   3685: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3688: athrow
    //   3689: aload #8
    //   3691: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3694: ifnull -> 3752
    //   3697: goto -> 3704
    //   3700: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3703: athrow
    //   3704: aload #8
    //   3706: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3709: invokevirtual getName : ()Ljava/lang/String;
    //   3712: ifnull -> 3752
    //   3715: goto -> 3722
    //   3718: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3721: athrow
    //   3722: aload #8
    //   3724: invokevirtual getPackage : ()Ljava/lang/Package;
    //   3727: invokevirtual getName : ()Ljava/lang/String;
    //   3730: sipush #-10705
    //   3733: sipush #28891
    //   3736: invokestatic a : (II)Ljava/lang/String;
    //   3739: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3742: ifne -> 3752
    //   3745: goto -> 3752
    //   3748: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3751: athrow
    //   3752: aload #7
    //   3754: iconst_1
    //   3755: invokevirtual setAccessible : (Z)V
    //   3758: aload #7
    //   3760: aconst_null
    //   3761: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3764: pop
    //   3765: iinc #6, 1
    //   3768: iload_2
    //   3769: ifne -> 3630
    //   3772: sipush #-10711
    //   3775: sipush #-21297
    //   3778: invokestatic a : (II)Ljava/lang/String;
    //   3781: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   3784: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   3787: astore #4
    //   3789: aload #4
    //   3791: arraylength
    //   3792: istore #5
    //   3794: iconst_0
    //   3795: istore #6
    //   3797: iload #6
    //   3799: iload #5
    //   3801: if_icmpge -> 3937
    //   3804: aload #4
    //   3806: iload #6
    //   3808: aaload
    //   3809: astore #7
    //   3811: aload #7
    //   3813: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3816: pop
    //   3817: aload #7
    //   3819: invokevirtual getModifiers : ()I
    //   3822: invokestatic isStatic : (I)Z
    //   3825: ifeq -> 3923
    //   3828: aload #7
    //   3830: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   3833: arraylength
    //   3834: iconst_2
    //   3835: if_icmpne -> 3923
    //   3838: goto -> 3845
    //   3841: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3844: athrow
    //   3845: aload #7
    //   3847: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   3850: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   3853: if_acmpne -> 3923
    //   3856: goto -> 3863
    //   3859: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3862: athrow
    //   3863: aload #7
    //   3865: iconst_1
    //   3866: invokevirtual setAccessible : (Z)V
    //   3869: aload #7
    //   3871: aconst_null
    //   3872: iconst_2
    //   3873: anewarray java/lang/Object
    //   3876: dup
    //   3877: iconst_0
    //   3878: aload_0
    //   3879: aastore
    //   3880: dup
    //   3881: iconst_1
    //   3882: aload_1
    //   3883: ifnonnull -> 3901
    //   3886: goto -> 3893
    //   3889: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3892: athrow
    //   3893: aload_1
    //   3894: goto -> 3908
    //   3897: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3900: athrow
    //   3901: aload_1
    //   3902: checkcast [B
    //   3905: invokevirtual clone : ()Ljava/lang/Object;
    //   3908: aastore
    //   3909: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3912: checkcast java/lang/Boolean
    //   3915: invokevirtual booleanValue : ()Z
    //   3918: istore_3
    //   3919: iload_2
    //   3920: ifne -> 3937
    //   3923: iinc #6, 1
    //   3926: iload_2
    //   3927: ifne -> 3797
    //   3930: goto -> 3937
    //   3933: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3936: athrow
    //   3937: iload_3
    //   3938: ifeq -> 3943
    //   3941: iload_3
    //   3942: ireturn
    //   3943: getstatic burp/Ze84.Zv : Ljava/lang/String;
    //   3946: getstatic burp/Zs0h.ZU : Ljava/lang/Object;
    //   3949: checkcast java/math/BigInteger
    //   3952: invokevirtual intValue : ()I
    //   3955: bipush #32
    //   3957: irem
    //   3958: invokestatic abs : (I)I
    //   3961: invokevirtual charAt : (I)C
    //   3964: getstatic burp/Zebe.ZW : Ljava/lang/String;
    //   3967: getstatic burp/Zxn4.Zx : Ljava/lang/Object;
    //   3970: checkcast java/math/BigInteger
    //   3973: invokevirtual intValue : ()I
    //   3976: bipush #32
    //   3978: irem
    //   3979: invokestatic abs : (I)I
    //   3982: invokevirtual charAt : (I)C
    //   3985: if_icmple -> 4330
    //   3988: sipush #-10709
    //   3991: sipush #17551
    //   3994: invokestatic a : (II)Ljava/lang/String;
    //   3997: iconst_1
    //   3998: ldc burp/Zry0
    //   4000: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4003: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4006: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4009: astore #4
    //   4011: aload #4
    //   4013: arraylength
    //   4014: istore #5
    //   4016: iconst_0
    //   4017: istore #6
    //   4019: iload #6
    //   4021: iload #5
    //   4023: if_icmpge -> 4161
    //   4026: aload #4
    //   4028: iload #6
    //   4030: aaload
    //   4031: astore #7
    //   4033: aload #7
    //   4035: invokevirtual getModifiers : ()I
    //   4038: invokestatic isStatic : (I)Z
    //   4041: ifne -> 4051
    //   4044: goto -> 4154
    //   4047: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4050: athrow
    //   4051: aload #7
    //   4053: invokevirtual getType : ()Ljava/lang/Class;
    //   4056: astore #8
    //   4058: aload #8
    //   4060: ifnull -> 4141
    //   4063: aload #8
    //   4065: invokevirtual isPrimitive : ()Z
    //   4068: ifne -> 4141
    //   4071: goto -> 4078
    //   4074: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4077: athrow
    //   4078: aload #8
    //   4080: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4083: ifnull -> 4141
    //   4086: goto -> 4093
    //   4089: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4092: athrow
    //   4093: aload #8
    //   4095: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4098: invokevirtual getName : ()Ljava/lang/String;
    //   4101: ifnull -> 4141
    //   4104: goto -> 4111
    //   4107: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4110: athrow
    //   4111: aload #8
    //   4113: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4116: invokevirtual getName : ()Ljava/lang/String;
    //   4119: sipush #-10705
    //   4122: sipush #28891
    //   4125: invokestatic a : (II)Ljava/lang/String;
    //   4128: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4131: ifne -> 4141
    //   4134: goto -> 4141
    //   4137: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4140: athrow
    //   4141: aload #7
    //   4143: iconst_1
    //   4144: invokevirtual setAccessible : (Z)V
    //   4147: aload #7
    //   4149: aconst_null
    //   4150: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4153: pop
    //   4154: iinc #6, 1
    //   4157: iload_2
    //   4158: ifne -> 4019
    //   4161: sipush #-10700
    //   4164: sipush #-25986
    //   4167: invokestatic a : (II)Ljava/lang/String;
    //   4170: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4173: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4176: astore #4
    //   4178: aload #4
    //   4180: arraylength
    //   4181: istore #5
    //   4183: iconst_0
    //   4184: istore #6
    //   4186: iload #6
    //   4188: iload #5
    //   4190: if_icmpge -> 4326
    //   4193: aload #4
    //   4195: iload #6
    //   4197: aaload
    //   4198: astore #7
    //   4200: aload #7
    //   4202: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4205: pop
    //   4206: aload #7
    //   4208: invokevirtual getModifiers : ()I
    //   4211: invokestatic isStatic : (I)Z
    //   4214: ifeq -> 4312
    //   4217: aload #7
    //   4219: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4222: arraylength
    //   4223: iconst_2
    //   4224: if_icmpne -> 4312
    //   4227: goto -> 4234
    //   4230: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4233: athrow
    //   4234: aload #7
    //   4236: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4239: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4242: if_acmpne -> 4312
    //   4245: goto -> 4252
    //   4248: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4251: athrow
    //   4252: aload #7
    //   4254: iconst_1
    //   4255: invokevirtual setAccessible : (Z)V
    //   4258: aload #7
    //   4260: aconst_null
    //   4261: iconst_2
    //   4262: anewarray java/lang/Object
    //   4265: dup
    //   4266: iconst_0
    //   4267: aload_0
    //   4268: aastore
    //   4269: dup
    //   4270: iconst_1
    //   4271: aload_1
    //   4272: ifnonnull -> 4290
    //   4275: goto -> 4282
    //   4278: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4281: athrow
    //   4282: aload_1
    //   4283: goto -> 4297
    //   4286: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4289: athrow
    //   4290: aload_1
    //   4291: checkcast [B
    //   4294: invokevirtual clone : ()Ljava/lang/Object;
    //   4297: aastore
    //   4298: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4301: checkcast java/lang/Boolean
    //   4304: invokevirtual booleanValue : ()Z
    //   4307: istore_3
    //   4308: iload_2
    //   4309: ifne -> 4326
    //   4312: iinc #6, 1
    //   4315: iload_2
    //   4316: ifne -> 4186
    //   4319: goto -> 4326
    //   4322: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4325: athrow
    //   4326: iload_2
    //   4327: ifne -> 4668
    //   4330: sipush #-10706
    //   4333: sipush #30541
    //   4336: invokestatic a : (II)Ljava/lang/String;
    //   4339: iconst_1
    //   4340: ldc burp/Zr_y
    //   4342: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   4345: invokestatic forName : (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   4348: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   4351: astore #4
    //   4353: aload #4
    //   4355: arraylength
    //   4356: istore #5
    //   4358: iconst_0
    //   4359: istore #6
    //   4361: iload #6
    //   4363: iload #5
    //   4365: if_icmpge -> 4503
    //   4368: aload #4
    //   4370: iload #6
    //   4372: aaload
    //   4373: astore #7
    //   4375: aload #7
    //   4377: invokevirtual getModifiers : ()I
    //   4380: invokestatic isStatic : (I)Z
    //   4383: ifne -> 4393
    //   4386: goto -> 4496
    //   4389: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4392: athrow
    //   4393: aload #7
    //   4395: invokevirtual getType : ()Ljava/lang/Class;
    //   4398: astore #8
    //   4400: aload #8
    //   4402: ifnull -> 4483
    //   4405: aload #8
    //   4407: invokevirtual isPrimitive : ()Z
    //   4410: ifne -> 4483
    //   4413: goto -> 4420
    //   4416: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4419: athrow
    //   4420: aload #8
    //   4422: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4425: ifnull -> 4483
    //   4428: goto -> 4435
    //   4431: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4434: athrow
    //   4435: aload #8
    //   4437: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4440: invokevirtual getName : ()Ljava/lang/String;
    //   4443: ifnull -> 4483
    //   4446: goto -> 4453
    //   4449: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4452: athrow
    //   4453: aload #8
    //   4455: invokevirtual getPackage : ()Ljava/lang/Package;
    //   4458: invokevirtual getName : ()Ljava/lang/String;
    //   4461: sipush #-10705
    //   4464: sipush #28891
    //   4467: invokestatic a : (II)Ljava/lang/String;
    //   4470: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   4473: ifne -> 4483
    //   4476: goto -> 4483
    //   4479: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4482: athrow
    //   4483: aload #7
    //   4485: iconst_1
    //   4486: invokevirtual setAccessible : (Z)V
    //   4489: aload #7
    //   4491: aconst_null
    //   4492: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4495: pop
    //   4496: iinc #6, 1
    //   4499: iload_2
    //   4500: ifne -> 4361
    //   4503: sipush #-10701
    //   4506: sipush #29343
    //   4509: invokestatic a : (II)Ljava/lang/String;
    //   4512: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   4515: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   4518: astore #4
    //   4520: aload #4
    //   4522: arraylength
    //   4523: istore #5
    //   4525: iconst_0
    //   4526: istore #6
    //   4528: iload #6
    //   4530: iload #5
    //   4532: if_icmpge -> 4668
    //   4535: aload #4
    //   4537: iload #6
    //   4539: aaload
    //   4540: astore #7
    //   4542: aload #7
    //   4544: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4547: pop
    //   4548: aload #7
    //   4550: invokevirtual getModifiers : ()I
    //   4553: invokestatic isStatic : (I)Z
    //   4556: ifeq -> 4654
    //   4559: aload #7
    //   4561: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   4564: arraylength
    //   4565: iconst_2
    //   4566: if_icmpne -> 4654
    //   4569: goto -> 4576
    //   4572: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4575: athrow
    //   4576: aload #7
    //   4578: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   4581: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   4584: if_acmpne -> 4654
    //   4587: goto -> 4594
    //   4590: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4593: athrow
    //   4594: aload #7
    //   4596: iconst_1
    //   4597: invokevirtual setAccessible : (Z)V
    //   4600: aload #7
    //   4602: aconst_null
    //   4603: iconst_2
    //   4604: anewarray java/lang/Object
    //   4607: dup
    //   4608: iconst_0
    //   4609: aload_0
    //   4610: aastore
    //   4611: dup
    //   4612: iconst_1
    //   4613: aload_1
    //   4614: ifnonnull -> 4632
    //   4617: goto -> 4624
    //   4620: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4623: athrow
    //   4624: aload_1
    //   4625: goto -> 4639
    //   4628: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4631: athrow
    //   4632: aload_1
    //   4633: checkcast [B
    //   4636: invokevirtual clone : ()Ljava/lang/Object;
    //   4639: aastore
    //   4640: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   4643: checkcast java/lang/Boolean
    //   4646: invokevirtual booleanValue : ()Z
    //   4649: istore_3
    //   4650: iload_2
    //   4651: ifne -> 4668
    //   4654: iinc #6, 1
    //   4657: iload_2
    //   4658: ifne -> 4528
    //   4661: goto -> 4668
    //   4664: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   4667: athrow
    //   4668: iload_3
    //   4669: ireturn
    //   4670: astore_3
    //   4671: new java/lang/Exception
    //   4674: dup
    //   4675: aload_3
    //   4676: invokevirtual getMessage : ()Ljava/lang/String;
    //   4679: invokespecial <init> : (Ljava/lang/String;)V
    //   4682: athrow
    // Exception table:
    //   from	to	target	type
    //   4	2480	4670	java/lang/Throwable
    //   345	369	372	java/lang/Throwable
    //   443	480	480	java/lang/Throwable
    //   484	505	505	java/lang/Throwable
    //   509	539	539	java/lang/Throwable
    //   764	778	778	java/lang/Throwable
    //   789	802	805	java/lang/Throwable
    //   794	817	820	java/lang/Throwable
    //   809	835	838	java/lang/Throwable
    //   824	865	868	java/lang/Throwable
    //   928	955	958	java/lang/Throwable
    //   945	976	979	java/lang/Throwable
    //   962	1006	1009	java/lang/Throwable
    //   983	1017	1017	java/lang/Throwable
    //   1028	1044	1047	java/lang/Throwable
    //   1121	1135	1135	java/lang/Throwable
    //   1146	1159	1162	java/lang/Throwable
    //   1151	1174	1177	java/lang/Throwable
    //   1166	1192	1195	java/lang/Throwable
    //   1181	1222	1225	java/lang/Throwable
    //   1285	1312	1315	java/lang/Throwable
    //   1302	1333	1336	java/lang/Throwable
    //   1319	1363	1366	java/lang/Throwable
    //   1340	1374	1374	java/lang/Throwable
    //   1385	1401	1404	java/lang/Throwable
    //   1408	1745	1748	java/lang/Throwable
    //   1579	1589	1589	java/lang/Throwable
    //   1593	1605	1605	java/lang/Throwable
    //   1609	1621	1621	java/lang/Throwable
    //   1625	1638	1638	java/lang/Throwable
    //   1642	1655	1655	java/lang/Throwable
    //   1841	1855	1855	java/lang/Throwable
    //   1866	1879	1882	java/lang/Throwable
    //   1871	1894	1897	java/lang/Throwable
    //   1886	1912	1915	java/lang/Throwable
    //   1901	1942	1945	java/lang/Throwable
    //   2008	2035	2038	java/lang/Throwable
    //   2025	2053	2056	java/lang/Throwable
    //   2042	2083	2086	java/lang/Throwable
    //   2060	2094	2094	java/lang/Throwable
    //   2116	2127	2130	java/lang/Throwable
    //   2182	2196	2196	java/lang/Throwable
    //   2207	2220	2223	java/lang/Throwable
    //   2212	2235	2238	java/lang/Throwable
    //   2227	2253	2256	java/lang/Throwable
    //   2242	2283	2286	java/lang/Throwable
    //   2349	2376	2379	java/lang/Throwable
    //   2366	2394	2397	java/lang/Throwable
    //   2383	2424	2427	java/lang/Throwable
    //   2401	2435	2435	java/lang/Throwable
    //   2457	2468	2471	java/lang/Throwable
    //   2481	3211	4670	java/lang/Throwable
    //   2571	2585	2585	java/lang/Throwable
    //   2596	2609	2612	java/lang/Throwable
    //   2601	2624	2627	java/lang/Throwable
    //   2616	2642	2645	java/lang/Throwable
    //   2631	2672	2675	java/lang/Throwable
    //   2738	2765	2768	java/lang/Throwable
    //   2755	2783	2786	java/lang/Throwable
    //   2772	2813	2816	java/lang/Throwable
    //   2790	2824	2824	java/lang/Throwable
    //   2846	2857	2860	java/lang/Throwable
    //   2913	2927	2927	java/lang/Throwable
    //   2938	2951	2954	java/lang/Throwable
    //   2943	2966	2969	java/lang/Throwable
    //   2958	2984	2987	java/lang/Throwable
    //   2973	3014	3017	java/lang/Throwable
    //   3080	3107	3110	java/lang/Throwable
    //   3097	3125	3128	java/lang/Throwable
    //   3114	3155	3158	java/lang/Throwable
    //   3132	3166	3166	java/lang/Throwable
    //   3188	3199	3202	java/lang/Throwable
    //   3212	3942	4670	java/lang/Throwable
    //   3302	3316	3316	java/lang/Throwable
    //   3327	3340	3343	java/lang/Throwable
    //   3332	3355	3358	java/lang/Throwable
    //   3347	3373	3376	java/lang/Throwable
    //   3362	3403	3406	java/lang/Throwable
    //   3469	3496	3499	java/lang/Throwable
    //   3486	3514	3517	java/lang/Throwable
    //   3503	3544	3547	java/lang/Throwable
    //   3521	3555	3555	java/lang/Throwable
    //   3577	3588	3591	java/lang/Throwable
    //   3644	3658	3658	java/lang/Throwable
    //   3669	3682	3685	java/lang/Throwable
    //   3674	3697	3700	java/lang/Throwable
    //   3689	3715	3718	java/lang/Throwable
    //   3704	3745	3748	java/lang/Throwable
    //   3811	3838	3841	java/lang/Throwable
    //   3828	3856	3859	java/lang/Throwable
    //   3845	3886	3889	java/lang/Throwable
    //   3863	3897	3897	java/lang/Throwable
    //   3919	3930	3933	java/lang/Throwable
    //   3943	4669	4670	java/lang/Throwable
    //   4033	4047	4047	java/lang/Throwable
    //   4058	4071	4074	java/lang/Throwable
    //   4063	4086	4089	java/lang/Throwable
    //   4078	4104	4107	java/lang/Throwable
    //   4093	4134	4137	java/lang/Throwable
    //   4200	4227	4230	java/lang/Throwable
    //   4217	4245	4248	java/lang/Throwable
    //   4234	4275	4278	java/lang/Throwable
    //   4252	4286	4286	java/lang/Throwable
    //   4308	4319	4322	java/lang/Throwable
    //   4375	4389	4389	java/lang/Throwable
    //   4400	4413	4416	java/lang/Throwable
    //   4405	4428	4431	java/lang/Throwable
    //   4420	4446	4449	java/lang/Throwable
    //   4435	4476	4479	java/lang/Throwable
    //   4542	4569	4572	java/lang/Throwable
    //   4559	4587	4590	java/lang/Throwable
    //   4576	4617	4620	java/lang/Throwable
    //   4594	4628	4628	java/lang/Throwable
    //   4650	4661	4664	java/lang/Throwable
  }
  
  static void Zj(Object paramObject) {
    Zxy6.ZR = a(-10692, -28750);
    Zxy6.Zd = new BigInteger(a(-10698, -32116));
    boolean bool = Zt2e.ZK();
    try {
      try {
        if (Zzhx.ZV.charAt(Math.abs(((BigInteger)Zzn6.ZO).intValue() % 32)) > Zry1.Zk.charAt(Math.abs(((BigInteger)Zsjw.Zw).intValue() % 32))) {
          try {
            Zxp5.Zg(Class.forName(a(-10691, -24706)));
            if (bool)
              Zkby.Zv(Class.forName(a(-10707, -9985))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zkby.Zv(Class.forName(a(-10707, -9985)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: bipush #33
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '·ïeÚ9 ï%V\\rú÷6þÕRn<À|lÊ£0Ü¯i± ­¼ j\\tëÑ=\\to×\\b:_AÆi*\\t7OgXf_\\t@ú÷d|Ì\\nvê7ØÊVî­)\¢\\tÄá²¨m¤¢\\bz?6RÊn b6¤RdEÕtT]³!1Î>âÇ¬çToMî\\tÙ²B¤Ü¯áh\\t]IY½$Râ\\t¤]íY)°â\\tÎÔ h6Ð\\tE!ÑÖ®áP!ìMÞÊ¼çÐ&1ÞDîîínYò+ÎüZån#ÃP®´1Ê£2)»eqé|4Ò)-­¿å&ÿ^µHÂ#áû\\bEr±b1¦¯þù\\tóÃtj\\tð¿gxzá\\t[ÉËÖBNIE\\t~¶pB5È¯]\\t%Ý/yo{´\\b­G÷îsS\\tp©wÇzÃÐ~þ\\tóÈëtFÊÑ ò\\fQì/«ÌsLBcì4­òd)%NqUû(Ú_p{ãQúÑSEôâ2»@¶\\tïÙËZ4Í<l\\t)J\»Lwb'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #60
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
    //   68: ldc '&+æ¬tÈ\\t9æÙð¸$¹'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #74
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
    //   129: putstatic burp/Zzpm.a : [Ljava/lang/String;
    //   132: bipush #33
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zzpm.b : [Ljava/lang/String;
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
    //   212: bipush #102
    //   214: goto -> 244
    //   217: bipush #109
    //   219: goto -> 244
    //   222: bipush #82
    //   224: goto -> 244
    //   227: bipush #79
    //   229: goto -> 244
    //   232: bipush #119
    //   234: goto -> 244
    //   237: bipush #77
    //   239: goto -> 244
    //   242: bipush #89
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
    //   310: bipush #113
    //   312: bastore
    //   313: dup
    //   314: iconst_1
    //   315: bipush #-28
    //   317: bastore
    //   318: dup
    //   319: iconst_2
    //   320: bipush #80
    //   322: bastore
    //   323: dup
    //   324: iconst_3
    //   325: bipush #-26
    //   327: bastore
    //   328: dup
    //   329: iconst_4
    //   330: bipush #46
    //   332: bastore
    //   333: dup
    //   334: iconst_5
    //   335: bipush #72
    //   337: bastore
    //   338: dup
    //   339: bipush #6
    //   341: bipush #-110
    //   343: bastore
    //   344: dup
    //   345: bipush #7
    //   347: bipush #33
    //   349: bastore
    //   350: dup
    //   351: bipush #8
    //   353: bipush #35
    //   355: bastore
    //   356: dup
    //   357: bipush #9
    //   359: bipush #55
    //   361: bastore
    //   362: dup
    //   363: bipush #10
    //   365: bipush #-95
    //   367: bastore
    //   368: dup
    //   369: bipush #11
    //   371: bipush #-19
    //   373: bastore
    //   374: dup
    //   375: bipush #12
    //   377: bipush #38
    //   379: bastore
    //   380: dup
    //   381: bipush #13
    //   383: bipush #-64
    //   385: bastore
    //   386: dup
    //   387: bipush #14
    //   389: bipush #24
    //   391: bastore
    //   392: dup
    //   393: bipush #15
    //   395: bipush #115
    //   397: bastore
    //   398: dup
    //   399: bipush #16
    //   401: bipush #-75
    //   403: bastore
    //   404: dup
    //   405: bipush #17
    //   407: bipush #-96
    //   409: bastore
    //   410: dup
    //   411: bipush #18
    //   413: bipush #60
    //   415: bastore
    //   416: dup
    //   417: bipush #19
    //   419: bipush #-24
    //   421: bastore
    //   422: dup
    //   423: bipush #20
    //   425: bipush #-79
    //   427: bastore
    //   428: dup
    //   429: bipush #21
    //   431: bipush #-55
    //   433: bastore
    //   434: dup
    //   435: bipush #22
    //   437: bipush #127
    //   439: bastore
    //   440: dup
    //   441: bipush #23
    //   443: bipush #-22
    //   445: bastore
    //   446: dup
    //   447: bipush #24
    //   449: bipush #47
    //   451: bastore
    //   452: dup
    //   453: bipush #25
    //   455: bipush #-24
    //   457: bastore
    //   458: dup
    //   459: bipush #26
    //   461: bipush #52
    //   463: bastore
    //   464: dup
    //   465: bipush #27
    //   467: bipush #78
    //   469: bastore
    //   470: dup
    //   471: bipush #28
    //   473: bipush #117
    //   475: bastore
    //   476: dup
    //   477: bipush #29
    //   479: bipush #26
    //   481: bastore
    //   482: dup
    //   483: bipush #30
    //   485: bipush #77
    //   487: bastore
    //   488: dup
    //   489: bipush #31
    //   491: bipush #-77
    //   493: bastore
    //   494: invokespecial <init> : ([B)V
    //   497: putstatic burp/Zzpm.Ze : Ljava/lang/Object;
    //   500: sipush #-10708
    //   503: sipush #28114
    //   506: invokestatic a : (II)Ljava/lang/String;
    //   509: putstatic burp/Zzpm.Za : Ljava/lang/String;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFD627) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzpm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */